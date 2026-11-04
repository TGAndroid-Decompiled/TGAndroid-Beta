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
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.pu0;
public class k extends FrameLayout implements qe.b, z5, s4 {
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
    public x F;
    public boolean F0;
    public ValueAnimator F1;
    public d G;
    public ai.d2 G0;
    public String H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final e6 K0;
    public boolean L;
    public qt0 L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public final Paint N0;
    public boolean O;
    public final Rect O0;
    public int P;
    public final b4.n P0;
    public AnimatorSet Q;
    public boolean Q0;
    public View[] R;
    public boolean R0;
    public boolean S;
    public boolean S0;
    public bu0 T;
    public jn T0;
    public ez U;
    public boolean U0;
    public Paint.FontMetricsInt V;
    public eh.c V0;
    public boolean W;
    public hh.e W0;
    public eh.c X0;
    public si.d Y0;
    public int Z0;
    public gh.g f27697a;
    public Rect f27698a0;
    public i5 f27699a1;
    public gh.g f27700b;
    public int f27701b0;
    public q0 f27702b1;
    public gh.g f27703c;
    public boolean f27704c0;
    public final RectF f27705c1;
    public final m4 d;
    public CharSequence f27706d0;
    public boolean f27707d1;
    public ImageView f27708e;
    public Drawable f27709e0;
    public Runnable f27710e1;
    public k9 f27711f;
    public View.OnClickListener f27712f0;
    public pu0 f27713f1;
    public String f27714g0;
    public AnimatorSet f27715g1;
    public Drawable h;
    public final Object[] f27716h0;
    public int f27717h1;
    public Runnable f27718i0;
    public int f27719i1;
    public boolean f27720j0;
    public boolean f27721j1;
    public Runnable f27722k0;
    public boolean k1;
    public boolean f27723l0;
    public float f27724l1;
    public int m0;
    public final qe.c m1;
    public final k5[] f27725n;
    public boolean f27726n0;
    public final qe.a f27727n1;
    public boolean f27728o0;
    public final qe.c f27729o1;
    public float f27730p0;
    public final qe.a f27731p1;
    public int f27732q0;
    public int f27733q1;
    public k5 f27734r;
    public int f27735r0;
    public int f27736r1;
    public k5 f27737s;
    public int f27738s0;
    public boolean f27739s1;
    public int f27740t0;
    public boolean f27741t1;
    public d2 f27742u0;
    public boolean f27743u1;
    public j f27744v0;
    public boolean f27745v1;
    public View f27746w;
    public int f27747w0;
    public boolean f27748w1;
    public int f27749x;
    public boolean f27750x0;
    public int f27751x1;
    public int f27752y;
    public boolean f27753y0;
    public ei.k f27754y1;
    public boolean f27755z0;
    public boolean f27756z1;

