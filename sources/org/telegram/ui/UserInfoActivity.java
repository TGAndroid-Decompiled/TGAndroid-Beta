package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.SettingsActivity;

public class UserInfoActivity extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    public int addAccountRow;
    private EditTextCell bioEdit;
    private CharSequence bioInfo;
    public int bioRow;
    private TL_account.TL_birthday birthday;
    private CharSequence birthdayInfo;
    public int birthdayRow;
    private TLRPC.Chat channel;
    public int channelRow;
    private String currentBio;
    private TL_account.TL_birthday currentBirthday;
    private long currentChannel;
    private String currentFirstName;
    private String currentLastName;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private EditTextCell firstNameEdit;
    public int firstNameRow;
    private boolean hadHours;
    private boolean hadLocation;
    private EditTextCell lastNameEdit;
    public int lastNameRow;
    public UniversalRecyclerView listView;
    public int logoutRow;
    public int numberRow;
    public int usernameRow;
    private boolean valueSet;
    private final ArrayList accountNumbers = new ArrayList();
    private AdminedChannelsFetcher channels = new AdminedChannelsFetcher(this.currentAccount, true);
    private boolean wasSaved = false;
    private int shiftDp = -4;

    @Override
    protected boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getContactsController().loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        super.onFragmentDestroy();
        if (this.wasSaved) {
            return;
        }
        processDone(false);
    }

    @Override
    public View createView(Context context) {
        boolean z = false;
        int i = -1;
        boolean z2 = false;
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.EditProfileFirstName), z2, z, i, this.resourceProvider) {
            @Override
            protected void onTextChanged(CharSequence charSequence) {
                super.onTextChanged(charSequence);
                UserInfoActivity.this.checkDone(true);
            }
        };
        this.firstNameEdit = editTextCell;
        editTextCell.setDivider(true);
        this.firstNameEdit.hideKeyboardOnEnter();
        EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.EditProfileLastName), z2, z, i, this.resourceProvider) {
            @Override
            protected void onTextChanged(CharSequence charSequence) {
                super.onTextChanged(charSequence);
                UserInfoActivity.this.checkDone(true);
            }
        };
        this.lastNameEdit = editTextCell2;
        editTextCell2.hideKeyboardOnEnter();
        EditTextCell editTextCell3 = new EditTextCell(context, LocaleController.getString(R.string.EditProfileBioHint), true, z, getMessagesController().getAboutLimit(), this.resourceProvider) {
            @Override
            protected void onTextChanged(CharSequence charSequence) {
                super.onTextChanged(charSequence);
                UserInfoActivity.this.checkDone(true);
            }
        };
        this.bioEdit = editTextCell3;
        editTextCell3.setShowLimitWhenEmpty(true);
        this.bioInfo = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$0();
            }
        });
        super.createView(context);
        UniversalRecyclerView universalRecyclerView = super.listView;
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.listView);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (UserInfoActivity.this.onBackPressed(true)) {
                        UserInfoActivity.this.finishFragment();
                    }
                } else if (i2 == 1) {
                    UserInfoActivity.this.processDone(true);
                }
            }
        });
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i2 = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(i2)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        checkDone(false);
        setValue();
        return this.fragmentView;
    }

    public void lambda$createView$0() {
        presentFragment(new PrivacyControlActivity(9, true));
    }

    private void updateAccounts() {
        this.accountNumbers.clear();
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).isClientActivated() && this.currentAccount != i) {
                this.accountNumbers.add(Integer.valueOf(i));
            }
        }
        Collections.sort(this.accountNumbers, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return UserInfoActivity.lambda$updateAccounts$1((Integer) obj, (Integer) obj2);
            }
        });
    }

    public static int lambda$updateAccounts$1(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    @Override
    protected void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        this.addAccountRow = -1;
        updateAccounts();
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditAccountInfoHeader)));
        this.numberRow = arrayList.size();
        arrayList.add(InfoCell.Factory.of(6, R.drawable.menu_phone, PhoneFormat.getInstance().format("+" + currentUser.phone), LocaleController.getString(R.string.TapToChangePhone), 0));
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(InfoCell.Factory.of(7, R.drawable.menu_username_change, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), 0));
        } else {
            arrayList.add(InfoCell.Factory.of(7, R.drawable.menu_username_set, LocaleController.getString(R.string.AddUsername), null, 0).accent());
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.birthday;
        if (tL_birthday != null) {
            arrayList.add(InfoCell.Factory.of(8, R.drawable.menu_birthday, birthdayString(tL_birthday), LocaleController.getString(R.string.ContactBirthday), 0));
        } else {
            arrayList.add(InfoCell.Factory.of(8, R.drawable.menu_birthday, LocaleController.getString(R.string.AddBirthday), null, 0).accent());
        }
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.birthdayInfo == null) {
            String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
            if (!privacyRules.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i >= privacyRules.size()) {
                        break;
                    }
                    if (privacyRules.get(i) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        break;
                    }
                    if ((privacyRules.get(i) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                    }
                    i++;
                }
            }
            this.birthdayInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$fillItems$2();
                }
            }), true);
        }
        arrayList.add(UItem.asShadow(this.birthdayInfo));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(UItem.asCustom(this.firstNameEdit));
        this.lastNameRow = arrayList.size();
        arrayList.add(UItem.asCustom(this.lastNameEdit));
        arrayList.add(UItem.asShadow(-1, null));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditProfileBio)));
        this.bioRow = arrayList.size();
        arrayList.add(UItem.asCustom(this.bioEdit));
        arrayList.add(UItem.asShadow(this.bioInfo));
        arrayList.add(UItem.asShadow(-2, null));
        this.channelRow = arrayList.size();
        if (this.channel == null) {
            arrayList.add(InfoCell.Factory.of(3, R.drawable.msg_channel_create, "Add Personal Channel", null, 0).accent());
        } else {
            arrayList.add(UItem.asButton(3, LocaleController.getString(R.string.EditProfileChannelTitle), this.channel.title));
        }
        if (this.hadLocation) {
            arrayList.add(UItem.asButton(4, R.drawable.menu_premium_clock, LocaleController.getString(R.string.EditProfileHours)));
        }
        if (this.hadLocation) {
            arrayList.add(UItem.asButton(5, R.drawable.msg_map, LocaleController.getString(R.string.EditProfileLocation)));
        }
        arrayList.add(UItem.asShadow(-3, null));
        boolean z = UserConfig.getActivatedAccountsCount() < 4;
        if (z) {
            this.addAccountRow = arrayList.size();
            arrayList.add(InfoCell.Factory.of(9, R.drawable.outline_add_account, "Add Account", null, 0).accent());
        }
        if (!this.accountNumbers.isEmpty()) {
            if (!z) {
                arrayList.add(UItem.asHeader(LocaleController.getString(R.string.SettingsAccounts)));
            }
            for (int i2 = 0; i2 < this.accountNumbers.size(); i2++) {
                arrayList.add(SettingsActivity.AccountCell.Factory.of(i2, ((Integer) this.accountNumbers.get(i2)).intValue()));
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                int iMax = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                arrayList.add(UItem.asShadow(TextUtils.concat(iMax > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", iMax) + " " : "", AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$fillItems$3();
                    }
                }))));
            } else {
                arrayList.add(UItem.asShadow(null));
            }
        }
        this.logoutRow = arrayList.size();
        arrayList.add(UItem.asButton(10, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut)).red());
        arrayList.add(UItem.asShadow(-4, null));
    }

    public void lambda$fillItems$2() {
        presentFragment(new PrivacyControlActivity(11));
    }

    public void lambda$fillItems$3() {
        presentFragment(new PremiumPreviewFragment("add_account"));
    }

    public static String birthdayString(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, tL_birthday.year);
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return LocaleController.getInstance().getFormatterBoostExpired().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return LocaleController.getInstance().getFormatterDayMonth().format(calendar2.getTimeInMillis());
    }

    @Override
    protected void onClick(UItem uItem, View view, int i, float f, float f2) {
        Integer numValueOf = null;
        int i2 = 0;
        if (uItem.id == 9) {
            for (int i3 = 3; i3 >= 0; i3--) {
                if (!UserConfig.getInstance(i3).isClientActivated()) {
                    i2++;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i3);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i2--;
            }
            if (i2 > 0 && numValueOf != null) {
                presentFragment(new LoginActivity(numValueOf.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                showDialog(new LimitReachedBottomSheet(this, getContext(), 7, this.currentAccount, null));
                return;
            }
        }
        if (uItem.instanceOf(SettingsActivity.AccountCell.Factory.class)) {
            int i4 = uItem.intValue;
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                launchActivity.switchToAccount(i4, true);
                return;
            }
            return;
        }
        int i5 = uItem.id;
        if (i5 == 1 || i5 == 8) {
            showDialog(AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), this.birthday, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onClick$4((TL_account.TL_birthday) obj);
                }
            }, null, false, this.birthday != null, getResourceProvider()).create());
            return;
        }
        if (i5 == 2) {
            this.birthday = null;
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
            checkDone(true);
            return;
        }
        if (i5 == 3) {
            AdminedChannelsFetcher adminedChannelsFetcher = this.channels;
            TLRPC.Chat chat = this.channel;
            presentFragment(new ChooseChannelFragment(adminedChannelsFetcher, chat == null ? 0L : chat.id, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onClick$5((TLRPC.Chat) obj);
                }
            }));
            return;
        }
        if (i5 == 5) {
            presentFragment(new org.telegram.ui.Business.LocationActivity());
            return;
        }
        if (i5 == 4) {
            presentFragment(new OpeningHoursActivity());
            return;
        }
        if (i5 == 6) {
            presentFragment(new ActionIntroActivity(3));
        } else if (i5 == 7) {
            presentFragment(new ChangeUsernameActivity());
        } else if (i5 == 10) {
            presentFragment(new LogoutActivity());
        }
    }

    public void lambda$onClick$4(TL_account.TL_birthday tL_birthday) {
        this.birthday = tL_birthday;
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
        checkDone(true);
    }

    public void lambda$onClick$5(TLRPC.Chat chat) {
        if (this.channel == chat) {
            return;
        }
        this.channel = chat;
        if (chat != null) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.EditProfileChannelSet)).show();
        }
        checkDone(true);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalRecyclerView universalRecyclerView;
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue();
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            UniversalRecyclerView universalRecyclerView2 = this.listView;
            if (universalRecyclerView2 != null) {
                universalRecyclerView2.adapter.update(true);
                return;
            }
            return;
        }
        if (i != NotificationCenter.privacyRulesUpdated || (universalRecyclerView = this.listView) == null) {
            return;
        }
        universalRecyclerView.adapter.update(true);
    }

    @Override
    public void onResume() {
        super.onResume();
        this.channels.invalidate();
        this.channels.subscribe(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onResume$6();
            }
        });
        this.channels.fetch();
        this.birthdayInfo = null;
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public void lambda$onResume$6() {
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    private void setValue() {
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.User currentUser = userFull.user;
        if (currentUser == null) {
            currentUser = getUserConfig().getCurrentUser();
        }
        if (currentUser == null) {
            return;
        }
        EditTextCell editTextCell = this.firstNameEdit;
        String str = currentUser.first_name;
        this.currentFirstName = str;
        editTextCell.setText(str);
        EditTextCell editTextCell2 = this.lastNameEdit;
        String str2 = currentUser.last_name;
        this.currentLastName = str2;
        editTextCell2.setText(str2);
        EditTextCell editTextCell3 = this.bioEdit;
        String str3 = userFull.about;
        this.currentBio = str3;
        editTextCell3.setText(str3);
        TL_account.TL_birthday tL_birthday = userFull.birthday;
        this.currentBirthday = tL_birthday;
        this.birthday = tL_birthday;
        if ((userFull.flags2 & 64) != 0) {
            this.currentChannel = userFull.personal_channel_id;
            this.channel = getMessagesController().getChat(Long.valueOf(this.currentChannel));
        } else {
            this.currentChannel = 0L;
            this.channel = null;
        }
        this.hadHours = userFull.business_work_hours != null;
        this.hadLocation = userFull.business_location != null;
        checkDone(true);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
        }
        this.valueSet = true;
    }

    public boolean hasChanges() {
        String str = this.currentFirstName;
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.firstNameEdit.getText().toString())) {
            String str2 = this.currentLastName;
            if (str2 == null) {
                str2 = "";
            }
            if (TextUtils.equals(str2, this.lastNameEdit.getText().toString())) {
                String str3 = this.currentBio;
                if (TextUtils.equals(str3 != null ? str3 : "", this.bioEdit.getText().toString()) && birthdaysEqual(this.currentBirthday, this.birthday)) {
                    long j = this.currentChannel;
                    TLRPC.Chat chat = this.channel;
                    if (j == (chat != null ? chat.id : 0L)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean birthdaysEqual(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        if ((tL_birthday == null) != (tL_birthday2 != null)) {
            return tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year);
        }
        return false;
    }

    public void checkDone(boolean z) {
        if (this.doneButton == null) {
            return;
        }
        boolean zHasChanges = hasChanges();
        this.doneButton.setEnabled(zHasChanges);
        if (z) {
            this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
    }

    public void processDone(boolean z) {
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (z && TextUtils.isEmpty(this.firstNameEdit.getText())) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            EditTextCell editTextCell = this.firstNameEdit;
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(editTextCell, i);
            return;
        }
        this.doneButtonDrawable.animateToProgress(1.0f);
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        final TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (currentUser == null || userFull == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.firstNameEdit.getText()) && (!TextUtils.equals(this.currentFirstName, this.firstNameEdit.getText().toString()) || !TextUtils.equals(this.currentLastName, this.lastNameEdit.getText().toString()) || !TextUtils.equals(this.currentBio, this.bioEdit.getText().toString()))) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags |= 1;
            String string = this.firstNameEdit.getText().toString();
            currentUser.first_name = string;
            updateprofile.first_name = string;
            updateprofile.flags |= 2;
            String string2 = this.lastNameEdit.getText().toString();
            currentUser.last_name = string2;
            updateprofile.last_name = string2;
            updateprofile.flags |= 4;
            String string3 = this.bioEdit.getText().toString();
            userFull.about = string3;
            updateprofile.about = string3;
            userFull.flags = TextUtils.isEmpty(string3) ? userFull.flags & (-3) : userFull.flags | 2;
            arrayList.add(updateprofile);
        }
        final TL_account.TL_birthday tL_birthday = userFull.birthday;
        if (!birthdaysEqual(this.currentBirthday, this.birthday)) {
            TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
            TL_account.TL_birthday tL_birthday2 = this.birthday;
            if (tL_birthday2 != null) {
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday2;
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday2;
            } else {
                userFull.flags2 &= -33;
                userFull.birthday = null;
            }
            arrayList.add(updatebirthday);
            getMessagesController().invalidateContentSettings();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
        }
        long j = this.currentChannel;
        TLRPC.Chat chat = this.channel;
        if (j != (chat != null ? chat.id : 0L)) {
            TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
            updatepersonalchannel.channel = MessagesController.getInputChannel(this.channel);
            TLRPC.Chat chat2 = this.channel;
            if (chat2 != null) {
                userFull.flags |= 64;
                long j2 = userFull.personal_channel_id;
                long j3 = chat2.id;
                if (j2 != j3) {
                    userFull.personal_channel_message = 0;
                }
                userFull.personal_channel_id = j3;
            } else {
                userFull.flags &= -65;
                userFull.personal_channel_message = 0;
                userFull.personal_channel_id = 0L;
            }
            arrayList.add(updatepersonalchannel);
        }
        if (arrayList.isEmpty()) {
            finishFragment();
            return;
        }
        final int[] iArr = {0};
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            final TLObject tLObject = (TLObject) arrayList.get(i2);
            getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$processDone$8(tLObject, tL_birthday, userFull, iArr, arrayList, tLObject2, tL_error);
                }
            }, 1024);
        }
        getMessagesStorage().updateUserInfo(userFull, false);
        getUserConfig().saveConfig(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
    }

    public void lambda$processDone$8(final TLObject tLObject, final TL_account.TL_birthday tL_birthday, final TLRPC.UserFull userFull, final int[] iArr, final ArrayList arrayList, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processDone$7(tL_error, tLObject, tL_birthday, userFull, tLObject2, iArr, arrayList);
            }
        });
    }

    public void lambda$processDone$7(TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            boolean z = tLObject instanceof TL_account.updateBirthday;
            if (z && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (getContext() != null) {
                    showDialog(new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
                }
            } else {
                BulletinFactory.showError(tL_error);
            }
            if (z) {
                if (tL_birthday != null) {
                    userFull.flags |= 32;
                } else {
                    userFull.flags &= -33;
                }
                userFull.birthday = tL_birthday;
                getMessagesStorage().updateUserInfo(userFull, false);
                return;
            }
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_boolFalse) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
            return;
        }
        this.wasSaved = true;
        int i = iArr[0] + 1;
        iArr[0] = i;
        if (i == arrayList.size()) {
            finishFragment();
        }
    }

    public static class AdminedChannelsFetcher {
        public final int currentAccount;
        public final boolean for_personal;
        public boolean loaded;
        public boolean loading;
        public final ArrayList chats = new ArrayList();
        private ArrayList callbacks = new ArrayList();

        public AdminedChannelsFetcher(int i, boolean z) {
            this.currentAccount = i;
            this.for_personal = z;
        }

        public void invalidate() {
            this.loaded = false;
        }

        public void fetch() {
            if (this.loaded || this.loading) {
                return;
            }
            this.loading = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = this.for_personal;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminedPublicChannels, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$fetch$1(tLObject, tL_error);
                }
            });
        }

        public void lambda$fetch$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$fetch$0(tLObject);
                }
            });
        }

        public void lambda$fetch$0(TLObject tLObject) {
            if (tLObject instanceof TLRPC.messages_Chats) {
                this.chats.clear();
                this.chats.addAll(((TLRPC.messages_Chats) tLObject).chats);
            }
            MessagesController.getInstance(this.currentAccount).putChats(this.chats, false);
            this.loading = false;
            this.loaded = true;
            Iterator it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.callbacks.clear();
        }

        public void subscribe(Runnable runnable) {
            if (this.loaded) {
                runnable.run();
            } else {
                this.callbacks.add(runnable);
            }
        }
    }

    private static class InfoCell extends LinearLayout {
        private boolean accent;
        private final ImageView icon2View;
        private final ImageView iconView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView subtitleView;
        private final LinearLayout textLayout;
        private final TextView titleView;

        public InfoCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setOrientation(0);
            this.resourcesProvider = resourcesProvider;
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            addView(imageView, LayoutHelper.createLinear(40, 40, 19, 12, 0, 12, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
            addView(linearLayout, LayoutHelper.createLinear(0, -2, 1.0f, 23, 0, 0, 32, 0));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 16.0f);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 0));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 13.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.icon2View = imageView2;
            imageView2.setScaleType(scaleType);
            addView(imageView2, LayoutHelper.createLinear(40, 40, 21, 12, 0, 12, 0));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        private void updateColors() {
            ImageView imageView = this.iconView;
            int color = Theme.getColor(this.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
            this.icon2View.setColorFilter(new PorterDuffColorFilter(Theme.getColor(this.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), mode));
            this.titleView.setTextColor(Theme.getColor(this.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            this.subtitleView.setTextColor(Theme.getColor(this.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider));
        }

        public void set(int i, CharSequence charSequence, CharSequence charSequence2, boolean z, int i2) {
            this.accent = z;
            this.iconView.setImageResource(i);
            if (i2 != 0) {
                this.icon2View.setVisibility(0);
                this.icon2View.setImageResource(i2);
            } else {
                this.icon2View.setVisibility(8);
            }
            this.titleView.setText(charSequence);
            this.subtitleView.setText(charSequence2);
            this.subtitleView.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
            int iDp = AndroidUtilities.dp(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
            this.textLayout.setPadding(0, iDp, 0, iDp);
            updateColors();
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public InfoCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new InfoCell(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((InfoCell) view).set(uItem.iconResId, uItem.text, uItem.subtext, uItem.accent, uItem.intValue);
            }

            public static UItem of(int i, int i2, CharSequence charSequence, CharSequence charSequence2, int i3) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.iconResId = i2;
                uItemOfFactory.text = charSequence;
                uItemOfFactory.subtext = charSequence2;
                uItemOfFactory.intValue = i3;
                return uItemOfFactory;
            }
        }
    }

    static class ChooseChannelFragment extends UniversalFragment {
        private AdminedChannelsFetcher channels;
        private boolean invalidateAfterPause = false;
        private String query;
        private ActionBarMenuItem searchItem;
        private long selectedChannel;
        private Utilities.Callback whenSelected;

        @Override
        protected boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
            return false;
        }

        public ChooseChannelFragment(AdminedChannelsFetcher adminedChannelsFetcher, long j, Utilities.Callback callback) {
            this.channels = adminedChannelsFetcher;
            this.selectedChannel = j;
            this.whenSelected = callback;
            adminedChannelsFetcher.subscribe(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$0();
                }
            });
        }

        public void lambda$new$0() {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }

        @Override
        public View createView(Context context) {
            ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search, getResourceProvider()).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public void onSearchExpand() {
                }

                @Override
                public void onSearchCollapse() {
                    ChooseChannelFragment.this.query = null;
                    UniversalRecyclerView universalRecyclerView = ChooseChannelFragment.this.listView;
                    if (universalRecyclerView != null) {
                        universalRecyclerView.adapter.update(true);
                    }
                }

                @Override
                public void onTextChanged(EditText editText) {
                    ChooseChannelFragment.this.query = editText.getText().toString();
                    UniversalRecyclerView universalRecyclerView = ChooseChannelFragment.this.listView;
                    if (universalRecyclerView != null) {
                        universalRecyclerView.adapter.update(true);
                    }
                }
            });
            this.searchItem = actionBarMenuItemSearchListener;
            int i = R.string.Search;
            actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(i));
            this.searchItem.setContentDescription(LocaleController.getString(i));
            this.searchItem.setVisibility(8);
            super.createView(context);
            this.listView.setSections();
            this.actionBar.setAdaptiveBackground(this.listView);
            return this.fragmentView;
        }

        @Override
        protected CharSequence getTitle() {
            return LocaleController.getString(R.string.EditProfileChannelTitle);
        }

        @Override
        protected void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            if (TextUtils.isEmpty(this.query) && this.selectedChannel != 0) {
                arrayList.add(UItem.asButton(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide)).red());
                arrayList.add(UItem.asShadow(null));
            }
            if (TextUtils.isEmpty(this.query)) {
                arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditProfileChannelSelect)));
            }
            Iterator it = this.channels.chats.iterator();
            int i = 0;
            while (it.hasNext()) {
                TLRPC.Chat chat = (TLRPC.Chat) it.next();
                if (chat != null && !ChatObject.isMegagroup(chat)) {
                    i++;
                    if (!TextUtils.isEmpty(this.query)) {
                        String lowerCase = this.query.toLowerCase();
                        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                        String lowerCase2 = chat.title.toLowerCase();
                        String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                        if (!lowerCase2.startsWith(lowerCase)) {
                            if (!lowerCase2.contains(" " + lowerCase) && !strTranslitSafe2.startsWith(strTranslitSafe)) {
                                if (!strTranslitSafe2.contains(" " + strTranslitSafe)) {
                                }
                            }
                        }
                    }
                    arrayList.add(UItem.asFilterChat(true, -chat.id).setChecked(this.selectedChannel == chat.id));
                }
            }
            if (TextUtils.isEmpty(this.query) && i == 0) {
                arrayList.add(UItem.asButton(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew)).accent());
            }
            arrayList.add(UItem.asShadow(null));
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(i <= 5 ? 8 : 0);
            }
        }

        @Override
        public void onResume() {
            super.onResume();
            if (this.invalidateAfterPause) {
                this.channels.invalidate();
                this.channels.subscribe(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onResume$1();
                    }
                });
                this.invalidateAfterPause = false;
            }
        }

        public void lambda$onResume$1() {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }

        @Override
        protected void onClick(UItem uItem, View view, int i, float f, float f2) {
            int i2 = uItem.id;
            if (i2 == 1) {
                this.whenSelected.run(null);
                finishFragment();
                return;
            }
            if (i2 == 2) {
                this.invalidateAfterPause = true;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 0);
                    presentFragment(new ChannelCreateActivity(bundle));
                    return;
                } else {
                    presentFragment(new ActionIntroActivity(0));
                    globalMainSettings.edit().putBoolean("channel_intro", true).apply();
                    return;
                }
            }
            if (uItem.viewType == 12) {
                finishFragment();
                this.whenSelected.run(getMessagesController().getChat(Long.valueOf(-uItem.dialogId)));
            }
        }
    }
}
