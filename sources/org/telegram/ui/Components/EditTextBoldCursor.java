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
public class EditTextBoldCursor extends cu3 {
    public static Field F1;
    public static Field G1;
    public static Field H1;
    public static boolean I1;
    public static Method J1;
    public static Class K1;
    public static Field L1;
    public static Method M1;
    public boolean A0;
    public boolean A1;
    public float B0;
    public Paint B1;
    public long C0;
    public LinearGradient C1;
    public boolean D0;
    public Matrix D1;
    public boolean E0;
    public int E1;
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
    public lm4 Y0;
    public cl4 Z0;
    public es1 a1;
    public Object b0;
    public View b1;
    public final GradientDrawable c0;
    public View c1;
    public geb d0;
    public int d1;
    public float e0;
    public boolean e1;
    public final km f0;
    public final qt3 f1;
    public final Paint g0;
    public final ArrayList g1;
    public final Paint h0;
    public boolean h1;
    public final TextPaint i0;
    public int i1;
    public int j0;
    public final Rect j1;
    public int k0;
    public int k1;
    public int l0;
    public int l1;
    public int m0;
    public LinearGradient m1;
    public float n0;
    public rx n1;
    public final Rect o0;
    public boolean o1;
    public StaticLayout p0;
    public float p1;
    public float q0;
    public float q1;
    public boolean r0;
    public long r1;
    public boolean s0;
    public Rect s1;
    public defpackage.c t0;
    public ll0 t1;
    public pt3 u0;
    public Drawable u1;
    public pt3 v0;
    public Drawable v1;
    public CharSequence w0;
    public Drawable w1;
    public CharSequence x0;
    public PorterDuffColorFilter x1;
    public int y0;
    public int y1;
    public int z0;
    public Runnable z1;

