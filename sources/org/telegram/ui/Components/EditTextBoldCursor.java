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
public class EditTextBoldCursor extends bt {
    public static Field A1;
    public static Field B1;
    public static boolean C1;
    public static Method D1;
    public static Class E1;
    public static Field F1;
    public static Method G1;
    public static Field f31400z1;
    public boolean A0;
    public float B0;
    public long C0;
    public boolean D0;
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
    public org.telegram.ui.ActionBar.k4 Y0;
    public org.telegram.ui.ActionBar.u3 Z0;
    public pk f31401a1;
    public Object f31402b0;
    public View f31403b1;
    public final GradientDrawable f31404c0;
    public View f31405c1;
    public hw0 f31406d0;
    public int f31407d1;
    public float f31408e0;
    public boolean f31409e1;
    public final s5 f31410f0;
    public final ss f31411f1;
    public final Paint f31412g0;
    public final ArrayList f31413g1;
    public final Paint f31414h0;
    public boolean f31415h1;
    public final TextPaint f31416i0;
    public int f31417i1;
    public int f31418j0;
    public final Rect f31419j1;
    public int f31420k0;
    public int k1;
    public int f31421l0;
    public int f31422l1;
    public int m0;
    public Rect m1;
    public float f31423n0;
    public eh.c f31424n1;
    public final Rect f31425o0;
    public Drawable f31426o1;
    public StaticLayout f31427p0;
    public Drawable f31428p1;
    public float f31429q0;
    public Drawable f31430q1;
    public boolean f31431r0;
    public PorterDuffColorFilter f31432r1;
    public boolean f31433s0;
    public int f31434s1;
    public ai.c f31435t0;
    public Runnable f31436t1;
    public rs f31437u0;
    public boolean f31438u1;
    public rs f31439v0;
    public Paint f31440v1;
    public CharSequence f31441w0;
    public LinearGradient f31442w1;
    public CharSequence f31443x0;
    public Matrix f31444x1;
    public int f31445y0;
    public int f31446y1;
    public int f31447z0;

