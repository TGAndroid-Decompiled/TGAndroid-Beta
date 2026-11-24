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
public class a extends FrameLayout implements x74, tjb, h07 {
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
    public r6 F;
    public boolean F0;
    public ValueAnimator F1;
    public t5 G;
    public a6 G0;
    public String H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final wjb K0;
    public boolean L;
    public cja L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public final Paint N0;
    public boolean O;
    public final Rect O0;
    public int P;
    public final xf4 P0;
    public AnimatorSet Q;
    public boolean Q0;
    public View[] R;
    public boolean R0;
    public boolean S;
    public boolean S0;
    public cka T;
    public o72 T0;
    public oh4 U;
    public boolean U0;
    public Paint.FontMetricsInt V;
    public kl0 V0;
    public boolean W;
    public nl0 W0;
    public kl0 X0;
    public jx4 Y0;
    public int Z0;
    public il0 a;
    public Rect a0;
    public zha a1;
    public il0 b;
    public int b0;
    public r7 b1;
    public il0 c;
    public boolean c0;
    public final RectF c1;
    public final pi5 d;
    public CharSequence d0;
    public boolean d1;
    public ImageView e;
    public tl e0;
    public Runnable e1;
    public be0 f;
    public View.OnClickListener f0;
    public sr8 f1;
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
    public final y74 m1;
    public final jia[] n;
    public boolean n0;
    public final fm0 n1;
    public boolean o0;
    public final y74 o1;
    public float p0;
    public final fm0 p1;
    public int q0;
    public int q1;
    public jia r;
    public int r0;
    public int r1;
    public jia s;
    public int s0;
    public boolean s1;
    public int t0;
    public boolean t1;
    public d u0;
    public boolean u1;
    public c6 v0;
    public boolean v1;
    public View w;
    public int w0;
    public boolean w1;
    public int x;
    public boolean x0;
    public int x1;
    public int y;
    public boolean y0;
    public b6 y1;
    public boolean z0;
    public boolean z1;

    public a(Context context, wjb wjbVar) {
        super(context);
        this.d = pi5.a;
        this.n = new jia[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.h0 = new Object[3];
        this.l0 = true;
        this.m0 = 255;
        this.w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new xf4(this);
        this.c1 = new RectF();
        s33 s33Var = s33.h;
        this.m1 = new y74(0, this, s33Var, 380L);
        this.n1 = new fm0(0, this, s33Var, 380L, false);
        this.o1 = new y74(0, this, s33Var, 320L);
        this.p1 = new fm0(0, this, s33Var, 320L, false);
        this.w1 = true;
        this.x1 = 255;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = wjbVar;
        setOnClickListener(new r5(this, (byte) 0));
    }

    public static int getCurrentActionBarHeight() {
        if (gl.O1()) {
            return gl.L(58.0f);
        }
        Point point = gl.q;
        if (point.x > point.y) {
            return gl.L(48.0f);
        }
        return gl.L(56.0f);
    }

    public static View w(a aVar, float f, float f2, View view) {
        for (int childCount = aVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = aVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f >= childAt.getX() && f <= childAt.getX() + childAt.getWidth() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        return false;
    }

    public void B(boolean z) {
        float f;
        Property property;
        float f2;
        float f3;
        float f4;
        int i;
        this.o0 = z;
        m();
        AnimatorSet animatorSet = this.g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.g1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean A = A();
        if (!A) {
            jia jiaVar = this.n[0];
            if (jiaVar != null) {
                arrayList.add(jiaVar);
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(this.r);
                jia jiaVar2 = this.r;
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                jiaVar2.setVisibility(i);
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
        ofFloat.addUpdateListener(new q5(this, (byte) 2));
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
        be0 be0Var = this.f;
        if (be0Var != null) {
            be0Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.g1;
            be0 be0Var2 = this.f;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(be0Var2, property, f2));
        }
        this.A0 = true;
        requestLayout();
        this.g1.addListener(new w5(this, arrayList, z, A));
        this.g1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof a07) {
                a07 a07Var = (a07) drawable;
                a07Var.h = true;
                if (z) {
                    f6 = 1.0f;
                }
                a07Var.a(true, f6);
            }
        }
    }

    public final void C() {
        r6 r6Var = this.F;
        int childCount = r6Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = r6Var.getChildAt(i);
            if (childAt instanceof r7) {
                r7 r7Var = (r7) childAt;
                if (r7Var.v()) {
                    r7Var.F();
                }
            }
        }
    }

