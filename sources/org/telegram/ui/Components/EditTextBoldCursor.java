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
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;

public class EditTextBoldCursor extends nt {
    private static final String BLINK_CLASS = "android.widget.Editor$Blink";

    public static final int f26369a = 0;
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
    jg.a blurredBackgroundDrawableViewFactory;
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
    public org.telegram.ui.ActionBar.g4 floatingActionMode;
    private org.telegram.ui.ActionBar.v4 floatingToolbar;
    private ViewTreeObserver.OnPreDrawListener floatingToolbarPreDrawListener;
    private boolean forceCursorEnd;
    private GradientDrawable gradientDrawable;
    private float headerAnimationProgress;
    private int headerHintColor;
    private AnimatorSet headerTransformAnimation;
    private CharSequence hint;
    private float hintAlpha;
    private i6 hintAnimatedDrawable;
    private i6 hintAnimatedDrawable2;
    private px0 hintAnimator;
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
    private final gf.j invalidateCallback;
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

    public EditTextBoldCursor(Context context) {
        super(context);
        this.invalidateCallback = new w5(this, 1);
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
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            setImportantForAutofill(2);
        }
        this.linePaint = new Paint();
        this.activeLinePaint = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.errorPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        if (i10 >= 26) {
            setImportantForAutofill(2);
        }
        if (i10 >= 29) {
            et etVar = new et(this);
            this.cursorDrawable = etVar;
            etVar.setShape(new RectShape());
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

    @Override
    public void addTextChangedListener(TextWatcher textWatcher) {
        this.registeredTextWatchers.add(textWatcher);
        if (this.isTextWatchersSuppressed) {
            return;
        }
        super.addTextChangedListener(textWatcher);
    }

    public void dispatchTextWatchersTextChanged() {
        for (TextWatcher textWatcher : this.registeredTextWatchers) {
            textWatcher.beforeTextChanged("", 0, length(), length());
            textWatcher.onTextChanged(getText(), 0, length(), length());
            textWatcher.afterTextChanged(getText());
        }
    }

    public final void e(boolean z10) {
        boolean z11 = this.transformHintToHeader && (getText().length() > 0 || (this.transformHintToHeaderOnFocus && isFocused()));
        if (this.currentDrawHintAsHeader != z11) {
            AnimatorSet animatorSet = this.headerTransformAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.headerTransformAnimation = null;
            }
            this.currentDrawHintAsHeader = z11;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.headerTransformAnimation = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", z11 ? 1.0f : 0.0f));
                this.headerTransformAnimation.setDuration(200L);
                this.headerTransformAnimation.setInterpolator(er.h);
                this.headerTransformAnimation.start();
            } else {
                this.headerAnimationProgress = z11 ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.v4 v4Var = this.floatingToolbar;
        if (v4Var != null) {
            v4Var.f23903a.removeOnLayoutChangeListener(v4Var.f23912l);
            org.telegram.ui.ActionBar.t4 t4Var = v4Var.f23904b;
            if (!t4Var.F) {
                t4Var.G = false;
                t4Var.F = true;
                t4Var.f23802x.cancel();
                t4Var.f23801w.start();
                t4Var.D.setEmpty();
            }
            this.floatingToolbar = null;
        }
        if (this.floatingToolbarPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.floatingToolbarPreDrawListener);
            this.floatingToolbarPreDrawListener = null;
        }
    }

    public void fixHandleView(boolean z10) {
        if (z10) {
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
            AndroidUtilities.runOnUIThread(new lp(onPreDrawListener, 8), 500L);
        } catch (Throwable unused) {
        }
        this.fixed = true;
    }

    public final void g() {
        int intrinsicWidth;
        int i10;
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
        float f10 = fMax - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        if (f10 >= f11 - 1.0f) {
            i10 = (width + scrollX) - (intrinsicWidth - this.mTempRect.right);
        } else {
            i10 = (Math.abs(f10) <= 1.0f || (TextUtils.isEmpty(getText()) && ((float) (1048576 - scrollX)) <= f11 + 1.0f && fMax <= 1.0f)) ? scrollX - this.mTempRect.left : ((int) fMax) - this.mTempRect.left;
        }
        int iDp = AndroidUtilities.dp(this.cursorWidth);
        GradientDrawable gradientDrawable2 = this.gradientDrawable;
        Rect rect = this.mTempRect;
        gradientDrawable2.setBounds(i10, lineTop - rect.top, iDp + i10, lineTop2 + rect.bottom);
        this.lastText = layout.getText();
        this.lastOffset = length;
    }

