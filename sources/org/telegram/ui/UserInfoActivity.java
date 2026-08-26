package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.IconBackgroundColors;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;

public class UserInfoActivity extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int BUTTON_ADD_ACCOUNT = 10;
    private static final int BUTTON_AI = 6;
    private static final int BUTTON_BIRTHDAY = 1;
    private static final int BUTTON_CHANNEL = 3;
    private static final int BUTTON_HOURS = 4;
    private static final int BUTTON_LOCATION = 5;
    private static final int BUTTON_LOGOUT = 11;
    private static final int BUTTON_REMOVE_BIRTHDAY = 2;
    private static final int INFO_BIRTHDAY = 9;
    private static final int INFO_PHONE = 7;
    private static final int INFO_USERNAME = 8;
    private static final int done_button = 1;
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
    private int bioInfoHash = Integer.MIN_VALUE;
    private ArrayList<TL_account.TL_connectedBot> bots = new ArrayList<>();
    private final ArrayList<Integer> accountNumbers = new ArrayList<>();
    private AdminedChannelsFetcher channels = new AdminedChannelsFetcher(this.currentAccount, true);
    private boolean wasSaved = false;
    private int shiftDp = -4;

    public static class AdminedChannelsFetcher {
        public final int currentAccount;
        public final boolean for_personal;
        public boolean loaded;
        public boolean loading;
        public final ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        private ArrayList<Runnable> callbacks = new ArrayList<>();

        public AdminedChannelsFetcher(int i, boolean z) {
            this.currentAccount = i;
            this.for_personal = z;
        }

        public void lambda$fetch$0(TLObject tLObject) {
            if (tLObject instanceof TLRPC.messages_Chats) {
                this.chats.clear();
                this.chats.addAll(((TLRPC.messages_Chats) tLObject).chats);
            }
            int i = 0;
            MessagesController.getInstance(this.currentAccount).putChats(this.chats, false);
            this.loading = false;
            this.loaded = true;
            ArrayList<Runnable> arrayList = this.callbacks;
            int size = arrayList.size();
            while (i < size) {
                Runnable runnable = arrayList.get(i);
                i++;
                runnable.run();
            }
            this.callbacks.clear();
        }

        public void lambda$fetch$1(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ThemeActivity$$ExternalSyntheticLambda9(11, this, tLObject));
        }

        public void fetch() {
            if (this.loaded || this.loading) {
                return;
            }
            this.loading = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = this.for_personal;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getAdminedPublicChannels, new LinkManager$$ExternalSyntheticLambda10(this, 24));
        }

        public void invalidate() {
            this.loaded = false;
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
        private static final int BUTTON_CREATE = 2;
        private static final int BUTTON_REMOVE = 1;
        private AdminedChannelsFetcher channels;
        private boolean invalidateAfterPause = false;
        private String query;
        private ActionBarMenuItem searchItem;
        private long selectedChannel;
        private Utilities.Callback<TLRPC.Chat> whenSelected;

        public ChooseChannelFragment(AdminedChannelsFetcher adminedChannelsFetcher, long j, Utilities.Callback<TLRPC.Chat> callback) {
            this.channels = adminedChannelsFetcher;
            this.selectedChannel = j;
            this.whenSelected = callback;
            adminedChannelsFetcher.subscribe(new UserInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0(this, 1));
        }

        public void lambda$new$0() {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }

        public void lambda$onResume$1() {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
            }
        }

        @Override
        public View createView(Context context) {
            ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search, getResourceProvider()).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public void onSearchCollapse() {
                    ChooseChannelFragment.this.query = null;
                    UniversalRecyclerView universalRecyclerView = ChooseChannelFragment.this.listView;
                    if (universalRecyclerView != null) {
                        universalRecyclerView.adapter.update(true);
                    }
                }

                @Override
                public void onSearchExpand() {
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
        public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
            if (TextUtils.isEmpty(this.query) && this.selectedChannel != 0) {
                arrayList.add(UItem.asButton(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide)).red());
                arrayList.add(UItem.asShadow(null));
            }
            if (TextUtils.isEmpty(this.query)) {
                zzke.m(R.string.EditProfileChannelSelect, arrayList);
            }
            ArrayList<TLRPC.Chat> arrayList2 = this.channels.chats;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                TLRPC.Chat chat = arrayList2.get(i);
                i++;
                TLRPC.Chat chat2 = chat;
                if (chat2 != null && !ChatObject.isMegagroup(chat2)) {
                    i2++;
                    if (!TextUtils.isEmpty(this.query)) {
                        String lowerCase = this.query.toLowerCase();
                        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                        String lowerCase2 = chat2.title.toLowerCase();
                        String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                        if (lowerCase2.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase2) || strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                        }
                    }
                    arrayList.add(UItem.asFilterChat(true, -chat2.id).setChecked(this.selectedChannel == chat2.id));
                }
            }
            if (TextUtils.isEmpty(this.query) && i2 == 0) {
                arrayList.add(UItem.asButton(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew)).accent());
            }
            arrayList.add(UItem.asShadow(null));
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(i2 <= 5 ? 8 : 0);
            }
        }

        @Override
        public CharSequence getTitle() {
            return LocaleController.getString(R.string.EditProfileChannelTitle);
        }

        @Override
        public void onClick(UItem uItem, View view, int i, float f, float f2) {
            int i2 = uItem.id;
            if (i2 == 1) {
                this.whenSelected.run(null);
                finishFragment();
                return;
            }
            if (i2 != 2) {
                if (uItem.viewType == 12) {
                    finishFragment();
                    this.whenSelected.run(getMessagesController().getChat(Long.valueOf(-uItem.dialogId)));
                    return;
                }
                return;
            }
            this.invalidateAfterPause = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")));
            } else {
                presentFragment(new ActionIntroActivity(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).apply();
            }
        }

        @Override
        public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
            return false;
        }

        @Override
        public void onResume() {
            super.onResume();
            if (this.invalidateAfterPause) {
                this.channels.invalidate();
                this.channels.subscribe(new UserInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0(this, 0));
                this.invalidateAfterPause = false;
            }
        }
    }

    public static class InfoCell extends LinearLayout {
        private boolean accent;
        private final ImageView icon2View;
        private final ImageView iconView;
        private boolean red;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView subtitleView;
        private final LinearLayout textLayout;
        private final TextView titleView;

        public static class Factory extends UItem.UItemFactory<InfoCell> {
            static {
                UItem.UItemFactory.setup(new Factory());
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

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((InfoCell) view).set(uItem.iconResId, uItem.text, uItem.subtext, uItem.accent, uItem.red, uItem.intValue);
            }

            @Override
            public InfoCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new InfoCell(context, resourcesProvider);
            }
        }

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
            TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 0), context);
            this.subtitleView = textViewM;
            textViewM.setTextSize(1, 13.0f);
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.icon2View = imageView2;
            imageView2.setScaleType(scaleType);
            addView(imageView2, LayoutHelper.createLinear(40, 40, 21, 12, 0, 12, 0));
        }

        private void updateColors() {
            int i;
            int i2;
            int i3;
            int i4;
            ImageView imageView = this.iconView;
            if (this.red) {
                i = Theme.key_text_RedBold;
            } else {
                i = this.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText;
            }
            int color = Theme.getColor(i, this.resourcesProvider);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
            ImageView imageView2 = this.icon2View;
            if (this.red) {
                i2 = Theme.key_text_RedBold;
            } else {
                i2 = this.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText;
            }
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, this.resourcesProvider), mode));
            TextView textView = this.titleView;
            if (this.red) {
                i3 = Theme.key_text_RedRegular;
            } else {
                i3 = this.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText;
            }
            textView.setTextColor(Theme.getColor(i3, this.resourcesProvider));
            TextView textView2 = this.subtitleView;
            if (this.red) {
                i4 = Theme.key_text_RedRegular;
            } else {
                i4 = this.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteGrayText;
            }
            textView2.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void set(int i, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, int i2) {
            this.accent = z;
            this.red = z2;
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
    }

    public static String birthdayString(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return LocaleController.getInstance().getFormatterDayMonth().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, tL_birthday.year);
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return LocaleController.getInstance().getFormatterBoostExpired().format(calendar2.getTimeInMillis());
    }

    public static boolean birthdaysEqual(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        return (tL_birthday == null) != (tL_birthday2 != null) && (tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year));
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

    public void lambda$fillItems$1() {
        presentFragment(new PrivacyControlActivity(11));
    }

    public void lambda$fillItems$2() {
        presentFragment(new PremiumPreviewFragment("add_account"));
    }

    public void lambda$onClick$3(TL_account.TL_birthday tL_birthday) {
        this.birthday = tL_birthday;
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
        checkDone(true);
    }

    public void lambda$onClick$4(TLRPC.Chat chat) {
        if (this.channel == chat) {
            return;
        }
        this.channel = chat;
        if (chat != null) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.EditProfileChannelSet, BulletinFactory.of(this), R.raw.contact_check);
        }
        checkDone(true);
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public void lambda$onResume$5() {
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }

    public void lambda$processDone$6(TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                this.doneButtonDrawable.animateToProgress(0.0f);
                UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(this), R.string.UnknownError);
                return;
            }
            this.wasSaved = true;
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i == arrayList.size()) {
                finishFragment();
                return;
            }
            return;
        }
        this.doneButtonDrawable.animateToProgress(0.0f);
        boolean z = tLObject instanceof TL_account.updateBirthday;
        if (!z || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            BulletinFactory.showError(tL_error);
        } else if (getContext() != null) {
            showDialog(new AlertDialog.Builder(getContext(), 0, this.resourceProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
        }
        if (z) {
            if (tL_birthday != null) {
                userFull.flags |= 32;
            } else {
                userFull.flags &= -33;
            }
            userFull.birthday = tL_birthday;
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    public void lambda$processDone$7(TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, int[] iArr, ArrayList arrayList, TLObject tLObject2, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new UserInfoActivity$$ExternalSyntheticLambda7(arrayList, tLObject, tLObject2, tL_error, userFull, tL_birthday, this, iArr));
    }

    public static int lambda$updateAccounts$0(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void openBioSettings() {
        presentFragment(new PrivacyControlActivity(9, true));
    }

    public void processDone(boolean z) {
        if (this.doneButtonDrawable.getProgress() <= 0.0f) {
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
            if (currentUser != null && userFull != null) {
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
                            int[] iArr2 = iArr;
                            ArrayList arrayList2 = arrayList;
                            this.f$0.lambda$processDone$7(tLObject, tL_birthday, userFull, iArr2, arrayList2, tLObject2, tL_error);
                        }
                    }, 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
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

    private void updateAccounts() {
        this.accountNumbers.clear();
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).isClientActivated() && this.currentAccount != i) {
                this.accountNumbers.add(Integer.valueOf(i));
            }
        }
        Collections.sort(this.accountNumbers, new OAuthSheet$$ExternalSyntheticLambda10(19));
    }

    public void updateBioInfo() {
        boolean z;
        UniversalRecyclerView universalRecyclerView;
        int i = this.bioInfoHash;
        EditTextCell editTextCell = this.bioEdit;
        int i2 = 0;
        if (editTextCell == null || TextUtils.isEmpty(editTextCell.getText())) {
            z = true;
            this.bioInfo = LocaleController.getString(R.string.EditProfileBioInfo2);
            this.bioInfoHash = Objects.hash(0);
        } else {
            ArrayList<TLRPC.PrivacyRule> privacyRules = getContactsController().getPrivacyRules(9);
            if (privacyRules == null) {
                this.bioInfo = LocaleController.getString(R.string.Loading);
                this.bioInfoHash = Objects.hash(1);
                z = true;
            } else {
                int i3 = -1;
                byte b = -1;
                int size = 0;
                int size2 = 0;
                boolean z2 = false;
                for (int i4 = 0; i4 < privacyRules.size(); i4++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i4);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size3 = tL_privacyValueAllowChatParticipants.chats.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            TLRPC.Chat chat = getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i5));
                            if (chat != null) {
                                size2 = Math.max(0, chat.participants_count - 1) + size2;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                        int size4 = tL_privacyValueDisallowChatParticipants.chats.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            TLRPC.Chat chat2 = getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i6));
                            if (chat2 != null) {
                                size = Math.max(0, chat2.participants_count - 1) + size;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        size2 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        size += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                    } else {
                        boolean z3 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll;
                        if (z3) {
                            b = 0;
                        } else {
                            boolean z4 = privacyRule instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (z4 && !z2) {
                                b = 1;
                            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                b = 2;
                                z2 = true;
                            } else if (b == -1) {
                                if (z3) {
                                    b = 0;
                                } else if (!z4 || z2) {
                                    b = 2;
                                } else {
                                    b = 1;
                                }
                            }
                        }
                    }
                }
                if (b == 0 || (b == -1 && size > 0)) {
                    i3 = 0;
                } else if (b == 2 || (b == -1 && size > 0 && size2 > 0)) {
                    i3 = 2;
                } else if (b == 1 || (b == -1 && size2 > 0)) {
                    i3 = 1;
                }
                if (i3 == 0) {
                    if (size <= 0) {
                        this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                    } else {
                        this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(size)), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                    }
                } else if (i3 == 2) {
                    if (size > 0 || size2 > 0) {
                        String strM = size2 > 0 ? DiffUtil.m(size2, "+") : "";
                        if (size > 0) {
                            if (strM.length() > 0) {
                                strM = strM.concat(", ");
                            }
                            strM = strM + "-" + size;
                        }
                        this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, strM), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                    } else {
                        this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                    }
                } else if (i3 != 0) {
                    this.bioInfo = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2));
                } else if (size2 <= 0) {
                    this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                } else {
                    this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(size2)), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                }
                z = true;
                this.bioInfoHash = Objects.hash(Integer.valueOf(i3 + 10), Integer.valueOf(size2), Integer.valueOf(size));
            }
        }
        if (i == this.bioInfoHash || (universalRecyclerView = this.listView) == null) {
            return;
        }
        universalRecyclerView.adapter.update(z);
    }

    @Override
    public View createView(Context context) {
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        EditTextCell editTextCell = new EditTextCell(context, LocaleController.getString(R.string.EditProfileFirstName), z, z2, i, this.resourceProvider) {
            @Override
            public void onTextChanged(CharSequence charSequence) {
                UserInfoActivity.this.checkDone(true);
            }
        };
        this.firstNameEdit = editTextCell;
        editTextCell.setDivider(true);
        this.firstNameEdit.hideKeyboardOnEnter();
        EditTextCell editTextCell2 = new EditTextCell(context, LocaleController.getString(R.string.EditProfileLastName), z, z2, i, this.resourceProvider) {
            @Override
            public void onTextChanged(CharSequence charSequence) {
                UserInfoActivity.this.checkDone(true);
            }
        };
        this.lastNameEdit = editTextCell2;
        editTextCell2.hideKeyboardOnEnter();
        EditTextCell editTextCell3 = new EditTextCell(context, LocaleController.getString(R.string.EditProfileBioHint2), true, z2, getMessagesController().getAboutLimit(), this.resourceProvider) {
            @Override
            public void onTextChanged(CharSequence charSequence) {
                UserInfoActivity.this.checkDone(true);
                UserInfoActivity.this.updateBioInfo();
            }
        };
        this.bioEdit = editTextCell3;
        editTextCell3.setShowLimitWhenEmpty(true);
        updateBioInfo();
        this.bioInfo = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new UserInfoActivity$$ExternalSyntheticLambda0(this, 0));
        super.createView(context);
        UniversalRecyclerView universalRecyclerView = super.listView;
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.listView.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.listView);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
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
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i2, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone(false);
        setValue();
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue();
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            UniversalRecyclerView universalRecyclerView = this.listView;
            if (universalRecyclerView != null) {
                universalRecyclerView.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.privacyRulesUpdated) {
            updateBioInfo();
            UniversalRecyclerView universalRecyclerView2 = this.listView;
            if (universalRecyclerView2 != null) {
                universalRecyclerView2.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = BusinessChatbotController.getInstance(this.currentAccount).value;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.bots = arrayList;
            UniversalRecyclerView universalRecyclerView3 = this.listView;
            if (universalRecyclerView3 != null) {
                universalRecyclerView3.adapter.update(true);
            }
        }
    }

    @Override
    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        char c;
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        int i = 2;
        int i2 = 1;
        this.addAccountRow = -1;
        this.numberRow = -1;
        updateAccounts();
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.EditProfileName)));
        this.firstNameRow = arrayList.size();
        arrayList.add(UItem.asCustom(this.firstNameEdit));
        this.lastNameRow = arrayList.size();
        arrayList.add(UItem.asCustom(this.lastNameEdit));
        arrayList.add(UItem.asShadow(-1, null));
        this.bioRow = arrayList.size();
        arrayList.add(UItem.asCustom(this.bioEdit));
        arrayList.add(UItem.asShadow(this.bioInfo));
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        zzke.m(R.string.EditAccountInfoHeader, arrayList);
        if (currentUser != null) {
            this.numberRow = arrayList.size();
            IconBackgroundColors iconBackgroundColors = IconBackgroundColors.GREEN;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(7, iconBackgroundColors.top, iconBackgroundColors.bottom, R.drawable.settings_calls, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), currentUser.phone, PhoneFormat.getInstance()), LocaleController.getString(R.string.TapToChangePhone)));
        }
        this.usernameRow = arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            IconBackgroundColors iconBackgroundColors2 = IconBackgroundColors.ORANGE;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(8, iconBackgroundColors2.top, iconBackgroundColors2.bottom, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username)));
        } else {
            IconBackgroundColors iconBackgroundColors3 = IconBackgroundColors.ORANGE;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(8, iconBackgroundColors3.top, iconBackgroundColors3.bottom, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null));
        }
        this.birthdayRow = arrayList.size();
        TL_account.TL_birthday tL_birthday = this.birthday;
        if (tL_birthday != null) {
            IconBackgroundColors iconBackgroundColors4 = IconBackgroundColors.BLUE;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(9, iconBackgroundColors4.top, iconBackgroundColors4.bottom, R.drawable.filled_birthday, birthdayString(tL_birthday), LocaleController.getString(R.string.ContactBirthday)));
        } else {
            IconBackgroundColors iconBackgroundColors5 = IconBackgroundColors.BLUE;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(9, iconBackgroundColors5.top, iconBackgroundColors5.bottom, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null));
        }
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.birthdayInfo == null) {
            String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
            if (!privacyRules.isEmpty()) {
                for (int i3 = 0; i3 < privacyRules.size(); i3++) {
                    if (privacyRules.get(i3) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        break;
                    }
                    if ((privacyRules.get(i3) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i3) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                        string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                    }
                }
            }
            this.birthdayInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
        }
        arrayList.add(UItem.asShadow(this.birthdayInfo));
        this.channelRow = arrayList.size();
        if (this.channel == null) {
            IconBackgroundColors iconBackgroundColors6 = IconBackgroundColors.ORANGE;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(3, iconBackgroundColors6.top, iconBackgroundColors6.bottom, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            IconBackgroundColors iconBackgroundColors7 = IconBackgroundColors.ORANGE;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(3, iconBackgroundColors7.top, iconBackgroundColors7.bottom, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.channel.title));
        }
        if (this.hadHours) {
            IconBackgroundColors iconBackgroundColors8 = IconBackgroundColors.ORANGE_DEEP;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(4, iconBackgroundColors8.top, iconBackgroundColors8.bottom, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours)));
        }
        if (this.hadLocation) {
            IconBackgroundColors iconBackgroundColors9 = IconBackgroundColors.RED;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(5, iconBackgroundColors9.top, iconBackgroundColors9.bottom, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation)));
        }
        ArrayList<TL_account.TL_connectedBot> arrayList2 = this.bots;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            c = 1;
            IconBackgroundColors iconBackgroundColors10 = IconBackgroundColors.PURPLE;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(6, iconBackgroundColors10.top, iconBackgroundColors10.bottom, R.drawable.premium_ai_editor, TextCell.applyNewSpan(LocaleController.getString(R.string.EditProfileChatAutomation))));
        } else {
            StringBuilder sb = new StringBuilder();
            ArrayList<TL_account.TL_connectedBot> arrayList3 = this.bots;
            int size = arrayList3.size();
            int i4 = 0;
            while (i4 < size) {
                TL_account.TL_connectedBot tL_connectedBot = arrayList3.get(i4);
                i4 += i2;
                ArrayList<TL_account.TL_connectedBot> arrayList4 = arrayList3;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
                if (user != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(UserObject.getUserName(user));
                }
                arrayList3 = arrayList4;
                i2 = 1;
            }
            c = 1;
            IconBackgroundColors iconBackgroundColors11 = IconBackgroundColors.PURPLE;
            arrayList.add(SettingsActivity.SettingCell.Factory.of(6, iconBackgroundColors11.top, iconBackgroundColors11.bottom, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb));
        }
        arrayList.add(UItem.asShadow(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        boolean z = UserConfig.getActivatedAccountsCount() < 4;
        if (z) {
            this.addAccountRow = arrayList.size();
            arrayList.add(InfoCell.Factory.of(10, R.drawable.outline_add_account, LocaleController.getString(R.string.AddAccount), null, 0).accent());
        }
        if (!this.accountNumbers.isEmpty()) {
            if (!z) {
                zzke.m(R.string.SettingsAccounts, arrayList);
            }
            for (int i5 = 0; i5 < this.accountNumbers.size(); i5++) {
                arrayList.add(SettingsActivity.AccountCell.Factory.of(i5, this.accountNumbers.get(i5).intValue()));
            }
            if (UserConfig.hasPremiumOnAccounts()) {
                arrayList.add(UItem.asShadow(null));
            } else {
                int iMax = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                String str = iMax > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", iMax) + " " : "";
                SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new UserInfoActivity$$ExternalSyntheticLambda0(this, i));
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[0] = str;
                charSequenceArr[c] = spannableStringBuilderReplaceSingleTag;
                arrayList.add(UItem.asShadow(TextUtils.concat(charSequenceArr)));
            }
        }
        this.logoutRow = arrayList.size();
        arrayList.add(InfoCell.Factory.of(11, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut), null, 0).red());
        arrayList.add(UItem.asShadow(-4, null));
    }

    @Override
    public CharSequence getTitle() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    public boolean hasChanges() {
        String str = this.currentFirstName;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.equals(str, this.firstNameEdit.getText().toString())) {
            return true;
        }
        String str2 = this.currentLastName;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str2, this.lastNameEdit.getText().toString())) {
            return true;
        }
        String str3 = this.currentBio;
        if (!TextUtils.equals(str3 != null ? str3 : "", this.bioEdit.getText().toString()) || !birthdaysEqual(this.currentBirthday, this.birthday)) {
            return true;
        }
        long j = this.currentChannel;
        TLRPC.Chat chat = this.channel;
        return j != (chat != null ? chat.id : 0L);
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        Integer numValueOf = null;
        int i2 = 0;
        if (uItem.id == 10) {
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
                showDialog(new LimitReachedBottomSheet(7, this, getContext(), this.currentAccount, null));
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
        if (i5 == 1 || i5 == 9) {
            Context context = getContext();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.birthday;
            final int i6 = 1;
            showDialog(AlertsCreator.createBirthdayPickerDialog(context, string, string2, tL_birthday, new Utilities.Callback(this) {
                public final UserInfoActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$onClick$4((TLRPC.Chat) obj);
                            break;
                        default:
                            this.f$0.lambda$onClick$3((TL_account.TL_birthday) obj);
                            break;
                    }
                }
            }, null, false, tL_birthday != null, getResourceProvider()).bottomSheet);
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
            final int i7 = 0;
            presentFragment(new ChooseChannelFragment(adminedChannelsFetcher, chat == null ? 0L : chat.id, new Utilities.Callback(this) {
                public final UserInfoActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i7) {
                        case 0:
                            this.f$0.lambda$onClick$4((TLRPC.Chat) obj);
                            break;
                        default:
                            this.f$0.lambda$onClick$3((TL_account.TL_birthday) obj);
                            break;
                    }
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
            presentFragment(new ChatbotsActivity());
            return;
        }
        if (i5 == 7) {
            presentFragment(new ActionIntroActivity(3));
        } else if (i5 == 8) {
            presentFragment(new ChangeUsernameActivity());
        } else if (i5 == 11) {
            presentFragment(new LogoutActivity());
        }
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.updatedChatbot);
        getContactsController().loadPrivacySettings();
        BusinessChatbotController.getInstance(this.currentAccount).load(null);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (this.wasSaved) {
            return;
        }
        processDone(false);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    @Override
    public void onResume() {
        super.onResume();
        this.channels.invalidate();
        this.channels.subscribe(new UserInfoActivity$$ExternalSyntheticLambda0(this, 3));
        this.channels.fetch();
        this.birthdayInfo = null;
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(true);
        }
    }
}
