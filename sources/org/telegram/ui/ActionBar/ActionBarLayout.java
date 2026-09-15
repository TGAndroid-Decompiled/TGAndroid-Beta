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
import org.telegram.ui.eh0;
import org.telegram.ui.f90;
import org.telegram.ui.hz;
import org.telegram.ui.wg0;
import org.telegram.ui.wn;
import org.telegram.ui.zn;
public class ActionBarLayout extends FrameLayout implements d5, mg.b {
    public static Drawable f18375p1;
    public static Drawable f18376q1;
    public static Paint f18377r1;
    public boolean A0;
    public View B0;
    public boolean C0;
    public t D0;
    public o3 E;
    public float E0;
    public cf.c F;
    public long F0;
    public s G;
    public String G0;
    public n2 H;
    public int H0;
    public n2 I;
    public f90 I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public a5 J0;
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
    public boolean f18378a;
    public boolean f18379a0;
    public int f18380a1;
    public boolean f18381b;
    public final ArrayList f18382b0;
    public final org.telegram.ui.Components.c6 f18383b1;
    public Window f18384c;
    public final ArrayList f18385c0;
    public boolean f18386c1;
    public Runnable d;
    public final n7.a1 f18387d0;
    public boolean f18388d1;
    public Runnable e;
    public f5 f18389e0;
    public boolean f18390e1;
    public boolean f18391f;
    public f5 f18392f0;
    public float f18393f1;
    public wn f18394g0;
    public boolean f18395g1;
    public boolean h;
    public final ArrayList f18396h0;
    public AnimatorSet f18397h1;
    public ArrayList f18398i0;
    public ArrayList f18399i1;
    public final ArrayList f18400j0;
    public final o f18401j1;
    public AnimatorSet f18402k0;
    public boolean f18403k1;
    public final AnimationNotificationsLocker f18404l0;
    public int l1;
    public float m0;
    public r0.l1 f18405m1;
    public boolean f18406n;
    public boolean f18407n0;
    public i0.b f18408n1;
    public h6 f18409o0;
    public i0.b f18410o1;
    public boolean f18411p0;
    public boolean f18412q0;
    public ColorDrawable f18413r;
    public int f18414r0;
    public w f18415s;
    public boolean f18416s0;
    public boolean f18417t0;
    public boolean f18418u0;
    public w v;
    public long f18419v0;
    public w f18420w;
    public boolean f18421w0;
    public z3 f18422x;
    public int f18423x0;
    public k f18424y;
    public Runnable f18425y0;
    public Runnable f18426z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.f18382b0 = new ArrayList();
        this.f18385c0 = new ArrayList();
        n7.a1 a1Var = new n7.a1(1);
        a1Var.f15108b = new SparseIntArray();
        a1Var.f15109c = new int[]{i6.Aa, i6.Da, i6.Ea, i6.Fa, i6.f18785ac, i6.Ca};
        this.f18387d0 = a1Var;
        this.f18396h0 = new ArrayList();
        this.f18400j0 = new ArrayList();
        this.f18404l0 = new AnimationNotificationsLocker();
        this.Q0 = new Rect();
        this.T0 = -1;
        this.V0 = new Path();
        this.W0 = new float[8];
        this.Y0 = new int[2];
        this.f18383b1 = new org.telegram.ui.Components.c6(this, 280L, qr.h);
        this.f18399i1 = new ArrayList();
        this.f18401j1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.f18408n1 = bVar;
        this.f18410o1 = bVar;
        this.K0 = (Activity) context;
        this.L0 = z10;
        if (f18376q1 == null) {
            f18376q1 = getResources().getDrawable(R.drawable.layer_shadow);
            f18375p1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f18377r1 = new Paint();
        }
        n nVar = new n(this, 1);
        WeakHashMap weakHashMap = r0.i0.f41843a;
        r0.a0.j(this, nVar);
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
            n2 n2Var = (n2) p6.g(1, actionBarLayout.O0);
            n2Var.prepareFragmentToSlide(true, false);
            n2Var.onPause();
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
            List list = actionBarLayout.O0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            w wVar = actionBarLayout.f18415s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.v;
            actionBarLayout.f18415s = wVar2;
            actionBarLayout.v = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view = actionBarLayout.f18420w;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.O0.size() > 0) {
                n2 n2Var2 = (n2) p6.g(1, actionBarLayout.O0);
                actionBarLayout.f18424y = n2Var2.actionBar;
                n2Var2.onResume();
                n2Var2.onBecomeFullyVisible();
                n2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.O0.size() >= 2) {
            ((n2) p6.g(1, actionBarLayout.O0)).prepareFragmentToSlide(true, false);
            n2 n2Var3 = (n2) p6.g(2, actionBarLayout.O0);
            n2Var3.prepareFragmentToSlide(false, false);
            n2Var3.onPause();
            View view2 = n2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                n2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(n2Var3.fragmentView);
            }
            k kVar = n2Var3.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(n2Var3.actionBar);
            }
            n2Var3.detachSheets();
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.Q = false;
        actionBarLayout.T = false;
        actionBarLayout.f18415s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.f18415s.setLayerType(0, null);
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
            if (childAt instanceof z5) {
                ((z5) childAt).e();
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
        if (this.f18388d1 && this.f18390e1) {
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
        this.f18415s.setAlpha(1.0f);
        this.f18415s.setScaleX(1.0f);
        this.f18415s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void G() {
        k kVar;
        if (!this.f18379a0 && !this.Q && !j() && !this.O0.isEmpty()) {
            z20 z20Var = z20.f30454d0;
            if (z20Var != null && z20Var.f30466w) {
                z20Var.e(false);
                return;
            }
            if (!e0() && (kVar = this.f18424y) != null && !kVar.s()) {
                k kVar2 = this.f18424y;
                if (kVar2.f19316n0) {
                    kVar2.h(true);
                    return;
                }
            }
            s sVar = this.G;
            if ((sVar == null || sVar.onBackPressed(true)) && ((n2) p6.g(1, this.O0)).onBackPressed(true) && !this.O0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final void H() {
        if (this.W && this.f18425y0 != null) {
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                this.K = null;
                animatorSet.cancel();
            }
            this.W = false;
            this.f18379a0 = false;
            this.f18419v0 = 0L;
            this.H = null;
            this.I = null;
            Runnable runnable = this.f18425y0;
            this.f18425y0 = null;
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
        for (n2 n2Var : this.O0) {
            n2Var.onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (this.W && (runnable = this.f18426z0) != null) {
            this.W = false;
            this.f18379a0 = false;
            this.f18419v0 = 0L;
            this.H = null;
            this.I = null;
            this.f18426z0 = null;
            runnable.run();
            i();
        }
    }

    public final void L() {
        if (!this.O0.isEmpty()) {
            ((n2) p6.g(1, this.O0)).onPause();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void M() {
        if (!this.O0.isEmpty()) {
            ((n2) p6.g(1, this.O0)).onResume();
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
        n2 n2Var = (n2) p6.g(2, this.O0);
        View view = n2Var.fragmentView;
        if (view == null && (view = n2Var.performCreateView(this.K0)) != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
            n nVar = new n(n2Var, 0);
            WeakHashMap weakHashMap = r0.i0.f41843a;
            r0.a0.j(view, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            n2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.v.addView(view);
        this.v.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = n2Var.actionBar;
        if (kVar != null && kVar.K) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.C0) {
                n2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(n2Var.actionBar);
        }
        n2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
        n2Var.attachSheets(this.v);
        if (!n2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(i6.w0(null, i6.f18836d6, false));
        }
        n2Var.onResume();
        if (this.f18402k0 != null) {
            this.f18398i0 = n2Var.getThemeDescriptions();
        }
        this.f18415s.setLayerType(2, null);
        ((n2) p6.g(1, this.O0)).prepareFragmentToSlide(true, true);
        n2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(n2 n2Var) {
        return R(new b5(n2Var));
    }

    public final boolean Q(n2 n2Var, boolean z10) {
        b5 b5Var = new b5(n2Var);
        b5Var.f18504b = z10;
        return R(b5Var);
    }

    public final boolean R(org.telegram.ui.ActionBar.b5 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.R(org.telegram.ui.ActionBar.b5):boolean");
    }

    public final boolean S(n2 n2Var, boolean z10, boolean z11) {
        b5 b5Var = new b5(n2Var);
        b5Var.f18504b = z10;
        b5Var.f18505c = z11;
        b5Var.d = true;
        b5Var.e = false;
        return R(b5Var);
    }

    public final void T(n2 n2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (n2Var == null) {
            return;
        }
        n2Var.onBecomeFullyHidden();
        n2Var.onPause();
        if (z10) {
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
            this.O0.remove(n2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = n2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                n2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(n2Var.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                    try {
                        viewGroup2.removeView(n2Var.fragmentView);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
            }
            k kVar = n2Var.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(n2Var.actionBar);
            }
            n2Var.detachSheets();
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
                ((n2) this.O0.get(i10)).clearViews();
                ((n2) this.O0.get(i10)).setParentLayout(this);
            }
            a5 a5Var = this.J0;
            if (a5Var != null) {
                a5Var.b(this, z10);
            }
            if (z11) {
                c0();
                return;
            }
            return;
        }
        this.f18416s0 = true;
        this.f18417t0 = z10;
        this.f18418u0 = z11;
    }

    public final void V() {
        U(true, true);
    }

    public final void W() {
        this.f18415s.removeAllViews();
        this.v.removeAllViews();
        this.f18424y = null;
        this.H = null;
        this.I = null;
    }

    public final void X() {
        while (this.O0.size() > 0) {
            b0((n2) this.O0.get(0), false);
        }
        View view = this.B0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Y(int i10) {
        if (i10 >= 0 && i10 < getFragmentStack().size()) {
            a0((n2) getFragmentStack().get(i10), false);
        }
    }

    public final void Z(n2 n2Var) {
        a0(n2Var, false);
    }

    public final void a0(n2 n2Var, boolean z10) {
        boolean z11 = true;
        if ((this.O0.size() > 0 && p6.g(1, this.O0) == n2Var) || (this.O0.size() > 1 && p6.g(2, this.O0) == n2Var)) {
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
        b0(n2Var, (!n2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) ? false : false);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.l1 l1Var = this.f18405m1;
        if (l1Var != null) {
            o(view, l1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f18385c0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = ((k6) arrayList.get(i10)).b();
            }
        }
    }

    public final void b0(n2 n2Var, boolean z10) {
        if (!this.O0.contains(n2Var)) {
            return;
        }
        if (z10 && p6.g(1, this.O0) == n2Var) {
            n2Var.finishFragment();
        } else if (p6.g(1, this.O0) == n2Var && this.O0.size() > 1) {
            n2Var.finishFragment(false);
        } else {
            n2Var.onPause();
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
            this.O0.remove(n2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i10, n2 n2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        a5 a5Var = this.J0;
        if ((a5Var != null && !a5Var.h(n2Var, this)) || !n2Var.onFragmentCreate() || this.O0.contains(n2Var)) {
            return false;
        }
        n2Var.setParentLayout(this);
        Activity activity = this.K0;
        if (i10 != -1 && i10 != -2) {
            if (i10 == -3) {
                View view = n2Var.fragmentView;
                if (view == null) {
                    view = n2Var.performCreateView(activity);
                    if (view != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(n2Var, 0);
                        WeakHashMap weakHashMap = r0.i0.f41843a;
                        r0.a0.j(view, nVar);
                        this.f18415s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        n2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!n2Var.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(i6.w0(null, i6.f18836d6, false));
                }
                w wVar = this.f18415s;
                wVar.addView(view, Utilities.clamp(0, wVar.getChildCount(), 0), w7.x5.c(-1.0f, -1));
                this.f18415s.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
                this.f18415s.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
                k kVar = n2Var.actionBar;
                if (kVar != null && kVar.K) {
                    if (this.C0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) n2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(n2Var.actionBar);
                    }
                    this.f18415s.addView(n2Var.actionBar);
                }
                n2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                n2Var.attachSheets(this.f18415s);
                i10 = 0;
            }
            this.O0.add(i10, n2Var);
            I("addFragmentToStack");
        } else {
            if (!this.O0.isEmpty()) {
                n2 n2Var2 = (n2) p6.g(1, this.O0);
                n2Var2.onPause();
                k kVar2 = n2Var2.actionBar;
                if (kVar2 != null && kVar2.K && (viewGroup2 = (ViewGroup) kVar2.getParent()) != null) {
                    viewGroup2.removeView(n2Var2.actionBar);
                }
                View view2 = n2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    n2Var2.onRemoveFromParent();
                    viewGroup.removeView(n2Var2.fragmentView);
                }
                n2Var2.detachSheets();
            }
            this.O0.add(n2Var);
            if (i10 != -2) {
                View view3 = n2Var.fragmentView;
                if (view3 == null) {
                    view3 = n2Var.performCreateView(activity);
                    if (view3 != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(n2Var, 0);
                        WeakHashMap weakHashMap2 = r0.i0.f41843a;
                        r0.a0.j(view3, nVar2);
                        this.f18415s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        n2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!n2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(i6.w0(null, i6.f18836d6, false));
                }
                this.f18415s.addView(view3, w7.x5.c(-1.0f, -1));
                this.f18415s.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
                this.f18415s.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
                k kVar3 = n2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.C0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) n2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(n2Var.actionBar);
                    }
                    this.f18415s.addView(n2Var.actionBar);
                }
                n2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                n2Var.attachSheets(this.f18415s);
                n2Var.onResume();
                n2Var.onTransitionAnimationEnd(false, true);
                n2Var.onTransitionAnimationEnd(true, true);
                n2Var.onBecomeFullyVisible();
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
                if (this.O0.isEmpty() || this.O0.size() - 1 != size || ((n2) this.O0.get(size)).fragmentView == null) {
                    for (int i10 = 0; i10 < size; i10++) {
                        n2 n2Var = (n2) this.O0.get(i10);
                        k kVar = n2Var.actionBar;
                        if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                            viewGroup2.removeView(n2Var.actionBar);
                        }
                        View view = n2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            n2Var.onPause();
                            n2Var.onRemoveFromParent();
                            viewGroup.removeView(n2Var.fragmentView);
                        }
                    }
                    n2 n2Var2 = (n2) this.O0.get(size);
                    n2Var2.setParentLayout(this);
                    View view2 = n2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = n2Var2.performCreateView(this.K0);
                        if (view2 != null && n2Var2.isSupportEdgeToEdge() && n2Var2.drawEdgeNavigationBar()) {
                            n nVar = new n(n2Var2, 0);
                            WeakHashMap weakHashMap = r0.i0.f41843a;
                            r0.a0.j(view2, nVar);
                            this.f18415s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            n2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f18415s.addView(view2, w7.x5.c(-1.0f, -1));
                    this.f18415s.setShouldHandleBottomInsets(n2Var2.getEdgeToEdgeSupportMode());
                    this.f18415s.setDrawNavigationBar(n2Var2.drawEdgeNavigationBar());
                    k kVar2 = n2Var2.actionBar;
                    if (kVar2 != null && kVar2.K) {
                        if (this.C0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(n2Var2.actionBar);
                        this.f18415s.addView(n2Var2.actionBar);
                    }
                    n2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                    n2Var2.attachSheets(this.f18415s);
                    n2Var2.onResume();
                    n2Var2.onBecomeFullyVisible();
                    this.f18424y = n2Var2.actionBar;
                    if (!n2Var2.hasOwnBackground && view2.getBackground() == null) {
                        view2.setBackgroundColor(i6.w0(null, i6.f18836d6, false));
                    }
                }
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f18396h0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f18382b0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                k6 k6Var = (k6) arrayList.get(i10);
                iArr[i10] = k6Var.b();
                j6 j6Var = k6Var.h;
                k6Var.h = null;
                if (j6Var != null) {
                    ArrayList arrayList2 = this.f18400j0;
                    if (!arrayList2.contains(j6Var)) {
                        arrayList2.add(j6Var);
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
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.f18408n1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
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
            a5 a5Var = this.J0;
            if ((a5Var != null && a5Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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
        n2 n2Var;
        int i10;
        Animator customSlideTransition;
        int i11;
        int i12;
        if (!this.O0.isEmpty()) {
            n2Var = (n2) p6.g(1, this.O0);
        } else {
            n2Var = null;
        }
        if (n2Var == null) {
            return;
        }
        float x10 = this.f18415s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = n2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x10 = Math.abs(this.f18415s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f18415s.getMeasuredWidth()) * x10);
            if (D()) {
                i11 = 380;
            } else {
                i11 = 50;
            }
            int max = Math.max(measuredWidth, i11);
            if (!shouldOverrideSlideTransition) {
                w wVar = this.f18415s;
                int measuredWidth2 = wVar.getMeasuredWidth();
                if (this.f18388d1) {
                    i12 = AndroidUtilities.dp(56.0f);
                } else {
                    i12 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wVar, property, measuredWidth2 + i12);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f18415s.getMeasuredWidth()).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(qr.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f18415s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 320;
            } else {
                i10 = 120;
            }
            int max2 = Math.max(measuredWidth3, i10);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18415s, property, 0.0f);
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(qr.h);
                }
            }
        }
        Animator customSlideTransition2 = n2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        n2 n2Var2 = (n2) p6.g(2, this.O0);
        if (n2Var2 != null && (customSlideTransition = n2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f18397h1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final boolean e0() {
        n2 n2Var;
        if (!this.O0.isEmpty()) {
            n2Var = (n2) p6.g(1, this.O0);
        } else {
            n2Var = null;
        }
        if (n2Var != null && n2Var.getLastStoryViewer() != null && n2Var.getLastStoryViewer().attachedToParent()) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.ui.ActionBar.c5 r14, java.lang.Runnable r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.c5, java.lang.Runnable):void");
    }

    public final void g(h6 h6Var, int i10, boolean z10, boolean z11, Runnable runnable) {
        f(new c5(h6Var, i10, z10, z11), runnable);
    }

    @Override
    public n2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (n2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public f3 getBottomSheet() {
        return null;
    }

    public o3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        w wVar;
        if (!this.h && !this.f18379a0 && !this.f18406n) {
            return 0.0f;
        }
        n2 n2Var = this.I;
        if (n2Var != null && n2Var.inPreviewMode) {
            wVar = this.v;
        } else {
            wVar = this.f18415s;
        }
        return wVar.getAlpha();
    }

    public z3 getDrawerLayoutContainer() {
        return this.f18422x;
    }

    @Override
    public List<n2> getFragmentStack() {
        return this.O0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override
    public n2 getLastFragment() {
        if (this.O0.isEmpty()) {
            return null;
        }
        return (n2) p6.g(1, this.O0);
    }

    public n2 getLastFragmentIncludeMainTabs() {
        n2 lastFragment = getLastFragment();
        if (lastFragment instanceof eh0) {
            return ((eh0) lastFragment).X();
        }
        return lastFragment;
    }

    @Override
    public f5 getMessageDrawableOutMediaStart() {
        return this.f18392f0;
    }

    @Override
    public f5 getMessageDrawableOutStart() {
        return this.f18389e0;
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
    public n2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                n2 n2Var = (n2) getFragmentStack().get(size);
                if (n2Var != null && !n2Var.isFinishing() && !n2Var.isRemovingFromStack()) {
                    return n2Var;
                }
            }
            return null;
        }
        return null;
    }

    public hz getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.m0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f18384c;
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
            ArrayList arrayList = this.f18399i1;
            StringBuilder g10 = w.f.g(str, " ");
            g10.append(this.O0.size());
            arrayList.add(0, g10.toString());
            if (this.f18399i1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.f18399i1.get(i10));
                }
                this.f18399i1 = arrayList2;
            }
        }
        o oVar = this.f18401j1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.f18416s0) {
            U(this.f18417t0, this.f18418u0);
            this.f18416s0 = false;
        } else if (this.f18407n0) {
            c5 c5Var = new c5(this.f18409o0, this.f18414r0, this.f18412q0, false);
            boolean z10 = this.f18411p0;
            if (!z10) {
                c5Var.f18564g = z10;
                c5Var.f18563f = z10;
            }
            f(c5Var, null);
            this.f18409o0 = null;
            this.f18407n0 = false;
        }
    }

    public final boolean j() {
        if (this.f18379a0) {
            return false;
        }
        if (this.W && (this.f18419v0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.W;
    }

    public final void k() {
        l(false, false);
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        n2 n2Var;
        boolean z13;
        boolean z14;
        n2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            a5 a5Var = this.J0;
            if ((a5Var == null || a5Var.k(this)) && !j() && !this.O0.isEmpty()) {
                Activity activity = this.K0;
                if (activity.getCurrentFocus() != null) {
                    AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.f18379a0 || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2 n2Var2 = (n2) p6.g(1, this.O0);
                AnimatorSet animatorSet = null;
                if (this.O0.size() > 1) {
                    n2Var = (n2) p6.g(2, this.O0);
                } else {
                    n2Var = null;
                }
                if (n2Var != null) {
                    if (i6.w0(null, i6.f19113s8, false) != -1 && (!n2Var.hasForceLightStatusBar() || i6.A0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    AndroidUtilities.setLightStatusBar(activity, z13);
                    w wVar = this.f18415s;
                    this.f18415s = this.v;
                    this.v = wVar;
                    n2Var.setParentLayout(this);
                    View view = n2Var.fragmentView;
                    if (view == null && (view = n2Var.performCreateView(activity)) != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(n2Var, 0);
                        WeakHashMap weakHashMap = r0.i0.f41843a;
                        r0.a0.j(view, nVar);
                        this.f18415s.invalidate();
                    }
                    if (!this.h) {
                        this.f18415s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            n2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        this.f18415s.addView(view);
                        this.f18415s.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
                        this.f18415s.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        k kVar = n2Var.actionBar;
                        if (kVar != null && kVar.K) {
                            if (this.C0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            AndroidUtilities.removeFromParent(n2Var.actionBar);
                            this.f18415s.addView(n2Var.actionBar);
                        }
                        n2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                        n2Var.attachSheets(this.f18415s);
                    }
                    this.H = n2Var;
                    this.I = n2Var2;
                    n2Var.onTransitionAnimationStart(true, true);
                    n2Var2.onTransitionAnimationStart(false, true);
                    n2Var.onResume();
                    if (this.f18402k0 != null) {
                        this.f18398i0 = n2Var.getThemeDescriptions();
                    }
                    this.f18424y = n2Var.actionBar;
                    if (!n2Var.hasOwnBackground && view.getBackground() == null) {
                        view.setBackgroundColor(i6.w0(null, i6.f18836d6, false));
                    }
                    if (z12) {
                        this.f18419v0 = System.currentTimeMillis();
                        this.W = true;
                        n2Var2.setRemovingFromStack(true);
                        this.f18425y0 = new p(this, n2Var2, n2Var, 0);
                        if (!this.h && !this.f18379a0) {
                            animatorSet = n2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f18415s.f19636b || this.v.f19636b)) {
                                v2 v2Var = new v2(this, 1);
                                this.d = v2Var;
                                AndroidUtilities.runOnUIThread(v2Var, 200L);
                            } else {
                                if (!z15 && !this.f18379a0) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                d0(false, true, z14);
                            }
                        } else {
                            this.K = animatorSet;
                            oc ocVar = oc.f26747w;
                            if (ocVar != null && ocVar.f26756l) {
                                ocVar.b();
                            }
                        }
                        I("closeLastFragment");
                    } else {
                        m(n2Var2);
                        n2Var2.onTransitionAnimationEnd(false, true);
                        n2Var.onTransitionAnimationEnd(true, true);
                        n2Var.onBecomeFullyVisible();
                    }
                } else if (this.A0 && !z11) {
                    this.f18419v0 = System.currentTimeMillis();
                    this.W = true;
                    this.f18425y0 = new m4.g0(22, this, n2Var2);
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
                    b0(n2Var2, false);
                    setVisibility(8);
                    View view3 = this.B0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                n2Var2.onFragmentClosed();
            }
        }
    }

    public final void m(n2 n2Var) {
        n2Var.finishing = true;
        n2Var.onPause();
        n2Var.onFragmentDestroy();
        n2Var.setParentLayout(null);
        this.O0.remove(n2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.f18415s);
        w wVar = this.f18420w;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        I("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((n2) p6.g(1, fragmentStack)).dismissCurrentDialog();
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
            if ((view instanceof w) && ((w) view).f19643x) {
                int i18 = l1Var.f41855a.f(8).d;
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
                r0.l1 l1Var2 = r0.l1.f41854b;
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
            r0.i0.b(view, r0.l1.f41854b);
            return;
        }
        boolean z12 = this.N0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.b bVar = this.f18408n1;
        i0.b bVar2 = this.f18410o1;
        if (view instanceof o3) {
            if (z12) {
                i15 = 0;
            } else {
                i15 = bVar.f10588a;
            }
            if (z10) {
                i16 = 0;
            } else {
                i16 = bVar.f10590c;
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
            a4 a4Var = wVar.f19642w;
            if (a4Var != a4.f18445c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i11 = bVar2.f10588a;
            } else {
                i11 = 0;
            }
            if (!z13 && !z10) {
                i12 = bVar2.f10590c;
            } else {
                i12 = 0;
            }
            if (z13 && !z12) {
                i13 = 0;
            } else {
                i13 = bVar2.f10588a;
            }
            if (z13 && !z10) {
                i14 = 0;
            } else {
                i14 = bVar2.f10590c;
            }
            if (a4Var == a4.f18443a) {
                i10 = Math.max(i10, bVar2.d);
                r0.i0.b(view, r0.l1.f41854b);
            } else {
                r0.i0.b(view, l1Var.f41855a.m(i13, 0, i14, i10));
            }
            view.setPadding(i11, 0, i12, i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18378a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.O0.isEmpty()) {
            int size = this.O0.size();
            for (int i10 = 0; i10 < size; i10++) {
                n2 n2Var = (n2) this.O0.get(i10);
                n2Var.onConfigurationChanged(configuration);
                Dialog dialog = n2Var.visibleDialog;
                if (dialog instanceof f3) {
                    ((f3) dialog).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18378a = false;
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
        z zVar;
        if (i10 == 82 && !j() && !this.Q && (kVar = this.f18424y) != null && !kVar.s() && (zVar = kVar.E) != null) {
            int childCount = zVar.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    v0 v0Var = (v0) childAt;
                    if (v0Var.getVisibility() != 0) {
                        continue;
                    } else if (v0Var.q()) {
                        v0Var.M(null, null);
                        break;
                    } else if (v0Var.S) {
                        zVar.o(((Integer) v0Var.getTag()).intValue());
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
        n2 n2Var;
        boolean z10 = true;
        if (!this.O0.isEmpty()) {
            n2Var = (n2) p6.g(1, this.O0);
        } else {
            n2Var = null;
        }
        if (n2Var != null && !n2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            n2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, 1073741824));
            return;
        }
        a5 a5Var = this.J0;
        if (a5Var != null) {
            int[] iArr = this.Y0;
            iArr[0] = i10;
            iArr[1] = i11;
            a5Var.e(iArr);
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
        if (!j() && !this.f18421w0 && !this.T && !this.f18388d1) {
            if (this.O0.size() > 1 && ((sVar = this.G) == null || sVar.getLastSheet() == null || !this.G.getLastSheet().isShown())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((n2) p6.g(1, this.O0)).isSwipeBackEnabled(motionEvent)) {
                        this.P = false;
                        this.Q = false;
                        w wVar = this.f18415s;
                        if (wVar != null) {
                            wVar.setLayerType(0, null);
                            return false;
                        }
                    } else {
                        this.f18423x0 = motionEvent.getPointerId(0);
                        this.P = true;
                        this.R = (int) motionEvent.getX();
                        this.S = (int) motionEvent.getY();
                        VelocityTracker velocityTracker = this.U;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f18423x0) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.R));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.S);
                    this.U.addMovement(motionEvent);
                    if (!this.W && !this.h && this.P && !this.Q && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                        if (((n2) p6.g(1, this.O0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
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
                            ((n2) p6.g(1, this.O0)).onBeginSlide();
                            this.V = true;
                        }
                        if (D()) {
                            float f7 = max;
                            this.f18415s.setTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                            setInnerTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        } else {
                            float f10 = max;
                            this.f18415s.setTranslationX(f10);
                            setInnerTranslationX(f10);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f18423x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    this.U.addMovement(motionEvent);
                    this.U.computeCurrentVelocity(1000);
                    n2 n2Var = (n2) p6.g(1, this.O0);
                    if (!this.h && !this.f18379a0 && !this.Q && n2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.U.getXVelocity();
                        float yVelocity = this.U.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && n2Var.canBeginSlide()) {
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
                        float x10 = this.f18415s.getX();
                        float xVelocity2 = this.U.getXVelocity();
                        float yVelocity2 = this.U.getYVelocity();
                        if (!D() ? x10 < this.f18415s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.P = false;
                        this.Q = false;
                        w wVar2 = this.f18415s;
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
                    w wVar3 = this.f18415s;
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
        if (f18375p1 != null && SharedConfig.drawActionBarShadow) {
            int i12 = i10 / 2;
            if (f18375p1.getAlpha() != i12) {
                f18375p1.setAlpha(i12);
            }
            f18375p1.setBounds(0, i11, getMeasuredWidth(), f18375p1.getIntrinsicHeight() + i11);
            f18375p1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.f18406n = true;
        this.h = false;
        n2 n2Var = (n2) p6.g(1, this.O0);
        n2Var.fragmentView.setOutlineProvider(null);
        n2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        n2Var.fragmentView.setLayoutParams(layoutParams);
        T((n2) p6.g(2, this.O0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(n2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(n2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new qr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ai.z(12, this, n2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f18415s.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
        this.f18415s.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
        n2Var.setInPreviewMode(false);
        n2Var.setInMenuMode(false);
        try {
            Activity activity = this.K0;
            if (i6.w0(null, i6.f19113s8, false) != -1 && (!n2Var.hasForceLightStatusBar() || i6.A0().q())) {
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
        if (!this.O0.isEmpty() && ((n2) p6.g(1, this.O0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.B0 = view;
    }

    @Override
    public void setDelegate(a5 a5Var) {
        this.J0 = a5Var;
    }

    @Override
    public void setDrawerLayoutContainer(z3 z3Var) {
        this.f18422x = z3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i10) {
        w wVar = this.f18415s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<n2> list) {
        this.O0 = list;
        o3 o3Var = this.E;
        if (o3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            o3Var.I.remove(oVar);
            o3Var.J.remove(oVar2);
            AndroidUtilities.removeFromParent(this.E);
            this.E = null;
        }
        boolean z10 = this.L0;
        Activity activity = this.K0;
        if (z10) {
            o3 o3Var2 = new o3(activity, this);
            this.E = o3Var2;
            this.F = new cf.c(o3Var2);
            o3 o3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            o3Var3.I.add(oVar3);
            o3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            x3 x3Var = LaunchActivity.G1.f30860y0;
            if (x3Var != null) {
                x3Var.setTabsView(this.E);
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
        w wVar3 = this.f18415s;
        if (wVar3 != null) {
            AndroidUtilities.removeFromParent(wVar3);
        }
        w wVar4 = new w(activity, this);
        this.f18415s = wVar4;
        addView(wVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f18415s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f18415s.setLayoutParams(layoutParams3);
        w wVar5 = this.f18420w;
        if (wVar5 != null) {
            AndroidUtilities.removeFromParent(wVar5);
        }
        w wVar6 = new w(activity, this);
        this.f18420w = wVar6;
        this.f18383b1.f22951a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f18420w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f18420w.setLayoutParams(layoutParams4);
        s sVar = this.G;
        if (sVar != null) {
            sVar.setParentLayout(this);
            s sVar2 = this.G;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f18420w) {
                AndroidUtilities.removeFromParent(view);
                this.f18420w.addView(view, w7.x5.c(-1.0f, -1));
                this.f18420w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        for (n2 n2Var : this.O0) {
            n2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f18391f = z10;
    }

    public void setInnerTranslationX(float f7) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f7;
        invalidate();
        if (this.O0.size() >= 2 && this.f18415s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.clamp01(f7 / (AndroidUtilities.dp(56.0f) * 6));
            } else {
                measuredWidth = f7 / this.f18415s.getMeasuredWidth();
            }
            n2 n2Var = (n2) p6.g(2, this.O0);
            n2Var.onSlideProgress(false, measuredWidth);
            n2 n2Var2 = (n2) p6.g(1, this.O0);
            float a2 = w7.p.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (n2Var2.isBeginToShow() && (navigationBarColor = n2Var2.getNavigationBarColor()) != (navigationBarColor2 = n2Var.getNavigationBarColor())) {
                n2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f18381b = z10;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (this.l1 != i10) {
            this.l1 = i10;
            invalidate();
        }
        z3 z3Var = this.f18422x;
        if (z3Var != null) {
            z3Var.setInternalNavigationBarColor(i10);
        }
        o3 o3Var = this.E;
        if (o3Var != null) {
            if (!this.Q && !this.T) {
                z10 = true;
            } else {
                z10 = false;
            }
            o3Var.i(i10, z10);
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
        ArrayList arrayList = this.f18396h0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i10);
            int[] iArr = (int[]) this.f18382b0.get(i10);
            int[] iArr2 = (int[]) this.f18385c0.get(i10);
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
                k6 k6Var = (k6) arrayList2.get(i11);
                int i14 = k6Var.f19356f;
                e6 e6Var = k6Var.f19364o;
                if (e6Var != null) {
                    e6Var.L0(i14, argb);
                } else {
                    SparseIntArray sparseIntArray = i6.sl;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i14, argb);
                    }
                }
                k6Var.d(argb, false, false);
                i11++;
                i10 = i13;
                arrayList = arrayList3;
                size = i12;
            }
            i10++;
        }
        ArrayList arrayList4 = this.f18400j0;
        int size3 = arrayList4.size();
        for (int i15 = 0; i15 < size3; i15++) {
            j6 j6Var = (j6) arrayList4.get(i15);
            if (j6Var != null) {
                j6Var.b();
                j6Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.f18398i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                k6 k6Var2 = (k6) this.f18398i0.get(i16);
                k6Var2.d(i6.v0(k6Var2.f19356f, k6Var2.f19364o), false, false);
            }
        }
        wn wnVar = this.f18394g0;
        if (wnVar != null) {
            zn znVar = wnVar.f39266a;
            znVar.V.f32524x0.invalidate();
            znVar.I.I = f7;
            znVar.J.I = f7;
            znVar.k(f7);
        }
        a5 a5Var = this.J0;
        if (a5Var != null) {
            a5Var.a(f7);
        }
        x(this);
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.A0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f18384c = window;
    }

    public final n2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                n2 n2Var = (n2) getFragmentStack().get(size);
                if (n2Var != null && !n2Var.isFinishing() && !n2Var.isRemovingFromStack() && wg0.class.isInstance(n2Var)) {
                    return n2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int v(boolean z10) {
        o3 o3Var;
        if (this.L0 && (o3Var = this.E) != null) {
            if (z10) {
                return (int) o3Var.G;
            }
            return o3Var.H;
        }
        return 0;
    }

    public final hz w() {
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
            if (view.getParent() != this.f18420w) {
                AndroidUtilities.removeFromParent(view);
                this.f18420w.addView(view, w7.x5.c(-1.0f, -1));
                this.f18420w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.f18420w.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean y() {
        if (!this.h && !this.f18379a0) {
            return false;
        }
        return true;
    }

    @Override
    public final List z() {
        n2 lastFragment = getLastFragment();
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
