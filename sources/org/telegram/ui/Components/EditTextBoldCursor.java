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
public class EditTextBoldCursor extends dt {
    public static Field A1;
    public static boolean B1;
    public static Method C1;
    public static Class D1;
    public static Field E1;
    public static Method F1;
    public static Field f31328y1;
    public static Field f31329z1;
    public float A0;
    public long B0;
    public boolean C0;
    public boolean D0;
    public float E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public float L0;
    public boolean M0;
    public float N0;
    public long O0;
    public float P0;
    public float Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public AnimatorSet V0;
    public float W0;
    public org.telegram.ui.ActionBar.k4 X0;
    public org.telegram.ui.ActionBar.w3 Y0;
    public rk Z0;
    public Object f31330a0;
    public View f31331a1;
    public final GradientDrawable f31332b0;
    public View f31333b1;
    public iw0 f31334c0;
    public int f31335c1;
    public float f31336d0;
    public boolean f31337d1;
    public final u5 f31338e0;
    public final ss f31339e1;
    public final Paint f31340f0;
    public final ArrayList f31341f1;
    public final Paint f31342g0;
    public boolean f31343g1;
    public final TextPaint f31344h0;
    public int f31345h1;
    public int f31346i0;
    public final Rect f31347i1;
    public int f31348j0;
    public int f31349j1;
    public int f31350k0;
    public int f31351k1;
    public int f31352l0;
    public Rect l1;
    public float m0;
    public dh.c f31353m1;
    public final Rect f31354n0;
    public Drawable n1;
    public StaticLayout f31355o0;
    public Drawable f31356o1;
    public float f31357p0;
    public Drawable f31358p1;
    public boolean f31359q0;
    public PorterDuffColorFilter f31360q1;
    public boolean f31361r0;
    public int f31362r1;
    public ai.e f31363s0;
    public Runnable f31364s1;
    public rs f31365t0;
    public boolean f31366t1;
    public rs f31367u0;
    public Paint f31368u1;
    public CharSequence f31369v0;
    public LinearGradient f31370v1;
    public CharSequence f31371w0;
    public Matrix f31372w1;
    public int f31373x0;
    public int f31374x1;
    public int f31375y0;
    public boolean f31376z0;

