package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
public class a extends FrameLayout implements s84, snb, o27 {
    public boolean A0;
    public boolean A1;
    public CharSequence B0;
    public int B1;
    public boolean C0;
    public int C1;
    public boolean D0;
    public boolean D1;
    public boolean E;
    public boolean E0;
    public float E1;
    public s6 F;
    public boolean F0;
    public ValueAnimator F1;
    public u5 G;
    public b6 G0;
    public String H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final vnb K0;
    public boolean L;
    public wma L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public final Paint N0;
    public boolean O;
    public final Rect O0;
    public int P;
    public final vh4 P0;
    public AnimatorSet Q;
    public boolean Q0;
    public View[] R;
    public boolean R0;
    public boolean S;
    public boolean S0;
    public wna T;
    public f82 T0;
    public qj4 U;
    public boolean U0;
    public Paint.FontMetricsInt V;
    public ll0 V0;
    public boolean W;
    public ol0 W0;
    public ll0 X0;
    public pz4 Y0;
    public int Z0;
    public jl0 a;
    public Rect a0;
    public ula a1;
    public jl0 b;
    public int b0;
    public s7 b1;
    public jl0 c;
    public boolean c0;
    public final RectF c1;
    public final rk5 d;
    public CharSequence d0;
    public boolean d1;
    public ImageView e;
    public ul e0;
    public Runnable e1;
    public de0 f;
    public View.OnClickListener f0;
    public v59 f1;
    public String g0;
    public AnimatorSet g1;
    public Drawable h;
    public final Object[] h0;
    public int h1;
    public Runnable i0;
    public int i1;
    public boolean j0;
    public boolean j1;
    public Runnable k0;
    public boolean k1;
    public boolean l0;
    public float l1;
    public int m0;
    public final t84 m1;
    public final ema[] n;
    public boolean n0;
    public final fm0 n1;
    public boolean o0;
    public final t84 o1;
    public float p0;
    public final fm0 p1;
    public int q0;
    public int q1;
    public ema r;
    public int r0;
    public int r1;
    public ema s;
    public int s0;
    public boolean s1;
    public int t0;
    public boolean t1;
    public e u0;
    public boolean u1;
    public d6 v0;
    public boolean v1;
    public View w;
    public int w0;
    public boolean w1;
    public int x;
    public boolean x0;
    public int x1;
    public int y;
    public boolean y0;
    public c6 y1;
    public boolean z0;
    public boolean z1;

