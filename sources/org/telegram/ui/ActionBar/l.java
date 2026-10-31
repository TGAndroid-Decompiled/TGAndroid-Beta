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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.wv0;
public class l extends FrameLayout implements fe.e, k6, b5 {
    public CharSequence A0;
    public int A1;
    public boolean B0;
    public boolean B1;
    public boolean C0;
    public float C1;
    public boolean D;
    public boolean D0;
    public ValueAnimator D1;
    public y E;
    public boolean E0;
    public d F;
    public org.telegram.ui.Cells.a5 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final p6 J0;
    public boolean K;
    public uu0 K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public final Paint M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public final ac.a O0;
    public AnimatorSet P;
    public boolean P0;
    public View[] Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public fv0 S;
    public sn S0;
    public hh.c T;
    public boolean T0;
    public Paint.FontMetricsInt U;
    public tg.b U0;
    public boolean V;
    public wg.d V0;
    public Rect W;
    public tg.b W0;
    public hi.d X0;
    public s5 Y0;
    public t0 Z0;
    public vg.f f20468a;
    public int f20469a0;
    public final RectF f20470a1;
    public vg.f f20471b;
    public boolean f20472b0;
    public boolean f20473b1;
    public vg.f f20474c;
    public CharSequence f20475c0;
    public Runnable f20476c1;
    public final u4 d;
    public Drawable f20477d0;
    public wv0 f20478d1;
    public ImageView e;
    public View.OnClickListener f20479e0;
    public AnimatorSet f20480e1;
    public g9 f20481f;
    public String f20482f0;
    public int f20483f1;
    public final Object[] f20484g0;
    public int f20485g1;
    public Drawable h;
    public Runnable f20486h0;
    public boolean f20487h1;
    public boolean f20488i0;
    public boolean f20489i1;
    public Runnable f20490j0;
    public float f20491j1;
    public boolean f20492k0;
    public final fe.f f20493k1;
    public int f20494l0;
    public final fe.b l1;
    public boolean m0;
    public final fe.f f20495m1;
    public final u5[] f20496n;
    public boolean f20497n0;
    public final fe.b f20498n1;
    public float f20499o0;
    public int f20500o1;
    public int f20501p0;
    public int f20502p1;
    public int f20503q0;
    public boolean f20504q1;
    public u5 f20505r;
    public int f20506r0;
    public boolean f20507r1;
    public u5 f20508s;
    public int f20509s0;
    public boolean f20510s1;
    public k2 f20511t0;
    public boolean f20512t1;
    public k f20513u0;
    public boolean f20514u1;
    public int f20515v0;
    public int f20516v1;
    public View f20517w;
    public boolean f20518w0;
    public j f20519w1;
    public int f20520x;
    public boolean f20521x0;
    public boolean f20522x1;
    public int f20523y;
    public boolean f20524y0;
    public boolean f20525y1;
    public boolean f20526z0;
    public int f20527z1;

