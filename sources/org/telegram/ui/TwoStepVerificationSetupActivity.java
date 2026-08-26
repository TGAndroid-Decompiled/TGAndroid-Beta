package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda27;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TransformableLoginButtonView;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public class TwoStepVerificationSetupActivity extends BaseFragment {
    public static final int TYPE_CREATE_PASSWORD_STEP_1 = 0;
    public static final int TYPE_CREATE_PASSWORD_STEP_2 = 1;
    public static final int TYPE_EMAIL_CONFIRM = 5;
    public static final int TYPE_EMAIL_RECOVERY = 4;
    public static final int TYPE_ENTER_EMAIL = 3;
    public static final int TYPE_ENTER_HINT = 2;
    public static final int TYPE_INTRO = 6;
    public static final int TYPE_PASSWORD_SET = 7;
    public static final int TYPE_VERIFY = 8;
    public static final int TYPE_VERIFY_OK = 9;
    private static final int item_abort = 1;
    private AnimatorSet actionBarAnimator;
    private View actionBarBackground;
    private RLottieDrawable[] animationDrawables;
    private TextView bottomSkipButton;
    private AnimatorSet buttonAnimation;
    private TextView buttonTextView;
    private boolean closeAfterSet;
    private CodeFieldContainer codeFieldContainer;
    private TL_account.Password currentPassword;
    private byte[] currentPasswordHash;
    private byte[] currentSecret;
    private long currentSecretId;
    private int currentType;
    private TextView descriptionText;
    private TextView descriptionText2;
    private TextView descriptionText3;
    private boolean doneAfterPasswordLoad;
    private EditTextBoldCursor editTextFirstRow;
    private EditTextBoldCursor editTextSecondRow;
    private String email;
    private String emailCode;
    private int emailCodeLength;
    private boolean emailOnly;
    private Runnable errorColorTimeout;
    private Runnable finishCallback;
    private String firstPassword;
    private VerticalPositionAutoAnimator floatingAutoAnimator;
    private FragmentFloatingButton floatingButton;
    private TransformableLoginButtonView floatingButtonIcon;
    private ArrayList<BaseFragment> fragmentsToClose;
    private boolean fromRegistration;
    private String hint;
    private boolean ignoreTextChange;
    private RLottieImageView imageView;
    private boolean isPasswordVisible;
    private CustomPhoneKeyboardView keyboardView;
    private Runnable monkeyAfterSwitchCallback;
    private Runnable monkeyEndCallback;
    private boolean needPasswordButton;
    private Runnable openedSettings;
    private int otherwiseReloginDays;
    private OutlineTextContainerView outlineTextFirstRow;
    private OutlineTextContainerView outlineTextSecondRow;
    private boolean paused;
    private boolean postedErrorColorTimeout;
    private RadialProgressView radialProgressView;
    private ScrollView scrollView;
    private Runnable setAnimationRunnable;
    private ImageView showPasswordButton;
    private TextView titleTextView;
    private boolean waitingForEmail;

    public class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        public void lambda$onItemClick$0(AlertDialog alertDialog, int i) {
            TwoStepVerificationSetupActivity.this.setNewPassword(true);
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (TwoStepVerificationSetupActivity.this.otherwiseReloginDays < 0 || ((ActionBarLayout) ((BaseFragment) TwoStepVerificationSetupActivity.this).parentLayout).getFragmentStack().size() != 1) {
                    TwoStepVerificationSetupActivity.this.finishFragment();
                    return;
                } else {
                    TwoStepVerificationSetupActivity.this.showSetForcePasswordAlert();
                    return;
                }
            }
            if (i == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TwoStepVerificationSetupActivity.this.getParentActivity(), 0, null);
                String string = (TwoStepVerificationSetupActivity.this.currentPassword == null || !TwoStepVerificationSetupActivity.this.currentPassword.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
                String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
                String string3 = LocaleController.getString(R.string.Abort);
                builder.setMessage(string);
                builder.setTitle(string2);
                builder.setPositiveButton(string3, new PhotoViewer$55$$ExternalSyntheticLambda2(this, 25));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                TwoStepVerificationSetupActivity.this.showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
        }
    }

    public TwoStepVerificationSetupActivity(int i, int i2, TL_account.Password password) {
        super(null);
        this.needPasswordButton = false;
        this.otherwiseReloginDays = -1;
        this.fragmentsToClose = new ArrayList<>();
        this.emailCodeLength = 6;
        this.currentPasswordHash = new byte[0];
        this.errorColorTimeout = new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 0);
        this.finishCallback = new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 1);
        this.currentAccount = i;
        this.currentType = i2;
        this.currentPassword = password;
        this.waitingForEmail = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.currentPassword == null) {
            int i3 = this.currentType;
            if (i3 == 6 || i3 == 8) {
                loadPasswordInfo();
            }
        }
    }

    private void animateSuccess(Runnable runnable) {
        int i = 0;
        while (true) {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
            if (i >= codeNumberFieldArr.length) {
                codeFieldContainer.postDelayed(new ThemeActivity$$ExternalSyntheticLambda9(10, this, runnable), (((long) codeNumberFieldArr.length) * 75) + 350);
                return;
            } else {
                CodeNumberField codeNumberField = codeNumberFieldArr[i];
                codeNumberField.postDelayed(new PasscodeActivity$$ExternalSyntheticLambda9(codeNumberField, 1), ((long) i) * 75);
                i++;
            }
        }
    }

    public boolean isCustomKeyboardVisible() {
        int i = this.currentType;
        if ((i != 5 && i != 4) || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    private boolean isIntro() {
        int i = this.currentType;
        return i == 6 || i == 9 || i == 7;
    }

    public boolean isLandscape() {
        Point point = AndroidUtilities.displaySize;
        return point.x > point.y;
    }

    private boolean isValidEmail(String str) {
        if (str != null && str.length() >= 3) {
            int iLastIndexOf = str.lastIndexOf(46);
            int iLastIndexOf2 = str.lastIndexOf(64);
            if (iLastIndexOf2 >= 0 && iLastIndexOf >= iLastIndexOf2) {
                return true;
            }
        }
        return false;
    }

    public void lambda$animateSuccess$22(Runnable runnable) {
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            codeNumberField.animateSuccessProgress(0.0f);
        }
        runnable.run();
    }

    public static boolean lambda$createView$10(View view, MotionEvent motionEvent) {
        return true;
    }

    public boolean lambda$createView$11(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5 && i != 6) {
            return false;
        }
        if (this.outlineTextSecondRow.getVisibility() == 0) {
            this.editTextSecondRow.requestFocus();
            return true;
        }
        processNext();
        return true;
    }

    public void lambda$createView$12(View view, boolean z) {
        this.outlineTextFirstRow.animateSelection(z ? 1.0f : 0.0f);
    }

    public void lambda$createView$13(View view) {
        this.ignoreTextChange = true;
        if (this.editTextFirstRow.getTransformationMethod() == null) {
            this.isPasswordVisible = false;
            this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
            if (this.currentType == 0 && this.editTextFirstRow.length() > 0 && this.editTextFirstRow.hasFocus() && this.monkeyEndCallback == null) {
                this.animationDrawables[3].setCustomEndFrame(-1);
                RLottieDrawable animatedDrawable = this.imageView.getAnimatedDrawable();
                RLottieDrawable rLottieDrawable = this.animationDrawables[3];
                if (animatedDrawable != rLottieDrawable) {
                    this.imageView.setAnimation(rLottieDrawable);
                    this.animationDrawables[3].setCurrentFrame(18, false);
                }
                this.imageView.playAnimation();
            }
        } else {
            this.isPasswordVisible = true;
            this.editTextFirstRow.setTransformationMethod(null);
            this.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelSend, false), PorterDuff.Mode.MULTIPLY));
            if (this.currentType == 0 && this.editTextFirstRow.length() > 0 && this.editTextFirstRow.hasFocus() && this.monkeyEndCallback == null) {
                this.animationDrawables[3].setCustomEndFrame(18);
                RLottieDrawable animatedDrawable2 = this.imageView.getAnimatedDrawable();
                RLottieDrawable rLottieDrawable2 = this.animationDrawables[3];
                if (animatedDrawable2 != rLottieDrawable2) {
                    this.imageView.setAnimation(rLottieDrawable2);
                }
                this.animationDrawables[3].setProgress(0.0f, false);
                this.imageView.playAnimation();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.editTextFirstRow;
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        this.ignoreTextChange = false;
    }

    public boolean lambda$createView$14(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5 && i != 6) {
            return false;
        }
        processNext();
        return true;
    }

    public void lambda$createView$15(View view, boolean z) {
        this.outlineTextSecondRow.animateSelection(z ? 1.0f : 0.0f);
    }

    public void lambda$createView$16(View view, boolean z) {
        if (z) {
            this.keyboardView.setEditText((EditText) view);
            this.keyboardView.setDispatchBackWhenEmpty(true);
        }
    }

    public void lambda$createView$17(AlertDialog alertDialog, int i) {
        onReset();
        finishFragment();
    }

    public void lambda$createView$18(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, 2));
        builder.setTitle(LocaleController.getString(R.string.ResetPassword));
        builder.setMessage(LocaleController.getString(R.string.RestoreEmailTroubleText2));
        showDialog(builder.create());
    }

    public static void lambda$createView$19(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$createView$2(View view) {
        processNext();
    }

    public void lambda$createView$20(View view) {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new PassportActivity$$ExternalSyntheticLambda3(28));
        showDialog(new AlertDialog.Builder(getParentActivity(), 0, null).setMessage(LocaleController.getString(R.string.ResendCodeInfo)).setTitle(LocaleController.getString(R.string.TwoStepVerificationTitle)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
    }

    public void lambda$createView$3(AlertDialog alertDialog, int i) {
        int size = this.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.fragmentsToClose.get(i2).removeSelfFromStack();
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        finishFragment();
    }

    public void lambda$createView$4(TLRPC.TL_error tL_error) {
        needHideProgress();
        int i = 0;
        if (tL_error != null) {
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                showAlertWithText(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                return;
            } else {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                showAlertWithText(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                return;
            }
        }
        getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, i));
        builder.setMessage(LocaleController.getString(R.string.PasswordReset));
        builder.setTitle(LocaleController.getString(R.string.TwoStepVerificationTitle));
        Dialog dialogShowDialog = showDialog(builder.create());
        if (dialogShowDialog != null) {
            dialogShowDialog.setCanceledOnTouchOutside(false);
            dialogShowDialog.setCancelable(false);
        }
    }

    public void lambda$createView$5(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda0(this, tL_error, 2));
    }

    public void lambda$createView$6(AlertDialog alertDialog, int i) {
        this.email = "";
        setNewPassword(false);
    }

    public void lambda$createView$7(View view) {
        if (this.bottomSkipButton.getAlpha() < 0.5f) {
            return;
        }
        int i = this.currentType;
        if (i == 0) {
            needShowProgress();
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.emailCode;
            getConnectionsManager().sendRequest(tL_auth_recoverPassword, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(this, 3));
            return;
        }
        if (i != 3) {
            if (i == 2) {
                onHintDone();
                return;
            }
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setMessage(LocaleController.getString(R.string.YourEmailSkipWarningText));
        builder.setTitle(LocaleController.getString(R.string.YourEmailSkipWarning));
        builder.setPositiveButton(LocaleController.getString(R.string.YourEmailSkip), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, 3));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public void lambda$createView$8(View view) {
        if (this.currentType == 8) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            twoStepVerificationActivity.setForgotPasswordOnShow();
            twoStepVerificationActivity.setPassword(this.currentPassword);
            twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
            presentFragment(twoStepVerificationActivity, true);
            Runnable runnable = this.openedSettings;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                this.openedSettings = null;
            }
        }
    }

    public void lambda$createView$9(View view) {
        processNext();
    }

    public void lambda$loadPasswordInfo$41(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            this.waitingForEmail = !TextUtils.isEmpty(this.currentPassword.email_unconfirmed_pattern);
            TwoStepVerificationActivity.initPasswordNewAlgo(this.currentPassword);
            if (!this.paused && this.closeAfterSet) {
                TL_account.Password password2 = this.currentPassword;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!this.waitingForEmail && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        finishFragment();
                    }
                }
            }
            if (this.doneAfterPasswordLoad) {
                needHideProgress();
                processNext();
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        }
    }

    public void lambda$loadPasswordInfo$42(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda20(this, tL_error, tLObject, 0));
    }

    public void lambda$new$0() {
        int i = 0;
        this.postedErrorColorTimeout = false;
        while (true) {
            CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
            if (i >= codeNumberFieldArr.length) {
                return;
            }
            codeNumberFieldArr[i].animateErrorProgress(0.0f);
            i++;
        }
    }

    public void lambda$new$1() {
        EditTextBoldCursor editTextBoldCursor = this.editTextFirstRow;
        if (editTextBoldCursor == null) {
            return;
        }
        if (editTextBoldCursor.length() == 0) {
            setRandomMonkeyIdleAnimation(true);
            return;
        }
        this.animationDrawables[2].setCustomEndFrame(49);
        this.animationDrawables[2].setProgress(0.0f, false);
        this.imageView.playAnimation();
    }

    public void lambda$onCodeFieldError$36() {
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            codeNumberField.animateErrorProgress(0.0f);
        }
    }

    public void lambda$onCodeFieldError$37() {
        AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 6), 150L);
    }

    public void lambda$onTransitionAnimationEnd$39() {
        EditTextBoldCursor editTextBoldCursor = this.editTextFirstRow;
        if (editTextBoldCursor == null || editTextBoldCursor.getVisibility() != 0) {
            return;
        }
        this.editTextFirstRow.requestFocus();
        AndroidUtilities.showKeyboard(this.editTextFirstRow);
    }

    public void lambda$onTransitionAnimationEnd$40() {
        CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
        if (codeFieldContainer == null || codeFieldContainer.getVisibility() != 0) {
            return;
        }
        this.codeFieldContainer.codeField[0].requestFocus();
    }

    public void lambda$processNext$23(byte[] bArr) {
        needHideProgress();
        this.currentPasswordHash = bArr;
        getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(9, this.currentPassword);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationSetupActivity, true);
    }

    public void lambda$processNext$24(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
            processNext();
        }
    }

    public void lambda$processNext$25(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda20(this, tL_error, tLObject, 1));
    }

    public void lambda$processNext$26(TLRPC.TL_error tL_error) {
        int i = 0;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(this, i), 8);
            return;
        }
        needHideProgress();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            this.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            this.descriptionText.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, true);
            showDoneButton(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
        }
    }

    public void lambda$processNext$27(byte[] bArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda15(this, bArr, 0));
        } else {
            AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda0(this, tL_error, 1));
        }
    }

    public void lambda$processNext$28(byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.current_algo;
        byte[] x = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        LinkManager$$ExternalSyntheticLambda15 linkManager$$ExternalSyntheticLambda15 = new LinkManager$$ExternalSyntheticLambda15(22, this, x);
        TL_account.Password password = this.currentPassword;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            linkManager$$ExternalSyntheticLambda15.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, linkManager$$ExternalSyntheticLambda15, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        linkManager$$ExternalSyntheticLambda15.run(null, tL_error2);
    }

    public void lambda$processNext$29(String str) {
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 0, this.currentPassword);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        twoStepVerificationSetupActivity.fragmentsToClose.addAll(this.fragmentsToClose);
        twoStepVerificationSetupActivity.addFragmentToClose(this);
        twoStepVerificationSetupActivity.setCurrentEmailCode(str);
        twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationSetupActivity, true);
    }

    public void lambda$processNext$30(TLObject tLObject, String str, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            animateSuccess(new ThemeActivity$$ExternalSyntheticLambda9(9, this, str));
            return;
        }
        if (tL_error == null || tL_error.text.startsWith("CODE_INVALID")) {
            onCodeFieldError(true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            showAlertWithText(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
        } else {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            showAlertWithText(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
        }
    }

    public void lambda$processNext$31(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(29, this, tLObject, str, tL_error));
    }

    public void lambda$processNext$32(AlertDialog alertDialog, int i) {
        int size = this.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.fragmentsToClose.get(i2).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i3 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = this.currentPasswordHash;
        TL_account.Password password = this.currentPassword;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i3, bArr, password.new_algo, password.new_secure_algo, password.secure_random, this.email, this.hint, null, this.firstPassword);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = this.currentPassword;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.setCurrentPasswordParams(password2, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
        twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        Runnable runnable = this.openedSettings;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.openedSettings = null;
        }
    }

    public void lambda$processNext$33() {
        int i = 4;
        if (this.currentPassword.has_password) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, i));
            if (this.currentPassword.has_recovery) {
                builder.setMessage(LocaleController.getString(R.string.YourEmailSuccessChangedText));
            } else {
                builder.setMessage(LocaleController.getString(R.string.YourEmailSuccessText));
            }
            builder.setTitle(LocaleController.getString(R.string.YourPasswordSuccess));
            Dialog dialogShowDialog = showDialog(builder.create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = this.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.fragmentsToClose.get(i2).removeSelfFromStack();
        }
        TL_account.Password password = this.currentPassword;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(7, password);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        twoStepVerificationSetupActivity.setCurrentPasswordParams(this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
        twoStepVerificationSetupActivity.fragmentsToClose.addAll(this.fragmentsToClose);
        twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
        twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationSetupActivity, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i3 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = this.currentPasswordHash;
        TL_account.Password password2 = this.currentPassword;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i3, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, this.email, this.hint, null, this.firstPassword);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
    }

    public void lambda$processNext$34(TLRPC.TL_error tL_error) {
        needHideProgress();
        if (tL_error == null) {
            if (getParentActivity() == null) {
                return;
            }
            animateSuccess(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 5));
        } else if (tL_error.text.startsWith("CODE_INVALID")) {
            onCodeFieldError(true);
        } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
        }
    }

    public void lambda$processNext$35(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda0(this, tL_error, 3));
    }

    public void lambda$setNewPassword$43(TLRPC.TL_error tL_error) {
        needHideProgress();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = this.currentPassword;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.setCurrentPasswordParams(password, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
            twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
            presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            Runnable runnable = this.openedSettings;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                this.openedSettings = null;
            }
        }
    }

    public void lambda$setNewPassword$44(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda0(this, tL_error, 0));
    }

    public void lambda$setNewPassword$45(TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            setNewPassword(z);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        }
    }

    public void lambda$setNewPassword$46(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, z, 14));
    }

    public void lambda$setNewPassword$47(byte[] bArr, AlertDialog alertDialog, int i) {
        int size = this.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.fragmentsToClose.get(i2).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = this.currentPassword;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = this.currentPassword;
        if (bArr == null) {
            bArr = this.currentPasswordHash;
        }
        twoStepVerificationActivity.setCurrentPasswordParams(password2, bArr, this.currentSecretId, this.currentSecret);
        twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        Runnable runnable = this.openedSettings;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.openedSettings = null;
        }
    }

    public void lambda$setNewPassword$48(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        int i = 8;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new CallLogActivity$$ExternalSyntheticLambda31(this, z, i), 8);
            return;
        }
        needHideProgress();
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                        return;
                    }
                }
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                int size = this.fragmentsToClose.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.fragmentsToClose.get(i2).removeSelfFromStack();
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i3 = NotificationCenter.twoStepPasswordChanged;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = this.currentPassword;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = this.email;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i3, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, this.hint, str2, this.firstPassword);
                TL_account.Password password3 = this.currentPassword;
                password3.email_unconfirmed_pattern = this.email;
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(5, password3);
                twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
                twoStepVerificationSetupActivity.setCurrentPasswordParams(bArr != null ? bArr : this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
                twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
                twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
                presentFragment(twoStepVerificationSetupActivity, true);
                return;
            }
            return;
        }
        getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z) {
            int size2 = this.fragmentsToClose.size();
            for (int i4 = 0; i4 < size2; i4++) {
                this.fragmentsToClose.get(i4).removeSelfFromStack();
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            finishFragment();
            return;
        }
        if (getParentActivity() == null) {
            return;
        }
        if (this.currentPassword.has_password) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new TodoItemMenu$$ExternalSyntheticLambda7(18, this, bArr));
            if (str == null && (password = this.currentPassword) != null && password.has_password) {
                builder.setMessage(LocaleController.getString(R.string.YourEmailSuccessText));
            } else {
                builder.setMessage(LocaleController.getString(R.string.YourPasswordChangedSuccessText));
            }
            builder.setTitle(LocaleController.getString(R.string.YourPasswordSuccess));
            Dialog dialogShowDialog = showDialog(builder.create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = this.fragmentsToClose.size();
        for (int i5 = 0; i5 < size3; i5++) {
            this.fragmentsToClose.get(i5).removeSelfFromStack();
        }
        TL_account.Password password4 = this.currentPassword;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (this.closeAfterSet) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        }
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(7, this.currentPassword);
        twoStepVerificationSetupActivity2.fromRegistration = this.fromRegistration;
        twoStepVerificationSetupActivity2.setCurrentPasswordParams(bArr != null ? bArr : this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
        twoStepVerificationSetupActivity2.closeAfterSet = this.closeAfterSet;
        twoStepVerificationSetupActivity2.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationSetupActivity2, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
    }

    public void lambda$setNewPassword$49(boolean z, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new SendMessagesHelper$$ExternalSyntheticLambda27(str, tLObject, tL_error, passwordinputsettings, this, z, bArr));
    }

    public void lambda$setNewPassword$50(TLObject tLObject, boolean z, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] x;
        byte[] bArr;
        byte[] bArr2;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                updatepasswordsettings.password = getNewSrpPassword();
            }
        }
        if (z || str == null) {
            x = null;
            bArr = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = stringBytes;
                x = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
            } else {
                bArr = stringBytes;
                x = null;
            }
        }
        CallLogActivity$$ExternalSyntheticLambda9 callLogActivity$$ExternalSyntheticLambda9 = new CallLogActivity$$ExternalSyntheticLambda9(this, z, x, str, passwordinputsettings);
        if (z) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, callLogActivity$$ExternalSyntheticLambda9, 10);
            return;
        }
        if (str != null && (bArr2 = this.currentSecret) != null && bArr2.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = this.currentPassword.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] bArrComputePBKDF2 = Utilities.computePBKDF2(bArr, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr3 = new byte[32];
                System.arraycopy(bArrComputePBKDF2, 0, bArr3, 0, 32);
                byte[] bArr4 = new byte[16];
                System.arraycopy(bArrComputePBKDF2, 32, bArr4, 0, 16);
                byte[] bArr5 = new byte[32];
                System.arraycopy(this.currentSecret, 0, bArr5, 0, 32);
                Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr5;
                tL_secureSecretSettings.secure_secret_id = this.currentSecretId;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = this.currentPassword.new_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            callLogActivity$$ExternalSyntheticLambda9.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] vBytes = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            passwordinputsettings.new_password_hash = vBytes;
            if (vBytes == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                callLogActivity$$ExternalSyntheticLambda9.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, callLogActivity$$ExternalSyntheticLambda9, 10);
    }

    public void lambda$setRandomMonkeyIdleAnimation$38() {
        if (this.setAnimationRunnable == null) {
            return;
        }
        setRandomMonkeyIdleAnimation(false);
    }

    public void lambda$showSetForcePasswordAlert$51(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    private void loadPasswordInfo() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(this, 2), 10);
    }

    private void needShowProgress() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.floatingButton.setProgressVisible(true, true);
    }

    private void onCodeFieldError(boolean z) {
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            if (z) {
                codeNumberField.setText("");
            }
            codeNumberField.animateErrorProgress(1.0f);
        }
        if (z) {
            this.codeFieldContainer.codeField[0].requestFocus();
        }
        AndroidUtilities.shakeViewSpring(this.codeFieldContainer, 8.0f, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 2));
    }

    private void onFieldError(View view, TextView textView, boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            textView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            textView.setText("");
        }
        AndroidUtilities.shakeViewSpring(view, 5.0f);
    }

    private void onHintDone() {
        TL_account.Password password = this.currentPassword;
        if (password.has_recovery) {
            this.email = "";
            setNewPassword(false);
            return;
        }
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 3, password);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        twoStepVerificationSetupActivity.setCurrentPasswordParams(this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
        twoStepVerificationSetupActivity.firstPassword = this.firstPassword;
        twoStepVerificationSetupActivity.hint = this.hint;
        twoStepVerificationSetupActivity.fragmentsToClose.addAll(this.fragmentsToClose);
        twoStepVerificationSetupActivity.fragmentsToClose.add(this);
        twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
        twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationSetupActivity);
    }

    public void processNext() {
        if (getParentActivity() == null) {
            return;
        }
        switch (this.currentType) {
            case 0:
            case 1:
                if (this.editTextFirstRow.length() == 0) {
                    onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                } else if (this.editTextFirstRow.getText().toString().equals(this.firstPassword) || this.currentType != 1) {
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, this.currentType != 0 ? 2 : 1, this.currentPassword);
                    twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
                    twoStepVerificationSetupActivity.firstPassword = this.editTextFirstRow.getText().toString();
                    twoStepVerificationSetupActivity.setCurrentPasswordParams(this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
                    twoStepVerificationSetupActivity.setCurrentEmailCode(this.emailCode);
                    twoStepVerificationSetupActivity.fragmentsToClose.addAll(this.fragmentsToClose);
                    twoStepVerificationSetupActivity.fragmentsToClose.add(this);
                    twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
                    twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
                    presentFragment(twoStepVerificationSetupActivity);
                } else {
                    AndroidUtilities.shakeViewSpring(this.outlineTextFirstRow, 5.0f);
                    try {
                        this.outlineTextFirstRow.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            case 2:
                String string = this.editTextFirstRow.getText().toString();
                this.hint = string;
                if (!string.equalsIgnoreCase(this.firstPassword)) {
                    onHintDone();
                } else {
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                }
                break;
            case 3:
                if (!this.emailOnly && this.bottomSkipButton.getAlpha() < 1.0f) {
                    this.bottomSkipButton.animate().cancel();
                    this.bottomSkipButton.animate().alpha(1.0f).start();
                }
                String string2 = this.editTextFirstRow.getText().toString();
                this.email = string2;
                if (!isValidEmail(string2)) {
                    onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                } else {
                    setNewPassword(false);
                }
                break;
            case 4:
                String code = this.codeFieldContainer.getCode();
                TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                tL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new LinkManager$$ExternalSyntheticLambda15(23, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.codeFieldContainer.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(this, 4), 10);
                needShowProgress();
                break;
            case 6:
                TL_account.Password password = this.currentPassword;
                if (password != null) {
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(this.currentAccount, 0, password);
                    twoStepVerificationSetupActivity2.fromRegistration = this.fromRegistration;
                    twoStepVerificationSetupActivity2.closeAfterSet = this.closeAfterSet;
                    twoStepVerificationSetupActivity2.setBlockingAlert(this.otherwiseReloginDays);
                    presentFragment(twoStepVerificationSetupActivity2, true);
                } else {
                    needShowProgress();
                    this.doneAfterPasswordLoad = true;
                }
                break;
            case 7:
                if (this.closeAfterSet) {
                    finishFragment();
                } else if (!this.fromRegistration) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    twoStepVerificationActivity.setCurrentPasswordParams(this.currentPassword, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
                    twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
                    presentFragment(twoStepVerificationActivity, true);
                    Runnable runnable = this.openedSettings;
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable);
                        this.openedSettings = null;
                    }
                } else {
                    Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("afterSignup", true);
                    MainTabsActivity mainTabsActivity = new MainTabsActivity();
                    mainTabsActivity.prepareDialogsActivity(bundleM);
                    presentFragment(mainTabsActivity, true);
                }
                break;
            case 8:
                if (this.currentPassword != null) {
                    String string3 = this.editTextFirstRow.getText().toString();
                    if (string3.length() != 0) {
                        byte[] stringBytes = AndroidUtilities.getStringBytes(string3);
                        needShowProgress();
                        Utilities.globalQueue.postRunnable(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda15(this, stringBytes, 1));
                    } else {
                        onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                    }
                } else {
                    needShowProgress();
                    this.doneAfterPasswordLoad = true;
                }
                break;
            case 9:
                finishFragment();
                break;
        }
    }

    public void setNewPassword(boolean z) {
        TL_account.Password password;
        TLObject tLObject;
        if (z && this.waitingForEmail && this.currentPassword.has_password) {
            needShowProgress();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(this, 1));
            return;
        }
        String str = this.firstPassword;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
            this.currentSecret = null;
            if (this.waitingForEmail) {
                passwordinputsettings.flags = 2;
                passwordinputsettings.email = "";
            } else {
                passwordinputsettings.flags = 3;
                passwordinputsettings.hint = "";
                passwordinputsettings.new_password_hash = new byte[0];
                passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
                passwordinputsettings.email = "";
            }
        } else {
            if (this.hint == null && (password = this.currentPassword) != null) {
                this.hint = password.hint;
            }
            if (this.hint == null) {
                this.hint = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.hint;
                passwordinputsettings.new_algo = this.currentPassword.new_algo;
            }
            if (this.email.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.email.trim();
            }
        }
        if (this.emailCode != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.emailCode;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            tLObject = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
            byte[] bArr = this.currentPasswordHash;
            if (bArr == null || bArr.length == 0 || (z && this.waitingForEmail)) {
                updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings.new_settings = passwordinputsettings;
            tLObject = updatepasswordsettings;
        }
        TLObject tLObject2 = tLObject;
        needShowProgress();
        Utilities.globalQueue.postRunnable(new LinkManager$1$$ExternalSyntheticLambda0(this, tLObject2, z, str, passwordinputsettings, 7));
    }

    private void setRandomMonkeyIdleAnimation(boolean z) {
        if (this.currentType != 0) {
            return;
        }
        Runnable runnable = this.setAnimationRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        RLottieDrawable animatedDrawable = this.imageView.getAnimatedDrawable();
        if (z) {
            if (Utilities.random.nextInt() % 2 == 0) {
                this.imageView.setAnimation(this.animationDrawables[0]);
                this.animationDrawables[0].setProgress(0.0f);
            } else {
                this.imageView.setAnimation(this.animationDrawables[1]);
                this.animationDrawables[1].setProgress(0.0f);
            }
            if (!z) {
                this.imageView.playAnimation();
            }
        } else {
            RLottieDrawable[] rLottieDrawableArr = this.animationDrawables;
            if (animatedDrawable == rLottieDrawableArr[0] || animatedDrawable == rLottieDrawableArr[1] || (this.editTextFirstRow.length() == 0 && (animatedDrawable == null || !animatedDrawable.isRunning()))) {
                if (Utilities.random.nextInt() % 2 == 0) {
                    this.imageView.setAnimation(this.animationDrawables[0]);
                    this.animationDrawables[0].setProgress(0.0f);
                } else {
                    this.imageView.setAnimation(this.animationDrawables[1]);
                    this.animationDrawables[1].setProgress(0.0f);
                }
                if (!z) {
                    this.imageView.playAnimation();
                }
            }
        }
        TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18 twoStepVerificationSetupActivity$$ExternalSyntheticLambda18 = new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 7);
        this.setAnimationRunnable = twoStepVerificationSetupActivity$$ExternalSyntheticLambda18;
        AndroidUtilities.runOnUIThread(twoStepVerificationSetupActivity$$ExternalSyntheticLambda18, Utilities.random.nextInt(2000) + 5000);
    }

    private void showAlertWithText(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setTitle(str);
        builder.setMessage(str2);
        showDialog(builder.create());
    }

    public void showDoneButton(final boolean z) {
        if (z == (this.buttonTextView.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.buttonAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.buttonTextView.setTag(z ? 1 : null);
        this.buttonAnimation = new AnimatorSet();
        if (z) {
            this.buttonTextView.setVisibility(0);
            AnimatorSet animatorSet2 = this.buttonAnimation;
            TextView textView = this.descriptionText2;
            Property property = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.9f);
            TextView textView2 = this.descriptionText2;
            Property property2 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.9f);
            TextView textView3 = this.descriptionText2;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.buttonTextView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.buttonTextView, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.buttonTextView, (Property<TextView, Float>) property3, 1.0f));
        } else {
            this.descriptionText2.setVisibility(0);
            AnimatorSet animatorSet3 = this.buttonAnimation;
            TextView textView4 = this.buttonTextView;
            Property property4 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, 0.9f);
            TextView textView5 = this.buttonTextView;
            Property property5 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, 0.9f);
            TextView textView6 = this.buttonTextView;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.descriptionText2, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.descriptionText2, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.descriptionText2, (Property<TextView, Float>) property6, 1.0f));
        }
        this.buttonAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                if (TwoStepVerificationSetupActivity.this.buttonAnimation == null || !TwoStepVerificationSetupActivity.this.buttonAnimation.equals(animator)) {
                    return;
                }
                TwoStepVerificationSetupActivity.this.buttonAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (TwoStepVerificationSetupActivity.this.buttonAnimation == null || !TwoStepVerificationSetupActivity.this.buttonAnimation.equals(animator)) {
                    return;
                }
                if (z) {
                    TwoStepVerificationSetupActivity.this.descriptionText2.setVisibility(4);
                } else {
                    TwoStepVerificationSetupActivity.this.buttonTextView.setVisibility(4);
                }
            }
        });
        this.buttonAnimation.setDuration(150L);
        this.buttonAnimation.start();
    }

    public void showSetForcePasswordAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.Warning));
        builder.setMessage(LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.otherwiseReloginDays, new Object[0]));
        builder.setPositiveButton(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        builder.setNegativeButton(LocaleController.getString(R.string.ForceSetPasswordCancel), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, 1));
        ((TextView) builder.show().getButton(-2)).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
    }

    private void switchMonkeyAnimation(boolean z) {
        if (!z) {
            this.editTextFirstRow.dispatchTextWatchersTextChanged();
            setRandomMonkeyIdleAnimation(true);
            return;
        }
        Runnable runnable = this.setAnimationRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.imageView.setAnimation(this.animationDrawables[6]);
        this.imageView.playAnimation();
    }

    public void addFragmentToClose(BaseFragment baseFragment) {
        this.fragmentsToClose.add(baseFragment);
    }

    @Override
    public View createView(Context context) {
        final int i = 4;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(Theme.getColor(null, i2, false));
        this.actionBar.setItemsColor(Theme.getColor(null, i2, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarWhiteSelector, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        final int i3 = 5;
        final int i4 = 1;
        if (this.currentType == 5) {
            this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_other).addSubItem(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        this.floatingAutoAnimator = VerticalPositionAutoAnimator.attach(fragmentFloatingButton);
        FragmentFloatingButton fragmentFloatingButton2 = this.floatingButton;
        final Object[] objArr4 = objArr3 == true ? 1 : 0;
        fragmentFloatingButton2.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationSetupActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (objArr4) {
                    case 0:
                        this.f$0.lambda$createView$2(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$13(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$18(view);
                        break;
                    case 3:
                        this.f$0.lambda$createView$20(view);
                        break;
                    case 4:
                        this.f$0.lambda$createView$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$createView$8(view);
                        break;
                    default:
                        this.f$0.lambda$createView$9(view);
                        break;
                }
            }
        });
        TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(context);
        this.floatingButtonIcon = transformableLoginButtonView;
        transformableLoginButtonView.setTransformType(1);
        this.floatingButtonIcon.setProgress(0.0f);
        this.floatingButtonIcon.setColor(Theme.getColor(null, Theme.key_chats_actionIcon, false));
        this.floatingButtonIcon.setDrawBackground(false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        this.floatingButton.addView(this.floatingButtonIcon, LayoutHelper.createFrame(56, 56, 17));
        this.floatingButton.addAdditionalView(this.floatingButtonIcon);
        TextView textView = new TextView(context);
        this.bottomSkipButton = textView;
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText2, false));
        this.bottomSkipButton.setTextSize(1, 14.0f);
        this.bottomSkipButton.setGravity(19);
        this.bottomSkipButton.setVisibility(8);
        VerticalPositionAutoAnimator.attach(this.bottomSkipButton);
        this.bottomSkipButton.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.bottomSkipButton.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationSetupActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$createView$2(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$13(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$18(view);
                        break;
                    case 3:
                        this.f$0.lambda$createView$20(view);
                        break;
                    case 4:
                        this.f$0.lambda$createView$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$createView$8(view);
                        break;
                    default:
                        this.f$0.lambda$createView$9(view);
                        break;
                }
            }
        });
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        rLottieImageView.setScaleType(scaleType);
        if (this.currentType == 2 && AndroidUtilities.isSmallScreen()) {
            this.imageView.setVisibility(8);
        } else if (!isIntro()) {
            this.imageView.setVisibility(isLandscape() ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.titleTextView = textView2;
        textView2.setTextColor(Theme.getColor(null, i2, false));
        this.titleTextView.setGravity(1);
        this.titleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.titleTextView.setTextSize(1, 24.0f);
        SpoilersTextView spoilersTextView = new SpoilersTextView(context, true, null);
        this.descriptionText = spoilersTextView;
        int i5 = Theme.key_windowBackgroundWhiteGrayText6;
        spoilersTextView.setTextColor(Theme.getColor(null, i5, false));
        this.descriptionText.setGravity(1);
        this.descriptionText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText.setTextSize(1, 15.0f);
        this.descriptionText.setVisibility(8);
        this.descriptionText.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.descriptionText2 = textView3;
        textView3.setTextColor(Theme.getColor(null, i5, false));
        this.descriptionText2.setGravity(1);
        this.descriptionText2.setTextSize(1, 14.0f);
        this.descriptionText2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.descriptionText2.setVisibility(8);
        this.descriptionText2.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationSetupActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$createView$2(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$13(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$18(view);
                        break;
                    case 3:
                        this.f$0.lambda$createView$20(view);
                        break;
                    case 4:
                        this.f$0.lambda$createView$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$createView$8(view);
                        break;
                    default:
                        this.f$0.lambda$createView$9(view);
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.buttonTextView = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.buttonTextView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        this.buttonTextView.setTextSize(1, 15.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        this.buttonTextView.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{6.0f}, Theme.key_featuredStickers_addButton));
        final int i6 = 6;
        this.buttonTextView.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationSetupActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        this.f$0.lambda$createView$2(view);
                        break;
                    case 1:
                        this.f$0.lambda$createView$13(view);
                        break;
                    case 2:
                        this.f$0.lambda$createView$18(view);
                        break;
                    case 3:
                        this.f$0.lambda$createView$20(view);
                        break;
                    case 4:
                        this.f$0.lambda$createView$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$createView$8(view);
                        break;
                    default:
                        this.f$0.lambda$createView$9(view);
                        break;
                }
            }
        });
        int i7 = this.currentType;
        if (i7 == 6 || i7 == 7 || i7 == 9) {
            this.titleTextView.setTypeface(Typeface.DEFAULT);
            this.titleTextView.setTextSize(1, 24.0f);
        } else {
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setTextSize(1, 18.0f);
        }
        switch (this.currentType) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                final FrameLayout frameLayout = new FrameLayout(context) {
                    @Override
                    public void onMeasure(int i8, int i9) {
                        super.onMeasure(i8, i9);
                        ((ViewGroup.MarginLayoutParams) TwoStepVerificationSetupActivity.this.radialProgressView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                    }
                };
                final SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
                    @Override
                    public void onLayout(boolean z, int i8, int i9, int i10, int i11) {
                        int measuredHeight;
                        if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() == 8 || measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                            if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() != 8) {
                                FrameLayout frameLayout2 = frameLayout;
                                int measuredWidth = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                                frameLayout2.layout(0, 0, measuredWidth, measuredHeight);
                            } else {
                                FrameLayout frameLayout3 = frameLayout;
                                int measuredWidth2 = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight();
                                frameLayout3.layout(0, 0, measuredWidth2, measuredHeight);
                            }
                        } else if (TwoStepVerificationSetupActivity.this.isCustomKeyboardVisible()) {
                            FrameLayout frameLayout4 = frameLayout;
                            int measuredWidth3 = getMeasuredWidth();
                            measuredHeight = measureKeyboardHeight() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                            frameLayout4.layout(0, 0, measuredWidth3, measuredHeight);
                        } else {
                            FrameLayout frameLayout5 = frameLayout;
                            int measuredWidth4 = getMeasuredWidth();
                            measuredHeight = getMeasuredHeight();
                            frameLayout5.layout(0, 0, measuredWidth4, measuredHeight);
                        }
                        TwoStepVerificationSetupActivity.this.keyboardView.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                    }

                    @Override
                    public void onMeasure(int i8, int i9) {
                        int size = View.MeasureSpec.getSize(i8);
                        int size2 = View.MeasureSpec.getSize(i9);
                        setMeasuredDimension(size, size2);
                        if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() != 8 && measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                            size2 -= AndroidUtilities.dp(230.0f);
                        }
                        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        TwoStepVerificationSetupActivity.this.keyboardView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                    }
                };
                sizeNotifierFrameLayout.addView(frameLayout);
                ViewGroup viewGroup = new ViewGroup(context) {
                    @Override
                    public void onLayout(boolean z, int i8, int i9, int i10, int i11) {
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.layout(0, 0, ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredWidth(), ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight());
                        TwoStepVerificationSetupActivity.this.actionBarBackground.layout(0, 0, TwoStepVerificationSetupActivity.this.actionBarBackground.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.actionBarBackground.getMeasuredHeight());
                        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = sizeNotifierFrameLayout;
                        sizeNotifierFrameLayout2.layout(0, 0, sizeNotifierFrameLayout2.getMeasuredWidth(), sizeNotifierFrameLayout.getMeasuredHeight());
                    }

                    @Override
                    public void onMeasure(int i8, int i9) {
                        int size = View.MeasureSpec.getSize(i8);
                        int size2 = View.MeasureSpec.getSize(i9);
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i9);
                        TwoStepVerificationSetupActivity.this.actionBarBackground.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight(), 1073741824));
                        sizeNotifierFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i9);
                        setMeasuredDimension(size, size2);
                    }
                };
                ScrollView scrollView = new ScrollView(context) {
                    private int scrollingUp;
                    private int[] location = new int[2];
                    private Rect tempRect = new Rect();
                    private boolean isLayoutDirty = true;

                    @Override
                    public void onLayout(boolean z, int i8, int i9, int i10, int i11) {
                        this.isLayoutDirty = false;
                        super.onLayout(z, i8, i9, i10, i11);
                    }

                    @Override
                    public void onScrollChanged(int i8, int i9, int i10, int i11) {
                        super.onScrollChanged(i8, i9, i10, i11);
                        if (TwoStepVerificationSetupActivity.this.titleTextView == null) {
                            return;
                        }
                        TwoStepVerificationSetupActivity.this.titleTextView.getLocationOnScreen(this.location);
                        boolean z = TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + this.location[1] < ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getBottom();
                        if (z != (TwoStepVerificationSetupActivity.this.titleTextView.getTag() == null)) {
                            TwoStepVerificationSetupActivity.this.titleTextView.setTag(z ? null : 1);
                            if (TwoStepVerificationSetupActivity.this.actionBarAnimator != null) {
                                TwoStepVerificationSetupActivity.this.actionBarAnimator.cancel();
                                TwoStepVerificationSetupActivity.this.actionBarAnimator = null;
                            }
                            TwoStepVerificationSetupActivity.this.actionBarAnimator = new AnimatorSet();
                            AnimatorSet animatorSet = TwoStepVerificationSetupActivity.this.actionBarAnimator;
                            View view = TwoStepVerificationSetupActivity.this.actionBarBackground;
                            float[] fArr = {z ? 1.0f : 0.0f};
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr), ObjectAnimator.ofFloat(((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getTitleTextView(), (Property<SimpleTextView, Float>) property, z ? 1.0f : 0.0f));
                            TwoStepVerificationSetupActivity.this.actionBarAnimator.setDuration(150L);
                            TwoStepVerificationSetupActivity.this.actionBarAnimator.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (animator.equals(TwoStepVerificationSetupActivity.this.actionBarAnimator)) {
                                        TwoStepVerificationSetupActivity.this.actionBarAnimator = null;
                                    }
                                }
                            });
                            TwoStepVerificationSetupActivity.this.actionBarAnimator.start();
                        }
                    }

                    @Override
                    public void requestChildFocus(View view, View view2) {
                        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.isLayoutDirty) {
                            scrollToDescendant(view2);
                        }
                        super.requestChildFocus(view, view2);
                    }

                    @Override
                    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                        if (Build.VERSION.SDK_INT < 23) {
                            int iDp = AndroidUtilities.dp(120.0f) + rect.bottom;
                            rect.bottom = iDp;
                            int i8 = this.scrollingUp;
                            if (i8 != 0) {
                                rect.top -= i8;
                                rect.bottom = iDp - i8;
                                this.scrollingUp = 0;
                            }
                        }
                        return super.requestChildRectangleOnScreen(view, rect, z);
                    }

                    @Override
                    public void requestLayout() {
                        this.isLayoutDirty = true;
                        super.requestLayout();
                    }

                    @Override
                    public void scrollToDescendant(View view) {
                        view.getDrawingRect(this.tempRect);
                        offsetDescendantRectToMyCoords(view, this.tempRect);
                        Rect rect = this.tempRect;
                        rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
                        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.tempRect);
                        if (iComputeScrollDeltaToGetChildRectOnScreen < 0) {
                            int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
                            this.scrollingUp = measuredHeight;
                            iComputeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
                        } else {
                            this.scrollingUp = 0;
                        }
                        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
                            smoothScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
                        }
                    }
                };
                this.scrollView = scrollView;
                scrollView.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f));
                frameLayout.addView(this.bottomSkipButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                frameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
                viewGroup.addView(sizeNotifierFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
                LinearLayout linearLayout = new LinearLayout(context) {
                    @Override
                    public void onMeasure(int i8, int i9) {
                        super.onMeasure(i8, i9);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TwoStepVerificationSetupActivity.this.titleTextView.getLayoutParams();
                        int iDp = 0;
                        int iDp2 = AndroidUtilities.dp(8.0f) + (TwoStepVerificationSetupActivity.this.imageView.getVisibility() == 8 ? AndroidUtilities.statusBarHeight : 0);
                        if (TwoStepVerificationSetupActivity.this.currentType == 2 && AndroidUtilities.isSmallScreen() && !TwoStepVerificationSetupActivity.this.isLandscape()) {
                            iDp = AndroidUtilities.dp(32.0f);
                        }
                        marginLayoutParams.topMargin = iDp2 + iDp;
                    }
                };
                linearLayout.setOrientation(1);
                this.scrollView.addView(linearLayout, LayoutHelper.createScroll(-1, -1, 51));
                linearLayout.addView(this.imageView, LayoutHelper.createLinear(-2, -2, 49, 0, 69, 0, 0));
                linearLayout.addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 8, 0, 0));
                linearLayout.addView(this.descriptionText, LayoutHelper.createLinear(-2, -2, 49, 0, 9, 0, 0));
                OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                this.outlineTextFirstRow = outlineTextContainerView;
                outlineTextContainerView.animateSelection(1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.editTextFirstRow = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int iDp = AndroidUtilities.dp(16.0f);
                this.editTextFirstRow.setPadding(iDp, iDp, iDp, iDp);
                EditTextBoldCursor editTextBoldCursor2 = this.editTextFirstRow;
                int i8 = Theme.key_windowBackgroundWhiteInputFieldActivated;
                editTextBoldCursor2.setCursorColor(Theme.getColor(null, i8, false));
                this.editTextFirstRow.setTextColor(Theme.getColor(null, i2, false));
                this.editTextFirstRow.setBackground(null);
                this.editTextFirstRow.setMaxLines(1);
                this.editTextFirstRow.setLines(1);
                this.editTextFirstRow.setGravity(3);
                this.editTextFirstRow.setCursorSize(AndroidUtilities.dp(20.0f));
                this.editTextFirstRow.setSingleLine(true);
                this.editTextFirstRow.setCursorWidth(1.5f);
                EditTextBoldCursor editTextBoldCursor3 = this.editTextFirstRow;
                final Object[] objArr5 = objArr2 == true ? 1 : 0;
                editTextBoldCursor3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i9, KeyEvent keyEvent) {
                        switch (objArr5) {
                            case 0:
                                return this.f$0.lambda$createView$11(textView5, i9, keyEvent);
                            default:
                                return this.f$0.lambda$createView$14(textView5, i9, keyEvent);
                        }
                    }
                });
                this.outlineTextFirstRow.attachEditText(this.editTextFirstRow);
                this.editTextFirstRow.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z) {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$createView$16(view, z);
                                break;
                            case 1:
                                this.f$0.lambda$createView$12(view, z);
                                break;
                            default:
                                this.f$0.lambda$createView$15(view, z);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.addView(this.editTextFirstRow, LayoutHelper.createLinear(0, -2, 1.0f));
                ImageView imageView = new ImageView(context) {
                    @Override
                    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(TwoStepVerificationSetupActivity.this.editTextFirstRow.getTransformationMethod() == null);
                    }
                };
                this.showPasswordButton = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                this.showPasswordButton.setScaleType(scaleType);
                this.showPasswordButton.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.showPasswordButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
                this.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                final int i9 = 1;
                this.showPasswordButton.setOnClickListener(new View.OnClickListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i9) {
                            case 0:
                                this.f$0.lambda$createView$2(view);
                                break;
                            case 1:
                                this.f$0.lambda$createView$13(view);
                                break;
                            case 2:
                                this.f$0.lambda$createView$18(view);
                                break;
                            case 3:
                                this.f$0.lambda$createView$20(view);
                                break;
                            case 4:
                                this.f$0.lambda$createView$7(view);
                                break;
                            case 5:
                                this.f$0.lambda$createView$8(view);
                                break;
                            default:
                                this.f$0.lambda$createView$9(view);
                                break;
                        }
                    }
                });
                linearLayout2.addView(this.showPasswordButton, LayoutHelper.createLinear(24, 24, 16, 0, 0, 16, 0));
                this.editTextFirstRow.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (TwoStepVerificationSetupActivity.this.needPasswordButton) {
                            if (TwoStepVerificationSetupActivity.this.showPasswordButton.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                                AndroidUtilities.updateViewVisibilityAnimated(TwoStepVerificationSetupActivity.this.showPasswordButton, true, 0.1f, true);
                            } else {
                                if (TwoStepVerificationSetupActivity.this.showPasswordButton.getVisibility() == 8 || !TextUtils.isEmpty(editable)) {
                                    return;
                                }
                                AndroidUtilities.updateViewVisibilityAnimated(TwoStepVerificationSetupActivity.this.showPasswordButton, false, 0.1f, true);
                            }
                        }
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                    }
                });
                this.outlineTextFirstRow.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f));
                linearLayout.addView(this.outlineTextFirstRow, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.outlineTextSecondRow = new OutlineTextContainerView(context);
                EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
                this.editTextSecondRow = editTextBoldCursor4;
                editTextBoldCursor4.setTextSize(1, 18.0f);
                int iDp2 = AndroidUtilities.dp(16.0f);
                this.editTextSecondRow.setPadding(iDp2, iDp2, iDp2, iDp2);
                this.editTextSecondRow.setCursorColor(Theme.getColor(null, i8, false));
                this.editTextSecondRow.setTextColor(Theme.getColor(null, i2, false));
                this.editTextSecondRow.setBackground(null);
                final int i10 = 1;
                this.editTextSecondRow.setMaxLines(1);
                this.editTextSecondRow.setLines(1);
                this.editTextSecondRow.setGravity(3);
                this.editTextSecondRow.setCursorSize(AndroidUtilities.dp(20.0f));
                this.editTextSecondRow.setSingleLine(true);
                this.editTextSecondRow.setCursorWidth(1.5f);
                this.editTextSecondRow.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i11, KeyEvent keyEvent) {
                        switch (i10) {
                            case 0:
                                return this.f$0.lambda$createView$11(textView5, i11, keyEvent);
                            default:
                                return this.f$0.lambda$createView$14(textView5, i11, keyEvent);
                        }
                    }
                });
                this.outlineTextSecondRow.attachEditText(this.editTextSecondRow);
                final int i11 = 2;
                this.editTextSecondRow.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z) {
                        switch (i11) {
                            case 0:
                                this.f$0.lambda$createView$16(view, z);
                                break;
                            case 1:
                                this.f$0.lambda$createView$12(view, z);
                                break;
                            default:
                                this.f$0.lambda$createView$15(view, z);
                                break;
                        }
                    }
                });
                this.outlineTextSecondRow.addView(this.editTextSecondRow, LayoutHelper.createFrame(-1, -2.0f));
                linearLayout.addView(this.outlineTextSecondRow, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.outlineTextSecondRow.setVisibility(8);
                CustomPhoneKeyboardView customPhoneKeyboardView = new CustomPhoneKeyboardView(context);
                this.keyboardView = customPhoneKeyboardView;
                customPhoneKeyboardView.setVisibility(8);
                sizeNotifierFrameLayout.addView(this.keyboardView);
                CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) {
                    @Override
                    public void processNextPressed() {
                        TwoStepVerificationSetupActivity.this.processNext();
                    }
                };
                this.codeFieldContainer = codeFieldContainer;
                codeFieldContainer.setNumbersCount(6, 1);
                for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                    codeNumberField.setShowSoftInputOnFocusCompat(!isCustomKeyboardVisible());
                    codeNumberField.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void afterTextChanged(Editable editable) {
                            if (TwoStepVerificationSetupActivity.this.postedErrorColorTimeout) {
                                AndroidUtilities.cancelRunOnUIThread(TwoStepVerificationSetupActivity.this.errorColorTimeout);
                                TwoStepVerificationSetupActivity.this.errorColorTimeout.run();
                            }
                        }

                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                        }
                    });
                    final Object[] objArr6 = objArr == true ? 1 : 0;
                    codeNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final TwoStepVerificationSetupActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z) {
                            switch (objArr6) {
                                case 0:
                                    this.f$0.lambda$createView$16(view, z);
                                    break;
                                case 1:
                                    this.f$0.lambda$createView$12(view, z);
                                    break;
                                default:
                                    this.f$0.lambda$createView$15(view, z);
                                    break;
                            }
                        }
                    });
                }
                this.codeFieldContainer.setVisibility(8);
                linearLayout.addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 51, 0, 36, 0, 22));
                frameLayout2.addView(this.descriptionText2, LayoutHelper.createFrame(-2, -2, 49));
                if (this.currentType == 4) {
                    TextView textView5 = new TextView(context);
                    this.descriptionText3 = textView5;
                    textView5.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
                    this.descriptionText3.setGravity(1);
                    this.descriptionText3.setTextSize(1, 14.0f);
                    this.descriptionText3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.descriptionText3.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.descriptionText3.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    linearLayout.addView(this.descriptionText3, LayoutHelper.createLinear(-2, -2, 49, 0, 0, 0, 25));
                    final int i12 = 2;
                    this.descriptionText3.setOnClickListener(new View.OnClickListener(this) {
                        public final TwoStepVerificationSetupActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    this.f$0.lambda$createView$2(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$createView$13(view);
                                    break;
                                case 2:
                                    this.f$0.lambda$createView$18(view);
                                    break;
                                case 3:
                                    this.f$0.lambda$createView$20(view);
                                    break;
                                case 4:
                                    this.f$0.lambda$createView$7(view);
                                    break;
                                case 5:
                                    this.f$0.lambda$createView$8(view);
                                    break;
                                default:
                                    this.f$0.lambda$createView$9(view);
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = viewGroup;
                View view = new View(context) {
                    private Paint paint = new Paint();

                    @Override
                    public void onDraw(Canvas canvas) {
                        this.paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight, this.paint);
                        INavigationLayout iNavigationLayout = ((BaseFragment) TwoStepVerificationSetupActivity.this).parentLayout;
                        iNavigationLayout.getClass();
                        ((ActionBarLayout) iNavigationLayout).drawHeaderShadow(canvas, 255, measuredHeight);
                    }
                };
                this.actionBarBackground = view;
                view.setAlpha(0.0f);
                viewGroup.addView(this.actionBarBackground);
                viewGroup.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context);
                this.radialProgressView = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.radialProgressView.setAlpha(0.0f);
                this.radialProgressView.setScaleX(0.1f);
                this.radialProgressView.setScaleY(0.1f);
                this.radialProgressView.setProgressColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false));
                frameLayout.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                ViewGroup viewGroup2 = new ViewGroup(context) {
                    @Override
                    public void onLayout(boolean z, int i13, int i14, int i15, int i16) {
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.layout(0, 0, i15, ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight());
                        int i17 = i15 - i13;
                        int i18 = i16 - i14;
                        if (i15 <= i16) {
                            int i19 = (int) (i18 * 0.3f);
                            int measuredWidth = (i17 - TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth()) / 2;
                            TwoStepVerificationSetupActivity.this.imageView.layout(measuredWidth, i19, TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth() + measuredWidth, TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + i19);
                            int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(16.0f, TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight(), i19);
                            TwoStepVerificationSetupActivity.this.titleTextView.layout(0, iM, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + iM);
                            int iM2 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(12.0f, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight(), iM);
                            TwoStepVerificationSetupActivity.this.descriptionText.layout(0, iM2, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredHeight() + iM2);
                            int measuredWidth2 = (i17 - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            int measuredHeight = (i18 - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                            TwoStepVerificationSetupActivity.this.buttonTextView.layout(measuredWidth2, measuredHeight, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth2, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight);
                            return;
                        }
                        int measuredHeight2 = (i18 - TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight()) / 2;
                        TwoStepVerificationSetupActivity.this.imageView.layout(0, measuredHeight2, TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + measuredHeight2);
                        float f = i17;
                        float f2 = 0.4f * f;
                        int i20 = (int) f2;
                        float f3 = i18;
                        int i21 = (int) (0.22f * f3);
                        TwoStepVerificationSetupActivity.this.titleTextView.layout(i20, i21, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredWidth() + i20, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + i21);
                        int i22 = (int) (0.39f * f3);
                        TwoStepVerificationSetupActivity.this.descriptionText.layout(i20, i22, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredWidth() + i20, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredHeight() + i22);
                        int iM3 = (int) ImageReceiver$$ExternalSyntheticOutline0.m(f * 0.6f, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth(), 2.0f, f2);
                        int i23 = (int) (f3 * 0.64f);
                        TwoStepVerificationSetupActivity.this.buttonTextView.layout(iM3, i23, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth() + iM3, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight() + i23);
                    }

                    @Override
                    public void onMeasure(int i13, int i14) {
                        int size = View.MeasureSpec.getSize(i13);
                        int size2 = View.MeasureSpec.getSize(i14);
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i14);
                        if (size > size2) {
                            float f = size;
                            TwoStepVerificationSetupActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i15 = (int) (f * 0.6f);
                            TwoStepVerificationSetupActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                        } else {
                            float f2 = TwoStepVerificationSetupActivity.this.currentType == 7 ? 160 : 140;
                            TwoStepVerificationSetupActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f2), 1073741824));
                            TwoStepVerificationSetupActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.buttonTextView.measure(OKLCH.m(48.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                        }
                        setMeasuredDimension(size, size2);
                    }
                };
                viewGroup2.setOnTouchListener(new TopicsFragment$$ExternalSyntheticLambda27(3));
                viewGroup2.addView(this.actionBar);
                viewGroup2.addView(this.imageView);
                viewGroup2.addView(this.titleTextView);
                viewGroup2.addView(this.descriptionText);
                viewGroup2.addView(this.buttonTextView);
                this.fragmentView = viewGroup2;
                break;
        }
        this.fragmentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        int i13 = this.currentType;
        switch (i13) {
            case 0:
            case 1:
                if (this.currentPassword.has_password) {
                    ActionBar actionBar2 = this.actionBar;
                    int i14 = R.string.PleaseEnterNewFirstPassword;
                    actionBar2.setTitle(LocaleController.getString(i14));
                    this.titleTextView.setText(LocaleController.getString(i14));
                } else {
                    String string = LocaleController.getString(i13 == 0 ? R.string.CreatePassword : R.string.ReEnterPassword);
                    this.actionBar.setTitle(string);
                    this.titleTextView.setText(string);
                }
                if (!TextUtils.isEmpty(this.emailCode)) {
                    this.bottomSkipButton.setVisibility(0);
                    this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.outlineTextFirstRow.setText(LocaleController.getString(this.currentType == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(this.currentType == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.editTextFirstRow.setImeOptions(268435461);
                this.editTextFirstRow.setInputType(129);
                this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                this.needPasswordButton = this.currentType == 0;
                AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                RLottieDrawable[] rLottieDrawableArr = new RLottieDrawable[7];
                this.animationDrawables = rLottieDrawableArr;
                int i15 = R.raw.tsv_setup_monkey_idle1;
                rLottieDrawableArr[0] = new RLottieDrawable(i15, Fragment$$ExternalSyntheticOutline0.m(i15, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr2 = this.animationDrawables;
                int i16 = R.raw.tsv_setup_monkey_idle2;
                rLottieDrawableArr2[1] = new RLottieDrawable(i16, Fragment$$ExternalSyntheticOutline0.m(i16, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr3 = this.animationDrawables;
                int i17 = R.raw.tsv_monkey_close;
                rLottieDrawableArr3[2] = new RLottieDrawable(i17, Fragment$$ExternalSyntheticOutline0.m(i17, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr4 = this.animationDrawables;
                int i18 = R.raw.tsv_setup_monkey_peek;
                rLottieDrawableArr4[3] = new RLottieDrawable(i18, Fragment$$ExternalSyntheticOutline0.m(i18, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr5 = this.animationDrawables;
                int i19 = R.raw.tsv_setup_monkey_close_and_peek_to_idle;
                rLottieDrawableArr5[4] = new RLottieDrawable(i19, Fragment$$ExternalSyntheticOutline0.m(i19, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr6 = this.animationDrawables;
                int i20 = R.raw.tsv_setup_monkey_close_and_peek;
                rLottieDrawableArr6[5] = new RLottieDrawable(i20, Fragment$$ExternalSyntheticOutline0.m(i20, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr7 = this.animationDrawables;
                int i21 = R.raw.tsv_setup_monkey_tracking;
                rLottieDrawableArr7[6] = new RLottieDrawable(i21, Fragment$$ExternalSyntheticOutline0.m(i21, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.animationDrawables[6].setPlayInDirectionOfCustomEndFrame(true);
                this.animationDrawables[6].setCustomEndFrame(19);
                this.animationDrawables[2].setOnFinishCallback(this.finishCallback, 97);
                setRandomMonkeyIdleAnimation(true);
                switchMonkeyAnimation(this.currentType == 1);
                break;
            case 2:
                ActionBar actionBar3 = this.actionBar;
                int i22 = R.string.PasswordHint;
                actionBar3.setTitle(LocaleController.getString(i22));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.bottomSkipButton.setVisibility(0);
                this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.titleTextView.setText(LocaleController.getString(i22));
                this.descriptionText.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.descriptionText.setVisibility(0);
                OutlineTextContainerView outlineTextContainerView2 = this.outlineTextFirstRow;
                int i23 = R.string.PasswordHintPlaceholder;
                outlineTextContainerView2.setText(LocaleController.getString(i23));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i23));
                this.editTextFirstRow.setImeOptions(268435461);
                this.outlineTextSecondRow.setVisibility(8);
                this.imageView.setAnimation(R.raw.tsv_setup_hint, 120, 120);
                this.imageView.playAnimation();
                break;
            case 3:
                ActionBar actionBar4 = this.actionBar;
                int i24 = R.string.RecoveryEmailTitle;
                actionBar4.setTitle(LocaleController.getString(i24));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.emailOnly) {
                    this.bottomSkipButton.setVisibility(0);
                    this.bottomSkipButton.setAlpha(0.0f);
                    this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.titleTextView.setText(LocaleController.getString(i24));
                this.descriptionText.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.descriptionText.setVisibility(0);
                OutlineTextContainerView outlineTextContainerView3 = this.outlineTextFirstRow;
                int i25 = R.string.PaymentShippingEmailPlaceholder;
                outlineTextContainerView3.setText(LocaleController.getString(i25));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i25));
                this.editTextFirstRow.setImeOptions(268435461);
                this.editTextFirstRow.setInputType(33);
                this.outlineTextSecondRow.setVisibility(8);
                this.imageView.setAnimation(R.raw.tsv_setup_email_sent, 120, 120);
                this.imageView.playAnimation();
                break;
            case 4:
                ActionBar actionBar5 = this.actionBar;
                int i26 = R.string.PasswordRecovery;
                actionBar5.setTitle(LocaleController.getString(i26));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.titleTextView.setText(LocaleController.getString(i26));
                this.keyboardView.setVisibility(0);
                this.outlineTextFirstRow.setVisibility(8);
                String str = this.currentPassword.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str2);
                int iIndexOf = str2.indexOf(42);
                int iLastIndexOf = str2.lastIndexOf(42);
                if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = iIndexOf;
                    int i27 = iLastIndexOf + 1;
                    textStyleRun.end = i27;
                    spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i27, 0);
                }
                this.descriptionText.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf));
                this.descriptionText.setVisibility(0);
                this.floatingButton.setButtonVisible(false, false);
                this.codeFieldContainer.setVisibility(0);
                this.imageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
                this.imageView.playAnimation();
                break;
            case 5:
                ActionBar actionBar6 = this.actionBar;
                int i28 = R.string.VerificationCode;
                actionBar6.setTitle(LocaleController.getString(i28));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.titleTextView.setText(LocaleController.getString(i28));
                this.outlineTextFirstRow.setVisibility(8);
                this.keyboardView.setVisibility(0);
                TextView textView6 = this.descriptionText;
                int i29 = R.string.EmailPasswordConfirmText2;
                String str3 = this.currentPassword.email_unconfirmed_pattern;
                textView6.setText(LocaleController.formatString("EmailPasswordConfirmText2", i29, str3 != null ? str3 : ""));
                this.descriptionText.setVisibility(0);
                this.floatingButton.setButtonVisible(false, false);
                this.bottomSkipButton.setVisibility(0);
                this.bottomSkipButton.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.bottomSkipButton.getLayoutParams()).bottomMargin = 0;
                this.bottomSkipButton.setText(LocaleController.getString(R.string.ResendCode));
                final int i30 = 3;
                this.bottomSkipButton.setOnClickListener(new View.OnClickListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (i30) {
                            case 0:
                                this.f$0.lambda$createView$2(view2);
                                break;
                            case 1:
                                this.f$0.lambda$createView$13(view2);
                                break;
                            case 2:
                                this.f$0.lambda$createView$18(view2);
                                break;
                            case 3:
                                this.f$0.lambda$createView$20(view2);
                                break;
                            case 4:
                                this.f$0.lambda$createView$7(view2);
                                break;
                            case 5:
                                this.f$0.lambda$createView$8(view2);
                                break;
                            default:
                                this.f$0.lambda$createView$9(view2);
                                break;
                        }
                    }
                });
                this.codeFieldContainer.setVisibility(0);
                this.imageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
                this.imageView.playAnimation();
                break;
            case 6:
                this.titleTextView.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.descriptionText.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(R.raw.tsv_setup_intro, 140, 140);
                this.imageView.playAnimation();
                break;
            case 7:
                this.titleTextView.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.descriptionText.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.closeAfterSet) {
                    this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.fromRegistration) {
                    this.buttonTextView.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(R.raw.wallet_allset, 160, 160);
                this.imageView.playAnimation();
                break;
            case 8:
                ActionBar actionBar7 = this.actionBar;
                int i31 = R.string.PleaseEnterCurrentPassword;
                actionBar7.setTitle(LocaleController.getString(i31));
                this.titleTextView.setText(LocaleController.getString(i31));
                this.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.descriptionText.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.descriptionText2.setText(LocaleController.getString(R.string.ForgotPassword));
                this.descriptionText2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText2, false));
                OutlineTextContainerView outlineTextContainerView4 = this.outlineTextFirstRow;
                int i32 = R.string.LoginPassword;
                outlineTextContainerView4.setText(LocaleController.getString(i32));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i32));
                this.editTextFirstRow.setImeOptions(268435462);
                this.editTextFirstRow.setInputType(129);
                this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                this.imageView.setAnimation(R.raw.wallet_science, 120, 120);
                this.imageView.playAnimation();
                break;
            case 9:
                this.titleTextView.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.buttonTextView.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(R.raw.wallet_perfect, 140, 140);
                this.imageView.playAnimation();
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.editTextFirstRow;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                    if (TwoStepVerificationSetupActivity.this.ignoreTextChange) {
                        return;
                    }
                    if (TwoStepVerificationSetupActivity.this.currentType != 0) {
                        if (TwoStepVerificationSetupActivity.this.currentType != 1) {
                            if (TwoStepVerificationSetupActivity.this.currentType != 8 || editable.length() <= 0) {
                                return;
                            }
                            TwoStepVerificationSetupActivity.this.showDoneButton(true);
                            return;
                        }
                        try {
                            TwoStepVerificationSetupActivity.this.animationDrawables[6].setCustomEndFrame((int) ((Math.min(1.0f, TwoStepVerificationSetupActivity.this.editTextFirstRow.getLayout().getLineWidth(0) / TwoStepVerificationSetupActivity.this.editTextFirstRow.getWidth()) * 142.0f) + 18.0f));
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    RLottieDrawable animatedDrawable = TwoStepVerificationSetupActivity.this.imageView.getAnimatedDrawable();
                    if (TwoStepVerificationSetupActivity.this.editTextFirstRow.length() <= 0) {
                        if ((animatedDrawable == TwoStepVerificationSetupActivity.this.animationDrawables[3] && TwoStepVerificationSetupActivity.this.editTextFirstRow.getTransformationMethod() == null) || animatedDrawable == TwoStepVerificationSetupActivity.this.animationDrawables[5]) {
                            TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[4]);
                            TwoStepVerificationSetupActivity.this.animationDrawables[4].setProgress(0.0f, false);
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                            return;
                        } else {
                            TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(-1);
                            if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[2]) {
                                TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[2]);
                                TwoStepVerificationSetupActivity.this.animationDrawables[2].setCurrentFrame(49, false);
                            }
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                            return;
                        }
                    }
                    if (TwoStepVerificationSetupActivity.this.editTextFirstRow.getTransformationMethod() == null) {
                        if (animatedDrawable == TwoStepVerificationSetupActivity.this.animationDrawables[3] || animatedDrawable == TwoStepVerificationSetupActivity.this.animationDrawables[5]) {
                            return;
                        }
                        TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[5]);
                        TwoStepVerificationSetupActivity.this.animationDrawables[5].setProgress(0.0f, false);
                        TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                        return;
                    }
                    if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[3]) {
                        if (animatedDrawable == TwoStepVerificationSetupActivity.this.animationDrawables[2]) {
                            if (TwoStepVerificationSetupActivity.this.animationDrawables[2].getCurrentFrame() < 49) {
                                TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(49);
                            }
                        } else {
                            TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[2]);
                            TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(49);
                            TwoStepVerificationSetupActivity.this.animationDrawables[2].setProgress(0.0f, false);
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                        }
                    }
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i33, int i34, int i35) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i33, int i34, int i35) {
                }
            });
        }
        return this.fragmentView;
    }

    @Override
    public boolean finishFragment(boolean z) {
        for (BaseFragment baseFragment : ((ActionBarLayout) getParentLayout()).getFragmentStack()) {
            if (baseFragment != this && (baseFragment instanceof TwoStepVerificationSetupActivity)) {
                ((TwoStepVerificationSetupActivity) baseFragment).floatingAutoAnimator.ignoreNextLayout();
            }
        }
        return super.finishFragment(z);
    }

    public TLRPC.TL_inputCheckPasswordSRP getNewSrpPassword() {
        TL_account.Password password = this.currentPassword;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return SRPHelper.startCheck(this.currentPasswordHash, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.titleTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText6));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
        return arrayList;
    }

    @Override
    public boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public boolean hideKeyboardOnShow() {
        int i = this.currentType;
        return i == 7 || i == 9;
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.otherwiseReloginDays < 0 || ((ActionBarLayout) this.parentLayout).getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public void needHideProgress() {
        this.floatingButton.setProgressVisible(false, true);
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (this.otherwiseReloginDays < 0 || ((ActionBarLayout) this.parentLayout).getFragmentStack().size() != 1) {
            if (z) {
                finishFragment();
            }
            return true;
        }
        if (!z) {
            return false;
        }
        showSetForcePasswordAlert();
        return false;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.imageView != null) {
            if (this.currentType == 2 && AndroidUtilities.isSmallScreen()) {
                this.imageView.setVisibility(8);
            } else if (!isIntro()) {
                this.imageView.setVisibility(isLandscape() ? 8 : 0);
            }
        }
        CustomPhoneKeyboardView customPhoneKeyboardView = this.keyboardView;
        if (customPhoneKeyboardView != null) {
            customPhoneKeyboardView.setVisibility(isCustomKeyboardVisible() ? 0 : 8);
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.doneAfterPasswordLoad = false;
        Runnable runnable = this.setAnimationRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.setAnimationRunnable = null;
        }
        if (this.animationDrawables != null) {
            int i = 0;
            while (true) {
                RLottieDrawable[] rLottieDrawableArr = this.animationDrawables;
                if (i >= rLottieDrawableArr.length) {
                    break;
                }
                rLottieDrawableArr[i].recycle(false);
                i++;
            }
            this.animationDrawables = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (isCustomKeyboardVisible()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        this.paused = true;
    }

    public void onReset() {
    }

    @Override
    public void onResume() {
        super.onResume();
        this.paused = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (isCustomKeyboardVisible()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            if (this.editTextFirstRow != null && !isCustomKeyboardVisible()) {
                AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 3), 200L);
            }
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer == null || codeFieldContainer.getVisibility() != 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 4), 200L);
        }
    }

    public void setBlockingAlert(int i) {
        this.otherwiseReloginDays = i;
    }

    public void setCloseAfterSet(boolean z) {
        this.closeAfterSet = z;
    }

    public void setCurrentEmailCode(String str) {
        this.emailCode = str;
    }

    public void setCurrentPasswordParams(byte[] bArr, long j, byte[] bArr2, boolean z) {
        this.currentPasswordHash = bArr;
        this.currentSecret = bArr2;
        this.currentSecretId = j;
        this.emailOnly = z;
    }

    public void setFromRegistration(boolean z) {
        this.fromRegistration = z;
    }

    public void setOnOpenedSettings(Runnable runnable) {
        this.openedSettings = runnable;
    }

    @Override
    public void finishFragment() {
        if (this.otherwiseReloginDays >= 0 && ((ActionBarLayout) this.parentLayout).getFragmentStack().size() == 1) {
            Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("afterSignup", true);
            MainTabsActivity mainTabsActivity = new MainTabsActivity();
            mainTabsActivity.prepareDialogsActivity(bundleM);
            presentFragment(mainTabsActivity, true);
            return;
        }
        super.finishFragment();
    }

    public TwoStepVerificationSetupActivity(int i, TL_account.Password password) {
        super(null);
        this.needPasswordButton = false;
        this.otherwiseReloginDays = -1;
        this.fragmentsToClose = new ArrayList<>();
        this.emailCodeLength = 6;
        this.currentPasswordHash = new byte[0];
        this.errorColorTimeout = new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 0);
        this.finishCallback = new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda18(this, 1);
        this.currentType = i;
        this.currentPassword = password;
        if (password == null && (i == 6 || i == 8)) {
            loadPasswordInfo();
        } else {
            this.waitingForEmail = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }
}
