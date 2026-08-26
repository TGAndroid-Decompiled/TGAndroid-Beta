package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
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
import android.text.method.TransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController$$ExternalSyntheticLambda37;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
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
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TransformableLoginButtonView;
import org.telegram.ui.Components.VerticalPositionAutoAnimator$AnimatorLayoutChangeListener;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public class TwoStepVerificationSetupActivity extends BaseFragment {
    public AnimatorSet actionBarAnimator;
    public ChatActivity.AnonymousClass27 actionBarBackground;
    public RLottieDrawable[] animationDrawables;
    public TextView bottomSkipButton;
    public AnimatorSet buttonAnimation;
    public TextView buttonTextView;
    public boolean closeAfterSet;
    public PasscodeActivity.AnonymousClass8 codeFieldContainer;
    public TL_account.Password currentPassword;
    public byte[] currentPasswordHash;
    public byte[] currentSecret;
    public long currentSecretId;
    public final int currentType;
    public SpoilersTextView descriptionText;
    public TextView descriptionText2;
    public TextView descriptionText3;
    public boolean doneAfterPasswordLoad;
    public EditTextBoldCursor editTextFirstRow;
    public EditTextBoldCursor editTextSecondRow;
    public String email;
    public String emailCode;
    public boolean emailOnly;
    public final Runnable finishCallback;
    public String firstPassword;
    public PhotoViewer.AnonymousClass14 floatingAutoAnimator;
    public FragmentFloatingButton floatingButton;
    public TransformableLoginButtonView floatingButtonIcon;
    public final ArrayList fragmentsToClose;
    public boolean fromRegistration;
    public String hint;
    public boolean ignoreTextChange;
    public RLottieImageView imageView;
    public CustomPhoneKeyboardView keyboardView;
    public boolean needPasswordButton;
    public LinkManager$$ExternalSyntheticLambda7 openedSettings;
    public int otherwiseReloginDays;
    public OutlineTextContainerView outlineTextFirstRow;
    public OutlineTextContainerView outlineTextSecondRow;
    public boolean paused;
    public RadialProgressView radialProgressView;
    public AnonymousClass6 scrollView;
    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12 setAnimationRunnable;
    public EditTextEmoji.AnonymousClass3 showPasswordButton;
    public TextView titleTextView;
    public boolean waitingForEmail;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        @Override
        public final void onItemClick(int i) {
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = TwoStepVerificationSetupActivity.this;
            if (i == -1) {
                if (twoStepVerificationSetupActivity.otherwiseReloginDays < 0 || ((ActionBarLayout) ((BaseFragment) twoStepVerificationSetupActivity).parentLayout).getFragmentStack().size() != 1) {
                    twoStepVerificationSetupActivity.finishFragment();
                    return;
                } else {
                    twoStepVerificationSetupActivity.showSetForcePasswordAlert$1();
                    return;
                }
            }
            if (i == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity(), 0, null);
                TL_account.Password password = twoStepVerificationSetupActivity.currentPassword;
                String string = (password == null || !password.has_password) ? LocaleController.getString(R.string.CancelPasswordQuestion) : LocaleController.getString(R.string.CancelEmailQuestion);
                String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
                String string3 = LocaleController.getString(R.string.Abort);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.message = string;
                alertDialog.title = string2;
                builder.setPositiveButton(string3, new TodoItemMenu$$ExternalSyntheticLambda3(this, 4));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                twoStepVerificationSetupActivity.showDialog(alertDialog);
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
            }
        }
    }

    public final class AnonymousClass6 extends ScrollView {
        public boolean isLayoutDirty;
        public final int[] location;
        public int scrollingUp;
        public final Rect tempRect;

        public AnonymousClass6(Context context) {
            super(context);
            this.location = new int[2];
            this.tempRect = new Rect();
            this.isLayoutDirty = true;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.isLayoutDirty = false;
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override
        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = TwoStepVerificationSetupActivity.this;
            TextView textView = twoStepVerificationSetupActivity.titleTextView;
            if (textView == null) {
                return;
            }
            int[] iArr = this.location;
            textView.getLocationOnScreen(iArr);
            boolean z = twoStepVerificationSetupActivity.titleTextView.getMeasuredHeight() + iArr[1] < ((BaseFragment) twoStepVerificationSetupActivity).actionBar.getBottom();
            if (z != (twoStepVerificationSetupActivity.titleTextView.getTag() == null)) {
                twoStepVerificationSetupActivity.titleTextView.setTag(z ? null : 1);
                AnimatorSet animatorSet = twoStepVerificationSetupActivity.actionBarAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    twoStepVerificationSetupActivity.actionBarAnimator = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                twoStepVerificationSetupActivity.actionBarAnimator = animatorSet2;
                ChatActivity.AnonymousClass27 anonymousClass27 = twoStepVerificationSetupActivity.actionBarBackground;
                float[] fArr = {z ? 1.0f : 0.0f};
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass27, (Property<ChatActivity.AnonymousClass27, Float>) property, fArr), ObjectAnimator.ofFloat(((BaseFragment) twoStepVerificationSetupActivity).actionBar.getTitleTextView(), (Property<SimpleTextView, Float>) property, z ? 1.0f : 0.0f));
                twoStepVerificationSetupActivity.actionBarAnimator.setDuration(150L);
                twoStepVerificationSetupActivity.actionBarAnimator.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, 10));
                twoStepVerificationSetupActivity.actionBarAnimator.start();
            }
        }

        @Override
        public final void requestChildFocus(View view, View view2) {
            if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.isLayoutDirty) {
                scrollToDescendant(view2);
            }
            super.requestChildFocus(view, view2);
        }

        @Override
        public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
            if (Build.VERSION.SDK_INT < 23) {
                int iDp = AndroidUtilities.dp(120.0f) + rect.bottom;
                rect.bottom = iDp;
                int i = this.scrollingUp;
                if (i != 0) {
                    rect.top -= i;
                    rect.bottom = iDp - i;
                    this.scrollingUp = 0;
                }
            }
            return super.requestChildRectangleOnScreen(view, rect, z);
        }

        @Override
        public final void requestLayout() {
            this.isLayoutDirty = true;
            super.requestLayout();
        }

        @Override
        public final void scrollToDescendant(View view) {
            Rect rect = this.tempRect;
            view.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view, rect);
            rect.bottom = AndroidUtilities.dp(120.0f) + rect.bottom;
            int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
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
    }

    public TwoStepVerificationSetupActivity(int i, int i2, TL_account.Password password) {
        super(null);
        this.needPasswordButton = false;
        this.otherwiseReloginDays = -1;
        this.fragmentsToClose = new ArrayList();
        this.currentPasswordHash = new byte[0];
        this.finishCallback = new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12(this, 2);
        this.currentAccount = i;
        this.currentType = i2;
        this.currentPassword = password;
        this.waitingForEmail = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.currentPassword == null) {
            if (i2 == 6 || i2 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, 2), 10);
            }
        }
    }

    public final void animateSuccess$2(Runnable runnable) {
        int i = 0;
        while (true) {
            PasscodeActivity.AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
            CodeNumberField[] codeNumberFieldArr = anonymousClass8.codeField;
            if (i >= codeNumberFieldArr.length) {
                anonymousClass8.postDelayed(new TodoItemMenu$$ExternalSyntheticLambda9(21, this, runnable), (((long) codeNumberFieldArr.length) * 75) + 350);
                return;
            } else {
                CodeNumberField codeNumberField = codeNumberFieldArr[i];
                codeNumberField.postDelayed(new PasscodeActivity$$ExternalSyntheticLambda20(codeNumberField, 1), ((long) i) * 75);
                i++;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        final int i = 4;
        final int i2 = 3;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i3 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        ActionBar actionBar = this.actionBar;
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(Theme.getColor(null, i4, false));
        this.actionBar.setItemsColor(Theme.getColor(null, i4, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarWhiteSelector, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        int i5 = this.currentType;
        if (i5 == 5) {
            this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_other).addSubItem(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
        this.floatingButton = fragmentFloatingButton;
        this.floatingAutoAnimator = new PhotoViewer.AnonymousClass14(fragmentFloatingButton);
        this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationSetupActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.processNext$1();
                        break;
                    case 1:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity(), 0, null);
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity, 1));
                        String string = LocaleController.getString(R.string.ResetPassword);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        twoStepVerificationSetupActivity.showDialog(alertDialog);
                        break;
                    case 2:
                        this.f$0.lambda$createView$20$2$1();
                        break;
                    case 3:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                        if (twoStepVerificationSetupActivity2.bottomSkipButton.getAlpha() >= 0.5f) {
                            int i6 = twoStepVerificationSetupActivity2.currentType;
                            if (i6 == 0) {
                                twoStepVerificationSetupActivity2.needShowProgress$2();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = twoStepVerificationSetupActivity2.emailCode;
                                twoStepVerificationSetupActivity2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(twoStepVerificationSetupActivity2, 0));
                            } else if (i6 == 3) {
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(twoStepVerificationSetupActivity2.getParentActivity(), 0, null);
                                String string2 = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                AlertDialog alertDialog2 = builder2.alertDialog;
                                alertDialog2.message = string2;
                                alertDialog2.title = LocaleController.getString(R.string.YourEmailSkipWarning);
                                builder2.setPositiveButton(LocaleController.getString(R.string.YourEmailSkip), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity2, 2));
                                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                twoStepVerificationSetupActivity2.showDialog(alertDialog2);
                                TextView textView = (TextView) alertDialog2.getButton(-1);
                                if (textView != null) {
                                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                }
                            } else if (i6 == 2) {
                                twoStepVerificationSetupActivity2.onHintDone();
                            }
                            break;
                        }
                        break;
                    case 4:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = this.f$0;
                        if (twoStepVerificationSetupActivity3.currentType == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.forgotPasswordOnShow = true;
                            twoStepVerificationActivity.currentPassword = twoStepVerificationSetupActivity3.currentPassword;
                            twoStepVerificationActivity.passwordEntered = false;
                            twoStepVerificationActivity.otherwiseReloginDays = twoStepVerificationSetupActivity3.otherwiseReloginDays;
                            twoStepVerificationSetupActivity3.presentFragment(twoStepVerificationActivity, true);
                            LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = twoStepVerificationSetupActivity3.openedSettings;
                            if (linkManager$$ExternalSyntheticLambda7 != null) {
                                AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                twoStepVerificationSetupActivity3.openedSettings = null;
                            }
                        }
                        break;
                    case 5:
                        this.f$0.processNext$1();
                        break;
                    default:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity4 = this.f$0;
                        twoStepVerificationSetupActivity4.ignoreTextChange = true;
                        TransformationMethod transformationMethod = twoStepVerificationSetupActivity4.editTextFirstRow.getTransformationMethod();
                        int i7 = twoStepVerificationSetupActivity4.currentType;
                        if (transformationMethod == null) {
                            twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
                            if (i7 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(-1);
                                RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                RLottieDrawable rLottieDrawable = twoStepVerificationSetupActivity4.animationDrawables[3];
                                if (animatedDrawable != rLottieDrawable) {
                                    twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable);
                                    twoStepVerificationSetupActivity4.animationDrawables[3].setCurrentFrame(18, false, false);
                                }
                                twoStepVerificationSetupActivity4.imageView.playAnimation();
                            }
                        } else {
                            twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(null);
                            twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelSend, false), PorterDuff.Mode.MULTIPLY));
                            if (i7 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(18);
                                RLottieDrawable animatedDrawable2 = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity4.animationDrawables[3];
                                if (animatedDrawable2 != rLottieDrawable2) {
                                    twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable2);
                                }
                                twoStepVerificationSetupActivity4.animationDrawables[3].setProgress(0.0f, false);
                                twoStepVerificationSetupActivity4.imageView.playAnimation();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = twoStepVerificationSetupActivity4.editTextFirstRow;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        twoStepVerificationSetupActivity4.ignoreTextChange = false;
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
        new PhotoViewer.AnonymousClass14(this.bottomSkipButton);
        this.bottomSkipButton.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.bottomSkipButton.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationSetupActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.processNext$1();
                        break;
                    case 1:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity(), 0, null);
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity, 1));
                        String string = LocaleController.getString(R.string.ResetPassword);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        twoStepVerificationSetupActivity.showDialog(alertDialog);
                        break;
                    case 2:
                        this.f$0.lambda$createView$20$2$1();
                        break;
                    case 3:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                        if (twoStepVerificationSetupActivity2.bottomSkipButton.getAlpha() >= 0.5f) {
                            int i6 = twoStepVerificationSetupActivity2.currentType;
                            if (i6 == 0) {
                                twoStepVerificationSetupActivity2.needShowProgress$2();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = twoStepVerificationSetupActivity2.emailCode;
                                twoStepVerificationSetupActivity2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(twoStepVerificationSetupActivity2, 0));
                            } else if (i6 == 3) {
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(twoStepVerificationSetupActivity2.getParentActivity(), 0, null);
                                String string2 = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                AlertDialog alertDialog2 = builder2.alertDialog;
                                alertDialog2.message = string2;
                                alertDialog2.title = LocaleController.getString(R.string.YourEmailSkipWarning);
                                builder2.setPositiveButton(LocaleController.getString(R.string.YourEmailSkip), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity2, 2));
                                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                twoStepVerificationSetupActivity2.showDialog(alertDialog2);
                                TextView textView2 = (TextView) alertDialog2.getButton(-1);
                                if (textView2 != null) {
                                    textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                }
                            } else if (i6 == 2) {
                                twoStepVerificationSetupActivity2.onHintDone();
                            }
                            break;
                        }
                        break;
                    case 4:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = this.f$0;
                        if (twoStepVerificationSetupActivity3.currentType == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.forgotPasswordOnShow = true;
                            twoStepVerificationActivity.currentPassword = twoStepVerificationSetupActivity3.currentPassword;
                            twoStepVerificationActivity.passwordEntered = false;
                            twoStepVerificationActivity.otherwiseReloginDays = twoStepVerificationSetupActivity3.otherwiseReloginDays;
                            twoStepVerificationSetupActivity3.presentFragment(twoStepVerificationActivity, true);
                            LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = twoStepVerificationSetupActivity3.openedSettings;
                            if (linkManager$$ExternalSyntheticLambda7 != null) {
                                AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                twoStepVerificationSetupActivity3.openedSettings = null;
                            }
                        }
                        break;
                    case 5:
                        this.f$0.processNext$1();
                        break;
                    default:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity4 = this.f$0;
                        twoStepVerificationSetupActivity4.ignoreTextChange = true;
                        TransformationMethod transformationMethod = twoStepVerificationSetupActivity4.editTextFirstRow.getTransformationMethod();
                        int i7 = twoStepVerificationSetupActivity4.currentType;
                        if (transformationMethod == null) {
                            twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
                            if (i7 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(-1);
                                RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                RLottieDrawable rLottieDrawable = twoStepVerificationSetupActivity4.animationDrawables[3];
                                if (animatedDrawable != rLottieDrawable) {
                                    twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable);
                                    twoStepVerificationSetupActivity4.animationDrawables[3].setCurrentFrame(18, false, false);
                                }
                                twoStepVerificationSetupActivity4.imageView.playAnimation();
                            }
                        } else {
                            twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(null);
                            twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelSend, false), PorterDuff.Mode.MULTIPLY));
                            if (i7 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(18);
                                RLottieDrawable animatedDrawable2 = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity4.animationDrawables[3];
                                if (animatedDrawable2 != rLottieDrawable2) {
                                    twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable2);
                                }
                                twoStepVerificationSetupActivity4.animationDrawables[3].setProgress(0.0f, false);
                                twoStepVerificationSetupActivity4.imageView.playAnimation();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = twoStepVerificationSetupActivity4.editTextFirstRow;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        twoStepVerificationSetupActivity4.ignoreTextChange = false;
                        break;
                }
            }
        });
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        rLottieImageView.setScaleType(scaleType);
        if (i5 == 2 && AndroidUtilities.isSmallScreen()) {
            this.imageView.setVisibility(8);
        } else if (i5 != 6 && i5 != 9 && i5 != 7) {
            RLottieImageView rLottieImageView2 = this.imageView;
            Point point = AndroidUtilities.displaySize;
            rLottieImageView2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.titleTextView = textView2;
        textView2.setTextColor(Theme.getColor(null, i4, false));
        this.titleTextView.setGravity(1);
        this.titleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.titleTextView.setTextSize(1, 24.0f);
        SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, true);
        this.descriptionText = spoilersTextView;
        int i6 = Theme.key_windowBackgroundWhiteGrayText6;
        spoilersTextView.setTextColor(Theme.getColor(null, i6, false));
        this.descriptionText.setGravity(1);
        this.descriptionText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText.setTextSize(1, 15.0f);
        this.descriptionText.setVisibility(8);
        this.descriptionText.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.descriptionText2 = textView3;
        textView3.setTextColor(Theme.getColor(null, i6, false));
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
                switch (i) {
                    case 0:
                        this.f$0.processNext$1();
                        break;
                    case 1:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity(), 0, null);
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity, 1));
                        String string = LocaleController.getString(R.string.ResetPassword);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        twoStepVerificationSetupActivity.showDialog(alertDialog);
                        break;
                    case 2:
                        this.f$0.lambda$createView$20$2$1();
                        break;
                    case 3:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                        if (twoStepVerificationSetupActivity2.bottomSkipButton.getAlpha() >= 0.5f) {
                            int i7 = twoStepVerificationSetupActivity2.currentType;
                            if (i7 == 0) {
                                twoStepVerificationSetupActivity2.needShowProgress$2();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = twoStepVerificationSetupActivity2.emailCode;
                                twoStepVerificationSetupActivity2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(twoStepVerificationSetupActivity2, 0));
                            } else if (i7 == 3) {
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(twoStepVerificationSetupActivity2.getParentActivity(), 0, null);
                                String string2 = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                AlertDialog alertDialog2 = builder2.alertDialog;
                                alertDialog2.message = string2;
                                alertDialog2.title = LocaleController.getString(R.string.YourEmailSkipWarning);
                                builder2.setPositiveButton(LocaleController.getString(R.string.YourEmailSkip), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity2, 2));
                                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                twoStepVerificationSetupActivity2.showDialog(alertDialog2);
                                TextView textView4 = (TextView) alertDialog2.getButton(-1);
                                if (textView4 != null) {
                                    textView4.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                }
                            } else if (i7 == 2) {
                                twoStepVerificationSetupActivity2.onHintDone();
                            }
                            break;
                        }
                        break;
                    case 4:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = this.f$0;
                        if (twoStepVerificationSetupActivity3.currentType == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.forgotPasswordOnShow = true;
                            twoStepVerificationActivity.currentPassword = twoStepVerificationSetupActivity3.currentPassword;
                            twoStepVerificationActivity.passwordEntered = false;
                            twoStepVerificationActivity.otherwiseReloginDays = twoStepVerificationSetupActivity3.otherwiseReloginDays;
                            twoStepVerificationSetupActivity3.presentFragment(twoStepVerificationActivity, true);
                            LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = twoStepVerificationSetupActivity3.openedSettings;
                            if (linkManager$$ExternalSyntheticLambda7 != null) {
                                AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                twoStepVerificationSetupActivity3.openedSettings = null;
                            }
                        }
                        break;
                    case 5:
                        this.f$0.processNext$1();
                        break;
                    default:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity4 = this.f$0;
                        twoStepVerificationSetupActivity4.ignoreTextChange = true;
                        TransformationMethod transformationMethod = twoStepVerificationSetupActivity4.editTextFirstRow.getTransformationMethod();
                        int i8 = twoStepVerificationSetupActivity4.currentType;
                        if (transformationMethod == null) {
                            twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
                            if (i8 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(-1);
                                RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                RLottieDrawable rLottieDrawable = twoStepVerificationSetupActivity4.animationDrawables[3];
                                if (animatedDrawable != rLottieDrawable) {
                                    twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable);
                                    twoStepVerificationSetupActivity4.animationDrawables[3].setCurrentFrame(18, false, false);
                                }
                                twoStepVerificationSetupActivity4.imageView.playAnimation();
                            }
                        } else {
                            twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(null);
                            twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelSend, false), PorterDuff.Mode.MULTIPLY));
                            if (i8 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(18);
                                RLottieDrawable animatedDrawable2 = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity4.animationDrawables[3];
                                if (animatedDrawable2 != rLottieDrawable2) {
                                    twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable2);
                                }
                                twoStepVerificationSetupActivity4.animationDrawables[3].setProgress(0.0f, false);
                                twoStepVerificationSetupActivity4.imageView.playAnimation();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = twoStepVerificationSetupActivity4.editTextFirstRow;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        twoStepVerificationSetupActivity4.ignoreTextChange = false;
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
        final int i7 = 5;
        this.buttonTextView.setOnClickListener(new View.OnClickListener(this) {
            public final TwoStepVerificationSetupActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f$0.processNext$1();
                        break;
                    case 1:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                        AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity(), 0, null);
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        builder.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity, 1));
                        String string = LocaleController.getString(R.string.ResetPassword);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        twoStepVerificationSetupActivity.showDialog(alertDialog);
                        break;
                    case 2:
                        this.f$0.lambda$createView$20$2$1();
                        break;
                    case 3:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                        if (twoStepVerificationSetupActivity2.bottomSkipButton.getAlpha() >= 0.5f) {
                            int i8 = twoStepVerificationSetupActivity2.currentType;
                            if (i8 == 0) {
                                twoStepVerificationSetupActivity2.needShowProgress$2();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = twoStepVerificationSetupActivity2.emailCode;
                                twoStepVerificationSetupActivity2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(twoStepVerificationSetupActivity2, 0));
                            } else if (i8 == 3) {
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(twoStepVerificationSetupActivity2.getParentActivity(), 0, null);
                                String string2 = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                AlertDialog alertDialog2 = builder2.alertDialog;
                                alertDialog2.message = string2;
                                alertDialog2.title = LocaleController.getString(R.string.YourEmailSkipWarning);
                                builder2.setPositiveButton(LocaleController.getString(R.string.YourEmailSkip), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity2, 2));
                                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                twoStepVerificationSetupActivity2.showDialog(alertDialog2);
                                TextView textView5 = (TextView) alertDialog2.getButton(-1);
                                if (textView5 != null) {
                                    textView5.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                }
                            } else if (i8 == 2) {
                                twoStepVerificationSetupActivity2.onHintDone();
                            }
                            break;
                        }
                        break;
                    case 4:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = this.f$0;
                        if (twoStepVerificationSetupActivity3.currentType == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.forgotPasswordOnShow = true;
                            twoStepVerificationActivity.currentPassword = twoStepVerificationSetupActivity3.currentPassword;
                            twoStepVerificationActivity.passwordEntered = false;
                            twoStepVerificationActivity.otherwiseReloginDays = twoStepVerificationSetupActivity3.otherwiseReloginDays;
                            twoStepVerificationSetupActivity3.presentFragment(twoStepVerificationActivity, true);
                            LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = twoStepVerificationSetupActivity3.openedSettings;
                            if (linkManager$$ExternalSyntheticLambda7 != null) {
                                AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                twoStepVerificationSetupActivity3.openedSettings = null;
                            }
                        }
                        break;
                    case 5:
                        this.f$0.processNext$1();
                        break;
                    default:
                        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity4 = this.f$0;
                        twoStepVerificationSetupActivity4.ignoreTextChange = true;
                        TransformationMethod transformationMethod = twoStepVerificationSetupActivity4.editTextFirstRow.getTransformationMethod();
                        int i9 = twoStepVerificationSetupActivity4.currentType;
                        if (transformationMethod == null) {
                            twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
                            if (i9 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(-1);
                                RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                RLottieDrawable rLottieDrawable = twoStepVerificationSetupActivity4.animationDrawables[3];
                                if (animatedDrawable != rLottieDrawable) {
                                    twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable);
                                    twoStepVerificationSetupActivity4.animationDrawables[3].setCurrentFrame(18, false, false);
                                }
                                twoStepVerificationSetupActivity4.imageView.playAnimation();
                            }
                        } else {
                            twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(null);
                            twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelSend, false), PorterDuff.Mode.MULTIPLY));
                            if (i9 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(18);
                                RLottieDrawable animatedDrawable2 = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity4.animationDrawables[3];
                                if (animatedDrawable2 != rLottieDrawable2) {
                                    twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable2);
                                }
                                twoStepVerificationSetupActivity4.animationDrawables[3].setProgress(0.0f, false);
                                twoStepVerificationSetupActivity4.imageView.playAnimation();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = twoStepVerificationSetupActivity4.editTextFirstRow;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        twoStepVerificationSetupActivity4.ignoreTextChange = false;
                        break;
                }
            }
        });
        if (i5 == 6 || i5 == 7 || i5 == 9) {
            this.titleTextView.setTypeface(Typeface.DEFAULT);
            this.titleTextView.setTextSize(1, 24.0f);
        } else {
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setTextSize(1, 18.0f);
        }
        switch (i5) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 26);
                PasscodeActivity.AnonymousClass2 anonymousClass2 = new PasscodeActivity.AnonymousClass2(this, context, anonymousClass4, 2);
                anonymousClass2.addView(anonymousClass4);
                CameraScanActivity.AnonymousClass3 anonymousClass3 = new CameraScanActivity.AnonymousClass3(this, context, anonymousClass2);
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(context);
                this.scrollView = anonymousClass6;
                anonymousClass6.setVerticalScrollBarEnabled(false);
                anonymousClass4.addView(this.scrollView, LayoutHelper.createFrame(-1.0f, -1));
                anonymousClass4.addView(this.bottomSkipButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                anonymousClass4.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
                anonymousClass3.addView(anonymousClass2, LayoutHelper.createFrame(-1.0f, -1));
                PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 15);
                anonymousClass35.setOrientation(1);
                this.scrollView.addView(anonymousClass35, LayoutHelper.createScroll(-1, -1, 51));
                anonymousClass35.addView(this.imageView, LayoutHelper.createLinear(-2, -2, 49, 0, 69, 0, 0));
                anonymousClass35.addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 8, 0, 0));
                anonymousClass35.addView(this.descriptionText, LayoutHelper.createLinear(-2, -2, 49, 0, 9, 0, 0));
                OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
                this.outlineTextFirstRow = outlineTextContainerView;
                outlineTextContainerView.animateSelection(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.editTextFirstRow = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int iDp = AndroidUtilities.dp(16.0f);
                this.editTextFirstRow.setPadding(iDp, iDp, iDp, iDp);
                EditTextBoldCursor editTextBoldCursor2 = this.editTextFirstRow;
                int i8 = Theme.key_windowBackgroundWhiteInputFieldActivated;
                editTextBoldCursor2.setCursorColor(Theme.getColor(null, i8, false));
                this.editTextFirstRow.setTextColor(Theme.getColor(null, i4, false));
                this.editTextFirstRow.setBackground(null);
                this.editTextFirstRow.setMaxLines(1);
                this.editTextFirstRow.setLines(1);
                this.editTextFirstRow.setGravity(3);
                this.editTextFirstRow.setCursorSize(AndroidUtilities.dp(20.0f));
                this.editTextFirstRow.setSingleLine(true);
                this.editTextFirstRow.setCursorWidth(1.5f);
                this.editTextFirstRow.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i9, KeyEvent keyEvent) {
                        switch (i3) {
                            case 0:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                                twoStepVerificationSetupActivity.getClass();
                                if (i9 != 5 && i9 != 6) {
                                    return false;
                                }
                                if (twoStepVerificationSetupActivity.outlineTextSecondRow.getVisibility() == 0) {
                                    twoStepVerificationSetupActivity.editTextSecondRow.requestFocus();
                                } else {
                                    twoStepVerificationSetupActivity.processNext$1();
                                }
                                return true;
                            default:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                                twoStepVerificationSetupActivity2.getClass();
                                if (i9 != 5 && i9 != 6) {
                                    return false;
                                }
                                twoStepVerificationSetupActivity2.processNext$1();
                                return true;
                        }
                    }
                });
                OutlineTextContainerView outlineTextContainerView2 = this.outlineTextFirstRow;
                outlineTextContainerView2.attachedEditText = this.editTextFirstRow;
                outlineTextContainerView2.invalidate();
                final int i9 = 2;
                this.editTextFirstRow.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z) {
                        switch (i9) {
                            case 0:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                                if (!z) {
                                    twoStepVerificationSetupActivity.getClass();
                                } else {
                                    twoStepVerificationSetupActivity.keyboardView.setEditText((EditText) view);
                                    twoStepVerificationSetupActivity.keyboardView.setDispatchBackWhenEmpty(true);
                                }
                                break;
                            case 1:
                                OutlineTextContainerView outlineTextContainerView3 = this.f$0.outlineTextSecondRow;
                                float f = z ? 1.0f : 0.0f;
                                outlineTextContainerView3.animateSelection(f, f, true);
                                break;
                            default:
                                OutlineTextContainerView outlineTextContainerView4 = this.f$0.outlineTextFirstRow;
                                float f2 = z ? 1.0f : 0.0f;
                                outlineTextContainerView4.animateSelection(f2, f2, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.editTextFirstRow, LayoutHelper.createLinear(1.0f, 0, -2));
                EditTextEmoji.AnonymousClass3 anonymousClass5 = new EditTextEmoji.AnonymousClass3(this, context, 2);
                this.showPasswordButton = anonymousClass5;
                anonymousClass5.setImageResource(R.drawable.msg_message);
                this.showPasswordButton.setScaleType(scaleType);
                this.showPasswordButton.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.showPasswordButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
                this.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                final int i10 = 6;
                this.showPasswordButton.setOnClickListener(new View.OnClickListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                this.f$0.processNext$1();
                                break;
                            case 1:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                                AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity(), 0, null);
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                builder.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity, 1));
                                String string = LocaleController.getString(R.string.ResetPassword);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string;
                                alertDialog.message = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                twoStepVerificationSetupActivity.showDialog(alertDialog);
                                break;
                            case 2:
                                this.f$0.lambda$createView$20$2$1();
                                break;
                            case 3:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                                if (twoStepVerificationSetupActivity2.bottomSkipButton.getAlpha() >= 0.5f) {
                                    int i11 = twoStepVerificationSetupActivity2.currentType;
                                    if (i11 == 0) {
                                        twoStepVerificationSetupActivity2.needShowProgress$2();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = twoStepVerificationSetupActivity2.emailCode;
                                        twoStepVerificationSetupActivity2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(twoStepVerificationSetupActivity2, 0));
                                    } else if (i11 == 3) {
                                        AlertDialog.Builder builder2 = new AlertDialog.Builder(twoStepVerificationSetupActivity2.getParentActivity(), 0, null);
                                        String string2 = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        AlertDialog alertDialog2 = builder2.alertDialog;
                                        alertDialog2.message = string2;
                                        alertDialog2.title = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        builder2.setPositiveButton(LocaleController.getString(R.string.YourEmailSkip), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity2, 2));
                                        builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                        twoStepVerificationSetupActivity2.showDialog(alertDialog2);
                                        TextView textView5 = (TextView) alertDialog2.getButton(-1);
                                        if (textView5 != null) {
                                            textView5.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                    } else if (i11 == 2) {
                                        twoStepVerificationSetupActivity2.onHintDone();
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = this.f$0;
                                if (twoStepVerificationSetupActivity3.currentType == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.forgotPasswordOnShow = true;
                                    twoStepVerificationActivity.currentPassword = twoStepVerificationSetupActivity3.currentPassword;
                                    twoStepVerificationActivity.passwordEntered = false;
                                    twoStepVerificationActivity.otherwiseReloginDays = twoStepVerificationSetupActivity3.otherwiseReloginDays;
                                    twoStepVerificationSetupActivity3.presentFragment(twoStepVerificationActivity, true);
                                    LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = twoStepVerificationSetupActivity3.openedSettings;
                                    if (linkManager$$ExternalSyntheticLambda7 != null) {
                                        AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                        twoStepVerificationSetupActivity3.openedSettings = null;
                                    }
                                }
                                break;
                            case 5:
                                this.f$0.processNext$1();
                                break;
                            default:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity4 = this.f$0;
                                twoStepVerificationSetupActivity4.ignoreTextChange = true;
                                TransformationMethod transformationMethod = twoStepVerificationSetupActivity4.editTextFirstRow.getTransformationMethod();
                                int i12 = twoStepVerificationSetupActivity4.currentType;
                                if (transformationMethod == null) {
                                    twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
                                    if (i12 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                        twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(-1);
                                        RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                        RLottieDrawable rLottieDrawable = twoStepVerificationSetupActivity4.animationDrawables[3];
                                        if (animatedDrawable != rLottieDrawable) {
                                            twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable);
                                            twoStepVerificationSetupActivity4.animationDrawables[3].setCurrentFrame(18, false, false);
                                        }
                                        twoStepVerificationSetupActivity4.imageView.playAnimation();
                                    }
                                } else {
                                    twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(null);
                                    twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelSend, false), PorterDuff.Mode.MULTIPLY));
                                    if (i12 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                        twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(18);
                                        RLottieDrawable animatedDrawable2 = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                        RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity4.animationDrawables[3];
                                        if (animatedDrawable2 != rLottieDrawable2) {
                                            twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable2);
                                        }
                                        twoStepVerificationSetupActivity4.animationDrawables[3].setProgress(0.0f, false);
                                        twoStepVerificationSetupActivity4.imageView.playAnimation();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = twoStepVerificationSetupActivity4.editTextFirstRow;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                twoStepVerificationSetupActivity4.ignoreTextChange = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.showPasswordButton, LayoutHelper.createLinear(24, 24, 16, 0, 0, 16, 0));
                this.editTextFirstRow.addTextChangedListener(new TextWatcher(this) {
                    public final TwoStepVerificationSetupActivity this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void afterTextChanged(Editable editable) {
                        RLottieDrawable rLottieDrawable;
                        switch (i3) {
                            case 0:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.this$0;
                                if (twoStepVerificationSetupActivity.needPasswordButton) {
                                    if (twoStepVerificationSetupActivity.showPasswordButton.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                                        AndroidUtilities.updateViewVisibilityAnimated(twoStepVerificationSetupActivity.showPasswordButton, true, 0.1f, true);
                                        break;
                                    } else if (twoStepVerificationSetupActivity.showPasswordButton.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                                        AndroidUtilities.updateViewVisibilityAnimated(twoStepVerificationSetupActivity.showPasswordButton, false, 0.1f, true);
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                this.this$0.getClass();
                                break;
                            default:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.this$0;
                                if (!twoStepVerificationSetupActivity2.ignoreTextChange) {
                                    int i11 = twoStepVerificationSetupActivity2.currentType;
                                    if (i11 == 0) {
                                        RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity2.imageView.getAnimatedDrawable();
                                        if (twoStepVerificationSetupActivity2.editTextFirstRow.length() <= 0) {
                                            if (animatedDrawable != twoStepVerificationSetupActivity2.animationDrawables[3] || twoStepVerificationSetupActivity2.editTextFirstRow.getTransformationMethod() != null) {
                                                RLottieDrawable[] rLottieDrawableArr = twoStepVerificationSetupActivity2.animationDrawables;
                                                if (animatedDrawable != rLottieDrawableArr[5]) {
                                                    rLottieDrawableArr[2].setCustomEndFrame(-1);
                                                    RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity2.animationDrawables[2];
                                                    if (animatedDrawable != rLottieDrawable2) {
                                                        twoStepVerificationSetupActivity2.imageView.setAnimation(rLottieDrawable2);
                                                        twoStepVerificationSetupActivity2.animationDrawables[2].setCurrentFrame(49, false, false);
                                                    }
                                                    twoStepVerificationSetupActivity2.imageView.playAnimation();
                                                }
                                            }
                                            twoStepVerificationSetupActivity2.imageView.setAnimation(twoStepVerificationSetupActivity2.animationDrawables[4]);
                                            twoStepVerificationSetupActivity2.animationDrawables[4].setProgress(0.0f, false);
                                            twoStepVerificationSetupActivity2.imageView.playAnimation();
                                            break;
                                        } else if (twoStepVerificationSetupActivity2.editTextFirstRow.getTransformationMethod() != null) {
                                            RLottieDrawable[] rLottieDrawableArr2 = twoStepVerificationSetupActivity2.animationDrawables;
                                            if (animatedDrawable != rLottieDrawableArr2[3]) {
                                                RLottieDrawable rLottieDrawable3 = rLottieDrawableArr2[2];
                                                if (animatedDrawable != rLottieDrawable3) {
                                                    twoStepVerificationSetupActivity2.imageView.setAnimation(rLottieDrawable3);
                                                    twoStepVerificationSetupActivity2.animationDrawables[2].setCustomEndFrame(49);
                                                    twoStepVerificationSetupActivity2.animationDrawables[2].setProgress(0.0f, false);
                                                    twoStepVerificationSetupActivity2.imageView.playAnimation();
                                                } else if (rLottieDrawable3.currentFrame < 49) {
                                                    rLottieDrawable3.setCustomEndFrame(49);
                                                }
                                            }
                                            break;
                                        } else {
                                            RLottieDrawable[] rLottieDrawableArr3 = twoStepVerificationSetupActivity2.animationDrawables;
                                            if (animatedDrawable != rLottieDrawableArr3[3] && animatedDrawable != (rLottieDrawable = rLottieDrawableArr3[5])) {
                                                twoStepVerificationSetupActivity2.imageView.setAnimation(rLottieDrawable);
                                                twoStepVerificationSetupActivity2.animationDrawables[5].setProgress(0.0f, false);
                                                twoStepVerificationSetupActivity2.imageView.playAnimation();
                                                break;
                                            }
                                        }
                                    } else if (i11 == 1) {
                                        try {
                                            twoStepVerificationSetupActivity2.animationDrawables[6].setCustomEndFrame((int) ((Math.min(1.0f, twoStepVerificationSetupActivity2.editTextFirstRow.getLayout().getLineWidth(0) / twoStepVerificationSetupActivity2.editTextFirstRow.getWidth()) * 142.0f) + 18.0f));
                                            twoStepVerificationSetupActivity2.imageView.playAnimation();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            return;
                                        }
                                        break;
                                    } else if (i11 == 8 && editable.length() > 0) {
                                        twoStepVerificationSetupActivity2.showDoneButton(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }

                    @Override
                    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                        int i14 = i3;
                    }

                    @Override
                    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                        int i14 = i3;
                    }

                    private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$11(int i11, int i12, int i13, CharSequence charSequence) {
                    }

                    private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$13(int i11, int i12, int i13, CharSequence charSequence) {
                    }

                    private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$9(int i11, int i12, int i13, CharSequence charSequence) {
                    }

                    private final void onTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$11(int i11, int i12, int i13, CharSequence charSequence) {
                    }

                    private final void onTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$13(int i11, int i12, int i13, CharSequence charSequence) {
                    }

                    private final void onTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$9(int i11, int i12, int i13, CharSequence charSequence) {
                    }
                });
                this.outlineTextFirstRow.addView(linearLayout, LayoutHelper.createFrame(-2.0f, -1));
                anonymousClass35.addView(this.outlineTextFirstRow, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.outlineTextSecondRow = new OutlineTextContainerView(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.editTextSecondRow = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int iDp2 = AndroidUtilities.dp(16.0f);
                this.editTextSecondRow.setPadding(iDp2, iDp2, iDp2, iDp2);
                this.editTextSecondRow.setCursorColor(Theme.getColor(null, i8, false));
                this.editTextSecondRow.setTextColor(Theme.getColor(null, i4, false));
                this.editTextSecondRow.setBackground(null);
                final int i11 = 1;
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
                    public final boolean onEditorAction(TextView textView5, int i12, KeyEvent keyEvent) {
                        switch (i11) {
                            case 0:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                                twoStepVerificationSetupActivity.getClass();
                                if (i12 != 5 && i12 != 6) {
                                    return false;
                                }
                                if (twoStepVerificationSetupActivity.outlineTextSecondRow.getVisibility() == 0) {
                                    twoStepVerificationSetupActivity.editTextSecondRow.requestFocus();
                                } else {
                                    twoStepVerificationSetupActivity.processNext$1();
                                }
                                return true;
                            default:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                                twoStepVerificationSetupActivity2.getClass();
                                if (i12 != 5 && i12 != 6) {
                                    return false;
                                }
                                twoStepVerificationSetupActivity2.processNext$1();
                                return true;
                        }
                    }
                });
                OutlineTextContainerView outlineTextContainerView3 = this.outlineTextSecondRow;
                outlineTextContainerView3.attachedEditText = this.editTextSecondRow;
                outlineTextContainerView3.invalidate();
                this.editTextSecondRow.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z) {
                        switch (i11) {
                            case 0:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                                if (!z) {
                                    twoStepVerificationSetupActivity.getClass();
                                } else {
                                    twoStepVerificationSetupActivity.keyboardView.setEditText((EditText) view);
                                    twoStepVerificationSetupActivity.keyboardView.setDispatchBackWhenEmpty(true);
                                }
                                break;
                            case 1:
                                OutlineTextContainerView outlineTextContainerView4 = this.f$0.outlineTextSecondRow;
                                float f = z ? 1.0f : 0.0f;
                                outlineTextContainerView4.animateSelection(f, f, true);
                                break;
                            default:
                                OutlineTextContainerView outlineTextContainerView5 = this.f$0.outlineTextFirstRow;
                                float f2 = z ? 1.0f : 0.0f;
                                outlineTextContainerView5.animateSelection(f2, f2, true);
                                break;
                        }
                    }
                });
                this.outlineTextSecondRow.addView(this.editTextSecondRow, LayoutHelper.createFrame(-2.0f, -1));
                anonymousClass35.addView(this.outlineTextSecondRow, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.outlineTextSecondRow.setVisibility(8);
                CustomPhoneKeyboardView customPhoneKeyboardView = new CustomPhoneKeyboardView(context);
                this.keyboardView = customPhoneKeyboardView;
                customPhoneKeyboardView.setVisibility(8);
                anonymousClass2.addView(this.keyboardView);
                PasscodeActivity.AnonymousClass8 anonymousClass8 = new PasscodeActivity.AnonymousClass8(this, context, 3);
                this.codeFieldContainer = anonymousClass8;
                final int i12 = 1;
                anonymousClass8.setNumbersCount(6, 1);
                for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                    codeNumberField.setShowSoftInputOnFocusCompat(!isCustomKeyboardVisible$2());
                    codeNumberField.addTextChangedListener(new TextWatcher(this) {
                        public final TwoStepVerificationSetupActivity this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public final void afterTextChanged(Editable editable) {
                            RLottieDrawable rLottieDrawable;
                            switch (i12) {
                                case 0:
                                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.this$0;
                                    if (twoStepVerificationSetupActivity.needPasswordButton) {
                                        if (twoStepVerificationSetupActivity.showPasswordButton.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                                            AndroidUtilities.updateViewVisibilityAnimated(twoStepVerificationSetupActivity.showPasswordButton, true, 0.1f, true);
                                            break;
                                        } else if (twoStepVerificationSetupActivity.showPasswordButton.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                                            AndroidUtilities.updateViewVisibilityAnimated(twoStepVerificationSetupActivity.showPasswordButton, false, 0.1f, true);
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    this.this$0.getClass();
                                    break;
                                default:
                                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.this$0;
                                    if (!twoStepVerificationSetupActivity2.ignoreTextChange) {
                                        int i13 = twoStepVerificationSetupActivity2.currentType;
                                        if (i13 == 0) {
                                            RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity2.imageView.getAnimatedDrawable();
                                            if (twoStepVerificationSetupActivity2.editTextFirstRow.length() <= 0) {
                                                if (animatedDrawable != twoStepVerificationSetupActivity2.animationDrawables[3] || twoStepVerificationSetupActivity2.editTextFirstRow.getTransformationMethod() != null) {
                                                    RLottieDrawable[] rLottieDrawableArr = twoStepVerificationSetupActivity2.animationDrawables;
                                                    if (animatedDrawable != rLottieDrawableArr[5]) {
                                                        rLottieDrawableArr[2].setCustomEndFrame(-1);
                                                        RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity2.animationDrawables[2];
                                                        if (animatedDrawable != rLottieDrawable2) {
                                                            twoStepVerificationSetupActivity2.imageView.setAnimation(rLottieDrawable2);
                                                            twoStepVerificationSetupActivity2.animationDrawables[2].setCurrentFrame(49, false, false);
                                                        }
                                                        twoStepVerificationSetupActivity2.imageView.playAnimation();
                                                    }
                                                }
                                                twoStepVerificationSetupActivity2.imageView.setAnimation(twoStepVerificationSetupActivity2.animationDrawables[4]);
                                                twoStepVerificationSetupActivity2.animationDrawables[4].setProgress(0.0f, false);
                                                twoStepVerificationSetupActivity2.imageView.playAnimation();
                                                break;
                                            } else if (twoStepVerificationSetupActivity2.editTextFirstRow.getTransformationMethod() != null) {
                                                RLottieDrawable[] rLottieDrawableArr2 = twoStepVerificationSetupActivity2.animationDrawables;
                                                if (animatedDrawable != rLottieDrawableArr2[3]) {
                                                    RLottieDrawable rLottieDrawable3 = rLottieDrawableArr2[2];
                                                    if (animatedDrawable != rLottieDrawable3) {
                                                        twoStepVerificationSetupActivity2.imageView.setAnimation(rLottieDrawable3);
                                                        twoStepVerificationSetupActivity2.animationDrawables[2].setCustomEndFrame(49);
                                                        twoStepVerificationSetupActivity2.animationDrawables[2].setProgress(0.0f, false);
                                                        twoStepVerificationSetupActivity2.imageView.playAnimation();
                                                    } else if (rLottieDrawable3.currentFrame < 49) {
                                                        rLottieDrawable3.setCustomEndFrame(49);
                                                    }
                                                }
                                                break;
                                            } else {
                                                RLottieDrawable[] rLottieDrawableArr3 = twoStepVerificationSetupActivity2.animationDrawables;
                                                if (animatedDrawable != rLottieDrawableArr3[3] && animatedDrawable != (rLottieDrawable = rLottieDrawableArr3[5])) {
                                                    twoStepVerificationSetupActivity2.imageView.setAnimation(rLottieDrawable);
                                                    twoStepVerificationSetupActivity2.animationDrawables[5].setProgress(0.0f, false);
                                                    twoStepVerificationSetupActivity2.imageView.playAnimation();
                                                    break;
                                                }
                                            }
                                        } else if (i13 == 1) {
                                            try {
                                                twoStepVerificationSetupActivity2.animationDrawables[6].setCustomEndFrame((int) ((Math.min(1.0f, twoStepVerificationSetupActivity2.editTextFirstRow.getLayout().getLineWidth(0) / twoStepVerificationSetupActivity2.editTextFirstRow.getWidth()) * 142.0f) + 18.0f));
                                                twoStepVerificationSetupActivity2.imageView.playAnimation();
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                            break;
                                        } else if (i13 == 8 && editable.length() > 0) {
                                            twoStepVerificationSetupActivity2.showDoneButton(true);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }

                        @Override
                        public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
                            int i16 = i12;
                        }

                        @Override
                        public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
                            int i16 = i12;
                        }

                        private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$11(int i13, int i14, int i15, CharSequence charSequence) {
                        }

                        private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$13(int i13, int i14, int i15, CharSequence charSequence) {
                        }

                        private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$9(int i13, int i14, int i15, CharSequence charSequence) {
                        }

                        private final void onTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$11(int i13, int i14, int i15, CharSequence charSequence) {
                        }

                        private final void onTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$13(int i13, int i14, int i15, CharSequence charSequence) {
                        }

                        private final void onTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$9(int i13, int i14, int i15, CharSequence charSequence) {
                        }
                    });
                    codeNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final TwoStepVerificationSetupActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z) {
                            switch (i3) {
                                case 0:
                                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                                    if (!z) {
                                        twoStepVerificationSetupActivity.getClass();
                                    } else {
                                        twoStepVerificationSetupActivity.keyboardView.setEditText((EditText) view);
                                        twoStepVerificationSetupActivity.keyboardView.setDispatchBackWhenEmpty(true);
                                    }
                                    break;
                                case 1:
                                    OutlineTextContainerView outlineTextContainerView4 = this.f$0.outlineTextSecondRow;
                                    float f = z ? 1.0f : 0.0f;
                                    outlineTextContainerView4.animateSelection(f, f, true);
                                    break;
                                default:
                                    OutlineTextContainerView outlineTextContainerView5 = this.f$0.outlineTextFirstRow;
                                    float f2 = z ? 1.0f : 0.0f;
                                    outlineTextContainerView5.animateSelection(f2, f2, true);
                                    break;
                            }
                        }
                    });
                }
                this.codeFieldContainer.setVisibility(8);
                anonymousClass35.addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                anonymousClass35.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.descriptionText2, LayoutHelper.createFrame(-2, -2, 49));
                if (i5 == 4) {
                    TextView textView5 = new TextView(context);
                    this.descriptionText3 = textView5;
                    textView5.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
                    this.descriptionText3.setGravity(1);
                    this.descriptionText3.setTextSize(1, 14.0f);
                    this.descriptionText3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.descriptionText3.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.descriptionText3.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    anonymousClass35.addView(this.descriptionText3, LayoutHelper.createLinear(-2, -2, 49, 0, 0, 0, 25));
                    final int i13 = 1;
                    this.descriptionText3.setOnClickListener(new View.OnClickListener(this) {
                        public final TwoStepVerificationSetupActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    this.f$0.processNext$1();
                                    break;
                                case 1:
                                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                                    AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity(), 0, null);
                                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                    builder.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity, 1));
                                    String string = LocaleController.getString(R.string.ResetPassword);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string;
                                    alertDialog.message = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    twoStepVerificationSetupActivity.showDialog(alertDialog);
                                    break;
                                case 2:
                                    this.f$0.lambda$createView$20$2$1();
                                    break;
                                case 3:
                                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                                    if (twoStepVerificationSetupActivity2.bottomSkipButton.getAlpha() >= 0.5f) {
                                        int i14 = twoStepVerificationSetupActivity2.currentType;
                                        if (i14 == 0) {
                                            twoStepVerificationSetupActivity2.needShowProgress$2();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = twoStepVerificationSetupActivity2.emailCode;
                                            twoStepVerificationSetupActivity2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(twoStepVerificationSetupActivity2, 0));
                                        } else if (i14 == 3) {
                                            AlertDialog.Builder builder2 = new AlertDialog.Builder(twoStepVerificationSetupActivity2.getParentActivity(), 0, null);
                                            String string2 = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            AlertDialog alertDialog2 = builder2.alertDialog;
                                            alertDialog2.message = string2;
                                            alertDialog2.title = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            builder2.setPositiveButton(LocaleController.getString(R.string.YourEmailSkip), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity2, 2));
                                            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                            twoStepVerificationSetupActivity2.showDialog(alertDialog2);
                                            TextView textView6 = (TextView) alertDialog2.getButton(-1);
                                            if (textView6 != null) {
                                                textView6.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                            }
                                        } else if (i14 == 2) {
                                            twoStepVerificationSetupActivity2.onHintDone();
                                        }
                                        break;
                                    }
                                    break;
                                case 4:
                                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = this.f$0;
                                    if (twoStepVerificationSetupActivity3.currentType == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.forgotPasswordOnShow = true;
                                        twoStepVerificationActivity.currentPassword = twoStepVerificationSetupActivity3.currentPassword;
                                        twoStepVerificationActivity.passwordEntered = false;
                                        twoStepVerificationActivity.otherwiseReloginDays = twoStepVerificationSetupActivity3.otherwiseReloginDays;
                                        twoStepVerificationSetupActivity3.presentFragment(twoStepVerificationActivity, true);
                                        LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = twoStepVerificationSetupActivity3.openedSettings;
                                        if (linkManager$$ExternalSyntheticLambda7 != null) {
                                            AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                            twoStepVerificationSetupActivity3.openedSettings = null;
                                        }
                                    }
                                    break;
                                case 5:
                                    this.f$0.processNext$1();
                                    break;
                                default:
                                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity4 = this.f$0;
                                    twoStepVerificationSetupActivity4.ignoreTextChange = true;
                                    TransformationMethod transformationMethod = twoStepVerificationSetupActivity4.editTextFirstRow.getTransformationMethod();
                                    int i15 = twoStepVerificationSetupActivity4.currentType;
                                    if (transformationMethod == null) {
                                        twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
                                        if (i15 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                            twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(-1);
                                            RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                            RLottieDrawable rLottieDrawable = twoStepVerificationSetupActivity4.animationDrawables[3];
                                            if (animatedDrawable != rLottieDrawable) {
                                                twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable);
                                                twoStepVerificationSetupActivity4.animationDrawables[3].setCurrentFrame(18, false, false);
                                            }
                                            twoStepVerificationSetupActivity4.imageView.playAnimation();
                                        }
                                    } else {
                                        twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(null);
                                        twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelSend, false), PorterDuff.Mode.MULTIPLY));
                                        if (i15 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                            twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(18);
                                            RLottieDrawable animatedDrawable2 = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                            RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity4.animationDrawables[3];
                                            if (animatedDrawable2 != rLottieDrawable2) {
                                                twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable2);
                                            }
                                            twoStepVerificationSetupActivity4.animationDrawables[3].setProgress(0.0f, false);
                                            twoStepVerificationSetupActivity4.imageView.playAnimation();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor4 = twoStepVerificationSetupActivity4.editTextFirstRow;
                                    editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
                                    twoStepVerificationSetupActivity4.ignoreTextChange = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = anonymousClass3;
                ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(this, context);
                this.actionBarBackground = anonymousClass27;
                anonymousClass27.setAlpha(0.0f);
                anonymousClass3.addView(this.actionBarBackground);
                anonymousClass3.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.radialProgressView = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.radialProgressView.setAlpha(0.0f);
                this.radialProgressView.setScaleX(0.1f);
                this.radialProgressView.setScaleY(0.1f);
                this.radialProgressView.setProgressColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false));
                anonymousClass4.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                ActionIntroActivity.AnonymousClass2 anonymousClass7 = new ActionIntroActivity.AnonymousClass2(this, context, i);
                anonymousClass7.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
                anonymousClass7.addView(this.actionBar);
                anonymousClass7.addView(this.imageView);
                anonymousClass7.addView(this.titleTextView);
                anonymousClass7.addView(this.descriptionText);
                anonymousClass7.addView(this.buttonTextView);
                this.fragmentView = anonymousClass7;
                break;
        }
        this.fragmentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        switch (i5) {
            case 0:
            case 1:
                if (this.currentPassword.has_password) {
                    ActionBar actionBar2 = this.actionBar;
                    int i14 = R.string.PleaseEnterNewFirstPassword;
                    actionBar2.setTitle(LocaleController.getString(i14));
                    this.titleTextView.setText(LocaleController.getString(i14));
                } else {
                    String string = LocaleController.getString(i5 == 0 ? R.string.CreatePassword : R.string.ReEnterPassword);
                    this.actionBar.setTitle(string);
                    this.titleTextView.setText(string);
                }
                if (!TextUtils.isEmpty(this.emailCode)) {
                    this.bottomSkipButton.setVisibility(0);
                    this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.outlineTextFirstRow.setText(LocaleController.getString(i5 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i5 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.editTextFirstRow.setImeOptions(268435461);
                this.editTextFirstRow.setInputType(129);
                this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                this.needPasswordButton = i5 == 0;
                AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                RLottieDrawable[] rLottieDrawableArr = new RLottieDrawable[7];
                this.animationDrawables = rLottieDrawableArr;
                int i15 = R.raw.tsv_setup_monkey_idle1;
                rLottieDrawableArr[0] = new RLottieDrawable(i15, SurfaceContainer$$ExternalSyntheticOutline0.m(i15, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr2 = this.animationDrawables;
                int i16 = R.raw.tsv_setup_monkey_idle2;
                rLottieDrawableArr2[1] = new RLottieDrawable(i16, SurfaceContainer$$ExternalSyntheticOutline0.m(i16, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr3 = this.animationDrawables;
                int i17 = R.raw.tsv_monkey_close;
                rLottieDrawableArr3[2] = new RLottieDrawable(i17, SurfaceContainer$$ExternalSyntheticOutline0.m(i17, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr4 = this.animationDrawables;
                int i18 = R.raw.tsv_setup_monkey_peek;
                rLottieDrawableArr4[3] = new RLottieDrawable(i18, SurfaceContainer$$ExternalSyntheticOutline0.m(i18, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr5 = this.animationDrawables;
                int i19 = R.raw.tsv_setup_monkey_close_and_peek_to_idle;
                rLottieDrawableArr5[4] = new RLottieDrawable(i19, SurfaceContainer$$ExternalSyntheticOutline0.m(i19, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr6 = this.animationDrawables;
                int i20 = R.raw.tsv_setup_monkey_close_and_peek;
                rLottieDrawableArr6[5] = new RLottieDrawable(i20, SurfaceContainer$$ExternalSyntheticOutline0.m(i20, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr7 = this.animationDrawables;
                int i21 = R.raw.tsv_setup_monkey_tracking;
                rLottieDrawableArr7[6] = new RLottieDrawable(i21, SurfaceContainer$$ExternalSyntheticOutline0.m(i21, ""), AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable rLottieDrawable = this.animationDrawables[6];
                rLottieDrawable.playInDirectionOfCustomEndFrame = true;
                rLottieDrawable.setCustomEndFrame(19);
                this.animationDrawables[2].setOnFinishCallback(97, this.finishCallback);
                setRandomMonkeyIdleAnimation(true);
                if (i5 == 1) {
                    TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12 twoStepVerificationSetupActivity$$ExternalSyntheticLambda12 = this.setAnimationRunnable;
                    if (twoStepVerificationSetupActivity$$ExternalSyntheticLambda12 != null) {
                        AndroidUtilities.cancelRunOnUIThread(twoStepVerificationSetupActivity$$ExternalSyntheticLambda12);
                    }
                    this.imageView.setAnimation(this.animationDrawables[6]);
                    this.imageView.playAnimation();
                } else {
                    this.editTextFirstRow.dispatchTextWatchersTextChanged();
                    setRandomMonkeyIdleAnimation(true);
                }
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
                OutlineTextContainerView outlineTextContainerView4 = this.outlineTextFirstRow;
                int i23 = R.string.PasswordHintPlaceholder;
                outlineTextContainerView4.setText(LocaleController.getString(i23));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i23));
                this.editTextFirstRow.setImeOptions(268435461);
                this.outlineTextSecondRow.setVisibility(8);
                this.imageView.setAnimation(R.raw.tsv_setup_hint, 120, 120, null);
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
                OutlineTextContainerView outlineTextContainerView5 = this.outlineTextFirstRow;
                int i25 = R.string.PaymentShippingEmailPlaceholder;
                outlineTextContainerView5.setText(LocaleController.getString(i25));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i25));
                this.editTextFirstRow.setImeOptions(268435461);
                this.editTextFirstRow.setInputType(33);
                this.outlineTextSecondRow.setVisibility(8);
                this.imageView.setAnimation(R.raw.tsv_setup_email_sent, 120, 120, null);
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
                    spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun, 0), iIndexOf, i27, 0);
                }
                this.descriptionText.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf));
                this.descriptionText.setVisibility(0);
                this.floatingButton.animatorButtonVisible.setValue(false, false);
                this.codeFieldContainer.setVisibility(0);
                this.imageView.setAnimation(R.raw.tsv_setup_mail, 120, 120, null);
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
                SpoilersTextView spoilersTextView2 = this.descriptionText;
                int i29 = R.string.EmailPasswordConfirmText2;
                String str3 = this.currentPassword.email_unconfirmed_pattern;
                spoilersTextView2.setText(LocaleController.formatString("EmailPasswordConfirmText2", i29, str3 != null ? str3 : ""));
                this.descriptionText.setVisibility(0);
                this.floatingButton.animatorButtonVisible.setValue(false, false);
                this.bottomSkipButton.setVisibility(0);
                this.bottomSkipButton.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.bottomSkipButton.getLayoutParams()).bottomMargin = 0;
                this.bottomSkipButton.setText(LocaleController.getString(R.string.ResendCode));
                final int i30 = 2;
                this.bottomSkipButton.setOnClickListener(new View.OnClickListener(this) {
                    public final TwoStepVerificationSetupActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i30) {
                            case 0:
                                this.f$0.processNext$1();
                                break;
                            case 1:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                                AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity(), 0, null);
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                builder.setPositiveButton(LocaleController.getString(R.string.Reset), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity, 1));
                                String string2 = LocaleController.getString(R.string.ResetPassword);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string2;
                                alertDialog.message = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                twoStepVerificationSetupActivity.showDialog(alertDialog);
                                break;
                            case 2:
                                this.f$0.lambda$createView$20$2$1();
                                break;
                            case 3:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                                if (twoStepVerificationSetupActivity2.bottomSkipButton.getAlpha() >= 0.5f) {
                                    int i110 = twoStepVerificationSetupActivity2.currentType;
                                    if (i110 == 0) {
                                        twoStepVerificationSetupActivity2.needShowProgress$2();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = twoStepVerificationSetupActivity2.emailCode;
                                        twoStepVerificationSetupActivity2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(twoStepVerificationSetupActivity2, 0));
                                    } else if (i110 == 3) {
                                        AlertDialog.Builder builder2 = new AlertDialog.Builder(twoStepVerificationSetupActivity2.getParentActivity(), 0, null);
                                        String string3 = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        AlertDialog alertDialog2 = builder2.alertDialog;
                                        alertDialog2.message = string3;
                                        alertDialog2.title = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        builder2.setPositiveButton(LocaleController.getString(R.string.YourEmailSkip), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity2, 2));
                                        builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                        twoStepVerificationSetupActivity2.showDialog(alertDialog2);
                                        TextView textView6 = (TextView) alertDialog2.getButton(-1);
                                        if (textView6 != null) {
                                            textView6.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                    } else if (i110 == 2) {
                                        twoStepVerificationSetupActivity2.onHintDone();
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = this.f$0;
                                if (twoStepVerificationSetupActivity3.currentType == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.forgotPasswordOnShow = true;
                                    twoStepVerificationActivity.currentPassword = twoStepVerificationSetupActivity3.currentPassword;
                                    twoStepVerificationActivity.passwordEntered = false;
                                    twoStepVerificationActivity.otherwiseReloginDays = twoStepVerificationSetupActivity3.otherwiseReloginDays;
                                    twoStepVerificationSetupActivity3.presentFragment(twoStepVerificationActivity, true);
                                    LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = twoStepVerificationSetupActivity3.openedSettings;
                                    if (linkManager$$ExternalSyntheticLambda7 != null) {
                                        AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                                        twoStepVerificationSetupActivity3.openedSettings = null;
                                    }
                                }
                                break;
                            case 5:
                                this.f$0.processNext$1();
                                break;
                            default:
                                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity4 = this.f$0;
                                twoStepVerificationSetupActivity4.ignoreTextChange = true;
                                TransformationMethod transformationMethod = twoStepVerificationSetupActivity4.editTextFirstRow.getTransformationMethod();
                                int i111 = twoStepVerificationSetupActivity4.currentType;
                                if (transformationMethod == null) {
                                    twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelIcons, false), PorterDuff.Mode.MULTIPLY));
                                    if (i111 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                        twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(-1);
                                        RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                        RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity4.animationDrawables[3];
                                        if (animatedDrawable != rLottieDrawable2) {
                                            twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable2);
                                            twoStepVerificationSetupActivity4.animationDrawables[3].setCurrentFrame(18, false, false);
                                        }
                                        twoStepVerificationSetupActivity4.imageView.playAnimation();
                                    }
                                } else {
                                    twoStepVerificationSetupActivity4.editTextFirstRow.setTransformationMethod(null);
                                    twoStepVerificationSetupActivity4.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_messagePanelSend, false), PorterDuff.Mode.MULTIPLY));
                                    if (i111 == 0 && twoStepVerificationSetupActivity4.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity4.editTextFirstRow.hasFocus()) {
                                        twoStepVerificationSetupActivity4.animationDrawables[3].setCustomEndFrame(18);
                                        RLottieDrawable animatedDrawable2 = twoStepVerificationSetupActivity4.imageView.getAnimatedDrawable();
                                        RLottieDrawable rLottieDrawable3 = twoStepVerificationSetupActivity4.animationDrawables[3];
                                        if (animatedDrawable2 != rLottieDrawable3) {
                                            twoStepVerificationSetupActivity4.imageView.setAnimation(rLottieDrawable3);
                                        }
                                        twoStepVerificationSetupActivity4.animationDrawables[3].setProgress(0.0f, false);
                                        twoStepVerificationSetupActivity4.imageView.playAnimation();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor4 = twoStepVerificationSetupActivity4.editTextFirstRow;
                                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
                                twoStepVerificationSetupActivity4.ignoreTextChange = false;
                                break;
                        }
                    }
                });
                this.codeFieldContainer.setVisibility(0);
                this.imageView.setAnimation(R.raw.tsv_setup_mail, 120, 120, null);
                this.imageView.playAnimation();
                break;
            case 6:
                this.titleTextView.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.descriptionText.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(R.raw.tsv_setup_intro, 140, 140, null);
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
                this.imageView.setAnimation(R.raw.wallet_allset, 160, 160, null);
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
                OutlineTextContainerView outlineTextContainerView6 = this.outlineTextFirstRow;
                int i32 = R.string.LoginPassword;
                outlineTextContainerView6.setText(LocaleController.getString(i32));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i32));
                this.editTextFirstRow.setImeOptions(268435462);
                this.editTextFirstRow.setInputType(129);
                this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                this.imageView.setAnimation(R.raw.wallet_science, 120, 120, null);
                this.imageView.playAnimation();
                break;
            case 9:
                this.titleTextView.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.buttonTextView.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(R.raw.wallet_perfect, 140, 140, null);
                this.imageView.playAnimation();
                break;
        }
        EditTextBoldCursor editTextBoldCursor4 = this.editTextFirstRow;
        if (editTextBoldCursor4 != null) {
            final int i33 = 2;
            editTextBoldCursor4.addTextChangedListener(new TextWatcher(this) {
                public final TwoStepVerificationSetupActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void afterTextChanged(Editable editable) {
                    RLottieDrawable rLottieDrawable2;
                    switch (i33) {
                        case 0:
                            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.this$0;
                            if (twoStepVerificationSetupActivity.needPasswordButton) {
                                if (twoStepVerificationSetupActivity.showPasswordButton.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                                    AndroidUtilities.updateViewVisibilityAnimated(twoStepVerificationSetupActivity.showPasswordButton, true, 0.1f, true);
                                    break;
                                } else if (twoStepVerificationSetupActivity.showPasswordButton.getVisibility() != 8 && TextUtils.isEmpty(editable)) {
                                    AndroidUtilities.updateViewVisibilityAnimated(twoStepVerificationSetupActivity.showPasswordButton, false, 0.1f, true);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            this.this$0.getClass();
                            break;
                        default:
                            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.this$0;
                            if (!twoStepVerificationSetupActivity2.ignoreTextChange) {
                                int i110 = twoStepVerificationSetupActivity2.currentType;
                                if (i110 == 0) {
                                    RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity2.imageView.getAnimatedDrawable();
                                    if (twoStepVerificationSetupActivity2.editTextFirstRow.length() <= 0) {
                                        if (animatedDrawable != twoStepVerificationSetupActivity2.animationDrawables[3] || twoStepVerificationSetupActivity2.editTextFirstRow.getTransformationMethod() != null) {
                                            RLottieDrawable[] rLottieDrawableArr8 = twoStepVerificationSetupActivity2.animationDrawables;
                                            if (animatedDrawable != rLottieDrawableArr8[5]) {
                                                rLottieDrawableArr8[2].setCustomEndFrame(-1);
                                                RLottieDrawable rLottieDrawable3 = twoStepVerificationSetupActivity2.animationDrawables[2];
                                                if (animatedDrawable != rLottieDrawable3) {
                                                    twoStepVerificationSetupActivity2.imageView.setAnimation(rLottieDrawable3);
                                                    twoStepVerificationSetupActivity2.animationDrawables[2].setCurrentFrame(49, false, false);
                                                }
                                                twoStepVerificationSetupActivity2.imageView.playAnimation();
                                            }
                                        }
                                        twoStepVerificationSetupActivity2.imageView.setAnimation(twoStepVerificationSetupActivity2.animationDrawables[4]);
                                        twoStepVerificationSetupActivity2.animationDrawables[4].setProgress(0.0f, false);
                                        twoStepVerificationSetupActivity2.imageView.playAnimation();
                                        break;
                                    } else if (twoStepVerificationSetupActivity2.editTextFirstRow.getTransformationMethod() != null) {
                                        RLottieDrawable[] rLottieDrawableArr9 = twoStepVerificationSetupActivity2.animationDrawables;
                                        if (animatedDrawable != rLottieDrawableArr9[3]) {
                                            RLottieDrawable rLottieDrawable4 = rLottieDrawableArr9[2];
                                            if (animatedDrawable != rLottieDrawable4) {
                                                twoStepVerificationSetupActivity2.imageView.setAnimation(rLottieDrawable4);
                                                twoStepVerificationSetupActivity2.animationDrawables[2].setCustomEndFrame(49);
                                                twoStepVerificationSetupActivity2.animationDrawables[2].setProgress(0.0f, false);
                                                twoStepVerificationSetupActivity2.imageView.playAnimation();
                                            } else if (rLottieDrawable4.currentFrame < 49) {
                                                rLottieDrawable4.setCustomEndFrame(49);
                                            }
                                        }
                                        break;
                                    } else {
                                        RLottieDrawable[] rLottieDrawableArr10 = twoStepVerificationSetupActivity2.animationDrawables;
                                        if (animatedDrawable != rLottieDrawableArr10[3] && animatedDrawable != (rLottieDrawable2 = rLottieDrawableArr10[5])) {
                                            twoStepVerificationSetupActivity2.imageView.setAnimation(rLottieDrawable2);
                                            twoStepVerificationSetupActivity2.animationDrawables[5].setProgress(0.0f, false);
                                            twoStepVerificationSetupActivity2.imageView.playAnimation();
                                            break;
                                        }
                                    }
                                } else if (i110 == 1) {
                                    try {
                                        twoStepVerificationSetupActivity2.animationDrawables[6].setCustomEndFrame((int) ((Math.min(1.0f, twoStepVerificationSetupActivity2.editTextFirstRow.getLayout().getLineWidth(0) / twoStepVerificationSetupActivity2.editTextFirstRow.getWidth()) * 142.0f) + 18.0f));
                                        twoStepVerificationSetupActivity2.imageView.playAnimation();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                    break;
                                } else if (i110 == 8 && editable.length() > 0) {
                                    twoStepVerificationSetupActivity2.showDoneButton(true);
                                    break;
                                }
                            }
                            break;
                    }
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i110, int i111, int i112) {
                    int i113 = i33;
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i110, int i111, int i112) {
                    int i113 = i33;
                }

                private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$11(int i110, int i111, int i112, CharSequence charSequence) {
                }

                private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$13(int i110, int i111, int i112, CharSequence charSequence) {
                }

                private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$9(int i110, int i111, int i112, CharSequence charSequence) {
                }

                private final void onTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$11(int i110, int i111, int i112, CharSequence charSequence) {
                }

                private final void onTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$13(int i110, int i111, int i112, CharSequence charSequence) {
                }

                private final void onTextChanged$org$telegram$ui$TwoStepVerificationSetupActivity$9(int i110, int i111, int i112, CharSequence charSequence) {
                }
            });
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z) {
        for (BaseFragment baseFragment : ((ActionBarLayout) getParentLayout()).getFragmentStack()) {
            if (baseFragment != this && (baseFragment instanceof TwoStepVerificationSetupActivity)) {
                ((VerticalPositionAutoAnimator$AnimatorLayoutChangeListener) ((TwoStepVerificationSetupActivity) baseFragment).floatingAutoAnimator.blur).ignoreNextLayout = true;
            }
        }
        return super.finishFragment(z);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i = this.currentType;
        return i == 7 || i == 9;
    }

    public final boolean isCustomKeyboardVisible$2() {
        int i = this.currentType;
        if ((i != 5 && i != 4) || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    @Override
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.otherwiseReloginDays < 0 || ((ActionBarLayout) this.parentLayout).getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void lambda$createView$20$2$1() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new PassportActivity$$ExternalSyntheticLambda1(1));
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.ResendCodeInfo);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.message = string;
        alertDialog.title = LocaleController.getString(R.string.TwoStepVerificationTitle);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog);
    }

    public final void lambda$createView$3$1$4() {
        ArrayList arrayList = this.fragmentsToClose;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BaseFragment) arrayList.get(i)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        finishFragment();
    }

    public final void lambda$loadPasswordInfo$41(TLObject tLObject, TLRPC.TL_error tL_error) {
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
                processNext$1();
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        }
    }

    public final void lambda$processNext$24(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
            processNext$1();
        }
    }

    public final void lambda$processNext$26(TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, 4), 8);
            return;
        }
        needHideProgress();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            this.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            this.descriptionText.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
            onFieldError$1(this.outlineTextFirstRow, this.editTextFirstRow, true);
            showDoneButton(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            showAlertWithText$3(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            showAlertWithText$3(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
        }
    }

    public final void lambda$processNext$28(byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.current_algo;
        byte[] x = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        ThemeSetUrlActivity$$ExternalSyntheticLambda6 themeSetUrlActivity$$ExternalSyntheticLambda6 = new ThemeSetUrlActivity$$ExternalSyntheticLambda6(8, this, x);
        TL_account.Password password = this.currentPassword;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            themeSetUrlActivity$$ExternalSyntheticLambda6.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, themeSetUrlActivity$$ExternalSyntheticLambda6, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        themeSetUrlActivity$$ExternalSyntheticLambda6.run(null, tL_error2);
    }

    public final void lambda$processNext$29(String str) {
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 0, this.currentPassword);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        ArrayList arrayList = twoStepVerificationSetupActivity.fragmentsToClose;
        arrayList.addAll(this.fragmentsToClose);
        arrayList.add(this);
        twoStepVerificationSetupActivity.emailCode = str;
        twoStepVerificationSetupActivity.otherwiseReloginDays = this.otherwiseReloginDays;
        presentFragment(twoStepVerificationSetupActivity, true);
    }

    public final void lambda$processNext$32() {
        ArrayList arrayList = this.fragmentsToClose;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BaseFragment) arrayList.get(i)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i2 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = this.currentPasswordHash;
        TL_account.Password password = this.currentPassword;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i2, bArr, password.new_algo, password.new_secure_algo, password.secure_random, this.email, this.hint, null, this.firstPassword);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = this.currentPassword;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.setCurrentPasswordParams(password2, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
        twoStepVerificationActivity.otherwiseReloginDays = this.otherwiseReloginDays;
        presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = this.openedSettings;
        if (linkManager$$ExternalSyntheticLambda7 != null) {
            AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
            this.openedSettings = null;
        }
    }

    public final void lambda$processNext$33() {
        int i = 4;
        if (this.currentPassword.has_password) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(this, i));
            boolean z = this.currentPassword.has_recovery;
            AlertDialog alertDialog = builder.alertDialog;
            if (z) {
                alertDialog.message = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                alertDialog.message = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            alertDialog.title = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog dialogShowDialog = showDialog(alertDialog);
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
                return;
            }
            return;
        }
        ArrayList arrayList = this.fragmentsToClose;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((BaseFragment) arrayList.get(i2)).removeSelfFromStack();
        }
        TL_account.Password password = this.currentPassword;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(7, password);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        byte[] bArr = this.currentPasswordHash;
        long j = this.currentSecretId;
        byte[] bArr2 = this.currentSecret;
        boolean z2 = this.emailOnly;
        twoStepVerificationSetupActivity.currentPasswordHash = bArr;
        twoStepVerificationSetupActivity.currentSecret = bArr2;
        twoStepVerificationSetupActivity.currentSecretId = j;
        twoStepVerificationSetupActivity.emailOnly = z2;
        twoStepVerificationSetupActivity.fragmentsToClose.addAll(arrayList);
        twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
        twoStepVerificationSetupActivity.otherwiseReloginDays = this.otherwiseReloginDays;
        presentFragment(twoStepVerificationSetupActivity, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i3 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr3 = this.currentPasswordHash;
        TL_account.Password password2 = this.currentPassword;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i3, bArr3, password2.new_algo, password2.new_secure_algo, password2.secure_random, this.email, this.hint, null, this.firstPassword);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
    }

    public final void lambda$setNewPassword$43(TLRPC.TL_error tL_error) {
        needHideProgress();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = this.currentPassword;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.setCurrentPasswordParams(password, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
            twoStepVerificationActivity.otherwiseReloginDays = this.otherwiseReloginDays;
            presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = this.openedSettings;
            if (linkManager$$ExternalSyntheticLambda7 != null) {
                AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                this.openedSettings = null;
            }
        }
    }

    public final void lambda$setNewPassword$45(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            setNewPassword(z);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        }
    }

    public final void lambda$setNewPassword$47(byte[] bArr) {
        ArrayList arrayList = this.fragmentsToClose;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BaseFragment) arrayList.get(i)).removeSelfFromStack();
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
        twoStepVerificationActivity.otherwiseReloginDays = this.otherwiseReloginDays;
        presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = this.openedSettings;
        if (linkManager$$ExternalSyntheticLambda7 != null) {
            AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
            this.openedSettings = null;
        }
    }

    public final void lambda$setNewPassword$48(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        int i = 3;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new CallLogActivity$$ExternalSyntheticLambda31(12, this, z), 8);
            return;
        }
        needHideProgress();
        ArrayList arrayList = this.fragmentsToClose;
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        showAlertWithText$3(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        showAlertWithText$3(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        showAlertWithText$3(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                        return;
                    }
                }
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((BaseFragment) arrayList.get(i2)).removeSelfFromStack();
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
                if (bArr == null) {
                    bArr = this.currentPasswordHash;
                }
                long j = this.currentSecretId;
                byte[] bArr3 = this.currentSecret;
                boolean z2 = this.emailOnly;
                twoStepVerificationSetupActivity.currentPasswordHash = bArr;
                twoStepVerificationSetupActivity.currentSecret = bArr3;
                twoStepVerificationSetupActivity.currentSecretId = j;
                twoStepVerificationSetupActivity.emailOnly = z2;
                twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
                twoStepVerificationSetupActivity.otherwiseReloginDays = this.otherwiseReloginDays;
                presentFragment(twoStepVerificationSetupActivity, true);
                return;
            }
            return;
        }
        getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z) {
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((BaseFragment) arrayList.get(i4)).removeSelfFromStack();
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
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new TodoItemMenu$$ExternalSyntheticLambda19(i, this, bArr));
            AlertDialog alertDialog = builder.alertDialog;
            if (str == null && (password = this.currentPassword) != null && password.has_password) {
                alertDialog.message = LocaleController.getString(R.string.YourEmailSuccessText);
            } else {
                alertDialog.message = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
            }
            alertDialog.title = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog dialogShowDialog = showDialog(alertDialog);
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i5 = 0; i5 < size3; i5++) {
            ((BaseFragment) arrayList.get(i5)).removeSelfFromStack();
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
        if (bArr == null) {
            bArr = this.currentPasswordHash;
        }
        long j2 = this.currentSecretId;
        byte[] bArr4 = this.currentSecret;
        boolean z3 = this.emailOnly;
        twoStepVerificationSetupActivity2.currentPasswordHash = bArr;
        twoStepVerificationSetupActivity2.currentSecret = bArr4;
        twoStepVerificationSetupActivity2.currentSecretId = j2;
        twoStepVerificationSetupActivity2.emailOnly = z3;
        twoStepVerificationSetupActivity2.closeAfterSet = this.closeAfterSet;
        twoStepVerificationSetupActivity2.otherwiseReloginDays = this.otherwiseReloginDays;
        presentFragment(twoStepVerificationSetupActivity2, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
    }

    public final void lambda$setNewPassword$50(TLObject tLObject, boolean z, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] x;
        byte[] bArr;
        byte[] bArr2;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = this.currentPassword;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.startCheck(this.currentPasswordHash, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z || str == null) {
            x = null;
            bArr = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = this.currentPassword.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = stringBytes;
                x = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr = stringBytes;
                x = null;
            }
        }
        ContactsController$$ExternalSyntheticLambda37 contactsController$$ExternalSyntheticLambda37 = new ContactsController$$ExternalSyntheticLambda37(this, z, x, str, passwordinputsettings);
        if (z) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, contactsController$$ExternalSyntheticLambda37, 10);
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
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = this.currentPassword.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            contactsController$$ExternalSyntheticLambda37.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] vBytes = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = vBytes;
            if (vBytes == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                contactsController$$ExternalSyntheticLambda37.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, contactsController$$ExternalSyntheticLambda37, 10);
    }

    public final void needHideProgress() {
        this.floatingButton.animatorProgressVisible.setValue(false, true);
    }

    public final void needShowProgress$2() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.floatingButton.animatorProgressVisible.setValue(true, true);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.otherwiseReloginDays < 0 || ((ActionBarLayout) this.parentLayout).getFragmentStack().size() != 1) {
            if (z) {
                finishFragment();
            }
            return true;
        }
        if (!z) {
            return false;
        }
        showSetForcePasswordAlert$1();
        return false;
    }

    public final void onCodeFieldError() {
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            codeNumberField.setText("");
            CodeNumberField.animateSpring(codeNumberField.errorSpringAnimation, 100.0f);
        }
        this.codeFieldContainer.codeField[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.codeFieldContainer, 8.0f, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12(this, 5));
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.imageView != null) {
            int i = this.currentType;
            if (i == 2 && AndroidUtilities.isSmallScreen()) {
                this.imageView.setVisibility(8);
            } else if (i != 6 && i != 9 && i != 7) {
                RLottieImageView rLottieImageView = this.imageView;
                Point point = AndroidUtilities.displaySize;
                rLottieImageView.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        CustomPhoneKeyboardView customPhoneKeyboardView = this.keyboardView;
        if (customPhoneKeyboardView != null) {
            customPhoneKeyboardView.setVisibility(isCustomKeyboardVisible$2() ? 0 : 8);
        }
    }

    public final void onFieldError$1(OutlineTextContainerView outlineTextContainerView, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            editTextBoldCursor.setText("");
        }
        AndroidUtilities.shakeViewSpring(outlineTextContainerView, 5.0f);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.doneAfterPasswordLoad = false;
        TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12 twoStepVerificationSetupActivity$$ExternalSyntheticLambda12 = this.setAnimationRunnable;
        if (twoStepVerificationSetupActivity$$ExternalSyntheticLambda12 != null) {
            AndroidUtilities.cancelRunOnUIThread(twoStepVerificationSetupActivity$$ExternalSyntheticLambda12);
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
        if (isCustomKeyboardVisible$2()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    public final void onHintDone() {
        TL_account.Password password = this.currentPassword;
        if (password.has_recovery) {
            this.email = "";
            setNewPassword(false);
            return;
        }
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 3, password);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        byte[] bArr = this.currentPasswordHash;
        long j = this.currentSecretId;
        byte[] bArr2 = this.currentSecret;
        boolean z = this.emailOnly;
        twoStepVerificationSetupActivity.currentPasswordHash = bArr;
        twoStepVerificationSetupActivity.currentSecret = bArr2;
        twoStepVerificationSetupActivity.currentSecretId = j;
        twoStepVerificationSetupActivity.emailOnly = z;
        twoStepVerificationSetupActivity.firstPassword = this.firstPassword;
        twoStepVerificationSetupActivity.hint = this.hint;
        ArrayList arrayList = twoStepVerificationSetupActivity.fragmentsToClose;
        arrayList.addAll(this.fragmentsToClose);
        arrayList.add(this);
        twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
        twoStepVerificationSetupActivity.otherwiseReloginDays = this.otherwiseReloginDays;
        presentFragment(twoStepVerificationSetupActivity);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.paused = true;
    }

    public void onReset() {
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.paused = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (isCustomKeyboardVisible$2()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            if (this.editTextFirstRow != null && !isCustomKeyboardVisible$2()) {
                AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12(this, 0), 200L);
            }
            PasscodeActivity.AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
            if (anonymousClass8 == null || anonymousClass8.getVisibility() != 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12(this, 1), 200L);
        }
    }

    public final void processNext$1() {
        if (getParentActivity() == null) {
            return;
        }
        switch (this.currentType) {
            case 0:
            case 1:
                if (this.editTextFirstRow.length() == 0) {
                    onFieldError$1(this.outlineTextFirstRow, this.editTextFirstRow, false);
                } else if (this.editTextFirstRow.getText().toString().equals(this.firstPassword) || this.currentType != 1) {
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, this.currentType != 0 ? 2 : 1, this.currentPassword);
                    twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
                    twoStepVerificationSetupActivity.firstPassword = this.editTextFirstRow.getText().toString();
                    byte[] bArr = this.currentPasswordHash;
                    long j = this.currentSecretId;
                    byte[] bArr2 = this.currentSecret;
                    boolean z = this.emailOnly;
                    twoStepVerificationSetupActivity.currentPasswordHash = bArr;
                    twoStepVerificationSetupActivity.currentSecret = bArr2;
                    twoStepVerificationSetupActivity.currentSecretId = j;
                    twoStepVerificationSetupActivity.emailOnly = z;
                    twoStepVerificationSetupActivity.emailCode = this.emailCode;
                    twoStepVerificationSetupActivity.fragmentsToClose.addAll(this.fragmentsToClose);
                    twoStepVerificationSetupActivity.fragmentsToClose.add(this);
                    twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
                    twoStepVerificationSetupActivity.otherwiseReloginDays = this.otherwiseReloginDays;
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
                    onFieldError$1(this.outlineTextFirstRow, this.editTextFirstRow, false);
                }
                break;
            case 3:
                if (!this.emailOnly && this.bottomSkipButton.getAlpha() < 1.0f) {
                    this.bottomSkipButton.animate().cancel();
                    this.bottomSkipButton.animate().alpha(1.0f).start();
                }
                String string2 = this.editTextFirstRow.getText().toString();
                this.email = string2;
                if (string2 != null && string2.length() >= 3) {
                    int iLastIndexOf = string2.lastIndexOf(46);
                    int iLastIndexOf2 = string2.lastIndexOf(64);
                    if (iLastIndexOf2 >= 0 && iLastIndexOf >= iLastIndexOf2) {
                        setNewPassword(false);
                    }
                }
                onFieldError$1(this.outlineTextFirstRow, this.editTextFirstRow, false);
                break;
            case 4:
                String code = this.codeFieldContainer.getCode();
                TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                tL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new ThemeSetUrlActivity$$ExternalSyntheticLambda6(7, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.codeFieldContainer.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, 1), 10);
                needShowProgress$2();
                break;
            case 6:
                TL_account.Password password = this.currentPassword;
                if (password != null) {
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(this.currentAccount, 0, password);
                    twoStepVerificationSetupActivity2.fromRegistration = this.fromRegistration;
                    twoStepVerificationSetupActivity2.closeAfterSet = this.closeAfterSet;
                    twoStepVerificationSetupActivity2.otherwiseReloginDays = this.otherwiseReloginDays;
                    presentFragment(twoStepVerificationSetupActivity2, true);
                } else {
                    needShowProgress$2();
                    this.doneAfterPasswordLoad = true;
                }
                break;
            case 7:
                if (this.closeAfterSet) {
                    finishFragment();
                } else if (!this.fromRegistration) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    twoStepVerificationActivity.setCurrentPasswordParams(this.currentPassword, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
                    twoStepVerificationActivity.otherwiseReloginDays = this.otherwiseReloginDays;
                    presentFragment(twoStepVerificationActivity, true);
                    LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = this.openedSettings;
                    if (linkManager$$ExternalSyntheticLambda7 != null) {
                        AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                        this.openedSettings = null;
                    }
                } else {
                    Bundle bundleM = zzkw.m("afterSignup", true);
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
                        needShowProgress$2();
                        Utilities.globalQueue.postRunnable(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda19(this, stringBytes, 0));
                    } else {
                        onFieldError$1(this.outlineTextFirstRow, this.editTextFirstRow, false);
                    }
                } else {
                    needShowProgress$2();
                    this.doneAfterPasswordLoad = true;
                }
                break;
            case 9:
                finishFragment();
                break;
        }
    }

    public final void setNewPassword(boolean z) {
        TL_account.Password password;
        TLObject tLObject;
        if (z && this.waitingForEmail && this.currentPassword.has_password) {
            needShowProgress$2();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, 3));
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
        needShowProgress$2();
        Utilities.globalQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda488((Object) this, tLObject2, z, (Object) str, (Object) passwordinputsettings, 22));
    }

    public final void setRandomMonkeyIdleAnimation(boolean z) {
        if (this.currentType != 0) {
            return;
        }
        TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12 twoStepVerificationSetupActivity$$ExternalSyntheticLambda12 = this.setAnimationRunnable;
        if (twoStepVerificationSetupActivity$$ExternalSyntheticLambda12 != null) {
            AndroidUtilities.cancelRunOnUIThread(twoStepVerificationSetupActivity$$ExternalSyntheticLambda12);
        }
        RLottieDrawable animatedDrawable = this.imageView.getAnimatedDrawable();
        if (z) {
            if (Utilities.random.nextInt() % 2 == 0) {
                this.imageView.setAnimation(this.animationDrawables[0]);
                this.animationDrawables[0].setProgress(0.0f, true);
            } else {
                this.imageView.setAnimation(this.animationDrawables[1]);
                this.animationDrawables[1].setProgress(0.0f, true);
            }
            if (!z) {
                this.imageView.playAnimation();
            }
        } else {
            RLottieDrawable[] rLottieDrawableArr = this.animationDrawables;
            if (animatedDrawable == rLottieDrawableArr[0] || animatedDrawable == rLottieDrawableArr[1] || (this.editTextFirstRow.length() == 0 && (animatedDrawable == null || !animatedDrawable.isRunning))) {
                if (Utilities.random.nextInt() % 2 == 0) {
                    this.imageView.setAnimation(this.animationDrawables[0]);
                    this.animationDrawables[0].setProgress(0.0f, true);
                } else {
                    this.imageView.setAnimation(this.animationDrawables[1]);
                    this.animationDrawables[1].setProgress(0.0f, true);
                }
                if (!z) {
                    this.imageView.playAnimation();
                }
            }
        }
        TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12 twoStepVerificationSetupActivity$$ExternalSyntheticLambda13 = new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12(this, 3);
        this.setAnimationRunnable = twoStepVerificationSetupActivity$$ExternalSyntheticLambda13;
        AndroidUtilities.runOnUIThread(twoStepVerificationSetupActivity$$ExternalSyntheticLambda13, Utilities.random.nextInt(2000) + 5000);
    }

    public final void showAlertWithText$3(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = str;
        alertDialog.message = str2;
        showDialog(alertDialog);
    }

    public final void showDoneButton(boolean z) {
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
        this.buttonAnimation.addListener(new TodoItemMenu.AnonymousClass15(14, this, z));
        this.buttonAnimation.setDuration(150L);
        this.buttonAnimation.start();
    }

    public final void showSetForcePasswordAlert$1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.Warning);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.otherwiseReloginDays, new Object[0]);
        builder.setPositiveButton(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        builder.setNegativeButton(LocaleController.getString(R.string.ForceSetPasswordCancel), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(this, 0));
        ((TextView) builder.show().getButton(-2)).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
    }

    @Override
    public final void finishFragment() {
        if (this.otherwiseReloginDays >= 0 && ((ActionBarLayout) this.parentLayout).getFragmentStack().size() == 1) {
            Bundle bundleM = zzkw.m("afterSignup", true);
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
        this.fragmentsToClose = new ArrayList();
        this.currentPasswordHash = new byte[0];
        this.finishCallback = new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12(this, 2);
        this.currentType = i;
        this.currentPassword = password;
        if (password == null && (i == 6 || i == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(this, 2), 10);
        } else {
            this.waitingForEmail = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }
}
