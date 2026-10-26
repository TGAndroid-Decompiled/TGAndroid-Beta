package org.telegram.ui.ActionBar;

import a8.ee;
import a8.me;
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
import bi.ce;
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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gg0;
import org.telegram.ui.o80;
import org.telegram.ui.pg0;
import org.telegram.ui.pn;
import org.telegram.ui.py;
import org.telegram.ui.sn;
public class ActionBarLayout extends FrameLayout implements j5, og.b {
    public static Drawable f22300v1;
    public static Drawable f22301w1;
    public static Paint f22302x1;
    public boolean A0;
    public long B0;
    public boolean C0;
    public int D0;
    public s3 E;
    public Runnable E0;
    public me F;
    public Runnable F0;
    public s G;
    public boolean G0;
    public r2 H;
    public View H0;
    public r2 I;
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
    public o80 O0;
    public boolean P;
    public f5 P0;
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
    public boolean f22303a;
    public boolean f22304a0;
    public boolean f22305a1;
    public boolean f22306b;
    public final ArrayList f22307b0;
    public final Path f22308b1;
    public Window f22309c;
    public final ArrayList f22310c0;
    public final float[] f22311c1;
    public Runnable d;
    public final h5 f22312d0;
    public boolean f22313d1;
    public Runnable e;
    public l5 f22314e0;
    public final int[] f22315e1;
    public boolean f22316f;
    public l5 f22317f0;
    public boolean f22318f1;
    public pn f22319g0;
    public int f22320g1;
    public boolean h;
    public final ArrayList f22321h0;
    public final org.telegram.ui.Components.h6 f22322h1;
    public ArrayList f22323i0;
    public boolean f22324i1;
    public final ArrayList f22325j0;
    public boolean f22326j1;
    public int[] f22327k0;
    public boolean f22328k1;
    public int[] f22329l0;
    public float l1;
    public int[] m0;
    public boolean f22330m1;
    public boolean f22331n;
    public int[] f22332n0;
    public AnimatorSet f22333n1;
    public int f22334o0;
    public ArrayList f22335o1;
    public sn f22336p0;
    public final o f22337p1;
    public AnimatorSet f22338q0;
    public boolean f22339q1;
    public ColorDrawable f22340r;
    public final AnimationNotificationsLocker f22341r0;
    public int f22342r1;
    public w f22343s;
    public float f22344s0;
    public r0.k1 f22345s1;
    public boolean f22346t0;
    public i0.b f22347t1;
    public x6 f22348u0;
    public i0.b f22349u1;
    public w v;
    public boolean f22350v0;
    public w f22351w;
    public boolean f22352w0;
    public d4 f22353x;
    public int f22354x0;
    public k f22355y;
    public boolean f22356y0;
    public boolean f22357z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.f22307b0 = new ArrayList();
        this.f22310c0 = new ArrayList();
        h5 h5Var = new h5();
        h5Var.f22688b = new SparseIntArray();
        h5Var.f22689c = new int[]{y6.Aa, y6.Da, y6.Ea, y6.Fa, y6.f23304ac, y6.Ca};
        this.f22312d0 = h5Var;
        this.f22321h0 = new ArrayList();
        this.f22325j0 = new ArrayList();
        this.f22341r0 = new AnimationNotificationsLocker();
        this.W0 = new Rect();
        this.Z0 = -1;
        this.f22308b1 = new Path();
        this.f22311c1 = new float[8];
        this.f22315e1 = new int[2];
        this.f22322h1 = new org.telegram.ui.Components.h6(this, 280L, ds.h);
        this.f22335o1 = new ArrayList();
        this.f22337p1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.f22347t1 = bVar;
        this.f22349u1 = bVar;
        this.Q0 = (Activity) context;
        this.R0 = z10;
        if (f22301w1 == null) {
            f22301w1 = getResources().getDrawable(R.drawable.layer_shadow);
            f22300v1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f22302x1 = new Paint();
        }
        p pVar = new p(this, 0);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(this, pVar);
    }

    public static void F(ArrayList arrayList, View view) {
        if (view instanceof og.b) {
            arrayList.addAll(((og.b) view).B());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                F(arrayList, viewGroup.getChildAt(i10));
            }
        }
    }

    public static void a(ActionBarLayout actionBarLayout, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!z10) {
            if (actionBarLayout.U0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            r2 r2Var = (r2) b10.h(1, actionBarLayout.U0);
            r2Var.prepareFragmentToSlide(true, false);
            r2Var.onPause();
            r2Var.onFragmentDestroy();
            r2Var.setParentLayout(null);
            List list = actionBarLayout.U0;
            list.remove(list.size() - 1);
            actionBarLayout.K("onSlideAnimationEnd");
            w wVar = actionBarLayout.f22343s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.v;
            actionBarLayout.f22343s = wVar2;
            actionBarLayout.v = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view = actionBarLayout.f22351w;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.U0.size() > 0) {
                r2 r2Var2 = (r2) b10.h(1, actionBarLayout.U0);
                actionBarLayout.f22355y = r2Var2.actionBar;
                r2Var2.onResume();
                r2Var2.onBecomeFullyVisible();
                r2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.U0.size() >= 2) {
            ((r2) b10.h(1, actionBarLayout.U0)).prepareFragmentToSlide(true, false);
            r2 r2Var3 = (r2) b10.h(2, actionBarLayout.U0);
            r2Var3.prepareFragmentToSlide(false, false);
            r2Var3.onPause();
            View view2 = r2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                r2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(r2Var3.fragmentView);
            }
            k kVar = r2Var3.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(r2Var3.actionBar);
            }
            r2Var3.detachSheets();
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.Q = false;
        actionBarLayout.T = false;
        actionBarLayout.f22343s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.f22343s.setLayerType(0, null);
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

    public static boolean y(int i10, int i11, int i12) {
        if (i10 != y6.f23411g5 && i10 != y6.f23304ac && i10 != y6.Rd) {
            if (i10 != y6.Da && i10 != y6.Ea && i10 != y6.Fa && i10 != y6.Nd && i10 != y6.Od && i10 != y6.Pd && i10 != y6.Qd) {
                return true;
            }
            if (i11 != 0 && i12 != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A() {
        if (!this.W && !this.T) {
            return false;
        }
        return true;
    }

    @Override
    public final List B() {
        r2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof og.b) {
                arrayList.addAll(((og.b) lastFragment).B());
            }
            F(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public final int C() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.W0;
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
        if (this.f22326j1 && this.f22328k1) {
            return true;
        }
        return false;
    }

    public final void E() {
        for (int i10 = 0; i10 < this.U0.size(); i10++) {
            if (((r2) this.U0.get(i10)).getFragmentView() != null) {
                try {
                    ((r2) this.U0.get(i10)).onThemeColorsChanged();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void G(boolean z10) {
        J();
        M();
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
        t tVar = this.J0;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
            this.J0 = null;
        }
        setAlpha(1.0f);
        this.f22343s.setAlpha(1.0f);
        this.f22343s.setScaleX(1.0f);
        this.f22343s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void H() {
        r5 r5Var;
        k kVar;
        if (!this.f22304a0 && !this.Q && !i() && !this.U0.isEmpty()) {
            k30 k30Var = k30.f29786d0;
            if (k30Var != null && k30Var.f29798w) {
                k30Var.e(false);
                return;
            }
            if (!h0() && (kVar = this.f22355y) != null && !kVar.q()) {
                k kVar2 = this.f22355y;
                if (kVar2.f22774n0) {
                    kVar2.g(true);
                    return;
                }
            }
            r2 r2Var = (r2) b10.h(1, this.U0);
            if (!h0() && (r5Var = r2Var.simpleActionBar) != null) {
                z5 z5Var = r5Var.O;
                if (z5Var != null) {
                    z5Var.a(true);
                    return;
                } else if (!r5Var.G && r5Var.F) {
                    r5Var.f(true);
                    return;
                }
            }
            s sVar = this.G;
            if ((sVar == null || sVar.onBackPressed(true)) && ((r2) b10.h(1, this.U0)).onBackPressed(true) && !this.U0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final boolean I(float r6, float r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.I(float, float):boolean");
    }

    public final void J() {
        if (this.W && this.E0 != null) {
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                this.K = null;
                animatorSet.cancel();
            }
            this.W = false;
            this.f22304a0 = false;
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

    public final void K(String str) {
        Runnable runnable = this.Y0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        g(str);
    }

    public final void L() {
        for (r2 r2Var : this.U0) {
            r2Var.onLowMemory();
        }
    }

    public final void M() {
        Runnable runnable;
        if (this.W && (runnable = this.F0) != null) {
            this.W = false;
            this.f22304a0 = false;
            this.B0 = 0L;
            this.H = null;
            this.I = null;
            this.F0 = null;
            runnable.run();
            h();
        }
    }

    public final void N() {
        if (!this.U0.isEmpty()) {
            ((r2) b10.h(1, this.U0)).onPause();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void O() {
        if (!this.U0.isEmpty()) {
            ((r2) b10.h(1, this.U0)).onResume();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onResume();
        }
    }

    public final void P(Canvas canvas, ViewGroup viewGroup) {
        if (this.E != null && getHeight() < viewGroup.getHeight()) {
            canvas.save();
            canvas.translate(this.E.getX() + getX(), this.E.getY() + getY());
            this.E.draw(canvas);
            canvas.restore();
        }
    }

    public final void Q() {
        this.P = false;
        this.Q = true;
        this.v.setVisibility(0);
        this.V = false;
        r2 r2Var = (r2) b10.h(2, this.U0);
        View view = r2Var.fragmentView;
        if (view == null && (view = r2Var.performCreateView(this.Q0)) != null && r2Var.isSupportEdgeToEdge() && r2Var.drawEdgeNavigationBar()) {
            n nVar = new n(r2Var);
            WeakHashMap weakHashMap = r0.i0.f47108a;
            r0.a0.i(view, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            r2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.v.addView(view);
        this.v.setShouldHandleBottomInsets(r2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(r2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = r2Var.actionBar;
        if (kVar != null && kVar.K) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.I0) {
                r2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(r2Var.actionBar);
        }
        r2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        r2Var.attachSheets(this.v);
        if (!r2Var.hasOwnBackground && view.getBackground() == null) {
            f7.i(y6.f23356d6, view, null);
        }
        r2Var.onResume();
        if (this.f22338q0 != null) {
            this.f22323i0 = r2Var.getThemeDescriptions();
        }
        this.f22343s.setLayerType(2, null);
        ((r2) b10.h(1, this.U0)).prepareFragmentToSlide(true, true);
        r2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean R(r2 r2Var) {
        return T(new g5(r2Var));
    }

    public final boolean S(r2 r2Var, boolean z10) {
        g5 g5Var = new g5(r2Var);
        g5Var.f22663b = z10;
        return T(g5Var);
    }

    public final boolean T(org.telegram.ui.ActionBar.g5 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.T(org.telegram.ui.ActionBar.g5):boolean");
    }

    public final boolean U(r2 r2Var, boolean z10, boolean z11) {
        g5 g5Var = new g5(r2Var);
        g5Var.f22663b = z10;
        g5Var.f22664c = z11;
        g5Var.d = true;
        g5Var.e = false;
        return T(g5Var);
    }

    public final void V(r2 r2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (r2Var == null) {
            return;
        }
        r2Var.onBecomeFullyHidden();
        r2Var.onPause();
        if (z10) {
            r2Var.onFragmentDestroy();
            r2Var.setParentLayout(null);
            this.U0.remove(r2Var);
            K("presentFragmentInternalRemoveOld");
        } else {
            View view = r2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                r2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(r2Var.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                    try {
                        viewGroup2.removeView(r2Var.fragmentView);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
            k kVar = r2Var.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(r2Var.actionBar);
            }
            r2Var.detachSheets();
        }
        this.v.setVisibility(4);
    }

    public final void W(boolean z10, boolean z11) {
        if (!this.W && !this.Q) {
            int size = this.U0.size();
            if (!z10) {
                size--;
            }
            if (this.h) {
                size--;
            }
            for (int i10 = 0; i10 < size; i10++) {
                ((r2) this.U0.get(i10)).clearViews();
                ((r2) this.U0.get(i10)).setParentLayout(this);
            }
            f5 f5Var = this.P0;
            if (f5Var != null) {
                f5Var.b(this, z10);
            }
            if (z11) {
                e0();
                return;
            }
            return;
        }
        this.f22356y0 = true;
        this.f22357z0 = z10;
        this.A0 = z11;
    }

    public final void X() {
        W(true, true);
    }

    public final void Y() {
        this.f22343s.removeAllViews();
        this.v.removeAllViews();
        this.f22355y = null;
        this.H = null;
        this.I = null;
    }

    public final void Z() {
        while (this.U0.size() > 0) {
            d0((r2) this.U0.get(0), false);
        }
        View view = this.H0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void a0(int i10) {
        if (i10 >= 0 && i10 < getFragmentStack().size()) {
            c0((r2) getFragmentStack().get(i10), false);
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.k1 k1Var = this.f22345s1;
        if (k1Var != null) {
            o(view, k1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f22310c0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = ((h7) arrayList.get(i10)).c();
            }
        }
    }

    public final void b0(r2 r2Var) {
        c0(r2Var, false);
    }

    public final boolean c(int i10, r2 r2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        f5 f5Var = this.P0;
        if ((f5Var != null && !f5Var.h(r2Var, this)) || !r2Var.onFragmentCreate() || this.U0.contains(r2Var)) {
            return false;
        }
        r2Var.setParentLayout(this);
        Activity activity = this.Q0;
        if (i10 != -1 && i10 != -2) {
            if (i10 == -3) {
                View view = r2Var.fragmentView;
                if (view == null) {
                    view = r2Var.performCreateView(activity);
                    if (view != null && r2Var.isSupportEdgeToEdge() && r2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(r2Var);
                        WeakHashMap weakHashMap = r0.i0.f47108a;
                        r0.a0.i(view, nVar);
                        this.f22343s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        r2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!r2Var.hasOwnBackground && view.getBackground() == null) {
                    f7.i(y6.f23356d6, view, null);
                }
                w wVar = this.f22343s;
                wVar.addView(view, Utilities.clamp(0, wVar.getChildCount(), 0), gb1.g(-1.0f, -1));
                this.f22343s.setShouldHandleBottomInsets(r2Var.getEdgeToEdgeSupportMode());
                this.f22343s.setDrawNavigationBar(r2Var.drawEdgeNavigationBar());
                k kVar = r2Var.actionBar;
                if (kVar != null && kVar.K) {
                    if (this.I0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) r2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(r2Var.actionBar);
                    }
                    this.f22343s.addView(r2Var.actionBar);
                }
                r2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                r2Var.attachSheets(this.f22343s);
                i10 = 0;
            }
            this.U0.add(i10, r2Var);
            K("addFragmentToStack");
        } else {
            if (!this.U0.isEmpty()) {
                r2 r2Var2 = (r2) b10.h(1, this.U0);
                r2Var2.onPause();
                k kVar2 = r2Var2.actionBar;
                if (kVar2 != null && kVar2.K && (viewGroup2 = (ViewGroup) kVar2.getParent()) != null) {
                    viewGroup2.removeView(r2Var2.actionBar);
                }
                View view2 = r2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    r2Var2.onRemoveFromParent();
                    viewGroup.removeView(r2Var2.fragmentView);
                }
                r2Var2.detachSheets();
            }
            this.U0.add(r2Var);
            if (i10 != -2) {
                View view3 = r2Var.fragmentView;
                if (view3 == null) {
                    view3 = r2Var.performCreateView(activity);
                    if (view3 != null && r2Var.isSupportEdgeToEdge() && r2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(r2Var);
                        WeakHashMap weakHashMap2 = r0.i0.f47108a;
                        r0.a0.i(view3, nVar2);
                        this.f22343s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        r2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!r2Var.hasOwnBackground && view3.getBackground() == null) {
                    f7.i(y6.f23356d6, view3, null);
                }
                this.f22343s.addView(view3, gb1.g(-1.0f, -1));
                this.f22343s.setShouldHandleBottomInsets(r2Var.getEdgeToEdgeSupportMode());
                this.f22343s.setDrawNavigationBar(r2Var.drawEdgeNavigationBar());
                k kVar3 = r2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.I0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) r2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(r2Var.actionBar);
                    }
                    this.f22343s.addView(r2Var.actionBar);
                }
                r2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                r2Var.attachSheets(this.f22343s);
                r2Var.onResume();
                r2Var.onTransitionAnimationEnd(false, true);
                r2Var.onTransitionAnimationEnd(true, true);
                r2Var.onBecomeFullyVisible();
            }
            K("addFragmentToStack " + i10);
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

    public final void c0(r2 r2Var, boolean z10) {
        boolean z11 = true;
        if ((this.U0.size() > 0 && b10.h(1, this.U0) == r2Var) || (this.U0.size() > 1 && b10.h(2, this.U0) == r2Var)) {
            M();
            J();
        }
        g("removeFragmentFromStack " + z10);
        if (this.G0 && this.U0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.P0 != null && this.U0.size() == 1 && AndroidUtilities.isTablet()) {
            this.P0.k(this);
        }
        if (!r2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) {
            z11 = false;
        }
        d0(r2Var, z11);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f22321h0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f22307b0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                h7 h7Var = (h7) arrayList.get(i10);
                iArr[i10] = h7Var.c();
                g7 g7Var = h7Var.f22694g;
                h7Var.f22694g = null;
                if (g7Var != null) {
                    ArrayList arrayList2 = this.f22325j0;
                    if (!arrayList2.contains(g7Var)) {
                        arrayList2.add(g7Var);
                    }
                }
            }
        }
    }

    public final void d0(r2 r2Var, boolean z10) {
        if (!this.U0.contains(r2Var)) {
            return;
        }
        if (z10 && b10.h(1, this.U0) == r2Var) {
            r2Var.finishFragment();
        } else if (b10.h(1, this.U0) == r2Var && this.U0.size() > 1) {
            r2Var.finishFragment(false);
        } else {
            r2Var.onPause();
            r2Var.onFragmentDestroy();
            r2Var.setParentLayout(null);
            this.U0.remove(r2Var);
            K("removeFragmentFromStackInternal " + z10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E != null && v(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.f22347t1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.f22305a1 = true;
        if (this.S0) {
            canvas2.save();
            float dp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.f22308b1;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
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
            f5 f5Var = this.P0;
            if ((f5Var != null && f5Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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
        r2 r2Var;
        int i10;
        Animator customSlideTransition;
        int i11;
        int i12;
        if (!this.U0.isEmpty()) {
            r2Var = (r2) b10.h(1, this.U0);
        } else {
            r2Var = null;
        }
        if (r2Var == null) {
            return;
        }
        float x9 = this.f22343s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = r2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x9 = Math.abs(this.f22343s.getMeasuredWidth() - x9);
            int measuredWidth = (int) ((200.0f / this.f22343s.getMeasuredWidth()) * x9);
            if (D()) {
                i11 = 380;
            } else {
                i11 = 50;
            }
            int max = Math.max(measuredWidth, i11);
            if (!shouldOverrideSlideTransition) {
                w wVar = this.f22343s;
                int measuredWidth2 = wVar.getMeasuredWidth();
                if (this.f22326j1) {
                    i12 = AndroidUtilities.dp(56.0f);
                } else {
                    i12 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wVar, property, measuredWidth2 + i12);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f22343s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(ds.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f22343s.getMeasuredWidth()) * x9);
            if (D()) {
                i10 = 320;
            } else {
                i10 = 120;
            }
            int max2 = Math.max(measuredWidth3, i10);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f22343s, property, 0.0f);
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(ds.h);
                }
            }
        }
        Animator customSlideTransition2 = r2Var.getCustomSlideTransition(false, z10, x9);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        r2 r2Var2 = (r2) b10.h(2, this.U0);
        if (r2Var2 != null && (customSlideTransition = r2Var2.getCustomSlideTransition(false, z10, x9)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f22333n1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final void e0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.U0.isEmpty()) {
            int size = this.U0.size() - 1;
            if (!this.U0.isEmpty()) {
                if (this.U0.isEmpty() || this.U0.size() - 1 != size || ((r2) this.U0.get(size)).fragmentView == null) {
                    for (int i10 = 0; i10 < size; i10++) {
                        r2 r2Var = (r2) this.U0.get(i10);
                        k kVar = r2Var.actionBar;
                        if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                            viewGroup2.removeView(r2Var.actionBar);
                        }
                        View view = r2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            r2Var.onPause();
                            r2Var.onRemoveFromParent();
                            viewGroup.removeView(r2Var.fragmentView);
                        }
                    }
                    r2 r2Var2 = (r2) this.U0.get(size);
                    r2Var2.setParentLayout(this);
                    View view2 = r2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = r2Var2.performCreateView(this.Q0);
                        if (view2 != null && r2Var2.isSupportEdgeToEdge() && r2Var2.drawEdgeNavigationBar()) {
                            n nVar = new n(r2Var2);
                            WeakHashMap weakHashMap = r0.i0.f47108a;
                            r0.a0.i(view2, nVar);
                            this.f22343s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            r2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f22343s.addView(view2, gb1.g(-1.0f, -1));
                    this.f22343s.setShouldHandleBottomInsets(r2Var2.getEdgeToEdgeSupportMode());
                    this.f22343s.setDrawNavigationBar(r2Var2.drawEdgeNavigationBar());
                    k kVar2 = r2Var2.actionBar;
                    if (kVar2 != null && kVar2.K) {
                        if (this.I0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(r2Var2.actionBar);
                        this.f22343s.addView(r2Var2.actionBar);
                    }
                    r2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                    r2Var2.attachSheets(this.f22343s);
                    r2Var2.onResume();
                    r2Var2.onBecomeFullyVisible();
                    this.f22355y = r2Var2.actionBar;
                    if (!r2Var2.hasOwnBackground && view2.getBackground() == null) {
                        f7.i(y6.f23356d6, view2, null);
                    }
                }
            }
        }
    }

    public final void f(org.telegram.ui.ActionBar.i5 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.i5, java.lang.Runnable):void");
    }

    public final void f0(sn snVar) {
        int x02;
        try {
            int i10 = y6.f23392f5;
            this.f22327k0 = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr = this.f22327k0;
                if (snVar != null) {
                    x02 = snVar.g(i11);
                } else {
                    x02 = y6.x0(null, i11, false);
                }
                iArr[i11] = x02;
            }
        } catch (Exception e) {
            FileLog.e(e);
            this.f22327k0 = null;
        }
    }

    public final void g(String str) {
        if (BuildVars.DEBUG_VERSION) {
            ArrayList arrayList = this.f22335o1;
            StringBuilder l4 = b10.l(str, " ");
            l4.append(this.U0.size());
            arrayList.add(0, l4.toString());
            if (this.f22335o1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.f22335o1.get(i10));
                }
                this.f22335o1 = arrayList2;
            }
        }
        o oVar = this.f22337p1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    public final void g0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.K0 = 0.0f;
            this.L0 = System.nanoTime() / 1000000;
        }
        t tVar = new t(this, z11, z12, z10);
        this.J0 = tVar;
        AndroidUtilities.runOnUIThread(tVar);
    }

    @Override
    public r2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (r2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public k3 getBottomSheet() {
        return null;
    }

    public s3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        w wVar;
        if (!this.h && !this.f22304a0 && !this.f22331n) {
            return 0.0f;
        }
        r2 r2Var = this.I;
        if (r2Var != null && r2Var.inPreviewMode) {
            wVar = this.v;
        } else {
            wVar = this.f22343s;
        }
        return wVar.getAlpha();
    }

    public d4 getDrawerLayoutContainer() {
        return this.f22353x;
    }

    @Override
    public List<r2> getFragmentStack() {
        return this.U0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override
    public r2 getLastFragment() {
        if (this.U0.isEmpty()) {
            return null;
        }
        return (r2) b10.h(1, this.U0);
    }

    public r2 getLastFragmentIncludeMainTabs() {
        r2 lastFragment = getLastFragment();
        if (lastFragment instanceof pg0) {
            return ((pg0) lastFragment).X();
        }
        return lastFragment;
    }

    @Override
    public l5 getMessageDrawableOutMediaStart() {
        return this.f22317f0;
    }

    @Override
    public l5 getMessageDrawableOutStart() {
        return this.f22314e0;
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
    public List<p9> getPulledDialogs() {
        return this.V0;
    }

    @Override
    public r2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                r2 r2Var = (r2) getFragmentStack().get(size);
                if (r2Var != null && r2Var.getContext() != null && !r2Var.isFinishing() && !r2Var.isRemovingFromStack()) {
                    return r2Var;
                }
            }
            return null;
        }
        return null;
    }

    public py getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.f22344s0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f22309c;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public final void h() {
        if (this.f22356y0) {
            W(this.f22357z0, this.A0);
            this.f22356y0 = false;
        } else if (this.f22346t0) {
            i5 i5Var = new i5(this.f22348u0, this.f22354x0, this.f22352w0, true);
            boolean z10 = this.f22350v0;
            if (!z10) {
                i5Var.f22722g = z10;
                i5Var.f22721f = z10;
            }
            f(i5Var, null);
            this.f22348u0 = null;
            this.f22346t0 = false;
        }
    }

    public final boolean h0() {
        r2 r2Var;
        if (!this.U0.isEmpty()) {
            r2Var = (r2) b10.h(1, this.U0);
        } else {
            r2Var = null;
        }
        if (r2Var != null && r2Var.getLastStoryViewer() != null && r2Var.getLastStoryViewer().attachedToParent()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        if (this.f22304a0) {
            return false;
        }
        if (this.W && (this.B0 < System.currentTimeMillis() - 1500 || this.h)) {
            G(true);
        }
        return this.W;
    }

    public final void j() {
        this.f22334o0 = 0;
        this.f22336p0 = null;
        this.f22327k0 = null;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        r2 r2Var;
        boolean z13;
        boolean z14;
        r2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            f5 f5Var = this.P0;
            if ((f5Var == null || f5Var.k(this)) && !i() && !this.U0.isEmpty()) {
                Activity activity = this.Q0;
                if (activity.getCurrentFocus() != null) {
                    AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.f22304a0 || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r2 r2Var2 = (r2) b10.h(1, this.U0);
                AnimatorSet animatorSet = null;
                if (this.U0.size() > 1) {
                    r2Var = (r2) b10.h(2, this.U0);
                } else {
                    r2Var = null;
                }
                if (r2Var != null) {
                    if (y6.x0(null, y6.f23636s8, false) != -1 && (!r2Var.hasForceLightStatusBar() || y6.C0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    AndroidUtilities.setLightStatusBar(activity, z13);
                    w wVar = this.f22343s;
                    this.f22343s = this.v;
                    this.v = wVar;
                    r2Var.setParentLayout(this);
                    View view = r2Var.fragmentView;
                    if (view == null && (view = r2Var.performCreateView(activity)) != null && r2Var.isSupportEdgeToEdge() && r2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(r2Var);
                        WeakHashMap weakHashMap = r0.i0.f47108a;
                        r0.a0.i(view, nVar);
                        this.f22343s.invalidate();
                    }
                    if (!this.h) {
                        this.f22343s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            r2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        this.f22343s.addView(view);
                        this.f22343s.setShouldHandleBottomInsets(r2Var.getEdgeToEdgeSupportMode());
                        this.f22343s.setDrawNavigationBar(r2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        k kVar = r2Var.actionBar;
                        if (kVar != null && kVar.K) {
                            if (this.I0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            AndroidUtilities.removeFromParent(r2Var.actionBar);
                            this.f22343s.addView(r2Var.actionBar);
                        }
                        r2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                        r2Var.attachSheets(this.f22343s);
                    }
                    this.H = r2Var;
                    this.I = r2Var2;
                    r2Var.onTransitionAnimationStart(true, true);
                    r2Var2.onTransitionAnimationStart(false, true);
                    r2Var.onResume();
                    if (this.f22338q0 != null) {
                        this.f22323i0 = r2Var.getThemeDescriptions();
                    }
                    this.f22355y = r2Var.actionBar;
                    if (!r2Var.hasOwnBackground && view.getBackground() == null) {
                        f7.i(y6.f23356d6, view, null);
                    }
                    if (z12) {
                        this.B0 = System.currentTimeMillis();
                        this.W = true;
                        r2Var2.setRemovingFromStack(true);
                        this.E0 = new jg.f1(this, r2Var2, r2Var, 20);
                        if (!this.h && !this.f22304a0) {
                            animatorSet = r2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f22343s.f23165b || this.v.f23165b)) {
                                z2 z2Var = new z2(this, 1);
                                this.d = z2Var;
                                AndroidUtilities.runOnUIThread(z2Var, 200L);
                            } else {
                                if (!z15 && !this.f22304a0) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                g0(false, true, z14);
                            }
                        } else {
                            this.K = animatorSet;
                            qc qcVar = qc.f31882x;
                            if (qcVar != null && qcVar.f31892m) {
                                qcVar.b();
                            }
                        }
                        K("closeLastFragment");
                    } else {
                        m(r2Var2);
                        r2Var2.onTransitionAnimationEnd(false, true);
                        r2Var.onTransitionAnimationEnd(true, true);
                        r2Var.onBecomeFullyVisible();
                    }
                } else if (this.G0 && !z11) {
                    this.B0 = System.currentTimeMillis();
                    this.W = true;
                    this.E0 = new org.telegram.messenger.voip.m0(5, this, r2Var2);
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
                    d0(r2Var2, false);
                    setVisibility(8);
                    View view3 = this.H0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                r2Var2.onFragmentClosed();
            }
        }
    }

    public final void m(r2 r2Var) {
        r2Var.finishing = true;
        r2Var.onPause();
        r2Var.onFragmentDestroy();
        r2Var.setParentLayout(null);
        this.U0.remove(r2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.f22343s);
        w wVar = this.f22351w;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        K("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((r2) b10.h(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void o(View view, r0.k1 k1Var) {
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
        r0.a1 w0Var;
        boolean z11 = this.S0;
        if (z11) {
            if ((view instanceof w) && ((w) view).f23172x) {
                int i18 = k1Var.f47118a.f(8).d;
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
                r0.k1 k1Var2 = r0.k1.f47117b;
                int i19 = Build.VERSION.SDK_INT;
                if (i19 >= 34) {
                    w0Var = new r0.z0(k1Var2);
                } else if (i19 >= 30) {
                    w0Var = new r0.y0(k1Var2);
                } else if (i19 >= 29) {
                    w0Var = new r0.x0(k1Var2);
                } else {
                    w0Var = new r0.w0(k1Var2);
                }
                w0Var.c(8, i0.b.b(0, 0, 0, max));
                r0.i0.b(view, w0Var.b());
                return;
            }
            r0.i0.b(view, r0.k1.f47117b);
            return;
        }
        boolean z12 = this.T0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.b bVar = this.f22347t1;
        i0.b bVar2 = this.f22349u1;
        if (view instanceof s3) {
            if (z12) {
                i15 = 0;
            } else {
                i15 = bVar.f13450a;
            }
            if (z10) {
                i16 = 0;
            } else {
                i16 = bVar.f13452c;
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
            e4 e4Var = wVar.f23171w;
            if (e4Var != e4.f22604c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i11 = bVar2.f13450a;
            } else {
                i11 = 0;
            }
            if (!z13 && !z10) {
                i12 = bVar2.f13452c;
            } else {
                i12 = 0;
            }
            if (z13 && !z12) {
                i13 = 0;
            } else {
                i13 = bVar2.f13450a;
            }
            if (z13 && !z10) {
                i14 = 0;
            } else {
                i14 = bVar2.f13452c;
            }
            if (e4Var == e4.f22602a) {
                i10 = Math.max(i10, bVar2.d);
                r0.i0.b(view, r0.k1.f47117b);
            } else {
                r0.i0.b(view, k1Var.f47118a.m(i13, 0, i14, i10));
            }
            view.setPadding(i11, 0, i12, i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22303a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.U0.isEmpty()) {
            int size = this.U0.size();
            for (int i10 = 0; i10 < size; i10++) {
                r2 r2Var = (r2) this.U0.get(i10);
                r2Var.onConfigurationChanged(configuration);
                Dialog dialog = r2Var.visibleDialog;
                if (dialog instanceof k3) {
                    ((k3) dialog).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22303a = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.T && !i() && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        k kVar;
        z zVar;
        if (i10 == 82 && !i() && !this.Q && (kVar = this.f22355y) != null && !kVar.q() && (zVar = kVar.E) != null) {
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
                    } else if (w0Var.s()) {
                        w0Var.U(null, null);
                        break;
                    } else if (w0Var.S) {
                        zVar.n(((Integer) w0Var.getTag()).intValue());
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
        r2 r2Var;
        boolean z10 = true;
        if (!this.U0.isEmpty()) {
            r2Var = (r2) b10.h(1, this.U0);
        } else {
            r2Var = null;
        }
        if (r2Var != null && !r2Var.isSupportEdgeToEdge() && h0()) {
            int C = C();
            r2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, 1073741824));
            return;
        }
        f5 f5Var = this.P0;
        if (f5Var != null) {
            int[] iArr = this.f22315e1;
            iArr[0] = i10;
            iArr[1] = i11;
            f5Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        if (C() <= AndroidUtilities.dp(20.0f)) {
            z10 = false;
        }
        this.f22313d1 = z10;
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean z10 = false;
        if (!i() && !this.C0 && !this.T && !this.f22326j1) {
            if (this.U0.size() > 1 && ((sVar = this.G) == null || sVar.getLastSheet() == null || !this.G.getLastSheet().isShown())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((r2) b10.h(1, this.U0)).isSwipeBackEnabled(motionEvent)) {
                        this.P = false;
                        this.Q = false;
                        w wVar = this.f22343s;
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
                    if (!this.W && !this.h && this.P && !this.Q && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                        if (((r2) b10.h(1, this.U0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.R = (int) motionEvent.getX();
                            Q();
                        } else {
                            this.P = false;
                        }
                    } else if (this.Q) {
                        if (!this.V) {
                            Activity activity = this.Q0;
                            if (activity.getCurrentFocus() != null) {
                                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                            }
                            ((r2) b10.h(1, this.U0)).onBeginSlide();
                            this.V = true;
                        }
                        if (D()) {
                            float f7 = max;
                            this.f22343s.setTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                            setInnerTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        } else {
                            float f10 = max;
                            this.f22343s.setTranslationX(f10);
                            setInnerTranslationX(f10);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.D0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    this.U.addMovement(motionEvent);
                    this.U.computeCurrentVelocity(1000);
                    r2 r2Var = (r2) b10.h(1, this.U0);
                    if (!this.h && !this.f22304a0 && !this.Q && r2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.U.getXVelocity();
                        float yVelocity = this.U.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && r2Var.canBeginSlide()) {
                            this.R = (int) motionEvent.getX();
                            Q();
                            if (!this.V) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
                                }
                                this.V = true;
                            }
                        }
                    }
                    if (this.Q) {
                        float x9 = this.f22343s.getX();
                        float xVelocity2 = this.U.getXVelocity();
                        float yVelocity2 = this.U.getYVelocity();
                        if (!D() ? x9 < this.f22343s.getMeasuredWidth() / 3.0f : !(x9 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.P = false;
                        this.Q = false;
                        w wVar2 = this.f22343s;
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
                    w wVar3 = this.f22343s;
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
        if (f22300v1 != null && SharedConfig.drawActionBarShadow) {
            int i12 = i10 / 2;
            if (f22300v1.getAlpha() != i12) {
                f22300v1.setAlpha(i12);
            }
            f22300v1.setBounds(0, i11, getMeasuredWidth(), f22300v1.getIntrinsicHeight() + i11);
            f22300v1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.f22331n = true;
        this.h = false;
        r2 r2Var = (r2) b10.h(1, this.U0);
        r2Var.fragmentView.setOutlineProvider(null);
        r2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        r2Var.fragmentView.setLayoutParams(layoutParams);
        V((r2) b10.h(2, this.U0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(r2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(r2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new ds(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ce(13, this, r2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f22343s.setShouldHandleBottomInsets(r2Var.getEdgeToEdgeSupportMode());
        this.f22343s.setDrawNavigationBar(r2Var.drawEdgeNavigationBar());
        r2Var.setInPreviewMode(false);
        r2Var.setInMenuMode(false);
        try {
            Activity activity = this.Q0;
            if (y6.x0(null, y6.f23636s8, false) != -1 && (!r2Var.hasForceLightStatusBar() || y6.C0().q())) {
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
        if (!this.U0.isEmpty() && ((r2) b10.h(1, this.U0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.H0 = view;
    }

    @Override
    public void setDelegate(f5 f5Var) {
        this.P0 = f5Var;
    }

    @Override
    public void setDrawerLayoutContainer(d4 d4Var) {
        this.f22353x = d4Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i10) {
        w wVar = this.f22343s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<r2> list) {
        this.U0 = list;
        s3 s3Var = this.E;
        if (s3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            s3Var.I.remove(oVar);
            s3Var.J.remove(oVar2);
            AndroidUtilities.removeFromParent(this.E);
            this.E = null;
        }
        boolean z10 = this.R0;
        Activity activity = this.Q0;
        if (z10) {
            s3 s3Var2 = new s3(activity, this);
            this.E = s3Var2;
            this.F = new me(s3Var2);
            s3 s3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            s3Var3.I.add(oVar3);
            s3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            b4 b4Var = LaunchActivity.I1.f35569y0;
            if (b4Var != null) {
                b4Var.setTabsView(this.E);
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
        w wVar3 = this.f22343s;
        if (wVar3 != null) {
            AndroidUtilities.removeFromParent(wVar3);
        }
        w wVar4 = new w(activity, this);
        this.f22343s = wVar4;
        addView(wVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f22343s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f22343s.setLayoutParams(layoutParams3);
        w wVar5 = this.f22351w;
        if (wVar5 != null) {
            AndroidUtilities.removeFromParent(wVar5);
        }
        w wVar6 = new w(activity, this);
        this.f22351w = wVar6;
        this.f22322h1.f28809a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f22351w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f22351w.setLayoutParams(layoutParams4);
        s sVar = this.G;
        if (sVar != null) {
            sVar.setParentLayout(this);
            s sVar2 = this.G;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f22351w) {
                AndroidUtilities.removeFromParent(view);
                this.f22351w.addView(view, gb1.g(-1.0f, -1));
                this.f22351w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        for (r2 r2Var : this.U0) {
            r2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Y0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f22316f = z10;
    }

    public void setInnerTranslationX(float f7) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f7;
        invalidate();
        if (this.U0.size() >= 2 && this.f22343s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.clamp01(f7 / (AndroidUtilities.dp(56.0f) * 6));
            } else {
                measuredWidth = f7 / this.f22343s.getMeasuredWidth();
            }
            r2 r2Var = (r2) b10.h(2, this.U0);
            r2Var.onSlideProgress(false, measuredWidth);
            r2 r2Var2 = (r2) b10.h(1, this.U0);
            float a2 = ee.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (r2Var2.isBeginToShow() && (navigationBarColor = r2Var2.getNavigationBarColor()) != (navigationBarColor2 = r2Var.getNavigationBarColor())) {
                r2Var2.setNavigationBarColor(i0.a.f(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f22306b = z10;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (this.f22342r1 != i10) {
            this.f22342r1 = i10;
            invalidate();
        }
        d4 d4Var = this.f22353x;
        if (d4Var != null) {
            d4Var.setInternalNavigationBarColor(i10);
        }
        s3 s3Var = this.E;
        if (s3Var != null) {
            if (!this.Q && !this.T) {
                z10 = true;
            } else {
                z10 = false;
            }
            s3Var.i(i10, z10);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.Z0 = i10;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<p9> list) {
        this.V0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.I0 = z10;
    }

    public void setThemeAnimationValue(float f7) {
        boolean z10;
        int alpha;
        this.f22344s0 = f7;
        for (int i10 = 0; i10 < this.f22334o0; i10++) {
            int f10 = i0.a.f(f7, this.m0[i10], this.f22332n0[i10]);
            sn snVar = this.f22336p0;
            if (snVar != null) {
                snVar.h(this.f22329l0[i10], f10);
            } else {
                int i11 = this.f22329l0[i10];
                SparseIntArray sparseIntArray = y6.vl;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i11, f10);
                }
            }
        }
        ArrayList arrayList = this.f22321h0;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i12);
            int[] iArr = (int[]) this.f22307b0.get(i12);
            int[] iArr2 = (int[]) this.f22310c0.get(i12);
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                int red = Color.red(iArr2[i13]);
                int green = Color.green(iArr2[i13]);
                int blue = Color.blue(iArr2[i13]);
                int alpha2 = Color.alpha(iArr2[i13]);
                int red2 = Color.red(iArr[i13]);
                int green2 = Color.green(iArr[i13]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr[i13]);
                int i14 = size;
                int i15 = i12;
                int argb = Color.argb(Math.min(255, (int) (((alpha2 - alpha) * f7) + Color.alpha(iArr[i13]))), Math.min(255, (int) (((red - red2) * f7) + red2)), Math.min(255, (int) (((green - green2) * f7) + green2)), Math.min(255, (int) (((blue - blue2) * f7) + blue2)));
                h7 h7Var = (h7) arrayList2.get(i13);
                int i16 = h7Var.e;
                u6 u6Var = h7Var.f22700n;
                if (u6Var != null) {
                    u6Var.h(i16, argb);
                } else {
                    SparseIntArray sparseIntArray2 = y6.vl;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i16, argb);
                    }
                }
                h7Var.e(argb, false, false);
                i13++;
                i12 = i15;
                arrayList = arrayList3;
                size = i14;
            }
            i12++;
        }
        ArrayList arrayList4 = this.f22325j0;
        int size3 = arrayList4.size();
        for (int i17 = 0; i17 < size3; i17++) {
            g7 g7Var = (g7) arrayList4.get(i17);
            if (g7Var != null) {
                g7Var.b();
                g7Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.f22323i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i18 = 0; i18 < size4; i18++) {
                h7 h7Var2 = (h7) this.f22323i0.get(i18);
                h7Var2.e(y6.w0(h7Var2.e, h7Var2.f22700n), false, false);
            }
        }
        pn pnVar = this.f22319g0;
        if (pnVar != null) {
            sn snVar2 = pnVar.f42578a;
            snVar2.F.f44471x0.invalidate();
            snVar2.f43557s.K = f7;
            snVar2.f43558t.K = f7;
            snVar2.s(f7);
        }
        f5 f5Var = this.P0;
        if (f5Var != null) {
            f5Var.a(f7);
        }
        e7 e7Var = f7.f22627a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f7 < 1.0f && currentAnimationTimeMillis == f7.f22629c && f7 == f7.d) {
            if (getWindowToken() == null) {
                f7.e0(this, false);
            }
        } else {
            f7.f22629c = currentAnimationTimeMillis;
            f7.d = f7;
            if (f7 >= 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            f7.d0(this, z10);
        }
        E();
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.G0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f22309c = window;
    }

    public final r2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                r2 r2Var = (r2) getFragmentStack().get(size);
                if (r2Var != null && !r2Var.isFinishing() && !r2Var.isRemovingFromStack() && gg0.class.isInstance(r2Var)) {
                    return r2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int v(boolean z10) {
        s3 s3Var;
        if (this.R0 && (s3Var = this.E) != null) {
            if (z10) {
                return (int) s3Var.G;
            }
            return s3Var.H;
        }
        return 0;
    }

    public final py w() {
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
            if (view.getParent() != this.f22351w) {
                AndroidUtilities.removeFromParent(view);
                this.f22351w.addView(view, gb1.g(-1.0f, -1));
                this.f22351w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.f22351w.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean x() {
        if (!this.h && !this.f22304a0) {
            return false;
        }
        return true;
    }

    public final boolean z() {
        return this.S0;
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
