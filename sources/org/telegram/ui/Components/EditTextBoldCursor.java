package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.messenger.utils.Choreographer60FpsContent;
import org.telegram.ui.ActionBar.FloatingActionMode;
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity$57$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda105;

public class EditTextBoldCursor extends EditTextEffects {
    private static final String BLINK_CLASS = "android.widget.Editor$Blink";
    private static Class editorClass;
    private static Method getVerticalOffsetMethod;
    private static Field mCursorDrawableResField;
    private static Field mEditor;
    private static Method mEditorInvalidateDisplayList;
    private static Field mScrollYField;
    private static boolean mScrollYGet;
    private static Field mShowCursorField;
    private int activeLineColor;
    private Paint activeLinePaint;
    private float activeLineWidth;
    private boolean allowDrawCursor;
    private View attachedToWindow;
    BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
    private boolean currentDrawHintAsHeader;
    ShapeDrawable cursorDrawable;
    private boolean cursorDrawn;
    private int cursorSize;
    private float cursorWidth;
    public Utilities.Callback2<Canvas, Runnable> drawHint;
    boolean drawInMaim;
    private Object editor;
    public boolean ellipsizeByGradient;
    private LinearGradient ellipsizeGradient;
    private Matrix ellipsizeMatrix;
    private Paint ellipsizePaint;
    private int ellipsizeWidth;
    private StaticLayout errorLayout;
    private int errorLineColor;
    private TextPaint errorPaint;
    private CharSequence errorText;
    private boolean fixed;
    public FloatingActionMode floatingActionMode;
    private FloatingToolbar floatingToolbar;
    private ViewTreeObserver.OnPreDrawListener floatingToolbarPreDrawListener;
    private boolean forceCursorEnd;
    private GradientDrawable gradientDrawable;
    private float headerAnimationProgress;
    private int headerHintColor;
    private AnimatorSet headerTransformAnimation;
    private CharSequence hint;
    private float hintAlpha;
    private AnimatedTextView.AnimatedTextDrawable hintAnimatedDrawable;
    private AnimatedTextView.AnimatedTextDrawable hintAnimatedDrawable2;
    private SubstringLayoutAnimator hintAnimator;
    private int hintColor;
    private long hintLastUpdateTime;
    private StaticLayout hintLayout;
    public int hintLayoutOffset;
    public float hintLayoutX;
    public float hintLayoutY;
    public boolean hintLayoutYFix;
    private boolean hintVisible;
    private int ignoreBottomCount;
    public boolean ignoreClipTop;
    private int ignoreTopCount;
    private final Choreographer60FpsContent.FrameCallback invalidateCallback;
    private boolean isTextWatchersSuppressed;
    private float lastLineActiveness;
    int lastOffset;
    private int lastSize;
    CharSequence lastText;
    private int lastTouchX;
    private boolean lineActive;
    private float lineActiveness;
    private int lineColor;
    private long lineLastUpdateTime;
    private Paint linePaint;
    private float lineSpacingExtra;
    private boolean lineVisible;
    private float lineY;
    public boolean lineYFix;
    private ViewTreeObserver.OnPreDrawListener listenerFixer;
    private Drawable mCursorDrawable;
    private int mHandlesColor;
    private ColorFilter mHandlesColorFilter;
    private Rect mTempRect;
    private Drawable mTextSelectHandle;
    private Drawable mTextSelectHandleLeft;
    private Drawable mTextSelectHandleRight;
    private boolean nextSetTextAnimated;
    private Runnable onPremiumMenuLockClickListener;
    private Rect padding;
    private Rect rect;
    private List<TextWatcher> registeredTextWatchers;
    float rightHintOffset;
    private int scrollY;
    private boolean supportRtlHint;
    private boolean transformHintToHeader;
    private boolean transformHintToHeaderOnFocus;
    private View windowView;

    public final class AnonymousClass4 extends ShapeDrawable {
        public final int $r8$classId = 0;

        public AnonymousClass4() {
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    EditTextBoldCursor editTextBoldCursor = EditTextBoldCursor.this;
                    if (!editTextBoldCursor.drawInMaim) {
                        super.draw(canvas);
                    } else {
                        editTextBoldCursor.cursorDrawn = true;
                    }
                    break;
                default:
                    super.draw(canvas);
                    EditTextBoldCursor.this.cursorDrawn = true;
                    break;
            }
        }

        @Override
        public int getIntrinsicHeight() {
            switch (this.$r8$classId) {
                case 0:
                    return AndroidUtilities.dp(EditTextBoldCursor.this.cursorSize + 20);
                default:
                    return super.getIntrinsicHeight();
            }
        }

        @Override
        public int getIntrinsicWidth() {
            switch (this.$r8$classId) {
                case 0:
                    return AndroidUtilities.dp(EditTextBoldCursor.this.cursorWidth);
                default:
                    return super.getIntrinsicWidth();
            }
        }