    public EditTextBoldCursor(Context context) {
        super(context, null, 0, 2131755179);
        String str;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        this.f32382a = arrayList;
        this.f32383b = new Stack();
        this.f32384c = new ArrayList();
        this.f32385e = true;
        this.f32387n = new Path();
        this.H = true;
        this.I = null;
        this.K = new zs(this, 0);
        this.L = new Rect();
        if (bt.f32381a0 == null) {
            String str2 = Build.MANUFACTURER;
            if ((str2 != null && (str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps") || str2.toLowerCase().contains("vivo"))) || ((str = Build.MODEL) != null && str.toLowerCase().contains("mediapad"))) {
                z10 = false;
            } else {
                z10 = true;
            }
            bt.f32381a0 = Boolean.valueOf(z10);
        }
        this.Q = bt.f32381a0.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f32386f = new df.c(this, arrayList, new at(this));
        }
        this.f31410f0 = new s5(this, 1);
        this.f31425o0 = new Rect();
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
        this.f31413g1 = new ArrayList();
        this.f31415h1 = false;
        this.f31419j1 = new Rect();
        this.k1 = -1;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            setImportantForAutofill(2);
        }
        this.f31412g0 = new Paint();
        this.f31414h0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.f31416i0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
        if (i3 >= 26) {
            setImportantForAutofill(2);
        }
        if (i3 >= 29) {
            ss ssVar = new ss(this);
            this.f31411f1 = ssVar;
            ssVar.setShape(new RectShape());
            this.f31404c0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.f31411f1);
        }
        try {
            if (!C1 && B1 == null) {
                C1 = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                B1 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (E1 == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                f31400z1 = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                E1 = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    A1 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = E1.getDeclaredMethod("invalidateTextDisplayList", null);
                    G1 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                D1 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        if (this.f31411f1 == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.f31404c0 = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.f31402b0 = f31400z1.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (F1 == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    F1 = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = F1;
                if (field != null) {
                    field.set(this, 2131231069);
                }
            } catch (Throwable unused5) {
            }
        }
        this.f31418j0 = org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.f31413g1.add(textWatcher);
        if (this.f31415h1) {
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
        return this.f31417i1;
    }

    public int getErrorLineColor() {
        return this.L0;
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i3 = this.f31421l0;
        if (i3 != 0) {
            this.f31421l0 = i3 - 1;
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
        int i3 = this.f31420k0;
        if (i3 != 0) {
            this.f31420k0 = i3 - 1;
            return 0;
        }
        return super.getExtendedPaddingTop();
    }

    public int getHandlesColor() {
        return this.f31434s1;
    }

    public float getHeaderAnimationProgress() {
        return this.X0;
    }

    public int getHeaderHintColor() {
        return this.f31447z0;
    }

    public int getHintColor() {
        return this.f31445y0;
    }

    public Layout getHintLayoutEx() {
        return this.f31427p0;
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
        return this.f31436t1;
    }

    public org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        return null;
    }

    @Override
    public Drawable getTextCursorDrawable() {
        if (this.f31411f1 != null) {
            return super.getTextCursorDrawable();
        }
        ss ssVar = new ss(this, new RectShape());
        ssVar.getPaint().setColor(0);
        return ssVar;
    }

    @Override
    public Drawable getTextSelectHandle() {
        if (this.f31430q1 == null) {
            this.f31430q1 = y(super.getTextSelectHandle(), true);
        }
        return this.f31430q1;
    }

    @Override
    public Drawable getTextSelectHandleLeft() {
        if (this.f31426o1 == null) {
            this.f31426o1 = y(super.getTextSelectHandleLeft(), true);
        }
        return this.f31426o1;
    }

    @Override
    public Drawable getTextSelectHandleRight() {
        if (this.f31428p1 == null) {
            this.f31428p1 = y(super.getTextSelectHandleRight(), true);
        }
        return this.f31428p1;
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
                this.W0.setInterpolator(xq.h);
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
        org.telegram.ui.ActionBar.k4 k4Var = this.Y0;
        if (k4Var != null) {
            k4Var.f27767a.removeOnLayoutChangeListener(k4Var.f27776l);
            org.telegram.ui.ActionBar.i4 i4Var = k4Var.f27768b;
            if (!i4Var.F) {
                i4Var.G = false;
                i4Var.F = true;
                i4Var.f27628x.cancel();
                i4Var.f27627w.start();
                i4Var.D.setEmpty();
            }
            this.Y0 = null;
        }
        if (this.f31401a1 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f31401a1);
            this.f31401a1 = null;
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
        this.f31405c1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            cg.j.d().b(this.f31410f0, 2);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31405c1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            cg.j.d().g(this.f31410f0);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.EditTextBoldCursor.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onFocusChanged(boolean z10, int i3, Rect rect) {
        try {
            super.onFocusChanged(z10, i3, rect);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        l(true);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.f31427p0 != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.f31427p0.getText());
            } else {
                new s0.d(accessibilityNodeInfo).l(this.f31427p0.getText());
            }
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        rs rsVar = this.f31437u0;
        if (rsVar != null) {
            rsVar.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        rs rsVar2 = this.f31439v0;
        if (rsVar2 != null) {
            rsVar2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.f31427p0;
        if (staticLayout != null && this.f31437u0 == null) {
            if (this.f31407d1 != measuredHeight) {
                s(this.f31441w0, false, staticLayout.getPaint());
            }
            if (this.f31431r0) {
                this.M0 = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.f31427p0.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.f31427p0.getHeight()) - org.telegram.messenger.g0.L(1.0f);
            } else {
                this.M0 = ((getMeasuredHeight() - this.f31427p0.getHeight()) / 2.0f) + this.f31427p0.getHeight() + org.telegram.messenger.g0.L(6.0f);
            }
        } else {
            this.M0 = getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        }
        this.f31407d1 = measuredHeight;
    }

    @Override
    public void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        if (i3 != i11) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
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

    public final StaticLayout p(int i3) {
        if (TextUtils.isEmpty(this.f31443x0)) {
            return null;
        }
        return new StaticLayout(this.f31443x0, this.f31416i0, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final boolean postDelayed(Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT >= 29 && runnable != null && j10 == 500 && "android.widget.Editor$Blink".equals(runnable.getClass().getName()) && Looper.myLooper() == Looper.getMainLooper()) {
            cg.j d = cg.j.d();
            d.getClass();
            cg.j.c();
            int max = Math.max(1, Math.min(2, 60));
            d.h(runnable);
            cg.i e10 = d.e(max);
            if (e10.d == null) {
                e10.d = new ue.b();
            }
            e10.d.add(runnable);
            return true;
        }
        return super.postDelayed(runnable, j10);
    }

    public final void q() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (G1 != null) {
                    if (this.f31402b0 == null) {
                        this.f31402b0 = f31400z1.get(this);
                    }
                    Object obj = this.f31402b0;
                    if (obj != null) {
                        G1.invoke(obj, null);
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
            cg.j.d().h(runnable);
        }
        return super.removeCallbacks(runnable);
    }

    @Override
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        this.f31413g1.remove(textWatcher);
        if (this.f31415h1) {
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
        rs rsVar = this.f31437u0;
        if (rsVar != null) {
            rsVar.t(charSequence4, !org.telegram.messenger.bd.f21784a0, true);
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
            if (this.f31406d0 == null) {
                this.f31406d0 = new hw0(this);
            }
            hw0 hw0Var = this.f31406d0;
            StaticLayout staticLayout = this.f31427p0;
            CharSequence charSequence6 = this.f31441w0;
            hw0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = hw0Var.f34529j;
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
                        spannableStringBuilder2.setSpan(new fy(false), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new fy(false), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new fy(false), indexOf, charSequence3.length() + indexOf, 0);
                    int L = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    hw0Var.f34523b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
                    hw0Var.d = staticLayout2;
                    hw0Var.f34525e = true;
                    hw0Var.f34526f = z12;
                    if (indexOf == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = -staticLayout2.getPrimaryHorizontal(indexOf);
                    }
                    hw0Var.h = f10;
                    hw0Var.f34524c = null;
                    hw0Var.f34527g = false;
                } else {
                    int L2 = org.telegram.messenger.g0.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    hw0Var.f34523b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    hw0Var.f34524c = new StaticLayout(charSequence6, textPaint, org.telegram.messenger.g0.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    hw0Var.d = null;
                    hw0Var.f34525e = true;
                    hw0Var.f34527g = true;
                    hw0Var.h = 0.0f;
                }
                hw0Var.f34528i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                hw0Var.f34529j = ofFloat;
                ofFloat.addUpdateListener(new y50(hw0Var, 25));
                hw0Var.f34529j.addListener(new a60(hw0Var, 27));
                hw0Var.f34529j.setDuration(150L);
                hw0Var.f34529j.setInterpolator(xq.f40452f);
                hw0Var.f34529j.start();
            }
        } else {
            hw0 hw0Var2 = this.f31406d0;
            if (hw0Var2 != null) {
                ValueAnimator valueAnimator2 = hw0Var2.f34529j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                hw0Var2.f34525e = false;
            }
        }
        this.f31441w0 = charSequence5;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequence5 = TextUtils.ellipsize(charSequence5, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.f31427p0;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequence5)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.f31427p0 = new StaticLayout(charSequence5, textPaint2, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setActiveLineColor(int i3) {
        this.K0 = i3;
        this.f31414h0.setColor(i3);
        invalidate();
    }

    public void setAllowDrawCursor(boolean z10) {
        this.D0 = z10;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(eh.c cVar) {
        this.f31424n1 = cVar;
    }

    public void setCursorColor(int i3) {
        this.f31417i1 = i3;
        ss ssVar = this.f31411f1;
        if (ssVar != null) {
            ssVar.getPaint().setColor(i3);
        }
        GradientDrawable gradientDrawable = this.f31404c0;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i3);
        }
        invalidate();
    }

    public void setCursorSize(int i3) {
        this.f31418j0 = i3;
    }

    public void setCursorWidth(float f10) {
        this.F0 = f10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f31438u1 = z10;
        if (z10) {
            this.f31446y1 = org.telegram.messenger.g0.L(12.0f);
            this.f31440v1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f31446y1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.f31442w1 = linearGradient;
            this.f31440v1.setShader(linearGradient);
            this.f31444x1 = new Matrix();
        }
    }

    public void setErrorLineColor(int i3) {
        this.L0 = i3;
        this.f31416i0.setColor(i3);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f31443x0)) {
            return;
        }
        this.f31443x0 = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z10) {
        this.E0 = z10;
        invalidate();
    }

    public void setHandlesColor(int i3) {
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.sr.i() && this.f31434s1 != i3) {
            this.f31434s1 = i3;
            this.f31432r1 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
            y(this.f31426o1, false);
            y(this.f31428p1, false);
            y(this.f31430q1, false);
        }
    }

    public void setHeaderAnimationProgress(float f10) {
        this.X0 = f10;
        invalidate();
    }

    public void setHeaderHintColor(int i3) {
        this.f31447z0 = i3;
        invalidate();
    }

    public void setHintColor(int i3) {
        this.f31445y0 = i3;
        rs rsVar = this.f31437u0;
        if (rsVar != null) {
            rsVar.u(i3);
        }
        rs rsVar2 = this.f31439v0;
        if (rsVar2 != null) {
            rsVar2.u(this.f31445y0);
        }
        invalidate();
    }

    public void setHintRightOffset(int i3) {
        float f10 = i3;
        if (this.f31408e0 == f10) {
            return;
        }
        this.f31408e0 = f10;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        s(charSequence, false, getPaint());
    }

    public void setLineColor(int i3) {
        this.J0 = i3;
        invalidate();
    }

    @Override
    public final void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.f31423n0 = f10;
    }

    public void setNextSetTextAnimated(boolean z10) {
        this.S0 = z10;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.f31436t1 = runnable;
    }

    @Override
    public final void setSelection(int i3, int i10) {
        try {
            super.setSelection(i3, i10);
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
        Drawable y9 = y(drawable, true);
        this.f31430q1 = y9;
        super.setTextSelectHandle(y9);
    }

    @Override
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable y9 = y(drawable, true);
        this.f31426o1 = y9;
        super.setTextSelectHandleLeft(y9);
    }

    @Override
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable y9 = y(drawable, true);
        this.f31428p1 = y9;
        super.setTextSelectHandleRight(y9);
    }

