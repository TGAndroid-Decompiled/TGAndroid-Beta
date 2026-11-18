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
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.ru0;
public class k extends FrameLayout implements te.b, c6, u4 {
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
    public z F;
    public boolean F0;
    public ValueAnimator F1;
    public d G;
    public bi.p2 G0;
    public String H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public View.OnTouchListener J0;
    public boolean K;
    public final i6 K0;
    public boolean L;
    public au0 L0;
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
    public lu0 T;
    public ao T0;
    public sz U;
    public boolean U0;
    public Paint.FontMetricsInt V;
    public dh.c V0;
    public boolean W;
    public gh.e W0;
    public dh.c X0;
    public ui.d Y0;
    public int Z0;
    public fh.g f29057a;
    public Rect f29058a0;
    public k5 f29059a1;
    public fh.g f29060b;
    public int f29061b0;
    public r0 f29062b1;
    public fh.g f29063c;
    public boolean f29064c0;
    public final RectF f29065c1;
    public final o4 d;
    public CharSequence f29066d0;
    public boolean f29067d1;
    public ImageView f29068e;
    public Drawable f29069e0;
    public Runnable f29070e1;
    public q9 f29071f;
    public View.OnClickListener f29072f0;
    public ru0 f29073f1;
    public String f29074g0;
    public AnimatorSet f29075g1;
    public Drawable h;
    public final Object[] f29076h0;
    public int f29077h1;
    public Runnable f29078i0;
    public int f29079i1;
    public boolean f29080j0;
    public boolean f29081j1;
    public Runnable f29082k0;
    public boolean f29083k1;
    public boolean f29084l0;
    public float l1;
    public int m0;
    public final te.c f29085m1;
    public final n5[] f29086n;
    public boolean f29087n0;
    public final te.a n1;
    public boolean f29088o0;
    public final te.c f29089o1;
    public float f29090p0;
    public final te.a f29091p1;
    public int f29092q0;
    public int f29093q1;
    public n5 f29094r;
    public int f29095r0;
    public int f29096r1;
    public n5 f29097s;
    public int f29098s0;
    public boolean f29099s1;
    public int f29100t0;
    public boolean f29101t1;
    public h2 f29102u0;
    public boolean f29103u1;
    public j f29104v0;
    public boolean f29105v1;
    public View f29106w;
    public int f29107w0;
    public boolean f29108w1;
    public int f29109x;
    public boolean f29110x0;
    public int f29111x1;
    public int f29112y;
    public boolean f29113y0;
    public fi.j f29114y1;
    public boolean f29115z0;
    public boolean f29116z1;

