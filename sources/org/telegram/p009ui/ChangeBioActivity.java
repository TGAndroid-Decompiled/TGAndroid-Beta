package org.telegram.p009ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.CodepointsLengthInputFilter;
import org.telegram.p009ui.Components.EditTextBoldCursor;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.NumberTextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_account_updateProfile;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;

public class ChangeBioActivity extends BaseFragment {
    private NumberTextView checkTextView;
    private View doneButton;
    private EditTextBoldCursor firstNameField;
    private TextView helpTextView;

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public View createView(Context context) {
        String str;
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("UserBio", C0952R.string.UserBio));
        this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ChangeBioActivity.this.finishFragment();
                } else if (i == 1) {
                    ChangeBioActivity.this.saveName();
                }
            }
        });
        ActionBarMenuItem addItemWithWidth = this.actionBar.createMenu().addItemWithWidth(1, C0952R.C0953drawable.ic_done, AndroidUtilities.m34dp(56.0f));
        this.doneButton = addItemWithWidth;
        addItemWithWidth.setContentDescription(LocaleController.getString("Done", C0952R.string.Done));
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        LinearLayout linearLayout2 = linearLayout;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(ChangeBioActivity$$ExternalSyntheticLambda1.INSTANCE);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 24.0f, 24.0f, 20.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.firstNameField = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        this.firstNameField.setHintTextColor(Theme.getColor("windowBackgroundWhiteHintText"));
        this.firstNameField.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.firstNameField.setBackgroundDrawable(null);
        this.firstNameField.setLineColors(getThemedColor("windowBackgroundWhiteInputField"), getThemedColor("windowBackgroundWhiteInputFieldActivated"), getThemedColor("windowBackgroundWhiteRedText3"));
        this.firstNameField.setMaxLines(4);
        EditTextBoldCursor editTextBoldCursor2 = this.firstNameField;
        float f = 24.0f;
        int dp = AndroidUtilities.m34dp(LocaleController.isRTL ? 24.0f : 0.0f);
        if (LocaleController.isRTL) {
            f = 0.0f;
        }
        editTextBoldCursor2.setPadding(dp, 0, AndroidUtilities.m34dp(f), AndroidUtilities.m34dp(6.0f));
        this.firstNameField.setGravity(LocaleController.isRTL ? 5 : 3);
        this.firstNameField.setImeOptions(268435456);
        this.firstNameField.setInputType(147457);
        this.firstNameField.setImeOptions(6);
        this.firstNameField.setFilters(new InputFilter[]{new CodepointsLengthInputFilter(70) {
            @Override
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (charSequence == null || charSequence.length() <= 0 || TextUtils.indexOf(charSequence, '\n') != charSequence.length() - 1) {
                    CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
                    if (!(filter == null || charSequence == null || filter.length() == charSequence.length())) {
                        Vibrator vibrator = (Vibrator) ChangeBioActivity.this.getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        AndroidUtilities.shakeView(ChangeBioActivity.this.checkTextView, 2.0f, 0);
                    }
                    return filter;
                }
                ChangeBioActivity.this.doneButton.performClick();
                return "";
            }
        }});
        this.firstNameField.setMinHeight(AndroidUtilities.m34dp(36.0f));
        this.firstNameField.setHint(LocaleController.getString("UserBio", C0952R.string.UserBio));
        this.firstNameField.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.firstNameField.setCursorSize(AndroidUtilities.m34dp(20.0f));
        this.firstNameField.setCursorWidth(1.5f);
        this.firstNameField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean lambda$createView$1;
                lambda$createView$1 = ChangeBioActivity.this.lambda$createView$1(textView, i, keyEvent);
                return lambda$createView$1;
            }
        });
        this.firstNameField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                ChangeBioActivity.this.checkTextView.setNumber(70 - Character.codePointCount(editable, 0, editable.length()), true);
            }
        });
        frameLayout.addView(this.firstNameField, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 0.0f, 4.0f, 0.0f));
        NumberTextView numberTextView = new NumberTextView(context);
        this.checkTextView = numberTextView;
        numberTextView.setCenterAlign(true);
        this.checkTextView.setTextSize(15);
        this.checkTextView.setNumber(70, false);
        this.checkTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText4"));
        this.checkTextView.setImportantForAccessibility(2);
        frameLayout.addView(this.checkTextView, LayoutHelper.createFrame(20, 20.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 4.0f, 4.0f, 0.0f));
        TextView textView = new TextView(context);
        this.helpTextView = textView;
        textView.setFocusable(true);
        this.helpTextView.setTextSize(1, 15.0f);
        this.helpTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText8"));
        this.helpTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        this.helpTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString("UserBioInfo", C0952R.string.UserBioInfo)));
        linearLayout2.addView(this.helpTextView, LayoutHelper.createLinear(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 0));
        TLRPC$UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
        if (!(userFull == null || (str = userFull.about) == null)) {
            this.firstNameField.setText(str);
            EditTextBoldCursor editTextBoldCursor3 = this.firstNameField;
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
        }
        return this.fragmentView;
    }

    public boolean lambda$createView$1(TextView textView, int i, KeyEvent keyEvent) {
        View view;
        if (i != 6 || (view = this.doneButton) == null) {
            return false;
        }
        view.performClick();
        return true;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            this.firstNameField.requestFocus();
            AndroidUtilities.showKeyboard(this.firstNameField);
        }
    }

    public void saveName() {
        final TLRPC$UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
        if (getParentActivity() != null && userFull != null) {
            String str = userFull.about;
            if (str == null) {
                str = "";
            }
            final String replace = this.firstNameField.getText().toString().replace("\n", "");
            if (str.equals(replace)) {
                finishFragment();
                return;
            }
            final AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
            final TLRPC$TL_account_updateProfile tLRPC$TL_account_updateProfile = new TLRPC$TL_account_updateProfile();
            tLRPC$TL_account_updateProfile.about = replace;
            tLRPC$TL_account_updateProfile.flags |= 4;
            final int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_updateProfile, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ChangeBioActivity.this.lambda$saveName$4(alertDialog, userFull, replace, tLRPC$TL_account_updateProfile, tLObject, tLRPC$TL_error);
                }
            }, 2);
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(sendRequest, this.classGuid);
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ChangeBioActivity.this.lambda$saveName$5(sendRequest, dialogInterface);
                }
            });
            alertDialog.show();
        }
    }

    public void lambda$saveName$4(final AlertDialog alertDialog, final TLRPC$UserFull tLRPC$UserFull, final String str, final TLRPC$TL_account_updateProfile tLRPC$TL_account_updateProfile, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            final TLRPC$User tLRPC$User = (TLRPC$User) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChangeBioActivity.this.lambda$saveName$2(alertDialog, tLRPC$UserFull, str, tLRPC$User);
                }
            });
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChangeBioActivity.this.lambda$saveName$3(alertDialog, tLRPC$TL_error, tLRPC$TL_account_updateProfile);
            }
        });
    }

    public void lambda$saveName$2(AlertDialog alertDialog, TLRPC$UserFull tLRPC$UserFull, String str, TLRPC$User tLRPC$User) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        tLRPC$UserFull.about = str;
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.userInfoDidLoad, Long.valueOf(tLRPC$User.f985id), tLRPC$UserFull);
        finishFragment();
    }

    public void lambda$saveName$3(AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_account_updateProfile tLRPC$TL_account_updateProfile) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this, tLRPC$TL_account_updateProfile, new Object[0]);
    }

    public void lambda$saveName$5(int i, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
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
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.firstNameField, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        arrayList.add(new ThemeDescription(this.helpTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText8"));
        arrayList.add(new ThemeDescription(this.checkTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText4"));
        return arrayList;
    }
}