    public a(Context context, vnb vnbVar) {
        super(context);
        this.d = rk5.a;
        this.n = new ema[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.h0 = new Object[3];
        this.l0 = true;
        this.m0 = 255;
        this.w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new vh4(this);
        this.c1 = new RectF();
        k43 k43Var = k43.h;
        this.m1 = new t84(0, this, k43Var, 380L);
        this.n1 = new fm0(0, this, k43Var, 380L, false);
        this.o1 = new t84(0, this, k43Var, 320L);
        this.p1 = new fm0(0, this, k43Var, 320L, false);
        this.w1 = true;
        this.x1 = 255;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = vnbVar;
        setOnClickListener(new s5(this, (byte) 0));
    }

    public static int getCurrentActionBarHeight() {
        if (hl.O1()) {
            return hl.L(58.0f);
        }
        Point point = hl.q;
        if (point.x > point.y) {
            return hl.L(48.0f);
        }
        return hl.L(56.0f);
    }

    public static View x(a aVar, float f, float f2, View view) {
        for (int childCount = aVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = aVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f >= childAt.getX() && f <= childAt.getX() + childAt.getWidth() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean A(String str) {
        if (this.G != null && this.K) {
            String str2 = this.H;
            if (str2 == null) {
                if (str == null) {
                    return true;
                }
                return false;
            } else if (str2.equals(str)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean B() {
        return false;
    }

    public void C(boolean z) {
        float f;
        Property property;
        float f2;
        float f3;
        float f4;
        int i;
        this.o0 = z;
        n();
        AnimatorSet animatorSet = this.g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.g1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean B = B();
        if (!B) {
            ema emaVar = this.n[0];
            if (emaVar != null) {
                arrayList.add(emaVar);
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(this.r);
                ema emaVar2 = this.r;
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                emaVar2.setVisibility(i);
            }
        }
        float f5 = this.p0;
        float f6 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f);
        ofFloat.addUpdateListener(new r5(this, (byte) 2));
        this.g1.playTogether(ofFloat);
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i2 >= size) {
                break;
            }
            View view = (View) arrayList.get(i2);
            float f7 = 0.95f;
            if (!z) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            AnimatorSet animatorSet2 = this.g1;
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f3));
            AnimatorSet animatorSet3 = this.g1;
            if (z) {
                f4 = 0.95f;
            } else {
                f4 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f4));
            AnimatorSet animatorSet4 = this.g1;
            if (!z) {
                f7 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f7));
            i2++;
        }
        de0 de0Var = this.f;
        if (de0Var != null) {
            de0Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.g1;
            de0 de0Var2 = this.f;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(de0Var2, property, f2));
        }
        this.A0 = true;
        requestLayout();
        this.g1.addListener(new x5(this, arrayList, z, B));
        this.g1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof h27) {
                h27 h27Var = (h27) drawable;
                h27Var.h = true;
                if (z) {
                    f6 = 1.0f;
                }
                h27Var.a(true, f6);
            }
        }
    }

    public final void D() {
        s6 s6Var = this.F;
        int childCount = s6Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = s6Var.getChildAt(i);
            if (childAt instanceof s7) {
                s7 s7Var = (s7) childAt;
                if (s7Var.v()) {
                    s7Var.F();
                }
            }
        }
    }

    public final void E() {
        s6 s6Var = this.F;
        if (s6Var != null) {
            boolean z = this.o0;
            boolean z2 = !z;
            int childCount = s6Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = s6Var.getChildAt(i);
                if (childAt instanceof s7) {
                    s7 s7Var = (s7) childAt;
                    if (s7Var.v()) {
                        if (!z) {
                            s6Var.b.C(s7Var.T(z2));
                        }
                        s7Var.P("", false);
                        s7Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void F(RecyclerView recyclerView, int i, int i2) {
        float f;
        this.B1 = i;
        this.C1 = i2;
        this.A1 = hl.O1();
        ve2 ve2Var = new ve2(this, recyclerView, (byte) 19);
        recyclerView.j(new y(ve2Var, (byte) 1));
        if (this.z1) {
            ve2Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        if (!canScrollVertically) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.E1 = f;
        j();
    }

    public final void G(int i, boolean z) {
        ImageView imageView;
        if (z) {
            this.r0 = i;
            if (this.K && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(aob.f0(i, 1, -1));
            }
            u5 u5Var = this.G;
            if (u5Var != null) {
                u5Var.s();
                return;
            }
            return;
        }
        this.q0 = i;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(aob.f0(i, 1, -1));
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.s();
        }
    }

    public void H(int i, boolean z) {
        if (z) {
            this.t0 = i;
            u5 u5Var = this.G;
            if (u5Var != null) {
                u5Var.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof gd0) {
                    ((gd0) drawable).b(i);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.s0 = i;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof gd0) {
                    ((gd0) drawable2).a(i);
                } else if (drawable2 instanceof h27) {
                    ((h27) drawable2).j = i;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
            s6 s6Var = this.F;
            if (s6Var != null) {
                s6Var.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 != null && this.d1) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void I(int i, boolean z) {
        int i2 = 0;
        if (z) {
            u5 u5Var = this.G;
            if (u5Var != null) {
                int childCount = u5Var.getChildCount();
                while (i2 < childCount) {
                    View childAt = u5Var.getChildAt(i2);
                    if (childAt instanceof s7) {
                        ((s7) childAt).I(i);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            int childCount2 = s6Var.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = s6Var.getChildAt(i2);
                if (childAt2 instanceof s7) {
                    ((s7) childAt2).I(i);
                }
                i2++;
            }
        }
    }

    public final void J(int i, boolean z, boolean z2) {
        int i2 = 0;
        if (z2) {
            u5 u5Var = this.G;
            if (u5Var != null) {
                int childCount = u5Var.getChildCount();
                while (i2 < childCount) {
                    View childAt = u5Var.getChildAt(i2);
                    if (childAt instanceof s7) {
                        ((s7) childAt).O(i, z);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            int childCount2 = s6Var.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = s6Var.getChildAt(i2);
                if (childAt2 instanceof s7) {
                    ((s7) childAt2).O(i, z);
                }
                i2++;
            }
        }
    }

    public final void K(int i, boolean z) {
        if (z) {
            u5 u5Var = this.G;
            if (u5Var != null) {
                u5Var.setPopupItemsSelectorColor(i);
                return;
            }
            return;
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setPopupItemsSelectorColor(i);
        }
    }

    public final void L(int i, boolean z) {
        s6 s6Var = this.F;
        if (s6Var != null) {
            int childCount = s6Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = s6Var.getChildAt(i2);
                if (childAt instanceof s7) {
                    s7 s7Var = (s7) childAt;
                    if (s7Var.v()) {
                        if (z) {
                            s7Var.getSearchField().setHintTextColor(i);
                            return;
                        } else {
                            s7Var.getSearchField().setTextColor(i);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void M(CharSequence charSequence, ul ulVar) {
        int i;
        ema[] emaVarArr = this.n;
        if (charSequence != null && emaVarArr[0] == null) {
            w(0);
        }
        ema emaVar = emaVarArr[0];
        if (emaVar != null) {
            if (charSequence != null && !this.o0) {
                i = 0;
            } else {
                i = 4;
            }
            emaVar.setVisibility(i);
            ema emaVar2 = emaVarArr[0];
            this.d0 = charSequence;
            emaVar2.k(charSequence);
            if (this.D0) {
                ul ulVar2 = this.e0;
                if (ik8.A(ulVar2)) {
                    ulVar2.l(null);
                }
            }
            ema emaVar3 = emaVarArr[0];
            this.e0 = ulVar;
            emaVar3.i(ulVar);
            if (this.D0) {
                ul ulVar3 = this.e0;
                if (ik8.A(ulVar3)) {
                    ulVar3.l(emaVarArr[0]);
                }
            }
            emaVarArr[0].setRightDrawableOnClick(this.f0);
        }
        this.z0 = false;
    }

    public final void N(CharSequence charSequence, boolean z, long j, k43 k43Var) {
        boolean z2;
        float f;
        ema[] emaVarArr = this.n;
        if (emaVarArr[0] != null && charSequence != null) {
            if (this.x0 && !TextUtils.isEmpty(this.B0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.r.getVisibility() != 0) {
                    this.r.setVisibility(0);
                    this.r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.r.animate();
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                ik8.s(animate, f, 220L);
            }
            ema emaVar = emaVarArr[1];
            if (emaVar != null) {
                if (emaVar.getParent() != null) {
                    ((ViewGroup) emaVarArr[1].getParent()).removeView(emaVarArr[1]);
                }
                emaVarArr[1] = null;
            }
            emaVarArr[1] = emaVarArr[0];
            emaVarArr[0] = null;
            setTitle(charSequence);
            this.z0 = z;
            emaVarArr[0].setAlpha(0.0f);
            if (!z2) {
                ema emaVar2 = emaVarArr[0];
                int L = hl.L(20.0f);
                if (!z) {
                    L = -L;
                }
                emaVar2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = emaVarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
            if (k43Var != null) {
                duration.setInterpolator(k43Var);
            }
            duration.start();
            this.y0 = true;
            ViewPropertyAnimator alpha = emaVarArr[1].animate().alpha(0.0f);
            if (!z2) {
                int L2 = hl.L(20.0f);
                if (z) {
                    L2 = -L2;
                }
                alpha.translationY(L2);
            }
            if (k43Var != null) {
                alpha.setInterpolator(k43Var);
            }
            alpha.setDuration(j).setListener(new y5(this, z2, z, (byte) 0)).start();
            requestLayout();
            return;
        }
        setTitle(charSequence);
    }

    public final void O(String str, int i, Runnable runnable) {
        String str2;
        boolean z;
        SpannableString spannableString;
        boolean z2;
        ema emaVar;
        int indexOf;
        SpannableStringBuilder spannableStringBuilder;
        if (this.c0 && this.u0.parentLayout != null) {
            Object[] objArr = this.h0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = runnable;
            if (!this.j1) {
                String str3 = this.g0;
                if (str3 == null) {
                    if (str == null) {
                        return;
                    }
                } else if (str3.equals(str)) {
                    return;
                }
                this.g0 = str;
                ul ulVar = null;
                if (this.y1 != null) {
                    if (i == 2131751770) {
                        spannableStringBuilder = hl.E2(ob6.M0(2131743766, null), true, hl.L(2.6666667f), hl.L(2.0f));
                    } else {
                        spannableStringBuilder = null;
                    }
                    this.y1.a(spannableStringBuilder, true);
                }
                if (str != null) {
                    str2 = ob6.M0(i, str);
                } else {
                    CharSequence charSequence = this.d0;
                    ulVar = this.e0;
                    str2 = charSequence;
                }
                vh4 vh4Var = this.P0;
                if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                    SpannableString valueOf = SpannableString.valueOf(str2);
                    vh4Var.M(valueOf, indexOf);
                    z = true;
                    spannableString = valueOf;
                } else {
                    z = false;
                    spannableString = str2;
                }
                if (str != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.j0 = z2;
                ema[] emaVarArr = this.n;
                if ((spannableString == null || emaVarArr[0] != null) && getMeasuredWidth() != 0 && ((emaVar = emaVarArr[0]) == null || emaVar.getVisibility() == 0)) {
                    ema emaVar2 = emaVarArr[0];
                    if (emaVar2 != null) {
                        emaVar2.animate().cancel();
                        ema emaVar3 = emaVarArr[1];
                        if (emaVar3 != null) {
                            emaVar3.animate().cancel();
                        }
                        if (emaVarArr[1] == null) {
                            w(1);
                        }
                        emaVarArr[1].k(spannableString);
                        emaVarArr[1].setDrawablePadding(hl.L(4.0f));
                        emaVarArr[1].i(ulVar);
                        emaVarArr[1].setRightDrawableOnClick(this.f0);
                        if (ik8.A(ulVar)) {
                            ulVar.l(emaVarArr[1]);
                        }
                        if (z) {
                            vh4Var.c(emaVarArr[1]);
                        }
                        this.j1 = true;
                        float alpha = emaVarArr[0].getAlpha();
                        ema emaVar4 = emaVarArr[1];
                        emaVarArr[1] = emaVarArr[0];
                        emaVarArr[0] = emaVar4;
                        emaVar4.setAlpha(0.0f);
                        emaVarArr[0].setTranslationY(-hl.L(20.0f));
                        emaVarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                        ViewPropertyAnimator alpha2 = emaVarArr[1].animate().alpha(0.0f);
                        if (this.r == null) {
                            alpha2.translationY(hl.L(20.0f));
                        } else {
                            alpha2.scaleY(0.7f).scaleX(0.7f);
                        }
                        requestLayout();
                        this.A0 = true;
                        alpha2.setDuration(220L).setListener(new w5(this, (byte) 1)).start();
                    }
                } else {
                    w(0);
                    if (this.S) {
                        emaVarArr[0].invalidate();
                        invalidate();
                    }
                    emaVarArr[0].k(spannableString);
                    emaVarArr[0].setDrawablePadding(hl.L(4.0f));
                    emaVarArr[0].i(ulVar);
                    emaVarArr[0].setRightDrawableOnClick(this.f0);
                    if (ik8.A(ulVar)) {
                        ulVar.l(emaVarArr[0]);
                    }
                    if (z) {
                        vh4Var.c(emaVarArr[0]);
                    } else {
                        vh4Var.F(emaVarArr[0]);
                    }
                }
                if (runnable == null) {
                    runnable = this.i0;
                }
                this.k0 = runnable;
            }
        }
    }

    public final void P(ll0 ll0Var, ol0 ol0Var, boolean z) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z;
        this.V0 = ll0Var;
        this.W0 = ol0Var;
        jl0 c = ll0Var.c(this, null, false);
        c.p(ol0Var);
        c.q(hl.L(6.0f));
        this.a = c;
        if (z) {
            c.s(hl.L(18.33f), hl.L(23.0f), hl.L(23.0f), hl.L(18.33f));
        } else {
            c.r(hl.L(23.0f));
        }
        jl0 c2 = ll0Var.c(this, null, false);
        c2.p(ol0Var);
        ik8.r(c2, hl.L(23.0f), 6.0f);
        this.b = c2;
        jl0 c3 = ll0Var.c(this, null, false);
        c3.p(ol0Var);
        ik8.r(c3, hl.L(23.0f), 6.0f);
        this.c = c3;
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setTranslationX(-hl.L(10.0f));
            this.F.setGlassMode(true);
        }
        u5 u5Var = this.G;
        if (u5Var != null) {
            u5Var.setTranslationX(-hl.L(10.0f));
            this.G.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(hl.L(2.0f));
        }
    }

    public boolean Q(View view) {
        if (this.M) {
            ema[] emaVarArr = this.n;
            if (view == emaVarArr[0] || view == emaVarArr[1] || view == this.r || view == this.F || view == this.e || view == this.s || view == this.G0) {
                return true;
            }
        }
        return false;
    }

    public void R(View[] viewArr, boolean[] zArr) {
        if (this.G != null && !this.K) {
            this.K = true;
            n();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.G, property, 0.0f, 1.0f));
            if (viewArr != null) {
                for (View view : viewArr) {
                    if (view != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f, 0.0f));
                    }
                }
            }
            this.R = viewArr;
            if (this.x == 0) {
                if (!this.o0) {
                    ema emaVar = this.n[0];
                    if (emaVar != null) {
                        arrayList.add(ObjectAnimator.ofFloat(emaVar, property, 0.0f));
                    }
                    if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.r, property, 0.0f));
                    }
                }
                s6 s6Var = this.F;
                if (s6Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(s6Var, property, 0.0f));
                }
            }
            int i = this.x;
            if (i == 0) {
                i = this.y;
            }
            if (i != 0 && !this.Q0) {
                if (vm2.h(i) < 0.699999988079071d) {
                    hl.k3((Activity) getContext(), false);
                } else {
                    hl.k3((Activity) getContext(), true);
                }
            } else {
                jn7.e().k(jn7.u4, new Object[0]);
            }
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r5(this, (byte) 1));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new v5(this, zArr, (byte) 0));
            this.Q.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof gd0) {
                    ((gd0) drawable).c(true, 1.0f);
                }
                this.e.setBackgroundDrawable(aob.f0(this.r0, 1, -1));
            }
        }
    }

    public final void S() {
        boolean z;
        if (this.D0 && this.E0) {
            z = true;
        } else {
            z = false;
        }
        if (this.F0 != z) {
            this.F0 = z;
            vh4 vh4Var = this.P0;
            if (z) {
                vh4Var.a = true;
                AnimatorSet animatorSet = (AnimatorSet) vh4Var.d;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            vh4Var.a = false;
            ((AnimatorSet) vh4Var.d).cancel();
        }
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.C1));
        hashSet.add(Integer.valueOf(this.B1));
    }

    @Override
    public final void b(ula ulaVar, s7 s7Var) {
        this.a1 = ulaVar;
        this.b1 = s7Var;
        invalidate();
    }

    @Override
    public final boolean c(s7 s7Var, RectF rectF) {
        int L;
        int L2 = hl.L(6.0f);
        float f = 0.0f;
        if (s7Var.getParent() == this.F && this.c != null && !this.v1 && !this.R0 && this.l1 == 0.0f && getActionModeFactor() == 0.0f && !this.c.getBounds().isEmpty()) {
            rectF.set(this.c.getBounds());
            float f2 = L2;
            rectF.inset(f2, f2);
            return true;
        }
        float L3 = hl.L(46.0f) / 2.0f;
        View view = (View) s7Var.getParent();
        if (view != null) {
            f = view.getX();
        }
        float width = (s7Var.getWidth() / 2.0f) + s7Var.getX() + f;
        float height = ((getHeight() - this.P) - ((getCurrentActionBarHeight() + L) / 2.0f)) + L3;
        rectF.set(width - L3, height - L3, width + L3, height + L3);
        return false;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.a.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.T0 != null && this.Q0 && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            float f = x;
            float f2 = y;
            View x2 = x(this, f, f2, this.T0);
            if (x2 == null) {
                x2 = x(this, f, f2, null);
            }
            jl0 jl0Var = this.a;
            boolean z3 = true;
            if (jl0Var != null && jl0Var.getBounds().contains(x, y)) {
                z = true;
            } else {
                z = false;
            }
            if (x2 != null && x2 != this.T0) {
                jl0 jl0Var2 = this.b;
                if (jl0Var2 != null && jl0Var2.getBounds().contains(x, y)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                jl0 jl0Var3 = this.c;
                if (jl0Var3 == null || !jl0Var3.getBounds().contains(x, y)) {
                    z3 = false;
                }
                z = z4 | z3;
            }
            if (!z) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r21, android.view.View r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.a.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean e(String str) {
        if (this.G != null) {
            String str2 = this.H;
            if (str2 == null) {
                if (str == null) {
                    return true;
                }
                return false;
            } else if (str2.equals(str)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean g() {
        return false;
    }

    public d6 getActionBarMenuOnItemClick() {
        return this.v0;
    }

    public s6 getActionMode() {
        return this.G;
    }

    public float getActionModeFactor() {
        u5 u5Var = this.G;
        if (u5Var != null) {
            return u5Var.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.y1;
    }

    public ema getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public rk5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.y;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        ol0 ol0Var = this.W0;
        if (ol0Var != null) {
            return ol0Var.a(ol0Var.e);
        }
        return 0;
    }

    @Override
    public bl0 getButtonsGlassColorProvider() {
        return this.W0;
    }

    public boolean getCastShadows() {
        return this.l0;
    }

    public int getExtraHeight() {
        return this.P;
    }

    public int getMeasuredHeightNoExtra() {
        return getMeasuredHeight() - this.P;
    }

    @Override
    public int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public bl0 getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public vnb getMenuResourcesProvider() {
        return this.K0;
    }

    @Override
    public int getMenuRise() {
        return this.Z0;
    }

    @Override
    public View getMenuView() {
        return this.F;
    }

    public boolean getOccupyStatusBar() {
        return this.J;
    }

    @Override
    public ula getOpenMenuOverlay() {
        return this.a1;
    }

    public de0 getSearchAvatarImageView() {
        return this.f;
    }

    public int getShadowAlpha() {
        return this.m0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.r != null && (charSequence = this.B0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        ema emaVar = this.r;
        if (emaVar != null) {
            return emaVar.getTextColor();
        }
        return 0;
    }

    public ema getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        ema emaVar = this.n[0];
        if (emaVar == null) {
            return null;
        }
        return emaVar.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f;
        ema emaVar = this.n[0];
        if (emaVar == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!hl.O1() && getResources().getConfiguration().orientation == 2) {
                f = 18.0f;
            } else {
                f = 20.0f;
            }
            textPaint.setTextSize(hl.L(f));
            return textPaint.getFontMetricsInt();
        }
        return emaVar.getPaint().getFontMetricsInt();
    }

    public ema getTitleTextView() {
        return this.n[0];
    }

    public ema getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.G0;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final jl0 i(ula ulaVar) {
        ll0 ll0Var = this.X0;
        if (ll0Var == null) {
            ll0Var = this.V0;
        }
        if (ll0Var == null) {
            return null;
        }
        jl0 c = ll0Var.c(ulaVar, null, false);
        c.p(this.W0);
        ik8.r(c, hl.L(23.0f), 6.0f);
        return c;
    }

    public final void j() {
        float f;
        int v0;
        int v02;
        if (this.z1) {
            if (this.A1) {
                f = 1.0f;
            } else {
                f = this.E1;
            }
            int i = this.C1;
            vnb vnbVar = this.K0;
            if (i == -1) {
                v0 = 0;
            } else {
                v0 = aob.v0(i, vnbVar);
            }
            int i2 = this.B1;
            if (i2 == -1) {
                v02 = 0;
            } else {
                v02 = aob.v0(i2, vnbVar);
            }
            if (v02 == 0) {
                v02 = vm2.o(v0, 0);
            }
            if (v0 == 0) {
                v0 = vm2.o(v02, 0);
            }
            setBackgroundColor(vm2.f(f, v0, v02));
            setShadowAlpha((int) ((1.0f - f) * 255.0f));
            if (this.M0) {
                invalidate();
            }
        }
    }

    public final void k() {
        if (!ob6.a0) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new a6((byte) 0));
            this.A0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) k43.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void l(boolean z) {
        boolean z2;
        float f;
        f82 f82Var = this.T0;
        if (f82Var == null) {
            return;
        }
        b82 b82Var = f82Var.e;
        if (b82Var != null && b82Var.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int min = Math.min(getMeasuredWidth() - hl.L(116.0f), this.T0.getVisualWidth());
        t84 t84Var = this.m1;
        if (z) {
            if (t84Var.h) {
                f = t84Var.g;
            } else {
                f = t84Var.f;
            }
            float f2 = min;
            if (f != f2) {
                t84Var.a(f2);
            }
        } else {
            t84Var.c(min);
        }
        this.n1.a(z2, z);
    }

    public final void m() {
        int i;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof gd0) && !(drawable instanceof h27)) {
                i = 0;
            } else {
                i = 2;
            }
            if (this.e.getLayerType() != i) {
                this.e.setLayerType(i, null);
                this.e.invalidate();
            }
        }
    }

    public final void n() {
        int i;
        int i2;
        float f;
        s6 s6Var = this.F;
        boolean z = false;
        if (s6Var != null) {
            i = (s6Var.getItemsWidth() - hl.L(1.0f)) - hl.L(1.0f);
        } else {
            i = 0;
        }
        int max = Math.max(0, i);
        u5 u5Var = this.G;
        if (u5Var != null) {
            i2 = (u5Var.getItemsWidth() - hl.L(1.0f)) - hl.L(1.0f);
        } else {
            i2 = 0;
        }
        int max2 = Math.max(0, i2);
        Typeface typeface = hl.a;
        if (this.K) {
            max = max2;
        }
        if (max > 0) {
            z = true;
        }
        this.p1.a(z, this.u1);
        t84 t84Var = this.o1;
        if (t84Var.h) {
            f = t84Var.g;
        } else {
            f = t84Var.f;
        }
        float f2 = max;
        if (f != f2) {
            if (this.u1) {
                t84Var.a(f2);
            } else {
                t84Var.c(f2);
            }
        }
    }

    public void o(boolean z) {
        s6 s6Var;
        if (this.o0 && (s6Var = this.F) != null) {
            s6Var.i(z);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0 = true;
        S();
        if (this.K) {
            int i = this.x;
            if (i == 0) {
                i = this.y;
            }
            if (i != 0 && !this.Q0) {
                if (vm2.h(i) < 0.699999988079071d) {
                    hl.k3((Activity) getContext(), false);
                } else {
                    hl.k3((Activity) getContext(), true);
                }
            } else {
                jn7.e().k(jn7.u4, new Object[0]);
            }
        }
        ul ulVar = this.e0;
        if (ik8.A(ulVar)) {
            ulVar.l(this.n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0 = false;
        S();
        if (this.K) {
            int i = this.y;
            if (i != 0 && this.x != 0 && !this.Q0) {
                if (vm2.h(i) < 0.699999988079071d) {
                    hl.k3((Activity) getContext(), false);
                } else {
                    hl.k3((Activity) getContext(), true);
                }
            } else {
                jn7.e().k(jn7.u4, new Object[0]);
            }
        }
        ul ulVar = this.e0;
        if (ik8.A(ulVar)) {
            ulVar.l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable z0;
        if (this.S && !this.j0 && !ob6.a0 && motionEvent.getAction() == 0 && (z0 = aob.z0()) != null && z0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            wna wnaVar = this.T;
            ema[] emaVarArr = this.n;
            if (wnaVar == null) {
                this.U = null;
                this.T = new wna(0);
                emaVarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                ?? obj = new Object();
                obj.c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.b = paint;
                paint.setStrokeWidth(hl.L(1.5f));
                paint.setColor(aob.w0(null, aob.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i = 0; i < 20; i++) {
                    ((ArrayList) obj.d).add(new pj4(obj));
                }
                this.U = obj;
                emaVarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.J0;
        if ((onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.a.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.a.onMeasure(int, int):void");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O) {
            return false;
        }
        if (!super.onTouchEvent(motionEvent) && !this.N) {
            return false;
        }
        return true;
    }

    public final s6 p() {
        return q(null);
    }

    public final s6 q(String str) {
        float f;
        int i;
        boolean e = e(str);
        u5 u5Var = this.G;
        if (e) {
            return u5Var;
        }
        if (u5Var != null) {
            removeView(u5Var);
            this.G = null;
        }
        this.H = str;
        u5 u5Var2 = new u5(this, getContext(), this);
        this.G = u5Var2;
        if (this.Q0) {
            f = -hl.L(10.0f);
        } else {
            f = 0.0f;
        }
        u5Var2.setTranslationX(f);
        this.G.setGlassMode(this.Q0);
        u5 u5Var3 = this.G;
        u5Var3.c = true;
        u5Var3.setClickable(true);
        if (!this.Q0) {
            yob.h(aob.w8, this.K0, this.G);
        }
        addView(this.G, indexOfChild(this.e));
        u5 u5Var4 = this.G;
        if (this.J) {
            i = hl.m;
        } else {
            i = 0;
        }
        u5Var4.setPadding(0, i, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.P;
        layoutParams.gravity = 5;
        this.G.setLayoutParams(layoutParams);
        this.G.setVisibility(4);
        return this.G;
    }

    public final void r() {
        if (this.s != null) {
            return;
        }
        ema emaVar = new ema(getContext());
        this.s = emaVar;
        emaVar.setGravity(3);
        this.s.setVisibility(8);
        yob.W(this.s, aob.B8, this.K0);
        addView(this.s, 0, tre.e(-2, -2, 51));
    }

    @Override
    public final void requestLayout() {
        if (this.I) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(aob.f0(this.q0, 1, -1));
        this.e.setPadding(hl.L(1.0f), 0, 0, 0);
        addView(this.e, tre.e(54, 54, 51));
        this.e.setOnClickListener(new s5(this, (byte) 1));
        this.e.setContentDescription(ob6.M0(2131754874, null));
    }

    public void setActionBarMenuOnItemClick(d6 d6Var) {
        this.v0 = d6Var;
    }

    public void setActionModeColor(int i) {
        u5 u5Var = this.G;
        if (u5Var != null) {
            xob xobVar = yob.a;
            u5Var.setTag(2131296711, null);
            this.G.setBackgroundColor(i);
        }
    }

    public void setActionModeOverrideColor(int i) {
        this.x = i;
    }

    public void setActionModeTopColor(int i) {
        View view = this.w;
        if (view != null) {
            yob.q(view);
            this.w.setBackgroundColor(i);
        }
    }

    public void setAdaptiveBackground(ny9 ny9Var) {
        float f;
        int i = aob.a7;
        int i2 = aob.s8;
        this.B1 = i;
        this.C1 = i2;
        this.A1 = hl.O1();
        j();
        ve2 ve2Var = new ve2(this, ny9Var, (byte) 18);
        ny9Var.M.add(ve2Var);
        if (this.z1) {
            ve2Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = ny9Var.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        if (!canScrollVertically) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.E1 = f;
        j();
    }

    public void setAddToContainer(boolean z) {
        this.L = z;
    }

    public void setAdditionalTextLeft(int i) {
        this.h1 = i;
    }

    public void setAllowOverlayTitle(boolean z) {
        this.c0 = z;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i;
        float f;
        if (this.e == null) {
            s();
        }
        ImageView imageView = this.e;
        if (drawable == null) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = this.e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof gd0) {
            gd0 gd0Var = (gd0) drawable;
            if (z()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            gd0Var.c(false, f);
            gd0Var.b(this.t0);
            gd0Var.a(this.s0);
        } else if (drawable instanceof h27) {
            h27 h27Var = (h27) drawable;
            h27Var.k = this.y;
            h27Var.j = this.s0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        if (this.d1) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        m();
    }

    public void setBackButtonImage(int i) {
        int i2;
        if (this.e == null) {
            s();
        }
        ImageView imageView = this.e;
        if (i == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        this.e.setImageResource(i);
        this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        m();
    }

    @Override
    public void setBackgroundColor(int i) {
        this.y = i;
        if (!this.M0) {
            super.setBackgroundColor(i);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof h27) {
                ((h27) drawable).k = i;
            }
        }
    }

    public void setCastShadows(boolean z) {
        if (this.l0 != z && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.l0 = z;
    }

    public void setCenterTitleAndGlass(boolean z) {
        int i;
        if (this.I0 == z) {
            return;
        }
        this.I0 = z;
        ema[] emaVarArr = this.n;
        int length = emaVarArr.length;
        int i2 = 0;
        while (true) {
            i = 19;
            if (i2 >= length) {
                break;
            }
            ema emaVar = emaVarArr[i2];
            if (emaVar != null) {
                if (z) {
                    i = 17;
                }
                emaVar.setGravity(i);
            }
            i2++;
        }
        ema emaVar2 = this.r;
        if (emaVar2 != null) {
            if (z) {
                i = 17;
            }
            emaVar2.setGravity(i);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(f82 f82Var) {
        this.T0 = f82Var;
    }

    public void setClipContent(boolean z) {
        this.M = z;
    }

    public void setDrawBackButton(boolean z) {
        this.C0 = z;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(wma wmaVar) {
        this.M0 = true;
        this.L0 = wmaVar;
        wmaVar.P.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z) {
        if (this.w1 != z) {
            this.w1 = z;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setEnabled(z);
        }
        u5 u5Var = this.G;
        if (u5Var != null) {
            u5Var.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        this.P = i;
        u5 u5Var = this.G;
        if (u5Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u5Var.getLayoutParams();
            layoutParams.bottomMargin = this.P;
            this.G.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z) {
        this.O = z;
    }

    public void setForcedMenuMinWidth(int i) {
        this.t1 = true;
        if (this.r1 != i) {
            this.r1 = i;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i) {
        this.s1 = true;
        if (this.q1 != i) {
            this.q1 = i;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i) {
        if (this.x1 != i) {
            this.x1 = i;
            invalidate();
        }
        jl0 jl0Var = this.a;
        if (jl0Var != null && jl0Var.c != i) {
            jl0Var.setAlpha(i);
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.J0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z) {
        this.N = z;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f) {
        pz4 pz4Var = this.Y0;
        if (pz4Var != null) {
            pz4Var.k(f);
        }
    }

    public void setMenuOffsetSuppressed(boolean z) {
        this.E = z;
    }

    public void setMenuRise(int i) {
        this.Z0 = i;
    }

    public void setOccupyStatusBar(boolean z) {
        int i;
        this.J = z;
        u5 u5Var = this.G;
        if (u5Var != null) {
            if (z) {
                i = hl.m;
            } else {
                i = 0;
            }
            u5Var.setPadding(0, i, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.e1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z) {
        this.x0 = z;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f0 = onClickListener;
        ema[] emaVarArr = this.n;
        ema emaVar = emaVarArr[0];
        if (emaVar != null) {
            emaVar.setRightDrawableOnClick(onClickListener);
        }
        ema emaVar2 = emaVarArr[1];
        if (emaVar2 != null) {
            emaVar2.setRightDrawableOnClick(this.f0);
        }
    }

    public void setSearchAvatarImageView(de0 de0Var) {
        de0 de0Var2 = this.f;
        if (de0Var2 != de0Var) {
            if (de0Var2 != null) {
                removeView(de0Var2);
            }
            this.f = de0Var;
            if (de0Var != null) {
                addView(de0Var);
            }
        }
    }

    public void setSearchCursorColor(int i) {
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setSearchCursorColor(i);
        }
    }

    public void setSearchFactor(float f) {
        if (this.l1 != f) {
            this.l1 = f;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.F.setSearchFieldText(str);
    }

    public void setSearchFilter(ph4 ph4Var) {
        s6 s6Var = this.F;
        if (s6Var != null) {
            s6Var.setFilter(ph4Var);
        }
    }

    public void setShadowAlpha(int i) {
        if (this.m0 == i) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.m0 = i;
    }

    public void setSkipDrawChild(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i;
        if (charSequence != null && this.r == null) {
            v();
        }
        if (this.r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            ema emaVar = this.r;
            if (!isEmpty && !this.o0) {
                i = 0;
            } else {
                i = 8;
            }
            emaVar.setVisibility(i);
            this.r.setAlpha(1.0f);
            if (!isEmpty) {
                this.r.l(charSequence, false);
            }
            this.B0 = charSequence;
        }
    }

    public void setSubtitleColor(int i) {
        if (this.r == null) {
            v();
        }
        yob.q(this.r);
        this.r.setTextColor(i);
    }

    public void setSupportsHolidayImage(boolean z) {
        this.S = z;
        if (z) {
            this.V = new Paint.FontMetricsInt();
            this.a0 = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        M(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.k0 = runnable;
        this.i0 = runnable;
    }

    public void setTitleColor(int i) {
        ema[] emaVarArr = this.n;
        if (emaVarArr[0] == null) {
            w(0);
        }
        this.w0 = i;
        yob.q(emaVarArr[0]);
        emaVarArr[0].setTextColor(i);
        emaVarArr[0].setEmojiColor(i);
        ema emaVar = emaVarArr[1];
        if (emaVar != null) {
            yob.q(emaVar);
            emaVarArr[1].setTextColor(i);
            emaVarArr[1].setEmojiColor(i);
        }
    }

    public void setTitleRightMargin(int i) {
        this.b0 = i;
    }

    public void setTitleScrollNonFitText(boolean z) {
        this.n[0].setScrollNonFitText(z);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.M) {
            invalidate();
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        invalidate();
    }

    public final s6 u() {
        s6 s6Var = this.F;
        if (s6Var != null) {
            return s6Var;
        }
        s6 s6Var2 = new s6(getContext(), this);
        this.F = s6Var2;
        addView(s6Var2, 0, tre.e(-2, -1, 5));
        return this.F;
    }

    @Override
    public final void updateColors() {
        j();
        jl0 jl0Var = this.a;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.c;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        jl0 jl0Var3 = this.b;
        if (jl0Var3 != null) {
            jl0Var3.updateColors();
        }
        c6 c6Var = this.y1;
        if (c6Var != null) {
            c6Var.b();
        }
    }

    public final void v() {
        if (this.r != null) {
            return;
        }
        ema emaVar = new ema(getContext());
        this.r = emaVar;
        emaVar.setGravity(3);
        this.r.setVisibility(8);
        yob.W(this.r, aob.B8, this.K0);
        addView(this.r, 0, tre.e(-2, -2, 51));
    }

    public final void w(int i) {
        int i2;
        View[] viewArr = this.n;
        if (viewArr[i] != null) {
            return;
        }
        ema emaVar = new ema(getContext());
        viewArr[i] = emaVar;
        if (this.I0) {
            i2 = 17;
        } else {
            i2 = 19;
        }
        emaVar.setGravity(i2);
        int i3 = this.w0;
        if (i3 != 0) {
            viewArr[i].setTextColor(i3);
        } else {
            yob.W(viewArr[i], aob.A8, this.K0);
        }
        ema emaVar2 = viewArr[i];
        emaVar2.setEmojiColor(emaVar2.getTextColor());
        viewArr[i].setTypeface(hl.o());
        viewArr[i].setDrawablePadding(hl.L(4.0f));
        viewArr[i].setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        viewArr[i].setRightDrawableTopPadding(-hl.L(1.0f));
        if (this.H0) {
            this.G0.addView(viewArr[i], 0, tre.e(-2, -2, 51));
        } else {
            addView(viewArr[i], 0, tre.e(-2, -2, 51));
        }
    }

    public void y() {
        u5 u5Var = this.G;
        if (u5Var != null && this.K) {
            int childCount = u5Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = u5Var.getChildAt(i);
                if (childAt instanceof s7) {
                    ((s7) childAt).p();
                }
            }
            this.K = false;
            n();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.G, property, 0.0f));
            if (this.R != null) {
                int i2 = 0;
                while (true) {
                    View[] viewArr = this.R;
                    if (i2 >= viewArr.length) {
                        break;
                    }
                    View view = viewArr[i2];
                    if (view != null) {
                        view.setVisibility(0);
                        arrayList.add(ObjectAnimator.ofFloat(this.R[i2], property, 1.0f));
                    }
                    i2++;
                }
            }
            boolean z = this.o0;
            ema[] emaVarArr = this.n;
            if (!z) {
                ema emaVar = emaVarArr[0];
                if (emaVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(emaVar, property, 1.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, property, 1.0f));
                }
            }
            s6 s6Var = this.F;
            if (s6Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(s6Var, property, 1.0f));
            }
            int i3 = this.y;
            if (i3 != 0 && !this.Q0) {
                if (vm2.h(i3) < 0.699999988079071d) {
                    hl.k3((Activity) getContext(), false);
                } else {
                    hl.k3((Activity) getContext(), true);
                }
            } else {
                jn7.e().k(jn7.u4, new Object[0]);
            }
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r5(this, (byte) 0));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new w5(this, (byte) 0));
            this.Q.start();
            if (!this.o0) {
                ema emaVar2 = emaVarArr[0];
                if (emaVar2 != null) {
                    emaVar2.setVisibility(0);
                }
                if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                    this.r.setVisibility(0);
                }
            }
            s6 s6Var2 = this.F;
            if (s6Var2 != null) {
                s6Var2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof gd0) {
                    ((gd0) drawable).c(true, 0.0f);
                }
                this.e.setBackgroundDrawable(aob.f0(this.q0, 1, -1));
            }
        }
    }

    public final boolean z() {
        if (this.G != null && this.K) {
            return true;
        }
        return false;
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void v0(float f, int i) {
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        F(recyclerView, aob.a7, aob.s8);
    }
}