    public k(Context context, i6 i6Var) {
        super(context);
        this.d = o4.f29826a;
        this.f29086n = new n5[2];
        this.J = true;
        this.L = true;
        this.N = true;
        this.f29076h0 = new Object[3];
        this.f29084l0 = true;
        this.m0 = 255;
        this.f29107w0 = 0;
        this.N0 = new Paint();
        this.O0 = new Rect();
        this.P0 = new ab.q(this);
        this.f29065c1 = new RectF();
        lr lrVar = lr.h;
        this.f29085m1 = new te.c(0, this, lrVar, 380L);
        this.n1 = new te.a(0, this, lrVar, 380L, false);
        this.f29089o1 = new te.c(0, this, lrVar, 320L);
        this.f29091p1 = new te.a(0, this, lrVar, 320L, false);
        this.f29108w1 = true;
        this.f29111x1 = 255;
        this.D1 = true;
        this.E1 = 1.0f;
        this.K0 = i6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.g0.Q1()) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        Point point = org.telegram.messenger.g0.f24121q;
        if (point.x > point.y) {
            return org.telegram.messenger.g0.L(48.0f);
        }
        return org.telegram.messenger.g0.L(56.0f);
    }

    public static View w(k kVar, float f10, float f11, View view) {
        for (int childCount = kVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = kVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        return false;
    }

    public void B(boolean z10) {
        float f10;
        Property property;
        float f11;
        float f12;
        float f13;
        int i7;
        this.f29088o0 = z10;
        m();
        AnimatorSet animatorSet = this.f29075g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f29075g1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean A = A();
        if (!A) {
            n5 n5Var = this.f29086n[0];
            if (n5Var != null) {
                arrayList.add(n5Var);
            }
            if (this.f29094r != null && !TextUtils.isEmpty(this.B0)) {
                arrayList.add(this.f29094r);
                n5 n5Var2 = this.f29094r;
                if (z10) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                n5Var2.setVisibility(i7);
            }
        }
        float f14 = this.f29090p0;
        float f15 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
        ofFloat.addUpdateListener(new a(this, 2));
        this.f29075g1.playTogether(ofFloat);
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
            AnimatorSet animatorSet2 = this.f29075g1;
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f12));
            AnimatorSet animatorSet3 = this.f29075g1;
            if (z10) {
                f13 = 0.95f;
            } else {
                f13 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f13));
            AnimatorSet animatorSet4 = this.f29075g1;
            if (!z10) {
                f16 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f16));
            i10++;
        }
        q9 q9Var = this.f29071f;
        if (q9Var != null) {
            q9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.f29075g1;
            q9 q9Var2 = this.f29071f;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(q9Var2, property, f11));
        }
        this.A0 = true;
        requestLayout();
        this.f29075g1.addListener(new f(this, arrayList, z10, A));
        this.f29075g1.setDuration(150L).start();
        ImageView imageView = this.f29068e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof t4) {
                t4 t4Var = (t4) drawable;
                t4Var.h = true;
                if (z10) {
                    f15 = 1.0f;
                }
                t4Var.a(true, f15);
            }
        }
    }

    public final void C() {
        z zVar = this.F;
        int childCount = zVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = zVar.getChildAt(i7);
            if (childAt instanceof r0) {
                r0 r0Var = (r0) childAt;
                if (r0Var.v()) {
                    r0Var.F();
                }
            }
        }
    }

    public final void E() {
        z zVar = this.F;
        if (zVar != null) {
            boolean z10 = this.f29088o0;
            boolean z11 = !z10;
            int childCount = zVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = zVar.getChildAt(i7);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.v()) {
                        if (!z10) {
                            zVar.f30299b.B(r0Var.U(z11));
                        }
                        r0Var.Q("", false);
                        r0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void F(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        this.B1 = i7;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        a2 a2Var = new a2(2, this, recyclerView);
        recyclerView.j(new bi.q1(a2Var, 27));
        if (this.f29116z1) {
            a2Var.run();
            return;
        }
        this.f29116z1 = true;
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

    public final void G(int i7, boolean z10) {
        ImageView imageView;
        if (z10) {
            this.f29095r0 = i7;
            if (this.K && (imageView = this.f29068e) != null) {
                imageView.setBackgroundDrawable(n6.h0(i7, 1, -1));
            }
            d dVar = this.G;
            if (dVar != null) {
                dVar.s();
                return;
            }
            return;
        }
        this.f29092q0 = i7;
        ImageView imageView2 = this.f29068e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(n6.h0(i7, 1, -1));
        }
        z zVar = this.F;
        if (zVar != null) {
            zVar.s();
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void I(int i7, boolean z10) {
        if (z10) {
            this.f29100t0 = i7;
            d dVar = this.G;
            if (dVar != null) {
                dVar.t();
            }
            ImageView imageView = this.f29068e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).b(i7);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f29068e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f29098s0 = i7;
            ImageView imageView2 = this.f29068e;
            if (imageView2 != null && i7 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof y1) {
                    ((y1) drawable2).a(i7);
                } else if (drawable2 instanceof t4) {
                    ((t4) drawable2).f30012j = i7;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f29068e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
            z zVar = this.F;
            if (zVar != null) {
                zVar.t();
            }
        }
        ImageView imageView3 = this.f29068e;
        if (imageView3 != null && this.f29067d1) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f29098s0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void J(int i7, boolean z10) {
        z zVar;
        d dVar;
        int i10 = 0;
        if (z10 && (dVar = this.G) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    ((r0) childAt).I(i7);
                }
                i10++;
            }
        } else if (!z10 && (zVar = this.F) != null) {
            int childCount2 = zVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = zVar.getChildAt(i10);
                if (childAt2 instanceof r0) {
                    ((r0) childAt2).I(i7);
                }
                i10++;
            }
        }
    }

    public final void K(int i7, boolean z10, boolean z11) {
        z zVar;
        d dVar;
        int i10 = 0;
        if (z11 && (dVar = this.G) != null) {
            int childCount = dVar.getChildCount();
            while (i10 < childCount) {
                View childAt = dVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    ((r0) childAt).P(i7, z10);
                }
                i10++;
            }
        } else if (!z11 && (zVar = this.F) != null) {
            int childCount2 = zVar.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = zVar.getChildAt(i10);
                if (childAt2 instanceof r0) {
                    ((r0) childAt2).P(i7, z10);
                }
                i10++;
            }
        }
    }

    public final void L(int i7, boolean z10) {
        z zVar;
        d dVar;
        if (z10 && (dVar = this.G) != null) {
            dVar.setPopupItemsSelectorColor(i7);
        } else if (!z10 && (zVar = this.F) != null) {
            zVar.setPopupItemsSelectorColor(i7);
        }
    }

    public final void M(int i7, boolean z10) {
        z zVar = this.F;
        if (zVar != null) {
            int childCount = zVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.v()) {
                        if (z10) {
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

    public final void N(CharSequence charSequence, org.telegram.ui.Components.m5 m5Var) {
        int i7;
        n5[] n5VarArr = this.f29086n;
        if (charSequence != null && n5VarArr[0] == null) {
            v(0);
        }
        n5 n5Var = n5VarArr[0];
        if (n5Var != null) {
            if (charSequence != null && !this.f29088o0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            n5Var.setVisibility(i7);
            n5 n5Var2 = n5VarArr[0];
            this.f29066d0 = charSequence;
            n5Var2.k(charSequence);
            if (this.D0) {
                Drawable drawable = this.f29069e0;
                if (drawable instanceof org.telegram.ui.Components.m5) {
                    ((org.telegram.ui.Components.m5) drawable).l(null);
                }
            }
            n5 n5Var3 = n5VarArr[0];
            this.f29069e0 = m5Var;
            n5Var3.i(m5Var);
            if (this.D0) {
                Drawable drawable2 = this.f29069e0;
                if (drawable2 instanceof org.telegram.ui.Components.m5) {
                    ((org.telegram.ui.Components.m5) drawable2).l(n5VarArr[0]);
                }
            }
            n5VarArr[0].setRightDrawableOnClick(this.f29072f0);
        }
        this.f29115z0 = false;
    }

    public final void O(CharSequence charSequence, boolean z10, long j3, Interpolator interpolator) {
        boolean z11;
        float f10;
        n5[] n5VarArr = this.f29086n;
        if (n5VarArr[0] != null && charSequence != null) {
            if (this.f29110x0 && !TextUtils.isEmpty(this.B0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f29094r.getVisibility() != 0) {
                    this.f29094r.setVisibility(0);
                    this.f29094r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f29094r.animate();
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                n10.n(animate, f10, 220L);
            }
            n5 n5Var = n5VarArr[1];
            if (n5Var != null) {
                if (n5Var.getParent() != null) {
                    ((ViewGroup) n5VarArr[1].getParent()).removeView(n5VarArr[1]);
                }
                n5VarArr[1] = null;
            }
            n5VarArr[1] = n5VarArr[0];
            n5VarArr[0] = null;
            setTitle(charSequence);
            this.f29115z0 = z10;
            n5VarArr[0].setAlpha(0.0f);
            if (!z11) {
                n5 n5Var2 = n5VarArr[0];
                int L = org.telegram.messenger.g0.L(20.0f);
                if (!z10) {
                    L = -L;
                }
                n5Var2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = n5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f29113y0 = true;
            ViewPropertyAnimator alpha = n5VarArr[1].animate().alpha(0.0f);
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

    public final void P(String str, int i7, Runnable runnable) {
        String str2;
        boolean z10;
        SpannableString spannableString;
        boolean z11;
        n5 n5Var;
        int indexOf;
        SpannableStringBuilder spannableStringBuilder;
        if (this.f29064c0 && this.f29102u0.parentLayout != null) {
            Object[] objArr = this.f29076h0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i7);
            objArr[2] = runnable;
            if (!this.f29081j1) {
                String str3 = this.f29074g0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f29074g0 = str;
                        Drawable drawable = null;
                        if (this.f29114y1 != null) {
                            if (i7 == 2131751794) {
                                spannableStringBuilder = org.telegram.messenger.g0.I2(gd.M0(2131743878, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f));
                            } else {
                                spannableStringBuilder = null;
                            }
                            this.f29114y1.b(spannableStringBuilder, true);
                        }
                        if (str != null) {
                            str2 = gd.M0(i7, str);
                        } else {
                            str2 = this.f29066d0;
                        }
                        if (str == null) {
                            drawable = this.f29069e0;
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
                        this.f29080j0 = z11;
                        n5[] n5VarArr = this.f29086n;
                        if ((spannableString == null || n5VarArr[0] != null) && getMeasuredWidth() != 0 && ((n5Var = n5VarArr[0]) == null || n5Var.getVisibility() == 0)) {
                            n5 n5Var2 = n5VarArr[0];
                            if (n5Var2 != null) {
                                n5Var2.animate().cancel();
                                n5 n5Var3 = n5VarArr[1];
                                if (n5Var3 != null) {
                                    n5Var3.animate().cancel();
                                }
                                if (n5VarArr[1] == null) {
                                    v(1);
                                }
                                n5VarArr[1].k(spannableString);
                                n5VarArr[1].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                                n5VarArr[1].i(drawable);
                                n5VarArr[1].setRightDrawableOnClick(this.f29072f0);
                                if (drawable instanceof org.telegram.ui.Components.m5) {
                                    ((org.telegram.ui.Components.m5) drawable).l(n5VarArr[1]);
                                }
                                if (z10) {
                                    qVar.c(n5VarArr[1]);
                                }
                                this.f29081j1 = true;
                                float alpha = n5VarArr[0].getAlpha();
                                n5 n5Var4 = n5VarArr[1];
                                n5VarArr[1] = n5VarArr[0];
                                n5VarArr[0] = n5Var4;
                                n5Var4.setAlpha(0.0f);
                                n5VarArr[0].setTranslationY(-org.telegram.messenger.g0.L(20.0f));
                                n5VarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha2 = n5VarArr[1].animate().alpha(0.0f);
                                if (this.f29094r == null) {
                                    alpha2.translationY(org.telegram.messenger.g0.L(20.0f));
                                } else {
                                    alpha2.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.A0 = true;
                                alpha2.setDuration(220L).setListener(new e(this, 1)).start();
                            }
                        } else {
                            v(0);
                            if (this.S) {
                                n5VarArr[0].invalidate();
                                invalidate();
                            }
                            n5VarArr[0].k(spannableString);
                            n5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                            n5VarArr[0].i(drawable);
                            n5VarArr[0].setRightDrawableOnClick(this.f29072f0);
                            if (drawable instanceof org.telegram.ui.Components.m5) {
                                ((org.telegram.ui.Components.m5) drawable).l(n5VarArr[0]);
                            }
                            if (z10) {
                                qVar.c(n5VarArr[0]);
                            } else {
                                qVar.y(n5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f29078i0;
                        }
                        this.f29082k0 = runnable;
                    }
                }
            }
        }
    }

    public final void Q(dh.c cVar, gh.e eVar, boolean z10) {
        setBackground(null);
        setClipChildren(false);
        this.Q0 = true;
        this.S0 = z10;
        this.V0 = cVar;
        this.W0 = eVar;
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.f29057a = c10;
        if (z10) {
            c10.s(org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(18.33f));
        } else {
            c10.r(org.telegram.messenger.g0.L(23.0f));
        }
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        n10.s(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f29060b = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(eVar);
        n10.s(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f29063c = c12;
        z zVar = this.F;
        if (zVar != null) {
            zVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.F.setGlassMode(true);
        }
        d dVar = this.G;
        if (dVar != null) {
            dVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.G.setGlassMode(true);
        }
        ImageView imageView = this.f29068e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public boolean R(View view) {
        if (this.M) {
            n5[] n5VarArr = this.f29086n;
            if (view == n5VarArr[0] || view == n5VarArr[1] || view == this.f29094r || view == this.F || view == this.f29068e || view == this.f29097s || view == this.G0) {
                return true;
            }
        }
        return false;
    }

    public void S(View[] viewArr, boolean[] zArr) {
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
            if (this.f29109x == 0) {
                if (!this.f29088o0) {
                    n5 n5Var = this.f29086n[0];
                    if (n5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(n5Var, property, 0.0f));
                    }
                    if (this.f29094r != null && !TextUtils.isEmpty(this.B0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f29094r, property, 0.0f));
                    }
                }
                z zVar = this.F;
                if (zVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zVar, property, 0.0f));
                }
            }
            int i7 = this.f29109x;
            if (i7 == 0) {
                i7 = this.f29112y;
            }
            if (i7 != 0 && !this.Q0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.o3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.o3((Activity) getContext(), true);
                }
            } else {
                ks.e().k(ks.f25197t4, new Object[0]);
            }
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f29073f1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new ah.l(13, this, zArr));
            this.Q.start();
            ImageView imageView = this.f29068e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).c(true, 1.0f);
                }
                this.f29068e.setBackgroundDrawable(n6.h0(this.f29095r0, 1, -1));
            }
        }
    }

    public final void T() {
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
                qVar.f987a = true;
                AnimatorSet animatorSet = (AnimatorSet) qVar.f989c;
                if (!animatorSet.isRunning()) {
                    animatorSet.start();
                    return;
                }
                return;
            }
            qVar.f987a = false;
            ((AnimatorSet) qVar.f989c).cancel();
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
    public final boolean b(r0 r0Var, RectF rectF) {
        int L;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        float f10 = 0.0f;
        if (r0Var.getParent() == this.F && this.f29063c != null && !this.f29105v1 && !this.R0 && this.l1 == 0.0f && getActionModeFactor() == 0.0f && !this.f29063c.getBounds().isEmpty()) {
            rectF.set(this.f29063c.getBounds());
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
            View w10 = w(this, f10, f11, this.T0);
            if (w10 == null) {
                w10 = w(this, f10, f11, null);
            }
            fh.g gVar = this.f29057a;
            boolean z12 = true;
            if (gVar != null && gVar.getBounds().contains(x10, y10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (w10 != null && w10 != this.T0) {
                fh.g gVar2 = this.f29060b;
                if (gVar2 != null && gVar2.getBounds().contains(x10, y10)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                fh.g gVar3 = this.f29063c;
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
    public final fh.g g(k5 k5Var) {
        dh.c cVar = this.X0;
        if (cVar == null) {
            cVar = this.V0;
        }
        if (cVar == null) {
            return null;
        }
        fh.g c10 = cVar.c(k5Var, null, false);
        c10.p(this.W0);
        n10.s(c10, org.telegram.messenger.g0.L(23.0f), 6.0f);
        return c10;
    }

    public j getActionBarMenuOnItemClick() {
        return this.f29104v0;
    }

    public z getActionMode() {
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
        return this.f29114y1;
    }

    public n5 getAdditionalSubtitleTextView() {
        return this.f29097s;
    }

    public ImageView getBackButton() {
        return this.f29068e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public o4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f29112y;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = this.W0;
        if (eVar != null) {
            return eVar.a(eVar.f13628e);
        }
        return 0;
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return this.W0;
    }

    public boolean getCastShadows() {
        return this.f29084l0;
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
    public gh.a getMenuGlassColorProvider() {
        return this.W0;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public i6 getMenuResourcesProvider() {
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
    public k5 getOpenMenuOverlay() {
        return this.f29059a1;
    }

    public q9 getSearchAvatarImageView() {
        return this.f29071f;
    }

    public int getShadowAlpha() {
        return this.m0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f29094r != null && (charSequence = this.B0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        n5 n5Var = this.f29094r;
        if (n5Var != null) {
            return n5Var.getTextColor();
        }
        return 0;
    }

    public n5 getSubtitleTextView() {
        return this.f29094r;
    }

    public String getTitle() {
        n5 n5Var = this.f29086n[0];
        if (n5Var == null) {
            return null;
        }
        return n5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.f29107w0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f10;
        n5 n5Var = this.f29086n[0];
        if (n5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            return textPaint.getFontMetricsInt();
        }
        return n5Var.getPaint().getFontMetricsInt();
    }

    public n5 getTitleTextView() {
        return this.f29086n[0];
    }

    public n5 getTitleTextView2() {
        return this.f29086n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.G0;
    }

    @Override
    public final void h(k5 k5Var, r0 r0Var) {
        this.f29059a1 = k5Var;
        this.f29062b1 = r0Var;
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
        if (this.f29116z1) {
            if (this.A1) {
                f10 = 1.0f;
            } else {
                f10 = this.E1;
            }
            int i7 = this.C1;
            i6 i6Var = this.K0;
            if (i7 == -1) {
                w02 = 0;
            } else {
                w02 = n6.w0(i7, i6Var);
            }
            int i10 = this.B1;
            if (i10 == -1) {
                w03 = 0;
            } else {
                w03 = n6.w0(i10, i6Var);
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
        if (!gd.f24216a0) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new i(0));
            this.A0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) lr.f37208f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void k(boolean z10) {
        boolean z11;
        float f10;
        ao aoVar = this.T0;
        if (aoVar == null) {
            return;
        }
        wn wnVar = aoVar.f33381e;
        if (wnVar != null && wnVar.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f), this.T0.getVisualWidth());
        te.c cVar = this.f29085m1;
        if (z10) {
            if (cVar.h) {
                f10 = cVar.f57664g;
            } else {
                f10 = cVar.f57663f;
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
        ImageView imageView = this.f29068e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof y1) && !(drawable instanceof t4)) {
                i7 = 0;
            } else {
                i7 = 2;
            }
            if (this.f29068e.getLayerType() != i7) {
                this.f29068e.setLayerType(i7, null);
                this.f29068e.invalidate();
            }
        }
    }

    public final void m() {
        int i7;
        int i10;
        float f10;
        z zVar = this.F;
        boolean z10 = false;
        if (zVar != null) {
            i7 = (zVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f);
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
        this.f29091p1.a(z10, this.f29103u1);
        te.c cVar = this.f29089o1;
        if (cVar.h) {
            f10 = cVar.f57664g;
        } else {
            f10 = cVar.f57663f;
        }
        float f11 = max;
        if (f10 != f11) {
            if (this.f29103u1) {
                cVar.a(f11);
            } else {
                cVar.c(f11);
            }
        }
    }

    public final void n() {
        o(true);
    }

    public void o(boolean z10) {
        z zVar;
        if (this.f29088o0 && (zVar = this.F) != null) {
            zVar.i(z10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D0 = true;
        T();
        if (this.K) {
            int i7 = this.f29109x;
            if (i7 == 0) {
                i7 = this.f29112y;
            }
            if (i7 != 0 && !this.Q0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.o3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.o3((Activity) getContext(), true);
                }
            } else {
                ks.e().k(ks.f25197t4, new Object[0]);
            }
        }
        Drawable drawable = this.f29069e0;
        if (drawable instanceof org.telegram.ui.Components.m5) {
            ((org.telegram.ui.Components.m5) drawable).l(this.f29086n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D0 = false;
        T();
        if (this.K) {
            int i7 = this.f29112y;
            if (i7 != 0 && this.f29109x != 0 && !this.Q0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.o3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.o3((Activity) getContext(), true);
                }
            } else {
                ks.e().k(ks.f25197t4, new Object[0]);
            }
        }
        Drawable drawable = this.f29069e0;
        if (drawable instanceof org.telegram.ui.Components.m5) {
            ((org.telegram.ui.Components.m5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.S && !this.f29080j0 && !gd.f24216a0 && motionEvent.getAction() == 0 && (B0 = n6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.W = true;
            lu0 lu0Var = this.T;
            n5[] n5VarArr = this.f29086n;
            if (lu0Var == null) {
                this.U = null;
                this.T = new lu0(0);
                n5VarArr[0].invalidate();
                invalidate();
            } else {
                this.T = null;
                ?? obj = new Object();
                obj.f39868c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f39867b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(n6.x0(null, n6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i7 = 0; i7 < 20; i7++) {
                    ((ArrayList) obj.d).add(new rz(obj));
                }
                this.U = obj;
                n5VarArr[0].invalidate();
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
        n5[] n5VarArr;
        n5 n5Var;
        int i12;
        int i13;
        int z10;
        int i14;
        int i15;
        n5 n5Var2;
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
        View view = kVar.f29106w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.g0.f24115m;
        }
        d dVar = kVar.G;
        if (dVar != null) {
            if (kVar.J) {
                i18 = org.telegram.messenger.g0.f24115m;
            } else {
                i18 = 0;
            }
            dVar.setPadding(0, i18, 0, 0);
        }
        kVar.I = false;
        if (kVar.J) {
            i11 = org.telegram.messenger.g0.f24115m;
        } else {
            i11 = 0;
        }
        kVar.setMeasuredDimension(size, currentActionBarHeight + i11 + kVar.P);
        ImageView imageView = kVar.f29068e;
        if (imageView != null && imageView.getVisibility() != 8) {
            kVar.f29068e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(54.0f), 1073741824), makeMeasureSpec2);
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
        z zVar = kVar.F;
        if (zVar != null && zVar.getVisibility() != 8) {
            float f12 = 66.0f;
            if (kVar.F.p() && !kVar.f29088o0) {
                kVar.F.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int k10 = kVar.F.k();
                if (kVar.f29087n0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kVar.F.k() + (size - org.telegram.messenger.g0.L(f12)), 1073741824);
                if (!kVar.E) {
                    kVar.F.r(-k10);
                }
            } else if (kVar.f29088o0) {
                if (kVar.f29087n0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = n10.c(f12, size, 1073741824);
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
            n5VarArr = kVar.f29086n;
            if (i20 >= 2) {
                break;
            }
            n5 n5Var3 = n5VarArr[0];
            if ((n5Var3 != null && n5Var3.getVisibility() != 8) || ((n5Var = kVar.f29094r) != null && n5Var.getVisibility() != 8)) {
                z zVar2 = kVar.F;
                if (zVar2 != null) {
                    i13 = zVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (kVar.I0) {
                    z10 = size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + i13) + kVar.f29061b0) * 2);
                } else {
                    z10 = org.telegram.messenger.f3.z(16.0f, size - i13, L) - kVar.f29061b0;
                }
                int max = Math.max(z10, 0);
                boolean z11 = kVar.f29115z0;
                int i21 = 20;
                if (((z11 && i20 == 0) || (!z11 && i20 == i19)) && kVar.f29110x0 && kVar.f29113y0) {
                    n5 n5Var4 = n5VarArr[i20];
                    i12 = i19;
                    if (kVar.Q0) {
                        i21 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    n5Var4.setTextSize(i21);
                } else {
                    i12 = i19;
                    n5 n5Var5 = n5VarArr[0];
                    if (n5Var5 != null && n5Var5.getVisibility() != 8 && (n5Var2 = kVar.f29094r) != null && n5Var2.getVisibility() != 8) {
                        n5 n5Var6 = n5VarArr[i20];
                        if (n5Var6 != null) {
                            if (kVar.Q0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i21 = 18;
                            }
                            n5Var6.setTextSize(i21);
                        }
                        n5 n5Var7 = kVar.f29094r;
                        if (org.telegram.messenger.g0.Q1()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        n5Var7.setTextSize(i16);
                        n5 n5Var8 = kVar.f29097s;
                        if (n5Var8 != null) {
                            if (org.telegram.messenger.g0.Q1()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            n5Var8.setTextSize(i17);
                        }
                    } else {
                        n5 n5Var9 = n5VarArr[i20];
                        if (n5Var9 != null && n5Var9.getVisibility() != 8) {
                            n5 n5Var10 = n5VarArr[i20];
                            if (kVar.Q0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            n5Var10.setTextSize(i21);
                        }
                        n5 n5Var11 = kVar.f29094r;
                        if (n5Var11 != null && n5Var11.getVisibility() != 8) {
                            n5 n5Var12 = kVar.f29094r;
                            if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            n5Var12.setTextSize(i15);
                        }
                        n5 n5Var13 = kVar.f29097s;
                        if (n5Var13 != null) {
                            if (!org.telegram.messenger.g0.Q1() && kVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            n5Var13.setTextSize(i14);
                        }
                    }
                }
                n5 n5Var14 = n5VarArr[i20];
                if (n5Var14 != null && n5Var14.getVisibility() != 8) {
                    n5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(n5VarArr[i20].getPaddingBottom() + n5VarArr[i20].getPaddingTop() + org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
                    if (kVar.A0) {
                        CharSequence text = n5VarArr[i20].getText();
                        n5 n5Var15 = n5VarArr[i20];
                        n5Var15.setPivotX(n5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        n5VarArr[i20].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        n5VarArr[i20].setPivotX(0.0f);
                        n5VarArr[i20].setPivotY(0.0f);
                    }
                }
                n5 n5Var16 = kVar.f29094r;
                if (n5Var16 != null && n5Var16.getVisibility() != 8) {
                    kVar.f29094r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                fi.j jVar = kVar.f29114y1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                n5 n5Var17 = kVar.f29097s;
                if (n5Var17 != null && n5Var17.getVisibility() != 8) {
                    kVar.f29097s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i12 = i19;
            }
            i20++;
            i19 = i12;
        }
        int i22 = i19;
        q9 q9Var = kVar.f29071f;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
        }
        int childCount = kVar.getChildCount();
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = kVar.getChildAt(i23);
            if (childAt.getVisibility() != 8 && childAt != n5VarArr[0] && childAt != n5VarArr[i22] && childAt != kVar.f29114y1 && childAt != kVar.f29094r && childAt != kVar.F && childAt != kVar.f29068e && childAt != kVar.f29097s && childAt != kVar.f29071f) {
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

    public final z p() {
        return q(null);
    }

    public final z q(String str) {
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
        dVar3.f30300c = true;
        dVar3.setClickable(true);
        if (!this.Q0) {
            u6.h(n6.f29752w8, this.G, this.K0);
        }
        addView(this.G, indexOfChild(this.f29068e));
        d dVar4 = this.G;
        if (this.J) {
            i7 = org.telegram.messenger.g0.f24115m;
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

    public final void r() {
        if (this.f29097s != null) {
            return;
        }
        n5 n5Var = new n5(getContext());
        this.f29097s = n5Var;
        n5Var.setGravity(3);
        this.f29097s.setVisibility(8);
        u6.X(this.f29097s, n6.B8, this.K0);
        addView(this.f29097s, 0, ma.e(-2, -2, 51));
    }

    @Override
    public final void requestLayout() {
        if (this.I) {
            return;
        }
        super.requestLayout();
    }

    public final void s() {
        if (this.f29068e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f29068e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f29068e.setBackgroundDrawable(n6.h0(this.f29092q0, 1, -1));
        this.f29068e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.f29068e, ma.e(54, 54, 51));
        this.f29068e.setOnClickListener(new b(this, 1));
        this.f29068e.setContentDescription(gd.M0(2131754878, null));
    }

    public void setActionBarMenuOnItemClick(j jVar) {
        this.f29104v0 = jVar;
    }

    public void setActionModeColor(int i7) {
        d dVar = this.G;
        if (dVar != null) {
            t6 t6Var = u6.f30084a;
            dVar.setTag(2131296709, null);
            this.G.setBackgroundColor(i7);
        }
    }

    public void setActionModeOverrideColor(int i7) {
        this.f29109x = i7;
    }

    public void setActionModeTopColor(int i7) {
        View view = this.f29106w;
        if (view != null) {
            u6.q(view);
            this.f29106w.setBackgroundColor(i7);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        F(recyclerView, n6.f29339a7, n6.f29676s8);
    }

    public void setAddToContainer(boolean z10) {
        this.L = z10;
    }

    public void setAdditionalTextLeft(int i7) {
        this.f29077h1 = i7;
    }

    public void setAllowOverlayTitle(boolean z10) {
        this.f29064c0 = z10;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f29068e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i7;
        float f10;
        if (this.f29068e == null) {
            s();
        }
        ImageView imageView = this.f29068e;
        if (drawable == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = this.f29068e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof y1) {
            y1 y1Var = (y1) drawable;
            if (y()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            y1Var.c(false, f10);
            y1Var.b(this.f29100t0);
            y1Var.a(this.f29098s0);
        } else if (drawable instanceof t4) {
            t4 t4Var = (t4) drawable;
            t4Var.f30013k = this.f29112y;
            t4Var.f30012j = this.f29098s0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f29068e.setColorFilter(new PorterDuffColorFilter(this.f29098s0, PorterDuff.Mode.SRC_IN));
        }
        if (this.f29067d1) {
            this.f29068e.setColorFilter(new PorterDuffColorFilter(this.f29098s0, PorterDuff.Mode.SRC_IN));
        }
        l();
    }

    public void setBackButtonImage(int i7) {
        int i10;
        if (this.f29068e == null) {
            s();
        }
        ImageView imageView = this.f29068e;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        this.f29068e.setImageResource(i7);
        this.f29068e.setColorFilter(new PorterDuffColorFilter(this.f29098s0, PorterDuff.Mode.SRC_IN));
        l();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f29112y = i7;
        if (!this.M0) {
            super.setBackgroundColor(i7);
        }
        ImageView imageView = this.f29068e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof t4) {
                ((t4) drawable).f30013k = i7;
            }
        }
    }

    public void setCastShadows(boolean z10) {
        if (this.f29084l0 != z10 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f29084l0 = z10;
    }

    public void setCenterTitleAndGlass(boolean z10) {
        int i7;
        if (this.I0 == z10) {
            return;
        }
        this.I0 = z10;
        n5[] n5VarArr = this.f29086n;
        int length = n5VarArr.length;
        int i10 = 0;
        while (true) {
            i7 = 19;
            if (i10 >= length) {
                break;
            }
            n5 n5Var = n5VarArr[i10];
            if (n5Var != null) {
                if (z10) {
                    i7 = 17;
                }
                n5Var.setGravity(i7);
            }
            i10++;
        }
        n5 n5Var2 = this.f29094r;
        if (n5Var2 != null) {
            if (z10) {
                i7 = 17;
            }
            n5Var2.setGravity(i7);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(ao aoVar) {
        this.T0 = aoVar;
    }

    public void setClipContent(boolean z10) {
        this.M = z10;
    }

    public void setDrawBackButton(boolean z10) {
        this.C0 = z10;
        ImageView imageView = this.f29068e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(au0 au0Var) {
        this.M0 = true;
        this.L0 = au0Var;
        au0Var.P.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z10) {
        if (this.f29108w1 != z10) {
            this.f29108w1 = z10;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = this.f29068e;
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        z zVar = this.F;
        if (zVar != null) {
            zVar.setEnabled(z10);
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
        this.f29101t1 = true;
        if (this.f29096r1 != i7) {
            this.f29096r1 = i7;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i7) {
        this.f29099s1 = true;
        if (this.f29093q1 != i7) {
            this.f29093q1 = i7;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i7) {
        if (this.f29111x1 != i7) {
            this.f29111x1 = i7;
            invalidate();
        }
        fh.g gVar = this.f29057a;
        if (gVar != null && gVar.f56671c != i7) {
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
                i7 = org.telegram.messenger.g0.f24115m;
            } else {
                i7 = 0;
            }
            dVar.setPadding(0, i7, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.f29070e1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z10) {
        this.f29110x0 = z10;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f29072f0 = onClickListener;
        n5[] n5VarArr = this.f29086n;
        n5 n5Var = n5VarArr[0];
        if (n5Var != null) {
            n5Var.setRightDrawableOnClick(onClickListener);
        }
        n5 n5Var2 = n5VarArr[1];
        if (n5Var2 != null) {
            n5Var2.setRightDrawableOnClick(this.f29072f0);
        }
    }

    public void setSearchAvatarImageView(q9 q9Var) {
        q9 q9Var2 = this.f29071f;
        if (q9Var2 != q9Var) {
            if (q9Var2 != null) {
                removeView(q9Var2);
            }
            this.f29071f = q9Var;
            if (q9Var != null) {
                addView(q9Var);
            }
        }
    }

    public void setSearchCursorColor(int i7) {
        z zVar = this.F;
        if (zVar != null) {
            zVar.setSearchCursorColor(i7);
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
        z zVar = this.F;
        if (zVar != null) {
            zVar.setFilter(o0Var);
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
        if (this.f29083k1 != z10) {
            this.f29083k1 = z10;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i7;
        if (charSequence != null && this.f29094r == null) {
            u();
        }
        if (this.f29094r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            n5 n5Var = this.f29094r;
            if (!isEmpty && !this.f29088o0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            n5Var.setVisibility(i7);
            this.f29094r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f29094r.l(charSequence, false);
            }
            this.B0 = charSequence;
        }
    }

    public void setSubtitleColor(int i7) {
        if (this.f29094r == null) {
            u();
        }
        u6.q(this.f29094r);
        this.f29094r.setTextColor(i7);
    }

    public void setSupportsHolidayImage(boolean z10) {
        this.S = z10;
        if (z10) {
            this.V = new Paint.FontMetricsInt();
            this.f29058a0 = new Rect();
        }
        invalidate();
    }

    public void setTitle(CharSequence charSequence) {
        N(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f29082k0 = runnable;
        this.f29078i0 = runnable;
    }

    public void setTitleColor(int i7) {
        n5[] n5VarArr = this.f29086n;
        if (n5VarArr[0] == null) {
            v(0);
        }
        this.f29107w0 = i7;
        u6.q(n5VarArr[0]);
        n5VarArr[0].setTextColor(i7);
        n5VarArr[0].setEmojiColor(i7);
        n5 n5Var = n5VarArr[1];
        if (n5Var != null) {
            u6.q(n5Var);
            n5VarArr[1].setTextColor(i7);
            n5VarArr[1].setEmojiColor(i7);
        }
    }

    public void setTitleRightMargin(int i7) {
        this.f29061b0 = i7;
    }

    public void setTitleScrollNonFitText(boolean z10) {
        this.f29086n[0].setScrollNonFitText(z10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.M) {
            invalidate();
        }
    }

    public final z t() {
        z zVar = this.F;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(getContext(), this);
        this.F = zVar2;
        addView(zVar2, 0, ma.e(-2, -1, 5));
        return this.F;
    }

    public final void u() {
        if (this.f29094r != null) {
            return;
        }
        n5 n5Var = new n5(getContext());
        this.f29094r = n5Var;
        n5Var.setGravity(3);
        this.f29094r.setVisibility(8);
        u6.X(this.f29094r, n6.B8, this.K0);
        addView(this.f29094r, 0, ma.e(-2, -2, 51));
    }

    @Override
    public final void updateColors() {
        i();
        fh.g gVar = this.f29057a;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.f29063c;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.f29060b;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        fi.j jVar = this.f29114y1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public final void v(int i7) {
        int i10;
        View[] viewArr = this.f29086n;
        if (viewArr[i7] != null) {
            return;
        }
        n5 n5Var = new n5(getContext());
        viewArr[i7] = n5Var;
        if (this.I0) {
            i10 = 17;
        } else {
            i10 = 19;
        }
        n5Var.setGravity(i10);
        int i11 = this.f29107w0;
        if (i11 != 0) {
            viewArr[i7].setTextColor(i11);
        } else {
            u6.X(viewArr[i7], n6.A8, this.K0);
        }
        n5 n5Var2 = viewArr[i7];
        n5Var2.setEmojiColor(n5Var2.getTextColor());
        viewArr[i7].setTypeface(org.telegram.messenger.g0.o());
        viewArr[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        viewArr[i7].setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        viewArr[i7].setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        if (this.H0) {
            this.G0.addView(viewArr[i7], 0, ma.e(-2, -2, 51));
        } else {
            addView(viewArr[i7], 0, ma.e(-2, -2, 51));
        }
    }

    public void x() {
        d dVar = this.G;
        if (dVar != null && this.K) {
            int childCount = dVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = dVar.getChildAt(i7);
                if (childAt instanceof r0) {
                    ((r0) childAt).p();
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
            boolean z10 = this.f29088o0;
            n5[] n5VarArr = this.f29086n;
            if (!z10) {
                n5 n5Var = n5VarArr[0];
                if (n5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(n5Var, property, 1.0f));
                }
                if (this.f29094r != null && !TextUtils.isEmpty(this.B0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f29094r, property, 1.0f));
                }
            }
            z zVar = this.F;
            if (zVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(zVar, property, 1.0f));
            }
            int i11 = this.f29112y;
            if (i11 != 0 && !this.Q0) {
                if (i0.a.h(i11) < 0.699999988079071d) {
                    org.telegram.messenger.g0.o3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.o3((Activity) getContext(), true);
                }
            } else {
                ks.e().k(ks.f25197t4, new Object[0]);
            }
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.Q = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f29073f1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.Q.playTogether(ofFloat);
            }
            this.Q.setDuration(200L);
            this.Q.addListener(new e(this, 0));
            this.Q.start();
            if (!this.f29088o0) {
                n5 n5Var2 = n5VarArr[0];
                if (n5Var2 != null) {
                    n5Var2.setVisibility(0);
                }
                if (this.f29094r != null && !TextUtils.isEmpty(this.B0)) {
                    this.f29094r.setVisibility(0);
                }
            }
            z zVar2 = this.F;
            if (zVar2 != null) {
                zVar2.setVisibility(0);
            }
            ImageView imageView = this.f29068e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).c(true, 0.0f);
                }
                this.f29068e.setBackgroundDrawable(n6.h0(this.f29092q0, 1, -1));
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

    public void setAdaptiveBackground(tm0 tm0Var) {
        int i7 = n6.f29339a7;
        int i10 = n6.f29676s8;
        this.B1 = i7;
        this.C1 = i10;
        this.A1 = org.telegram.messenger.g0.Q1();
        i();
        a2 a2Var = new a2(1, this, tm0Var);
        tm0Var.M.add(a2Var);
        if (this.f29116z1) {
            a2Var.run();
            return;
        }
        this.f29116z1 = true;
        boolean canScrollVertically = tm0Var.canScrollVertically(-1);
        this.D1 = !canScrollVertically;
        this.E1 = !canScrollVertically ? 1.0f : 0.0f;
        i();
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
