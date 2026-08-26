package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.iv.RichEditText;

public abstract class CodeNumberField extends EditTextBoldCursor {
    public static final SimpleFloatPropertyCompat ERROR_PROGRESS;
    public static final SimpleFloatPropertyCompat FOCUSED_PROGRESS;
    public static final SimpleFloatPropertyCompat SUCCESS_PROGRESS;
    public static final SimpleFloatPropertyCompat SUCCESS_SCALE_PROGRESS;
    public float enterAnimation;
    public ValueAnimator enterAnimator;
    public float errorProgress;
    public final SpringAnimation errorSpringAnimation;
    public float exitAnimation;
    public ValueAnimator exitAnimator;
    public Bitmap exitBitmap;
    public Canvas exitCanvas;
    public float focusedProgress;
    public final SpringAnimation focusedSpringAnimation;
    public boolean pressed;
    public boolean replaceAnimation;
    public boolean showSoftInputOnFocusInternal;
    public float successProgress;
    public float successScaleProgress;
    public final SpringAnimation successScaleSpringAnimation;
    public final SpringAnimation successSpringAnimation;

    static {
        SimpleFloatPropertyCompat simpleFloatPropertyCompat = new SimpleFloatPropertyCompat(new ChatActivity$$ExternalSyntheticLambda131(8), new ChatActivity$$ExternalSyntheticLambda131(9));
        simpleFloatPropertyCompat.multiplier = 100.0f;
        FOCUSED_PROGRESS = simpleFloatPropertyCompat;
        SimpleFloatPropertyCompat simpleFloatPropertyCompat2 = new SimpleFloatPropertyCompat(new ChatActivity$$ExternalSyntheticLambda131(10), new ChatActivity$$ExternalSyntheticLambda131(11));
        simpleFloatPropertyCompat2.multiplier = 100.0f;
        ERROR_PROGRESS = simpleFloatPropertyCompat2;
        SimpleFloatPropertyCompat simpleFloatPropertyCompat3 = new SimpleFloatPropertyCompat(new ChatActivity$$ExternalSyntheticLambda131(12), new ChatActivity$$ExternalSyntheticLambda131(13));
        simpleFloatPropertyCompat3.multiplier = 100.0f;
        SUCCESS_PROGRESS = simpleFloatPropertyCompat3;
        SimpleFloatPropertyCompat simpleFloatPropertyCompat4 = new SimpleFloatPropertyCompat(new ChatActivity$$ExternalSyntheticLambda131(14), new ChatActivity$$ExternalSyntheticLambda131(15));
        simpleFloatPropertyCompat4.multiplier = 100.0f;
        SUCCESS_SCALE_PROGRESS = simpleFloatPropertyCompat4;
    }

    public CodeNumberField(Context context) {
        super(context);
        this.successScaleProgress = 1.0f;
        this.focusedSpringAnimation = new SpringAnimation(this, FOCUSED_PROGRESS);
        this.errorSpringAnimation = new SpringAnimation(this, ERROR_PROGRESS);
        this.successSpringAnimation = new SpringAnimation(this, SUCCESS_PROGRESS);
        this.successScaleSpringAnimation = new SpringAnimation(this, SUCCESS_SCALE_PROGRESS);
        this.showSoftInputOnFocusInternal = true;
        this.enterAnimation = 1.0f;
        this.exitAnimation = 1.0f;
        this.pressed = false;
        setBackground(null);
        setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        setMovementMethod(null);
        addTextChangedListener(new ArticleViewer.AnonymousClass16((CodeFieldContainer.AnonymousClass1) this, 8));
    }

    public static void animateSpring(SpringAnimation springAnimation, float f) {
        SpringForce springForce = springAnimation.mSpring;
        if (springForce == null || f != ((float) springForce.mFinalPosition)) {
            springAnimation.cancel();
            SpringForce springForce2 = new SpringForce(f);
            springForce2.setStiffness(400.0f);
            springForce2.setDampingRatio(1.0f);
            springForce2.mFinalPosition = f;
            springAnimation.mSpring = springForce2;
            springAnimation.start();
        }
    }

    public final void animateSuccessProgress(float f) {
        animateSpring(this.successSpringAnimation, f * 100.0f);
        SpringAnimation springAnimation = this.successScaleSpringAnimation;
        springAnimation.cancel();
        if (f == 0.0f) {
            this.successScaleProgress = 1.0f;
            return;
        }
        SpringForce springForce = new SpringForce(1.0f);
        springForce.setStiffness(500.0f);
        springForce.setDampingRatio(0.75f);
        springForce.mFinalPosition = 100.0f;
        springAnimation.mSpring = springForce;
        springAnimation.mValue = 100.0f;
        springAnimation.mStartValueIsSet = true;
        springAnimation.mVelocity = 4000.0f;
        springAnimation.start();
    }

