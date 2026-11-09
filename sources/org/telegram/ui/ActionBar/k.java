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
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.tu0;
public class k extends FrameLayout implements te.b, b6, s4 {
    public CharSequence A0;
    public int A1;
    public boolean B0;
    public int B1;
    public boolean C0;
    public boolean C1;
    public boolean D;
    public boolean D0;
    public float D1;
    public y E;
    public boolean E0;
    public ValueAnimator E1;
    public d F;
    public di.b4 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final g6 J0;
    public boolean K;
    public tt0 K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public final Paint M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public final ab.q O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public eu0 S;
    public kn S0;
    public iz T;
    public boolean T0;
    public Paint.FontMetricsInt U;
    public dh.c U0;
    public boolean V;
    public gh.e V0;
    public Rect W;
    public dh.c W0;
    public ri.d X0;
    public int Y0;
    public j5 Z0;
    public fh.g f27634a;
    public int f27635a0;
    public r0 f27636a1;
    public fh.g f27637b;
    public boolean f27638b0;
    public final RectF f27639b1;
    public fh.g f27640c;
    public CharSequence f27641c0;
    public boolean f27642c1;
    public final m4 d;
    public Drawable f27643d0;
    public Runnable f27644d1;
    public ImageView f27645e;
    public View.OnClickListener f27646e0;
    public tu0 f27647e1;
    public l9 f27648f;
    public String f27649f0;
    public AnimatorSet f27650f1;
    public final Object[] f27651g0;
    public int f27652g1;
    public Drawable h;
    public Runnable f27653h0;
    public int f27654h1;
    public boolean f27655i0;
    public boolean f27656i1;
    public Runnable f27657j0;
    public boolean f27658j1;
    public boolean f27659k0;
    public float f27660k1;
    public int f27661l0;
    public final te.c l1;
    public boolean m0;
    public final te.a f27662m1;
    public final l5[] f27663n;
    public boolean f27664n0;
    public final te.c n1;
    public float f27665o0;
    public final te.a f27666o1;
    public int f27667p0;
    public int f27668p1;
    public int f27669q0;
    public int f27670q1;
    public l5 f27671r;
    public int f27672r0;
    public boolean f27673r1;
    public l5 f27674s;
    public int f27675s0;
    public boolean f27676s1;
    public f2 f27677t0;
    public boolean f27678t1;
    public j f27679u0;
    public boolean f27680u1;
    public int f27681v0;
    public boolean f27682v1;
    public View f27683w;
    public boolean f27684w0;
    public int f27685w1;
    public int f27686x;
    public boolean f27687x0;
    public di.j f27688x1;
    public int f27689y;
    public boolean f27690y0;
    public boolean f27691y1;
    public boolean f27692z0;
    public boolean f27693z1;

