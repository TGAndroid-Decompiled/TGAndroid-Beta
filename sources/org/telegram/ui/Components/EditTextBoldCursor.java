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
public class EditTextBoldCursor extends ot {
    private static final String BLINK_CLASS = "android.widget.Editor$Blink";
    public static final int f26373a = 0;
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
    ig.a blurredBackgroundDrawableViewFactory;
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
    private nx0 hintAnimator;
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
    private final ff.j invalidateCallback;
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
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            setImportantForAutofill(2);
        }
        this.linePaint = new Paint();
        this.activeLinePaint = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.errorPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        if (i9 >= 26) {
            setImportantForAutofill(2);
        }
        if (i9 >= 29) {
            ft ftVar = new ft(this);
            this.cursorDrawable = ftVar;
            ftVar.setShape(new RectShape());
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
            float f10 = 0.0f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.headerTransformAnimation = animatorSet2;
                if (z11) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", f10));
                this.headerTransformAnimation.setDuration(200L);
                this.headerTransformAnimation.setInterpolator(gr.h);
                this.headerTransformAnimation.start();
            } else {
                if (z11) {
                    f10 = 1.0f;
                }
                this.headerAnimationProgress = f10;
            }
            invalidate();
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.v4 v4Var = this.floatingToolbar;
        if (v4Var != null) {
            v4Var.f23873a.removeOnLayoutChangeListener(v4Var.f23882l);
            org.telegram.ui.ActionBar.t4 t4Var = v4Var.f23874b;
            if (!t4Var.F) {
                t4Var.G = false;
                t4Var.F = true;
                t4Var.f23790x.cancel();
                t4Var.f23789w.start();
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
                AndroidUtilities.runOnUIThread(new np(onPreDrawListener, 8), 500L);
            } catch (Throwable unused) {
            }
            this.fixed = true;
        }
    }

    public final void g() {
        int selectionStart;
        int i9;
        int i10;
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
            i9 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.mTempRect.setEmpty();
            i9 = 0;
        }
        int scrollX = getScrollX();
        float f10 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        if (f10 >= f11 - 1.0f) {
            i10 = (width + scrollX) - (i9 - this.mTempRect.right);
        } else if (Math.abs(f10) > 1.0f && (!TextUtils.isEmpty(getText()) || 1048576 - scrollX > f11 + 1.0f || max > 1.0f)) {
            i10 = ((int) max) - this.mTempRect.left;
        } else {
            i10 = scrollX - this.mTempRect.left;
        }
        int dp = AndroidUtilities.dp(this.cursorWidth);
        GradientDrawable gradientDrawable2 = this.gradientDrawable;
        Rect rect = this.mTempRect;
        gradientDrawable2.setBounds(i10, lineTop - rect.top, dp + i10, lineTop2 + rect.bottom);
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

    public StaticLayout getErrorLayout(int i9) {
        if (TextUtils.isEmpty(this.errorText)) {
            return null;
        }
        return new StaticLayout(this.errorText, this.errorPaint, i9, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i9 = this.ignoreBottomCount;
        if (i9 != 0) {
            this.ignoreBottomCount = i9 - 1;
            int i10 = this.scrollY;
            if (i10 != Integer.MAX_VALUE) {
                return -i10;
            }
            return 0;
        }
        return super.getExtendedPaddingBottom();
    }

    @Override
    public int getExtendedPaddingTop() {
        int i9 = this.ignoreTopCount;
        if (i9 != 0) {
            this.ignoreTopCount = i9 - 1;
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

    public org.telegram.ui.ActionBar.b6 getResourcesProvider() {
        return null;
    }

    @Override
    public Drawable getTextCursorDrawable() {
        if (this.cursorDrawable != null) {
            return super.getTextCursorDrawable();
        }
        ft ftVar = new ft(this, new RectShape());
        ftVar.getPaint().setColor(0);
        return ftVar;
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
            ff.k.d().b(this.invalidateCallback, 2);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = null;
        if (Build.VERSION.SDK_INT < 29) {
            ff.k.d().f(this.invalidateCallback);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.EditTextBoldCursor.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onFocusChanged(boolean z10, int i9, Rect rect) {
        try {
            super.onFocusChanged(z10, i9, rect);
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
                new s0.d(accessibilityNodeInfo).l(this.hintLayout.getText());
            }
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
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
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        if (i9 != i11) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
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
            ff.k d = ff.k.d();
            d.getClass();
            ff.k.c();
            int max = Math.max(1, Math.min(2, 60));
            d.h(runnable);
            ff.i e10 = d.e(max);
            if (e10.f6209f == null) {
                e10.f6209f = new xd.b(true);
            }
            e10.f6209f.add(runnable);
            return true;
        }
        return super.postDelayed(runnable, j10);
    }

    @Override
    public boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ff.k.d().h(runnable);
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

    public void setBlurredBackgroundDrawableViewFactory(ig.a aVar) {
        this.blurredBackgroundDrawableViewFactory = aVar;
    }

    public void setCursorColor(int i9) {
        ShapeDrawable shapeDrawable = this.cursorDrawable;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i9);
        }
        GradientDrawable gradientDrawable = this.gradientDrawable;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i9);
        }
        invalidate();
    }

    public void setCursorSize(int i9) {
        this.cursorSize = i9;
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

    public void setErrorLineColor(int i9) {
        this.errorLineColor = i9;
        this.errorPaint.setColor(i9);
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

    public void setHandlesColor(int i9) {
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI() && this.mHandlesColor != i9) {
            this.mHandlesColor = i9;
            this.mHandlesColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
            h(this.mTextSelectHandleLeft, false);
            h(this.mTextSelectHandleRight, false);
            h(this.mTextSelectHandle, false);
        }
    }

    public void setHeaderAnimationProgress(float f10) {
        this.headerAnimationProgress = f10;
        invalidate();
    }

    public void setHeaderHintColor(int i9) {
        this.headerHintColor = i9;
        invalidate();
    }

    public void setHintColor(int i9) {
        this.hintColor = i9;
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.r(i9);
        }
        i6 i6Var2 = this.hintAnimatedDrawable2;
        if (i6Var2 != null) {
            i6Var2.r(this.hintColor);
        }
        invalidate();
    }

    public void setHintRightOffset(int i9) {
        float f10 = i9;
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
        boolean z11;
        i6 i6Var = this.hintAnimatedDrawable2;
        if (i6Var != null) {
            if (!LocaleController.isRTL && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var.q(charSequence, z11, true);
        }
    }

    public void setHintVisible(boolean z10, boolean z11) {
        float f10;
        if (this.hintVisible == z10) {
            return;
        }
        this.hintLastUpdateTime = System.currentTimeMillis();
        this.hintVisible = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.hintAlpha = f10;
        }
        invalidate();
    }

    public void setLineColors(int i9, int i10, int i11) {
        this.lineVisible = true;
        getContext().getResources().getDrawable(R.drawable.search_dark).getPadding(this.padding);
        Rect rect = this.padding;
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.lineColor = i9;
        this.activeLineColor = i10;
        this.activeLinePaint.setColor(i10);
        this.errorLineColor = i11;
        this.errorPaint.setColor(i11);
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
    public void setSelection(int i9, int i10) {
        try {
            super.setSelection(i9, i10);
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
    public void setTextSize(int i9, float f10) {
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.t(AndroidUtilities.dp(f10));
        }
        i6 i6Var2 = this.hintAnimatedDrawable2;
        if (i6Var2 != null) {
            i6Var2.t(AndroidUtilities.dp(f10));
        }
        super.setTextSize(i9, f10);
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
            v4Var.f23880j = this.onPremiumMenuLockClickListener;
            v4Var.f23881k = new ct(this, 0);
            org.telegram.ui.ActionBar.g4 g4Var2 = new org.telegram.ui.ActionBar.g4(getContext(), new org.telegram.ui.Cells.l9(this, callback), this, this.floatingToolbar);
            this.floatingActionMode = g4Var2;
            this.floatingToolbarPreDrawListener = new dt(0, this);
            callback.onCreateActionMode(g4Var2, g4Var2.f23427c);
            org.telegram.ui.ActionBar.g4 g4Var3 = this.floatingActionMode;
            extendActionMode(g4Var3, g4Var3.f23427c);
            this.floatingActionMode.invalidate();
            getViewTreeObserver().addOnPreDrawListener(this.floatingToolbarPreDrawListener);
            invalidate();
            return this.floatingActionMode;
        }
        return super.startActionMode(callback);
    }

    public void useAnimatedTextDrawable() {
        et etVar = new et(0, this);
        this.hintAnimatedDrawable = etVar;
        etVar.n(true);
        this.hintAnimatedDrawable.r(this.hintColor);
        this.hintAnimatedDrawable.t(getPaint().getTextSize());
        et etVar2 = new et(1, this);
        this.hintAnimatedDrawable2 = etVar2;
        etVar2.f29333b = 5;
        etVar2.r(this.hintColor);
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
        i6 i6Var = this.hintAnimatedDrawable;
        if (i6Var != null) {
            i6Var.q(charSequence4, !LocaleController.isRTL, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        if (getMeasuredWidth() == 0 ? false : z10) {
            if (this.hintAnimator == null) {
                this.hintAnimator = new nx0(this);
            }
            nx0 nx0Var = this.hintAnimator;
            StaticLayout staticLayout = this.hintLayout;
            CharSequence charSequence6 = this.hint;
            nx0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = nx0Var.f31211j;
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
                        spannableStringBuilder2.setSpan(new xy(false), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new xy(false), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new xy(false), indexOf, charSequence3.length() + indexOf, 0);
                    int dp = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    nx0Var.f31205b = new StaticLayout(spannableStringBuilder, textPaint, dp, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, AndroidUtilities.dp(400.0f), alignment, 1.0f, 0.0f, false);
                    nx0Var.d = staticLayout2;
                    nx0Var.f31207e = true;
                    nx0Var.f31208f = z11;
                    nx0Var.h = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
                    nx0Var.f31206c = null;
                    nx0Var.f31209g = false;
                } else {
                    int dp2 = AndroidUtilities.dp(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    nx0Var.f31205b = new StaticLayout(charSequence5, textPaint, dp2, alignment2, 1.0f, 0.0f, false);
                    nx0Var.f31206c = new StaticLayout(charSequence6, textPaint, AndroidUtilities.dp(400.0f), alignment2, 1.0f, 0.0f, false);
                    nx0Var.d = null;
                    nx0Var.f31207e = true;
                    nx0Var.f31209g = true;
                    nx0Var.h = 0.0f;
                }
                nx0Var.f31210i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                nx0Var.f31211j = ofFloat;
                ofFloat.addUpdateListener(new q60(nx0Var, 26));
                nx0Var.f31211j.addListener(new r60(nx0Var, 26));
                nx0Var.f31211j.setDuration(150L);
                nx0Var.f31211j.setInterpolator(gr.f28844f);
                nx0Var.f31211j.start();
            }
        } else {
            nx0 nx0Var2 = this.hintAnimator;
            if (nx0Var2 != null) {
                ValueAnimator valueAnimator2 = nx0Var2.f31211j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                nx0Var2.f31207e = false;
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
    public void setSelection(int i9) {
        try {
            super.setSelection(i9);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i9) {
        if (Build.VERSION.SDK_INT >= 23 && (this.windowView != null || this.attachedToWindow != null)) {
            return startActionMode(callback);
        }
        return super.startActionMode(callback, i9);
    }

    public void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}