    public float getErrorProgress() {
        return this.errorProgress;
    }

    public float getFocusedProgress() {
        return this.focusedProgress;
    }

    public float getSuccessProgress() {
        return this.successProgress;
    }

    public float getSuccessScaleProgress() {
        return this.successScaleProgress;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.focusedSpringAnimation.cancel();
        this.errorSpringAnimation.cancel();
    }

    @Override
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (isFocused()) {
            return;
        }
        hideActionMode();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClipDescription primaryClipDescription;
        int i;
        if (motionEvent.getAction() == 0) {
            this.pressed = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            CodeFieldContainer codeFieldContainer = getParent() instanceof CodeFieldContainer ? (CodeFieldContainer) getParent() : null;
            if (motionEvent.getAction() == 1 && this.pressed) {
                if (!isFocused() || codeFieldContainer == null) {
                    requestFocus();
                } else {
                    ClipboardManager clipboardManager = (ClipboardManager) ContextCompat.getSystemService(getContext(), ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    try {
                        i = Integer.parseInt((itemAt == null || itemAt.getText() == null) ? "" : itemAt.getText().toString());
                    } catch (Exception unused) {
                        i = -1;
                    }
                    if (i > 0) {
                        startActionMode(new AnonymousClass2(0, this));
                    }
                }
                setSelection(0);
                if (this.showSoftInputOnFocusInternal) {
                    AndroidUtilities.showKeyboard(this);
                }
            }
            this.pressed = false;
        }
        return this.pressed;
    }

    @Override
    public final boolean requestFocus(int i, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z) {
        this.showSoftInputOnFocusInternal = z;
        setShowSoftInputOnFocus(z);
    }

    public final void startExitAnimation() {
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0 || getLayout() == null) {
            return;
        }
        Bitmap bitmap = this.exitBitmap;
        if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.exitBitmap.getWidth() != getMeasuredWidth()) {
            Bitmap bitmap2 = this.exitBitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.exitBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.exitCanvas = new Canvas(this.exitBitmap);
        }
        this.exitBitmap.eraseColor(0);
        CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
        StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        this.exitCanvas.save();
        this.exitCanvas.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(this.exitCanvas);
        this.exitCanvas.restore();
        this.exitAnimation = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.exitAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new CodeNumberField$$ExternalSyntheticLambda8(this, 0));
        this.exitAnimator.setDuration(220L);
        this.exitAnimator.start();
    }

    public final class AnonymousClass2 implements ActionMode.Callback {
        public final int $r8$classId;
        public final EditTextBoldCursor this$0;

        public AnonymousClass2(int i, EditTextBoldCursor editTextBoldCursor) {
            this.$r8$classId = i;
            this.this$0 = editTextBoldCursor;
        }

        @Override
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            ClipboardManager clipboardManager;
            ClipData primaryClip;
            int i;
            switch (this.$r8$classId) {
                case 0:
                    if (menuItem.getItemId() == 16908322) {
                        CodeNumberField codeNumberField = (CodeNumberField) this.this$0;
                        CodeFieldContainer codeFieldContainer = codeNumberField.getParent() instanceof CodeFieldContainer ? (CodeFieldContainer) codeNumberField.getParent() : null;
                        if (codeFieldContainer != null && (clipboardManager = (ClipboardManager) ContextCompat.getSystemService(codeNumberField.getContext(), ClipboardManager.class)) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
                            String string = primaryClip.getItemAt(0).getText().toString();
                            try {
                                i = Integer.parseInt(string);
                            } catch (Exception unused) {
                                i = -1;
                            }
                            if (i > 0) {
                                codeFieldContainer.setText(string, true);
                            }
                        }
                        codeNumberField.hideActionMode();
                        break;
                    }
                    return true;
                default:
                    return false;
            }
        }

        @Override
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            switch (this.$r8$classId) {
                case 0:
                    menu.add(0, 16908322, 0, 17039371);
                    break;
            }
            return true;
        }

        @Override
        public final void onDestroyActionMode(ActionMode actionMode) {
            int i = this.$r8$classId;
        }

        @Override
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            switch (this.$r8$classId) {
                case 0:
                    return true;
                default:
                    if (((RichEditText) this.this$0).length() != 0) {
                        return false;
                    }
                    for (int size = menu.size() - 1; size >= 0; size--) {
                        int itemId = menu.getItem(size).getItemId();
                        if (itemId != 16908322 && itemId != 16908337) {
                            menu.removeItem(itemId);
                        }
                    }
                    return true;
            }
        }

        private final void onDestroyActionMode$org$telegram$ui$CodeNumberField$2(ActionMode actionMode) {
        }

        private final void onDestroyActionMode$org$telegram$ui$iv$RichEditText$2(ActionMode actionMode) {
        }
    }
}