    public k(Context context, g6 g6Var) {
        super(context);
        this.d = m4.f28295a;
        this.f27663n = new l5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f27651g0 = new Object[3];
        this.f27659k0 = true;
        this.f27661l0 = 255;
        this.f27681v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new ab.q(this);
        this.f27639b1 = new RectF();
        xq xqVar = xq.h;
        this.l1 = new te.c(0, this, xqVar, 380L);
        this.f27662m1 = new te.a(0, this, xqVar, 380L, false);
        this.n1 = new te.c(0, this, xqVar, 320L);
        this.f27666o1 = new te.a(0, this, xqVar, 320L, false);
        this.f27682v1 = true;
        this.f27685w1 = 255;
        this.C1 = true;
        this.D1 = 1.0f;
        this.J0 = g6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.g0.Q1()) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            return org.telegram.messenger.g0.L(48.0f);
        }
        return org.telegram.messenger.g0.L(56.0f);
    }

    public static View u(k kVar, float f10, float f11, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A() {
        y yVar = this.E;
        int childCount = yVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = yVar.getChildAt(i7);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                if (r0Var.u()) {
                    r0Var.E();
                }
            }
        }
    }

    public final void B() {
        y yVar = this.E;
        if (yVar != null) {
            boolean z9 = this.f27664n0;
            boolean z10 = !z9;
            int childCount = yVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = yVar.getChildAt(i7);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.u()) {
                        if (!z9) {
                            yVar.f28759b.z(r0Var.T(z10));
                        }
                        r0Var.P("", false);
                        r0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void C(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        this.A1 = i7;
        this.B1 = i10;
        this.f27693z1 = org.telegram.messenger.g0.Q1();
        li.j3 j3Var = new li.j3(29, this, recyclerView);
        recyclerView.j(new ai.b(j3Var, 24));
        if (this.f27691y1) {
            j3Var.run();
            return;
        }
        this.f27691y1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        if (!canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.D1 = f10;
        g();
    }

    public final void D(int i7, boolean z9) {
        ImageView imageView;
        if (z9) {
            this.f27669q0 = i7;
            if (this.J && (imageView = this.f27645e) != null) {
                imageView.setBackgroundDrawable(l6.h0(i7, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f27667p0 = i7;
        ImageView imageView2 = this.f27645e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(l6.h0(i7, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void E(int i7, boolean z9) {
        if (z9) {
            this.f27675s0 = i7;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f27645e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).b(i7);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f27645e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f27672r0 = i7;
            ImageView imageView2 = this.f27645e;
            if (imageView2 != null && i7 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof y1) {
                    ((y1) drawable2).a(i7);
                } else if (drawable2 instanceof r4) {
                    ((r4) drawable2).f28473j = i7;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f27645e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                yVar.t();
            }
        }
        ImageView imageView3 = this.f27645e;
        if (imageView3 != null && this.f27642c1) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f27672r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void G(int i7, boolean z9) {
        y yVar;
        d dVar;
        int i10 = 0;
        if (z9 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    ((r0) childAt).H(i7);
                }
                i10++;
            }
        } else if (!z9 && (yVar = this.E) != null) {
            int childCount2 = yVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = yVar.getChildAt(i10);
                if (childAt2 instanceof r0) {
                    ((r0) childAt2).H(i7);
                }
                i10++;
            }
        }
    }

    public final void H(int i7, boolean z9, boolean z10) {
        y yVar;
        d dVar;
        int i10 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    ((r0) childAt).O(i7, z9);
                }
                i10++;
            }
        } else if (!z10 && (yVar = this.E) != null) {
            int childCount2 = yVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = yVar.getChildAt(i10);
                if (childAt2 instanceof r0) {
                    ((r0) childAt2).O(i7, z9);
                }
                i10++;
            }
        }
    }

    public final void I(int i7, boolean z9) {
        y yVar;
        d dVar;
        if (z9 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i7);
        } else if (!z9 && (yVar = this.E) != null) {
            yVar.setPopupItemsSelectorColor(i7);
        }
    }

    public final void J(int i7, boolean z9) {
        y yVar = this.E;
        if (yVar != null) {
            int childCount = yVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.u()) {
                        if (z9) {
                            r0Var.getSearchField().setHintTextColor(i7);
                            return;
                        } else {
                            r0Var.getSearchField().setTextColor(i7);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void K(CharSequence charSequence, org.telegram.ui.Components.g5 g5Var) {
        int i7;
        l5[] l5VarArr = this.f27663n;
        if (charSequence != null && l5VarArr[0] == null) {
            t(0);
        }
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            if (charSequence != null && !this.f27664n0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            l5Var.setVisibility(i7);
            l5 l5Var2 = l5VarArr[0];
            this.f27641c0 = charSequence;
            l5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f27643d0;
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable).l(null);
                }
            }
            l5 l5Var3 = l5VarArr[0];
            this.f27643d0 = g5Var;
            l5Var3.i(g5Var);
            if (this.C0) {
                Drawable drawable2 = this.f27643d0;
                if (drawable2 instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable2).l(l5VarArr[0]);
                }
            }
            l5VarArr[0].setRightDrawableOnClick(this.f27646e0);
        }
        this.f27690y0 = false;
    }

    public final void L(CharSequence charSequence, boolean z9, long j3, Interpolator interpolator) {
        boolean z10;
        float f10;
        l5[] l5VarArr = this.f27663n;
        if (l5VarArr[0] != null && charSequence != null) {
            if (this.f27684w0 && !TextUtils.isEmpty(this.A0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f27671r.getVisibility() != 0) {
                    this.f27671r.setVisibility(0);
                    this.f27671r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f27671r.animate();
                if (z9) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.messenger.camera.q.k(animate, f10, 220L);
            }
            l5 l5Var = l5VarArr[1];
            if (l5Var != null) {
                if (l5Var.getParent() != null) {
                    ((ViewGroup) l5VarArr[1].getParent()).removeView(l5VarArr[1]);
                }
                l5VarArr[1] = null;
            }
            l5VarArr[1] = l5VarArr[0];
            l5VarArr[0] = null;
            setTitle(charSequence);
            this.f27690y0 = z9;
            l5VarArr[0].setAlpha(0.0f);
            if (!z10) {
                l5 l5Var2 = l5VarArr[0];
                int L = org.telegram.messenger.g0.L(20.0f);
                if (!z9) {
                    L = -L;
                }
                l5Var2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = l5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f27687x0 = true;
            ViewPropertyAnimator alpha = l5VarArr[1].animate().alpha(0.0f);
            if (!z10) {
                int L2 = org.telegram.messenger.g0.L(20.0f);
                if (z9) {
                    L2 = -L2;
                }
                alpha.translationY(L2);
            }
            if (interpolator != null) {
                alpha.setInterpolator(interpolator);
            }
            alpha.setDuration(j3).setListener(new g(this, z10, z9, 0)).start();
            requestLayout();
            return;
        }
        setTitle(charSequence);
    }

    public final void M(String str, int i7, Runnable runnable) {
        String str2;
        boolean z9;
        SpannableString spannableString;
        boolean z10;
        l5 l5Var;
        int indexOf;
        SpannableStringBuilder spannableStringBuilder;
        if (this.f27638b0 && this.f27677t0.parentLayout != null) {
            Object[] objArr = this.f27651g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i7);
            objArr[2] = runnable;
            if (!this.f27656i1) {
                String str3 = this.f27649f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f27649f0 = str;
                        Drawable drawable = null;
                        if (this.f27688x1 != null) {
                            if (i7 == 2131751805) {
                                spannableStringBuilder = org.telegram.messenger.g0.I2(id.M0(2131744113, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f));
                            } else {
                                spannableStringBuilder = null;
                            }
                            this.f27688x1.b(spannableStringBuilder, true);
                        }
                        if (str != null) {
                            str2 = id.M0(i7, str);
                        } else {
                            str2 = this.f27641c0;
                        }
                        if (str == null) {
                            drawable = this.f27643d0;
                        }
                        ab.q qVar = this.O0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            qVar.E(valueOf, indexOf);
                            z9 = true;
                            spannableString = valueOf;
                        } else {
                            z9 = false;
                            spannableString = str2;
                        }
                        if (str != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f27655i0 = z10;
                        l5[] l5VarArr = this.f27663n;
                        if ((spannableString == null || l5VarArr[0] != null) && getMeasuredWidth() != 0 && ((l5Var = l5VarArr[0]) == null || l5Var.getVisibility() == 0)) {
                            l5 l5Var2 = l5VarArr[0];
                            if (l5Var2 != null) {
                                l5Var2.animate().cancel();
                                l5 l5Var3 = l5VarArr[1];
                                if (l5Var3 != null) {
                                    l5Var3.animate().cancel();
                                }
                                if (l5VarArr[1] == null) {
                                    t(1);
                                }
                                l5VarArr[1].k(spannableString);
                                l5VarArr[1].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                                l5VarArr[1].i(drawable);
                                l5VarArr[1].setRightDrawableOnClick(this.f27646e0);
                                if (drawable instanceof org.telegram.ui.Components.g5) {
                                    ((org.telegram.ui.Components.g5) drawable).l(l5VarArr[1]);
                                }
                                if (z9) {
                                    qVar.c(l5VarArr[1]);
                                }
                                this.f27656i1 = true;
                                float alpha = l5VarArr[0].getAlpha();
                                l5 l5Var4 = l5VarArr[1];
                                l5VarArr[1] = l5VarArr[0];
                                l5VarArr[0] = l5Var4;
                                l5Var4.setAlpha(0.0f);
                                l5VarArr[0].setTranslationY(-org.telegram.messenger.g0.L(20.0f));
                                l5VarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha2 = l5VarArr[1].animate().alpha(0.0f);
                                if (this.f27671r == null) {
                                    alpha2.translationY(org.telegram.messenger.g0.L(20.0f));
                                } else {
                                    alpha2.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f27692z0 = true;
                                alpha2.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            t(0);
                            if (this.R) {
                                l5VarArr[0].invalidate();
                                invalidate();
                            }
                            l5VarArr[0].k(spannableString);
                            l5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                            l5VarArr[0].i(drawable);
                            l5VarArr[0].setRightDrawableOnClick(this.f27646e0);
                            if (drawable instanceof org.telegram.ui.Components.g5) {
                                ((org.telegram.ui.Components.g5) drawable).l(l5VarArr[0]);
                            }
                            if (z9) {
                                qVar.c(l5VarArr[0]);
                            } else {
                                qVar.x(l5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f27653h0;
                        }
                        this.f27657j0 = runnable;
                    }
                }
            }
        }
    }

    public final void N(dh.c cVar, gh.e eVar, boolean z9) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z9;
        this.U0 = cVar;
        this.V0 = eVar;
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.f27634a = c10;
        if (z9) {
            c10.s(org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(18.33f));
        } else {
            c10.r(org.telegram.messenger.g0.L(23.0f));
        }
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f27637b = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(eVar);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f27640c = c12;
        y yVar = this.E;
        if (yVar != null) {
            yVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.E.setGlassMode(true);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.F.setGlassMode(true);
        }
        ImageView imageView = this.f27645e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public boolean O(View view) {
        if (this.L) {
            l5[] l5VarArr = this.f27663n;
            if (view == l5VarArr[0] || view == l5VarArr[1] || view == this.f27671r || view == this.E || view == this.f27645e || view == this.f27674s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void P(View[] viewArr, boolean[] zArr) {
        if (this.F != null && !this.J) {
            this.J = true;
            k();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.F, property, 0.0f, 1.0f));
            if (viewArr != null) {
                for (View view : viewArr) {
                    if (view != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f, 0.0f));
                    }
                }
            }
            this.Q = viewArr;
            if (this.f27686x == 0) {
                if (!this.f27664n0) {
                    l5 l5Var = this.f27663n[0];
                    if (l5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(l5Var, property, 0.0f));
                    }
                    if (this.f27671r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f27671r, property, 0.0f));
                    }
                }
                y yVar = this.E;
                if (yVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yVar, property, 0.0f));
                }
            }
            int i7 = this.f27686x;
            if (i7 == 0) {
                i7 = this.f27689y;
            }
            if (i7 != 0 && !this.P0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                qs.e().k(qs.f25068r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f27647e1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new ah.l(13, this, zArr));
            this.P.start();
            ImageView imageView = this.f27645e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).c(true, 1.0f);
                }
                this.f27645e.setBackgroundDrawable(l6.h0(this.f27669q0, 1, -1));
            }
        }
    }

    public final void Q() {
        boolean z9;
        if (this.C0 && this.D0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.E0 != z9) {
            this.E0 = z9;
            ab.q qVar = this.O0;
            if (z9) {
                qVar.f989a = true;
                AnimatorSet animatorSet = (AnimatorSet) qVar.f991c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            qVar.f989a = false;
            ((AnimatorSet) qVar.f991c).cancel();
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.B1));
        hashSet.add(Integer.valueOf(this.A1));
    }

    @Override
    public final boolean b(r0 r0Var, RectF rectF) {
        int L;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        float f10 = 0.0f;
        if (r0Var.getParent() == this.E && this.f27640c != null && !this.f27680u1 && !this.Q0 && this.f27660k1 == 0.0f && getActionModeFactor() == 0.0f && !this.f27640c.getBounds().isEmpty()) {
            rectF.set(this.f27640c.getBounds());
            float f11 = L2;
            rectF.inset(f11, f11);
            return true;
        }
        float L3 = org.telegram.messenger.g0.L(46.0f) / 2.0f;
        View view = (View) r0Var.getParent();
        if (view != null) {
            f10 = view.getX();
        }
        float width = (r0Var.getWidth() / 2.0f) + r0Var.getX() + f10;
        float height = ((getHeight() - this.O) - ((getCurrentActionBarHeight() + L) / 2.0f)) + L3;
        rectF.set(width - L3, height - L3, width + L3, height + L3);
        return false;
    }

    public final boolean c(String str) {
        if (this.F != null) {
            String str2 = this.G;
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

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        if (this.S0 != null && this.P0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float f10 = x10;
            float f11 = y10;
            View u10 = u(this, f10, f11, this.S0);
            if (u10 == null) {
                u10 = u(this, f10, f11, null);
            }
            fh.g gVar = this.f27634a;
            boolean z11 = true;
            if (gVar != null && gVar.getBounds().contains(x10, y10)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (u10 != null && u10 != this.S0) {
                fh.g gVar2 = this.f27637b;
                if (gVar2 != null && gVar2.getBounds().contains(x10, y10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z9 | z10;
                fh.g gVar3 = this.f27640c;
                if (gVar3 == null || !gVar3.getBounds().contains(x10, y10)) {
                    z11 = false;
                }
                z9 = z12 | z11;
            }
            if (!z9) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r21, android.view.View r22, long r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final fh.g e(j5 j5Var) {
        dh.c cVar = this.W0;
        if (cVar == null) {
            cVar = this.U0;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(j5Var, null, false);
        c10.p(this.V0);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override
    public final void f(j5 j5Var, r0 r0Var) {
        this.Z0 = j5Var;
        this.f27636a1 = r0Var;
        invalidate();
    }

    public final void g() {
        float f10;
        int w02;
        int w03;
        if (this.f27691y1) {
            if (this.f27693z1) {
                f10 = 1.0f;
            } else {
                f10 = this.D1;
            }
            int i7 = this.B1;
            g6 g6Var = this.J0;
            if (i7 == -1) {
                w02 = 0;
            } else {
                w02 = l6.w0(i7, g6Var);
            }
            int i10 = this.A1;
            if (i10 == -1) {
                w03 = 0;
            } else {
                w03 = l6.w0(i10, g6Var);
            }
            if (w03 == 0) {
                w03 = i0.a.o(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.a.o(w03, 0);
            }
            setBackgroundColor(i0.a.f(f10, w02, w03));
            setShadowAlpha((int) ((1.0f - f10) * 255.0f));
            if (this.L0) {
                invalidate();
            }
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f27679u0;
    }

    public y getActionMode() {
        return this.F;
    }

    public float getActionModeFactor() {
        d dVar = this.F;
        if (dVar != null) {
            return dVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.f27688x1;
    }

    public l5 getAdditionalSubtitleTextView() {
        return this.f27674s;
    }

    public ImageView getBackButton() {
        return this.f27645e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public m4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f27689y;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = this.V0;
        if (eVar != null) {
            return eVar.a(eVar.f13971e);
        }
        return 0;
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return this.V0;
    }

    public boolean getCastShadows() {
        return this.f27659k0;
    }

    public int getExtraHeight() {
        return this.O;
    }

    public int getMeasuredHeightNoExtra() {
        return getMeasuredHeight() - this.O;
    }

    @Override
    public gh.a getMenuGlassColorProvider() {
        return this.V0;
    }

    @Override
    public g6 getMenuResourcesProvider() {
        return this.J0;
    }

    @Override
    public int getMenuRise() {
        return this.Y0;
    }

    @Override
    public View getMenuView() {
        return this.E;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    @Override
    public j5 getOpenMenuOverlay() {
        return this.Z0;
    }

    public l9 getSearchAvatarImageView() {
        return this.f27648f;
    }

    public int getShadowAlpha() {
        return this.f27661l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f27671r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        l5 l5Var = this.f27671r;
        if (l5Var != null) {
            return l5Var.getTextColor();
        }
        return 0;
    }

    public l5 getSubtitleTextView() {
        return this.f27671r;
    }

    public String getTitle() {
        l5 l5Var = this.f27663n[0];
        if (l5Var == null) {
            return null;
        }
        return l5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.f27681v0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f10;
        l5 l5Var = this.f27663n[0];
        if (l5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            return textPaint.getFontMetricsInt();
        }
        return l5Var.getPaint().getFontMetricsInt();
    }

    public l5 getTitleTextView() {
        return this.f27663n[0];
    }

    public l5 getTitleTextView2() {
        return this.f27663n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final void h() {
        if (!id.f23157a0) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new i(0));
            this.f27692z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) xq.f40458f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(boolean z9) {
        boolean z10;
        float f10;
        kn knVar = this.S0;
        if (knVar == null) {
            return;
        }
        gn gnVar = knVar.f35406e;
        if (gnVar != null && gnVar.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f), this.S0.getVisualWidth());
        te.c cVar = this.l1;
        if (z9) {
            if (cVar.h) {
                f10 = cVar.f55506g;
            } else {
                f10 = cVar.f55505f;
            }
            float f11 = min;
            if (f10 != f11) {
                cVar.a(f11);
            }
        } else {
            cVar.c(min);
        }
        this.f27662m1.a(z10, z9);
    }

    public final void j() {
        int i7;
        ImageView imageView = this.f27645e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof y1) && !(drawable instanceof r4)) {
                i7 = 0;
            } else {
                i7 = 2;
            }
            if (this.f27645e.getLayerType() != i7) {
                this.f27645e.setLayerType(i7, null);
                this.f27645e.invalidate();
            }
        }
    }

    public final void k() {
        int i7;
        int i10;
        float f10;
        y yVar = this.E;
        boolean z9 = false;
        if (yVar != null) {
            i7 = (yVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f);
        } else {
            i7 = 0;
        }
        int max = Math.max(0, i7);
        d dVar = this.F;
        if (dVar != null) {
            i10 = (dVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f);
        } else {
            i10 = 0;
        }
        int max2 = Math.max(0, i10);
        org.telegram.messenger.g0.L(46.0f);
        if (this.J) {
            max = max2;
        }
        if (max > 0) {
            z9 = true;
        }
        this.f27666o1.a(z9, this.f27678t1);
        te.c cVar = this.n1;
        if (cVar.h) {
            f10 = cVar.f55506g;
        } else {
            f10 = cVar.f55505f;
        }
        float f11 = max;
        if (f10 != f11) {
            if (this.f27678t1) {
                cVar.a(f11);
            } else {
                cVar.c(f11);
            }
        }
    }

    public final void l() {
        m(true);
    }

    public void m(boolean z9) {
        y yVar;
        if (this.f27664n0 && (yVar = this.E) != null) {
            yVar.i(z9);
        }
    }

    public final y n() {
        return o(null);
    }

    public final y o(String str) {
        float f10;
        int i7;
        if (c(str)) {
            return this.F;
        }
        d dVar = this.F;
        if (dVar != null) {
            removeView(dVar);
            this.F = null;
        }
        this.G = str;
        d dVar2 = new d(this, getContext(), this);
        this.F = dVar2;
        if (this.P0) {
            f10 = -org.telegram.messenger.g0.L(10.0f);
        } else {
            f10 = 0.0f;
        }
        dVar2.setTranslationX(f10);
        this.F.setGlassMode(this.P0);
        d dVar3 = this.F;
        dVar3.f28760c = true;
        dVar3.setClickable(true);
        if (!this.P0) {
            s6.h(l6.f28221w8, this.F, this.J0);
        }
        addView(this.F, indexOfChild(this.f27645e));
        d dVar4 = this.F;
        if (this.I) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        dVar4.setPadding(0, i7, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.O;
        layoutParams.gravity = 5;
        this.F.setLayoutParams(layoutParams);
        this.F.setVisibility(4);
        return this.F;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        Q();
        if (this.J) {
            int i7 = this.f27686x;
            if (i7 == 0) {
                i7 = this.f27689y;
            }
            if (i7 != 0 && !this.P0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                qs.e().k(qs.f25068r4, new Object[0]);
            }
        }
        Drawable drawable = this.f27643d0;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).l(this.f27663n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        Q();
        if (this.J) {
            int i7 = this.f27689y;
            if (i7 != 0 && this.f27686x != 0 && !this.P0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                qs.e().k(qs.f25068r4, new Object[0]);
            }
        }
        Drawable drawable = this.f27643d0;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.R && !this.f27655i0 && !id.f23157a0 && motionEvent.getAction() == 0 && (B0 = l6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            eu0 eu0Var = this.S;
            l5[] l5VarArr = this.f27663n;
            if (eu0Var == null) {
                this.T = null;
                this.S = new eu0(0);
                l5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f34885c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f34884b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(l6.x0(null, l6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i7 = 0; i7 < 20; i7++) {
                    ((ArrayList) obj.d).add(new hz(obj));
                }
                this.T = obj;
                l5VarArr[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.I0;
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
    public void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int L;
        l5[] l5VarArr;
        l5 l5Var;
        int i12;
        int i13;
        int z9;
        int i14;
        int i15;
        l5 l5Var2;
        int i16;
        int i17;
        int makeMeasureSpec;
        float f11;
        int i18;
        k kVar = this;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i19 = 1;
        kVar.H = true;
        View view = kVar.f27683w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.g0.f22557m;
        }
        d dVar = kVar.F;
        if (dVar != null) {
            if (kVar.I) {
                i18 = org.telegram.messenger.g0.f22557m;
            } else {
                i18 = 0;
            }
            dVar.setPadding(0, i18, 0, 0);
        }
        kVar.H = false;
        if (kVar.I) {
            i11 = org.telegram.messenger.g0.f22557m;
        } else {
            i11 = 0;
        }
        kVar.setMeasuredDimension(size, currentActionBarHeight + i11 + kVar.O);
        ImageView imageView = kVar.f27645e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.f27645e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(54.0f), 1073741824), makeMeasureSpec2);
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
        y yVar = kVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f12 = 66.0f;
            if (kVar.E.p() && !kVar.f27664n0) {
                kVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int k10 = kVar.E.k();
                if (kVar.m0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.E.k() + (size - org.telegram.messenger.g0.L(f12)), 1073741824);
                if (!kVar.D) {
                    kVar.E.r(-k10);
                }
            } else if (kVar.f27664n0) {
                if (kVar.m0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = org.telegram.messenger.camera.q.c(f12, size, 1073741824);
                if (!kVar.D) {
                    kVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!kVar.D) {
                    kVar.E.r(0.0f);
                }
            }
            kVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i20 = 0;
        while (true) {
            l5VarArr = kVar.f27663n;
            if (i20 >= 2) {
                break;
            }
            l5 l5Var3 = l5VarArr[0];
            if ((l5Var3 != null && l5Var3.getVisibility() != 8) || ((l5Var = kVar.f27671r) != null && l5Var.getVisibility() != 8)) {
                y yVar2 = kVar.E;
                if (yVar2 != null) {
                    i13 = yVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (kVar.H0) {
                    z9 = size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + i13) + kVar.f27635a0) * 2);
                } else {
                    z9 = org.telegram.messenger.k5.z(16.0f, size - i13, L) - kVar.f27635a0;
                }
                int max = Math.max(z9, 0);
                boolean z10 = kVar.f27690y0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && kVar.f27684w0 && kVar.f27687x0) {
                    l5 l5Var4 = l5VarArr[i20];
                    i12 = i19;
                    if (kVar.P0) {
                        i21 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    l5Var4.setTextSize(i21);
                } else {
                    i12 = i19;
                    l5 l5Var5 = l5VarArr[0];
                    if (l5Var5 != null && l5Var5.getVisibility() != 8 && (l5Var2 = kVar.f27671r) != null && l5Var2.getVisibility() != 8) {
                        l5 l5Var6 = l5VarArr[i20];
                        if (l5Var6 != null) {
                            if (kVar.P0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i21 = 18;
                            }
                            l5Var6.setTextSize(i21);
                        }
                        l5 l5Var7 = kVar.f27671r;
                        if (org.telegram.messenger.g0.Q1()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        l5Var7.setTextSize(i16);
                        l5 l5Var8 = kVar.f27674s;
                        if (l5Var8 != null) {
                            if (org.telegram.messenger.g0.Q1()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            l5Var8.setTextSize(i17);
                        }
                    } else {
                        l5 l5Var9 = l5VarArr[i20];
                        if (l5Var9 != null && l5Var9.getVisibility() != 8) {
                            l5 l5Var10 = l5VarArr[i20];
                            if (kVar.P0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            l5Var10.setTextSize(i21);
                        }
                        l5 l5Var11 = kVar.f27671r;
                        if (l5Var11 != null && l5Var11.getVisibility() != 8) {
                            l5 l5Var12 = kVar.f27671r;
                            if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            l5Var12.setTextSize(i15);
                        }
                        l5 l5Var13 = kVar.f27674s;
                        if (l5Var13 != null) {
                            if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            l5Var13.setTextSize(i14);
                        }
                    }
                }
                l5 l5Var14 = l5VarArr[i20];
                if (l5Var14 != null && l5Var14.getVisibility() != 8) {
                    l5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(l5VarArr[i20].getPaddingBottom() + l5VarArr[i20].getPaddingTop() + org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
                    if (kVar.f27692z0) {
                        CharSequence text = l5VarArr[i20].getText();
                        l5 l5Var15 = l5VarArr[i20];
                        l5Var15.setPivotX(l5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        l5VarArr[i20].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        l5VarArr[i20].setPivotX(0.0f);
                        l5VarArr[i20].setPivotY(0.0f);
                    }
                }
                l5 l5Var16 = kVar.f27671r;
                if (l5Var16 != null && l5Var16.getVisibility() != 8) {
                    kVar.f27671r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                di.j jVar = kVar.f27688x1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                l5 l5Var17 = kVar.f27674s;
                if (l5Var17 != null && l5Var17.getVisibility() != 8) {
                    kVar.f27674s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i12 = i19;
            }
            i20++;
            i19 = i12;
        }
        int i22 = i19;
        l9 l9Var = kVar.f27648f;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = kVar.getChildAt(i23);
            if (childAt.getVisibility() != 8 && childAt != l5VarArr[0] && childAt != l5VarArr[i22] && childAt != kVar.f27688x1 && childAt != kVar.f27671r && childAt != kVar.E && childAt != kVar.f27645e && childAt != kVar.f27674s && childAt != kVar.f27648f) {
                kVar.measureChildWithMargins(childAt, i7, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), 1073741824), 0);
            }
            i23++;
            kVar = this;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.N) {
            return false;
        }
        if (!super.onTouchEvent(motionEvent) && !this.M) {
            return false;
        }
        return true;
    }

    public final void p() {
        if (this.f27674s != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        this.f27674s = l5Var;
        l5Var.setGravity(3);
        this.f27674s.setVisibility(8);
        s6.X(this.f27674s, l6.B8, this.J0);
        addView(this.f27674s, 0, ha.e(-2, -2, 51));
    }

    public final void q() {
        if (this.f27645e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f27645e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f27645e.setBackgroundDrawable(l6.h0(this.f27667p0, 1, -1));
        this.f27645e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.f27645e, ha.e(54, 54, 51));
        this.f27645e.setOnClickListener(new b(this, 1));
        this.f27645e.setContentDescription(id.M0(2131754878, null));
    }

    public final y r() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, ha.e(-2, -1, 5));
        return this.E;
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        if (this.f27671r != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        this.f27671r = l5Var;
        l5Var.setGravity(3);
        this.f27671r.setVisibility(8);
        s6.X(this.f27671r, l6.B8, this.J0);
        addView(this.f27671r, 0, ha.e(-2, -2, 51));
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f27679u0 = jVar;
    }

    public void setActionModeColor(int i7) {
        d dVar = this.F;
        if (dVar != null) {
            r6 r6Var = s6.f28500a;
            dVar.setTag(2131296709, null);
            this.F.setBackgroundColor(i7);
        }
    }

    public void setActionModeOverrideColor(int i7) {
        this.f27686x = i7;
    }

    public void setActionModeTopColor(int i7) {
        View view = this.f27683w;
        if (view != null) {
            s6.q(view);
            this.f27683w.setBackgroundColor(i7);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        C(recyclerView, l6.f27809a7, l6.f28145s8);
    }

    public void setAddToContainer(boolean z9) {
        this.K = z9;
    }

    public void setAdditionalTextLeft(int i7) {
        this.f27652g1 = i7;
    }

    public void setAllowOverlayTitle(boolean z9) {
        this.f27638b0 = z9;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f27645e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i7;
        float f10;
        if (this.f27645e == null) {
            q();
        }
        ImageView imageView = this.f27645e;
        if (drawable == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = this.f27645e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof y1) {
            y1 y1Var = (y1) drawable;
            if (w()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            y1Var.c(false, f10);
            y1Var.b(this.f27675s0);
            y1Var.a(this.f27672r0);
        } else if (drawable instanceof r4) {
            r4 r4Var = (r4) drawable;
            r4Var.f28474k = this.f27689y;
            r4Var.f28473j = this.f27672r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f27645e.setColorFilter(new PorterDuffColorFilter(this.f27672r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.f27642c1) {
            this.f27645e.setColorFilter(new PorterDuffColorFilter(this.f27672r0, PorterDuff.Mode.SRC_IN));
        }
        j();
    }

    public void setBackButtonImage(int i7) {
        int i10;
        if (this.f27645e == null) {
            q();
        }
        ImageView imageView = this.f27645e;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        this.f27645e.setImageResource(i7);
        this.f27645e.setColorFilter(new PorterDuffColorFilter(this.f27672r0, PorterDuff.Mode.SRC_IN));
        j();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f27689y = i7;
        if (!this.L0) {
            super.setBackgroundColor(i7);
        }
        ImageView imageView = this.f27645e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof r4) {
                ((r4) drawable).f28474k = i7;
            }
        }
    }

    public void setCastShadows(boolean z9) {
        if (this.f27659k0 != z9 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f27659k0 = z9;
    }

    public void setCenterTitleAndGlass(boolean z9) {
        int i7;
        if (this.H0 == z9) {
            return;
        }
        this.H0 = z9;
        l5[] l5VarArr = this.f27663n;
        int length = l5VarArr.length;
        int i10 = 0;
        while (true) {
            i7 = 19;
            if (i10 >= length) {
                break;
            }
            l5 l5Var = l5VarArr[i10];
            if (l5Var != null) {
                if (z9) {
                    i7 = 17;
                }
                l5Var.setGravity(i7);
            }
            i10++;
        }
        l5 l5Var2 = this.f27671r;
        if (l5Var2 != null) {
            if (z9) {
                i7 = 17;
            }
            l5Var2.setGravity(i7);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(kn knVar) {
        this.S0 = knVar;
    }

    public void setClipContent(boolean z9) {
        this.L = z9;
    }

    public void setDrawBackButton(boolean z9) {
        this.B0 = z9;
        ImageView imageView = this.f27645e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(tt0 tt0Var) {
        this.L0 = true;
        this.K0 = tt0Var;
        tt0Var.O.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z9) {
        if (this.f27682v1 != z9) {
            this.f27682v1 = z9;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        ImageView imageView = this.f27645e;
        if (imageView != null) {
            imageView.setEnabled(z9);
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.setEnabled(z9);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setEnabled(z9);
        }
    }

    public void setExtraHeight(int i7) {
        this.O = i7;
        d dVar = this.F;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.O;
            this.F.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z9) {
        this.N = z9;
    }

    public void setForcedMenuMinWidth(int i7) {
        this.f27676s1 = true;
        if (this.f27670q1 != i7) {
            this.f27670q1 = i7;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i7) {
        this.f27673r1 = true;
        if (this.f27668p1 != i7) {
            this.f27668p1 = i7;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i7) {
        if (this.f27685w1 != i7) {
            this.f27685w1 = i7;
            invalidate();
        }
        fh.g gVar = this.f27634a;
        if (gVar != null && gVar.f21076c != i7) {
            gVar.setAlpha(i7);
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.I0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z9) {
        this.M = z9;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ri.d dVar = this.X0;
        if (dVar != null) {
            dVar.k(f10);
        }
    }

    public void setMenuOffsetSuppressed(boolean z9) {
        this.D = z9;
    }

    public void setMenuRise(int i7) {
        this.Y0 = i7;
    }

    public void setOccupyStatusBar(boolean z9) {
        int i7;
        this.I = z9;
        d dVar = this.F;
        if (dVar != null) {
            if (z9) {
                i7 = org.telegram.messenger.g0.f22557m;
            } else {
                i7 = 0;
            }
            dVar.setPadding(0, i7, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.f27644d1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z9) {
        this.f27684w0 = z9;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f27646e0 = onClickListener;
        l5[] l5VarArr = this.f27663n;
        l5 l5Var = l5VarArr[0];
        if (l5Var != null) {
            l5Var.setRightDrawableOnClick(onClickListener);
        }
        l5 l5Var2 = l5VarArr[1];
        if (l5Var2 != null) {
            l5Var2.setRightDrawableOnClick(this.f27646e0);
        }
    }

    public void setSearchAvatarImageView(l9 l9Var) {
        l9 l9Var2 = this.f27648f;
        if (l9Var2 != l9Var) {
            if (l9Var2 != null) {
                removeView(l9Var2);
            }
            this.f27648f = l9Var;
            if (l9Var != null) {
                addView(l9Var);
            }
        }
    }

    public void setSearchCursorColor(int i7) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setSearchCursorColor(i7);
        }
    }

    public void setSearchFactor(float f10) {
        if (this.f27660k1 != f10) {
            this.f27660k1 = f10;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(jg.o0 o0Var) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setFilter(o0Var);
        }
    }

    public void setShadowAlpha(int i7) {
        if (this.f27661l0 == i7) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f27661l0 = i7;
    }

    public void setSkipDrawChild(boolean z9) {
        if (this.f27658j1 != z9) {
            this.f27658j1 = z9;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i7;
        if (charSequence != null && this.f27671r == null) {
            s();
        }
        if (this.f27671r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            l5 l5Var = this.f27671r;
            if (!isEmpty && !this.f27664n0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            l5Var.setVisibility(i7);
            this.f27671r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f27671r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i7) {
        if (this.f27671r == null) {
            s();
        }
        s6.q(this.f27671r);
        this.f27671r.setTextColor(i7);
    }

    public void setSupportsHolidayImage(boolean z9) {
        this.R = z9;
        if (z9) {
            this.U = new Paint.FontMetricsInt();
            this.W = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        K(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f27657j0 = runnable;
        this.f27653h0 = runnable;
    }

    public void setTitleColor(int i7) {
        l5[] l5VarArr = this.f27663n;
        if (l5VarArr[0] == null) {
            t(0);
        }
        this.f27681v0 = i7;
        s6.q(l5VarArr[0]);
        l5VarArr[0].setTextColor(i7);
        l5VarArr[0].setEmojiColor(i7);
        l5 l5Var = l5VarArr[1];
        if (l5Var != null) {
            s6.q(l5Var);
            l5VarArr[1].setTextColor(i7);
            l5VarArr[1].setEmojiColor(i7);
        }
    }

    public void setTitleRightMargin(int i7) {
        this.f27635a0 = i7;
    }

    public void setTitleScrollNonFitText(boolean z9) {
        this.f27663n[0].setScrollNonFitText(z9);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.L) {
            invalidate();
        }
    }

    public final void t(int i7) {
        int i10;
        View[] viewArr = this.f27663n;
        if (viewArr[i7] != null) {
            return;
        }
        l5 l5Var = new l5(getContext());
        viewArr[i7] = l5Var;
        if (this.H0) {
            i10 = 17;
        } else {
            i10 = 19;
        }
        l5Var.setGravity(i10);
        int i11 = this.f27681v0;
        if (i11 != 0) {
            viewArr[i7].setTextColor(i11);
        } else {
            s6.X(viewArr[i7], l6.A8, this.J0);
        }
        l5 l5Var2 = viewArr[i7];
        l5Var2.setEmojiColor(l5Var2.getTextColor());
        viewArr[i7].setTypeface(org.telegram.messenger.g0.o());
        viewArr[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        viewArr[i7].setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        viewArr[i7].setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        if (this.G0) {
            this.F0.addView(viewArr[i7], 0, ha.e(-2, -2, 51));
        } else {
            addView(viewArr[i7], 0, ha.e(-2, -2, 51));
        }
    }

    @Override
    public final void updateColors() {
        g();
        fh.g gVar = this.f27634a;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.f27640c;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.f27637b;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        di.j jVar = this.f27688x1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void v() {
        d dVar = this.F;
        if (dVar != null && this.J) {
            int childCount = dVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = dVar.getChildAt(i7);
                if (childAt instanceof r0) {
                    ((r0) childAt).o();
                }
            }
            this.J = false;
            k();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.F, property, 0.0f));
            if (this.Q != null) {
                int i10 = 0;
                while (true) {
                    View[] viewArr = this.Q;
                    if (i10 >= viewArr.length) {
                        break;
                    }
                    View view = viewArr[i10];
                    if (view != null) {
                        view.setVisibility(0);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q[i10], property, 1.0f));
                    }
                    i10++;
                }
            }
            boolean z9 = this.f27664n0;
            l5[] l5VarArr = this.f27663n;
            if (!z9) {
                l5 l5Var = l5VarArr[0];
                if (l5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(l5Var, property, 1.0f));
                }
                if (this.f27671r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f27671r, property, 1.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, property, 1.0f));
            }
            int i11 = this.f27689y;
            if (i11 != 0 && !this.P0) {
                if (i0.a.h(i11) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                qs.e().k(qs.f25068r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f27647e1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f27664n0) {
                l5 l5Var2 = l5VarArr[0];
                if (l5Var2 != null) {
                    l5Var2.setVisibility(0);
                }
                if (this.f27671r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f27671r.setVisibility(0);
                }
            }
            y yVar2 = this.E;
            if (yVar2 != null) {
                yVar2.setVisibility(0);
            }
            ImageView imageView = this.f27645e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).c(true, 0.0f);
                }
                this.f27645e.setBackgroundDrawable(l6.h0(this.f27667p0, 1, -1));
            }
        }
    }

    public final boolean w() {
        if (this.F != null && this.J) {
            return true;
        }
        return false;
    }

    public final boolean x(String str) {
        if (this.F != null && this.J) {
            String str2 = this.G;
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

    public boolean y() {
        return false;
    }

    public void z(boolean z9) {
        float f10;
        Property property;
        float f11;
        float f12;
        float f13;
        int i7;
        this.f27664n0 = z9;
        k();
        AnimatorSet animatorSet = this.f27650f1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f27650f1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean y10 = y();
        if (!y10) {
            l5 l5Var = this.f27663n[0];
            if (l5Var != null) {
                arrayList.add(l5Var);
            }
            if (this.f27671r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f27671r);
                l5 l5Var2 = this.f27671r;
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                l5Var2.setVisibility(i7);
            }
        }
        float f14 = this.f27665o0;
        float f15 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
        ofFloat.addUpdateListener(new a(this, 2));
        this.f27650f1.playTogether(ofFloat);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i10 >= size) {
                break;
            }
            View view = (View) arrayList.get(i10);
            float f16 = 0.95f;
            if (!z9) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            AnimatorSet animatorSet2 = this.f27650f1;
            if (z9) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f12));
            AnimatorSet animatorSet3 = this.f27650f1;
            if (z9) {
                f13 = 0.95f;
            } else {
                f13 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f13));
            AnimatorSet animatorSet4 = this.f27650f1;
            if (!z9) {
                f16 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f16));
            i10++;
        }
        l9 l9Var = this.f27648f;
        if (l9Var != null) {
            l9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.f27650f1;
            l9 l9Var2 = this.f27648f;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(l9Var2, property, f11));
        }
        this.f27692z0 = true;
        requestLayout();
        this.f27650f1.addListener(new f(this, arrayList, z9, y10));
        this.f27650f1.setDuration(150L).start();
        ImageView imageView = this.f27645e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof r4) {
                r4 r4Var = (r4) drawable;
                r4Var.h = true;
                if (z9) {
                    f15 = 1.0f;
                }
                r4Var.a(true, f15);
            }
        }
    }

    public void setAdaptiveBackground(im0 im0Var) {
        int i7 = l6.f27809a7;
        int i10 = l6.f28145s8;
        this.A1 = i7;
        this.B1 = i10;
        this.f27693z1 = org.telegram.messenger.g0.Q1();
        g();
        li.j3 j3Var = new li.j3(28, this, im0Var);
        im0Var.L.add(j3Var);
        if (this.f27691y1) {
            j3Var.run();
            return;
        }
        this.f27691y1 = true;
        boolean canScrollVertically = im0Var.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        this.D1 = !canScrollVertically ? 1.0f : 0.0f;
        g();
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
