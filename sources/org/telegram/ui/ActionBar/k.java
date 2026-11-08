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
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ru0;
public class k extends FrameLayout implements te.b, a6, s4 {
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
    public di.a4 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final f6 J0;
    public boolean K;
    public rt0 K0;
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
    public cu0 S;
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
    public i5 Z0;
    public fh.g f27650a;
    public int f27651a0;
    public r0 f27652a1;
    public fh.g f27653b;
    public boolean f27654b0;
    public final RectF f27655b1;
    public fh.g f27656c;
    public CharSequence f27657c0;
    public boolean f27658c1;
    public final m4 d;
    public Drawable f27659d0;
    public Runnable f27660d1;
    public ImageView f27661e;
    public View.OnClickListener f27662e0;
    public ru0 f27663e1;
    public l9 f27664f;
    public String f27665f0;
    public AnimatorSet f27666f1;
    public final Object[] f27667g0;
    public int f27668g1;
    public Drawable h;
    public Runnable f27669h0;
    public int f27670h1;
    public boolean f27671i0;
    public boolean f27672i1;
    public Runnable f27673j0;
    public boolean f27674j1;
    public boolean f27675k0;
    public float f27676k1;
    public int f27677l0;
    public final te.c l1;
    public boolean m0;
    public final te.a f27678m1;
    public final k5[] f27679n;
    public boolean f27680n0;
    public final te.c n1;
    public float f27681o0;
    public final te.a f27682o1;
    public int f27683p0;
    public int f27684p1;
    public int f27685q0;
    public int f27686q1;
    public k5 f27687r;
    public int f27688r0;
    public boolean f27689r1;
    public k5 f27690s;
    public int f27691s0;
    public boolean f27692s1;
    public f2 f27693t0;
    public boolean f27694t1;
    public j f27695u0;
    public boolean f27696u1;
    public int f27697v0;
    public boolean f27698v1;
    public View f27699w;
    public boolean f27700w0;
    public int f27701w1;
    public int f27702x;
    public boolean f27703x0;
    public di.j f27704x1;
    public int f27705y;
    public boolean f27706y0;
    public boolean f27707y1;
    public boolean f27708z0;
    public boolean f27709z1;

