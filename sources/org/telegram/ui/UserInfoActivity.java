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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$PrivacyRule;
import org.telegram.tgnet.TLRPC$TL_account_updateBirthday;
import org.telegram.tgnet.TLRPC$TL_account_updatePersonalChannel;
import org.telegram.tgnet.TLRPC$TL_account_updateProfile;
import org.telegram.tgnet.TLRPC$TL_birthday;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_channels_getAdminedPublicChannels;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowAll;
import org.telegram.tgnet.TLRPC$TL_privacyValueAllowContacts;
import org.telegram.tgnet.TLRPC$TL_privacyValueDisallowAll;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$messages_Chats;
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
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.UserInfoActivity;
public class UserInfoActivity extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    private EditTextCell bioEdit;
    private CharSequence bioInfo;
    private TLRPC$TL_birthday birthday;
    private CharSequence birthdayInfo;
    private TLRPC$Chat channel;
    private String currentBio;
    private TLRPC$TL_birthday currentBirthday;
    private long currentChannel;
    private String currentFirstName;
    private String currentLastName;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private EditTextCell firstNameEdit;
    private boolean hadHours;
    private boolean hadLocation;
    private EditTextCell lastNameEdit;
    private boolean valueSet;
    private AdminedChannelsFetcher channels = new AdminedChannelsFetcher(this.currentAccount, true);
    private boolean wasSaved = false;
    private int shiftDp = -4;

    @Override
    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.EditProfileInfo);
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getContactsController().loadPrivacySettings();
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        super.onFragmentDestroy();
        if (this.wasSaved) {
            return;
        }
        processDone(false);
    }

    @Override
    public View createView(Context context) {
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.EditProfileFirstName), false, -1) {
            @Override
            public void onTextChanged(CharSequence charSequence) {
                super.onTextChanged(charSequence);
                UserInfoActivity.this.checkDone(true);
            }
        };
        this.firstNameEdit = editTextCell;
        int i = Theme.key_windowBackgroundWhite;
        editTextCell.setBackgroundColor(getThemedColor(i));
        this.firstNameEdit.setDivider(true);
        this.firstNameEdit.hideKeyboardOnEnter();
        EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.EditProfileLastName), false, -1) {
            @Override
            public void onTextChanged(CharSequence charSequence) {
                super.onTextChanged(charSequence);
                UserInfoActivity.this.checkDone(true);
            }
        };
        this.lastNameEdit = editTextCell2;
        editTextCell2.setBackgroundColor(getThemedColor(i));
        this.lastNameEdit.hideKeyboardOnEnter();
        EditTextCell editTextCell3 = new EditTextCell(context, LocaleController.getString(R.string.EditProfileBioHint), true, getMessagesController().getAboutLimit()) {
            @Override
            public void onTextChanged(CharSequence charSequence) {
                super.onTextChanged(charSequence);
                UserInfoActivity.this.checkDone(true);
            }
        };
        this.bioEdit = editTextCell3;
        editTextCell3.setBackgroundColor(getThemedColor(i));
        this.bioEdit.setShowLimitWhenEmpty(true);
        this.bioInfo = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo), new Runnable() {
            @Override
            public final void run() {
                UserInfoActivity.this.lambda$createView$0();
            }
        });
        super.createView(context);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (UserInfoActivity.this.onBackPressed()) {
                        UserInfoActivity.this.finishFragment();
                    }
                } else if (i2 == 1) {
                    UserInfoActivity.this.processDone(true);
                }
            }
        });
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i2 = Theme.key_actionBarDefaultIcon;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(mutate, new CircularProgressDrawable(Theme.getColor(i2)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString("Done", R.string.Done));
        checkDone(false);
        setValue();
        return this.fragmentView;
    }

    public void lambda$createView$0() {
        presentFragment(new PrivacyControlActivity(9, true));
    }

    @Override
    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        ArrayList<TLRPC$PrivacyRule> privacyRules;
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditProfileName)));
        arrayList.add(UItem.asCustom(this.firstNameEdit));
        arrayList.add(UItem.asCustom(this.lastNameEdit));
        arrayList.add(UItem.asShadow(-1, null));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditProfileChannel)));
        String string = LocaleController.getString(R.string.EditProfileChannelTitle);
        TLRPC$Chat tLRPC$Chat = this.channel;
        arrayList.add(UItem.asButton(3, string, tLRPC$Chat == null ? LocaleController.getString(R.string.EditProfileChannelAdd) : tLRPC$Chat.title));
        arrayList.add(UItem.asShadow(-2, null));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditProfileBio)));
        arrayList.add(UItem.asCustom(this.bioEdit));
        arrayList.add(UItem.asShadow(this.bioInfo));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditProfileBirthday)));
        String string2 = LocaleController.getString(R.string.EditProfileBirthdayText);
        TLRPC$TL_birthday tLRPC$TL_birthday = this.birthday;
        arrayList.add(UItem.asButton(1, string2, tLRPC$TL_birthday == null ? LocaleController.getString(R.string.EditProfileBirthdayAdd) : birthdayString(tLRPC$TL_birthday)));
        if (this.birthday != null) {
            arrayList.add(UItem.asButton(2, LocaleController.getString(R.string.EditProfileBirthdayRemove)).red());
        }
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.birthdayInfo == null) {
            String string3 = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
            if (!privacyRules.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i >= privacyRules.size()) {
                        break;
                    } else if (privacyRules.get(i) instanceof TLRPC$TL_privacyValueAllowContacts) {
                        string3 = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        break;
                    } else {
                        if ((privacyRules.get(i) instanceof TLRPC$TL_privacyValueAllowAll) || (privacyRules.get(i) instanceof TLRPC$TL_privacyValueDisallowAll)) {
                            string3 = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                        }
                        i++;
                    }
                }
            }
            this.birthdayInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string3, new Runnable() {
                @Override
                public final void run() {
                    UserInfoActivity.this.lambda$fillItems$1();
                }
            }), true);
        }
        arrayList.add(UItem.asShadow(this.birthdayInfo));
        if (this.hadLocation) {
            arrayList.add(UItem.asButton(4, R.drawable.menu_premium_clock, LocaleController.getString(R.string.EditProfileHours)));
        }
        if (this.hadLocation) {
            arrayList.add(UItem.asButton(5, R.drawable.msg_map, LocaleController.getString(R.string.EditProfileLocation)));
        }
        if (this.hadLocation || this.hadHours) {
            arrayList.add(UItem.asShadow(-3, null));
        }
    }

    public void lambda$fillItems$1() {
        presentFragment(new PrivacyControlActivity(11));
    }

    public static String birthdayString(TLRPC$TL_birthday tLRPC$TL_birthday) {
        if (tLRPC$TL_birthday == null) {
            return "—";
        }
        if ((tLRPC$TL_birthday.flags & 1) != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, tLRPC$TL_birthday.year);
            calendar.set(2, tLRPC$TL_birthday.month - 1);
            calendar.set(5, tLRPC$TL_birthday.day);
            return LocaleController.getInstance().formatterBoostExpired.format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2, tLRPC$TL_birthday.month - 1);
        calendar2.set(5, tLRPC$TL_birthday.day);
        return LocaleController.getInstance().formatterDayMonth.format(calendar2.getTimeInMillis());
    }

    @Override
    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 1) {
            showDialog(AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), this.birthday, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    UserInfoActivity.this.lambda$onClick$2((TLRPC$TL_birthday) obj);
                }
            }, null, getResourceProvider()).create());
        } else if (i2 == 2) {
            this.birthday = null;
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
            checkDone(true);
        } else if (i2 == 3) {
            AdminedChannelsFetcher adminedChannelsFetcher = this.channels;
            TLRPC$Chat tLRPC$Chat = this.channel;
            presentFragment(new ChooseChannelFragment(adminedChannelsFetcher, tLRPC$Chat == null ? 0L : tLRPC$Chat.id, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    UserInfoActivity.this.lambda$onClick$3((TLRPC$Chat) obj);
                }
            }));
        } else if (i2 == 5) {
            presentFragment(new org.telegram.ui.Business.LocationActivity());
        } else if (i2 == 4) {
            presentFragment(new OpeningHoursActivity());
        }
    }

    public void lambda$onClick$2(TLRPC$TL_birthday tLRPC$TL_birthday) {
        this.birthday = tLRPC$TL_birthday;
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
        checkDone(true);
    }

    public void lambda$onClick$3(TLRPC$Chat tLRPC$Chat) {
        if (this.channel == tLRPC$Chat) {
            return;
        }
        this.channel = tLRPC$Chat;
        if (tLRPC$Chat != null) {
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
        } else if (i != NotificationCenter.privacyRulesUpdated || (universalRecyclerView = this.listView) == null) {
        } else {
            universalRecyclerView.adapter.update(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.channels.invalidate();
        this.channels.subscribe(new Runnable() {
            @Override
            public final void run() {
                UserInfoActivity.this.lambda$onResume$4();
            }
        });
        this.channels.fetch();
        this.birthdayInfo = null;
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public void lambda$onResume$4() {
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
        TLRPC$UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC$User tLRPC$User = userFull.user;
        if (tLRPC$User == null) {
            tLRPC$User = getUserConfig().getCurrentUser();
        }
        if (tLRPC$User == null) {
            return;
        }
        EditTextCell editTextCell = this.firstNameEdit;
        String str = tLRPC$User.first_name;
        this.currentFirstName = str;
        editTextCell.setText(str);
        EditTextCell editTextCell2 = this.lastNameEdit;
        String str2 = tLRPC$User.last_name;
        this.currentLastName = str2;
        editTextCell2.setText(str2);
        EditTextCell editTextCell3 = this.bioEdit;
        String str3 = userFull.about;
        this.currentBio = str3;
        editTextCell3.setText(str3);
        TLRPC$TL_birthday tLRPC$TL_birthday = userFull.birthday;
        this.currentBirthday = tLRPC$TL_birthday;
        this.birthday = tLRPC$TL_birthday;
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
                    TLRPC$Chat tLRPC$Chat = this.channel;
                    if (j == (tLRPC$Chat != null ? tLRPC$Chat.id : 0L)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean birthdaysEqual(TLRPC$TL_birthday tLRPC$TL_birthday, TLRPC$TL_birthday tLRPC$TL_birthday2) {
        if ((tLRPC$TL_birthday == null) != (tLRPC$TL_birthday2 != null)) {
            if (tLRPC$TL_birthday == null) {
                return true;
            }
            if (tLRPC$TL_birthday.day == tLRPC$TL_birthday2.day && tLRPC$TL_birthday.month == tLRPC$TL_birthday2.month && tLRPC$TL_birthday.year == tLRPC$TL_birthday2.year) {
                return true;
            }
        }
        return false;
    }

    public void checkDone(boolean z) {
        if (this.doneButton == null) {
            return;
        }
        boolean hasChanges = hasChanges();
        this.doneButton.setEnabled(hasChanges);
        if (z) {
            this.doneButton.animate().alpha(hasChanges ? 1.0f : 0.0f).scaleX(hasChanges ? 1.0f : 0.0f).scaleY(hasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(hasChanges ? 1.0f : 0.0f);
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
        TLRPC$User currentUser = getUserConfig().getCurrentUser();
        final TLRPC$UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (currentUser == null || userFull == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.firstNameEdit.getText()) && (!TextUtils.equals(this.currentFirstName, this.firstNameEdit.getText().toString()) || !TextUtils.equals(this.currentLastName, this.lastNameEdit.getText().toString()) || !TextUtils.equals(this.currentBio, this.bioEdit.getText().toString()))) {
            TLRPC$TL_account_updateProfile tLRPC$TL_account_updateProfile = new TLRPC$TL_account_updateProfile();
            tLRPC$TL_account_updateProfile.flags |= 1;
            String charSequence = this.firstNameEdit.getText().toString();
            currentUser.first_name = charSequence;
            tLRPC$TL_account_updateProfile.first_name = charSequence;
            tLRPC$TL_account_updateProfile.flags |= 2;
            String charSequence2 = this.lastNameEdit.getText().toString();
            currentUser.last_name = charSequence2;
            tLRPC$TL_account_updateProfile.last_name = charSequence2;
            tLRPC$TL_account_updateProfile.flags |= 4;
            String charSequence3 = this.bioEdit.getText().toString();
            userFull.about = charSequence3;
            tLRPC$TL_account_updateProfile.about = charSequence3;
            userFull.flags = TextUtils.isEmpty(charSequence3) ? userFull.flags & (-3) : userFull.flags | 2;
            arrayList.add(tLRPC$TL_account_updateProfile);
        }
        final TLRPC$TL_birthday tLRPC$TL_birthday = userFull.birthday;
        if (!birthdaysEqual(this.currentBirthday, this.birthday)) {
            TLRPC$TL_account_updateBirthday tLRPC$TL_account_updateBirthday = new TLRPC$TL_account_updateBirthday();
            TLRPC$TL_birthday tLRPC$TL_birthday2 = this.birthday;
            if (tLRPC$TL_birthday2 != null) {
                userFull.flags2 |= 32;
                userFull.birthday = tLRPC$TL_birthday2;
                tLRPC$TL_account_updateBirthday.flags |= 1;
                tLRPC$TL_account_updateBirthday.birthday = tLRPC$TL_birthday2;
            } else {
                userFull.flags2 &= -33;
                userFull.birthday = null;
            }
            arrayList.add(tLRPC$TL_account_updateBirthday);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
        }
        long j = this.currentChannel;
        TLRPC$Chat tLRPC$Chat = this.channel;
        if (j != (tLRPC$Chat != null ? tLRPC$Chat.id : 0L)) {
            TLRPC$TL_account_updatePersonalChannel tLRPC$TL_account_updatePersonalChannel = new TLRPC$TL_account_updatePersonalChannel();
            tLRPC$TL_account_updatePersonalChannel.channel = MessagesController.getInputChannel(this.channel);
            TLRPC$Chat tLRPC$Chat2 = this.channel;
            if (tLRPC$Chat2 != null) {
                userFull.flags |= 64;
                long j2 = userFull.personal_channel_id;
                long j3 = tLRPC$Chat2.id;
                if (j2 != j3) {
                    userFull.personal_channel_message = 0;
                }
                userFull.personal_channel_id = j3;
            } else {
                userFull.flags &= -65;
                userFull.personal_channel_message = 0;
                userFull.personal_channel_id = 0L;
            }
            arrayList.add(tLRPC$TL_account_updatePersonalChannel);
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
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                    UserInfoActivity.this.lambda$processDone$6(tLObject, tLRPC$TL_birthday, userFull, iArr, arrayList, tLObject2, tLRPC$TL_error);
                }
            }, 1024);
        }
        getMessagesStorage().updateUserInfo(userFull, false);
        getUserConfig().saveConfig(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
    }

    public void lambda$processDone$6(final TLObject tLObject, final TLRPC$TL_birthday tLRPC$TL_birthday, final TLRPC$UserFull tLRPC$UserFull, final int[] iArr, final ArrayList arrayList, final TLObject tLObject2, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                UserInfoActivity.this.lambda$processDone$5(tLRPC$TL_error, tLObject, tLRPC$TL_birthday, tLRPC$UserFull, tLObject2, iArr, arrayList);
            }
        });
    }

    public void lambda$processDone$5(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TLRPC$TL_birthday tLRPC$TL_birthday, TLRPC$UserFull tLRPC$UserFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tLRPC$TL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            boolean z = tLObject instanceof TLRPC$TL_account_updateBirthday;
            if (z && (str = tLRPC$TL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                if (getContext() != null) {
                    showDialog(new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
                }
            } else {
                BulletinFactory.showError(tLRPC$TL_error);
            }
            if (z) {
                if (tLRPC$TL_birthday != null) {
                    tLRPC$UserFull.flags |= 32;
                } else {
                    tLRPC$UserFull.flags &= -33;
                }
                tLRPC$UserFull.birthday = tLRPC$TL_birthday;
                getMessagesStorage().updateUserInfo(tLRPC$UserFull, false);
            }
        } else if (tLObject2 instanceof TLRPC$TL_boolFalse) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        } else {
            this.wasSaved = true;
            iArr[0] = iArr[0] + 1;
            if (iArr[0] == arrayList.size()) {
                finishFragment();
            }
        }
    }

    public static class AdminedChannelsFetcher {
        public final int currentAccount;
        public final boolean for_personal;
        public boolean loaded;
        public boolean loading;
        public final ArrayList<TLRPC$Chat> chats = new ArrayList<>();
        private ArrayList<Runnable> callbacks = new ArrayList<>();

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
            TLRPC$TL_channels_getAdminedPublicChannels tLRPC$TL_channels_getAdminedPublicChannels = new TLRPC$TL_channels_getAdminedPublicChannels();
            tLRPC$TL_channels_getAdminedPublicChannels.for_personal = this.for_personal;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_getAdminedPublicChannels, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    UserInfoActivity.AdminedChannelsFetcher.this.lambda$fetch$1(tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$fetch$1(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    UserInfoActivity.AdminedChannelsFetcher.this.lambda$fetch$0(tLObject);
                }
            });
        }

        public void lambda$fetch$0(TLObject tLObject) {
            if (tLObject instanceof TLRPC$messages_Chats) {
                this.chats.clear();
                this.chats.addAll(((TLRPC$messages_Chats) tLObject).chats);
            }
            MessagesController.getInstance(this.currentAccount).putChats(this.chats, false);
            this.loading = false;
            this.loaded = true;
            Iterator<Runnable> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().run();
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

    public static class ChooseChannelFragment extends UniversalFragment {
        private AdminedChannelsFetcher channels;
        private boolean invalidateAfterPause = false;
        private String query;
        private ActionBarMenuItem searchItem;
        private long selectedChannel;
        private Utilities.Callback<TLRPC$Chat> whenSelected;

        @Override
        public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
            return false;
        }

        public ChooseChannelFragment(AdminedChannelsFetcher adminedChannelsFetcher, long j, Utilities.Callback<TLRPC$Chat> callback) {
            this.channels = adminedChannelsFetcher;
            this.selectedChannel = j;
            this.whenSelected = callback;
            adminedChannelsFetcher.subscribe(new Runnable() {
                @Override
                public final void run() {
                    UserInfoActivity.ChooseChannelFragment.this.lambda$new$0();
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
            ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_search, getResourceProvider()).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
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
            return this.fragmentView;
        }

        @Override
        protected CharSequence getTitle() {
            return LocaleController.getString(R.string.EditProfileChannelTitle);
        }

        @Override
        public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
            if (TextUtils.isEmpty(this.query)) {
                arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditProfileChannelSelect)));
            }
            if (TextUtils.isEmpty(this.query) && this.selectedChannel != 0) {
                arrayList.add(UItem.asButton(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide)).accent());
            }
            Iterator<TLRPC$Chat> it = this.channels.chats.iterator();
            int i = 0;
            while (it.hasNext()) {
                TLRPC$Chat next = it.next();
                if (next != null && !ChatObject.isMegagroup(next)) {
                    i++;
                    if (!TextUtils.isEmpty(this.query)) {
                        String lowerCase = this.query.toLowerCase();
                        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                        String lowerCase2 = next.title.toLowerCase();
                        String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                        if (!lowerCase2.startsWith(lowerCase)) {
                            if (!lowerCase2.contains(" " + lowerCase) && !translitSafe2.startsWith(translitSafe)) {
                                if (!translitSafe2.contains(" " + translitSafe)) {
                                }
                            }
                        }
                    }
                    arrayList.add(UItem.asFilterChat(true, -next.id).setChecked(this.selectedChannel == next.id));
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
                        UserInfoActivity.ChooseChannelFragment.this.lambda$onResume$1();
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
        public void onClick(UItem uItem, View view, int i, float f, float f2) {
            int i2 = uItem.id;
            if (i2 == 1) {
                this.whenSelected.run(null);
                finishFragment();
            } else if (i2 == 2) {
                this.invalidateAfterPause = true;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("step", 0);
                    presentFragment(new ChannelCreateActivity(bundle));
                    return;
                }
                presentFragment(new ActionIntroActivity(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).apply();
            } else if (uItem.viewType == 12) {
                finishFragment();
                this.whenSelected.run(getMessagesController().getChat(Long.valueOf(-uItem.dialogId)));
            }
        }
    }
}