    public EditTextBoldCursor(Context context) {
        super(context, null, 0, 2131755179);
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = new Stack();
        this.c = new ArrayList();
        this.e = true;
        this.n = new Path();
        this.H = true;
        this.I = null;
        this.K = new defpackage.l(this, (byte) 1);
        this.L = new Rect();
        Boolean bool = cu3.a0;
        if (bool == null) {
            String str2 = Build.MANUFACTURER;
            if ((str2 != null && (str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps") || str2.toLowerCase().contains("vivo") || str2.toLowerCase().contains("oppo") || str2.toLowerCase().contains("oneplus") || str2.toLowerCase().contains("realme"))) || ((str = Build.MODEL) != null && str.toLowerCase().contains("mediapad"))) {
                z = false;
            } else {
                z = true;
            }
            bool = Boolean.valueOf(z);
            cu3.a0 = bool;
        }
        this.Q = bool.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f = new nk0(this, arrayList, new bu3(this, (byte) 0));
        }
        this.f0 = new km(this, (byte) 1);
        this.o0 = new Rect();
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
        this.g1 = new ArrayList();
        this.h1 = false;
        this.j1 = new Rect();
        this.k1 = -1;
        this.p1 = Float.NaN;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            setImportantForAutofill(2);
        }
        this.g0 = new Paint();
        this.h0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.i0 = textPaint;
        textPaint.setTextSize(hl.L(11.0f));
        if (i >= 26) {
            setImportantForAutofill(2);
        }
        if (i >= 29) {
            qt3 qt3Var = new qt3(this);
            this.f1 = qt3Var;
            qt3Var.setShape(new RectShape());
            this.c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.f1);
        }
        try {
            if (!I1 && H1 == null) {
                I1 = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                H1 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (K1 == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                F1 = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                K1 = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    G1 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = K1.getDeclaredMethod("invalidateTextDisplayList", null);
                    M1 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                J1 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        if (this.f1 == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.c0 = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.b0 = F1.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (L1 == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    L1 = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = L1;
                if (field != null) {
                    field.set(this, 2131231071);
                }
            } catch (Throwable unused5) {
            }
        }
        this.j0 = hl.L(24.0f);
    }

    @Override
    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.g1.add(textWatcher);
        if (this.h1) {
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
        return this.i1;
    }

    public int getErrorLineColor() {
        return this.L0;
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i = this.l0;
        if (i != 0) {
            this.l0 = i - 1;
            int i2 = this.m0;
            if (i2 != Integer.MAX_VALUE) {
                return -i2;
            }
            return 0;
        }
        return super.getExtendedPaddingBottom();
    }

    @Override
    public int getExtendedPaddingTop() {
        int i = this.k0;
        if (i != 0) {
            this.k0 = i - 1;
            return 0;
        }
        return super.getExtendedPaddingTop();
    }

    public int getHandlesColor() {
        return this.y1;
    }

    public float getHeaderAnimationProgress() {
        return this.X0;
    }

    public int getHeaderHintColor() {
        return this.z0;
    }

    public int getHintColor() {
        return this.y0;
    }

    public Layout getHintLayoutEx() {
        return this.p0;
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
        return this.z1;
    }

    public vnb getResourcesProvider() {
        return null;
    }

    @Override
    public Drawable getTextCursorDrawable() {
        if (this.f1 != null) {
            return super.getTextCursorDrawable();
        }
        qt3 qt3Var = new qt3(this, new RectShape());
        qt3Var.getPaint().setColor(0);
        return qt3Var;
    }

    @Override
    public Drawable getTextSelectHandle() {
        Drawable drawable = this.w1;
        if (drawable == null) {
            Drawable z = z(super.getTextSelectHandle(), true);
            this.w1 = z;
            return z;
        }
        return drawable;
    }

    @Override
    public Drawable getTextSelectHandleLeft() {
        Drawable drawable = this.u1;
        if (drawable == null) {
            Drawable z = z(super.getTextSelectHandleLeft(), true);
            this.u1 = z;
            return z;
        }
        return drawable;
    }

    @Override
    public Drawable getTextSelectHandleRight() {
        Drawable drawable = this.v1;
        if (drawable == null) {
            Drawable z = z(super.getTextSelectHandleRight(), true);
            this.v1 = z;
            return z;
        }
        return drawable;
    }

    public final void l(boolean z) {
        boolean z2;
        if (this.T0 && (getText().length() > 0 || (this.U0 && isFocused()))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.V0 != z2) {
            AnimatorSet animatorSet = this.W0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
            this.V0 = z2;
            float f = 0.0f;
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W0 = animatorSet2;
                if (z2) {
                    f = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", f));
                this.W0.setDuration(200L);
                this.W0.setInterpolator(k43.h);
                this.W0.start();
            } else {
                if (z2) {
                    f = 1.0f;
                }
                this.X0 = f;
            }
            invalidate();
        }
    }

    public final void m() {
        lm4 lm4Var = this.Y0;
        if (lm4Var != null) {
            lm4Var.a.removeOnLayoutChangeListener(lm4Var.l);
            jm4 jm4Var = lm4Var.b;
            if (!jm4Var.F) {
                jm4Var.G = false;
                jm4Var.F = true;
                jm4Var.x.cancel();
                jm4Var.w.start();
                jm4Var.D.setEmpty();
            }
            this.Y0 = null;
        }
        if (this.a1 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.a1);
            this.a1 = null;
        }
    }

    public void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.draw(canvas);
    }

