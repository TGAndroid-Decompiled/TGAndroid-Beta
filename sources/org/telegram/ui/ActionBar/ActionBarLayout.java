package org.telegram.ui.ActionBar;

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
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.z20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gh0;
import org.telegram.ui.h90;
import org.telegram.ui.jz;
import org.telegram.ui.wn;
import org.telegram.ui.yg0;
import org.telegram.ui.zn;
public class ActionBarLayout extends FrameLayout implements e5, mg.b {
    public static Drawable f18384p1;
    public static Drawable f18385q1;
    public static Paint f18386r1;
    public boolean A0;
    public View B0;
    public boolean C0;
    public u D0;
    public p3 E;
    public float E0;
    public cf.c F;
    public long F0;
    public t G;
    public String G0;
    public o2 H;
    public int H0;
    public o2 I;
    public h90 I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public b5 J0;
    public AnimatorSet K;
    public final Activity K0;
    public final DecelerateInterpolator L;
    public final boolean L0;
    public final OvershootInterpolator M;
    public boolean M0;
    public final AccelerateDecelerateInterpolator N;
    public boolean N0;
    public float O;
    public List O0;
    public boolean P;
    public List P0;
    public boolean Q;
    public final Rect Q0;
    public int R;
    public boolean R0;
    public int S;
    public Runnable S0;
    public boolean T;
    public int T0;
    public VelocityTracker U;
    public boolean U0;
    public boolean V;
    public final Path V0;
    public boolean W;
    public final float[] W0;
    public boolean X0;
    public final int[] Y0;
    public boolean Z0;
    public boolean f18387a;
    public boolean f18388a0;
    public int f18389a1;
    public boolean f18390b;
    public final ArrayList f18391b0;
    public final org.telegram.ui.Components.c6 f18392b1;
    public Window f18393c;
    public final ArrayList f18394c0;
    public boolean f18395c1;
    public Runnable d;
    public final n7.a1 f18396d0;
    public boolean f18397d1;
    public Runnable e;
    public g5 f18398e0;
    public boolean f18399e1;
    public boolean f18400f;
    public g5 f18401f0;
    public float f18402f1;
    public wn f18403g0;
    public boolean f18404g1;
    public boolean h;
    public final ArrayList f18405h0;
    public AnimatorSet f18406h1;
    public ArrayList f18407i0;
    public ArrayList f18408i1;
    public final ArrayList f18409j0;
    public final o f18410j1;
    public AnimatorSet f18411k0;
    public boolean f18412k1;
    public final AnimationNotificationsLocker f18413l0;
    public int l1;
    public float m0;
    public r0.l1 f18414m1;
    public boolean f18415n;
    public boolean f18416n0;
    public i0.b f18417n1;
    public i6 f18418o0;
    public i0.b f18419o1;
    public boolean f18420p0;
    public boolean f18421q0;
    public ColorDrawable f18422r;
    public int f18423r0;
    public x f18424s;
    public boolean f18425s0;
    public boolean f18426t0;
    public boolean f18427u0;
    public x v;
    public long f18428v0;
    public x f18429w;
    public boolean f18430w0;
    public a4 f18431x;
    public int f18432x0;
    public k f18433y;
    public Runnable f18434y0;
    public Runnable f18435z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.f18391b0 = new ArrayList();
        this.f18394c0 = new ArrayList();
        n7.a1 a1Var = new n7.a1(1);
        a1Var.f15118b = new SparseIntArray();
        a1Var.f15119c = new int[]{j6.Aa, j6.Da, j6.Ea, j6.Fa, j6.f18811ac, j6.Ca};
        this.f18396d0 = a1Var;
        this.f18405h0 = new ArrayList();
        this.f18409j0 = new ArrayList();
        this.f18413l0 = new AnimationNotificationsLocker();
        this.Q0 = new Rect();
        this.T0 = -1;
        this.V0 = new Path();
        this.W0 = new float[8];
        this.Y0 = new int[2];
        this.f18392b1 = new org.telegram.ui.Components.c6(this, 280L, qr.h);
        this.f18408i1 = new ArrayList();
        this.f18410j1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.f18417n1 = bVar;
        this.f18419o1 = bVar;
        this.K0 = (Activity) context;
        this.L0 = z10;
        if (f18385q1 == null) {
            f18385q1 = getResources().getDrawable(R.drawable.layer_shadow);
            f18384p1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f18386r1 = new Paint();
        }
        p pVar = new p(this, 0);
        WeakHashMap weakHashMap = r0.i0.f41865a;
        r0.a0.j(this, pVar);
    }

    public static void E(ArrayList arrayList, View view) {
        if (view instanceof mg.b) {
            arrayList.addAll(((mg.b) view).z());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                E(arrayList, viewGroup.getChildAt(i10));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!z10) {
            if (actionBarLayout.O0.size() < 2) {
                actionBarLayout.h("onSlideAnimationEnd exit");
                return;
            }
            o2 o2Var = (o2) p6.g(1, actionBarLayout.O0);
            o2Var.prepareFragmentToSlide(true, false);
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            List list = actionBarLayout.O0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            x xVar = actionBarLayout.f18424s;
            xVar.setAlpha(1.0f);
            x xVar2 = actionBarLayout.v;
            actionBarLayout.f18424s = xVar2;
            actionBarLayout.v = xVar;
            actionBarLayout.bringChildToFront(xVar2);
            View view = actionBarLayout.f18429w;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.O0.size() > 0) {
                o2 o2Var2 = (o2) p6.g(1, actionBarLayout.O0);
                actionBarLayout.f18433y = o2Var2.actionBar;
                o2Var2.onResume();
                o2Var2.onBecomeFullyVisible();
                o2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.O0.size() >= 2) {
            ((o2) p6.g(1, actionBarLayout.O0)).prepareFragmentToSlide(true, false);
            o2 o2Var3 = (o2) p6.g(2, actionBarLayout.O0);
            o2Var3.prepareFragmentToSlide(false, false);
            o2Var3.onPause();
            View view2 = o2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                o2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(o2Var3.fragmentView);
            }
            k kVar = o2Var3.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(o2Var3.actionBar);
            }
            o2Var3.detachSheets();
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.Q = false;
        actionBarLayout.T = false;
        actionBarLayout.f18424s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.f18424s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f7, float f10) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = AndroidUtilities.rectTmp2;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f7, (int) f10)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (u10 = u((ViewGroup) childAt, f7 - rect.left, f10 - rect.top)) != null) {
                        return u10;
                    }
                }
            }
        }
        return null;
    }

    public static void x(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof a6) {
                ((a6) childAt).e();
            }
            if (childAt instanceof ViewGroup) {
                x((ViewGroup) childAt);
            }
        }
    }

    public final boolean A() {
        return this.M0;
    }

    public final boolean B() {
        if (!this.W && !this.T) {
            return false;
        }
        return true;
    }

    public final int C() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.Q0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return Math.max(0, ((height - i10) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        if (this.f18397d1 && this.f18399e1) {
            return true;
        }
        return false;
    }

    public final void F(boolean z10) {
        H();
        K();
        Runnable runnable = this.d;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            if (z10) {
                animatorSet.cancel();
            }
            this.K = null;
        }
        u uVar = this.D0;
        if (uVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uVar);
            this.D0 = null;
        }
        setAlpha(1.0f);
        this.f18424s.setAlpha(1.0f);
        this.f18424s.setScaleX(1.0f);
        this.f18424s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void G() {
        k kVar;
        if (!this.f18388a0 && !this.Q && !j() && !this.O0.isEmpty()) {
            z20 z20Var = z20.f30373d0;
            if (z20Var != null && z20Var.f30385w) {
                z20Var.e(false);
                return;
            }
            if (!e0() && (kVar = this.f18433y) != null && !kVar.s()) {
                k kVar2 = this.f18433y;
                if (kVar2.f19304n0) {
                    kVar2.h(true);
                    return;
                }
            }
            t tVar = this.G;
            if ((tVar == null || tVar.onBackPressed(true)) && ((o2) p6.g(1, this.O0)).onBackPressed(true) && !this.O0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final void H() {
        if (this.W && this.f18434y0 != null) {
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                this.K = null;
                animatorSet.cancel();
            }
            this.W = false;
            this.f18388a0 = false;
            this.f18428v0 = 0L;
            this.H = null;
            this.I = null;
            Runnable runnable = this.f18434y0;
            this.f18434y0 = null;
            if (runnable != null) {
                runnable.run();
            }
            i();
            i();
        }
    }

    public final void I(String str) {
        Runnable runnable = this.S0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        h(str);
    }

    public final void J() {
        for (o2 o2Var : this.O0) {
            o2Var.onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (this.W && (runnable = this.f18435z0) != null) {
            this.W = false;
            this.f18388a0 = false;
            this.f18428v0 = 0L;
            this.H = null;
            this.I = null;
            this.f18435z0 = null;
            runnable.run();
            i();
        }
    }

    public final void L() {
        if (!this.O0.isEmpty()) {
            ((o2) p6.g(1, this.O0)).onPause();
        }
        t tVar = this.G;
        if (tVar != null) {
            tVar.onPause();
        }
    }

    public final void M() {
        if (!this.O0.isEmpty()) {
            ((o2) p6.g(1, this.O0)).onResume();
        }
        t tVar = this.G;
        if (tVar != null) {
            tVar.onResume();
        }
    }

    public final void N(Canvas canvas, ViewGroup viewGroup) {
        if (this.E != null && getHeight() < viewGroup.getHeight()) {
            canvas.save();
            canvas.translate(this.E.getX() + getX(), this.E.getY() + getY());
            this.E.draw(canvas);
            canvas.restore();
        }
    }

    public final void O() {
        this.P = false;
        this.Q = true;
        this.v.setVisibility(0);
        this.V = false;
        o2 o2Var = (o2) p6.g(2, this.O0);
        View view = o2Var.fragmentView;
        if (view == null && (view = o2Var.performCreateView(this.K0)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
            n nVar = new n(o2Var);
            WeakHashMap weakHashMap = r0.i0.f41865a;
            r0.a0.j(view, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            o2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.v.addView(view);
        this.v.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = o2Var.actionBar;
        if (kVar != null && kVar.K) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.C0) {
                o2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(o2Var.actionBar);
        }
        o2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
        o2Var.attachSheets(this.v);
        if (!o2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(j6.w0(null, j6.f18862d6, false));
        }
        o2Var.onResume();
        if (this.f18411k0 != null) {
            this.f18407i0 = o2Var.getThemeDescriptions();
        }
        this.f18424s.setLayerType(2, null);
        ((o2) p6.g(1, this.O0)).prepareFragmentToSlide(true, true);
        o2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(o2 o2Var) {
        return R(new c5(o2Var));
    }

    public final boolean Q(o2 o2Var, boolean z10) {
        c5 c5Var = new c5(o2Var);
        c5Var.f18533b = z10;
        return R(c5Var);
    }

    public final boolean R(org.telegram.ui.ActionBar.c5 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.R(org.telegram.ui.ActionBar.c5):boolean");
    }

    public final boolean S(o2 o2Var, boolean z10, boolean z11) {
        c5 c5Var = new c5(o2Var);
        c5Var.f18533b = z10;
        c5Var.f18534c = z11;
        c5Var.d = true;
        c5Var.e = false;
        return R(c5Var);
    }

    public final void T(o2 o2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (o2Var == null) {
            return;
        }
        o2Var.onBecomeFullyHidden();
        o2Var.onPause();
        if (z10) {
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            this.O0.remove(o2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = o2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                o2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(o2Var.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                    try {
                        viewGroup2.removeView(o2Var.fragmentView);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
            }
            k kVar = o2Var.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(o2Var.actionBar);
            }
            o2Var.detachSheets();
        }
        this.v.setVisibility(4);
    }

    public final void U(boolean z10, boolean z11) {
        if (!this.W && !this.Q) {
            int size = this.O0.size();
            if (!z10) {
                size--;
            }
            if (this.h) {
                size--;
            }
            for (int i10 = 0; i10 < size; i10++) {
                ((o2) this.O0.get(i10)).clearViews();
                ((o2) this.O0.get(i10)).setParentLayout(this);
            }
            b5 b5Var = this.J0;
            if (b5Var != null) {
                b5Var.b(this, z10);
            }
            if (z11) {
                c0();
                return;
            }
            return;
        }
        this.f18425s0 = true;
        this.f18426t0 = z10;
        this.f18427u0 = z11;
    }

    public final void V() {
        U(true, true);
    }

    public final void W() {
        this.f18424s.removeAllViews();
        this.v.removeAllViews();
        this.f18433y = null;
        this.H = null;
        this.I = null;
    }

    public final void X() {
        while (this.O0.size() > 0) {
            b0((o2) this.O0.get(0), false);
        }
        View view = this.B0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Y(int i10) {
        if (i10 >= 0 && i10 < getFragmentStack().size()) {
            a0((o2) getFragmentStack().get(i10), false);
        }
    }

    public final void Z(o2 o2Var) {
        a0(o2Var, false);
    }

    public final void a0(o2 o2Var, boolean z10) {
        boolean z11 = true;
        if ((this.O0.size() > 0 && p6.g(1, this.O0) == o2Var) || (this.O0.size() > 1 && p6.g(2, this.O0) == o2Var)) {
            K();
            H();
        }
        h("removeFragmentFromStack " + z10);
        if (this.A0 && this.O0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.J0 != null && this.O0.size() == 1 && AndroidUtilities.isTablet()) {
            this.J0.k(this);
        }
        b0(o2Var, (!o2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) ? false : false);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.l1 l1Var = this.f18414m1;
        if (l1Var != null) {
            o(view, l1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f18394c0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = ((l6) arrayList.get(i10)).b();
            }
        }
    }

    public final void b0(o2 o2Var, boolean z10) {
        if (!this.O0.contains(o2Var)) {
            return;
        }
        if (z10 && p6.g(1, this.O0) == o2Var) {
            o2Var.finishFragment();
        } else if (p6.g(1, this.O0) == o2Var && this.O0.size() > 1) {
            o2Var.finishFragment(false);
        } else {
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            this.O0.remove(o2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i10, o2 o2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        b5 b5Var = this.J0;
        if ((b5Var != null && !b5Var.h(o2Var, this)) || !o2Var.onFragmentCreate() || this.O0.contains(o2Var)) {
            return false;
        }
        o2Var.setParentLayout(this);
        Activity activity = this.K0;
        if (i10 != -1 && i10 != -2) {
            if (i10 == -3) {
                View view = o2Var.fragmentView;
                if (view == null) {
                    view = o2Var.performCreateView(activity);
                    if (view != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(o2Var);
                        WeakHashMap weakHashMap = r0.i0.f41865a;
                        r0.a0.j(view, nVar);
                        this.f18424s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!o2Var.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(j6.w0(null, j6.f18862d6, false));
                }
                x xVar = this.f18424s;
                xVar.addView(view, Utilities.clamp(0, xVar.getChildCount(), 0), w7.x5.c(-1.0f, -1));
                this.f18424s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.f18424s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar = o2Var.actionBar;
                if (kVar != null && kVar.K) {
                    if (this.C0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(o2Var.actionBar);
                    }
                    this.f18424s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                o2Var.attachSheets(this.f18424s);
                i10 = 0;
            }
            this.O0.add(i10, o2Var);
            I("addFragmentToStack");
        } else {
            if (!this.O0.isEmpty()) {
                o2 o2Var2 = (o2) p6.g(1, this.O0);
                o2Var2.onPause();
                k kVar2 = o2Var2.actionBar;
                if (kVar2 != null && kVar2.K && (viewGroup2 = (ViewGroup) kVar2.getParent()) != null) {
                    viewGroup2.removeView(o2Var2.actionBar);
                }
                View view2 = o2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    o2Var2.onRemoveFromParent();
                    viewGroup.removeView(o2Var2.fragmentView);
                }
                o2Var2.detachSheets();
            }
            this.O0.add(o2Var);
            if (i10 != -2) {
                View view3 = o2Var.fragmentView;
                if (view3 == null) {
                    view3 = o2Var.performCreateView(activity);
                    if (view3 != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(o2Var);
                        WeakHashMap weakHashMap2 = r0.i0.f41865a;
                        r0.a0.j(view3, nVar2);
                        this.f18424s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!o2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(j6.w0(null, j6.f18862d6, false));
                }
                this.f18424s.addView(view3, w7.x5.c(-1.0f, -1));
                this.f18424s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.f18424s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar3 = o2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.C0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(o2Var.actionBar);
                    }
                    this.f18424s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                o2Var.attachSheets(this.f18424s);
                o2Var.onResume();
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var.onTransitionAnimationEnd(true, true);
                o2Var.onBecomeFullyVisible();
            }
            I("addFragmentToStack " + i10);
        }
        if (!this.A0) {
            setVisibility(0);
            View view4 = this.B0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.O0.isEmpty()) {
            int size = this.O0.size() - 1;
            if (!this.O0.isEmpty()) {
                if (this.O0.isEmpty() || this.O0.size() - 1 != size || ((o2) this.O0.get(size)).fragmentView == null) {
                    for (int i10 = 0; i10 < size; i10++) {
                        o2 o2Var = (o2) this.O0.get(i10);
                        k kVar = o2Var.actionBar;
                        if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                            viewGroup2.removeView(o2Var.actionBar);
                        }
                        View view = o2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            o2Var.onPause();
                            o2Var.onRemoveFromParent();
                            viewGroup.removeView(o2Var.fragmentView);
                        }
                    }
                    o2 o2Var2 = (o2) this.O0.get(size);
                    o2Var2.setParentLayout(this);
                    View view2 = o2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = o2Var2.performCreateView(this.K0);
                        if (view2 != null && o2Var2.isSupportEdgeToEdge() && o2Var2.drawEdgeNavigationBar()) {
                            n nVar = new n(o2Var2);
                            WeakHashMap weakHashMap = r0.i0.f41865a;
                            r0.a0.j(view2, nVar);
                            this.f18424s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            o2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f18424s.addView(view2, w7.x5.c(-1.0f, -1));
                    this.f18424s.setShouldHandleBottomInsets(o2Var2.getEdgeToEdgeSupportMode());
                    this.f18424s.setDrawNavigationBar(o2Var2.drawEdgeNavigationBar());
                    k kVar2 = o2Var2.actionBar;
                    if (kVar2 != null && kVar2.K) {
                        if (this.C0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(o2Var2.actionBar);
                        this.f18424s.addView(o2Var2.actionBar);
                    }
                    o2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                    o2Var2.attachSheets(this.f18424s);
                    o2Var2.onResume();
                    o2Var2.onBecomeFullyVisible();
                    this.f18433y = o2Var2.actionBar;
                    if (!o2Var2.hasOwnBackground && view2.getBackground() == null) {
                        view2.setBackgroundColor(j6.w0(null, j6.f18862d6, false));
                    }
                }
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f18405h0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f18391b0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                l6 l6Var = (l6) arrayList.get(i10);
                iArr[i10] = l6Var.b();
                k6 k6Var = l6Var.h;
                l6Var.h = null;
                if (k6Var != null) {
                    ArrayList arrayList2 = this.f18409j0;
                    if (!arrayList2.contains(k6Var)) {
                        arrayList2.add(k6Var);
                    }
                }
            }
        }
    }

    public final void d0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.E0 = 0.0f;
            this.F0 = System.nanoTime() / 1000000;
        }
        u uVar = new u(this, z11, z12, z10);
        this.D0 = uVar;
        AndroidUtilities.runOnUIThread(uVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E != null && v(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.f18417n1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.U0 = true;
        if (this.M0) {
            canvas2.save();
            float dp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.V0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.M0) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            b5 b5Var = this.J0;
            if ((b5Var != null && b5Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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
        o2 o2Var;
        int i10;
        Animator customSlideTransition;
        int i11;
        int i12;
        if (!this.O0.isEmpty()) {
            o2Var = (o2) p6.g(1, this.O0);
        } else {
            o2Var = null;
        }
        if (o2Var == null) {
            return;
        }
        float x10 = this.f18424s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = o2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x10 = Math.abs(this.f18424s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f18424s.getMeasuredWidth()) * x10);
            if (D()) {
                i11 = 380;
            } else {
                i11 = 50;
            }
            int max = Math.max(measuredWidth, i11);
            if (!shouldOverrideSlideTransition) {
                x xVar = this.f18424s;
                int measuredWidth2 = xVar.getMeasuredWidth();
                if (this.f18397d1) {
                    i12 = AndroidUtilities.dp(56.0f);
                } else {
                    i12 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xVar, property, measuredWidth2 + i12);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f18424s.getMeasuredWidth()).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(qr.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f18424s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 320;
            } else {
                i10 = 120;
            }
            int max2 = Math.max(measuredWidth3, i10);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18424s, property, 0.0f);
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(qr.h);
                }
            }
        }
        Animator customSlideTransition2 = o2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        o2 o2Var2 = (o2) p6.g(2, this.O0);
        if (o2Var2 != null && (customSlideTransition = o2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f18406h1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final boolean e0() {
        o2 o2Var;
        if (!this.O0.isEmpty()) {
            o2Var = (o2) p6.g(1, this.O0);
        } else {
            o2Var = null;
        }
        if (o2Var != null && o2Var.getLastStoryViewer() != null && o2Var.getLastStoryViewer().attachedToParent()) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.ui.ActionBar.d5 r14, java.lang.Runnable r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.d5, java.lang.Runnable):void");
    }

    public final void g(i6 i6Var, int i10, boolean z10, boolean z11, Runnable runnable) {
        f(new d5(i6Var, i10, z10, z11), runnable);
    }

    @Override
    public o2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (o2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public g3 getBottomSheet() {
        return null;
    }

    public p3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        x xVar;
        if (!this.h && !this.f18388a0 && !this.f18415n) {
            return 0.0f;
        }
        o2 o2Var = this.I;
        if (o2Var != null && o2Var.inPreviewMode) {
            xVar = this.v;
        } else {
            xVar = this.f18424s;
        }
        return xVar.getAlpha();
    }

    public a4 getDrawerLayoutContainer() {
        return this.f18431x;
    }

    @Override
    public List<o2> getFragmentStack() {
        return this.O0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override
    public o2 getLastFragment() {
        if (this.O0.isEmpty()) {
            return null;
        }
        return (o2) p6.g(1, this.O0);
    }

    public o2 getLastFragmentIncludeMainTabs() {
        o2 lastFragment = getLastFragment();
        if (lastFragment instanceof gh0) {
            return ((gh0) lastFragment).X();
        }
        return lastFragment;
    }

    @Override
    public g5 getMessageDrawableOutMediaStart() {
        return this.f18401f0;
    }

    @Override
    public g5 getMessageDrawableOutStart() {
        return this.f18398e0;
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
    public List<l9> getPulledDialogs() {
        return this.P0;
    }

    @Override
    public o2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                o2 o2Var = (o2) getFragmentStack().get(size);
                if (o2Var != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack()) {
                    return o2Var;
                }
            }
            return null;
        }
        return null;
    }

    public jz getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.m0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f18393c;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public final void h(String str) {
        if (BuildVars.DEBUG_VERSION) {
            ArrayList arrayList = this.f18408i1;
            StringBuilder g10 = w.f.g(str, " ");
            g10.append(this.O0.size());
            arrayList.add(0, g10.toString());
            if (this.f18408i1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.f18408i1.get(i10));
                }
                this.f18408i1 = arrayList2;
            }
        }
        o oVar = this.f18410j1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.f18425s0) {
            U(this.f18426t0, this.f18427u0);
            this.f18425s0 = false;
        } else if (this.f18416n0) {
            d5 d5Var = new d5(this.f18418o0, this.f18423r0, this.f18421q0, false);
            boolean z10 = this.f18420p0;
            if (!z10) {
                d5Var.f18590g = z10;
                d5Var.f18589f = z10;
            }
            f(d5Var, null);
            this.f18418o0 = null;
            this.f18416n0 = false;
        }
    }

    public final boolean j() {
        if (this.f18388a0) {
            return false;
        }
        if (this.W && (this.f18428v0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.W;
    }

    public final void k() {
        l(false, false);
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        o2 o2Var;
        boolean z13;
        boolean z14;
        o2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            b5 b5Var = this.J0;
            if ((b5Var == null || b5Var.k(this)) && !j() && !this.O0.isEmpty()) {
                Activity activity = this.K0;
                if (activity.getCurrentFocus() != null) {
                    AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.f18388a0 || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o2 o2Var2 = (o2) p6.g(1, this.O0);
                AnimatorSet animatorSet = null;
                if (this.O0.size() > 1) {
                    o2Var = (o2) p6.g(2, this.O0);
                } else {
                    o2Var = null;
                }
                if (o2Var != null) {
                    if (j6.w0(null, j6.f19139s8, false) != -1 && (!o2Var.hasForceLightStatusBar() || j6.A0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    AndroidUtilities.setLightStatusBar(activity, z13);
                    x xVar = this.f18424s;
                    this.f18424s = this.v;
                    this.v = xVar;
                    o2Var.setParentLayout(this);
                    View view = o2Var.fragmentView;
                    if (view == null && (view = o2Var.performCreateView(activity)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(o2Var);
                        WeakHashMap weakHashMap = r0.i0.f41865a;
                        r0.a0.j(view, nVar);
                        this.f18424s.invalidate();
                    }
                    if (!this.h) {
                        this.f18424s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            o2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        this.f18424s.addView(view);
                        this.f18424s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                        this.f18424s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        k kVar = o2Var.actionBar;
                        if (kVar != null && kVar.K) {
                            if (this.C0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            AndroidUtilities.removeFromParent(o2Var.actionBar);
                            this.f18424s.addView(o2Var.actionBar);
                        }
                        o2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                        o2Var.attachSheets(this.f18424s);
                    }
                    this.H = o2Var;
                    this.I = o2Var2;
                    o2Var.onTransitionAnimationStart(true, true);
                    o2Var2.onTransitionAnimationStart(false, true);
                    o2Var.onResume();
                    if (this.f18411k0 != null) {
                        this.f18407i0 = o2Var.getThemeDescriptions();
                    }
                    this.f18433y = o2Var.actionBar;
                    if (!o2Var.hasOwnBackground && view.getBackground() == null) {
                        view.setBackgroundColor(j6.w0(null, j6.f18862d6, false));
                    }
                    if (z12) {
                        this.f18428v0 = System.currentTimeMillis();
                        this.W = true;
                        o2Var2.setRemovingFromStack(true);
                        this.f18434y0 = new q(this, o2Var2, o2Var, 0);
                        if (!this.h && !this.f18388a0) {
                            animatorSet = o2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f18424s.f19663b || this.v.f19663b)) {
                                w2 w2Var = new w2(this, 1);
                                this.d = w2Var;
                                AndroidUtilities.runOnUIThread(w2Var, 200L);
                            } else {
                                if (!z15 && !this.f18388a0) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                d0(false, true, z14);
                            }
                        } else {
                            this.K = animatorSet;
                            oc ocVar = oc.f26695w;
                            if (ocVar != null && ocVar.f26704l) {
                                ocVar.b();
                            }
                        }
                        I("closeLastFragment");
                    } else {
                        m(o2Var2);
                        o2Var2.onTransitionAnimationEnd(false, true);
                        o2Var.onTransitionAnimationEnd(true, true);
                        o2Var.onBecomeFullyVisible();
                    }
                } else if (this.A0 && !z11) {
                    this.f18428v0 = System.currentTimeMillis();
                    this.W = true;
                    this.f18434y0 = new m4.g0(22, this, o2Var2);
                    ArrayList arrayList = new ArrayList();
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.9f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.9f));
                    View view2 = this.B0;
                    if (view2 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view2, property, 1.0f, 0.0f));
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.K = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.K.setInterpolator(this.N);
                    this.K.setDuration(200L);
                    this.K.addListener(new s(this, 0));
                    this.K.start();
                } else {
                    b0(o2Var2, false);
                    setVisibility(8);
                    View view3 = this.B0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                o2Var2.onFragmentClosed();
            }
        }
    }

    public final void m(o2 o2Var) {
        o2Var.finishing = true;
        o2Var.onPause();
        o2Var.onFragmentDestroy();
        o2Var.setParentLayout(null);
        this.O0.remove(o2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.f18424s);
        x xVar = this.f18429w;
        if (xVar != null) {
            bringChildToFront(xVar);
        }
        I("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((o2) p6.g(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void o(View view, r0.l1 l1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        View view2;
        int i17;
        r0.b1 x0Var;
        boolean z11 = this.M0;
        if (z11) {
            if ((view instanceof x) && ((x) view).f19670x) {
                int i18 = l1Var.f41877a.f(8).d;
                if (getParent() instanceof View) {
                    view2 = (View) getParent();
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    i17 = Math.max(0, view2.getHeight() - getBottom());
                } else {
                    i17 = 0;
                }
                int max = Math.max(0, i18 - i17);
                r0.l1 l1Var2 = r0.l1.f41876b;
                int i19 = Build.VERSION.SDK_INT;
                if (i19 >= 34) {
                    x0Var = new r0.a1(l1Var2);
                } else if (i19 >= 30) {
                    x0Var = new r0.z0(l1Var2);
                } else if (i19 >= 29) {
                    x0Var = new r0.y0(l1Var2);
                } else {
                    x0Var = new r0.x0(l1Var2);
                }
                x0Var.c(8, i0.b.b(0, 0, 0, max));
                r0.i0.b(view, x0Var.b());
                return;
            }
            r0.i0.b(view, r0.l1.f41876b);
            return;
        }
        boolean z12 = this.N0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.b bVar = this.f18417n1;
        i0.b bVar2 = this.f18419o1;
        if (view instanceof p3) {
            if (z12) {
                i15 = 0;
            } else {
                i15 = bVar.f10591a;
            }
            if (z10) {
                i16 = 0;
            } else {
                i16 = bVar.f10593c;
            }
            AndroidUtilities.setViewLayoutMargins(view, i15, 0, i16, bVar.d);
        } else if (view instanceof x) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            x xVar = (x) view;
            int v = v(false);
            if (v > 0) {
                i10 = bVar.d + v;
            } else {
                i10 = 0;
            }
            b4 b4Var = xVar.f19669w;
            if (b4Var != b4.f18473c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i11 = bVar2.f10591a;
            } else {
                i11 = 0;
            }
            if (!z13 && !z10) {
                i12 = bVar2.f10593c;
            } else {
                i12 = 0;
            }
            if (z13 && !z12) {
                i13 = 0;
            } else {
                i13 = bVar2.f10591a;
            }
            if (z13 && !z10) {
                i14 = 0;
            } else {
                i14 = bVar2.f10593c;
            }
            if (b4Var == b4.f18471a) {
                i10 = Math.max(i10, bVar2.d);
                r0.i0.b(view, r0.l1.f41876b);
            } else {
                r0.i0.b(view, l1Var.f41877a.m(i13, 0, i14, i10));
            }
            view.setPadding(i11, 0, i12, i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18387a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.O0.isEmpty()) {
            int size = this.O0.size();
            for (int i10 = 0; i10 < size; i10++) {
                o2 o2Var = (o2) this.O0.get(i10);
                o2Var.onConfigurationChanged(configuration);
                Dialog dialog = o2Var.visibleDialog;
                if (dialog instanceof g3) {
                    ((g3) dialog).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18387a = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.T && !j() && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        k kVar;
        a0 a0Var;
        if (i10 == 82 && !j() && !this.Q && (kVar = this.f18433y) != null && !kVar.s() && (a0Var = kVar.E) != null) {
            int childCount = a0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = a0Var.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.getVisibility() != 0) {
                        continue;
                    } else if (w0Var.q()) {
                        w0Var.M(null, null);
                        break;
                    } else if (w0Var.S) {
                        a0Var.o(((Integer) w0Var.getTag()).intValue());
                        break;
                    }
                }
                i11++;
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        o2 o2Var;
        boolean z10 = true;
        if (!this.O0.isEmpty()) {
            o2Var = (o2) p6.g(1, this.O0);
        } else {
            o2Var = null;
        }
        if (o2Var != null && !o2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            o2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, 1073741824));
            return;
        }
        b5 b5Var = this.J0;
        if (b5Var != null) {
            int[] iArr = this.Y0;
            iArr[0] = i10;
            iArr[1] = i11;
            b5Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        if (C() <= AndroidUtilities.dp(20.0f)) {
            z10 = false;
        }
        this.X0 = z10;
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t tVar;
        boolean z10 = false;
        if (!j() && !this.f18430w0 && !this.T && !this.f18397d1) {
            if (this.O0.size() > 1 && ((tVar = this.G) == null || tVar.getLastSheet() == null || !this.G.getLastSheet().isShown())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((o2) p6.g(1, this.O0)).isSwipeBackEnabled(motionEvent)) {
                        this.P = false;
                        this.Q = false;
                        x xVar = this.f18424s;
                        if (xVar != null) {
                            xVar.setLayerType(0, null);
                            return false;
                        }
                    } else {
                        this.f18432x0 = motionEvent.getPointerId(0);
                        this.P = true;
                        this.R = (int) motionEvent.getX();
                        this.S = (int) motionEvent.getY();
                        VelocityTracker velocityTracker = this.U;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f18432x0) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.R));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.S);
                    this.U.addMovement(motionEvent);
                    if (!this.W && !this.h && this.P && !this.Q && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                        if (((o2) p6.g(1, this.O0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.R = (int) motionEvent.getX();
                            O();
                        } else {
                            this.P = false;
                        }
                    } else if (this.Q) {
                        if (!this.V) {
                            Activity activity = this.K0;
                            if (activity.getCurrentFocus() != null) {
                                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                            }
                            ((o2) p6.g(1, this.O0)).onBeginSlide();
                            this.V = true;
                        }
                        if (D()) {
                            float f7 = max;
                            this.f18424s.setTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                            setInnerTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        } else {
                            float f10 = max;
                            this.f18424s.setTranslationX(f10);
                            setInnerTranslationX(f10);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f18432x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    this.U.addMovement(motionEvent);
                    this.U.computeCurrentVelocity(1000);
                    o2 o2Var = (o2) p6.g(1, this.O0);
                    if (!this.h && !this.f18388a0 && !this.Q && o2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.U.getXVelocity();
                        float yVelocity = this.U.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && o2Var.canBeginSlide()) {
                            this.R = (int) motionEvent.getX();
                            O();
                            if (!this.V) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
                                }
                                this.V = true;
                            }
                        }
                    }
                    if (this.Q) {
                        float x10 = this.f18424s.getX();
                        float xVelocity2 = this.U.getXVelocity();
                        float yVelocity2 = this.U.getYVelocity();
                        if (!D() ? x10 < this.f18424s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.P = false;
                        this.Q = false;
                        x xVar2 = this.f18424s;
                        if (xVar2 != null) {
                            xVar2.setLayerType(0, null);
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
                    x xVar3 = this.f18424s;
                    if (xVar3 != null) {
                        xVar3.setLayerType(0, null);
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

    public final void p(Canvas canvas, int i10, int i11) {
        if (f18384p1 != null && SharedConfig.drawActionBarShadow) {
            int i12 = i10 / 2;
            if (f18384p1.getAlpha() != i12) {
                f18384p1.setAlpha(i12);
            }
            f18384p1.setBounds(0, i11, getMeasuredWidth(), f18384p1.getIntrinsicHeight() + i11);
            f18384p1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.f18415n = true;
        this.h = false;
        o2 o2Var = (o2) p6.g(1, this.O0);
        o2Var.fragmentView.setOutlineProvider(null);
        o2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        o2Var.fragmentView.setLayoutParams(layoutParams);
        T((o2) p6.g(2, this.O0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(o2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(o2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new qr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ai.z(12, this, o2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f18424s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
        this.f18424s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
        o2Var.setInPreviewMode(false);
        o2Var.setInMenuMode(false);
        try {
            Activity activity = this.K0;
            if (j6.w0(null, j6.f19139s8, false) != -1 && (!o2Var.hasForceLightStatusBar() || j6.A0().q())) {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(activity, z10);
        } catch (Exception unused2) {
        }
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final boolean s(Menu menu) {
        if (!this.O0.isEmpty() && ((o2) p6.g(1, this.O0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.B0 = view;
    }

    @Override
    public void setDelegate(b5 b5Var) {
        this.J0 = b5Var;
    }

    @Override
    public void setDrawerLayoutContainer(a4 a4Var) {
        this.f18431x = a4Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i10) {
        x xVar = this.f18424s;
        if (xVar != null) {
            xVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<o2> list) {
        this.O0 = list;
        p3 p3Var = this.E;
        if (p3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            p3Var.I.remove(oVar);
            p3Var.J.remove(oVar2);
            AndroidUtilities.removeFromParent(this.E);
            this.E = null;
        }
        boolean z10 = this.L0;
        Activity activity = this.K0;
        if (z10) {
            p3 p3Var2 = new p3(activity, this);
            this.E = p3Var2;
            this.F = new cf.c(p3Var2);
            p3 p3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            p3Var3.I.add(oVar3);
            p3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            y3 y3Var = LaunchActivity.G1.f30874y0;
            if (y3Var != null) {
                y3Var.setTabsView(this.E);
            }
        }
        x xVar = this.v;
        if (xVar != null) {
            AndroidUtilities.removeFromParent(xVar);
        }
        x xVar2 = new x(activity, this);
        this.v = xVar2;
        addView(xVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.v.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.v.setLayoutParams(layoutParams2);
        x xVar3 = this.f18424s;
        if (xVar3 != null) {
            AndroidUtilities.removeFromParent(xVar3);
        }
        x xVar4 = new x(activity, this);
        this.f18424s = xVar4;
        addView(xVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f18424s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f18424s.setLayoutParams(layoutParams3);
        x xVar5 = this.f18429w;
        if (xVar5 != null) {
            AndroidUtilities.removeFromParent(xVar5);
        }
        x xVar6 = new x(activity, this);
        this.f18429w = xVar6;
        this.f18392b1.f22935a = xVar6;
        addView(xVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f18429w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f18429w.setLayoutParams(layoutParams4);
        t tVar = this.G;
        if (tVar != null) {
            tVar.setParentLayout(this);
            t tVar2 = this.G;
            View view = tVar2.fragmentView;
            if (view == null) {
                view = tVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f18429w) {
                AndroidUtilities.removeFromParent(view);
                this.f18429w.addView(view, w7.x5.c(-1.0f, -1));
                this.f18429w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        for (o2 o2Var : this.O0) {
            o2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f18400f = z10;
    }

    public void setInnerTranslationX(float f7) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f7;
        invalidate();
        if (this.O0.size() >= 2 && this.f18424s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.clamp01(f7 / (AndroidUtilities.dp(56.0f) * 6));
            } else {
                measuredWidth = f7 / this.f18424s.getMeasuredWidth();
            }
            o2 o2Var = (o2) p6.g(2, this.O0);
            o2Var.onSlideProgress(false, measuredWidth);
            o2 o2Var2 = (o2) p6.g(1, this.O0);
            float a2 = w7.p.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (o2Var2.isBeginToShow() && (navigationBarColor = o2Var2.getNavigationBarColor()) != (navigationBarColor2 = o2Var.getNavigationBarColor())) {
                o2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f18390b = z10;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (this.l1 != i10) {
            this.l1 = i10;
            invalidate();
        }
        a4 a4Var = this.f18431x;
        if (a4Var != null) {
            a4Var.setInternalNavigationBarColor(i10);
        }
        p3 p3Var = this.E;
        if (p3Var != null) {
            if (!this.Q && !this.T) {
                z10 = true;
            } else {
                z10 = false;
            }
            p3Var.i(i10, z10);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.T0 = i10;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<l9> list) {
        this.P0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.C0 = z10;
    }

    public void setThemeAnimationValue(float f7) {
        this.m0 = f7;
        ArrayList arrayList = this.f18405h0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i10);
            int[] iArr = (int[]) this.f18391b0.get(i10);
            int[] iArr2 = (int[]) this.f18394c0.get(i10);
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                int red = Color.red(iArr2[i11]);
                int green = Color.green(iArr2[i11]);
                int blue = Color.blue(iArr2[i11]);
                int alpha = Color.alpha(iArr2[i11]);
                int red2 = Color.red(iArr[i11]);
                int green2 = Color.green(iArr[i11]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr[i11]);
                int i12 = size;
                int alpha2 = Color.alpha(iArr[i11]);
                int i13 = i10;
                int argb = Color.argb(Math.min(255, (int) (((alpha - alpha2) * f7) + alpha2)), Math.min(255, (int) (((red - red2) * f7) + red2)), Math.min(255, (int) (((green - green2) * f7) + green2)), Math.min(255, (int) (((blue - blue2) * f7) + blue2)));
                l6 l6Var = (l6) arrayList2.get(i11);
                int i14 = l6Var.f19383f;
                f6 f6Var = l6Var.f19391o;
                if (f6Var != null) {
                    f6Var.L0(i14, argb);
                } else {
                    SparseIntArray sparseIntArray = j6.sl;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i14, argb);
                    }
                }
                l6Var.d(argb, false, false);
                i11++;
                i10 = i13;
                arrayList = arrayList3;
                size = i12;
            }
            i10++;
        }
        ArrayList arrayList4 = this.f18409j0;
        int size3 = arrayList4.size();
        for (int i15 = 0; i15 < size3; i15++) {
            k6 k6Var = (k6) arrayList4.get(i15);
            if (k6Var != null) {
                k6Var.b();
                k6Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.f18407i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                l6 l6Var2 = (l6) this.f18407i0.get(i16);
                l6Var2.d(j6.v0(l6Var2.f19383f, l6Var2.f19391o), false, false);
            }
        }
        wn wnVar = this.f18403g0;
        if (wnVar != null) {
            zn znVar = wnVar.f39079a;
            znVar.V.f32502x0.invalidate();
            znVar.I.I = f7;
            znVar.J.I = f7;
            znVar.k(f7);
        }
        b5 b5Var = this.J0;
        if (b5Var != null) {
            b5Var.a(f7);
        }
        x(this);
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.A0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f18393c = window;
    }

    public final o2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                o2 o2Var = (o2) getFragmentStack().get(size);
                if (o2Var != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack() && yg0.class.isInstance(o2Var)) {
                    return o2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int v(boolean z10) {
        p3 p3Var;
        if (this.L0 && (p3Var = this.E) != null) {
            if (z10) {
                return (int) p3Var.G;
            }
            return p3Var.H;
        }
        return 0;
    }

    public final jz w() {
        Activity activity = this.K0;
        if (activity == null) {
            return null;
        }
        if (this.G == null) {
            t tVar = new t(this);
            this.G = tVar;
            tVar.setParentLayout(this);
            t tVar2 = this.G;
            View view = tVar2.fragmentView;
            if (view == null) {
                view = tVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f18429w) {
                AndroidUtilities.removeFromParent(view);
                this.f18429w.addView(view, w7.x5.c(-1.0f, -1));
                this.f18429w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.f18429w.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean y() {
        if (!this.h && !this.f18388a0) {
            return false;
        }
        return true;
    }

    @Override
    public final List z() {
        o2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof mg.b) {
                arrayList.addAll(((mg.b) lastFragment).z());
            }
            E(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public FrameLayout getOverlayContainerView() {
        return this;
    }

    @Override
    public ViewGroup getView() {
        return this;
    }

    @Override
    public void setHighlightActionButtons(boolean z10) {
    }
}
