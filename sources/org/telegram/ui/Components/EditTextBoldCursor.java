package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
public class EditTextBoldCursor extends pt {
    public static Field E1;
    public static Field F1;
    public static Field G1;
    public static boolean H1;
    public static Method I1;
    public static Class J1;
    public static Field K1;
    public static Method L1;
    public boolean A0;
    public Paint A1;
    public float B0;
    public LinearGradient B1;
    public long C0;
    public Matrix C1;
    public boolean D0;
    public int D1;
    public boolean E0;
    public float F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public int J0;
    public int K0;
    public int L0;
    public float M0;
    public boolean N0;
    public float O0;
    public long P0;
    public float Q0;
    public float R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public AnimatorSet W0;
    public float X0;
    public org.telegram.ui.ActionBar.m4 Y0;
    public org.telegram.ui.ActionBar.y3 Z0;
    public fl f32904a1;
    public Object f32905b0;
    public View f32906b1;
    public final GradientDrawable f32907c0;
    public View f32908c1;
    public sw0 f32909d0;
    public int f32910d1;
    public float f32911e0;
    public boolean f32912e1;
    public final a6 f32913f0;
    public final ft f32914f1;
    public final Paint f32915g0;
    public final ArrayList f32916g1;
    public final Paint f32917h0;
    public boolean f32918h1;
    public final TextPaint f32919i0;
    public int f32920i1;
    public int f32921j0;
    public final Rect f32922j1;
    public int f32923k0;
    public int f32924k1;
    public int f32925l0;
    public int l1;
    public int m0;
    public LinearGradient f32926m1;
    public float f32927n0;
    public boolean n1;
    public final Rect f32928o0;
    public float f32929o1;
    public StaticLayout f32930p0;
    public float f32931p1;
    public float f32932q0;
    public long f32933q1;
    public boolean f32934r0;
    public Rect f32935r1;
    public boolean f32936s0;
    public dh.c f32937s1;
    public bi.b f32938t0;
    public Drawable f32939t1;
    public et f32940u0;
    public Drawable f32941u1;
    public et f32942v0;
    public Drawable f32943v1;
    public CharSequence f32944w0;
    public PorterDuffColorFilter f32945w1;
    public CharSequence f32946x0;
    public int f32947x1;
    public int f32948y0;
    public Runnable f32949y1;
    public int f32950z0;
    public boolean f32951z1;

