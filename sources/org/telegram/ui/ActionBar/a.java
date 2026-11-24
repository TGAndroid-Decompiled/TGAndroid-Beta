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
public class a extends FrameLayout implements g94, vlb, h27 {
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
    public final ylb K0;
    public boolean L;
    public ela L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public final Paint N0;
    public boolean O;
    public final Rect O0;
    public int P;
    public final yh4 P0;
    public AnimatorSet Q;
    public boolean Q0;
    public View[] R;
    public boolean R0;
    public boolean S;
    public boolean S0;
    public dma T;
    public z82 T0;
    public sj4 U;
    public boolean U0;
    public Paint.FontMetricsInt V;
    public km0 V0;
    public boolean W;
    public nm0 W0;
    public km0 X0;
    public lz4 Y0;
    public int Z0;
    public im0 a;
    public Rect a0;
    public bka a1;
    public im0 b;
    public int b0;
    public r7 b1;
    public im0 c;
    public boolean c0;
    public final RectF c1;
    public final ok5 d;
    public CharSequence d0;
    public boolean d1;
    public ImageView e;
    public tm e0;
    public Runnable e1;
    public bf0 f;
    public View.OnClickListener f0;
    public kf9 f1;
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
    public final h94 m1;
    public final lka[] n;
    public boolean n0;
    public final fn0 n1;
    public boolean o0;
    public final h94 o1;
    public float p0;
    public final fn0 p1;
    public int q0;
    public int q1;
    public lka r;
    public int r0;
    public int r1;
    public lka s;
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