    public l(Context context, p6 p6Var) {
        super(context);
        this.d = u4.f21348a;
        this.f20496n = new u5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f20484g0 = new Object[3];
        this.f20492k0 = true;
        this.f20494l0 = 255;
        this.f20515v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new ac.a(this);
        this.f20470a1 = new RectF();
        gr grVar = gr.h;
        this.f20493k1 = new fe.f(0, this, grVar, 380L);
        this.l1 = new fe.b(0, this, grVar, 380L, false);
        this.f20495m1 = new fe.f(0, this, grVar, 320L);
        this.f20498n1 = new fe.b(0, this, grVar, 320L, false);
        this.f20514u1 = true;
        this.f20516v1 = 255;
        this.B1 = true;
        this.C1 = 1.0f;
        this.J0 = p6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.i0.Q1()) {
            return org.telegram.messenger.i0.L(58.0f);
        }
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            return org.telegram.messenger.i0.L(48.0f);
        }
        return org.telegram.messenger.i0.L(56.0f);
    }

    public static View s(l lVar, float f7, float f10, View view) {
        for (int childCount = lVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = lVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f7 >= childAt.getX() && f7 <= childAt.getX() + childAt.getWidth() && f10 >= childAt.getTop() && f10 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void A() {
        y yVar = this.E;
        if (yVar != null) {
            boolean z10 = this.f20497n0;
            boolean z11 = !z10;
            int childCount = yVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof t0) {
                    t0 t0Var = (t0) childAt;
                    if (t0Var.u()) {
                        if (!z10) {
                            yVar.f21534b.y(t0Var.T(z11));
                        }
                        t0Var.P("", false);
                        t0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void B(RecyclerView recyclerView, int i10, int i11) {
        float f7;
        this.f20527z1 = i10;
        this.A1 = i11;
        this.f20525y1 = org.telegram.messenger.i0.Q1();
        mh.k kVar = new mh.k(23, this, recyclerView);
        recyclerView.j(new ag.u(kVar, 9));
        if (this.f20522x1) {
            kVar.run();
            return;
        }
        this.f20522x1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.B1 = !canScrollVertically;
        if (!canScrollVertically) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.C1 = f7;
        f();
    }

    public final void C(int i10, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f20503q0 = i10;
            if (this.J && (imageView = this.e) != null) {
                imageView.setBackgroundDrawable(t6.h0(i10, 1, -1));
            }
            d dVar = this.F;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f20501p0 = i10;
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(t6.h0(i10, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void D(int i10, boolean z10) {
        if (z10) {
            this.f20509s0 = i10;
            d dVar = this.F;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof c2) {
                    ((c2) drawable).b(i10);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f20506r0 = i10;
            ImageView imageView2 = this.e;
            if (imageView2 != null && i10 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof c2) {
                    ((c2) drawable2).a(i10);
                } else if (drawable2 instanceof a5) {
                    ((a5) drawable2).f20151j = i10;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.e.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                yVar.t();
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 != null && this.f20473b1) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f20506r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void F(int i10, boolean z10) {
        y yVar;
        d dVar;
        int i11 = 0;
        if (z10 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof t0) {
                    ((t0) childAt).H(i10);
                }
                i11++;
            }
        } else if (!z10 && (yVar = this.E) != null) {
            int childCount2 = yVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = yVar.getChildAt(i11);
                if (childAt2 instanceof t0) {
                    ((t0) childAt2).H(i10);
                }
                i11++;
            }
        }
    }

    public final void G(int i10, boolean z10, boolean z11) {
        y yVar;
        d dVar;
        int i11 = 0;
        if (z11 && (dVar = this.F) != null) {
            int childCount = dVar.getChildCount();
            while (i11 < childCount) {
                View childAt = dVar.getChildAt(i11);
                if (childAt instanceof t0) {
                    ((t0) childAt).O(i10, z10);
                }
                i11++;
            }
        } else if (!z11 && (yVar = this.E) != null) {
            int childCount2 = yVar.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = yVar.getChildAt(i11);
                if (childAt2 instanceof t0) {
                    ((t0) childAt2).O(i10, z10);
                }
                i11++;
            }
        }
    }

    public final void H(int i10, boolean z10) {
        y yVar;
        d dVar;
        if (z10 && (dVar = this.F) != null) {
            dVar.setPopupItemsSelectorColor(i10);
        } else if (!z10 && (yVar = this.E) != null) {
            yVar.setPopupItemsSelectorColor(i10);
        }
    }

    public final void I(int i10, boolean z10) {
        y yVar = this.E;
        if (yVar != null) {
            int childCount = yVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = yVar.getChildAt(i11);
                if (childAt instanceof t0) {
                    t0 t0Var = (t0) childAt;
                    if (t0Var.u()) {
                        if (z10) {
                            t0Var.getSearchField().setHintTextColor(i10);
                            return;
                        } else {
                            t0Var.getSearchField().setTextColor(i10);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void J(CharSequence charSequence, org.telegram.ui.Components.d5 d5Var) {
        int i10;
        u5[] u5VarArr = this.f20496n;
        if (charSequence != null && u5VarArr[0] == null) {
            r(0);
        }
        u5 u5Var = u5VarArr[0];
        if (u5Var != null) {
            if (charSequence != null && !this.f20497n0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            u5Var.setVisibility(i10);
            u5 u5Var2 = u5VarArr[0];
            this.f20475c0 = charSequence;
            u5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f20477d0;
                if (drawable instanceof org.telegram.ui.Components.d5) {
                    ((org.telegram.ui.Components.d5) drawable).l(null);
                }
            }
            u5 u5Var3 = u5VarArr[0];
            this.f20477d0 = d5Var;
            u5Var3.i(d5Var);
            if (this.C0) {
                Drawable drawable2 = this.f20477d0;
                if (drawable2 instanceof org.telegram.ui.Components.d5) {
                    ((org.telegram.ui.Components.d5) drawable2).l(u5VarArr[0]);
                }
            }
            u5VarArr[0].setRightDrawableOnClick(this.f20479e0);
        }
        this.f20524y0 = false;
    }

    public final void K(CharSequence charSequence, boolean z10, long j10, Interpolator interpolator) {
        boolean z11;
        float f7;
        u5[] u5VarArr = this.f20496n;
        if (u5VarArr[0] != null && charSequence != null) {
            if (this.f20518w0 && !TextUtils.isEmpty(this.A0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f20505r.getVisibility() != 0) {
                    this.f20505r.setVisibility(0);
                    this.f20505r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f20505r.animate();
                if (z10) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                z20.l(animate, f7, 220L);
            }
            u5 u5Var = u5VarArr[1];
            if (u5Var != null) {
                if (u5Var.getParent() != null) {
                    ((ViewGroup) u5VarArr[1].getParent()).removeView(u5VarArr[1]);
                }
                u5VarArr[1] = null;
            }
            u5VarArr[1] = u5VarArr[0];
            u5VarArr[0] = null;
            setTitle(charSequence);
            this.f20524y0 = z10;
            u5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                u5 u5Var2 = u5VarArr[0];
                int L = org.telegram.messenger.i0.L(20.0f);
                if (!z10) {
                    L = -L;
                }
                u5Var2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = u5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j10);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f20521x0 = true;
            ViewPropertyAnimator alpha = u5VarArr[1].animate().alpha(0.0f);
            if (!z11) {
                int L2 = org.telegram.messenger.i0.L(20.0f);
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

    public final void L(String str, int i10, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        u5 u5Var;
        int indexOf;
        SpannableStringBuilder spannableStringBuilder;
        if (this.f20472b0 && this.f20511t0.parentLayout != null) {
            Object[] objArr = this.f20484g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i10);
            objArr[2] = runnable;
            if (!this.f20487h1) {
                String str3 = this.f20482f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f20482f0 = str;
                        Drawable drawable = null;
                        if (this.f20519w1 != null) {
                            if (i10 == 2131751805) {
                                spannableStringBuilder = org.telegram.messenger.i0.H2(cd.L0(2131744138, null), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(2.0f));
                            } else {
                                spannableStringBuilder = null;
                            }
                            this.f20519w1.c(spannableStringBuilder, true);
                        }
                        if (str != null) {
                            str2 = cd.L0(i10, str);
                        } else {
                            str2 = this.f20475c0;
                        }
                        if (str == null) {
                            drawable = this.f20477d0;
                        }
                        ac.a aVar = this.O0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            aVar.D(valueOf, indexOf);
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
                        this.f20488i0 = z11;
                        u5[] u5VarArr = this.f20496n;
                        if ((spannableString == null || u5VarArr[0] != null) && getMeasuredWidth() != 0 && ((u5Var = u5VarArr[0]) == null || u5Var.getVisibility() == 0)) {
                            u5 u5Var2 = u5VarArr[0];
                            if (u5Var2 != null) {
                                u5Var2.animate().cancel();
                                u5 u5Var3 = u5VarArr[1];
                                if (u5Var3 != null) {
                                    u5Var3.animate().cancel();
                                }
                                if (u5VarArr[1] == null) {
                                    r(1);
                                }
                                u5VarArr[1].k(spannableString);
                                u5VarArr[1].setDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                                u5VarArr[1].i(drawable);
                                u5VarArr[1].setRightDrawableOnClick(this.f20479e0);
                                if (drawable instanceof org.telegram.ui.Components.d5) {
                                    ((org.telegram.ui.Components.d5) drawable).l(u5VarArr[1]);
                                }
                                if (z10) {
                                    aVar.c(u5VarArr[1]);
                                }
                                this.f20487h1 = true;
                                u5 u5Var4 = u5VarArr[1];
                                u5VarArr[1] = u5VarArr[0];
                                u5VarArr[0] = u5Var4;
                                u5Var4.setAlpha(0.0f);
                                u5VarArr[0].setTranslationY(-org.telegram.messenger.i0.L(20.0f));
                                u5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha = u5VarArr[1].animate().alpha(0.0f);
                                if (this.f20505r == null) {
                                    alpha.translationY(org.telegram.messenger.i0.L(20.0f));
                                } else {
                                    alpha.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f20526z0 = true;
                                alpha.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            r(0);
                            if (this.R) {
                                u5VarArr[0].invalidate();
                                invalidate();
                            }
                            u5VarArr[0].k(spannableString);
                            u5VarArr[0].setDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                            u5VarArr[0].i(drawable);
                            u5VarArr[0].setRightDrawableOnClick(this.f20479e0);
                            if (drawable instanceof org.telegram.ui.Components.d5) {
                                ((org.telegram.ui.Components.d5) drawable).l(u5VarArr[0]);
                            }
                            if (z10) {
                                aVar.c(u5VarArr[0]);
                            } else {
                                aVar.w(u5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f20486h0;
                        }
                        this.f20490j0 = runnable;
                    }
                }
            }
        }
    }

    public final void M(tg.b bVar, wg.d dVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z10;
        this.U0 = bVar;
        this.V0 = dVar;
        vg.f c10 = bVar.c(this, null, false);
        c10.o(dVar);
        c10.p(org.telegram.messenger.i0.L(6.0f));
        this.f20468a = c10;
        if (z10) {
            c10.r(org.telegram.messenger.i0.L(18.33f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(23.0f), org.telegram.messenger.i0.L(18.33f));
        } else {
            c10.q(org.telegram.messenger.i0.L(23.0f));
        }
        vg.f c11 = bVar.c(this, null, false);
        c11.o(dVar);
        z20.u(c11, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.f20471b = c11;
        vg.f c12 = bVar.c(this, null, false);
        c12.o(dVar);
        z20.u(c12, org.telegram.messenger.i0.L(23.0f), 6.0f);
        this.f20474c = c12;
        y yVar = this.E;
        if (yVar != null) {
            yVar.setTranslationX(-org.telegram.messenger.i0.L(10.0f));
            this.E.setGlassMode(true);
        }
        d dVar2 = this.F;
        if (dVar2 != null) {
            dVar2.setTranslationX(-org.telegram.messenger.i0.L(10.0f));
            this.F.setGlassMode(true);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.i0.L(2.0f));
        }
    }

    public boolean N(View view) {
        if (this.L) {
            u5[] u5VarArr = this.f20496n;
            if (view == u5VarArr[0] || view == u5VarArr[1] || view == this.f20505r || view == this.E || view == this.e || view == this.f20508s || view == this.F0) {
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
            if (this.f20520x == 0) {
                if (!this.f20497n0) {
                    u5 u5Var = this.f20496n[0];
                    if (u5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(u5Var, property, 0.0f));
                    }
                    if (this.f20505r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f20505r, property, 0.0f));
                    }
                }
                y yVar = this.E;
                if (yVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yVar, property, 0.0f));
                }
            }
            int i10 = this.f20520x;
            if (i10 == 0) {
                i10 = this.f20523y;
            }
            if (i10 != 0 && !this.P0) {
                if (i0.b.h(i10) < 0.699999988079071d) {
                    org.telegram.messenger.i0.o3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.i0.o3((Activity) getContext(), true);
                }
            } else {
                zs.e().k(zs.f19681r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f20478d1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new bg.f(8, this, zArr));
            this.P.start();
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof c2) {
                    ((c2) drawable).c(true, 1.0f);
                }
                this.e.setBackgroundDrawable(t6.h0(this.f20503q0, 1, -1));
            }
        }
    }

    public final void P() {
        boolean z10;
        if (this.C0 && this.D0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.E0 != z10) {
            this.E0 = z10;
            ac.a aVar = this.O0;
            if (z10) {
                aVar.f362a = true;
                AnimatorSet animatorSet = (AnimatorSet) aVar.f364c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            aVar.f362a = false;
            ((AnimatorSet) aVar.f364c).cancel();
        }
    }

    @Override
    public final boolean a(t0 t0Var, RectF rectF) {
        int L;
        int L2 = org.telegram.messenger.i0.L(6.0f);
        float f7 = 0.0f;
        if (t0Var.getParent() == this.E && this.f20474c != null && !this.f20512t1 && !this.Q0 && this.f20491j1 == 0.0f && getActionModeFactor() == 0.0f && !this.f20474c.getBounds().isEmpty()) {
            rectF.set(this.f20474c.getBounds());
            float f10 = L2;
            rectF.inset(f10, f10);
            return true;
        }
        float L3 = org.telegram.messenger.i0.L(46.0f) / 2.0f;
        View view = (View) t0Var.getParent();
        if (view != null) {
            f7 = view.getX();
        }
        float width = (t0Var.getWidth() / 2.0f) + t0Var.getX() + f7;
        float height = ((getHeight() - this.O) - ((getCurrentActionBarHeight() + L) / 2.0f)) + L3;
        rectF.set(width - L3, height - L3, width + L3, height + L3);
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.A1));
        hashSet.add(Integer.valueOf(this.f20527z1));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final vg.f c(s5 s5Var) {
        tg.b bVar = this.W0;
        if (bVar == null) {
            bVar = this.U0;
        }
        if (bVar == null) {
            return null;
        }
        vg.f c10 = bVar.c(s5Var, null, false);
        c10.o(this.V0);
        z20.u(c10, org.telegram.messenger.i0.L(23.0f), 6.0f);
        return c10;
    }

    @Override
    public final void d(s5 s5Var, t0 t0Var) {
        this.Y0 = s5Var;
        this.Z0 = t0Var;
        invalidate();
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.S0 != null && this.P0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            float f7 = x10;
            float f10 = y3;
            View s10 = s(this, f7, f10, this.S0);
            if (s10 == null) {
                s10 = s(this, f7, f10, null);
            }
            vg.f fVar = this.f20468a;
            boolean z12 = true;
            if (fVar != null && fVar.getBounds().contains(x10, y3)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (s10 != null && s10 != this.S0) {
                vg.f fVar2 = this.f20471b;
                if (fVar2 != null && fVar2.getBounds().contains(x10, y3)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                vg.f fVar3 = this.f20474c;
                if (fVar3 == null || !fVar3.getBounds().contains(x10, y3)) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
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
        float f7;
        int w02;
        int w03;
        if (this.f20522x1) {
            if (this.f20525y1) {
                f7 = 1.0f;
            } else {
                f7 = this.C1;
            }
            int i10 = this.A1;
            p6 p6Var = this.J0;
            if (i10 == -1) {
                w02 = 0;
            } else {
                w02 = t6.w0(i10, p6Var);
            }
            int i11 = this.f20527z1;
            if (i11 == -1) {
                w03 = 0;
            } else {
                w03 = t6.w0(i11, p6Var);
            }
            if (w03 == 0) {
                w03 = i0.b.o(w02, 0);
            }
            if (w02 == 0) {
                w02 = i0.b.o(w03, 0);
            }
            setBackgroundColor(i0.b.f(f7, w02, w03));
            setShadowAlpha((int) ((1.0f - f7) * 255.0f));
            if (this.L0) {
                invalidate();
            }
        }
    }

    public final void g() {
        if (!cd.X) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new i(0));
            this.f20526z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) gr.f26495f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public k getActionBarMenuOnItemClick() {
        return this.f20513u0;
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
        return this.f20519w1;
    }

    public u5 getAdditionalSubtitleTextView() {
        return this.f20508s;
    }

    public ImageView getBackButton() {
        return this.e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public u4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f20523y;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        wg.d dVar = this.V0;
        if (dVar != null) {
            return dVar.a(dVar.e);
        }
        return 0;
    }

    @Override
    public wg.a getButtonsGlassColorProvider() {
        return this.V0;
    }

    public boolean getCastShadows() {
        return this.f20492k0;
    }

    public int getExtraHeight() {
        return this.O;
    }

    public int getMeasuredHeightNoExtra() {
        return getMeasuredHeight() - this.O;
    }

    @Override
    public wg.a getMenuGlassColorProvider() {
        return this.V0;
    }

    @Override
    public p6 getMenuResourcesProvider() {
        return this.J0;
    }

    @Override
    public View getMenuView() {
        return this.E;
    }

    public boolean getOccupyStatusBar() {
        return this.I;
    }

    @Override
    public s5 getOpenMenuOverlay() {
        return this.Y0;
    }

    public g9 getSearchAvatarImageView() {
        return this.f20481f;
    }

    public int getShadowAlpha() {
        return this.f20494l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f20505r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        u5 u5Var = this.f20505r;
        if (u5Var != null) {
            return u5Var.getTextColor();
        }
        return 0;
    }

    public u5 getSubtitleTextView() {
        return this.f20505r;
    }

    public String getTitle() {
        u5 u5Var = this.f20496n[0];
        if (u5Var == null) {
            return null;
        }
        return u5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.f20515v0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f7;
        u5 u5Var = this.f20496n[0];
        if (u5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!org.telegram.messenger.i0.Q1() && getResources().getConfiguration().orientation == 2) {
                f7 = 18.0f;
            } else {
                f7 = 20.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.i0.L(f7));
            return textPaint.getFontMetricsInt();
        }
        return u5Var.getPaint().getFontMetricsInt();
    }

    public u5 getTitleTextView() {
        return this.f20496n[0];
    }

    public u5 getTitleTextView2() {
        return this.f20496n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final void h(boolean z10) {
        boolean z11;
        float f7;
        sn snVar = this.S0;
        if (snVar == null) {
            return;
        }
        on onVar = snVar.e;
        if (onVar != null && onVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.i0.L(116.0f), this.S0.getVisualWidth());
        fe.f fVar = this.f20493k1;
        if (z10) {
            if (fVar.h) {
                f7 = fVar.f7032g;
            } else {
                f7 = fVar.f7031f;
            }
            float f10 = min;
            if (f7 != f10) {
                fVar.a(f10);
            }
        } else {
            fVar.c(min);
        }
        this.l1.a(z11, z10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        int i10;
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof c2) && !(drawable instanceof a5)) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            if (this.e.getLayerType() != i10) {
                this.e.setLayerType(i10, null);
                this.e.invalidate();
            }
        }
    }

    public final void j() {
        int i10;
        int i11;
        float f7;
        y yVar = this.E;
        boolean z10 = false;
        if (yVar != null) {
            i10 = (yVar.getItemsWidth() - org.telegram.messenger.i0.L(1.0f)) - org.telegram.messenger.i0.L(1.0f);
        } else {
            i10 = 0;
        }
        int max = Math.max(0, i10);
        d dVar = this.F;
        if (dVar != null) {
            i11 = (dVar.getItemsWidth() - org.telegram.messenger.i0.L(1.0f)) - org.telegram.messenger.i0.L(1.0f);
        } else {
            i11 = 0;
        }
        int max2 = Math.max(0, i11);
        org.telegram.messenger.i0.L(46.0f);
        if (this.J) {
            max = max2;
        }
        if (max > 0) {
            z10 = true;
        }
        this.f20498n1.a(z10, this.f20510s1);
        fe.f fVar = this.f20495m1;
        if (fVar.h) {
            f7 = fVar.f7032g;
        } else {
            f7 = fVar.f7031f;
        }
        float f10 = max;
        if (f7 != f10) {
            if (this.f20510s1) {
                fVar.a(f10);
            } else {
                fVar.c(f10);
            }
        }
    }

    public void k(boolean z10) {
        y yVar;
        if (this.f20497n0 && (yVar = this.E) != null) {
            yVar.i(z10);
        }
    }

    public final y l() {
        return m(null);
    }

    public final y m(String str) {
        float f7;
        int i10;
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
            f7 = -org.telegram.messenger.i0.L(10.0f);
        } else {
            f7 = 0.0f;
        }
        dVar2.setTranslationX(f7);
        this.F.setGlassMode(this.P0);
        d dVar3 = this.F;
        dVar3.f21535c = true;
        dVar3.setClickable(true);
        if (!this.P0) {
            a7.i(t6.f21279w8, this.F, this.J0);
        }
        addView(this.F, indexOfChild(this.e));
        d dVar4 = this.F;
        if (this.I) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        dVar4.setPadding(0, i10, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.O;
        layoutParams.gravity = 5;
        this.F.setLayoutParams(layoutParams);
        this.F.setVisibility(4);
        return this.F;
    }

    public final void n() {
        if (this.f20508s != null) {
            return;
        }
        u5 u5Var = new u5(getContext());
        this.f20508s = u5Var;
        u5Var.setGravity(3);
        this.f20508s.setVisibility(8);
        a7.Y(this.f20508s, t6.B8, this.J0);
        addView(this.f20508s, 0, w7.b6.e(-2, -2, 51));
    }

    public final void o() {
        if (this.e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.e.setBackgroundDrawable(t6.h0(this.f20501p0, 1, -1));
        this.e.setPadding(org.telegram.messenger.i0.L(1.0f), 0, 0, 0);
        addView(this.e, w7.b6.e(54, 54, 51));
        this.e.setOnClickListener(new b(this, 1));
        this.e.setContentDescription(cd.L0(2131754878, null));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        P();
        if (this.J) {
            int i10 = this.f20520x;
            if (i10 == 0) {
                i10 = this.f20523y;
            }
            if (i10 != 0 && !this.P0) {
                if (i0.b.h(i10) < 0.699999988079071d) {
                    org.telegram.messenger.i0.o3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.i0.o3((Activity) getContext(), true);
                }
            } else {
                zs.e().k(zs.f19681r4, new Object[0]);
            }
        }
        Drawable drawable = this.f20477d0;
        if (drawable instanceof org.telegram.ui.Components.d5) {
            ((org.telegram.ui.Components.d5) drawable).l(this.f20496n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        P();
        if (this.J) {
            int i10 = this.f20523y;
            if (i10 != 0 && this.f20520x != 0 && !this.P0) {
                if (i0.b.h(i10) < 0.699999988079071d) {
                    org.telegram.messenger.i0.o3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.i0.o3((Activity) getContext(), true);
                }
            } else {
                zs.e().k(zs.f19681r4, new Object[0]);
            }
        }
        Drawable drawable = this.f20477d0;
        if (drawable instanceof org.telegram.ui.Components.d5) {
            ((org.telegram.ui.Components.d5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.R && !this.f20488i0 && !cd.X && motionEvent.getAction() == 0 && (B0 = t6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            fv0 fv0Var = this.S;
            u5[] u5VarArr = this.f20496n;
            if (fv0Var == null) {
                this.T = null;
                this.S = new fv0(0);
                u5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f7689c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f7688b = paint;
                paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
                paint.setColor(t6.x0(null, t6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i10 = 0; i10 < 20; i10++) {
                    ((ArrayList) obj.d).add(new vz(obj));
                }
                this.T = obj;
                u5VarArr[0].invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int L;
        u5[] u5VarArr;
        u5 u5Var;
        int i13;
        int i14;
        int z10;
        int i15;
        int i16;
        u5 u5Var2;
        int i17;
        int i18;
        int makeMeasureSpec;
        float f10;
        int i19;
        l lVar = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i20 = 1;
        lVar.H = true;
        View view = lVar.f20517w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.i0.f16020m;
        }
        d dVar = lVar.F;
        if (dVar != null) {
            if (lVar.I) {
                i19 = org.telegram.messenger.i0.f16020m;
            } else {
                i19 = 0;
            }
            dVar.setPadding(0, i19, 0, 0);
        }
        lVar.H = false;
        if (lVar.I) {
            i12 = org.telegram.messenger.i0.f16020m;
        } else {
            i12 = 0;
        }
        lVar.setMeasuredDimension(size, currentActionBarHeight + i12 + lVar.O);
        ImageView imageView = lVar.e;
        if (imageView != null && imageView.getVisibility() != 8) {
            lVar.e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(54.0f), 1073741824), makeMeasureSpec2);
            if (org.telegram.messenger.i0.Q1()) {
                f10 = 80.0f;
            } else {
                f10 = 72.0f;
            }
            L = org.telegram.messenger.i0.L(f10);
        } else {
            if (org.telegram.messenger.i0.Q1()) {
                f7 = 26.0f;
            } else {
                f7 = 18.0f;
            }
            L = org.telegram.messenger.i0.L(f7);
        }
        y yVar = lVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f11 = 66.0f;
            if (lVar.E.p() && !lVar.f20497n0) {
                lVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int k10 = lVar.E.k();
                if (lVar.m0) {
                    f11 = 0.0f;
                } else if (org.telegram.messenger.i0.Q1()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(lVar.E.k() + (size - org.telegram.messenger.i0.L(f11)), 1073741824);
                if (!lVar.D) {
                    lVar.E.r(-k10);
                }
            } else if (lVar.f20497n0) {
                if (lVar.m0) {
                    f11 = 0.0f;
                } else if (org.telegram.messenger.i0.Q1()) {
                    f11 = 74.0f;
                }
                makeMeasureSpec = z20.c(f11, size, 1073741824);
                if (!lVar.D) {
                    lVar.E.r(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!lVar.D) {
                    lVar.E.r(0.0f);
                }
            }
            lVar.E.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i21 = 0;
        while (true) {
            u5VarArr = lVar.f20496n;
            if (i21 >= 2) {
                break;
            }
            u5 u5Var3 = u5VarArr[0];
            if ((u5Var3 != null && u5Var3.getVisibility() != 8) || ((u5Var = lVar.f20505r) != null && u5Var.getVisibility() != 8)) {
                y yVar2 = lVar.E;
                if (yVar2 != null) {
                    i14 = yVar2.getMeasuredWidth();
                } else {
                    i14 = 0;
                }
                if (lVar.H0) {
                    z10 = size - (Math.max(L, (org.telegram.messenger.i0.L(16.0f) + i14) + lVar.f20469a0) * 2);
                } else {
                    z10 = org.telegram.messenger.m5.z(16.0f, size - i14, L) - lVar.f20469a0;
                }
                int max = Math.max(z10, 0);
                boolean z11 = lVar.f20524y0;
                int i22 = 20;
                if (((z11 && i21 == 0) || (!z11 && i21 == i20)) && lVar.f20518w0 && lVar.f20521x0) {
                    u5 u5Var4 = u5VarArr[i21];
                    i13 = i20;
                    if (lVar.P0) {
                        i22 = 17;
                    } else if (!org.telegram.messenger.i0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                        i22 = 18;
                    }
                    u5Var4.setTextSize(i22);
                } else {
                    i13 = i20;
                    u5 u5Var5 = u5VarArr[0];
                    if (u5Var5 != null && u5Var5.getVisibility() != 8 && (u5Var2 = lVar.f20505r) != null && u5Var2.getVisibility() != 8) {
                        u5 u5Var6 = u5VarArr[i21];
                        if (u5Var6 != null) {
                            if (lVar.P0) {
                                i22 = 17;
                            } else if (!org.telegram.messenger.i0.Q1()) {
                                i22 = 18;
                            }
                            u5Var6.setTextSize(i22);
                        }
                        u5 u5Var7 = lVar.f20505r;
                        if (org.telegram.messenger.i0.Q1()) {
                            i17 = 16;
                        } else {
                            i17 = 14;
                        }
                        u5Var7.setTextSize(i17);
                        u5 u5Var8 = lVar.f20508s;
                        if (u5Var8 != null) {
                            if (org.telegram.messenger.i0.Q1()) {
                                i18 = 16;
                            } else {
                                i18 = 14;
                            }
                            u5Var8.setTextSize(i18);
                        }
                    } else {
                        u5 u5Var9 = u5VarArr[i21];
                        if (u5Var9 != null && u5Var9.getVisibility() != 8) {
                            u5 u5Var10 = u5VarArr[i21];
                            if (lVar.P0) {
                                i22 = 17;
                            } else if (!org.telegram.messenger.i0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                                i22 = 18;
                            }
                            u5Var10.setTextSize(i22);
                        }
                        u5 u5Var11 = lVar.f20505r;
                        if (u5Var11 != null && u5Var11.getVisibility() != 8) {
                            u5 u5Var12 = lVar.f20505r;
                            if (!org.telegram.messenger.i0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                                i16 = 14;
                            } else {
                                i16 = 16;
                            }
                            u5Var12.setTextSize(i16);
                        }
                        u5 u5Var13 = lVar.f20508s;
                        if (u5Var13 != null) {
                            if (!org.telegram.messenger.i0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            u5Var13.setTextSize(i15);
                        }
                    }
                }
                u5 u5Var14 = u5VarArr[i21];
                if (u5Var14 != null && u5Var14.getVisibility() != 8) {
                    u5VarArr[i21].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(u5VarArr[i21].getPaddingBottom() + u5VarArr[i21].getPaddingTop() + org.telegram.messenger.i0.L(24.0f), Integer.MIN_VALUE));
                    if (lVar.f20526z0) {
                        CharSequence text = u5VarArr[i21].getText();
                        u5 u5Var15 = u5VarArr[i21];
                        u5Var15.setPivotX(u5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        u5VarArr[i21].setPivotY(org.telegram.messenger.i0.L(24.0f) >> 1);
                    } else {
                        u5VarArr[i21].setPivotX(0.0f);
                        u5VarArr[i21].setPivotY(0.0f);
                    }
                }
                u5 u5Var16 = lVar.f20505r;
                if (u5Var16 != null && u5Var16.getVisibility() != 8) {
                    lVar.f20505r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), Integer.MIN_VALUE));
                }
                j jVar = lVar.f20519w1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                u5 u5Var17 = lVar.f20508s;
                if (u5Var17 != null && u5Var17.getVisibility() != 8) {
                    lVar.f20508s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i13 = i20;
            }
            i21++;
            i20 = i13;
        }
        int i23 = i20;
        g9 g9Var = lVar.f20481f;
        if (g9Var != null) {
            g9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), 1073741824));
        }
        int childCount = lVar.getChildCount();
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = lVar.getChildAt(i24);
            if (childAt.getVisibility() != 8 && childAt != u5VarArr[0] && childAt != u5VarArr[i23] && childAt != lVar.f20519w1 && childAt != lVar.f20505r && childAt != lVar.E && childAt != lVar.e && childAt != lVar.f20508s && childAt != lVar.f20481f) {
                lVar.measureChildWithMargins(childAt, i10, 0, View.MeasureSpec.makeMeasureSpec(lVar.getMeasuredHeight(), 1073741824), 0);
            }
            i24++;
            lVar = this;
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

    public final y p() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, w7.b6.e(-2, -1, 5));
        return this.E;
    }

    public final void q() {
        if (this.f20505r != null) {
            return;
        }
        u5 u5Var = new u5(getContext());
        this.f20505r = u5Var;
        u5Var.setGravity(3);
        this.f20505r.setVisibility(8);
        a7.Y(this.f20505r, t6.B8, this.J0);
        addView(this.f20505r, 0, w7.b6.e(-2, -2, 51));
    }

    public final void r(int i10) {
        int i11;
        View[] viewArr = this.f20496n;
        if (viewArr[i10] != null) {
            return;
        }
        u5 u5Var = new u5(getContext());
        viewArr[i10] = u5Var;
        if (this.H0) {
            i11 = 17;
        } else {
            i11 = 19;
        }
        u5Var.setGravity(i11);
        int i12 = this.f20515v0;
        if (i12 != 0) {
            viewArr[i10].setTextColor(i12);
        } else {
            a7.Y(viewArr[i10], t6.A8, this.J0);
        }
        u5 u5Var2 = viewArr[i10];
        u5Var2.setEmojiColor(u5Var2.getTextColor());
        viewArr[i10].setTypeface(org.telegram.messenger.i0.o());
        viewArr[i10].setDrawablePadding(org.telegram.messenger.i0.L(4.0f));
        viewArr[i10].setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        viewArr[i10].setRightDrawableTopPadding(-org.telegram.messenger.i0.L(1.0f));
        if (this.G0) {
            this.F0.addView(viewArr[i10], 0, w7.b6.e(-2, -2, 51));
        } else {
            addView(viewArr[i10], 0, w7.b6.e(-2, -2, 51));
        }
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setActionBarMenuOnItemClick(k kVar) {
        this.f20513u0 = kVar;
    }

    public void setActionModeColor(int i10) {
        d dVar = this.F;
        if (dVar != null) {
            z6 z6Var = a7.f20157a;
            dVar.setTag(2131296709, null);
            this.F.setBackgroundColor(i10);
        }
    }

    public void setActionModeOverrideColor(int i10) {
        this.f20520x = i10;
    }

    public void setActionModeTopColor(int i10) {
        View view = this.f20517w;
        if (view != null) {
            a7.r(view);
            this.f20517w.setBackgroundColor(i10);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        B(recyclerView, t6.f20872a7, t6.f21206s8);
    }

    public void setAddToContainer(boolean z10) {
        this.K = z10;
    }

    public void setAdditionalTextLeft(int i10) {
        this.f20483f1 = i10;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f20472b0 = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i10;
        float f7;
        if (this.e == null) {
            o();
        }
        ImageView imageView = this.e;
        if (drawable == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = this.e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof c2) {
            c2 c2Var = (c2) drawable;
            if (u()) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            c2Var.c(false, f7);
            c2Var.b(this.f20509s0);
            c2Var.a(this.f20506r0);
        } else if (drawable instanceof a5) {
            a5 a5Var = (a5) drawable;
            a5Var.f20152k = this.f20523y;
            a5Var.f20151j = this.f20506r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f20506r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.f20473b1) {
            this.e.setColorFilter(new PorterDuffColorFilter(this.f20506r0, PorterDuff.Mode.SRC_IN));
        }
        i();
    }

    public void setBackButtonImage(int i10) {
        int i11;
        if (this.e == null) {
            o();
        }
        ImageView imageView = this.e;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        imageView.setVisibility(i11);
        this.e.setImageResource(i10);
        this.e.setColorFilter(new PorterDuffColorFilter(this.f20506r0, PorterDuff.Mode.SRC_IN));
        i();
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f20523y = i10;
        if (!this.L0) {
            super.setBackgroundColor(i10);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof a5) {
                ((a5) drawable).f20152k = i10;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f20492k0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f20492k0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        int i10;
        if (this.H0 == z10) {
            return;
        }
        this.H0 = z10;
        u5[] u5VarArr = this.f20496n;
        int length = u5VarArr.length;
        int i11 = 0;
        while (true) {
            i10 = 19;
            if (i11 >= length) {
                break;
            }
            u5 u5Var = u5VarArr[i11];
            if (u5Var != null) {
                if (z10) {
                    i10 = 17;
                }
                u5Var.setGravity(i10);
            }
            i11++;
        }
        u5 u5Var2 = this.f20505r;
        if (u5Var2 != null) {
            if (z10) {
                i10 = 17;
            }
            u5Var2.setGravity(i10);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(sn snVar) {
        this.S0 = snVar;
    }

    public void setClipContent(boolean z10) {
        this.L = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.B0 = z10;
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(uu0 uu0Var) {
        this.L0 = true;
        this.K0 = uu0Var;
        uu0Var.O.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.f20514u1 != z10) {
            this.f20514u1 = z10;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.setEnabled(z10);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i10) {
        this.O = i10;
        d dVar = this.F;
        if (dVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin = this.O;
            this.F.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z10) {
        this.N = z10;
    }

    public void setForcedMenuMinWidth(int i10) {
        this.f20507r1 = true;
        if (this.f20502p1 != i10) {
            this.f20502p1 = i10;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i10) {
        this.f20504q1 = true;
        if (this.f20500o1 != i10) {
            this.f20500o1 = i10;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i10) {
        if (this.f20516v1 != i10) {
            this.f20516v1 = i10;
            invalidate();
        }
        vg.f fVar = this.f20468a;
        if (fVar != null && fVar.f6649c != i10) {
            fVar.setAlpha(i10);
            invalidate();
        }
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.I0 = onTouchListener;
    }

    public void setInterceptTouches(boolean z10) {
        this.M = z10;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f7) {
        hi.d dVar = this.X0;
        if (dVar != null) {
            dVar.b(f7);
        }
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.D = z10;
    }

    public void setOccupyStatusBar(boolean z10) {
        int i10;
        this.I = z10;
        d dVar = this.F;
        if (dVar != null) {
            if (z10) {
                i10 = org.telegram.messenger.i0.f16020m;
            } else {
                i10 = 0;
            }
            dVar.setPadding(0, i10, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.f20476c1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f20518w0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f20479e0 = onClickListener;
        u5[] u5VarArr = this.f20496n;
        u5 u5Var = u5VarArr[0];
        if (u5Var != null) {
            u5Var.setRightDrawableOnClick(onClickListener);
        }
        u5 u5Var2 = u5VarArr[1];
        if (u5Var2 != null) {
            u5Var2.setRightDrawableOnClick(this.f20479e0);
        }
    }

    public void setSearchAvatarImageView(g9 g9Var) {
        g9 g9Var2 = this.f20481f;
        if (g9Var2 != g9Var) {
            if (g9Var2 != null) {
                removeView(g9Var2);
            }
            this.f20481f = g9Var;
            if (g9Var != null) {
                addView(g9Var);
            }
        }
    }

    public void setSearchCursorColor(int i10) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setSearchCursorColor(i10);
        }
    }

    public void setSearchFactor(float f7) {
        if (this.f20491j1 != f7) {
            this.f20491j1 = f7;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.E.setSearchFieldText(str);
    }

    public void setSearchFilter(zf.e0 e0Var) {
        y yVar = this.E;
        if (yVar != null) {
            yVar.setFilter(e0Var);
        }
    }

    public void setShadowAlpha(int i10) {
        if (this.f20494l0 == i10) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f20494l0 = i10;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.f20489i1 != z10) {
            this.f20489i1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10;
        if (charSequence != null && this.f20505r == null) {
            q();
        }
        if (this.f20505r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            u5 u5Var = this.f20505r;
            if (!isEmpty && !this.f20497n0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u5Var.setVisibility(i10);
            this.f20505r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f20505r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i10) {
        if (this.f20505r == null) {
            q();
        }
        a7.r(this.f20505r);
        this.f20505r.setTextColor(i10);
    }

    public void setSupportsHolidayImage(boolean z10) {
        this.R = z10;
        if (z10) {
            this.U = new Paint.FontMetricsInt();
            this.W = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        J(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f20490j0 = runnable;
        this.f20486h0 = runnable;
    }

    public void setTitleColor(int i10) {
        u5[] u5VarArr = this.f20496n;
        if (u5VarArr[0] == null) {
            r(0);
        }
        this.f20515v0 = i10;
        a7.r(u5VarArr[0]);
        u5VarArr[0].setTextColor(i10);
        u5VarArr[0].setEmojiColor(i10);
        u5 u5Var = u5VarArr[1];
        if (u5Var != null) {
            a7.r(u5Var);
            u5VarArr[1].setTextColor(i10);
            u5VarArr[1].setEmojiColor(i10);
        }
    }

    public void setTitleRightMargin(int i10) {
        this.f20469a0 = i10;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f20496n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        if (this.L) {
            invalidate();
        }
    }

    public void t() {
        d dVar = this.F;
        if (dVar != null && this.J) {
            int childCount = dVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof t0) {
                    ((t0) childAt).o();
                }
            }
            this.J = false;
            j();
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(this.F, property, 0.0f));
            if (this.Q != null) {
                int i11 = 0;
                while (true) {
                    View[] viewArr = this.Q;
                    if (i11 >= viewArr.length) {
                        break;
                    }
                    View view = viewArr[i11];
                    if (view != null) {
                        view.setVisibility(0);
                        arrayList.add(ObjectAnimator.ofFloat(this.Q[i11], property, 1.0f));
                    }
                    i11++;
                }
            }
            boolean z10 = this.f20497n0;
            u5[] u5VarArr = this.f20496n;
            if (!z10) {
                u5 u5Var = u5VarArr[0];
                if (u5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(u5Var, property, 1.0f));
                }
                if (this.f20505r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f20505r, property, 1.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, property, 1.0f));
            }
            int i12 = this.f20523y;
            if (i12 != 0 && !this.P0) {
                if (i0.b.h(i12) < 0.699999988079071d) {
                    org.telegram.messenger.i0.o3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.i0.o3((Activity) getContext(), true);
                }
            } else {
                zs.e().k(zs.f19681r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f20478d1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new e(this, 0));
            this.P.start();
            if (!this.f20497n0) {
                u5 u5Var2 = u5VarArr[0];
                if (u5Var2 != null) {
                    u5Var2.setVisibility(0);
                }
                if (this.f20505r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f20505r.setVisibility(0);
                }
            }
            y yVar2 = this.E;
            if (yVar2 != null) {
                yVar2.setVisibility(0);
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof c2) {
                    ((c2) drawable).c(true, 0.0f);
                }
                this.e.setBackgroundDrawable(t6.h0(this.f20501p0, 1, -1));
            }
        }
    }

    public final boolean u() {
        if (this.F != null && this.J) {
            return true;
        }
        return false;
    }

    @Override
    public final void updateColors() {
        f();
        vg.f fVar = this.f20468a;
        if (fVar != null) {
            fVar.updateColors();
        }
        vg.f fVar2 = this.f20474c;
        if (fVar2 != null) {
            fVar2.updateColors();
        }
        vg.f fVar3 = this.f20471b;
        if (fVar3 != null) {
            fVar3.updateColors();
        }
        j jVar = this.f20519w1;
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        invalidate();
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

    public void y(boolean z10) {
        float f7;
        Property property;
        float f10;
        float f11;
        float f12;
        int i10;
        this.f20497n0 = z10;
        j();
        AnimatorSet animatorSet = this.f20480e1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f20480e1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean x10 = x();
        if (!x10) {
            u5 u5Var = this.f20496n[0];
            if (u5Var != null) {
                arrayList.add(u5Var);
            }
            if (this.f20505r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f20505r);
                u5 u5Var2 = this.f20505r;
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                u5Var2.setVisibility(i10);
            }
        }
        float f13 = this.f20499o0;
        float f14 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f7);
        ofFloat.addUpdateListener(new a(this, 2));
        this.f20480e1.playTogether(ofFloat);
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            property = View.ALPHA;
            if (i11 >= size) {
                break;
            }
            View view = (View) arrayList.get(i11);
            float f15 = 0.95f;
            if (!z10) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            AnimatorSet animatorSet2 = this.f20480e1;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f11));
            AnimatorSet animatorSet3 = this.f20480e1;
            if (z10) {
                f12 = 0.95f;
            } else {
                f12 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f12));
            AnimatorSet animatorSet4 = this.f20480e1;
            if (!z10) {
                f15 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f15));
            i11++;
        }
        g9 g9Var = this.f20481f;
        if (g9Var != null) {
            g9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.f20480e1;
            g9 g9Var2 = this.f20481f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(g9Var2, property, f10));
        }
        this.f20526z0 = true;
        requestLayout();
        this.f20480e1.addListener(new f(this, arrayList, z10, x10));
        this.f20480e1.setDuration(150L).start();
        ImageView imageView = this.e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof a5) {
                a5 a5Var = (a5) drawable;
                a5Var.h = true;
                if (z10) {
                    f14 = 1.0f;
                }
                a5Var.a(true, f14);
            }
        }
    }

    public final void z() {
        y yVar = this.E;
        int childCount = yVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = yVar.getChildAt(i10);
            if (childAt instanceof t0) {
                t0 t0Var = (t0) childAt;
                if (t0Var.u()) {
                    t0Var.E();
                }
            }
        }
    }

    public void setAdaptiveBackground(in0 in0Var) {
        int i10 = t6.f20872a7;
        int i11 = t6.f21206s8;
        this.f20527z1 = i10;
        this.A1 = i11;
        this.f20525y1 = org.telegram.messenger.i0.Q1();
        f();
        mh.k kVar = new mh.k(22, this, in0Var);
        in0Var.L.add(kVar);
        if (this.f20522x1) {
            kVar.run();
            return;
        }
        this.f20522x1 = true;
        boolean canScrollVertically = in0Var.canScrollVertically(-1);
        this.B1 = !canScrollVertically;
        this.C1 = !canScrollVertically ? 1.0f : 0.0f;
        f();
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
