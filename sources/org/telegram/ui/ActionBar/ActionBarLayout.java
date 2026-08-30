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
import lh.p6;
import n7.qa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cz;
import org.telegram.ui.ng0;
import org.telegram.ui.sn;
import org.telegram.ui.vg0;
import org.telegram.ui.vn;
import org.telegram.ui.x80;
import org.telegram.ui.yh;
public class ActionBarLayout extends FrameLayout implements e5, zf.b {
    public static Drawable f19444m1;
    public static Drawable f19445n1;
    public static Paint f19446o1;
    public s A0;
    public n3 B;
    public float B0;
    public c5.j C;
    public long C0;
    public r D;
    public String D0;
    public p2 E;
    public int E0;
    public p2 F;
    public x80 F0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout G;
    public b5 G0;
    public AnimatorSet H;
    public final Activity H0;
    public final DecelerateInterpolator I;
    public final boolean I0;
    public final OvershootInterpolator J;
    public boolean J0;
    public final AccelerateDecelerateInterpolator K;
    public boolean K0;
    public float L;
    public List L0;
    public boolean M;
    public List M0;
    public boolean N;
    public final Rect N0;
    public int O;
    public boolean O0;
    public int P;
    public Runnable P0;
    public boolean Q;
    public int Q0;
    public VelocityTracker R;
    public boolean R0;
    public boolean S;
    public final Path S0;
    public boolean T;
    public final float[] T0;
    public boolean U;
    public boolean U0;
    public final ArrayList V;
    public final int[] V0;
    public final ArrayList W;
    public boolean W0;
    public int X0;
    public final org.telegram.ui.Components.z5 Y0;
    public boolean Z0;
    public boolean f19447a;
    public final qa f19448a0;
    public boolean f19449a1;
    public boolean f19450b;
    public g5 f19451b0;
    public boolean f19452b1;
    public Window f19453c;
    public g5 f19454c0;
    public float f19455c1;
    public Runnable d;
    public sn f19456d0;
    public boolean f19457d1;
    public Runnable e;
    public final ArrayList f19458e0;
    public AnimatorSet f19459e1;
    public boolean f19460f;
    public ArrayList f19461f0;
    public ArrayList f19462f1;
    public final ArrayList f19463g0;
    public final o f19464g1;
    public boolean h;
    public AnimatorSet f19465h0;
    public boolean f19466h1;
    public final AnimationNotificationsLocker f19467i0;
    public int f19468i1;
    public float f19469j0;
    public r0.m1 f19470j1;
    public boolean f19471k0;
    public i0.b f19472k1;
    public i6 f19473l0;
    public i0.b l1;
    public boolean m0;
    public boolean f19474n;
    public boolean f19475n0;
    public int f19476o0;
    public boolean f19477p0;
    public boolean f19478q0;
    public ColorDrawable f19479r;
    public boolean f19480r0;
    public w f19481s;
    public long f19482s0;
    public boolean f19483t0;
    public int f19484u0;
    public w v;
    public Runnable f19485v0;
    public w f19486w;
    public Runnable f19487w0;
    public y3 f19488x;
    public boolean f19489x0;
    public k f19490y;
    public View f19491y0;
    public boolean f19492z0;

    public ActionBarLayout(Context context, boolean z4) {
        super(context);
        this.I = new DecelerateInterpolator(1.5f);
        this.J = new OvershootInterpolator(1.02f);
        this.K = new AccelerateDecelerateInterpolator();
        this.V = new ArrayList();
        this.W = new ArrayList();
        qa qaVar = new qa(8);
        qaVar.f14702b = new SparseIntArray();
        qaVar.f14703c = new int[]{j6.Aa, j6.Da, j6.Ea, j6.Fa, j6.f19857ac, j6.Ca};
        this.f19448a0 = qaVar;
        this.f19458e0 = new ArrayList();
        this.f19463g0 = new ArrayList();
        this.f19467i0 = new AnimationNotificationsLocker();
        this.N0 = new Rect();
        this.Q0 = -1;
        this.S0 = new Path();
        this.T0 = new float[8];
        this.V0 = new int[2];
        this.Y0 = new org.telegram.ui.Components.z5(this, 280L, nr.h);
        this.f19462f1 = new ArrayList();
        this.f19464g1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.f19472k1 = bVar;
        this.l1 = bVar;
        this.H0 = (Activity) context;
        this.I0 = z4;
        if (f19445n1 == null) {
            f19445n1 = getResources().getDrawable(R.drawable.layer_shadow);
            f19444m1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f19446o1 = new Paint();
        }
        n nVar = new n(this, 1);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(this, nVar);
    }

