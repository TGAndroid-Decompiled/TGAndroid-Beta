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
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.st0;
import org.telegram.ui.pu0;
public class k extends FrameLayout implements te.b, z5, q4 {
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
    public y F;
    public boolean F0;
    public ValueAnimator F1;
    public d G;
    public bi.v1 G0;
    public String H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final e6 K0;
    public boolean L;
    public st0 L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public final Paint N0;
    public boolean O;
    public final Rect O0;
    public int P;
    public final ab.q P0;
    public AnimatorSet Q;
    public boolean Q0;
    public View[] R;
    public boolean R0;
    public boolean S;
    public boolean S0;
    public du0 T;
    public sn T0;
    public lz U;
    public boolean U0;
    public Paint.FontMetricsInt V;
    public dh.c V0;
    public boolean W;
    public gh.e W0;
    public dh.c X0;
    public ui.d Y0;
    public int Z0;
    public fh.g f29273a;
    public Rect f29274a0;
    public g5 f29275a1;
    public fh.g f29276b;
    public int f29277b0;
    public q0 f29278b1;
    public fh.g f29279c;
    public boolean f29280c0;
    public final RectF f29281c1;
    public final k4 d;
    public CharSequence f29282d0;
    public boolean f29283d1;
    public ImageView f29284e;
    public Drawable f29285e0;
    public Runnable f29286e1;
    public i9 f29287f;
    public View.OnClickListener f29288f0;
    public pu0 f29289f1;
    public String f29290g0;
    public AnimatorSet f29291g1;
    public Drawable h;
    public final Object[] f29292h0;
    public int f29293h1;
    public Runnable f29294i0;
    public int f29295i1;
    public boolean f29296j0;
    public boolean f29297j1;
    public Runnable f29298k0;
    public boolean f29299k1;
    public boolean f29300l0;
    public float l1;
    public int m0;
    public final te.c f29301m1;
    public final j5[] f29302n;
    public boolean f29303n0;
    public final te.a n1;
    public boolean f29304o0;
    public final te.c f29305o1;
    public float f29306p0;
    public final te.a f29307p1;
    public int f29308q0;
    public int f29309q1;
    public j5 f29310r;
    public int f29311r0;
    public int f29312r1;
    public j5 f29313s;
    public int f29314s0;
    public boolean f29315s1;
    public int f29316t0;
    public boolean f29317t1;
    public e2 f29318u0;
    public boolean f29319u1;
    public j f29320v0;
    public boolean f29321v1;
    public View f29322w;
    public int f29323w0;
    public boolean f29324w1;
    public int f29325x;
    public boolean f29326x0;
    public int f29327x1;
    public int f29328y;
    public boolean f29329y0;
    public fi.j f29330y1;
    public boolean f29331z0;
    public boolean f29332z1;

