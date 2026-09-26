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
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b90;
import org.telegram.ui.dz;
import org.telegram.ui.qg0;
import org.telegram.ui.rn;
import org.telegram.ui.un;
import org.telegram.ui.yg0;
public class ActionBarLayout extends FrameLayout implements b5, mg.b {
    public static Drawable f18599p1;
    public static Drawable f18600q1;
    public static Paint f18601r1;
    public boolean A0;
    public View B0;
    public boolean C0;
    public s D0;
    public m3 E;
    public float E0;
    public cf.c F;
    public long F0;
    public r G;
    public String G0;
    public m2 H;
    public int H0;
    public m2 I;
    public b90 I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public y4 J0;
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
    public boolean f18602a;
    public boolean f18603a0;
    public int f18604a1;
    public boolean f18605b;
    public final ArrayList f18606b0;
    public final org.telegram.ui.Components.e6 f18607b1;
    public Window f18608c;
    public final ArrayList f18609c0;
    public boolean f18610c1;
    public Runnable d;
    public final n7.z0 f18611d0;
    public boolean f18612d1;
    public Runnable e;
    public d5 f18613e0;
    public boolean f18614e1;
    public boolean f18615f;
    public d5 f18616f0;
    public float f18617f1;
    public rn f18618g0;
    public boolean f18619g1;
    public boolean h;
    public final ArrayList f18620h0;
    public AnimatorSet f18621h1;
    public ArrayList f18622i0;
    public ArrayList f18623i1;
    public final ArrayList f18624j0;
    public final o f18625j1;
    public AnimatorSet f18626k0;
    public boolean f18627k1;
    public final AnimationNotificationsLocker f18628l0;
    public int l1;
    public float m0;
    public r0.l1 f18629m1;
    public boolean f18630n;
    public boolean f18631n0;
    public i0.b f18632n1;
    public g6 f18633o0;
    public i0.b f18634o1;
    public boolean f18635p0;
    public boolean f18636q0;
    public ColorDrawable f18637r;
    public int f18638r0;
    public v f18639s;
    public boolean f18640s0;
    public boolean f18641t0;
    public boolean f18642u0;
    public v v;
    public long f18643v0;
    public v f18644w;
    public boolean f18645w0;
    public x3 f18646x;
    public int f18647x0;
    public k f18648y;
    public Runnable f18649y0;
    public Runnable f18650z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.f18606b0 = new ArrayList();
        this.f18609c0 = new ArrayList();
        n7.z0 z0Var = new n7.z0(1);
        z0Var.f15410b = new SparseIntArray();
        z0Var.f15411c = new int[]{h6.Aa, h6.Da, h6.Ea, h6.Fa, h6.f19008ac, h6.Ca};
        this.f18611d0 = z0Var;
        this.f18620h0 = new ArrayList();
        this.f18624j0 = new ArrayList();
        this.f18628l0 = new AnimationNotificationsLocker();
        this.Q0 = new Rect();
        this.T0 = -1;
        this.V0 = new Path();
        this.W0 = new float[8];
        this.Y0 = new int[2];
        this.f18607b1 = new org.telegram.ui.Components.e6(this, 280L, rr.h);
        this.f18623i1 = new ArrayList();
        this.f18625j1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.f18632n1 = bVar;
        this.f18634o1 = bVar;
        this.K0 = (Activity) context;
        this.L0 = z10;
        if (f18600q1 == null) {
            f18600q1 = getResources().getDrawable(R.drawable.layer_shadow);
            f18599p1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f18601r1 = new Paint();
        }
        n nVar = new n(this, 1);
        WeakHashMap weakHashMap = r0.i0.f42128a;
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
            m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(1, actionBarLayout.O0);
            m2Var.prepareFragmentToSlide(true, false);
            m2Var.onPause();
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
            List list = actionBarLayout.O0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            v vVar = actionBarLayout.f18639s;
            vVar.setAlpha(1.0f);
            v vVar2 = actionBarLayout.v;
            actionBarLayout.f18639s = vVar2;
            actionBarLayout.v = vVar;
            actionBarLayout.bringChildToFront(vVar2);
            View view = actionBarLayout.f18644w;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.O0.size() > 0) {
                m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(1, actionBarLayout.O0);
                actionBarLayout.f18648y = m2Var2.actionBar;
                m2Var2.onResume();
                m2Var2.onBecomeFullyVisible();
                m2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.O0.size() >= 2) {
            ((m2) org.telegram.ui.Cells.c1.i(1, actionBarLayout.O0)).prepareFragmentToSlide(true, false);
            m2 m2Var3 = (m2) org.telegram.ui.Cells.c1.i(2, actionBarLayout.O0);
            m2Var3.prepareFragmentToSlide(false, false);
            m2Var3.onPause();
            View view2 = m2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                m2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(m2Var3.fragmentView);
            }
            k kVar = m2Var3.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(m2Var3.actionBar);
            }
            m2Var3.detachSheets();
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.Q = false;
        actionBarLayout.T = false;
        actionBarLayout.f18639s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.f18639s.setLayerType(0, null);
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
            if (childAt instanceof x5) {
                ((x5) childAt).e();
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
        if (this.f18612d1 && this.f18614e1) {
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
        s sVar = this.D0;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.D0 = null;
        }
        setAlpha(1.0f);
        this.f18639s.setAlpha(1.0f);
        this.f18639s.setScaleX(1.0f);
        this.f18639s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void G() {
        k kVar;
        if (!this.f18603a0 && !this.Q && !j() && !this.O0.isEmpty()) {
            a30 a30Var = a30.f22570d0;
            if (a30Var != null && a30Var.f22582w) {
                a30Var.e(false);
                return;
            }
            if (!e0() && (kVar = this.f18648y) != null && !kVar.s()) {
                k kVar2 = this.f18648y;
                if (kVar2.f19555n0) {
                    kVar2.h(true);
                    return;
                }
            }
            r rVar = this.G;
            if ((rVar == null || rVar.onBackPressed(true)) && ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).onBackPressed(true) && !this.O0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final void H() {
        if (this.W && this.f18649y0 != null) {
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                this.K = null;
                animatorSet.cancel();
            }
            this.W = false;
            this.f18603a0 = false;
            this.f18643v0 = 0L;
            this.H = null;
            this.I = null;
            Runnable runnable = this.f18649y0;
            this.f18649y0 = null;
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
        for (m2 m2Var : this.O0) {
            m2Var.onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (this.W && (runnable = this.f18650z0) != null) {
            this.W = false;
            this.f18603a0 = false;
            this.f18643v0 = 0L;
            this.H = null;
            this.I = null;
            this.f18650z0 = null;
            runnable.run();
            i();
        }
    }

    public final void L() {
        if (!this.O0.isEmpty()) {
            ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).onPause();
        }
        r rVar = this.G;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void M() {
        if (!this.O0.isEmpty()) {
            ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).onResume();
        }
        r rVar = this.G;
        if (rVar != null) {
            rVar.onResume();
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
        m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(2, this.O0);
        View view = m2Var.fragmentView;
        if (view == null && (view = m2Var.performCreateView(this.K0)) != null && m2Var.isSupportEdgeToEdge() && m2Var.drawEdgeNavigationBar()) {
            n nVar = new n(m2Var, 0);
            WeakHashMap weakHashMap = r0.i0.f42128a;
            r0.a0.j(view, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            m2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.v.addView(view);
        this.v.setShouldHandleBottomInsets(m2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(m2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = m2Var.actionBar;
        if (kVar != null && kVar.K) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.C0) {
                m2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(m2Var.actionBar);
        }
        m2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
        m2Var.attachSheets(this.v);
        if (!m2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(h6.w0(null, h6.f19059d6, false));
        }
        m2Var.onResume();
        if (this.f18626k0 != null) {
            this.f18622i0 = m2Var.getThemeDescriptions();
        }
        this.f18639s.setLayerType(2, null);
        ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).prepareFragmentToSlide(true, true);
        m2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(m2 m2Var) {
        return R(new z4(m2Var));
    }

    public final boolean Q(m2 m2Var, boolean z10) {
        z4 z4Var = new z4(m2Var);
        z4Var.f19954b = z10;
        return R(z4Var);
    }

    public final boolean R(org.telegram.ui.ActionBar.z4 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.R(org.telegram.ui.ActionBar.z4):boolean");
    }

    public final boolean S(m2 m2Var, boolean z10, boolean z11) {
        z4 z4Var = new z4(m2Var);
        z4Var.f19954b = z10;
        z4Var.f19955c = z11;
        z4Var.d = true;
        z4Var.e = false;
        return R(z4Var);
    }

    public final void T(m2 m2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (m2Var == null) {
            return;
        }
        m2Var.onBecomeFullyHidden();
        m2Var.onPause();
        if (z10) {
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
            this.O0.remove(m2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = m2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                m2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(m2Var.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                    try {
                        viewGroup2.removeView(m2Var.fragmentView);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
            }
            k kVar = m2Var.actionBar;
            if (kVar != null && kVar.K && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(m2Var.actionBar);
            }
            m2Var.detachSheets();
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
                ((m2) this.O0.get(i10)).clearViews();
                ((m2) this.O0.get(i10)).setParentLayout(this);
            }
            y4 y4Var = this.J0;
            if (y4Var != null) {
                y4Var.b(this, z10);
            }
            if (z11) {
                c0();
                return;
            }
            return;
        }
        this.f18640s0 = true;
        this.f18641t0 = z10;
        this.f18642u0 = z11;
    }

    public final void V() {
        U(true, true);
    }

    public final void W() {
        this.f18639s.removeAllViews();
        this.v.removeAllViews();
        this.f18648y = null;
        this.H = null;
        this.I = null;
    }

    public final void X() {
        while (this.O0.size() > 0) {
            b0((m2) this.O0.get(0), false);
        }
        View view = this.B0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Y(int i10) {
        if (i10 >= 0 && i10 < getFragmentStack().size()) {
            Z((m2) getFragmentStack().get(i10));
        }
    }

    public final void Z(m2 m2Var) {
        a0(m2Var, false);
    }

    public final void a0(m2 m2Var, boolean z10) {
        boolean z11 = true;
        if ((this.O0.size() > 0 && org.telegram.ui.Cells.c1.i(1, this.O0) == m2Var) || (this.O0.size() > 1 && org.telegram.ui.Cells.c1.i(2, this.O0) == m2Var)) {
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
        b0(m2Var, (!m2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) ? false : false);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.l1 l1Var = this.f18629m1;
        if (l1Var != null) {
            o(view, l1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f18609c0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = ((j6) arrayList.get(i10)).c();
            }
        }
    }

    public final void b0(m2 m2Var, boolean z10) {
        if (!this.O0.contains(m2Var)) {
            return;
        }
        if (z10 && org.telegram.ui.Cells.c1.i(1, this.O0) == m2Var) {
            m2Var.finishFragment();
        } else if (org.telegram.ui.Cells.c1.i(1, this.O0) == m2Var && this.O0.size() > 1) {
            m2Var.finishFragment(false);
        } else {
            m2Var.onPause();
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
            this.O0.remove(m2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i10, m2 m2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        y4 y4Var = this.J0;
        if ((y4Var != null && !y4Var.h(m2Var, this)) || !m2Var.onFragmentCreate() || this.O0.contains(m2Var)) {
            return false;
        }
        m2Var.setParentLayout(this);
        Activity activity = this.K0;
        if (i10 != -1 && i10 != -2) {
            if (i10 == -3) {
                View view = m2Var.fragmentView;
                if (view == null) {
                    view = m2Var.performCreateView(activity);
                    if (view != null && m2Var.isSupportEdgeToEdge() && m2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(m2Var, 0);
                        WeakHashMap weakHashMap = r0.i0.f42128a;
                        r0.a0.j(view, nVar);
                        this.f18639s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        m2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!m2Var.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(h6.w0(null, h6.f19059d6, false));
                }
                v vVar = this.f18639s;
                vVar.addView(view, Utilities.clamp(0, vVar.getChildCount(), 0), w7.y5.c(-1.0f, -1));
                this.f18639s.setShouldHandleBottomInsets(m2Var.getEdgeToEdgeSupportMode());
                this.f18639s.setDrawNavigationBar(m2Var.drawEdgeNavigationBar());
                k kVar = m2Var.actionBar;
                if (kVar != null && kVar.K) {
                    if (this.C0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) m2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(m2Var.actionBar);
                    }
                    this.f18639s.addView(m2Var.actionBar);
                }
                m2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                m2Var.attachSheets(this.f18639s);
                i10 = 0;
            }
            this.O0.add(i10, m2Var);
            I("addFragmentToStack");
        } else {
            if (!this.O0.isEmpty()) {
                m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
                m2Var2.onPause();
                k kVar2 = m2Var2.actionBar;
                if (kVar2 != null && kVar2.K && (viewGroup2 = (ViewGroup) kVar2.getParent()) != null) {
                    viewGroup2.removeView(m2Var2.actionBar);
                }
                View view2 = m2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    m2Var2.onRemoveFromParent();
                    viewGroup.removeView(m2Var2.fragmentView);
                }
                m2Var2.detachSheets();
            }
            this.O0.add(m2Var);
            if (i10 != -2) {
                View view3 = m2Var.fragmentView;
                if (view3 == null) {
                    view3 = m2Var.performCreateView(activity);
                    if (view3 != null && m2Var.isSupportEdgeToEdge() && m2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(m2Var, 0);
                        WeakHashMap weakHashMap2 = r0.i0.f42128a;
                        r0.a0.j(view3, nVar2);
                        this.f18639s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        m2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!m2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(h6.w0(null, h6.f19059d6, false));
                }
                this.f18639s.addView(view3, w7.y5.c(-1.0f, -1));
                this.f18639s.setShouldHandleBottomInsets(m2Var.getEdgeToEdgeSupportMode());
                this.f18639s.setDrawNavigationBar(m2Var.drawEdgeNavigationBar());
                k kVar3 = m2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.C0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) m2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(m2Var.actionBar);
                    }
                    this.f18639s.addView(m2Var.actionBar);
                }
                m2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                m2Var.attachSheets(this.f18639s);
                m2Var.onResume();
                m2Var.onTransitionAnimationEnd(false, true);
                m2Var.onTransitionAnimationEnd(true, true);
                m2Var.onBecomeFullyVisible();
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
                if (this.O0.isEmpty() || this.O0.size() - 1 != size || ((m2) this.O0.get(size)).fragmentView == null) {
                    for (int i10 = 0; i10 < size; i10++) {
                        m2 m2Var = (m2) this.O0.get(i10);
                        k kVar = m2Var.actionBar;
                        if (kVar != null && kVar.K && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                            viewGroup2.removeView(m2Var.actionBar);
                        }
                        View view = m2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            m2Var.onPause();
                            m2Var.onRemoveFromParent();
                            viewGroup.removeView(m2Var.fragmentView);
                        }
                    }
                    m2 m2Var2 = (m2) this.O0.get(size);
                    m2Var2.setParentLayout(this);
                    View view2 = m2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = m2Var2.performCreateView(this.K0);
                        if (view2 != null && m2Var2.isSupportEdgeToEdge() && m2Var2.drawEdgeNavigationBar()) {
                            n nVar = new n(m2Var2, 0);
                            WeakHashMap weakHashMap = r0.i0.f42128a;
                            r0.a0.j(view2, nVar);
                            this.f18639s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            m2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f18639s.addView(view2, w7.y5.c(-1.0f, -1));
                    this.f18639s.setShouldHandleBottomInsets(m2Var2.getEdgeToEdgeSupportMode());
                    this.f18639s.setDrawNavigationBar(m2Var2.drawEdgeNavigationBar());
                    k kVar2 = m2Var2.actionBar;
                    if (kVar2 != null && kVar2.K) {
                        if (this.C0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(m2Var2.actionBar);
                        this.f18639s.addView(m2Var2.actionBar);
                    }
                    m2Var2.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                    m2Var2.attachSheets(this.f18639s);
                    m2Var2.onResume();
                    m2Var2.onBecomeFullyVisible();
                    this.f18648y = m2Var2.actionBar;
                    if (!m2Var2.hasOwnBackground && view2.getBackground() == null) {
                        view2.setBackgroundColor(h6.w0(null, h6.f19059d6, false));
                    }
                }
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f18620h0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f18606b0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                j6 j6Var = (j6) arrayList.get(i10);
                iArr[i10] = j6Var.c();
                i6 i6Var = j6Var.h;
                j6Var.h = null;
                if (i6Var != null) {
                    ArrayList arrayList2 = this.f18624j0;
                    if (!arrayList2.contains(i6Var)) {
                        arrayList2.add(i6Var);
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
        s sVar = new s(this, z11, z12, z10);
        this.D0 = sVar;
        AndroidUtilities.runOnUIThread(sVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E != null && v(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.f18632n1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
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
            y4 y4Var = this.J0;
            if ((y4Var != null && y4Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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
        m2 m2Var;
        int i10;
        Animator customSlideTransition;
        int i11;
        int i12;
        if (!this.O0.isEmpty()) {
            m2Var = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
        } else {
            m2Var = null;
        }
        if (m2Var == null) {
            return;
        }
        float x10 = this.f18639s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = m2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x10 = Math.abs(this.f18639s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f18639s.getMeasuredWidth()) * x10);
            if (D()) {
                i11 = 380;
            } else {
                i11 = 50;
            }
            int max = Math.max(measuredWidth, i11);
            if (!shouldOverrideSlideTransition) {
                v vVar = this.f18639s;
                int measuredWidth2 = vVar.getMeasuredWidth();
                if (this.f18612d1) {
                    i12 = AndroidUtilities.dp(56.0f);
                } else {
                    i12 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vVar, property, measuredWidth2 + i12);
                long j3 = max;
                animatorSet.playTogether(ofFloat.setDuration(j3), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f18639s.getMeasuredWidth()).setDuration(j3));
                if (D()) {
                    animatorSet.setInterpolator(rr.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f18639s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 320;
            } else {
                i10 = 120;
            }
            int max2 = Math.max(measuredWidth3, i10);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18639s, property, 0.0f);
                long j10 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(rr.h);
                }
            }
        }
        Animator customSlideTransition2 = m2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(2, this.O0);
        if (m2Var2 != null && (customSlideTransition = m2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f18621h1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final boolean e0() {
        m2 m2Var;
        if (!this.O0.isEmpty()) {
            m2Var = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
        } else {
            m2Var = null;
        }
        if (m2Var != null && m2Var.getLastStoryViewer() != null && m2Var.getLastStoryViewer().attachedToParent()) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.ui.ActionBar.a5 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.a5, java.lang.Runnable):void");
    }

    public final void g(g6 g6Var, int i10, boolean z10, boolean z11, Runnable runnable) {
        f(new a5(g6Var, i10, z10, z11), runnable);
    }

    @Override
    public m2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (m2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public e3 getBottomSheet() {
        return null;
    }

    public m3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        v vVar;
        if (!this.h && !this.f18603a0 && !this.f18630n) {
            return 0.0f;
        }
        m2 m2Var = this.I;
        if (m2Var != null && m2Var.inPreviewMode) {
            vVar = this.v;
        } else {
            vVar = this.f18639s;
        }
        return vVar.getAlpha();
    }

    public x3 getDrawerLayoutContainer() {
        return this.f18646x;
    }

    @Override
    public List<m2> getFragmentStack() {
        return this.O0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override
    public m2 getLastFragment() {
        if (this.O0.isEmpty()) {
            return null;
        }
        return (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
    }

    public m2 getLastFragmentIncludeMainTabs() {
        m2 lastFragment = getLastFragment();
        if (lastFragment instanceof yg0) {
            return ((yg0) lastFragment).X();
        }
        return lastFragment;
    }

    @Override
    public d5 getMessageDrawableOutMediaStart() {
        return this.f18616f0;
    }

    @Override
    public d5 getMessageDrawableOutStart() {
        return this.f18613e0;
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
    public m2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                m2 m2Var = (m2) getFragmentStack().get(size);
                if (m2Var != null && !m2Var.isFinishing() && !m2Var.isRemovingFromStack()) {
                    return m2Var;
                }
            }
            return null;
        }
        return null;
    }

    public dz getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.m0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f18608c;
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
            ArrayList arrayList = this.f18623i1;
            StringBuilder h = v7.j.h(str, " ");
            h.append(this.O0.size());
            arrayList.add(0, h.toString());
            if (this.f18623i1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.f18623i1.get(i10));
                }
                this.f18623i1 = arrayList2;
            }
        }
        o oVar = this.f18625j1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.f18640s0) {
            U(this.f18641t0, this.f18642u0);
            this.f18640s0 = false;
        } else if (this.f18631n0) {
            a5 a5Var = new a5(this.f18633o0, this.f18638r0, this.f18636q0, false);
            boolean z10 = this.f18635p0;
            if (!z10) {
                a5Var.f18725g = z10;
                a5Var.f18724f = z10;
            }
            f(a5Var, null);
            this.f18633o0 = null;
            this.f18631n0 = false;
        }
    }

    public final boolean j() {
        if (this.f18603a0) {
            return false;
        }
        if (this.W && (this.f18643v0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.W;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        m2 m2Var;
        boolean z13;
        boolean z14;
        m2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            y4 y4Var = this.J0;
            if ((y4Var == null || y4Var.k(this)) && !j() && !this.O0.isEmpty()) {
                Activity activity = this.K0;
                if (activity.getCurrentFocus() != null) {
                    AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.f18603a0 || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
                AnimatorSet animatorSet = null;
                if (this.O0.size() > 1) {
                    m2Var = (m2) org.telegram.ui.Cells.c1.i(2, this.O0);
                } else {
                    m2Var = null;
                }
                if (m2Var != null) {
                    if (h6.w0(null, h6.f19337s8, false) != -1 && (!m2Var.hasForceLightStatusBar() || h6.A0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    AndroidUtilities.setLightStatusBar(activity, z13);
                    v vVar = this.f18639s;
                    this.f18639s = this.v;
                    this.v = vVar;
                    m2Var.setParentLayout(this);
                    View view = m2Var.fragmentView;
                    if (view == null && (view = m2Var.performCreateView(activity)) != null && m2Var.isSupportEdgeToEdge() && m2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(m2Var, 0);
                        WeakHashMap weakHashMap = r0.i0.f42128a;
                        r0.a0.j(view, nVar);
                        this.f18639s.invalidate();
                    }
                    if (!this.h) {
                        this.f18639s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            m2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        this.f18639s.addView(view);
                        this.f18639s.setShouldHandleBottomInsets(m2Var.getEdgeToEdgeSupportMode());
                        this.f18639s.setDrawNavigationBar(m2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        k kVar = m2Var.actionBar;
                        if (kVar != null && kVar.K) {
                            if (this.C0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            AndroidUtilities.removeFromParent(m2Var.actionBar);
                            this.f18639s.addView(m2Var.actionBar);
                        }
                        m2Var.setTitleOverlayTextIfActionBarAttached(this.G0, this.H0, this.I0);
                        m2Var.attachSheets(this.f18639s);
                    }
                    this.H = m2Var;
                    this.I = m2Var2;
                    m2Var.onTransitionAnimationStart(true, true);
                    m2Var2.onTransitionAnimationStart(false, true);
                    m2Var.onResume();
                    if (this.f18626k0 != null) {
                        this.f18622i0 = m2Var.getThemeDescriptions();
                    }
                    this.f18648y = m2Var.actionBar;
                    if (!m2Var.hasOwnBackground && view.getBackground() == null) {
                        view.setBackgroundColor(h6.w0(null, h6.f19059d6, false));
                    }
                    if (z12) {
                        this.f18643v0 = System.currentTimeMillis();
                        this.W = true;
                        m2Var2.setRemovingFromStack(true);
                        this.f18649y0 = new org.telegram.messenger.video.o(this, m2Var2, m2Var, 3);
                        if (!this.h && !this.f18603a0) {
                            animatorSet = m2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f18639s.f19840b || this.v.f19840b)) {
                                u2 u2Var = new u2(this, 1);
                                this.d = u2Var;
                                AndroidUtilities.runOnUIThread(u2Var, 200L);
                            } else {
                                if (!z15 && !this.f18603a0) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                d0(false, true, z14);
                            }
                        } else {
                            this.K = animatorSet;
                            qc qcVar = qc.f27570w;
                            if (qcVar != null && qcVar.f27579l) {
                                qcVar.b();
                            }
                        }
                        I("closeLastFragment");
                    } else {
                        m(m2Var2);
                        m2Var2.onTransitionAnimationEnd(false, true);
                        m2Var.onTransitionAnimationEnd(true, true);
                        m2Var.onBecomeFullyVisible();
                    }
                } else if (this.A0 && !z11) {
                    this.f18643v0 = System.currentTimeMillis();
                    this.W = true;
                    this.f18649y0 = new ki.h0(27, this, m2Var2);
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
                    this.K.addListener(new q(this, 0));
                    this.K.start();
                } else {
                    b0(m2Var2, false);
                    setVisibility(8);
                    View view3 = this.B0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                m2Var2.onFragmentClosed();
            }
        }
    }

    public final void m(m2 m2Var) {
        m2Var.finishing = true;
        m2Var.onPause();
        m2Var.onFragmentDestroy();
        m2Var.setParentLayout(null);
        this.O0.remove(m2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.f18639s);
        v vVar = this.f18644w;
        if (vVar != null) {
            bringChildToFront(vVar);
        }
        I("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((m2) org.telegram.ui.Cells.c1.i(1, fragmentStack)).dismissCurrentDialog();
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
            if ((view instanceof v) && ((v) view).f19847x) {
                int i18 = l1Var.f42140a.f(8).d;
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
                r0.l1 l1Var2 = r0.l1.f42139b;
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
            r0.i0.b(view, r0.l1.f42139b);
            return;
        }
        boolean z12 = this.N0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.b bVar = this.f18632n1;
        i0.b bVar2 = this.f18634o1;
        if (view instanceof m3) {
            if (z12) {
                i15 = 0;
            } else {
                i15 = bVar.f10576a;
            }
            if (z10) {
                i16 = 0;
            } else {
                i16 = bVar.f10578c;
            }
            AndroidUtilities.setViewLayoutMargins(view, i15, 0, i16, bVar.d);
        } else if (view instanceof v) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            v vVar = (v) view;
            int v = v(false);
            if (v > 0) {
                i10 = bVar.d + v;
            } else {
                i10 = 0;
            }
            y3 y3Var = vVar.f19846w;
            if (y3Var != y3.f19939c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i11 = bVar2.f10576a;
            } else {
                i11 = 0;
            }
            if (!z13 && !z10) {
                i12 = bVar2.f10578c;
            } else {
                i12 = 0;
            }
            if (z13 && !z12) {
                i13 = 0;
            } else {
                i13 = bVar2.f10576a;
            }
            if (z13 && !z10) {
                i14 = 0;
            } else {
                i14 = bVar2.f10578c;
            }
            if (y3Var == y3.f19937a) {
                i10 = Math.max(i10, bVar2.d);
                r0.i0.b(view, r0.l1.f42139b);
            } else {
                r0.i0.b(view, l1Var.f42140a.m(i13, 0, i14, i10));
            }
            view.setPadding(i11, 0, i12, i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18602a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.O0.isEmpty()) {
            int size = this.O0.size();
            for (int i10 = 0; i10 < size; i10++) {
                m2 m2Var = (m2) this.O0.get(i10);
                m2Var.onConfigurationChanged(configuration);
                Dialog dialog = m2Var.visibleDialog;
                if (dialog instanceof e3) {
                    ((e3) dialog).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18602a = false;
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
        y yVar;
        if (i10 == 82 && !j() && !this.Q && (kVar = this.f18648y) != null && !kVar.s() && (yVar = kVar.E) != null) {
            int childCount = yVar.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = yVar.getChildAt(i11);
                if (childAt instanceof u0) {
                    u0 u0Var = (u0) childAt;
                    if (u0Var.getVisibility() != 0) {
                        continue;
                    } else if (u0Var.q()) {
                        u0Var.M(null, null);
                        break;
                    } else if (u0Var.S) {
                        yVar.o(((Integer) u0Var.getTag()).intValue());
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
        m2 m2Var;
        boolean z10 = true;
        if (!this.O0.isEmpty()) {
            m2Var = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
        } else {
            m2Var = null;
        }
        if (m2Var != null && !m2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            m2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, 1073741824));
            return;
        }
        y4 y4Var = this.J0;
        if (y4Var != null) {
            int[] iArr = this.Y0;
            iArr[0] = i10;
            iArr[1] = i11;
            y4Var.e(iArr);
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
        r rVar;
        boolean z10 = false;
        if (!j() && !this.f18645w0 && !this.T && !this.f18612d1) {
            if (this.O0.size() > 1 && ((rVar = this.G) == null || rVar.getLastSheet() == null || !this.G.getLastSheet().isShown())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).isSwipeBackEnabled(motionEvent)) {
                        this.P = false;
                        this.Q = false;
                        v vVar = this.f18639s;
                        if (vVar != null) {
                            vVar.setLayerType(0, null);
                            return false;
                        }
                    } else {
                        this.f18647x0 = motionEvent.getPointerId(0);
                        this.P = true;
                        this.R = (int) motionEvent.getX();
                        this.S = (int) motionEvent.getY();
                        VelocityTracker velocityTracker = this.U;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f18647x0) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.R));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.S);
                    this.U.addMovement(motionEvent);
                    if (!this.W && !this.h && this.P && !this.Q && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                        if (((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
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
                            ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).onBeginSlide();
                            this.V = true;
                        }
                        if (D()) {
                            float f7 = max;
                            this.f18639s.setTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                            setInnerTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        } else {
                            float f10 = max;
                            this.f18639s.setTranslationX(f10);
                            setInnerTranslationX(f10);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f18647x0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    this.U.addMovement(motionEvent);
                    this.U.computeCurrentVelocity(1000);
                    m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
                    if (!this.h && !this.f18603a0 && !this.Q && m2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.U.getXVelocity();
                        float yVelocity = this.U.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && m2Var.canBeginSlide()) {
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
                        float x10 = this.f18639s.getX();
                        float xVelocity2 = this.U.getXVelocity();
                        float yVelocity2 = this.U.getYVelocity();
                        if (!D() ? x10 < this.f18639s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.P = false;
                        this.Q = false;
                        v vVar2 = this.f18639s;
                        if (vVar2 != null) {
                            vVar2.setLayerType(0, null);
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
                    v vVar3 = this.f18639s;
                    if (vVar3 != null) {
                        vVar3.setLayerType(0, null);
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
        if (f18599p1 != null && SharedConfig.drawActionBarShadow) {
            int i12 = i10 / 2;
            if (f18599p1.getAlpha() != i12) {
                f18599p1.setAlpha(i12);
            }
            f18599p1.setBounds(0, i11, getMeasuredWidth(), f18599p1.getIntrinsicHeight() + i11);
            f18599p1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.f18630n = true;
        this.h = false;
        m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
        m2Var.fragmentView.setOutlineProvider(null);
        m2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        m2Var.fragmentView.setLayoutParams(layoutParams);
        T((m2) org.telegram.ui.Cells.c1.i(2, this.O0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(m2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(m2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new rr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ai.z(12, this, m2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f18639s.setShouldHandleBottomInsets(m2Var.getEdgeToEdgeSupportMode());
        this.f18639s.setDrawNavigationBar(m2Var.drawEdgeNavigationBar());
        m2Var.setInPreviewMode(false);
        m2Var.setInMenuMode(false);
        try {
            Activity activity = this.K0;
            if (h6.w0(null, h6.f19337s8, false) != -1 && (!m2Var.hasForceLightStatusBar() || h6.A0().q())) {
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
        if (!this.O0.isEmpty() && ((m2) org.telegram.ui.Cells.c1.i(1, this.O0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.B0 = view;
    }

    @Override
    public void setDelegate(y4 y4Var) {
        this.J0 = y4Var;
    }

    @Override
    public void setDrawerLayoutContainer(x3 x3Var) {
        this.f18646x = x3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i10) {
        v vVar = this.f18639s;
        if (vVar != null) {
            vVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<m2> list) {
        this.O0 = list;
        m3 m3Var = this.E;
        if (m3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            m3Var.I.remove(oVar);
            m3Var.J.remove(oVar2);
            AndroidUtilities.removeFromParent(this.E);
            this.E = null;
        }
        boolean z10 = this.L0;
        Activity activity = this.K0;
        if (z10) {
            m3 m3Var2 = new m3(activity, this);
            this.E = m3Var2;
            this.F = new cf.c(m3Var2);
            m3 m3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            m3Var3.I.add(oVar3);
            m3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            v3 v3Var = LaunchActivity.G1.f31146y0;
            if (v3Var != null) {
                v3Var.setTabsView(this.E);
            }
        }
        v vVar = this.v;
        if (vVar != null) {
            AndroidUtilities.removeFromParent(vVar);
        }
        v vVar2 = new v(activity, this);
        this.v = vVar2;
        addView(vVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.v.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.v.setLayoutParams(layoutParams2);
        v vVar3 = this.f18639s;
        if (vVar3 != null) {
            AndroidUtilities.removeFromParent(vVar3);
        }
        v vVar4 = new v(activity, this);
        this.f18639s = vVar4;
        addView(vVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f18639s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f18639s.setLayoutParams(layoutParams3);
        v vVar5 = this.f18644w;
        if (vVar5 != null) {
            AndroidUtilities.removeFromParent(vVar5);
        }
        v vVar6 = new v(activity, this);
        this.f18644w = vVar6;
        this.f18607b1.f23842a = vVar6;
        addView(vVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f18644w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f18644w.setLayoutParams(layoutParams4);
        r rVar = this.G;
        if (rVar != null) {
            rVar.setParentLayout(this);
            r rVar2 = this.G;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f18644w) {
                AndroidUtilities.removeFromParent(view);
                this.f18644w.addView(view, w7.y5.c(-1.0f, -1));
                this.f18644w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        for (m2 m2Var : this.O0) {
            m2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f18615f = z10;
    }

    public void setInnerTranslationX(float f7) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f7;
        invalidate();
        if (this.O0.size() >= 2 && this.f18639s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.clamp01(f7 / (AndroidUtilities.dp(56.0f) * 6));
            } else {
                measuredWidth = f7 / this.f18639s.getMeasuredWidth();
            }
            m2 m2Var = (m2) org.telegram.ui.Cells.c1.i(2, this.O0);
            m2Var.onSlideProgress(false, measuredWidth);
            m2 m2Var2 = (m2) org.telegram.ui.Cells.c1.i(1, this.O0);
            float a2 = w7.q.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (m2Var2.isBeginToShow() && (navigationBarColor = m2Var2.getNavigationBarColor()) != (navigationBarColor2 = m2Var.getNavigationBarColor())) {
                m2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f18605b = z10;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (this.l1 != i10) {
            this.l1 = i10;
            invalidate();
        }
        x3 x3Var = this.f18646x;
        if (x3Var != null) {
            x3Var.setInternalNavigationBarColor(i10);
        }
        m3 m3Var = this.E;
        if (m3Var != null) {
            if (!this.Q && !this.T) {
                z10 = true;
            } else {
                z10 = false;
            }
            m3Var.i(i10, z10);
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
        ArrayList arrayList = this.f18620h0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i10);
            int[] iArr = (int[]) this.f18606b0.get(i10);
            int[] iArr2 = (int[]) this.f18609c0.get(i10);
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
                j6 j6Var = (j6) arrayList2.get(i11);
                int i14 = j6Var.f19517f;
                d6 d6Var = j6Var.f19525o;
                if (d6Var != null) {
                    d6Var.L0(i14, argb);
                } else {
                    SparseIntArray sparseIntArray = h6.sl;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i14, argb);
                    }
                }
                j6Var.e(argb, false, false);
                i11++;
                i10 = i13;
                arrayList = arrayList3;
                size = i12;
            }
            i10++;
        }
        ArrayList arrayList4 = this.f18624j0;
        int size3 = arrayList4.size();
        for (int i15 = 0; i15 < size3; i15++) {
            i6 i6Var = (i6) arrayList4.get(i15);
            if (i6Var != null) {
                i6Var.b();
                i6Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.f18622i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                j6 j6Var2 = (j6) this.f18622i0.get(i16);
                j6Var2.e(h6.v0(j6Var2.f19517f, j6Var2.f19525o), false, false);
            }
        }
        rn rnVar = this.f18618g0;
        if (rnVar != null) {
            un unVar = rnVar.f37385a;
            unVar.V.f39695x0.invalidate();
            unVar.I.I = f7;
            unVar.J.I = f7;
            unVar.k(f7);
        }
        y4 y4Var = this.J0;
        if (y4Var != null) {
            y4Var.a(f7);
        }
        x(this);
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.A0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f18608c = window;
    }

    public final m2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                m2 m2Var = (m2) getFragmentStack().get(size);
                if (m2Var != null && !m2Var.isFinishing() && !m2Var.isRemovingFromStack() && qg0.class.isInstance(m2Var)) {
                    return m2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int v(boolean z10) {
        m3 m3Var;
        if (this.L0 && (m3Var = this.E) != null) {
            if (z10) {
                return (int) m3Var.G;
            }
            return m3Var.H;
        }
        return 0;
    }

    public final dz w() {
        Activity activity = this.K0;
        if (activity == null) {
            return null;
        }
        if (this.G == null) {
            r rVar = new r(this);
            this.G = rVar;
            rVar.setParentLayout(this);
            r rVar2 = this.G;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f18644w) {
                AndroidUtilities.removeFromParent(view);
                this.f18644w.addView(view, w7.y5.c(-1.0f, -1));
                this.f18644w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.f18644w.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean y() {
        if (!this.h && !this.f18603a0) {
            return false;
        }
        return true;
    }

    @Override
    public final List z() {
        m2 lastFragment = getLastFragment();
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
