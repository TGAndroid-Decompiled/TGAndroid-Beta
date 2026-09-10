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
import bi.u6;
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
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.f90;
import org.telegram.ui.fh0;
import org.telegram.ui.jz;
import org.telegram.ui.xg0;
import org.telegram.ui.yn;
public class ActionBarLayout extends FrameLayout implements f5, lg.b {
    public static Drawable f17466p1;
    public static Drawable f17467q1;
    public static Paint f17468r1;
    public boolean A0;
    public View B0;
    public boolean C0;
    public t D0;
    public q3 E;
    public float E0;
    public u6 F;
    public long F0;
    public s G;
    public String G0;
    public p2 H;
    public int H0;
    public p2 I;
    public f90 I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public c5 J0;
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
    public boolean f17469a;
    public boolean f17470a0;
    public int f17471a1;
    public boolean f17472b;
    public final ArrayList f17473b0;
    public final org.telegram.ui.Components.d6 f17474b1;
    public Window f17475c;
    public final ArrayList f17476c0;
    public boolean f17477c1;
    public Runnable d;
    public final og.u0 f17478d0;
    public boolean f17479d1;
    public Runnable e;
    public h5 f17480e0;
    public boolean f17481e1;
    public boolean f17482f;
    public h5 f17483f0;
    public float f17484f1;
    public yn f17485g0;
    public boolean f17486g1;
    public boolean h;
    public final ArrayList f17487h0;
    public AnimatorSet f17488h1;
    public ArrayList f17489i0;
    public ArrayList f17490i1;
    public final ArrayList f17491j0;
    public final p f17492j1;
    public AnimatorSet f17493k0;
    public boolean f17494k1;
    public final AnimationNotificationsLocker f17495l0;
    public int l1;
    public float m0;
    public r0.l1 f17496m1;
    public boolean f17497n;
    public boolean f17498n0;
    public i0.c f17499n1;
    public i6 f17500o0;
    public i0.c f17501o1;
    public boolean f17502p0;
    public boolean f17503q0;
    public ColorDrawable f17504r;
    public int f17505r0;
    public w f17506s;
    public boolean f17507s0;
    public boolean f17508t0;
    public boolean f17509u0;
    public w v;
    public long f17510v0;
    public w f17511w;
    public boolean f17512w0;
    public b4 f17513x;
    public int f17514x0;
    public l f17515y;
    public Runnable f17516y0;
    public Runnable f17517z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.f17473b0 = new ArrayList();
        this.f17476c0 = new ArrayList();
        og.u0 u0Var = new og.u0(1);
        u0Var.f14497b = new SparseIntArray();
        u0Var.f14498c = new int[]{j6.Aa, j6.Da, j6.Ea, j6.Fa, j6.f17877ac, j6.Ca};
        this.f17478d0 = u0Var;
        this.f17487h0 = new ArrayList();
        this.f17491j0 = new ArrayList();
        this.f17495l0 = new AnimationNotificationsLocker();
        this.Q0 = new Rect();
        this.T0 = -1;
        this.V0 = new Path();
        this.W0 = new float[8];
        this.Y0 = new int[2];
        this.f17474b1 = new org.telegram.ui.Components.d6(this, 280L, wr.h);
        this.f17490i1 = new ArrayList();
        this.f17492j1 = new p(this, 2);
        i0.c cVar = i0.c.e;
        this.f17499n1 = cVar;
        this.f17501o1 = cVar;
        this.K0 = (Activity) context;
        this.L0 = z10;
        if (f17467q1 == null) {
            f17467q1 = getResources().getDrawable(R.drawable.layer_shadow);
            f17466p1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f17468r1 = new Paint();
        }
        o oVar = new o(this, 1);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(this, oVar);
    }

    public static void E(ArrayList arrayList, View view) {
        if (view instanceof lg.b) {
            arrayList.addAll(((lg.b) view).z());
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
            p2 p2Var = (p2) r6.g(1, actionBarLayout.O0);
            p2Var.prepareFragmentToSlide(true, false);
            p2Var.onPause();
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
            List list = actionBarLayout.O0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            w wVar = actionBarLayout.f17506s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.v;
            actionBarLayout.f17506s = wVar2;
            actionBarLayout.v = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view = actionBarLayout.f17511w;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.O0.size() > 0) {
                p2 p2Var2 = (p2) r6.g(1, actionBarLayout.O0);
                actionBarLayout.f17515y = p2Var2.actionBar;
                p2Var2.onResume();
                p2Var2.onBecomeFullyVisible();
                p2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.O0.size() >= 2) {
            ((p2) r6.g(1, actionBarLayout.O0)).prepareFragmentToSlide(true, false);
            p2 p2Var3 = (p2) r6.g(2, actionBarLayout.O0);
            p2Var3.prepareFragmentToSlide(false, false);
            p2Var3.onPause();
            View view2 = p2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                p2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(p2Var3.fragmentView);
            }
            l lVar = p2Var3.actionBar;
            if (lVar != null && lVar.K && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                viewGroup.removeViewInLayout(p2Var3.actionBar);
            }
            p2Var3.detachSheets();
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.Q = false;
        actionBarLayout.T = false;
        actionBarLayout.f17506s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.f17506s.setLayerType(0, null);
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
        if (this.f17479d1 && this.f17481e1) {
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
        t tVar = this.D0;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
            this.D0 = null;
        }
        setAlpha(1.0f);
        this.f17506s.setAlpha(1.0f);
        this.f17506s.setScaleX(1.0f);
        this.f17506s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void G() {
        l lVar;
        if (!this.f17470a0 && !this.Q && !j() && !this.O0.isEmpty()) {
            j30 j30Var = j30.f24207d0;
            if (j30Var != null && j30Var.f24219w) {
                j30Var.e(false);
                return;
            }
            if (!e0() && (lVar = this.f17515y) != null && !lVar.s()) {
                l lVar2 = this.f17515y;
                if (lVar2.f18389n0) {
                    lVar2.h(true);
                    return;
                }
            }
            s sVar = this.G;
            if ((sVar == null || sVar.onBackPressed(true)) && ((p2) r6.g(1, this.O0)).onBackPressed(true) && !this.O0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final void H() {
        if (this.W && this.f17516y0 != null) {
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                this.K = null;
                animatorSet.cancel();
            }
            this.W = false;
            this.f17470a0 = false;
            this.f17510v0 = 0L;
            this.H = null;
            this.I = null;
            Runnable runnable = this.f17516y0;
            this.f17516y0 = null;
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
        for (p2 p2Var : this.O0) {
            p2Var.onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (this.W && (runnable = this.f17517z0) != null) {
            this.W = false;
            this.f17470a0 = false;
            this.f17510v0 = 0L;
            this.H = null;
            this.I = null;
            this.f17517z0 = null;
            runnable.run();
            i();
        }
    }

    public final void L() {
        if (!this.O0.isEmpty()) {
            ((p2) r6.g(1, this.O0)).onPause();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void M() {
        if (!this.O0.isEmpty()) {
            ((p2) r6.g(1, this.O0)).onResume();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onResume();
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
        p2 p2Var = (p2) r6.g(2, this.O0);
        View view = p2Var.fragmentView;
        if (view == null && (view = p2Var.performCreateView(this.K0)) != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
            o oVar = new o(p2Var, 0);
            WeakHashMap weakHashMap = r0.i0.f41062a;
            r0.a0.j(view, oVar);
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
        l lVar = p2Var.actionBar;
        if (lVar != null && lVar.K) {
            AndroidUtilities.removeFromParent(lVar);
            if (this.C0) {
                p2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(p2Var.actionBar);
        }
        p2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
        p2Var.attachSheets(this.v);
        if (!p2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(j6.w0(null, j6.f17928d6, false));
        }
        p2Var.onResume();
        if (this.f17493k0 != null) {
            this.f17489i0 = p2Var.getThemeDescriptions();
        }
        this.f17506s.setLayerType(2, null);
        ((p2) r6.g(1, this.O0)).prepareFragmentToSlide(true, true);
        p2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(p2 p2Var) {
        return R(new d5(p2Var));
    }

    public final boolean Q(p2 p2Var, boolean z10) {
        d5 d5Var = new d5(p2Var);
        d5Var.f17652b = z10;
        return R(d5Var);
    }

    public final boolean R(org.telegram.ui.ActionBar.d5 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.R(org.telegram.ui.ActionBar.d5):boolean");
    }

    public final boolean S(p2 p2Var, boolean z10, boolean z11) {
        d5 d5Var = new d5(p2Var);
        d5Var.f17652b = z10;
        d5Var.f17653c = z11;
        d5Var.d = true;
        d5Var.e = false;
        return R(d5Var);
    }

    public final void T(p2 p2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (p2Var == null) {
            return;
        }
        p2Var.onBecomeFullyHidden();
        p2Var.onPause();
        if (z10) {
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
            this.O0.remove(p2Var);
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
            }
            l lVar = p2Var.actionBar;
            if (lVar != null && lVar.K && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                viewGroup.removeViewInLayout(p2Var.actionBar);
            }
            p2Var.detachSheets();
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
                ((p2) this.O0.get(i10)).clearViews();
                ((p2) this.O0.get(i10)).setParentLayout(this);
            }
            c5 c5Var = this.J0;
            if (c5Var != null) {
                c5Var.b(this, z10);
            }
            if (z11) {
                c0();
                return;
            }
            return;
        }
        this.f17507s0 = true;
        this.f17508t0 = z10;
        this.f17509u0 = z11;
    }

    public final void V() {
        U(true, true);
    }

    public final void W() {
        this.f17506s.removeAllViews();
        this.v.removeAllViews();
        this.f17515y = null;
        this.H = null;
        this.I = null;
    }

    public final void X() {
        while (this.O0.size() > 0) {
            b0((p2) this.O0.get(0), false);
        }
        View view = this.B0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new p(this, 5)).start();
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

    public final void a0(p2 p2Var, boolean z10) {
        boolean z11 = true;
        if ((this.O0.size() > 0 && r6.g(1, this.O0) == p2Var) || (this.O0.size() > 1 && r6.g(2, this.O0) == p2Var)) {
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
        b0(p2Var, (!p2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) ? false : false);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.l1 l1Var = this.f17496m1;
        if (l1Var != null) {
            o(view, l1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f17476c0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = ((l6) arrayList.get(i10)).b();
            }
        }
    }

    public final void b0(p2 p2Var, boolean z10) {
        if (!this.O0.contains(p2Var)) {
            return;
        }
        if (z10 && r6.g(1, this.O0) == p2Var) {
            p2Var.finishFragment();
        } else if (r6.g(1, this.O0) == p2Var && this.O0.size() > 1) {
            p2Var.finishFragment(false);
        } else {
            p2Var.onPause();
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
            this.O0.remove(p2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i10, p2 p2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        c5 c5Var = this.J0;
        if ((c5Var != null && !c5Var.h(p2Var, this)) || !p2Var.onFragmentCreate() || this.O0.contains(p2Var)) {
            return false;
        }
        p2Var.setParentLayout(this);
        Activity activity = this.K0;
        if (i10 != -1 && i10 != -2) {
            if (i10 == -3) {
                View view = p2Var.fragmentView;
                if (view == null) {
                    view = p2Var.performCreateView(activity);
                    if (view != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
                        o oVar = new o(p2Var, 0);
                        WeakHashMap weakHashMap = r0.i0.f41062a;
                        r0.a0.j(view, oVar);
                        this.f17506s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        p2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!p2Var.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(j6.w0(null, j6.f17928d6, false));
                }
                w wVar = this.f17506s;
                wVar.addView(view, Utilities.clamp(0, wVar.getChildCount(), 0), w7.a6.c(-1.0f, -1));
                this.f17506s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
                this.f17506s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
                l lVar = p2Var.actionBar;
                if (lVar != null && lVar.K) {
                    if (this.C0) {
                        lVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) p2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(p2Var.actionBar);
                    }
                    this.f17506s.addView(p2Var.actionBar);
                }
                p2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                p2Var.attachSheets(this.f17506s);
                i10 = 0;
            }
            this.O0.add(i10, p2Var);
            I("addFragmentToStack");
        } else {
            if (!this.O0.isEmpty()) {
                p2 p2Var2 = (p2) r6.g(1, this.O0);
                p2Var2.onPause();
                l lVar2 = p2Var2.actionBar;
                if (lVar2 != null && lVar2.K && (viewGroup2 = (ViewGroup) lVar2.getParent()) != null) {
                    viewGroup2.removeView(p2Var2.actionBar);
                }
                View view2 = p2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    p2Var2.onRemoveFromParent();
                    viewGroup.removeView(p2Var2.fragmentView);
                }
                p2Var2.detachSheets();
            }
            this.O0.add(p2Var);
            if (i10 != -2) {
                View view3 = p2Var.fragmentView;
                if (view3 == null) {
                    view3 = p2Var.performCreateView(activity);
                    if (view3 != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
                        o oVar2 = new o(p2Var, 0);
                        WeakHashMap weakHashMap2 = r0.i0.f41062a;
                        r0.a0.j(view3, oVar2);
                        this.f17506s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        p2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!p2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(j6.w0(null, j6.f17928d6, false));
                }
                this.f17506s.addView(view3, w7.a6.c(-1.0f, -1));
                this.f17506s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
                this.f17506s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
                l lVar3 = p2Var.actionBar;
                if (lVar3 != null && lVar3.K) {
                    if (this.C0) {
                        lVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) p2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(p2Var.actionBar);
                    }
                    this.f17506s.addView(p2Var.actionBar);
                }
                p2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                p2Var.attachSheets(this.f17506s);
                p2Var.onResume();
                p2Var.onTransitionAnimationEnd(false, true);
                p2Var.onTransitionAnimationEnd(true, true);
                p2Var.onBecomeFullyVisible();
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
                if (this.O0.isEmpty() || this.O0.size() - 1 != size || ((p2) this.O0.get(size)).fragmentView == null) {
                    for (int i10 = 0; i10 < size; i10++) {
                        p2 p2Var = (p2) this.O0.get(i10);
                        l lVar = p2Var.actionBar;
                        if (lVar != null && lVar.K && (viewGroup2 = (ViewGroup) lVar.getParent()) != null) {
                            viewGroup2.removeView(p2Var.actionBar);
                        }
                        View view = p2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            p2Var.onPause();
                            p2Var.onRemoveFromParent();
                            viewGroup.removeView(p2Var.fragmentView);
                        }
                    }
                    p2 p2Var2 = (p2) this.O0.get(size);
                    p2Var2.setParentLayout(this);
                    View view2 = p2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = p2Var2.performCreateView(this.K0);
                        if (view2 != null && p2Var2.isSupportEdgeToEdge() && p2Var2.drawEdgeNavigationBar()) {
                            o oVar = new o(p2Var2, 0);
                            WeakHashMap weakHashMap = r0.i0.f41062a;
                            r0.a0.j(view2, oVar);
                            this.f17506s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            p2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f17506s.addView(view2, w7.a6.c(-1.0f, -1));
                    this.f17506s.setShouldHandleBottomInsets(p2Var2.getEdgeToEdgeSupportMode());
                    this.f17506s.setDrawNavigationBar(p2Var2.drawEdgeNavigationBar());
                    l lVar2 = p2Var2.actionBar;
                    if (lVar2 != null && lVar2.K) {
                        if (this.C0) {
                            lVar2.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(p2Var2.actionBar);
                        this.f17506s.addView(p2Var2.actionBar);
                    }
                    p2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                    p2Var2.attachSheets(this.f17506s);
                    p2Var2.onResume();
                    p2Var2.onBecomeFullyVisible();
                    this.f17515y = p2Var2.actionBar;
                    if (!p2Var2.hasOwnBackground && view2.getBackground() == null) {
                        view2.setBackgroundColor(j6.w0(null, j6.f17928d6, false));
                    }
                }
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f17487h0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f17473b0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                l6 l6Var = (l6) arrayList.get(i10);
                iArr[i10] = l6Var.b();
                k6 k6Var = l6Var.h;
                l6Var.h = null;
                if (k6Var != null) {
                    ArrayList arrayList2 = this.f17491j0;
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
        t tVar = new t(this, z11, z12, z10);
        this.D0 = tVar;
        AndroidUtilities.runOnUIThread(tVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E != null && v(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.f17499n1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
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
            c5 c5Var = this.J0;
            if ((c5Var != null && c5Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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
        p2 p2Var;
        int i10;
        Animator customSlideTransition;
        int i11;
        int i12;
        if (!this.O0.isEmpty()) {
            p2Var = (p2) r6.g(1, this.O0);
        } else {
            p2Var = null;
        }
        if (p2Var == null) {
            return;
        }
        float x10 = this.f17506s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = p2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x10 = Math.abs(this.f17506s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f17506s.getMeasuredWidth()) * x10);
            if (D()) {
                i11 = 380;
            } else {
                i11 = 50;
            }
            int max = Math.max(measuredWidth, i11);
            if (!shouldOverrideSlideTransition) {
                w wVar = this.f17506s;
                int measuredWidth2 = wVar.getMeasuredWidth();
                if (this.f17479d1) {
                    i12 = AndroidUtilities.dp(56.0f);
                } else {
                    i12 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wVar, property, measuredWidth2 + i12);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f17506s.getMeasuredWidth()).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(wr.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f17506s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 320;
            } else {
                i10 = 120;
            }
            int max2 = Math.max(measuredWidth3, i10);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f17506s, property, 0.0f);
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(wr.h);
                }
            }
        }
        Animator customSlideTransition2 = p2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        p2 p2Var2 = (p2) r6.g(2, this.O0);
        if (p2Var2 != null && (customSlideTransition = p2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f17488h1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final boolean e0() {
        p2 p2Var;
        if (!this.O0.isEmpty()) {
            p2Var = (p2) r6.g(1, this.O0);
        } else {
            p2Var = null;
        }
        if (p2Var != null && p2Var.getLastStoryViewer() != null && p2Var.getLastStoryViewer().attachedToParent()) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.ui.ActionBar.e5 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.e5, java.lang.Runnable):void");
    }

    public final void g(i6 i6Var, int i10, boolean z10, boolean z11, Runnable runnable) {
        f(new e5(i6Var, i10, z10, z11), runnable);
    }

    @Override
    public p2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (p2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public h3 getBottomSheet() {
        return null;
    }

    public q3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        w wVar;
        if (!this.h && !this.f17470a0 && !this.f17497n) {
            return 0.0f;
        }
        p2 p2Var = this.I;
        if (p2Var != null && p2Var.inPreviewMode) {
            wVar = this.v;
        } else {
            wVar = this.f17506s;
        }
        return wVar.getAlpha();
    }

    public b4 getDrawerLayoutContainer() {
        return this.f17513x;
    }

    @Override
    public List<p2> getFragmentStack() {
        return this.O0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override
    public p2 getLastFragment() {
        if (this.O0.isEmpty()) {
            return null;
        }
        return (p2) r6.g(1, this.O0);
    }

    public p2 getLastFragmentIncludeMainTabs() {
        p2 lastFragment = getLastFragment();
        if (lastFragment instanceof fh0) {
            return ((fh0) lastFragment).X();
        }
        return lastFragment;
    }

    @Override
    public h5 getMessageDrawableOutMediaStart() {
        return this.f17483f0;
    }

    @Override
    public h5 getMessageDrawableOutStart() {
        return this.f17480e0;
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
    public List<n9> getPulledDialogs() {
        return this.P0;
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

    public jz getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.m0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f17475c;
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
            ArrayList arrayList = this.f17490i1;
            StringBuilder g10 = w.f.g(str, " ");
            g10.append(this.O0.size());
            arrayList.add(0, g10.toString());
            if (this.f17490i1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.f17490i1.get(i10));
                }
                this.f17490i1 = arrayList2;
            }
        }
        p pVar = this.f17492j1;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 500L);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.f17507s0) {
            U(this.f17508t0, this.f17509u0);
            this.f17507s0 = false;
        } else if (this.f17498n0) {
            e5 e5Var = new e5(this.f17500o0, this.f17505r0, this.f17503q0, false);
            boolean z10 = this.f17502p0;
            if (!z10) {
                e5Var.f17686g = z10;
                e5Var.f17685f = z10;
            }
            f(e5Var, null);
            this.f17500o0 = null;
            this.f17498n0 = false;
        }
    }

    public final boolean j() {
        if (this.f17470a0) {
            return false;
        }
        if (this.W && (this.f17510v0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.W;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        p2 p2Var;
        boolean z13;
        boolean z14;
        p2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            c5 c5Var = this.J0;
            if ((c5Var == null || c5Var.k(this)) && !j() && !this.O0.isEmpty()) {
                Activity activity = this.K0;
                if (activity.getCurrentFocus() != null) {
                    AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.f17470a0 || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                p2 p2Var2 = (p2) r6.g(1, this.O0);
                AnimatorSet animatorSet = null;
                if (this.O0.size() > 1) {
                    p2Var = (p2) r6.g(2, this.O0);
                } else {
                    p2Var = null;
                }
                if (p2Var != null) {
                    if (j6.w0(null, j6.f18201s8, false) != -1 && (!p2Var.hasForceLightStatusBar() || j6.A0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    AndroidUtilities.setLightStatusBar(activity, z13);
                    w wVar = this.f17506s;
                    this.f17506s = this.v;
                    this.v = wVar;
                    p2Var.setParentLayout(this);
                    View view = p2Var.fragmentView;
                    if (view == null && (view = p2Var.performCreateView(activity)) != null && p2Var.isSupportEdgeToEdge() && p2Var.drawEdgeNavigationBar()) {
                        o oVar = new o(p2Var, 0);
                        WeakHashMap weakHashMap = r0.i0.f41062a;
                        r0.a0.j(view, oVar);
                        this.f17506s.invalidate();
                    }
                    if (!this.h) {
                        this.f17506s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            p2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        this.f17506s.addView(view);
                        this.f17506s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
                        this.f17506s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        l lVar = p2Var.actionBar;
                        if (lVar != null && lVar.K) {
                            if (this.C0) {
                                lVar.setOccupyStatusBar(false);
                            }
                            AndroidUtilities.removeFromParent(p2Var.actionBar);
                            this.f17506s.addView(p2Var.actionBar);
                        }
                        p2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                        p2Var.attachSheets(this.f17506s);
                    }
                    this.H = p2Var;
                    this.I = p2Var2;
                    p2Var.onTransitionAnimationStart(true, true);
                    p2Var2.onTransitionAnimationStart(false, true);
                    p2Var.onResume();
                    if (this.f17493k0 != null) {
                        this.f17489i0 = p2Var.getThemeDescriptions();
                    }
                    this.f17515y = p2Var.actionBar;
                    if (!p2Var.hasOwnBackground && view.getBackground() == null) {
                        view.setBackgroundColor(j6.w0(null, j6.f17928d6, false));
                    }
                    if (z12) {
                        this.f17510v0 = System.currentTimeMillis();
                        this.W = true;
                        p2Var2.setRemovingFromStack(true);
                        this.f17516y0 = new gg.a0(this, p2Var2, p2Var, 22);
                        if (!this.h && !this.f17470a0) {
                            animatorSet = p2Var2.onCustomTransitionAnimation(false, new p(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f17506s.f18675b || this.v.f18675b)) {
                                x2 x2Var = new x2(this, 1);
                                this.d = x2Var;
                                AndroidUtilities.runOnUIThread(x2Var, 200L);
                            } else {
                                if (!z15 && !this.f17470a0) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                d0(false, true, z14);
                            }
                        } else {
                            this.K = animatorSet;
                            pc pcVar = pc.f26074w;
                            if (pcVar != null && pcVar.f26083l) {
                                pcVar.b();
                            }
                        }
                        I("closeLastFragment");
                    } else {
                        m(p2Var2);
                        p2Var2.onTransitionAnimationEnd(false, true);
                        p2Var.onTransitionAnimationEnd(true, true);
                        p2Var.onBecomeFullyVisible();
                    }
                } else if (this.A0 && !z11) {
                    this.f17510v0 = System.currentTimeMillis();
                    this.W = true;
                    this.f17516y0 = new m4.w(25, this, p2Var2);
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
                    this.K.addListener(new r(this, 0));
                    this.K.start();
                } else {
                    b0(p2Var2, false);
                    setVisibility(8);
                    View view3 = this.B0;
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
        this.O0.remove(p2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.f17506s);
        w wVar = this.f17511w;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        I("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((p2) r6.g(1, fragmentStack)).dismissCurrentDialog();
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
            if ((view instanceof w) && ((w) view).f18682x) {
                int i18 = l1Var.f41074a.f(8).d;
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
                r0.l1 l1Var2 = r0.l1.f41073b;
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
                x0Var.c(8, i0.c.b(0, 0, 0, max));
                r0.i0.b(view, x0Var.b());
                return;
            }
            r0.i0.b(view, r0.l1.f41073b);
            return;
        }
        boolean z12 = this.N0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.c cVar = this.f17499n1;
        i0.c cVar2 = this.f17501o1;
        if (view instanceof q3) {
            if (z12) {
                i15 = 0;
            } else {
                i15 = cVar.f10074a;
            }
            if (z10) {
                i16 = 0;
            } else {
                i16 = cVar.f10076c;
            }
            AndroidUtilities.setViewLayoutMargins(view, i15, 0, i16, cVar.d);
        } else if (view instanceof w) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            w wVar = (w) view;
            int v = v(false);
            if (v > 0) {
                i10 = cVar.d + v;
            } else {
                i10 = 0;
            }
            c4 c4Var = wVar.f18681w;
            if (c4Var != c4.f17574c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i11 = cVar2.f10074a;
            } else {
                i11 = 0;
            }
            if (!z13 && !z10) {
                i12 = cVar2.f10076c;
            } else {
                i12 = 0;
            }
            if (z13 && !z12) {
                i13 = 0;
            } else {
                i13 = cVar2.f10074a;
            }
            if (z13 && !z10) {
                i14 = 0;
            } else {
                i14 = cVar2.f10076c;
            }
            if (c4Var == c4.f17572a) {
                i10 = Math.max(i10, cVar2.d);
                r0.i0.b(view, r0.l1.f41073b);
            } else {
                r0.i0.b(view, l1Var.f41074a.m(i13, 0, i14, i10));
            }
            view.setPadding(i11, 0, i12, i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17469a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.O0.isEmpty()) {
            int size = this.O0.size();
            for (int i10 = 0; i10 < size; i10++) {
                p2 p2Var = (p2) this.O0.get(i10);
                p2Var.onConfigurationChanged(configuration);
                Dialog dialog = p2Var.visibleDialog;
                if (dialog instanceof h3) {
                    ((h3) dialog).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17469a = false;
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
        l lVar;
        z zVar;
        if (i10 == 82 && !j() && !this.Q && (lVar = this.f17515y) != null && !lVar.s() && (zVar = lVar.E) != null) {
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
                    } else if (w0Var.S) {
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
        boolean z10 = true;
        if (!this.O0.isEmpty()) {
            p2Var = (p2) r6.g(1, this.O0);
        } else {
            p2Var = null;
        }
        if (p2Var != null && !p2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            p2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, 1073741824));
            return;
        }
        c5 c5Var = this.J0;
        if (c5Var != null) {
            int[] iArr = this.Y0;
            iArr[0] = i10;
            iArr[1] = i11;
            c5Var.e(iArr);
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
        s sVar;
        boolean z10 = false;
        if (!j() && !this.f17512w0 && !this.T && !this.f17479d1) {
            if (this.O0.size() > 1 && ((sVar = this.G) == null || sVar.getLastSheet() == null || !this.G.getLastSheet().isShown())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((p2) r6.g(1, this.O0)).isSwipeBackEnabled(motionEvent)) {
                        this.P = false;
                        this.Q = false;
                        w wVar = this.f17506s;
                        if (wVar != null) {
                            wVar.setLayerType(0, null);
                            return false;
                        }
                    } else {
                        this.f17514x0 = motionEvent.getPointerId(0);
                        this.P = true;
                        this.R = (int) motionEvent.getX();
                        this.S = (int) motionEvent.getY();
                        VelocityTracker velocityTracker = this.U;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f17514x0) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.R));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.S);
                    this.U.addMovement(motionEvent);
                    if (!this.W && !this.h && this.P && !this.Q && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                        if (((p2) r6.g(1, this.O0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
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
                            ((p2) r6.g(1, this.O0)).onBeginSlide();
                            this.V = true;
                        }
                        if (D()) {
                            float f7 = max;
                            this.f17506s.setTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                            setInnerTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        } else {
                            float f10 = max;
                            this.f17506s.setTranslationX(f10);
                            setInnerTranslationX(f10);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f17514x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    this.U.addMovement(motionEvent);
                    this.U.computeCurrentVelocity(1000);
                    p2 p2Var = (p2) r6.g(1, this.O0);
                    if (!this.h && !this.f17470a0 && !this.Q && p2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.U.getXVelocity();
                        float yVelocity = this.U.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && p2Var.canBeginSlide()) {
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
                        float x10 = this.f17506s.getX();
                        float xVelocity2 = this.U.getXVelocity();
                        float yVelocity2 = this.U.getYVelocity();
                        if (!D() ? x10 < this.f17506s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.P = false;
                        this.Q = false;
                        w wVar2 = this.f17506s;
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
                    w wVar3 = this.f17506s;
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

    public final void p(Canvas canvas, int i10, int i11) {
        if (f17466p1 != null && SharedConfig.drawActionBarShadow) {
            int i12 = i10 / 2;
            if (f17466p1.getAlpha() != i12) {
                f17466p1.setAlpha(i12);
            }
            f17466p1.setBounds(0, i11, getMeasuredWidth(), f17466p1.getIntrinsicHeight() + i11);
            f17466p1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.f17497n = true;
        this.h = false;
        p2 p2Var = (p2) r6.g(1, this.O0);
        p2Var.fragmentView.setOutlineProvider(null);
        p2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        p2Var.fragmentView.setLayoutParams(layoutParams);
        T((p2) r6.g(2, this.O0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(p2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(p2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new wr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new bi.u3(10, this, p2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f17506s.setShouldHandleBottomInsets(p2Var.getEdgeToEdgeSupportMode());
        this.f17506s.setDrawNavigationBar(p2Var.drawEdgeNavigationBar());
        p2Var.setInPreviewMode(false);
        p2Var.setInMenuMode(false);
        try {
            Activity activity = this.K0;
            if (j6.w0(null, j6.f18201s8, false) != -1 && (!p2Var.hasForceLightStatusBar() || j6.A0().q())) {
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
        if (!this.O0.isEmpty() && ((p2) r6.g(1, this.O0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.B0 = view;
    }

    @Override
    public void setDelegate(c5 c5Var) {
        this.J0 = c5Var;
    }

    @Override
    public void setDrawerLayoutContainer(b4 b4Var) {
        this.f17513x = b4Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i10) {
        w wVar = this.f17506s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<p2> list) {
        this.O0 = list;
        q3 q3Var = this.E;
        if (q3Var != null) {
            p pVar = new p(this, 0);
            p pVar2 = new p(this, 1);
            q3Var.I.remove(pVar);
            q3Var.J.remove(pVar2);
            AndroidUtilities.removeFromParent(this.E);
            this.E = null;
        }
        boolean z10 = this.L0;
        Activity activity = this.K0;
        if (z10) {
            q3 q3Var2 = new q3(activity, this);
            this.E = q3Var2;
            this.F = new u6(q3Var2);
            q3 q3Var3 = this.E;
            p pVar3 = new p(this, 0);
            p pVar4 = new p(this, 1);
            q3Var3.I.add(pVar3);
            q3Var3.J.add(pVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            z3 z3Var = LaunchActivity.G1.f29973y0;
            if (z3Var != null) {
                z3Var.setTabsView(this.E);
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
        w wVar3 = this.f17506s;
        if (wVar3 != null) {
            AndroidUtilities.removeFromParent(wVar3);
        }
        w wVar4 = new w(activity, this);
        this.f17506s = wVar4;
        addView(wVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f17506s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f17506s.setLayoutParams(layoutParams3);
        w wVar5 = this.f17511w;
        if (wVar5 != null) {
            AndroidUtilities.removeFromParent(wVar5);
        }
        w wVar6 = new w(activity, this);
        this.f17511w = wVar6;
        this.f17474b1.f22293a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f17511w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f17511w.setLayoutParams(layoutParams4);
        s sVar = this.G;
        if (sVar != null) {
            sVar.setParentLayout(this);
            s sVar2 = this.G;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f17511w) {
                AndroidUtilities.removeFromParent(view);
                this.f17511w.addView(view, w7.a6.c(-1.0f, -1));
                this.f17511w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        for (p2 p2Var : this.O0) {
            p2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f17482f = z10;
    }

    public void setInnerTranslationX(float f7) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f7;
        invalidate();
        if (this.O0.size() >= 2 && this.f17506s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.clamp01(f7 / (AndroidUtilities.dp(56.0f) * 6));
            } else {
                measuredWidth = f7 / this.f17506s.getMeasuredWidth();
            }
            p2 p2Var = (p2) r6.g(2, this.O0);
            p2Var.onSlideProgress(false, measuredWidth);
            p2 p2Var2 = (p2) r6.g(1, this.O0);
            float a2 = w7.q.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (p2Var2.isBeginToShow() && (navigationBarColor = p2Var2.getNavigationBarColor()) != (navigationBarColor2 = p2Var.getNavigationBarColor())) {
                p2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f17472b = z10;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (this.l1 != i10) {
            this.l1 = i10;
            invalidate();
        }
        b4 b4Var = this.f17513x;
        if (b4Var != null) {
            b4Var.setInternalNavigationBarColor(i10);
        }
        q3 q3Var = this.E;
        if (q3Var != null) {
            if (!this.Q && !this.T) {
                z10 = true;
            } else {
                z10 = false;
            }
            q3Var.i(i10, z10);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.T0 = i10;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<n9> list) {
        this.P0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.C0 = z10;
    }

    public void setThemeAnimationValue(float f7) {
        this.m0 = f7;
        ArrayList arrayList = this.f17487h0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i10);
            int[] iArr = (int[]) this.f17473b0.get(i10);
            int[] iArr2 = (int[]) this.f17476c0.get(i10);
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
                int i14 = l6Var.f18457f;
                f6 f6Var = l6Var.f18465o;
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
        ArrayList arrayList4 = this.f17491j0;
        int size3 = arrayList4.size();
        for (int i15 = 0; i15 < size3; i15++) {
            k6 k6Var = (k6) arrayList4.get(i15);
            if (k6Var != null) {
                k6Var.b();
                k6Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.f17489i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                l6 l6Var2 = (l6) this.f17489i0.get(i16);
                l6Var2.d(j6.v0(l6Var2.f18457f, l6Var2.f18465o), false, false);
            }
        }
        yn ynVar = this.f17485g0;
        if (ynVar != null) {
            bo boVar = ynVar.f39033a;
            boVar.V.f32542x0.invalidate();
            boVar.I.I = f7;
            boVar.J.I = f7;
            boVar.k(f7);
        }
        c5 c5Var = this.J0;
        if (c5Var != null) {
            c5Var.a(f7);
        }
        x(this);
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.A0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f17475c = window;
    }

    public final p2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                p2 p2Var = (p2) getFragmentStack().get(size);
                if (p2Var != null && !p2Var.isFinishing() && !p2Var.isRemovingFromStack() && xg0.class.isInstance(p2Var)) {
                    return p2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int v(boolean z10) {
        q3 q3Var;
        if (this.L0 && (q3Var = this.E) != null) {
            if (z10) {
                return (int) q3Var.G;
            }
            return q3Var.H;
        }
        return 0;
    }

    public final jz w() {
        Activity activity = this.K0;
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
            if (view.getParent() != this.f17511w) {
                AndroidUtilities.removeFromParent(view);
                this.f17511w.addView(view, w7.a6.c(-1.0f, -1));
                this.f17511w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.f17511w.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean y() {
        if (!this.h && !this.f17470a0) {
            return false;
        }
        return true;
    }

    @Override
    public final List z() {
        p2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof lg.b) {
                arrayList.addAll(((lg.b) lastFragment).z());
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