    public final void D() {
        r6 r6Var = this.F;
        if (r6Var != null) {
            boolean z = this.o0;
            boolean z2 = !z;
            int childCount = r6Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = r6Var.getChildAt(i);
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    if (r7Var.v()) {
                        if (!z) {
                            r6Var.b.B(r7Var.T(z2));
                        }
                        r7Var.P("", false);
                        r7Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void E(RecyclerView recyclerView, int i, int i2) {
        float f;
        this.B1 = i;
        this.C1 = i2;
        this.A1 = gl.O1();
        ee2 ee2Var = new ee2(this, recyclerView, (byte) 19);
        recyclerView.j(new y(ee2Var, (byte) 1));
        if (this.z1) {
            ee2Var.run();
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
        i();
    }

    public final void G(int i, boolean z) {
        ImageView imageView;
        if (z) {
            this.r0 = i;
            if (this.K && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(bkb.f0(i, 1, -1));
            }
            t5 t5Var = this.G;
            if (t5Var != null) {
                t5Var.s();
                return;
            }
            return;
        }
        this.q0 = i;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(bkb.f0(i, 1, -1));
        }
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.s();
        }
    }

    public void H(int i, boolean z) {
        if (z) {
            this.t0 = i;
            t5 t5Var = this.G;
            if (t5Var != null) {
                t5Var.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof ed0) {
                    ((ed0) drawable).b(i);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.s0 = i;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof ed0) {
                    ((ed0) drawable2).a(i);
                } else if (drawable2 instanceof a07) {
                    ((a07) drawable2).j = i;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
            r6 r6Var = this.F;
            if (r6Var != null) {
                r6Var.t();
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
            t5 t5Var = this.G;
            if (t5Var != null) {
                int childCount = t5Var.getChildCount();
                while (i2 < childCount) {
                    View childAt = t5Var.getChildAt(i2);
                    if (childAt instanceof r7) {
                        ((r7) childAt).I(i);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        r6 r6Var = this.F;
        if (r6Var != null) {
            int childCount2 = r6Var.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = r6Var.getChildAt(i2);
                if (childAt2 instanceof r7) {
                    ((r7) childAt2).I(i);
                }
                i2++;
            }
        }
    }

    public final void J(int i, boolean z, boolean z2) {
        int i2 = 0;
        if (z2) {
            t5 t5Var = this.G;
            if (t5Var != null) {
                int childCount = t5Var.getChildCount();
                while (i2 < childCount) {
                    View childAt = t5Var.getChildAt(i2);
                    if (childAt instanceof r7) {
                        ((r7) childAt).O(i, z);
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        r6 r6Var = this.F;
        if (r6Var != null) {
            int childCount2 = r6Var.getChildCount();
            while (i2 < childCount2) {
                View childAt2 = r6Var.getChildAt(i2);
                if (childAt2 instanceof r7) {
                    ((r7) childAt2).O(i, z);
                }
                i2++;
            }
        }
    }

    public final void K(int i, boolean z) {
        if (z) {
            t5 t5Var = this.G;
            if (t5Var != null) {
                t5Var.setPopupItemsSelectorColor(i);
                return;
            }
            return;
        }
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setPopupItemsSelectorColor(i);
        }
    }

    public final void L(int i, boolean z) {
        r6 r6Var = this.F;
        if (r6Var != null) {
            int childCount = r6Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = r6Var.getChildAt(i2);
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    if (r7Var.v()) {
                        if (z) {
                            r7Var.getSearchField().setHintTextColor(i);
                            return;
                        } else {
                            r7Var.getSearchField().setTextColor(i);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void M(CharSequence charSequence, tl tlVar) {
        int i;
        jia[] jiaVarArr = this.n;
        if (charSequence != null && jiaVarArr[0] == null) {
            v(0);
        }
        jia jiaVar = jiaVarArr[0];
        if (jiaVar != null) {
            if (charSequence != null && !this.o0) {
                i = 0;
            } else {
                i = 4;
            }
            jiaVar.setVisibility(i);
            jia jiaVar2 = jiaVarArr[0];
            this.d0 = charSequence;
            jiaVar2.k(charSequence);
            if (this.D0) {
                tl tlVar2 = this.e0;
                if (ug8.A(tlVar2)) {
                    tlVar2.l(null);
                }
            }
            jia jiaVar3 = jiaVarArr[0];
            this.e0 = tlVar;
            jiaVar3.i(tlVar);
            if (this.D0) {
                tl tlVar3 = this.e0;
                if (ug8.A(tlVar3)) {
                    tlVar3.l(jiaVarArr[0]);
                }
            }
            jiaVarArr[0].setRightDrawableOnClick(this.f0);
        }
        this.z0 = false;
    }

    public final void N(CharSequence charSequence, boolean z, long j, s33 s33Var) {
        boolean z2;
        float f;
        jia[] jiaVarArr = this.n;
        if (jiaVarArr[0] != null && charSequence != null) {
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
                ug8.s(animate, f, 220L);
            }
            jia jiaVar = jiaVarArr[1];
            if (jiaVar != null) {
                if (jiaVar.getParent() != null) {
                    ((ViewGroup) jiaVarArr[1].getParent()).removeView(jiaVarArr[1]);
                }
                jiaVarArr[1] = null;
            }
            jiaVarArr[1] = jiaVarArr[0];
            jiaVarArr[0] = null;
            setTitle(charSequence);
            this.z0 = z;
            jiaVarArr[0].setAlpha(0.0f);
            if (!z2) {
                jia jiaVar2 = jiaVarArr[0];
                int L = gl.L(20.0f);
                if (!z) {
                    L = -L;
                }
                jiaVar2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = jiaVarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
            if (s33Var != null) {
                duration.setInterpolator(s33Var);
            }
            duration.start();
            this.y0 = true;
            ViewPropertyAnimator alpha = jiaVarArr[1].animate().alpha(0.0f);
            if (!z2) {
                int L2 = gl.L(20.0f);
                if (z) {
                    L2 = -L2;
                }
                alpha.translationY(L2);
            }
            if (s33Var != null) {
                alpha.setInterpolator(s33Var);
            }
            alpha.setDuration(j).setListener(new x5(this, z2, z, (byte) 0)).start();
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
        jia jiaVar;
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
                tl tlVar = null;
                if (this.y1 != null) {
                    if (i == 2131751793) {
                        spannableStringBuilder = gl.E2(k96.M0(2131743872, null), true, gl.L(2.6666667f), gl.L(2.0f));
                    } else {
                        spannableStringBuilder = null;
                    }
                    this.y1.a(spannableStringBuilder, true);
                }
                if (str != null) {
                    str2 = k96.M0(i, str);
                } else {
                    CharSequence charSequence = this.d0;
                    tlVar = this.e0;
                    str2 = charSequence;
                }
                xf4 xf4Var = this.P0;
                if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                    SpannableString valueOf = SpannableString.valueOf(str2);
                    xf4Var.M(valueOf, indexOf);
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
                jia[] jiaVarArr = this.n;
                if ((spannableString == null || jiaVarArr[0] != null) && getMeasuredWidth() != 0 && ((jiaVar = jiaVarArr[0]) == null || jiaVar.getVisibility() == 0)) {
                    jia jiaVar2 = jiaVarArr[0];
                    if (jiaVar2 != null) {
                        jiaVar2.animate().cancel();
                        jia jiaVar3 = jiaVarArr[1];
                        if (jiaVar3 != null) {
                            jiaVar3.animate().cancel();
                        }
                        if (jiaVarArr[1] == null) {
                            v(1);
                        }
                        jiaVarArr[1].k(spannableString);
                        jiaVarArr[1].setDrawablePadding(gl.L(4.0f));
                        jiaVarArr[1].i(tlVar);
                        jiaVarArr[1].setRightDrawableOnClick(this.f0);
                        if (ug8.A(tlVar)) {
                            tlVar.l(jiaVarArr[1]);
                        }
                        if (z) {
                            xf4Var.d(jiaVarArr[1]);
                        }
                        this.j1 = true;
                        float alpha = jiaVarArr[0].getAlpha();
                        jia jiaVar4 = jiaVarArr[1];
                        jiaVarArr[1] = jiaVarArr[0];
                        jiaVarArr[0] = jiaVar4;
                        jiaVar4.setAlpha(0.0f);
                        jiaVarArr[0].setTranslationY(-gl.L(20.0f));
                        jiaVarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                        ViewPropertyAnimator alpha2 = jiaVarArr[1].animate().alpha(0.0f);
                        if (this.r == null) {
                            alpha2.translationY(gl.L(20.0f));
                        } else {
                            alpha2.scaleY(0.7f).scaleX(0.7f);
                        }
                        requestLayout();
                        this.A0 = true;
                        alpha2.setDuration(220L).setListener(new v5(this, (byte) 1)).start();
                    }
                } else {
                    v(0);
                    if (this.S) {
                        jiaVarArr[0].invalidate();
                        invalidate();
                    }
                    jiaVarArr[0].k(spannableString);
                    jiaVarArr[0].setDrawablePadding(gl.L(4.0f));
                    jiaVarArr[0].i(tlVar);
                    jiaVarArr[0].setRightDrawableOnClick(this.f0);
                    if (ug8.A(tlVar)) {
                        tlVar.l(jiaVarArr[0]);
                    }
                    if (z) {
                        xf4Var.d(jiaVarArr[0]);
                    } else {
                        xf4Var.F(jiaVarArr[0]);
                    }
                }
                if (runnable == null) {
                    runnable = this.i0;
                }
                this.k0 = runnable;
            }
        }
    }

    public final void P(kl0 kl0Var, nl0 nl0Var, boolean z) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z;
        this.V0 = kl0Var;
        this.W0 = nl0Var;
        il0 c = kl0Var.c(this, null, false);
        c.p(nl0Var);
        c.q(gl.L(6.0f));
        this.a = c;
        if (z) {
            c.s(gl.L(18.33f), gl.L(23.0f), gl.L(23.0f), gl.L(18.33f));
        } else {
            c.r(gl.L(23.0f));
        }
        il0 c2 = kl0Var.c(this, null, false);
        c2.p(nl0Var);
        ug8.r(c2, gl.L(23.0f), 6.0f);
        this.b = c2;
        il0 c3 = kl0Var.c(this, null, false);
        c3.p(nl0Var);
        ug8.r(c3, gl.L(23.0f), 6.0f);
        this.c = c3;
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setTranslationX(-gl.L(10.0f));
            this.F.setGlassMode(true);
        }
        t5 t5Var = this.G;
        if (t5Var != null) {
            t5Var.setTranslationX(-gl.L(10.0f));
            this.G.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(gl.L(2.0f));
        }
    }

    public boolean Q(View view) {
        if (this.M) {
            jia[] jiaVarArr = this.n;
            if (view == jiaVarArr[0] || view == jiaVarArr[1] || view == this.r || view == this.F || view == this.e || view == this.s || view == this.G0) {
                return true;
            }
        }
        return false;
    }

    public void R(View[] viewArr, boolean[] zArr) {
        if (this.G != null && !this.K) {
            this.K = true;
            m();
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
                    jia jiaVar = this.n[0];
                    if (jiaVar != null) {
                        arrayList.add(ObjectAnimator.ofFloat(jiaVar, property, 0.0f));
                    }
                    if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.r, property, 0.0f));
                    }
                }
                r6 r6Var = this.F;
                if (r6Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(r6Var, property, 0.0f));
                }
            }
            int i = this.x;
            if (i == 0) {
                i = this.y;
            }
            if (i != 0 && !this.Q0) {
                if (bm2.h(i) < 0.699999988079071d) {
                    gl.k3((Activity) getContext(), false);
                } else {
                    gl.k3((Activity) getContext(), true);
                }
            } else {
                kk7.e().k(kk7.t4, new Object[0]);
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
                ofFloat.addUpdateListener(new q5(this, (byte) 1));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new u5(this, zArr, (byte) 0));
            this.Q.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof ed0) {
                    ((ed0) drawable).c(true, 1.0f);
                }
                this.e.setBackgroundDrawable(bkb.f0(this.r0, 1, -1));
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
            xf4 xf4Var = this.P0;
            if (z) {
                xf4Var.a = true;
                AnimatorSet animatorSet = (AnimatorSet) xf4Var.d;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            xf4Var.a = false;
            ((AnimatorSet) xf4Var.d).cancel();
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
    public final void b(zha zhaVar, r7 r7Var) {
        this.a1 = zhaVar;
        this.b1 = r7Var;
        invalidate();
    }

    @Override
    public final boolean c(r7 r7Var, RectF rectF) {
        int L;
        int L2 = gl.L(6.0f);
        float f = 0.0f;
        if (r7Var.getParent() == this.F && this.c != null && !this.v1 && !this.R0 && this.l1 == 0.0f && getActionModeFactor() == 0.0f && !this.c.getBounds().isEmpty()) {
            rectF.set(this.c.getBounds());
            float f2 = L2;
            rectF.inset(f2, f2);
            return true;
        }
        float L3 = gl.L(46.0f) / 2.0f;
        View view = (View) r7Var.getParent();
        if (view != null) {
            f = view.getX();
        }
        float width = (r7Var.getWidth() / 2.0f) + r7Var.getX() + f;
        float height = ((getHeight() - this.P) - ((getCurrentActionBarHeight() + L) / 2.0f)) + L3;
        rectF.set(width - L3, height - L3, width + L3, height + L3);
        return false;
    }

    public final boolean d(String str) {
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
            View w = w(this, f, f2, this.T0);
            if (w == null) {
                w = w(this, f, f2, null);
            }
            il0 il0Var = this.a;
            boolean z3 = true;
            if (il0Var != null && il0Var.getBounds().contains(x, y)) {
                z = true;
            } else {
                z = false;
            }
            if (w != null && w != this.T0) {
                il0 il0Var2 = this.b;
                if (il0Var2 != null && il0Var2.getBounds().contains(x, y)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                il0 il0Var3 = this.c;
                if (il0Var3 == null || !il0Var3.getBounds().contains(x, y)) {
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

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean g() {
        return false;
    }

    public c6 getActionBarMenuOnItemClick() {
        return this.v0;
    }

    public r6 getActionMode() {
        return this.G;
    }

    public float getActionModeFactor() {
        t5 t5Var = this.G;
        if (t5Var != null) {
            return t5Var.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.y1;
    }

    public jia getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public pi5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.y;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        nl0 nl0Var = this.W0;
        if (nl0Var != null) {
            return nl0Var.a(nl0Var.e);
        }
        return 0;
    }

    @Override
    public al0 getButtonsGlassColorProvider() {
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
    public al0 getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public wjb getMenuResourcesProvider() {
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
    public zha getOpenMenuOverlay() {
        return this.a1;
    }

    public be0 getSearchAvatarImageView() {
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
        jia jiaVar = this.r;
        if (jiaVar != null) {
            return jiaVar.getTextColor();
        }
        return 0;
    }

    public jia getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        jia jiaVar = this.n[0];
        if (jiaVar == null) {
            return null;
        }
        return jiaVar.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f;
        jia jiaVar = this.n[0];
        if (jiaVar == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!gl.O1() && getResources().getConfiguration().orientation == 2) {
                f = 18.0f;
            } else {
                f = 20.0f;
            }
            textPaint.setTextSize(gl.L(f));
            return textPaint.getFontMetricsInt();
        }
        return jiaVar.getPaint().getFontMetricsInt();
    }

    public jia getTitleTextView() {
        return this.n[0];
    }

    public jia getTitleTextView2() {
        return this.n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.G0;
    }

    @Override
    public final il0 h(zha zhaVar) {
        kl0 kl0Var = this.X0;
        if (kl0Var == null) {
            kl0Var = this.V0;
        }
        if (kl0Var == null) {
            return null;
        }
        il0 c = kl0Var.c(zhaVar, null, false);
        c.p(this.W0);
        ug8.r(c, gl.L(23.0f), 6.0f);
        return c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
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
            wjb wjbVar = this.K0;
            if (i == -1) {
                v0 = 0;
            } else {
                v0 = bkb.v0(i, wjbVar);
            }
            int i2 = this.B1;
            if (i2 == -1) {
                v02 = 0;
            } else {
                v02 = bkb.v0(i2, wjbVar);
            }
            if (v02 == 0) {
                v02 = bm2.o(v0, 0);
            }
            if (v0 == 0) {
                v0 = bm2.o(v02, 0);
            }
            setBackgroundColor(bm2.f(f, v0, v02));
            setShadowAlpha((int) ((1.0f - f) * 255.0f));
            if (this.M0) {
                invalidate();
            }
        }
    }

    public final void j() {
        if (!k96.a0) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new z5((byte) 0));
            this.A0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) s33.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void k(boolean z) {
        boolean z2;
        float f;
        o72 o72Var = this.T0;
        if (o72Var == null) {
            return;
        }
        k72 k72Var = o72Var.e;
        if (k72Var != null && k72Var.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int min = Math.min(getMeasuredWidth() - gl.L(116.0f), this.T0.getVisualWidth());
        y74 y74Var = this.m1;
        if (z) {
            if (y74Var.h) {
                f = y74Var.g;
            } else {
                f = y74Var.f;
            }
            float f2 = min;
            if (f != f2) {
                y74Var.a(f2);
            }
        } else {
            y74Var.c(min);
        }
        this.n1.a(z2, z);
    }

    public final void l() {
        int i;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof ed0) && !(drawable instanceof a07)) {
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

    public final void m() {
        int i;
        int i2;
        float f;
        r6 r6Var = this.F;
        boolean z = false;
        if (r6Var != null) {
            i = (r6Var.getItemsWidth() - gl.L(1.0f)) - gl.L(1.0f);
        } else {
            i = 0;
        }
        int max = Math.max(0, i);
        t5 t5Var = this.G;
        if (t5Var != null) {
            i2 = (t5Var.getItemsWidth() - gl.L(1.0f)) - gl.L(1.0f);
        } else {
            i2 = 0;
        }
        int max2 = Math.max(0, i2);
        Typeface typeface = gl.a;
        if (this.K) {
            max = max2;
        }
        if (max > 0) {
            z = true;
        }
        this.p1.a(z, this.u1);
        y74 y74Var = this.o1;
        if (y74Var.h) {
            f = y74Var.g;
        } else {
            f = y74Var.f;
        }
        float f2 = max;
        if (f != f2) {
            if (this.u1) {
                y74Var.a(f2);
            } else {
                y74Var.c(f2);
            }
        }
    }

    public void n(boolean z) {
        r6 r6Var;
        if (this.o0 && (r6Var = this.F) != null) {
            r6Var.i(z);
        }
    }

    public final r6 o() {
        return q(null);
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
                if (bm2.h(i) < 0.699999988079071d) {
                    gl.k3((Activity) getContext(), false);
                } else {
                    gl.k3((Activity) getContext(), true);
                }
            } else {
                kk7.e().k(kk7.t4, new Object[0]);
            }
        }
        tl tlVar = this.e0;
        if (ug8.A(tlVar)) {
            tlVar.l(this.n[0]);
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
                if (bm2.h(i) < 0.699999988079071d) {
                    gl.k3((Activity) getContext(), false);
                } else {
                    gl.k3((Activity) getContext(), true);
                }
            } else {
                kk7.e().k(kk7.t4, new Object[0]);
            }
        }
        tl tlVar = this.e0;
        if (ug8.A(tlVar)) {
            tlVar.l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable z0;
        if (this.S && !this.j0 && !k96.a0 && motionEvent.getAction() == 0 && (z0 = bkb.z0()) != null && z0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            cka ckaVar = this.T;
            jia[] jiaVarArr = this.n;
            if (ckaVar == null) {
                this.U = null;
                this.T = new cka(0);
                jiaVarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                ?? obj = new Object();
                obj.c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.b = paint;
                paint.setStrokeWidth(gl.L(1.5f));
                paint.setColor(bkb.w0(null, bkb.z8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i = 0; i < 20; i++) {
                    ((ArrayList) obj.d).add(new nh4(obj));
                }
                this.U = obj;
                jiaVarArr[0].invalidate();
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

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        invalidate();
    }

    public final r6 q(String str) {
        float f;
        int i;
        boolean d = d(str);
        t5 t5Var = this.G;
        if (d) {
            return t5Var;
        }
        if (t5Var != null) {
            removeView(t5Var);
            this.G = null;
        }
        this.H = str;
        t5 t5Var2 = new t5(this, getContext(), this);
        this.G = t5Var2;
        if (this.Q0) {
            f = -gl.L(10.0f);
        } else {
            f = 0.0f;
        }
        t5Var2.setTranslationX(f);
        this.G.setGlassMode(this.Q0);
        t5 t5Var3 = this.G;
        t5Var3.c = true;
        t5Var3.setClickable(true);
        if (!this.Q0) {
            zkb.h(bkb.v8, this.K0, this.G);
        }
        addView(this.G, indexOfChild(this.e));
        t5 t5Var4 = this.G;
        if (this.J) {
            i = gl.m;
        } else {
            i = 0;
        }
        t5Var4.setPadding(0, i, 0, 0);
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
        jia jiaVar = new jia(getContext());
        this.s = jiaVar;
        jiaVar.setGravity(3);
        this.s.setVisibility(8);
        zkb.W(this.s, bkb.A8, this.K0);
        addView(this.s, 0, nme.e(-2, -2, 51));
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
        this.e.setBackgroundDrawable(bkb.f0(this.q0, 1, -1));
        this.e.setPadding(gl.L(1.0f), 0, 0, 0);
        addView(this.e, nme.e(54, 54, 51));
        this.e.setOnClickListener(new r5(this, (byte) 1));
        this.e.setContentDescription(k96.M0(2131754878, null));
    }

    public void setActionBarMenuOnItemClick(c6 c6Var) {
        this.v0 = c6Var;
    }

    public void setActionModeColor(int i) {
        t5 t5Var = this.G;
        if (t5Var != null) {
            ykb ykbVar = zkb.a;
            t5Var.setTag(2131296711, null);
            this.G.setBackgroundColor(i);
        }
    }

    public void setActionModeOverrideColor(int i) {
        this.x = i;
    }

    public void setActionModeTopColor(int i) {
        View view = this.w;
        if (view != null) {
            zkb.q(view);
            this.w.setBackgroundColor(i);
        }
    }

    public void setAdaptiveBackground(tu9 tu9Var) {
        float f;
        int i = bkb.Z6;
        int i2 = bkb.r8;
        this.B1 = i;
        this.C1 = i2;
        this.A1 = gl.O1();
        i();
        ee2 ee2Var = new ee2(this, tu9Var, (byte) 18);
        tu9Var.M.add(ee2Var);
        if (this.z1) {
            ee2Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = tu9Var.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        if (!canScrollVertically) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.E1 = f;
        i();
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
        if (drawable instanceof ed0) {
            ed0 ed0Var = (ed0) drawable;
            if (y()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ed0Var.c(false, f);
            ed0Var.b(this.t0);
            ed0Var.a(this.s0);
        } else if (drawable instanceof a07) {
            a07 a07Var = (a07) drawable;
            a07Var.k = this.y;
            a07Var.j = this.s0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        if (this.d1) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.s0, PorterDuff.Mode.SRC_IN));
        }
        l();
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
        l();
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
            if (drawable instanceof a07) {
                ((a07) drawable).k = i;
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
        jia[] jiaVarArr = this.n;
        int length = jiaVarArr.length;
        int i2 = 0;
        while (true) {
            i = 19;
            if (i2 >= length) {
                break;
            }
            jia jiaVar = jiaVarArr[i2];
            if (jiaVar != null) {
                if (z) {
                    i = 17;
                }
                jiaVar.setGravity(i);
            }
            i2++;
        }
        jia jiaVar2 = this.r;
        if (jiaVar2 != null) {
            if (z) {
                i = 17;
            }
            jiaVar2.setGravity(i);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(o72 o72Var) {
        this.T0 = o72Var;
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

    public void setDrawBlurBackground(cja cjaVar) {
        this.M0 = true;
        this.L0 = cjaVar;
        cjaVar.P.add(this);
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
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setEnabled(z);
        }
        t5 t5Var = this.G;
        if (t5Var != null) {
            t5Var.setEnabled(z);
        }
    }

    public void setExtraHeight(int i) {
        this.P = i;
        t5 t5Var = this.G;
        if (t5Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
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
        il0 il0Var = this.a;
        if (il0Var != null && il0Var.c != i) {
            il0Var.setAlpha(i);
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
        jx4 jx4Var = this.Y0;
        if (jx4Var != null) {
            jx4Var.k(f);
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
        t5 t5Var = this.G;
        if (t5Var != null) {
            if (z) {
                i = gl.m;
            } else {
                i = 0;
            }
            t5Var.setPadding(0, i, 0, 0);
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
        jia[] jiaVarArr = this.n;
        jia jiaVar = jiaVarArr[0];
        if (jiaVar != null) {
            jiaVar.setRightDrawableOnClick(onClickListener);
        }
        jia jiaVar2 = jiaVarArr[1];
        if (jiaVar2 != null) {
            jiaVar2.setRightDrawableOnClick(this.f0);
        }
    }

    public void setSearchAvatarImageView(be0 be0Var) {
        be0 be0Var2 = this.f;
        if (be0Var2 != be0Var) {
            if (be0Var2 != null) {
                removeView(be0Var2);
            }
            this.f = be0Var;
            if (be0Var != null) {
                addView(be0Var);
            }
        }
    }

    public void setSearchCursorColor(int i) {
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setSearchCursorColor(i);
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

    public void setSearchFilter(rf4 rf4Var) {
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setFilter(rf4Var);
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
            u();
        }
        if (this.r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            jia jiaVar = this.r;
            if (!isEmpty && !this.o0) {
                i = 0;
            } else {
                i = 8;
            }
            jiaVar.setVisibility(i);
            this.r.setAlpha(1.0f);
            if (!isEmpty) {
                this.r.l(charSequence, false);
            }
            this.B0 = charSequence;
        }
    }

    public void setSubtitleColor(int i) {
        if (this.r == null) {
            u();
        }
        zkb.q(this.r);
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
        jia[] jiaVarArr = this.n;
        if (jiaVarArr[0] == null) {
            v(0);
        }
        this.w0 = i;
        zkb.q(jiaVarArr[0]);
        jiaVarArr[0].setTextColor(i);
        jiaVarArr[0].setEmojiColor(i);
        jia jiaVar = jiaVarArr[1];
        if (jiaVar != null) {
            zkb.q(jiaVar);
            jiaVarArr[1].setTextColor(i);
            jiaVarArr[1].setEmojiColor(i);
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

    public final r6 t() {
        r6 r6Var = this.F;
        if (r6Var != null) {
            return r6Var;
        }
        r6 r6Var2 = new r6(getContext(), this);
        this.F = r6Var2;
        addView(r6Var2, 0, nme.e(-2, -1, 5));
        return this.F;
    }

    public final void u() {
        if (this.r != null) {
            return;
        }
        jia jiaVar = new jia(getContext());
        this.r = jiaVar;
        jiaVar.setGravity(3);
        this.r.setVisibility(8);
        zkb.W(this.r, bkb.A8, this.K0);
        addView(this.r, 0, nme.e(-2, -2, 51));
    }

    @Override
    public final void updateColors() {
        i();
        il0 il0Var = this.a;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        il0 il0Var2 = this.c;
        if (il0Var2 != null) {
            il0Var2.updateColors();
        }
        il0 il0Var3 = this.b;
        if (il0Var3 != null) {
            il0Var3.updateColors();
        }
        b6 b6Var = this.y1;
        if (b6Var != null) {
            b6Var.b();
        }
    }

    public final void v(int i) {
        int i2;
        View[] viewArr = this.n;
        if (viewArr[i] != null) {
            return;
        }
        jia jiaVar = new jia(getContext());
        viewArr[i] = jiaVar;
        if (this.I0) {
            i2 = 17;
        } else {
            i2 = 19;
        }
        jiaVar.setGravity(i2);
        int i3 = this.w0;
        if (i3 != 0) {
            viewArr[i].setTextColor(i3);
        } else {
            zkb.W(viewArr[i], bkb.z8, this.K0);
        }
        jia jiaVar2 = viewArr[i];
        jiaVar2.setEmojiColor(jiaVar2.getTextColor());
        viewArr[i].setTypeface(gl.o());
        viewArr[i].setDrawablePadding(gl.L(4.0f));
        viewArr[i].setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        viewArr[i].setRightDrawableTopPadding(-gl.L(1.0f));
        if (this.H0) {
            this.G0.addView(viewArr[i], 0, nme.e(-2, -2, 51));
        } else {
            addView(viewArr[i], 0, nme.e(-2, -2, 51));
        }
    }

    public void x() {
        t5 t5Var = this.G;
        if (t5Var != null && this.K) {
            int childCount = t5Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t5Var.getChildAt(i);
                if (childAt instanceof r7) {
                    ((r7) childAt).p();
                }
            }
            this.K = false;
            m();
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
            jia[] jiaVarArr = this.n;
            if (!z) {
                jia jiaVar = jiaVarArr[0];
                if (jiaVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(jiaVar, property, 1.0f));
                }
                if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.r, property, 1.0f));
                }
            }
            r6 r6Var = this.F;
            if (r6Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(r6Var, property, 1.0f));
            }
            int i3 = this.y;
            if (i3 != 0 && !this.Q0) {
                if (bm2.h(i3) < 0.699999988079071d) {
                    gl.k3((Activity) getContext(), false);
                } else {
                    gl.k3((Activity) getContext(), true);
                }
            } else {
                kk7.e().k(kk7.t4, new Object[0]);
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
                ofFloat.addUpdateListener(new q5(this, (byte) 0));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new v5(this, (byte) 0));
            this.Q.start();
            if (!this.o0) {
                jia jiaVar2 = jiaVarArr[0];
                if (jiaVar2 != null) {
                    jiaVar2.setVisibility(0);
                }
                if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                    this.r.setVisibility(0);
                }
            }
            r6 r6Var2 = this.F;
            if (r6Var2 != null) {
                r6Var2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof ed0) {
                    ((ed0) drawable).c(true, 0.0f);
                }
                this.e.setBackgroundDrawable(bkb.f0(this.q0, 1, -1));
            }
        }
    }

    public final boolean y() {
        if (this.G != null && this.K) {
            return true;
        }
        return false;
    }

    public final boolean z(String str) {
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

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void F(float f, int i) {
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        E(recyclerView, bkb.Z6, bkb.r8);
    }
}
