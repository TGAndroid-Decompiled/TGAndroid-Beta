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
import c8.ha;
import c8.j9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ce0;
import org.telegram.ui.je0;
import org.telegram.ui.jx;
import org.telegram.ui.s60;
import org.telegram.ui.vm;
import org.telegram.ui.ym;
public class ActionBarLayout extends FrameLayout implements q4, pg.b {
    public static Drawable f27223v1;
    public static Drawable f27224w1;
    public static Paint f27225x1;
    public boolean A0;
    public long B0;
    public boolean C0;
    public k D;
    public int D0;
    public d3 E;
    public Runnable E0;
    public r7 F;
    public Runnable F0;
    public s G;
    public boolean G0;
    public f2 H;
    public View H0;
    public f2 I;
    public boolean I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public t J0;
    public AnimatorSet K;
    public float K0;
    public final DecelerateInterpolator L;
    public long L0;
    public final OvershootInterpolator M;
    public String M0;
    public final AccelerateDecelerateInterpolator N;
    public int N0;
    public float O;
    public s60 O0;
    public boolean P;
    public n4 P0;
    public boolean Q;
    public final Activity Q0;
    public int R;
    public final boolean R0;
    public int S;
    public boolean S0;
    public boolean T;
    public boolean T0;
    public VelocityTracker U;
    public List U0;
    public boolean V;
    public List V0;
    public boolean W;
    public final Rect W0;
    public boolean X0;
    public Runnable Y0;
    public int Z0;
    public boolean f27226a;
    public boolean f27227a0;
    public boolean f27228a1;
    public boolean f27229b;
    public final ArrayList f27230b0;
    public final Path f27231b1;
    public Window f27232c;
    public final ArrayList f27233c0;
    public final float[] f27234c1;
    public Runnable d;
    public final fi.g5 f27235d0;
    public boolean f27236d1;
    public Runnable f27237e;
    public t4 f27238e0;
    public final int[] f27239e1;
    public boolean f27240f;
    public t4 f27241f0;
    public boolean f27242f1;
    public vm f27243g0;
    public int f27244g1;
    public boolean h;
    public final ArrayList f27245h0;
    public final org.telegram.ui.Components.w5 f27246h1;
    public ArrayList f27247i0;
    public boolean f27248i1;
    public final ArrayList f27249j0;
    public boolean f27250j1;
    public int[] f27251k0;
    public boolean f27252k1;
    public int[] f27253l0;
    public float l1;
    public int[] m0;
    public boolean f27254m1;
    public boolean f27255n;
    public int[] f27256n0;
    public AnimatorSet n1;
    public int f27257o0;
    public ArrayList f27258o1;
    public ym f27259p0;
    public final o f27260p1;
    public AnimatorSet f27261q0;
    public boolean f27262q1;
    public ColorDrawable f27263r;
    public final h2.f f27264r0;
    public int f27265r1;
    public w f27266s;
    public float f27267s0;
    public r0.k1 f27268s1;
    public boolean f27269t0;
    public i0.b f27270t1;
    public j6 f27271u0;
    public i0.b f27272u1;
    public boolean f27273v0;
    public w f27274w;
    public boolean f27275w0;
    public w f27276x;
    public int f27277x0;
    public n3 f27278y;
    public boolean f27279y0;
    public boolean f27280z0;