    public k(Context context, f6 f6Var) {
        super(context);
        this.d = m4.f28306a;
        this.f27679n = new k5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f27667g0 = new Object[3];
        this.f27675k0 = true;
        this.f27677l0 = 255;
        this.f27697v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new ab.q(this);
        this.f27655b1 = new RectF();
        xq xqVar = xq.h;
        this.l1 = new te.c(0, this, xqVar, 380L);
        this.f27678m1 = new te.a(0, this, xqVar, 380L, false);
        this.n1 = new te.c(0, this, xqVar, 320L);
        this.f27682o1 = new te.a(0, this, xqVar, 320L, false);
        this.f27698v1 = true;
        this.f27701w1 = 255;
        this.C1 = true;
        this.D1 = 1.0f;
        this.J0 = f6Var;
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
        y yVar = this.E;
        if (yVar != null) {
            boolean z9 = this.f27680n0;
            boolean z10 = !z9;
            int childCount = yVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = yVar.getChildAt(i7);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.u()) {
                        if (!z9) {
                            yVar.f28759b.y(r0Var.T(z10));
                        }
                        r0Var.P("", false);
                        r0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void B(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        this.A1 = i7;
        this.B1 = i10;
        this.f27709z1 = org.telegram.messenger.g0.Q1();
        li.j3 j3Var = new li.j3(29, this, recyclerView);
        recyclerView.j(new ai.b(j3Var, 24));
        if (this.f27707y1) {
            j3Var.run();
            return;
        }
        this.f27707y1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        if (!canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.D1 = f10;
        f();
    }

    public final void C(int i7, boolean z9) {
        ImageView imageView;
        if (z9) {
            this.f27685q0 = i7;
            if (this.J && (imageView = this.f27661e) != null) {
                imageView.setBackgroundDrawable(k6.h0(i7, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f27683p0 = i7;
        ImageView imageView2 = this.f27661e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(k6.h0(i7, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void D(int i7, boolean z9) {
        if (z9) {
            this.f27691s0 = i7;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f27661e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).b(i7);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f27661e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f27688r0 = i7;
            ImageView imageView2 = this.f27661e;
            if (imageView2 != null && i7 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof y1) {
                    ((y1) drawable2).a(i7);
                } else if (drawable2 instanceof r4) {
                    ((r4) drawable2).f28472j = i7;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f27661e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                yVar.t();
            }
        }
        ImageView imageView3 = this.f27661e;
        if (imageView3 != null && this.f27658c1) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f27688r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void E(int i7, boolean z9) {
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

    public final void G(int i7, boolean z9, boolean z10) {
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

    public final void H(int i7, boolean z9) {
        y yVar;
        d dVar;
        if (z9 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i7);
        } else if (!z9 && (yVar = this.E) != null) {
            yVar.setPopupItemsSelectorColor(i7);
        }
    }

    public final void I(int i7, boolean z9) {
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

    public final void J(CharSequence charSequence, org.telegram.ui.Components.g5 g5Var) {
        int i7;
        k5[] k5VarArr = this.f27679n;
        if (charSequence != null && k5VarArr[0] == null) {
            s(0);
        }
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            if (charSequence != null && !this.f27680n0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            k5Var.setVisibility(i7);
            k5 k5Var2 = k5VarArr[0];
            this.f27657c0 = charSequence;
            k5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f27659d0;
                if (drawable instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable).l(null);
                }
            }
            k5 k5Var3 = k5VarArr[0];
            this.f27659d0 = g5Var;
            k5Var3.i(g5Var);
            if (this.C0) {
                Drawable drawable2 = this.f27659d0;
                if (drawable2 instanceof org.telegram.ui.Components.g5) {
                    ((org.telegram.ui.Components.g5) drawable2).l(k5VarArr[0]);
                }
            }
            k5VarArr[0].setRightDrawableOnClick(this.f27662e0);
        }
        this.f27706y0 = false;
    }

    public final void K(CharSequence charSequence, boolean z9, long j3, Interpolator interpolator) {
        boolean z10;
        float f10;
        k5[] k5VarArr = this.f27679n;
        if (k5VarArr[0] != null && charSequence != null) {
            if (this.f27700w0 && !TextUtils.isEmpty(this.A0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f27687r.getVisibility() != 0) {
                    this.f27687r.setVisibility(0);
                    this.f27687r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f27687r.animate();
                if (z9) {
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
            this.f27706y0 = z9;
            k5VarArr[0].setAlpha(0.0f);
            if (!z10) {
                k5 k5Var2 = k5VarArr[0];
                int L = org.telegram.messenger.g0.L(20.0f);
                if (!z9) {
                    L = -L;
                }
                k5Var2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = k5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f27703x0 = true;
            ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
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

    public final void L(String str, int i7, Runnable runnable) {
        String str2;
        boolean z9;
        SpannableString spannableString;
        boolean z10;
        k5 k5Var;
        int indexOf;
        SpannableStringBuilder spannableStringBuilder;
        if (this.f27654b0 && this.f27693t0.parentLayout != null) {
            Object[] objArr = this.f27667g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i7);
            objArr[2] = runnable;
            if (!this.f27672i1) {
                String str3 = this.f27665f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f27665f0 = str;
                        Drawable drawable = null;
                        if (this.f27704x1 != null) {
                            if (i7 == 2131751805) {
                                spannableStringBuilder = org.telegram.messenger.g0.I2(id.M0(2131744116, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f));
                            } else {
                                spannableStringBuilder = null;
                            }
                            this.f27704x1.b(spannableStringBuilder, true);
                        }
                        if (str != null) {
                            str2 = id.M0(i7, str);
                        } else {
                            str2 = this.f27657c0;
                        }
                        if (str == null) {
                            drawable = this.f27659d0;
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
                        this.f27671i0 = z10;
                        k5[] k5VarArr = this.f27679n;
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
                                k5VarArr[1].setRightDrawableOnClick(this.f27662e0);
                                if (drawable instanceof org.telegram.ui.Components.g5) {
                                    ((org.telegram.ui.Components.g5) drawable).l(k5VarArr[1]);
                                }
                                if (z9) {
                                    qVar.c(k5VarArr[1]);
                                }
                                this.f27672i1 = true;
                                k5 k5Var4 = k5VarArr[1];
                                k5VarArr[1] = k5VarArr[0];
                                k5VarArr[0] = k5Var4;
                                k5Var4.setAlpha(0.0f);
                                k5VarArr[0].setTranslationY(-org.telegram.messenger.g0.L(20.0f));
                                k5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = k5VarArr[1].animate().alpha(0.0f);
                                if (this.f27687r == null) {
                                    alpha.translationY(org.telegram.messenger.g0.L(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f27708z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            s(0);
                            if (this.R) {
                                k5VarArr[0].invalidate();
                                invalidate();
                            }
                            k5VarArr[0].k(spannableString);
                            k5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                            k5VarArr[0].i(drawable);
                            k5VarArr[0].setRightDrawableOnClick(this.f27662e0);
                            if (drawable instanceof org.telegram.ui.Components.g5) {
                                ((org.telegram.ui.Components.g5) drawable).l(k5VarArr[0]);
                            }
                            if (z9) {
                                qVar.c(k5VarArr[0]);
                            } else {
                                qVar.x(k5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f27669h0;
                        }
                        this.f27673j0 = runnable;
                    }
                }
            }
        }
    }

    public final void M(dh.c cVar, gh.e eVar, boolean z9) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z9;
        this.U0 = cVar;
        this.V0 = eVar;
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.f27650a = c10;
        if (z9) {
            c10.s(org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(18.33f));
        } else {
            c10.r(org.telegram.messenger.g0.L(23.0f));
        }
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f27653b = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(eVar);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f27656c = c12;
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
        ImageView imageView = this.f27661e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.L) {
            k5[] k5VarArr = this.f27679n;
            if (view == k5VarArr[0] || view == k5VarArr[1] || view == this.f27687r || view == this.E || view == this.f27661e || view == this.f27690s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void O(View[] viewArr, boolean[] zArr) {
        if (this.F != null && !this.J) {
            this.J = true;
            j();
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
            if (this.f27702x == 0) {
                if (!this.f27680n0) {
                    k5 k5Var = this.f27679n[0];
                    if (k5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(k5Var, property, 0.0f));
                    }
                    if (this.f27687r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f27687r, property, 0.0f));
                    }
                }
                y yVar = this.E;
                if (yVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yVar, property, 0.0f));
                }
            }
            int i7 = this.f27702x;
            if (i7 == 0) {
                i7 = this.f27705y;
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
            if (this.f27663e1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new ah.l(13, this, zArr));
            this.P.start();
            ImageView imageView = this.f27661e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).c(true, 1.0f);
                }
                this.f27661e.setBackgroundDrawable(k6.h0(this.f27685q0, 1, -1));
            }
        }
    }

    public final void P() {
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
    public final boolean a(r0 r0Var, RectF rectF) {
        int L;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        float f10 = 0.0f;
        if (r0Var.getParent() == this.E && this.f27656c != null && !this.f27696u1 && !this.Q0 && this.f27676k1 == 0.0f && getActionModeFactor() == 0.0f && !this.f27656c.getBounds().isEmpty()) {
            rectF.set(this.f27656c.getBounds());
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

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.B1));
        hashSet.add(Integer.valueOf(this.A1));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final fh.g c(i5 i5Var) {
        dh.c cVar = this.W0;
        if (cVar == null) {
            cVar = this.U0;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(i5Var, null, false);
        c10.p(this.V0);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    @Override
    public final void d(i5 i5Var, r0 r0Var) {
        this.Z0 = i5Var;
        this.f27652a1 = r0Var;
        invalidate();
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
            View t6 = t(this, f10, f11, this.S0);
            if (t6 == null) {
                t6 = t(this, f10, f11, null);
            }
            fh.g gVar = this.f27650a;
            boolean z11 = true;
            if (gVar != null && gVar.getBounds().contains(x10, y10)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (t6 != null && t6 != this.S0) {
                fh.g gVar2 = this.f27653b;
                if (gVar2 != null && gVar2.getBounds().contains(x10, y10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z9 | z10;
                fh.g gVar3 = this.f27656c;
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

    public final boolean e(String str) {
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

    public final void f() {
        float f10;
        int w02;
        int w03;
        if (this.f27707y1) {
            if (this.f27709z1) {
                f10 = 1.0f;
            } else {
                f10 = this.D1;
            }
            int i7 = this.B1;
            f6 f6Var = this.J0;
            if (i7 == -1) {
                w02 = 0;
            } else {
                w02 = k6.w0(i7, f6Var);
            }
            int i10 = this.A1;
            if (i10 == -1) {
                w03 = 0;
            } else {
                w03 = k6.w0(i10, f6Var);
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

    public final void g() {
        if (!id.f23157a0) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new i(0));
            this.f27708z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) xq.f40366f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public j getActionBarMenuOnItemClick() {
        return this.f27695u0;
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
        return this.f27704x1;
    }

    public k5 getAdditionalSubtitleTextView() {
        return this.f27690s;
    }

    public ImageView getBackButton() {
        return this.f27661e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public m4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f27705y;
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
        return this.f27675k0;
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
    public f6 getMenuResourcesProvider() {
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
    public i5 getOpenMenuOverlay() {
        return this.Z0;
    }

    public l9 getSearchAvatarImageView() {
        return this.f27664f;
    }

    public int getShadowAlpha() {
        return this.f27677l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f27687r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        k5 k5Var = this.f27687r;
        if (k5Var != null) {
            return k5Var.getTextColor();
        }
        return 0;
    }

    public k5 getSubtitleTextView() {
        return this.f27687r;
    }

    public String getTitle() {
        k5 k5Var = this.f27679n[0];
        if (k5Var == null) {
            return null;
        }
        return k5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.f27697v0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f10;
        k5 k5Var = this.f27679n[0];
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
        return this.f27679n[0];
    }

    public k5 getTitleTextView2() {
        return this.f27679n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final void h(boolean z9) {
        boolean z10;
        float f10;
        kn knVar = this.S0;
        if (knVar == null) {
            return;
        }
        gn gnVar = knVar.f35367e;
        if (gnVar != null && gnVar.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f), this.S0.getVisualWidth());
        te.c cVar = this.l1;
        if (z9) {
            if (cVar.h) {
                f10 = cVar.f55494g;
            } else {
                f10 = cVar.f55493f;
            }
            float f11 = min;
            if (f10 != f11) {
                cVar.a(f11);
            }
        } else {
            cVar.c(min);
        }
        this.f27678m1.a(z10, z9);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        int i7;
        ImageView imageView = this.f27661e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof y1) && !(drawable instanceof r4)) {
                i7 = 0;
            } else {
                i7 = 2;
            }
            if (this.f27661e.getLayerType() != i7) {
                this.f27661e.setLayerType(i7, null);
                this.f27661e.invalidate();
            }
        }
    }

    public final void j() {
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
        this.f27682o1.a(z9, this.f27694t1);
        te.c cVar = this.n1;
        if (cVar.h) {
            f10 = cVar.f55494g;
        } else {
            f10 = cVar.f55493f;
        }
        float f11 = max;
        if (f10 != f11) {
            if (this.f27694t1) {
                cVar.a(f11);
            } else {
                cVar.c(f11);
            }
        }
    }

    public final void k() {
        l(true);
    }

    public void l(boolean z9) {
        y yVar;
        if (this.f27680n0 && (yVar = this.E) != null) {
            yVar.i(z9);
        }
    }

    public final y m() {
        return n(null);
    }

    public final y n(String str) {
        float f10;
        int i7;
        if (e(str)) {
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
            r6.i(k6.f28208w8, this.F, this.J0);
        }
        addView(this.F, indexOfChild(this.f27661e));
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

    public final void o() {
        if (this.f27690s != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.f27690s = k5Var;
        k5Var.setGravity(3);
        this.f27690s.setVisibility(8);
        r6.Y(this.f27690s, k6.B8, this.J0);
        addView(this.f27690s, 0, ha.e(-2, -2, 51));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i7 = this.f27702x;
            if (i7 == 0) {
                i7 = this.f27705y;
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
        Drawable drawable = this.f27659d0;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).l(this.f27679n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i7 = this.f27705y;
            if (i7 != 0 && this.f27702x != 0 && !this.P0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                qs.e().k(qs.f25068r4, new Object[0]);
            }
        }
        Drawable drawable = this.f27659d0;
        if (drawable instanceof org.telegram.ui.Components.g5) {
            ((org.telegram.ui.Components.g5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.R && !this.f27671i0 && !id.f23157a0 && motionEvent.getAction() == 0 && (B0 = k6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            cu0 cu0Var = this.S;
            k5[] k5VarArr = this.f27679n;
            if (cu0Var == null) {
                this.T = null;
                this.S = new cu0(0);
                k5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f34846c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f34845b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(k6.x0(null, k6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i7 = 0; i7 < 20; i7++) {
                    ((ArrayList) obj.d).add(new hz(obj));
                }
                this.T = obj;
                k5VarArr[0].invalidate();
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
        k5[] k5VarArr;
        k5 k5Var;
        int i12;
        int i13;
        int z9;
        int i14;
        int i15;
        k5 k5Var2;
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
        View view = kVar.f27699w;
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
        ImageView imageView = kVar.f27661e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.f27661e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(54.0f), 1073741824), makeMeasureSpec2);
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
            if (kVar.E.p() && !kVar.f27680n0) {
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
            } else if (kVar.f27680n0) {
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
            k5VarArr = kVar.f27679n;
            if (i20 >= 2) {
                break;
            }
            k5 k5Var3 = k5VarArr[0];
            if ((k5Var3 != null && k5Var3.getVisibility() != 8) || ((k5Var = kVar.f27687r) != null && k5Var.getVisibility() != 8)) {
                y yVar2 = kVar.E;
                if (yVar2 != null) {
                    i13 = yVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (kVar.H0) {
                    z9 = size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + i13) + kVar.f27651a0) * 2);
                } else {
                    z9 = org.telegram.messenger.k5.z(16.0f, size - i13, L) - kVar.f27651a0;
                }
                int max = Math.max(z9, 0);
                boolean z10 = kVar.f27706y0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && kVar.f27700w0 && kVar.f27703x0) {
                    k5 k5Var4 = k5VarArr[i20];
                    i12 = i19;
                    if (kVar.P0) {
                        i21 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    k5Var4.setTextSize(i21);
                } else {
                    i12 = i19;
                    k5 k5Var5 = k5VarArr[0];
                    if (k5Var5 != null && k5Var5.getVisibility() != 8 && (k5Var2 = kVar.f27687r) != null && k5Var2.getVisibility() != 8) {
                        k5 k5Var6 = k5VarArr[i20];
                        if (k5Var6 != null) {
                            if (kVar.P0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i21 = 18;
                            }
                            k5Var6.setTextSize(i21);
                        }
                        k5 k5Var7 = kVar.f27687r;
                        if (org.telegram.messenger.g0.Q1()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        k5Var7.setTextSize(i16);
                        k5 k5Var8 = kVar.f27690s;
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
                            if (kVar.P0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            k5Var10.setTextSize(i21);
                        }
                        k5 k5Var11 = kVar.f27687r;
                        if (k5Var11 != null && k5Var11.getVisibility() != 8) {
                            k5 k5Var12 = kVar.f27687r;
                            if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            k5Var12.setTextSize(i15);
                        }
                        k5 k5Var13 = kVar.f27690s;
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
                    if (kVar.f27708z0) {
                        CharSequence text = k5VarArr[i20].getText();
                        k5 k5Var15 = k5VarArr[i20];
                        k5Var15.setPivotX(k5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        k5VarArr[i20].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        k5VarArr[i20].setPivotX(0.0f);
                        k5VarArr[i20].setPivotY(0.0f);
                    }
                }
                k5 k5Var16 = kVar.f27687r;
                if (k5Var16 != null && k5Var16.getVisibility() != 8) {
                    kVar.f27687r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                di.j jVar = kVar.f27704x1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                k5 k5Var17 = kVar.f27690s;
                if (k5Var17 != null && k5Var17.getVisibility() != 8) {
                    kVar.f27690s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i12 = i19;
            }
            i20++;
            i19 = i12;
        }
        int i22 = i19;
        l9 l9Var = kVar.f27664f;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = kVar.getChildAt(i23);
            if (childAt.getVisibility() != 8 && childAt != k5VarArr[0] && childAt != k5VarArr[i22] && childAt != kVar.f27704x1 && childAt != kVar.f27687r && childAt != kVar.E && childAt != kVar.f27661e && childAt != kVar.f27690s && childAt != kVar.f27664f) {
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
        if (this.f27661e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f27661e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f27661e.setBackgroundDrawable(k6.h0(this.f27683p0, 1, -1));
        this.f27661e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.f27661e, ha.e(54, 54, 51));
        this.f27661e.setOnClickListener(new b(this, 1));
        this.f27661e.setContentDescription(id.M0(2131754878, null));
    }

    public final y q() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, ha.e(-2, -1, 5));
        return this.E;
    }

    public final void r() {
        if (this.f27687r != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        this.f27687r = k5Var;
        k5Var.setGravity(3);
        this.f27687r.setVisibility(8);
        r6.Y(this.f27687r, k6.B8, this.J0);
        addView(this.f27687r, 0, ha.e(-2, -2, 51));
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i7) {
        int i10;
        View[] viewArr = this.f27679n;
        if (viewArr[i7] != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        viewArr[i7] = k5Var;
        if (this.H0) {
            i10 = 17;
        } else {
            i10 = 19;
        }
        k5Var.setGravity(i10);
        int i11 = this.f27697v0;
        if (i11 != 0) {
            viewArr[i7].setTextColor(i11);
        } else {
            r6.Y(viewArr[i7], k6.A8, this.J0);
        }
        k5 k5Var2 = viewArr[i7];
        k5Var2.setEmojiColor(k5Var2.getTextColor());
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

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f27695u0 = jVar;
    }

    public void setActionModeColor(int i7) {
        d dVar = this.F;
        if (dVar != null) {
            q6 q6Var = r6.f28478a;
            dVar.setTag(2131296709, null);
            this.F.setBackgroundColor(i7);
        }
    }

    public void setActionModeOverrideColor(int i7) {
        this.f27702x = i7;
    }

    public void setActionModeTopColor(int i7) {
        View view = this.f27699w;
        if (view != null) {
            r6.r(view);
            this.f27699w.setBackgroundColor(i7);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        B(recyclerView, k6.f27796a7, k6.f28132s8);
    }

    public void setAddToContainer(boolean z9) {
        this.K = z9;
    }

    public void setAdditionalTextLeft(int i7) {
        this.f27668g1 = i7;
    }

    public void setAllowOverlayTitle(boolean z9) {
        this.f27654b0 = z9;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f27661e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i7;
        float f10;
        if (this.f27661e == null) {
            p();
        }
        ImageView imageView = this.f27661e;
        if (drawable == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = this.f27661e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof y1) {
            y1 y1Var = (y1) drawable;
            if (v()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            y1Var.c(false, f10);
            y1Var.b(this.f27691s0);
            y1Var.a(this.f27688r0);
        } else if (drawable instanceof r4) {
            r4 r4Var = (r4) drawable;
            r4Var.f28473k = this.f27705y;
            r4Var.f28472j = this.f27688r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f27661e.setColorFilter(new PorterDuffColorFilter(this.f27688r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.f27658c1) {
            this.f27661e.setColorFilter(new PorterDuffColorFilter(this.f27688r0, PorterDuff.Mode.SRC_IN));
        }
        i();
    }

    public void setBackButtonImage(int i7) {
        int i10;
        if (this.f27661e == null) {
            p();
        }
        ImageView imageView = this.f27661e;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        this.f27661e.setImageResource(i7);
        this.f27661e.setColorFilter(new PorterDuffColorFilter(this.f27688r0, PorterDuff.Mode.SRC_IN));
        i();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f27705y = i7;
        if (!this.L0) {
            super.setBackgroundColor(i7);
        }
        ImageView imageView = this.f27661e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof r4) {
                ((r4) drawable).f28473k = i7;
            }
        }
    }

    public void setCastShadows(boolean z9) {
        if (this.f27675k0 != z9 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f27675k0 = z9;
    }

    public void setCenterTitleAndGlass(boolean z9) {
        int i7;
        if (this.H0 == z9) {
            return;
        }
        this.H0 = z9;
        k5[] k5VarArr = this.f27679n;
        int length = k5VarArr.length;
        int i10 = 0;
        while (true) {
            i7 = 19;
            if (i10 >= length) {
                break;
            }
            k5 k5Var = k5VarArr[i10];
            if (k5Var != null) {
                if (z9) {
                    i7 = 17;
                }
                k5Var.setGravity(i7);
            }
            i10++;
        }
        k5 k5Var2 = this.f27687r;
        if (k5Var2 != null) {
            if (z9) {
                i7 = 17;
            }
            k5Var2.setGravity(i7);
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
        ImageView imageView = this.f27661e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(rt0 rt0Var) {
        this.L0 = true;
        this.K0 = rt0Var;
        rt0Var.O.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z9) {
        if (this.f27698v1 != z9) {
            this.f27698v1 = z9;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        ImageView imageView = this.f27661e;
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
        this.f27692s1 = true;
        if (this.f27686q1 != i7) {
            this.f27686q1 = i7;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i7) {
        this.f27689r1 = true;
        if (this.f27684p1 != i7) {
            this.f27684p1 = i7;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i7) {
        if (this.f27701w1 != i7) {
            this.f27701w1 = i7;
            invalidate();
        }
        fh.g gVar = this.f27650a;
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
        this.f27660d1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z9) {
        this.f27700w0 = z9;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f27662e0 = onClickListener;
        k5[] k5VarArr = this.f27679n;
        k5 k5Var = k5VarArr[0];
        if (k5Var != null) {
            k5Var.setRightDrawableOnClick(onClickListener);
        }
        k5 k5Var2 = k5VarArr[1];
        if (k5Var2 != null) {
            k5Var2.setRightDrawableOnClick(this.f27662e0);
        }
    }

    public void setSearchAvatarImageView(l9 l9Var) {
        l9 l9Var2 = this.f27664f;
        if (l9Var2 != l9Var) {
            if (l9Var2 != null) {
                removeView(l9Var2);
            }
            this.f27664f = l9Var;
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
        if (this.f27676k1 != f10) {
            this.f27676k1 = f10;
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
        if (this.f27677l0 == i7) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f27677l0 = i7;
    }

    public void setSkipDrawChild(boolean z9) {
        if (this.f27674j1 != z9) {
            this.f27674j1 = z9;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i7;
        if (charSequence != null && this.f27687r == null) {
            r();
        }
        if (this.f27687r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            k5 k5Var = this.f27687r;
            if (!isEmpty && !this.f27680n0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            k5Var.setVisibility(i7);
            this.f27687r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f27687r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i7) {
        if (this.f27687r == null) {
            r();
        }
        r6.r(this.f27687r);
        this.f27687r.setTextColor(i7);
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
        J(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f27673j0 = runnable;
        this.f27669h0 = runnable;
    }

    public void setTitleColor(int i7) {
        k5[] k5VarArr = this.f27679n;
        if (k5VarArr[0] == null) {
            s(0);
        }
        this.f27697v0 = i7;
        r6.r(k5VarArr[0]);
        k5VarArr[0].setTextColor(i7);
        k5VarArr[0].setEmojiColor(i7);
        k5 k5Var = k5VarArr[1];
        if (k5Var != null) {
            r6.r(k5Var);
            k5VarArr[1].setTextColor(i7);
            k5VarArr[1].setEmojiColor(i7);
        }
    }

    public void setTitleRightMargin(int i7) {
        this.f27651a0 = i7;
    }

    public void setTitleScrollNonFitText(boolean z9) {
        this.f27679n[0].setScrollNonFitText(z9);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.L) {
            invalidate();
        }
    }

    public void u() {
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
            j();
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
            boolean z9 = this.f27680n0;
            k5[] k5VarArr = this.f27679n;
            if (!z9) {
                k5 k5Var = k5VarArr[0];
                if (k5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(k5Var, property, 1.0f));
                }
                if (this.f27687r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f27687r, property, 1.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, property, 1.0f));
            }
            int i11 = this.f27705y;
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
            if (this.f27663e1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f27680n0) {
                k5 k5Var2 = k5VarArr[0];
                if (k5Var2 != null) {
                    k5Var2.setVisibility(0);
                }
                if (this.f27687r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f27687r.setVisibility(0);
                }
            }
            y yVar2 = this.E;
            if (yVar2 != null) {
                yVar2.setVisibility(0);
            }
            ImageView imageView = this.f27661e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).c(true, 0.0f);
                }
                this.f27661e.setBackgroundDrawable(k6.h0(this.f27683p0, 1, -1));
            }
        }
    }

    @Override
    public final void updateColors() {
        f();
        fh.g gVar = this.f27650a;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.f27656c;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.f27653b;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        di.j jVar = this.f27704x1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public final boolean v() {
        if (this.F != null && this.J) {
            return true;
        }
        return false;
    }

    public final boolean w(String str) {
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

    public boolean x() {
        return false;
    }

    public void y(boolean z9) {
        float f10;
        Property property;
        float f11;
        float f12;
        float f13;
        int i7;
        this.f27680n0 = z9;
        j();
        AnimatorSet animatorSet = this.f27666f1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f27666f1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean x10 = x();
        if (!x10) {
            k5 k5Var = this.f27679n[0];
            if (k5Var != null) {
                arrayList.add(k5Var);
            }
            if (this.f27687r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f27687r);
                k5 k5Var2 = this.f27687r;
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                k5Var2.setVisibility(i7);
            }
        }
        float f14 = this.f27681o0;
        float f15 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
        ofFloat.addUpdateListener(new a(this, 2));
        this.f27666f1.playTogether(ofFloat);
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
            AnimatorSet animatorSet2 = this.f27666f1;
            if (z9) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f12));
            AnimatorSet animatorSet3 = this.f27666f1;
            if (z9) {
                f13 = 0.95f;
            } else {
                f13 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f13));
            AnimatorSet animatorSet4 = this.f27666f1;
            if (!z9) {
                f16 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f16));
            i10++;
        }
        l9 l9Var = this.f27664f;
        if (l9Var != null) {
            l9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.f27666f1;
            l9 l9Var2 = this.f27664f;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(l9Var2, property, f11));
        }
        this.f27708z0 = true;
        requestLayout();
        this.f27666f1.addListener(new f(this, arrayList, z9, x10));
        this.f27666f1.setDuration(150L).start();
        ImageView imageView = this.f27661e;
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

    public final void z() {
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

    public void setAdaptiveBackground(hm0 hm0Var) {
        int i7 = k6.f27796a7;
        int i10 = k6.f28132s8;
        this.A1 = i7;
        this.B1 = i10;
        this.f27709z1 = org.telegram.messenger.g0.Q1();
        f();
        li.j3 j3Var = new li.j3(28, this, hm0Var);
        hm0Var.L.add(j3Var);
        if (this.f27707y1) {
            j3Var.run();
            return;
        }
        this.f27707y1 = true;
        boolean canScrollVertically = hm0Var.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        this.D1 = !canScrollVertically ? 1.0f : 0.0f;
        f();
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
