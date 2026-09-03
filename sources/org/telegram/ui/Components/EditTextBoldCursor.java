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
public class EditTextBoldCursor extends wt {
    private static final String BLINK_CLASS = "android.widget.Editor$Blink";
    public static final int f22995a = 0;
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
    ng.a blurredBackgroundDrawableViewFactory;
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
    public org.telegram.ui.ActionBar.j4 floatingActionMode;
    private org.telegram.ui.ActionBar.y4 floatingToolbar;
    private ViewTreeObserver.OnPreDrawListener floatingToolbarPreDrawListener;
    private boolean forceCursorEnd;
    private GradientDrawable gradientDrawable;
    private float headerAnimationProgress;
    private int headerHintColor;
    private AnimatorSet headerTransformAnimation;
    private CharSequence hint;
    private float hintAlpha;
    private j6 hintAnimatedDrawable;
    private j6 hintAnimatedDrawable2;
    private iy0 hintAnimator;
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
    private final kf.i invalidateCallback;
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
        this.invalidateCallback = new x5(this, 1);
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
            ot otVar = new ot(this);
            this.cursorDrawable = otVar;
            otVar.setShape(new RectShape());
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

    public final void e(boolean z4) {
        boolean z10;
        if (this.transformHintToHeader && (getText().length() > 0 || (this.transformHintToHeaderOnFocus && isFocused()))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.currentDrawHintAsHeader != z10) {
            AnimatorSet animatorSet = this.headerTransformAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.headerTransformAnimation = null;
            }
            this.currentDrawHintAsHeader = z10;
            float f10 = 0.0f;
            if (z4) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.headerTransformAnimation = animatorSet2;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", f10));
                this.headerTransformAnimation.setDuration(200L);
                this.headerTransformAnimation.setInterpolator(mr.h);
                this.headerTransformAnimation.start();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.headerAnimationProgress = f10;
            }
            invalidate();
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.y4 y4Var = this.floatingToolbar;
        if (y4Var != null) {
            y4Var.f20732a.removeOnLayoutChangeListener(y4Var.f20740l);
            org.telegram.ui.ActionBar.w4 w4Var = y4Var.f20733b;
            if (!w4Var.F) {
                w4Var.G = false;
                w4Var.F = true;
                w4Var.f20690x.cancel();
                w4Var.f20689w.start();
                w4Var.D.setEmpty();
            }
            this.floatingToolbar = null;
        }
        if (this.floatingToolbarPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.floatingToolbarPreDrawListener);
            this.floatingToolbarPreDrawListener = null;
        }
    }

    public void fixHandleView(boolean z4) {
        if (z4) {
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
                AndroidUtilities.runOnUIThread(new up(onPreDrawListener, 8), 500L);
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
        float f10 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        if (f10 >= f11 - 1.0f) {
            i11 = (width + scrollX) - (i10 - this.mTempRect.right);
        } else if (Math.abs(f10) > 1.0f && (!TextUtils.isEmpty(getText()) || 1048576 - scrollX > f11 + 1.0f || max > 1.0f)) {
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

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return null;
    }

    @Override
    public Drawable getTextCursorDrawable() {
        if (this.cursorDrawable != null) {
            return super.getTextCursorDrawable();
        }
        ot otVar = new ot(this, new RectShape());
        otVar.getPaint().setColor(0);
        return otVar;
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

    public final Drawable h(Drawable drawable, boolean z4) {
        if (drawable != null) {
            if (z4) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.attachedToWindow = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            kf.j.d().b(this.invalidateCallback, 2);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = null;
        if (Build.VERSION.SDK_INT < 29) {
            kf.j.d().g(this.invalidateCallback);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.EditTextBoldCursor.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onFocusChanged(boolean z4, int i10, Rect rect) {
        try {
            super.onFocusChanged(z4, i10, rect);
        } catch (Exception e) {
            FileLog.e(e);
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
                new s0.d(accessibilityNodeInfo).l(this.hintLayout.getText());
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        j6 j6Var = this.hintAnimatedDrawable;
        if (j6Var != null) {
            j6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        j6 j6Var2 = this.hintAnimatedDrawable2;
        if (j6Var2 != null) {
            j6Var2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
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
            kf.j d = kf.j.d();
            d.getClass();
            kf.j.c();
            int max = Math.max(1, Math.min(2, 60));
            d.h(runnable);
            kf.h e = d.e(max);
            if (e.f10455f == null) {
                e.f10455f = new be.b(true);
            }
            e.f10455f.add(runnable);
            return true;
        }
        return super.postDelayed(runnable, j10);
    }

    @Override
    public boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            kf.j.d().h(runnable);
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

    public void setAllowDrawCursor(boolean z4) {
        this.allowDrawCursor = z4;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(ng.a aVar) {
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

    public void setEllipsizeByGradient(boolean z4) {
        this.ellipsizeByGradient = z4;
        if (z4) {
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

    public void setForceCursorEnd(boolean z4) {
        this.forceCursorEnd = z4;
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
        j6 j6Var = this.hintAnimatedDrawable;
        if (j6Var != null) {
            j6Var.r(i10);
        }
        j6 j6Var2 = this.hintAnimatedDrawable2;
        if (j6Var2 != null) {
            j6Var2.r(this.hintColor);
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

    public void setHintText2(CharSequence charSequence, boolean z4) {
        boolean z10;
        j6 j6Var = this.hintAnimatedDrawable2;
        if (j6Var != null) {
            if (!LocaleController.isRTL && z4) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var.q(charSequence, z10, true);
        }
    }

    public void setHintVisible(boolean z4, boolean z10) {
        float f10;
        if (this.hintVisible == z4) {
            return;
        }
        this.hintLastUpdateTime = System.currentTimeMillis();
        this.hintVisible = z4;
        if (!z10) {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.hintAlpha = f10;
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

    public void setNextSetTextAnimated(boolean z4) {
        this.nextSetTextAnimated = z4;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.onPremiumMenuLockClickListener = runnable;
    }

    @Override
    public void setSelection(int i10, int i11) {
        try {
            super.setSelection(i10, i11);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setSupportRtlHint(boolean z4) {
        this.supportRtlHint = z4;
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
    public void setTextSize(int i10, float f10) {
        j6 j6Var = this.hintAnimatedDrawable;
        if (j6Var != null) {
            j6Var.t(AndroidUtilities.dp(f10));
        }
        j6 j6Var2 = this.hintAnimatedDrawable2;
        if (j6Var2 != null) {
            j6Var2.t(AndroidUtilities.dp(f10));
        }
        super.setTextSize(i10, f10);
    }

    public void setTextWatchersSuppressed(boolean z4, boolean z10) {
        if (this.isTextWatchersSuppressed != z4) {
            this.isTextWatchersSuppressed = z4;
            if (z4) {
                for (TextWatcher textWatcher : this.registeredTextWatchers) {
                    super.removeTextChangedListener(textWatcher);
                }
                return;
            }
            for (TextWatcher textWatcher2 : this.registeredTextWatchers) {
                super.addTextChangedListener(textWatcher2);
                if (z10) {
                    textWatcher2.beforeTextChanged("", 0, length(), length());
                    textWatcher2.onTextChanged(getText(), 0, length(), length());
                    textWatcher2.afterTextChanged(getText());
                }
            }
        }
    }

    public void setTransformHintToHeader(boolean z4) {
        if (this.transformHintToHeader != z4) {
            this.transformHintToHeader = z4;
            AnimatorSet animatorSet = this.headerTransformAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.headerTransformAnimation = null;
            }
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z4) {
        if (this.transformHintToHeaderOnFocus == z4) {
            return;
        }
        this.transformHintToHeaderOnFocus = z4;
        e(false);
    }

    public void setWindowView(View view) {
        this.windowView = view;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23 && (this.windowView != null || this.attachedToWindow != null)) {
            org.telegram.ui.ActionBar.j4 j4Var = this.floatingActionMode;
            if (j4Var != null) {
                j4Var.finish();
            }
            f();
            Context context = getContext();
            View view = this.windowView;
            if (view == null) {
                view = this.attachedToWindow;
            }
            org.telegram.ui.ActionBar.y4 y4Var = new org.telegram.ui.ActionBar.y4(context, view, getActionModeStyle(), getResourcesProvider(), this.blurredBackgroundDrawableViewFactory);
            this.floatingToolbar = y4Var;
            y4Var.f20738j = this.onPremiumMenuLockClickListener;
            y4Var.f20739k = new lt(this, 0);
            org.telegram.ui.ActionBar.j4 j4Var2 = new org.telegram.ui.ActionBar.j4(getContext(), new org.telegram.ui.Cells.j9(this, callback), this, this.floatingToolbar);
            this.floatingActionMode = j4Var2;
            this.floatingToolbarPreDrawListener = new mt(0, this);
            callback.onCreateActionMode(j4Var2, j4Var2.f19806c);
            org.telegram.ui.ActionBar.j4 j4Var3 = this.floatingActionMode;
            extendActionMode(j4Var3, j4Var3.f19806c);
            this.floatingActionMode.invalidate();
            getViewTreeObserver().addOnPreDrawListener(this.floatingToolbarPreDrawListener);
            invalidate();
            return this.floatingActionMode;
        }
        return super.startActionMode(callback);
    }

    public void useAnimatedTextDrawable() {
        nt ntVar = new nt(0, this);
        this.hintAnimatedDrawable = ntVar;
        ntVar.n(true);
        this.hintAnimatedDrawable.r(this.hintColor);
        this.hintAnimatedDrawable.t(getPaint().getTextSize());
        nt ntVar2 = new nt(1, this);
        this.hintAnimatedDrawable2 = ntVar2;
        ntVar2.f25847b = 5;
        ntVar2.r(this.hintColor);
        this.hintAnimatedDrawable2.t(getPaint().getTextSize());
    }

    public void setHintText(CharSequence charSequence, boolean z4) {
        setHintText(charSequence, z4, getPaint());
    }

    public void setHintText(CharSequence charSequence, boolean z4, TextPaint textPaint) {
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z10;
        CharSequence charSequence4 = charSequence;
        j6 j6Var = this.hintAnimatedDrawable;
        if (j6Var != null) {
            j6Var.q(charSequence4, !LocaleController.isRTL, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        if (getMeasuredWidth() == 0 ? false : z4) {
            if (this.hintAnimator == null) {
                this.hintAnimator = new iy0(this);
            }
            iy0 iy0Var = this.hintAnimator;
            StaticLayout staticLayout = this.hintLayout;
            CharSequence charSequence6 = this.hint;
            iy0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = iy0Var.f25792j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence6.length() > charSequence5.length()) {
                    charSequence2 = charSequence6.toString();
                    charSequence3 = charSequence5.toString();
                    z10 = true;
                } else {
                    charSequence2 = charSequence5.toString();
                    charSequence3 = charSequence6.toString();
                    z10 = false;
                }
                int indexOf = charSequence2.indexOf(charSequence3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2);
                    if (indexOf != 0) {
                        spannableStringBuilder2.setSpan(new lz(false), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new lz(false), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new lz(false), indexOf, charSequence3.length() + indexOf, 0);
                    int dp = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    iy0Var.f25787b = new StaticLayout(spannableStringBuilder, textPaint, dp, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
                    iy0Var.d = staticLayout2;
                    iy0Var.e = true;
                    iy0Var.f25789f = z10;
                    iy0Var.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    iy0Var.f25788c = null;
                    iy0Var.f25790g = false;
                } else {
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    iy0Var.f25787b = new StaticLayout(charSequence5, textPaint, dp2, alignment2, 1.0f, 0.0f, false);
                    iy0Var.f25788c = new StaticLayout(charSequence6, textPaint, AndroidUtilities.dp(400.0f), alignment2, 1.0f, 0.0f, false);
                    iy0Var.d = null;
                    iy0Var.e = true;
                    iy0Var.f25790g = true;
                    iy0Var.h = 0.0f;
                }
                iy0Var.f25791i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                iy0Var.f25792j = ofFloat;
                ofFloat.addUpdateListener(new j70(iy0Var, 26));
                iy0Var.f25792j.addListener(new od0(iy0Var, 19));
                iy0Var.f25792j.setDuration(150L);
                iy0Var.f25792j.setInterpolator(mr.f27122f);
                iy0Var.f25792j.start();
            }
        } else {
            iy0 iy0Var2 = this.hintAnimator;
            if (iy0Var2 != null) {
                ValueAnimator valueAnimator2 = iy0Var2.f25792j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                iy0Var2.e = false;
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
        } catch (Exception e) {
            FileLog.e(e);
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
