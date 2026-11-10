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
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.uu0;
public class l extends FrameLayout implements te.b, c6, t4 {
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
    public e F;
    public di.b4 F0;
    public String G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public View.OnTouchListener I0;
    public boolean J;
    public final h6 J0;
    public boolean K;
    public st0 K0;
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
    public du0 S;
    public jn S0;
    public hz T;
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
    public fh.g f27661a;
    public int f27662a0;
    public r0 f27663a1;
    public fh.g f27664b;
    public boolean f27665b0;
    public final RectF f27666b1;
    public fh.g f27667c;
    public CharSequence f27668c0;
    public boolean f27669c1;
    public final n4 d;
    public Drawable f27670d0;
    public Runnable f27671d1;
    public ImageView f27672e;
    public View.OnClickListener f27673e0;
    public uu0 f27674e1;
    public k9 f27675f;
    public String f27676f0;
    public AnimatorSet f27677f1;
    public final Object[] f27678g0;
    public int f27679g1;
    public Drawable h;
    public Runnable f27680h0;
    public int f27681h1;
    public boolean f27682i0;
    public boolean f27683i1;
    public Runnable f27684j0;
    public boolean f27685j1;
    public boolean f27686k0;
    public float f27687k1;
    public int f27688l0;
    public final te.c l1;
    public boolean m0;
    public final te.a f27689m1;
    public final m5[] f27690n;
    public boolean f27691n0;
    public final te.c n1;
    public float f27692o0;
    public final te.a f27693o1;
    public int f27694p0;
    public int f27695p1;
    public int f27696q0;
    public int f27697q1;
    public m5 f27698r;
    public int f27699r0;
    public boolean f27700r1;
    public m5 f27701s;
    public int f27702s0;
    public boolean f27703s1;
    public f2 f27704t0;
    public boolean f27705t1;
    public k f27706u0;
    public boolean f27707u1;
    public int f27708v0;
    public boolean f27709v1;
    public View f27710w;
    public boolean f27711w0;
    public int f27712w1;
    public int f27713x;
    public boolean f27714x0;
    public di.j f27715x1;
    public int f27716y;
    public boolean f27717y0;
    public boolean f27718y1;
    public boolean f27719z0;
    public boolean f27720z1;

    public l(Context context, h6 h6Var) {
        super(context);
        this.d = n4.f28318a;
        this.f27690n = new m5[2];
        this.I = true;
        this.K = true;
        this.M = true;
        this.f27678g0 = new Object[3];
        this.f27686k0 = true;
        this.f27688l0 = 255;
        this.f27708v0 = 0;
        this.M0 = new Paint();
        this.N0 = new Rect();
        this.O0 = new ab.q(this);
        this.f27666b1 = new RectF();
        wq wqVar = wq.h;
        this.l1 = new te.c(0, this, wqVar, 380L);
        this.f27689m1 = new te.a(0, this, wqVar, 380L, false);
        this.n1 = new te.c(0, this, wqVar, 320L);
        this.f27693o1 = new te.a(0, this, wqVar, 320L, false);
        this.f27709v1 = true;
        this.f27712w1 = 255;
        this.C1 = true;
        this.D1 = 1.0f;
        this.J0 = h6Var;
        setOnClickListener(new b(this, 0));
    }

