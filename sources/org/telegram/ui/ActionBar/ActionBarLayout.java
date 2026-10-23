package org.telegram.ui.ActionBar;

import ai.ne;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ig0;
import org.telegram.ui.nn;
import org.telegram.ui.p80;
import org.telegram.ui.qn;
import org.telegram.ui.rg0;
import org.telegram.ui.ry;
public class ActionBarLayout extends FrameLayout implements h5, ng.b {
    public static Drawable f20610v1;
    public static Drawable f20611w1;
    public static Paint f20612x1;
    public boolean A0;
    public long B0;
    public boolean C0;
    public int D0;
    public q3 E;
    public Runnable E0;
    public com.google.android.gms.internal.cast.z5 F;
    public Runnable F0;
    public r G;
    public boolean G0;
    public o2 H;
    public View H0;
    public o2 I;
    public boolean I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public s J0;
    public AnimatorSet K;
    public float K0;
    public final DecelerateInterpolator L;
    public long L0;
    public final OvershootInterpolator M;
    public String M0;
    public final AccelerateDecelerateInterpolator N;
    public int N0;
    public float O;
    public p80 O0;
    public boolean P;
    public d5 P0;
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
    public boolean f20613a;
    public boolean f20614a0;
    public boolean f20615a1;
    public boolean f20616b;
    public final ArrayList f20617b0;
    public final Path f20618b1;
    public Window f20619c;
    public final ArrayList f20620c0;
    public final float[] f20621c1;
    public Runnable d;
    public final f5 f20622d0;
    public boolean f20623d1;
    public Runnable e;
    public j5 f20624e0;
    public final int[] f20625e1;
    public boolean f20626f;
    public j5 f20627f0;
    public boolean f20628f1;
    public nn f20629g0;
    public int f20630g1;
    public boolean h;
    public final ArrayList f20631h0;
    public final org.telegram.ui.Components.f6 f20632h1;
    public ArrayList f20633i0;
    public boolean f20634i1;
    public final ArrayList f20635j0;
    public boolean f20636j1;
    public int[] f20637k0;
    public boolean f20638k1;
    public int[] f20639l0;
    public float l1;
    public int[] m0;
    public boolean f20640m1;
    public boolean f20641n;
    public int[] f20642n0;
    public AnimatorSet f20643n1;
    public int f20644o0;
    public ArrayList f20645o1;
    public qn f20646p0;
    public final o f20647p1;
    public AnimatorSet f20648q0;
    public boolean f20649q1;
    public ColorDrawable f20650r;
    public final AnimationNotificationsLocker f20651r0;
    public int f20652r1;
    public v f20653s;
    public float f20654s0;
    public r0.k1 f20655s1;
    public boolean f20656t0;
    public i0.b f20657t1;
    public j6 f20658u0;
    public i0.b f20659u1;
    public v v;
    public boolean f20660v0;
    public v f20661w;
    public boolean f20662w0;
    public b4 f20663x;
    public int f20664x0;
    public k f20665y;
    public boolean f20666y0;
    public boolean f20667z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.f20617b0 = new ArrayList();
        this.f20620c0 = new ArrayList();
        f5 f5Var = new f5();
        f5Var.f20890b = new SparseIntArray();
        f5Var.f20891c = new int[]{k6.Aa, k6.Da, k6.Ea, k6.Fa, k6.f21130ac, k6.Ca};
        this.f20622d0 = f5Var;
        this.f20631h0 = new ArrayList();
        this.f20635j0 = new ArrayList();
        this.f20651r0 = new AnimationNotificationsLocker();
        this.W0 = new Rect();
        this.Z0 = -1;
        this.f20618b1 = new Path();
        this.f20621c1 = new float[8];
        this.f20625e1 = new int[2];
        this.f20632h1 = new org.telegram.ui.Components.f6(this, 280L, bs.h);
        this.f20645o1 = new ArrayList();
        this.f20647p1 = new o(this, 2);
        i0.b bVar = i0.b.e;
        this.f20657t1 = bVar;
        this.f20659u1 = bVar;
        this.Q0 = (Activity) context;
        this.R0 = z10;
        if (f20611w1 == null) {
            f20611w1 = getResources().getDrawable(R.drawable.layer_shadow);
            f20610v1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f20612x1 = new Paint();
        }
        n nVar = new n(this, 1);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(this, nVar);
    }

    public static void F(ArrayList arrayList, View view) {
        if (view instanceof ng.b) {
            arrayList.addAll(((ng.b) view).B());
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
            o2 o2Var = (o2) si.o0.g(1, actionBarLayout.U0);
            o2Var.prepareFragmentToSlide(true, false);
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            List list = actionBarLayout.U0;
            list.remove(list.size() - 1);
            actionBarLayout.J("onSlideAnimationEnd");
            v vVar = actionBarLayout.f20653s;
            vVar.setAlpha(1.0f);
            v vVar2 = actionBarLayout.v;
            actionBarLayout.f20653s = vVar2;
            actionBarLayout.v = vVar;
            actionBarLayout.bringChildToFront(vVar2);
            View view = actionBarLayout.f20661w;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.U0.size() > 0) {
                o2 o2Var2 = (o2) si.o0.g(1, actionBarLayout.U0);
                actionBarLayout.f20665y = o2Var2.actionBar;
                o2Var2.onResume();
                o2Var2.onBecomeFullyVisible();
                o2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.U0.size() >= 2) {
            ((o2) si.o0.g(1, actionBarLayout.U0)).prepareFragmentToSlide(true, false);
            o2 o2Var3 = (o2) si.o0.g(2, actionBarLayout.U0);
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
        actionBarLayout.f20653s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.f20653s.setLayerType(0, null);
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
        if (i10 != k6.f21235g5 && i10 != k6.f21130ac && i10 != k6.Rd) {
            if (i10 != k6.Da && i10 != k6.Ea && i10 != k6.Fa && i10 != k6.Nd && i10 != k6.Od && i10 != k6.Pd && i10 != k6.Qd) {
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
        o2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof ng.b) {
                arrayList.addAll(((ng.b) lastFragment).B());
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
        if (this.f20636j1 && this.f20638k1) {
            return true;
        }
        return false;
    }

    public final void E() {
        for (int i10 = 0; i10 < this.U0.size(); i10++) {
            if (((o2) this.U0.get(i10)).getFragmentView() != null) {
                try {
                    ((o2) this.U0.get(i10)).onThemeColorsChanged();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void G(boolean z10) {
        I();
        L();
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
        s sVar = this.J0;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.J0 = null;
        }
        setAlpha(1.0f);
        this.f20653s.setAlpha(1.0f);
        this.f20653s.setScaleX(1.0f);
        this.f20653s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void H() {
        k kVar;
        if (!this.f20614a0 && !this.Q && !i() && !this.U0.isEmpty()) {
            i30 i30Var = i30.f27184d0;
            if (i30Var != null && i30Var.f27196w) {
                i30Var.e(false);
                return;
            }
            if (!g0() && (kVar = this.f20665y) != null && !kVar.s()) {
                k kVar2 = this.f20665y;
                if (kVar2.f21068n0) {
                    kVar2.g(true);
                    return;
                }
            }
            r rVar = this.G;
            if ((rVar == null || rVar.onBackPressed(true)) && ((o2) si.o0.g(1, this.U0)).onBackPressed(true) && !this.U0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final void I() {
        if (this.W && this.E0 != null) {
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                this.K = null;
                animatorSet.cancel();
            }
            this.W = false;
            this.f20614a0 = false;
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

    public final void J(String str) {
        Runnable runnable = this.Y0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        g(str);
    }

    public final void K() {
        for (o2 o2Var : this.U0) {
            o2Var.onLowMemory();
        }
    }

    public final void L() {
        Runnable runnable;
        if (this.W && (runnable = this.F0) != null) {
            this.W = false;
            this.f20614a0 = false;
            this.B0 = 0L;
            this.H = null;
            this.I = null;
            this.F0 = null;
            runnable.run();
            h();
        }
    }

    public final void M() {
        if (!this.U0.isEmpty()) {
            ((o2) si.o0.g(1, this.U0)).onPause();
        }
        r rVar = this.G;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void N() {
        if (!this.U0.isEmpty()) {
            ((o2) si.o0.g(1, this.U0)).onResume();
        }
        r rVar = this.G;
        if (rVar != null) {
            rVar.onResume();
        }
    }

    public final void O(Canvas canvas, ViewGroup viewGroup) {
        if (this.E != null && getHeight() < viewGroup.getHeight()) {
            canvas.save();
            canvas.translate(this.E.getX() + getX(), this.E.getY() + getY());
            this.E.draw(canvas);
            canvas.restore();
        }
    }

    public final void P() {
        this.P = false;
        this.Q = true;
        this.v.setVisibility(0);
        this.V = false;
        o2 o2Var = (o2) si.o0.g(2, this.U0);
        View view = o2Var.fragmentView;
        if (view == null && (view = o2Var.performCreateView(this.Q0)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
            n nVar = new n(o2Var, 0);
            WeakHashMap weakHashMap = r0.i0.f45242a;
            r0.a0.i(view, nVar);
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
            if (this.I0) {
                o2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(o2Var.actionBar);
        }
        o2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        o2Var.attachSheets(this.v);
        if (!o2Var.hasOwnBackground && view.getBackground() == null) {
            r6.i(k6.f21183d6, view, null);
        }
        o2Var.onResume();
        if (this.f20648q0 != null) {
            this.f20633i0 = o2Var.getThemeDescriptions();
        }
        this.f20653s.setLayerType(2, null);
        ((o2) si.o0.g(1, this.U0)).prepareFragmentToSlide(true, true);
        o2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean Q(o2 o2Var) {
        return S(new e5(o2Var));
    }

    public final boolean R(o2 o2Var, boolean z10) {
        e5 e5Var = new e5(o2Var);
        e5Var.f20870b = z10;
        return S(e5Var);
    }

    public final boolean S(org.telegram.ui.ActionBar.e5 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.S(org.telegram.ui.ActionBar.e5):boolean");
    }

    public final boolean T(o2 o2Var, boolean z10, boolean z11) {
        e5 e5Var = new e5(o2Var);
        e5Var.f20870b = z10;
        e5Var.f20871c = z11;
        e5Var.d = true;
        e5Var.e = false;
        return S(e5Var);
    }

    public final void U(o2 o2Var, boolean z10) {
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
            this.U0.remove(o2Var);
            J("presentFragmentInternalRemoveOld");
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

    public final void V(boolean z10, boolean z11) {
        if (!this.W && !this.Q) {
            int size = this.U0.size();
            if (!z10) {
                size--;
            }
            if (this.h) {
                size--;
            }
            for (int i10 = 0; i10 < size; i10++) {
                ((o2) this.U0.get(i10)).clearViews();
                ((o2) this.U0.get(i10)).setParentLayout(this);
            }
            d5 d5Var = this.P0;
            if (d5Var != null) {
                d5Var.b(this, z10);
            }
            if (z11) {
                d0();
                return;
            }
            return;
        }
        this.f20666y0 = true;
        this.f20667z0 = z10;
        this.A0 = z11;
    }

    public final void W() {
        V(true, true);
    }

    public final void X() {
        this.f20653s.removeAllViews();
        this.v.removeAllViews();
        this.f20665y = null;
        this.H = null;
        this.I = null;
    }

    public final void Y() {
        while (this.U0.size() > 0) {
            c0((o2) this.U0.get(0), false);
        }
        View view = this.H0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Z(int i10) {
        if (i10 >= 0 && i10 < getFragmentStack().size()) {
            a0((o2) getFragmentStack().get(i10));
        }
    }

    public final void a0(o2 o2Var) {
        b0(o2Var, false);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.k1 k1Var = this.f20655s1;
        if (k1Var != null) {
            o(view, k1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f20620c0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = ((t6) arrayList.get(i10)).c();
            }
        }
    }

    public final void b0(o2 o2Var, boolean z10) {
        boolean z11 = true;
        if ((this.U0.size() > 0 && si.o0.g(1, this.U0) == o2Var) || (this.U0.size() > 1 && si.o0.g(2, this.U0) == o2Var)) {
            L();
            I();
        }
        g("removeFragmentFromStack " + z10);
        if (this.G0 && this.U0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.P0 != null && this.U0.size() == 1 && AndroidUtilities.isTablet()) {
            this.P0.k(this);
        }
        if (!o2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) {
            z11 = false;
        }
        c0(o2Var, z11);
    }

    public final boolean c(int i10, o2 o2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        d5 d5Var = this.P0;
        if ((d5Var != null && !d5Var.h(o2Var, this)) || !o2Var.onFragmentCreate() || this.U0.contains(o2Var)) {
            return false;
        }
        o2Var.setParentLayout(this);
        Activity activity = this.Q0;
        if (i10 != -1 && i10 != -2) {
            if (i10 == -3) {
                View view = o2Var.fragmentView;
                if (view == null) {
                    view = o2Var.performCreateView(activity);
                    if (view != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(o2Var, 0);
                        WeakHashMap weakHashMap = r0.i0.f45242a;
                        r0.a0.i(view, nVar);
                        this.f20653s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!o2Var.hasOwnBackground && view.getBackground() == null) {
                    r6.i(k6.f21183d6, view, null);
                }
                v vVar = this.f20653s;
                vVar.addView(view, Utilities.clamp(0, vVar.getChildCount(), 0), w7.z5.c(-1.0f, -1));
                this.f20653s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.f20653s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar = o2Var.actionBar;
                if (kVar != null && kVar.K) {
                    if (this.I0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(o2Var.actionBar);
                    }
                    this.f20653s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                o2Var.attachSheets(this.f20653s);
                i10 = 0;
            }
            this.U0.add(i10, o2Var);
            J("addFragmentToStack");
        } else {
            if (!this.U0.isEmpty()) {
                o2 o2Var2 = (o2) si.o0.g(1, this.U0);
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
            this.U0.add(o2Var);
            if (i10 != -2) {
                View view3 = o2Var.fragmentView;
                if (view3 == null) {
                    view3 = o2Var.performCreateView(activity);
                    if (view3 != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(o2Var, 0);
                        WeakHashMap weakHashMap2 = r0.i0.f45242a;
                        r0.a0.i(view3, nVar2);
                        this.f20653s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!o2Var.hasOwnBackground && view3.getBackground() == null) {
                    r6.i(k6.f21183d6, view3, null);
                }
                this.f20653s.addView(view3, w7.z5.c(-1.0f, -1));
                this.f20653s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.f20653s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar3 = o2Var.actionBar;
                if (kVar3 != null && kVar3.K) {
                    if (this.I0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(o2Var.actionBar);
                    }
                    this.f20653s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                o2Var.attachSheets(this.f20653s);
                o2Var.onResume();
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var.onTransitionAnimationEnd(true, true);
                o2Var.onBecomeFullyVisible();
            }
            J("addFragmentToStack " + i10);
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

    public final void c0(o2 o2Var, boolean z10) {
        if (!this.U0.contains(o2Var)) {
            return;
        }
        if (z10 && si.o0.g(1, this.U0) == o2Var) {
            o2Var.finishFragment();
        } else if (si.o0.g(1, this.U0) == o2Var && this.U0.size() > 1) {
            o2Var.finishFragment(false);
        } else {
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            this.U0.remove(o2Var);
            J("removeFragmentFromStackInternal " + z10);
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f20631h0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f20617b0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                t6 t6Var = (t6) arrayList.get(i10);
                iArr[i10] = t6Var.c();
                s6 s6Var = t6Var.f21862g;
                t6Var.f21862g = null;
                if (s6Var != null) {
                    ArrayList arrayList2 = this.f20635j0;
                    if (!arrayList2.contains(s6Var)) {
                        arrayList2.add(s6Var);
                    }
                }
            }
        }
    }

    public final void d0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.U0.isEmpty()) {
            int size = this.U0.size() - 1;
            if (!this.U0.isEmpty()) {
                if (this.U0.isEmpty() || this.U0.size() - 1 != size || ((o2) this.U0.get(size)).fragmentView == null) {
                    for (int i10 = 0; i10 < size; i10++) {
                        o2 o2Var = (o2) this.U0.get(i10);
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
                    o2 o2Var2 = (o2) this.U0.get(size);
                    o2Var2.setParentLayout(this);
                    View view2 = o2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = o2Var2.performCreateView(this.Q0);
                        if (view2 != null && o2Var2.isSupportEdgeToEdge() && o2Var2.drawEdgeNavigationBar()) {
                            n nVar = new n(o2Var2, 0);
                            WeakHashMap weakHashMap = r0.i0.f45242a;
                            r0.a0.i(view2, nVar);
                            this.f20653s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            o2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f20653s.addView(view2, w7.z5.c(-1.0f, -1));
                    this.f20653s.setShouldHandleBottomInsets(o2Var2.getEdgeToEdgeSupportMode());
                    this.f20653s.setDrawNavigationBar(o2Var2.drawEdgeNavigationBar());
                    k kVar2 = o2Var2.actionBar;
                    if (kVar2 != null && kVar2.K) {
                        if (this.I0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(o2Var2.actionBar);
                        this.f20653s.addView(o2Var2.actionBar);
                    }
                    o2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                    o2Var2.attachSheets(this.f20653s);
                    o2Var2.onResume();
                    o2Var2.onBecomeFullyVisible();
                    this.f20665y = o2Var2.actionBar;
                    if (!o2Var2.hasOwnBackground && view2.getBackground() == null) {
                        r6.i(k6.f21183d6, view2, null);
                    }
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E != null && v(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.f20657t1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.f20615a1 = true;
        if (this.S0) {
            canvas2.save();
            float dp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.f20618b1;
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
            d5 d5Var = this.P0;
            if ((d5Var != null && d5Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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
        if (!this.U0.isEmpty()) {
            o2Var = (o2) si.o0.g(1, this.U0);
        } else {
            o2Var = null;
        }
        if (o2Var == null) {
            return;
        }
        float x10 = this.f20653s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = o2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x10 = Math.abs(this.f20653s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f20653s.getMeasuredWidth()) * x10);
            if (D()) {
                i11 = 380;
            } else {
                i11 = 50;
            }
            int max = Math.max(measuredWidth, i11);
            if (!shouldOverrideSlideTransition) {
                v vVar = this.f20653s;
                int measuredWidth2 = vVar.getMeasuredWidth();
                if (this.f20636j1) {
                    i12 = AndroidUtilities.dp(56.0f);
                } else {
                    i12 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vVar, property, measuredWidth2 + i12);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f20653s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(bs.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f20653s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 320;
            } else {
                i10 = 120;
            }
            int max2 = Math.max(measuredWidth3, i10);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f20653s, property, 0.0f);
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(bs.h);
                }
            }
        }
        Animator customSlideTransition2 = o2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        o2 o2Var2 = (o2) si.o0.g(2, this.U0);
        if (o2Var2 != null && (customSlideTransition = o2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f20643n1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final void e0(qn qnVar) {
        int x02;
        try {
            int i10 = k6.f21218f5;
            this.f20637k0 = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr = this.f20637k0;
                if (qnVar != null) {
                    x02 = qnVar.g(i11);
                } else {
                    x02 = k6.x0(null, i11, false);
                }
                iArr[i11] = x02;
            }
        } catch (Exception e) {
            FileLog.e(e);
            this.f20637k0 = null;
        }
    }

    public final void f(org.telegram.ui.ActionBar.g5 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.g5, java.lang.Runnable):void");
    }

    public final void f0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.K0 = 0.0f;
            this.L0 = System.nanoTime() / 1000000;
        }
        s sVar = new s(this, z11, z12, z10);
        this.J0 = sVar;
        AndroidUtilities.runOnUIThread(sVar);
    }

    public final void g(String str) {
        if (BuildVars.DEBUG_VERSION) {
            ArrayList arrayList = this.f20645o1;
            StringBuilder i10 = si.o0.i(str, " ");
            i10.append(this.U0.size());
            arrayList.add(0, i10.toString());
            if (this.f20645o1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < 10; i11++) {
                    arrayList2.add((String) this.f20645o1.get(i11));
                }
                this.f20645o1 = arrayList2;
            }
        }
        o oVar = this.f20647p1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    public final boolean g0() {
        o2 o2Var;
        if (!this.U0.isEmpty()) {
            o2Var = (o2) si.o0.g(1, this.U0);
        } else {
            o2Var = null;
        }
        if (o2Var != null && o2Var.getLastStoryViewer() != null && o2Var.getLastStoryViewer().attachedToParent()) {
            return true;
        }
        return false;
    }

    @Override
    public o2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (o2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public h3 getBottomSheet() {
        return null;
    }

    public q3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        v vVar;
        if (!this.h && !this.f20614a0 && !this.f20641n) {
            return 0.0f;
        }
        o2 o2Var = this.I;
        if (o2Var != null && o2Var.inPreviewMode) {
            vVar = this.v;
        } else {
            vVar = this.f20653s;
        }
        return vVar.getAlpha();
    }

    public b4 getDrawerLayoutContainer() {
        return this.f20663x;
    }

    @Override
    public List<o2> getFragmentStack() {
        return this.U0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override
    public o2 getLastFragment() {
        if (this.U0.isEmpty()) {
            return null;
        }
        return (o2) si.o0.g(1, this.U0);
    }

    public o2 getLastFragmentIncludeMainTabs() {
        o2 lastFragment = getLastFragment();
        if (lastFragment instanceof rg0) {
            return ((rg0) lastFragment).X();
        }
        return lastFragment;
    }

    @Override
    public j5 getMessageDrawableOutMediaStart() {
        return this.f20627f0;
    }

    @Override
    public j5 getMessageDrawableOutStart() {
        return this.f20624e0;
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
        return this.V0;
    }

    @Override
    public o2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                o2 o2Var = (o2) getFragmentStack().get(size);
                if (o2Var != null && o2Var.getContext() != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack()) {
                    return o2Var;
                }
            }
            return null;
        }
        return null;
    }

    public ry getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.f20654s0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f20619c;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public final void h() {
        if (this.f20666y0) {
            V(this.f20667z0, this.A0);
            this.f20666y0 = false;
        } else if (this.f20656t0) {
            g5 g5Var = new g5(this.f20658u0, this.f20664x0, this.f20662w0, true);
            boolean z10 = this.f20660v0;
            if (!z10) {
                g5Var.f20921g = z10;
                g5Var.f20920f = z10;
            }
            f(g5Var, null);
            this.f20658u0 = null;
            this.f20656t0 = false;
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        if (this.f20614a0) {
            return false;
        }
        if (this.W && (this.B0 < System.currentTimeMillis() - 1500 || this.h)) {
            G(true);
        }
        return this.W;
    }

    public final void j() {
        this.f20644o0 = 0;
        this.f20646p0 = null;
        this.f20637k0 = null;
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
            d5 d5Var = this.P0;
            if ((d5Var == null || d5Var.k(this)) && !i() && !this.U0.isEmpty()) {
                Activity activity = this.Q0;
                if (activity.getCurrentFocus() != null) {
                    AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.f20614a0 || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o2 o2Var2 = (o2) si.o0.g(1, this.U0);
                AnimatorSet animatorSet = null;
                if (this.U0.size() > 1) {
                    o2Var = (o2) si.o0.g(2, this.U0);
                } else {
                    o2Var = null;
                }
                if (o2Var != null) {
                    if (k6.x0(null, k6.f21462s8, false) != -1 && (!o2Var.hasForceLightStatusBar() || k6.C0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    AndroidUtilities.setLightStatusBar(activity, z13);
                    v vVar = this.f20653s;
                    this.f20653s = this.v;
                    this.v = vVar;
                    o2Var.setParentLayout(this);
                    View view = o2Var.fragmentView;
                    if (view == null && (view = o2Var.performCreateView(activity)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(o2Var, 0);
                        WeakHashMap weakHashMap = r0.i0.f45242a;
                        r0.a0.i(view, nVar);
                        this.f20653s.invalidate();
                    }
                    if (!this.h) {
                        this.f20653s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            o2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        this.f20653s.addView(view);
                        this.f20653s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                        this.f20653s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
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
                            if (this.I0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            AndroidUtilities.removeFromParent(o2Var.actionBar);
                            this.f20653s.addView(o2Var.actionBar);
                        }
                        o2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                        o2Var.attachSheets(this.f20653s);
                    }
                    this.H = o2Var;
                    this.I = o2Var2;
                    o2Var.onTransitionAnimationStart(true, true);
                    o2Var2.onTransitionAnimationStart(false, true);
                    o2Var.onResume();
                    if (this.f20648q0 != null) {
                        this.f20633i0 = o2Var.getThemeDescriptions();
                    }
                    this.f20665y = o2Var.actionBar;
                    if (!o2Var.hasOwnBackground && view.getBackground() == null) {
                        r6.i(k6.f21183d6, view, null);
                    }
                    if (z12) {
                        this.B0 = System.currentTimeMillis();
                        this.W = true;
                        o2Var2.setRemovingFromStack(true);
                        this.E0 = new ig.d2(this, o2Var2, o2Var, 19);
                        if (!this.h && !this.f20614a0) {
                            animatorSet = o2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f20653s.f21913b || this.v.f21913b)) {
                                w2 w2Var = new w2(this, 1);
                                this.d = w2Var;
                                AndroidUtilities.runOnUIThread(w2Var, 200L);
                            } else {
                                if (!z15 && !this.f20614a0) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                f0(false, true, z14);
                            }
                        } else {
                            this.K = animatorSet;
                            qc qcVar = qc.f29825w;
                            if (qcVar != null && qcVar.f29834l) {
                                qcVar.b();
                            }
                        }
                        J("closeLastFragment");
                    } else {
                        m(o2Var2);
                        o2Var2.onTransitionAnimationEnd(false, true);
                        o2Var.onTransitionAnimationEnd(true, true);
                        o2Var.onBecomeFullyVisible();
                    }
                } else if (this.G0 && !z11) {
                    this.B0 = System.currentTimeMillis();
                    this.W = true;
                    this.E0 = new m4.z(24, this, o2Var2);
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
                    this.K.addListener(new q(this, 0));
                    this.K.start();
                } else {
                    c0(o2Var2, false);
                    setVisibility(8);
                    View view3 = this.H0;
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
        this.U0.remove(o2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.f20653s);
        v vVar = this.f20661w;
        if (vVar != null) {
            bringChildToFront(vVar);
        }
        J("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((o2) si.o0.g(1, fragmentStack)).dismissCurrentDialog();
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
            if ((view instanceof v) && ((v) view).f21920x) {
                int i18 = k1Var.f45251a.f(8).d;
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
                r0.k1 k1Var2 = r0.k1.f45250b;
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
            r0.i0.b(view, r0.k1.f45250b);
            return;
        }
        boolean z12 = this.T0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.b bVar = this.f20657t1;
        i0.b bVar2 = this.f20659u1;
        if (view instanceof q3) {
            if (z12) {
                i15 = 0;
            } else {
                i15 = bVar.f12315a;
            }
            if (z10) {
                i16 = 0;
            } else {
                i16 = bVar.f12317c;
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
            c4 c4Var = vVar.f21919w;
            if (c4Var != c4.f20792c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i11 = bVar2.f12315a;
            } else {
                i11 = 0;
            }
            if (!z13 && !z10) {
                i12 = bVar2.f12317c;
            } else {
                i12 = 0;
            }
            if (z13 && !z12) {
                i13 = 0;
            } else {
                i13 = bVar2.f12315a;
            }
            if (z13 && !z10) {
                i14 = 0;
            } else {
                i14 = bVar2.f12317c;
            }
            if (c4Var == c4.f20790a) {
                i10 = Math.max(i10, bVar2.d);
                r0.i0.b(view, r0.k1.f45250b);
            } else {
                r0.i0.b(view, k1Var.f45251a.m(i13, 0, i14, i10));
            }
            view.setPadding(i11, 0, i12, i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20613a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.U0.isEmpty()) {
            int size = this.U0.size();
            for (int i10 = 0; i10 < size; i10++) {
                o2 o2Var = (o2) this.U0.get(i10);
                o2Var.onConfigurationChanged(configuration);
                Dialog dialog = o2Var.visibleDialog;
                if (dialog instanceof h3) {
                    ((h3) dialog).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20613a = false;
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
        y yVar;
        if (i10 == 82 && !i() && !this.Q && (kVar = this.f20665y) != null && !kVar.s() && (yVar = kVar.E) != null) {
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
        o2 o2Var;
        boolean z10 = true;
        if (!this.U0.isEmpty()) {
            o2Var = (o2) si.o0.g(1, this.U0);
        } else {
            o2Var = null;
        }
        if (o2Var != null && !o2Var.isSupportEdgeToEdge() && g0()) {
            int C = C();
            o2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, 1073741824));
            return;
        }
        d5 d5Var = this.P0;
        if (d5Var != null) {
            int[] iArr = this.f20625e1;
            iArr[0] = i10;
            iArr[1] = i11;
            d5Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        if (C() <= AndroidUtilities.dp(20.0f)) {
            z10 = false;
        }
        this.f20623d1 = z10;
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z10 = false;
        if (!i() && !this.C0 && !this.T && !this.f20636j1) {
            if (this.U0.size() > 1 && ((rVar = this.G) == null || rVar.getLastSheet() == null || !this.G.getLastSheet().isShown())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((o2) si.o0.g(1, this.U0)).isSwipeBackEnabled(motionEvent)) {
                        this.P = false;
                        this.Q = false;
                        v vVar = this.f20653s;
                        if (vVar != null) {
                            vVar.setLayerType(0, null);
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
                        if (((o2) si.o0.g(1, this.U0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.R = (int) motionEvent.getX();
                            P();
                        } else {
                            this.P = false;
                        }
                    } else if (this.Q) {
                        if (!this.V) {
                            Activity activity = this.Q0;
                            if (activity.getCurrentFocus() != null) {
                                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                            }
                            ((o2) si.o0.g(1, this.U0)).onBeginSlide();
                            this.V = true;
                        }
                        if (D()) {
                            float f7 = max;
                            this.f20653s.setTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                            setInnerTranslationX((f7 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        } else {
                            float f10 = max;
                            this.f20653s.setTranslationX(f10);
                            setInnerTranslationX(f10);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.D0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    this.U.addMovement(motionEvent);
                    this.U.computeCurrentVelocity(1000);
                    o2 o2Var = (o2) si.o0.g(1, this.U0);
                    if (!this.h && !this.f20614a0 && !this.Q && o2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.U.getXVelocity();
                        float yVelocity = this.U.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && o2Var.canBeginSlide()) {
                            this.R = (int) motionEvent.getX();
                            P();
                            if (!this.V) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
                                }
                                this.V = true;
                            }
                        }
                    }
                    if (this.Q) {
                        float x10 = this.f20653s.getX();
                        float xVelocity2 = this.U.getXVelocity();
                        float yVelocity2 = this.U.getYVelocity();
                        if (!D() ? x10 < this.f20653s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.P = false;
                        this.Q = false;
                        v vVar2 = this.f20653s;
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
                    v vVar3 = this.f20653s;
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
        if (f20610v1 != null && SharedConfig.drawActionBarShadow) {
            int i12 = i10 / 2;
            if (f20610v1.getAlpha() != i12) {
                f20610v1.setAlpha(i12);
            }
            f20610v1.setBounds(0, i11, getMeasuredWidth(), f20610v1.getIntrinsicHeight() + i11);
            f20610v1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.f20641n = true;
        this.h = false;
        o2 o2Var = (o2) si.o0.g(1, this.U0);
        o2Var.fragmentView.setOutlineProvider(null);
        o2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        o2Var.fragmentView.setLayoutParams(layoutParams);
        U((o2) si.o0.g(2, this.U0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(o2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(o2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new bs(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ne(13, this, o2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f20653s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
        this.f20653s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
        o2Var.setInPreviewMode(false);
        o2Var.setInMenuMode(false);
        try {
            Activity activity = this.Q0;
            if (k6.x0(null, k6.f21462s8, false) != -1 && (!o2Var.hasForceLightStatusBar() || k6.C0().q())) {
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
        if (!this.U0.isEmpty() && ((o2) si.o0.g(1, this.U0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.H0 = view;
    }

    @Override
    public void setDelegate(d5 d5Var) {
        this.P0 = d5Var;
    }

    @Override
    public void setDrawerLayoutContainer(b4 b4Var) {
        this.f20663x = b4Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i10) {
        v vVar = this.f20653s;
        if (vVar != null) {
            vVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<o2> list) {
        this.U0 = list;
        q3 q3Var = this.E;
        if (q3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            q3Var.I.remove(oVar);
            q3Var.J.remove(oVar2);
            AndroidUtilities.removeFromParent(this.E);
            this.E = null;
        }
        boolean z10 = this.R0;
        Activity activity = this.Q0;
        if (z10) {
            q3 q3Var2 = new q3(activity, this);
            this.E = q3Var2;
            this.F = new com.google.android.gms.internal.cast.z5(q3Var2);
            q3 q3Var3 = this.E;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            q3Var3.I.add(oVar3);
            q3Var3.J.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            z3 z3Var = LaunchActivity.J1.f33503y0;
            if (z3Var != null) {
                z3Var.setTabsView(this.E);
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
        v vVar3 = this.f20653s;
        if (vVar3 != null) {
            AndroidUtilities.removeFromParent(vVar3);
        }
        v vVar4 = new v(activity, this);
        this.f20653s = vVar4;
        addView(vVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f20653s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f20653s.setLayoutParams(layoutParams3);
        v vVar5 = this.f20661w;
        if (vVar5 != null) {
            AndroidUtilities.removeFromParent(vVar5);
        }
        v vVar6 = new v(activity, this);
        this.f20661w = vVar6;
        this.f20632h1.f26178a = vVar6;
        addView(vVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f20661w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f20661w.setLayoutParams(layoutParams4);
        r rVar = this.G;
        if (rVar != null) {
            rVar.setParentLayout(this);
            r rVar2 = this.G;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f20661w) {
                AndroidUtilities.removeFromParent(view);
                this.f20661w.addView(view, w7.z5.c(-1.0f, -1));
                this.f20661w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        for (o2 o2Var : this.U0) {
            o2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Y0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f20626f = z10;
    }

    public void setInnerTranslationX(float f7) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f7;
        invalidate();
        if (this.U0.size() >= 2 && this.f20653s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.clamp01(f7 / (AndroidUtilities.dp(56.0f) * 6));
            } else {
                measuredWidth = f7 / this.f20653s.getMeasuredWidth();
            }
            o2 o2Var = (o2) si.o0.g(2, this.U0);
            o2Var.onSlideProgress(false, measuredWidth);
            o2 o2Var2 = (o2) si.o0.g(1, this.U0);
            float a2 = w7.r.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (o2Var2.isBeginToShow() && (navigationBarColor = o2Var2.getNavigationBarColor()) != (navigationBarColor2 = o2Var.getNavigationBarColor())) {
                o2Var2.setNavigationBarColor(i0.a.f(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f20616b = z10;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (this.f20652r1 != i10) {
            this.f20652r1 = i10;
            invalidate();
        }
        b4 b4Var = this.f20663x;
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
        this.Z0 = i10;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<n9> list) {
        this.V0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.I0 = z10;
    }

    public void setThemeAnimationValue(float f7) {
        boolean z10;
        int alpha;
        this.f20654s0 = f7;
        for (int i10 = 0; i10 < this.f20644o0; i10++) {
            int f10 = i0.a.f(f7, this.m0[i10], this.f20642n0[i10]);
            qn qnVar = this.f20646p0;
            if (qnVar != null) {
                qnVar.h(this.f20639l0[i10], f10);
            } else {
                int i11 = this.f20639l0[i10];
                SparseIntArray sparseIntArray = k6.vl;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i11, f10);
                }
            }
        }
        ArrayList arrayList = this.f20631h0;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i12);
            int[] iArr = (int[]) this.f20617b0.get(i12);
            int[] iArr2 = (int[]) this.f20620c0.get(i12);
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
                t6 t6Var = (t6) arrayList2.get(i13);
                int i16 = t6Var.e;
                g6 g6Var = t6Var.f21868n;
                if (g6Var != null) {
                    g6Var.h(i16, argb);
                } else {
                    SparseIntArray sparseIntArray2 = k6.vl;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i16, argb);
                    }
                }
                t6Var.e(argb, false, false);
                i13++;
                i12 = i15;
                arrayList = arrayList3;
                size = i14;
            }
            i12++;
        }
        ArrayList arrayList4 = this.f20635j0;
        int size3 = arrayList4.size();
        for (int i17 = 0; i17 < size3; i17++) {
            s6 s6Var = (s6) arrayList4.get(i17);
            if (s6Var != null) {
                s6Var.b();
                s6Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.f20633i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i18 = 0; i18 < size4; i18++) {
                t6 t6Var2 = (t6) this.f20633i0.get(i18);
                t6Var2.e(k6.w0(t6Var2.e, t6Var2.f21868n), false, false);
            }
        }
        nn nnVar = this.f20629g0;
        if (nnVar != null) {
            qn qnVar2 = nnVar.f39931a;
            qnVar2.F.f41737x0.invalidate();
            qnVar2.f40883s.K = f7;
            qnVar2.f40884t.K = f7;
            qnVar2.s(f7);
        }
        d5 d5Var = this.P0;
        if (d5Var != null) {
            d5Var.a(f7);
        }
        q6 q6Var = r6.f21816a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f7 < 1.0f && currentAnimationTimeMillis == r6.f21818c && f7 == r6.d) {
            if (getWindowToken() == null) {
                q6 N = r6.N(false, 0, null);
                try {
                    N.b(this);
                } finally {
                    N.a();
                }
            }
        } else {
            r6.f21818c = currentAnimationTimeMillis;
            r6.d = f7;
            if (f7 >= 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            r6.e0(this, z10);
        }
        E();
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.G0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f20619c = window;
    }

    public final o2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                o2 o2Var = (o2) getFragmentStack().get(size);
                if (o2Var != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack() && ig0.class.isInstance(o2Var)) {
                    return o2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int v(boolean z10) {
        q3 q3Var;
        if (this.R0 && (q3Var = this.E) != null) {
            if (z10) {
                return (int) q3Var.G;
            }
            return q3Var.H;
        }
        return 0;
    }

    public final ry w() {
        Activity activity = this.Q0;
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
            if (view.getParent() != this.f20661w) {
                AndroidUtilities.removeFromParent(view);
                this.f20661w.addView(view, w7.z5.c(-1.0f, -1));
                this.f20661w.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.f20661w.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean x() {
        if (!this.h && !this.f20614a0) {
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