    @Override
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.c1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            jh2.d().b(this.f0, 2);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            jh2.d().f(this.f0);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.EditTextBoldCursor.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            super.onFocusChanged(z, i, rect);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        l(true);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.p0 != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.p0.getText());
            } else {
                new v4(accessibilityNodeInfo).l(this.p0.getText());
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        pt3 pt3Var = this.u0;
        if (pt3Var != null) {
            pt3Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        pt3 pt3Var2 = this.v0;
        if (pt3Var2 != null) {
            pt3Var2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.p0;
        if (staticLayout != null && this.u0 == null) {
            if (this.d1 != measuredHeight) {
                s(this.w0, false, staticLayout.getPaint());
            }
            if (this.r0) {
                this.M0 = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.p0.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.p0.getHeight()) - hl.L(1.0f);
            } else {
                this.M0 = ((getMeasuredHeight() - this.p0.getHeight()) / 2.0f) + this.p0.getHeight() + hl.L(6.0f);
            }
        } else {
            this.M0 = getMeasuredHeight() - hl.L(2.0f);
        }
        this.d1 = measuredHeight;
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
        if (this.T0 && !this.U0) {
            l(true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k1 = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final StaticLayout p(int i) {
        if (TextUtils.isEmpty(this.x0)) {
            return null;
        }
        return new StaticLayout(this.x0, this.i0, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final boolean postDelayed(Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 29 && runnable != null && j == 500 && "android.widget.Editor$Blink".equals(runnable.getClass().getName()) && Looper.myLooper() == Looper.getMainLooper()) {
            jh2 d = jh2.d();
            jh2.c();
            d.h(runnable);
            ih2 e = d.e(2);
            r89 r89Var = e.d;
            if (r89Var == null) {
                r89Var = new r89(0, false);
                e.d = r89Var;
            }
            r89Var.add(runnable);
            return true;
        }
        return super.postDelayed(runnable, j);
    }

    public final void q() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (M1 != null) {
                    Object obj = this.b0;
                    if (obj == null) {
                        obj = F1.get(this);
                        this.b0 = obj;
                    }
                    if (obj != null) {
                        M1.invoke(obj, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void r(CharSequence charSequence, boolean z) {
        s(charSequence, z, getPaint());
    }

    @Override
    public final boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jh2.d().h(runnable);
        }
        return super.removeCallbacks(runnable);
    }

    @Override
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        this.g1.remove(textWatcher);
        if (this.h1) {
            return;
        }
        super.removeTextChangedListener(textWatcher);
    }

    public final void s(CharSequence charSequence, boolean z, TextPaint textPaint) {
        boolean z2;
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z3;
        float f;
        CharSequence charSequence4 = charSequence;
        pt3 pt3Var = this.u0;
        if (pt3Var != null) {
            pt3Var.t(charSequence4, !ob6.a0, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        if (getMeasuredWidth() == 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        geb gebVar = this.d0;
        if (z2) {
            if (gebVar == null) {
                gebVar = new geb(this);
                this.d0 = gebVar;
            }
            geb gebVar2 = gebVar;
            StaticLayout staticLayout = this.p0;
            CharSequence charSequence6 = this.w0;
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = gebVar2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence6.length() > charSequence5.length()) {
                    charSequence2 = charSequence6.toString();
                    charSequence3 = charSequence5.toString();
                    z3 = true;
                } else {
                    charSequence2 = charSequence5.toString();
                    charSequence3 = charSequence6.toString();
                    z3 = false;
                }
                int indexOf = charSequence2.indexOf(charSequence3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2);
                    if (indexOf != 0) {
                        spannableStringBuilder2.setSpan(new fy2((byte) 1), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new fy2((byte) 1), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new fy2((byte) 1), indexOf, charSequence3.length() + indexOf, 0);
                    int L = hl.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    gebVar2.b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, hl.L(400.0f), alignment, 1.0f, 0.0f, false);
                    gebVar2.d = staticLayout2;
                    gebVar2.e = true;
                    gebVar2.f = z3;
                    if (indexOf == 0) {
                        f = 0.0f;
                    } else {
                        f = -staticLayout2.getPrimaryHorizontal(indexOf);
                    }
                    gebVar2.h = f;
                    gebVar2.c = null;
                    gebVar2.g = false;
                } else {
                    int L2 = hl.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    gebVar2.b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    gebVar2.c = new StaticLayout(charSequence6, textPaint, hl.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    gebVar2.d = null;
                    gebVar2.e = true;
                    gebVar2.g = true;
                    gebVar2.h = 0.0f;
                }
                gebVar2.i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                gebVar2.j = ofFloat;
                ofFloat.addUpdateListener(new ija(gebVar2, (byte) 21));
                gebVar2.j.addListener(new po9(gebVar2, (byte) 29));
                gebVar2.j.setDuration(150L);
                gebVar2.j.setInterpolator(k43.f);
                gebVar2.j.start();
            }
        } else if (gebVar != null) {
            ValueAnimator valueAnimator2 = gebVar.j;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            gebVar.e = false;
        }
        this.w0 = charSequence5;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequence5 = TextUtils.ellipsize(charSequence5, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.p0;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequence5)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.p0 = new StaticLayout(charSequence5, textPaint2, hl.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setActiveLineColor(int i) {
        this.K0 = i;
        this.h0.setColor(i);
        invalidate();
    }

    public void setAllowDrawCursor(boolean z) {
        this.D0 = z;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(ll0 ll0Var) {
        this.t1 = ll0Var;
    }

    public void setCursorColor(int i) {
        this.i1 = i;
        qt3 qt3Var = this.f1;
        if (qt3Var != null) {
            qt3Var.getPaint().setColor(i);
        }
        GradientDrawable gradientDrawable = this.c0;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
        invalidate();
    }

    public void setCursorSize(int i) {
        this.j0 = i;
    }

    public void setCursorWidth(float f) {
        this.F0 = f;
    }

    public void setEllipsizeByGradient(boolean z) {
        this.A1 = z;
        if (z) {
            this.E1 = hl.L(12.0f);
            this.B1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.E1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.C1 = linearGradient;
            this.B1.setShader(linearGradient);
            this.D1 = new Matrix();
        }
    }

    public void setErrorLineColor(int i) {
        this.L0 = i;
        this.i0.setColor(i);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.x0)) {
            return;
        }
        this.x0 = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z) {
        this.E0 = z;
        invalidate();
    }

    public void setHandlesColor(int i) {
        if (Build.VERSION.SDK_INT >= 29 && !f3f.b() && this.y1 != i) {
            this.y1 = i;
            this.x1 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            z(this.u1, false);
            z(this.v1, false);
            z(this.w1, false);
        }
    }

    public void setHeaderAnimationProgress(float f) {
        this.X0 = f;
        invalidate();
    }

    public void setHeaderHintColor(int i) {
        this.z0 = i;
        invalidate();
    }

    public void setHintColor(int i) {
        this.y0 = i;
        pt3 pt3Var = this.u0;
        if (pt3Var != null) {
            pt3Var.u(i);
        }
        pt3 pt3Var2 = this.v0;
        if (pt3Var2 != null) {
            pt3Var2.u(this.y0);
        }
        invalidate();
    }

    public void setHintRightOffset(int i) {
        float f = i;
        if (this.e0 == f) {
            return;
        }
        this.e0 = f;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        s(charSequence, false, getPaint());
    }

    public void setLineColor(int i) {
        this.J0 = i;
        invalidate();
    }

    @Override
    public final void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.n0 = f;
    }

    public void setNextSetTextAnimated(boolean z) {
        this.S0 = z;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.z1 = runnable;
    }

    @Override
    public final void setSelection(int i, int i2) {
        try {
            super.setSelection(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void setSupportRtlHint(boolean z) {
        this.G0 = z;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        l(this.S0);
        this.S0 = false;
    }

    @Override
    public void setTextSelectHandle(Drawable drawable) {
        Drawable z = z(drawable, true);
        this.w1 = z;
        super.setTextSelectHandle(z);
    }

    @Override
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable z = z(drawable, true);
        this.u1 = z;
        super.setTextSelectHandleLeft(z);
    }

    @Override
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable z = z(drawable, true);
        this.v1 = z;
        super.setTextSelectHandleRight(z);
    }

    @Override
    public void setTextSize(int i, float f) {
        pt3 pt3Var = this.u0;
        if (pt3Var != null) {
            pt3Var.w(hl.L(f));
        }
        pt3 pt3Var2 = this.v0;
        if (pt3Var2 != null) {
            pt3Var2.w(hl.L(f));
        }
        super.setTextSize(i, f);
    }

    public void setTransformHintToHeader(boolean z) {
        if (this.T0 != z) {
            this.T0 = z;
            AnimatorSet animatorSet = this.W0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z) {
        if (this.U0 == z) {
            return;
        }
        this.U0 = z;
        l(false);
    }

    public void setWindowView(View view) {
        this.b1 = view;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (this.b1 == null && this.c1 == null) {
            return super.startActionMode(callback);
        }
        cl4 cl4Var = this.Z0;
        if (cl4Var != null) {
            cl4Var.finish();
        }
        m();
        Context context = getContext();
        View view = this.b1;
        if (view == null) {
            view = this.c1;
        }
        lm4 lm4Var = new lm4(context, view, getActionModeStyle(), getResourcesProvider(), this.t1);
        this.Y0 = lm4Var;
        lm4Var.j = this.z1;
        lm4Var.k = new yf0(this, (byte) 1);
        cl4 cl4Var2 = new cl4(getContext(), new rt3(this, callback), this, this.Y0);
        this.Z0 = cl4Var2;
        this.a1 = new es1(this, (byte) 2);
        callback.onCreateActionMode(cl4Var2, cl4Var2.c);
        cl4 cl4Var3 = this.Z0;
        o(cl4Var3, cl4Var3.c);
        this.Z0.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.a1);
        invalidate();
        return this.Z0;
    }

    public final void t(boolean z, boolean z2) {
        float f;
        if (this.A0 == z) {
            return;
        }
        this.C0 = System.currentTimeMillis();
        this.A0 = z;
        if (!z2) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.B0 = f;
        }
        invalidate();
    }

    public final void u(int i, int i2, int i3) {
        this.I0 = true;
        Drawable drawable = getContext().getResources().getDrawable(2131232699);
        Rect rect = this.j1;
        drawable.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.J0 = i;
        this.K0 = i2;
        this.h0.setColor(i2);
        this.L0 = i3;
        this.i0.setColor(i3);
        invalidate();
    }

    public final void v(boolean z, boolean z2) {
        if (this.h1 != z) {
            this.h1 = z;
            int i = 0;
            ArrayList arrayList = this.g1;
            if (z) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    super.removeTextChangedListener((TextWatcher) obj);
                }
                return;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                TextWatcher textWatcher = (TextWatcher) obj2;
                super.addTextChangedListener(textWatcher);
                if (z2) {
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
        q19[] q19VarArr = (q19[]) text.getSpans(getSelectionStart(), getSelectionEnd(), q19.class);
        if (q19VarArr != null && q19VarArr.length != 0) {
            return false;
        }
        return true;
    }

    public final void x(Canvas canvas, Rect rect) {
        if (!this.o1) {
            this.p1 = Float.NaN;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Float.isNaN(this.p1)) {
            this.p1 = rect.left;
            this.q1 = rect.top;
        } else {
            float exp = 1.0f - ((float) Math.exp(((float) (-Math.min(64L, uptimeMillis - this.r1))) / 60.0f));
            float f = this.p1;
            float f2 = rect.left;
            float A = qd4.A(f2, f, exp, f);
            this.p1 = A;
            float f3 = this.q1;
            this.q1 = qd4.A(rect.top, f3, exp, f3);
            if (Math.abs(f2 - A) < 0.5f && Math.abs(rect.top - this.q1) < 0.5f) {
                this.p1 = rect.left;
                this.q1 = rect.top;
            } else {
                postInvalidateOnAnimation();
            }
        }
        this.r1 = uptimeMillis;
        canvas.translate(this.p1 - rect.left, this.q1 - rect.top);
    }

    public final void y() {
        int selectionStart;
        int i;
        int i2;
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
        Rect rect = this.s1;
        if (rect == null) {
            rect = new Rect();
            this.s1 = rect;
        }
        GradientDrawable gradientDrawable = this.c0;
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(rect);
            i = gradientDrawable.getIntrinsicWidth();
        } else {
            rect.setEmpty();
            i = 0;
        }
        int scrollX = getScrollX();
        float f = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f2 = width;
        if (f >= f2 - 1.0f) {
            i2 = (width + scrollX) - (i - this.s1.right);
        } else if (Math.abs(f) > 1.0f && (!TextUtils.isEmpty(getText()) || 1048576 - scrollX > f2 + 1.0f || max > 1.0f)) {
            i2 = ((int) max) - this.s1.left;
        } else {
            i2 = scrollX - this.s1.left;
        }
        int L = hl.L(this.F0);
        Rect rect2 = this.s1;
        gradientDrawable.setBounds(i2, lineTop - rect2.top, L + i2, lineTop2 + rect2.bottom);
        layout.getText();
    }

    public final Drawable z(Drawable drawable, boolean z) {
        if (drawable != null) {
            if (z) {
                drawable = drawable.mutate();
            }
            PorterDuffColorFilter porterDuffColorFilter = this.x1;
            if (porterDuffColorFilter != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
        }
        return drawable;
    }

    @Override
    public void setSelection(int i) {
        try {
            super.setSelection(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void o(ActionMode actionMode, Menu menu) {
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        if (this.b1 == null && this.c1 == null) {
            return super.startActionMode(callback, i);
        }
        return startActionMode(callback);
    }
}