    public k(Context context, e6 e6Var) {
        super(context);
        this.d = m4.f28340a;
        this.f27725n = new k5[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.f27716h0 = new Object[3];
        this.f27723l0 = true;
        this.m0 = 255;
        this.f27747w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new b4.n(this);
        this.f27705c1 = new RectF();
        xq xqVar = xq.h;
        this.m1 = new qe.c(0, this, xqVar, 380L);
        this.f27727n1 = new qe.a(0, this, xqVar, 380L, false);
        this.f27729o1 = new qe.c(0, this, xqVar, 320L);
        this.f27731p1 = new qe.a(0, this, xqVar, 320L, false);
        this.f27748w1 = true;
        this.f27751x1 = 255;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = e6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.g0.Q1()) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            return org.telegram.messenger.g0.L(48.0f);
        }
        return org.telegram.messenger.g0.L(56.0f);
    }

    public static View t(k kVar, float f10, float f11, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A() {
        x xVar = this.F;
        if (xVar != null) {
            boolean z10 = this.f27728o0;
            boolean z11 = !z10;
            int childCount = xVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = xVar.getChildAt(i3);
                if (childAt instanceof q0) {
                    q0 q0Var = (q0) childAt;
                    if (q0Var.u()) {
                        if (!z10) {
                            xVar.f28786b.y(q0Var.T(z11));
                        }
                        q0Var.P("", false);
                        q0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void B(RecyclerView recyclerView, int i3, int i10) {
        float f10;
        this.B1 = i3;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(4, this, recyclerView);
        recyclerView.j(new ai.j5(l0Var, 26));
        if (this.f27756z1) {
            l0Var.run();
            return;
        }
        this.f27756z1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        if (!canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.E1 = f10;
        f();
    }

    public final void C(int i3, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f27735r0 = i3;
            if (this.K && (imageView = this.f27708e) != null) {
                imageView.setBackgroundDrawable(k6.h0(i3, 1, -1));
            }
            d dVar = this.G;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f27732q0 = i3;
        ImageView imageView2 = this.f27708e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(k6.h0(i3, 1, -1));
        }
        x xVar = this.F;
        if (xVar != null) {
            xVar.s();
        }
    }

    public void D(int i3, boolean z10) {
        if (z10) {
            this.f27740t0 = i3;
            d dVar = this.G;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f27708e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof w1) {
                    ((w1) drawable).b(i3);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f27708e.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f27738s0 = i3;
            ImageView imageView2 = this.f27708e;
            if (imageView2 != null && i3 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof w1) {
                    ((w1) drawable2).a(i3);
                } else if (drawable2 instanceof r4) {
                    ((r4) drawable2).f28508j = i3;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f27708e.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                }
            }
            x xVar = this.F;
            if (xVar != null) {
                xVar.t();
            }
        }
        ImageView imageView3 = this.f27708e;
        if (imageView3 != null && this.f27707d1) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f27738s0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void E(int i3, boolean z10) {
        x xVar;
        d dVar;
        int i10 = 0;
        if (z10 && (dVar = this.G) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    ((q0) childAt).H(i3);
                }
                i10++;
            }
        } else if (!z10 && (xVar = this.F) != null) {
            int childCount2 = xVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = xVar.getChildAt(i10);
                if (childAt2 instanceof q0) {
                    ((q0) childAt2).H(i3);
                }
                i10++;
            }
        }
    }

    public final void G(int i3, boolean z10, boolean z11) {
        x xVar;
        d dVar;
        int i10 = 0;
        if (z11 && (dVar = this.G) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    ((q0) childAt).O(i3, z10);
                }
                i10++;
            }
        } else if (!z11 && (xVar = this.F) != null) {
            int childCount2 = xVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = xVar.getChildAt(i10);
                if (childAt2 instanceof q0) {
                    ((q0) childAt2).O(i3, z10);
                }
                i10++;
            }
        }
    }

    public final void H(int i3, boolean z10) {
        x xVar;
        d dVar;
        if (z10 && (dVar = this.G) != null) {
            dVar.setPopupItemsSelectorColor(i3);
        } else if (!z10 && (xVar = this.F) != null) {
            xVar.setPopupItemsSelectorColor(i3);
        }
    }

    public final void I(int i3, boolean z10) {
        x xVar = this.F;
        if (xVar != null) {
            int childCount = xVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = xVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    q0 q0Var = (q0) childAt;
                    if (q0Var.u()) {
                        if (z10) {
                            q0Var.getSearchField().setHintTextColor(i3);
                            return;
                        } else {
                            q0Var.getSearchField().setTextColor(i3);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void J(CharSequence charSequence, org.telegram.ui.Components.e5 e5Var) {
        int i3;
        k5[] k5VarArr = this.f27725n;
        if (charSequence != null && k5VarArr[0] == null) {
            s(0);
        }
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            if (charSequence != null && !this.f27728o0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            k5Var.setVisibility(i3);
            k5 k5Var2 = k5VarArr[0];
            this.f27706d0 = charSequence;
            k5Var2.k(charSequence);
            if (this.D0) {
                Drawable drawable = this.f27709e0;
                if (drawable instanceof org.telegram.ui.Components.e5) {
                    ((org.telegram.ui.Components.e5) drawable).l(null);
                }
            }
            k5 k5Var3 = k5VarArr[0];
            this.f27709e0 = e5Var;
            k5Var3.i(e5Var);
            if (this.D0) {
                Drawable drawable2 = this.f27709e0;
                if (drawable2 instanceof org.telegram.ui.Components.e5) {
                    ((org.telegram.ui.Components.e5) drawable2).l(k5VarArr[0]);
                }
            }
            k5VarArr[0].setRightDrawableOnClick(this.f27712f0);
        }
        this.f27755z0 = false;
    }

    public final void K(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        boolean z11;
        float f10;
        k5[] k5VarArr = this.f27725n;
        if (k5VarArr[0] != null && charSequence != null) {
            if (this.f27750x0 && !TextUtils.isEmpty(this.B0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f27734r.getVisibility() != 0) {
                    this.f27734r.setVisibility(0);
                    this.f27734r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f27734r.animate();
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.messenger.camera.q.k(animate, f10, 220L);
            }
            k5 k5Var = k5VarArr[1];
            if (k5Var != null) {
                if (k5Var.getParent() != null) {
                    ((ViewGroup) k5VarArr[1].getParent()).removeView(k5VarArr[1]);
                }
                k5VarArr[1] = null;
            }
            k5VarArr[1] = k5VarArr[0];
            k5VarArr[0] = null;
            setTitle(charSequence);
            this.f27755z0 = z10;
            k5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                k5 k5Var2 = k5VarArr[0];
                int L = org.telegram.messenger.g0.L(20.0f);
                if (!z10) {
                    L = -L;
                }
                k5Var2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = k5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f27753y0 = true;
            ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
            if (!z11) {
                int L2 = org.telegram.messenger.g0.L(20.0f);
                if (z10) {
                    L2 = -L2;
                }
                alpha.translationY(L2);
            }
            if (interpolator != null) {
                alpha.setInterpolator(interpolator);
            }
            alpha.setDuration(j10).setListener(new g(this, z11, z10, 0)).start();
            requestLayout();
            return;
        }
        setTitle(charSequence);
    }

    public final void L(String str, int i3, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        k5 k5Var;
        int indexOf;
        SpannableStringBuilder spannableStringBuilder;
        if (this.f27704c0 && this.f27742u0.parentLayout != null) {
            Object[] objArr = this.f27716h0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i3);
            objArr[2] = runnable;
            if (!this.f27721j1) {
                String str3 = this.f27714g0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f27714g0 = str;
                        Drawable drawable = null;
                        if (this.f27754y1 != null) {
                            if (i3 == 2131751805) {
                                spannableStringBuilder = org.telegram.messenger.g0.I2(bd.M0(2131744123, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f));
                            } else {
                                spannableStringBuilder = null;
                            }
                            this.f27754y1.c(spannableStringBuilder, true);
                        }
                        if (str != null) {
                            str2 = bd.M0(i3, str);
                        } else {
                            str2 = this.f27706d0;
                        }
                        if (str == null) {
                            drawable = this.f27709e0;
                        }
                        b4.n nVar = this.P0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            nVar.E(valueOf, indexOf);
                            z10 = true;
                            spannableString = valueOf;
                        } else {
                            z10 = false;
                            spannableString = str2;
                        }
                        if (str != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f27720j0 = z11;
                        k5[] k5VarArr = this.f27725n;
                        if ((spannableString == null || k5VarArr[0] != null) && getMeasuredWidth() != 0 && ((k5Var = k5VarArr[0]) == null || k5Var.getVisibility() == 0)) {
                            k5 k5Var2 = k5VarArr[0];
                            if (k5Var2 != null) {
                                k5Var2.animate().cancel();
                                k5 k5Var3 = k5VarArr[1];
                                if (k5Var3 != null) {
                                    k5Var3.animate().cancel();
                                }
                                if (k5VarArr[1] == null) {
                                    s(1);
                                }
                                k5VarArr[1].k(spannableString);
                                k5VarArr[1].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                                k5VarArr[1].i(drawable);
                                k5VarArr[1].setRightDrawableOnClick(this.f27712f0);
                                if (drawable instanceof org.telegram.ui.Components.e5) {
                                    ((org.telegram.ui.Components.e5) drawable).l(k5VarArr[1]);
                                }
                                if (z10) {
                                    nVar.c(k5VarArr[1]);
                                }
                                this.f27721j1 = true;
                                k5 k5Var4 = k5VarArr[1];
                                k5VarArr[1] = k5VarArr[0];
                                k5VarArr[0] = k5Var4;
                                k5Var4.setAlpha(0.0f);
                                k5VarArr[0].setTranslationY(-org.telegram.messenger.g0.L(20.0f));
                                k5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
                                if (this.f27734r == null) {
                                    alpha.translationY(org.telegram.messenger.g0.L(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.A0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            s(0);
                            if (this.S) {
                                k5VarArr[0].invalidate();
                                invalidate();
                            }
                            k5VarArr[0].k(spannableString);
                            k5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                            k5VarArr[0].i(drawable);
                            k5VarArr[0].setRightDrawableOnClick(this.f27712f0);
                            if (drawable instanceof org.telegram.ui.Components.e5) {
                                ((org.telegram.ui.Components.e5) drawable).l(k5VarArr[0]);
                            }
                            if (z10) {
                                nVar.c(k5VarArr[0]);
                            } else {
                                nVar.z(k5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f27718i0;
                        }
                        this.f27722k0 = runnable;
                    }
                }
            }
        }
    }

    public final void M(eh.c cVar, hh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z10;
        this.V0 = cVar;
        this.W0 = eVar;
        gh.g c2 = cVar.c(this, null, false);
        c2.p(eVar);
        c2.q(org.telegram.messenger.g0.L(6.0f));
        this.f27697a = c2;
        if (z10) {
            c2.s(org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(18.33f));
        } else {
            c2.r(org.telegram.messenger.g0.L(23.0f));
        }
        gh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f27700b = c10;
        gh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f27703c = c11;
        x xVar = this.F;
        if (xVar != null) {
            xVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.F.setGlassMode(true);
        }
        d dVar = this.G;
        if (dVar != null) {
            dVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.G.setGlassMode(true);
        }
        ImageView imageView = this.f27708e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.M) {
            k5[] k5VarArr = this.f27725n;
            if (view == k5VarArr[0] || view == k5VarArr[1] || view == this.f27734r || view == this.F || view == this.f27708e || view == this.f27737s || view == this.G0) {
                return true;
            }
        }
        return false;
    }

    public void O(View[] viewArr, boolean[] zArr) {
        if (this.G != null && !this.K) {
            this.K = true;
            j();
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
            if (this.f27749x == 0) {
                if (!this.f27728o0) {
                    k5 k5Var = this.f27725n[0];
                    if (k5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(k5Var, property, 0.0f));
                    }
                    if (this.f27734r != null && !TextUtils.isEmpty(this.B0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f27734r, property, 0.0f));
                    }
                }
                x xVar = this.F;
                if (xVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(xVar, property, 0.0f));
                }
            }
            int i3 = this.f27749x;
            if (i3 == 0) {
                i3 = this.f27752y;
            }
            if (i3 != 0 && !this.Q0) {
                if (i0.a.h(i3) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                hs.e().k(hs.f23297r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f27713f1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new bh.j(12, this, zArr));
            this.Q.start();
            ImageView imageView = this.f27708e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof w1) {
                    ((w1) drawable).c(true, 1.0f);
                }
                this.f27708e.setBackgroundDrawable(k6.h0(this.f27735r0, 1, -1));
            }
        }
    }

    public final void P() {
        boolean z10;
        if (this.D0 && this.E0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.F0 != z10) {
            this.F0 = z10;
            b4.n nVar = this.P0;
            if (z10) {
                nVar.f2377a = true;
                AnimatorSet animatorSet = (AnimatorSet) nVar.f2379c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            nVar.f2377a = false;
            ((AnimatorSet) nVar.f2379c).cancel();
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        invalidate();
    }

    @Override
    public final boolean a(q0 q0Var, RectF rectF) {
        int L;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        float f10 = 0.0f;
        if (q0Var.getParent() == this.F && this.f27703c != null && !this.f27745v1 && !this.R0 && this.f27724l1 == 0.0f && getActionModeFactor() == 0.0f && !this.f27703c.getBounds().isEmpty()) {
            rectF.set(this.f27703c.getBounds());
            float f11 = L2;
            rectF.inset(f11, f11);
            return true;
        }
        float L3 = org.telegram.messenger.g0.L(46.0f) / 2.0f;
        View view = (View) q0Var.getParent();
        if (view != null) {
            f10 = view.getX();
        }
        float width = (q0Var.getWidth() / 2.0f) + q0Var.getX() + f10;
        float height = ((getHeight() - this.P) - ((getCurrentActionBarHeight() + L) / 2.0f)) + L3;
        rectF.set(width - L3, height - L3, width + L3, height + L3);
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.C1));
        hashSet.add(Integer.valueOf(this.B1));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final gh.g c(i5 i5Var) {
        eh.c cVar = this.X0;
        if (cVar == null) {
            cVar = this.V0;
        }
        if (cVar == null) {
            return null;
        }
        gh.g c2 = cVar.c(i5Var, null, false);
        c2.p(this.W0);
        org.telegram.messenger.camera.q.p(c2, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c2;
    }

    @Override
    public final void d(i5 i5Var, q0 q0Var) {
        this.f27699a1 = i5Var;
        this.f27702b1 = q0Var;
        invalidate();
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.T0 != null && this.Q0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            float f10 = x10;
            float f11 = y9;
            View t10 = t(this, f10, f11, this.T0);
            if (t10 == null) {
                t10 = t(this, f10, f11, null);
            }
            gh.g gVar = this.f27697a;
            boolean z12 = true;
            if (gVar != null && gVar.getBounds().contains(x10, y9)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (t10 != null && t10 != this.T0) {
                gh.g gVar2 = this.f27700b;
                if (gVar2 != null && gVar2.getBounds().contains(x10, y9)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                gh.g gVar3 = this.f27703c;
                if (gVar3 == null || !gVar3.getBounds().contains(x10, y9)) {
                    z12 = false;
                }
                z10 = z13 | z12;
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r21, android.view.View r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final boolean e(String str) {
        if (this.G != null) {
            String str2 = this.H;
            if (str2 != null || str != null) {
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void f() {
        float f10;
        int w02;
        int w03;
        if (this.f27756z1) {
            if (this.A1) {
                f10 = 1.0f;
            } else {
                f10 = this.E1;
            }
            int i3 = this.C1;
            e6 e6Var = this.K0;
            if (i3 == -1) {
                w02 = 0;
            } else {
                w02 = k6.w0(i3, e6Var);
            }
            int i10 = this.B1;
            if (i10 == -1) {
                w03 = 0;
            } else {
                w03 = k6.w0(i10, e6Var);
            }
            if (w03 == 0) {
                w03 = i0.a.o(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.o(w03, 0);
            }
            setBackgroundColor(i0.a.f(f10, w02, w03));
            setShadowAlpha((int) ((1.0f - f10) * 255.0f));
            if (this.M0) {
                invalidate();
            }
        }
    }

    public final void g() {
        if (!bd.f21784a0) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new i(0));
            this.A0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) xq.f40452f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f27744v0;
    }

    public x getActionMode() {
        return this.G;
    }

    public float getActionModeFactor() {
        d dVar = this.G;
        if (dVar != null) {
            return dVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.f27754y1;
    }

    public k5 getAdditionalSubtitleTextView() {
        return this.f27737s;
    }

    public ImageView getBackButton() {
        return this.f27708e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public m4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f27752y;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        hh.e eVar = this.W0;
        if (eVar != null) {
            return eVar.a(eVar.f14417e);
        }
        return 0;
    }

    @Override
    public hh.a getButtonsGlassColorProvider() {
        return this.W0;
    }

    public boolean getCastShadows() {
        return this.f27723l0;
    }

    public int getExtraHeight() {
        return this.P;
    }

    public int getMeasuredHeightNoExtra() {
        return getMeasuredHeight() - this.P;
    }

    @Override
    public hh.a getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override
    public e6 getMenuResourcesProvider() {
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
    public i5 getOpenMenuOverlay() {
        return this.f27699a1;
    }

    public k9 getSearchAvatarImageView() {
        return this.f27711f;
    }

    public int getShadowAlpha() {
        return this.m0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f27734r != null && (charSequence = this.B0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        k5 k5Var = this.f27734r;
        if (k5Var != null) {
            return k5Var.getTextColor();
        }
        return 0;
    }

    public k5 getSubtitleTextView() {
        return this.f27734r;
    }

    public String getTitle() {
        k5 k5Var = this.f27725n[0];
        if (k5Var == null) {
            return null;
        }
        return k5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.f27747w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f10;
        k5 k5Var = this.f27725n[0];
        if (k5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            return textPaint.getFontMetricsInt();
        }
        return k5Var.getPaint().getFontMetricsInt();
    }

    public k5 getTitleTextView() {
        return this.f27725n[0];
    }

    public k5 getTitleTextView2() {
        return this.f27725n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.G0;
    }

    public final void h(boolean z10) {
        boolean z11;
        float f10;
        jn jnVar = this.T0;
        if (jnVar == null) {
            return;
        }
        fn fnVar = jnVar.f35127e;
        if (fnVar != null && fnVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f), this.T0.getVisualWidth());
        qe.c cVar = this.m1;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f53847g;
            } else {
                f10 = cVar.f53846f;
            }
            float f11 = min;
            if (f10 != f11) {
                cVar.a(f11);
            }
        } else {
            cVar.c(min);
        }
        this.f27727n1.a(z11, z10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        int i3;
        ImageView imageView = this.f27708e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof w1) && !(drawable instanceof r4)) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            if (this.f27708e.getLayerType() != i3) {
                this.f27708e.setLayerType(i3, null);
                this.f27708e.invalidate();
            }
        }
    }

    public final void j() {
        int i3;
        int i10;
        float f10;
        x xVar = this.F;
        boolean z10 = false;
        if (xVar != null) {
            i3 = (xVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f);
        } else {
            i3 = 0;
        }
        int max = Math.max(0, i3);
        d dVar = this.G;
        if (dVar != null) {
            i10 = (dVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f);
        } else {
            i10 = 0;
        }
        int max2 = Math.max(0, i10);
        org.telegram.messenger.g0.L(46.0f);
        if (this.K) {
            max = max2;
        }
        if (max > 0) {
            z10 = true;
        }
        this.f27731p1.a(z10, this.f27743u1);
        qe.c cVar = this.f27729o1;
        if (cVar.h) {
            f10 = cVar.f53847g;
        } else {
            f10 = cVar.f53846f;
        }
        float f11 = max;
        if (f10 != f11) {
            if (this.f27743u1) {
                cVar.a(f11);
            } else {
                cVar.c(f11);
            }
        }
    }

    public final void k() {
        l(true);
    }

    public void l(boolean z10) {
        x xVar;
        if (this.f27728o0 && (xVar = this.F) != null) {
            xVar.i(z10);
        }
    }

    public final x m() {
        return n(null);
    }

    public final x n(String str) {
        float f10;
        int i3;
        if (e(str)) {
            return this.G;
        }
        d dVar = this.G;
        if (dVar != null) {
            removeView(dVar);
            this.G = null;
        }
        this.H = str;
        d dVar2 = new d(this, getContext(), this);
        this.G = dVar2;
        if (this.Q0) {
            f10 = -org.telegram.messenger.g0.L(10.0f);
        } else {
            f10 = 0.0f;
        }
        dVar2.setTranslationX(f10);
        this.G.setGlassMode(this.Q0);
        d dVar3 = this.G;
        dVar3.f28787c = true;
        dVar3.setClickable(true);
        if (!this.Q0) {
            r6.i(k6.f28236w8, this.G, this.K0);
        }
        addView(this.G, indexOfChild(this.f27708e));
        d dVar4 = this.G;
        if (this.J) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        dVar4.setPadding(0, i3, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.P;
        layoutParams.gravity = 5;
        this.G.setLayoutParams(layoutParams);
        this.G.setVisibility(4);
        return this.G;
    }

    public final void o() {
        if (this.f27737s != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.f27737s = k5Var;
        k5Var.setGravity(3);
        this.f27737s.setVisibility(8);
        r6.Y(this.f27737s, k6.B8, this.K0);
        addView(this.f27737s, 0, mf.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0 = true;
        P();
        if (this.K) {
            int i3 = this.f27749x;
            if (i3 == 0) {
                i3 = this.f27752y;
            }
            if (i3 != 0 && !this.Q0) {
                if (i0.a.h(i3) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                hs.e().k(hs.f23297r4, new Object[0]);
            }
        }
        Drawable drawable = this.f27709e0;
        if (drawable instanceof org.telegram.ui.Components.e5) {
            ((org.telegram.ui.Components.e5) drawable).l(this.f27725n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0 = false;
        P();
        if (this.K) {
            int i3 = this.f27752y;
            if (i3 != 0 && this.f27749x != 0 && !this.Q0) {
                if (i0.a.h(i3) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                hs.e().k(hs.f23297r4, new Object[0]);
            }
        }
        Drawable drawable = this.f27709e0;
        if (drawable instanceof org.telegram.ui.Components.e5) {
            ((org.telegram.ui.Components.e5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.S && !this.f27720j0 && !bd.f21784a0 && motionEvent.getAction() == 0 && (B0 = k6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            bu0 bu0Var = this.T;
            k5[] k5VarArr = this.f27725n;
            if (bu0Var == null) {
                this.U = null;
                this.T = new bu0(0);
                k5VarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                ?? obj = new Object();
                obj.f33611c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f33610b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(k6.x0(null, k6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i3 = 0; i3 < 20; i3++) {
                    ((ArrayList) obj.d).add(new dz(obj));
                }
                this.U = obj;
                k5VarArr[0].invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        float f10;
        int L;
        k5[] k5VarArr;
        k5 k5Var;
        int i12;
        int i13;
        int z10;
        int i14;
        int i15;
        k5 k5Var2;
        int i16;
        int i17;
        int makeMeasureSpec;
        float f11;
        int i18;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i19 = 1;
        kVar.I = true;
        View view = kVar.f27746w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.g0.f22602m;
        }
        d dVar = kVar.G;
        if (dVar != null) {
            if (kVar.J) {
                i18 = org.telegram.messenger.g0.f22602m;
            } else {
                i18 = 0;
            }
            dVar.setPadding(0, i18, 0, 0);
        }
        kVar.I = false;
        if (kVar.J) {
            i11 = org.telegram.messenger.g0.f22602m;
        } else {
            i11 = 0;
        }
        kVar.setMeasuredDimension(size, currentActionBarHeight + i11 + kVar.P);
        ImageView imageView = kVar.f27708e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.f27708e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(54.0f), 1073741824), makeMeasureSpec2);
            if (org.telegram.messenger.g0.Q1()) {
                f11 = 80.0f;
            } else {
                f11 = 72.0f;
            }
            L = org.telegram.messenger.g0.L(f11);
        } else {
            if (org.telegram.messenger.g0.Q1()) {
                f10 = 26.0f;
            } else {
                f10 = 18.0f;
            }
            L = org.telegram.messenger.g0.L(f10);
        }
        x xVar = kVar.F;
        if (xVar != null && xVar.getVisibility() != 8) {
            float f12 = 66.0f;
            if (kVar.F.p() && !kVar.f27728o0) {
                kVar.F.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int k10 = kVar.F.k();
                if (kVar.f27726n0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.F.k() + (size - org.telegram.messenger.g0.L(f12)), 1073741824);
                if (!kVar.E) {
                    kVar.F.r(-k10);
                }
            } else if (kVar.f27728o0) {
                if (kVar.f27726n0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = org.telegram.messenger.camera.q.c(f12, size, 1073741824);
                if (!kVar.E) {
                    kVar.F.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.E) {
                    kVar.F.r(0.0f);
                }
            }
            kVar.F.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            k5VarArr = kVar.f27725n;
            if (i20 >= 2) {
                break;
            }
            k5 k5Var3 = k5VarArr[0];
            if ((k5Var3 != null && k5Var3.getVisibility() != 8) || ((k5Var = kVar.f27734r) != null && k5Var.getVisibility() != 8)) {
                x xVar2 = kVar.F;
                if (xVar2 != null) {
                    i13 = xVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (kVar.I0) {
                    z10 = size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + i13) + kVar.f27701b0) * 2);
                } else {
                    z10 = org.telegram.messenger.k5.z(16.0f, size - i13, L) - kVar.f27701b0;
                }
                int max = Math.max(z10, 0);
                boolean z11 = kVar.f27755z0;
                int i21 = 20;
                if (((z11 && i20 == 0) || (!z11 && i20 == i19)) && kVar.f27750x0 && kVar.f27753y0) {
                    k5 k5Var4 = k5VarArr[i20];
                    i12 = i19;
                    if (kVar.Q0) {
                        i21 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    k5Var4.setTextSize(i21);
                } else {
                    i12 = i19;
                    k5 k5Var5 = k5VarArr[0];
                    if (k5Var5 != null && k5Var5.getVisibility() != 8 && (k5Var2 = kVar.f27734r) != null && k5Var2.getVisibility() != 8) {
                        k5 k5Var6 = k5VarArr[i20];
                        if (k5Var6 != null) {
                            if (kVar.Q0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i21 = 18;
                            }
                            k5Var6.setTextSize(i21);
                        }
                        k5 k5Var7 = kVar.f27734r;
                        if (org.telegram.messenger.g0.Q1()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        k5Var7.setTextSize(i16);
                        k5 k5Var8 = kVar.f27737s;
                        if (k5Var8 != null) {
                            if (org.telegram.messenger.g0.Q1()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            k5Var8.setTextSize(i17);
                        }
                    } else {
                        k5 k5Var9 = k5VarArr[i20];
                        if (k5Var9 != null && k5Var9.getVisibility() != 8) {
                            k5 k5Var10 = k5VarArr[i20];
                            if (kVar.Q0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            k5Var10.setTextSize(i21);
                        }
                        k5 k5Var11 = kVar.f27734r;
                        if (k5Var11 != null && k5Var11.getVisibility() != 8) {
                            k5 k5Var12 = kVar.f27734r;
                            if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            k5Var12.setTextSize(i15);
                        }
                        k5 k5Var13 = kVar.f27737s;
                        if (k5Var13 != null) {
                            if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            k5Var13.setTextSize(i14);
                        }
                    }
                }
                k5 k5Var14 = k5VarArr[i20];
                if (k5Var14 != null && k5Var14.getVisibility() != 8) {
                    k5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(k5VarArr[i20].getPaddingBottom() + k5VarArr[i20].getPaddingTop() + org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
                    if (kVar.A0) {
                        CharSequence text = k5VarArr[i20].getText();
                        k5 k5Var15 = k5VarArr[i20];
                        k5Var15.setPivotX(k5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        k5VarArr[i20].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        k5VarArr[i20].setPivotX(0.0f);
                        k5VarArr[i20].setPivotY(0.0f);
                    }
                }
                k5 k5Var16 = kVar.f27734r;
                if (k5Var16 != null && k5Var16.getVisibility() != 8) {
                    kVar.f27734r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                ei.k kVar2 = kVar.f27754y1;
                if (kVar2 != null) {
                    kVar2.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                k5 k5Var17 = kVar.f27737s;
                if (k5Var17 != null && k5Var17.getVisibility() != 8) {
                    kVar.f27737s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i12 = i19;
            }
            i20++;
            i19 = i12;
        }
        int i22 = i19;
        k9 k9Var = kVar.f27711f;
        if (k9Var != null) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = kVar.getChildAt(i23);
            if (childAt.getVisibility() != 8 && childAt != k5VarArr[0] && childAt != k5VarArr[i22] && childAt != kVar.f27754y1 && childAt != kVar.f27734r && childAt != kVar.F && childAt != kVar.f27708e && childAt != kVar.f27737s && childAt != kVar.f27711f) {
                kVar.measureChildWithMargins(childAt, i3, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), 1073741824), 0);
            }
            i23++;
            kVar = this;
        }
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

    public final void p() {
        if (this.f27708e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f27708e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f27708e.setBackgroundDrawable(k6.h0(this.f27732q0, 1, -1));
        this.f27708e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.f27708e, mf.e(54, 54, 51));
        this.f27708e.setOnClickListener(new b(this, 1));
        this.f27708e.setContentDescription(bd.M0(2131754878, null));
    }

    public final x q() {
        x xVar = this.F;
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(getContext(), this);
        this.F = xVar2;
        addView(xVar2, 0, mf.e(-2, -1, 5));
        return this.F;
    }

    public final void r() {
        if (this.f27734r != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.f27734r = k5Var;
        k5Var.setGravity(3);
        this.f27734r.setVisibility(8);
        r6.Y(this.f27734r, k6.B8, this.K0);
        addView(this.f27734r, 0, mf.e(-2, -2, 51));
    }

    @Override
    public final void requestLayout() {
        if (this.I) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i3) {
        int i10;
        View[] viewArr = this.f27725n;
        if (viewArr[i3] != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        viewArr[i3] = k5Var;
        if (this.I0) {
            i10 = 17;
        } else {
            i10 = 19;
        }
        k5Var.setGravity(i10);
        int i11 = this.f27747w0;
        if (i11 != 0) {
            viewArr[i3].setTextColor(i11);
        } else {
            r6.Y(viewArr[i3], k6.A8, this.K0);
        }
        k5 k5Var2 = viewArr[i3];
        k5Var2.setEmojiColor(k5Var2.getTextColor());
        viewArr[i3].setTypeface(org.telegram.messenger.g0.o());
        viewArr[i3].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        viewArr[i3].setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        viewArr[i3].setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        if (this.H0) {
            this.G0.addView(viewArr[i3], 0, mf.e(-2, -2, 51));
        } else {
            addView(viewArr[i3], 0, mf.e(-2, -2, 51));
        }
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f27744v0 = jVar;
    }

    public void setActionModeColor(int i3) {
        d dVar = this.G;
        if (dVar != null) {
            q6 q6Var = r6.f28514a;
            dVar.setTag(2131296709, null);
            this.G.setBackgroundColor(i3);
        }
    }

    public void setActionModeOverrideColor(int i3) {
        this.f27749x = i3;
    }

    public void setActionModeTopColor(int i3) {
        View view = this.f27746w;
        if (view != null) {
            r6.r(view);
            this.f27746w.setBackgroundColor(i3);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        B(recyclerView, k6.f27824a7, k6.f28160s8);
    }

    public void setAddToContainer(boolean z10) {
        this.L = z10;
    }

    public void setAdditionalTextLeft(int i3) {
        this.f27717h1 = i3;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f27704c0 = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f27708e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i3;
        float f10;
        if (this.f27708e == null) {
            p();
        }
        ImageView imageView = this.f27708e;
        if (drawable == null) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        ImageView imageView2 = this.f27708e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof w1) {
            w1 w1Var = (w1) drawable;
            if (v()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            w1Var.c(false, f10);
            w1Var.b(this.f27740t0);
            w1Var.a(this.f27738s0);
        } else if (drawable instanceof r4) {
            r4 r4Var = (r4) drawable;
            r4Var.f28509k = this.f27752y;
            r4Var.f28508j = this.f27738s0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f27708e.setColorFilter(new PorterDuffColorFilter(this.f27738s0, PorterDuff.Mode.SRC_IN));
        }
        if (this.f27707d1) {
            this.f27708e.setColorFilter(new PorterDuffColorFilter(this.f27738s0, PorterDuff.Mode.SRC_IN));
        }
        i();
    }

    public void setBackButtonImage(int i3) {
        int i10;
        if (this.f27708e == null) {
            p();
        }
        ImageView imageView = this.f27708e;
        if (i3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        this.f27708e.setImageResource(i3);
        this.f27708e.setColorFilter(new PorterDuffColorFilter(this.f27738s0, PorterDuff.Mode.SRC_IN));
        i();
    }

    @Override
    public void setBackgroundColor(int i3) {
        this.f27752y = i3;
        if (!this.M0) {
            super.setBackgroundColor(i3);
        }
        ImageView imageView = this.f27708e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof r4) {
                ((r4) drawable).f28509k = i3;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f27723l0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f27723l0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        int i3;
        if (this.I0 == z10) {
            return;
        }
        this.I0 = z10;
        k5[] k5VarArr = this.f27725n;
        int length = k5VarArr.length;
        int i10 = 0;
        while (true) {
            i3 = 19;
            if (i10 >= length) {
                break;
            }
            k5 k5Var = k5VarArr[i10];
            if (k5Var != null) {
                if (z10) {
                    i3 = 17;
                }
                k5Var.setGravity(i3);
            }
            i10++;
        }
        k5 k5Var2 = this.f27734r;
        if (k5Var2 != null) {
            if (z10) {
                i3 = 17;
            }
            k5Var2.setGravity(i3);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(jn jnVar) {
        this.T0 = jnVar;
    }

    public void setClipContent(boolean z10) {
        this.M = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.C0 = z10;
        ImageView imageView = this.f27708e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(qt0 qt0Var) {
        this.M0 = true;
        this.L0 = qt0Var;
        qt0Var.P.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.f27748w1 != z10) {
            this.f27748w1 = z10;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.f27708e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        x xVar = this.F;
        if (xVar != null) {
            xVar.setEnabled(z10);
        }
        d dVar = this.G;
        if (dVar != null) {
            dVar.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i3) {
        this.P = i3;
        d dVar = this.G;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.P;
            this.G.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.O = z10;
    }

    public void setForcedMenuMinWidth(int i3) {
        this.f27741t1 = true;
        if (this.f27736r1 != i3) {
            this.f27736r1 = i3;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i3) {
        this.f27739s1 = true;
        if (this.f27733q1 != i3) {
            this.f27733q1 = i3;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i3) {
        if (this.f27751x1 != i3) {
            this.f27751x1 = i3;
            invalidate();
        }
        gh.g gVar = this.f27697a;
        if (gVar != null && gVar.f53579c != i3) {
            gVar.setAlpha(i3);
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.J0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.N = z10;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        si.d dVar = this.Y0;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.E = z10;
    }

    public void setMenuRise(int i3) {
        this.Z0 = i3;
    }

    public void setOccupyStatusBar(boolean z10) {
        int i3;
        this.J = z10;
        d dVar = this.G;
        if (dVar != null) {
            if (z10) {
                i3 = org.telegram.messenger.g0.f22602m;
            } else {
                i3 = 0;
            }
            dVar.setPadding(0, i3, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.f27710e1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f27750x0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f27712f0 = onClickListener;
        k5[] k5VarArr = this.f27725n;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.setRightDrawableOnClick(onClickListener);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.setRightDrawableOnClick(this.f27712f0);
        }
    }

    public void setSearchAvatarImageView(k9 k9Var) {
        k9 k9Var2 = this.f27711f;
        if (k9Var2 != k9Var) {
            if (k9Var2 != null) {
                removeView(k9Var2);
            }
            this.f27711f = k9Var;
            if (k9Var != null) {
                addView(k9Var);
            }
        }
    }

    public void setSearchCursorColor(int i3) {
        x xVar = this.F;
        if (xVar != null) {
            xVar.setSearchCursorColor(i3);
        }
    }

    public void setSearchFactor(float f10) {
        if (this.f27724l1 != f10) {
            this.f27724l1 = f10;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.F.setSearchFieldText(str);
    }

    public void setSearchFilter(kg.l0 l0Var) {
        x xVar = this.F;
        if (xVar != null) {
            xVar.setFilter(l0Var);
        }
    }

    public void setShadowAlpha(int i3) {
        if (this.m0 == i3) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.m0 = i3;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.k1 != z10) {
            this.k1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i3;
        if (charSequence != null && this.f27734r == null) {
            r();
        }
        if (this.f27734r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            k5 k5Var = this.f27734r;
            if (!isEmpty && !this.f27728o0) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            k5Var.setVisibility(i3);
            this.f27734r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f27734r.l(charSequence, false);
            }
            this.B0 = charSequence;
        }
    }

    public void setSubtitleColor(int i3) {
        if (this.f27734r == null) {
            r();
        }
        r6.r(this.f27734r);
        this.f27734r.setTextColor(i3);
    }

    public void setSupportsHolidayImage(boolean z10) {
        this.S = z10;
        if (z10) {
            this.V = new Paint.FontMetricsInt();
            this.f27698a0 = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        J(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f27722k0 = runnable;
        this.f27718i0 = runnable;
    }

    public void setTitleColor(int i3) {
        k5[] k5VarArr = this.f27725n;
        if (k5VarArr[0] == null) {
            s(0);
        }
        this.f27747w0 = i3;
        r6.r(k5VarArr[0]);
        k5VarArr[0].setTextColor(i3);
        k5VarArr[0].setEmojiColor(i3);
        k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            r6.r(k5Var);
            k5VarArr[1].setTextColor(i3);
            k5VarArr[1].setEmojiColor(i3);
        }
    }

    public void setTitleRightMargin(int i3) {
        this.f27701b0 = i3;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f27725n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.M) {
            invalidate();
        }
    }

    public void u() {
        d dVar = this.G;
        if (dVar != null && this.K) {
            int childCount = dVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = dVar.getChildAt(i3);
                if (childAt instanceof q0) {
                    ((q0) childAt).o();
                }
            }
            this.K = false;
            j();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.G, property, 0.0f));
            if (this.R != null) {
                int i10 = 0;
                while (true) {
                    View[] viewArr = this.R;
                    if (i10 >= viewArr.length) {
                        break;
                    }
                    View view = viewArr[i10];
                    if (view != null) {
                        view.setVisibility(0);
                        arrayList.add(ObjectAnimator.ofFloat(this.R[i10], property, 1.0f));
                    }
                    i10++;
                }
            }
            boolean z10 = this.f27728o0;
            k5[] k5VarArr = this.f27725n;
            if (!z10) {
                k5 k5Var = k5VarArr[0];
                if (k5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(k5Var, property, 1.0f));
                }
                if (this.f27734r != null && !TextUtils.isEmpty(this.B0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f27734r, property, 1.0f));
                }
            }
            x xVar = this.F;
            if (xVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(xVar, property, 1.0f));
            }
            int i11 = this.f27752y;
            if (i11 != 0 && !this.Q0) {
                if (i0.a.h(i11) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                hs.e().k(hs.f23297r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f27713f1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new e(this, 0));
            this.Q.start();
            if (!this.f27728o0) {
                k5 k5Var2 = k5VarArr[0];
                if (k5Var2 != null) {
                    k5Var2.setVisibility(0);
                }
                if (this.f27734r != null && !TextUtils.isEmpty(this.B0)) {
                    this.f27734r.setVisibility(0);
                }
            }
            x xVar2 = this.F;
            if (xVar2 != null) {
                xVar2.setVisibility(0);
            }
            ImageView imageView = this.f27708e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof w1) {
                    ((w1) drawable).c(true, 0.0f);
                }
                this.f27708e.setBackgroundDrawable(k6.h0(this.f27732q0, 1, -1));
            }
        }
    }

    @Override
    public final void updateColors() {
        f();
        gh.g gVar = this.f27697a;
        if (gVar != null) {
            gVar.updateColors();
        }
        gh.g gVar2 = this.f27703c;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        gh.g gVar3 = this.f27700b;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        ei.k kVar = this.f27754y1;
        if (kVar != null) {
            kVar.d();
        }
    }

    public final boolean v() {
        if (this.G != null && this.K) {
            return true;
        }
        return false;
    }

    public final boolean w(String str) {
        if (this.G != null && this.K) {
            String str2 = this.H;
            if (str2 != null || str != null) {
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean x() {
        return false;
    }

    public void y(boolean z10) {
        float f10;
        Property property;
        float f11;
        float f12;
        float f13;
        int i3;
        this.f27728o0 = z10;
        j();
        AnimatorSet animatorSet = this.f27715g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f27715g1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean x10 = x();
        if (!x10) {
            k5 k5Var = this.f27725n[0];
            if (k5Var != null) {
                arrayList.add(k5Var);
            }
            if (this.f27734r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(this.f27734r);
                k5 k5Var2 = this.f27734r;
                if (z10) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                k5Var2.setVisibility(i3);
            }
        }
        float f14 = this.f27730p0;
        float f15 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
        ofFloat.addUpdateListener(new a(this, 2));
        this.f27715g1.playTogether(ofFloat);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i10 >= size) {
                break;
            }
            View view = (View) arrayList.get(i10);
            float f16 = 0.95f;
            if (!z10) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            AnimatorSet animatorSet2 = this.f27715g1;
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f12));
            AnimatorSet animatorSet3 = this.f27715g1;
            if (z10) {
                f13 = 0.95f;
            } else {
                f13 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f13));
            AnimatorSet animatorSet4 = this.f27715g1;
            if (!z10) {
                f16 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f16));
            i10++;
        }
        k9 k9Var = this.f27711f;
        if (k9Var != null) {
            k9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.f27715g1;
            k9 k9Var2 = this.f27711f;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(k9Var2, property, f11));
        }
        this.A0 = true;
        requestLayout();
        this.f27715g1.addListener(new f(this, arrayList, z10, x10));
        this.f27715g1.setDuration(150L).start();
        ImageView imageView = this.f27708e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof r4) {
                r4 r4Var = (r4) drawable;
                r4Var.h = true;
                if (z10) {
                    f15 = 1.0f;
                }
                r4Var.a(true, f15);
            }
        }
    }

    public final void z() {
        x xVar = this.F;
        int childCount = xVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = xVar.getChildAt(i3);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.u()) {
                    q0Var.E();
                }
            }
        }
    }

    public void setAdaptiveBackground(km0 km0Var) {
        int i3 = k6.f27824a7;
        int i10 = k6.f28160s8;
        this.B1 = i3;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        f();
        org.telegram.messenger.voip.l0 l0Var = new org.telegram.messenger.voip.l0(3, this, km0Var);
        km0Var.M.add(l0Var);
        if (this.f27756z1) {
            l0Var.run();
            return;
        }
        this.f27756z1 = true;
        boolean canScrollVertically = km0Var.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        f();
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