    public int getActionModeStyle() {
        return 1;
    }

    @Override
    public int getAutofillType() {
        return 0;
    }

    public StaticLayout getErrorLayout(int i10) {
        if (TextUtils.isEmpty(this.errorText)) {
            return null;
        }
        return new StaticLayout(this.errorText, this.errorPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i10 = this.ignoreBottomCount;
        if (i10 == 0) {
            return super.getExtendedPaddingBottom();
        }
        this.ignoreBottomCount = i10 - 1;
        int i11 = this.scrollY;
        if (i11 != Integer.MAX_VALUE) {
            return -i11;
        }
        return 0;
    }

    @Override
    public int getExtendedPaddingTop() {
        int i10 = this.ignoreTopCount;
        if (i10 == 0) {
            return super.getExtendedPaddingTop();
        }
        this.ignoreTopCount = i10 - 1;
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

    public org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return null;
    }

    @Override
    public Drawable getTextCursorDrawable() {
        if (this.cursorDrawable != null) {
            return super.getTextCursorDrawable();
        }
        et etVar = new et(this, new RectShape());
        etVar.getPaint().setColor(0);
        return etVar;
    }

    @Override
    public Drawable getTextSelectHandle() {
        if (this.mTextSelectHandle == null) {
            this.mTextSelectHandle = h(super.getTextSelectHandle(), true);
        }
        return this.mTextSelectHandle;
    }

    @Override
    public Drawable getTextSelectHandleLeft() {
        if (this.mTextSelectHandleLeft == null) {
            this.mTextSelectHandleLeft = h(super.getTextSelectHandleLeft(), true);
        }
        return this.mTextSelectHandleLeft;
    }

    @Override
    public Drawable getTextSelectHandleRight() {
        if (this.mTextSelectHandleRight == null) {
            this.mTextSelectHandleRight = h(super.getTextSelectHandleRight(), true);
        }
        return this.mTextSelectHandleRight;
    }

    public final Drawable h(Drawable drawable, boolean z10) {
        if (drawable != null) {
            if (z10) {
                drawable = drawable.mutate();
            }
            ColorFilter colorFilter = this.mHandlesColorFilter;
            if (colorFilter != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
        return drawable;
    }

    public boolean hasErrorText() {
        return !TextUtils.isEmpty(this.errorText);
    }

    public void hideActionMode() {
        f();
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

    @Override
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        this.attachedToWindow = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            gf.k.d().b(this.invalidateCallback, 2);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = null;
        if (Build.VERSION.SDK_INT < 29) {
            gf.k.d().f(this.invalidateCallback);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        int totalPaddingTop;
        Object obj;
        boolean z11;
        int totalPaddingTop2;
        int i10;
        Canvas canvas2 = canvas;
        if (length() == 0 || this.transformHintToHeader) {
            boolean z12 = this.hintVisible;
            if ((z12 && this.hintAlpha != 1.0f) || (!z12 && this.hintAlpha != 0.0f)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = jCurrentTimeMillis - this.hintLastUpdateTime;
                if (j10 < 0 || j10 > 17) {
                    j10 = 17;
                }
                this.hintLastUpdateTime = jCurrentTimeMillis;
                if (this.hintVisible) {
                    float f12 = (j10 / 150.0f) + this.hintAlpha;
                    this.hintAlpha = f12;
                    if (f12 > 1.0f) {
                        this.hintAlpha = 1.0f;
                    }
                } else {
                    float f13 = this.hintAlpha - (j10 / 150.0f);
                    this.hintAlpha = f13;
                    if (f13 < 0.0f) {
                        this.hintAlpha = 0.0f;
                    }
                }
                invalidate();
            }
            i6 i6Var = this.hintAnimatedDrawable;
            if (i6Var != null && !TextUtils.isEmpty(i6Var.f29243g) && (this.hintVisible || this.hintAlpha != 0.0f)) {
                if (this.hintAnimatedDrawable2 == null) {
                    i6 i6Var2 = this.hintAnimatedDrawable;
                    i6Var2.H = 0.0f;
                    i6Var2.invalidateSelf();
                } else if (this.hintAnimatedDrawable2.d() + this.hintAnimatedDrawable.d() < getMeasuredWidth()) {
                    canvas2.save();
                    canvas2.translate(this.hintAnimatedDrawable.d() + (this.hintAnimatedDrawable2.d() - getMeasuredWidth()), 0.0f);
                    this.hintAnimatedDrawable2.f29257w = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                    this.hintAnimatedDrawable2.draw(canvas2);
                    canvas2.restore();
                    i6 i6Var3 = this.hintAnimatedDrawable;
                    i6Var3.H = 0.0f;
                    i6Var3.invalidateSelf();
                } else {
                    canvas2.save();
                    canvas2.translate(this.rightHintOffset, 0.0f);
                    this.hintAnimatedDrawable2.f29257w = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                    this.hintAnimatedDrawable2.draw(canvas2);
                    canvas2.restore();
                    i6 i6Var4 = this.hintAnimatedDrawable;
                    i6Var4.H = (this.hintAnimatedDrawable2.d() + AndroidUtilities.dp(2.0f)) - this.rightHintOffset;
                    i6Var4.invalidateSelf();
                }
                this.hintAnimatedDrawable.f29257w = (int) (Color.alpha(this.hintColor) * this.hintAlpha);
                this.hintAnimatedDrawable.draw(canvas2);
            } else if (this.hintLayout != null && (this.hintVisible || this.hintAlpha != 0.0f)) {
                int color = getPaint().getColor();
                canvas2.save();
                float lineLeft = this.hintLayout.getLineLeft(0);
                float lineWidth = this.hintLayout.getLineWidth(0);
                int i11 = lineLeft != 0.0f ? (int) (0 - lineLeft) : 0;
                if (this.supportRtlHint && LocaleController.isRTL) {
                    float scrollX = getScrollX() + i11 + (getMeasuredWidth() - lineWidth);
                    this.hintLayoutX = scrollX;
                    float height = (this.lineY - this.hintLayout.getHeight()) - AndroidUtilities.dp(7.0f);
                    this.hintLayoutY = height;
                    canvas2.translate(scrollX, height);
                } else {
                    float scrollX2 = getScrollX() + i11 + this.hintLayoutOffset;
                    this.hintLayoutX = scrollX2;
                    float height2 = (this.lineY - this.hintLayout.getHeight()) - AndroidUtilities.dp2(7.0f);
                    this.hintLayoutY = height2;
                    canvas2.translate(scrollX2, height2);
                }
                if (this.transformHintToHeader) {
                    float f14 = 1.0f - (this.headerAnimationProgress * 0.3f);
                    if (this.supportRtlHint && LocaleController.isRTL) {
                        float f15 = lineWidth + lineLeft;
                        canvas2.translate(f15 - (f15 * f14), 0.0f);
                    } else if (lineLeft != 0.0f) {
                        canvas2.translate((1.0f - f14) * lineLeft, 0.0f);
                    }
                    canvas2.scale(f14, f14);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(22.0f)) * this.headerAnimationProgress);
                    getPaint().setColor(i0.b.d(this.headerAnimationProgress, this.hintColor, this.headerHintColor));
                } else {
                    getPaint().setColor(this.hintColor);
                    getPaint().setAlpha((int) ((Color.alpha(this.hintColor) / 255.0f) * this.hintAlpha * 255.0f));
                }
                px0 px0Var = this.hintAnimator;
                if (px0Var == null || !px0Var.f31681e) {
                    f10 = 2.0f;
                    f11 = 150.0f;
                    Utilities.Callback2<Canvas, Runnable> callback2 = this.drawHint;
                    if (callback2 != null) {
                        callback2.run(canvas2, new xq(5, this, canvas2));
                    } else {
                        this.hintLayout.draw(canvas2);
                    }
                } else {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    px0 px0Var2 = this.hintAnimator;
                    TextPaint paint = getPaint();
                    EditTextBoldCursor editTextBoldCursor = px0Var2.f31678a;
                    if (px0Var2.f31681e) {
                        float f16 = px0Var2.h * (px0Var2.f31682f ? px0Var2.f31684i : 1.0f - px0Var2.f31684i);
                        int alpha = paint.getAlpha();
                        if (px0Var2.d != null) {
                            canvas2.save();
                            canvas2.translate(f16, 0.0f);
                            px0Var2.d.draw(canvas2);
                            canvas2.restore();
                        }
                        if (px0Var2.f31679b != null) {
                            float f17 = px0Var2.f31682f ? 1.0f - px0Var2.f31684i : px0Var2.f31684i;
                            canvas2.save();
                            f10 = 2.0f;
                            paint.setAlpha((int) (alpha * f17));
                            canvas2.translate(f16, 0.0f);
                            if (px0Var2.f31683g) {
                                float f18 = (f17 * 0.1f) + 0.9f;
                                canvas2.scale(f18, f18, f16, editTextBoldCursor.getMeasuredHeight() / 2.0f);
                            }
                            px0Var2.f31679b.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                        } else {
                            f10 = 2.0f;
                        }
                        if (px0Var2.f31680c != null) {
                            float f19 = px0Var2.f31682f ? px0Var2.f31684i : 1.0f - px0Var2.f31684i;
                            canvas2.save();
                            f11 = 150.0f;
                            paint.setAlpha((int) (alpha * (px0Var2.f31682f ? px0Var2.f31684i : 1.0f - px0Var2.f31684i)));
                            canvas2.translate(f16, 0.0f);
                            if (px0Var2.f31683g) {
                                float f20 = (f19 * 0.1f) + 0.9f;
                                canvas2.scale(f20, f20, f16, editTextBoldCursor.getMeasuredHeight() / f10);
                            }
                            px0Var2.f31680c.draw(canvas2);
                            canvas2.restore();
                            paint.setAlpha(alpha);
                        }
                        canvas2.restore();
                    } else {
                        f10 = 2.0f;
                    }
                    f11 = 150.0f;
                    canvas2.restore();
                }
                getPaint().setColor(color);
                canvas2.restore();
            }
            f10 = 2.0f;
            f11 = 150.0f;
        } else {
            f10 = 2.0f;
            f11 = 150.0f;
        }
        if (this.ellipsizeByGradient) {
            canvas2.saveLayerAlpha((getPaddingLeft() + getScrollX()) - this.ellipsizeWidth, 0.0f, ((getWidth() + getScrollX()) - getPaddingRight()) + this.ellipsizeWidth, getHeight(), 255, 31);
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
        } catch (Exception e9) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                throw new RuntimeException(e9);
            }
        }
        this.ignoreTopCount = 1;
        this.ignoreBottomCount = 1;
        canvas2.save();
        canvas2.translate(0.0f, extendedPaddingTop);
        try {
            this.drawInMaim = true;
            super.onDraw(canvas);
            this.drawInMaim = false;
        } catch (Exception e10) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                throw new RuntimeException(e10);
            }
        }
        Field field2 = mScrollYField;
        if (field2 != null && (i10 = this.scrollY) != Integer.MAX_VALUE) {
            try {
                field2.set(this, Integer.valueOf(i10));
            } catch (Exception e11) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw new RuntimeException(e11);
                }
            }
        }
        canvas2.restore();
        if (this.cursorDrawable == null) {
            try {
                Field field3 = mShowCursorField;
                if (field3 == null || (obj = this.editor) == null) {
                    z10 = this.cursorDrawn;
                    this.cursorDrawn = false;
                } else {
                    z10 = (SystemClock.uptimeMillis() - field3.getLong(obj)) % 1000 < 500 && isFocused();
                }
                if (this.allowDrawCursor && z10) {
                    canvas2.save();
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
                    canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop);
                    Layout layout = getLayout();
                    int lineForOffset = layout.getLineForOffset(getSelectionStart());
                    int lineCount = layout.getLineCount();
                    g();
                    Rect bounds = this.gradientDrawable.getBounds();
                    Rect rect = this.rect;
                    rect.left = bounds.left;
                    rect.right = bounds.left + AndroidUtilities.dp(this.cursorWidth);
                    Rect rect2 = this.rect;
                    int i12 = bounds.bottom;
                    rect2.bottom = i12;
                    rect2.top = bounds.top;
                    float f21 = this.lineSpacingExtra;
                    if (f21 != 0.0f && lineForOffset < lineCount - 1) {
                        rect2.bottom = (int) (i12 - f21);
                    }
                    int iCenterY = rect2.centerY();
                    int i13 = this.cursorSize;
                    rect2.top = iCenterY - (i13 / 2);
                    Rect rect3 = this.rect;
                    rect3.bottom = rect3.top + i13;
                    this.gradientDrawable.setBounds(rect3);
                    this.gradientDrawable.draw(canvas2);
                    canvas2.restore();
                }
            } catch (Throwable th) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw new RuntimeException(th);
                }
            }
        } else if (this.cursorDrawn && this.allowDrawCursor) {
            try {
                canvas2.save();
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
                canvas2.translate(getPaddingLeft(), getExtendedPaddingTop() + totalPaddingTop2);
                Layout layout2 = getLayout();
                int lineForOffset2 = layout2.getLineForOffset(getSelectionStart());
                int lineCount2 = layout2.getLineCount();
                g();
                Rect bounds2 = this.gradientDrawable.getBounds();
                Rect rect4 = this.rect;
                rect4.left = bounds2.left;
                rect4.right = bounds2.left + AndroidUtilities.dp(this.cursorWidth);
                Rect rect5 = this.rect;
                int i14 = bounds2.bottom;
                rect5.bottom = i14;
                rect5.top = bounds2.top;
                float f22 = this.lineSpacingExtra;
                if (f22 != 0.0f && lineForOffset2 < lineCount2 - 1) {
                    rect5.bottom = (int) (i14 - f22);
                }
                int iCenterY2 = rect5.centerY();
                int i15 = this.cursorSize;
                rect5.top = iCenterY2 - (i15 / 2);
                Rect rect6 = this.rect;
                rect6.bottom = rect6.top + i15;
                this.gradientDrawable.setBounds(rect6);
                this.gradientDrawable.draw(canvas2);
                canvas2.restore();
                this.cursorDrawn = false;
            } catch (Throwable th2) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw new RuntimeException(th2);
                }
            }
        }
        if (this.lineVisible && this.lineColor != 0) {
            int iDp = AndroidUtilities.dp(1.0f);
            boolean z13 = this.lineActive;
            if (!TextUtils.isEmpty(this.errorText)) {
                this.linePaint.setColor(this.errorLineColor);
                iDp = AndroidUtilities.dp(f10);
                this.lineActive = false;
            } else if (isFocused()) {
                this.lineActive = true;
            } else {
                this.linePaint.setColor(this.lineColor);
                this.lineActive = false;
            }
            if (this.lineActive != z13) {
                this.lineLastUpdateTime = SystemClock.elapsedRealtime();
                this.lastLineActiveness = this.lineActiveness;
            }
            float fElapsedRealtime = (SystemClock.elapsedRealtime() - this.lineLastUpdateTime) / f11;
            if (fElapsedRealtime < 1.0f || (((z11 = this.lineActive) && this.lineActiveness != 1.0f) || (!z11 && this.lineActiveness != 0.0f))) {
                this.lineActiveness = AndroidUtilities.lerp(this.lastLineActiveness, this.lineActive ? 1.0f : 0.0f, Math.max(0.0f, Math.min(1.0f, fElapsedRealtime)));
                if (fElapsedRealtime < 1.0f) {
                    invalidate();
                }
            }
            int measuredHeight = this.lineYFix ? getMeasuredHeight() - AndroidUtilities.dp(f10) : Math.min(Math.max(0, (getPaddingTop() + (getPaddingBottom() + ((getLayout() == null ? 0 : getLayout().getHeight()) - getMeasuredHeight()))) - getScrollY()), AndroidUtilities.dp(f10)) + getScrollY() + ((int) this.lineY);
            int measuredWidth = this.lastTouchX;
            if (measuredWidth < 0) {
                measuredWidth = getMeasuredWidth() / 2;
            }
            int i16 = measuredWidth;
            int iMax = Math.max(i16, getMeasuredWidth() - i16) * 2;
            if (this.lineActiveness < 1.0f) {
                canvas2.drawRect(getScrollX(), measuredHeight - iDp, getMeasuredWidth() + getScrollX(), measuredHeight, this.linePaint);
            }
            float f23 = this.lineActiveness;
            if (f23 > 0.0f) {
                float interpolation = er.f28125j.getInterpolation(f23);
                boolean z14 = this.lineActive;
                if (z14) {
                    this.activeLineWidth = iMax * interpolation;
                }
                if (z14) {
                    interpolation = 1.0f;
                }
                float f24 = i16;
                canvas2 = canvas;
                canvas2.drawRect(Math.max(0.0f, f24 - (this.activeLineWidth / f10)) + getScrollX(), measuredHeight - ((int) (interpolation * AndroidUtilities.dp(f10))), Math.min((this.activeLineWidth / f10) + f24, getMeasuredWidth()) + getScrollX(), measuredHeight, this.activeLinePaint);
            } else {
                canvas2 = canvas;
            }
        }
        if (this.ellipsizeByGradient) {
            canvas2.save();
            canvas2.translate(getScrollX(), 0.0f);
            this.ellipsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.ellipsizeMatrix.reset();
            this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
            canvas2.drawRect(getPaddingLeft() - this.ellipsizeWidth, 0.0f, getPaddingLeft(), getHeight(), this.ellipsizePaint);
            this.ellipsizeMatrix.reset();
            this.ellipsizeMatrix.postScale(-1.0f, 1.0f, this.ellipsizeWidth / f10, 0.0f);
            this.ellipsizeMatrix.postTranslate(getWidth() - getPaddingRight(), 0.0f);
            this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
            canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, (getWidth() - getPaddingRight()) + this.ellipsizeWidth, getHeight(), this.ellipsizePaint);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        try {
            super.onFocusChanged(z10, i10, rect);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        e(true);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.hintLayout != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.hintLayout.getText());
            } else {
                new s0.c(accessibilityNodeInfo).l(this.hintLayout.getText());
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        i6 i6Var2 = this.hintAnimatedDrawable2;
        if (i6Var2 != null) {
            i6Var2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
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
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (!this.transformHintToHeader || this.transformHintToHeaderOnFocus) {
            return;
        }
        e(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.lastTouchX = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT < 29 || runnable == null || j10 != 500 || !"android.widget.Editor$Blink".equals(runnable.getClass().getName()) || Looper.myLooper() != Looper.getMainLooper()) {
            return super.postDelayed(runnable, j10);
        }
        gf.k kVarD = gf.k.d();
        kVarD.getClass();
        gf.k.c();
        int iMax = Math.max(1, Math.min(2, 60));
        kVarD.h(runnable);
        gf.i iVarE = kVarD.e(iMax);
        if (iVarE.f7009f == null) {
            iVarE.f7009f = new yd.b(true);
        }
        iVarE.f7009f.add(runnable);
        return true;
    }

    @Override
    public boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gf.k.d().h(runnable);
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

    public void setAllowDrawCursor(boolean z10) {
        this.allowDrawCursor = z10;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(jg.a aVar) {
        this.blurredBackgroundDrawableViewFactory = aVar;
    }

    public void setCursorColor(int i10) {
        ShapeDrawable shapeDrawable = this.cursorDrawable;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i10);
        }
        GradientDrawable gradientDrawable = this.gradientDrawable;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
        invalidate();
    }

    public void setCursorSize(int i10) {
        this.cursorSize = i10;
    }

    public void setCursorWidth(float f10) {
        this.cursorWidth = f10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.ellipsizeByGradient = z10;
        if (z10) {
            this.ellipsizeWidth = AndroidUtilities.dp(12.0f);
            this.ellipsizePaint = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.ellipsizeWidth, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.ellipsizeGradient = linearGradient;
            this.ellipsizePaint.setShader(linearGradient);
            this.ellipsizeMatrix = new Matrix();
        }
    }

    public void setErrorLineColor(int i10) {
        this.errorLineColor = i10;
        this.errorPaint.setColor(i10);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.errorText)) {
            return;
        }
        this.errorText = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z10) {
        this.forceCursorEnd = z10;
        invalidate();
    }

    public void setHandlesColor(int i10) {
        if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI() || this.mHandlesColor == i10) {
            return;
        }
        this.mHandlesColor = i10;
        this.mHandlesColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        h(this.mTextSelectHandleLeft, false);
        h(this.mTextSelectHandleRight, false);
        h(this.mTextSelectHandle, false);
    }

    public void setHeaderAnimationProgress(float f10) {
        this.headerAnimationProgress = f10;
        invalidate();
    }

    public void setHeaderHintColor(int i10) {
        this.headerHintColor = i10;
        invalidate();
    }

    public void setHintColor(int i10) {
        this.hintColor = i10;
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.r(i10);
        }
        i6 i6Var2 = this.hintAnimatedDrawable2;
        if (i6Var2 != null) {
            i6Var2.r(this.hintColor);
        }
        invalidate();
    }

    public void setHintRightOffset(int i10) {
        float f10 = i10;
        if (this.rightHintOffset == f10) {
            return;
        }
        this.rightHintOffset = f10;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        setHintText(charSequence, false, getPaint());
    }

    public void setHintText2(CharSequence charSequence, boolean z10) {
        i6 i6Var = this.hintAnimatedDrawable2;
        if (i6Var != null) {
            i6Var.q(charSequence, !LocaleController.isRTL && z10, true);
        }
    }

    public void setHintVisible(boolean z10, boolean z11) {
        if (this.hintVisible == z10) {
            return;
        }
        this.hintLastUpdateTime = System.currentTimeMillis();
        this.hintVisible = z10;
        if (!z11) {
            this.hintAlpha = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public void setLineColors(int i10, int i11, int i12) {
        this.lineVisible = true;
        getContext().getResources().getDrawable(R.drawable.search_dark).getPadding(this.padding);
        Rect rect = this.padding;
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.lineColor = i10;
        this.activeLineColor = i11;
        this.activeLinePaint.setColor(i11);
        this.errorLineColor = i12;
        this.errorPaint.setColor(i12);
        invalidate();
    }

    @Override
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.lineSpacingExtra = f10;
    }

    public void setNextSetTextAnimated(boolean z10) {
        this.nextSetTextAnimated = z10;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.onPremiumMenuLockClickListener = runnable;
    }

    @Override
    public void setSelection(int i10, int i11) {
        try {
            super.setSelection(i10, i11);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void setSupportRtlHint(boolean z10) {
        this.supportRtlHint = z10;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        e(this.nextSetTextAnimated);
        this.nextSetTextAnimated = false;
    }

    @Override
    public void setTextSelectHandle(Drawable drawable) {
        Drawable drawableH = h(drawable, true);
        this.mTextSelectHandle = drawableH;
        super.setTextSelectHandle(drawableH);
    }

    @Override
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable drawableH = h(drawable, true);
        this.mTextSelectHandleLeft = drawableH;
        super.setTextSelectHandleLeft(drawableH);
    }

    @Override
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable drawableH = h(drawable, true);
        this.mTextSelectHandleRight = drawableH;
        super.setTextSelectHandleRight(drawableH);
    }

    @Override
    public void setTextSize(int i10, float f10) {
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.t(AndroidUtilities.dp(f10));
        }
        i6 i6Var2 = this.hintAnimatedDrawable2;
        if (i6Var2 != null) {
            i6Var2.t(AndroidUtilities.dp(f10));
        }
        super.setTextSize(i10, f10);
    }

    public void setTextWatchersSuppressed(boolean z10, boolean z11) {
        if (this.isTextWatchersSuppressed == z10) {
            return;
        }
        this.isTextWatchersSuppressed = z10;
        if (z10) {
            Iterator<TextWatcher> it = this.registeredTextWatchers.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener(it.next());
            }
            return;
        }
        for (TextWatcher textWatcher : this.registeredTextWatchers) {
            super.addTextChangedListener(textWatcher);
            if (z11) {
                textWatcher.beforeTextChanged("", 0, length(), length());
                textWatcher.onTextChanged(getText(), 0, length(), length());
                textWatcher.afterTextChanged(getText());
            }
        }
    }

    public void setTransformHintToHeader(boolean z10) {
        if (this.transformHintToHeader == z10) {
            return;
        }
        this.transformHintToHeader = z10;
        AnimatorSet animatorSet = this.headerTransformAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.headerTransformAnimation = null;
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z10) {
        if (this.transformHintToHeaderOnFocus == z10) {
            return;
        }
        this.transformHintToHeaderOnFocus = z10;
        e(false);
    }

    public void setWindowView(View view) {
        this.windowView = view;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT < 23 || (this.windowView == null && this.attachedToWindow == null)) {
            return super.startActionMode(callback);
        }
        org.telegram.ui.ActionBar.g4 g4Var = this.floatingActionMode;
        if (g4Var != null) {
            g4Var.finish();
        }
        f();
        Context context = getContext();
        View view = this.windowView;
        if (view == null) {
            view = this.attachedToWindow;
        }
        org.telegram.ui.ActionBar.v4 v4Var = new org.telegram.ui.ActionBar.v4(context, view, getActionModeStyle(), getResourcesProvider(), this.blurredBackgroundDrawableViewFactory);
        this.floatingToolbar = v4Var;
        v4Var.f23910j = this.onPremiumMenuLockClickListener;
        v4Var.f23911k = new bt(this, 0);
        org.telegram.ui.ActionBar.g4 g4Var2 = new org.telegram.ui.ActionBar.g4(getContext(), new org.telegram.ui.Cells.h9(this, callback), this, this.floatingToolbar);
        this.floatingActionMode = g4Var2;
        this.floatingToolbarPreDrawListener = new ct(0, this);
        callback.onCreateActionMode(g4Var2, g4Var2.f22978c);
        org.telegram.ui.ActionBar.g4 g4Var3 = this.floatingActionMode;
        extendActionMode(g4Var3, g4Var3.f22978c);
        this.floatingActionMode.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.floatingToolbarPreDrawListener);
        invalidate();
        return this.floatingActionMode;
    }

    public void useAnimatedTextDrawable() {
        dt dtVar = new dt(0, this);
        this.hintAnimatedDrawable = dtVar;
        dtVar.n(true);
        this.hintAnimatedDrawable.r(this.hintColor);
        this.hintAnimatedDrawable.t(getPaint().getTextSize());
        dt dtVar2 = new dt(1, this);
        this.hintAnimatedDrawable2 = dtVar2;
        dtVar2.f29239b = 5;
        dtVar2.r(this.hintColor);
        this.hintAnimatedDrawable2.t(getPaint().getTextSize());
    }

    public void setHintText(CharSequence charSequence, boolean z10) {
        setHintText(charSequence, z10, getPaint());
    }

    public void setHintText(CharSequence charSequence, boolean z10, TextPaint textPaint) {
        TextPaint textPaint2;
        String string;
        String string2;
        boolean z11;
        CharSequence charSequence2 = charSequence;
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.q(charSequence2, !LocaleController.isRTL, true);
            return;
        }
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        CharSequence charSequenceEllipsize = charSequence2;
        boolean z12 = false;
        if (getMeasuredWidth() == 0 ? false : z10) {
            if (this.hintAnimator == null) {
                this.hintAnimator = new px0(this);
            }
            px0 px0Var = this.hintAnimator;
            StaticLayout staticLayout = this.hintLayout;
            CharSequence charSequence3 = this.hint;
            px0Var.getClass();
            if (staticLayout != null && !charSequence3.equals(charSequenceEllipsize)) {
                ValueAnimator valueAnimator = px0Var.f31685j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence3.length() > charSequenceEllipsize.length()) {
                    string = charSequence3.toString();
                    string2 = charSequenceEllipsize.toString();
                    z11 = true;
                } else {
                    string = charSequenceEllipsize.toString();
                    string2 = charSequence3.toString();
                    z11 = false;
                }
                int iIndexOf = string.indexOf(string2);
                if (iIndexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                    if (iIndexOf != 0) {
                        spannableStringBuilder2.setSpan(new zy(z12), 0, iIndexOf, 0);
                    }
                    if (string2.length() + iIndexOf != string.length()) {
                        spannableStringBuilder2.setSpan(new zy(z12), string2.length() + iIndexOf, string.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new zy(z12), iIndexOf, string2.length() + iIndexOf, 0);
                    int iDp = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    px0Var.f31679b = new StaticLayout(spannableStringBuilder, textPaint, iDp, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
                    px0Var.d = staticLayout2;
                    px0Var.f31681e = true;
                    px0Var.f31682f = z11;
                    px0Var.h = iIndexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(iIndexOf);
                    px0Var.f31680c = null;
                    px0Var.f31683g = false;
                } else {
                    int iDp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    px0Var.f31679b = new StaticLayout(charSequenceEllipsize, textPaint, iDp2, alignment2, 1.0f, 0.0f, false);
                    px0Var.f31680c = new StaticLayout(charSequence3, textPaint, AndroidUtilities.dp(400.0f), alignment2, 1.0f, 0.0f, false);
                    px0Var.d = null;
                    px0Var.f31681e = true;
                    px0Var.f31683g = true;
                    px0Var.h = 0.0f;
                }
                px0Var.f31684i = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                px0Var.f31685j = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new v60(px0Var, 26));
                px0Var.f31685j.addListener(new sz(px0Var, 28));
                px0Var.f31685j.setDuration(150L);
                px0Var.f31685j.setInterpolator(er.f28122f);
                px0Var.f31685j.start();
            }
        } else {
            px0 px0Var2 = this.hintAnimator;
            if (px0Var2 != null) {
                ValueAnimator valueAnimator2 = px0Var2.f31685j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                px0Var2.f31681e = false;
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
    public void setSelection(int i10) {
        try {
            super.setSelection(i10);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        if (Build.VERSION.SDK_INT >= 23 && (this.windowView != null || this.attachedToWindow != null)) {
            return startActionMode(callback);
        }
        return super.startActionMode(callback, i10);
    }

    public void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