    public static void E(ArrayList arrayList, View view) {
        if (view instanceof zf.b) {
            arrayList.addAll(((zf.b) view).B());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                E(arrayList, viewGroup.getChildAt(i10));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z4) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!z4) {
            if (actionBarLayout.L0.size() < 2) {
                actionBarLayout.h("onSlideAnimationEnd exit");
                return;
            }
            p2 p2Var = (p2) yh.k(1, actionBarLayout.L0);
            p2Var.prepareFragmentToSlide(true, false);
            p2Var.onPause();
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
            List list = actionBarLayout.L0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            w wVar = actionBarLayout.f19481s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.v;
            actionBarLayout.f19481s = wVar2;
            actionBarLayout.v = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view = actionBarLayout.f19486w;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.L0.size() > 0) {
                p2 p2Var2 = (p2) yh.k(1, actionBarLayout.L0);
                actionBarLayout.f19490y = p2Var2.actionBar;
                p2Var2.onResume();
                p2Var2.onBecomeFullyVisible();
                p2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.L0.size() >= 2) {
            ((p2) yh.k(1, actionBarLayout.L0)).prepareFragmentToSlide(true, false);
            p2 p2Var3 = (p2) yh.k(2, actionBarLayout.L0);
            p2Var3.prepareFragmentToSlide(false, false);
            p2Var3.onPause();
            View view2 = p2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                p2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(p2Var3.fragmentView);
            }
            k kVar = p2Var3.actionBar;
            if (kVar != null && kVar.H && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(p2Var3.actionBar);
            }
            p2Var3.detachSheets();
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.N = false;
        actionBarLayout.Q = false;
        actionBarLayout.f19481s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.f19481s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f10, float f11) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = AndroidUtilities.rectTmp2;
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
        if (!this.T && !this.Q) {
            return false;
        }
        return true;
    }

    @Override
    public final List B() {
        p2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof zf.b) {
                arrayList.addAll(((zf.b) lastFragment).B());
            }
            E(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public final int C() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.N0;
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
        if (this.f19449a1 && this.f19452b1) {
            return true;
        }
        return false;
    }

    public final void F(boolean z4) {
        H();
        K();
        Runnable runnable = this.d;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            if (z4) {
                animatorSet.cancel();
            }
            this.H = null;
        }
        s sVar = this.A0;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.A0 = null;
        }
        setAlpha(1.0f);
        this.f19481s.setAlpha(1.0f);
        this.f19481s.setScaleX(1.0f);
        this.f19481s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void G() {
        k kVar;
        if (!this.U && !this.N && !j() && !this.L0.isEmpty()) {
            a30 a30Var = a30.f23277a0;
            if (a30Var != null && a30Var.f23286w) {
                a30Var.e(false);
                return;
            }
            if (!e0() && (kVar = this.f19490y) != null && !kVar.s()) {
                k kVar2 = this.f19490y;
                if (kVar2.f20330k0) {
                    kVar2.h(true);
                    return;
                }
            }
            r rVar = this.D;
            if ((rVar == null || rVar.onBackPressed(true)) && ((p2) yh.k(1, this.L0)).onBackPressed(true) && !this.L0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final void H() {
        if (this.T && this.f19485v0 != null) {
            AnimatorSet animatorSet = this.H;
            if (animatorSet != null) {
                this.H = null;
                animatorSet.cancel();
            }
            this.T = false;
            this.U = false;
            this.f19482s0 = 0L;
            this.E = null;
            this.F = null;
            Runnable runnable = this.f19485v0;
            this.f19485v0 = null;
            if (runnable != null) {
                runnable.run();
            }
            i();
            i();
        }
    }

    public final void I(String str) {
        Runnable runnable = this.P0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        h(str);
    }

    public final void J() {
        for (p2 p2Var : this.L0) {
            p2Var.onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (this.T && (runnable = this.f19487w0) != null) {
            this.T = false;
            this.U = false;
            this.f19482s0 = 0L;
            this.E = null;
            this.F = null;
            this.f19487w0 = null;
            runnable.run();
            i();
        }
    }

    public final void L() {
        if (!this.L0.isEmpty()) {
            ((p2) yh.k(1, this.L0)).onPause();
        }
        r rVar = this.D;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void M() {
        if (!this.L0.isEmpty()) {
            ((p2) yh.k(1, this.L0)).onResume();
        }
        r rVar = this.D;
        if (rVar != null) {
            rVar.onResume();
        }
    }

    public final void N(Canvas canvas, ViewGroup viewGroup) {
        if (this.B != null && getHeight() < viewGroup.getHeight()) {
            canvas.save();
            canvas.translate(this.B.getX() + getX(), this.B.getY() + getY());
            this.B.draw(canvas);
            canvas.restore();
        }
    }

    public final void O() {
        this.M = false;
        this.N = true;
        this.v.setVisibility(0);
        this.S = false;
        p2 p2Var = (p2) yh.k(2, this.L0);
        View view = p2Var.fragmentView;
        if (view == null && (view = p2Var.performCreateView(this.H0)) != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
            n nVar = new n(p2Var, 0);
            WeakHashMap weakHashMap = r0.j0.f43118a;
            r0.b0.j(view, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            p2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.v.addView(view);
        this.v.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = p2Var.actionBar;
        if (kVar != null && kVar.H) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.f19492z0) {
                p2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(p2Var.actionBar);
        }
        p2Var.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
        p2Var.attachSheets(this.v);
        if (!p2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(j6.w0(null, j6.f19906d6, false));
        }
        p2Var.onResume();
        if (this.f19465h0 != null) {
            this.f19461f0 = p2Var.getThemeDescriptions();
        }
        this.f19481s.setLayerType(2, null);
        ((p2) yh.k(1, this.L0)).prepareFragmentToSlide(true, true);
        p2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(p2 p2Var) {
        return R(new c5(p2Var));
    }

    public final boolean Q(p2 p2Var, boolean z4) {
        c5 c5Var = new c5(p2Var);
        c5Var.f19550b = z4;
        return R(c5Var);
    }

    public final boolean R(org.telegram.ui.ActionBar.c5 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.R(org.telegram.ui.ActionBar.c5):boolean");
    }

    public final boolean S(p2 p2Var, boolean z4, boolean z10) {
        c5 c5Var = new c5(p2Var);
        c5Var.f19550b = z4;
        c5Var.f19551c = z10;
        c5Var.d = true;
        c5Var.e = false;
        return R(c5Var);
    }

    public final void T(p2 p2Var, boolean z4) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (p2Var == null) {
            return;
        }
        p2Var.onBecomeFullyHidden();
        p2Var.onPause();
        if (z4) {
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
            this.L0.remove(p2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = p2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                p2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(p2Var.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                    try {
                        viewGroup2.removeView(p2Var.fragmentView);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
            }
            k kVar = p2Var.actionBar;
            if (kVar != null && kVar.H && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(p2Var.actionBar);
            }
            p2Var.detachSheets();
        }
        this.v.setVisibility(4);
    }

    public final void U(boolean z4, boolean z10) {
        if (!this.T && !this.N) {
            int size = this.L0.size();
            if (!z4) {
                size--;
            }
            if (this.h) {
                size--;
            }
            for (int i10 = 0; i10 < size; i10++) {
                ((p2) this.L0.get(i10)).clearViews();
                ((p2) this.L0.get(i10)).setParentLayout(this);
            }
            b5 b5Var = this.G0;
            if (b5Var != null) {
                b5Var.b(this, z4);
            }
            if (z10) {
                c0();
                return;
            }
            return;
        }
        this.f19477p0 = true;
        this.f19478q0 = z4;
        this.f19480r0 = z10;
    }

    public final void V() {
        U(true, true);
    }

    public final void W() {
        this.f19481s.removeAllViews();
        this.v.removeAllViews();
        this.f19490y = null;
        this.E = null;
        this.F = null;
    }

    public final void X() {
        while (this.L0.size() > 0) {
            b0((p2) this.L0.get(0), false);
        }
        View view = this.f19491y0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Y(int i10) {
        if (i10 >= 0 && i10 < getFragmentStack().size()) {
            Z((p2) getFragmentStack().get(i10));
        }
    }

    public final void Z(p2 p2Var) {
        a0(p2Var, false);
    }

    public final void a0(p2 p2Var, boolean z4) {
        boolean z10 = true;
        if ((this.L0.size() > 0 && yh.k(1, this.L0) == p2Var) || (this.L0.size() > 1 && yh.k(2, this.L0) == p2Var)) {
            K();
            H();
        }
        h("removeFragmentFromStack " + z4);
        if (this.f19489x0 && this.L0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.G0 != null && this.L0.size() == 1 && AndroidUtilities.isTablet()) {
            this.G0.k(this);
        }
        b0(p2Var, (!p2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z4) ? false : false);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.m1 m1Var = this.f19470j1;
        if (m1Var != null) {
            o(view, m1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.W.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = ((l6) arrayList.get(i10)).b();
            }
        }
    }

    public final void b0(p2 p2Var, boolean z4) {
        if (!this.L0.contains(p2Var)) {
            return;
        }
        if (z4 && yh.k(1, this.L0) == p2Var) {
            p2Var.finishFragment();
        } else if (yh.k(1, this.L0) == p2Var && this.L0.size() > 1) {
            p2Var.finishFragment(false);
        } else {
            p2Var.onPause();
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
            this.L0.remove(p2Var);
            I("removeFragmentFromStackInternal " + z4);
        }
    }

    public final boolean c(int i10, p2 p2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        b5 b5Var = this.G0;
        if ((b5Var != null && !b5Var.h(p2Var, this)) || !p2Var.onFragmentCreate() || this.L0.contains(p2Var)) {
            return false;
        }
        p2Var.setParentLayout(this);
        Activity activity = this.H0;
        if (i10 != -1 && i10 != -2) {
            if (i10 == -3) {
                View view = p2Var.fragmentView;
                if (view == null) {
                    view = p2Var.performCreateView(activity);
                    if (view != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(p2Var, 0);
                        WeakHashMap weakHashMap = r0.j0.f43118a;
                        r0.b0.j(view, nVar);
                        this.f19481s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        p2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!p2Var.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(j6.w0(null, j6.f19906d6, false));
                }
                w wVar = this.f19481s;
                wVar.addView(view, Utilities.clamp(0, wVar.getChildCount(), 0), k7.b6.c(-1.0f, -1));
                this.f19481s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
                this.f19481s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
                k kVar = p2Var.actionBar;
                if (kVar != null && kVar.H) {
                    if (this.f19492z0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) p2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(p2Var.actionBar);
                    }
                    this.f19481s.addView(p2Var.actionBar);
                }
                p2Var.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
                p2Var.attachSheets(this.f19481s);
                i10 = 0;
            }
            this.L0.add(i10, p2Var);
            I("addFragmentToStack");
        } else {
            if (!this.L0.isEmpty()) {
                p2 p2Var2 = (p2) yh.k(1, this.L0);
                p2Var2.onPause();
                k kVar2 = p2Var2.actionBar;
                if (kVar2 != null && kVar2.H && (viewGroup2 = (ViewGroup) kVar2.getParent()) != null) {
                    viewGroup2.removeView(p2Var2.actionBar);
                }
                View view2 = p2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    p2Var2.onRemoveFromParent();
                    viewGroup.removeView(p2Var2.fragmentView);
                }
                p2Var2.detachSheets();
            }
            this.L0.add(p2Var);
            if (i10 != -2) {
                View view3 = p2Var.fragmentView;
                if (view3 == null) {
                    view3 = p2Var.performCreateView(activity);
                    if (view3 != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(p2Var, 0);
                        WeakHashMap weakHashMap2 = r0.j0.f43118a;
                        r0.b0.j(view3, nVar2);
                        this.f19481s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        p2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!p2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(j6.w0(null, j6.f19906d6, false));
                }
                this.f19481s.addView(view3, k7.b6.c(-1.0f, -1));
                this.f19481s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
                this.f19481s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
                k kVar3 = p2Var.actionBar;
                if (kVar3 != null && kVar3.H) {
                    if (this.f19492z0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) p2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(p2Var.actionBar);
                    }
                    this.f19481s.addView(p2Var.actionBar);
                }
                p2Var.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
                p2Var.attachSheets(this.f19481s);
                p2Var.onResume();
                p2Var.onTransitionAnimationEnd(false, true);
                p2Var.onTransitionAnimationEnd(true, true);
                p2Var.onBecomeFullyVisible();
            }
            I("addFragmentToStack " + i10);
        }
        if (!this.f19489x0) {
            setVisibility(0);
            View view4 = this.f19491y0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.L0.isEmpty()) {
            int size = this.L0.size() - 1;
            if (!this.L0.isEmpty()) {
                if (this.L0.isEmpty() || this.L0.size() - 1 != size || ((p2) this.L0.get(size)).fragmentView == null) {
                    for (int i10 = 0; i10 < size; i10++) {
                        p2 p2Var = (p2) this.L0.get(i10);
                        k kVar = p2Var.actionBar;
                        if (kVar != null && kVar.H && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                            viewGroup2.removeView(p2Var.actionBar);
                        }
                        View view = p2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            p2Var.onPause();
                            p2Var.onRemoveFromParent();
                            viewGroup.removeView(p2Var.fragmentView);
                        }
                    }
                    p2 p2Var2 = (p2) this.L0.get(size);
                    p2Var2.setParentLayout(this);
                    View view2 = p2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = p2Var2.performCreateView(this.H0);
                        if (view2 != null && p2Var2.isSupportEdgeToEdge() && p2Var2.drawEdgeNavigationBar()) {
                            n nVar = new n(p2Var2, 0);
                            WeakHashMap weakHashMap = r0.j0.f43118a;
                            r0.b0.j(view2, nVar);
                            this.f19481s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            p2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f19481s.addView(view2, k7.b6.c(-1.0f, -1));
                    this.f19481s.setShouldHandleBottomInsets(p2Var2.getEdgeToEdgeSupportMode());
                    this.f19481s.setDrawNavigationBar(p2Var2.drawEdgeNavigationBar());
                    k kVar2 = p2Var2.actionBar;
                    if (kVar2 != null && kVar2.H) {
                        if (this.f19492z0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(p2Var2.actionBar);
                        this.f19481s.addView(p2Var2.actionBar);
                    }
                    p2Var2.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
                    p2Var2.attachSheets(this.f19481s);
                    p2Var2.onResume();
                    p2Var2.onBecomeFullyVisible();
                    this.f19490y = p2Var2.actionBar;
                    if (!p2Var2.hasOwnBackground && view2.getBackground() == null) {
                        view2.setBackgroundColor(j6.w0(null, j6.f19906d6, false));
                    }
                }
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f19458e0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.V.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                l6 l6Var = (l6) arrayList.get(i10);
                iArr[i10] = l6Var.b();
                k6 k6Var = l6Var.h;
                l6Var.h = null;
                if (k6Var != null) {
                    ArrayList arrayList2 = this.f19463g0;
                    if (!arrayList2.contains(k6Var)) {
                        arrayList2.add(k6Var);
                    }
                }
            }
        }
    }

    public final void d0(boolean z4, boolean z10, boolean z11) {
        if (z10) {
            this.B0 = 0.0f;
            this.C0 = System.nanoTime() / 1000000;
        }
        s sVar = new s(this, z10, z11, z4);
        this.A0 = sVar;
        AndroidUtilities.runOnUIThread(sVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.B != null && v(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.B.getMeasuredHeight() + this.f19472k1.d), getWidth(), getHeight(), this.B.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.R0 = true;
        if (this.J0) {
            canvas2.save();
            float dp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.S0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.J0) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            b5 b5Var = this.G0;
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

    public final void e(boolean z4) {
        p2 p2Var;
        int i10;
        Animator customSlideTransition;
        int i11;
        int i12;
        if (!this.L0.isEmpty()) {
            p2Var = (p2) yh.k(1, this.L0);
        } else {
            p2Var = null;
        }
        if (p2Var == null) {
            return;
        }
        float x10 = this.f19481s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = p2Var.shouldOverrideSlideTransition(false, z4);
        Property property = View.TRANSLATION_X;
        if (!z4) {
            x10 = Math.abs(this.f19481s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f19481s.getMeasuredWidth()) * x10);
            if (D()) {
                i11 = 380;
            } else {
                i11 = 50;
            }
            int max = Math.max(measuredWidth, i11);
            if (!shouldOverrideSlideTransition) {
                w wVar = this.f19481s;
                int measuredWidth2 = wVar.getMeasuredWidth();
                if (this.f19449a1) {
                    i12 = AndroidUtilities.dp(56.0f);
                } else {
                    i12 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wVar, property, measuredWidth2 + i12);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f19481s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(nr.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f19481s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 320;
            } else {
                i10 = 120;
            }
            int max2 = Math.max(measuredWidth3, i10);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f19481s, property, 0.0f);
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(nr.h);
                }
            }
        }
        Animator customSlideTransition2 = p2Var.getCustomSlideTransition(false, z4, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        p2 p2Var2 = (p2) yh.k(2, this.L0);
        if (p2Var2 != null && (customSlideTransition = p2Var2.getCustomSlideTransition(false, z4, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z4));
        this.f19459e1 = animatorSet;
        animatorSet.start();
        this.Q = true;
    }

    public final boolean e0() {
        p2 p2Var;
        if (!this.L0.isEmpty()) {
            p2Var = (p2) yh.k(1, this.L0);
        } else {
            p2Var = null;
        }
        if (p2Var != null && p2Var.getLastStoryViewer() != null && p2Var.getLastStoryViewer().attachedToParent()) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.ui.ActionBar.d5 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.d5, java.lang.Runnable):void");
    }

    public final void g(i6 i6Var, int i10, boolean z4, boolean z10, Runnable runnable) {
        f(new d5(i6Var, i10, z4, z10), runnable);
    }

    @Override
    public p2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (p2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public g3 getBottomSheet() {
        return null;
    }

    public n3 getBottomSheetTabs() {
        return this.B;
    }

    public float getCurrentPreviewFragmentAlpha() {
        w wVar;
        if (!this.h && !this.U && !this.f19474n) {
            return 0.0f;
        }
        p2 p2Var = this.F;
        if (p2Var != null && p2Var.inPreviewMode) {
            wVar = this.v;
        } else {
            wVar = this.f19481s;
        }
        return wVar.getAlpha();
    }

    public y3 getDrawerLayoutContainer() {
        return this.f19488x;
    }

    @Override
    public List<p2> getFragmentStack() {
        return this.L0;
    }

    public float getInnerTranslationX() {
        return this.L;
    }

    @Override
    public p2 getLastFragment() {
        if (this.L0.isEmpty()) {
            return null;
        }
        return (p2) yh.k(1, this.L0);
    }

    public p2 getLastFragmentIncludeMainTabs() {
        p2 lastFragment = getLastFragment();
        if (lastFragment instanceof vg0) {
            return ((vg0) lastFragment).X();
        }
        return lastFragment;
    }

    @Override
    public g5 getMessageDrawableOutMediaStart() {
        return this.f19454c0;
    }

    @Override
    public g5 getMessageDrawableOutStart() {
        return this.f19451b0;
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
    public List<g9> getPulledDialogs() {
        return this.M0;
    }

    @Override
    public p2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                p2 p2Var = (p2) getFragmentStack().get(size);
                if (p2Var != null && !p2Var.isFinishing() && !p2Var.isRemovingFromStack()) {
                    return p2Var;
                }
            }
            return null;
        }
        return null;
    }

    public cz getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.f19469j0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f19453c;
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
            ArrayList arrayList = this.f19462f1;
            StringBuilder f10 = vh.v2.f(str, " ");
            f10.append(this.L0.size());
            arrayList.add(0, f10.toString());
            if (this.f19462f1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.f19462f1.get(i10));
                }
                this.f19462f1 = arrayList2;
            }
        }
        o oVar = this.f19464g1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.f19477p0) {
            U(this.f19478q0, this.f19480r0);
            this.f19477p0 = false;
        } else if (this.f19471k0) {
            d5 d5Var = new d5(this.f19473l0, this.f19476o0, this.f19475n0, false);
            boolean z4 = this.m0;
            if (!z4) {
                d5Var.f19637g = z4;
                d5Var.f19636f = z4;
            }
            f(d5Var, null);
            this.f19473l0 = null;
            this.f19471k0 = false;
        }
    }

    public final boolean j() {
        if (this.U) {
            return false;
        }
        if (this.T && (this.f19482s0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.T;
    }

    public final void k(boolean z4) {
        l(z4, false);
    }

    public final void l(boolean z4, boolean z10) {
        boolean z11;
        p2 p2Var;
        boolean z12;
        boolean z13;
        p2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            b5 b5Var = this.G0;
            if ((b5Var == null || b5Var.k(this)) && !j() && !this.L0.isEmpty()) {
                Activity activity = this.H0;
                if (activity.getCurrentFocus() != null) {
                    AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z10 && (this.h || this.U || (z4 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p2 p2Var2 = (p2) yh.k(1, this.L0);
                AnimatorSet animatorSet = null;
                if (this.L0.size() > 1) {
                    p2Var = (p2) yh.k(2, this.L0);
                } else {
                    p2Var = null;
                }
                if (p2Var != null) {
                    if (j6.w0(null, j6.f20176s8, false) != -1 && (!p2Var.hasForceLightStatusBar() || j6.A0().q())) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    AndroidUtilities.setLightStatusBar(activity, z12);
                    w wVar = this.f19481s;
                    this.f19481s = this.v;
                    this.v = wVar;
                    p2Var.setParentLayout(this);
                    View view = p2Var.fragmentView;
                    if (view == null && (view = p2Var.performCreateView(activity)) != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(p2Var, 0);
                        WeakHashMap weakHashMap = r0.j0.f43118a;
                        r0.b0.j(view, nVar);
                        this.f19481s.invalidate();
                    }
                    if (!this.h) {
                        this.f19481s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            p2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        this.f19481s.addView(view);
                        this.f19481s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
                        this.f19481s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        k kVar = p2Var.actionBar;
                        if (kVar != null && kVar.H) {
                            if (this.f19492z0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            AndroidUtilities.removeFromParent(p2Var.actionBar);
                            this.f19481s.addView(p2Var.actionBar);
                        }
                        p2Var.setTitleOverlayTextIfActionBarAttached(this.D0, this.E0, this.F0);
                        p2Var.attachSheets(this.f19481s);
                    }
                    this.E = p2Var;
                    this.F = p2Var2;
                    p2Var.onTransitionAnimationStart(true, true);
                    p2Var2.onTransitionAnimationStart(false, true);
                    p2Var.onResume();
                    if (this.f19465h0 != null) {
                        this.f19461f0 = p2Var.getThemeDescriptions();
                    }
                    this.f19490y = p2Var.actionBar;
                    if (!p2Var.hasOwnBackground && view.getBackground() == null) {
                        view.setBackgroundColor(j6.w0(null, j6.f19906d6, false));
                    }
                    if (z11) {
                        this.f19482s0 = System.currentTimeMillis();
                        this.T = true;
                        p2Var2.setRemovingFromStack(true);
                        this.f19485v0 = new p6(this, p2Var2, p2Var, 17);
                        if (!this.h && !this.U) {
                            animatorSet = p2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z14 = this.h;
                            if (!z14 && (this.f19481s.f20638b || this.v.f20638b)) {
                                w2 w2Var = new w2(this, 1);
                                this.d = w2Var;
                                AndroidUtilities.runOnUIThread(w2Var, 200L);
                            } else {
                                if (!z14 && !this.U) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                d0(false, true, z13);
                            }
                        } else {
                            this.H = animatorSet;
                            ic icVar = ic.f25665w;
                            if (icVar != null && icVar.f25674l) {
                                icVar.b();
                            }
                        }
                        I("closeLastFragment");
                    } else {
                        m(p2Var2);
                        p2Var2.onTransitionAnimationEnd(false, true);
                        p2Var.onTransitionAnimationEnd(true, true);
                        p2Var.onBecomeFullyVisible();
                    }
                } else if (this.f19489x0 && !z10) {
                    this.f19482s0 = System.currentTimeMillis();
                    this.T = true;
                    this.f19485v0 = new org.telegram.messenger.voip.b(10, this, p2Var2);
                    ArrayList arrayList = new ArrayList();
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.9f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.9f));
                    View view2 = this.f19491y0;
                    if (view2 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view2, property, 1.0f, 0.0f));
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.H = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.H.setInterpolator(this.K);
                    this.H.setDuration(200L);
                    this.H.addListener(new q(this, 0));
                    this.H.start();
                } else {
                    b0(p2Var2, false);
                    setVisibility(8);
                    View view3 = this.f19491y0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                p2Var2.onFragmentClosed();
            }
        }
    }

    public final void m(p2 p2Var) {
        p2Var.finishing = true;
        p2Var.onPause();
        p2Var.onFragmentDestroy();
        p2Var.setParentLayout(null);
        this.L0.remove(p2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.f19481s);
        w wVar = this.f19486w;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        I("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((p2) yh.k(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void o(View view, r0.m1 m1Var) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        View view2;
        int i17;
        r0.c1 y0Var;
        boolean z10 = this.J0;
        if (z10) {
            if ((view instanceof w) && ((w) view).f20645x) {
                int i18 = m1Var.f43130a.f(8).d;
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
                r0.m1 m1Var2 = r0.m1.f43129b;
                int i19 = Build.VERSION.SDK_INT;
                if (i19 >= 34) {
                    y0Var = new r0.b1(m1Var2);
                } else if (i19 >= 30) {
                    y0Var = new r0.a1(m1Var2);
                } else if (i19 >= 29) {
                    y0Var = new r0.z0(m1Var2);
                } else {
                    y0Var = new r0.y0(m1Var2);
                }
                y0Var.c(8, i0.b.b(0, 0, 0, max));
                r0.j0.b(view, y0Var.b());
                return;
            }
            r0.j0.b(view, r0.m1.f43129b);
            return;
        }
        boolean z11 = this.K0;
        boolean z12 = true;
        if (!z10 && !z11 && (getParent() instanceof RelativeLayout)) {
            z4 = true;
        } else {
            z4 = false;
        }
        i0.b bVar = this.f19472k1;
        i0.b bVar2 = this.l1;
        if (view instanceof n3) {
            if (z11) {
                i15 = 0;
            } else {
                i15 = bVar.f7213a;
            }
            if (z4) {
                i16 = 0;
            } else {
                i16 = bVar.f7215c;
            }
            AndroidUtilities.setViewLayoutMargins(view, i15, 0, i16, bVar.d);
        } else if (view instanceof w) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            w wVar = (w) view;
            int v = v(false);
            if (v > 0) {
                i10 = bVar.d + v;
            } else {
                i10 = 0;
            }
            z3 z3Var = wVar.f20644w;
            if (z3Var != z3.f20784c) {
                z12 = false;
            }
            if (!z12 && !z11) {
                i11 = bVar2.f7213a;
            } else {
                i11 = 0;
            }
            if (!z12 && !z4) {
                i12 = bVar2.f7215c;
            } else {
                i12 = 0;
            }
            if (z12 && !z11) {
                i13 = 0;
            } else {
                i13 = bVar2.f7213a;
            }
            if (z12 && !z4) {
                i14 = 0;
            } else {
                i14 = bVar2.f7215c;
            }
            if (z3Var == z3.f20782a) {
                i10 = Math.max(i10, bVar2.d);
                r0.j0.b(view, r0.m1.f43129b);
            } else {
                r0.j0.b(view, m1Var.f43130a.m(i13, 0, i14, i10));
            }
            view.setPadding(i11, 0, i12, i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19447a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.L0.isEmpty()) {
            int size = this.L0.size();
            for (int i10 = 0; i10 < size; i10++) {
                p2 p2Var = (p2) this.L0.get(i10);
                p2Var.onConfigurationChanged(configuration);
                Dialog dialog = p2Var.visibleDialog;
                if (dialog instanceof g3) {
                    ((g3) dialog).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19447a = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.Q && !j() && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        k kVar;
        z zVar;
        if (i10 == 82 && !j() && !this.N && (kVar = this.f19490y) != null && !kVar.s() && (zVar = kVar.B) != null) {
            int childCount = zVar.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.getVisibility() != 0) {
                        continue;
                    } else if (w0Var.q()) {
                        w0Var.M(null, null);
                        break;
                    } else if (w0Var.P) {
                        zVar.o(((Integer) w0Var.getTag()).intValue());
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
        p2 p2Var;
        boolean z4 = true;
        if (!this.L0.isEmpty()) {
            p2Var = (p2) yh.k(1, this.L0);
        } else {
            p2Var = null;
        }
        if (p2Var != null && !p2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            p2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, 1073741824));
            return;
        }
        b5 b5Var = this.G0;
        if (b5Var != null) {
            int[] iArr = this.V0;
            iArr[0] = i10;
            iArr[1] = i11;
            b5Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        if (C() <= AndroidUtilities.dp(20.0f)) {
            z4 = false;
        }
        this.U0 = z4;
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z4 = false;
        if (!j() && !this.f19483t0 && !this.Q && !this.f19449a1) {
            if (this.L0.size() > 1 && ((rVar = this.D) == null || rVar.getLastSheet() == null || !this.D.getLastSheet().isShown())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((p2) yh.k(1, this.L0)).isSwipeBackEnabled(motionEvent)) {
                        this.M = false;
                        this.N = false;
                        w wVar = this.f19481s;
                        if (wVar != null) {
                            wVar.setLayerType(0, null);
                            return false;
                        }
                    } else {
                        this.f19484u0 = motionEvent.getPointerId(0);
                        this.M = true;
                        this.O = (int) motionEvent.getX();
                        this.P = (int) motionEvent.getY();
                        VelocityTracker velocityTracker = this.R;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f19484u0) {
                    if (this.R == null) {
                        this.R = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.O));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.P);
                    this.R.addMovement(motionEvent);
                    if (!this.T && !this.h && this.M && !this.N && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                        if (((p2) yh.k(1, this.L0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.O = (int) motionEvent.getX();
                            O();
                        } else {
                            this.M = false;
                        }
                    } else if (this.N) {
                        if (!this.S) {
                            Activity activity = this.H0;
                            if (activity.getCurrentFocus() != null) {
                                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                            }
                            ((p2) yh.k(1, this.L0)).onBeginSlide();
                            this.S = true;
                        }
                        if (D()) {
                            float f10 = max;
                            this.f19481s.setTranslationX((f10 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                            setInnerTranslationX((f10 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        } else {
                            float f11 = max;
                            this.f19481s.setTranslationX(f11);
                            setInnerTranslationX(f11);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f19484u0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.R == null) {
                        this.R = VelocityTracker.obtain();
                    }
                    this.R.addMovement(motionEvent);
                    this.R.computeCurrentVelocity(1000);
                    p2 p2Var = (p2) yh.k(1, this.L0);
                    if (!this.h && !this.U && !this.N && p2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.R.getXVelocity();
                        float yVelocity = this.R.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && p2Var.canBeginSlide()) {
                            this.O = (int) motionEvent.getX();
                            O();
                            if (!this.S) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
                                }
                                this.S = true;
                            }
                        }
                    }
                    if (this.N) {
                        float x10 = this.f19481s.getX();
                        float xVelocity2 = this.R.getXVelocity();
                        float yVelocity2 = this.R.getYVelocity();
                        if (!D() ? x10 < this.f19481s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z4 = true;
                            }
                        }
                        e(z4);
                    } else {
                        this.M = false;
                        this.N = false;
                        w wVar2 = this.f19481s;
                        if (wVar2 != null) {
                            wVar2.setLayerType(0, null);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.R;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.R = null;
                    }
                } else if (motionEvent == null) {
                    this.M = false;
                    this.N = false;
                    w wVar3 = this.f19481s;
                    if (wVar3 != null) {
                        wVar3.setLayerType(0, null);
                    }
                    VelocityTracker velocityTracker3 = this.R;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.R = null;
                    }
                }
            }
            return this.N;
        }
        return false;
    }

    public final void p(Canvas canvas, int i10, int i11) {
        if (f19444m1 != null && SharedConfig.drawActionBarShadow) {
            int i12 = i10 / 2;
            if (f19444m1.getAlpha() != i12) {
                f19444m1.setAlpha(i12);
            }
            f19444m1.setBounds(0, i11, getMeasuredWidth(), f19444m1.getIntrinsicHeight() + i11);
            f19444m1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z4 = true;
        this.f19474n = true;
        this.h = false;
        p2 p2Var = (p2) yh.k(1, this.L0);
        p2Var.fragmentView.setOutlineProvider(null);
        p2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        p2Var.fragmentView.setLayoutParams(layoutParams);
        T((p2) yh.k(2, this.L0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(p2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(p2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new nr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new dg.y2(9, this, p2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f19481s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
        this.f19481s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
        p2Var.setInPreviewMode(false);
        p2Var.setInMenuMode(false);
        try {
            Activity activity = this.H0;
            if (j6.w0(null, j6.f20176s8, false) != -1 && (!p2Var.hasForceLightStatusBar() || j6.A0().q())) {
                z4 = false;
            }
            AndroidUtilities.setLightStatusBar(activity, z4);
        } catch (Exception unused2) {
        }
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public final boolean s(Menu menu) {
        if (!this.L0.isEmpty() && ((p2) yh.k(1, this.L0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.f19491y0 = view;
    }

    @Override
    public void setDelegate(b5 b5Var) {
        this.G0 = b5Var;
    }

    @Override
    public void setDrawerLayoutContainer(y3 y3Var) {
        this.f19488x = y3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i10) {
        w wVar = this.f19481s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<p2> list) {
        this.L0 = list;
        n3 n3Var = this.B;
        if (n3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            n3Var.F.remove(oVar);
            n3Var.G.remove(oVar2);
            AndroidUtilities.removeFromParent(this.B);
            this.B = null;
        }
        boolean z4 = this.I0;
        Activity activity = this.H0;
        if (z4) {
            n3 n3Var2 = new n3(activity, this);
            this.B = n3Var2;
            this.C = new c5.j(n3Var2);
            n3 n3Var3 = this.B;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            n3Var3.F.add(oVar3);
            n3Var3.G.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.B, layoutParams);
            w3 w3Var = LaunchActivity.D1.f31654v0;
            if (w3Var != null) {
                w3Var.setTabsView(this.B);
            }
        }
        w wVar = this.v;
        if (wVar != null) {
            AndroidUtilities.removeFromParent(wVar);
        }
        w wVar2 = new w(activity, this);
        this.v = wVar2;
        addView(wVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.v.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.v.setLayoutParams(layoutParams2);
        w wVar3 = this.f19481s;
        if (wVar3 != null) {
            AndroidUtilities.removeFromParent(wVar3);
        }
        w wVar4 = new w(activity, this);
        this.f19481s = wVar4;
        addView(wVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f19481s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f19481s.setLayoutParams(layoutParams3);
        w wVar5 = this.f19486w;
        if (wVar5 != null) {
            AndroidUtilities.removeFromParent(wVar5);
        }
        w wVar6 = new w(activity, this);
        this.f19486w = wVar6;
        this.Y0.f31239a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f19486w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f19486w.setLayoutParams(layoutParams4);
        r rVar = this.D;
        if (rVar != null) {
            rVar.setParentLayout(this);
            r rVar2 = this.D;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f19486w) {
                AndroidUtilities.removeFromParent(view);
                this.f19486w.addView(view, k7.b6.c(-1.0f, -1));
                this.f19486w.setShouldHandleBottomInsets(this.D.getEdgeToEdgeSupportMode());
            }
            this.D.onResume();
            this.D.onBecomeFullyVisible();
        }
        for (p2 p2Var : this.L0) {
            p2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.P0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z4) {
        this.f19460f = z4;
    }

    public void setInnerTranslationX(float f10) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.L = f10;
        invalidate();
        if (this.L0.size() >= 2 && this.f19481s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.clamp01(f10 / (AndroidUtilities.dp(56.0f) * 6));
            } else {
                measuredWidth = f10 / this.f19481s.getMeasuredWidth();
            }
            p2 p2Var = (p2) yh.k(2, this.L0);
            p2Var.onSlideProgress(false, measuredWidth);
            p2 p2Var2 = (p2) yh.k(1, this.L0);
            float a2 = k7.n.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (p2Var2.isBeginToShow() && (navigationBarColor = p2Var2.getNavigationBarColor()) != (navigationBarColor2 = p2Var.getNavigationBarColor())) {
                p2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z4) {
        this.f19450b = z4;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        boolean z4;
        if (this.f19468i1 != i10) {
            this.f19468i1 = i10;
            invalidate();
        }
        y3 y3Var = this.f19488x;
        if (y3Var != null) {
            y3Var.setInternalNavigationBarColor(i10);
        }
        n3 n3Var = this.B;
        if (n3Var != null) {
            if (!this.N && !this.Q) {
                z4 = true;
            } else {
                z4 = false;
            }
            n3Var.i(i10, z4);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.Q0 = i10;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<g9> list) {
        this.M0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z4) {
        this.f19492z0 = z4;
    }

    public void setThemeAnimationValue(float f10) {
        this.f19469j0 = f10;
        ArrayList arrayList = this.f19458e0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i10);
            int[] iArr = (int[]) this.V.get(i10);
            int[] iArr2 = (int[]) this.W.get(i10);
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
                int argb = Color.argb(Math.min(255, (int) (((alpha - alpha2) * f10) + alpha2)), Math.min(255, (int) (((red - red2) * f10) + red2)), Math.min(255, (int) (((green - green2) * f10) + green2)), Math.min(255, (int) (((blue - blue2) * f10) + blue2)));
                l6 l6Var = (l6) arrayList2.get(i11);
                int i14 = l6Var.f20434f;
                f6 f6Var = l6Var.f20442o;
                if (f6Var != null) {
                    f6Var.K0(i14, argb);
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
        ArrayList arrayList4 = this.f19463g0;
        int size3 = arrayList4.size();
        for (int i15 = 0; i15 < size3; i15++) {
            k6 k6Var = (k6) arrayList4.get(i15);
            if (k6Var != null) {
                k6Var.b();
                k6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.f19461f0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                l6 l6Var2 = (l6) this.f19461f0.get(i16);
                l6Var2.d(j6.v0(l6Var2.f20434f, l6Var2.f20442o), false, false);
            }
        }
        sn snVar = this.f19456d0;
        if (snVar != null) {
            vn vnVar = snVar.f38410a;
            vnVar.S.f40193u0.invalidate();
            vnVar.F.I = f10;
            vnVar.G.I = f10;
            vnVar.k(f10);
        }
        b5 b5Var = this.G0;
        if (b5Var != null) {
            b5Var.a(f10);
        }
        x(this);
    }

    @Override
    public void setUseAlphaAnimations(boolean z4) {
        this.f19489x0 = z4;
    }

    @Override
    public void setWindow(Window window) {
        this.f19453c = window;
    }

    public final p2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                p2 p2Var = (p2) getFragmentStack().get(size);
                if (p2Var != null && !p2Var.isFinishing() && !p2Var.isRemovingFromStack() && ng0.class.isInstance(p2Var)) {
                    return p2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int v(boolean z4) {
        n3 n3Var;
        if (this.I0 && (n3Var = this.B) != null) {
            if (z4) {
                return (int) n3Var.D;
            }
            return n3Var.E;
        }
        return 0;
    }

    public final cz w() {
        Activity activity = this.H0;
        if (activity == null) {
            return null;
        }
        if (this.D == null) {
            r rVar = new r(this);
            this.D = rVar;
            rVar.setParentLayout(this);
            r rVar2 = this.D;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f19486w) {
                AndroidUtilities.removeFromParent(view);
                this.f19486w.addView(view, k7.b6.c(-1.0f, -1));
                this.f19486w.setShouldHandleBottomInsets(this.D.getEdgeToEdgeSupportMode());
                this.f19486w.setDrawNavigationBar(this.D.drawEdgeNavigationBar());
            }
            this.D.onResume();
            this.D.onBecomeFullyVisible();
        }
        return this.D;
    }

    public final boolean y() {
        if (!this.h && !this.U) {
            return false;
        }
        return true;
    }

    public final boolean z() {
        return this.J0;
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
    public void setHighlightActionButtons(boolean z4) {
    }
}