        public AnonymousClass4(RectShape rectShape) {
            super(rectShape);
        }
    }

    public EditTextBoldCursor(Context context) {
        super(context);
        this.invalidateCallback = new RLottieDrawable$$ExternalSyntheticLambda5(this, 2);
        this.rect = new Rect();
        this.hintVisible = true;
        this.hintAlpha = 1.0f;
        this.allowDrawCursor = true;
        this.forceCursorEnd = false;
        this.cursorWidth = 2.0f;
        this.lineVisible = false;
        this.lineActive = false;
        this.lineActiveness = 0.0f;
        this.lastLineActiveness = 0.0f;
        this.activeLineWidth = 0.0f;
        this.transformHintToHeaderOnFocus = true;
        this.lastOffset = -1;
        this.registeredTextWatchers = new ArrayList();
        this.isTextWatchersSuppressed = false;
        this.padding = new Rect();
        this.lastTouchX = -1;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            setImportantForAutofill(2);
        }
        this.linePaint = new Paint();
        this.activeLinePaint = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.errorPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        if (i >= 26) {
            setImportantForAutofill(2);
        }
        if (i >= 29) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4();
            this.cursorDrawable = anonymousClass4;
            anonymousClass4.setShape(new RectShape());
            this.gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.cursorDrawable);
        }
        try {
            if (!mScrollYGet && mScrollYField == null) {
                mScrollYGet = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                mScrollYField = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (editorClass == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                mEditor = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                editorClass = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    mShowCursorField = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = editorClass.getDeclaredMethod("invalidateTextDisplayList", null);
                    mEditorInvalidateDisplayList = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                getVerticalOffsetMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        if (this.cursorDrawable == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.gradientDrawable = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.editor = mEditor.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (mCursorDrawableResField == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    mCursorDrawableResField = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = mCursorDrawableResField;
                if (field != null) {
                    field.set(this, Integer.valueOf(R.drawable.field_carret_empty));
                }
            } catch (Throwable unused5) {
            }
        }
        this.cursorSize = AndroidUtilities.dp(24.0f);
    }

    public static void access$000(EditTextBoldCursor editTextBoldCursor) {
        FloatingToolbar floatingToolbar = editTextBoldCursor.floatingToolbar;
        if (floatingToolbar != null) {
            floatingToolbar.dismiss();
            editTextBoldCursor.floatingToolbar = null;
        }
        if (editTextBoldCursor.floatingToolbarPreDrawListener != null) {
            editTextBoldCursor.getViewTreeObserver().removeOnPreDrawListener(editTextBoldCursor.floatingToolbarPreDrawListener);
            editTextBoldCursor.floatingToolbarPreDrawListener = null;
        }
    }

    @Override
    public void addTextChangedListener(TextWatcher textWatcher) {
        this.registeredTextWatchers.add(textWatcher);
        if (this.isTextWatchersSuppressed) {
            return;
        }
        super.addTextChangedListener(textWatcher);
    }

    public final void checkHeaderVisibility(boolean z) {
        boolean z2 = this.transformHintToHeader && (getText().length() > 0 || (this.transformHintToHeaderOnFocus && isFocused()));
        if (this.currentDrawHintAsHeader != z2) {
            AnimatorSet animatorSet = this.headerTransformAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.headerTransformAnimation = null;
            }
            this.currentDrawHintAsHeader = z2;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.headerTransformAnimation = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", z2 ? 1.0f : 0.0f));
                this.headerTransformAnimation.setDuration(200L);
                this.headerTransformAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.headerTransformAnimation.start();
            } else {
                this.headerAnimationProgress = z2 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public void dispatchTextWatchersTextChanged() {
        for (TextWatcher textWatcher : this.registeredTextWatchers) {
            textWatcher.beforeTextChanged("", 0, length(), length());
            textWatcher.onTextChanged(getText(), 0, length(), length());
            textWatcher.afterTextChanged(getText());
        }
    }

    public final void drawHint(Canvas canvas) {
        if (length() == 0 || this.transformHintToHeader) {
            boolean z = this.hintVisible;
            if ((z && this.hintAlpha != 1.0f) || (!z && this.hintAlpha != 0.0f)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis - this.hintLastUpdateTime;
                if (j < 0 || j > 17) {
                    j = 17;
                }
                this.hintLastUpdateTime = jCurrentTimeMillis;
                if (this.hintVisible) {
                    float f = (j / 150.0f) + this.hintAlpha;
                    this.hintAlpha = f;
                    if (f > 1.0f) {
                        this.hintAlpha = 1.0f;
                    }
                } else {
                    float f2 = this.hintAlpha - (j / 150.0f);
                    this.hintAlpha = f2;
                    if (f2 < 0.0f) {
                        this.hintAlpha = 0.0f;
                    }
                }
                invalidate();
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.hintAnimatedDrawable;
            if (animatedTextDrawable != null && !TextUtils.isEmpty(animatedTextDrawable.currentText) && (this.hintVisible || this.hintAlpha != 0.0f)) {
                if (this.hintAnimatedDrawable2 != null) {
                    if (this.hintAnimatedDrawable2.getCurrentWidth() + this.hintAnimatedDrawable.getCurrentWidth() < getMeasuredWidth()) {
                        canvas.save();
                        canvas.translate(this.hintAnimatedDrawable.getCurrentWidth() + (this.hintAnimatedDrawable2.getCurrentWidth() - getMeasuredWidth()), 0.0f);
                        this.hintAnimatedDrawable2.alpha = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                        this.hintAnimatedDrawable2.draw(canvas);
                        canvas.restore();
                        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.hintAnimatedDrawable;
                        animatedTextDrawable2.rightPadding = 0.0f;
                        animatedTextDrawable2.invalidateSelf();
                    } else {
                        canvas.save();
                        canvas.translate(this.rightHintOffset, 0.0f);
                        this.hintAnimatedDrawable2.alpha = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                        this.hintAnimatedDrawable2.draw(canvas);
                        canvas.restore();
                        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = this.hintAnimatedDrawable;
                        animatedTextDrawable3.rightPadding = (this.hintAnimatedDrawable2.getCurrentWidth() + AndroidUtilities.dp(2.0f)) - this.rightHintOffset;
                        animatedTextDrawable3.invalidateSelf();
                    }
                } else {
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable4 = this.hintAnimatedDrawable;
                    animatedTextDrawable4.rightPadding = 0.0f;
                    animatedTextDrawable4.invalidateSelf();
                }
                this.hintAnimatedDrawable.alpha = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                this.hintAnimatedDrawable.draw(canvas);
                return;
            }
            if (this.hintLayout != null) {
                if (this.hintVisible || this.hintAlpha != 0.0f) {
                    int color = getPaint().getColor();
                    canvas.save();
                    float lineLeft = this.hintLayout.getLineLeft(0);
                    float lineWidth = this.hintLayout.getLineWidth(0);
                    int i = lineLeft != 0.0f ? (int) (0 - lineLeft) : 0;
                    if (this.supportRtlHint && LocaleController.isRTL) {
                        float scrollX = getScrollX() + i + (getMeasuredWidth() - lineWidth);
                        this.hintLayoutX = scrollX;
                        float height = (this.lineY - this.hintLayout.getHeight()) - AndroidUtilities.dp(7.0f);
                        this.hintLayoutY = height;
                        canvas.translate(scrollX, height);
                    } else {
                        float scrollX2 = getScrollX() + i + this.hintLayoutOffset;
                        this.hintLayoutX = scrollX2;
                        float height2 = (this.lineY - this.hintLayout.getHeight()) - AndroidUtilities.dp2(7.0f);
                        this.hintLayoutY = height2;
                        canvas.translate(scrollX2, height2);
                    }
                    if (this.transformHintToHeader) {
                        float f3 = 1.0f - (this.headerAnimationProgress * 0.3f);
                        if (this.supportRtlHint && LocaleController.isRTL) {
                            float f4 = lineWidth + lineLeft;
                            canvas.translate(f4 - (f4 * f3), 0.0f);
                        } else if (lineLeft != 0.0f) {
                            canvas.translate((1.0f - f3) * lineLeft, 0.0f);
                        }
                        canvas.scale(f3, f3);
                        canvas.translate(0.0f, (-AndroidUtilities.dp(22.0f)) * this.headerAnimationProgress);
                        getPaint().setColor(ColorUtils.blendARGB(this.headerAnimationProgress, this.hintColor, this.headerHintColor));
                    } else {
                        getPaint().setColor(this.hintColor);
                        getPaint().setAlpha((int) ((Color.alpha(this.hintColor) / 255.0f) * this.hintAlpha * 255.0f));
                    }
                    SubstringLayoutAnimator substringLayoutAnimator = this.hintAnimator;
                    if (substringLayoutAnimator == null || !substringLayoutAnimator.animateTextChange) {
                        Utilities.Callback2<Canvas, Runnable> callback2 = this.drawHint;
                        if (callback2 != null) {
                            callback2.run(canvas, new EmojiView$2$$ExternalSyntheticLambda1(18, this, canvas));
                        } else {
                            this.hintLayout.draw(canvas);
                        }
                    } else {
                        canvas.save();
                        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        SubstringLayoutAnimator substringLayoutAnimator2 = this.hintAnimator;
                        TextPaint paint = getPaint();
                        if (substringLayoutAnimator2.animateTextChange) {
                            float f5 = substringLayoutAnimator2.xOffset * (substringLayoutAnimator2.animateTextChangeOut ? substringLayoutAnimator2.hintProgress : 1.0f - substringLayoutAnimator2.hintProgress);
                            int alpha = paint.getAlpha();
                            if (substringLayoutAnimator2.animateStableLayout != null) {
                                canvas.save();
                                canvas.translate(f5, 0.0f);
                                substringLayoutAnimator2.animateStableLayout.draw(canvas);
                                canvas.restore();
                            }
                            StaticLayout staticLayout = substringLayoutAnimator2.animateInLayout;
                            EditTextBoldCursor editTextBoldCursor = substringLayoutAnimator2.parentView;
                            if (staticLayout != null) {
                                float f6 = substringLayoutAnimator2.animateTextChangeOut ? 1.0f - substringLayoutAnimator2.hintProgress : substringLayoutAnimator2.hintProgress;
                                canvas.save();
                                paint.setAlpha((int) (alpha * f6));
                                canvas.translate(f5, 0.0f);
                                if (substringLayoutAnimator2.replaceAnimation) {
                                    float f7 = (f6 * 0.1f) + 0.9f;
                                    canvas.scale(f7, f7, f5, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                                }
                                substringLayoutAnimator2.animateInLayout.draw(canvas);
                                canvas.restore();
                                paint.setAlpha(alpha);
                            }
                            if (substringLayoutAnimator2.animateOutLayout != null) {
                                float f8 = substringLayoutAnimator2.animateTextChangeOut ? substringLayoutAnimator2.hintProgress : 1.0f - substringLayoutAnimator2.hintProgress;
                                canvas.save();
                                paint.setAlpha((int) (alpha * (substringLayoutAnimator2.animateTextChangeOut ? substringLayoutAnimator2.hintProgress : 1.0f - substringLayoutAnimator2.hintProgress)));
                                canvas.translate(f5, 0.0f);
                                if (substringLayoutAnimator2.replaceAnimation) {
                                    float f9 = (f8 * 0.1f) + 0.9f;
                                    canvas.scale(f9, f9, f5, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                                }
                                substringLayoutAnimator2.animateOutLayout.draw(canvas);
                                canvas.restore();
                                paint.setAlpha(alpha);
                            }
                        }
                        canvas.restore();
                    }
                    getPaint().setColor(color);
                    canvas.restore();
                }
            }
        }
    }

    public void extendActionMode(ActionMode actionMode, Menu menu) {
    }

    public void fixHandleView(boolean z) {
        if (z) {
            this.fixed = false;
            return;
        }
        if (this.fixed) {
            return;
        }
        try {
            if (editorClass == null) {
                editorClass = Class.forName("android.widget.Editor");
                Field declaredField = TextView.class.getDeclaredField("mEditor");
                mEditor = declaredField;
                declaredField.setAccessible(true);
                this.editor = mEditor.get(this);
            }
            if (this.listenerFixer == null) {
                Method declaredMethod = editorClass.getDeclaredMethod("getPositionListener", null);
                declaredMethod.setAccessible(true);
                this.listenerFixer = (ViewTreeObserver.OnPreDrawListener) declaredMethod.invoke(this.editor, null);
            }
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.listenerFixer;
            Objects.requireNonNull(onPreDrawListener);
            AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(onPreDrawListener, 28), 500L);
        } catch (Throwable unused) {
        }
        this.fixed = true;
    }

    public int getActionModeStyle() {
        return 1;
    }

    @Override
    public int getAutofillType() {
        return 0;
    }

    public StaticLayout getErrorLayout(int i) {
        if (TextUtils.isEmpty(this.errorText)) {
            return null;
        }
        return new StaticLayout(this.errorText, this.errorPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i = this.ignoreBottomCount;
        if (i == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.ignoreBottomCount = i - 1;
        int i2 = this.scrollY;
        if (i2 != Integer.MAX_VALUE) {
            return -i2;
        }
        return 0;
    }

    @Override
    public int getExtendedPaddingTop() {
        int i = this.ignoreTopCount;
        if (i == 0) {
            return super.getExtendedPaddingTop();
        }
        this.ignoreTopCount = i - 1;
        return 0;
    }

    public float getHeaderAnimationProgress() {
        return this.headerAnimationProgress;
    }

    public Layout getHintLayoutEx() {
        return this.hintLayout;
    }

    @Override
    public float getLineSpacingExtra() {
        return super.getLineSpacingExtra();
    }

    public float getLineY() {
        return this.lineY;
    }

    public Runnable getOnPremiumMenuLockClickListener() {
        return this.onPremiumMenuLockClickListener;
    }

    public Theme.ResourcesProvider getResourcesProvider() {
        return null;
    }

    @Override
    public Drawable getTextCursorDrawable() {
        if (this.cursorDrawable != null) {
            return super.getTextCursorDrawable();
        }
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(new RectShape());
        anonymousClass4.getPaint().setColor(0);
        return anonymousClass4;
    }

    @Override
    public Drawable getTextSelectHandle() {
        if (this.mTextSelectHandle == null) {
            this.mTextSelectHandle = updateHandleDrawable(super.getTextSelectHandle(), true);
        }
        return this.mTextSelectHandle;
    }

    @Override
    public Drawable getTextSelectHandleLeft() {
        if (this.mTextSelectHandleLeft == null) {
            this.mTextSelectHandleLeft = updateHandleDrawable(super.getTextSelectHandleLeft(), true);
        }
        return this.mTextSelectHandleLeft;
    }

    @Override
    public Drawable getTextSelectHandleRight() {
        if (this.mTextSelectHandleRight == null) {
            this.mTextSelectHandleRight = updateHandleDrawable(super.getTextSelectHandleRight(), true);
        }
        return this.mTextSelectHandleRight;
    }

    public boolean hasErrorText() {
        return !TextUtils.isEmpty(this.errorText);
    }

    public void hideActionMode() {
        FloatingToolbar floatingToolbar = this.floatingToolbar;
        if (floatingToolbar != null) {
            floatingToolbar.dismiss();
            this.floatingToolbar = null;
        }
        if (this.floatingToolbarPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.floatingToolbarPreDrawListener);
            this.floatingToolbarPreDrawListener = null;
        }
    }

    public void invalidateForce() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (mEditorInvalidateDisplayList != null) {
                    if (this.editor == null) {
                        this.editor = mEditor.get(this);
                    }
                    Object obj = this.editor;
                    if (obj != null) {
                        mEditorInvalidateDisplayList.invoke(obj, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean isTextWatchersSuppressed() {
        return this.isTextWatchersSuppressed;
    }

    public final void lambda$drawHint$1(Canvas canvas) {
        this.hintLayout.draw(canvas);
    }

    public final boolean lambda$startActionMode$2() {
        FloatingActionMode floatingActionMode = this.floatingActionMode;
        if (floatingActionMode == null) {
            return true;
        }
        floatingActionMode.updateViewLocationInWindow();
        return true;
    }

    @Override
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.attachedToWindow = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            Choreographer60FpsContent choreographer60FpsContent = Choreographer60FpsContent.getInstance();
            Choreographer60FpsContent.FrameCallback frameCallback = this.invalidateCallback;
            choreographer60FpsContent.getClass();
            Choreographer60FpsContent.checkMainThread();
            int iMax = Math.max(1, Math.min(2, 60));
            choreographer60FpsContent.removeFrameCallback(frameCallback);
            choreographer60FpsContent.getOrCreateGroup(iMax).callbacks.add(frameCallback);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = null;
        if (Build.VERSION.SDK_INT < 29) {
            Choreographer60FpsContent.getInstance().removeFrameCallback(this.invalidateCallback);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z;
        int totalPaddingTop;
        Object obj;
        boolean z2;
        int totalPaddingTop2;
        int i;
        drawHint(canvas);
        if (this.ellipsizeByGradient) {
            canvas.saveLayerAlpha((getPaddingLeft() + getScrollX()) - this.ellipsizeWidth, 0.0f, ((getWidth() + getScrollX()) - getPaddingRight()) + this.ellipsizeWidth, getHeight(), 255, 31);
        }
        int extendedPaddingTop = getExtendedPaddingTop();
        this.scrollY = Integer.MAX_VALUE;
        try {
            Field field = mScrollYField;
            if (field != null) {
                this.scrollY = field.getInt(this);
                mScrollYField.set(this, 0);
            } else {
                this.scrollY = getScrollX();
            }
        } catch (Exception e) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                throw new RuntimeException(e);
            }
        }
        this.ignoreTopCount = 1;
        this.ignoreBottomCount = 1;
        canvas.save();
        canvas.translate(0.0f, extendedPaddingTop);
        try {
            this.drawInMaim = true;
            super.onDraw(canvas);
            this.drawInMaim = false;
        } catch (Exception e2) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                throw new RuntimeException(e2);
            }
        }
        Field field2 = mScrollYField;
        if (field2 != null && (i = this.scrollY) != Integer.MAX_VALUE) {
            try {
                field2.set(this, Integer.valueOf(i));
            } catch (Exception e3) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw new RuntimeException(e3);
                }
            }
        }
        canvas.restore();
        if (this.cursorDrawable == null) {
            try {
                Field field3 = mShowCursorField;
                if (field3 == null || (obj = this.editor) == null) {
                    z = this.cursorDrawn;
                    this.cursorDrawn = false;
                } else {
                    z = (SystemClock.uptimeMillis() - field3.getLong(obj)) % 1000 < 500 && isFocused();
                }
                if (this.allowDrawCursor && z) {
                    canvas.save();
                    if (getVerticalOffsetMethod != null) {
                        if ((getGravity() & 112) != 48) {
                            totalPaddingTop = ((Integer) getVerticalOffsetMethod.invoke(this, Boolean.TRUE)).intValue();
                        } else {
                            totalPaddingTop = 0;
                        }
                    } else if ((getGravity() & 112) != 48) {
                        totalPaddingTop = getTotalPaddingTop() - getExtendedPaddingTop();
                    } else {
                        totalPaddingTop = 0;
                    }
                    canvas.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                    Layout layout = getLayout();
                    int lineForOffset = layout.getLineForOffset(getSelectionStart());
                    int lineCount = layout.getLineCount();
                    updateCursorPosition();
                    Rect bounds = this.gradientDrawable.getBounds();
                    Rect rect = this.rect;
                    rect.left = bounds.left;
                    rect.right = bounds.left + AndroidUtilities.dp(this.cursorWidth);
                    Rect rect2 = this.rect;
                    int i2 = bounds.bottom;
                    rect2.bottom = i2;
                    rect2.top = bounds.top;
                    float f = this.lineSpacingExtra;
                    if (f != 0.0f && lineForOffset < lineCount - 1) {
                        rect2.bottom = (int) (i2 - f);
                    }
                    int iCenterY = rect2.centerY();
                    int i3 = this.cursorSize;
                    rect2.top = iCenterY - (i3 / 2);
                    Rect rect3 = this.rect;
                    rect3.bottom = rect3.top + i3;
                    this.gradientDrawable.setBounds(rect3);
                    this.gradientDrawable.draw(canvas);
                    canvas.restore();
                }
            } catch (Throwable th) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw new RuntimeException(th);
                }
            }
        } else if (this.cursorDrawn && this.allowDrawCursor) {
            try {
                canvas.save();
                if (getVerticalOffsetMethod != null) {
                    if ((getGravity() & 112) != 48) {
                        totalPaddingTop2 = ((Integer) getVerticalOffsetMethod.invoke(this, Boolean.TRUE)).intValue();
                    } else {
                        totalPaddingTop2 = 0;
                    }
                } else if ((getGravity() & 112) != 48) {
                    totalPaddingTop2 = getTotalPaddingTop() - getExtendedPaddingTop();
                } else {
                    totalPaddingTop2 = 0;
                }
                canvas.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                Layout layout2 = getLayout();
                int lineForOffset2 = layout2.getLineForOffset(getSelectionStart());
                int lineCount2 = layout2.getLineCount();
                updateCursorPosition();
                Rect bounds2 = this.gradientDrawable.getBounds();
                Rect rect4 = this.rect;
                rect4.left = bounds2.left;
                rect4.right = bounds2.left + AndroidUtilities.dp(this.cursorWidth);
                Rect rect5 = this.rect;
                int i4 = bounds2.bottom;
                rect5.bottom = i4;
                rect5.top = bounds2.top;
                float f2 = this.lineSpacingExtra;
                if (f2 != 0.0f && lineForOffset2 < lineCount2 - 1) {
                    rect5.bottom = (int) (i4 - f2);
                }
                int iCenterY2 = rect5.centerY();
                int i5 = this.cursorSize;
                rect5.top = iCenterY2 - (i5 / 2);
                Rect rect6 = this.rect;
                rect6.bottom = rect6.top + i5;
                this.gradientDrawable.setBounds(rect6);
                this.gradientDrawable.draw(canvas);
                canvas.restore();
                this.cursorDrawn = false;
            } catch (Throwable th2) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw new RuntimeException(th2);
                }
            }
        }
        if (this.lineVisible && this.lineColor != 0) {
            int iDp = AndroidUtilities.dp(1.0f);
            boolean z3 = this.lineActive;
            if (!TextUtils.isEmpty(this.errorText)) {
                this.linePaint.setColor(this.errorLineColor);
                iDp = AndroidUtilities.dp(2.0f);
                this.lineActive = false;
            } else if (isFocused()) {
                this.lineActive = true;
            } else {
                this.linePaint.setColor(this.lineColor);
                this.lineActive = false;
            }
            if (this.lineActive != z3) {
                this.lineLastUpdateTime = SystemClock.elapsedRealtime();
                this.lastLineActiveness = this.lineActiveness;
            }
            float fElapsedRealtime = (SystemClock.elapsedRealtime() - this.lineLastUpdateTime) / 150.0f;
            if (fElapsedRealtime < 1.0f || (((z2 = this.lineActive) && this.lineActiveness != 1.0f) || (!z2 && this.lineActiveness != 0.0f))) {
                this.lineActiveness = AndroidUtilities.lerp(this.lastLineActiveness, this.lineActive ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, fElapsedRealtime)));
                if (fElapsedRealtime < 1.0f) {
                    invalidate();
                }
            }
            int measuredHeight = this.lineYFix ? getMeasuredHeight() - AndroidUtilities.dp(2.0f) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), AndroidUtilities.dp(2.0f)) + getScrollY() + ((int) this.lineY);
            int measuredWidth = this.lastTouchX;
            if (measuredWidth < 0) {
                measuredWidth = getMeasuredWidth() / 2;
            }
            int i6 = measuredWidth;
            int iMax = Math.max(i6, getMeasuredWidth() - i6) * 2;
            if (this.lineActiveness < 1.0f) {
                canvas.drawRect(getScrollX(), measuredHeight - iDp, getMeasuredWidth() + getScrollX(), measuredHeight, this.linePaint);
            }
            float f3 = this.lineActiveness;
            if (f3 > 0.0f) {
                float interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f3);
                boolean z4 = this.lineActive;
                if (z4) {
                    this.activeLineWidth = iMax * interpolation;
                }
                if (z4) {
                    interpolation = 1.0f;
                }
                float f4 = i6;
                canvas.drawRect(Math.max(0.0f, f4 - (this.activeLineWidth / 2.0f)) + getScrollX(), measuredHeight - ((int) (interpolation * AndroidUtilities.dp(2.0f))), Math.min((this.activeLineWidth / 2.0f) + f4, getMeasuredWidth()) + getScrollX(), measuredHeight, this.activeLinePaint);
            }
        }
        if (this.ellipsizeByGradient) {
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            this.ellipsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.ellipsizeMatrix.reset();
            this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
            canvas.drawRect(getPaddingLeft() - this.ellipsizeWidth, 0.0f, getPaddingLeft(), getHeight(), this.ellipsizePaint);
            this.ellipsizeMatrix.reset();
            this.ellipsizeMatrix.postScale(-1.0f, 1.0f, this.ellipsizeWidth / 2.0f, 0.0f);
            this.ellipsizeMatrix.postTranslate(getWidth() - getPaddingRight(), 0.0f);
            this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
            canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, (getWidth() - getPaddingRight()) + this.ellipsizeWidth, getHeight(), this.ellipsizePaint);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            super.onFocusChanged(z, i, rect);
        } catch (Exception e) {
            FileLog.e(e);
        }
        checkHeaderVisibility(true);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.hintLayout != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.hintLayout.getText());
                return;
            }
            CharSequence text = this.hintLayout.getText();
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfo.setHintText(text);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", text);
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.hintAnimatedDrawable;
        if (animatedTextDrawable != null) {
            animatedTextDrawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.hintAnimatedDrawable2;
        if (animatedTextDrawable2 != null) {
            animatedTextDrawable2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.hintLayout;
        if (staticLayout == null || this.hintAnimatedDrawable != null) {
            this.lineY = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        } else {
            if (this.lastSize != measuredHeight) {
                setHintText(this.hint, false, staticLayout.getPaint());
            }
            if (this.hintLayoutYFix) {
                this.lineY = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.hintLayout.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.hintLayout.getHeight()) - AndroidUtilities.dp(1.0f);
            } else {
                this.lineY = ((getMeasuredHeight() - this.hintLayout.getHeight()) / 2.0f) + this.hintLayout.getHeight() + AndroidUtilities.dp(6.0f);
            }
        }
        this.lastSize = measuredHeight;
    }

    @Override
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i != i3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.transformHintToHeader || this.transformHintToHeaderOnFocus) {
            return;
        }
        checkHeaderVisibility(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.lastTouchX = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j) {
        ReferenceList referenceList;
        if (Build.VERSION.SDK_INT < 29 || runnable == null || j != 500 || !"android.widget.Editor$Blink".equals(runnable.getClass().getName()) || Looper.myLooper() != Looper.getMainLooper()) {
            return super.postDelayed(runnable, j);
        }
        Choreographer60FpsContent choreographer60FpsContent = Choreographer60FpsContent.getInstance();
        choreographer60FpsContent.getClass();
        Choreographer60FpsContent.checkMainThread();
        int iMax = Math.max(1, Math.min(2, 60));
        Choreographer60FpsContent.checkMainThread();
        int i = 0;
        while (true) {
            SparseArray sparseArray = choreographer60FpsContent.mGroups;
            if (i >= sparseArray.size() || ((referenceList = ((Choreographer60FpsContent.CallbackGroup) sparseArray.valueAt(i)).runnableCallbacksOnce) != null && referenceList.remove(runnable))) {
                break;
            }
            i++;
        }
        Choreographer60FpsContent.CallbackGroup orCreateGroup = choreographer60FpsContent.getOrCreateGroup(iMax);
        if (orCreateGroup.runnableCallbacksOnce == null) {
            orCreateGroup.runnableCallbacksOnce = new ReferenceList(true);
        }
        orCreateGroup.runnableCallbacksOnce.add(runnable);
        return true;
    }

    @Override
    public boolean removeCallbacks(Runnable runnable) {
        ReferenceList referenceList;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Choreographer60FpsContent choreographer60FpsContent = Choreographer60FpsContent.getInstance();
            choreographer60FpsContent.getClass();
            Choreographer60FpsContent.checkMainThread();
            if (runnable != null) {
                int i = 0;
                while (true) {
                    SparseArray sparseArray = choreographer60FpsContent.mGroups;
                    if (i >= sparseArray.size() || ((referenceList = ((Choreographer60FpsContent.CallbackGroup) sparseArray.valueAt(i)).runnableCallbacksOnce) != null && referenceList.remove(runnable))) {
                        break;
                    }
                    i++;
                }
            }
        }
        return super.removeCallbacks(runnable);
    }

    @Override
    public void removeTextChangedListener(TextWatcher textWatcher) {
        this.registeredTextWatchers.remove(textWatcher);
        if (this.isTextWatchersSuppressed) {
            return;
        }
        super.removeTextChangedListener(textWatcher);
    }

    public void setAllowDrawCursor(boolean z) {
        this.allowDrawCursor = z;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        this.blurredBackgroundDrawableViewFactory = blurredBackgroundDrawableViewFactory;
    }

    public void setCursorColor(int i) {
        ShapeDrawable shapeDrawable = this.cursorDrawable;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i);
        }
        GradientDrawable gradientDrawable = this.gradientDrawable;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
        invalidate();
    }

    public void setCursorSize(int i) {
        this.cursorSize = i;
    }

    public void setCursorWidth(float f) {
        this.cursorWidth = f;
    }

    public void setEllipsizeByGradient(boolean z) {
        this.ellipsizeByGradient = z;
        if (z) {
            this.ellipsizeWidth = AndroidUtilities.dp(12.0f);
            this.ellipsizePaint = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.ellipsizeWidth, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.ellipsizeGradient = linearGradient;
            this.ellipsizePaint.setShader(linearGradient);
            this.ellipsizeMatrix = new Matrix();
        }
    }

    public void setErrorLineColor(int i) {
        this.errorLineColor = i;
        this.errorPaint.setColor(i);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.errorText)) {
            return;
        }
        this.errorText = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z) {
        this.forceCursorEnd = z;
        invalidate();
    }

    public void setHandlesColor(int i) {
        if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI() || this.mHandlesColor == i) {
            return;
        }
        this.mHandlesColor = i;
        this.mHandlesColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        updateHandleDrawable(this.mTextSelectHandleLeft, false);
        updateHandleDrawable(this.mTextSelectHandleRight, false);
        updateHandleDrawable(this.mTextSelectHandle, false);
    }

    public void setHeaderAnimationProgress(float f) {
        this.headerAnimationProgress = f;
        invalidate();
    }

    public void setHeaderHintColor(int i) {
        this.headerHintColor = i;
        invalidate();
    }

    public void setHintColor(int i) {
        this.hintColor = i;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.hintAnimatedDrawable;
        if (animatedTextDrawable != null) {
            animatedTextDrawable.textPaint.setColor(i);
            animatedTextDrawable.alpha = Color.alpha(i);
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.hintAnimatedDrawable2;
        if (animatedTextDrawable2 != null) {
            int i2 = this.hintColor;
            animatedTextDrawable2.textPaint.setColor(i2);
            animatedTextDrawable2.alpha = Color.alpha(i2);
        }
        invalidate();
    }

    public void setHintRightOffset(int i) {
        float f = i;
        if (this.rightHintOffset == f) {
            return;
        }
        this.rightHintOffset = f;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        setHintText(charSequence, false, getPaint());
    }

    public void setHintText2(CharSequence charSequence, boolean z) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.hintAnimatedDrawable2;
        if (animatedTextDrawable != null) {
            animatedTextDrawable.setText(charSequence, !LocaleController.isRTL && z, true);
        }
    }

    public void setHintVisible(boolean z, boolean z2) {
        if (this.hintVisible == z) {
            return;
        }
        this.hintLastUpdateTime = System.currentTimeMillis();
        this.hintVisible = z;
        if (!z2) {
            this.hintAlpha = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public void setLineColors(int i, int i2, int i3) {
        this.lineVisible = true;
        getContext().getResources().getDrawable(R.drawable.search_dark).getPadding(this.padding);
        Rect rect = this.padding;
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.lineColor = i;
        this.activeLineColor = i2;
        this.activeLinePaint.setColor(i2);
        this.errorLineColor = i3;
        this.errorPaint.setColor(i3);
        invalidate();
    }

    @Override
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.lineSpacingExtra = f;
    }

    public void setNextSetTextAnimated(boolean z) {
        this.nextSetTextAnimated = z;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.onPremiumMenuLockClickListener = runnable;
    }

    @Override
    public void setSelection(int i, int i2) {
        try {
            super.setSelection(i, i2);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setSupportRtlHint(boolean z) {
        this.supportRtlHint = z;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        checkHeaderVisibility(this.nextSetTextAnimated);
        this.nextSetTextAnimated = false;
    }

    @Override
    public void setTextSelectHandle(Drawable drawable) {
        Drawable drawableUpdateHandleDrawable = updateHandleDrawable(drawable, true);
        this.mTextSelectHandle = drawableUpdateHandleDrawable;
        super.setTextSelectHandle(drawableUpdateHandleDrawable);
    }

    @Override
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable drawableUpdateHandleDrawable = updateHandleDrawable(drawable, true);
        this.mTextSelectHandleLeft = drawableUpdateHandleDrawable;
        super.setTextSelectHandleLeft(drawableUpdateHandleDrawable);
    }

    @Override
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable drawableUpdateHandleDrawable = updateHandleDrawable(drawable, true);
        this.mTextSelectHandleRight = drawableUpdateHandleDrawable;
        super.setTextSelectHandleRight(drawableUpdateHandleDrawable);
    }

    @Override
    public void setTextSize(int i, float f) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.hintAnimatedDrawable;
        if (animatedTextDrawable != null) {
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(f));
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.hintAnimatedDrawable2;
        if (animatedTextDrawable2 != null) {
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(f));
        }
        super.setTextSize(i, f);
    }

    public void setTextWatchersSuppressed(boolean z, boolean z2) {
        if (this.isTextWatchersSuppressed == z) {
            return;
        }
        this.isTextWatchersSuppressed = z;
        if (z) {
            Iterator<TextWatcher> it = this.registeredTextWatchers.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener(it.next());
            }
            return;
        }
        for (TextWatcher textWatcher : this.registeredTextWatchers) {
            super.addTextChangedListener(textWatcher);
            if (z2) {
                textWatcher.beforeTextChanged("", 0, length(), length());
                textWatcher.onTextChanged(getText(), 0, length(), length());
                textWatcher.afterTextChanged(getText());
            }
        }
    }

    public void setTransformHintToHeader(boolean z) {
        if (this.transformHintToHeader == z) {
            return;
        }
        this.transformHintToHeader = z;
        AnimatorSet animatorSet = this.headerTransformAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.headerTransformAnimation = null;
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z) {
        if (this.transformHintToHeaderOnFocus == z) {
            return;
        }
        this.transformHintToHeaderOnFocus = z;
        checkHeaderVisibility(false);
    }

    public void setWindowView(View view) {
        this.windowView = view;
    }

    public final boolean shouldShowQuoteButton() {
        Editable text;
        if (!hasSelection() || getSelectionStart() < 0 || getSelectionEnd() < 0 || getSelectionStart() == getSelectionEnd() || (text = getText()) == null) {
            return false;
        }
        QuoteSpan.QuoteStyleSpan[] quoteStyleSpanArr = (QuoteSpan.QuoteStyleSpan[]) text.getSpans(getSelectionStart(), getSelectionEnd(), QuoteSpan.QuoteStyleSpan.class);
        return quoteStyleSpanArr == null || quoteStyleSpanArr.length == 0;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT < 23 || (this.windowView == null && this.attachedToWindow == null)) {
            return super.startActionMode(callback);
        }
        FloatingActionMode floatingActionMode = this.floatingActionMode;
        if (floatingActionMode != null) {
            floatingActionMode.finish();
        }
        FloatingToolbar floatingToolbar = this.floatingToolbar;
        if (floatingToolbar != null) {
            floatingToolbar.dismiss();
            this.floatingToolbar = null;
        }
        if (this.floatingToolbarPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.floatingToolbarPreDrawListener);
            this.floatingToolbarPreDrawListener = null;
        }
        Context context = getContext();
        View view = this.windowView;
        if (view == null) {
            view = this.attachedToWindow;
        }
        FloatingToolbar floatingToolbar2 = new FloatingToolbar(context, view, getActionModeStyle(), getResourcesProvider(), this.blurredBackgroundDrawableViewFactory);
        this.floatingToolbar = floatingToolbar2;
        floatingToolbar2.premiumLockClickListener = this.onPremiumMenuLockClickListener;
        floatingToolbar2.quoteShowCallback = new StarGiftSheet$$ExternalSyntheticLambda105(this, 1);
        FloatingActionMode floatingActionMode2 = new FloatingActionMode(getContext(), new TextSelectionHelper.AnonymousClass5(this, callback), this, this.floatingToolbar);
        this.floatingActionMode = floatingActionMode2;
        this.floatingToolbarPreDrawListener = new ChatActivity$57$$ExternalSyntheticLambda0(this, 1);
        callback.onCreateActionMode(floatingActionMode2, floatingActionMode2.mMenu);
        FloatingActionMode floatingActionMode3 = this.floatingActionMode;
        extendActionMode(floatingActionMode3, floatingActionMode3.mMenu);
        this.floatingActionMode.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.floatingToolbarPreDrawListener);
        invalidate();
        return this.floatingActionMode;
    }

    public final void updateCursorPosition() {
        int intrinsicWidth;
        int i;
        Layout layout = getLayout();
        int length = this.forceCursorEnd ? layout.getText().length() : getSelectionStart();
        int lineForOffset = layout.getLineForOffset(length);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float primaryHorizontal = layout.getPrimaryHorizontal(length);
        GradientDrawable gradientDrawable = this.gradientDrawable;
        float fMax = Math.max(0.5f, primaryHorizontal - 0.5f);
        if (this.mTempRect == null) {
            this.mTempRect = new Rect();
        }
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.mTempRect);
            intrinsicWidth = gradientDrawable.getIntrinsicWidth();
        } else {
            this.mTempRect.setEmpty();
            intrinsicWidth = 0;
        }
        int scrollX = getScrollX();
        float f = fMax - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f2 = width;
        if (f >= f2 - 1.0f) {
            i = (width + scrollX) - (intrinsicWidth - this.mTempRect.right);
        } else {
            i = (Math.abs(f) <= 1.0f || (TextUtils.isEmpty(getText()) && ((float) (1048576 - scrollX)) <= f2 + 1.0f && fMax <= 1.0f)) ? scrollX - this.mTempRect.left : ((int) fMax) - this.mTempRect.left;
        }
        int iDp = AndroidUtilities.dp(this.cursorWidth);
        GradientDrawable gradientDrawable2 = this.gradientDrawable;
        Rect rect = this.mTempRect;
        gradientDrawable2.setBounds(i, lineTop - rect.top, iDp + i, lineTop2 + rect.bottom);
        this.lastText = layout.getText();
        this.lastOffset = length;
    }

    public final Drawable updateHandleDrawable(Drawable drawable, boolean z) {
        if (drawable != null) {
            if (z) {
                drawable = drawable.mutate();
            }
            ColorFilter colorFilter = this.mHandlesColorFilter;
            if (colorFilter != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
        return drawable;
    }

    public void useAnimatedTextDrawable() {
        final int i = 0;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable() {
            {
                super(false, false, false, false);
            }

            @Override
            public final void invalidateSelf() {
                switch (i) {
                    case 0:
                        this.invalidate();
                        break;
                    default:
                        this.invalidate();
                        break;
                }
            }
        };
        this.hintAnimatedDrawable = animatedTextDrawable;
        animatedTextDrawable.ellipsizeByGradient = true;
        invalidate();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.hintAnimatedDrawable;
        int i2 = this.hintColor;
        animatedTextDrawable2.textPaint.setColor(i2);
        animatedTextDrawable2.alpha = Color.alpha(i2);
        this.hintAnimatedDrawable.setTextSize(getPaint().getTextSize());
        final int i3 = 1;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = new AnimatedTextView.AnimatedTextDrawable() {
            {
                super(false, false, false, false);
            }

            @Override
            public final void invalidateSelf() {
                switch (i3) {
                    case 0:
                        this.invalidate();
                        break;
                    default:
                        this.invalidate();
                        break;
                }
            }
        };
        this.hintAnimatedDrawable2 = animatedTextDrawable3;
        animatedTextDrawable3.gravity = 5;
        int i4 = this.hintColor;
        animatedTextDrawable3.textPaint.setColor(i4);
        animatedTextDrawable3.alpha = Color.alpha(i4);
        this.hintAnimatedDrawable2.setTextSize(getPaint().getTextSize());
    }

    public void setHintText(CharSequence charSequence, boolean z) {
        setHintText(charSequence, z, getPaint());
    }

    public void setHintText(CharSequence charSequence, boolean z, TextPaint textPaint) {
        TextPaint textPaint2;
        String string;
        String string2;
        boolean z2;
        float f;
        CharSequence charSequence2 = charSequence;
        boolean z3 = false;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.hintAnimatedDrawable;
        if (animatedTextDrawable != null) {
            animatedTextDrawable.setText(charSequence2, !LocaleController.isRTL, true);
            return;
        }
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        CharSequence charSequenceEllipsize = charSequence2;
        if (getMeasuredWidth() == 0 ? false : z) {
            if (this.hintAnimator == null) {
                this.hintAnimator = new SubstringLayoutAnimator(this);
            }
            SubstringLayoutAnimator substringLayoutAnimator = this.hintAnimator;
            StaticLayout staticLayout = this.hintLayout;
            CharSequence charSequence3 = this.hint;
            substringLayoutAnimator.getClass();
            if (staticLayout != null && !charSequence3.equals(charSequenceEllipsize)) {
                ValueAnimator valueAnimator = substringLayoutAnimator.valueAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence3.length() > charSequenceEllipsize.length()) {
                    string = charSequence3.toString();
                    string2 = charSequenceEllipsize.toString();
                    z2 = true;
                } else {
                    string = charSequenceEllipsize.toString();
                    string2 = charSequence3.toString();
                    z2 = false;
                }
                int iIndexOf = string.indexOf(string2);
                if (iIndexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                    if (iIndexOf != 0) {
                        spannableStringBuilder2.setSpan(new CountrySelectActivity.AnonymousClass5(z3), 0, iIndexOf, 0);
                    }
                    if (string2.length() + iIndexOf != string.length()) {
                        spannableStringBuilder2.setSpan(new CountrySelectActivity.AnonymousClass5(z3), string2.length() + iIndexOf, string.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new CountrySelectActivity.AnonymousClass5(z3), iIndexOf, string2.length() + iIndexOf, 0);
                    int iDp = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    substringLayoutAnimator.animateInLayout = new StaticLayout(spannableStringBuilder, textPaint, iDp, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
                    substringLayoutAnimator.animateStableLayout = staticLayout2;
                    substringLayoutAnimator.animateTextChange = true;
                    substringLayoutAnimator.animateTextChangeOut = z2;
                    substringLayoutAnimator.xOffset = iIndexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(iIndexOf);
                    substringLayoutAnimator.animateOutLayout = null;
                    substringLayoutAnimator.replaceAnimation = false;
                    f = 0.0f;
                } else {
                    int iDp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    substringLayoutAnimator.animateInLayout = new StaticLayout(charSequenceEllipsize, textPaint, iDp2, alignment2, 1.0f, 0.0f, false);
                    f = 0.0f;
                    substringLayoutAnimator.animateOutLayout = new StaticLayout(charSequence3, textPaint, AndroidUtilities.dp(400.0f), alignment2, 1.0f, 0.0f, false);
                    substringLayoutAnimator.animateStableLayout = null;
                    substringLayoutAnimator.animateTextChange = true;
                    substringLayoutAnimator.replaceAnimation = true;
                    substringLayoutAnimator.xOffset = 0.0f;
                }
                substringLayoutAnimator.hintProgress = f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                substringLayoutAnimator.valueAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(substringLayoutAnimator, 25));
                substringLayoutAnimator.valueAnimator.addListener(new Tooltip.AnonymousClass1(substringLayoutAnimator, 11));
                substringLayoutAnimator.valueAnimator.setDuration(150L);
                substringLayoutAnimator.valueAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                substringLayoutAnimator.valueAnimator.start();
            }
        } else {
            SubstringLayoutAnimator substringLayoutAnimator2 = this.hintAnimator;
            if (substringLayoutAnimator2 != null) {
                ValueAnimator valueAnimator2 = substringLayoutAnimator2.valueAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                substringLayoutAnimator2.animateTextChange = false;
            }
        }
        this.hint = charSequenceEllipsize;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.hintLayout;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequenceEllipsize)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.hintLayout = new StaticLayout(charSequenceEllipsize, textPaint2, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override
    public void setSelection(int i) {
        try {
            super.setSelection(i);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        if (Build.VERSION.SDK_INT >= 23 && (this.windowView != null || this.attachedToWindow != null)) {
            return startActionMode(callback);
        }
        return super.startActionMode(callback, i);
    }
}
