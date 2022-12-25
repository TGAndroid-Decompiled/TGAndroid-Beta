package org.telegram.p009ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.PhoneFormat.C0933PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1069ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.CheckBoxCell;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.EditTextBoldCursor;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.tgnet.TLRPC$User;

public class ContactAddActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private boolean addContact;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImage;
    private CheckBoxCell checkBoxCell;
    private ContactAddActivityDelegate delegate;
    private View doneButton;
    private EditTextBoldCursor firstNameField;
    private String firstNameFromCard;
    private TextView infoTextView;
    private EditTextBoldCursor lastNameField;
    private String lastNameFromCard;
    private TextView nameTextView;
    private boolean needAddException;
    private TextView onlineTextView;
    boolean paused;
    private String phone;
    private Theme.ResourcesProvider resourcesProvider;
    private long user_id;

    public interface ContactAddActivityDelegate {
        void didAddToContacts();
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public ContactAddActivity(Bundle bundle) {
        super(bundle);
    }

    public ContactAddActivity(Bundle bundle, Theme.ResourcesProvider resourcesProvider) {
        super(bundle);
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        this.user_id = getArguments().getLong("user_id", 0L);
        this.phone = getArguments().getString("phone");
        this.firstNameFromCard = getArguments().getString("first_name_card");
        this.lastNameFromCard = getArguments().getString("last_name_card");
        this.addContact = getArguments().getBoolean("addContact", false);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        this.needAddException = notificationsSettings.getBoolean("dialog_bar_exception" + this.user_id, false);
        return ((this.user_id > 0L ? 1 : (this.user_id == 0L ? 0 : -1)) != 0 ? getMessagesController().getUser(Long.valueOf(this.user_id)) : null) != null && super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
    }

    @Override
    public View createView(Context context) {
        String str;
        this.actionBar.setItemsBackgroundColor(Theme.getColor("avatar_actionBarSelectorBlue", this.resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor("actionBarDefaultIcon", this.resourcesProvider), false);
        this.actionBar.setBackButtonImage(C1010R.C1011drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.addContact) {
            this.actionBar.setTitle(LocaleController.getString("NewContact", C1010R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString("EditName", C1010R.string.EditName));
        }
        this.actionBar.setActionBarMenuOnItemClick(new C1069ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i != -1) {
                    if (i != 1 || ContactAddActivity.this.firstNameField.getText().length() == 0) {
                        return;
                    }
                    TLRPC$User user = ContactAddActivity.this.getMessagesController().getUser(Long.valueOf(ContactAddActivity.this.user_id));
                    user.first_name = ContactAddActivity.this.firstNameField.getText().toString();
                    user.last_name = ContactAddActivity.this.lastNameField.getText().toString();
                    ContactAddActivity.this.getContactsController().addContact(user, ContactAddActivity.this.checkBoxCell != null && ContactAddActivity.this.checkBoxCell.isChecked());
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(((BaseFragment) ContactAddActivity.this).currentAccount).edit();
                    edit.putInt("dialog_bar_vis3" + ContactAddActivity.this.user_id, 3).commit();
                    ContactAddActivity.this.getNotificationCenter().postNotificationName(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                    ContactAddActivity.this.getNotificationCenter().postNotificationName(NotificationCenter.peerSettingsDidLoad, Long.valueOf(ContactAddActivity.this.user_id));
                    ContactAddActivity.this.finishFragment();
                    if (ContactAddActivity.this.delegate != null) {
                        ContactAddActivity.this.delegate.didAddToContacts();
                        return;
                    }
                    return;
                }
                ContactAddActivity.this.finishFragment();
            }
        });
        this.doneButton = this.actionBar.createMenu().addItem(1, LocaleController.getString("Done", C1010R.string.Done).toUpperCase());
        this.fragmentView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ((ScrollView) this.fragmentView).addView(linearLayout, LayoutHelper.createScroll(-1, -2, 51));
        linearLayout.setOnTouchListener(ContactAddActivity$$ExternalSyntheticLambda1.INSTANCE);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 24.0f, 24.0f, 24.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImage = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.m35dp(30.0f));
        frameLayout.addView(this.avatarImage, LayoutHelper.createFrame(60, 60, (LocaleController.isRTL ? 5 : 3) | 48));
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.nameTextView.setTextSize(1, 20.0f);
        this.nameTextView.setLines(1);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setSingleLine(true);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.nameTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.nameTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        TextView textView2 = this.nameTextView;
        boolean z = LocaleController.isRTL;
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 48, z ? 0.0f : 80.0f, 3.0f, z ? 80.0f : 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.onlineTextView = textView3;
        textView3.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText3", this.resourcesProvider));
        this.onlineTextView.setTextSize(1, 14.0f);
        this.onlineTextView.setLines(1);
        this.onlineTextView.setMaxLines(1);
        this.onlineTextView.setSingleLine(true);
        this.onlineTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.onlineTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView4 = this.onlineTextView;
        boolean z2 = LocaleController.isRTL;
        frameLayout.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 80.0f, 32.0f, z2 ? 80.0f : 0.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            protected Theme.ResourcesProvider getResourcesProvider() {
                return ContactAddActivity.this.resourcesProvider;
            }
        };
        this.firstNameField = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        this.firstNameField.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText", this.resourcesProvider));
        this.firstNameField.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.firstNameField.setBackgroundDrawable(null);
        this.firstNameField.setLineColors(getThemedColor("windowBackgroundWhiteInputField"), getThemedColor("windowBackgroundWhiteInputFieldActivated"), getThemedColor("windowBackgroundWhiteRedText3"));
        this.firstNameField.setMaxLines(1);
        this.firstNameField.setLines(1);
        this.firstNameField.setSingleLine(true);
        this.firstNameField.setGravity(LocaleController.isRTL ? 5 : 3);
        this.firstNameField.setInputType(49152);
        this.firstNameField.setImeOptions(5);
        this.firstNameField.setHint(LocaleController.getString("FirstName", C1010R.string.FirstName));
        this.firstNameField.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.firstNameField.setCursorSize(AndroidUtilities.m35dp(20.0f));
        this.firstNameField.setCursorWidth(1.5f);
        linearLayout.addView(this.firstNameField, LayoutHelper.createLinear(-1, 36, 24.0f, 24.0f, 24.0f, 0.0f));
        this.firstNameField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView5, int i, KeyEvent keyEvent) {
                boolean lambda$createView$1;
                lambda$createView$1 = ContactAddActivity.this.lambda$createView$1(textView5, i, keyEvent);
                return lambda$createView$1;
            }
        });
        this.firstNameField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            boolean focused;

            @Override
            public void onFocusChange(View view, boolean z3) {
                if (!ContactAddActivity.this.paused && !z3 && this.focused) {
                    FileLog.m34d("changed");
                }
                this.focused = z3;
            }
        });
        this.firstNameField.setText(this.firstNameFromCard);
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context) {
            @Override
            protected Theme.ResourcesProvider getResourcesProvider() {
                return ContactAddActivity.this.resourcesProvider;
            }
        };
        this.lastNameField = editTextBoldCursor2;
        editTextBoldCursor2.setTextSize(1, 18.0f);
        this.lastNameField.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText", this.resourcesProvider));
        this.lastNameField.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.lastNameField.setBackgroundDrawable(null);
        this.lastNameField.setLineColors(getThemedColor("windowBackgroundWhiteInputField"), getThemedColor("windowBackgroundWhiteInputFieldActivated"), getThemedColor("windowBackgroundWhiteRedText3"));
        this.lastNameField.setMaxLines(1);
        this.lastNameField.setLines(1);
        this.lastNameField.setSingleLine(true);
        this.lastNameField.setGravity(LocaleController.isRTL ? 5 : 3);
        this.lastNameField.setInputType(49152);
        this.lastNameField.setImeOptions(6);
        this.lastNameField.setHint(LocaleController.getString("LastName", C1010R.string.LastName));
        this.lastNameField.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText", this.resourcesProvider));
        this.lastNameField.setCursorSize(AndroidUtilities.m35dp(20.0f));
        this.lastNameField.setCursorWidth(1.5f);
        linearLayout.addView(this.lastNameField, LayoutHelper.createLinear(-1, 36, 24.0f, 16.0f, 24.0f, 0.0f));
        this.lastNameField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView5, int i, KeyEvent keyEvent) {
                boolean lambda$createView$2;
                lambda$createView$2 = ContactAddActivity.this.lambda$createView$2(textView5, i, keyEvent);
                return lambda$createView$2;
            }
        });
        this.lastNameField.setText(this.lastNameFromCard);
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        if (user != null && this.firstNameFromCard == null && this.lastNameFromCard == null) {
            if (user.phone == null && (str = this.phone) != null) {
                user.phone = C0933PhoneFormat.stripExceptNumbers(str);
            }
            this.firstNameField.setText(user.first_name);
            EditTextBoldCursor editTextBoldCursor3 = this.firstNameField;
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.lastNameField.setText(user.last_name);
        }
        TextView textView5 = new TextView(context);
        this.infoTextView = textView5;
        textView5.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText4"));
        this.infoTextView.setTextSize(1, 14.0f);
        this.infoTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        if (this.addContact) {
            if (!this.needAddException || TextUtils.isEmpty(getPhone())) {
                linearLayout.addView(this.infoTextView, LayoutHelper.createLinear(-1, -2, 24.0f, 18.0f, 24.0f, 0.0f));
            }
            if (this.needAddException) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 0);
                this.checkBoxCell = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                this.checkBoxCell.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString("SharePhoneNumberWith", C1010R.string.SharePhoneNumberWith)), Emoji.replaceEmoji(UserObject.getFirstName(user), this.infoTextView.getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(12.0f), false)), BuildConfig.APP_CENTER_HASH, true, false);
                this.checkBoxCell.setPadding(AndroidUtilities.m35dp(7.0f), 0, AndroidUtilities.m35dp(7.0f), 0);
                this.checkBoxCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ContactAddActivity.this.lambda$createView$3(view);
                    }
                });
                linearLayout.addView(this.checkBoxCell, LayoutHelper.createLinear(-1, -2, 0.0f, 10.0f, 0.0f, 0.0f));
            }
        }
        return this.fragmentView;
    }

    public boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.lastNameField.requestFocus();
            EditTextBoldCursor editTextBoldCursor = this.lastNameField;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            return true;
        }
        return false;
    }

    public boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.doneButton.performClick();
            return true;
        }
        return false;
    }

    public void lambda$createView$3(View view) {
        CheckBoxCell checkBoxCell = this.checkBoxCell;
        checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
    }

    public void setDelegate(ContactAddActivityDelegate contactAddActivityDelegate) {
        this.delegate = contactAddActivityDelegate;
    }

    private void updateAvatarLayout() {
        TLRPC$User user;
        if (this.nameTextView == null || (user = getMessagesController().getUser(Long.valueOf(this.user_id))) == null) {
            return;
        }
        if (TextUtils.isEmpty(getPhone())) {
            this.nameTextView.setText(LocaleController.getString("MobileHidden", C1010R.string.MobileHidden));
            this.infoTextView.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString("MobileHiddenExceptionInfo", C1010R.string.MobileHiddenExceptionInfo)), Emoji.replaceEmoji(UserObject.getFirstName(user), this.infoTextView.getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(12.0f), false)));
        } else {
            TextView textView = this.nameTextView;
            C0933PhoneFormat c0933PhoneFormat = C0933PhoneFormat.getInstance();
            textView.setText(c0933PhoneFormat.format("+" + getPhone()));
            if (this.needAddException) {
                this.infoTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", C1010R.string.MobileVisibleInfo, UserObject.getFirstName(user))));
            }
        }
        this.onlineTextView.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        BackupImageView backupImageView = this.avatarImage;
        AvatarDrawable avatarDrawable = new AvatarDrawable(user);
        this.avatarDrawable = avatarDrawable;
        backupImageView.setForUserOrChat(user, avatarDrawable);
    }

    private String getPhone() {
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.user_id));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.phone : user.phone;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (intValue & MessagesController.UPDATE_MASK_STATUS) == 0) {
                return;
            }
            updateAvatarLayout();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        this.paused = true;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateAvatarLayout();
        EditTextBoldCursor editTextBoldCursor = this.firstNameField;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                return;
            }
            AndroidUtilities.showKeyboard(this.firstNameField);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.firstNameField.requestFocus();
            AndroidUtilities.showKeyboard(this.firstNameField);
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ContactAddActivity.this.lambda$getThemeDescriptions$4();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.nameTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.onlineTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.lastNameField, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.infoTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, themeDescriptionDelegate, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundPink"));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$4() {
        TLRPC$User user;
        if (this.avatarImage == null || (user = getMessagesController().getUser(Long.valueOf(this.user_id))) == null) {
            return;
        }
        this.avatarDrawable.setInfo(user);
        this.avatarImage.invalidate();
    }
}
