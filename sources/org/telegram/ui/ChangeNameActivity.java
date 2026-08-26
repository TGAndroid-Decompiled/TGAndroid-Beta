package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;

public final class ChangeNameActivity extends BaseFragment {
    public ActionBarMenuItem doneButton;
    public AnonymousClass2 firstNameField;
    public AnonymousClass3 lastNameField;
    public final Theme.ResourcesProvider resourcesProvider;

    public ChangeNameActivity(Theme.ResourcesProvider resourcesProvider) {
        super(null);
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public final View createView(Context context) {
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_avatar_actionBarSelectorBlue;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        actionBar.setItemsBackgroundColor(Theme.getColor(i, resourcesProvider), false);
        this.actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon, resourcesProvider), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EditName));
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 17));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((LinearLayout) this.fragmentView).setOrientation(1);
        this.fragmentView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        ?? r6 = new EditTextBoldCursor(context) {
            @Override
            public final Theme.ResourcesProvider getResourcesProvider() {
                return ChangeNameActivity.this.resourcesProvider;
            }
        };
        this.firstNameField = r6;
        r6.setTextSize(1, 18.0f);
        AnonymousClass2 anonymousClass2 = this.firstNameField;
        int i2 = Theme.key_windowBackgroundWhiteHintText;
        anonymousClass2.setHintTextColor(Theme.getColor(i2, resourcesProvider));
        AnonymousClass2 anonymousClass3 = this.firstNameField;
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        anonymousClass3.setTextColor(Theme.getColor(i3, resourcesProvider));
        setBackgroundDrawable(null);
        AnonymousClass2 anonymousClass4 = this.firstNameField;
        int i4 = Theme.key_windowBackgroundWhiteInputField;
        int themedColor = getThemedColor(i4);
        int i5 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        int themedColor2 = getThemedColor(i5);
        int i6 = Theme.key_text_RedRegular;
        anonymousClass4.setLineColors(themedColor, themedColor2, getThemedColor(i6));
        setMaxLines(1);
        setLines(1);
        setSingleLine(true);
        setGravity(LocaleController.isRTL ? 5 : 3);
        setInputType(49152);
        setImeOptions(5);
        setHint(LocaleController.getString(R.string.FirstName));
        setCursorColor(Theme.getColor(i3, resourcesProvider));
        setCursorSize(AndroidUtilities.dp(20.0f));
        setCursorWidth(1.5f);
        linearLayout.addView(this.firstNameField, LayoutHelper.createLinear(24.0f, 24.0f, 24.0f, 0.0f, -1, 36));
        final int i7 = 0;
        setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ChangeNameActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                switch (i7) {
                    case 0:
                        ChangeNameActivity changeNameActivity = this.f$0;
                        if (i8 != 5) {
                            changeNameActivity.getClass();
                            return false;
                        }
                        changeNameActivity.lastNameField.requestFocus();
                        ChangeNameActivity.AnonymousClass3 anonymousClass5 = changeNameActivity.lastNameField;
                        anonymousClass5.setSelection(anonymousClass5.length());
                        return true;
                    default:
                        ChangeNameActivity changeNameActivity2 = this.f$0;
                        if (i8 == 6) {
                            changeNameActivity2.doneButton.performClick();
                            return true;
                        }
                        changeNameActivity2.getClass();
                        return false;
                }
            }
        });
        ?? r7 = new EditTextBoldCursor(context) {
            @Override
            public final Theme.ResourcesProvider getResourcesProvider() {
                return ChangeNameActivity.this.resourcesProvider;
            }
        };
        this.lastNameField = r7;
        r7.setTextSize(1, 18.0f);
        setHintTextColor(Theme.getColor(i2, resourcesProvider));
        setTextColor(Theme.getColor(i3, resourcesProvider));
        setBackgroundDrawable(null);
        setLineColors(getThemedColor(i4), getThemedColor(i5), getThemedColor(i6));
        setMaxLines(1);
        setLines(1);
        setSingleLine(true);
        setGravity(LocaleController.isRTL ? 5 : 3);
        setInputType(49152);
        setImeOptions(6);
        setHint(LocaleController.getString(R.string.LastName));
        setCursorColor(Theme.getColor(i3, resourcesProvider));
        setCursorSize(AndroidUtilities.dp(20.0f));
        setCursorWidth(1.5f);
        linearLayout.addView(this.lastNameField, LayoutHelper.createLinear(24.0f, 16.0f, 24.0f, 0.0f, -1, 36));
        final int i8 = 1;
        setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ChangeNameActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
                switch (i8) {
                    case 0:
                        ChangeNameActivity changeNameActivity = this.f$0;
                        if (i9 != 5) {
                            changeNameActivity.getClass();
                            return false;
                        }
                        changeNameActivity.lastNameField.requestFocus();
                        ChangeNameActivity.AnonymousClass3 anonymousClass5 = changeNameActivity.lastNameField;
                        anonymousClass5.setSelection(anonymousClass5.length());
                        return true;
                    default:
                        ChangeNameActivity changeNameActivity2 = this.f$0;
                        if (i9 == 6) {
                            changeNameActivity2.doneButton.performClick();
                            return true;
                        }
                        changeNameActivity2.getClass();
                        return false;
                }
            }
        });
        if (user != null) {
            setText(user.first_name);
            AnonymousClass2 anonymousClass5 = this.firstNameField;
            anonymousClass5.setSelection(anonymousClass5.length());
            setText(user.last_name);
        }
        return this.fragmentView;
    }

    @Override
    public final Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        AnonymousClass2 anonymousClass2 = this.firstNameField;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(anonymousClass2, 4, null, null, null, null, i));
        AnonymousClass2 anonymousClass3 = this.firstNameField;
        int i2 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(anonymousClass3, 8388608, null, null, null, null, i2));
        AnonymousClass2 anonymousClass4 = this.firstNameField;
        int i3 = Theme.key_windowBackgroundWhiteInputField;
        arrayList.add(new ThemeDescription(anonymousClass4, 32, null, null, null, null, i3));
        AnonymousClass2 anonymousClass5 = this.firstNameField;
        int i4 = Theme.key_windowBackgroundWhiteInputFieldActivated;
        arrayList.add(new ThemeDescription(anonymousClass5, 65568, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.lastNameField, 4, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.lastNameField, 8388608, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.lastNameField, 32, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.lastNameField, 65568, null, null, null, null, i4));
        return arrayList;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            return;
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this.firstNameField);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda174(this, 4), 100L);
        }
    }

    public final void saveName() {
        String str;
        int i = 1;
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (currentUser == null || getText() == null || getText() == null) {
            return;
        }
        String string = getText().toString();
        String string2 = getText().toString();
        String str2 = currentUser.first_name;
        if (str2 == null || !str2.equals(string) || (str = currentUser.last_name) == null || !str.equals(string2)) {
            TL_account.updateProfile updateprofile = new TL_account.updateProfile();
            updateprofile.flags = 3;
            updateprofile.first_name = string;
            currentUser.first_name = string;
            updateprofile.last_name = string2;
            currentUser.last_name = string2;
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            if (user != null) {
                user.first_name = updateprofile.first_name;
                user.last_name = updateprofile.last_name;
            }
            UserConfig.getInstance(this.currentAccount).saveConfig(true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateprofile, new PassportActivity$$ExternalSyntheticLambda1(i));
        }
    }
}