    @Override
    public void setTextSize(int i3, float f10) {
        rs rsVar = this.f31437u0;
        if (rsVar != null) {
            rsVar.w(org.telegram.messenger.g0.L(f10));
        }
        rs rsVar2 = this.f31439v0;
        if (rsVar2 != null) {
            rsVar2.w(org.telegram.messenger.g0.L(f10));
        }
        super.setTextSize(i3, f10);
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
        this.f31403b1 = view;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (this.f31403b1 == null && this.f31405c1 == null) {
            return super.startActionMode(callback);
        }
        org.telegram.ui.ActionBar.u3 u3Var = this.Z0;
        if (u3Var != null) {
            u3Var.finish();
        }
        m();
        Context context = getContext();
        View view = this.f31403b1;
        if (view == null) {
            view = this.f31405c1;
        }
        org.telegram.ui.ActionBar.k4 k4Var = new org.telegram.ui.ActionBar.k4(context, view, getActionModeStyle(), getResourcesProvider(), this.f31424n1);
        this.Y0 = k4Var;
        k4Var.f27774j = this.f31436t1;
        k4Var.f27775k = new qs(this, 0);
        org.telegram.ui.ActionBar.u3 u3Var2 = new org.telegram.ui.ActionBar.u3(getContext(), new org.telegram.ui.Cells.f9(this, callback), this, this.Y0);
        this.Z0 = u3Var2;
        this.f31401a1 = new pk(1, this);
        callback.onCreateActionMode(u3Var2, u3Var2.f28677c);
        org.telegram.ui.ActionBar.u3 u3Var3 = this.Z0;
        o(u3Var3, u3Var3.f28677c);
        this.Z0.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.f31401a1);
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

