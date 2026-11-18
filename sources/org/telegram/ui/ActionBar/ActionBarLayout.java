package org.telegram.ui.ActionBar;

import a8.r7;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import c8.l9;
import c8.ma;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.z10;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ee0;
import org.telegram.ui.me0;
import org.telegram.ui.ox;
import org.telegram.ui.t60;
import org.telegram.ui.wm;
import org.telegram.ui.zm;
public class ActionBarLayout extends FrameLayout implements s4, pg.b {
    public static Drawable f28674w1;
    public static Drawable f28675x1;
    public static Paint f28676y1;
    public boolean A0;
    public boolean B0;
    public long C0;
    public boolean D0;
    public k E;
    public int E0;
    public g3 F;
    public Runnable F0;
    public r7 G;
    public Runnable G0;
    public s H;
    public boolean H0;
    public h2 I;
    public View I0;
    public h2 J;
    public boolean J0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public t K0;
    public AnimatorSet L;
    public float L0;
    public final DecelerateInterpolator M;
    public long M0;
    public final OvershootInterpolator N;
    public String N0;
    public final AccelerateDecelerateInterpolator O;
    public int O0;
    public float P;
    public t60 P0;
    public boolean Q;
    public p4 Q0;
    public boolean R;
    public final Activity R0;
    public int S;
    public final boolean S0;
    public int T;
    public boolean T0;
    public boolean U;
    public boolean U0;
    public VelocityTracker V;
    public List V0;
    public boolean W;
    public List W0;
    public final Rect X0;
    public boolean Y0;
    public Runnable Z0;
    public boolean f28677a;
    public boolean f28678a0;
    public int f28679a1;
    public boolean f28680b;
    public boolean f28681b0;
    public boolean f28682b1;
    public Window f28683c;
    public final ArrayList f28684c0;
    public final Path f28685c1;
    public Runnable d;
    public final ArrayList f28686d0;
    public final float[] f28687d1;
    public Runnable f28688e;
    public final hi.d5 f28689e0;
    public boolean f28690e1;
    public boolean f28691f;
    public v4 f28692f0;
    public final int[] f28693f1;
    public v4 f28694g0;
    public boolean f28695g1;
    public boolean h;
    public wm f28696h0;
    public int f28697h1;
    public final ArrayList f28698i0;
    public final org.telegram.ui.Components.c6 f28699i1;
    public ArrayList f28700j0;
    public boolean f28701j1;
    public final ArrayList f28702k0;
    public boolean f28703k1;
    public int[] f28704l0;
    public boolean l1;
    public int[] m0;
    public float f28705m1;
    public boolean f28706n;
    public int[] f28707n0;
    public boolean n1;
    public int[] f28708o0;
    public AnimatorSet f28709o1;
    public int f28710p0;
    public ArrayList f28711p1;
    public zm f28712q0;
    public final o f28713q1;
    public ColorDrawable f28714r;
    public AnimatorSet f28715r0;
    public boolean f28716r1;
    public x f28717s;
    public final h2.f f28718s0;
    public int f28719s1;
    public float f28720t0;
    public r0.l1 f28721t1;
    public boolean f28722u0;
    public i0.b f28723u1;
    public m6 f28724v0;
    public i0.b f28725v1;
    public x f28726w;
    public boolean f28727w0;
    public x f28728x;
    public boolean f28729x0;
    public p3 f28730y;
    public int f28731y0;
    public boolean f28732z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.M = new DecelerateInterpolator(1.5f);
        this.N = new OvershootInterpolator(1.02f);
        this.O = new AccelerateDecelerateInterpolator();
        this.f28684c0 = new ArrayList();
        this.f28686d0 = new ArrayList();
        hi.d5 d5Var = new hi.d5();
        d5Var.f14380b = new SparseIntArray();
        d5Var.f14381c = new int[]{n6.f29658rb, n6.f29715ub, n6.f29734vb, n6.f29753wb, n6.Rc, n6.f29695tb};
        this.f28689e0 = d5Var;
        this.f28698i0 = new ArrayList();
        this.f28702k0 = new ArrayList();
        this.f28718s0 = new h2.f((int[]) null);
        this.X0 = new Rect();
        this.f28679a1 = -1;
        this.f28685c1 = new Path();
        this.f28687d1 = new float[8];
        this.f28693f1 = new int[2];
        this.f28699i1 = new org.telegram.ui.Components.c6(this, 280L, lr.h);
        this.f28711p1 = new ArrayList();
        this.f28713q1 = new o(this, 2);
        i0.b bVar = i0.b.f15888e;
        this.f28723u1 = bVar;
        this.f28725v1 = bVar;
        this.R0 = (Activity) context;
        this.S0 = z10;
        if (f28675x1 == null) {
            f28675x1 = getResources().getDrawable(2131231620);
            f28674w1 = getResources().getDrawable(2131231237).mutate();
            f28676y1 = new Paint();
        }
        p pVar = new p(this, 0);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(this, pVar);
    }

    public static void G(ArrayList arrayList, View view) {
        if (view instanceof pg.b) {
            arrayList.addAll(((pg.b) view).F());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                G(arrayList, viewGroup.getChildAt(i7));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!z10) {
            if (actionBarLayout.V0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            h2 h2Var = (h2) p5.c.h(1, actionBarLayout.V0);
            h2Var.prepareFragmentToSlide(true, false);
            h2Var.onPause();
            h2Var.onFragmentDestroy();
            h2Var.setParentLayout(null);
            List list = actionBarLayout.V0;
            list.remove(list.size() - 1);
            actionBarLayout.L("onSlideAnimationEnd");
            x xVar = actionBarLayout.f28717s;
            xVar.setAlpha(1.0f);
            x xVar2 = actionBarLayout.f28726w;
            actionBarLayout.f28717s = xVar2;
            actionBarLayout.f28726w = xVar;
            actionBarLayout.bringChildToFront(xVar2);
            View view = actionBarLayout.f28728x;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.V0.size() > 0) {
                h2 h2Var2 = (h2) p5.c.h(1, actionBarLayout.V0);
                actionBarLayout.E = h2Var2.actionBar;
                h2Var2.onResume();
                h2Var2.onBecomeFullyVisible();
                h2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.V0.size() >= 2) {
            ((h2) p5.c.h(1, actionBarLayout.V0)).prepareFragmentToSlide(true, false);
            h2 h2Var3 = (h2) p5.c.h(2, actionBarLayout.V0);
            h2Var3.prepareFragmentToSlide(false, false);
            h2Var3.onPause();
            View view2 = h2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                h2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(h2Var3.fragmentView);
            }
            k kVar = h2Var3.actionBar;
            if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(h2Var3.actionBar);
            }
            h2Var3.detachSheets();
        }
        actionBarLayout.f28726w.setVisibility(4);
        actionBarLayout.R = false;
        actionBarLayout.U = false;
        actionBarLayout.f28717s.setTranslationX(0.0f);
        actionBarLayout.f28726w.setTranslationX(0.0f);
        actionBarLayout.f28717s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f10, float f11) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                Rect rect = org.telegram.messenger.g0.Q;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (u10 = u((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return u10;
                    }
                }
            }
        }
        return null;
    }

    public static boolean z(int i7, int i10, int i11) {
        if (i7 != n6.f29448g5 && i7 != n6.Rc && i7 != n6.Ie) {
            if (i7 != n6.f29715ub && i7 != n6.f29734vb && i7 != n6.f29753wb && i7 != n6.Ee && i7 != n6.Fe && i7 != n6.Ge && i7 != n6.He) {
                return true;
            }
            if (i10 != 0 && i11 != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A() {
        return this.T0;
    }

    public final boolean B() {
        if (!this.f28678a0 && !this.U) {
            return false;
        }
        return true;
    }

    public final int C() {
        int i7;
        View rootView = getRootView();
        Rect rect = this.X0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i7 = org.telegram.messenger.g0.f24112m;
        } else {
            i7 = 0;
        }
        return Math.max(0, ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        if (this.f28703k1 && this.l1) {
            return true;
        }
        return false;
    }

    public final void E() {
        for (int i7 = 0; i7 < this.V0.size(); i7++) {
            if (((h2) this.V0.get(i7)).getFragmentView() != null) {
                try {
                    ((h2) this.V0.get(i7)).onThemeColorsChanged();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    @Override
    public final List F() {
        h2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof pg.b) {
                arrayList.addAll(((pg.b) lastFragment).F());
            }
            G(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public final void H(boolean z10) {
        K();
        N();
        Runnable runnable = this.d;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            if (z10) {
                animatorSet.cancel();
            }
            this.L = null;
        }
        t tVar = this.K0;
        if (tVar != null) {
            org.telegram.messenger.g0.r(tVar);
            this.K0 = null;
        }
        setAlpha(1.0f);
        this.f28717s.setAlpha(1.0f);
        this.f28717s.setScaleX(1.0f);
        this.f28717s.setScaleY(1.0f);
        this.f28726w.setAlpha(1.0f);
        this.f28726w.setScaleX(1.0f);
        this.f28726w.setScaleY(1.0f);
    }

    public final void I() {
        a5 a5Var;
        k kVar;
        if (!this.f28681b0 && !this.R && !i() && !this.V0.isEmpty()) {
            z10 z10Var = z10.f42710f0;
            if (z10Var != null && z10Var.f42727y) {
                z10Var.f(false);
                return;
            }
            if (!i0() && (kVar = this.E) != null && !kVar.y()) {
                k kVar2 = this.E;
                if (kVar2.f29086o0) {
                    kVar2.o(true);
                    return;
                }
            }
            h2 h2Var = (h2) p5.c.h(1, this.V0);
            if (i0() || (a5Var = h2Var.simpleActionBar) == null || !a5Var.A()) {
                s sVar = this.H;
                if ((sVar == null || sVar.onBackPressed(true)) && ((h2) p5.c.h(1, this.V0)).onBackPressed(true) && !this.V0.isEmpty()) {
                    l(true, false);
                }
            }
        }
    }

    public final boolean J(float r6, float r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.J(float, float):boolean");
    }

    public final void K() {
        if (this.f28678a0 && this.F0 != null) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                this.L = null;
                animatorSet.cancel();
            }
            this.f28678a0 = false;
            this.f28681b0 = false;
            this.C0 = 0L;
            this.I = null;
            this.J = null;
            Runnable runnable = this.F0;
            this.F0 = null;
            if (runnable != null) {
                runnable.run();
            }
            h();
            h();
        }
    }

    public final void L(String str) {
        Runnable runnable = this.Z0;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList arrayList = ec.D().f23680f;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.b6) arrayList.get(i7)).f33568z0 = 0;
        }
        g(str);
    }

    public final void M() {
        for (h2 h2Var : this.V0) {
            h2Var.onLowMemory();
        }
    }

    public final void N() {
        Runnable runnable;
        if (this.f28678a0 && (runnable = this.G0) != null) {
            this.f28678a0 = false;
            this.f28681b0 = false;
            this.C0 = 0L;
            this.I = null;
            this.J = null;
            this.G0 = null;
            runnable.run();
            h();
        }
    }

    public final void O() {
        if (!this.V0.isEmpty()) {
            ((h2) p5.c.h(1, this.V0)).onPause();
        }
        s sVar = this.H;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void P() {
        if (!this.V0.isEmpty()) {
            ((h2) p5.c.h(1, this.V0)).onResume();
        }
        s sVar = this.H;
        if (sVar != null) {
            sVar.onResume();
        }
    }

    public final void Q(Canvas canvas, ViewGroup viewGroup) {
        if (this.F != null && getHeight() < viewGroup.getHeight()) {
            canvas.save();
            canvas.translate(this.F.getX() + getX(), this.F.getY() + getY());
            this.F.draw(canvas);
            canvas.restore();
        }
    }

    public final void R() {
        this.Q = false;
        this.R = true;
        this.f28726w.setVisibility(0);
        this.W = false;
        h2 h2Var = (h2) p5.c.h(2, this.V0);
        View view = h2Var.fragmentView;
        if (view == null && (view = h2Var.performCreateView(this.R0)) != null && h2Var.isSupportEdgeToEdge() && h2Var.drawEdgeNavigationBar()) {
            n nVar = new n(h2Var);
            WeakHashMap weakHashMap = r0.i0.f56244a;
            r0.a0.i(view, nVar);
            this.f28726w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            h2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.f28726w.addView(view);
        this.f28726w.setShouldHandleBottomInsets(h2Var.getEdgeToEdgeSupportMode());
        this.f28726w.setDrawNavigationBar(h2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = h2Var.actionBar;
        if (kVar != null && kVar.L) {
            org.telegram.messenger.g0.E2(kVar);
            if (this.J0) {
                h2Var.actionBar.setOccupyStatusBar(false);
            }
            this.f28726w.addView(h2Var.actionBar);
        }
        h2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        h2Var.attachSheets(this.f28726w);
        if (!h2Var.hasOwnBackground && view.getBackground() == null) {
            u6.h(n6.f29394d6, view, null);
        }
        h2Var.onResume();
        if (this.f28715r0 != null) {
            this.f28700j0 = h2Var.getThemeDescriptions();
        }
        this.f28717s.setLayerType(2, null);
        ((h2) p5.c.h(1, this.V0)).prepareFragmentToSlide(true, true);
        h2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean S(h2 h2Var) {
        return U(new q4(h2Var));
    }

    public final boolean T(h2 h2Var, boolean z10) {
        q4 q4Var = new q4(h2Var);
        q4Var.f29902b = z10;
        return U(q4Var);
    }

    public final boolean U(org.telegram.ui.ActionBar.q4 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.U(org.telegram.ui.ActionBar.q4):boolean");
    }

    public final boolean V(h2 h2Var, boolean z10, boolean z11) {
        q4 q4Var = new q4(h2Var);
        q4Var.f29902b = z10;
        q4Var.f29903c = z11;
        q4Var.d = true;
        q4Var.f29904e = false;
        return U(q4Var);
    }

    public final void W(h2 h2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (h2Var == null) {
            return;
        }
        h2Var.onBecomeFullyHidden();
        h2Var.onPause();
        if (z10) {
            h2Var.onFragmentDestroy();
            h2Var.setParentLayout(null);
            this.V0.remove(h2Var);
            L("presentFragmentInternalRemoveOld");
        } else {
            View view = h2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                h2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(h2Var.fragmentView);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    try {
                        viewGroup2.removeView(h2Var.fragmentView);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
            k kVar = h2Var.actionBar;
            if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(h2Var.actionBar);
            }
            h2Var.detachSheets();
        }
        this.f28726w.setVisibility(4);
    }

    public final void X(boolean z10, boolean z11) {
        if (!this.f28678a0 && !this.R) {
            int size = this.V0.size();
            if (!z10) {
                size--;
            }
            if (this.h) {
                size--;
            }
            for (int i7 = 0; i7 < size; i7++) {
                ((h2) this.V0.get(i7)).clearViews();
                ((h2) this.V0.get(i7)).setParentLayout(this);
            }
            p4 p4Var = this.Q0;
            if (p4Var != null) {
                p4Var.b(this, z10);
            }
            if (z11) {
                f0();
                return;
            }
            return;
        }
        this.f28732z0 = true;
        this.A0 = z10;
        this.B0 = z11;
    }

    public final void Y() {
        X(true, true);
    }

    public final void Z() {
        this.f28717s.removeAllViews();
        this.f28726w.removeAllViews();
        this.E = null;
        this.I = null;
        this.J = null;
    }

    public final void a0() {
        while (this.V0.size() > 0) {
            e0((h2) this.V0.get(0), false);
        }
        View view = this.I0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        r0.l1 l1Var = this.f28721t1;
        if (l1Var != null) {
            o(view, l1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f28686d0.add(iArr);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = ((w6) arrayList.get(i7)).c();
            }
        }
    }

    public final void b0(int i7) {
        if (i7 >= 0 && i7 < getFragmentStack().size()) {
            d0((h2) getFragmentStack().get(i7), false);
        }
    }

    public final boolean c(int i7, h2 h2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        p4 p4Var = this.Q0;
        if ((p4Var != null && !p4Var.c(this, h2Var)) || !h2Var.onFragmentCreate() || this.V0.contains(h2Var)) {
            return false;
        }
        h2Var.setParentLayout(this);
        Activity activity = this.R0;
        if (i7 != -1 && i7 != -2) {
            if (i7 == -3) {
                View view = h2Var.fragmentView;
                if (view == null) {
                    view = h2Var.performCreateView(activity);
                    if (view != null && h2Var.isSupportEdgeToEdge() && h2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(h2Var);
                        WeakHashMap weakHashMap = r0.i0.f56244a;
                        r0.a0.i(view, nVar);
                        this.f28717s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        h2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!h2Var.hasOwnBackground && view.getBackground() == null) {
                    u6.h(n6.f29394d6, view, null);
                }
                x xVar = this.f28717s;
                xVar.addView(view, Utilities.j(0, xVar.getChildCount(), 0), ma.c(-1.0f, -1));
                this.f28717s.setShouldHandleBottomInsets(h2Var.getEdgeToEdgeSupportMode());
                this.f28717s.setDrawNavigationBar(h2Var.drawEdgeNavigationBar());
                k kVar = h2Var.actionBar;
                if (kVar != null && kVar.L) {
                    if (this.J0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) h2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(h2Var.actionBar);
                    }
                    this.f28717s.addView(h2Var.actionBar);
                }
                h2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                h2Var.attachSheets(this.f28717s);
                i7 = 0;
            }
            this.V0.add(i7, h2Var);
            L("addFragmentToStack");
        } else {
            if (!this.V0.isEmpty()) {
                h2 h2Var2 = (h2) p5.c.h(1, this.V0);
                h2Var2.onPause();
                k kVar2 = h2Var2.actionBar;
                if (kVar2 != null && kVar2.L && (viewGroup2 = (ViewGroup) kVar2.getParent()) != null) {
                    viewGroup2.removeView(h2Var2.actionBar);
                }
                View view2 = h2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    h2Var2.onRemoveFromParent();
                    viewGroup.removeView(h2Var2.fragmentView);
                }
                h2Var2.detachSheets();
            }
            this.V0.add(h2Var);
            if (i7 != -2) {
                View view3 = h2Var.fragmentView;
                if (view3 == null) {
                    view3 = h2Var.performCreateView(activity);
                    if (view3 != null && h2Var.isSupportEdgeToEdge() && h2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(h2Var);
                        WeakHashMap weakHashMap2 = r0.i0.f56244a;
                        r0.a0.i(view3, nVar2);
                        this.f28717s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        h2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!h2Var.hasOwnBackground && view3.getBackground() == null) {
                    u6.h(n6.f29394d6, view3, null);
                }
                this.f28717s.addView(view3, ma.c(-1.0f, -1));
                this.f28717s.setShouldHandleBottomInsets(h2Var.getEdgeToEdgeSupportMode());
                this.f28717s.setDrawNavigationBar(h2Var.drawEdgeNavigationBar());
                k kVar3 = h2Var.actionBar;
                if (kVar3 != null && kVar3.L) {
                    if (this.J0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) h2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(h2Var.actionBar);
                    }
                    this.f28717s.addView(h2Var.actionBar);
                }
                h2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                h2Var.attachSheets(this.f28717s);
                h2Var.onResume();
                h2Var.onTransitionAnimationEnd(false, true);
                h2Var.onTransitionAnimationEnd(true, true);
                h2Var.onBecomeFullyVisible();
            }
            L("addFragmentToStack " + i7);
        }
        if (!this.H0) {
            setVisibility(0);
            View view4 = this.I0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0(h2 h2Var) {
        d0(h2Var, false);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f28698i0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f28684c0.add(iArr);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                w6 w6Var = (w6) arrayList.get(i7);
                iArr[i7] = w6Var.c();
                v6 v6Var = w6Var.f30157g;
                w6Var.f30157g = null;
                if (v6Var != null) {
                    ArrayList arrayList2 = this.f28702k0;
                    if (!arrayList2.contains(v6Var)) {
                        arrayList2.add(v6Var);
                    }
                }
            }
        }
    }

    public final void d0(h2 h2Var, boolean z10) {
        boolean z11 = true;
        if ((this.V0.size() > 0 && p5.c.h(1, this.V0) == h2Var) || (this.V0.size() > 1 && p5.c.h(2, this.V0) == h2Var)) {
            N();
            K();
        }
        g("removeFragmentFromStack " + z10);
        if (this.H0 && this.V0.size() == 1 && org.telegram.messenger.g0.Q1()) {
            l(true, false);
            return;
        }
        if (this.Q0 != null && this.V0.size() == 1 && org.telegram.messenger.g0.Q1()) {
            this.Q0.k(this);
        }
        if (!h2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) {
            z11 = false;
        }
        e0(h2Var, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.F != null && w(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.F.getMeasuredHeight() + this.f28723u1.d), getWidth(), getHeight(), this.F.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.f28682b1 = true;
        if (this.T0) {
            canvas2.save();
            float L = org.telegram.messenger.g0.L(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.f28685c1;
            path.rewind();
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.T0) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            p4 p4Var = this.Q0;
            if ((p4Var != null && p4Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
                return true;
            }
            return false;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r22, android.view.View r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final void e(boolean z10) {
        h2 h2Var;
        int i7;
        Animator customSlideTransition;
        int i10;
        int i11;
        if (!this.V0.isEmpty()) {
            h2Var = (h2) p5.c.h(1, this.V0);
        } else {
            h2Var = null;
        }
        if (h2Var == null) {
            return;
        }
        float x10 = this.f28717s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = h2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x10 = Math.abs(this.f28717s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f28717s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 380;
            } else {
                i10 = 50;
            }
            int max = Math.max(measuredWidth, i10);
            if (!shouldOverrideSlideTransition) {
                x xVar = this.f28717s;
                int measuredWidth2 = xVar.getMeasuredWidth();
                if (this.f28703k1) {
                    i11 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    i11 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xVar, property, measuredWidth2 + i11);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f28717s.getMeasuredWidth()).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(lr.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f28717s.getMeasuredWidth()) * x10);
            if (D()) {
                i7 = 320;
            } else {
                i7 = 120;
            }
            int max2 = Math.max(measuredWidth3, i7);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f28717s, property, 0.0f);
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(lr.h);
                }
            }
        }
        Animator customSlideTransition2 = h2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        h2 h2Var2 = (h2) p5.c.h(2, this.V0);
        if (h2Var2 != null && (customSlideTransition = h2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f28709o1 = animatorSet;
        animatorSet.start();
        this.U = true;
    }

    public final void e0(h2 h2Var, boolean z10) {
        if (!this.V0.contains(h2Var)) {
            return;
        }
        if (z10 && p5.c.h(1, this.V0) == h2Var) {
            h2Var.finishFragment();
        } else if (p5.c.h(1, this.V0) == h2Var && this.V0.size() > 1) {
            h2Var.finishFragment(false);
        } else {
            h2Var.onPause();
            h2Var.onFragmentDestroy();
            h2Var.setParentLayout(null);
            this.V0.remove(h2Var);
            L("removeFragmentFromStackInternal " + z10);
        }
    }

    public final void f(org.telegram.ui.ActionBar.r4 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.r4, java.lang.Runnable):void");
    }

    public final void f0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.V0.isEmpty()) {
            int size = this.V0.size() - 1;
            if (!this.V0.isEmpty()) {
                if (this.V0.isEmpty() || this.V0.size() - 1 != size || ((h2) this.V0.get(size)).fragmentView == null) {
                    for (int i7 = 0; i7 < size; i7++) {
                        h2 h2Var = (h2) this.V0.get(i7);
                        k kVar = h2Var.actionBar;
                        if (kVar != null && kVar.L && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                            viewGroup2.removeView(h2Var.actionBar);
                        }
                        View view = h2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            h2Var.onPause();
                            h2Var.onRemoveFromParent();
                            viewGroup.removeView(h2Var.fragmentView);
                        }
                    }
                    h2 h2Var2 = (h2) this.V0.get(size);
                    h2Var2.setParentLayout(this);
                    View view2 = h2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = h2Var2.performCreateView(this.R0);
                        if (view2 != null && h2Var2.isSupportEdgeToEdge() && h2Var2.drawEdgeNavigationBar()) {
                            n nVar = new n(h2Var2);
                            WeakHashMap weakHashMap = r0.i0.f56244a;
                            r0.a0.i(view2, nVar);
                            this.f28717s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            h2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f28717s.addView(view2, ma.c(-1.0f, -1));
                    this.f28717s.setShouldHandleBottomInsets(h2Var2.getEdgeToEdgeSupportMode());
                    this.f28717s.setDrawNavigationBar(h2Var2.drawEdgeNavigationBar());
                    k kVar2 = h2Var2.actionBar;
                    if (kVar2 != null && kVar2.L) {
                        if (this.J0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        org.telegram.messenger.g0.E2(h2Var2.actionBar);
                        this.f28717s.addView(h2Var2.actionBar);
                    }
                    h2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                    h2Var2.attachSheets(this.f28717s);
                    h2Var2.onResume();
                    h2Var2.onBecomeFullyVisible();
                    this.E = h2Var2.actionBar;
                    if (!h2Var2.hasOwnBackground && view2.getBackground() == null) {
                        u6.h(n6.f29394d6, view2, null);
                    }
                }
            }
        }
    }

    public final void g(String str) {
        boolean z10 = org.telegram.messenger.s2.f26721a;
        ArrayList arrayList = this.f28711p1;
        StringBuilder n10 = p5.c.n(str, " ");
        n10.append(this.V0.size());
        arrayList.add(0, n10.toString());
        if (this.f28711p1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < 10; i7++) {
                arrayList2.add((String) this.f28711p1.get(i7));
            }
            this.f28711p1 = arrayList2;
        }
        o oVar = this.f28713q1;
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.h3(oVar, 500L);
    }

    public final void g0(zm zmVar) {
        int x02;
        try {
            int i7 = n6.f29431f5;
            this.f28704l0 = new int[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                int[] iArr = this.f28704l0;
                if (zmVar != null) {
                    x02 = zmVar.k(i10);
                } else {
                    x02 = n6.x0(null, i10, false);
                }
                iArr[i10] = x02;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            this.f28704l0 = null;
        }
    }

    @Override
    public h2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (h2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public x2 getBottomSheet() {
        return null;
    }

    public g3 getBottomSheetTabs() {
        return this.F;
    }

    public float getCurrentPreviewFragmentAlpha() {
        x xVar;
        if (!this.h && !this.f28681b0 && !this.f28706n) {
            return 0.0f;
        }
        h2 h2Var = this.J;
        if (h2Var != null && h2Var.inPreviewMode) {
            xVar = this.f28726w;
        } else {
            xVar = this.f28717s;
        }
        return xVar.getAlpha();
    }

    public p3 getDrawerLayoutContainer() {
        return this.f28730y;
    }

    @Override
    public List<h2> getFragmentStack() {
        return this.V0;
    }

    public float getInnerTranslationX() {
        return this.P;
    }

    @Override
    public h2 getLastFragment() {
        if (this.V0.isEmpty()) {
            return null;
        }
        return (h2) p5.c.h(1, this.V0);
    }

    public h2 getLastFragmentIncludeMainTabs() {
        h2 lastFragment = getLastFragment();
        if (lastFragment instanceof me0) {
            return ((me0) lastFragment).c0();
        }
        return lastFragment;
    }

    @Override
    public v4 getMessageDrawableOutMediaStart() {
        return this.f28694g0;
    }

    @Override
    public v4 getMessageDrawableOutStart() {
        return this.f28692f0;
    }

    @Override
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
    }

    @Override
    public List<h9> getPulledDialogs() {
        return this.W0;
    }

    @Override
    public h2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                h2 h2Var = (h2) getFragmentStack().get(size);
                if (h2Var != null && h2Var.getContext() != null && !h2Var.isFinishing() && !h2Var.isRemovingFromStack()) {
                    return h2Var;
                }
            }
            return null;
        }
        return null;
    }

    public ox getSheetFragment() {
        return x();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.f28720t0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f28683c;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public final void h() {
        if (this.f28732z0) {
            X(this.A0, this.B0);
            this.f28732z0 = false;
        } else if (this.f28722u0) {
            r4 r4Var = new r4(this.f28724v0, this.f28731y0, this.f28729x0, true);
            boolean z10 = this.f28727w0;
            if (!z10) {
                r4Var.f29959g = z10;
                r4Var.f29958f = z10;
            }
            f(r4Var, null);
            this.f28724v0 = null;
            this.f28722u0 = false;
        }
    }

    public final void h0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.L0 = 0.0f;
            this.M0 = System.nanoTime() / 1000000;
        }
        t tVar = new t(this, z11, z12, z10);
        this.K0 = tVar;
        org.telegram.messenger.g0.g3(tVar);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        if (this.f28681b0) {
            return false;
        }
        if (this.f28678a0 && (this.C0 < System.currentTimeMillis() - 1500 || this.h)) {
            H(true);
        }
        return this.f28678a0;
    }

    public final boolean i0() {
        h2 h2Var;
        if (!this.V0.isEmpty()) {
            h2Var = (h2) p5.c.h(1, this.V0);
        } else {
            h2Var = null;
        }
        if (h2Var != null && h2Var.getLastStoryViewer() != null && h2Var.getLastStoryViewer().y()) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.f28710p0 = 0;
        this.f28712q0 = null;
        this.f28704l0 = null;
    }

    public final void k() {
        l(false, false);
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        h2 h2Var;
        boolean z13;
        boolean z14;
        h2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            p4 p4Var = this.Q0;
            if ((p4Var == null || p4Var.k(this)) && !i() && !this.V0.isEmpty()) {
                Activity activity = this.R0;
                if (activity.getCurrentFocus() != null) {
                    org.telegram.messenger.g0.v1(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.f28681b0 || (z10 && mp.g1().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h2 h2Var2 = (h2) p5.c.h(1, this.V0);
                AnimatorSet animatorSet = null;
                if (this.V0.size() > 1) {
                    h2Var = (h2) p5.c.h(2, this.V0);
                } else {
                    h2Var = null;
                }
                if (h2Var != null) {
                    if (n6.x0(null, n6.f29674s8, false) != -1 && (!h2Var.hasForceLightStatusBar() || n6.D0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    org.telegram.messenger.g0.o3(activity, z13);
                    x xVar = this.f28717s;
                    this.f28717s = this.f28726w;
                    this.f28726w = xVar;
                    h2Var.setParentLayout(this);
                    View view = h2Var.fragmentView;
                    if (view == null && (view = h2Var.performCreateView(activity)) != null && h2Var.isSupportEdgeToEdge() && h2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(h2Var);
                        WeakHashMap weakHashMap = r0.i0.f56244a;
                        r0.a0.i(view, nVar);
                        this.f28717s.invalidate();
                    }
                    if (!this.h) {
                        this.f28717s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            h2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        }
                        this.f28717s.addView(view);
                        this.f28717s.setShouldHandleBottomInsets(h2Var.getEdgeToEdgeSupportMode());
                        this.f28717s.setDrawNavigationBar(h2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        k kVar = h2Var.actionBar;
                        if (kVar != null && kVar.L) {
                            if (this.J0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            org.telegram.messenger.g0.E2(h2Var.actionBar);
                            this.f28717s.addView(h2Var.actionBar);
                        }
                        h2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                        h2Var.attachSheets(this.f28717s);
                    }
                    this.I = h2Var;
                    this.J = h2Var2;
                    h2Var.onTransitionAnimationStart(true, true);
                    h2Var2.onTransitionAnimationStart(false, true);
                    h2Var.onResume();
                    if (this.f28715r0 != null) {
                        this.f28700j0 = h2Var.getThemeDescriptions();
                    }
                    this.E = h2Var.actionBar;
                    if (!h2Var.hasOwnBackground && view.getBackground() == null) {
                        u6.h(n6.f29394d6, view, null);
                    }
                    if (z12) {
                        this.C0 = System.currentTimeMillis();
                        this.f28678a0 = true;
                        h2Var2.setRemovingFromStack(true);
                        this.F0 = new kg.i0(this, h2Var2, h2Var, 22);
                        if (!this.h && !this.f28681b0) {
                            animatorSet = h2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f28717s.f30165b || this.f28726w.f30165b)) {
                                j6.o oVar = new j6.o(this, 17);
                                this.d = oVar;
                                org.telegram.messenger.g0.h3(oVar, 200L);
                            } else {
                                if (!z15 && !this.f28681b0) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                h0(false, true, z14);
                            }
                        } else {
                            this.L = animatorSet;
                            gc gcVar = gc.f35453w;
                            if (gcVar != null && gcVar.f35463l) {
                                gcVar.b();
                            }
                        }
                        L("closeLastFragment");
                    } else {
                        m(h2Var2);
                        h2Var2.onTransitionAnimationEnd(false, true);
                        h2Var.onTransitionAnimationEnd(true, true);
                        h2Var.onBecomeFullyVisible();
                    }
                } else if (this.H0 && !z11) {
                    this.C0 = System.currentTimeMillis();
                    this.f28678a0 = true;
                    this.F0 = new a2(this, h2Var2);
                    ArrayList arrayList = new ArrayList();
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.9f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.9f));
                    View view2 = this.I0;
                    if (view2 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view2, property, 1.0f, 0.0f));
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.L = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.L.setInterpolator(this.O);
                    this.L.setDuration(200L);
                    this.L.addListener(new r(this, 0));
                    this.L.start();
                } else {
                    e0(h2Var2, false);
                    setVisibility(8);
                    View view3 = this.I0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                h2Var2.onFragmentClosed();
            }
        }
    }

    public final void m(h2 h2Var) {
        h2Var.finishing = true;
        h2Var.onPause();
        h2Var.onFragmentDestroy();
        h2Var.setParentLayout(null);
        this.V0.remove(h2Var);
        this.f28726w.setVisibility(4);
        this.f28726w.setTranslationY(0.0f);
        bringChildToFront(this.f28717s);
        x xVar = this.f28728x;
        if (xVar != null) {
            bringChildToFront(xVar);
        }
        L("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((h2) p5.c.h(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void o(View view, r0.l1 l1Var) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view2;
        int i16;
        r0.a1 w0Var;
        boolean z11 = this.T0;
        if (z11) {
            if ((view instanceof x) && ((x) view).f30174y) {
                int i17 = l1Var.f56258a.f(8).d;
                if (getParent() instanceof View) {
                    view2 = (View) getParent();
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    i16 = Math.max(0, view2.getHeight() - getBottom());
                } else {
                    i16 = 0;
                }
                int max = Math.max(0, i17 - i16);
                r0.l1 l1Var2 = r0.l1.f56257b;
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 34) {
                    w0Var = new r0.z0(l1Var2);
                } else if (i18 >= 30) {
                    w0Var = new r0.y0(l1Var2);
                } else if (i18 >= 29) {
                    w0Var = new r0.x0(l1Var2);
                } else {
                    w0Var = new r0.w0(l1Var2);
                }
                w0Var.c(8, i0.b.b(0, 0, 0, max));
                r0.i0.b(view, w0Var.b());
                return;
            }
            r0.i0.b(view, r0.l1.f56257b);
            return;
        }
        boolean z12 = this.U0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.b bVar = this.f28723u1;
        i0.b bVar2 = this.f28725v1;
        if (view instanceof g3) {
            if (z12) {
                i14 = 0;
            } else {
                i14 = bVar.f15889a;
            }
            if (z10) {
                i15 = 0;
            } else {
                i15 = bVar.f15891c;
            }
            org.telegram.messenger.g0.z3(view, i14, 0, i15, bVar.d);
        } else if (view instanceof x) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            x xVar = (x) view;
            int w10 = w(false);
            if (w10 > 0) {
                i7 = bVar.d + w10;
            } else {
                i7 = 0;
            }
            q3 q3Var = xVar.f30173x;
            if (q3Var != q3.f29900c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i10 = bVar2.f15889a;
            } else {
                i10 = 0;
            }
            if (!z13 && !z10) {
                i11 = bVar2.f15891c;
            } else {
                i11 = 0;
            }
            if (z13 && !z12) {
                i12 = 0;
            } else {
                i12 = bVar2.f15889a;
            }
            if (z13 && !z10) {
                i13 = 0;
            } else {
                i13 = bVar2.f15891c;
            }
            if (q3Var == q3.f29898a) {
                i7 = Math.max(i7, bVar2.d);
                r0.i0.b(view, r0.l1.f56257b);
            } else {
                r0.i0.b(view, l1Var.f56258a.m(i12, 0, i13, i7));
            }
            view.setPadding(i10, 0, i11, i7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28677a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.V0.isEmpty()) {
            int size = this.V0.size();
            for (int i7 = 0; i7 < size; i7++) {
                h2 h2Var = (h2) this.V0.get(i7);
                h2Var.onConfigurationChanged(configuration);
                Dialog dialog = h2Var.visibleDialog;
                if (dialog instanceof x2) {
                    ((x2) dialog).c0(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28677a = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.U && !i() && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        k kVar;
        z zVar;
        if (i7 == 82 && !i() && !this.R && (kVar = this.E) != null && !kVar.y() && (zVar = kVar.F) != null) {
            int childCount = zVar.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.getVisibility() != 0) {
                        continue;
                    } else if (r0Var.t()) {
                        r0Var.V(null, null);
                        break;
                    } else if (r0Var.T) {
                        zVar.o(((Integer) r0Var.getTag()).intValue());
                        break;
                    }
                }
                i10++;
            }
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        h2 h2Var;
        boolean z10 = true;
        if (!this.V0.isEmpty()) {
            h2Var = (h2) p5.c.h(1, this.V0);
        } else {
            h2Var = null;
        }
        if (h2Var != null && !h2Var.isSupportEdgeToEdge() && i0()) {
            int C = C();
            h2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) + C, 1073741824));
            return;
        }
        p4 p4Var = this.Q0;
        if (p4Var != null) {
            int[] iArr = this.f28693f1;
            iArr[0] = i7;
            iArr[1] = i10;
            p4Var.f(iArr);
            i7 = iArr[0];
            i10 = iArr[1];
        }
        if (C() <= org.telegram.messenger.g0.L(20.0f)) {
            z10 = false;
        }
        this.f28690e1 = z10;
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean z10 = false;
        if (!i() && !this.D0 && !this.U && !this.f28703k1) {
            if (this.V0.size() > 1 && ((sVar = this.H) == null || sVar.getLastSheet() == null || !this.H.getLastSheet().s())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((h2) p5.c.h(1, this.V0)).isSwipeBackEnabled(motionEvent)) {
                        this.Q = false;
                        this.R = false;
                        x xVar = this.f28717s;
                        if (xVar != null) {
                            xVar.setLayerType(0, null);
                            return false;
                        }
                    } else {
                        this.E0 = motionEvent.getPointerId(0);
                        this.Q = true;
                        this.S = (int) motionEvent.getX();
                        this.T = (int) motionEvent.getY();
                        VelocityTracker velocityTracker = this.V;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.E0) {
                    if (this.V == null) {
                        this.V = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.S));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.T);
                    this.V.addMovement(motionEvent);
                    if (!this.f28678a0 && !this.h && this.Q && !this.R && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs) {
                        if (((h2) p5.c.h(1, this.V0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.S = (int) motionEvent.getX();
                            R();
                        } else {
                            this.Q = false;
                        }
                    } else if (this.R) {
                        if (!this.W) {
                            Activity activity = this.R0;
                            if (activity.getCurrentFocus() != null) {
                                org.telegram.messenger.g0.v1(activity.getCurrentFocus());
                            }
                            ((h2) p5.c.h(1, this.V0)).onBeginSlide();
                            this.W = true;
                        }
                        if (D()) {
                            float f10 = max;
                            this.f28717s.setTranslationX((f10 / getWidth()) * org.telegram.messenger.g0.L(56.0f) * 5);
                            setInnerTranslationX((f10 / getWidth()) * org.telegram.messenger.g0.L(56.0f) * 5);
                        } else {
                            float f11 = max;
                            this.f28717s.setTranslationX(f11);
                            setInnerTranslationX(f11);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.E0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.V == null) {
                        this.V = VelocityTracker.obtain();
                    }
                    this.V.addMovement(motionEvent);
                    this.V.computeCurrentVelocity(1000);
                    h2 h2Var = (h2) p5.c.h(1, this.V0);
                    if (!this.h && !this.f28681b0 && !this.R && h2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.V.getXVelocity();
                        float yVelocity = this.V.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && h2Var.canBeginSlide()) {
                            this.S = (int) motionEvent.getX();
                            R();
                            if (!this.W) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    org.telegram.messenger.g0.v1(((Activity) getContext()).getCurrentFocus());
                                }
                                this.W = true;
                            }
                        }
                    }
                    if (this.R) {
                        float x10 = this.f28717s.getX();
                        float xVelocity2 = this.V.getXVelocity();
                        float yVelocity2 = this.V.getYVelocity();
                        if (!D() ? x10 < this.f28717s.getMeasuredWidth() / 3.0f : !(x10 >= org.telegram.messenger.g0.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.Q = false;
                        this.R = false;
                        x xVar2 = this.f28717s;
                        if (xVar2 != null) {
                            xVar2.setLayerType(0, null);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.V;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.V = null;
                    }
                } else if (motionEvent == null) {
                    this.Q = false;
                    this.R = false;
                    x xVar3 = this.f28717s;
                    if (xVar3 != null) {
                        xVar3.setLayerType(0, null);
                    }
                    VelocityTracker velocityTracker3 = this.V;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.V = null;
                    }
                }
            }
            return this.R;
        }
        return false;
    }

    public final void p(Canvas canvas, int i7, int i10) {
        if (f28674w1 != null && bz.D1) {
            int i11 = i7 / 2;
            if (f28674w1.getAlpha() != i11) {
                f28674w1.setAlpha(i11);
            }
            f28674w1.setBounds(0, i10, getMeasuredWidth(), f28674w1.getIntrinsicHeight() + i10);
            f28674w1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i7) {
        p(canvas, 255, i7);
    }

    public final void r() {
        boolean z10 = true;
        this.f28706n = true;
        this.h = false;
        h2 h2Var = (h2) p5.c.h(1, this.V0);
        h2Var.fragmentView.setOutlineProvider(null);
        h2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        h2Var.fragmentView.setLayoutParams(layoutParams);
        W((h2) p5.c.h(2, this.V0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(h2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(h2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new lr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ah.l(15, this, h2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f28717s.setShouldHandleBottomInsets(h2Var.getEdgeToEdgeSupportMode());
        this.f28717s.setDrawNavigationBar(h2Var.drawEdgeNavigationBar());
        h2Var.setInPreviewMode(false);
        h2Var.setInMenuMode(false);
        try {
            Activity activity = this.R0;
            if (n6.x0(null, n6.f29674s8, false) != -1 && (!h2Var.hasForceLightStatusBar() || n6.D0().q())) {
                z10 = false;
            }
            org.telegram.messenger.g0.o3(activity, z10);
        } catch (Exception unused2) {
        }
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final boolean s(Menu menu) {
        if (!this.V0.isEmpty() && ((h2) p5.c.h(1, this.V0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.I0 = view;
    }

    @Override
    public void setDelegate(p4 p4Var) {
        this.Q0 = p4Var;
    }

    @Override
    public void setDrawerLayoutContainer(p3 p3Var) {
        this.f28730y = p3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i7) {
        x xVar = this.f28717s;
        if (xVar != null) {
            xVar.setFragmentPanTranslationOffset(i7);
        }
    }

    @Override
    public void setFragmentStack(List<h2> list) {
        this.V0 = list;
        g3 g3Var = this.F;
        if (g3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            g3Var.J.remove(oVar);
            g3Var.K.remove(oVar2);
            org.telegram.messenger.g0.E2(this.F);
            this.F = null;
        }
        boolean z10 = this.S0;
        Activity activity = this.R0;
        if (z10) {
            g3 g3Var2 = new g3(activity, this);
            this.F = g3Var2;
            this.G = new r7(g3Var2);
            g3 g3Var3 = this.F;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            g3Var3.J.add(oVar3);
            g3Var3.K.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.F, layoutParams);
            n3 n3Var = LaunchActivity.H1.f43110x0;
            if (n3Var != null) {
                n3Var.setTabsView(this.F);
            }
        }
        x xVar = this.f28726w;
        if (xVar != null) {
            org.telegram.messenger.g0.E2(xVar);
        }
        x xVar2 = new x(activity, this);
        this.f28726w = xVar2;
        addView(xVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f28726w.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.f28726w.setLayoutParams(layoutParams2);
        x xVar3 = this.f28717s;
        if (xVar3 != null) {
            org.telegram.messenger.g0.E2(xVar3);
        }
        x xVar4 = new x(activity, this);
        this.f28717s = xVar4;
        addView(xVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f28717s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f28717s.setLayoutParams(layoutParams3);
        x xVar5 = this.f28728x;
        if (xVar5 != null) {
            org.telegram.messenger.g0.E2(xVar5);
        }
        x xVar6 = new x(activity, this);
        this.f28728x = xVar6;
        this.f28699i1.f33890a = xVar6;
        addView(xVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f28728x.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f28728x.setLayoutParams(layoutParams4);
        s sVar = this.H;
        if (sVar != null) {
            sVar.setParentLayout(this);
            s sVar2 = this.H;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f28728x) {
                org.telegram.messenger.g0.E2(view);
                this.f28728x.addView(view, ma.c(-1.0f, -1));
                this.f28728x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        for (h2 h2Var : this.V0) {
            h2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Z0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f28691f = z10;
    }

    public void setInnerTranslationX(float f10) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.P = f10;
        invalidate();
        if (this.V0.size() >= 2 && this.f28717s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.l(f10 / (org.telegram.messenger.g0.L(56.0f) * 6));
            } else {
                measuredWidth = f10 / this.f28717s.getMeasuredWidth();
            }
            h2 h2Var = (h2) p5.c.h(2, this.V0);
            h2Var.onSlideProgress(false, measuredWidth);
            h2 h2Var2 = (h2) p5.c.h(1, this.V0);
            float a10 = l9.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (h2Var2.isBeginToShow() && (navigationBarColor = h2Var2.getNavigationBarColor()) != (navigationBarColor2 = h2Var.getNavigationBarColor())) {
                h2Var2.setNavigationBarColor(i0.a.f(a10, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f28680b = z10;
    }

    @Override
    public void setNavigationBarColor(int i7) {
        boolean z10;
        if (this.f28719s1 != i7) {
            this.f28719s1 = i7;
            invalidate();
        }
        p3 p3Var = this.f28730y;
        if (p3Var != null) {
            p3Var.setInternalNavigationBarColor(i7);
        }
        g3 g3Var = this.F;
        if (g3Var != null) {
            if (!this.R && !this.U) {
                z10 = true;
            } else {
                z10 = false;
            }
            g3Var.i(i7, z10);
        }
    }

    public void setOverrideWidthOffset(int i7) {
        this.f28679a1 = i7;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<h9> list) {
        this.W0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.J0 = z10;
    }

    public void setThemeAnimationValue(float f10) {
        boolean z10;
        int alpha;
        this.f28720t0 = f10;
        for (int i7 = 0; i7 < this.f28710p0; i7++) {
            int f11 = i0.a.f(f10, this.f28707n0[i7], this.f28708o0[i7]);
            zm zmVar = this.f28712q0;
            if (zmVar != null) {
                zmVar.l(this.m0[i7], f11);
            } else {
                int i10 = this.m0[i7];
                SparseIntArray sparseIntArray = n6.mm;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i10, f11);
                }
            }
        }
        ArrayList arrayList = this.f28698i0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i11);
            int[] iArr = (int[]) this.f28684c0.get(i11);
            int[] iArr2 = (int[]) this.f28686d0.get(i11);
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                int red = Color.red(iArr2[i12]);
                int green = Color.green(iArr2[i12]);
                int blue = Color.blue(iArr2[i12]);
                int alpha2 = Color.alpha(iArr2[i12]);
                int red2 = Color.red(iArr[i12]);
                int green2 = Color.green(iArr[i12]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr[i12]);
                int i13 = size;
                int i14 = i11;
                int argb = Color.argb(Math.min(255, (int) (((alpha2 - alpha) * f10) + Color.alpha(iArr[i12]))), Math.min(255, (int) (((red - red2) * f10) + red2)), Math.min(255, (int) (((green - green2) * f10) + green2)), Math.min(255, (int) (((blue - blue2) * f10) + blue2)));
                w6 w6Var = (w6) arrayList2.get(i12);
                int i15 = w6Var.f30155e;
                i6 i6Var = w6Var.f30163n;
                if (i6Var != null) {
                    i6Var.l(i15, argb);
                } else {
                    SparseIntArray sparseIntArray2 = n6.mm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i15, argb);
                    }
                }
                w6Var.e(argb, false, false);
                i12++;
                i11 = i14;
                arrayList = arrayList3;
                size = i13;
            }
            i11++;
        }
        ArrayList arrayList4 = this.f28702k0;
        int size3 = arrayList4.size();
        for (int i16 = 0; i16 < size3; i16++) {
            v6 v6Var = (v6) arrayList4.get(i16);
            if (v6Var != null) {
                v6Var.b();
                v6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.f28700j0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i17 = 0; i17 < size4; i17++) {
                w6 w6Var2 = (w6) this.f28700j0.get(i17);
                w6Var2.e(n6.w0(w6Var2.f30155e, w6Var2.f30163n), false, false);
            }
        }
        wm wmVar = this.f28696h0;
        if (wmVar != null) {
            zm zmVar2 = wmVar.f53407a;
            zmVar2.G.A0.invalidate();
            zmVar2.f54551t.K = f10;
            zmVar2.f54552u.K = f10;
            zmVar2.u(f10);
        }
        p4 p4Var = this.Q0;
        if (p4Var != null) {
            p4Var.a(f10);
        }
        t6 t6Var = u6.f30082a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f10 < 1.0f && currentAnimationTimeMillis == u6.f30084c && f10 == u6.d) {
            if (getWindowToken() == null) {
                u6.c0(this, false);
            }
        } else {
            u6.f30084c = currentAnimationTimeMillis;
            u6.d = f10;
            if (f10 >= 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.b0(this, z10);
        }
        E();
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.H0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f28683c = window;
    }

    public final h2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                h2 h2Var = (h2) getFragmentStack().get(size);
                if (h2Var != null && !h2Var.isFinishing() && !h2Var.isRemovingFromStack() && ee0.class.isInstance(h2Var)) {
                    return h2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final void v() {
        if (this.h || this.f28681b0) {
            if (this.f28678a0 && this.F0 != null) {
                return;
            }
            Runnable runnable = this.f28688e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f28688e = null;
            }
            l(true, false);
        }
    }

    public final int w(boolean z10) {
        g3 g3Var;
        if (this.S0 && (g3Var = this.F) != null) {
            if (z10) {
                return (int) g3Var.H;
            }
            return g3Var.I;
        }
        return 0;
    }

    public final ox x() {
        Activity activity = this.R0;
        if (activity == null) {
            return null;
        }
        if (this.H == null) {
            s sVar = new s(this);
            this.H = sVar;
            sVar.setParentLayout(this);
            s sVar2 = this.H;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f28728x) {
                org.telegram.messenger.g0.E2(view);
                this.f28728x.addView(view, ma.c(-1.0f, -1));
                this.f28728x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
                this.f28728x.setDrawNavigationBar(this.H.drawEdgeNavigationBar());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        return this.H;
    }

    public final boolean y() {
        if (!this.h && !this.f28681b0) {
            return false;
        }
        return true;
    }

    @Override
    public void setHighlightActionButtons(boolean z10) {
    }

    @Override
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override
    public ViewGroup getView() {
        return this;
    }
}
