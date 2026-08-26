package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.Components.TransformableLoginButtonView;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;

public class PasscodeActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int ID_SWITCH_TYPE = 1;
    public static final int TYPE_ENTER_CODE_TO_MANAGE_SETTINGS = 2;
    public static final int TYPE_MANAGE_CODE_SETTINGS = 0;
    public static final int TYPE_SETUP_CODE = 1;
    private int autoLockDetailRow;
    private int autoLockRow;
    private int captureDetailRow;
    private int captureHeaderRow;
    private int captureRow;
    private int changePasscodeRow;
    private CodeFieldContainer codeFieldContainer;
    private int currentPasswordType;
    private TextViewSwitcher descriptionTextSwitcher;
    private int disablePasscodeRow;
    private int fingerprintRow;
    private String firstPassword;
    private FragmentFloatingButton floatingButton;
    private final Runnable hidePasscodesDoNotMatch;
    private int hintRow;
    private CustomPhoneKeyboardView keyboardView;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private RLottieImageView lockImageView;
    private Runnable onShowKeyboardCallback;
    private Runnable openedSettings;
    private ActionBarMenuItem otherItem;
    private OutlineTextContainerView outlinePasswordView;
    private int passcodeSetStep;
    private TextView passcodesDoNotMatchTextView;
    private ImageView passwordButton;
    private EditTextBoldCursor passwordEditText;
    private boolean postedHidePasscodesDoNotMatch;
    private int rowCount;
    private TextView titleTextView;
    private int type;
    private int utyanRow;

    public class AnonymousClass4 extends ActionBar.ActionBarMenuOnItemClick {
        final ActionBarMenuSubItem val$switchItem;

        public AnonymousClass4(ActionBarMenuSubItem actionBarMenuSubItem) {
            this.val$switchItem = actionBarMenuSubItem;
        }

        public void lambda$onItemClick$0(ActionBarMenuSubItem actionBarMenuSubItem) {
            actionBarMenuSubItem.setText(LocaleController.getString(PasscodeActivity.this.currentPasswordType == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
            actionBarMenuSubItem.setIcon(PasscodeActivity.this.currentPasswordType == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
            PasscodeActivity.this.showKeyboard();
            if (PasscodeActivity.this.isPinCode()) {
                PasscodeActivity.this.passwordEditText.setInputType(524417);
                AndroidUtilities.updateViewVisibilityAnimated(PasscodeActivity.this.passwordButton, true, 0.1f, false);
            }
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                PasscodeActivity.this.finishFragment();
                return;
            }
            if (i == 1) {
                PasscodeActivity passcodeActivity = PasscodeActivity.this;
                passcodeActivity.currentPasswordType = passcodeActivity.currentPasswordType != 0 ? 0 : 1;
                AndroidUtilities.runOnUIThread(new PhotoViewer$44$$ExternalSyntheticLambda0(26, this, this.val$switchItem), 150L);
                PasscodeActivity.this.passwordEditText.setText("");
                for (CodeNumberField codeNumberField : PasscodeActivity.this.codeFieldContainer.codeField) {
                    codeNumberField.setText("");
                }
                PasscodeActivity.this.updateFields();
            }
        }
    }

    public class AnonymousClass8 extends CodeFieldContainer {
        public AnonymousClass8(Context context) {
            super(context);
        }

        public void lambda$processNextPressed$0() {
            PasscodeActivity.this.processNext();
        }

        @Override
        public void processNextPressed() {
            if (PasscodeActivity.this.passcodeSetStep == 0) {
                postDelayed(new PhotoViewer$$ExternalSyntheticLambda60(this, 9), 260L);
            } else {
                PasscodeActivity.this.processDone();
            }
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private static final int VIEW_TYPE_CHECK = 0;
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_INFO = 2;
        private static final int VIEW_TYPE_SETTING = 1;
        private static final int VIEW_TYPE_UTYAN = 4;
        private final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return PasscodeActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == PasscodeActivity.this.fingerprintRow || i == PasscodeActivity.this.captureRow) {
                return 0;
            }
            if (i == PasscodeActivity.this.changePasscodeRow || i == PasscodeActivity.this.autoLockRow || i == PasscodeActivity.this.disablePasscodeRow) {
                return 1;
            }
            if (i == PasscodeActivity.this.autoLockDetailRow || i == PasscodeActivity.this.captureDetailRow || i == PasscodeActivity.this.hintRow) {
                return 2;
            }
            if (i == PasscodeActivity.this.captureHeaderRow) {
                return 3;
            }
            return i == PasscodeActivity.this.utyanRow ? 4 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == PasscodeActivity.this.fingerprintRow || adapterPosition == PasscodeActivity.this.autoLockRow || adapterPosition == PasscodeActivity.this.captureRow || adapterPosition == PasscodeActivity.this.changePasscodeRow || adapterPosition == PasscodeActivity.this.disablePasscodeRow;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == PasscodeActivity.this.fingerprintRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                    return;
                } else {
                    if (i == PasscodeActivity.this.captureRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
                        return;
                    }
                    return;
                }
            }
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType != 3) {
                        if (itemViewType != 4) {
                            return;
                        }
                        RLottieImageHolderView rLottieImageHolderView = (RLottieImageHolderView) viewHolder.itemView;
                        rLottieImageHolderView.imageView.setAnimation(R.raw.utyan_passcode, 100, 100);
                        rLottieImageHolderView.imageView.playAnimation();
                        return;
                    }
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    headerCell.setHeight(46);
                    if (i == PasscodeActivity.this.captureHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                        return;
                    }
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == PasscodeActivity.this.hintRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                    textInfoPrivacyCell.setBackground(null);
                    textInfoPrivacyCell.getTextView().setGravity(1);
                    return;
                } else if (i == PasscodeActivity.this.autoLockDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoLockInfo));
                    textInfoPrivacyCell.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                } else {
                    if (i == PasscodeActivity.this.captureDetailRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                        textInfoPrivacyCell.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                        return;
                    }
                    return;
                }
            }
            TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
            if (i == PasscodeActivity.this.changePasscodeRow) {
                textSettingsCell.setText(LocaleController.getString(R.string.ChangePasscode), true);
                if (SharedConfig.passcodeHash.isEmpty()) {
                    int i2 = Theme.key_windowBackgroundWhiteGrayText7;
                    textSettingsCell.setTag(Integer.valueOf(i2));
                    textSettingsCell.setTextColor(Theme.getColor(null, i2, false));
                    return;
                } else {
                    int i3 = Theme.key_windowBackgroundWhiteBlackText;
                    textSettingsCell.setTag(Integer.valueOf(i3));
                    textSettingsCell.setTextColor(Theme.getColor(null, i3, false));
                    return;
                }
            }
            if (i != PasscodeActivity.this.autoLockRow) {
                if (i == PasscodeActivity.this.disablePasscodeRow) {
                    textSettingsCell.setText(LocaleController.getString(R.string.DisablePasscode), false);
                    int i4 = Theme.key_text_RedBold;
                    textSettingsCell.setTag(Integer.valueOf(i4));
                    textSettingsCell.setTextColor(Theme.getColor(null, i4, false));
                    return;
                }
                return;
            }
            int i5 = SharedConfig.autoLockIn;
            if (i5 == 0) {
                string = LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]);
            } else if (i5 < 3600) {
                string = LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i5 / 60, new Object[0]));
            } else {
                string = i5 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i5 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i5 / 60.0f) / 60.0f) / 24.0f), new Object[0]));
            }
            textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AutoLock), string, false, true);
            int i6 = Theme.key_windowBackgroundWhiteBlackText;
            textSettingsCell.setTag(Integer.valueOf(i6));
            textSettingsCell.setTextColor(Theme.getColor(null, i6, false));
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCheckCell;
            if (i != 0) {
                if (i == 1) {
                    textCheckCell = new TextSettingsCell(this.mContext, null, 0);
                } else if (i == 3) {
                    textCheckCell = new HeaderCell(this.mContext);
                } else if (i != 4) {
                    textCheckCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                } else {
                    textCheckCell = new RLottieImageHolderView(this.mContext);
                    textCheckCell.setTag(-33024);
                }
            } else {
                textCheckCell = new TextCheckCell(this.mContext);
            }
            return new RecyclerListView.Holder(textCheckCell);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PasscodeActivityType {
    }

    public static final class RLottieImageHolderView extends FrameLayout {
        private final RLottieImageView imageView;

        public void lambda$new$0(View view) {
            if (this.imageView.getAnimatedDrawable().isRunning()) {
                return;
            }
            this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
            this.imageView.playAnimation();
        }

        private RLottieImageHolderView(Context context) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 18));
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
        this.hidePasscodesDoNotMatch = new PasscodeActivity$$ExternalSyntheticLambda11(this, 5);
        this.type = i;
    }

    private void animateSuccessAnimation(Runnable runnable) {
        if (!isPinCode()) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
            if (i >= codeNumberFieldArr.length) {
                codeFieldContainer.postDelayed(new PhotoViewer$$ExternalSyntheticLambda15(19, this, runnable), (((long) codeNumberFieldArr.length) * 75) + 350);
                return;
            } else {
                CodeNumberField codeNumberField = codeNumberFieldArr[i];
                codeNumberField.postDelayed(new PasscodeActivity$$ExternalSyntheticLambda9(codeNumberField, 0), ((long) i) * 75);
                i++;
            }
        }
    }

    public static BaseFragment determineOpenFragment() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new ActionIntroActivity(6);
    }

    public boolean isCustomKeyboardVisible() {
        if (!isPinCode() || this.type == 0 || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    private boolean isPassword() {
        int i = this.type;
        return (i == 1 && this.currentPasswordType == 1) || (i == 2 && SharedConfig.passcodeType == 1);
    }

    public boolean isPinCode() {
        int i = this.type;
        return (i == 1 && this.currentPasswordType == 0) || (i == 2 && SharedConfig.passcodeType == 0);
    }

    public void lambda$animateSuccessAnimation$15(Runnable runnable) {
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            codeNumberField.animateSuccessProgress(0.0f);
        }
        runnable.run();
    }

    public void lambda$createView$1(int i, boolean z) {
        Runnable runnable;
        if (i < AndroidUtilities.dp(20.0f) || (runnable = this.onShowKeyboardCallback) == null) {
            return;
        }
        runnable.run();
        this.onShowKeyboardCallback = null;
    }

    public boolean lambda$createView$10(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.passcodeSetStep;
        if (i2 == 0) {
            processNext();
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        processDone();
        return true;
    }

    public void lambda$createView$11(CodeNumberField codeNumberField, View view, boolean z) {
        this.keyboardView.setEditText(codeNumberField);
        this.keyboardView.setDispatchBackWhenEmpty(true);
    }

    public void lambda$createView$12(View view) {
        int i = this.type;
        if (i != 1) {
            if (i == 2) {
                processDone();
            }
        } else if (this.passcodeSetStep == 0) {
            processNext();
        } else {
            processDone();
        }
    }

    public void lambda$createView$2(AlertDialog alertDialog, int i) {
        SharedConfig.passcodeHash = "";
        SharedConfig.appLocked = false;
        SharedConfig.saveConfig();
        getMediaDataController().buildShortcuts();
        int childCount = this.listView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof TextSettingsCell) {
                ((TextSettingsCell) childAt).setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false));
                break;
            }
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
        finishFragment();
    }

    public static String lambda$createView$3(int i) {
        if (i == 0) {
            return LocaleController.getString(R.string.AutoLockDisabled);
        }
        if (i == 1) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0]));
        }
        if (i == 2) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0]));
        }
        if (i == 3) {
            return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        }
        return i == 4 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0])) : "";
    }

    public void lambda$createView$4(NumberPicker numberPicker, int i, AlertDialog alertDialog, int i2) {
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
        this.listAdapter.lambda$onBindViewHolder$31(i);
        UserConfig.getInstance(this.currentAccount).saveConfig(false);
    }

    public void lambda$createView$5(View view, int i) {
        if (view.isEnabled()) {
            if (i == this.disablePasscodeRow) {
                AlertDialog alertDialogCreate = new AlertDialog.Builder(getParentActivity(), 0, null).setTitle(LocaleController.getString(R.string.DisablePasscode)).setMessage(LocaleController.getString(R.string.DisablePasscodeConfirmMessage)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.DisablePasscodeTurnOff), new TodoItemMenu$$ExternalSyntheticLambda3(this, 9)).create();
                alertDialogCreate.show();
                ((TextView) alertDialogCreate.getButton(-1)).setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
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
                        AlertsCreator.showSimpleAlert(this, LocaleController.getString(R.string.ScreenCaptureAlert));
                        return;
                    }
                    return;
                }
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.AutoLock));
            NumberPicker numberPicker = new NumberPicker(getParentActivity());
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(4);
            int i2 = SharedConfig.autoLockIn;
            if (i2 == 0) {
                numberPicker.setValue(0);
            } else if (i2 == 60) {
                numberPicker.setValue(1);
            } else if (i2 == 300) {
                numberPicker.setValue(2);
            } else if (i2 == 3600) {
                numberPicker.setValue(3);
            } else if (i2 == 18000) {
                numberPicker.setValue(4);
            }
            numberPicker.setFormatter(new ChatActivity$$ExternalSyntheticLambda49(29));
            builder.setView(numberPicker);
            builder.setNegativeButton(LocaleController.getString(R.string.Done), new ChatActivity$$ExternalSyntheticLambda437(this, numberPicker, i, 5));
            showDialog(builder.create());
        }
    }

    public static View lambda$createView$6(Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
        textView.setGravity(1);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setTextSize(1, 15.0f);
        return textView;
    }

    public static void lambda$createView$7(Context context, View view) {
        AlertsCreator.createForgotPasscodeDialog(context).show();
    }

    public void lambda$createView$8(View view, boolean z) {
        this.outlinePasswordView.animateSelection(z ? 1.0f : 0.0f);
    }

    public void lambda$createView$9(AtomicBoolean atomicBoolean, View view) {
        atomicBoolean.set(!atomicBoolean.get());
        int selectionStart = this.passwordEditText.getSelectionStart();
        int selectionEnd = this.passwordEditText.getSelectionEnd();
        this.passwordEditText.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
        this.passwordEditText.setSelection(selectionStart, selectionEnd);
        this.passwordButton.setColorFilter(Theme.getColor(null, atomicBoolean.get() ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText, false));
    }

    public void lambda$new$0() {
        this.postedHidePasscodesDoNotMatch = false;
        AndroidUtilities.updateViewVisibilityAnimated(this.passcodesDoNotMatchTextView, false);
    }

    public void lambda$onPasscodeError$20() {
        if (!isPinCode()) {
            this.outlinePasswordView.animateError(0.0f);
            return;
        }
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            codeNumberField.animateErrorProgress(0.0f);
        }
    }

    public void lambda$onPasscodeError$21() {
        AndroidUtilities.runOnUIThread(new PasscodeActivity$$ExternalSyntheticLambda11(this, 3), isPinCode() ? 150L : 1000L);
    }

    public void lambda$processDone$17() {
        this.codeFieldContainer.postDelayed(this.hidePasscodesDoNotMatch, 3000L);
        this.postedHidePasscodesDoNotMatch = true;
    }

    public void lambda$processDone$18(boolean z) {
        getMediaDataController().buildShortcuts();
        if (z) {
            presentFragment(new PasscodeActivity(0), true);
            Runnable runnable = this.openedSettings;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                this.openedSettings = null;
            }
        } else {
            finishFragment();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
    }

    public void lambda$processDone$19() {
        presentFragment(new PasscodeActivity(0), true);
        Runnable runnable = this.openedSettings;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.openedSettings = null;
        }
    }

    public void lambda$setCustomKeyboardVisible$13(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.keyboardView.setAlpha(fFloatValue);
        this.keyboardView.setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(230.0f) * 0.75f);
        this.fragmentView.requestLayout();
    }

    public void lambda$updateFields$16(boolean z) {
        this.floatingButton.setButtonVisible(true, z);
        AndroidUtilities.cancelRunOnUIThread(this.onShowKeyboardCallback);
    }

    private void onPasscodeError() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (isPinCode()) {
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                codeNumberField.animateErrorProgress(1.0f);
            }
        } else {
            this.outlinePasswordView.animateError(1.0f);
        }
        AndroidUtilities.shakeViewSpring(isPinCode() ? this.codeFieldContainer : this.outlinePasswordView, isPinCode() ? 10.0f : 4.0f, new PasscodeActivity$$ExternalSyntheticLambda11(this, 4));
    }

    public void processDone() {
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        if (isPassword() && this.passwordEditText.getText().length() == 0) {
            onPasscodeError();
            return;
        }
        String code = isPinCode() ? this.codeFieldContainer.getCode() : this.passwordEditText.getText().toString();
        int i4 = this.type;
        if (i4 == 1) {
            if (!this.firstPassword.equals(code)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.passcodesDoNotMatchTextView, true);
                for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                    codeNumberField.setText("");
                }
                if (isPinCode()) {
                    this.codeFieldContainer.codeField[0].requestFocus();
                }
                this.passwordEditText.setText("");
                onPasscodeError();
                this.codeFieldContainer.removeCallbacks(this.hidePasscodesDoNotMatch);
                this.codeFieldContainer.post(new PasscodeActivity$$ExternalSyntheticLambda11(this, i3));
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
            animateSuccessAnimation(new PasscodeActivity$$ExternalSyntheticLambda13(i2, this, zIsEmpty));
            return;
        }
        if (i4 == 2) {
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
                onPasscodeError();
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
                onPasscodeError();
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
            animateSuccessAnimation(new PasscodeActivity$$ExternalSyntheticLambda11(this, i));
        }
    }

    public void processNext() {
        if ((this.currentPasswordType == 1 && this.passwordEditText.getText().length() == 0) || (this.currentPasswordType == 0 && this.codeFieldContainer.getCode().length() != 4)) {
            onPasscodeError();
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
        showKeyboard();
        this.passcodeSetStep = 1;
    }

    private void setCustomKeyboardVisible(final boolean z, boolean z2) {
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
        duration.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 10));
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                PasscodeActivity.this.keyboardView.setVisibility(8);
            }

            @Override
            public void onAnimationStart(Animator animator) {
                if (z) {
                    PasscodeActivity.this.keyboardView.setVisibility(0);
                }
            }
        });
        duration.start();
    }

    public void showKeyboard() {
        if (isPinCode()) {
            this.codeFieldContainer.codeField[0].requestFocus();
            if (isCustomKeyboardVisible()) {
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

    public void updateFields() {
        String string;
        if (this.type == 2) {
            string = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.passcodeSetStep == 0) {
            string = LocaleController.getString(this.currentPasswordType == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword);
        } else {
            string = this.descriptionTextSwitcher.getCurrentView().getText().toString();
        }
        boolean z = (this.descriptionTextSwitcher.getCurrentView().getText().equals(string) || TextUtils.isEmpty(this.descriptionTextSwitcher.getCurrentView().getText())) ? false : true;
        if (this.type == 2) {
            this.descriptionTextSwitcher.setText(LocaleController.getString(R.string.EnterYourPasscodeInfo), z);
        } else if (this.passcodeSetStep == 0) {
            this.descriptionTextSwitcher.setText(LocaleController.getString(this.currentPasswordType == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword), z);
        }
        if (isPinCode()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.codeFieldContainer, true, 1.0f, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.outlinePasswordView, false, 1.0f, z);
        } else if (isPassword()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.codeFieldContainer, false, 1.0f, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.outlinePasswordView, true, 1.0f, z);
        }
        if (isPassword()) {
            PasscodeActivity$$ExternalSyntheticLambda13 passcodeActivity$$ExternalSyntheticLambda13 = new PasscodeActivity$$ExternalSyntheticLambda13(1, this, z);
            this.onShowKeyboardCallback = passcodeActivity$$ExternalSyntheticLambda13;
            AndroidUtilities.runOnUIThread(passcodeActivity$$ExternalSyntheticLambda13, 3000L);
        } else {
            this.floatingButton.setButtonVisible(false, z);
        }
        setCustomKeyboardVisible(isCustomKeyboardVisible(), z);
        showKeyboard();
    }

    private void updateRows() {
        this.fingerprintRow = -1;
        this.utyanRow = 0;
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

    @Override
    public View createView(Context context) {
        final View view;
        int i;
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem;
        ActionBar actionBar = this.actionBar;
        int i2 = R.drawable.ic_ab_back;
        actionBar.setBackButtonImage(i2);
        boolean z = false;
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    PasscodeActivity.this.finishFragment();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        int i3 = 1;
        if (this.type == 0) {
            view = frameLayout;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
            scrollView.setFillViewport(true);
            view = scrollView;
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            public void onLayout(boolean z2, int i4, int i5, int i6, int i7) {
                int measuredHeight;
                if (PasscodeActivity.this.keyboardView.getVisibility() == 8 || measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                    if (PasscodeActivity.this.keyboardView.getVisibility() != 8) {
                        View view2 = view;
                        int measuredWidth = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                        view2.layout(0, 0, measuredWidth, measuredHeight);
                    } else {
                        View view3 = view;
                        int measuredWidth2 = getMeasuredWidth();
                        measuredHeight = getMeasuredHeight();
                        view3.layout(0, 0, measuredWidth2, measuredHeight);
                    }
                } else if (PasscodeActivity.this.isCustomKeyboardVisible()) {
                    View view4 = view;
                    int measuredWidth3 = getMeasuredWidth();
                    measuredHeight = measureKeyboardHeight() + (getMeasuredHeight() - AndroidUtilities.dp(230.0f));
                    view4.layout(0, 0, measuredWidth3, measuredHeight);
                } else {
                    View view5 = view;
                    int measuredWidth4 = getMeasuredWidth();
                    measuredHeight = getMeasuredHeight();
                    view5.layout(0, 0, measuredWidth4, measuredHeight);
                }
                PasscodeActivity.this.keyboardView.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                notifyHeightChanged();
            }

            @Override
            public void onMeasure(int i4, int i5) {
                int size = View.MeasureSpec.getSize(i4);
                int size2 = View.MeasureSpec.getSize(i5);
                setMeasuredDimension(size, size2);
                if (PasscodeActivity.this.keyboardView.getVisibility() != 8 && measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                    size2 -= AndroidUtilities.dp(230.0f);
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                PasscodeActivity.this.keyboardView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
            }
        };
        sizeNotifierFrameLayout.setDelegate(new LoginActivity$$ExternalSyntheticLambda10(this, 1));
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.addView(view, LayoutHelper.createLinear(-1, 0, 1.0f));
        CustomPhoneKeyboardView customPhoneKeyboardView = new CustomPhoneKeyboardView(context);
        this.keyboardView = customPhoneKeyboardView;
        customPhoneKeyboardView.setVisibility(isCustomKeyboardVisible() ? 0 : 8);
        sizeNotifierFrameLayout.addView(this.keyboardView, LayoutHelper.createLinear(-1, 230));
        int i4 = this.type;
        if (i4 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Passcode));
            int i5 = Theme.key_windowBackgroundGray;
            frameLayout.setTag(Integer.valueOf(i5));
            frameLayout.setBackgroundColor(Theme.getColor(null, i5, false));
            RecyclerListView recyclerListView = new RecyclerListView(context);
            this.listView = recyclerListView;
            recyclerListView.setSections();
            this.actionBar.setAdaptiveBackground(this.listView);
            this.listView.setLayoutManager(new LinearLayoutManager(context, i3, z) {
                {
                    super(i3, z);
                }

                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }
            });
            this.listView.setVerticalScrollBarEnabled(false);
            this.listView.lambda$onCellEnter$52(null);
            this.listView.setLayoutAnimation(null);
            frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
            RecyclerListView recyclerListView2 = this.listView;
            ListAdapter listAdapter = new ListAdapter(context);
            this.listAdapter = listAdapter;
            recyclerListView2.setAdapter(listAdapter);
            this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 25));
        } else if (i4 == 1 || i4 == 2) {
            ActionBar actionBar2 = this.actionBar;
            if (actionBar2 != null) {
                actionBar2.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                this.actionBar.setBackButtonImage(i2);
                this.actionBar.setItemsColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), false);
                this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarWhiteSelector, false), false);
                this.actionBar.setCastShadows(false);
                ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
                if (this.type == 1) {
                    ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other);
                    this.otherItem = actionBarMenuItemAddItem;
                    actionBarMenuSubItemAddSubItem = actionBarMenuItemAddItem.addSubItem(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    actionBarMenuSubItemAddSubItem = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass4(actionBarMenuSubItemAddSubItem));
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockImageView = rLottieImageView;
            rLottieImageView.setFocusable(false);
            this.lockImageView.setAnimation(R.raw.tsv_setup_intro, 120, 120);
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
            if (this.type != 1) {
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
            textViewSwitcher.setFactory(new PhotoViewer$$ExternalSyntheticLambda57(context, 2));
            this.descriptionTextSwitcher.setInAnimation(context, R.anim.alpha_in);
            this.descriptionTextSwitcher.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.descriptionTextSwitcher, LayoutHelper.createLinear(-2, -2, 1, 20, 8, 20, 0));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
            textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView2.setGravity((isPassword() ? 3 : 1) | 16);
            textView2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(context, 24));
            textView2.setVisibility(this.type == 2 ? 0 : 8);
            textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout.addView(textView2, LayoutHelper.createFrame(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            VerticalPositionAutoAnimator.attach(textView2);
            TextView textView3 = new TextView(context);
            this.passcodesDoNotMatchTextView = textView3;
            textView3.setTextSize(1, 14.0f);
            this.passcodesDoNotMatchTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            this.passcodesDoNotMatchTextView.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.passcodesDoNotMatchTextView.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.passcodesDoNotMatchTextView, false, 1.0f, false);
            frameLayout.addView(this.passcodesDoNotMatchTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
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
            if (this.type == 1) {
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
            this.passwordEditText.setOnFocusChangeListener(new DialogsActivity$$ExternalSyntheticLambda37(this, 10));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.addView(this.passwordEditText, LayoutHelper.createLinear(0, -2, 1.0f));
            ImageView imageView = new ImageView(context);
            this.passwordButton = imageView;
            imageView.setImageResource(R.drawable.msg_message);
            this.passwordButton.setColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            this.passwordButton.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 1, -1));
            AndroidUtilities.updateViewVisibilityAnimated(this.passwordButton, this.type == 1 && this.passcodeSetStep == 0, 0.1f, false);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.passwordEditText.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                    if (PasscodeActivity.this.type == 1 && PasscodeActivity.this.passcodeSetStep == 0) {
                        if (TextUtils.isEmpty(editable) && PasscodeActivity.this.passwordButton.getVisibility() != 8) {
                            if (atomicBoolean.get()) {
                                PasscodeActivity.this.passwordButton.callOnClick();
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(PasscodeActivity.this.passwordButton, false, 0.1f, true);
                        } else {
                            if (TextUtils.isEmpty(editable) || PasscodeActivity.this.passwordButton.getVisibility() == 0) {
                                return;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(PasscodeActivity.this.passwordButton, true, 0.1f, true);
                        }
                    }
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                }
            });
            this.passwordButton.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(16, this, atomicBoolean));
            linearLayout2.addView(this.passwordButton, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.outlinePasswordView.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f));
            frameLayout2.addView(this.outlinePasswordView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 0));
            this.passwordEditText.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda350(this, 9));
            this.passwordEditText.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                    if (PasscodeActivity.this.postedHidePasscodesDoNotMatch) {
                        PasscodeActivity.this.codeFieldContainer.removeCallbacks(PasscodeActivity.this.hidePasscodesDoNotMatch);
                        PasscodeActivity.this.hidePasscodesDoNotMatch.run();
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                }
            });
            this.passwordEditText.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
                @Override
                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                @Override
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                @Override
                public void onDestroyActionMode(ActionMode actionMode) {
                }

                @Override
                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            });
            AnonymousClass8 anonymousClass8 = new AnonymousClass8(context);
            this.codeFieldContainer = anonymousClass8;
            anonymousClass8.setNumbersCount(4, 10);
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(!isCustomKeyboardVisible());
                codeNumberField.setTransformationMethod(PasswordTransformationMethod.getInstance());
                codeNumberField.setTextSize(1, 24.0f);
                codeNumberField.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                        if (PasscodeActivity.this.postedHidePasscodesDoNotMatch) {
                            PasscodeActivity.this.codeFieldContainer.removeCallbacks(PasscodeActivity.this.hidePasscodesDoNotMatch);
                            PasscodeActivity.this.hidePasscodesDoNotMatch.run();
                        }
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
                    }
                });
                codeNumberField.setOnFocusChangeListener(new StakedDiceSheet$$ExternalSyntheticLambda6(this, codeNumberField, 1));
            }
            frameLayout2.addView(this.codeFieldContainer, LayoutHelper.createFrame(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 1, 0, 32, 0, 72));
            if (this.type == 1) {
                frameLayout.setTag(Integer.valueOf(Theme.key_windowBackgroundWhite));
            }
            FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
            this.floatingButton = fragmentFloatingButton;
            VerticalPositionAutoAnimator.attach(fragmentFloatingButton);
            frameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParamsBig());
            this.floatingButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 25));
            TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(context);
            transformableLoginButtonView.setTransformType(1);
            transformableLoginButtonView.setProgress(0.0f);
            transformableLoginButtonView.setColor(Theme.getColor(null, Theme.key_chats_actionIcon, false));
            transformableLoginButtonView.setDrawBackground(false);
            this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
            this.floatingButton.addView(transformableLoginButtonView, LayoutHelper.createFrame(56, 56, 17));
            FragmentFloatingButton fragmentFloatingButton2 = this.floatingButton;
            fragmentFloatingButton2.addAdditionalView(fragmentFloatingButton2);
            updateFields();
        }
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.type == 0) {
                updateRows();
                ListAdapter listAdapter = this.listAdapter;
                if (listAdapter != null) {
                    listAdapter.notifyDataSetChanged();
                }
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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
    public boolean hasForceLightStatusBar() {
        return this.type != 0;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        CodeNumberField[] codeNumberFieldArr;
        int i;
        super.onConfigurationChanged(configuration);
        setCustomKeyboardVisible(isCustomKeyboardVisible(), false);
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
        CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
        if (codeFieldContainer == null || (codeNumberFieldArr = codeFieldContainer.codeField) == null) {
            return;
        }
        for (CodeNumberField codeNumberField : codeNumberFieldArr) {
            codeNumberField.setShowSoftInputOnFocusCompat(!isCustomKeyboardVisible());
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        updateRows();
        if (this.type != 0) {
            return true;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.type == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetPasscode);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public void onPause() {
        super.onPause();
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        if (this.type != 0 && !isCustomKeyboardVisible()) {
            AndroidUtilities.runOnUIThread(new PasscodeActivity$$ExternalSyntheticLambda11(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (isCustomKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || this.type == 0) {
            return;
        }
        showKeyboard();
    }

    public void setOnOpenedSettings(Runnable runnable) {
        this.openedSettings = runnable;
    }
}
