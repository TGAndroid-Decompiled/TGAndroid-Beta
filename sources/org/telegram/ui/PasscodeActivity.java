package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.biometric.BiometricManager$DefaultInjector;
import androidx.core.util.AtomicFile;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.Components.TransformableLoginButtonView;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;

public final class PasscodeActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int autoLockDetailRow;
    public int autoLockRow;
    public int captureDetailRow;
    public int captureHeaderRow;
    public int captureRow;
    public int changePasscodeRow;
    public AnonymousClass8 codeFieldContainer;
    public int currentPasswordType;
    public TextViewSwitcher descriptionTextSwitcher;
    public int disablePasscodeRow;
    public int fingerprintRow;
    public String firstPassword;
    public FragmentFloatingButton floatingButton;
    public final PasscodeActivity$$ExternalSyntheticLambda10 hidePasscodesDoNotMatch;
    public int hintRow;
    public CustomPhoneKeyboardView keyboardView;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public RLottieImageView lockImageView;
    public PasscodeActivity$$ExternalSyntheticLambda13 onShowKeyboardCallback;
    public LinkManager$$ExternalSyntheticLambda7 openedSettings;
    public ActionBarMenuItem otherItem;
    public OutlineTextContainerView outlinePasswordView;
    public int passcodeSetStep;
    public TextView passcodesDoNotMatchTextView;
    public ImageView passwordButton;
    public EditTextBoldCursor passwordEditText;
    public boolean postedHidePasscodesDoNotMatch;
    public int rowCount;
    public TextView titleTextView;
    public final int type;

    public final class AnonymousClass2 extends SizeNotifierFrameLayout {
        public final int $r8$classId;
        public final BaseFragment this$0;
        public final FrameLayout val$fragmentContentView;

        public AnonymousClass2(BaseFragment baseFragment, Context context, FrameLayout frameLayout, int i) {
            super(context, null);
            this.$r8$classId = i;
            this.this$0 = baseFragment;
            this.val$fragmentContentView = frameLayout;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            SharedMediaLayout.MediaPage[] mediaPageArr;
            SharedMediaLayout.MediaPage mediaPage;
            switch (this.$r8$classId) {
                case 1:
                    MediaActivity mediaActivity = (MediaActivity) this.this$0;
                    MediaActivity.AnonymousClass6 anonymousClass6 = mediaActivity.sharedMediaLayout;
                    if (anonymousClass6 != null && (mediaPage = (mediaPageArr = anonymousClass6.mediaPages)[0]) != null && mediaPage.listView.getFastScroll() != null && mediaPageArr[0].listView.getFastScroll().pressed) {
                        return mediaActivity.sharedMediaLayout.dispatchFastScrollEvent(motionEvent);
                    }
                    MediaActivity.AnonymousClass6 anonymousClass7 = mediaActivity.sharedMediaLayout;
                    if (anonymousClass7 == null || !anonymousClass7.checkPinchToZoom$1(motionEvent)) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    return true;
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public void drawList(Canvas canvas, ArrayList arrayList) {
            switch (this.$r8$classId) {
                case 1:
                    ((MediaActivity) this.this$0).sharedMediaLayout.drawListForBlur(canvas, arrayList);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredHeight;
            int measuredHeight2;
            switch (this.$r8$classId) {
                case 0:
                    PasscodeActivity passcodeActivity = (PasscodeActivity) this.this$0;
                    int visibility = passcodeActivity.keyboardView.getVisibility();
                    FrameLayout frameLayout = this.val$fragmentContentView;
                    if (visibility == 8 || measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                        if (passcodeActivity.keyboardView.getVisibility() != 8) {
                            int measuredWidth = getMeasuredWidth();
                            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                            frameLayout.layout(0, 0, measuredWidth, measuredHeight);
                        } else {
                            int measuredWidth2 = getMeasuredWidth();
                            measuredHeight = getMeasuredHeight();
                            frameLayout.layout(0, 0, measuredWidth2, measuredHeight);
                        }
                    } else if (passcodeActivity.isCustomKeyboardVisible$1()) {
                        int measuredWidth3 = getMeasuredWidth();
                        measuredHeight = measureKeyboardHeight() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        frameLayout.layout(0, 0, measuredWidth3, measuredHeight);
                    } else {
                        int measuredWidth4 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        frameLayout.layout(0, 0, measuredWidth4, measuredHeight);
                    }
                    passcodeActivity.keyboardView.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                    notifyHeightChanged();
                    break;
                case 1:
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
                case 2:
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.this$0;
                    int visibility2 = twoStepVerificationSetupActivity.keyboardView.getVisibility();
                    LoginActivity.AnonymousClass4 anonymousClass4 = (LoginActivity.AnonymousClass4) this.val$fragmentContentView;
                    if (visibility2 == 8 || measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                        if (twoStepVerificationSetupActivity.keyboardView.getVisibility() != 8) {
                            int measuredWidth5 = getMeasuredWidth();
                            measuredHeight2 = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                            anonymousClass4.layout(0, 0, measuredWidth5, measuredHeight2);
                        } else {
                            int measuredWidth6 = getMeasuredWidth();
                            measuredHeight2 = getMeasuredHeight();
                            anonymousClass4.layout(0, 0, measuredWidth6, measuredHeight2);
                        }
                    } else if (twoStepVerificationSetupActivity.isCustomKeyboardVisible$2()) {
                        int measuredWidth7 = getMeasuredWidth();
                        measuredHeight2 = measureKeyboardHeight() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                        anonymousClass4.layout(0, 0, measuredWidth7, measuredHeight2);
                    } else {
                        int measuredWidth8 = getMeasuredWidth();
                        measuredHeight2 = getMeasuredHeight();
                        anonymousClass4.layout(0, 0, measuredWidth8, measuredHeight2);
                    }
                    twoStepVerificationSetupActivity.keyboardView.layout(0, measuredHeight2, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight2);
                    break;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size, size2);
                    PasscodeActivity passcodeActivity = (PasscodeActivity) this.this$0;
                    if (passcodeActivity.keyboardView.getVisibility() != 8 && measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                        size2 -= AndroidUtilities.dp(230.0f);
                    }
                    this.val$fragmentContentView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    passcodeActivity.keyboardView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                    break;
                case 1:
                    MediaActivity mediaActivity = (MediaActivity) this.this$0;
                    ((FrameLayout.LayoutParams) mediaActivity.sharedMediaLayout.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) mediaActivity).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.val$fragmentContentView.getLayoutParams();
                    layoutParams.topMargin = ((BaseFragment) mediaActivity).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                    layoutParams.height = ActionBar.getCurrentActionBarHeight();
                    for (int i3 = 0; i3 < 2; i3++) {
                        SimpleTextView[] simpleTextViewArr = mediaActivity.nameTextView;
                        if (simpleTextViewArr[i3] != null) {
                            ((FrameLayout.LayoutParams) simpleTextViewArr[i3].getLayoutParams()).topMargin = AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 5.0f : 4.0f) + OKLCH.m$2(22.0f, ActionBar.getCurrentActionBarHeight() / 2, 2);
                        }
                        AnimatedTextView[] animatedTextViewArr = mediaActivity.subtitleTextView;
                        if (animatedTextViewArr[i3] != null) {
                            ((FrameLayout.LayoutParams) animatedTextViewArr[i3].getLayoutParams()).topMargin = ((((ActionBar.getCurrentActionBarHeight() / 2) - AndroidUtilities.dp(19.0f)) / 2) + (ActionBar.getCurrentActionBarHeight() / 2)) - AndroidUtilities.dp(7.0f);
                        }
                    }
                    ((FrameLayout.LayoutParams) mediaActivity.avatarImageView.getLayoutParams()).topMargin = OKLCH.m$2(42.0f, ActionBar.getCurrentActionBarHeight(), 2);
                    super.onMeasure(i, i2);
                    break;
                default:
                    int size3 = View.MeasureSpec.getSize(i);
                    int size4 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size3, size4);
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.this$0;
                    if (twoStepVerificationSetupActivity.keyboardView.getVisibility() != 8 && measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                        size4 -= AndroidUtilities.dp(230.0f);
                    }
                    ((LoginActivity.AnonymousClass4) this.val$fragmentContentView).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    twoStepVerificationSetupActivity.keyboardView.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                    break;
            }
        }
    }

    public final class AnonymousClass4 extends ActionBar.ActionBarMenuOnItemClick {
        public final ActionBarMenuSubItem val$switchItem;

        public AnonymousClass4(ActionBarMenuSubItem actionBarMenuSubItem) {
            this.val$switchItem = actionBarMenuSubItem;
        }

        @Override
        public final void onItemClick(int i) {
            PasscodeActivity passcodeActivity = PasscodeActivity.this;
            if (i == -1) {
                passcodeActivity.finishFragment();
                return;
            }
            if (i == 1) {
                passcodeActivity.currentPasswordType = passcodeActivity.currentPasswordType != 0 ? 0 : 1;
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(26, this, this.val$switchItem), 150L);
                passcodeActivity.passwordEditText.setText("");
                for (CodeNumberField codeNumberField : passcodeActivity.codeFieldContainer.codeField) {
                    codeNumberField.setText("");
                }
                passcodeActivity.updateFields$1();
            }
        }
    }

    public final class AnonymousClass8 extends CodeFieldContainer {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass8(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void processNextPressed() {
            switch (this.$r8$classId) {
                case 0:
                    PasscodeActivity passcodeActivity = (PasscodeActivity) this.this$0;
                    if (passcodeActivity.passcodeSetStep != 0) {
                        passcodeActivity.processDone$8();
                    } else {
                        postDelayed(new IntroActivity$$ExternalSyntheticLambda6(this, 28), 260L);
                    }
                    break;
                case 1:
                    ((LoginActivity.LoginActivityEmailCodeView) this.this$0).onNextPressed(null);
                    break;
                case 2:
                    ((LoginActivity.LoginActivityRecoverView) this.this$0).onNextPressed(null);
                    break;
                default:
                    ((TwoStepVerificationSetupActivity) this.this$0).processNext$1();
                    break;
            }
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return PasscodeActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            PasscodeActivity passcodeActivity = PasscodeActivity.this;
            if (i == passcodeActivity.fingerprintRow || i == passcodeActivity.captureRow) {
                return 0;
            }
            if (i == passcodeActivity.changePasscodeRow || i == passcodeActivity.autoLockRow || i == passcodeActivity.disablePasscodeRow) {
                return 1;
            }
            if (i == passcodeActivity.autoLockDetailRow || i == passcodeActivity.captureDetailRow || i == passcodeActivity.hintRow) {
                return 2;
            }
            if (i == passcodeActivity.captureHeaderRow) {
                return 3;
            }
            return i == 0 ? 4 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            PasscodeActivity passcodeActivity = PasscodeActivity.this;
            return adapterPosition == passcodeActivity.fingerprintRow || adapterPosition == passcodeActivity.autoLockRow || adapterPosition == passcodeActivity.captureRow || adapterPosition == passcodeActivity.changePasscodeRow || adapterPosition == passcodeActivity.disablePasscodeRow;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            int i2 = viewHolder.mItemViewType;
            PasscodeActivity passcodeActivity = PasscodeActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                if (i == passcodeActivity.fingerprintRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                    return;
                } else {
                    if (i == passcodeActivity.captureRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                        RLottieImageHolderView rLottieImageHolderView = (RLottieImageHolderView) view;
                        rLottieImageHolderView.imageView.setAnimation(R.raw.utyan_passcode, 100, 100, null);
                        rLottieImageHolderView.imageView.playAnimation();
                        return;
                    }
                    HeaderCell headerCell = (HeaderCell) view;
                    headerCell.setHeight(46);
                    if (i == passcodeActivity.captureHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                        return;
                    }
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                if (i == passcodeActivity.hintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                    textInfoPrivacyCell.setBackground(null);
                    textInfoPrivacyCell.getTextView().setGravity(1);
                    return;
                } else if (i == passcodeActivity.autoLockDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoLockInfo));
                    textInfoPrivacyCell.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                } else {
                    if (i == passcodeActivity.captureDetailRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                        textInfoPrivacyCell.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                        return;
                    }
                    return;
                }
            }
            TextSettingsCell textSettingsCell = (TextSettingsCell) view;
            if (i == passcodeActivity.changePasscodeRow) {
                textSettingsCell.setText(LocaleController.getString(R.string.ChangePasscode), true);
                if (SharedConfig.passcodeHash.isEmpty()) {
                    int i3 = Theme.key_windowBackgroundWhiteGrayText7;
                    textSettingsCell.setTag(Integer.valueOf(i3));
                    textSettingsCell.setTextColor(Theme.getColor(null, i3, false));
                    return;
                } else {
                    int i4 = Theme.key_windowBackgroundWhiteBlackText;
                    textSettingsCell.setTag(Integer.valueOf(i4));
                    textSettingsCell.setTextColor(Theme.getColor(null, i4, false));
                    return;
                }
            }
            if (i != passcodeActivity.autoLockRow) {
                if (i == passcodeActivity.disablePasscodeRow) {
                    textSettingsCell.setText(LocaleController.getString(R.string.DisablePasscode), false);
                    int i5 = Theme.key_text_RedBold;
                    textSettingsCell.setTag(Integer.valueOf(i5));
                    textSettingsCell.setTextColor(Theme.getColor(null, i5, false));
                    return;
                }
                return;
            }
            int i6 = SharedConfig.autoLockIn;
            if (i6 == 0) {
                string = LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]);
            } else if (i6 < 3600) {
                string = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i6 / 60, new Object[0]));
            } else {
                string = i6 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i6 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i6 / 60.0f) / 60.0f) / 24.0f), new Object[0]));
            }
            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AutoLock), string, false, true);
            int i7 = Theme.key_windowBackgroundWhiteBlackText;
            textSettingsCell.setTag(Integer.valueOf(i7));
            textSettingsCell.setTextColor(Theme.getColor(null, i7, false));
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCheckCell;
            Context context = this.mContext;
            if (i == 0) {
                textCheckCell = new TextCheckCell(context);
            } else if (i == 1) {
                textCheckCell = new TextSettingsCell(context, 0, null);
            } else if (i == 3) {
                textCheckCell = new HeaderCell(context);
            } else if (i != 4) {
                textCheckCell = new TextInfoPrivacyCell(context, 24, null);
            } else {
                textCheckCell = new RLottieImageHolderView(context);
                textCheckCell.setTag(-33024);
            }
            return new RecyclerListView.Holder(textCheckCell);
        }
    }

    public final class RLottieImageHolderView extends FrameLayout {
        public final RLottieImageView imageView;

        public RLottieImageHolderView(Context context) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 12));
            int iDp = AndroidUtilities.dp(120.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDp, iDp);
            layoutParams.gravity = 1;
            addView(rLottieImageView, layoutParams);
            setPadding(0, AndroidUtilities.dp(32.0f), 0, 0);
            setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        }
    }

    public PasscodeActivity(int i) {
        super(null);
        this.currentPasswordType = 0;
        this.passcodeSetStep = 0;
        this.hidePasscodesDoNotMatch = new PasscodeActivity$$ExternalSyntheticLambda10(this, 1);
        this.type = i;
    }

    public static BaseFragment determineOpenFragment() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new ActionIntroActivity(6);
    }

    public final void animateSuccessAnimation(Runnable runnable) {
        if (!isPinCode()) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
            CodeNumberField[] codeNumberFieldArr = anonymousClass8.codeField;
            if (i >= codeNumberFieldArr.length) {
                anonymousClass8.postDelayed(new LinkManager$$ExternalSyntheticLambda2(25, this, runnable), (((long) codeNumberFieldArr.length) * 75) + 350);
                return;
            } else {
                CodeNumberField codeNumberField = codeNumberFieldArr[i];
                codeNumberField.postDelayed(new PasscodeActivity$$ExternalSyntheticLambda20(codeNumberField, 0), ((long) i) * 75);
                i++;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem;
        ActionBar actionBar = this.actionBar;
        int i2 = R.drawable.ic_ab_back;
        actionBar.setBackButtonImage(i2);
        boolean z = false;
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 6));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i3 = 1;
        int i4 = this.type;
        if (i4 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, LayoutHelper.createFrame(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, context, frameLayout, 0);
        anonymousClass2.setDelegate(new LoginActivity$$ExternalSyntheticLambda10(this, 1));
        this.fragmentView = anonymousClass2;
        anonymousClass2.addView(frameLayout, LayoutHelper.createLinear(1.0f, -1, 0));
        CustomPhoneKeyboardView customPhoneKeyboardView = new CustomPhoneKeyboardView(context);
        this.keyboardView = customPhoneKeyboardView;
        customPhoneKeyboardView.setVisibility(isCustomKeyboardVisible$1() ? 0 : 8);
        anonymousClass2.addView(this.keyboardView, LayoutHelper.createLinear(-1, 230));
        if (i4 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Passcode));
            int i5 = Theme.key_windowBackgroundGray;
            frameLayout2.setTag(Integer.valueOf(i5));
            frameLayout2.setBackgroundColor(Theme.getColor(null, i5, false));
            RecyclerListView recyclerListView = new RecyclerListView(context, null);
            this.listView = recyclerListView;
            recyclerListView.setSections();
            this.actionBar.setAdaptiveBackground(this.listView);
            this.listView.setLayoutManager(new PhotoViewer.AnonymousClass36(i3, 14, z));
            this.listView.setVerticalScrollBarEnabled(false);
            this.listView.setItemAnimator(null);
            this.listView.setLayoutAnimation(null);
            frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
            RecyclerListView recyclerListView2 = this.listView;
            ListAdapter listAdapter = new ListAdapter(context);
            this.listAdapter = listAdapter;
            recyclerListView2.setAdapter(listAdapter);
            this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 22));
        } else if (i4 == 1 || i4 == 2) {
            ActionBar actionBar2 = this.actionBar;
            if (actionBar2 != null) {
                actionBar2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                this.actionBar.setBackButtonImage(i2);
                this.actionBar.setItemsColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), false);
                this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarWhiteSelector, false), false);
                this.actionBar.setCastShadows(false);
                ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
                if (i4 == 1) {
                    ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other);
                    this.otherItem = actionBarMenuItemAddItem;
                    actionBarMenuSubItemAddSubItem = actionBarMenuItemAddItem.addSubItem(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    actionBarMenuSubItemAddSubItem = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass4(actionBarMenuSubItemAddSubItem));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, LayoutHelper.createFrame(-1.0f, -1));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockImageView = rLottieImageView;
            rLottieImageView.setFocusable(false);
            this.lockImageView.setAnimation(R.raw.tsv_setup_intro, 120, 120, null);
            this.lockImageView.setAutoRepeat(false);
            this.lockImageView.playAnimation();
            RLottieImageView rLottieImageView2 = this.lockImageView;
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            rLottieImageView2.setVisibility(i);
            linearLayout.addView(this.lockImageView, LayoutHelper.createLinear(120, 120, 1));
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            int i6 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i6, false));
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            if (i4 != 1) {
                this.titleTextView.setText(LocaleController.getString(R.string.EnterYourPasscode));
            } else if (SharedConfig.passcodeHash.isEmpty()) {
                this.titleTextView.setText(LocaleController.getString(R.string.CreatePasscode));
            } else {
                this.titleTextView.setText(LocaleController.getString(R.string.EnterNewPasscode));
            }
            this.titleTextView.setTextSize(1, 18.0f);
            this.titleTextView.setGravity(1);
            linearLayout.addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 0));
            TextViewSwitcher textViewSwitcher = new TextViewSwitcher(context);
            this.descriptionTextSwitcher = textViewSwitcher;
            textViewSwitcher.setFactory(new PhotoViewer$$ExternalSyntheticLambda18(context, 3));
            this.descriptionTextSwitcher.setInAnimation(context, R.anim.alpha_in);
            this.descriptionTextSwitcher.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.descriptionTextSwitcher, LayoutHelper.createLinear(-2, -2, 1, 20, 8, 20, 0));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
            textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView2.setGravity((isPassword() ? 3 : 1) | 16);
            textView2.setOnClickListener(new PasscodeActivity$$ExternalSyntheticLambda3(context, 0));
            textView2.setVisibility(i4 == 2 ? 0 : 8);
            textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout2.addView(textView2, LayoutHelper.createFrame(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            new PhotoViewer.AnonymousClass14(textView2);
            TextView textView3 = new TextView(context);
            this.passcodesDoNotMatchTextView = textView3;
            textView3.setTextSize(1, 14.0f);
            this.passcodesDoNotMatchTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            this.passcodesDoNotMatchTextView.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.passcodesDoNotMatchTextView.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.passcodesDoNotMatchTextView, false, 1.0f, false);
            frameLayout2.addView(this.passcodesDoNotMatchTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context, null);
            this.outlinePasswordView = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.passwordEditText = editTextBoldCursor;
            editTextBoldCursor.setInputType(524417);
            this.passwordEditText.setTextSize(1, 18.0f);
            this.passwordEditText.setTextColor(Theme.getColor(null, i6, false));
            this.passwordEditText.setBackground(null);
            this.passwordEditText.setMaxLines(1);
            this.passwordEditText.setLines(1);
            this.passwordEditText.setGravity(LocaleController.isRTL ? 5 : 3);
            this.passwordEditText.setSingleLine(true);
            if (i4 == 1) {
                this.passcodeSetStep = 0;
                this.passwordEditText.setImeOptions(5);
            } else {
                this.passcodeSetStep = 1;
                this.passwordEditText.setImeOptions(6);
            }
            this.passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.passwordEditText.setTypeface(Typeface.DEFAULT);
            this.passwordEditText.setCursorColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false));
            this.passwordEditText.setCursorSize(AndroidUtilities.dp(20.0f));
            this.passwordEditText.setCursorWidth(1.5f);
            int iDp = AndroidUtilities.dp(16.0f);
            this.passwordEditText.setPadding(iDp, iDp, iDp, iDp);
            this.passwordEditText.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 14));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.addView(this.passwordEditText, LayoutHelper.createLinear(1.0f, 0, -2));
            ImageView imageView = new ImageView(context);
            this.passwordButton = imageView;
            imageView.setImageResource(R.drawable.msg_message);
            this.passwordButton.setColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            this.passwordButton.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 1, -1));
            AndroidUtilities.updateViewVisibilityAnimated(this.passwordButton, i4 == 1 && this.passcodeSetStep == 0, 0.1f, false);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.passwordEditText.addTextChangedListener(new LoginActivity.AnonymousClass7(10, this, atomicBoolean));
            this.passwordButton.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(29, this, atomicBoolean));
            linearLayout2.addView(this.passwordButton, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.outlinePasswordView.addView(linearLayout2, LayoutHelper.createFrame(-2.0f, -1));
            frameLayout3.addView(this.outlinePasswordView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 0));
            this.passwordEditText.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 19));
            final int i7 = 0;
            this.passwordEditText.addTextChangedListener(new TextWatcher(this) {
                public final PasscodeActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void afterTextChanged(Editable editable) {
                    int i8 = i7;
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                    switch (i7) {
                        case 0:
                            PasscodeActivity passcodeActivity = this.this$0;
                            if (passcodeActivity.postedHidePasscodesDoNotMatch) {
                                AnonymousClass8 anonymousClass8 = passcodeActivity.codeFieldContainer;
                                PasscodeActivity$$ExternalSyntheticLambda10 passcodeActivity$$ExternalSyntheticLambda10 = passcodeActivity.hidePasscodesDoNotMatch;
                                anonymousClass8.removeCallbacks(passcodeActivity$$ExternalSyntheticLambda10);
                                passcodeActivity$$ExternalSyntheticLambda10.run();
                            }
                            break;
                        default:
                            PasscodeActivity passcodeActivity2 = this.this$0;
                            if (passcodeActivity2.postedHidePasscodesDoNotMatch) {
                                AnonymousClass8 anonymousClass9 = passcodeActivity2.codeFieldContainer;
                                PasscodeActivity$$ExternalSyntheticLambda10 passcodeActivity$$ExternalSyntheticLambda11 = passcodeActivity2.hidePasscodesDoNotMatch;
                                anonymousClass9.removeCallbacks(passcodeActivity$$ExternalSyntheticLambda11);
                                passcodeActivity$$ExternalSyntheticLambda11.run();
                            }
                            break;
                    }
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                    int i11 = i7;
                }

                private final void afterTextChanged$org$telegram$ui$PasscodeActivity$6(Editable editable) {
                }

                private final void afterTextChanged$org$telegram$ui$PasscodeActivity$9(Editable editable) {
                }

                private final void onTextChanged$org$telegram$ui$PasscodeActivity$6(int i8, int i9, int i10, CharSequence charSequence) {
                }

                private final void onTextChanged$org$telegram$ui$PasscodeActivity$9(int i8, int i9, int i10, CharSequence charSequence) {
                }
            });
            this.passwordEditText.setCustomSelectionActionModeCallback(new RichEditText.AnonymousClass1(3));
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(this, context, 0);
            this.codeFieldContainer = anonymousClass8;
            anonymousClass8.setNumbersCount(4, 10);
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(!isCustomKeyboardVisible$1());
                codeNumberField.setTransformationMethod(PasswordTransformationMethod.getInstance());
                codeNumberField.setTextSize(1, 24.0f);
                final int i8 = 1;
                codeNumberField.addTextChangedListener(new TextWatcher(this) {
                    public final PasscodeActivity this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void afterTextChanged(Editable editable) {
                        int i9 = i8;
                    }

                    @Override
                    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                        switch (i8) {
                            case 0:
                                PasscodeActivity passcodeActivity = this.this$0;
                                if (passcodeActivity.postedHidePasscodesDoNotMatch) {
                                    AnonymousClass8 anonymousClass9 = passcodeActivity.codeFieldContainer;
                                    PasscodeActivity$$ExternalSyntheticLambda10 passcodeActivity$$ExternalSyntheticLambda10 = passcodeActivity.hidePasscodesDoNotMatch;
                                    anonymousClass9.removeCallbacks(passcodeActivity$$ExternalSyntheticLambda10);
                                    passcodeActivity$$ExternalSyntheticLambda10.run();
                                }
                                break;
                            default:
                                PasscodeActivity passcodeActivity2 = this.this$0;
                                if (passcodeActivity2.postedHidePasscodesDoNotMatch) {
                                    AnonymousClass8 anonymousClass10 = passcodeActivity2.codeFieldContainer;
                                    PasscodeActivity$$ExternalSyntheticLambda10 passcodeActivity$$ExternalSyntheticLambda11 = passcodeActivity2.hidePasscodesDoNotMatch;
                                    anonymousClass10.removeCallbacks(passcodeActivity$$ExternalSyntheticLambda11);
                                    passcodeActivity$$ExternalSyntheticLambda11.run();
                                }
                                break;
                        }
                    }

                    @Override
                    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
                        int i12 = i8;
                    }

                    private final void afterTextChanged$org$telegram$ui$PasscodeActivity$6(Editable editable) {
                    }

                    private final void afterTextChanged$org$telegram$ui$PasscodeActivity$9(Editable editable) {
                    }

                    private final void onTextChanged$org$telegram$ui$PasscodeActivity$6(int i9, int i10, int i11, CharSequence charSequence) {
                    }

                    private final void onTextChanged$org$telegram$ui$PasscodeActivity$9(int i9, int i10, int i11, CharSequence charSequence) {
                    }
                });
                codeNumberField.setOnFocusChangeListener(new StakedDiceSheet$$ExternalSyntheticLambda5(this, codeNumberField, 3));
            }
            frameLayout3.addView(this.codeFieldContainer, LayoutHelper.createFrame(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, LayoutHelper.createLinear(-1, -2, 1, 0, 32, 0, 72));
            if (i4 == 1) {
                frameLayout2.setTag(Integer.valueOf(Theme.key_windowBackgroundWhite));
            }
            FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
            this.floatingButton = fragmentFloatingButton;
            new PhotoViewer.AnonymousClass14(fragmentFloatingButton);
            frameLayout2.addView(this.floatingButton, LayoutHelper.createFrame(56, 56.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.floatingButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 11));
            TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(context);
            transformableLoginButtonView.setTransformType(1);
            transformableLoginButtonView.setProgress(0.0f);
            transformableLoginButtonView.setColor(Theme.getColor(null, Theme.key_chats_actionIcon, false));
            transformableLoginButtonView.setDrawBackground(false);
            this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
            this.floatingButton.addView(transformableLoginButtonView, LayoutHelper.createFrame(56, 56, 17));
            FragmentFloatingButton fragmentFloatingButton2 = this.floatingButton;
            fragmentFloatingButton2.addAdditionalView(fragmentFloatingButton2);
            updateFields$1();
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.type == 0) {
                updateRows$11();
                ListAdapter listAdapter = this.listAdapter;
                if (listAdapter != null) {
                    listAdapter.mObservable.notifyChanged();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextCheckCell.class, TextSettingsCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 262145, null, null, null, null, Theme.key_windowBackgroundGray));
        if (this.type != 0) {
            arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        }
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, Integer.MIN_VALUE, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741824, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741832, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.titleTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText6));
        EditTextBoldCursor editTextBoldCursor = this.passwordEditText;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(editTextBoldCursor, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.passwordEditText, 32, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
        arrayList.add(new ThemeDescription(this.passwordEditText, 65568, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return this.type != 0;
    }

    public final boolean isCustomKeyboardVisible$1() {
        if (!isPinCode() || this.type == 0 || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final boolean isPassword() {
        int i = this.type;
        return (i == 1 && this.currentPasswordType == 1) || (i == 2 && SharedConfig.passcodeType == 1);
    }

    public final boolean isPinCode() {
        int i = this.type;
        return (i == 1 && this.currentPasswordType == 0) || (i == 2 && SharedConfig.passcodeType == 0);
    }

    public final void lambda$createView$4(NumberPicker numberPicker, int i) {
        int value = numberPicker.getValue();
        if (value == 0) {
            SharedConfig.autoLockIn = 0;
        } else if (value == 1) {
            SharedConfig.autoLockIn = 60;
        } else if (value == 2) {
            SharedConfig.autoLockIn = 300;
        } else if (value == 3) {
            SharedConfig.autoLockIn = 3600;
        } else if (value == 4) {
            SharedConfig.autoLockIn = 18000;
        }
        this.listAdapter.notifyItemChanged(i);
        UserConfig.getInstance(this.currentAccount).saveConfig(false);
    }

    public final void lambda$createView$5(int i, View view) {
        int i2 = 14;
        if (view.isEnabled()) {
            if (i == this.disablePasscodeRow) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.DisablePasscode);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.setPositiveButton(LocaleController.getString(R.string.DisablePasscodeTurnOff), new PhotoViewer$$ExternalSyntheticLambda115(this, 16));
                alertDialog.show();
                ((TextView) alertDialog.getButton(-1)).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                return;
            }
            if (i == this.changePasscodeRow) {
                presentFragment(new PasscodeActivity(1));
                return;
            }
            if (i != this.autoLockRow) {
                if (i == this.fingerprintRow) {
                    SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                    ((TextCheckCell) view).setChecked(SharedConfig.useFingerprintLock);
                    return;
                } else {
                    if (i == this.captureRow) {
                        SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                        UserConfig.getInstance(this.currentAccount).saveConfig(false);
                        ((TextCheckCell) view).setChecked(SharedConfig.allowScreenCapture);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                        if (SharedConfig.allowScreenCapture) {
                            return;
                        }
                        AlertsCreator.showSimpleAlert(this, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                        return;
                    }
                    return;
                }
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string2 = LocaleController.getString(R.string.AutoLock);
            AlertDialog alertDialog2 = builder2.alertDialog;
            alertDialog2.title = string2;
            NumberPicker numberPicker = new NumberPicker(getParentActivity(), 18, null);
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(4);
            int i3 = SharedConfig.autoLockIn;
            if (i3 == 0) {
                numberPicker.setValue(0);
            } else if (i3 == 60) {
                numberPicker.setValue(1);
            } else if (i3 == 300) {
                numberPicker.setValue(2);
            } else if (i3 == 3600) {
                numberPicker.setValue(3);
            } else if (i3 == 18000) {
                numberPicker.setValue(4);
            }
            numberPicker.setFormatter(new PhotoViewer$$ExternalSyntheticLambda97(i2));
            builder2.setView(numberPicker);
            builder2.setNegativeButton(LocaleController.getString(R.string.Done), new PassportActivity$$ExternalSyntheticLambda52(this, numberPicker, i, i2));
            showDialog(alertDialog2);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        CodeNumberField[] codeNumberFieldArr;
        int i;
        super.onConfigurationChanged(configuration);
        setCustomKeyboardVisible$1(isCustomKeyboardVisible$1(), false);
        RLottieImageView rLottieImageView = this.lockImageView;
        if (rLottieImageView != null) {
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            rLottieImageView.setVisibility(i);
        }
        AnonymousClass8 anonymousClass8 = this.codeFieldContainer;
        if (anonymousClass8 == null || (codeNumberFieldArr = anonymousClass8.codeField) == null) {
            return;
        }
        for (CodeNumberField codeNumberField : codeNumberFieldArr) {
            codeNumberField.setShowSoftInputOnFocusCompat(!isCustomKeyboardVisible$1());
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        updateRows$11();
        if (this.type != 0) {
            return true;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.type == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetPasscode);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void onPasscodeError$1$1() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (isPinCode()) {
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                CodeNumberField.animateSpring(codeNumberField.errorSpringAnimation, 100.0f);
            }
        } else {
            OutlineTextContainerView.animateSpring(this.outlinePasswordView.errorSpring, 1.0f);
        }
        AndroidUtilities.shakeViewSpring(isPinCode() ? this.codeFieldContainer : this.outlinePasswordView, isPinCode() ? 10.0f : 4.0f, new PasscodeActivity$$ExternalSyntheticLambda10(this, 4));
    }

    @Override
    public final void onPause() {
        super.onPause();
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        if (this.type != 0 && !isCustomKeyboardVisible$1()) {
            AndroidUtilities.runOnUIThread(new PasscodeActivity$$ExternalSyntheticLambda10(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (isCustomKeyboardVisible$1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.type == 0) {
            return;
        }
        showKeyboard$1();
    }

    public final void processDone$8() {
        int i = 2;
        int i2 = 0;
        if (isPassword() && this.passwordEditText.getText().length() == 0) {
            onPasscodeError$1$1();
            return;
        }
        String code = isPinCode() ? this.codeFieldContainer.getCode() : this.passwordEditText.getText().toString();
        int i3 = this.type;
        if (i3 == 1) {
            if (!this.firstPassword.equals(code)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.passcodesDoNotMatchTextView, true);
                for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                    codeNumberField.setText("");
                }
                if (isPinCode()) {
                    this.codeFieldContainer.codeField[0].requestFocus();
                }
                this.passwordEditText.setText("");
                onPasscodeError$1$1();
                this.codeFieldContainer.removeCallbacks(this.hidePasscodesDoNotMatch);
                this.codeFieldContainer.post(new PasscodeActivity$$ExternalSyntheticLambda10(this, i));
                return;
            }
            boolean zIsEmpty = SharedConfig.passcodeHash.isEmpty();
            try {
                SharedConfig.passcodeSalt = new byte[16];
                Utilities.random.nextBytes(SharedConfig.passcodeSalt);
                byte[] bytes = this.firstPassword.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, bytes.length + 16, 16);
                SharedConfig.passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length));
            } catch (Exception e) {
                FileLog.e(e);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.currentPasswordType;
            SharedConfig.saveConfig();
            this.passwordEditText.clearFocus();
            AndroidUtilities.hideKeyboard(this.passwordEditText);
            for (CodeNumberField codeNumberField2 : this.codeFieldContainer.codeField) {
                codeNumberField2.clearFocus();
                AndroidUtilities.hideKeyboard(codeNumberField2);
            }
            this.keyboardView.setEditText(null);
            animateSuccessAnimation(new PasscodeActivity$$ExternalSyntheticLambda13(this, zIsEmpty, i2));
            return;
        }
        if (i3 == 2) {
            long j = SharedConfig.passcodeRetryInMs;
            if (j > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j / 1000.0d)), new Object[0])), 0).show();
                for (CodeNumberField codeNumberField3 : this.codeFieldContainer.codeField) {
                    codeNumberField3.setText("");
                }
                this.passwordEditText.setText("");
                if (isPinCode()) {
                    this.codeFieldContainer.codeField[0].requestFocus();
                }
                onPasscodeError$1$1();
                return;
            }
            if (!SharedConfig.checkPasscode(code)) {
                SharedConfig.increaseBadPasscodeTries();
                this.passwordEditText.setText("");
                for (CodeNumberField codeNumberField4 : this.codeFieldContainer.codeField) {
                    codeNumberField4.setText("");
                }
                if (isPinCode()) {
                    this.codeFieldContainer.codeField[0].requestFocus();
                }
                onPasscodeError$1$1();
                return;
            }
            SharedConfig.badPasscodeTries = 0;
            SharedConfig.saveConfig();
            this.passwordEditText.clearFocus();
            AndroidUtilities.hideKeyboard(this.passwordEditText);
            CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
            int length2 = codeNumberFieldArr.length;
            while (i2 < length2) {
                CodeNumberField codeNumberField5 = codeNumberFieldArr[i2];
                codeNumberField5.clearFocus();
                AndroidUtilities.hideKeyboard(codeNumberField5);
                i2++;
            }
            this.keyboardView.setEditText(null);
            animateSuccessAnimation(new PasscodeActivity$$ExternalSyntheticLambda10(this, 3));
        }
    }

    public final void processNext() {
        if ((this.currentPasswordType == 1 && this.passwordEditText.getText().length() == 0) || (this.currentPasswordType == 0 && this.codeFieldContainer.getCode().length() != 4)) {
            onPasscodeError$1$1();
            return;
        }
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(8);
        }
        this.titleTextView.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.descriptionTextSwitcher.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        this.firstPassword = isPinCode() ? this.codeFieldContainer.getCode() : this.passwordEditText.getText().toString();
        this.passwordEditText.setText("");
        this.passwordEditText.setInputType(524417);
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            codeNumberField.setText("");
        }
        showKeyboard$1();
        this.passcodeSetStep = 1;
    }

    public final void setCustomKeyboardVisible$1(boolean z, boolean z2) {
        if (z) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
        if (!z2) {
            this.keyboardView.setVisibility(z ? 0 : 8);
            this.keyboardView.setAlpha(z ? 1.0f : 0.0f);
            this.keyboardView.setTranslationY(z ? 0.0f : AndroidUtilities.dp(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z ? CubicBezierInterpolator.DEFAULT : Easings.easeInOutQuad);
        duration.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 19));
        duration.addListener(new LoginActivity.AnonymousClass9(21, this, z));
        duration.start();
    }

    public final void setOnOpenedSettings(LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7) {
        this.openedSettings = linkManager$$ExternalSyntheticLambda7;
    }

    public final void showKeyboard$1() {
        if (isPinCode()) {
            this.codeFieldContainer.codeField[0].requestFocus();
            if (isCustomKeyboardVisible$1()) {
                return;
            }
            AndroidUtilities.showKeyboard(this.codeFieldContainer.codeField[0]);
            return;
        }
        if (isPassword()) {
            this.passwordEditText.requestFocus();
            AndroidUtilities.showKeyboard(this.passwordEditText);
        }
    }

    public final void updateFields$1() {
        String string;
        int i = this.type;
        if (i == 2) {
            string = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.passcodeSetStep == 0) {
            string = LocaleController.getString(this.currentPasswordType == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword);
        } else {
            string = this.descriptionTextSwitcher.getCurrentView().getText().toString();
        }
        boolean z = (this.descriptionTextSwitcher.getCurrentView().getText().equals(string) || TextUtils.isEmpty(this.descriptionTextSwitcher.getCurrentView().getText())) ? false : true;
        if (i == 2) {
            this.descriptionTextSwitcher.setText(LocaleController.getString(R.string.EnterYourPasscodeInfo), z, false);
        } else if (this.passcodeSetStep == 0) {
            this.descriptionTextSwitcher.setText(LocaleController.getString(this.currentPasswordType == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword), z, false);
        }
        if (isPinCode()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.codeFieldContainer, true, 1.0f, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.outlinePasswordView, false, 1.0f, z);
        } else if (isPassword()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.codeFieldContainer, false, 1.0f, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.outlinePasswordView, true, 1.0f, z);
        }
        if (isPassword()) {
            PasscodeActivity$$ExternalSyntheticLambda13 passcodeActivity$$ExternalSyntheticLambda13 = new PasscodeActivity$$ExternalSyntheticLambda13(this, z, 1);
            this.onShowKeyboardCallback = passcodeActivity$$ExternalSyntheticLambda13;
            AndroidUtilities.runOnUIThread(passcodeActivity$$ExternalSyntheticLambda13, 3000L);
        } else {
            this.floatingButton.animatorButtonVisible.setValue(false, z);
        }
        setCustomKeyboardVisible$1(isCustomKeyboardVisible$1(), z);
        showKeyboard$1();
    }

    public final void updateRows$11() {
        this.fingerprintRow = -1;
        this.hintRow = 1;
        this.rowCount = 3;
        this.changePasscodeRow = 2;
        try {
            if (Build.VERSION.SDK_INT >= 23 && new AtomicFile(new BiometricManager$DefaultInjector(ApplicationLoader.applicationContext, 0)).canAuthenticate(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i = this.rowCount;
                this.rowCount = i + 1;
                this.fingerprintRow = i;
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        int i2 = this.rowCount;
        this.autoLockRow = i2;
        this.autoLockDetailRow = i2 + 1;
        this.captureHeaderRow = i2 + 2;
        this.captureRow = i2 + 3;
        this.captureDetailRow = i2 + 4;
        this.rowCount = i2 + 6;
        this.disablePasscodeRow = i2 + 5;
    }
}
