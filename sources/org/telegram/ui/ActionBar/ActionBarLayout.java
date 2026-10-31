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
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hf0;
import org.telegram.ui.my;
import org.telegram.ui.pf0;
import org.telegram.ui.pn;
import org.telegram.ui.q70;
import org.telegram.ui.sn;
public class ActionBarLayout extends FrameLayout implements z4, fg.b {
    public static Drawable f20066v1;
    public static Drawable f20067w1;
    public static Paint f20068x1;
    public boolean A0;
    public long B0;
    public boolean C0;
    public l D;
    public int D0;
    public i3 E;
    public Runnable E0;
    public bh.d F;
    public Runnable F0;
    public s G;
    public boolean G0;
    public k2 H;
    public View H0;
    public k2 I;
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
    public q70 O0;
    public boolean P;
    public v4 P0;
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
    public boolean f20069a;
    public boolean f20070a0;
    public boolean f20071a1;
    public boolean f20072b;
    public final ArrayList f20073b0;
    public final Path f20074b1;
    public Window f20075c;
    public final ArrayList f20076c0;
    public final float[] f20077c1;
    public Runnable d;
    public final x4 f20078d0;
    public boolean f20079d1;
    public Runnable e;
    public c5 f20080e0;
    public final int[] f20081e1;
    public boolean f20082f;
    public c5 f20083f0;
    public boolean f20084f1;
    public pn f20085g0;
    public int f20086g1;
    public boolean h;
    public final ArrayList f20087h0;
    public final org.telegram.ui.Components.t5 f20088h1;
    public ArrayList f20089i0;
    public boolean f20090i1;
    public final ArrayList f20091j0;
    public boolean f20092j1;
    public int[] f20093k0;
    public boolean f20094k1;
    public int[] f20095l0;
    public float l1;
    public int[] m0;
    public boolean f20096m1;
    public boolean f20097n;
    public int[] f20098n0;
    public AnimatorSet f20099n1;
    public int f20100o0;
    public ArrayList f20101o1;
    public sn f20102p0;
    public final p f20103p1;
    public AnimatorSet f20104q0;
    public boolean f20105q1;
    public ColorDrawable f20106r;
    public final e2.f f20107r0;
    public int f20108r1;
    public w f20109s;
    public float f20110s0;
    public r0.j1 f20111s1;
    public boolean f20112t0;
    public i0.c f20113t1;
    public s6 f20114u0;
    public i0.c f20115u1;
    public boolean f20116v0;
    public w f20117w;
    public boolean f20118w0;
    public w f20119x;
    public int f20120x0;
    public s3 f20121y;
    public boolean f20122y0;
    public boolean f20123z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.L = new DecelerateInterpolator(1.5f);
        this.M = new OvershootInterpolator(1.02f);
        this.N = new AccelerateDecelerateInterpolator();
        this.f20073b0 = new ArrayList();
        this.f20076c0 = new ArrayList();
        x4 x4Var = new x4();
        x4Var.f21528b = new SparseIntArray();
        x4Var.f21529c = new int[]{t6.f21139ob, t6.f21191rb, t6.f21209sb, t6.f21228tb, t6.Oc, t6.f21174qb};
        this.f20078d0 = x4Var;
        this.f20087h0 = new ArrayList();
        this.f20091j0 = new ArrayList();
        this.f20107r0 = new e2.f(null);
        this.W0 = new Rect();
        this.Z0 = -1;
        this.f20074b1 = new Path();
        this.f20077c1 = new float[8];
        this.f20081e1 = new int[2];
        this.f20088h1 = new org.telegram.ui.Components.t5(this, 280L, gr.h);
        this.f20101o1 = new ArrayList();
        this.f20103p1 = new p(this, 2);
        i0.c cVar = i0.c.e;
        this.f20113t1 = cVar;
        this.f20115u1 = cVar;
        this.Q0 = (Activity) context;
        this.R0 = z10;
        if (f20067w1 == null) {
            f20067w1 = getResources().getDrawable(2131231620);
            f20066v1 = getResources().getDrawable(2131231238).mutate();
            f20068x1 = new Paint();
        }
        mg.l lVar = new mg.l(this, 8);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(this, lVar);
    }

    public static void E(ArrayList arrayList, View view) {
        if (view instanceof fg.b) {
            arrayList.addAll(((fg.b) view).F());
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
            if (actionBarLayout.U0.size() < 2) {
                actionBarLayout.g("onSlideAnimationEnd exit");
                return;
            }
            k2 k2Var = (k2) sc.e.g(1, actionBarLayout.U0);
            k2Var.prepareFragmentToSlide(true, false);
            k2Var.onPause();
            k2Var.onFragmentDestroy();
            k2Var.setParentLayout(null);
            List list = actionBarLayout.U0;
            list.remove(list.size() - 1);
            actionBarLayout.K("onSlideAnimationEnd");
            w wVar = actionBarLayout.f20109s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.f20117w;
            actionBarLayout.f20109s = wVar2;
            actionBarLayout.f20117w = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view = actionBarLayout.f20119x;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.U0.size() > 0) {
                k2 k2Var2 = (k2) sc.e.g(1, actionBarLayout.U0);
                actionBarLayout.D = k2Var2.actionBar;
                k2Var2.onResume();
                k2Var2.onBecomeFullyVisible();
                k2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.U0.size() >= 2) {
            ((k2) sc.e.g(1, actionBarLayout.U0)).prepareFragmentToSlide(true, false);
            k2 k2Var3 = (k2) sc.e.g(2, actionBarLayout.U0);
            k2Var3.prepareFragmentToSlide(false, false);
            k2Var3.onPause();
            View view2 = k2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                k2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(k2Var3.fragmentView);
            }
            l lVar = k2Var3.actionBar;
            if (lVar != null && lVar.K && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                viewGroup.removeViewInLayout(k2Var3.actionBar);
            }
            k2Var3.detachSheets();
        }
        actionBarLayout.f20117w.setVisibility(4);
        actionBarLayout.Q = false;
        actionBarLayout.T = false;
        actionBarLayout.f20109s.setTranslationX(0.0f);
        actionBarLayout.f20117w.setTranslationX(0.0f);
        actionBarLayout.f20109s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f7, float f10) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = org.telegram.messenger.i0.Q;
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
        if (i10 != t6.f20984g5 && i10 != t6.Oc && i10 != t6.Fe) {
            if (i10 != t6.f21191rb && i10 != t6.f21209sb && i10 != t6.f21228tb && i10 != t6.Be && i10 != t6.Ce && i10 != t6.De && i10 != t6.Ee) {
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

    public final int B() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.W0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i10 = org.telegram.messenger.i0.f16020m;
        } else {
            i10 = 0;
        }
        return Math.max(0, ((height - i10) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean C() {
        if (this.f20092j1 && this.f20094k1) {
            return true;
        }
        return false;
    }

    public final void D() {
        for (int i10 = 0; i10 < this.U0.size(); i10++) {
            if (((k2) this.U0.get(i10)).getFragmentView() != null) {
                try {
                    ((k2) this.U0.get(i10)).onThemeColorsChanged();
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    @Override
    public final List F() {
        k2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof fg.b) {
                arrayList.addAll(((fg.b) lastFragment).F());
            }
            E(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public final void G(boolean z10) {
        J();
        M();
        Runnable runnable = this.d;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
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
            org.telegram.messenger.i0.r(tVar);
            this.J0 = null;
        }
        setAlpha(1.0f);
        this.f20109s.setAlpha(1.0f);
        this.f20109s.setScaleX(1.0f);
        this.f20109s.setScaleY(1.0f);
        this.f20117w.setAlpha(1.0f);
        this.f20117w.setScaleX(1.0f);
        this.f20117w.setScaleY(1.0f);
    }

    public final void H() {
        i5 i5Var;
        l lVar;
        if (!this.f20070a0 && !this.Q && !i() && !this.U0.isEmpty()) {
            g20 g20Var = g20.f26224d0;
            if (g20Var != null && g20Var.f26237x) {
                g20Var.e(false);
                return;
            }
            if (!h0() && (lVar = this.D) != null && !lVar.u()) {
                l lVar2 = this.D;
                if (lVar2.f20497n0) {
                    lVar2.k(true);
                    return;
                }
            }
            k2 k2Var = (k2) sc.e.g(1, this.U0);
            if (!h0() && (i5Var = k2Var.simpleActionBar) != null) {
                s5 s5Var = i5Var.Q;
                if (s5Var != null) {
                    s5Var.a(true);
                    return;
                } else if (!i5Var.G && i5Var.F) {
                    i5Var.j(true);
                    return;
                }
            }
            s sVar = this.G;
            if ((sVar == null || sVar.onBackPressed(true)) && ((k2) sc.e.g(1, this.U0)).onBackPressed(true) && !this.U0.isEmpty()) {
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
            this.f20070a0 = false;
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
        ArrayList arrayList = hc.D().f15856f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.s5) arrayList.get(i10)).f30158y0 = 0;
        }
        g(str);
    }

    public final void L() {
        for (k2 k2Var : this.U0) {
            k2Var.onLowMemory();
        }
    }

    public final void M() {
        Runnable runnable;
        if (this.W && (runnable = this.F0) != null) {
            this.W = false;
            this.f20070a0 = false;
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
            ((k2) sc.e.g(1, this.U0)).onPause();
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void O() {
        if (!this.U0.isEmpty()) {
            ((k2) sc.e.g(1, this.U0)).onResume();
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
        this.f20117w.setVisibility(0);
        this.V = false;
        k2 k2Var = (k2) sc.e.g(2, this.U0);
        View view = k2Var.fragmentView;
        if (view == null && (view = k2Var.performCreateView(this.Q0)) != null && k2Var.isSupportEdgeToEdge() && k2Var.drawEdgeNavigationBar()) {
            o oVar = new o(k2Var);
            WeakHashMap weakHashMap = r0.h0.f46123a;
            r0.z.i(view, oVar);
            this.f20117w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            k2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.f20117w.addView(view);
        this.f20117w.setShouldHandleBottomInsets(k2Var.getEdgeToEdgeSupportMode());
        this.f20117w.setDrawNavigationBar(k2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        l lVar = k2Var.actionBar;
        if (lVar != null && lVar.K) {
            org.telegram.messenger.i0.E2(lVar);
            if (this.I0) {
                k2Var.actionBar.setOccupyStatusBar(false);
            }
            this.f20117w.addView(k2Var.actionBar);
        }
        k2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
        k2Var.attachSheets(this.f20117w);
        if (!k2Var.hasOwnBackground && view.getBackground() == null) {
            a7.i(t6.f20929d6, view, null);
        }
        k2Var.onResume();
        if (this.f20104q0 != null) {
            this.f20089i0 = k2Var.getThemeDescriptions();
        }
        this.f20109s.setLayerType(2, null);
        ((k2) sc.e.g(1, this.U0)).prepareFragmentToSlide(true, true);
        k2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean R(k2 k2Var) {
        return T(new w4(k2Var));
    }

    public final boolean S(k2 k2Var, boolean z10) {
        w4 w4Var = new w4(k2Var);
        w4Var.f21446b = z10;
        return T(w4Var);
    }

    public final boolean T(org.telegram.ui.ActionBar.w4 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.T(org.telegram.ui.ActionBar.w4):boolean");
    }

    public final boolean U(k2 k2Var, boolean z10, boolean z11) {
        w4 w4Var = new w4(k2Var);
        w4Var.f21446b = z10;
        w4Var.f21447c = z11;
        w4Var.d = true;
        w4Var.e = false;
        return T(w4Var);
    }

    public final void V(k2 k2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (k2Var == null) {
            return;
        }
        k2Var.onBecomeFullyHidden();
        k2Var.onPause();
        if (z10) {
            k2Var.onFragmentDestroy();
            k2Var.setParentLayout(null);
            this.U0.remove(k2Var);
            K("presentFragmentInternalRemoveOld");
        } else {
            View view = k2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                k2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(k2Var.fragmentView);
                } catch (Exception e) {
                    f8.g(e, true);
                    try {
                        viewGroup2.removeView(k2Var.fragmentView);
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                }
            }
            l lVar = k2Var.actionBar;
            if (lVar != null && lVar.K && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                viewGroup.removeViewInLayout(k2Var.actionBar);
            }
            k2Var.detachSheets();
        }
        this.f20117w.setVisibility(4);
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
                ((k2) this.U0.get(i10)).clearViews();
                ((k2) this.U0.get(i10)).setParentLayout(this);
            }
            v4 v4Var = this.P0;
            if (v4Var != null) {
                v4Var.b(this, z10);
            }
            if (z11) {
                e0();
                return;
            }
            return;
        }
        this.f20122y0 = true;
        this.f20123z0 = z10;
        this.A0 = z11;
    }

    public final void X() {
        W(true, true);
    }

    public final void Y() {
        this.f20109s.removeAllViews();
        this.f20117w.removeAllViews();
        this.D = null;
        this.H = null;
        this.I = null;
    }

    public final void Z() {
        while (this.U0.size() > 0) {
            d0((k2) this.U0.get(0), false);
        }
        View view = this.H0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new p(this, 5)).start();
        }
    }

    public final void a0(int i10) {
        if (i10 >= 0 && i10 < getFragmentStack().size()) {
            c0((k2) getFragmentStack().get(i10), false);
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.j1 j1Var = this.f20111s1;
        if (j1Var != null) {
            o(view, j1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f20076c0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = ((c7) arrayList.get(i10)).c();
            }
        }
    }

    public final void b0(k2 k2Var) {
        c0(k2Var, false);
    }

    public final boolean c(int i10, k2 k2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        v4 v4Var = this.P0;
        if ((v4Var != null && !v4Var.h(k2Var, this)) || !k2Var.onFragmentCreate() || this.U0.contains(k2Var)) {
            return false;
        }
        k2Var.setParentLayout(this);
        Activity activity = this.Q0;
        if (i10 != -1 && i10 != -2) {
            if (i10 == -3) {
                View view = k2Var.fragmentView;
                if (view == null) {
                    view = k2Var.performCreateView(activity);
                    if (view != null && k2Var.isSupportEdgeToEdge() && k2Var.drawEdgeNavigationBar()) {
                        o oVar = new o(k2Var);
                        WeakHashMap weakHashMap = r0.h0.f46123a;
                        r0.z.i(view, oVar);
                        this.f20109s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        k2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!k2Var.hasOwnBackground && view.getBackground() == null) {
                    a7.i(t6.f20929d6, view, null);
                }
                w wVar = this.f20109s;
                wVar.addView(view, Utilities.j(0, wVar.getChildCount(), 0), w7.b6.c(-1.0f, -1));
                this.f20109s.setShouldHandleBottomInsets(k2Var.getEdgeToEdgeSupportMode());
                this.f20109s.setDrawNavigationBar(k2Var.drawEdgeNavigationBar());
                l lVar = k2Var.actionBar;
                if (lVar != null && lVar.K) {
                    if (this.I0) {
                        lVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) k2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(k2Var.actionBar);
                    }
                    this.f20109s.addView(k2Var.actionBar);
                }
                k2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                k2Var.attachSheets(this.f20109s);
                i10 = 0;
            }
            this.U0.add(i10, k2Var);
            K("addFragmentToStack");
        } else {
            if (!this.U0.isEmpty()) {
                k2 k2Var2 = (k2) sc.e.g(1, this.U0);
                k2Var2.onPause();
                l lVar2 = k2Var2.actionBar;
                if (lVar2 != null && lVar2.K && (viewGroup2 = (ViewGroup) lVar2.getParent()) != null) {
                    viewGroup2.removeView(k2Var2.actionBar);
                }
                View view2 = k2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    k2Var2.onRemoveFromParent();
                    viewGroup.removeView(k2Var2.fragmentView);
                }
                k2Var2.detachSheets();
            }
            this.U0.add(k2Var);
            if (i10 != -2) {
                View view3 = k2Var.fragmentView;
                if (view3 == null) {
                    view3 = k2Var.performCreateView(activity);
                    if (view3 != null && k2Var.isSupportEdgeToEdge() && k2Var.drawEdgeNavigationBar()) {
                        o oVar2 = new o(k2Var);
                        WeakHashMap weakHashMap2 = r0.h0.f46123a;
                        r0.z.i(view3, oVar2);
                        this.f20109s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        k2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!k2Var.hasOwnBackground && view3.getBackground() == null) {
                    a7.i(t6.f20929d6, view3, null);
                }
                this.f20109s.addView(view3, w7.b6.c(-1.0f, -1));
                this.f20109s.setShouldHandleBottomInsets(k2Var.getEdgeToEdgeSupportMode());
                this.f20109s.setDrawNavigationBar(k2Var.drawEdgeNavigationBar());
                l lVar3 = k2Var.actionBar;
                if (lVar3 != null && lVar3.K) {
                    if (this.I0) {
                        lVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) k2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(k2Var.actionBar);
                    }
                    this.f20109s.addView(k2Var.actionBar);
                }
                k2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                k2Var.attachSheets(this.f20109s);
                k2Var.onResume();
                k2Var.onTransitionAnimationEnd(false, true);
                k2Var.onTransitionAnimationEnd(true, true);
                k2Var.onBecomeFullyVisible();
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

    public final void c0(k2 k2Var, boolean z10) {
        boolean z11 = true;
        if ((this.U0.size() > 0 && sc.e.g(1, this.U0) == k2Var) || (this.U0.size() > 1 && sc.e.g(2, this.U0) == k2Var)) {
            M();
            J();
        }
        g("removeFragmentFromStack " + z10);
        if (this.G0 && this.U0.size() == 1 && org.telegram.messenger.i0.Q1()) {
            l(true, false);
            return;
        }
        if (this.P0 != null && this.U0.size() == 1 && org.telegram.messenger.i0.Q1()) {
            this.P0.k(this);
        }
        if (!k2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) {
            z11 = false;
        }
        d0(k2Var, z11);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f20087h0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f20073b0.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c7 c7Var = (c7) arrayList.get(i10);
                iArr[i10] = c7Var.c();
                b7 b7Var = c7Var.f20236g;
                c7Var.f20236g = null;
                if (b7Var != null) {
                    ArrayList arrayList2 = this.f20091j0;
                    if (!arrayList2.contains(b7Var)) {
                        arrayList2.add(b7Var);
                    }
                }
            }
        }
    }

    public final void d0(k2 k2Var, boolean z10) {
        if (!this.U0.contains(k2Var)) {
            return;
        }
        if (z10 && sc.e.g(1, this.U0) == k2Var) {
            k2Var.finishFragment();
        } else if (sc.e.g(1, this.U0) == k2Var && this.U0.size() > 1) {
            k2Var.finishFragment(false);
        } else {
            k2Var.onPause();
            k2Var.onFragmentDestroy();
            k2Var.setParentLayout(null);
            this.U0.remove(k2Var);
            K("removeFragmentFromStackInternal " + z10);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.E != null && v(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.E.getMeasuredHeight() + this.f20113t1.d), getWidth(), getHeight(), this.E.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.f20071a1 = true;
        if (this.S0) {
            canvas2.save();
            float L = org.telegram.messenger.i0.L(24.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.f20074b1;
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
            v4 v4Var = this.P0;
            if ((v4Var != null && v4Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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
        k2 k2Var;
        int i10;
        Animator customSlideTransition;
        int i11;
        int i12;
        if (!this.U0.isEmpty()) {
            k2Var = (k2) sc.e.g(1, this.U0);
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            return;
        }
        float x10 = this.f20109s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = k2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x10 = Math.abs(this.f20109s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f20109s.getMeasuredWidth()) * x10);
            if (C()) {
                i11 = 380;
            } else {
                i11 = 50;
            }
            int max = Math.max(measuredWidth, i11);
            if (!shouldOverrideSlideTransition) {
                w wVar = this.f20109s;
                int measuredWidth2 = wVar.getMeasuredWidth();
                if (this.f20092j1) {
                    i12 = org.telegram.messenger.i0.L(56.0f);
                } else {
                    i12 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wVar, property, measuredWidth2 + i12);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f20109s.getMeasuredWidth()).setDuration(j10));
                if (C()) {
                    animatorSet.setInterpolator(gr.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f20109s.getMeasuredWidth()) * x10);
            if (C()) {
                i10 = 320;
            } else {
                i10 = 120;
            }
            int max2 = Math.max(measuredWidth3, i10);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f20109s, property, 0.0f);
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j11));
                if (C()) {
                    animatorSet.setInterpolator(gr.h);
                }
            }
        }
        Animator customSlideTransition2 = k2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        k2 k2Var2 = (k2) sc.e.g(2, this.U0);
        if (k2Var2 != null && (customSlideTransition = k2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f20099n1 = animatorSet;
        animatorSet.start();
        this.T = true;
    }

    public final void e0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.U0.isEmpty()) {
            int size = this.U0.size() - 1;
            if (!this.U0.isEmpty()) {
                if (this.U0.isEmpty() || this.U0.size() - 1 != size || ((k2) this.U0.get(size)).fragmentView == null) {
                    for (int i10 = 0; i10 < size; i10++) {
                        k2 k2Var = (k2) this.U0.get(i10);
                        l lVar = k2Var.actionBar;
                        if (lVar != null && lVar.K && (viewGroup2 = (ViewGroup) lVar.getParent()) != null) {
                            viewGroup2.removeView(k2Var.actionBar);
                        }
                        View view = k2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            k2Var.onPause();
                            k2Var.onRemoveFromParent();
                            viewGroup.removeView(k2Var.fragmentView);
                        }
                    }
                    k2 k2Var2 = (k2) this.U0.get(size);
                    k2Var2.setParentLayout(this);
                    View view2 = k2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = k2Var2.performCreateView(this.Q0);
                        if (view2 != null && k2Var2.isSupportEdgeToEdge() && k2Var2.drawEdgeNavigationBar()) {
                            o oVar = new o(k2Var2);
                            WeakHashMap weakHashMap = r0.h0.f46123a;
                            r0.z.i(view2, oVar);
                            this.f20109s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            k2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f20109s.addView(view2, w7.b6.c(-1.0f, -1));
                    this.f20109s.setShouldHandleBottomInsets(k2Var2.getEdgeToEdgeSupportMode());
                    this.f20109s.setDrawNavigationBar(k2Var2.drawEdgeNavigationBar());
                    l lVar2 = k2Var2.actionBar;
                    if (lVar2 != null && lVar2.K) {
                        if (this.I0) {
                            lVar2.setOccupyStatusBar(false);
                        }
                        org.telegram.messenger.i0.E2(k2Var2.actionBar);
                        this.f20109s.addView(k2Var2.actionBar);
                    }
                    k2Var2.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                    k2Var2.attachSheets(this.f20109s);
                    k2Var2.onResume();
                    k2Var2.onBecomeFullyVisible();
                    this.D = k2Var2.actionBar;
                    if (!k2Var2.hasOwnBackground && view2.getBackground() == null) {
                        a7.i(t6.f20929d6, view2, null);
                    }
                }
            }
        }
    }

    public final void f(org.telegram.ui.ActionBar.y4 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.y4, java.lang.Runnable):void");
    }

    public final void f0(sn snVar) {
        int x02;
        try {
            int i10 = t6.f20965f5;
            this.f20093k0 = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int[] iArr = this.f20093k0;
                if (snVar != null) {
                    x02 = snVar.h(i11);
                } else {
                    x02 = t6.x0(null, i11, false);
                }
                iArr[i11] = x02;
            }
        } catch (Exception e) {
            f8.g(e, true);
            this.f20093k0 = null;
        }
    }

    public final void g(String str) {
        boolean z10 = org.telegram.messenger.v2.f18448a;
        ArrayList arrayList = this.f20101o1;
        StringBuilder i10 = sc.e.i(str, " ");
        i10.append(this.U0.size());
        arrayList.add(0, i10.toString());
        if (this.f20101o1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < 10; i11++) {
                arrayList2.add((String) this.f20101o1.get(i11));
            }
            this.f20101o1 = arrayList2;
        }
        p pVar = this.f20103p1;
        org.telegram.messenger.i0.r(pVar);
        org.telegram.messenger.i0.h3(pVar, 500L);
    }

    public final void g0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.K0 = 0.0f;
            this.L0 = System.nanoTime() / 1000000;
        }
        t tVar = new t(this, z11, z12, z10);
        this.J0 = tVar;
        org.telegram.messenger.i0.g3(tVar);
    }

    @Override
    public k2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (k2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public z2 getBottomSheet() {
        return null;
    }

    public i3 getBottomSheetTabs() {
        return this.E;
    }

    public float getCurrentPreviewFragmentAlpha() {
        w wVar;
        if (!this.h && !this.f20070a0 && !this.f20097n) {
            return 0.0f;
        }
        k2 k2Var = this.I;
        if (k2Var != null && k2Var.inPreviewMode) {
            wVar = this.f20117w;
        } else {
            wVar = this.f20109s;
        }
        return wVar.getAlpha();
    }

    public s3 getDrawerLayoutContainer() {
        return this.f20121y;
    }

    @Override
    public List<k2> getFragmentStack() {
        return this.U0;
    }

    public float getInnerTranslationX() {
        return this.O;
    }

    @Override
    public k2 getLastFragment() {
        if (this.U0.isEmpty()) {
            return null;
        }
        return (k2) sc.e.g(1, this.U0);
    }

    public k2 getLastFragmentIncludeMainTabs() {
        k2 lastFragment = getLastFragment();
        if (lastFragment instanceof pf0) {
            return ((pf0) lastFragment).b0();
        }
        return lastFragment;
    }

    @Override
    public c5 getMessageDrawableOutMediaStart() {
        return this.f20083f0;
    }

    @Override
    public c5 getMessageDrawableOutStart() {
        return this.f20080e0;
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
    public List<x8> getPulledDialogs() {
        return this.V0;
    }

    @Override
    public k2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                k2 k2Var = (k2) getFragmentStack().get(size);
                if (k2Var != null && k2Var.getContext() != null && !k2Var.isFinishing() && !k2Var.isRemovingFromStack()) {
                    return k2Var;
                }
            }
            return null;
        }
        return null;
    }

    public my getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.f20110s0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f20075c;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public final void h() {
        if (this.f20122y0) {
            W(this.f20123z0, this.A0);
            this.f20122y0 = false;
        } else if (this.f20112t0) {
            y4 y4Var = new y4(this.f20114u0, this.f20120x0, this.f20118w0, true);
            boolean z10 = this.f20116v0;
            if (!z10) {
                y4Var.f21567g = z10;
                y4Var.f21566f = z10;
            }
            f(y4Var, null);
            this.f20114u0 = null;
            this.f20112t0 = false;
        }
    }

    public final boolean h0() {
        k2 k2Var;
        if (!this.U0.isEmpty()) {
            k2Var = (k2) sc.e.g(1, this.U0);
        } else {
            k2Var = null;
        }
        if (k2Var != null && k2Var.getLastStoryViewer() != null && k2Var.getLastStoryViewer().z()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        if (this.f20070a0) {
            return false;
        }
        if (this.W && (this.B0 < System.currentTimeMillis() - 1500 || this.h)) {
            G(true);
        }
        return this.W;
    }

    public final void j() {
        this.f20100o0 = 0;
        this.f20102p0 = null;
        this.f20093k0 = null;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        k2 k2Var;
        boolean z13;
        boolean z14;
        k2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            v4 v4Var = this.P0;
            if ((v4Var == null || v4Var.k(this)) && !i() && !this.U0.isEmpty()) {
                Activity activity = this.Q0;
                if (activity.getCurrentFocus() != null) {
                    org.telegram.messenger.i0.v1(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.f20070a0 || (z10 && vp.d1().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                k2 k2Var2 = (k2) sc.e.g(1, this.U0);
                AnimatorSet animatorSet = null;
                if (this.U0.size() > 1) {
                    k2Var = (k2) sc.e.g(2, this.U0);
                } else {
                    k2Var = null;
                }
                if (k2Var != null) {
                    if (t6.x0(null, t6.f21206s8, false) != -1 && (!k2Var.hasForceLightStatusBar() || t6.D0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    org.telegram.messenger.i0.o3(activity, z13);
                    w wVar = this.f20109s;
                    this.f20109s = this.f20117w;
                    this.f20117w = wVar;
                    k2Var.setParentLayout(this);
                    View view = k2Var.fragmentView;
                    if (view == null && (view = k2Var.performCreateView(activity)) != null && k2Var.isSupportEdgeToEdge() && k2Var.drawEdgeNavigationBar()) {
                        o oVar = new o(k2Var);
                        WeakHashMap weakHashMap = r0.h0.f46123a;
                        r0.z.i(view, oVar);
                        this.f20109s.invalidate();
                    }
                    if (!this.h) {
                        this.f20109s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            k2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                f8.g(e, true);
                            }
                        }
                        this.f20109s.addView(view);
                        this.f20109s.setShouldHandleBottomInsets(k2Var.getEdgeToEdgeSupportMode());
                        this.f20109s.setDrawNavigationBar(k2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        l lVar = k2Var.actionBar;
                        if (lVar != null && lVar.K) {
                            if (this.I0) {
                                lVar.setOccupyStatusBar(false);
                            }
                            org.telegram.messenger.i0.E2(k2Var.actionBar);
                            this.f20109s.addView(k2Var.actionBar);
                        }
                        k2Var.setTitleOverlayTextIfActionBarAttached(this.M0, this.N0, this.O0);
                        k2Var.attachSheets(this.f20109s);
                    }
                    this.H = k2Var;
                    this.I = k2Var2;
                    k2Var.onTransitionAnimationStart(true, true);
                    k2Var2.onTransitionAnimationStart(false, true);
                    k2Var.onResume();
                    if (this.f20104q0 != null) {
                        this.f20089i0 = k2Var.getThemeDescriptions();
                    }
                    this.D = k2Var.actionBar;
                    if (!k2Var.hasOwnBackground && view.getBackground() == null) {
                        a7.i(t6.f20929d6, view, null);
                    }
                    if (z12) {
                        this.B0 = System.currentTimeMillis();
                        this.W = true;
                        k2Var2.setRemovingFromStack(true);
                        this.E0 = new li.s(this, k2Var2, k2Var, 18);
                        if (!this.h && !this.f20070a0) {
                            animatorSet = k2Var2.onCustomTransitionAnimation(false, new p(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f20109s.f21419b || this.f20117w.f21419b)) {
                                mg.c2 c2Var = new mg.c2(this, 12);
                                this.d = c2Var;
                                org.telegram.messenger.i0.h3(c2Var, 200L);
                            } else {
                                if (!z15 && !this.f20070a0) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                g0(false, true, z14);
                            }
                        } else {
                            this.K = animatorSet;
                            wb wbVar = wb.f32128w;
                            if (wbVar != null && wbVar.f32137l) {
                                wbVar.b();
                            }
                        }
                        K("closeLastFragment");
                    } else {
                        m(k2Var2);
                        k2Var2.onTransitionAnimationEnd(false, true);
                        k2Var.onTransitionAnimationEnd(true, true);
                        k2Var.onBecomeFullyVisible();
                    }
                } else if (this.G0 && !z11) {
                    this.B0 = System.currentTimeMillis();
                    this.W = true;
                    this.E0 = new mh.k(24, this, k2Var2);
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
                    d0(k2Var2, false);
                    setVisibility(8);
                    View view3 = this.H0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                k2Var2.onFragmentClosed();
            }
        }
    }

    public final void m(k2 k2Var) {
        k2Var.finishing = true;
        k2Var.onPause();
        k2Var.onFragmentDestroy();
        k2Var.setParentLayout(null);
        this.U0.remove(k2Var);
        this.f20117w.setVisibility(4);
        this.f20117w.setTranslationY(0.0f);
        bringChildToFront(this.f20109s);
        w wVar = this.f20119x;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        K("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((k2) sc.e.g(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void o(View view, r0.j1 j1Var) {
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
        r0.z0 v0Var;
        boolean z11 = this.S0;
        if (z11) {
            if ((view instanceof w) && ((w) view).f21427y) {
                int i18 = j1Var.f46132a.f(8).d;
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
                r0.j1 j1Var2 = r0.j1.f46131b;
                int i19 = Build.VERSION.SDK_INT;
                if (i19 >= 34) {
                    v0Var = new r0.y0(j1Var2);
                } else if (i19 >= 30) {
                    v0Var = new r0.x0(j1Var2);
                } else if (i19 >= 29) {
                    v0Var = new r0.w0(j1Var2);
                } else {
                    v0Var = new r0.v0(j1Var2);
                }
                v0Var.c(8, i0.c.b(0, 0, 0, max));
                r0.h0.b(view, v0Var.b());
                return;
            }
            r0.h0.b(view, r0.j1.f46131b);
            return;
        }
        boolean z12 = this.T0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.c cVar = this.f20113t1;
        i0.c cVar2 = this.f20115u1;
        if (view instanceof i3) {
            if (z12) {
                i15 = 0;
            } else {
                i15 = cVar.f7765a;
            }
            if (z10) {
                i16 = 0;
            } else {
                i16 = cVar.f7767c;
            }
            org.telegram.messenger.i0.A3(view, i15, 0, i16, cVar.d);
        } else if (view instanceof w) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            w wVar = (w) view;
            int v = v(false);
            if (v > 0) {
                i10 = cVar.d + v;
            } else {
                i10 = 0;
            }
            t3 t3Var = wVar.f21426x;
            if (t3Var != t3.f20863c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i11 = cVar2.f7765a;
            } else {
                i11 = 0;
            }
            if (!z13 && !z10) {
                i12 = cVar2.f7767c;
            } else {
                i12 = 0;
            }
            if (z13 && !z12) {
                i13 = 0;
            } else {
                i13 = cVar2.f7765a;
            }
            if (z13 && !z10) {
                i14 = 0;
            } else {
                i14 = cVar2.f7767c;
            }
            if (t3Var == t3.f20861a) {
                i10 = Math.max(i10, cVar2.d);
                r0.h0.b(view, r0.j1.f46131b);
            } else {
                r0.h0.b(view, j1Var.f46132a.m(i13, 0, i14, i10));
            }
            view.setPadding(i11, 0, i12, i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20069a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.U0.isEmpty()) {
            int size = this.U0.size();
            for (int i10 = 0; i10 < size; i10++) {
                k2 k2Var = (k2) this.U0.get(i10);
                k2Var.onConfigurationChanged(configuration);
                Dialog dialog = k2Var.visibleDialog;
                if (dialog instanceof z2) {
                    ((z2) dialog).c0(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20069a = false;
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
        l lVar;
        y yVar;
        if (i10 == 82 && !i() && !this.Q && (lVar = this.D) != null && !lVar.u() && (yVar = lVar.E) != null) {
            int childCount = yVar.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = yVar.getChildAt(i11);
                if (childAt instanceof t0) {
                    t0 t0Var = (t0) childAt;
                    if (t0Var.getVisibility() != 0) {
                        continue;
                    } else if (t0Var.s()) {
                        t0Var.U(null, null);
                        break;
                    } else if (t0Var.S) {
                        yVar.o(((Integer) t0Var.getTag()).intValue());
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
        k2 k2Var;
        boolean z10 = true;
        if (!this.U0.isEmpty()) {
            k2Var = (k2) sc.e.g(1, this.U0);
        } else {
            k2Var = null;
        }
        if (k2Var != null && !k2Var.isSupportEdgeToEdge() && h0()) {
            int B = B();
            k2Var.setKeyboardHeightFromParent(B);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + B, 1073741824));
            return;
        }
        v4 v4Var = this.P0;
        if (v4Var != null) {
            int[] iArr = this.f20081e1;
            iArr[0] = i10;
            iArr[1] = i11;
            v4Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        if (B() <= org.telegram.messenger.i0.L(20.0f)) {
            z10 = false;
        }
        this.f20079d1 = z10;
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean z10 = false;
        if (!i() && !this.C0 && !this.T && !this.f20092j1) {
            if (this.U0.size() > 1 && ((sVar = this.G) == null || sVar.getLastSheet() == null || !this.G.getLastSheet().s())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((k2) sc.e.g(1, this.U0)).isSwipeBackEnabled(motionEvent)) {
                        this.P = false;
                        this.Q = false;
                        w wVar = this.f20109s;
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
                    if (!this.W && !this.h && this.P && !this.Q && max >= org.telegram.messenger.i0.a1(true, 0.4f) && Math.abs(max) / 3 > abs) {
                        if (((k2) sc.e.g(1, this.U0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.R = (int) motionEvent.getX();
                            Q();
                        } else {
                            this.P = false;
                        }
                    } else if (this.Q) {
                        if (!this.V) {
                            Activity activity = this.Q0;
                            if (activity.getCurrentFocus() != null) {
                                org.telegram.messenger.i0.v1(activity.getCurrentFocus());
                            }
                            ((k2) sc.e.g(1, this.U0)).onBeginSlide();
                            this.V = true;
                        }
                        if (C()) {
                            float f7 = max;
                            this.f20109s.setTranslationX((f7 / getWidth()) * org.telegram.messenger.i0.L(56.0f) * 5);
                            setInnerTranslationX((f7 / getWidth()) * org.telegram.messenger.i0.L(56.0f) * 5);
                        } else {
                            float f10 = max;
                            this.f20109s.setTranslationX(f10);
                            setInnerTranslationX(f10);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.D0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.U == null) {
                        this.U = VelocityTracker.obtain();
                    }
                    this.U.addMovement(motionEvent);
                    this.U.computeCurrentVelocity(1000);
                    k2 k2Var = (k2) sc.e.g(1, this.U0);
                    if (!this.h && !this.f20070a0 && !this.Q && k2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.U.getXVelocity();
                        float yVelocity = this.U.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && k2Var.canBeginSlide()) {
                            this.R = (int) motionEvent.getX();
                            Q();
                            if (!this.V) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    org.telegram.messenger.i0.v1(((Activity) getContext()).getCurrentFocus());
                                }
                                this.V = true;
                            }
                        }
                    }
                    if (this.Q) {
                        float x10 = this.f20109s.getX();
                        float xVelocity2 = this.U.getXVelocity();
                        float yVelocity2 = this.U.getYVelocity();
                        if (!C() ? x10 < this.f20109s.getMeasuredWidth() / 3.0f : !(x10 >= org.telegram.messenger.i0.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.P = false;
                        this.Q = false;
                        w wVar2 = this.f20109s;
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
                    w wVar3 = this.f20109s;
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
        if (f20066v1 != null && tz.D1) {
            int i12 = i10 / 2;
            if (f20066v1.getAlpha() != i12) {
                f20066v1.setAlpha(i12);
            }
            f20066v1.setBounds(0, i11, getMeasuredWidth(), f20066v1.getIntrinsicHeight() + i11);
            f20066v1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.f20097n = true;
        this.h = false;
        k2 k2Var = (k2) sc.e.g(1, this.U0);
        k2Var.fragmentView.setOutlineProvider(null);
        k2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        k2Var.fragmentView.setLayoutParams(layoutParams);
        V((k2) sc.e.g(2, this.U0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(k2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(k2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new gr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new bg.f(10, this, k2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f20109s.setShouldHandleBottomInsets(k2Var.getEdgeToEdgeSupportMode());
        this.f20109s.setDrawNavigationBar(k2Var.drawEdgeNavigationBar());
        k2Var.setInPreviewMode(false);
        k2Var.setInMenuMode(false);
        try {
            Activity activity = this.Q0;
            if (t6.x0(null, t6.f21206s8, false) != -1 && (!k2Var.hasForceLightStatusBar() || t6.D0().q())) {
                z10 = false;
            }
            org.telegram.messenger.i0.o3(activity, z10);
        } catch (Exception unused2) {
        }
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final boolean s(Menu menu) {
        if (!this.U0.isEmpty() && ((k2) sc.e.g(1, this.U0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.H0 = view;
    }

    @Override
    public void setDelegate(v4 v4Var) {
        this.P0 = v4Var;
    }

    @Override
    public void setDrawerLayoutContainer(s3 s3Var) {
        this.f20121y = s3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i10) {
        w wVar = this.f20109s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<k2> list) {
        this.U0 = list;
        i3 i3Var = this.E;
        if (i3Var != null) {
            p pVar = new p(this, 0);
            p pVar2 = new p(this, 1);
            i3Var.I.remove(pVar);
            i3Var.J.remove(pVar2);
            org.telegram.messenger.i0.E2(this.E);
            this.E = null;
        }
        boolean z10 = this.R0;
        Activity activity = this.Q0;
        if (z10) {
            i3 i3Var2 = new i3(activity, this);
            this.E = i3Var2;
            this.F = new bh.d(i3Var2);
            i3 i3Var3 = this.E;
            p pVar3 = new p(this, 0);
            p pVar4 = new p(this, 1);
            i3Var3.I.add(pVar3);
            i3Var3.J.add(pVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.E, layoutParams);
            q3 q3Var = LaunchActivity.I1.f33393y0;
            if (q3Var != null) {
                q3Var.setTabsView(this.E);
            }
        }
        w wVar = this.f20117w;
        if (wVar != null) {
            org.telegram.messenger.i0.E2(wVar);
        }
        w wVar2 = new w(activity, this);
        this.f20117w = wVar2;
        addView(wVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f20117w.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.f20117w.setLayoutParams(layoutParams2);
        w wVar3 = this.f20109s;
        if (wVar3 != null) {
            org.telegram.messenger.i0.E2(wVar3);
        }
        w wVar4 = new w(activity, this);
        this.f20109s = wVar4;
        addView(wVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f20109s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f20109s.setLayoutParams(layoutParams3);
        w wVar5 = this.f20119x;
        if (wVar5 != null) {
            org.telegram.messenger.i0.E2(wVar5);
        }
        w wVar6 = new w(activity, this);
        this.f20119x = wVar6;
        this.f20088h1.f30443a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f20119x.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f20119x.setLayoutParams(layoutParams4);
        s sVar = this.G;
        if (sVar != null) {
            sVar.setParentLayout(this);
            s sVar2 = this.G;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f20119x) {
                org.telegram.messenger.i0.E2(view);
                this.f20119x.addView(view, w7.b6.c(-1.0f, -1));
                this.f20119x.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        for (k2 k2Var : this.U0) {
            k2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Y0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f20082f = z10;
    }

    public void setInnerTranslationX(float f7) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.O = f7;
        invalidate();
        if (this.U0.size() >= 2 && this.f20109s.getMeasuredWidth() > 0) {
            if (C()) {
                measuredWidth = Utilities.l(f7 / (org.telegram.messenger.i0.L(56.0f) * 6));
            } else {
                measuredWidth = f7 / this.f20109s.getMeasuredWidth();
            }
            k2 k2Var = (k2) sc.e.g(2, this.U0);
            k2Var.onSlideProgress(false, measuredWidth);
            k2 k2Var2 = (k2) sc.e.g(1, this.U0);
            float a2 = w7.u.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (k2Var2.isBeginToShow() && (navigationBarColor = k2Var2.getNavigationBarColor()) != (navigationBarColor2 = k2Var.getNavigationBarColor())) {
                k2Var2.setNavigationBarColor(i0.b.f(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f20072b = z10;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (this.f20108r1 != i10) {
            this.f20108r1 = i10;
            invalidate();
        }
        s3 s3Var = this.f20121y;
        if (s3Var != null) {
            s3Var.setInternalNavigationBarColor(i10);
        }
        i3 i3Var = this.E;
        if (i3Var != null) {
            if (!this.Q && !this.T) {
                z10 = true;
            } else {
                z10 = false;
            }
            i3Var.i(i10, z10);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.Z0 = i10;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<x8> list) {
        this.V0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.I0 = z10;
    }

    public void setThemeAnimationValue(float f7) {
        boolean z10;
        int alpha;
        this.f20110s0 = f7;
        for (int i10 = 0; i10 < this.f20100o0; i10++) {
            int f10 = i0.b.f(f7, this.m0[i10], this.f20098n0[i10]);
            sn snVar = this.f20102p0;
            if (snVar != null) {
                snVar.i(this.f20095l0[i10], f10);
            } else {
                int i11 = this.f20095l0[i10];
                SparseIntArray sparseIntArray = t6.jm;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i11, f10);
                }
            }
        }
        ArrayList arrayList = this.f20087h0;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i12);
            int[] iArr = (int[]) this.f20073b0.get(i12);
            int[] iArr2 = (int[]) this.f20076c0.get(i12);
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
                c7 c7Var = (c7) arrayList2.get(i13);
                int i16 = c7Var.e;
                p6 p6Var = c7Var.f20242n;
                if (p6Var != null) {
                    p6Var.i(i16, argb);
                } else {
                    SparseIntArray sparseIntArray2 = t6.jm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i16, argb);
                    }
                }
                c7Var.e(argb, false, false);
                i13++;
                i12 = i15;
                arrayList = arrayList3;
                size = i14;
            }
            i12++;
        }
        ArrayList arrayList4 = this.f20091j0;
        int size3 = arrayList4.size();
        for (int i17 = 0; i17 < size3; i17++) {
            b7 b7Var = (b7) arrayList4.get(i17);
            if (b7Var != null) {
                b7Var.b();
                b7Var.a(f7);
            }
        }
        ArrayList arrayList5 = this.f20089i0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i18 = 0; i18 < size4; i18++) {
                c7 c7Var2 = (c7) this.f20089i0.get(i18);
                c7Var2.e(t6.w0(c7Var2.e, c7Var2.f20242n), false, false);
            }
        }
        pn pnVar = this.f20085g0;
        if (pnVar != null) {
            sn snVar2 = pnVar.f40690a;
            snVar2.G.f42492z0.invalidate();
            snVar2.f41603t.K = f7;
            snVar2.f41604u.K = f7;
            snVar2.u(f7);
        }
        v4 v4Var = this.P0;
        if (v4Var != null) {
            v4Var.a(f7);
        }
        z6 z6Var = a7.f20157a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f7 < 1.0f && currentAnimationTimeMillis == a7.f20159c && f7 == a7.d) {
            if (getWindowToken() == null) {
                a7.d0(this, false);
            }
        } else {
            a7.f20159c = currentAnimationTimeMillis;
            a7.d = f7;
            if (f7 >= 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            a7.c0(this, z10);
        }
        D();
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.G0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f20075c = window;
    }

    public final k2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                k2 k2Var = (k2) getFragmentStack().get(size);
                if (k2Var != null && !k2Var.isFinishing() && !k2Var.isRemovingFromStack() && hf0.class.isInstance(k2Var)) {
                    return k2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int v(boolean z10) {
        i3 i3Var;
        if (this.R0 && (i3Var = this.E) != null) {
            if (z10) {
                return (int) i3Var.G;
            }
            return i3Var.H;
        }
        return 0;
    }

    public final my w() {
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
            if (view.getParent() != this.f20119x) {
                org.telegram.messenger.i0.E2(view);
                this.f20119x.addView(view, w7.b6.c(-1.0f, -1));
                this.f20119x.setShouldHandleBottomInsets(this.G.getEdgeToEdgeSupportMode());
                this.f20119x.setDrawNavigationBar(this.G.drawEdgeNavigationBar());
            }
            this.G.onResume();
            this.G.onBecomeFullyVisible();
        }
        return this.G;
    }

    public final boolean x() {
        if (!this.h && !this.f20070a0) {
            return false;
        }
        return true;
    }

    public final boolean z() {
        return this.S0;
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
