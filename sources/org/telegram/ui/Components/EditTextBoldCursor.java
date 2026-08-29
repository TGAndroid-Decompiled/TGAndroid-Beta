package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Looper;
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
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
public class EditTextBoldCursor extends ut {
    private static final String BLINK_CLASS = "android.widget.Editor$Blink";
    public static final int f26384a = 0;
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
    lg.a blurredBackgroundDrawableViewFactory;
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
    private n6 hintAnimatedDrawable;
    private n6 hintAnimatedDrawable2;
    private yx0 hintAnimator;
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
    private final jf.i invalidateCallback;
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
        this.invalidateCallback = new b6(this, 1);
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
            mt mtVar = new mt(this);
            this.cursorDrawable = mtVar;
            mtVar.setShape(new RectShape());
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
        } catch (Throwable th2) {
            FileLog.e(th2);
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
        boolean z11;
        if (this.transformHintToHeader && (getText().length() > 0 || (this.transformHintToHeaderOnFocus && isFocused()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.currentDrawHintAsHeader != z11) {
            AnimatorSet animatorSet = this.headerTransformAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.headerTransformAnimation = null;
            }
            this.currentDrawHintAsHeader = z11;
            float f9 = 0.0f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.headerTransformAnimation = animatorSet2;
                if (z11) {
                    f9 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", f9));
                this.headerTransformAnimation.setDuration(200L);
                this.headerTransformAnimation.setInterpolator(jr.h);
                this.headerTransformAnimation.start();
            } else {
                if (z11) {
                    f9 = 1.0f;
                }
                this.headerAnimationProgress = f9;
            }
            invalidate();
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.v4 v4Var = this.floatingToolbar;
        if (v4Var != null) {
            v4Var.f23893a.removeOnLayoutChangeListener(v4Var.f23902l);
            org.telegram.ui.ActionBar.t4 t4Var = v4Var.f23894b;
            if (!t4Var.F) {
                t4Var.G = false;
                t4Var.F = true;
                t4Var.f23812x.cancel();
                t4Var.f23811w.start();
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
        } else if (!this.fixed) {
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
                AndroidUtilities.runOnUIThread(new rp(onPreDrawListener, 8), 500L);
            } catch (Throwable unused) {
            }
            this.fixed = true;
        }
    }

    public final void g() {
        int selectionStart;
        int i10;
        int i11;
        Layout layout = getLayout();
        if (this.forceCursorEnd) {
            selectionStart = layout.getText().length();
        } else {
            selectionStart = getSelectionStart();
        }
        int lineForOffset = layout.getLineForOffset(selectionStart);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float primaryHorizontal = layout.getPrimaryHorizontal(selectionStart);
        GradientDrawable gradientDrawable = this.gradientDrawable;
        float max = Math.max(0.5f, primaryHorizontal - 0.5f);
        if (this.mTempRect == null) {
            this.mTempRect = new Rect();
        }
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.mTempRect);
            i10 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.mTempRect.setEmpty();
            i10 = 0;
        }
        int scrollX = getScrollX();
        float f9 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f10 = width;
        if (f9 >= f10 - 1.0f) {
            i11 = (width + scrollX) - (i10 - this.mTempRect.right);
        } else if (Math.abs(f9) > 1.0f && (!TextUtils.isEmpty(getText()) || 1048576 - scrollX > f10 + 1.0f || max > 1.0f)) {
            i11 = ((int) max) - this.mTempRect.left;
        } else {
            i11 = scrollX - this.mTempRect.left;
        }
        int dp = AndroidUtilities.dp(this.cursorWidth);
        GradientDrawable gradientDrawable2 = this.gradientDrawable;
        Rect rect = this.mTempRect;
        gradientDrawable2.setBounds(i11, lineTop - rect.top, dp + i11, lineTop2 + rect.bottom);
        this.lastText = layout.getText();
        this.lastOffset = selectionStart;
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
        if (i10 != 0) {
            this.ignoreBottomCount = i10 - 1;
            int i11 = this.scrollY;
            if (i11 != Integer.MAX_VALUE) {
                return -i11;
            }
            return 0;
        }
        return super.getExtendedPaddingBottom();
    }

    @Override
    public int getExtendedPaddingTop() {
        int i10 = this.ignoreTopCount;
        if (i10 != 0) {
            this.ignoreTopCount = i10 - 1;
            return 0;
        }
        return super.getExtendedPaddingTop();
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
        mt mtVar = new mt(this, new RectShape());
        mtVar.getPaint().setColor(0);
        return mtVar;
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.attachedToWindow = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            jf.j.d().b(this.invalidateCallback, 2);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = null;
        if (Build.VERSION.SDK_INT < 29) {
            jf.j.d().g(this.invalidateCallback);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.EditTextBoldCursor.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        try {
            super.onFocusChanged(z10, i10, rect);
        } catch (Exception e10) {
            FileLog.e(e10);
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
        n6 n6Var = this.hintAnimatedDrawable;
        if (n6Var != null) {
            n6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        n6 n6Var2 = this.hintAnimatedDrawable2;
        if (n6Var2 != null) {
            n6Var2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.hintLayout;
        if (staticLayout != null && this.hintAnimatedDrawable == null) {
            if (this.lastSize != measuredHeight) {
                setHintText(this.hint, false, staticLayout.getPaint());
            }
            if (this.hintLayoutYFix) {
                this.lineY = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.hintLayout.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.hintLayout.getHeight()) - AndroidUtilities.dp(1.0f);
            } else {
                this.lineY = ((getMeasuredHeight() - this.hintLayout.getHeight()) / 2.0f) + this.hintLayout.getHeight() + AndroidUtilities.dp(6.0f);
            }
        } else {
            this.lineY = getMeasuredHeight() - AndroidUtilities.dp(2.0f);
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
        if (this.transformHintToHeader && !this.transformHintToHeaderOnFocus) {
            e(true);
        }
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
        if (Build.VERSION.SDK_INT >= 29 && runnable != null && j10 == 500 && "android.widget.Editor$Blink".equals(runnable.getClass().getName()) && Looper.myLooper() == Looper.getMainLooper()) {
            jf.j d = jf.j.d();
            d.getClass();
            jf.j.c();
            int max = Math.max(1, Math.min(2, 60));
            d.h(runnable);
            jf.h e10 = d.e(max);
            if (e10.f11623f == null) {
                e10.f11623f = new zd.b(true);
            }
            e10.f11623f.add(runnable);
            return true;
        }
        return super.postDelayed(runnable, j10);
    }

    @Override
    public boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jf.j.d().h(runnable);
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

    public void setBlurredBackgroundDrawableViewFactory(lg.a aVar) {
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

    public void setCursorWidth(float f9) {
        this.cursorWidth = f9;
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
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI() && this.mHandlesColor != i10) {
            this.mHandlesColor = i10;
            this.mHandlesColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            h(this.mTextSelectHandleLeft, false);
            h(this.mTextSelectHandleRight, false);
            h(this.mTextSelectHandle, false);
        }
    }

    public void setHeaderAnimationProgress(float f9) {
        this.headerAnimationProgress = f9;
        invalidate();
    }

    public void setHeaderHintColor(int i10) {
        this.headerHintColor = i10;
        invalidate();
    }

    public void setHintColor(int i10) {
        this.hintColor = i10;
        n6 n6Var = this.hintAnimatedDrawable;
        if (n6Var != null) {
            n6Var.r(i10);
        }
        n6 n6Var2 = this.hintAnimatedDrawable2;
        if (n6Var2 != null) {
            n6Var2.r(this.hintColor);
        }
        invalidate();
    }

    public void setHintRightOffset(int i10) {
        float f9 = i10;
        if (this.rightHintOffset == f9) {
            return;
        }
        this.rightHintOffset = f9;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        setHintText(charSequence, false, getPaint());
    }

    public void setHintText2(CharSequence charSequence, boolean z10) {
        boolean z11;
        n6 n6Var = this.hintAnimatedDrawable2;
        if (n6Var != null) {
            if (!LocaleController.isRTL && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            n6Var.q(charSequence, z11, true);
        }
    }

    public void setHintVisible(boolean z10, boolean z11) {
        float f9;
        if (this.hintVisible == z10) {
            return;
        }
        this.hintLastUpdateTime = System.currentTimeMillis();
        this.hintVisible = z10;
        if (!z11) {
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.hintAlpha = f9;
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
    public void setLineSpacing(float f9, float f10) {
        super.setLineSpacing(f9, f10);
        this.lineSpacingExtra = f9;
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
        } catch (Exception e10) {
            FileLog.e(e10);
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
        Drawable h = h(drawable, true);
        this.mTextSelectHandle = h;
        super.setTextSelectHandle(h);
    }

    @Override
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable h = h(drawable, true);
        this.mTextSelectHandleLeft = h;
        super.setTextSelectHandleLeft(h);
    }

    @Override
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable h = h(drawable, true);
        this.mTextSelectHandleRight = h;
        super.setTextSelectHandleRight(h);
    }

    @Override
    public void setTextSize(int i10, float f9) {
        n6 n6Var = this.hintAnimatedDrawable;
        if (n6Var != null) {
            n6Var.t(AndroidUtilities.dp(f9));
        }
        n6 n6Var2 = this.hintAnimatedDrawable2;
        if (n6Var2 != null) {
            n6Var2.t(AndroidUtilities.dp(f9));
        }
        super.setTextSize(i10, f9);
    }

    public void setTextWatchersSuppressed(boolean z10, boolean z11) {
        if (this.isTextWatchersSuppressed != z10) {
            this.isTextWatchersSuppressed = z10;
            if (z10) {
                for (TextWatcher textWatcher : this.registeredTextWatchers) {
                    super.removeTextChangedListener(textWatcher);
                }
                return;
            }
            for (TextWatcher textWatcher2 : this.registeredTextWatchers) {
                super.addTextChangedListener(textWatcher2);
                if (z11) {
                    textWatcher2.beforeTextChanged("", 0, length(), length());
                    textWatcher2.onTextChanged(getText(), 0, length(), length());
                    textWatcher2.afterTextChanged(getText());
                }
            }
        }
    }

    public void setTransformHintToHeader(boolean z10) {
        if (this.transformHintToHeader != z10) {
            this.transformHintToHeader = z10;
            AnimatorSet animatorSet = this.headerTransformAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.headerTransformAnimation = null;
            }
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
        if (Build.VERSION.SDK_INT >= 23 && (this.windowView != null || this.attachedToWindow != null)) {
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
            v4Var.f23900j = this.onPremiumMenuLockClickListener;
            v4Var.f23901k = new jt(this, 0);
            org.telegram.ui.ActionBar.g4 g4Var2 = new org.telegram.ui.ActionBar.g4(getContext(), new org.telegram.ui.Cells.i9(this, callback), this, this.floatingToolbar);
            this.floatingActionMode = g4Var2;
            this.floatingToolbarPreDrawListener = new kt(0, this);
            callback.onCreateActionMode(g4Var2, g4Var2.f22987c);
            org.telegram.ui.ActionBar.g4 g4Var3 = this.floatingActionMode;
            extendActionMode(g4Var3, g4Var3.f22987c);
            this.floatingActionMode.invalidate();
            getViewTreeObserver().addOnPreDrawListener(this.floatingToolbarPreDrawListener);
            invalidate();
            return this.floatingActionMode;
        }
        return super.startActionMode(callback);
    }

    public void useAnimatedTextDrawable() {
        lt ltVar = new lt(0, this);
        this.hintAnimatedDrawable = ltVar;
        ltVar.n(true);
        this.hintAnimatedDrawable.r(this.hintColor);
        this.hintAnimatedDrawable.t(getPaint().getTextSize());
        lt ltVar2 = new lt(1, this);
        this.hintAnimatedDrawable2 = ltVar2;
        ltVar2.f30862b = 5;
        ltVar2.r(this.hintColor);
        this.hintAnimatedDrawable2.t(getPaint().getTextSize());
    }

    public void setHintText(CharSequence charSequence, boolean z10) {
        setHintText(charSequence, z10, getPaint());
    }

    public void setHintText(CharSequence charSequence, boolean z10, TextPaint textPaint) {
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z11;
        CharSequence charSequence4 = charSequence;
        n6 n6Var = this.hintAnimatedDrawable;
        if (n6Var != null) {
            n6Var.q(charSequence4, !LocaleController.isRTL, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        if (getMeasuredWidth() == 0 ? false : z10) {
            if (this.hintAnimator == null) {
                this.hintAnimator = new yx0(this);
            }
            yx0 yx0Var = this.hintAnimator;
            StaticLayout staticLayout = this.hintLayout;
            CharSequence charSequence6 = this.hint;
            yx0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = yx0Var.f35148j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence6.length() > charSequence5.length()) {
                    charSequence2 = charSequence6.toString();
                    charSequence3 = charSequence5.toString();
                    z11 = true;
                } else {
                    charSequence2 = charSequence5.toString();
                    charSequence3 = charSequence6.toString();
                    z11 = false;
                }
                int indexOf = charSequence2.indexOf(charSequence3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2);
                    if (indexOf != 0) {
                        spannableStringBuilder2.setSpan(new gz(false), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new gz(false), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new gz(false), indexOf, charSequence3.length() + indexOf, 0);
                    int dp = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    yx0Var.f35142b = new StaticLayout(spannableStringBuilder, textPaint, dp, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
                    yx0Var.d = staticLayout2;
                    yx0Var.f35144e = true;
                    yx0Var.f35145f = z11;
                    yx0Var.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    yx0Var.f35143c = null;
                    yx0Var.f35146g = false;
                } else {
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    yx0Var.f35142b = new StaticLayout(charSequence5, textPaint, dp2, alignment2, 1.0f, 0.0f, false);
                    yx0Var.f35143c = new StaticLayout(charSequence6, textPaint, AndroidUtilities.dp(400.0f), alignment2, 1.0f, 0.0f, false);
                    yx0Var.d = null;
                    yx0Var.f35144e = true;
                    yx0Var.f35146g = true;
                    yx0Var.h = 0.0f;
                }
                yx0Var.f35147i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                yx0Var.f35148j = ofFloat;
                ofFloat.addUpdateListener(new d70(yx0Var, 26));
                yx0Var.f35148j.addListener(new zz(yx0Var, 28));
                yx0Var.f35148j.setDuration(150L);
                yx0Var.f35148j.setInterpolator(jr.f29800f);
                yx0Var.f35148j.start();
            }
        } else {
            yx0 yx0Var2 = this.hintAnimator;
            if (yx0Var2 != null) {
                ValueAnimator valueAnimator2 = yx0Var2.f35148j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                yx0Var2.f35144e = false;
            }
        }
        this.hint = charSequence5;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequence5 = TextUtils.ellipsize(charSequence5, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.hintLayout;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequence5)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.hintLayout = new StaticLayout(charSequence5, textPaint2, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override
    public void setSelection(int i10) {
        try {
            super.setSelection(i10);
        } catch (Exception e10) {
            FileLog.e(e10);
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