    public final void u(int i3, int i10, int i11) {
        this.I0 = true;
        Drawable drawable = getContext().getResources().getDrawable(2131232681);
        Rect rect = this.f31419j1;
        drawable.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.J0 = i3;
        this.K0 = i10;
        this.f31414h0.setColor(i10);
        this.L0 = i11;
        this.f31416i0.setColor(i11);
        invalidate();
    }

    public final void v(boolean z10, boolean z11) {
        if (this.f31415h1 != z10) {
            this.f31415h1 = z10;
            ArrayList arrayList = this.f31413g1;
            int i3 = 0;
            if (z10) {
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
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
        wg0[] wg0VarArr = (wg0[]) text.getSpans(getSelectionStart(), getSelectionEnd(), wg0.class);
        if (wg0VarArr != null && wg0VarArr.length != 0) {
            return false;
        }
        return true;
    }

    public final void x() {
        int selectionStart;
        int i3;
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
        if (this.m1 == null) {
            this.m1 = new Rect();
        }
        GradientDrawable gradientDrawable = this.f31404c0;
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.m1);
            i3 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.m1.setEmpty();
            i3 = 0;
        }
        int scrollX = getScrollX();
        float f10 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f11 = width;
        if (f10 >= f11 - 1.0f) {
            i10 = (width + scrollX) - (i3 - this.m1.right);
        } else if (Math.abs(f10) > 1.0f && (!TextUtils.isEmpty(getText()) || 1048576 - scrollX > f11 + 1.0f || max > 1.0f)) {
            i10 = ((int) max) - this.m1.left;
        } else {
            i10 = scrollX - this.m1.left;
        }
        int L = org.telegram.messenger.g0.L(this.F0);
        Rect rect = this.m1;
        this.f31404c0.setBounds(i10, lineTop - rect.top, L + i10, lineTop2 + rect.bottom);
        layout.getText();
    }

    public final Drawable y(Drawable drawable, boolean z10) {
        if (drawable != null) {
            if (z10) {
                drawable = drawable.mutate();
            }
            PorterDuffColorFilter porterDuffColorFilter = this.f31432r1;
            if (porterDuffColorFilter != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
        }
        return drawable;
    }

    @Override
    public void setSelection(int i3) {
        try {
            super.setSelection(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i3) {
        if (this.f31403b1 == null && this.f31405c1 == null) {
            return super.startActionMode(callback, i3);
        }
        return startActionMode(callback);
    }

    public void o(ActionMode actionMode, Menu menu) {
    }
}