    public EditTextBoldCursor(Context context) {
        super(context, null, 0, 2131755179);
        String str;
        boolean z9;
        ArrayList arrayList = new ArrayList();
        this.f33080a = arrayList;
        this.f33081b = new Stack();
        this.f33082c = new ArrayList();
        this.f33083e = true;
        this.f33085n = new Path();
        this.G = true;
        this.H = null;
        this.J = new bt(this, 0);
        this.K = new Rect();
        if (dt.W == null) {
            String str2 = Build.MANUFACTURER;
            if ((str2 != null && (str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps") || str2.toLowerCase().contains("vivo"))) || ((str = Build.MODEL) != null && str.toLowerCase().contains("mediapad"))) {
                z9 = false;
            } else {
                z9 = true;
            }
            dt.W = Boolean.valueOf(z9);
        }
        this.P = dt.W.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f33084f = new gf.c(this, arrayList, new ct(this));
        }
        this.f31338e0 = new u5(this, 1);
        this.f31354n0 = new Rect();
        this.f31376z0 = true;
        this.A0 = 1.0f;
        this.C0 = true;
        this.D0 = false;
        this.E0 = 2.0f;
        this.H0 = false;
        this.M0 = false;
        this.N0 = 0.0f;
        this.P0 = 0.0f;
        this.Q0 = 0.0f;
        this.T0 = true;
        this.f31341f1 = new ArrayList();
        this.f31343g1 = false;
        this.f31347i1 = new Rect();
        this.f31349j1 = -1;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            setImportantForAutofill(2);
        }
        this.f31340f0 = new Paint();
        this.f31342g0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.f31344h0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (i7 >= 26) {
            setImportantForAutofill(2);
        }
        if (i7 >= 29) {
            ss ssVar = new ss(this);
            this.f31339e1 = ssVar;
            ssVar.setShape(new RectShape());
            this.f31332b0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.f31339e1);
        }
        try {
            if (!B1 && A1 == null) {
                B1 = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                A1 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (D1 == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                f31328y1 = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                D1 = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    f31329z1 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = D1.getDeclaredMethod("invalidateTextDisplayList", null);
                    F1 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                C1 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        if (this.f31339e1 == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.f31332b0 = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.f31330a0 = f31328y1.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (E1 == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    E1 = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = E1;
                if (field != null) {
                    field.set(this, 2131231069);
                }
            } catch (Throwable unused5) {
            }
        }
        this.f31346i0 = org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.f31341f1.add(textWatcher);
        if (this.f31343g1) {
            return;
        }
        super.addTextChangedListener(textWatcher);
    }

    public int getActionModeStyle() {
        return 1;
    }

    public int getActiveLineColor() {
        return this.J0;
    }

    @Override
    public int getAutofillType() {
        return 0;
    }

    public int getCursorColor() {
        return this.f31345h1;
    }

    public int getErrorLineColor() {
        return this.K0;
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i7 = this.f31350k0;
        if (i7 != 0) {
            this.f31350k0 = i7 - 1;
            int i10 = this.f31352l0;
            if (i10 != Integer.MAX_VALUE) {
                return -i10;
            }
            return 0;
        }
        return super.getExtendedPaddingBottom();
    }

    @Override
    public int getExtendedPaddingTop() {
        int i7 = this.f31348j0;
        if (i7 != 0) {
            this.f31348j0 = i7 - 1;
            return 0;
        }
        return super.getExtendedPaddingTop();
    }

    public int getHandlesColor() {
        return this.f31362r1;
    }

    public float getHeaderAnimationProgress() {
        return this.W0;
    }

    public int getHeaderHintColor() {
        return this.f31375y0;
    }

    public int getHintColor() {
        return this.f31373x0;
    }

    public Layout getHintLayoutEx() {
        return this.f31355o0;
    }

    public int getLineColor() {
        return this.I0;
    }

    @Override
    public float getLineSpacingExtra() {
        return super.getLineSpacingExtra();
    }

    public float getLineY() {
        return this.L0;
    }

    public Runnable getOnPremiumMenuLockClickListener() {
        return this.f31364s1;
    }

    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return null;
    }

    @Override
    public Drawable getTextCursorDrawable() {
        if (this.f31339e1 != null) {
            return super.getTextCursorDrawable();
        }
        ss ssVar = new ss(this, new RectShape());
        ssVar.getPaint().setColor(0);
        return ssVar;
    }

    @Override
    public Drawable getTextSelectHandle() {
        if (this.f31358p1 == null) {
            this.f31358p1 = y(super.getTextSelectHandle(), true);
        }
        return this.f31358p1;
    }

    @Override
    public Drawable getTextSelectHandleLeft() {
        if (this.n1 == null) {
            this.n1 = y(super.getTextSelectHandleLeft(), true);
        }
        return this.n1;
    }

    @Override
    public Drawable getTextSelectHandleRight() {
        if (this.f31356o1 == null) {
            this.f31356o1 = y(super.getTextSelectHandleRight(), true);
        }
        return this.f31356o1;
    }

    public final void l(boolean z9) {
        boolean z10;
        if (this.S0 && (getText().length() > 0 || (this.T0 && isFocused()))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.U0 != z10) {
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            this.U0 = z10;
            float f10 = 0.0f;
            if (z9) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V0 = animatorSet2;
                if (z10) {
                    f10 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", f10));
                this.V0.setDuration(200L);
                this.V0.setInterpolator(xq.h);
                this.V0.start();
            } else {
                if (z10) {
                    f10 = 1.0f;
                }
                this.W0 = f10;
            }
            invalidate();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.k4 k4Var = this.X0;
        if (k4Var != null) {
            k4Var.f27739a.removeOnLayoutChangeListener(k4Var.f27748l);
            org.telegram.ui.ActionBar.i4 i4Var = k4Var.f27740b;
            if (!i4Var.F) {
                i4Var.G = false;
                i4Var.F = true;
                i4Var.f27587x.cancel();
                i4Var.f27586w.start();
                i4Var.D.setEmpty();
            }
            this.X0 = null;
        }
        if (this.Z0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.Z0);
            this.Z0 = null;
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
        this.f31333b1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            bg.k.d().b(this.f31338e0, 2);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31333b1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            bg.k.d().g(this.f31338e0);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.EditTextBoldCursor.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onFocusChanged(boolean z9, int i7, Rect rect) {
        try {
            super.onFocusChanged(z9, i7, rect);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        l(true);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.f31355o0 != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.f31355o0.getText());
            } else {
                new s0.d(accessibilityNodeInfo).l(this.f31355o0.getText());
            }
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        rs rsVar = this.f31365t0;
        if (rsVar != null) {
            rsVar.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        rs rsVar2 = this.f31367u0;
        if (rsVar2 != null) {
            rsVar2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.f31355o0;
        if (staticLayout != null && this.f31365t0 == null) {
            if (this.f31335c1 != measuredHeight) {
                s(this.f31369v0, false, staticLayout.getPaint());
            }
            if (this.f31359q0) {
                this.L0 = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.f31355o0.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.f31355o0.getHeight()) - org.telegram.messenger.g0.L(1.0f);
            } else {
                this.L0 = ((getMeasuredHeight() - this.f31355o0.getHeight()) / 2.0f) + this.f31355o0.getHeight() + org.telegram.messenger.g0.L(6.0f);
            }
        } else {
            this.L0 = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        }
        this.f31335c1 = measuredHeight;
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
        if (this.S0 && !this.T0) {
            l(true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f31349j1 = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final StaticLayout p(int i7) {
        if (TextUtils.isEmpty(this.f31371w0)) {
            return null;
        }
        return new StaticLayout(this.f31371w0, this.f31344h0, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                if (F1 != null) {
                    if (this.f31330a0 == null) {
                        this.f31330a0 = f31328y1.get(this);
                    }
                    Object obj = this.f31330a0;
                    if (obj != null) {
                        F1.invoke(obj, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void r(CharSequence charSequence, boolean z9) {
        s(charSequence, z9, getPaint());
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
        this.f31341f1.remove(textWatcher);
        if (this.f31343g1) {
            return;
        }
        super.removeTextChangedListener(textWatcher);
    }

    public final void s(CharSequence charSequence, boolean z9, TextPaint textPaint) {
        boolean z10;
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z11;
        float f10;
        CharSequence charSequence4 = charSequence;
        rs rsVar = this.f31365t0;
        if (rsVar != null) {
            rsVar.t(charSequence4, !org.telegram.messenger.id.f23157a0, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        if (getMeasuredWidth() == 0) {
            z10 = false;
        } else {
            z10 = z9;
        }
        if (z10) {
            if (this.f31334c0 == null) {
                this.f31334c0 = new iw0(this);
            }
            iw0 iw0Var = this.f31334c0;
            StaticLayout staticLayout = this.f31355o0;
            CharSequence charSequence6 = this.f31369v0;
            iw0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = iw0Var.f34839j;
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
                        spannableStringBuilder2.setSpan(new iy(false), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new iy(false), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new iy(false), indexOf, charSequence3.length() + indexOf, 0);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    iw0Var.f34833b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
                    iw0Var.d = staticLayout2;
                    iw0Var.f34835e = true;
                    iw0Var.f34836f = z11;
                    if (indexOf == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -staticLayout2.getPrimaryHorizontal(indexOf);
                    }
                    iw0Var.h = f10;
                    iw0Var.f34834c = null;
                    iw0Var.f34837g = false;
                } else {
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    iw0Var.f34833b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    iw0Var.f34834c = new StaticLayout(charSequence6, textPaint, org.telegram.messenger.g0.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    iw0Var.d = null;
                    iw0Var.f34835e = true;
                    iw0Var.f34837g = true;
                    iw0Var.h = 0.0f;
                }
                iw0Var.f34838i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                iw0Var.f34839j = ofFloat;
                ofFloat.addUpdateListener(new c60(iw0Var, 24));
                iw0Var.f34839j.addListener(new e60(iw0Var, 27));
                iw0Var.f34839j.setDuration(150L);
                iw0Var.f34839j.setInterpolator(xq.f40366f);
                iw0Var.f34839j.start();
            }
        } else {
            iw0 iw0Var2 = this.f31334c0;
            if (iw0Var2 != null) {
                ValueAnimator valueAnimator2 = iw0Var2.f34839j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                iw0Var2.f34835e = false;
            }
        }
        this.f31369v0 = charSequence5;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequence5 = TextUtils.ellipsize(charSequence5, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.f31355o0;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequence5)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.f31355o0 = new StaticLayout(charSequence5, textPaint2, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setActiveLineColor(int i7) {
        this.J0 = i7;
        this.f31342g0.setColor(i7);
        invalidate();
    }

    public void setAllowDrawCursor(boolean z9) {
        this.C0 = z9;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(dh.c cVar) {
        this.f31353m1 = cVar;
    }

    public void setCursorColor(int i7) {
        this.f31345h1 = i7;
        ss ssVar = this.f31339e1;
        if (ssVar != null) {
            ssVar.getPaint().setColor(i7);
        }
        GradientDrawable gradientDrawable = this.f31332b0;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i7);
        }
        invalidate();
    }

    public void setCursorSize(int i7) {
        this.f31346i0 = i7;
    }

    public void setCursorWidth(float f10) {
        this.E0 = f10;
    }

    public void setEllipsizeByGradient(boolean z9) {
        this.f31366t1 = z9;
        if (z9) {
            this.f31374x1 = org.telegram.messenger.g0.L(12.0f);
            this.f31368u1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f31374x1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.f31370v1 = linearGradient;
            this.f31368u1.setShader(linearGradient);
            this.f31372w1 = new Matrix();
        }
    }

    public void setErrorLineColor(int i7) {
        this.K0 = i7;
        this.f31344h0.setColor(i7);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f31371w0)) {
            return;
        }
        this.f31371w0 = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z9) {
        this.D0 = z9;
        invalidate();
    }

    public void setHandlesColor(int i7) {
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.as.i() && this.f31362r1 != i7) {
            this.f31362r1 = i7;
            this.f31360q1 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            y(this.n1, false);
            y(this.f31356o1, false);
            y(this.f31358p1, false);
        }
    }

    public void setHeaderAnimationProgress(float f10) {
        this.W0 = f10;
        invalidate();
    }

    public void setHeaderHintColor(int i7) {
        this.f31375y0 = i7;
        invalidate();
    }

    public void setHintColor(int i7) {
        this.f31373x0 = i7;
        rs rsVar = this.f31365t0;
        if (rsVar != null) {
            rsVar.u(i7);
        }
        rs rsVar2 = this.f31367u0;
        if (rsVar2 != null) {
            rsVar2.u(this.f31373x0);
        }
        invalidate();
    }

    public void setHintRightOffset(int i7) {
        float f10 = i7;
        if (this.f31336d0 == f10) {
            return;
        }
        this.f31336d0 = f10;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        s(charSequence, false, getPaint());
    }

    public void setLineColor(int i7) {
        this.I0 = i7;
        invalidate();
    }

    @Override
    public final void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.m0 = f10;
    }

    public void setNextSetTextAnimated(boolean z9) {
        this.R0 = z9;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.f31364s1 = runnable;
    }

    @Override
    public final void setSelection(int i7, int i10) {
        try {
            super.setSelection(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void setSupportRtlHint(boolean z9) {
        this.F0 = z9;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        l(this.R0);
        this.R0 = false;
    }

    @Override
    public void setTextSelectHandle(Drawable drawable) {
        Drawable y10 = y(drawable, true);
        this.f31358p1 = y10;
        super.setTextSelectHandle(y10);
    }

    @Override
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable y10 = y(drawable, true);
        this.n1 = y10;
        super.setTextSelectHandleLeft(y10);
    }

    @Override
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable y10 = y(drawable, true);
        this.f31356o1 = y10;
        super.setTextSelectHandleRight(y10);
    }

    @Override
    public void setTextSize(int i7, float f10) {
        rs rsVar = this.f31365t0;
        if (rsVar != null) {
            rsVar.w(org.telegram.messenger.g0.L(f10));
        }
        rs rsVar2 = this.f31367u0;
        if (rsVar2 != null) {
            rsVar2.w(org.telegram.messenger.g0.L(f10));
        }
        super.setTextSize(i7, f10);
    }

    public void setTransformHintToHeader(boolean z9) {
        if (this.S0 != z9) {
            this.S0 = z9;
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z9) {
        if (this.T0 == z9) {
            return;
        }
        this.T0 = z9;
        l(false);
    }

    public void setWindowView(View view) {
        this.f31331a1 = view;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (this.f31331a1 == null && this.f31333b1 == null) {
            return super.startActionMode(callback);
        }
        org.telegram.ui.ActionBar.w3 w3Var = this.Y0;
        if (w3Var != null) {
            w3Var.finish();
        }
        m();
        Context context = getContext();
        View view = this.f31331a1;
        if (view == null) {
            view = this.f31333b1;
        }
        org.telegram.ui.ActionBar.k4 k4Var = new org.telegram.ui.ActionBar.k4(context, view, getActionModeStyle(), getResourcesProvider(), this.f31353m1);
        this.X0 = k4Var;
        k4Var.f27746j = this.f31364s1;
        k4Var.f27747k = new qs(this, 0);
        org.telegram.ui.ActionBar.w3 w3Var2 = new org.telegram.ui.ActionBar.w3(getContext(), new org.telegram.ui.Cells.g9(this, callback), this, this.X0);
        this.Y0 = w3Var2;
        this.Z0 = new rk(1, this);
        callback.onCreateActionMode(w3Var2, w3Var2.f28701c);
        org.telegram.ui.ActionBar.w3 w3Var3 = this.Y0;
        o(w3Var3, w3Var3.f28701c);
        this.Y0.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.Z0);
        invalidate();
        return this.Y0;
    }

    public final void t(boolean z9, boolean z10) {
        float f10;
        if (this.f31376z0 == z9) {
            return;
        }
        this.B0 = System.currentTimeMillis();
        this.f31376z0 = z9;
        if (!z10) {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.A0 = f10;
        }
        invalidate();
    }

    public final void u(int i7, int i10, int i11) {
        this.H0 = true;
        Drawable drawable = getContext().getResources().getDrawable(2131232683);
        Rect rect = this.f31347i1;
        drawable.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.I0 = i7;
        this.J0 = i10;
        this.f31342g0.setColor(i10);
        this.K0 = i11;
        this.f31344h0.setColor(i11);
        invalidate();
    }

    public final void v(boolean z9, boolean z10) {
        if (this.f31343g1 != z9) {
            this.f31343g1 = z9;
            ArrayList arrayList = this.f31341f1;
            int i7 = 0;
            if (z9) {
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
                if (z10) {
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
        tg0[] tg0VarArr = (tg0[]) text.getSpans(getSelectionStart(), getSelectionEnd(), tg0.class);
        if (tg0VarArr != null && tg0VarArr.length != 0) {
            return false;
        }
        return true;
    }

    public final void x() {
        int selectionStart;
        int i7;
        int i10;
        Layout layout = getLayout();
        if (this.D0) {
            selectionStart = layout.getText().length();
        } else {
            selectionStart = getSelectionStart();
        }
        int lineForOffset = layout.getLineForOffset(selectionStart);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float max = Math.max(0.5f, layout.getPrimaryHorizontal(selectionStart) - 0.5f);
        if (this.l1 == null) {
            this.l1 = new Rect();
        }
        GradientDrawable gradientDrawable = this.f31332b0;
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.l1);
            i7 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.l1.setEmpty();
            i7 = 0;
        }
        int scrollX = getScrollX();
        float f10 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        if (f10 >= f11 - 1.0f) {
            i10 = (width + scrollX) - (i7 - this.l1.right);
        } else if (Math.abs(f10) > 1.0f && (!TextUtils.isEmpty(getText()) || 1048576 - scrollX > f11 + 1.0f || max > 1.0f)) {
            i10 = ((int) max) - this.l1.left;
        } else {
            i10 = scrollX - this.l1.left;
        }
        int L = org.telegram.messenger.g0.L(this.E0);
        Rect rect = this.l1;
        this.f31332b0.setBounds(i10, lineTop - rect.top, L + i10, lineTop2 + rect.bottom);
        layout.getText();
    }

    public final Drawable y(Drawable drawable, boolean z9) {
        if (drawable != null) {
            if (z9) {
                drawable = drawable.mutate();
            }
            PorterDuffColorFilter porterDuffColorFilter = this.f31360q1;
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
        if (this.f31331a1 == null && this.f31333b1 == null) {
            return super.startActionMode(callback, i7);
        }
        return startActionMode(callback);
    }

    public void o(ActionMode actionMode, Menu menu) {
    }
}
