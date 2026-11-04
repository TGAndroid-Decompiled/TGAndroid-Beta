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
import b8.be;
import b8.ke;
import b8.mf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.hp;
import org.telegram.messenger.zb;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ee0;
import org.telegram.ui.gx;
import org.telegram.ui.m60;
import org.telegram.ui.rm;
import org.telegram.ui.um;
import org.telegram.ui.xd0;
public class ActionBarLayout extends FrameLayout implements q4, qg.b {
    public static Drawable f27273w1;
    public static Drawable f27274x1;
    public static Paint f27275y1;
    public boolean A0;
    public boolean B0;
    public long C0;
    public boolean D0;
    public k E;
    public int E0;
    public b3 F;
    public Runnable F0;
    public ke G;
    public Runnable G0;
    public r H;
    public boolean H0;
    public d2 I;
    public View I0;
    public d2 J;
    public boolean J0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public s K0;
    public AnimatorSet L;
    public float L0;
    public final DecelerateInterpolator M;
    public long M0;
    public final OvershootInterpolator N;
    public String N0;
    public final AccelerateDecelerateInterpolator O;
    public int O0;
    public float P;
    public m60 P0;
    public boolean Q;
    public n4 Q0;
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
    public boolean f27276a;
    public boolean f27277a0;
    public int f27278a1;
    public boolean f27279b;
    public boolean f27280b0;
    public boolean f27281b1;
    public Window f27282c;
    public final ArrayList f27283c0;
    public final Path f27284c1;
    public Runnable d;
    public final ArrayList f27285d0;
    public final float[] f27286d1;
    public Runnable f27287e;
    public final gi.e5 f27288e0;
    public boolean f27289e1;
    public boolean f27290f;
    public t4 f27291f0;
    public final int[] f27292f1;
    public t4 f27293g0;
    public boolean f27294g1;
    public boolean h;
    public rm f27295h0;
    public int f27296h1;
    public final ArrayList f27297i0;
    public final org.telegram.ui.Components.u5 f27298i1;
    public ArrayList f27299j0;
    public boolean f27300j1;
    public final ArrayList f27301k0;
    public boolean k1;
    public int[] f27302l0;
    public boolean f27303l1;
    public int[] m0;
    public float m1;
    public boolean f27304n;
    public int[] f27305n0;
    public boolean f27306n1;
    public int[] f27307o0;
    public AnimatorSet f27308o1;
    public int f27309p0;
    public ArrayList f27310p1;
    public um f27311q0;
    public final o f27312q1;
    public ColorDrawable f27313r;
    public AnimatorSet f27314r0;
    public boolean f27315r1;
    public v f27316s;
    public final g2.g f27317s0;
    public int f27318s1;
    public float f27319t0;
    public r0.k1 f27320t1;
    public boolean f27321u0;
    public i0.b f27322u1;
    public j6 f27323v0;
    public i0.b f27324v1;
    public v f27325w;
    public boolean f27326w0;
    public v f27327x;
    public boolean f27328x0;
    public l3 f27329y;
    public int f27330y0;
    public boolean f27331z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.M = new DecelerateInterpolator(1.5f);
        this.N = new OvershootInterpolator(1.02f);
        this.O = new AccelerateDecelerateInterpolator();
        this.f27283c0 = new ArrayList();
        this.f27285d0 = new ArrayList();
        gi.e5 e5Var = new gi.e5();
        e5Var.f12662b = new SparseIntArray();
        e5Var.f12663c = new int[]{k6.f28086ob, k6.f28144rb, k6.f28163sb, k6.f28182tb, k6.Oc, k6.f28126qb};
        this.f27288e0 = e5Var;
        this.f27297i0 = new ArrayList();
        this.f27301k0 = new ArrayList();
        this.f27317s0 = new g2.g((int[]) null);
        this.X0 = new Rect();
        this.f27278a1 = -1;
        this.f27284c1 = new Path();
        this.f27286d1 = new float[8];
        this.f27292f1 = new int[2];
        this.f27298i1 = new org.telegram.ui.Components.u5(this, 280L, xq.h);
        this.f27310p1 = new ArrayList();
        this.f27312q1 = new o(this, 2);
        i0.b bVar = i0.b.f14494e;
        this.f27322u1 = bVar;
        this.f27324v1 = bVar;
        this.R0 = (Activity) context;
        this.S0 = z10;
        if (f27274x1 == null) {
            f27274x1 = getResources().getDrawable(2131231619);
            f27273w1 = getResources().getDrawable(2131231237).mutate();
            f27275y1 = new Paint();
        }
        l5.b bVar2 = new l5.b(this, 26);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(this, bVar2);
    }

    public static void G(ArrayList arrayList, View view) {
        if (view instanceof qg.b) {
            arrayList.addAll(((qg.b) view).E());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                G(arrayList, viewGroup.getChildAt(i3));
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
            d2 d2Var = (d2) t4.c.d(1, actionBarLayout.V0);
            d2Var.prepareFragmentToSlide(true, false);
            d2Var.onPause();
            d2Var.onFragmentDestroy();
            d2Var.setParentLayout(null);
            List list = actionBarLayout.V0;
            list.remove(list.size() - 1);
            actionBarLayout.L("onSlideAnimationEnd");
            v vVar = actionBarLayout.f27316s;
            vVar.setAlpha(1.0f);
            v vVar2 = actionBarLayout.f27325w;
            actionBarLayout.f27316s = vVar2;
            actionBarLayout.f27325w = vVar;
            actionBarLayout.bringChildToFront(vVar2);
            View view = actionBarLayout.f27327x;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.V0.size() > 0) {
                d2 d2Var2 = (d2) t4.c.d(1, actionBarLayout.V0);
                actionBarLayout.E = d2Var2.actionBar;
                d2Var2.onResume();
                d2Var2.onBecomeFullyVisible();
                d2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.V0.size() >= 2) {
            ((d2) t4.c.d(1, actionBarLayout.V0)).prepareFragmentToSlide(true, false);
            d2 d2Var3 = (d2) t4.c.d(2, actionBarLayout.V0);
            d2Var3.prepareFragmentToSlide(false, false);
            d2Var3.onPause();
            View view2 = d2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                d2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(d2Var3.fragmentView);
            }
            k kVar = d2Var3.actionBar;
            if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(d2Var3.actionBar);
            }
            d2Var3.detachSheets();
        }
        actionBarLayout.f27325w.setVisibility(4);
        actionBarLayout.R = false;
        actionBarLayout.U = false;
        actionBarLayout.f27316s.setTranslationX(0.0f);
        actionBarLayout.f27325w.setTranslationX(0.0f);
        actionBarLayout.f27316s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f10, float f11) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
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

    public static boolean z(int i3, int i10, int i11) {
        if (i3 != k6.f27936g5 && i3 != k6.Oc && i3 != k6.Fe) {
            if (i3 != k6.f28144rb && i3 != k6.f28163sb && i3 != k6.f28182tb && i3 != k6.Be && i3 != k6.Ce && i3 != k6.De && i3 != k6.Ee) {
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
        if (!this.f27277a0 && !this.U) {
            return false;
        }
        return true;
    }

    public final int C() {
        int i3;
        View rootView = getRootView();
        Rect rect = this.X0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        return Math.max(0, ((height - i3) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        if (this.k1 && this.f27303l1) {
            return true;
        }
        return false;
    }

    @Override
    public final List E() {
        d2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof qg.b) {
                arrayList.addAll(((qg.b) lastFragment).E());
            }
            G(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public final void F() {
        for (int i3 = 0; i3 < this.V0.size(); i3++) {
            if (((d2) this.V0.get(i3)).getFragmentView() != null) {
                try {
                    ((d2) this.V0.get(i3)).onThemeColorsChanged();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
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
        s sVar = this.K0;
        if (sVar != null) {
            org.telegram.messenger.g0.r(sVar);
            this.K0 = null;
        }
        setAlpha(1.0f);
        this.f27316s.setAlpha(1.0f);
        this.f27316s.setScaleX(1.0f);
        this.f27316s.setScaleY(1.0f);
        this.f27325w.setAlpha(1.0f);
        this.f27325w.setScaleX(1.0f);
        this.f27325w.setScaleY(1.0f);
    }

    public final void I() {
        y4 y4Var;
        k kVar;
        if (!this.f27280b0 && !this.R && !i() && !this.V0.isEmpty()) {
            l10 l10Var = l10.f35545e0;
            if (l10Var != null && l10Var.f35560x) {
                l10Var.e(false);
                return;
            }
            if (!i0() && (kVar = this.E) != null && !kVar.v()) {
                k kVar2 = this.E;
                if (kVar2.f27728o0) {
                    kVar2.l(true);
                    return;
                }
            }
            d2 d2Var = (d2) t4.c.d(1, this.V0);
            if (!i0() && (y4Var = d2Var.simpleActionBar) != null) {
                i5 i5Var = y4Var.R;
                if (i5Var != null) {
                    i5Var.a(true);
                    return;
                } else if (!y4Var.H && y4Var.G) {
                    y4Var.j(true);
                    return;
                }
            }
            r rVar = this.H;
            if ((rVar == null || rVar.onBackPressed(true)) && ((d2) t4.c.d(1, this.V0)).onBackPressed(true) && !this.V0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final boolean J(float r6, float r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.J(float, float):boolean");
    }

    public final void K() {
        if (this.f27277a0 && this.F0 != null) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                this.L = null;
                animatorSet.cancel();
            }
            this.f27277a0 = false;
            this.f27280b0 = false;
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
        ArrayList arrayList = zb.D().f26761f;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((org.telegram.ui.Components.t5) arrayList.get(i3)).f38287z0 = 0;
        }
        g(str);
    }

    public final void M() {
        for (d2 d2Var : this.V0) {
            d2Var.onLowMemory();
        }
    }

    public final void N() {
        Runnable runnable;
        if (this.f27277a0 && (runnable = this.G0) != null) {
            this.f27277a0 = false;
            this.f27280b0 = false;
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
            ((d2) t4.c.d(1, this.V0)).onPause();
        }
        r rVar = this.H;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void P() {
        if (!this.V0.isEmpty()) {
            ((d2) t4.c.d(1, this.V0)).onResume();
        }
        r rVar = this.H;
        if (rVar != null) {
            rVar.onResume();
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
        this.f27325w.setVisibility(0);
        this.W = false;
        d2 d2Var = (d2) t4.c.d(2, this.V0);
        View view = d2Var.fragmentView;
        if (view == null && (view = d2Var.performCreateView(this.R0)) != null && d2Var.isSupportEdgeToEdge() && d2Var.drawEdgeNavigationBar()) {
            n nVar = new n(d2Var);
            WeakHashMap weakHashMap = r0.i0.f54015a;
            r0.a0.i(view, nVar);
            this.f27325w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            d2Var.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.f27325w.addView(view);
        this.f27325w.setShouldHandleBottomInsets(d2Var.getEdgeToEdgeSupportMode());
        this.f27325w.setDrawNavigationBar(d2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        k kVar = d2Var.actionBar;
        if (kVar != null && kVar.L) {
            org.telegram.messenger.g0.E2(kVar);
            if (this.J0) {
                d2Var.actionBar.setOccupyStatusBar(false);
            }
            this.f27325w.addView(d2Var.actionBar);
        }
        d2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        d2Var.attachSheets(this.f27325w);
        if (!d2Var.hasOwnBackground && view.getBackground() == null) {
            r6.i(k6.f27878d6, view, null);
        }
        d2Var.onResume();
        if (this.f27314r0 != null) {
            this.f27299j0 = d2Var.getThemeDescriptions();
        }
        this.f27316s.setLayerType(2, null);
        ((d2) t4.c.d(1, this.V0)).prepareFragmentToSlide(true, true);
        d2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean S(d2 d2Var) {
        return U(new o4(d2Var));
    }

    public final boolean T(d2 d2Var, boolean z10) {
        o4 o4Var = new o4(d2Var);
        o4Var.f28396b = z10;
        return U(o4Var);
    }

    public final boolean U(org.telegram.ui.ActionBar.o4 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.U(org.telegram.ui.ActionBar.o4):boolean");
    }

    public final boolean V(d2 d2Var, boolean z10, boolean z11) {
        o4 o4Var = new o4(d2Var);
        o4Var.f28396b = z10;
        o4Var.f28397c = z11;
        o4Var.d = true;
        o4Var.f28398e = false;
        return U(o4Var);
    }

    public final void W(d2 d2Var, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (d2Var == null) {
            return;
        }
        d2Var.onBecomeFullyHidden();
        d2Var.onPause();
        if (z10) {
            d2Var.onFragmentDestroy();
            d2Var.setParentLayout(null);
            this.V0.remove(d2Var);
            L("presentFragmentInternalRemoveOld");
        } else {
            View view = d2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                d2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(d2Var.fragmentView);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    try {
                        viewGroup2.removeView(d2Var.fragmentView);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
            }
            k kVar = d2Var.actionBar;
            if (kVar != null && kVar.L && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(d2Var.actionBar);
            }
            d2Var.detachSheets();
        }
        this.f27325w.setVisibility(4);
    }

    public final void X(boolean z10, boolean z11) {
        if (!this.f27277a0 && !this.R) {
            int size = this.V0.size();
            if (!z10) {
                size--;
            }
            if (this.h) {
                size--;
            }
            for (int i3 = 0; i3 < size; i3++) {
                ((d2) this.V0.get(i3)).clearViews();
                ((d2) this.V0.get(i3)).setParentLayout(this);
            }
            n4 n4Var = this.Q0;
            if (n4Var != null) {
                n4Var.b(this, z10);
            }
            if (z11) {
                f0();
                return;
            }
            return;
        }
        this.f27331z0 = true;
        this.A0 = z10;
        this.B0 = z11;
    }

    public final void Y() {
        X(true, true);
    }

    public final void Z() {
        this.f27316s.removeAllViews();
        this.f27325w.removeAllViews();
        this.E = null;
        this.I = null;
        this.J = null;
    }

    public final void a0() {
        while (this.V0.size() > 0) {
            e0((d2) this.V0.get(0), false);
        }
        View view = this.I0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    @Override
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        r0.k1 k1Var = this.f27320t1;
        if (k1Var != null) {
            o(view, k1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.f27285d0.add(iArr);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = ((t6) arrayList.get(i3)).c();
            }
        }
    }

    public final void b0(int i3) {
        if (i3 >= 0 && i3 < getFragmentStack().size()) {
            d0((d2) getFragmentStack().get(i3), false);
        }
    }

    public final boolean c(int i3, d2 d2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        n4 n4Var = this.Q0;
        if ((n4Var != null && !n4Var.h(d2Var, this)) || !d2Var.onFragmentCreate() || this.V0.contains(d2Var)) {
            return false;
        }
        d2Var.setParentLayout(this);
        Activity activity = this.R0;
        if (i3 != -1 && i3 != -2) {
            if (i3 == -3) {
                View view = d2Var.fragmentView;
                if (view == null) {
                    view = d2Var.performCreateView(activity);
                    if (view != null && d2Var.isSupportEdgeToEdge() && d2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(d2Var);
                        WeakHashMap weakHashMap = r0.i0.f54015a;
                        r0.a0.i(view, nVar);
                        this.f27316s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        d2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!d2Var.hasOwnBackground && view.getBackground() == null) {
                    r6.i(k6.f27878d6, view, null);
                }
                v vVar = this.f27316s;
                vVar.addView(view, Utilities.j(0, vVar.getChildCount(), 0), mf.c(-1.0f, -1));
                this.f27316s.setShouldHandleBottomInsets(d2Var.getEdgeToEdgeSupportMode());
                this.f27316s.setDrawNavigationBar(d2Var.drawEdgeNavigationBar());
                k kVar = d2Var.actionBar;
                if (kVar != null && kVar.L) {
                    if (this.J0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) d2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(d2Var.actionBar);
                    }
                    this.f27316s.addView(d2Var.actionBar);
                }
                d2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                d2Var.attachSheets(this.f27316s);
                i3 = 0;
            }
            this.V0.add(i3, d2Var);
            L("addFragmentToStack");
        } else {
            if (!this.V0.isEmpty()) {
                d2 d2Var2 = (d2) t4.c.d(1, this.V0);
                d2Var2.onPause();
                k kVar2 = d2Var2.actionBar;
                if (kVar2 != null && kVar2.L && (viewGroup2 = (ViewGroup) kVar2.getParent()) != null) {
                    viewGroup2.removeView(d2Var2.actionBar);
                }
                View view2 = d2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    d2Var2.onRemoveFromParent();
                    viewGroup.removeView(d2Var2.fragmentView);
                }
                d2Var2.detachSheets();
            }
            this.V0.add(d2Var);
            if (i3 != -2) {
                View view3 = d2Var.fragmentView;
                if (view3 == null) {
                    view3 = d2Var.performCreateView(activity);
                    if (view3 != null && d2Var.isSupportEdgeToEdge() && d2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(d2Var);
                        WeakHashMap weakHashMap2 = r0.i0.f54015a;
                        r0.a0.i(view3, nVar2);
                        this.f27316s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        d2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!d2Var.hasOwnBackground && view3.getBackground() == null) {
                    r6.i(k6.f27878d6, view3, null);
                }
                this.f27316s.addView(view3, mf.c(-1.0f, -1));
                this.f27316s.setShouldHandleBottomInsets(d2Var.getEdgeToEdgeSupportMode());
                this.f27316s.setDrawNavigationBar(d2Var.drawEdgeNavigationBar());
                k kVar3 = d2Var.actionBar;
                if (kVar3 != null && kVar3.L) {
                    if (this.J0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) d2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(d2Var.actionBar);
                    }
                    this.f27316s.addView(d2Var.actionBar);
                }
                d2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                d2Var.attachSheets(this.f27316s);
                d2Var.onResume();
                d2Var.onTransitionAnimationEnd(false, true);
                d2Var.onTransitionAnimationEnd(true, true);
                d2Var.onBecomeFullyVisible();
            }
            L("addFragmentToStack " + i3);
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

    public final void c0(d2 d2Var) {
        d0(d2Var, false);
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f27297i0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.f27283c0.add(iArr);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                t6 t6Var = (t6) arrayList.get(i3);
                iArr[i3] = t6Var.c();
                s6 s6Var = t6Var.f28661g;
                t6Var.f28661g = null;
                if (s6Var != null) {
                    ArrayList arrayList2 = this.f27301k0;
                    if (!arrayList2.contains(s6Var)) {
                        arrayList2.add(s6Var);
                    }
                }
            }
        }
    }

    public final void d0(d2 d2Var, boolean z10) {
        boolean z11 = true;
        if ((this.V0.size() > 0 && t4.c.d(1, this.V0) == d2Var) || (this.V0.size() > 1 && t4.c.d(2, this.V0) == d2Var)) {
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
        if (!d2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) {
            z11 = false;
        }
        e0(d2Var, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.F != null && w(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.F.getMeasuredHeight() + this.f27322u1.d), getWidth(), getHeight(), this.F.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.f27281b1 = true;
        if (this.T0) {
            canvas2.save();
            float L = org.telegram.messenger.g0.L(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.f27284c1;
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
            n4 n4Var = this.Q0;
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

    public final void e(boolean z10) {
        d2 d2Var;
        int i3;
        Animator customSlideTransition;
        int i10;
        int i11;
        if (!this.V0.isEmpty()) {
            d2Var = (d2) t4.c.d(1, this.V0);
        } else {
            d2Var = null;
        }
        if (d2Var == null) {
            return;
        }
        float x10 = this.f27316s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = d2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x10 = Math.abs(this.f27316s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f27316s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 380;
            } else {
                i10 = 50;
            }
            int max = Math.max(measuredWidth, i10);
            if (!shouldOverrideSlideTransition) {
                v vVar = this.f27316s;
                int measuredWidth2 = vVar.getMeasuredWidth();
                if (this.k1) {
                    i11 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    i11 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vVar, property, measuredWidth2 + i11);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f27316s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(xq.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f27316s.getMeasuredWidth()) * x10);
            if (D()) {
                i3 = 320;
            } else {
                i3 = 120;
            }
            int max2 = Math.max(measuredWidth3, i3);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f27316s, property, 0.0f);
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(xq.h);
                }
            }
        }
        Animator customSlideTransition2 = d2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        d2 d2Var2 = (d2) t4.c.d(2, this.V0);
        if (d2Var2 != null && (customSlideTransition = d2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f27308o1 = animatorSet;
        animatorSet.start();
        this.U = true;
    }

    public final void e0(d2 d2Var, boolean z10) {
        if (!this.V0.contains(d2Var)) {
            return;
        }
        if (z10 && t4.c.d(1, this.V0) == d2Var) {
            d2Var.finishFragment();
        } else if (t4.c.d(1, this.V0) == d2Var && this.V0.size() > 1) {
            d2Var.finishFragment(false);
        } else {
            d2Var.onPause();
            d2Var.onFragmentDestroy();
            d2Var.setParentLayout(null);
            this.V0.remove(d2Var);
            L("removeFragmentFromStackInternal " + z10);
        }
    }

    public final void f(org.telegram.ui.ActionBar.p4 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.p4, java.lang.Runnable):void");
    }

    public final void f0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.V0.isEmpty()) {
            int size = this.V0.size() - 1;
            if (!this.V0.isEmpty()) {
                if (this.V0.isEmpty() || this.V0.size() - 1 != size || ((d2) this.V0.get(size)).fragmentView == null) {
                    for (int i3 = 0; i3 < size; i3++) {
                        d2 d2Var = (d2) this.V0.get(i3);
                        k kVar = d2Var.actionBar;
                        if (kVar != null && kVar.L && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                            viewGroup2.removeView(d2Var.actionBar);
                        }
                        View view = d2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            d2Var.onPause();
                            d2Var.onRemoveFromParent();
                            viewGroup.removeView(d2Var.fragmentView);
                        }
                    }
                    d2 d2Var2 = (d2) this.V0.get(size);
                    d2Var2.setParentLayout(this);
                    View view2 = d2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = d2Var2.performCreateView(this.R0);
                        if (view2 != null && d2Var2.isSupportEdgeToEdge() && d2Var2.drawEdgeNavigationBar()) {
                            n nVar = new n(d2Var2);
                            WeakHashMap weakHashMap = r0.i0.f54015a;
                            r0.a0.i(view2, nVar);
                            this.f27316s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            d2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f27316s.addView(view2, mf.c(-1.0f, -1));
                    this.f27316s.setShouldHandleBottomInsets(d2Var2.getEdgeToEdgeSupportMode());
                    this.f27316s.setDrawNavigationBar(d2Var2.drawEdgeNavigationBar());
                    k kVar2 = d2Var2.actionBar;
                    if (kVar2 != null && kVar2.L) {
                        if (this.J0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        org.telegram.messenger.g0.E2(d2Var2.actionBar);
                        this.f27316s.addView(d2Var2.actionBar);
                    }
                    d2Var2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                    d2Var2.attachSheets(this.f27316s);
                    d2Var2.onResume();
                    d2Var2.onBecomeFullyVisible();
                    this.E = d2Var2.actionBar;
                    if (!d2Var2.hasOwnBackground && view2.getBackground() == null) {
                        r6.i(k6.f27878d6, view2, null);
                    }
                }
            }
        }
    }

    public final void g(String str) {
        boolean z10 = org.telegram.messenger.r2.f25040a;
        ArrayList arrayList = this.f27310p1;
        StringBuilder h = t4.c.h(str, " ");
        h.append(this.V0.size());
        arrayList.add(0, h.toString());
        if (this.f27310p1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < 10; i3++) {
                arrayList2.add((String) this.f27310p1.get(i3));
            }
            this.f27310p1 = arrayList2;
        }
        o oVar = this.f27312q1;
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.i3(oVar, 500L);
    }

    public final void g0(um umVar) {
        int x02;
        try {
            int i3 = k6.f27916f5;
            this.f27302l0 = new int[i3];
            for (int i10 = 0; i10 < i3; i10++) {
                int[] iArr = this.f27302l0;
                if (umVar != null) {
                    x02 = umVar.h(i10);
                } else {
                    x02 = k6.x0(null, i10, false);
                }
                iArr[i10] = x02;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            this.f27302l0 = null;
        }
    }

    @Override
    public d2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (d2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public t2 getBottomSheet() {
        return null;
    }

    public b3 getBottomSheetTabs() {
        return this.F;
    }

    public float getCurrentPreviewFragmentAlpha() {
        v vVar;
        if (!this.h && !this.f27280b0 && !this.f27304n) {
            return 0.0f;
        }
        d2 d2Var = this.J;
        if (d2Var != null && d2Var.inPreviewMode) {
            vVar = this.f27325w;
        } else {
            vVar = this.f27316s;
        }
        return vVar.getAlpha();
    }

    public l3 getDrawerLayoutContainer() {
        return this.f27329y;
    }

    @Override
    public List<d2> getFragmentStack() {
        return this.V0;
    }

    public float getInnerTranslationX() {
        return this.P;
    }

    @Override
    public d2 getLastFragment() {
        if (this.V0.isEmpty()) {
            return null;
        }
        return (d2) t4.c.d(1, this.V0);
    }

    public d2 getLastFragmentIncludeMainTabs() {
        d2 lastFragment = getLastFragment();
        if (lastFragment instanceof ee0) {
            return ((ee0) lastFragment).c0();
        }
        return lastFragment;
    }

    @Override
    public t4 getMessageDrawableOutMediaStart() {
        return this.f27293g0;
    }

    @Override
    public t4 getMessageDrawableOutStart() {
        return this.f27291f0;
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
    public List<a9> getPulledDialogs() {
        return this.W0;
    }

    @Override
    public d2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                d2 d2Var = (d2) getFragmentStack().get(size);
                if (d2Var != null && d2Var.getContext() != null && !d2Var.isFinishing() && !d2Var.isRemovingFromStack()) {
                    return d2Var;
                }
            }
            return null;
        }
        return null;
    }

    public gx getSheetFragment() {
        return x();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.f27319t0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f27282c;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public final void h() {
        if (this.f27331z0) {
            X(this.A0, this.B0);
            this.f27331z0 = false;
        } else if (this.f27321u0) {
            p4 p4Var = new p4(this.f27323v0, this.f27330y0, this.f27328x0, true);
            boolean z10 = this.f27326w0;
            if (!z10) {
                p4Var.f28430g = z10;
                p4Var.f28429f = z10;
            }
            f(p4Var, null);
            this.f27323v0 = null;
            this.f27321u0 = false;
        }
    }

    public final void h0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.L0 = 0.0f;
            this.M0 = System.nanoTime() / 1000000;
        }
        s sVar = new s(this, z11, z12, z10);
        this.K0 = sVar;
        org.telegram.messenger.g0.h3(sVar);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        if (this.f27280b0) {
            return false;
        }
        if (this.f27277a0 && (this.C0 < System.currentTimeMillis() - 1500 || this.h)) {
            H(true);
        }
        return this.f27277a0;
    }

    public final boolean i0() {
        d2 d2Var;
        if (!this.V0.isEmpty()) {
            d2Var = (d2) t4.c.d(1, this.V0);
        } else {
            d2Var = null;
        }
        if (d2Var != null && d2Var.getLastStoryViewer() != null && d2Var.getLastStoryViewer().y()) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.f27309p0 = 0;
        this.f27311q0 = null;
        this.f27302l0 = null;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        d2 d2Var;
        boolean z13;
        boolean z14;
        d2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            n4 n4Var = this.Q0;
            if ((n4Var == null || n4Var.k(this)) && !i() && !this.V0.isEmpty()) {
                Activity activity = this.R0;
                if (activity.getCurrentFocus() != null) {
                    org.telegram.messenger.g0.v1(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.f27280b0 || (z10 && hp.e1().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d2 d2Var2 = (d2) t4.c.d(1, this.V0);
                AnimatorSet animatorSet = null;
                if (this.V0.size() > 1) {
                    d2Var = (d2) t4.c.d(2, this.V0);
                } else {
                    d2Var = null;
                }
                if (d2Var != null) {
                    if (k6.x0(null, k6.f28160s8, false) != -1 && (!d2Var.hasForceLightStatusBar() || k6.D0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    org.telegram.messenger.g0.p3(activity, z13);
                    v vVar = this.f27316s;
                    this.f27316s = this.f27325w;
                    this.f27325w = vVar;
                    d2Var.setParentLayout(this);
                    View view = d2Var.fragmentView;
                    if (view == null && (view = d2Var.performCreateView(activity)) != null && d2Var.isSupportEdgeToEdge() && d2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(d2Var);
                        WeakHashMap weakHashMap = r0.i0.f54015a;
                        r0.a0.i(view, nVar);
                        this.f27316s.invalidate();
                    }
                    if (!this.h) {
                        this.f27316s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            d2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        }
                        this.f27316s.addView(view);
                        this.f27316s.setShouldHandleBottomInsets(d2Var.getEdgeToEdgeSupportMode());
                        this.f27316s.setDrawNavigationBar(d2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        k kVar = d2Var.actionBar;
                        if (kVar != null && kVar.L) {
                            if (this.J0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            org.telegram.messenger.g0.E2(d2Var.actionBar);
                            this.f27316s.addView(d2Var.actionBar);
                        }
                        d2Var.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                        d2Var.attachSheets(this.f27316s);
                    }
                    this.I = d2Var;
                    this.J = d2Var2;
                    d2Var.onTransitionAnimationStart(true, true);
                    d2Var2.onTransitionAnimationStart(false, true);
                    d2Var.onResume();
                    if (this.f27314r0 != null) {
                        this.f27299j0 = d2Var.getThemeDescriptions();
                    }
                    this.E = d2Var.actionBar;
                    if (!d2Var.hasOwnBackground && view.getBackground() == null) {
                        r6.i(k6.f27878d6, view, null);
                    }
                    if (z12) {
                        this.C0 = System.currentTimeMillis();
                        this.f27277a0 = true;
                        d2Var2.setRemovingFromStack(true);
                        this.F0 = new lg.y(this, d2Var2, d2Var, 22);
                        if (!this.h && !this.f27280b0) {
                            animatorSet = d2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f27316s.f28702b || this.f27325w.f28702b)) {
                                mi.b0 b0Var = new mi.b0(this, 13);
                                this.d = b0Var;
                                org.telegram.messenger.g0.i3(b0Var, 200L);
                            } else {
                                if (!z15 && !this.f27280b0) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                h0(false, true, z14);
                            }
                        } else {
                            this.L = animatorSet;
                            ac acVar = ac.f31784w;
                            if (acVar != null && acVar.f31794l) {
                                acVar.b();
                            }
                        }
                        L("closeLastFragment");
                    } else {
                        m(d2Var2);
                        d2Var2.onTransitionAnimationEnd(false, true);
                        d2Var.onTransitionAnimationEnd(true, true);
                        d2Var.onBecomeFullyVisible();
                    }
                } else if (this.H0 && !z11) {
                    this.C0 = System.currentTimeMillis();
                    this.f27277a0 = true;
                    this.F0 = new org.telegram.messenger.voip.l0(5, this, d2Var2);
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
                    this.L.addListener(new q(this, 0));
                    this.L.start();
                } else {
                    e0(d2Var2, false);
                    setVisibility(8);
                    View view3 = this.I0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                d2Var2.onFragmentClosed();
            }
        }
    }

    public final void m(d2 d2Var) {
        d2Var.finishing = true;
        d2Var.onPause();
        d2Var.onFragmentDestroy();
        d2Var.setParentLayout(null);
        this.V0.remove(d2Var);
        this.f27325w.setVisibility(4);
        this.f27325w.setTranslationY(0.0f);
        bringChildToFront(this.f27316s);
        v vVar = this.f27327x;
        if (vVar != null) {
            bringChildToFront(vVar);
        }
        L("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((d2) t4.c.d(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void o(View view, r0.k1 k1Var) {
        boolean z10;
        int i3;
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
            if ((view instanceof v) && ((v) view).f28711y) {
                int i17 = k1Var.f54026a.f(8).d;
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
                r0.k1 k1Var2 = r0.k1.f54025b;
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
            r0.i0.b(view, r0.k1.f54025b);
            return;
        }
        boolean z12 = this.U0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.b bVar = this.f27322u1;
        i0.b bVar2 = this.f27324v1;
        if (view instanceof b3) {
            if (z12) {
                i14 = 0;
            } else {
                i14 = bVar.f14495a;
            }
            if (z10) {
                i15 = 0;
            } else {
                i15 = bVar.f14497c;
            }
            org.telegram.messenger.g0.B3(view, i14, 0, i15, bVar.d);
        } else if (view instanceof v) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            v vVar = (v) view;
            int w10 = w(false);
            if (w10 > 0) {
                i3 = bVar.d + w10;
            } else {
                i3 = 0;
            }
            m3 m3Var = vVar.f28710x;
            if (m3Var != m3.f28339c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i10 = bVar2.f14495a;
            } else {
                i10 = 0;
            }
            if (!z13 && !z10) {
                i11 = bVar2.f14497c;
            } else {
                i11 = 0;
            }
            if (z13 && !z12) {
                i12 = 0;
            } else {
                i12 = bVar2.f14495a;
            }
            if (z13 && !z10) {
                i13 = 0;
            } else {
                i13 = bVar2.f14497c;
            }
            if (m3Var == m3.f28337a) {
                i3 = Math.max(i3, bVar2.d);
                r0.i0.b(view, r0.k1.f54025b);
            } else {
                r0.i0.b(view, k1Var.f54026a.m(i12, 0, i13, i3));
            }
            view.setPadding(i10, 0, i11, i3);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27276a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.V0.isEmpty()) {
            int size = this.V0.size();
            for (int i3 = 0; i3 < size; i3++) {
                d2 d2Var = (d2) this.V0.get(i3);
                d2Var.onConfigurationChanged(configuration);
                Dialog dialog = d2Var.visibleDialog;
                if (dialog instanceof t2) {
                    ((t2) dialog).c0(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27276a = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.U && !i() && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        k kVar;
        x xVar;
        if (i3 == 82 && !i() && !this.R && (kVar = this.E) != null && !kVar.v() && (xVar = kVar.F) != null) {
            int childCount = xVar.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = xVar.getChildAt(i10);
                if (childAt instanceof q0) {
                    q0 q0Var = (q0) childAt;
                    if (q0Var.getVisibility() != 0) {
                        continue;
                    } else if (q0Var.s()) {
                        q0Var.U(null, null);
                        break;
                    } else if (q0Var.T) {
                        xVar.o(((Integer) q0Var.getTag()).intValue());
                        break;
                    }
                }
                i10++;
            }
        }
        return super.onKeyUp(i3, keyEvent);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        d2 d2Var;
        boolean z10 = true;
        if (!this.V0.isEmpty()) {
            d2Var = (d2) t4.c.d(1, this.V0);
        } else {
            d2Var = null;
        }
        if (d2Var != null && !d2Var.isSupportEdgeToEdge() && i0()) {
            int C = C();
            d2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) + C, 1073741824));
            return;
        }
        n4 n4Var = this.Q0;
        if (n4Var != null) {
            int[] iArr = this.f27292f1;
            iArr[0] = i3;
            iArr[1] = i10;
            n4Var.e(iArr);
            i3 = iArr[0];
            i10 = iArr[1];
        }
        if (C() <= org.telegram.messenger.g0.L(20.0f)) {
            z10 = false;
        }
        this.f27289e1 = z10;
        super.onMeasure(i3, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z10 = false;
        if (!i() && !this.D0 && !this.U && !this.k1) {
            if (this.V0.size() > 1 && ((rVar = this.H) == null || rVar.getLastSheet() == null || !this.H.getLastSheet().s())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((d2) t4.c.d(1, this.V0)).isSwipeBackEnabled(motionEvent)) {
                        this.Q = false;
                        this.R = false;
                        v vVar = this.f27316s;
                        if (vVar != null) {
                            vVar.setLayerType(0, null);
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
                    if (!this.f27277a0 && !this.h && this.Q && !this.R && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs) {
                        if (((d2) t4.c.d(1, this.V0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
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
                            ((d2) t4.c.d(1, this.V0)).onBeginSlide();
                            this.W = true;
                        }
                        if (D()) {
                            float f10 = max;
                            this.f27316s.setTranslationX((f10 / getWidth()) * org.telegram.messenger.g0.L(56.0f) * 5);
                            setInnerTranslationX((f10 / getWidth()) * org.telegram.messenger.g0.L(56.0f) * 5);
                        } else {
                            float f11 = max;
                            this.f27316s.setTranslationX(f11);
                            setInnerTranslationX(f11);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.E0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.V == null) {
                        this.V = VelocityTracker.obtain();
                    }
                    this.V.addMovement(motionEvent);
                    this.V.computeCurrentVelocity(1000);
                    d2 d2Var = (d2) t4.c.d(1, this.V0);
                    if (!this.h && !this.f27280b0 && !this.R && d2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.V.getXVelocity();
                        float yVelocity = this.V.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && d2Var.canBeginSlide()) {
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
                        float x10 = this.f27316s.getX();
                        float xVelocity2 = this.V.getXVelocity();
                        float yVelocity2 = this.V.getYVelocity();
                        if (!D() ? x10 < this.f27316s.getMeasuredWidth() / 3.0f : !(x10 >= org.telegram.messenger.g0.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.Q = false;
                        this.R = false;
                        v vVar2 = this.f27316s;
                        if (vVar2 != null) {
                            vVar2.setLayerType(0, null);
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
                    v vVar3 = this.f27316s;
                    if (vVar3 != null) {
                        vVar3.setLayerType(0, null);
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

    public final void p(Canvas canvas, int i3, int i10) {
        if (f27273w1 != null && az.D1) {
            int i11 = i3 / 2;
            if (f27273w1.getAlpha() != i11) {
                f27273w1.setAlpha(i11);
            }
            f27273w1.setBounds(0, i10, getMeasuredWidth(), f27273w1.getIntrinsicHeight() + i10);
            f27273w1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i3) {
        p(canvas, 255, i3);
    }

    public final void r() {
        boolean z10 = true;
        this.f27304n = true;
        this.h = false;
        d2 d2Var = (d2) t4.c.d(1, this.V0);
        d2Var.fragmentView.setOutlineProvider(null);
        d2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        d2Var.fragmentView.setLayoutParams(layoutParams);
        W((d2) t4.c.d(2, this.V0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(d2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(d2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new xq(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new bh.j(14, this, d2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f27316s.setShouldHandleBottomInsets(d2Var.getEdgeToEdgeSupportMode());
        this.f27316s.setDrawNavigationBar(d2Var.drawEdgeNavigationBar());
        d2Var.setInPreviewMode(false);
        d2Var.setInMenuMode(false);
        try {
            Activity activity = this.R0;
            if (k6.x0(null, k6.f28160s8, false) != -1 && (!d2Var.hasForceLightStatusBar() || k6.D0().q())) {
                z10 = false;
            }
            org.telegram.messenger.g0.p3(activity, z10);
        } catch (Exception unused2) {
        }
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final boolean s(Menu menu) {
        if (!this.V0.isEmpty() && ((d2) t4.c.d(1, this.V0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.I0 = view;
    }

    @Override
    public void setDelegate(n4 n4Var) {
        this.Q0 = n4Var;
    }

    @Override
    public void setDrawerLayoutContainer(l3 l3Var) {
        this.f27329y = l3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i3) {
        v vVar = this.f27316s;
        if (vVar != null) {
            vVar.setFragmentPanTranslationOffset(i3);
        }
    }

    @Override
    public void setFragmentStack(List<d2> list) {
        this.V0 = list;
        b3 b3Var = this.F;
        if (b3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            b3Var.J.remove(oVar);
            b3Var.K.remove(oVar2);
            org.telegram.messenger.g0.E2(this.F);
            this.F = null;
        }
        boolean z10 = this.S0;
        Activity activity = this.R0;
        if (z10) {
            b3 b3Var2 = new b3(activity, this);
            this.F = b3Var2;
            this.G = new ke(b3Var2);
            b3 b3Var3 = this.F;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            b3Var3.J.add(oVar3);
            b3Var3.K.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.F, layoutParams);
            j3 j3Var = LaunchActivity.K1.f41330z0;
            if (j3Var != null) {
                j3Var.setTabsView(this.F);
            }
        }
        v vVar = this.f27325w;
        if (vVar != null) {
            org.telegram.messenger.g0.E2(vVar);
        }
        v vVar2 = new v(activity, this);
        this.f27325w = vVar2;
        addView(vVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f27325w.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.f27325w.setLayoutParams(layoutParams2);
        v vVar3 = this.f27316s;
        if (vVar3 != null) {
            org.telegram.messenger.g0.E2(vVar3);
        }
        v vVar4 = new v(activity, this);
        this.f27316s = vVar4;
        addView(vVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f27316s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f27316s.setLayoutParams(layoutParams3);
        v vVar5 = this.f27327x;
        if (vVar5 != null) {
            org.telegram.messenger.g0.E2(vVar5);
        }
        v vVar6 = new v(activity, this);
        this.f27327x = vVar6;
        this.f27298i1.f38643a = vVar6;
        addView(vVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f27327x.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f27327x.setLayoutParams(layoutParams4);
        r rVar = this.H;
        if (rVar != null) {
            rVar.setParentLayout(this);
            r rVar2 = this.H;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f27327x) {
                org.telegram.messenger.g0.E2(view);
                this.f27327x.addView(view, mf.c(-1.0f, -1));
                this.f27327x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        for (d2 d2Var : this.V0) {
            d2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Z0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f27290f = z10;
    }

    public void setInnerTranslationX(float f10) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.P = f10;
        invalidate();
        if (this.V0.size() >= 2 && this.f27316s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.l(f10 / (org.telegram.messenger.g0.L(56.0f) * 6));
            } else {
                measuredWidth = f10 / this.f27316s.getMeasuredWidth();
            }
            d2 d2Var = (d2) t4.c.d(2, this.V0);
            d2Var.onSlideProgress(false, measuredWidth);
            d2 d2Var2 = (d2) t4.c.d(1, this.V0);
            float a10 = be.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (d2Var2.isBeginToShow() && (navigationBarColor = d2Var2.getNavigationBarColor()) != (navigationBarColor2 = d2Var.getNavigationBarColor())) {
                d2Var2.setNavigationBarColor(i0.a.f(a10, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f27279b = z10;
    }

    @Override
    public void setNavigationBarColor(int i3) {
        boolean z10;
        if (this.f27318s1 != i3) {
            this.f27318s1 = i3;
            invalidate();
        }
        l3 l3Var = this.f27329y;
        if (l3Var != null) {
            l3Var.setInternalNavigationBarColor(i3);
        }
        b3 b3Var = this.F;
        if (b3Var != null) {
            if (!this.R && !this.U) {
                z10 = true;
            } else {
                z10 = false;
            }
            b3Var.i(i3, z10);
        }
    }

    public void setOverrideWidthOffset(int i3) {
        this.f27278a1 = i3;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<a9> list) {
        this.W0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.J0 = z10;
    }

    public void setThemeAnimationValue(float f10) {
        boolean z10;
        int alpha;
        this.f27319t0 = f10;
        for (int i3 = 0; i3 < this.f27309p0; i3++) {
            int f11 = i0.a.f(f10, this.f27305n0[i3], this.f27307o0[i3]);
            um umVar = this.f27311q0;
            if (umVar != null) {
                umVar.i(this.m0[i3], f11);
            } else {
                int i10 = this.m0[i3];
                SparseIntArray sparseIntArray = k6.jm;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i10, f11);
                }
            }
        }
        ArrayList arrayList = this.f27297i0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i11);
            int[] iArr = (int[]) this.f27283c0.get(i11);
            int[] iArr2 = (int[]) this.f27285d0.get(i11);
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
                int i15 = t6Var.f28659e;
                e6 e6Var = t6Var.f28667n;
                if (e6Var != null) {
                    e6Var.i(i15, argb);
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
        ArrayList arrayList4 = this.f27301k0;
        int size3 = arrayList4.size();
        for (int i16 = 0; i16 < size3; i16++) {
            s6 s6Var = (s6) arrayList4.get(i16);
            if (s6Var != null) {
                s6Var.b();
                s6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.f27299j0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i17 = 0; i17 < size4; i17++) {
                t6 t6Var2 = (t6) this.f27299j0.get(i17);
                t6Var2.e(k6.w0(t6Var2.f28659e, t6Var2.f28667n), false, false);
            }
        }
        rm rmVar = this.f27295h0;
        if (rmVar != null) {
            um umVar2 = rmVar.f49244a;
            umVar2.G.A0.invalidate();
            umVar2.f50137t.K = f10;
            umVar2.f50138u.K = f10;
            umVar2.u(f10);
        }
        n4 n4Var = this.Q0;
        if (n4Var != null) {
            n4Var.a(f10);
        }
        q6 q6Var = r6.f28514a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f10 < 1.0f && currentAnimationTimeMillis == r6.f28516c && f10 == r6.d) {
            if (getWindowToken() == null) {
                r6.d0(this, false);
            }
        } else {
            r6.f28516c = currentAnimationTimeMillis;
            r6.d = f10;
            if (f10 >= 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            r6.c0(this, z10);
        }
        F();
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.H0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f27282c = window;
    }

    public final d2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                d2 d2Var = (d2) getFragmentStack().get(size);
                if (d2Var != null && !d2Var.isFinishing() && !d2Var.isRemovingFromStack() && xd0.class.isInstance(d2Var)) {
                    return d2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final void v() {
        if (this.h || this.f27280b0) {
            if (this.f27277a0 && this.F0 != null) {
                return;
            }
            Runnable runnable = this.f27287e;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.f27287e = null;
            }
            l(true, false);
        }
    }

    public final int w(boolean z10) {
        b3 b3Var;
        if (this.S0 && (b3Var = this.F) != null) {
            if (z10) {
                return (int) b3Var.H;
            }
            return b3Var.I;
        }
        return 0;
    }

    public final gx x() {
        Activity activity = this.R0;
        if (activity == null) {
            return null;
        }
        if (this.H == null) {
            r rVar = new r(this);
            this.H = rVar;
            rVar.setParentLayout(this);
            r rVar2 = this.H;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f27327x) {
                org.telegram.messenger.g0.E2(view);
                this.f27327x.addView(view, mf.c(-1.0f, -1));
                this.f27327x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
                this.f27327x.setDrawNavigationBar(this.H.drawEdgeNavigationBar());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        return this.H;
    }

    public final boolean y() {
        if (!this.h && !this.f27280b0) {
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