    public k(Context context, e6 e6Var) {
        super(context);
        this.d = k4.f29337a;
        this.f29302n = new j5[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.f29292h0 = new Object[3];
        this.f29300l0 = true;
        this.m0 = 255;
        this.f29323w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new ab.q(this);
        this.f29281c1 = new RectF();
        er erVar = er.h;
        this.f29301m1 = new te.c(0, this, erVar, 380L);
        this.n1 = new te.a(0, this, erVar, 380L, false);
        this.f29305o1 = new te.c(0, this, erVar, 320L);
        this.f29307p1 = new te.a(0, this, erVar, 320L, false);
        this.f29324w1 = true;
        this.f29327x1 = 255;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = e6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.g0.Q1()) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            return org.telegram.messenger.g0.L(48.0f);
        }
        return org.telegram.messenger.g0.L(56.0f);
    }

    public static View v(k kVar, float f10, float f11, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void A(boolean z10) {
        float f10;
        Property property;
        float f11;
        float f12;
        float f13;
        int i7;
        this.f29304o0 = z10;
        m();
        AnimatorSet animatorSet = this.f29291g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f29291g1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean z11 = z();
        if (!z11) {
            j5 j5Var = this.f29302n[0];
            if (j5Var != null) {
                arrayList.add(j5Var);
            }
            if (this.f29310r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(this.f29310r);
                j5 j5Var2 = this.f29310r;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                j5Var2.setVisibility(i7);
            }
        }
        float f14 = this.f29306p0;
        float f15 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
        ofFloat.addUpdateListener(new a(this, 2));
        this.f29291g1.playTogether(ofFloat);
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
            AnimatorSet animatorSet2 = this.f29291g1;
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f12));
            AnimatorSet animatorSet3 = this.f29291g1;
            if (z10) {
                f13 = 0.95f;
            } else {
                f13 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f13));
            AnimatorSet animatorSet4 = this.f29291g1;
            if (!z10) {
                f16 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f16));
            i10++;
        }
        i9 i9Var = this.f29287f;
        if (i9Var != null) {
            i9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.f29291g1;
            i9 i9Var2 = this.f29287f;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(i9Var2, property, f11));
        }
        this.A0 = true;
        requestLayout();
        this.f29291g1.addListener(new f(this, arrayList, z10, z11));
        this.f29291g1.setDuration(150L).start();
        ImageView imageView = this.f29284e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof p4) {
                p4 p4Var = (p4) drawable;
                p4Var.h = true;
                if (z10) {
                    f15 = 1.0f;
                }
                p4Var.a(true, f15);
            }
        }
    }

    public final void B() {
        y yVar = this.F;
        int childCount = yVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = yVar.getChildAt(i7);
            if (childAt instanceof q0) {
                q0 q0Var = (q0) childAt;
                if (q0Var.v()) {
                    q0Var.F();
                }
            }
        }
    }

    public final void C() {
        y yVar = this.F;
        if (yVar != null) {
            boolean z10 = this.f29304o0;
            boolean z11 = !z10;
            int childCount = yVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = yVar.getChildAt(i7);
                if (childAt instanceof q0) {
                    q0 q0Var = (q0) childAt;
                    if (q0Var.v()) {
                        if (!z10) {
                            yVar.f29876b.A(q0Var.U(z11));
                        }
                        q0Var.Q("", false);
                        q0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void D(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        this.B1 = i7;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        oi.u4 u4Var = new oi.u4(18, this, recyclerView);
        recyclerView.j(new bi.z4(u4Var, 26));
        if (this.f29332z1) {
            u4Var.run();
            return;
        }
        this.f29332z1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        if (!canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.E1 = f10;
        i();
    }

    public final void F(int i7, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f29311r0 = i7;
            if (this.K && (imageView = this.f29284e) != null) {
                imageView.setBackgroundDrawable(j6.h0(i7, 1, -1));
            }
            d dVar = this.G;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f29308q0 = i7;
        ImageView imageView2 = this.f29284e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(j6.h0(i7, 1, -1));
        }
        y yVar = this.F;
        if (yVar != null) {
            yVar.s();
        }
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void H(int i7, boolean z10) {
        if (z10) {
            this.f29316t0 = i7;
            d dVar = this.G;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f29284e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof x1) {
                    ((x1) drawable).b(i7);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f29284e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f29314s0 = i7;
            ImageView imageView2 = this.f29284e;
            if (imageView2 != null && i7 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof x1) {
                    ((x1) drawable2).a(i7);
                } else if (drawable2 instanceof p4) {
                    ((p4) drawable2).f29483j = i7;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f29284e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
            y yVar = this.F;
            if (yVar != null) {
                yVar.t();
            }
        }
        ImageView imageView3 = this.f29284e;
        if (imageView3 != null && this.f29283d1) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f29314s0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void I(int i7, boolean z10) {
        y yVar;
        d dVar;
        int i10 = 0;
        if (z10 && (dVar = this.G) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    ((q0) childAt).I(i7);
                }
                i10++;
            }
        } else if (!z10 && (yVar = this.F) != null) {
            int childCount2 = yVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = yVar.getChildAt(i10);
                if (childAt2 instanceof q0) {
                    ((q0) childAt2).I(i7);
                }
                i10++;
            }
        }
    }

    public final void J(int i7, boolean z10, boolean z11) {
        y yVar;
        d dVar;
        int i10 = 0;
        if (z11 && (dVar = this.G) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    ((q0) childAt).P(i7, z10);
                }
                i10++;
            }
        } else if (!z11 && (yVar = this.F) != null) {
            int childCount2 = yVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = yVar.getChildAt(i10);
                if (childAt2 instanceof q0) {
                    ((q0) childAt2).P(i7, z10);
                }
                i10++;
            }
        }
    }

    public final void K(int i7, boolean z10) {
        y yVar;
        d dVar;
        if (z10 && (dVar = this.G) != null) {
            dVar.setPopupItemsSelectorColor(i7);
        } else if (!z10 && (yVar = this.F) != null) {
            yVar.setPopupItemsSelectorColor(i7);
        }
    }

    public final void L(int i7, boolean z10) {
        y yVar = this.F;
        if (yVar != null) {
            int childCount = yVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    q0 q0Var = (q0) childAt;
                    if (q0Var.v()) {
                        if (z10) {
                            q0Var.getSearchField().setHintTextColor(i7);
                            return;
                        } else {
                            q0Var.getSearchField().setTextColor(i7);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void M(CharSequence charSequence, org.telegram.ui.Components.e5 e5Var) {
        int i7;
        j5[] j5VarArr = this.f29302n;
        if (charSequence != null && j5VarArr[0] == null) {
            u(0);
        }
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            if (charSequence != null && !this.f29304o0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            j5Var.setVisibility(i7);
            j5 j5Var2 = j5VarArr[0];
            this.f29282d0 = charSequence;
            j5Var2.k(charSequence);
            if (this.D0) {
                Drawable drawable = this.f29285e0;
                if (drawable instanceof org.telegram.ui.Components.e5) {
                    ((org.telegram.ui.Components.e5) drawable).l(null);
                }
            }
            j5 j5Var3 = j5VarArr[0];
            this.f29285e0 = e5Var;
            j5Var3.i(e5Var);
            if (this.D0) {
                Drawable drawable2 = this.f29285e0;
                if (drawable2 instanceof org.telegram.ui.Components.e5) {
                    ((org.telegram.ui.Components.e5) drawable2).l(j5VarArr[0]);
                }
            }
            j5VarArr[0].setRightDrawableOnClick(this.f29288f0);
        }
        this.f29331z0 = false;
    }

    public final void N(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        boolean z11;
        float f10;
        j5[] j5VarArr = this.f29302n;
        if (j5VarArr[0] != null && charSequence != null) {
            if (this.f29326x0 && !TextUtils.isEmpty(this.B0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f29310r.getVisibility() != 0) {
                    this.f29310r.setVisibility(0);
                    this.f29310r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f29310r.animate();
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                i20.m(animate, f10, 220L);
            }
            j5 j5Var = j5VarArr[1];
            if (j5Var != null) {
                if (j5Var.getParent() != null) {
                    ((ViewGroup) j5VarArr[1].getParent()).removeView(j5VarArr[1]);
                }
                j5VarArr[1] = null;
            }
            j5VarArr[1] = j5VarArr[0];
            j5VarArr[0] = null;
            setTitle(charSequence);
            this.f29331z0 = z10;
            j5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                j5 j5Var2 = j5VarArr[0];
                int L = org.telegram.messenger.g0.L(20.0f);
                if (!z10) {
                    L = -L;
                }
                j5Var2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = j5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f29329y0 = true;
            ViewPropertyAnimator alpha = j5VarArr[1].animate().alpha(0.0f);
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
            alpha.setDuration(j3).setListener(new g(this, z11, z10, 0)).start();
            requestLayout();
            return;
        }
        setTitle(charSequence);
    }

    public final void O(String str, int i7, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        j5 j5Var;
        int indexOf;
        SpannableStringBuilder spannableStringBuilder;
        if (this.f29280c0 && this.f29318u0.parentLayout != null) {
            Object[] objArr = this.f29292h0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i7);
            objArr[2] = runnable;
            if (!this.f29297j1) {
                String str3 = this.f29290g0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f29290g0 = str;
                        Drawable drawable = null;
                        if (this.f29330y1 != null) {
                            if (i7 == 2131751805) {
                                spannableStringBuilder = org.telegram.messenger.g0.I2(hd.M0(2131744113, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f));
                            } else {
                                spannableStringBuilder = null;
                            }
                            this.f29330y1.b(spannableStringBuilder, true);
                        }
                        if (str != null) {
                            str2 = hd.M0(i7, str);
                        } else {
                            str2 = this.f29282d0;
                        }
                        if (str == null) {
                            drawable = this.f29285e0;
                        }
                        ab.q qVar = this.P0;
                        if (str != null && (indexOf = TextUtils.indexOf(str2, "...")) >= 0) {
                            SpannableString valueOf = SpannableString.valueOf(str2);
                            qVar.F(valueOf, indexOf);
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
                        this.f29296j0 = z11;
                        j5[] j5VarArr = this.f29302n;
                        if ((spannableString == null || j5VarArr[0] != null) && getMeasuredWidth() != 0 && ((j5Var = j5VarArr[0]) == null || j5Var.getVisibility() == 0)) {
                            j5 j5Var2 = j5VarArr[0];
                            if (j5Var2 != null) {
                                j5Var2.animate().cancel();
                                j5 j5Var3 = j5VarArr[1];
                                if (j5Var3 != null) {
                                    j5Var3.animate().cancel();
                                }
                                if (j5VarArr[1] == null) {
                                    u(1);
                                }
                                j5VarArr[1].k(spannableString);
                                j5VarArr[1].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                                j5VarArr[1].i(drawable);
                                j5VarArr[1].setRightDrawableOnClick(this.f29288f0);
                                if (drawable instanceof org.telegram.ui.Components.e5) {
                                    ((org.telegram.ui.Components.e5) drawable).l(j5VarArr[1]);
                                }
                                if (z10) {
                                    qVar.c(j5VarArr[1]);
                                }
                                this.f29297j1 = true;
                                float alpha = j5VarArr[0].getAlpha();
                                j5 j5Var4 = j5VarArr[1];
                                j5VarArr[1] = j5VarArr[0];
                                j5VarArr[0] = j5Var4;
                                j5Var4.setAlpha(0.0f);
                                j5VarArr[0].setTranslationY(-org.telegram.messenger.g0.L(20.0f));
                                j5VarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha2 = j5VarArr[1].animate().alpha(0.0f);
                                if (this.f29310r == null) {
                                    alpha2.translationY(org.telegram.messenger.g0.L(20.0f));
                                } else {
                                    alpha2.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.A0 = true;
                                alpha2.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            u(0);
                            if (this.S) {
                                j5VarArr[0].invalidate();
                                invalidate();
                            }
                            j5VarArr[0].k(spannableString);
                            j5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                            j5VarArr[0].i(drawable);
                            j5VarArr[0].setRightDrawableOnClick(this.f29288f0);
                            if (drawable instanceof org.telegram.ui.Components.e5) {
                                ((org.telegram.ui.Components.e5) drawable).l(j5VarArr[0]);
                            }
                            if (z10) {
                                qVar.c(j5VarArr[0]);
                            } else {
                                qVar.x(j5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f29294i0;
                        }
                        this.f29298k0 = runnable;
                    }
                }
            }
        }
    }

    public final void P(dh.c cVar, gh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z10;
        this.V0 = cVar;
        this.W0 = eVar;
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.f29273a = c10;
        if (z10) {
            c10.s(org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(18.33f));
        } else {
            c10.r(org.telegram.messenger.g0.L(23.0f));
        }
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        i20.r(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f29276b = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(eVar);
        i20.r(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f29279c = c12;
        y yVar = this.F;
        if (yVar != null) {
            yVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.F.setGlassMode(true);
        }
        d dVar = this.G;
        if (dVar != null) {
            dVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.G.setGlassMode(true);
        }
        ImageView imageView = this.f29284e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public boolean Q(View view) {
        if (this.M) {
            j5[] j5VarArr = this.f29302n;
            if (view == j5VarArr[0] || view == j5VarArr[1] || view == this.f29310r || view == this.F || view == this.f29284e || view == this.f29313s || view == this.G0) {
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
            if (this.f29325x == 0) {
                if (!this.f29304o0) {
                    j5 j5Var = this.f29302n[0];
                    if (j5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(j5Var, property, 0.0f));
                    }
                    if (this.f29310r != null && !TextUtils.isEmpty(this.B0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f29310r, property, 0.0f));
                    }
                }
                y yVar = this.F;
                if (yVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yVar, property, 0.0f));
                }
            }
            int i7 = this.f29325x;
            if (i7 == 0) {
                i7 = this.f29328y;
            }
            if (i7 != 0 && !this.Q0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                ns.e().k(ns.f25564r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f29289f1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new ah.l(13, this, zArr));
            this.Q.start();
            ImageView imageView = this.f29284e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof x1) {
                    ((x1) drawable).c(true, 1.0f);
                }
                this.f29284e.setBackgroundDrawable(j6.h0(this.f29311r0, 1, -1));
            }
        }
    }

    public final void S() {
        boolean z10;
        if (this.D0 && this.E0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.F0 != z10) {
            this.F0 = z10;
            ab.q qVar = this.P0;
            if (z10) {
                qVar.f988a = true;
                AnimatorSet animatorSet = (AnimatorSet) qVar.f990c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            qVar.f988a = false;
            ((AnimatorSet) qVar.f990c).cancel();
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
    public final boolean b(q0 q0Var, RectF rectF) {
        int L;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        float f10 = 0.0f;
        if (q0Var.getParent() == this.F && this.f29279c != null && !this.f29321v1 && !this.R0 && this.l1 == 0.0f && getActionModeFactor() == 0.0f && !this.f29279c.getBounds().isEmpty()) {
            rectF.set(this.f29279c.getBounds());
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

    public final boolean c(String str) {
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
        boolean z10;
        boolean z11;
        if (this.T0 != null && this.Q0 && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            float f10 = x10;
            float f11 = y10;
            View v = v(this, f10, f11, this.T0);
            if (v == null) {
                v = v(this, f10, f11, null);
            }
            fh.g gVar = this.f29273a;
            boolean z12 = true;
            if (gVar != null && gVar.getBounds().contains(x10, y10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (v != null && v != this.T0) {
                fh.g gVar2 = this.f29276b;
                if (gVar2 != null && gVar2.getBounds().contains(x10, y10)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                fh.g gVar3 = this.f29279c;
                if (gVar3 == null || !gVar3.getBounds().contains(x10, y10)) {
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

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final fh.g g(g5 g5Var) {
        dh.c cVar = this.X0;
        if (cVar == null) {
            cVar = this.V0;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(g5Var, null, false);
        c10.p(this.W0);
        i20.r(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    public j getActionBarMenuOnItemClick() {
        return this.f29320v0;
    }

    public y getActionMode() {
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
        return this.f29330y1;
    }

    public j5 getAdditionalSubtitleTextView() {
        return this.f29313s;
    }

    public ImageView getBackButton() {
        return this.f29284e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public k4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f29328y;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = this.W0;
        if (eVar != null) {
            return eVar.a(eVar.f13313e);
        }
        return 0;
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return this.W0;
    }

    public boolean getCastShadows() {
        return this.f29300l0;
    }

    public int getExtraHeight() {
        return this.P;
    }

    public int getMeasuredHeightNoExtra() {
        return getMeasuredHeight() - this.P;
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
    public gh.a getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
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
    public g5 getOpenMenuOverlay() {
        return this.f29275a1;
    }

    public i9 getSearchAvatarImageView() {
        return this.f29287f;
    }

    public int getShadowAlpha() {
        return this.m0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f29310r != null && (charSequence = this.B0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        j5 j5Var = this.f29310r;
        if (j5Var != null) {
            return j5Var.getTextColor();
        }
        return 0;
    }

    public j5 getSubtitleTextView() {
        return this.f29310r;
    }

    public String getTitle() {
        j5 j5Var = this.f29302n[0];
        if (j5Var == null) {
            return null;
        }
        return j5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.f29323w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f10;
        j5 j5Var = this.f29302n[0];
        if (j5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            return textPaint.getFontMetricsInt();
        }
        return j5Var.getPaint().getFontMetricsInt();
    }

    public j5 getTitleTextView() {
        return this.f29302n[0];
    }

    public j5 getTitleTextView2() {
        return this.f29302n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.G0;
    }

    @Override
    public final void h(g5 g5Var, q0 q0Var) {
        this.f29275a1 = g5Var;
        this.f29278b1 = q0Var;
        invalidate();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        float f10;
        int w02;
        int w03;
        if (this.f29332z1) {
            if (this.A1) {
                f10 = 1.0f;
            } else {
                f10 = this.E1;
            }
            int i7 = this.C1;
            e6 e6Var = this.K0;
            if (i7 == -1) {
                w02 = 0;
            } else {
                w02 = j6.w0(i7, e6Var);
            }
            int i10 = this.B1;
            if (i10 == -1) {
                w03 = 0;
            } else {
                w03 = j6.w0(i10, e6Var);
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

    public final void j() {
        if (!hd.f24101a0) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new i(0));
            this.A0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) er.f34420f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void k(boolean z10) {
        boolean z11;
        float f10;
        sn snVar = this.T0;
        if (snVar == null) {
            return;
        }
        on onVar = snVar.f39353e;
        if (onVar != null && onVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f), this.T0.getVisualWidth());
        te.c cVar = this.f29301m1;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57088g;
            } else {
                f10 = cVar.f57087f;
            }
            float f11 = min;
            if (f10 != f11) {
                cVar.a(f11);
            }
        } else {
            cVar.c(min);
        }
        this.n1.a(z11, z10);
    }

    public final void l() {
        int i7;
        ImageView imageView = this.f29284e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof x1) && !(drawable instanceof p4)) {
                i7 = 0;
            } else {
                i7 = 2;
            }
            if (this.f29284e.getLayerType() != i7) {
                this.f29284e.setLayerType(i7, null);
                this.f29284e.invalidate();
            }
        }
    }

    public final void m() {
        int i7;
        int i10;
        float f10;
        y yVar = this.F;
        boolean z10 = false;
        if (yVar != null) {
            i7 = (yVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f);
        } else {
            i7 = 0;
        }
        int max = Math.max(0, i7);
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
        this.f29307p1.a(z10, this.f29319u1);
        te.c cVar = this.f29305o1;
        if (cVar.h) {
            f10 = cVar.f57088g;
        } else {
            f10 = cVar.f57087f;
        }
        float f11 = max;
        if (f10 != f11) {
            if (this.f29319u1) {
                cVar.a(f11);
            } else {
                cVar.c(f11);
            }
        }
    }

    public void n(boolean z10) {
        y yVar;
        if (this.f29304o0 && (yVar = this.F) != null) {
            yVar.i(z10);
        }
    }

    public final y o() {
        return p(null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0 = true;
        S();
        if (this.K) {
            int i7 = this.f29325x;
            if (i7 == 0) {
                i7 = this.f29328y;
            }
            if (i7 != 0 && !this.Q0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                ns.e().k(ns.f25564r4, new Object[0]);
            }
        }
        Drawable drawable = this.f29285e0;
        if (drawable instanceof org.telegram.ui.Components.e5) {
            ((org.telegram.ui.Components.e5) drawable).l(this.f29302n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0 = false;
        S();
        if (this.K) {
            int i7 = this.f29328y;
            if (i7 != 0 && this.f29325x != 0 && !this.Q0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                ns.e().k(ns.f25564r4, new Object[0]);
            }
        }
        Drawable drawable = this.f29285e0;
        if (drawable instanceof org.telegram.ui.Components.e5) {
            ((org.telegram.ui.Components.e5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.S && !this.f29296j0 && !hd.f24101a0 && motionEvent.getAction() == 0 && (B0 = j6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            du0 du0Var = this.T;
            j5[] j5VarArr = this.f29302n;
            if (du0Var == null) {
                this.U = null;
                this.T = new du0(0);
                j5VarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                ?? obj = new Object();
                obj.f37017c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f37016b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(j6.x0(null, j6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i7 = 0; i7 < 20; i7++) {
                    ((ArrayList) obj.d).add(new kz(obj));
                }
                this.U = obj;
                j5VarArr[0].invalidate();
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
    public void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int L;
        j5[] j5VarArr;
        j5 j5Var;
        int i12;
        int i13;
        int z10;
        int i14;
        int i15;
        j5 j5Var2;
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
        kVar.I = true;
        View view = kVar.f29322w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.g0.f23603m;
        }
        d dVar = kVar.G;
        if (dVar != null) {
            if (kVar.J) {
                i18 = org.telegram.messenger.g0.f23603m;
            } else {
                i18 = 0;
            }
            dVar.setPadding(0, i18, 0, 0);
        }
        kVar.I = false;
        if (kVar.J) {
            i11 = org.telegram.messenger.g0.f23603m;
        } else {
            i11 = 0;
        }
        kVar.setMeasuredDimension(size, currentActionBarHeight + i11 + kVar.P);
        ImageView imageView = kVar.f29284e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.f29284e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(54.0f), 1073741824), makeMeasureSpec2);
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
        y yVar = kVar.F;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f12 = 66.0f;
            if (kVar.F.p() && !kVar.f29304o0) {
                kVar.F.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int k10 = kVar.F.k();
                if (kVar.f29303n0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.F.k() + (size - org.telegram.messenger.g0.L(f12)), 1073741824);
                if (!kVar.E) {
                    kVar.F.r(-k10);
                }
            } else if (kVar.f29304o0) {
                if (kVar.f29303n0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = i20.c(f12, size, 1073741824);
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
            j5VarArr = kVar.f29302n;
            if (i20 >= 2) {
                break;
            }
            j5 j5Var3 = j5VarArr[0];
            if ((j5Var3 != null && j5Var3.getVisibility() != 8) || ((j5Var = kVar.f29310r) != null && j5Var.getVisibility() != 8)) {
                y yVar2 = kVar.F;
                if (yVar2 != null) {
                    i13 = yVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (kVar.I0) {
                    z10 = size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + i13) + kVar.f29277b0) * 2);
                } else {
                    z10 = org.telegram.messenger.k5.z(16.0f, size - i13, L) - kVar.f29277b0;
                }
                int max = Math.max(z10, 0);
                boolean z11 = kVar.f29331z0;
                int i21 = 20;
                if (((z11 && i20 == 0) || (!z11 && i20 == i19)) && kVar.f29326x0 && kVar.f29329y0) {
                    j5 j5Var4 = j5VarArr[i20];
                    i12 = i19;
                    if (kVar.Q0) {
                        i21 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    j5Var4.setTextSize(i21);
                } else {
                    i12 = i19;
                    j5 j5Var5 = j5VarArr[0];
                    if (j5Var5 != null && j5Var5.getVisibility() != 8 && (j5Var2 = kVar.f29310r) != null && j5Var2.getVisibility() != 8) {
                        j5 j5Var6 = j5VarArr[i20];
                        if (j5Var6 != null) {
                            if (kVar.Q0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i21 = 18;
                            }
                            j5Var6.setTextSize(i21);
                        }
                        j5 j5Var7 = kVar.f29310r;
                        if (org.telegram.messenger.g0.Q1()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        j5Var7.setTextSize(i16);
                        j5 j5Var8 = kVar.f29313s;
                        if (j5Var8 != null) {
                            if (org.telegram.messenger.g0.Q1()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            j5Var8.setTextSize(i17);
                        }
                    } else {
                        j5 j5Var9 = j5VarArr[i20];
                        if (j5Var9 != null && j5Var9.getVisibility() != 8) {
                            j5 j5Var10 = j5VarArr[i20];
                            if (kVar.Q0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            j5Var10.setTextSize(i21);
                        }
                        j5 j5Var11 = kVar.f29310r;
                        if (j5Var11 != null && j5Var11.getVisibility() != 8) {
                            j5 j5Var12 = kVar.f29310r;
                            if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            j5Var12.setTextSize(i15);
                        }
                        j5 j5Var13 = kVar.f29313s;
                        if (j5Var13 != null) {
                            if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            j5Var13.setTextSize(i14);
                        }
                    }
                }
                j5 j5Var14 = j5VarArr[i20];
                if (j5Var14 != null && j5Var14.getVisibility() != 8) {
                    j5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(j5VarArr[i20].getPaddingBottom() + j5VarArr[i20].getPaddingTop() + org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
                    if (kVar.A0) {
                        CharSequence text = j5VarArr[i20].getText();
                        j5 j5Var15 = j5VarArr[i20];
                        j5Var15.setPivotX(j5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        j5VarArr[i20].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        j5VarArr[i20].setPivotX(0.0f);
                        j5VarArr[i20].setPivotY(0.0f);
                    }
                }
                j5 j5Var16 = kVar.f29310r;
                if (j5Var16 != null && j5Var16.getVisibility() != 8) {
                    kVar.f29310r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                fi.j jVar = kVar.f29330y1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                j5 j5Var17 = kVar.f29313s;
                if (j5Var17 != null && j5Var17.getVisibility() != 8) {
                    kVar.f29313s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i12 = i19;
            }
            i20++;
            i19 = i12;
        }
        int i22 = i19;
        i9 i9Var = kVar.f29287f;
        if (i9Var != null) {
            i9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = kVar.getChildAt(i23);
            if (childAt.getVisibility() != 8 && childAt != j5VarArr[0] && childAt != j5VarArr[i22] && childAt != kVar.f29330y1 && childAt != kVar.f29310r && childAt != kVar.F && childAt != kVar.f29284e && childAt != kVar.f29313s && childAt != kVar.f29287f) {
                kVar.measureChildWithMargins(childAt, i7, 0, View.MeasureSpec.makeMeasureSpec(kVar.getMeasuredHeight(), 1073741824), 0);
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

    public final y p(String str) {
        float f10;
        int i7;
        if (c(str)) {
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
        dVar3.f29877c = true;
        dVar3.setClickable(true);
        if (!this.Q0) {
            q6.h(j6.f29205w8, this.G, this.K0);
        }
        addView(this.G, indexOfChild(this.f29284e));
        d dVar4 = this.G;
        if (this.J) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        dVar4.setPadding(0, i7, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.P;
        layoutParams.gravity = 5;
        this.G.setLayoutParams(layoutParams);
        this.G.setVisibility(4);
        return this.G;
    }

    public final void q() {
        if (this.f29313s != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.f29313s = j5Var;
        j5Var.setGravity(3);
        this.f29313s.setVisibility(8);
        q6.X(this.f29313s, j6.B8, this.K0);
        addView(this.f29313s, 0, ja.e(-2, -2, 51));
    }

    public final void r() {
        if (this.f29284e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f29284e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f29284e.setBackgroundDrawable(j6.h0(this.f29308q0, 1, -1));
        this.f29284e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.f29284e, ja.e(54, 54, 51));
        this.f29284e.setOnClickListener(new b(this, 1));
        this.f29284e.setContentDescription(hd.M0(2131754878, null));
    }

    @Override
    public final void requestLayout() {
        if (this.I) {
            return;
        }
        super.requestLayout();
    }

    public final y s() {
        y yVar = this.F;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.F = yVar2;
        addView(yVar2, 0, ja.e(-2, -1, 5));
        return this.F;
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f29320v0 = jVar;
    }

    public void setActionModeColor(int i7) {
        d dVar = this.G;
        if (dVar != null) {
            p6 p6Var = q6.f29534a;
            dVar.setTag(2131296709, null);
            this.G.setBackgroundColor(i7);
        }
    }

    public void setActionModeOverrideColor(int i7) {
        this.f29325x = i7;
    }

    public void setActionModeTopColor(int i7) {
        View view = this.f29322w;
        if (view != null) {
            q6.q(view);
            this.f29322w.setBackgroundColor(i7);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        D(recyclerView, j6.f28792a7, j6.f29129s8);
    }

    public void setAddToContainer(boolean z10) {
        this.L = z10;
    }

    public void setAdditionalTextLeft(int i7) {
        this.f29293h1 = i7;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f29280c0 = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f29284e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i7;
        float f10;
        if (this.f29284e == null) {
            r();
        }
        ImageView imageView = this.f29284e;
        if (drawable == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = this.f29284e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof x1) {
            x1 x1Var = (x1) drawable;
            if (x()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            x1Var.c(false, f10);
            x1Var.b(this.f29316t0);
            x1Var.a(this.f29314s0);
        } else if (drawable instanceof p4) {
            p4 p4Var = (p4) drawable;
            p4Var.f29484k = this.f29328y;
            p4Var.f29483j = this.f29314s0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f29284e.setColorFilter(new PorterDuffColorFilter(this.f29314s0, PorterDuff.Mode.SRC_IN));
        }
        if (this.f29283d1) {
            this.f29284e.setColorFilter(new PorterDuffColorFilter(this.f29314s0, PorterDuff.Mode.SRC_IN));
        }
        l();
    }

    public void setBackButtonImage(int i7) {
        int i10;
        if (this.f29284e == null) {
            r();
        }
        ImageView imageView = this.f29284e;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        this.f29284e.setImageResource(i7);
        this.f29284e.setColorFilter(new PorterDuffColorFilter(this.f29314s0, PorterDuff.Mode.SRC_IN));
        l();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f29328y = i7;
        if (!this.M0) {
            super.setBackgroundColor(i7);
        }
        ImageView imageView = this.f29284e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof p4) {
                ((p4) drawable).f29484k = i7;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f29300l0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f29300l0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        int i7;
        if (this.I0 == z10) {
            return;
        }
        this.I0 = z10;
        j5[] j5VarArr = this.f29302n;
        int length = j5VarArr.length;
        int i10 = 0;
        while (true) {
            i7 = 19;
            if (i10 >= length) {
                break;
            }
            j5 j5Var = j5VarArr[i10];
            if (j5Var != null) {
                if (z10) {
                    i7 = 17;
                }
                j5Var.setGravity(i7);
            }
            i10++;
        }
        j5 j5Var2 = this.f29310r;
        if (j5Var2 != null) {
            if (z10) {
                i7 = 17;
            }
            j5Var2.setGravity(i7);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(sn snVar) {
        this.T0 = snVar;
    }

    public void setClipContent(boolean z10) {
        this.M = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.C0 = z10;
        ImageView imageView = this.f29284e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(st0 st0Var) {
        this.M0 = true;
        this.L0 = st0Var;
        st0Var.P.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.f29324w1 != z10) {
            this.f29324w1 = z10;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.f29284e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        y yVar = this.F;
        if (yVar != null) {
            yVar.setEnabled(z10);
        }
        d dVar = this.G;
        if (dVar != null) {
            dVar.setEnabled(z10);
        }
    }

    public void setExtraHeight(int i7) {
        this.P = i7;
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

    public void setForcedMenuMinWidth(int i7) {
        this.f29317t1 = true;
        if (this.f29312r1 != i7) {
            this.f29312r1 = i7;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i7) {
        this.f29315s1 = true;
        if (this.f29309q1 != i7) {
            this.f29309q1 = i7;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i7) {
        if (this.f29327x1 != i7) {
            this.f29327x1 = i7;
            invalidate();
        }
        fh.g gVar = this.f29273a;
        if (gVar != null && gVar.f56097c != i7) {
            gVar.setAlpha(i7);
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
        ui.d dVar = this.Y0;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public void setMenuOffsetSuppressed(boolean z10) {
        this.E = z10;
    }

    public void setMenuRise(int i7) {
        this.Z0 = i7;
    }

    public void setOccupyStatusBar(boolean z10) {
        int i7;
        this.J = z10;
        d dVar = this.G;
        if (dVar != null) {
            if (z10) {
                i7 = org.telegram.messenger.g0.f23603m;
            } else {
                i7 = 0;
            }
            dVar.setPadding(0, i7, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.f29286e1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f29326x0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f29288f0 = onClickListener;
        j5[] j5VarArr = this.f29302n;
        j5 j5Var = j5VarArr[0];
        if (j5Var != null) {
            j5Var.setRightDrawableOnClick(onClickListener);
        }
        j5 j5Var2 = j5VarArr[1];
        if (j5Var2 != null) {
            j5Var2.setRightDrawableOnClick(this.f29288f0);
        }
    }

    public void setSearchAvatarImageView(i9 i9Var) {
        i9 i9Var2 = this.f29287f;
        if (i9Var2 != i9Var) {
            if (i9Var2 != null) {
                removeView(i9Var2);
            }
            this.f29287f = i9Var;
            if (i9Var != null) {
                addView(i9Var);
            }
        }
    }

    public void setSearchCursorColor(int i7) {
        y yVar = this.F;
        if (yVar != null) {
            yVar.setSearchCursorColor(i7);
        }
    }

    public void setSearchFactor(float f10) {
        if (this.l1 != f10) {
            this.l1 = f10;
            invalidate();
        }
    }

    public void setSearchFieldText(String str) {
        this.F.setSearchFieldText(str);
    }

    public void setSearchFilter(jg.o0 o0Var) {
        y yVar = this.F;
        if (yVar != null) {
            yVar.setFilter(o0Var);
        }
    }

    public void setShadowAlpha(int i7) {
        if (this.m0 == i7) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.m0 = i7;
    }

    public void setSkipDrawChild(boolean z10) {
        if (this.f29299k1 != z10) {
            this.f29299k1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i7;
        if (charSequence != null && this.f29310r == null) {
            t();
        }
        if (this.f29310r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            j5 j5Var = this.f29310r;
            if (!isEmpty && !this.f29304o0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            j5Var.setVisibility(i7);
            this.f29310r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f29310r.l(charSequence, false);
            }
            this.B0 = charSequence;
        }
    }

    public void setSubtitleColor(int i7) {
        if (this.f29310r == null) {
            t();
        }
        q6.q(this.f29310r);
        this.f29310r.setTextColor(i7);
    }

    public void setSupportsHolidayImage(boolean z10) {
        this.S = z10;
        if (z10) {
            this.V = new Paint.FontMetricsInt();
            this.f29274a0 = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        M(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f29298k0 = runnable;
        this.f29294i0 = runnable;
    }

    public void setTitleColor(int i7) {
        j5[] j5VarArr = this.f29302n;
        if (j5VarArr[0] == null) {
            u(0);
        }
        this.f29323w0 = i7;
        q6.q(j5VarArr[0]);
        j5VarArr[0].setTextColor(i7);
        j5VarArr[0].setEmojiColor(i7);
        j5 j5Var = j5VarArr[1];
        if (j5Var != null) {
            q6.q(j5Var);
            j5VarArr[1].setTextColor(i7);
            j5VarArr[1].setEmojiColor(i7);
        }
    }

    public void setTitleRightMargin(int i7) {
        this.f29277b0 = i7;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f29302n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.M) {
            invalidate();
        }
    }

    public final void t() {
        if (this.f29310r != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        this.f29310r = j5Var;
        j5Var.setGravity(3);
        this.f29310r.setVisibility(8);
        q6.X(this.f29310r, j6.B8, this.K0);
        addView(this.f29310r, 0, ja.e(-2, -2, 51));
    }

    public final void u(int i7) {
        int i10;
        View[] viewArr = this.f29302n;
        if (viewArr[i7] != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        viewArr[i7] = j5Var;
        if (this.I0) {
            i10 = 17;
        } else {
            i10 = 19;
        }
        j5Var.setGravity(i10);
        int i11 = this.f29323w0;
        if (i11 != 0) {
            viewArr[i7].setTextColor(i11);
        } else {
            q6.X(viewArr[i7], j6.A8, this.K0);
        }
        j5 j5Var2 = viewArr[i7];
        j5Var2.setEmojiColor(j5Var2.getTextColor());
        viewArr[i7].setTypeface(org.telegram.messenger.g0.o());
        viewArr[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        viewArr[i7].setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        viewArr[i7].setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        if (this.H0) {
            this.G0.addView(viewArr[i7], 0, ja.e(-2, -2, 51));
        } else {
            addView(viewArr[i7], 0, ja.e(-2, -2, 51));
        }
    }

    @Override
    public final void updateColors() {
        i();
        fh.g gVar = this.f29273a;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.f29279c;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.f29276b;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        fi.j jVar = this.f29330y1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void w() {
        d dVar = this.G;
        if (dVar != null && this.K) {
            int childCount = dVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = dVar.getChildAt(i7);
                if (childAt instanceof q0) {
                    ((q0) childAt).p();
                }
            }
            this.K = false;
            m();
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
            boolean z10 = this.f29304o0;
            j5[] j5VarArr = this.f29302n;
            if (!z10) {
                j5 j5Var = j5VarArr[0];
                if (j5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(j5Var, property, 1.0f));
                }
                if (this.f29310r != null && !TextUtils.isEmpty(this.B0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f29310r, property, 1.0f));
                }
            }
            y yVar = this.F;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, property, 1.0f));
            }
            int i11 = this.f29328y;
            if (i11 != 0 && !this.Q0) {
                if (i0.a.h(i11) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                ns.e().k(ns.f25564r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f29289f1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new e(this, 0));
            this.Q.start();
            if (!this.f29304o0) {
                j5 j5Var2 = j5VarArr[0];
                if (j5Var2 != null) {
                    j5Var2.setVisibility(0);
                }
                if (this.f29310r != null && !TextUtils.isEmpty(this.B0)) {
                    this.f29310r.setVisibility(0);
                }
            }
            y yVar2 = this.F;
            if (yVar2 != null) {
                yVar2.setVisibility(0);
            }
            ImageView imageView = this.f29284e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof x1) {
                    ((x1) drawable).c(true, 0.0f);
                }
                this.f29284e.setBackgroundDrawable(j6.h0(this.f29308q0, 1, -1));
            }
        }
    }

    public final boolean x() {
        if (this.G != null && this.K) {
            return true;
        }
        return false;
    }

    public final boolean y(String str) {
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

    public boolean z() {
        return false;
    }

    public void setAdaptiveBackground(lm0 lm0Var) {
        int i7 = j6.f28792a7;
        int i10 = j6.f29129s8;
        this.B1 = i7;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        i();
        oi.u4 u4Var = new oi.u4(17, this, lm0Var);
        lm0Var.M.add(u4Var);
        if (this.f29332z1) {
            u4Var.run();
            return;
        }
        this.f29332z1 = true;
        boolean canScrollVertically = lm0Var.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        i();
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