    public static int getCurrentActionBarHeight() {
        if (org.telegram.messenger.g0.Q1()) {
            return org.telegram.messenger.g0.L(58.0f);
        }
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            return org.telegram.messenger.g0.L(48.0f);
        }
        return org.telegram.messenger.g0.L(56.0f);
    }

    public static View v(l lVar, float f10, float f11, View view) {
        for (int childCount = lVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = lVar.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt != view && f10 >= childAt.getX() && f10 <= childAt.getX() + childAt.getWidth() && f11 >= childAt.getTop() && f11 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void A(boolean z9) {
        float f10;
        Property property;
        float f11;
        float f12;
        float f13;
        int i7;
        this.f27691n0 = z9;
        l();
        AnimatorSet animatorSet = this.f27677f1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f27677f1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean z10 = z();
        if (!z10) {
            m5 m5Var = this.f27690n[0];
            if (m5Var != null) {
                arrayList.add(m5Var);
            }
            if (this.f27698r != null && !TextUtils.isEmpty(this.A0)) {
                arrayList.add(this.f27698r);
                m5 m5Var2 = this.f27698r;
                if (z9) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                m5Var2.setVisibility(i7);
            }
        }
        float f14 = this.f27692o0;
        float f15 = 0.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14, f10);
        ofFloat.addUpdateListener(new a(this, 2));
        this.f27677f1.playTogether(ofFloat);
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
            AnimatorSet animatorSet2 = this.f27677f1;
            if (z9) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f12));
            AnimatorSet animatorSet3 = this.f27677f1;
            if (z9) {
                f13 = 0.95f;
            } else {
                f13 = 1.0f;
            }
            animatorSet3.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_Y, f13));
            AnimatorSet animatorSet4 = this.f27677f1;
            if (!z9) {
                f16 = 1.0f;
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f16));
            i10++;
        }
        k9 k9Var = this.f27675f;
        if (k9Var != null) {
            k9Var.setVisibility(0);
            AnimatorSet animatorSet5 = this.f27677f1;
            k9 k9Var2 = this.f27675f;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(k9Var2, property, f11));
        }
        this.f27719z0 = true;
        requestLayout();
        this.f27677f1.addListener(new g(this, arrayList, z9, z10));
        this.f27677f1.setDuration(150L).start();
        ImageView imageView = this.f27672e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof s4) {
                s4 s4Var = (s4) drawable;
                s4Var.h = true;
                if (z9) {
                    f15 = 1.0f;
                }
                s4Var.a(true, f15);
            }
        }
    }

    public final void B() {
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

    public final void C() {
        y yVar = this.E;
        if (yVar != null) {
            boolean z9 = this.f27691n0;
            boolean z10 = !z9;
            int childCount = yVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = yVar.getChildAt(i7);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.u()) {
                        if (!z9) {
                            yVar.f28771b.A(r0Var.T(z10));
                        }
                        r0Var.P("", false);
                        r0Var.getSearchField().setSelection(0);
                        return;
                    }
                }
            }
        }
    }

    public final void D(RecyclerView recyclerView, int i7, int i10) {
        float f10;
        this.A1 = i7;
        this.B1 = i10;
        this.f27720z1 = org.telegram.messenger.g0.Q1();
        c cVar = new c(0, this, recyclerView);
        recyclerView.j(new ai.b(cVar, 24));
        if (this.f27718y1) {
            cVar.run();
            return;
        }
        this.f27718y1 = true;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        if (!canScrollVertically) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.D1 = f10;
        h();
    }

    public final void E(int i7, boolean z9) {
        ImageView imageView;
        if (z9) {
            this.f27696q0 = i7;
            if (this.J && (imageView = this.f27672e) != null) {
                imageView.setBackgroundDrawable(m6.h0(i7, 1, -1));
            }
            e eVar = this.F;
            if (eVar != null) {
                eVar.s();
                return;
            }
            return;
        }
        this.f27694p0 = i7;
        ImageView imageView2 = this.f27672e;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(m6.h0(i7, 1, -1));
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.s();
        }
    }

    public void G(int i7, boolean z9) {
        if (z9) {
            this.f27702s0 = i7;
            e eVar = this.F;
            if (eVar != null) {
                eVar.t();
            }
            ImageView imageView = this.f27672e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).b(i7);
                } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                    this.f27672e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
        } else {
            this.f27699r0 = i7;
            ImageView imageView2 = this.f27672e;
            if (imageView2 != null && i7 != 0) {
                Drawable drawable2 = imageView2.getDrawable();
                if (drawable2 instanceof y1) {
                    ((y1) drawable2).a(i7);
                } else if (drawable2 instanceof s4) {
                    ((s4) drawable2).f28498j = i7;
                } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                    this.f27672e.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                yVar.t();
            }
        }
        ImageView imageView3 = this.f27672e;
        if (imageView3 != null && this.f27669c1) {
            imageView3.setColorFilter(new PorterDuffColorFilter(this.f27699r0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void H(int i7, boolean z9) {
        y yVar;
        e eVar;
        int i10 = 0;
        if (z9 && (eVar = this.F) != null) {
            int childCount = eVar.getChildCount();
            while (i10 < childCount) {
                View childAt = eVar.getChildAt(i10);
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

    public final void I(int i7, boolean z9, boolean z10) {
        y yVar;
        e eVar;
        int i10 = 0;
        if (z10 && (eVar = this.F) != null) {
            int childCount = eVar.getChildCount();
            while (i10 < childCount) {
                View childAt = eVar.getChildAt(i10);
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

    public final void J(int i7, boolean z9) {
        y yVar;
        e eVar;
        if (z9 && (eVar = this.F) != null) {
            eVar.setPopupItemsSelectorColor(i7);
        } else if (!z9 && (yVar = this.E) != null) {
            yVar.setPopupItemsSelectorColor(i7);
        }
    }

    public final void K(int i7, boolean z9) {
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

    public final void L(CharSequence charSequence, org.telegram.ui.Components.f5 f5Var) {
        int i7;
        m5[] m5VarArr = this.f27690n;
        if (charSequence != null && m5VarArr[0] == null) {
            u(0);
        }
        m5 m5Var = m5VarArr[0];
        if (m5Var != null) {
            if (charSequence != null && !this.f27691n0) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            m5Var.setVisibility(i7);
            m5 m5Var2 = m5VarArr[0];
            this.f27668c0 = charSequence;
            m5Var2.k(charSequence);
            if (this.C0) {
                Drawable drawable = this.f27670d0;
                if (drawable instanceof org.telegram.ui.Components.f5) {
                    ((org.telegram.ui.Components.f5) drawable).l(null);
                }
            }
            m5 m5Var3 = m5VarArr[0];
            this.f27670d0 = f5Var;
            m5Var3.i(f5Var);
            if (this.C0) {
                Drawable drawable2 = this.f27670d0;
                if (drawable2 instanceof org.telegram.ui.Components.f5) {
                    ((org.telegram.ui.Components.f5) drawable2).l(m5VarArr[0]);
                }
            }
            m5VarArr[0].setRightDrawableOnClick(this.f27673e0);
        }
        this.f27717y0 = false;
    }

    public final void M(CharSequence charSequence, boolean z9, long j3, Interpolator interpolator) {
        boolean z10;
        float f10;
        m5[] m5VarArr = this.f27690n;
        if (m5VarArr[0] != null && charSequence != null) {
            if (this.f27711w0 && !TextUtils.isEmpty(this.A0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f27698r.getVisibility() != 0) {
                    this.f27698r.setVisibility(0);
                    this.f27698r.setAlpha(0.0f);
                }
                ViewPropertyAnimator animate = this.f27698r.animate();
                if (z9) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                org.telegram.messenger.camera.q.k(animate, f10, 220L);
            }
            m5 m5Var = m5VarArr[1];
            if (m5Var != null) {
                if (m5Var.getParent() != null) {
                    ((ViewGroup) m5VarArr[1].getParent()).removeView(m5VarArr[1]);
                }
                m5VarArr[1] = null;
            }
            m5VarArr[1] = m5VarArr[0];
            m5VarArr[0] = null;
            setTitle(charSequence);
            this.f27717y0 = z9;
            m5VarArr[0].setAlpha(0.0f);
            if (!z10) {
                m5 m5Var2 = m5VarArr[0];
                int L = org.telegram.messenger.g0.L(20.0f);
                if (!z9) {
                    L = -L;
                }
                m5Var2.setTranslationY(L);
            }
            ViewPropertyAnimator duration = m5VarArr[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j3);
            if (interpolator != null) {
                duration.setInterpolator(interpolator);
            }
            duration.start();
            this.f27714x0 = true;
            ViewPropertyAnimator alpha = m5VarArr[1].animate().alpha(0.0f);
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
            alpha.setDuration(j3).setListener(new h(this, z10, z9, 0)).start();
            requestLayout();
            return;
        }
        setTitle(charSequence);
    }

    public final void N(String str, int i7, Runnable runnable) {
        String str2;
        boolean z9;
        SpannableString spannableString;
        boolean z10;
        m5 m5Var;
        int indexOf;
        SpannableStringBuilder spannableStringBuilder;
        if (this.f27665b0 && this.f27704t0.parentLayout != null) {
            Object[] objArr = this.f27678g0;
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i7);
            objArr[2] = runnable;
            if (!this.f27683i1) {
                String str3 = this.f27676f0;
                if (str3 != null || str != null) {
                    if (str3 == null || !str3.equals(str)) {
                        this.f27676f0 = str;
                        Drawable drawable = null;
                        if (this.f27715x1 != null) {
                            if (i7 == 2131751805) {
                                spannableStringBuilder = org.telegram.messenger.g0.I2(id.M0(2131744113, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(2.0f));
                            } else {
                                spannableStringBuilder = null;
                            }
                            this.f27715x1.b(spannableStringBuilder, true);
                        }
                        if (str != null) {
                            str2 = id.M0(i7, str);
                        } else {
                            str2 = this.f27668c0;
                        }
                        if (str == null) {
                            drawable = this.f27670d0;
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
                        this.f27682i0 = z10;
                        m5[] m5VarArr = this.f27690n;
                        if ((spannableString == null || m5VarArr[0] != null) && getMeasuredWidth() != 0 && ((m5Var = m5VarArr[0]) == null || m5Var.getVisibility() == 0)) {
                            m5 m5Var2 = m5VarArr[0];
                            if (m5Var2 != null) {
                                m5Var2.animate().cancel();
                                m5 m5Var3 = m5VarArr[1];
                                if (m5Var3 != null) {
                                    m5Var3.animate().cancel();
                                }
                                if (m5VarArr[1] == null) {
                                    u(1);
                                }
                                m5VarArr[1].k(spannableString);
                                m5VarArr[1].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                                m5VarArr[1].i(drawable);
                                m5VarArr[1].setRightDrawableOnClick(this.f27673e0);
                                if (drawable instanceof org.telegram.ui.Components.f5) {
                                    ((org.telegram.ui.Components.f5) drawable).l(m5VarArr[1]);
                                }
                                if (z9) {
                                    qVar.c(m5VarArr[1]);
                                }
                                this.f27683i1 = true;
                                float alpha = m5VarArr[0].getAlpha();
                                m5 m5Var4 = m5VarArr[1];
                                m5VarArr[1] = m5VarArr[0];
                                m5VarArr[0] = m5Var4;
                                m5Var4.setAlpha(0.0f);
                                m5VarArr[0].setTranslationY(-org.telegram.messenger.g0.L(20.0f));
                                m5VarArr[0].animate().alpha(alpha).translationY(0.0f).setDuration(220L).start();
                                ViewPropertyAnimator alpha2 = m5VarArr[1].animate().alpha(0.0f);
                                if (this.f27698r == null) {
                                    alpha2.translationY(org.telegram.messenger.g0.L(20.0f));
                                } else {
                                    alpha2.scaleY(0.7f).scaleX(0.7f);
                                }
                                requestLayout();
                                this.f27719z0 = true;
                                alpha2.setDuration(220L).setListener(new f(this, 1)).start();
                            }
                        } else {
                            u(0);
                            if (this.R) {
                                m5VarArr[0].invalidate();
                                invalidate();
                            }
                            m5VarArr[0].k(spannableString);
                            m5VarArr[0].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                            m5VarArr[0].i(drawable);
                            m5VarArr[0].setRightDrawableOnClick(this.f27673e0);
                            if (drawable instanceof org.telegram.ui.Components.f5) {
                                ((org.telegram.ui.Components.f5) drawable).l(m5VarArr[0]);
                            }
                            if (z9) {
                                qVar.c(m5VarArr[0]);
                            } else {
                                qVar.x(m5VarArr[0]);
                            }
                        }
                        if (runnable == null) {
                            runnable = this.f27680h0;
                        }
                        this.f27684j0 = runnable;
                    }
                }
            }
        }
    }

    public final void O(dh.c cVar, gh.e eVar, boolean z9) {
        setBackground(null);
        setClipChildren(false);
        this.P0 = true;
        this.R0 = z9;
        this.U0 = cVar;
        this.V0 = eVar;
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.f27661a = c10;
        if (z9) {
            c10.s(org.telegram.messenger.g0.L(18.33f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(18.33f));
        } else {
            c10.r(org.telegram.messenger.g0.L(23.0f));
        }
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f27664b = c11;
        fh.g c12 = cVar.c(this, null, false);
        c12.p(eVar);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(23.0f), 6.0f);
        this.f27667c = c12;
        y yVar = this.E;
        if (yVar != null) {
            yVar.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.E.setGlassMode(true);
        }
        e eVar2 = this.F;
        if (eVar2 != null) {
            eVar2.setTranslationX(-org.telegram.messenger.g0.L(10.0f));
            this.F.setGlassMode(true);
        }
        ImageView imageView = this.f27672e;
        if (imageView != null) {
            imageView.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public boolean P(View view) {
        if (this.L) {
            m5[] m5VarArr = this.f27690n;
            if (view == m5VarArr[0] || view == m5VarArr[1] || view == this.f27698r || view == this.E || view == this.f27672e || view == this.f27701s || view == this.F0) {
                return true;
            }
        }
        return false;
    }

    public void Q(View[] viewArr, boolean[] zArr) {
        if (this.F != null && !this.J) {
            this.J = true;
            l();
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
            if (this.f27713x == 0) {
                if (!this.f27691n0) {
                    m5 m5Var = this.f27690n[0];
                    if (m5Var != null) {
                        arrayList.add(ObjectAnimator.ofFloat(m5Var, property, 0.0f));
                    }
                    if (this.f27698r != null && !TextUtils.isEmpty(this.A0)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.f27698r, property, 0.0f));
                    }
                }
                y yVar = this.E;
                if (yVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(yVar, property, 0.0f));
                }
            }
            int i7 = this.f27713x;
            if (i7 == 0) {
                i7 = this.f27716y;
            }
            if (i7 != 0 && !this.P0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                qs.e().k(qs.f25072r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f27674e1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 1));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new ah.l(13, this, zArr));
            this.P.start();
            ImageView imageView = this.f27672e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).c(true, 1.0f);
                }
                this.f27672e.setBackgroundDrawable(m6.h0(this.f27696q0, 1, -1));
            }
        }
    }

    public final void R() {
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
        if (r0Var.getParent() == this.E && this.f27667c != null && !this.f27707u1 && !this.Q0 && this.f27687k1 == 0.0f && getActionModeFactor() == 0.0f && !this.f27667c.getBounds().isEmpty()) {
            rectF.set(this.f27667c.getBounds());
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l.dispatchDraw(android.graphics.Canvas):void");
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
            View v = v(this, f10, f11, this.S0);
            if (v == null) {
                v = v(this, f10, f11, null);
            }
            fh.g gVar = this.f27661a;
            boolean z11 = true;
            if (gVar != null && gVar.getBounds().contains(x10, y10)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (v != null && v != this.S0) {
                fh.g gVar2 = this.f27664b;
                if (gVar2 != null && gVar2.getBounds().contains(x10, y10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z9 | z10;
                fh.g gVar3 = this.f27667c;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final fh.g f(j5 j5Var) {
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
    public final void g(j5 j5Var, r0 r0Var) {
        this.Z0 = j5Var;
        this.f27663a1 = r0Var;
        invalidate();
    }

    public k getActionBarMenuOnItemClick() {
        return this.f27706u0;
    }

    public y getActionMode() {
        return this.F;
    }

    public float getActionModeFactor() {
        e eVar = this.F;
        if (eVar != null) {
            return eVar.getAlpha();
        }
        return 0.0f;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.f27715x1;
    }

    public m5 getAdditionalSubtitleTextView() {
        return this.f27701s;
    }

    public ImageView getBackButton() {
        return this.f27672e;
    }

    public Drawable getBackButtonDrawable() {
        return this.h;
    }

    public n4 getBackButtonState() {
        return this.d;
    }

    public int getBackgroundColor() {
        return this.f27716y;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = this.V0;
        if (eVar != null) {
            return eVar.a(eVar.f13973e);
        }
        return 0;
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return this.V0;
    }

    public boolean getCastShadows() {
        return this.f27686k0;
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
    public h6 getMenuResourcesProvider() {
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

    public k9 getSearchAvatarImageView() {
        return this.f27675f;
    }

    public int getShadowAlpha() {
        return this.f27688l0;
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.f27698r != null && (charSequence = this.A0) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public int getSubtitleColorInternal() {
        m5 m5Var = this.f27698r;
        if (m5Var != null) {
            return m5Var.getTextColor();
        }
        return 0;
    }

    public m5 getSubtitleTextView() {
        return this.f27698r;
    }

    public String getTitle() {
        m5 m5Var = this.f27690n[0];
        if (m5Var == null) {
            return null;
        }
        return m5Var.getText().toString();
    }

    public int getTitleColorToSet() {
        return this.f27708v0;
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        float f10;
        m5 m5Var = this.f27690n[0];
        if (m5Var == null) {
            TextPaint textPaint = new TextPaint(1);
            if (!org.telegram.messenger.g0.Q1() && getResources().getConfiguration().orientation == 2) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
            textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
            return textPaint.getFontMetricsInt();
        }
        return m5Var.getPaint().getFontMetricsInt();
    }

    public m5 getTitleTextView() {
        return this.f27690n[0];
    }

    public m5 getTitleTextView2() {
        return this.f27690n[1];
    }

    public FrameLayout getTitlesContainer() {
        return this.F0;
    }

    public final void h() {
        float f10;
        int w02;
        int w03;
        if (this.f27718y1) {
            if (this.f27720z1) {
                f10 = 1.0f;
            } else {
                f10 = this.D1;
            }
            int i7 = this.B1;
            h6 h6Var = this.J0;
            if (i7 == -1) {
                w02 = 0;
            } else {
                w02 = m6.w0(i7, h6Var);
            }
            int i10 = this.A1;
            if (i10 == -1) {
                w03 = 0;
            } else {
                w03 = m6.w0(i10, h6Var);
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

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (!id.f23161a0) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new j(0));
            this.f27719z0 = false;
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) wq.f40046f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
    }

    public final void j(boolean z9) {
        boolean z10;
        float f10;
        jn jnVar = this.S0;
        if (jnVar == null) {
            return;
        }
        fn fnVar = jnVar.f34997e;
        if (fnVar != null && fnVar.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(getMeasuredWidth() - org.telegram.messenger.g0.L(116.0f), this.S0.getVisualWidth());
        te.c cVar = this.l1;
        if (z9) {
            if (cVar.h) {
                f10 = cVar.f55505g;
            } else {
                f10 = cVar.f55504f;
            }
            float f11 = min;
            if (f10 != f11) {
                cVar.a(f11);
            }
        } else {
            cVar.c(min);
        }
        this.f27689m1.a(z10, z9);
    }

    public final void k() {
        int i7;
        ImageView imageView = this.f27672e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (!(drawable instanceof y1) && !(drawable instanceof s4)) {
                i7 = 0;
            } else {
                i7 = 2;
            }
            if (this.f27672e.getLayerType() != i7) {
                this.f27672e.setLayerType(i7, null);
                this.f27672e.invalidate();
            }
        }
    }

    public final void l() {
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
        e eVar = this.F;
        if (eVar != null) {
            i10 = (eVar.getItemsWidth() - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(1.0f);
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
        this.f27693o1.a(z9, this.f27705t1);
        te.c cVar = this.n1;
        if (cVar.h) {
            f10 = cVar.f55505g;
        } else {
            f10 = cVar.f55504f;
        }
        float f11 = max;
        if (f10 != f11) {
            if (this.f27705t1) {
                cVar.a(f11);
            } else {
                cVar.c(f11);
            }
        }
    }

    public final void m() {
        n(true);
    }

    public void n(boolean z9) {
        y yVar;
        if (this.f27691n0 && (yVar = this.E) != null) {
            yVar.i(z9);
        }
    }

    public final y o() {
        return p(null);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        R();
        if (this.J) {
            int i7 = this.f27713x;
            if (i7 == 0) {
                i7 = this.f27716y;
            }
            if (i7 != 0 && !this.P0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                qs.e().k(qs.f25072r4, new Object[0]);
            }
        }
        Drawable drawable = this.f27670d0;
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).l(this.f27690n[0]);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        R();
        if (this.J) {
            int i7 = this.f27716y;
            if (i7 != 0 && this.f27713x != 0 && !this.P0) {
                if (i0.a.h(i7) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                qs.e().k(qs.f25072r4, new Object[0]);
            }
        }
        Drawable drawable = this.f27670d0;
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).l(null);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable B0;
        if (this.R && !this.f27682i0 && !id.f23161a0 && motionEvent.getAction() == 0 && (B0 = m6.B0()) != null && B0.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.V = true;
            du0 du0Var = this.S;
            m5[] m5VarArr = this.f27690n;
            if (du0Var == null) {
                this.T = null;
                this.S = new du0(0);
                m5VarArr[0].invalidate();
                invalidate();
            } else {
                this.S = null;
                ?? obj = new Object();
                obj.f34486c = new ArrayList();
                obj.d = new ArrayList();
                Paint paint = new Paint(1);
                obj.f34485b = paint;
                paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
                paint.setColor(m6.x0(null, m6.A8, false) & (-1644826));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                for (int i7 = 0; i7 < 20; i7++) {
                    ((ArrayList) obj.d).add(new gz(obj));
                }
                this.T = obj;
                m5VarArr[0].invalidate();
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
    public void onMeasure(int i7, int i10) {
        int i11;
        float f10;
        int L;
        m5[] m5VarArr;
        m5 m5Var;
        int i12;
        int i13;
        int z9;
        int i14;
        int i15;
        m5 m5Var2;
        int i16;
        int i17;
        int makeMeasureSpec;
        float f11;
        int i18;
        l lVar = this;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        int i19 = 1;
        lVar.H = true;
        View view = lVar.f27710w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = org.telegram.messenger.g0.f22561m;
        }
        e eVar = lVar.F;
        if (eVar != null) {
            if (lVar.I) {
                i18 = org.telegram.messenger.g0.f22561m;
            } else {
                i18 = 0;
            }
            eVar.setPadding(0, i18, 0, 0);
        }
        lVar.H = false;
        if (lVar.I) {
            i11 = org.telegram.messenger.g0.f22561m;
        } else {
            i11 = 0;
        }
        lVar.setMeasuredDimension(size, currentActionBarHeight + i11 + lVar.O);
        ImageView imageView = lVar.f27672e;
        if (imageView != null && imageView.getVisibility() != 8) {
            lVar.f27672e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(54.0f), 1073741824), makeMeasureSpec2);
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
        y yVar = lVar.E;
        if (yVar != null && yVar.getVisibility() != 8) {
            float f12 = 66.0f;
            if (lVar.E.p() && !lVar.f27691n0) {
                lVar.E.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int k10 = lVar.E.k();
                if (lVar.m0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(lVar.E.k() + (size - org.telegram.messenger.g0.L(f12)), 1073741824);
                if (!lVar.D) {
                    lVar.E.r(-k10);
                }
            } else if (lVar.f27691n0) {
                if (lVar.m0) {
                    f12 = 0.0f;
                } else if (org.telegram.messenger.g0.Q1()) {
                    f12 = 74.0f;
                }
                makeMeasureSpec = org.telegram.messenger.camera.q.c(f12, size, 1073741824);
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
        int i20 = 0;
        while (true) {
            m5VarArr = lVar.f27690n;
            if (i20 >= 2) {
                break;
            }
            m5 m5Var3 = m5VarArr[0];
            if ((m5Var3 != null && m5Var3.getVisibility() != 8) || ((m5Var = lVar.f27698r) != null && m5Var.getVisibility() != 8)) {
                y yVar2 = lVar.E;
                if (yVar2 != null) {
                    i13 = yVar2.getMeasuredWidth();
                } else {
                    i13 = 0;
                }
                if (lVar.H0) {
                    z9 = size - (Math.max(L, (org.telegram.messenger.g0.L(16.0f) + i13) + lVar.f27662a0) * 2);
                } else {
                    z9 = org.telegram.messenger.k5.z(16.0f, size - i13, L) - lVar.f27662a0;
                }
                int max = Math.max(z9, 0);
                boolean z10 = lVar.f27717y0;
                int i21 = 20;
                if (((z10 && i20 == 0) || (!z10 && i20 == i19)) && lVar.f27711w0 && lVar.f27714x0) {
                    m5 m5Var4 = m5VarArr[i20];
                    i12 = i19;
                    if (lVar.P0) {
                        i21 = 17;
                    } else if (!org.telegram.messenger.g0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                        i21 = 18;
                    }
                    m5Var4.setTextSize(i21);
                } else {
                    i12 = i19;
                    m5 m5Var5 = m5VarArr[0];
                    if (m5Var5 != null && m5Var5.getVisibility() != 8 && (m5Var2 = lVar.f27698r) != null && m5Var2.getVisibility() != 8) {
                        m5 m5Var6 = m5VarArr[i20];
                        if (m5Var6 != null) {
                            if (lVar.P0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1()) {
                                i21 = 18;
                            }
                            m5Var6.setTextSize(i21);
                        }
                        m5 m5Var7 = lVar.f27698r;
                        if (org.telegram.messenger.g0.Q1()) {
                            i16 = 16;
                        } else {
                            i16 = 14;
                        }
                        m5Var7.setTextSize(i16);
                        m5 m5Var8 = lVar.f27701s;
                        if (m5Var8 != null) {
                            if (org.telegram.messenger.g0.Q1()) {
                                i17 = 16;
                            } else {
                                i17 = 14;
                            }
                            m5Var8.setTextSize(i17);
                        }
                    } else {
                        m5 m5Var9 = m5VarArr[i20];
                        if (m5Var9 != null && m5Var9.getVisibility() != 8) {
                            m5 m5Var10 = m5VarArr[i20];
                            if (lVar.P0) {
                                i21 = 17;
                            } else if (!org.telegram.messenger.g0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                                i21 = 18;
                            }
                            m5Var10.setTextSize(i21);
                        }
                        m5 m5Var11 = lVar.f27698r;
                        if (m5Var11 != null && m5Var11.getVisibility() != 8) {
                            m5 m5Var12 = lVar.f27698r;
                            if (!org.telegram.messenger.g0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                                i15 = 14;
                            } else {
                                i15 = 16;
                            }
                            m5Var12.setTextSize(i15);
                        }
                        m5 m5Var13 = lVar.f27701s;
                        if (m5Var13 != null) {
                            if (!org.telegram.messenger.g0.Q1() && lVar.getResources().getConfiguration().orientation == 2) {
                                i14 = 14;
                            } else {
                                i14 = 16;
                            }
                            m5Var13.setTextSize(i14);
                        }
                    }
                }
                m5 m5Var14 = m5VarArr[i20];
                if (m5Var14 != null && m5Var14.getVisibility() != 8) {
                    m5VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m5VarArr[i20].getPaddingBottom() + m5VarArr[i20].getPaddingTop() + org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
                    if (lVar.f27719z0) {
                        CharSequence text = m5VarArr[i20].getText();
                        m5 m5Var15 = m5VarArr[i20];
                        m5Var15.setPivotX(m5Var15.getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        m5VarArr[i20].setPivotY(org.telegram.messenger.g0.L(24.0f) >> 1);
                    } else {
                        m5VarArr[i20].setPivotX(0.0f);
                        m5VarArr[i20].setPivotY(0.0f);
                    }
                }
                m5 m5Var16 = lVar.f27698r;
                if (m5Var16 != null && m5Var16.getVisibility() != 8) {
                    lVar.f27698r.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                di.j jVar = lVar.f27715x1;
                if (jVar != null) {
                    jVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                }
                m5 m5Var17 = lVar.f27701s;
                if (m5Var17 != null && m5Var17.getVisibility() != 8) {
                    lVar.f27701s.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
            } else {
                i12 = i19;
            }
            i20++;
            i19 = i12;
        }
        int i22 = i19;
        k9 k9Var = lVar.f27675f;
        if (k9Var != null) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
        }
        int childCount = lVar.getChildCount();
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = lVar.getChildAt(i23);
            if (childAt.getVisibility() != 8 && childAt != m5VarArr[0] && childAt != m5VarArr[i22] && childAt != lVar.f27715x1 && childAt != lVar.f27698r && childAt != lVar.E && childAt != lVar.f27672e && childAt != lVar.f27701s && childAt != lVar.f27675f) {
                lVar.measureChildWithMargins(childAt, i7, 0, View.MeasureSpec.makeMeasureSpec(lVar.getMeasuredHeight(), 1073741824), 0);
            }
            i23++;
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

    public final y p(String str) {
        float f10;
        int i7;
        if (c(str)) {
            return this.F;
        }
        e eVar = this.F;
        if (eVar != null) {
            removeView(eVar);
            this.F = null;
        }
        this.G = str;
        e eVar2 = new e(this, getContext(), this);
        this.F = eVar2;
        if (this.P0) {
            f10 = -org.telegram.messenger.g0.L(10.0f);
        } else {
            f10 = 0.0f;
        }
        eVar2.setTranslationX(f10);
        this.F.setGlassMode(this.P0);
        e eVar3 = this.F;
        eVar3.f28772c = true;
        eVar3.setClickable(true);
        if (!this.P0) {
            t6.h(m6.f28246w8, this.F, this.J0);
        }
        addView(this.F, indexOfChild(this.f27672e));
        e eVar4 = this.F;
        if (this.I) {
            i7 = org.telegram.messenger.g0.f22561m;
        } else {
            i7 = 0;
        }
        eVar4.setPadding(0, i7, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.O;
        layoutParams.gravity = 5;
        this.F.setLayoutParams(layoutParams);
        this.F.setVisibility(4);
        return this.F;
    }

    public final void q() {
        if (this.f27701s != null) {
            return;
        }
        m5 m5Var = new m5(getContext());
        this.f27701s = m5Var;
        m5Var.setGravity(3);
        this.f27701s.setVisibility(8);
        t6.X(this.f27701s, m6.B8, this.J0);
        addView(this.f27701s, 0, ha.e(-2, -2, 51));
    }

    public final void r() {
        if (this.f27672e != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.f27672e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f27672e.setBackgroundDrawable(m6.h0(this.f27694p0, 1, -1));
        this.f27672e.setPadding(org.telegram.messenger.g0.L(1.0f), 0, 0, 0);
        addView(this.f27672e, ha.e(54, 54, 51));
        this.f27672e.setOnClickListener(new b(this, 1));
        this.f27672e.setContentDescription(id.M0(2131754878, null));
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public final y s() {
        y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(getContext(), this);
        this.E = yVar2;
        addView(yVar2, 0, ha.e(-2, -1, 5));
        return this.E;
    }

    public void setActionBarMenuOnItemClick(k kVar) {
        this.f27706u0 = kVar;
    }

    public void setActionModeColor(int i7) {
        e eVar = this.F;
        if (eVar != null) {
            s6 s6Var = t6.f28530a;
            eVar.setTag(2131296709, null);
            this.F.setBackgroundColor(i7);
        }
    }

    public void setActionModeOverrideColor(int i7) {
        this.f27713x = i7;
    }

    public void setActionModeTopColor(int i7) {
        View view = this.f27710w;
        if (view != null) {
            t6.q(view);
            this.f27710w.setBackgroundColor(i7);
        }
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        D(recyclerView, m6.f27834a7, m6.f28170s8);
    }

    public void setAddToContainer(boolean z9) {
        this.K = z9;
    }

    public void setAdditionalTextLeft(int i7) {
        this.f27679g1 = i7;
    }

    public void setAllowOverlayTitle(boolean z9) {
        this.f27665b0 = z9;
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.f27672e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setBackButtonDrawable(Drawable drawable) {
        int i7;
        float f10;
        if (this.f27672e == null) {
            r();
        }
        ImageView imageView = this.f27672e;
        if (drawable == null) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        imageView.setVisibility(i7);
        ImageView imageView2 = this.f27672e;
        this.h = drawable;
        imageView2.setImageDrawable(drawable);
        if (drawable instanceof y1) {
            y1 y1Var = (y1) drawable;
            if (x()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            y1Var.c(false, f10);
            y1Var.b(this.f27702s0);
            y1Var.a(this.f27699r0);
        } else if (drawable instanceof s4) {
            s4 s4Var = (s4) drawable;
            s4Var.f28499k = this.f27716y;
            s4Var.f28498j = this.f27699r0;
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.f27672e.setColorFilter(new PorterDuffColorFilter(this.f27699r0, PorterDuff.Mode.SRC_IN));
        }
        if (this.f27669c1) {
            this.f27672e.setColorFilter(new PorterDuffColorFilter(this.f27699r0, PorterDuff.Mode.SRC_IN));
        }
        k();
    }

    public void setBackButtonImage(int i7) {
        int i10;
        if (this.f27672e == null) {
            r();
        }
        ImageView imageView = this.f27672e;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        imageView.setVisibility(i10);
        this.f27672e.setImageResource(i7);
        this.f27672e.setColorFilter(new PorterDuffColorFilter(this.f27699r0, PorterDuff.Mode.SRC_IN));
        k();
    }

    @Override
    public void setBackgroundColor(int i7) {
        this.f27716y = i7;
        if (!this.L0) {
            super.setBackgroundColor(i7);
        }
        ImageView imageView = this.f27672e;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof s4) {
                ((s4) drawable).f28499k = i7;
            }
        }
    }

    public void setCastShadows(boolean z9) {
        if (this.f27686k0 != z9 && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f27686k0 = z9;
    }

    public void setCenterTitleAndGlass(boolean z9) {
        int i7;
        if (this.H0 == z9) {
            return;
        }
        this.H0 = z9;
        m5[] m5VarArr = this.f27690n;
        int length = m5VarArr.length;
        int i10 = 0;
        while (true) {
            i7 = 19;
            if (i10 >= length) {
                break;
            }
            m5 m5Var = m5VarArr[i10];
            if (m5Var != null) {
                if (z9) {
                    i7 = 17;
                }
                m5Var.setGravity(i7);
            }
            i10++;
        }
        m5 m5Var2 = this.f27698r;
        if (m5Var2 != null) {
            if (z9) {
                i7 = 17;
            }
            m5Var2.setGravity(i7);
        }
        requestLayout();
        invalidate();
    }

    public void setChatAvatarContainer(jn jnVar) {
        this.S0 = jnVar;
    }

    public void setClipContent(boolean z9) {
        this.L = z9;
    }

    public void setDrawBackButton(boolean z9) {
        this.B0 = z9;
        ImageView imageView = this.f27672e;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setDrawBlurBackground(st0 st0Var) {
        this.L0 = true;
        this.K0 = st0Var;
        st0Var.O.add(this);
        setBackground(null);
    }

    public void setDrawGlassTitle(boolean z9) {
        if (this.f27709v1 != z9) {
            this.f27709v1 = z9;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        ImageView imageView = this.f27672e;
        if (imageView != null) {
            imageView.setEnabled(z9);
        }
        y yVar = this.E;
        if (yVar != null) {
            yVar.setEnabled(z9);
        }
        e eVar = this.F;
        if (eVar != null) {
            eVar.setEnabled(z9);
        }
    }

    public void setExtraHeight(int i7) {
        this.O = i7;
        e eVar = this.F;
        if (eVar != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eVar.getLayoutParams();
            layoutParams.bottomMargin = this.O;
            this.F.setLayoutParams(layoutParams);
        }
    }

    public void setForceSkipTouches(boolean z9) {
        this.N = z9;
    }

    public void setForcedMenuMinWidth(int i7) {
        this.f27703s1 = true;
        if (this.f27697q1 != i7) {
            this.f27697q1 = i7;
            invalidate();
        }
    }

    public void setForcedMenuWidth(int i7) {
        this.f27700r1 = true;
        if (this.f27695p1 != i7) {
            this.f27695p1 = i7;
            invalidate();
        }
    }

    public void setGlassCenterAlpha(int i7) {
        if (this.f27712w1 != i7) {
            this.f27712w1 = i7;
            invalidate();
        }
        fh.g gVar = this.f27661a;
        if (gVar != null && gVar.f21081c != i7) {
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
        e eVar = this.F;
        if (eVar != null) {
            if (z9) {
                i7 = org.telegram.messenger.g0.f22561m;
            } else {
                i7 = 0;
            }
            eVar.setPadding(0, i7, 0, 0);
        }
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.f27671d1 = runnable;
    }

    public void setOverlayTitleAnimation(boolean z9) {
        this.f27711w0 = z9;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.f27673e0 = onClickListener;
        m5[] m5VarArr = this.f27690n;
        m5 m5Var = m5VarArr[0];
        if (m5Var != null) {
            m5Var.setRightDrawableOnClick(onClickListener);
        }
        m5 m5Var2 = m5VarArr[1];
        if (m5Var2 != null) {
            m5Var2.setRightDrawableOnClick(this.f27673e0);
        }
    }

    public void setSearchAvatarImageView(k9 k9Var) {
        k9 k9Var2 = this.f27675f;
        if (k9Var2 != k9Var) {
            if (k9Var2 != null) {
                removeView(k9Var2);
            }
            this.f27675f = k9Var;
            if (k9Var != null) {
                addView(k9Var);
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
        if (this.f27687k1 != f10) {
            this.f27687k1 = f10;
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
        if (this.f27688l0 == i7) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.f27688l0 = i7;
    }

    public void setSkipDrawChild(boolean z9) {
        if (this.f27685j1 != z9) {
            this.f27685j1 = z9;
            invalidate();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i7;
        if (charSequence != null && this.f27698r == null) {
            t();
        }
        if (this.f27698r != null) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            m5 m5Var = this.f27698r;
            if (!isEmpty && !this.f27691n0) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            m5Var.setVisibility(i7);
            this.f27698r.setAlpha(1.0f);
            if (!isEmpty) {
                this.f27698r.l(charSequence, false);
            }
            this.A0 = charSequence;
        }
    }

    public void setSubtitleColor(int i7) {
        if (this.f27698r == null) {
            t();
        }
        t6.q(this.f27698r);
        this.f27698r.setTextColor(i7);
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
        L(charSequence, null);
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.f27684j0 = runnable;
        this.f27680h0 = runnable;
    }

    public void setTitleColor(int i7) {
        m5[] m5VarArr = this.f27690n;
        if (m5VarArr[0] == null) {
            u(0);
        }
        this.f27708v0 = i7;
        t6.q(m5VarArr[0]);
        m5VarArr[0].setTextColor(i7);
        m5VarArr[0].setEmojiColor(i7);
        m5 m5Var = m5VarArr[1];
        if (m5Var != null) {
            t6.q(m5Var);
            m5VarArr[1].setTextColor(i7);
            m5VarArr[1].setEmojiColor(i7);
        }
    }

    public void setTitleRightMargin(int i7) {
        this.f27662a0 = i7;
    }

    public void setTitleScrollNonFitText(boolean z9) {
        this.f27690n[0].setScrollNonFitText(z9);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.L) {
            invalidate();
        }
    }

    public final void t() {
        if (this.f27698r != null) {
            return;
        }
        m5 m5Var = new m5(getContext());
        this.f27698r = m5Var;
        m5Var.setGravity(3);
        this.f27698r.setVisibility(8);
        t6.X(this.f27698r, m6.B8, this.J0);
        addView(this.f27698r, 0, ha.e(-2, -2, 51));
    }

    public final void u(int i7) {
        int i10;
        View[] viewArr = this.f27690n;
        if (viewArr[i7] != null) {
            return;
        }
        m5 m5Var = new m5(getContext());
        viewArr[i7] = m5Var;
        if (this.H0) {
            i10 = 17;
        } else {
            i10 = 19;
        }
        m5Var.setGravity(i10);
        int i11 = this.f27708v0;
        if (i11 != 0) {
            viewArr[i7].setTextColor(i11);
        } else {
            t6.X(viewArr[i7], m6.A8, this.J0);
        }
        m5 m5Var2 = viewArr[i7];
        m5Var2.setEmojiColor(m5Var2.getTextColor());
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
        h();
        fh.g gVar = this.f27661a;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.f27667c;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.f27664b;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        di.j jVar = this.f27715x1;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void w() {
        e eVar = this.F;
        if (eVar != null && this.J) {
            int childCount = eVar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = eVar.getChildAt(i7);
                if (childAt instanceof r0) {
                    ((r0) childAt).o();
                }
            }
            this.J = false;
            l();
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
            boolean z9 = this.f27691n0;
            m5[] m5VarArr = this.f27690n;
            if (!z9) {
                m5 m5Var = m5VarArr[0];
                if (m5Var != null) {
                    arrayList.add(ObjectAnimator.ofFloat(m5Var, property, 1.0f));
                }
                if (this.f27698r != null && !TextUtils.isEmpty(this.A0)) {
                    arrayList.add(ObjectAnimator.ofFloat(this.f27698r, property, 1.0f));
                }
            }
            y yVar = this.E;
            if (yVar != null) {
                arrayList.add(ObjectAnimator.ofFloat(yVar, property, 1.0f));
            }
            int i11 = this.f27716y;
            if (i11 != 0 && !this.P0) {
                if (i0.a.h(i11) < 0.699999988079071d) {
                    org.telegram.messenger.g0.p3((Activity) getContext(), false);
                } else {
                    org.telegram.messenger.g0.p3((Activity) getContext(), true);
                }
            } else {
                qs.e().k(qs.f25072r4, new Object[0]);
            }
            AnimatorSet animatorSet = this.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.P = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.f27674e1 != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(this, 0));
                this.P.playTogether(ofFloat);
            }
            this.P.setDuration(200L);
            this.P.addListener(new f(this, 0));
            this.P.start();
            if (!this.f27691n0) {
                m5 m5Var2 = m5VarArr[0];
                if (m5Var2 != null) {
                    m5Var2.setVisibility(0);
                }
                if (this.f27698r != null && !TextUtils.isEmpty(this.A0)) {
                    this.f27698r.setVisibility(0);
                }
            }
            y yVar2 = this.E;
            if (yVar2 != null) {
                yVar2.setVisibility(0);
            }
            ImageView imageView = this.f27672e;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof y1) {
                    ((y1) drawable).c(true, 0.0f);
                }
                this.f27672e.setBackgroundDrawable(m6.h0(this.f27694p0, 1, -1));
            }
        }
    }

    public final boolean x() {
        if (this.F != null && this.J) {
            return true;
        }
        return false;
    }

    public final boolean y(String str) {
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

    public boolean z() {
        return false;
    }

    public void setAdaptiveBackground(hm0 hm0Var) {
        int i7 = m6.f27834a7;
        int i10 = m6.f28170s8;
        this.A1 = i7;
        this.B1 = i10;
        this.f27720z1 = org.telegram.messenger.g0.Q1();
        h();
        li.j3 j3Var = new li.j3(29, this, hm0Var);
        hm0Var.L.add(j3Var);
        if (this.f27718y1) {
            j3Var.run();
            return;
        }
        this.f27718y1 = true;
        boolean canScrollVertically = hm0Var.canScrollVertically(-1);
        this.C1 = !canScrollVertically;
        this.D1 = !canScrollVertically ? 1.0f : 0.0f;
        h();
    }

    @Override
    public View getMenuHostView() {
        return this;
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