    public ActionBarLayout(Context context, boolean z9) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.f27230b0 = new ArrayList();
        this.f27233c0 = new ArrayList();
        fi.g5 g5Var = new fi.g5();
        g5Var.f12069b = new SparseIntArray();
        g5Var.f12070c = new int[]{k6.f28053ob, k6.f28112rb, k6.f28130sb, k6.f28149tb, k6.Oc, k6.f28093qb};
        this.f27235d0 = g5Var;
        this.f27245h0 = new ArrayList();
        this.f27249j0 = new ArrayList();
        this.f27264r0 = new h2.f((int[]) null);
        this.W0 = new Rect();
        this.Z0 = -1;
        this.f27231b1 = new Path();
        this.f27234c1 = new float[8];
        this.f27239e1 = new int[2];
        this.f27246h1 = new org.telegram.ui.Components.w5(this, 280L, xq.h);
        this.f27258o1 = new ArrayList();
        this.f27260p1 = new o(this, 2);
        i0.b bVar = i0.b.f15116e;
        this.f27270t1 = bVar;
        this.f27272u1 = bVar;
        this.Q0 = (Activity) context;
        this.R0 = z9;
        if (f27224w1 == null) {
            f27224w1 = getResources().getDrawable(2131231619);
            f27223v1 = getResources().getDrawable(2131231237).mutate();
            f27225x1 = new Paint();
        }
        l2.y yVar = new l2.y(this, 25);
        WeakHashMap weakHashMap = r0.i0.f54098a;
        r0.a0.i(this, yVar);
    }

    public static void G(ArrayList arrayList, View view) {
        if (view instanceof pg.b) {
            arrayList.addAll(((pg.b) view).E());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                G(arrayList, viewGroup.getChildAt(i7));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!z9) {
            if (actionBarLayout.U0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            f2 f2Var = (f2) rf.b.g(1, actionBarLayout.U0);
            f2Var.prepareFragmentToSlide(true, false);
            f2Var.onPause();
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
            List list = actionBarLayout.U0;
            list.remove(list.size() - 1);
            actionBarLayout.L("onSlideAnimationEnd");
            w wVar = actionBarLayout.f27266s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.f27274w;
            actionBarLayout.f27266s = wVar2;
            actionBarLayout.f27274w = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view = actionBarLayout.f27276x;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.U0.size() > 0) {
                f2 f2Var2 = (f2) rf.b.g(1, actionBarLayout.U0);
                actionBarLayout.D = f2Var2.actionBar;
                f2Var2.onResume();
                f2Var2.onBecomeFullyVisible();
                f2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.U0.size() >= 2) {
            ((f2) rf.b.g(1, actionBarLayout.U0)).prepareFragmentToSlide(true, false);
            f2 f2Var3 = (f2) rf.b.g(2, actionBarLayout.U0);
            f2Var3.prepareFragmentToSlide(false, false);
            f2Var3.onPause();
            View view2 = f2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                f2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(f2Var3.fragmentView);
            }
            k kVar = f2Var3.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(f2Var3.actionBar);
            }
            f2Var3.detachSheets();
        }
        actionBarLayout.f27274w.setVisibility(4);
        actionBarLayout.Q = false;
        actionBarLayout.T = false;
        actionBarLayout.f27266s.setTranslationX(0.0f);
        actionBarLayout.f27274w.setTranslationX(0.0f);
        actionBarLayout.f27266s.setLayerType(0, null);
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
        if (i7 != k6.f27902g5 && i7 != k6.Oc && i7 != k6.Fe) {
            if (i7 != k6.f28112rb && i7 != k6.f28130sb && i7 != k6.f28149tb && i7 != k6.Be && i7 != k6.Ce && i7 != k6.De && i7 != k6.Ee) {
                return true;
            }
            if (i10 != 0 && i11 != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A() {
        return this.S0;
    }

    public final boolean B() {
        if (!this.W && !this.T) {
            return false;
        }
        return true;
    }

    public final int C() {
        int i7;
        View rootView = getRootView();
        Rect rect = this.W0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i7 = org.telegram.messenger.g0.f22531m;
        } else {
            i7 = 0;
        }
        return Math.max(0, ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        if (this.f27250j1 && this.f27252k1) {
            return true;
        }
        return false;
    }

    @Override
    public final List E() {
        f2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof pg.b) {
                arrayList.addAll(((pg.b) lastFragment).E());
            }
            G(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public final void F() {
        for (int i7 = 0; i7 < this.U0.size(); i7++) {
            if (((f2) this.U0.get(i7)).getFragmentView() != null) {
                try {
                    ((f2) this.U0.get(i7)).onThemeColorsChanged();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public final void H(boolean z9) {
        K();
        N();
        Runnable runnable = this.d;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            if (z9) {
                animatorSet.cancel();
            }
            this.K = null;
        }
        t tVar = this.J0;
        if (tVar != null) {
            org.telegram.messenger.g0.r(tVar);
            this.J0 = null;
        }
        setAlpha(1.0f);
        this.f27266s.setAlpha(1.0f);
        this.f27266s.setScaleX(1.0f);
        this.f27266s.setScaleY(1.0f);
        this.f27274w.setAlpha(1.0f);
        this.f27274w.setScaleX(1.0f);
        this.f27274w.setScaleY(1.0f);
    }

    public final void I() {
        y4 y4Var;
        k kVar;
        if (!this.f27227a0 && !this.Q && !i() && !this.U0.isEmpty()) {
            p10 p10Var = p10.f36729e0;
            if (p10Var != null && p10Var.f36745y) {
                p10Var.f(false);
                return;
            }
            if (!i0() && (kVar = this.D) != null && !kVar.v()) {
                k kVar2 = this.D;
                if (kVar2.f27676n0) {
                    kVar2.l(true);
                    return;
                }
            }
            f2 f2Var = (f2) rf.b.g(1, this.U0);
            if (!i0() && (y4Var = f2Var.simpleActionBar) != null) {
                i5 i5Var = y4Var.Q;
                if (i5Var != null) {
                    i5Var.a(true);
                    return;
                } else if (!y4Var.G && y4Var.F) {
                    y4Var.j(true);
                    return;
                }
            }
            s sVar = this.G;
            if ((sVar == null || sVar.onBackPressed(true)) && ((f2) rf.b.g(1, this.U0)).onBackPressed(true) && !this.U0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final boolean J(float r6, float r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.J(float, float):boolean");
    }

    public final void K() {
        if (this.W && this.E0 != null) {
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                this.K = null;
                animatorSet.cancel();
            }
            this.W = false;
            this.f27227a0 = false;
            this.B0 = 0L;
            this.H = null;
            this.I = null;
            Runnable runnable = this.E0;
            this.E0 = null;
            if (runnable != null) {
                runnable.run();
            }
            h();
            h();
        }
    }

    public final void L(String str) {
        Runnable runnable = this.Y0;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList arrayList = gc.D().f22613f;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((org.telegram.ui.Components.v5) arrayList.get(i7)).f38856y0 = 0;
        }
        g(str);
    }

    public final void M() {
        for (f2 f2Var : this.U0) {
            f2Var.onLowMemory();
        }
    }

    public final void N() {
        Runnable runnable;
        if (this.W && (runnable = this.F0) != null) {
            this.W = false;
            this.f27227a0 = false;
            this.B0 = 0L;
            this.H = null;
            this.I = null;
            this.F0 = null;
            runnable.run();
            h();
        }
    }

    public final void O() {
        if (!this.U0.isEmpty()) {
            ((f2) rf.b.g(1, this.U0)).onPause();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void P() {
        if (!this.U0.isEmpty()) {
            ((f2) rf.b.g(1, this.U0)).onResume();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onResume();
        }
    }

    public final void Q(Canvas canvas, ViewGroup viewGroup) {
        if (this.E != null && getHeight() < viewGroup.getHeight()) {
            canvas.save();
            canvas.translate(this.E.getX() + getX(), this.E.getY() + getY());
            this.E.draw(canvas);
            canvas.restore();
        }
    }

    public final void R() {
        this.P = false;
        this.Q = true;
        this.f27274w.setVisibility(0);
        this.V = false;
        f2 f2Var = (f2) rf.b.g(2, this.U0);
        View view = f2Var.fragmentView;
        if (view == null && (view = f2Var.performCreateView(this.Q0)) != null && f2Var.isSupportEdgeToEdge() && f2Var.drawEdgeNavigationBar()) {
            n nVar = new n(f2Var);
            WeakHashMap weakHashMap = r0.i0.f54098a;
            r0.a0.i(view, nVar);
            this.f27274w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            f2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.f27274w.addView(view);
        this.f27274w.setShouldHandleBottomInsets(f2Var.getEdgeToEdgeSupportMode());
        this.f27274w.setDrawNavigationBar(f2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = f2Var.actionBar;
        if (kVar != null && kVar.K) {
            org.telegram.messenger.g0.E2(kVar);
            if (this.I0) {
                f2Var.actionBar.setOccupyStatusBar(false);
            }
            this.f27274w.addView(f2Var.actionBar);
        }
        f2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        f2Var.attachSheets(this.f27274w);
        if (!f2Var.hasOwnBackground && view.getBackground() == null) {
            r6.i(k6.f27848d6, view, null);
        }
        f2Var.onResume();
        if (this.f27261q0 != null) {
            this.f27247i0 = f2Var.getThemeDescriptions();
        }
        this.f27266s.setLayerType(2, null);
        ((f2) rf.b.g(1, this.U0)).prepareFragmentToSlide(true, true);
        f2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean S(f2 f2Var) {
        return U(new o4(f2Var));
    }

    public final boolean T(f2 f2Var, boolean z9) {
        o4 o4Var = new o4(f2Var);
        o4Var.f28339b = z9;
        return U(o4Var);
    }

    public final boolean U(org.telegram.ui.ActionBar.o4 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.U(org.telegram.ui.ActionBar.o4):boolean");
    }

    public final boolean V(f2 f2Var, boolean z9, boolean z10) {
        o4 o4Var = new o4(f2Var);
        o4Var.f28339b = z9;
        o4Var.f28340c = z10;
        o4Var.d = true;
        o4Var.f28341e = false;
        return U(o4Var);
    }

    public final void W(f2 f2Var, boolean z9) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (f2Var == null) {
            return;
        }
        f2Var.onBecomeFullyHidden();
        f2Var.onPause();
        if (z9) {
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
            this.U0.remove(f2Var);
            L("presentFragmentInternalRemoveOld");
        } else {
            View view = f2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                f2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(f2Var.fragmentView);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    try {
                        viewGroup2.removeView(f2Var.fragmentView);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
            k kVar = f2Var.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(f2Var.actionBar);
            }
            f2Var.detachSheets();
        }
        this.f27274w.setVisibility(4);
    }

    public final void X(boolean z9, boolean z10) {
        if (!this.W && !this.Q) {
            int size = this.U0.size();
            if (!z9) {
                size--;
            }
            if (this.h) {
                size--;
            }
            for (int i7 = 0; i7 < size; i7++) {
                ((f2) this.U0.get(i7)).clearViews();
                ((f2) this.U0.get(i7)).setParentLayout(this);
            }
            n4 n4Var = this.P0;
            if (n4Var != null) {
                n4Var.b(this, z9);
            }
            if (z10) {
                f0();
                return;
            }
            return;
        }
        this.f27279y0 = true;
        this.f27280z0 = z9;
        this.A0 = z10;
    }

    public final void Y() {
        X(true, true);
    }

    public final void Z() {
        this.f27266s.removeAllViews();
        this.f27274w.removeAllViews();
        this.D = null;
        this.H = null;
        this.I = null;
    }

    public final void a0() {
        while (this.U0.size() > 0) {
            e0((f2) this.U0.get(0), false);
        }
        View view = this.H0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    @Override
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        r0.k1 k1Var = this.f27268s1;
        if (k1Var != null) {
            o(view, k1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f27233c0.add(iArr);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = ((t6) arrayList.get(i7)).c();
            }
        }
    }

    public final void b0(int i7) {
        if (i7 >= 0 && i7 < getFragmentStack().size()) {
            d0((f2) getFragmentStack().get(i7), false);
        }
    }

    public final boolean c(int i7, f2 f2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        n4 n4Var = this.P0;
        if ((n4Var != null && !n4Var.h(f2Var, this)) || !f2Var.onFragmentCreate() || this.U0.contains(f2Var)) {
            return false;
        }
        f2Var.setParentLayout(this);
        Activity activity = this.Q0;
        if (i7 != -1 && i7 != -2) {
            if (i7 == -3) {
                View view = f2Var.fragmentView;
                if (view == null) {
                    view = f2Var.performCreateView(activity);
                    if (view != null && f2Var.isSupportEdgeToEdge() && f2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(f2Var);
                        WeakHashMap weakHashMap = r0.i0.f54098a;
                        r0.a0.i(view, nVar);
                        this.f27266s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        f2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!f2Var.hasOwnBackground && view.getBackground() == null) {
                    r6.i(k6.f27848d6, view, null);
                }
                w wVar = this.f27266s;
                wVar.addView(view, Utilities.j(0, wVar.getChildCount(), 0), ha.c(-1.0f, -1));
                this.f27266s.setShouldHandleBottomInsets(f2Var.getEdgeToEdgeSupportMode());
                this.f27266s.setDrawNavigationBar(f2Var.drawEdgeNavigationBar());
                k kVar = f2Var.actionBar;
                if (kVar != null && kVar.K) {
                    if (this.I0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) f2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(f2Var.actionBar);
                    }
                    this.f27266s.addView(f2Var.actionBar);
                }
                f2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                f2Var.attachSheets(this.f27266s);
                i7 = 0;
            }
            this.U0.add(i7, f2Var);
            L("addFragmentToStack");
        } else {
            if (!this.U0.isEmpty()) {
                f2 f2Var2 = (f2) rf.b.g(1, this.U0);
                f2Var2.onPause();
                k kVar2 = f2Var2.actionBar;
                if (kVar2 != null && kVar2.K && (viewGroup2 = (ViewGroup) kVar2.getParent()) != null) {
                    viewGroup2.removeView(f2Var2.actionBar);
                }
                View view2 = f2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    f2Var2.onRemoveFromParent();
                    viewGroup.removeView(f2Var2.fragmentView);
                }
                f2Var2.detachSheets();
            }
            this.U0.add(f2Var);
            if (i7 != -2) {
                View view3 = f2Var.fragmentView;
                if (view3 == null) {
                    view3 = f2Var.performCreateView(activity);
                    if (view3 != null && f2Var.isSupportEdgeToEdge() && f2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(f2Var);
                        WeakHashMap weakHashMap2 = r0.i0.f54098a;
                        r0.a0.i(view3, nVar2);
                        this.f27266s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        f2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!f2Var.hasOwnBackground && view3.getBackground() == null) {
                    r6.i(k6.f27848d6, view3, null);
                }
                this.f27266s.addView(view3, ha.c(-1.0f, -1));
                this.f27266s.setShouldHandleBottomInsets(f2Var.getEdgeToEdgeSupportMode());
                this.f27266s.setDrawNavigationBar(f2Var.drawEdgeNavigationBar());
                k kVar3 = f2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.I0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) f2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(f2Var.actionBar);
                    }
                    this.f27266s.addView(f2Var.actionBar);
                }
                f2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                f2Var.attachSheets(this.f27266s);
                f2Var.onResume();
                f2Var.onTransitionAnimationEnd(false, true);
                f2Var.onTransitionAnimationEnd(true, true);
                f2Var.onBecomeFullyVisible();
            }
            L("addFragmentToStack " + i7);
        }
        if (!this.G0) {
            setVisibility(0);
            View view4 = this.H0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0(f2 f2Var) {
        d0(f2Var, false);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f27245h0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f27230b0.add(iArr);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                t6 t6Var = (t6) arrayList.get(i7);
                iArr[i7] = t6Var.c();
                s6 s6Var = t6Var.f28536g;
                t6Var.f28536g = null;
                if (s6Var != null) {
                    ArrayList arrayList2 = this.f27249j0;
                    if (!arrayList2.contains(s6Var)) {
                        arrayList2.add(s6Var);
                    }
                }
            }
        }
    }

    public final void d0(f2 f2Var, boolean z9) {
        boolean z10 = true;
        if ((this.U0.size() > 0 && rf.b.g(1, this.U0) == f2Var) || (this.U0.size() > 1 && rf.b.g(2, this.U0) == f2Var)) {
            N();
            K();
        }
        g("removeFragmentFromStack " + z9);
        if (this.G0 && this.U0.size() == 1 && org.telegram.messenger.g0.Q1()) {
            l(true, false);
            return;
        }
        if (this.P0 != null && this.U0.size() == 1 && org.telegram.messenger.g0.Q1()) {
            this.P0.k(this);
        }
        if (!f2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z9) {
            z10 = false;
        }
        e0(f2Var, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E != null && w(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.f27270t1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.f27228a1 = true;
        if (this.S0) {
            canvas2.save();
            float L = org.telegram.messenger.g0.L(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.f27231b1;
            path.rewind();
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.S0) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            n4 n4Var = this.P0;
            if ((n4Var != null && n4Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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

    public final void e(boolean z9) {
        f2 f2Var;
        int i7;
        Animator customSlideTransition;
        int i10;
        int i11;
        if (!this.U0.isEmpty()) {
            f2Var = (f2) rf.b.g(1, this.U0);
        } else {
            f2Var = null;
        }
        if (f2Var == null) {
            return;
        }
        float x10 = this.f27266s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = f2Var.shouldOverrideSlideTransition(false, z9);
        Property property = View.TRANSLATION_X;
        if (!z9) {
            x10 = Math.abs(this.f27266s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f27266s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 380;
            } else {
                i10 = 50;
            }
            int max = Math.max(measuredWidth, i10);
            if (!shouldOverrideSlideTransition) {
                w wVar = this.f27266s;
                int measuredWidth2 = wVar.getMeasuredWidth();
                if (this.f27250j1) {
                    i11 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    i11 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wVar, property, measuredWidth2 + i11);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f27266s.getMeasuredWidth()).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(xq.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f27266s.getMeasuredWidth()) * x10);
            if (D()) {
                i7 = 320;
            } else {
                i7 = 120;
            }
            int max2 = Math.max(measuredWidth3, i7);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f27266s, property, 0.0f);
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(xq.h);
                }
            }
        }
        Animator customSlideTransition2 = f2Var.getCustomSlideTransition(false, z9, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        f2 f2Var2 = (f2) rf.b.g(2, this.U0);
        if (f2Var2 != null && (customSlideTransition = f2Var2.getCustomSlideTransition(false, z9, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z9));
        this.n1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final void e0(f2 f2Var, boolean z9) {
        if (!this.U0.contains(f2Var)) {
            return;
        }
        if (z9 && rf.b.g(1, this.U0) == f2Var) {
            f2Var.finishFragment();
        } else if (rf.b.g(1, this.U0) == f2Var && this.U0.size() > 1) {
            f2Var.finishFragment(false);
        } else {
            f2Var.onPause();
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
            this.U0.remove(f2Var);
            L("removeFragmentFromStackInternal " + z9);
        }
    }

    public final void f(org.telegram.ui.ActionBar.p4 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.p4, java.lang.Runnable):void");
    }

    public final void f0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.U0.isEmpty()) {
            int size = this.U0.size() - 1;
            if (!this.U0.isEmpty()) {
                if (this.U0.isEmpty() || this.U0.size() - 1 != size || ((f2) this.U0.get(size)).fragmentView == null) {
                    for (int i7 = 0; i7 < size; i7++) {
                        f2 f2Var = (f2) this.U0.get(i7);
                        k kVar = f2Var.actionBar;
                        if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                            viewGroup2.removeView(f2Var.actionBar);
                        }
                        View view = f2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            f2Var.onPause();
                            f2Var.onRemoveFromParent();
                            viewGroup.removeView(f2Var.fragmentView);
                        }
                    }
                    f2 f2Var2 = (f2) this.U0.get(size);
                    f2Var2.setParentLayout(this);
                    View view2 = f2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = f2Var2.performCreateView(this.Q0);
                        if (view2 != null && f2Var2.isSupportEdgeToEdge() && f2Var2.drawEdgeNavigationBar()) {
                            n nVar = new n(f2Var2);
                            WeakHashMap weakHashMap = r0.i0.f54098a;
                            r0.a0.i(view2, nVar);
                            this.f27266s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            f2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f27266s.addView(view2, ha.c(-1.0f, -1));
                    this.f27266s.setShouldHandleBottomInsets(f2Var2.getEdgeToEdgeSupportMode());
                    this.f27266s.setDrawNavigationBar(f2Var2.drawEdgeNavigationBar());
                    k kVar2 = f2Var2.actionBar;
                    if (kVar2 != null && kVar2.K) {
                        if (this.I0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        org.telegram.messenger.g0.E2(f2Var2.actionBar);
                        this.f27266s.addView(f2Var2.actionBar);
                    }
                    f2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                    f2Var2.attachSheets(this.f27266s);
                    f2Var2.onResume();
                    f2Var2.onBecomeFullyVisible();
                    this.D = f2Var2.actionBar;
                    if (!f2Var2.hasOwnBackground && view2.getBackground() == null) {
                        r6.i(k6.f27848d6, view2, null);
                    }
                }
            }
        }
    }

    public final void g(String str) {
        boolean z9 = org.telegram.messenger.r2.f25191a;
        ArrayList arrayList = this.f27258o1;
        StringBuilder j3 = rf.b.j(str, " ");
        j3.append(this.U0.size());
        arrayList.add(0, j3.toString());
        if (this.f27258o1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < 10; i7++) {
                arrayList2.add((String) this.f27258o1.get(i7));
            }
            this.f27258o1 = arrayList2;
        }
        o oVar = this.f27260p1;
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.i3(oVar, 500L);
    }

    public final void g0(ym ymVar) {
        int x02;
        try {
            int i7 = k6.f27885f5;
            this.f27251k0 = new int[i7];
            for (int i10 = 0; i10 < i7; i10++) {
                int[] iArr = this.f27251k0;
                if (ymVar != null) {
                    x02 = ymVar.h(i10);
                } else {
                    x02 = k6.x0(null, i10, false);
                }
                iArr[i10] = x02;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            this.f27251k0 = null;
        }
    }

    @Override
    public f2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (f2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public v2 getBottomSheet() {
        return null;
    }

    public d3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        w wVar;
        if (!this.h && !this.f27227a0 && !this.f27255n) {
            return 0.0f;
        }
        f2 f2Var = this.I;
        if (f2Var != null && f2Var.inPreviewMode) {
            wVar = this.f27274w;
        } else {
            wVar = this.f27266s;
        }
        return wVar.getAlpha();
    }

    public n3 getDrawerLayoutContainer() {
        return this.f27278y;
    }

    @Override
    public List<f2> getFragmentStack() {
        return this.U0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override
    public f2 getLastFragment() {
        if (this.U0.isEmpty()) {
            return null;
        }
        return (f2) rf.b.g(1, this.U0);
    }

    public f2 getLastFragmentIncludeMainTabs() {
        f2 lastFragment = getLastFragment();
        if (lastFragment instanceof je0) {
            return ((je0) lastFragment).c0();
        }
        return lastFragment;
    }

    @Override
    public t4 getMessageDrawableOutMediaStart() {
        return this.f27241f0;
    }

    @Override
    public t4 getMessageDrawableOutStart() {
        return this.f27238e0;
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
    public List<c9> getPulledDialogs() {
        return this.V0;
    }

    @Override
    public f2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                f2 f2Var = (f2) getFragmentStack().get(size);
                if (f2Var != null && f2Var.getContext() != null && !f2Var.isFinishing() && !f2Var.isRemovingFromStack()) {
                    return f2Var;
                }
            }
            return null;
        }
        return null;
    }

    public jx getSheetFragment() {
        return x();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.f27267s0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f27232c;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public final void h() {
        if (this.f27279y0) {
            X(this.f27280z0, this.A0);
            this.f27279y0 = false;
        } else if (this.f27269t0) {
            p4 p4Var = new p4(this.f27271u0, this.f27277x0, this.f27275w0, true);
            boolean z9 = this.f27273v0;
            if (!z9) {
                p4Var.f28372g = z9;
                p4Var.f28371f = z9;
            }
            f(p4Var, null);
            this.f27271u0 = null;
            this.f27269t0 = false;
        }
    }

    public final void h0(boolean z9, boolean z10, boolean z11) {
        if (z10) {
            this.K0 = 0.0f;
            this.L0 = System.nanoTime() / 1000000;
        }
        t tVar = new t(this, z10, z11, z9);
        this.J0 = tVar;
        org.telegram.messenger.g0.h3(tVar);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        if (this.f27227a0) {
            return false;
        }
        if (this.W && (this.B0 < System.currentTimeMillis() - 1500 || this.h)) {
            H(true);
        }
        return this.W;
    }

    public final boolean i0() {
        f2 f2Var;
        if (!this.U0.isEmpty()) {
            f2Var = (f2) rf.b.g(1, this.U0);
        } else {
            f2Var = null;
        }
        if (f2Var != null && f2Var.getLastStoryViewer() != null && f2Var.getLastStoryViewer().y()) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.f27257o0 = 0;
        this.f27259p0 = null;
        this.f27251k0 = null;
    }

    public final void k() {
        l(false, false);
    }

    public final void l(boolean z9, boolean z10) {
        boolean z11;
        f2 f2Var;
        boolean z12;
        boolean z13;
        f2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            n4 n4Var = this.P0;
            if ((n4Var == null || n4Var.k(this)) && !i() && !this.U0.isEmpty()) {
                Activity activity = this.Q0;
                if (activity.getCurrentFocus() != null) {
                    org.telegram.messenger.g0.v1(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z10 && (this.h || this.f27227a0 || (z9 && qp.e1().getBoolean("view_animations", true)))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f2 f2Var2 = (f2) rf.b.g(1, this.U0);
                AnimatorSet animatorSet = null;
                if (this.U0.size() > 1) {
                    f2Var = (f2) rf.b.g(2, this.U0);
                } else {
                    f2Var = null;
                }
                if (f2Var != null) {
                    if (k6.x0(null, k6.f28128s8, false) != -1 && (!f2Var.hasForceLightStatusBar() || k6.D0().q())) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    org.telegram.messenger.g0.p3(activity, z12);
                    w wVar = this.f27266s;
                    this.f27266s = this.f27274w;
                    this.f27274w = wVar;
                    f2Var.setParentLayout(this);
                    View view = f2Var.fragmentView;
                    if (view == null && (view = f2Var.performCreateView(activity)) != null && f2Var.isSupportEdgeToEdge() && f2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(f2Var);
                        WeakHashMap weakHashMap = r0.i0.f54098a;
                        r0.a0.i(view, nVar);
                        this.f27266s.invalidate();
                    }
                    if (!this.h) {
                        this.f27266s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            f2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        }
                        this.f27266s.addView(view);
                        this.f27266s.setShouldHandleBottomInsets(f2Var.getEdgeToEdgeSupportMode());
                        this.f27266s.setDrawNavigationBar(f2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        k kVar = f2Var.actionBar;
                        if (kVar != null && kVar.K) {
                            if (this.I0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            org.telegram.messenger.g0.E2(f2Var.actionBar);
                            this.f27266s.addView(f2Var.actionBar);
                        }
                        f2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                        f2Var.attachSheets(this.f27266s);
                    }
                    this.H = f2Var;
                    this.I = f2Var2;
                    f2Var.onTransitionAnimationStart(true, true);
                    f2Var2.onTransitionAnimationStart(false, true);
                    f2Var.onResume();
                    if (this.f27261q0 != null) {
                        this.f27247i0 = f2Var.getThemeDescriptions();
                    }
                    this.D = f2Var.actionBar;
                    if (!f2Var.hasOwnBackground && view.getBackground() == null) {
                        r6.i(k6.f27848d6, view, null);
                    }
                    if (z11) {
                        this.B0 = System.currentTimeMillis();
                        this.W = true;
                        f2Var2.setRemovingFromStack(true);
                        this.E0 = new l2.z0(this, f2Var2, f2Var, 18);
                        if (!this.h && !this.f27227a0) {
                            animatorSet = f2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z14 = this.h;
                            if (!z14 && (this.f27266s.f28667b || this.f27274w.f28667b)) {
                                m.f3 f3Var = new m.f3(this, 14);
                                this.d = f3Var;
                                org.telegram.messenger.g0.i3(f3Var, 200L);
                            } else {
                                if (!z14 && !this.f27227a0) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                h0(false, true, z13);
                            }
                        } else {
                            this.K = animatorSet;
                            cc ccVar = cc.f32519w;
                            if (ccVar != null && ccVar.f32529l) {
                                ccVar.b();
                            }
                        }
                        L("closeLastFragment");
                    } else {
                        m(f2Var2);
                        f2Var2.onTransitionAnimationEnd(false, true);
                        f2Var.onTransitionAnimationEnd(true, true);
                        f2Var.onBecomeFullyVisible();
                    }
                } else if (this.G0 && !z10) {
                    this.B0 = System.currentTimeMillis();
                    this.W = true;
                    this.E0 = new p(0, this, f2Var2);
                    ArrayList arrayList = new ArrayList();
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.9f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.9f));
                    View view2 = this.H0;
                    if (view2 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view2, property, 1.0f, 0.0f));
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.K = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.K.setInterpolator(this.N);
                    this.K.setDuration(200L);
                    this.K.addListener(new r(this, 0));
                    this.K.start();
                } else {
                    e0(f2Var2, false);
                    setVisibility(8);
                    View view3 = this.H0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                f2Var2.onFragmentClosed();
            }
        }
    }

    public final void m(f2 f2Var) {
        f2Var.finishing = true;
        f2Var.onPause();
        f2Var.onFragmentDestroy();
        f2Var.setParentLayout(null);
        this.U0.remove(f2Var);
        this.f27274w.setVisibility(4);
        this.f27274w.setTranslationY(0.0f);
        bringChildToFront(this.f27266s);
        w wVar = this.f27276x;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        L("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((f2) rf.b.g(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void o(View view, r0.k1 k1Var) {
        boolean z9;
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
        boolean z10 = this.S0;
        if (z10) {
            if ((view instanceof w) && ((w) view).f28676y) {
                int i17 = k1Var.f54109a.f(8).d;
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
                r0.k1 k1Var2 = r0.k1.f54108b;
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 34) {
                    w0Var = new r0.z0(k1Var2);
                } else if (i18 >= 30) {
                    w0Var = new r0.y0(k1Var2);
                } else if (i18 >= 29) {
                    w0Var = new r0.x0(k1Var2);
                } else {
                    w0Var = new r0.w0(k1Var2);
                }
                w0Var.c(8, i0.b.b(0, 0, 0, max));
                r0.i0.b(view, w0Var.b());
                return;
            }
            r0.i0.b(view, r0.k1.f54108b);
            return;
        }
        boolean z11 = this.T0;
        boolean z12 = true;
        if (!z10 && !z11 && (getParent() instanceof RelativeLayout)) {
            z9 = true;
        } else {
            z9 = false;
        }
        i0.b bVar = this.f27270t1;
        i0.b bVar2 = this.f27272u1;
        if (view instanceof d3) {
            if (z11) {
                i14 = 0;
            } else {
                i14 = bVar.f15117a;
            }
            if (z9) {
                i15 = 0;
            } else {
                i15 = bVar.f15119c;
            }
            org.telegram.messenger.g0.B3(view, i14, 0, i15, bVar.d);
        } else if (view instanceof w) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            w wVar = (w) view;
            int w10 = w(false);
            if (w10 > 0) {
                i7 = bVar.d + w10;
            } else {
                i7 = 0;
            }
            o3 o3Var = wVar.f28675x;
            if (o3Var != o3.f28337c) {
                z12 = false;
            }
            if (!z12 && !z11) {
                i10 = bVar2.f15117a;
            } else {
                i10 = 0;
            }
            if (!z12 && !z9) {
                i11 = bVar2.f15119c;
            } else {
                i11 = 0;
            }
            if (z12 && !z11) {
                i12 = 0;
            } else {
                i12 = bVar2.f15117a;
            }
            if (z12 && !z9) {
                i13 = 0;
            } else {
                i13 = bVar2.f15119c;
            }
            if (o3Var == o3.f28335a) {
                i7 = Math.max(i7, bVar2.d);
                r0.i0.b(view, r0.k1.f54108b);
            } else {
                r0.i0.b(view, k1Var.f54109a.m(i12, 0, i13, i7));
            }
            view.setPadding(i10, 0, i11, i7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27226a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.U0.isEmpty()) {
            int size = this.U0.size();
            for (int i7 = 0; i7 < size; i7++) {
                f2 f2Var = (f2) this.U0.get(i7);
                f2Var.onConfigurationChanged(configuration);
                Dialog dialog = f2Var.visibleDialog;
                if (dialog instanceof v2) {
                    ((v2) dialog).c0(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27226a = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.T && !i() && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        k kVar;
        y yVar;
        if (i7 == 82 && !i() && !this.Q && (kVar = this.D) != null && !kVar.v() && (yVar = kVar.E) != null) {
            int childCount = yVar.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = yVar.getChildAt(i10);
                if (childAt instanceof r0) {
                    r0 r0Var = (r0) childAt;
                    if (r0Var.getVisibility() != 0) {
                        continue;
                    } else if (r0Var.s()) {
                        r0Var.U(null, null);
                        break;
                    } else if (r0Var.S) {
                        yVar.o(((Integer) r0Var.getTag()).intValue());
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
        f2 f2Var;
        boolean z9 = true;
        if (!this.U0.isEmpty()) {
            f2Var = (f2) rf.b.g(1, this.U0);
        } else {
            f2Var = null;
        }
        if (f2Var != null && !f2Var.isSupportEdgeToEdge() && i0()) {
            int C = C();
            f2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) + C, 1073741824));
            return;
        }
        n4 n4Var = this.P0;
        if (n4Var != null) {
            int[] iArr = this.f27239e1;
            iArr[0] = i7;
            iArr[1] = i10;
            n4Var.e(iArr);
            i7 = iArr[0];
            i10 = iArr[1];
        }
        if (C() <= org.telegram.messenger.g0.L(20.0f)) {
            z9 = false;
        }
        this.f27236d1 = z9;
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean z9 = false;
        if (!i() && !this.C0 && !this.T && !this.f27250j1) {
            if (this.U0.size() > 1 && ((sVar = this.G) == null || sVar.getLastSheet() == null || !this.G.getLastSheet().s())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((f2) rf.b.g(1, this.U0)).isSwipeBackEnabled(motionEvent)) {
                        this.P = false;
                        this.Q = false;
                        w wVar = this.f27266s;
                        if (wVar != null) {
                            wVar.setLayerType(0, null);
                            return false;
                        }
                    } else {
                        this.D0 = motionEvent.getPointerId(0);
                        this.P = true;
                        this.R = (int) motionEvent.getX();
                        this.S = (int) motionEvent.getY();
                        VelocityTracker velocityTracker = this.U;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.D0) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.R));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.S);
                    this.U.addMovement(motionEvent);
                    if (!this.W && !this.h && this.P && !this.Q && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs) {
                        if (((f2) rf.b.g(1, this.U0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.R = (int) motionEvent.getX();
                            R();
                        } else {
                            this.P = false;
                        }
                    } else if (this.Q) {
                        if (!this.V) {
                            Activity activity = this.Q0;
                            if (activity.getCurrentFocus() != null) {
                                org.telegram.messenger.g0.v1(activity.getCurrentFocus());
                            }
                            ((f2) rf.b.g(1, this.U0)).onBeginSlide();
                            this.V = true;
                        }
                        if (D()) {
                            float f10 = max;
                            this.f27266s.setTranslationX((f10 / getWidth()) * org.telegram.messenger.g0.L(56.0f) * 5);
                            setInnerTranslationX((f10 / getWidth()) * org.telegram.messenger.g0.L(56.0f) * 5);
                        } else {
                            float f11 = max;
                            this.f27266s.setTranslationX(f11);
                            setInnerTranslationX(f11);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.D0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    this.U.addMovement(motionEvent);
                    this.U.computeCurrentVelocity(1000);
                    f2 f2Var = (f2) rf.b.g(1, this.U0);
                    if (!this.h && !this.f27227a0 && !this.Q && f2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.U.getXVelocity();
                        float yVelocity = this.U.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && f2Var.canBeginSlide()) {
                            this.R = (int) motionEvent.getX();
                            R();
                            if (!this.V) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    org.telegram.messenger.g0.v1(((Activity) getContext()).getCurrentFocus());
                                }
                                this.V = true;
                            }
                        }
                    }
                    if (this.Q) {
                        float x10 = this.f27266s.getX();
                        float xVelocity2 = this.U.getXVelocity();
                        float yVelocity2 = this.U.getYVelocity();
                        if (!D() ? x10 < this.f27266s.getMeasuredWidth() / 3.0f : !(x10 >= org.telegram.messenger.g0.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z9 = true;
                            }
                        }
                        e(z9);
                    } else {
                        this.P = false;
                        this.Q = false;
                        w wVar2 = this.f27266s;
                        if (wVar2 != null) {
                            wVar2.setLayerType(0, null);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.U;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.U = null;
                    }
                } else if (motionEvent == null) {
                    this.P = false;
                    this.Q = false;
                    w wVar3 = this.f27266s;
                    if (wVar3 != null) {
                        wVar3.setLayerType(0, null);
                    }
                    VelocityTracker velocityTracker3 = this.U;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.U = null;
                    }
                }
            }
            return this.Q;
        }
        return false;
    }

    public final void p(Canvas canvas, int i7, int i10) {
        if (f27223v1 != null && iz.D1) {
            int i11 = i7 / 2;
            if (f27223v1.getAlpha() != i11) {
                f27223v1.setAlpha(i11);
            }
            f27223v1.setBounds(0, i10, getMeasuredWidth(), f27223v1.getIntrinsicHeight() + i10);
            f27223v1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i7) {
        p(canvas, 255, i7);
    }

    public final void r() {
        boolean z9 = true;
        this.f27255n = true;
        this.h = false;
        f2 f2Var = (f2) rf.b.g(1, this.U0);
        f2Var.fragmentView.setOutlineProvider(null);
        f2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        f2Var.fragmentView.setLayoutParams(layoutParams);
        W((f2) rf.b.g(2, this.U0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(f2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(f2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new xq(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ah.l(15, this, f2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f27266s.setShouldHandleBottomInsets(f2Var.getEdgeToEdgeSupportMode());
        this.f27266s.setDrawNavigationBar(f2Var.drawEdgeNavigationBar());
        f2Var.setInPreviewMode(false);
        f2Var.setInMenuMode(false);
        try {
            Activity activity = this.Q0;
            if (k6.x0(null, k6.f28128s8, false) != -1 && (!f2Var.hasForceLightStatusBar() || k6.D0().q())) {
                z9 = false;
            }
            org.telegram.messenger.g0.p3(activity, z9);
        } catch (Exception unused2) {
        }
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public final boolean s(Menu menu) {
        if (!this.U0.isEmpty() && ((f2) rf.b.g(1, this.U0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.H0 = view;
    }

    @Override
    public void setDelegate(n4 n4Var) {
        this.P0 = n4Var;
    }

    @Override
    public void setDrawerLayoutContainer(n3 n3Var) {
        this.f27278y = n3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i7) {
        w wVar = this.f27266s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i7);
        }
    }

    @Override
    public void setFragmentStack(List<f2> list) {
        this.U0 = list;
        d3 d3Var = this.E;
        if (d3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            d3Var.I.remove(oVar);
            d3Var.J.remove(oVar2);
            org.telegram.messenger.g0.E2(this.E);
            this.E = null;
        }
        boolean z9 = this.R0;
        Activity activity = this.Q0;
        if (z9) {
            d3 d3Var2 = new d3(activity, this);
            this.E = d3Var2;
            this.F = new r7(d3Var2);
            d3 d3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            d3Var3.I.add(oVar3);
            d3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            k3 k3Var = LaunchActivity.G1.f41292w0;
            if (k3Var != null) {
                k3Var.setTabsView(this.E);
            }
        }
        w wVar = this.f27274w;
        if (wVar != null) {
            org.telegram.messenger.g0.E2(wVar);
        }
        w wVar2 = new w(activity, this);
        this.f27274w = wVar2;
        addView(wVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f27274w.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.f27274w.setLayoutParams(layoutParams2);
        w wVar3 = this.f27266s;
        if (wVar3 != null) {
            org.telegram.messenger.g0.E2(wVar3);
        }
        w wVar4 = new w(activity, this);
        this.f27266s = wVar4;
        addView(wVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f27266s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f27266s.setLayoutParams(layoutParams3);
        w wVar5 = this.f27276x;
        if (wVar5 != null) {
            org.telegram.messenger.g0.E2(wVar5);
        }
        w wVar6 = new w(activity, this);
        this.f27276x = wVar6;
        this.f27246h1.f39855a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f27276x.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f27276x.setLayoutParams(layoutParams4);
        s sVar = this.G;
        if (sVar != null) {
            sVar.setParentLayout(this);
            s sVar2 = this.G;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f27276x) {
                org.telegram.messenger.g0.E2(view);
                this.f27276x.addView(view, ha.c(-1.0f, -1));
                this.f27276x.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        for (f2 f2Var : this.U0) {
            f2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Y0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z9) {
        this.f27240f = z9;
    }

    public void setInnerTranslationX(float f10) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f10;
        invalidate();
        if (this.U0.size() >= 2 && this.f27266s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.l(f10 / (org.telegram.messenger.g0.L(56.0f) * 6));
            } else {
                measuredWidth = f10 / this.f27266s.getMeasuredWidth();
            }
            f2 f2Var = (f2) rf.b.g(2, this.U0);
            f2Var.onSlideProgress(false, measuredWidth);
            f2 f2Var2 = (f2) rf.b.g(1, this.U0);
            float a10 = j9.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (f2Var2.isBeginToShow() && (navigationBarColor = f2Var2.getNavigationBarColor()) != (navigationBarColor2 = f2Var.getNavigationBarColor())) {
                f2Var2.setNavigationBarColor(i0.a.f(a10, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z9) {
        this.f27229b = z9;
    }

    @Override
    public void setNavigationBarColor(int i7) {
        boolean z9;
        if (this.f27265r1 != i7) {
            this.f27265r1 = i7;
            invalidate();
        }
        n3 n3Var = this.f27278y;
        if (n3Var != null) {
            n3Var.setInternalNavigationBarColor(i7);
        }
        d3 d3Var = this.E;
        if (d3Var != null) {
            if (!this.Q && !this.T) {
                z9 = true;
            } else {
                z9 = false;
            }
            d3Var.i(i7, z9);
        }
    }

    public void setOverrideWidthOffset(int i7) {
        this.Z0 = i7;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<c9> list) {
        this.V0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z9) {
        this.I0 = z9;
    }

    public void setThemeAnimationValue(float f10) {
        boolean z9;
        int alpha;
        this.f27267s0 = f10;
        for (int i7 = 0; i7 < this.f27257o0; i7++) {
            int f11 = i0.a.f(f10, this.m0[i7], this.f27256n0[i7]);
            ym ymVar = this.f27259p0;
            if (ymVar != null) {
                ymVar.i(this.f27253l0[i7], f11);
            } else {
                int i10 = this.f27253l0[i7];
                SparseIntArray sparseIntArray = k6.jm;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i10, f11);
                }
            }
        }
        ArrayList arrayList = this.f27245h0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i11);
            int[] iArr = (int[]) this.f27230b0.get(i11);
            int[] iArr2 = (int[]) this.f27233c0.get(i11);
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
                t6 t6Var = (t6) arrayList2.get(i12);
                int i15 = t6Var.f28534e;
                f6 f6Var = t6Var.f28542n;
                if (f6Var != null) {
                    f6Var.i(i15, argb);
                } else {
                    SparseIntArray sparseIntArray2 = k6.jm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i15, argb);
                    }
                }
                t6Var.e(argb, false, false);
                i12++;
                i11 = i14;
                arrayList = arrayList3;
                size = i13;
            }
            i11++;
        }
        ArrayList arrayList4 = this.f27249j0;
        int size3 = arrayList4.size();
        for (int i16 = 0; i16 < size3; i16++) {
            s6 s6Var = (s6) arrayList4.get(i16);
            if (s6Var != null) {
                s6Var.b();
                s6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.f27247i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i17 = 0; i17 < size4; i17++) {
                t6 t6Var2 = (t6) this.f27247i0.get(i17);
                t6Var2.e(k6.w0(t6Var2.f28534e, t6Var2.f28542n), false, false);
            }
        }
        vm vmVar = this.f27243g0;
        if (vmVar != null) {
            ym ymVar2 = vmVar.f50758a;
            ymVar2.G.f44038z0.invalidate();
            ymVar2.f52285t.K = f10;
            ymVar2.f52286u.K = f10;
            ymVar2.u(f10);
        }
        n4 n4Var = this.P0;
        if (n4Var != null) {
            n4Var.a(f10);
        }
        q6 q6Var = r6.f28474a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f10 < 1.0f && currentAnimationTimeMillis == r6.f28476c && f10 == r6.d) {
            if (getWindowToken() == null) {
                r6.d0(this, false);
            }
        } else {
            r6.f28476c = currentAnimationTimeMillis;
            r6.d = f10;
            if (f10 >= 1.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            r6.c0(this, z9);
        }
        F();
    }

    @Override
    public void setUseAlphaAnimations(boolean z9) {
        this.G0 = z9;
    }

    @Override
    public void setWindow(Window window) {
        this.f27232c = window;
    }

    public final f2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                f2 f2Var = (f2) getFragmentStack().get(size);
                if (f2Var != null && !f2Var.isFinishing() && !f2Var.isRemovingFromStack() && ce0.class.isInstance(f2Var)) {
                    return f2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final void v() {
        if (this.h || this.f27227a0) {
            if (this.W && this.E0 != null) {
                return;
            }
            Runnable runnable = this.f27237e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f27237e = null;
            }
            l(true, false);
        }
    }

    public final int w(boolean z9) {
        d3 d3Var;
        if (this.R0 && (d3Var = this.E) != null) {
            if (z9) {
                return (int) d3Var.G;
            }
            return d3Var.H;
        }
        return 0;
    }

    public final jx x() {
        Activity activity = this.Q0;
        if (activity == null) {
            return null;
        }
        if (this.G == null) {
            s sVar = new s(this);
            this.G = sVar;
            sVar.setParentLayout(this);
            s sVar2 = this.G;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f27276x) {
                org.telegram.messenger.g0.E2(view);
                this.f27276x.addView(view, ha.c(-1.0f, -1));
                this.f27276x.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.f27276x.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean y() {
        if (!this.h && !this.f27227a0) {
            return false;
        }
        return true;
    }

    @Override
    public void setHighlightActionButtons(boolean z9) {
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