    public EditTextBoldCursor(Context context) {
        super(context, null, 0, 2131755179);
        String str;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        this.f38550a = arrayList;
        this.f38551b = new Stack();
        this.f38552c = new ArrayList();
        this.f38553e = true;
        this.f38555n = new Path();
        this.H = true;
        this.I = null;
        this.K = new i(this, 1);
        this.L = new Rect();
        if (pt.f38549a0 == null) {
            String str2 = Build.MANUFACTURER;
            if ((str2 != null && (str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps") || str2.toLowerCase().contains("vivo") || str2.toLowerCase().contains("oppo") || str2.toLowerCase().contains("oneplus") || str2.toLowerCase().contains("realme"))) || ((str = Build.MODEL) != null && str.toLowerCase().contains("mediapad"))) {
                z10 = false;
            } else {
                z10 = true;
            }
            pt.f38549a0 = Boolean.valueOf(z10);
        }
        this.Q = pt.f38549a0.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f38554f = new gf.c(this, arrayList, new ot(this));
        }
        this.f32913f0 = new a6(this, 1);
        this.f32928o0 = new Rect();
        this.A0 = true;
        this.B0 = 1.0f;
        this.D0 = true;
        this.E0 = false;
        this.F0 = 2.0f;
        this.I0 = false;
        this.N0 = false;
        this.O0 = 0.0f;
        this.Q0 = 0.0f;
        this.R0 = 0.0f;
        this.U0 = true;
        this.f32916g1 = new ArrayList();
        this.f32918h1 = false;
        this.f32922j1 = new Rect();
        this.f32924k1 = -1;
        this.f32929o1 = Float.NaN;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            setImportantForAutofill(2);
        }
        this.f32915g0 = new Paint();
        this.f32917h0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.f32919i0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (i7 >= 26) {
            setImportantForAutofill(2);
        }
        if (i7 >= 29) {
            ft ftVar = new ft(this);
            this.f32914f1 = ftVar;
            ftVar.setShape(new RectShape());
            this.f32907c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.f32914f1);
        }
        try {
            if (!H1 && G1 == null) {
                H1 = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                G1 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (J1 == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                E1 = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                J1 = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    F1 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = J1.getDeclaredMethod("invalidateTextDisplayList", null);
                    L1 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                I1 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        if (this.f32914f1 == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.f32907c0 = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.f32905b0 = E1.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (K1 == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    K1 = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = K1;
                if (field != null) {
                    field.set(this, 2131231069);
                }
            } catch (Throwable unused5) {
            }
        }
        this.f32921j0 = org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.f32916g1.add(textWatcher);
        if (this.f32918h1) {
            return;
        }
        super.addTextChangedListener(textWatcher);
    }

    public int getActionModeStyle() {
        return 1;
    }

    public int getActiveLineColor() {
        return this.K0;
    }

    @Override
    public int getAutofillType() {
        return 0;
    }

    public int getCursorColor() {
        return this.f32920i1;
    }

    public int getErrorLineColor() {
        return this.L0;
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i7 = this.f32925l0;
        if (i7 != 0) {
            this.f32925l0 = i7 - 1;
            int i10 = this.m0;
            if (i10 != Integer.MAX_VALUE) {
                return -i10;
            }
            return 0;
        }
        return super.getExtendedPaddingBottom();
    }

    @Override
    public int getExtendedPaddingTop() {
        int i7 = this.f32923k0;
        if (i7 != 0) {
            this.f32923k0 = i7 - 1;
            return 0;
        }
        return super.getExtendedPaddingTop();
    }

    public int getHandlesColor() {
        return this.f32947x1;
    }

    public float getHeaderAnimationProgress() {
        return this.X0;
    }

    public int getHeaderHintColor() {
        return this.f32950z0;
    }

    public int getHintColor() {
        return this.f32948y0;
    }

    public Layout getHintLayoutEx() {
        return this.f32930p0;
    }

    public int getLineColor() {
        return this.J0;
    }

    @Override
    public float getLineSpacingExtra() {
        return super.getLineSpacingExtra();
    }

    public float getLineY() {
        return this.M0;
    }

    public Runnable getOnPremiumMenuLockClickListener() {
        return this.f32949y1;
    }

    public org.telegram.ui.ActionBar.i6 getResourcesProvider() {
        return null;
    }

    @Override
    public Drawable getTextCursorDrawable() {
        if (this.f32914f1 != null) {
            return super.getTextCursorDrawable();
        }
        ft ftVar = new ft(this, new RectShape());
        ftVar.getPaint().setColor(0);
        return ftVar;
    }

    @Override
    public Drawable getTextSelectHandle() {
        if (this.f32943v1 == null) {
            this.f32943v1 = z(super.getTextSelectHandle(), true);
        }
        return this.f32943v1;
    }

    @Override
    public Drawable getTextSelectHandleLeft() {
        if (this.f32939t1 == null) {
            this.f32939t1 = z(super.getTextSelectHandleLeft(), true);
        }
        return this.f32939t1;
    }

    @Override
    public Drawable getTextSelectHandleRight() {
        if (this.f32941u1 == null) {
            this.f32941u1 = z(super.getTextSelectHandleRight(), true);
        }
        return this.f32941u1;
    }

    public final void l(boolean z10) {
        boolean z11;
        if (this.T0 && (getText().length() > 0 || (this.U0 && isFocused()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.V0 != z11) {
            AnimatorSet animatorSet = this.W0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
            this.V0 = z11;
            float f10 = 0.0f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W0 = animatorSet2;
                if (z11) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", f10));
                this.W0.setDuration(200L);
                this.W0.setInterpolator(lr.h);
                this.W0.start();
            } else {
                if (z11) {
                    f10 = 1.0f;
                }
                this.X0 = f10;
            }
            invalidate();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.m4 m4Var = this.Y0;
        if (m4Var != null) {
            m4Var.f29234a.removeOnLayoutChangeListener(m4Var.f29243l);
            org.telegram.ui.ActionBar.k4 k4Var = m4Var.f29235b;
            if (!k4Var.F) {
                k4Var.G = false;
                k4Var.F = true;
                k4Var.f29142x.cancel();
                k4Var.f29141w.start();
                k4Var.D.setEmpty();
            }
            this.Y0 = null;
        }
        if (this.f32904a1 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f32904a1);
            this.f32904a1 = null;
        }
    }

    public void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.draw(canvas);
    }

    @Override
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f32908c1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            bg.k.d().b(this.f32913f0, 2);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32908c1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            bg.k.d().g(this.f32913f0);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.EditTextBoldCursor.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onFocusChanged(boolean z10, int i7, Rect rect) {
        try {
            super.onFocusChanged(z10, i7, rect);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        l(true);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.f32930p0 != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.f32930p0.getText());
            } else {
                new s0.c(accessibilityNodeInfo).l(this.f32930p0.getText());
            }
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        et etVar = this.f32940u0;
        if (etVar != null) {
            etVar.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        et etVar2 = this.f32942v0;
        if (etVar2 != null) {
            etVar2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.f32930p0;
        if (staticLayout != null && this.f32940u0 == null) {
            if (this.f32910d1 != measuredHeight) {
                s(this.f32944w0, false, staticLayout.getPaint());
            }
            if (this.f32934r0) {
                this.M0 = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.f32930p0.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.f32930p0.getHeight()) - org.telegram.messenger.g0.L(1.0f);
            } else {
                this.M0 = ((getMeasuredHeight() - this.f32930p0.getHeight()) / 2.0f) + this.f32930p0.getHeight() + org.telegram.messenger.g0.L(6.0f);
            }
        } else {
            this.M0 = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        }
        this.f32910d1 = measuredHeight;
    }

    @Override
    public void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        if (this.T0 && !this.U0) {
            l(true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f32924k1 = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final StaticLayout p(int i7) {
        if (TextUtils.isEmpty(this.f32946x0)) {
            return null;
        }
        return new StaticLayout(this.f32946x0, this.f32919i0, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final boolean postDelayed(Runnable runnable, long j3) {
        if (Build.VERSION.SDK_INT >= 29 && runnable != null && j3 == 500 && "android.widget.Editor$Blink".equals(runnable.getClass().getName()) && Looper.myLooper() == Looper.getMainLooper()) {
            bg.k d = bg.k.d();
            d.getClass();
            bg.k.c();
            int max = Math.max(1, Math.min(2, 60));
            d.h(runnable);
            bg.j e10 = d.e(max);
            if (e10.d == null) {
                e10.d = new xe.b();
            }
            e10.d.add(runnable);
            return true;
        }
        return super.postDelayed(runnable, j3);
    }

    public final void q() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (L1 != null) {
                    if (this.f32905b0 == null) {
                        this.f32905b0 = E1.get(this);
                    }
                    Object obj = this.f32905b0;
                    if (obj != null) {
                        L1.invoke(obj, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void r(CharSequence charSequence, boolean z10) {
        s(charSequence, z10, getPaint());
    }

    @Override
    public final boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            bg.k.d().h(runnable);
        }
        return super.removeCallbacks(runnable);
    }

    @Override
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        this.f32916g1.remove(textWatcher);
        if (this.f32918h1) {
            return;
        }
        super.removeTextChangedListener(textWatcher);
    }

    public final void s(CharSequence charSequence, boolean z10, TextPaint textPaint) {
        boolean z11;
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z12;
        float f10;
        CharSequence charSequence4 = charSequence;
        et etVar = this.f32940u0;
        if (etVar != null) {
            etVar.t(charSequence4, !org.telegram.messenger.gd.f24213a0, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        if (getMeasuredWidth() == 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if (z11) {
            if (this.f32909d0 == null) {
                this.f32909d0 = new sw0(this);
            }
            sw0 sw0Var = this.f32909d0;
            StaticLayout staticLayout = this.f32930p0;
            CharSequence charSequence6 = this.f32944w0;
            sw0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = sw0Var.f39860j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence6.length() > charSequence5.length()) {
                    charSequence2 = charSequence6.toString();
                    charSequence3 = charSequence5.toString();
                    z12 = true;
                } else {
                    charSequence2 = charSequence5.toString();
                    charSequence3 = charSequence6.toString();
                    z12 = false;
                }
                int indexOf = charSequence2.indexOf(charSequence3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2);
                    if (indexOf != 0) {
                        spannableStringBuilder2.setSpan(new sy(false), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new sy(false), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new sy(false), indexOf, charSequence3.length() + indexOf, 0);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    sw0Var.f39854b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
                    sw0Var.d = staticLayout2;
                    sw0Var.f39856e = true;
                    sw0Var.f39857f = z12;
                    if (indexOf == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -staticLayout2.getPrimaryHorizontal(indexOf);
                    }
                    sw0Var.h = f10;
                    sw0Var.f39855c = null;
                    sw0Var.f39858g = false;
                } else {
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    sw0Var.f39854b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    sw0Var.f39855c = new StaticLayout(charSequence6, textPaint, org.telegram.messenger.g0.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    sw0Var.d = null;
                    sw0Var.f39856e = true;
                    sw0Var.f39858g = true;
                    sw0Var.h = 0.0f;
                }
                sw0Var.f39859i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                sw0Var.f39860j = ofFloat;
                ofFloat.addUpdateListener(new e60(sw0Var, 26));
                sw0Var.f39860j.addListener(new q60(sw0Var, 27));
                sw0Var.f39860j.setDuration(150L);
                sw0Var.f39860j.setInterpolator(lr.f37208f);
                sw0Var.f39860j.start();
            }
        } else {
            sw0 sw0Var2 = this.f32909d0;
            if (sw0Var2 != null) {
                ValueAnimator valueAnimator2 = sw0Var2.f39860j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                sw0Var2.f39856e = false;
            }
        }
        this.f32944w0 = charSequence5;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequence5 = TextUtils.ellipsize(charSequence5, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.f32930p0;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequence5)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.f32930p0 = new StaticLayout(charSequence5, textPaint2, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setActiveLineColor(int i7) {
        this.K0 = i7;
        this.f32917h0.setColor(i7);
        invalidate();
    }

    public void setAllowDrawCursor(boolean z10) {
        this.D0 = z10;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(dh.c cVar) {
        this.f32937s1 = cVar;
    }

    public void setCursorColor(int i7) {
        this.f32920i1 = i7;
        ft ftVar = this.f32914f1;
        if (ftVar != null) {
            ftVar.getPaint().setColor(i7);
        }
        GradientDrawable gradientDrawable = this.f32907c0;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i7);
        }
        invalidate();
    }

    public void setCursorSize(int i7) {
        this.f32921j0 = i7;
    }

    public void setCursorWidth(float f10) {
        this.F0 = f10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f32951z1 = z10;
        if (z10) {
            this.D1 = org.telegram.messenger.g0.L(12.0f);
            this.A1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.D1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.B1 = linearGradient;
            this.A1.setShader(linearGradient);
            this.C1 = new Matrix();
        }
    }

    public void setErrorLineColor(int i7) {
        this.L0 = i7;
        this.f32919i0.setColor(i7);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f32946x0)) {
            return;
        }
        this.f32946x0 = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z10) {
        this.E0 = z10;
        invalidate();
    }

    public void setHandlesColor(int i7) {
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.c6.i() && this.f32947x1 != i7) {
            this.f32947x1 = i7;
            this.f32945w1 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            z(this.f32939t1, false);
            z(this.f32941u1, false);
            z(this.f32943v1, false);
        }
    }

    public void setHeaderAnimationProgress(float f10) {
        this.X0 = f10;
        invalidate();
    }

    public void setHeaderHintColor(int i7) {
        this.f32950z0 = i7;
        invalidate();
    }

    public void setHintColor(int i7) {
        this.f32948y0 = i7;
        et etVar = this.f32940u0;
        if (etVar != null) {
            etVar.u(i7);
        }
        et etVar2 = this.f32942v0;
        if (etVar2 != null) {
            etVar2.u(this.f32948y0);
        }
        invalidate();
    }

    public void setHintRightOffset(int i7) {
        float f10 = i7;
        if (this.f32911e0 == f10) {
            return;
        }
        this.f32911e0 = f10;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        s(charSequence, false, getPaint());
    }

    public void setLineColor(int i7) {
        this.J0 = i7;
        invalidate();
    }

    @Override
    public final void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f32927n0 = f10;
    }

    public void setNextSetTextAnimated(boolean z10) {
        this.S0 = z10;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.f32949y1 = runnable;
    }

    @Override
    public final void setSelection(int i7, int i10) {
        try {
            super.setSelection(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setSupportRtlHint(boolean z10) {
        this.G0 = z10;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        l(this.S0);
        this.S0 = false;
    }

    @Override
    public void setTextSelectHandle(Drawable drawable) {
        Drawable z10 = z(drawable, true);
        this.f32943v1 = z10;
        super.setTextSelectHandle(z10);
    }

    @Override
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable z10 = z(drawable, true);
        this.f32939t1 = z10;
        super.setTextSelectHandleLeft(z10);
    }

    @Override
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable z10 = z(drawable, true);
        this.f32941u1 = z10;
        super.setTextSelectHandleRight(z10);
    }

    @Override
    public void setTextSize(int i7, float f10) {
        et etVar = this.f32940u0;
        if (etVar != null) {
            etVar.w(org.telegram.messenger.g0.L(f10));
        }
        et etVar2 = this.f32942v0;
        if (etVar2 != null) {
            etVar2.w(org.telegram.messenger.g0.L(f10));
        }
        super.setTextSize(i7, f10);
    }

    public void setTransformHintToHeader(boolean z10) {
        if (this.T0 != z10) {
            this.T0 = z10;
            AnimatorSet animatorSet = this.W0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z10) {
        if (this.U0 == z10) {
            return;
        }
        this.U0 = z10;
        l(false);
    }

    public void setWindowView(View view) {
        this.f32906b1 = view;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (this.f32906b1 == null && this.f32908c1 == null) {
            return super.startActionMode(callback);
        }
        org.telegram.ui.ActionBar.y3 y3Var = this.Z0;
        if (y3Var != null) {
            y3Var.finish();
        }
        m();
        Context context = getContext();
        View view = this.f32906b1;
        if (view == null) {
            view = this.f32908c1;
        }
        org.telegram.ui.ActionBar.m4 m4Var = new org.telegram.ui.ActionBar.m4(context, view, getActionModeStyle(), getResourcesProvider(), this.f32937s1);
        this.Y0 = m4Var;
        m4Var.f29241j = this.f32949y1;
        m4Var.f29242k = new dt(this, 0);
        org.telegram.ui.ActionBar.y3 y3Var2 = new org.telegram.ui.ActionBar.y3(getContext(), new org.telegram.ui.Cells.h9(this, callback), this, this.Y0);
        this.Z0 = y3Var2;
        this.f32904a1 = new fl(1, this);
        callback.onCreateActionMode(y3Var2, y3Var2.f30274c);
        org.telegram.ui.ActionBar.y3 y3Var3 = this.Z0;
        o(y3Var3, y3Var3.f30274c);
        this.Z0.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.f32904a1);
        invalidate();
        return this.Z0;
    }

    public final void t(boolean z10, boolean z11) {
        float f10;
        if (this.A0 == z10) {
            return;
        }
        this.C0 = System.currentTimeMillis();
        this.A0 = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.B0 = f10;
        }
        invalidate();
    }

    public final void u(int i7, int i10, int i11) {
        this.I0 = true;
        Drawable drawable = getContext().getResources().getDrawable(2131232685);
        Rect rect = this.f32922j1;
        drawable.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.J0 = i7;
        this.K0 = i10;
        this.f32917h0.setColor(i10);
        this.L0 = i11;
        this.f32919i0.setColor(i11);
        invalidate();
    }

    public final void v(boolean z10, boolean z11) {
        if (this.f32918h1 != z10) {
            this.f32918h1 = z10;
            ArrayList arrayList = this.f32916g1;
            int i7 = 0;
            if (z10) {
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    super.removeTextChangedListener((TextWatcher) obj);
                }
                return;
            }
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                TextWatcher textWatcher = (TextWatcher) obj2;
                super.addTextChangedListener(textWatcher);
                if (z11) {
                    textWatcher.beforeTextChanged("", 0, length(), length());
                    textWatcher.onTextChanged(getText(), 0, length(), length());
                    textWatcher.afterTextChanged(getText());
                }
            }
        }
    }

    public final boolean w() {
        Editable text;
        if (!hasSelection() || getSelectionStart() < 0 || getSelectionEnd() < 0 || getSelectionStart() == getSelectionEnd() || (text = getText()) == null) {
            return false;
        }
        gh0[] gh0VarArr = (gh0[]) text.getSpans(getSelectionStart(), getSelectionEnd(), gh0.class);
        if (gh0VarArr != null && gh0VarArr.length != 0) {
            return false;
        }
        return true;
    }

    public final void x(Canvas canvas, Rect rect) {
        if (!this.n1) {
            this.f32929o1 = Float.NaN;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Float.isNaN(this.f32929o1)) {
            this.f32929o1 = rect.left;
            this.f32931p1 = rect.top;
        } else {
            float exp = 1.0f - ((float) Math.exp(((float) (-Math.min(64L, uptimeMillis - this.f32933q1))) / 60.0f));
            float f10 = this.f32929o1;
            float f11 = rect.left;
            float z10 = com.google.android.gms.internal.vision.e2.z(f11, f10, exp, f10);
            this.f32929o1 = z10;
            float f12 = this.f32931p1;
            this.f32931p1 = com.google.android.gms.internal.vision.e2.z(rect.top, f12, exp, f12);
            if (Math.abs(f11 - z10) < 0.5f && Math.abs(rect.top - this.f32931p1) < 0.5f) {
                this.f32929o1 = rect.left;
                this.f32931p1 = rect.top;
            } else {
                postInvalidateOnAnimation();
            }
        }
        this.f32933q1 = uptimeMillis;
        canvas.translate(this.f32929o1 - rect.left, this.f32931p1 - rect.top);
    }

    public final void y() {
        int selectionStart;
        int i7;
        int i10;
        Layout layout = getLayout();
        if (this.E0) {
            selectionStart = layout.getText().length();
        } else {
            selectionStart = getSelectionStart();
        }
        int lineForOffset = layout.getLineForOffset(selectionStart);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float max = Math.max(0.5f, layout.getPrimaryHorizontal(selectionStart) - 0.5f);
        if (this.f32935r1 == null) {
            this.f32935r1 = new Rect();
        }
        GradientDrawable gradientDrawable = this.f32907c0;
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.f32935r1);
            i7 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.f32935r1.setEmpty();
            i7 = 0;
        }
        int scrollX = getScrollX();
        float f10 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        if (f10 >= f11 - 1.0f) {
            i10 = (width + scrollX) - (i7 - this.f32935r1.right);
        } else if (Math.abs(f10) > 1.0f && (!TextUtils.isEmpty(getText()) || 1048576 - scrollX > f11 + 1.0f || max > 1.0f)) {
            i10 = ((int) max) - this.f32935r1.left;
        } else {
            i10 = scrollX - this.f32935r1.left;
        }
        int L = org.telegram.messenger.g0.L(this.F0);
        Rect rect = this.f32935r1;
        this.f32907c0.setBounds(i10, lineTop - rect.top, L + i10, lineTop2 + rect.bottom);
        layout.getText();
    }

    public final Drawable z(Drawable drawable, boolean z10) {
        if (drawable != null) {
            if (z10) {
                drawable = drawable.mutate();
            }
            PorterDuffColorFilter porterDuffColorFilter = this.f32945w1;
            if (porterDuffColorFilter != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
        }
        return drawable;
    }

    @Override
    public void setSelection(int i7) {
        try {
            super.setSelection(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        if (this.f32906b1 == null && this.f32908c1 == null) {
            return super.startActionMode(callback, i7);
        }
        return startActionMode(callback);
    }

    public void o(ActionMode actionMode, Menu menu) {
    }
}