    public a(Context context, ylb ylbVar) {
        super(context);
        this.d = ok5.a;
        this.n = new lka[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.h0 = new Object[3];
        this.l0 = true;
        this.m0 = 255;
        this.w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new yh4(this);
        this.c1 = new RectF();
        d53 d53Var = d53.h;
        this.m1 = new h94(0, this, d53Var, 380L);
        this.n1 = new fn0(0, this, d53Var, 380L, false);
        this.o1 = new h94(0, this, d53Var, 320L);
        this.p1 = new fn0(0, this, d53Var, 320L, false);
        this.w1 = true;
        this.x1 = 255;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = ylbVar;
        setOnClickListener(new r5(this, (byte) 0));
    }

    public static int getCurrentActionBarHeight() {
        if (gm.O1()) {
            return gm.L(58.0f);
        }
        Point point = gm.q;
        if (point.x > point.y) {
            return gm.L(48.0f);
        }
        return gm.L(56.0f);
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
        n();
        AnimatorSet animatorSet = this.g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.g1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean A = A();
        if (!A) {
            lka lkaVar = this.n[0];
            if (lkaVar != null) {
                arrayList.add(lkaVar);
            }
            if (this.r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(this.r);
                lka lkaVar2 = this.r;
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                lkaVar2.setVisibility(i);
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
        bf0 bf0Var = this.f;
        if (bf0Var != null) {
            bf0Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.g1;
            bf0 bf0Var2 = this.f;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(bf0Var2, property, f2));
        }
        this.A0 = true;
        requestLayout();
        this.g1.addListener(new w5(this, arrayList, z, A));
        this.g1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof a27) {
                a27 a27Var = (a27) drawable;
                a27Var.h = true;
                if (z) {
                    f6 = 1.0f;
                }
                a27Var.a(true, f6);
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

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        invalidate();
    }

    public final void E() {
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

    public final void F(RecyclerView recyclerView, int i, int i2) {
        float f;
        this.B1 = i;
        this.C1 = i2;
        this.A1 = gm.O1();
        pf2 pf2Var = new pf2(this, recyclerView, (byte) 19);
        recyclerView.j(new y(pf2Var, (byte) 1));
        if (this.z1) {
            pf2Var.run();
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
                imageView.setBackgroundDrawable(cmb.f0(i, 1, -1));
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
            imageView2.setBackgroundDrawable(cmb.f0(i, 1, -1));
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
                if (drawable instanceof ee0) {
                    ((ee0) drawable).b(i);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.s0 = i;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof ee0) {
                    ((ee0) drawable2).a(i);
                } else if (drawable2 instanceof a27) {
                    ((a27) drawable2).j = i;
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

    public final void M(CharSequence charSequence, tm tmVar) {
        int i;
        lka[] lkaVarArr = this.n;
        if (charSequence != null && lkaVarArr[0] == null) {
            v(0);
        }
        lka lkaVar = lkaVarArr[0];
        if (lkaVar != null) {
            if (charSequence != null && !this.o0) {
                i = 0;
            } else {
                i = 4;
            }
            lkaVar.setVisibility(i);
            lka lkaVar2 = lkaVarArr[0];
            this.d0 = charSequence;
            lkaVar2.k(charSequence);
            if (this.D0) {
                tm tmVar2 = this.e0;
                if (wi8.A(tmVar2)) {
                    tmVar2.l(null);
                }
            }
            lka lkaVar3 = lkaVarArr[0];
            this.e0 = tmVar;
            lkaVar3.i(tmVar);
            if (this.D0) {
                tm tmVar3 = this.e0;
                if (wi8.A(tmVar3)) {
                    tmVar3.l(lkaVarArr[0]);
                }
            }
            lkaVarArr[0].setRightDrawableOnClick(this.f0);
        }
        this.z0 = false;
    }

    public final void N(CharSequence charSequence, boolean z, long j, d53 d53Var) {
        boolean z2;
        float f;
        lka[] lkaVarArr = this.n;
        if (lkaVarArr[0] != null && charSequence != null) {
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
                wi8.s(animate, f, 220L);
            }
            lka lkaVar = lkaVarArr[1];
            if (lkaVar != null) {
                if (lkaVar.getParent() != null) {
                    ((ViewGroup) lkaVarArr[1].getParent()).removeView(lkaVarArr[1]);
                }
                lkaVarArr[1] = null;
            }
            lkaVarArr[1] = lkaVarArr[0];
            lkaVarArr[0] = null;
            setTitle(charSequence);
            this.z0 = z;
            lkaVarArr[0].setAlpha(0.0f);
            if (!z2) {
                lka lkaVar2 = lkaVarArr[0];
                int L = gm.L(20.0f);
                if (!z) {
                    L = -L;
                }
                lkaVar2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = lkaVarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
            if (d53Var != null) {
                duration.setInterpolator(d53Var);
            }
            duration.start();
            this.y0 = true;
            ViewPropertyAnimator alpha = lkaVarArr[1].animate().alpha(0.0f);
            if (!z2) {
                int L2 = gm.L(20.0f);
                if (z) {
                    L2 = -L2;
                }
                alpha.translationY(L2);
            }
            if (d53Var != null) {
                alpha.setInterpolator(d53Var);
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
        lka lkaVar;
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
                tm tmVar = null;
                if (this.y1 != null) {
                    if (i == 2131751742) {
                        spannableStringBuilder = gm.E2(jb6.M0(2131743798, null), true, gm.L(2.6666667f), gm.L(2.0f));
                    } else {
                        spannableStringBuilder = null;
                    }
                    this.y1.a(spannableStringBuilder, true);
                }
                if (str != null) {
                    str2 = jb6.M0(i, str);
                } else {
                    CharSequence charSequence = this.d0;
                    tmVar = this.e0;
                    str2 = charSequence;
                }
                yh4 yh4Var = this.P0;
                if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                    SpannableString valueOf = SpannableString.valueOf(str2);
                    yh4Var.M(valueOf, indexOf);
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
                lka[] lkaVarArr = this.n;
                if ((spannableString == null || lkaVarArr[0] != null) && getMeasuredWidth() != 0 && ((lkaVar = lkaVarArr[0]) == null || lkaVar.getVisibility() == 0)) {
                    lka lkaVar2 = lkaVarArr[0];
                    if (lkaVar2 != null) {
                        lkaVar2.animate().cancel();
                        lka lkaVar3 = lkaVarArr[1];
                        if (lkaVar3 != null) {
                            lkaVar3.animate().cancel();
                        }
                        if (lkaVarArr[1] == null) {
                            v(1);
                        }
                        lkaVarArr[1].k(spannableString);
                        lkaVarArr[1].setDrawablePadding(gm.L(4.0f));
                        lkaVarArr[1].i(tmVar);
                        lkaVarArr[1].setRightDrawableOnClick(this.f0);
                        if (wi8.A(tmVar)) {
                            tmVar.l(lkaVarArr[1]);
                        }
                        if (z) {
                            yh4Var.d(lkaVarArr[1]);
                        }
                        this.j1 = true;
                        float alpha = lkaVarArr[0].getAlpha();
                        lka lkaVar4 = lkaVarArr[1];
                        lkaVarArr[1] = lkaVarArr[0];
                        lkaVarArr[0] = lkaVar4;
                        lkaVar4.setAlpha(0.0f);
                        lkaVarArr[0].setTranslationY(-gm.L(20.0f));
                        lkaVarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                        ViewPropertyAnimator alpha2 = lkaVarArr[1].animate().alpha(0.0f);
                        if (this.r == null) {
                            alpha2.translationY(gm.L(20.0f));
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
                        lkaVarArr[0].invalidate();
                        invalidate();
                    }
                    lkaVarArr[0].k(spannableString);
                    lkaVarArr[0].setDrawablePadding(gm.L(4.0f));
                    lkaVarArr[0].i(tmVar);
                    lkaVarArr[0].setRightDrawableOnClick(this.f0);
                    if (wi8.A(tmVar)) {
                        tmVar.l(lkaVarArr[0]);
                    }
                    if (z) {
                        yh4Var.d(lkaVarArr[0]);
                    } else {
                        yh4Var.F(lkaVarArr[0]);
                    }
                }
                if (runnable == null) {
                    runnable = this.i0;
                }
                this.k0 = runnable;
            }
        }
    }

    public final void P(km0 km0Var, nm0 nm0Var, boolean z) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z;
        this.V0 = km0Var;
        this.W0 = nm0Var;
        im0 c = km0Var.c(this, null, false);
        c.p(nm0Var);
        c.q(gm.L(6.0f));
        this.a = c;
        if (z) {
            c.s(gm.L(18.33f), gm.L(23.0f), gm.L(23.0f), gm.L(18.33f));
        } else {
            c.r(gm.L(23.0f));
        }
        im0 c2 = km0Var.c(this, null, false);
        c2.p(nm0Var);
        wi8.r(c2, gm.L(23.0f), 6.0f);
        this.b = c2;
        im0 c3 = km0Var.c(this, null, false);
        c3.p(nm0Var);
        wi8.r(c3, gm.L(23.0f), 6.0f);
        this.c = c3;
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setTranslationX(-gm.L(10.0f));
            this.F.setGlassMode(true);
        }
        t5 t5Var = this.G;
        if (t5Var != null) {
            t5Var.setTranslationX(-gm.L(10.0f));
            this.G.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(gm.L(2.0f));
        }
    }

    public boolean Q(View view) {
        if (this.M) {
            lka[] lkaVarArr = this.n;
            if (view == lkaVarArr[0] || view == lkaVarArr[1] || view == this.r || view == this.F || view == this.e || view == this.s || view == this.G0) {
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
                    lka lkaVar = this.n[0];
                    if (lkaVar != null) {
                        arrayList.add(ObjectAnimator.ofFloat(lkaVar, property, 0.0f));
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
                if (on2.h(i) < 0.699999988079071d) {
                    gm.k3((Activity) getContext(), false);
                } else {
                    gm.k3((Activity) getContext(), true);
                }
            } else {
                nm7.e().k(nm7.v4, new Object[0]);
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
                if (drawable instanceof ee0) {
                    ((ee0) drawable).c(true, 1.0f);
                }
                this.e.setBackgroundDrawable(cmb.f0(this.r0, 1, -1));
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
            yh4 yh4Var = this.P0;
            if (z) {
                yh4Var.a = true;
                AnimatorSet animatorSet = (AnimatorSet) yh4Var.d;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            yh4Var.a = false;
            ((AnimatorSet) yh4Var.d).cancel();
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
    public final void b(bka bkaVar, r7 r7Var) {
        this.a1 = bkaVar;
        this.b1 = r7Var;
        invalidate();
    }

    @Override
    public final boolean c(r7 r7Var, RectF rectF) {
        int L;
        int L2 = gm.L(6.0f);
        float f = 0.0f;
        if (r7Var.getParent() == this.F && this.c != null && !this.v1 && !this.R0 && this.l1 == 0.0f && getActionModeFactor() == 0.0f && !this.c.getBounds().isEmpty()) {
            rectF.set(this.c.getBounds());
            float f2 = L2;
            rectF.inset(f2, f2);
            return true;
        }
        float L3 = gm.L(46.0f) / 2.0f;
        View view = (View) r7Var.getParent();
        if (view != null) {
            f = view.getX();
        }
        float width = (r7Var.getWidth() / 2.0f) + r7Var.getX() + f;
        float height = ((getHeight() - this.P) - ((getCurrentActionBarHeight() + L) / 2.0f)) + L3;
        rectF.set(width - L3, height - L3, width + L3, height + L3);
        return false;
    }

    @Override
    public final boolean d() {
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
            im0 im0Var = this.a;
            boolean z3 = true;
            if (im0Var != null && im0Var.getBounds().contains(x, y)) {
                z = true;
            } else {
                z = false;
            }
            if (w != null && w != this.T0) {
                im0 im0Var2 = this.b;
                if (im0Var2 != null && im0Var2.getBounds().contains(x, y)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                im0 im0Var3 = this.c;
                if (im0Var3 == null || !im0Var3.getBounds().contains(x, y)) {
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
        return true;
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

    public lka getAdditionalSubtitleTextView() {
        return this.s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public ok5 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.y;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        nm0 nm0Var = this.W0;
        if (nm0Var != null) {
            return nm0Var.a(nm0Var.e);
        }
        return 0;
    }

    @Override
    public am0 getButtonsGlassColorProvider() {
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
    public am0 getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public ylb getMenuResourcesProvider() {
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
    public bka getOpenMenuOverlay() {
        return this.a1;
    }

    public bf0 getSearchAvatarImageView() {
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
        lka lkaVar = this.r;
        if (lkaVar != null) {
            return lkaVar.getTextColor();
        }
        return 0;
    }

    public lka getSubtitleTextView() {
        return this.r;
    }

    public String getTitle() {
        lka lkaVar = this.n[0];
        if (lkaVar == null) {
            return null;
        }
        return lkaVar.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f;
        lka lkaVar = this.n[0];
        if (lkaVar == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!gm.O1() && getResources().getConfiguration().orientation == 2) {
                f = 18.0f;
            } else {
                f = 20.0f;
            }
            textPaint.setTextSize(gm.L(f));
            return textPaint.getFontMetricsInt();
        }
        return lkaVar.getPaint().getFontMetricsInt();
    }

    public lka getTitleTextView() {
        return this.n[0];
    }

    public lka getTitleTextView2() {
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
    public final im0 i(bka bkaVar) {
        km0 km0Var = this.X0;
        if (km0Var == null) {
            km0Var = this.V0;
        }
        if (km0Var == null) {
            return null;
        }
        im0 c = km0Var.c(bkaVar, null, false);
        c.p(this.W0);
        wi8.r(c, gm.L(23.0f), 6.0f);
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
            ylb ylbVar = this.K0;
            if (i == -1) {
                v0 = 0;
            } else {
                v0 = cmb.v0(i, ylbVar);
            }
            int i2 = this.B1;
            if (i2 == -1) {
                v02 = 0;
            } else {
                v02 = cmb.v0(i2, ylbVar);
            }
            if (v02 == 0) {
                v02 = on2.p(v0, 0);
            }
            if (v0 == 0) {
                v0 = on2.p(v02, 0);
            }
            setBackgroundColor(on2.f(f, v0, v02));
            setShadowAlpha((int) ((1.0f - f) * 255.0f));
            if (this.M0) {
                invalidate();
            }
        }
    }

    public final void k() {
        if (!jb6.a0) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new z5((byte) 0));
            this.A0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) d53.f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void l(boolean z) {
        boolean z2;
        float f;
        z82 z82Var = this.T0;
        if (z82Var == null) {
            return;
        }
        v82 v82Var = z82Var.e;
        if (v82Var != null && v82Var.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int min = Math.min(getMeasuredWidth() - gm.L(116.0f), this.T0.getVisualWidth());
        h94 h94Var = this.m1;
        if (z) {
            if (h94Var.h) {
                f = h94Var.g;
            } else {
                f = h94Var.f;
            }
            float f2 = min;
            if (f != f2) {
                h94Var.a(f2);
            }
        } else {
            h94Var.c(min);
        }
        this.n1.a(z2, z);
    }

    public final void m() {
        int i;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof ee0) && !(drawable instanceof a27)) {
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
        r6 r6Var = this.F;
        boolean z = false;
        if (r6Var != null) {
            i = (r6Var.getItemsWidth() - gm.L(1.0f)) - gm.L(1.0f);
        } else {
            i = 0;
        }
        int max = Math.max(0, i);
        t5 t5Var = this.G;
        if (t5Var != null) {
            i2 = (t5Var.getItemsWidth() - gm.L(1.0f)) - gm.L(1.0f);
        } else {
            i2 = 0;
        }
        int max2 = Math.max(0, i2);
        Typeface typeface = gm.a;
        if (this.K) {
            max = max2;
        }
        if (max > 0) {
            z = true;
        }
        this.p1.a(z, this.u1);
        h94 h94Var = this.o1;
        if (h94Var.h) {
            f = h94Var.g;
        } else {
            f = h94Var.f;
        }
        float f2 = max;
        if (f != f2) {
            if (this.u1) {
                h94Var.a(f2);
            } else {
                h94Var.c(f2);
            }
        }
    }

    public void o(boolean z) {
        r6 r6Var;
        if (this.o0 && (r6Var = this.F) != null) {
            r6Var.i(z);
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
                if (on2.h(i) < 0.699999988079071d) {
                    gm.k3((Activity) getContext(), false);
                } else {
                    gm.k3((Activity) getContext(), true);
                }
            } else {
                nm7.e().k(nm7.v4, new Object[0]);
            }
        }
        tm tmVar = this.e0;
        if (wi8.A(tmVar)) {
            tmVar.l(this.n[0]);
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
                if (on2.h(i) < 0.699999988079071d) {
                    gm.k3((Activity) getContext(), false);
                } else {
                    gm.k3((Activity) getContext(), true);
                }
            } else {
                nm7.e().k(nm7.v4, new Object[0]);
            }
        }
        tm tmVar = this.e0;
        if (wi8.A(tmVar)) {
            tmVar.l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable z0;
        if (this.S && !this.j0 && !jb6.a0 && motionEvent.getAction() == 0 && (z0 = cmb.z0()) != null && z0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            dma dmaVar = this.T;
            lka[] lkaVarArr = this.n;
            if (dmaVar == null) {
                this.U = null;
                this.T = new dma(0);
                lkaVarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                ?? obj = new Object();
                obj.c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.b = paint;
                paint.setStrokeWidth(gm.L(1.5f));
                paint.setColor(cmb.w0(null, cmb.z8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i = 0; i < 20; i++) {
                    ((ArrayList) obj.d).add(new rj4(obj));
                }
                this.U = obj;
                lkaVarArr[0].invalidate();
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

    public final r6 p() {
        return q(null);
    }

    public final r6 q(String str) {
        float f;
        int i;
        boolean e = e(str);
        t5 t5Var = this.G;
        if (e) {
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
            f = -gm.L(10.0f);
        } else {
            f = 0.0f;
        }
        t5Var2.setTranslationX(f);
        this.G.setGlassMode(this.Q0);
        t5 t5Var3 = this.G;
        t5Var3.c = true;
        t5Var3.setClickable(true);
        if (!this.Q0) {
            anb.h(cmb.v8, this.K0, this.G);
        }
        addView(this.G, indexOfChild(this.e));
        t5 t5Var4 = this.G;
        if (this.J) {
            i = gm.m;
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
        lka lkaVar = new lka(getContext());
        this.s = lkaVar;
        lkaVar.setGravity(3);
        this.s.setVisibility(8);
        anb.W(this.s, cmb.A8, this.K0);
        addView(this.s, 0, qoe.e(-2, -2, 51));
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
        this.e.setBackgroundDrawable(cmb.f0(this.q0, 1, -1));
        this.e.setPadding(gm.L(1.0f), 0, 0, 0);
        addView(this.e, qoe.e(54, 54, 51));
        this.e.setOnClickListener(new r5(this, (byte) 1));
        this.e.setContentDescription(jb6.M0(2131754878, null));
    }

    public void setActionBarMenuOnItemClick(c6 c6Var) {
        this.v0 = c6Var;
    }

    public void setActionModeColor(int i) {
        t5 t5Var = this.G;
        if (t5Var != null) {
            zmb zmbVar = anb.a;
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
            anb.q(view);
            this.w.setBackgroundColor(i);
        }
    }

    public void setAdaptiveBackground(ww9 ww9Var) {
        float f;
        int i = cmb.Z6;
        int i2 = cmb.r8;
        this.B1 = i;
        this.C1 = i2;
        this.A1 = gm.O1();
        j();
        pf2 pf2Var = new pf2(this, ww9Var, (byte) 18);
        ww9Var.M.add(pf2Var);
        if (this.z1) {
            pf2Var.run();
            return;
        }
        this.z1 = true;
        boolean canScrollVertically = ww9Var.canScrollVertically(-1);
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
        if (drawable instanceof ee0) {
            ee0 ee0Var = (ee0) drawable;
            if (y()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ee0Var.c(false, f);
            ee0Var.b(this.t0);
            ee0Var.a(this.s0);
        } else if (drawable instanceof a27) {
            a27 a27Var = (a27) drawable;
            a27Var.k = this.y;
            a27Var.j = this.s0;
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
            if (drawable instanceof a27) {
                ((a27) drawable).k = i;
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
        lka[] lkaVarArr = this.n;
        int length = lkaVarArr.length;
        int i2 = 0;
        while (true) {
            i = 19;
            if (i2 >= length) {
                break;
            }
            lka lkaVar = lkaVarArr[i2];
            if (lkaVar != null) {
                if (z) {
                    i = 17;
                }
                lkaVar.setGravity(i);
            }
            i2++;
        }
        lka lkaVar2 = this.r;
        if (lkaVar2 != null) {
            if (z) {
                i = 17;
            }
            lkaVar2.setGravity(i);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(z82 z82Var) {
        this.T0 = z82Var;
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

    public void setDrawBlurBackground(ela elaVar) {
        this.M0 = true;
        this.L0 = elaVar;
        elaVar.P.add(this);
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
        im0 im0Var = this.a;
        if (im0Var != null && im0Var.c != i) {
            im0Var.setAlpha(i);
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
        lz4 lz4Var = this.Y0;
        if (lz4Var != null) {
            lz4Var.k(f);
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
                i = gm.m;
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
        lka[] lkaVarArr = this.n;
        lka lkaVar = lkaVarArr[0];
        if (lkaVar != null) {
            lkaVar.setRightDrawableOnClick(onClickListener);
        }
        lka lkaVar2 = lkaVarArr[1];
        if (lkaVar2 != null) {
            lkaVar2.setRightDrawableOnClick(this.f0);
        }
    }

    public void setSearchAvatarImageView(bf0 bf0Var) {
        bf0 bf0Var2 = this.f;
        if (bf0Var2 != bf0Var) {
            if (bf0Var2 != null) {
                removeView(bf0Var2);
            }
            this.f = bf0Var;
            if (bf0Var != null) {
                addView(bf0Var);
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

    public void setSearchFilter(sh4 sh4Var) {
        r6 r6Var = this.F;
        if (r6Var != null) {
            r6Var.setFilter(sh4Var);
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
            lka lkaVar = this.r;
            if (!isEmpty && !this.o0) {
                i = 0;
            } else {
                i = 8;
            }
            lkaVar.setVisibility(i);
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
        anb.q(this.r);
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
        lka[] lkaVarArr = this.n;
        if (lkaVarArr[0] == null) {
            v(0);
        }
        this.w0 = i;
        anb.q(lkaVarArr[0]);
        lkaVarArr[0].setTextColor(i);
        lkaVarArr[0].setEmojiColor(i);
        lka lkaVar = lkaVarArr[1];
        if (lkaVar != null) {
            anb.q(lkaVar);
            lkaVarArr[1].setTextColor(i);
            lkaVarArr[1].setEmojiColor(i);
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
        addView(r6Var2, 0, qoe.e(-2, -1, 5));
        return this.F;
    }

    public final void u() {
        if (this.r != null) {
            return;
        }
        lka lkaVar = new lka(getContext());
        this.r = lkaVar;
        lkaVar.setGravity(3);
        this.r.setVisibility(8);
        anb.W(this.r, cmb.A8, this.K0);
        addView(this.r, 0, qoe.e(-2, -2, 51));
    }

    @Override
    public final void updateColors() {
        j();
        im0 im0Var = this.a;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        im0 im0Var2 = this.c;
        if (im0Var2 != null) {
            im0Var2.updateColors();
        }
        im0 im0Var3 = this.b;
        if (im0Var3 != null) {
            im0Var3.updateColors();
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
        lka lkaVar = new lka(getContext());
        viewArr[i] = lkaVar;
        if (this.I0) {
            i2 = 17;
        } else {
            i2 = 19;
        }
        lkaVar.setGravity(i2);
        int i3 = this.w0;
        if (i3 != 0) {
            viewArr[i].setTextColor(i3);
        } else {
            anb.W(viewArr[i], cmb.z8, this.K0);
        }
        lka lkaVar2 = viewArr[i];
        lkaVar2.setEmojiColor(lkaVar2.getTextColor());
        viewArr[i].setTypeface(gm.o());
        viewArr[i].setDrawablePadding(gm.L(4.0f));
        viewArr[i].setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        viewArr[i].setRightDrawableTopPadding(-gm.L(1.0f));
        if (this.H0) {
            this.G0.addView(viewArr[i], 0, qoe.e(-2, -2, 51));
        } else {
            addView(viewArr[i], 0, qoe.e(-2, -2, 51));
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
            lka[] lkaVarArr = this.n;
            if (!z) {
                lka lkaVar = lkaVarArr[0];
                if (lkaVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(lkaVar, property, 1.0f));
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
                if (on2.h(i3) < 0.699999988079071d) {
                    gm.k3((Activity) getContext(), false);
                } else {
                    gm.k3((Activity) getContext(), true);
                }
            } else {
                nm7.e().k(nm7.v4, new Object[0]);
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
                lka lkaVar2 = lkaVarArr[0];
                if (lkaVar2 != null) {
                    lkaVar2.setVisibility(0);
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
                if (drawable instanceof ee0) {
                    ((ee0) drawable).c(true, 0.0f);
                }
                this.e.setBackgroundDrawable(cmb.f0(this.q0, 1, -1));
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
    public final void V(float f, int i) {
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        F(recyclerView, cmb.Z6, cmb.r8);
    }
}
