package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
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
import android.os.SystemClock;
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
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
public class ActionBarLayout extends FrameLayout implements wk5, el4 {
    public static Drawable w1;
    public static Drawable x1;
    public static Paint y1;
    public boolean A0;
    public boolean B0;
    public long C0;
    public boolean D0;
    public a E;
    public int E0;
    public yx0 F;
    public Runnable F0;
    public am2 G;
    public Runnable G0;
    public l6 H;
    public boolean H0;
    public e I;
    public View I0;
    public e J;
    public boolean J0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public m6 K0;
    public AnimatorSet L;
    public float L0;
    public final DecelerateInterpolator M;
    public long M0;
    public final OvershootInterpolator N;
    public String N0;
    public final AccelerateDecelerateInterpolator O;
    public int O0;
    public float P;
    public sz5 P0;
    public boolean Q;
    public sk5 Q0;
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
    public boolean a;
    public boolean a0;
    public int a1;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public Window c;
    public final ArrayList c0;
    public final Path c1;
    public Runnable d;
    public final ArrayList d0;
    public final float[] d1;
    public Runnable e;
    public final uk5 e0;
    public boolean e1;
    public boolean f;
    public t37 f0;
    public final int[] f1;
    public t37 g0;
    public boolean g1;
    public boolean h;
    public uu1 h0;
    public int h1;
    public final ArrayList i0;
    public final mm i1;
    public ArrayList j0;
    public boolean j1;
    public final ArrayList k0;
    public boolean k1;
    public int[] l0;
    public boolean l1;
    public int[] m0;
    public float m1;
    public boolean n;
    public int[] n0;
    public boolean n1;
    public int[] o0;
    public AnimatorSet o1;
    public int p0;
    public ArrayList p1;
    public xu1 q0;
    public final j6 q1;
    public ColorDrawable r;
    public AnimatorSet r0;
    public boolean r1;
    public b s;
    public final pn s0;
    public int s1;
    public float t0;
    public l2d t1;
    public boolean u0;
    public mq5 u1;
    public znb v0;
    public mq5 v1;
    public b w;
    public boolean w0;
    public b x;
    public boolean x0;
    public dr3 y;
    public int y0;
    public boolean z0;

    public ActionBarLayout(Context context, boolean z) {
        super(context);
        this.M = new DecelerateInterpolator(1.5f);
        this.N = new OvershootInterpolator(1.02f);
        this.O = new AccelerateDecelerateInterpolator();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        uk5 uk5Var = new uk5();
        uk5Var.b = new SparseIntArray();
        uk5Var.c = new int[]{aob.rb, aob.ub, aob.vb, aob.wb, aob.Rc, aob.tb};
        this.e0 = uk5Var;
        this.i0 = new ArrayList();
        this.k0 = new ArrayList();
        this.s0 = new pn(null);
        this.X0 = new Rect();
        this.a1 = -1;
        this.c1 = new Path();
        this.d1 = new float[8];
        this.f1 = new int[2];
        this.i1 = new mm(280L, this, k43.h);
        this.p1 = new ArrayList();
        this.q1 = new j6(this, (byte) 3);
        mq5 mq5Var = mq5.e;
        this.u1 = mq5Var;
        this.v1 = mq5Var;
        this.R0 = (Activity) context;
        this.S0 = z;
        if (x1 == null) {
            x1 = getResources().getDrawable(2131231623);
            w1 = getResources().getDrawable(2131231240).mutate();
            y1 = new Paint();
        }
        m0 m0Var = new m0(this, (byte) 1);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(this, m0Var);
    }

    public static void E(ArrayList arrayList, View view) {
        if (view instanceof el4) {
            arrayList.addAll(((el4) view).D());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                E(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    public static View s(ViewGroup viewGroup, float f, float f2) {
        View s;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                Rect rect = hl.Q;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f, (int) f2)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (s = s((ViewGroup) childAt, f - rect.left, f2 - rect.top)) != null) {
                        return s;
                    }
                }
            }
        }
        return null;
    }

    public static boolean x(int i, int i2, int i3) {
        if (i != aob.g5 && i != aob.Rc && i != aob.Ie) {
            if (i != aob.ub && i != aob.vb && i != aob.wb && i != aob.Ee && i != aob.Fe && i != aob.Ge && i != aob.He) {
                return true;
            }
            if (i2 != 0 && i3 != 0) {
                return true;
            }
        }
        return false;
    }

    public final int A() {
        int i;
        View rootView = getRootView();
        Rect rect = this.X0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i = hl.m;
        } else {
            i = 0;
        }
        return Math.max(0, ((height - i) - hl.o1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean B() {
        if (this.k1 && this.l1) {
            return true;
        }
        return false;
    }

    public final void C() {
        for (int i = 0; i < this.V0.size(); i++) {
            if (((e) this.V0.get(i)).getFragmentView() != null) {
                try {
                    ((e) this.V0.get(i)).onThemeColorsChanged();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    @Override
    public final List D() {
        e lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof el4) {
                arrayList.addAll(((el4) lastFragment).D());
            }
            E(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public final void F(boolean z) {
        I();
        L();
        Runnable runnable = this.d;
        if (runnable != null) {
            hl.r(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            if (z) {
                animatorSet.cancel();
            }
            this.L = null;
        }
        m6 m6Var = this.K0;
        if (m6Var != null) {
            hl.r(m6Var);
            this.K0 = null;
        }
        setAlpha(1.0f);
        this.s.setAlpha(1.0f);
        this.s.setScaleX(1.0f);
        this.s.setScaleY(1.0f);
        this.w.setAlpha(1.0f);
        this.w.setScaleX(1.0f);
        this.w.setScaleY(1.0f);
    }

    public final void G() {
        jla jlaVar;
        a aVar;
        if (!this.b0 && !this.R && !h() && !this.V0.isEmpty()) {
            ra5 ra5Var = ra5.f0;
            if (ra5Var != null && ra5Var.y) {
                ra5Var.f(false);
                return;
            }
            if (!h0() && (aVar = this.E) != null && !aVar.z()) {
                a aVar2 = this.E;
                if (aVar2.o0) {
                    aVar2.o(true);
                    return;
                }
            }
            e eVar = (e) bp1.m(1, this.V0);
            if (h0() || (jlaVar = eVar.simpleActionBar) == null || !jlaVar.E()) {
                l6 l6Var = this.H;
                if ((l6Var == null || l6Var.onBackPressed(true)) && ((e) bp1.m(1, this.V0)).onBackPressed(true) && !this.V0.isEmpty()) {
                    j(true, false);
                }
            }
        }
    }

    public final boolean H(float r6, float r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.H(float, float):boolean");
    }

    public final void I() {
        if (this.a0 && this.F0 != null) {
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                this.L = null;
                animatorSet.cancel();
            }
            this.a0 = false;
            this.b0 = false;
            this.C0 = 0L;
            this.I = null;
            this.J = null;
            Runnable runnable = this.F0;
            this.F0 = null;
            if (runnable != null) {
                runnable.run();
            }
            g();
            g();
        }
    }

    public final void J(String str) {
        Runnable runnable = this.Z0;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList arrayList = in5.z().f;
        for (int i = 0; i < arrayList.size(); i++) {
            ((lm) arrayList.get(i)).z0 = 0;
        }
        f(str);
    }

    public final void K() {
        for (e eVar : this.V0) {
            eVar.onLowMemory();
        }
    }

    public final void L() {
        Runnable runnable;
        if (this.a0 && (runnable = this.G0) != null) {
            this.a0 = false;
            this.b0 = false;
            this.C0 = 0L;
            this.I = null;
            this.J = null;
            this.G0 = null;
            runnable.run();
            g();
        }
    }

    public final void M() {
        if (!this.V0.isEmpty()) {
            ((e) bp1.m(1, this.V0)).onPause();
        }
        l6 l6Var = this.H;
        if (l6Var != null) {
            l6Var.onPause();
        }
    }

    public final void N() {
        if (!this.V0.isEmpty()) {
            ((e) bp1.m(1, this.V0)).onResume();
        }
        l6 l6Var = this.H;
        if (l6Var != null) {
            l6Var.onResume();
        }
    }

    public final void O(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        List list = this.V0;
        if (!z) {
            if (list.size() < 2) {
                f("onSlideAnimationEnd exit");
                return;
            }
            e eVar = (e) bp1.m(1, this.V0);
            eVar.prepareFragmentToSlide(true, false);
            eVar.onPause();
            eVar.onFragmentDestroy();
            eVar.setParentLayout(null);
            List list2 = this.V0;
            list2.remove(list2.size() - 1);
            J("onSlideAnimationEnd");
            b bVar = this.s;
            bVar.setAlpha(1.0f);
            b bVar2 = this.w;
            this.s = bVar2;
            this.w = bVar;
            bringChildToFront(bVar2);
            View view = this.x;
            if (view != null) {
                bringChildToFront(view);
            }
            if (this.V0.size() > 0) {
                e eVar2 = (e) bp1.m(1, this.V0);
                this.E = eVar2.actionBar;
                eVar2.onResume();
                eVar2.onBecomeFullyVisible();
                eVar2.prepareFragmentToSlide(false, false);
            }
        } else if (list.size() >= 2) {
            ((e) bp1.m(1, this.V0)).prepareFragmentToSlide(true, false);
            e eVar3 = (e) bp1.m(2, this.V0);
            eVar3.prepareFragmentToSlide(false, false);
            eVar3.onPause();
            View view2 = eVar3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                eVar3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(eVar3.fragmentView);
            }
            a aVar = eVar3.actionBar;
            if (aVar != null && aVar.L && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
                viewGroup.removeViewInLayout(eVar3.actionBar);
            }
            eVar3.detachSheets();
        }
        this.w.setVisibility(4);
        this.R = false;
        this.U = false;
        this.s.setTranslationX(0.0f);
        this.w.setTranslationX(0.0f);
        this.s.setLayerType(0, null);
        setInnerTranslationX(0.0f);
    }

    public final void P(Canvas canvas, ViewGroup viewGroup) {
        if (this.F != null && getHeight() < viewGroup.getHeight()) {
            canvas.save();
            canvas.translate(this.F.getX() + getX(), this.F.getY() + getY());
            this.F.draw(canvas);
            canvas.restore();
        }
    }

    public final void Q() {
        this.Q = false;
        this.R = true;
        this.w.setVisibility(0);
        this.W = false;
        e eVar = (e) bp1.m(2, this.V0);
        View view = eVar.fragmentView;
        if (view == null && (view = eVar.performCreateView(this.R0)) != null && eVar.isSupportEdgeToEdge() && eVar.drawEdgeNavigationBar()) {
            i6 i6Var = new i6(eVar, (byte) 0);
            WeakHashMap weakHashMap = ihc.a;
            ahc.i(view, i6Var);
            this.w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            eVar.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.w.addView(view);
        this.w.setShouldHandleBottomInsets(eVar.getEdgeToEdgeSupportMode());
        this.w.setDrawNavigationBar(eVar.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        a aVar = eVar.actionBar;
        if (aVar != null && aVar.L) {
            hl.B2(aVar);
            if (this.J0) {
                eVar.actionBar.setOccupyStatusBar(false);
            }
            this.w.addView(eVar.actionBar);
        }
        eVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        eVar.attachSheets(this.w);
        if (!eVar.hasOwnBackground && view.getBackground() == null) {
            yob.h(aob.d6, null, view);
        }
        eVar.onResume();
        if (this.r0 != null) {
            this.j0 = eVar.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((e) bp1.m(1, this.V0)).prepareFragmentToSlide(true, true);
        eVar.prepareFragmentToSlide(false, true);
    }

    public final boolean R(defpackage.tk5 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.R(tk5):boolean");
    }

    public final boolean S(e eVar) {
        return R(new tk5(eVar));
    }

    public final boolean T(e eVar, boolean z) {
        tk5 tk5Var = new tk5(eVar);
        tk5Var.b = z;
        return R(tk5Var);
    }

    public final boolean U(e eVar, boolean z, boolean z2) {
        tk5 tk5Var = new tk5(eVar);
        tk5Var.b = z;
        tk5Var.c = z2;
        tk5Var.d = true;
        tk5Var.e = false;
        return R(tk5Var);
    }

    public final void V(e eVar, boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (eVar == null) {
            return;
        }
        eVar.onBecomeFullyHidden();
        eVar.onPause();
        if (z) {
            eVar.onFragmentDestroy();
            eVar.setParentLayout(null);
            this.V0.remove(eVar);
            J("presentFragmentInternalRemoveOld");
        } else {
            View view = eVar.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                eVar.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(eVar.fragmentView);
                } catch (Exception e) {
                    cc4.g(e, true);
                    try {
                        viewGroup2.removeView(eVar.fragmentView);
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                }
            }
            a aVar = eVar.actionBar;
            if (aVar != null && aVar.L && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
                viewGroup.removeViewInLayout(eVar.actionBar);
            }
            eVar.detachSheets();
        }
        this.w.setVisibility(4);
    }

    public final void W(boolean z, boolean z2) {
        if (!this.a0 && !this.R) {
            int size = this.V0.size();
            if (!z) {
                size--;
            }
            if (this.h) {
                size--;
            }
            for (int i = 0; i < size; i++) {
                ((e) this.V0.get(i)).clearViews();
                ((e) this.V0.get(i)).setParentLayout(this);
            }
            sk5 sk5Var = this.Q0;
            if (sk5Var != null) {
                sk5Var.b(this, z);
            }
            if (z2) {
                e0();
                return;
            }
            return;
        }
        this.z0 = true;
        this.A0 = z;
        this.B0 = z2;
    }

    public final void X() {
        W(true, true);
    }

    public final void Y() {
        this.s.removeAllViews();
        this.w.removeAllViews();
        this.E = null;
        this.I = null;
        this.J = null;
    }

    public final void Z() {
        while (this.V0.size() > 0) {
            d0((e) this.V0.get(0), false);
        }
        View view = this.I0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new j6(this, (byte) 0)).start();
        }
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.d0.add(iArr);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                iArr[i] = ((apb) arrayList.get(i)).c();
            }
        }
    }

    public final void a0(int i) {
        if (i >= 0 && i < getFragmentStack().size()) {
            c0((e) getFragmentStack().get(i), false);
        }
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        l2d l2dVar = this.t1;
        if (l2dVar != null) {
            m(view, l2dVar);
        }
    }

    public final boolean b(int i, e eVar) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        sk5 sk5Var = this.Q0;
        if ((sk5Var != null && !sk5Var.h(eVar, this)) || !eVar.onFragmentCreate() || this.V0.contains(eVar)) {
            return false;
        }
        eVar.setParentLayout(this);
        Activity activity = this.R0;
        if (i != -1 && i != -2) {
            if (i == -3) {
                View view = eVar.fragmentView;
                if (view == null) {
                    view = eVar.performCreateView(activity);
                    if (view != null && eVar.isSupportEdgeToEdge() && eVar.drawEdgeNavigationBar()) {
                        i6 i6Var = new i6(eVar, (byte) 1);
                        WeakHashMap weakHashMap = ihc.a;
                        ahc.i(view, i6Var);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        eVar.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!eVar.hasOwnBackground && view.getBackground() == null) {
                    yob.h(aob.d6, null, view);
                }
                b bVar = this.s;
                bVar.addView(view, Utilities.j(0, bVar.getChildCount(), 0), tre.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(eVar.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(eVar.drawEdgeNavigationBar());
                a aVar = eVar.actionBar;
                if (aVar != null && aVar.L) {
                    if (this.J0) {
                        aVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) eVar.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(eVar.actionBar);
                    }
                    this.s.addView(eVar.actionBar);
                }
                eVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                eVar.attachSheets(this.s);
                i = 0;
            }
            this.V0.add(i, eVar);
            J("addFragmentToStack");
        } else {
            if (!this.V0.isEmpty()) {
                e eVar2 = (e) bp1.m(1, this.V0);
                eVar2.onPause();
                a aVar2 = eVar2.actionBar;
                if (aVar2 != null && aVar2.L && (viewGroup2 = (ViewGroup) aVar2.getParent()) != null) {
                    viewGroup2.removeView(eVar2.actionBar);
                }
                View view2 = eVar2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    eVar2.onRemoveFromParent();
                    viewGroup.removeView(eVar2.fragmentView);
                }
                eVar2.detachSheets();
            }
            this.V0.add(eVar);
            if (i != -2) {
                View view3 = eVar.fragmentView;
                if (view3 == null) {
                    view3 = eVar.performCreateView(activity);
                    if (view3 != null && eVar.isSupportEdgeToEdge() && eVar.drawEdgeNavigationBar()) {
                        i6 i6Var2 = new i6(eVar, (byte) 1);
                        WeakHashMap weakHashMap2 = ihc.a;
                        ahc.i(view3, i6Var2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        eVar.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!eVar.hasOwnBackground && view3.getBackground() == null) {
                    yob.h(aob.d6, null, view3);
                }
                this.s.addView(view3, tre.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(eVar.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(eVar.drawEdgeNavigationBar());
                a aVar3 = eVar.actionBar;
                if (aVar3 != null && aVar3.L) {
                    if (this.J0) {
                        aVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) eVar.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(eVar.actionBar);
                    }
                    this.s.addView(eVar.actionBar);
                }
                eVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                eVar.attachSheets(this.s);
                eVar.onResume();
                eVar.onTransitionAnimationEnd(false, true);
                eVar.onTransitionAnimationEnd(true, true);
                eVar.onBecomeFullyVisible();
            }
            J("addFragmentToStack " + i);
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

    public final void b0(e eVar) {
        c0(eVar, false);
    }

    public final void c(ArrayList arrayList) {
        if (arrayList != null) {
            this.i0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.c0.add(iArr);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                apb apbVar = (apb) arrayList.get(i);
                iArr[i] = apbVar.c();
                zob zobVar = apbVar.g;
                apbVar.g = null;
                if (zobVar != null) {
                    ArrayList arrayList2 = this.k0;
                    if (!arrayList2.contains(zobVar)) {
                        arrayList2.add(zobVar);
                    }
                }
            }
        }
    }

    public final void c0(e eVar, boolean z) {
        boolean z2 = true;
        if ((this.V0.size() > 0 && bp1.m(1, this.V0) == eVar) || (this.V0.size() > 1 && bp1.m(2, this.V0) == eVar)) {
            L();
            I();
        }
        f("removeFragmentFromStack " + z);
        if (this.H0 && this.V0.size() == 1 && hl.O1()) {
            j(true, false);
            return;
        }
        if (this.Q0 != null && this.V0.size() == 1 && hl.O1()) {
            this.Q0.k(this);
        }
        if (!eVar.allowFinishFragmentInsteadOfRemoveFromStack() || z) {
            z2 = false;
        }
        d0(eVar, z2);
    }

    public final void d(boolean z) {
        e eVar;
        int i;
        Animator customSlideTransition;
        int i2;
        int i3;
        if (!this.V0.isEmpty()) {
            eVar = (e) bp1.m(1, this.V0);
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return;
        }
        float x = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = eVar.shouldOverrideSlideTransition(false, z);
        b bVar = this.s;
        Property property = View.TRANSLATION_X;
        if (!z) {
            x = Math.abs(bVar.getMeasuredWidth() - x);
            int measuredWidth = (int) ((200.0f / this.s.getMeasuredWidth()) * x);
            if (B()) {
                i2 = 380;
            } else {
                i2 = 50;
            }
            int max = Math.max(measuredWidth, i2);
            if (!shouldOverrideSlideTransition) {
                b bVar2 = this.s;
                int measuredWidth2 = bVar2.getMeasuredWidth();
                if (this.k1) {
                    i3 = hl.L(56.0f);
                } else {
                    i3 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar2, property, measuredWidth2 + i3);
                long j = max;
                animatorSet.playTogether(ofFloat.setDuration(j), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j));
                if (B()) {
                    animatorSet.setInterpolator(k43.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / bVar.getMeasuredWidth()) * x);
            if (B()) {
                i = 320;
            } else {
                i = 120;
            }
            int max2 = Math.max(measuredWidth3, i);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, property, 0.0f);
                long j2 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j2), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j2));
                if (B()) {
                    animatorSet.setInterpolator(k43.h);
                }
            }
        }
        Animator customSlideTransition2 = eVar.getCustomSlideTransition(false, z, x);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        e eVar2 = (e) bp1.m(2, this.V0);
        if (eVar2 != null && (customSlideTransition = eVar2.getCustomSlideTransition(false, z, x)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new y5(this, z));
        this.o1 = animatorSet;
        animatorSet.start();
        this.U = true;
    }

    public final void d0(e eVar, boolean z) {
        if (!this.V0.contains(eVar)) {
            return;
        }
        if (z && bp1.m(1, this.V0) == eVar) {
            eVar.finishFragment();
        } else if (bp1.m(1, this.V0) == eVar && this.V0.size() > 1) {
            eVar.finishFragment(false);
        } else {
            eVar.onPause();
            eVar.onFragmentDestroy();
            eVar.setParentLayout(null);
            this.V0.remove(eVar);
            J("removeFragmentFromStackInternal " + z);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.F != null && u(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.F.getMeasuredHeight() + this.u1.d), getWidth(), getHeight(), this.F.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.b1 = true;
        if (this.T0) {
            canvas2.save();
            float L = hl.L(24.0f);
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.c1;
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
            sk5 sk5Var = this.Q0;
            if ((sk5Var != null && sk5Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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

    public final void e(vk5 vk5Var, Runnable runnable) {
        int size;
        boolean z;
        znb znbVar;
        if (!this.a0 && !this.R) {
            AnimatorSet animatorSet = this.r0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.r0 = null;
            }
            if (vk5Var.e) {
                size = 1;
            } else {
                size = this.V0.size();
            }
            gp6 gp6Var = new gp6(this, size, vk5Var, runnable, (byte) 2);
            if (size >= 1 && vk5Var.f && vk5Var.g) {
                if (vk5Var.m == null) {
                    f0(null);
                }
                int i = vk5Var.b;
                if (i != -1 && (znbVar = vk5Var.a) != null) {
                    znbVar.u(i);
                    aob.x1(vk5Var.a, true, false, true, false, false);
                }
                znb znbVar2 = vk5Var.a;
                boolean z2 = vk5Var.c;
                if (runnable == null) {
                    aob.t(znbVar2, true, z2);
                    gp6Var.run();
                    return;
                }
                c1 c1Var = new c1(gp6Var, (byte) 3);
                int i2 = aob.a;
                if (znbVar2 == null) {
                    c1Var.run();
                    return;
                }
                ThemeEditorView themeEditorView = ThemeEditorView.p;
                if (themeEditorView != null) {
                    themeEditorView.a();
                }
                try {
                } catch (Exception e) {
                    e = e;
                }
                if (znbVar2.b == null && znbVar2.d == null) {
                    if (!z2) {
                        SharedPreferences.Editor edit = uc7.e1().edit();
                        edit.remove("theme");
                        edit.apply();
                    }
                    aob.km.clear();
                    aob.f0 = 0;
                    aob.g0 = null;
                    aob.d0 = null;
                    aob.e0 = null;
                    if (!z2 && aob.M == null) {
                        aob.K = znbVar2;
                        if (aob.I == aob.J) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            aob.T = 2000;
                            aob.U = SystemClock.elapsedRealtime();
                            hl.d3(new pg6((byte) 4), 2100L);
                        }
                    }
                    aob.I = znbVar2;
                    aob.r1(false, false);
                    if (aob.M == null && !aob.Q) {
                        uc7.s1(znbVar2.F).I4(znbVar2, znbVar2.i(false), z2, false);
                    }
                    c1Var.run();
                    return;
                }
                if (!z2) {
                    SharedPreferences.Editor edit2 = uc7.e1().edit();
                    edit2.putString("theme", znbVar2.k());
                    edit2.apply();
                }
                String[] strArr = new String[1];
                try {
                    lb7 lb7Var = new lb7(strArr, znbVar2, z2, c1Var, (byte) 17);
                    int i3 = aob.wm + 1;
                    aob.wm = i3;
                    i61 i61Var = new i61(i3, c1Var, lb7Var);
                    String str = znbVar2.d;
                    if (str != null) {
                        Utilities.i.c(new kta(i61Var, (Object) null, str, (Object) null, (byte) 12));
                        return;
                    } else {
                        Utilities.i.c(new kta(i61Var, new File(znbVar2.b), (Object) null, strArr, (byte) 12));
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                    znbVar2 = znbVar2;
                    z2 = z2;
                    c1Var = c1Var;
                    cc4.g(e, true);
                    if (aob.M == null) {
                        uc7.s1(znbVar2.F).I4(znbVar2, znbVar2.i(false), z2, false);
                    }
                    c1Var.run();
                    return;
                }
            }
            gp6Var.run();
            return;
        }
        this.u0 = true;
        this.v0 = vk5Var.a;
        this.x0 = vk5Var.c;
        this.y0 = vk5Var.b;
        this.w0 = vk5Var.g;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e0() {
        List list;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.V0.isEmpty()) {
            int size = this.V0.size() - 1;
            if (!this.V0.isEmpty()) {
                if (this.V0.isEmpty() || this.V0.size() - 1 != size || ((e) this.V0.get(size)).fragmentView == null) {
                    int i = 0;
                    while (true) {
                        list = this.V0;
                        if (i >= size) {
                            break;
                        }
                        e eVar = (e) list.get(i);
                        a aVar = eVar.actionBar;
                        if (aVar != null && aVar.L && (viewGroup2 = (ViewGroup) aVar.getParent()) != null) {
                            viewGroup2.removeView(eVar.actionBar);
                        }
                        View view = eVar.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            eVar.onPause();
                            eVar.onRemoveFromParent();
                            viewGroup.removeView(eVar.fragmentView);
                        }
                        i++;
                    }
                    e eVar2 = (e) list.get(size);
                    eVar2.setParentLayout(this);
                    View view2 = eVar2.fragmentView;
                    if (view2 == null) {
                        view2 = eVar2.performCreateView(this.R0);
                        if (view2 != null && eVar2.isSupportEdgeToEdge() && eVar2.drawEdgeNavigationBar()) {
                            i6 i6Var = new i6(eVar2, (byte) 0);
                            WeakHashMap weakHashMap = ihc.a;
                            ahc.i(view2, i6Var);
                            this.s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            eVar2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.s.addView(view2, tre.c(-1.0f, -1));
                    this.s.setShouldHandleBottomInsets(eVar2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(eVar2.drawEdgeNavigationBar());
                    a aVar2 = eVar2.actionBar;
                    if (aVar2 != null && aVar2.L) {
                        if (this.J0) {
                            aVar2.setOccupyStatusBar(false);
                        }
                        hl.B2(eVar2.actionBar);
                        this.s.addView(eVar2.actionBar);
                    }
                    eVar2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                    eVar2.attachSheets(this.s);
                    eVar2.onResume();
                    eVar2.onBecomeFullyVisible();
                    this.E = eVar2.actionBar;
                    if (!eVar2.hasOwnBackground && view2.getBackground() == null) {
                        yob.h(aob.d6, null, view2);
                    }
                }
            }
        }
    }

    public final void f(String str) {
        boolean z = f11.a;
        ArrayList arrayList = this.p1;
        StringBuilder l = c00.l(str, " ");
        l.append(this.V0.size());
        arrayList.add(0, l.toString());
        if (this.p1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < 10; i++) {
                arrayList2.add((String) this.p1.get(i));
            }
            this.p1 = arrayList2;
        }
        j6 j6Var = this.q1;
        hl.r(j6Var);
        hl.d3(j6Var, 500L);
    }

    public final void f0(xu1 xu1Var) {
        int w0;
        try {
            int i = aob.f5;
            this.l0 = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int[] iArr = this.l0;
                if (xu1Var != null) {
                    w0 = xu1Var.h(i2);
                } else {
                    w0 = aob.w0(null, i2, false);
                }
                iArr[i2] = w0;
            }
        } catch (Exception e) {
            cc4.g(e, true);
            this.l0 = null;
        }
    }

    public final void g() {
        if (this.z0) {
            W(this.A0, this.B0);
            this.z0 = false;
        } else if (this.u0) {
            vk5 vk5Var = new vk5(this.v0, this.y0, this.x0, true);
            boolean z = this.w0;
            if (!z) {
                vk5Var.g = z;
                vk5Var.f = z;
            }
            e(vk5Var, null);
            this.v0 = null;
            this.u0 = false;
        }
    }

    public final void g0(boolean z, boolean z2, boolean z3) {
        if (z2) {
            this.L0 = 0.0f;
            this.M0 = System.nanoTime() / 1000000;
        }
        m6 m6Var = new m6(this, z2, z3, z);
        this.K0 = m6Var;
        hl.c3(m6Var);
    }

    @Override
    public e getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (e) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public nx0 getBottomSheet() {
        return null;
    }

    public yx0 getBottomSheetTabs() {
        return this.F;
    }

    public float getCurrentPreviewFragmentAlpha() {
        b bVar;
        if (!this.h && !this.b0 && !this.n) {
            return 0.0f;
        }
        e eVar = this.J;
        if (eVar != null && eVar.inPreviewMode) {
            bVar = this.w;
        } else {
            bVar = this.s;
        }
        return bVar.getAlpha();
    }

    public dr3 getDrawerLayoutContainer() {
        return this.y;
    }

    @Override
    public List<e> getFragmentStack() {
        return this.V0;
    }

    public float getInnerTranslationX() {
        return this.P;
    }

    @Override
    public e getLastFragment() {
        if (this.V0.isEmpty()) {
            return null;
        }
        return (e) bp1.m(1, this.V0);
    }

    public e getLastFragmentIncludeMainTabs() {
        e lastFragment = getLastFragment();
        if (lastFragment instanceof fj6) {
            return ((fj6) lastFragment).b0();
        }
        return lastFragment;
    }

    @Override
    public t37 getMessageDrawableOutMediaStart() {
        return this.g0;
    }

    @Override
    public t37 getMessageDrawableOutStart() {
        return this.f0;
    }

    @Override
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        lq5.j("NavigationLayout added in non-activity context!");
        return null;
    }

    @Override
    public List<ed0> getPulledDialogs() {
        return this.W0;
    }

    @Override
    public e getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                e eVar = (e) getFragmentStack().get(size);
                if (eVar != null && eVar.getContext() != null && !eVar.isFinishing() && !eVar.isRemovingFromStack()) {
                    return eVar;
                }
            }
            return null;
        }
        return null;
    }

    public s24 getSheetFragment() {
        return v();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.t0;
    }

    @Override
    public Window getWindow() {
        Window window = this.c;
        if (window != null) {
            return window;
        }
        if (getParentActivity() != null) {
            return getParentActivity().getWindow();
        }
        return null;
    }

    public final boolean h() {
        if (this.b0) {
            return false;
        }
        if (this.a0 && (this.C0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.a0;
    }

    public final boolean h0() {
        e eVar;
        if (!this.V0.isEmpty()) {
            eVar = (e) bp1.m(1, this.V0);
        } else {
            eVar = null;
        }
        if (eVar != null && eVar.getLastStoryViewer() != null && eVar.getLastStoryViewer().z()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(boolean z) {
        j(z, false);
    }

    public final void j(boolean z, boolean z2) {
        boolean z3;
        e eVar;
        boolean z4;
        boolean z5;
        e lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            sk5 sk5Var = this.Q0;
            if ((sk5Var == null || sk5Var.k(this)) && !h() && !this.V0.isEmpty()) {
                Activity activity = this.R0;
                if (activity.getCurrentFocus() != null) {
                    hl.t1(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z2 && (this.h || this.b0 || (z && uc7.e1().getBoolean("view_animations", true)))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                e eVar2 = (e) bp1.m(1, this.V0);
                AnimatorSet animatorSet = null;
                if (this.V0.size() > 1) {
                    eVar = (e) bp1.m(2, this.V0);
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    if (aob.w0(null, aob.s8, false) != -1 && (!eVar.hasForceLightStatusBar() || aob.B0().o())) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    hl.k3(activity, z4);
                    b bVar = this.s;
                    this.s = this.w;
                    this.w = bVar;
                    eVar.setParentLayout(this);
                    View view = eVar.fragmentView;
                    if (view == null && (view = eVar.performCreateView(activity)) != null && eVar.isSupportEdgeToEdge() && eVar.drawEdgeNavigationBar()) {
                        i6 i6Var = new i6(eVar, (byte) 0);
                        WeakHashMap weakHashMap = ihc.a;
                        ahc.i(view, i6Var);
                        this.s.invalidate();
                    }
                    if (!this.h) {
                        this.s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            eVar.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                        }
                        this.s.addView(view);
                        this.s.setShouldHandleBottomInsets(eVar.getEdgeToEdgeSupportMode());
                        this.s.setDrawNavigationBar(eVar.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        a aVar = eVar.actionBar;
                        if (aVar != null && aVar.L) {
                            if (this.J0) {
                                aVar.setOccupyStatusBar(false);
                            }
                            hl.B2(eVar.actionBar);
                            this.s.addView(eVar.actionBar);
                        }
                        eVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                        eVar.attachSheets(this.s);
                    }
                    this.I = eVar;
                    this.J = eVar2;
                    eVar.onTransitionAnimationStart(true, true);
                    eVar2.onTransitionAnimationStart(false, true);
                    eVar.onResume();
                    if (this.r0 != null) {
                        this.j0 = eVar.getThemeDescriptions();
                    }
                    this.E = eVar.actionBar;
                    if (!eVar.hasOwnBackground && view.getBackground() == null) {
                        yob.h(aob.d6, null, view);
                    }
                    if (z3) {
                        this.C0 = System.currentTimeMillis();
                        this.a0 = true;
                        eVar2.setRemovingFromStack(true);
                        this.F0 = new es6(this, eVar2, eVar, (byte) 7);
                        if (!this.h && !this.b0) {
                            animatorSet = eVar2.onCustomTransitionAnimation(false, new j6(this, (byte) 4));
                        }
                        if (animatorSet == null) {
                            if (!this.h) {
                                if (!this.s.b && !this.w.b) {
                                    if (!this.b0) {
                                        z5 = false;
                                        g0(false, true, z5);
                                    }
                                } else {
                                    p1 p1Var = new p1(this, (byte) 1);
                                    this.d = p1Var;
                                    hl.d3(p1Var, 200L);
                                }
                            }
                            z5 = true;
                            g0(false, true, z5);
                        } else {
                            this.L = animatorSet;
                            v21 v21Var = v21.x;
                            if (v21Var != null && v21Var.m) {
                                v21Var.b();
                            }
                        }
                        J("closeLastFragment");
                    } else {
                        k(eVar2);
                        eVar2.onTransitionAnimationEnd(false, true);
                        eVar.onTransitionAnimationEnd(true, true);
                        eVar.onBecomeFullyVisible();
                    }
                } else if (this.H0 && !z2) {
                    this.C0 = System.currentTimeMillis();
                    this.a0 = true;
                    this.F0 = new ve2(this, eVar2, (byte) 20);
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
                    this.L.addListener(new k6(this, (byte) 0));
                    this.L.start();
                } else {
                    d0(eVar2, false);
                    setVisibility(8);
                    View view3 = this.I0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                eVar2.onFragmentClosed();
            }
        }
    }

    public final void k(e eVar) {
        eVar.finishing = true;
        eVar.onPause();
        eVar.onFragmentDestroy();
        eVar.setParentLayout(null);
        this.V0.remove(eVar);
        this.w.setVisibility(4);
        this.w.setTranslationY(0.0f);
        bringChildToFront(this.s);
        b bVar = this.x;
        if (bVar != null) {
            bringChildToFront(bVar);
        }
        J("closeLastFragmentInternalRemoveOld");
    }

    public final void l() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((e) bp1.m(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void m(View view, l2d l2dVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view2;
        int i8;
        b2d x1dVar;
        boolean z2 = this.T0;
        if (z2) {
            if ((view instanceof b) && ((b) view).y) {
                int i9 = l2dVar.a.f(8).d;
                if (getParent() instanceof View) {
                    view2 = (View) getParent();
                } else {
                    view2 = null;
                }
                if (view2 != null) {
                    i8 = Math.max(0, view2.getHeight() - getBottom());
                } else {
                    i8 = 0;
                }
                int max = Math.max(0, i9 - i8);
                l2d l2dVar2 = l2d.b;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    x1dVar = new a2d(l2dVar2);
                } else if (i10 >= 30) {
                    x1dVar = new z1d(l2dVar2);
                } else if (i10 >= 29) {
                    x1dVar = new y1d(l2dVar2);
                } else {
                    x1dVar = new x1d(l2dVar2);
                }
                x1dVar.c(8, mq5.b(0, 0, 0, max));
                ihc.b(view, x1dVar.b());
                return;
            }
            ihc.b(view, l2d.b);
            return;
        }
        boolean z3 = this.U0;
        boolean z4 = true;
        if (!z2 && !z3 && (getParent() instanceof RelativeLayout)) {
            z = true;
        } else {
            z = false;
        }
        mq5 mq5Var = this.u1;
        mq5 mq5Var2 = this.v1;
        if (view instanceof yx0) {
            if (z3) {
                i6 = 0;
            } else {
                i6 = mq5Var.a;
            }
            if (z) {
                i7 = 0;
            } else {
                i7 = mq5Var.c;
            }
            hl.v3(view, i6, 0, i7, mq5Var.d);
        } else if (view instanceof b) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            b bVar = (b) view;
            int u = u(false);
            if (u > 0) {
                i = mq5Var.d + u;
            } else {
                i = 0;
            }
            jt3 jt3Var = bVar.x;
            if (jt3Var != jt3.c) {
                z4 = false;
            }
            if (!z4 && !z3) {
                i2 = mq5Var2.a;
            } else {
                i2 = 0;
            }
            if (!z4 && !z) {
                i3 = mq5Var2.c;
            } else {
                i3 = 0;
            }
            if (z4 && !z3) {
                i4 = 0;
            } else {
                i4 = mq5Var2.a;
            }
            if (z4 && !z) {
                i5 = 0;
            } else {
                i5 = mq5Var2.c;
            }
            if (jt3Var == jt3.a) {
                i = Math.max(i, mq5Var2.d);
                ihc.b(view, l2d.b);
            } else {
                ihc.b(view, l2dVar.a.m(i4, 0, i5, i));
            }
            view.setPadding(i2, 0, i3, i);
        }
    }

    public final void n(Canvas canvas, int i, int i2) {
        if (w1 != null && xea.z1) {
            int i3 = i / 2;
            if (w1.getAlpha() != i3) {
                w1.setAlpha(i3);
            }
            w1.setBounds(0, i2, getMeasuredWidth(), w1.getIntrinsicHeight() + i2);
            w1.draw(canvas);
        }
    }

    public final void o(Canvas canvas, int i) {
        n(canvas, 255, i);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.V0.isEmpty()) {
            int size = this.V0.size();
            for (int i = 0; i < size; i++) {
                e eVar = (e) this.V0.get(i);
                eVar.onConfigurationChanged(configuration);
                Dialog dialog = eVar.visibleDialog;
                if (dialog instanceof nx0) {
                    ((nx0) dialog).Z(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.U && !h() && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        a aVar;
        s6 s6Var;
        if (i == 82 && !h() && !this.R && (aVar = this.E) != null && !aVar.z() && (s6Var = aVar.F) != null) {
            int childCount = s6Var.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = s6Var.getChildAt(i2);
                if (childAt instanceof s7) {
                    s7 s7Var = (s7) childAt;
                    if (s7Var.getVisibility() != 0) {
                        continue;
                    } else if (s7Var.t()) {
                        s7Var.U(null, null);
                        break;
                    } else if (s7Var.T) {
                        s6Var.o(((Integer) s7Var.getTag()).intValue());
                        break;
                    }
                }
                i2++;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        e eVar;
        boolean z = true;
        if (!this.V0.isEmpty()) {
            eVar = (e) bp1.m(1, this.V0);
        } else {
            eVar = null;
        }
        if (eVar != null && !eVar.isSupportEdgeToEdge() && h0()) {
            int A = A();
            eVar.setKeyboardHeightFromParent(A);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + A, 1073741824));
            return;
        }
        sk5 sk5Var = this.Q0;
        if (sk5Var != null) {
            int[] iArr = this.f1;
            iArr[0] = i;
            iArr[1] = i2;
            sk5Var.e(iArr);
            i = iArr[0];
            i2 = iArr[1];
        }
        if (A() <= hl.L(20.0f)) {
            z = false;
        }
        this.e1 = z;
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l6 l6Var;
        boolean z = false;
        if (!h() && !this.D0 && !this.U && !this.k1) {
            if (this.V0.size() > 1 && ((l6Var = this.H) == null || l6Var.getLastSheet() == null || !this.H.getLastSheet().s())) {
                if (motionEvent != null) {
                    if (motionEvent.getAction() == 0) {
                        if (!((e) bp1.m(1, this.V0)).isSwipeBackEnabled(motionEvent)) {
                            this.Q = false;
                            this.R = false;
                            b bVar = this.s;
                            if (bVar != null) {
                                bVar.setLayerType(0, null);
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
                    } else if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.E0) {
                        if (this.V == null) {
                            this.V = VelocityTracker.obtain();
                        }
                        int max = Math.max(0, (int) (motionEvent.getX() - this.S));
                        int abs = Math.abs(((int) motionEvent.getY()) - this.T);
                        this.V.addMovement(motionEvent);
                        if (!this.a0 && !this.h && this.Q && !this.R && max >= hl.Z0(true, 0.4f) && Math.abs(max) / 3 > abs) {
                            if (((e) bp1.m(1, this.V0)).canBeginSlide() && s(this, motionEvent.getX(), motionEvent.getY()) == null) {
                                this.S = (int) motionEvent.getX();
                                Q();
                            } else {
                                this.Q = false;
                            }
                        } else if (this.R) {
                            if (!this.W) {
                                Activity activity = this.R0;
                                if (activity.getCurrentFocus() != null) {
                                    hl.t1(activity.getCurrentFocus());
                                }
                                ((e) bp1.m(1, this.V0)).onBeginSlide();
                                this.W = true;
                            }
                            boolean B = B();
                            b bVar2 = this.s;
                            if (B) {
                                float f = max;
                                bVar2.setTranslationX((f / getWidth()) * hl.L(56.0f) * 5);
                                setInnerTranslationX((f / getWidth()) * hl.L(56.0f) * 5);
                            } else {
                                float f2 = max;
                                bVar2.setTranslationX(f2);
                                setInnerTranslationX(f2);
                            }
                        }
                    }
                }
                if (motionEvent != null && motionEvent.getPointerId(0) == this.E0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    VelocityTracker velocityTracker2 = this.V;
                    if (velocityTracker2 == null) {
                        velocityTracker2 = VelocityTracker.obtain();
                        this.V = velocityTracker2;
                    }
                    velocityTracker2.addMovement(motionEvent);
                    this.V.computeCurrentVelocity(1000);
                    e eVar = (e) bp1.m(1, this.V0);
                    if (!this.h && !this.b0 && !this.R && eVar.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.V.getXVelocity();
                        float yVelocity = this.V.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && eVar.canBeginSlide()) {
                            this.S = (int) motionEvent.getX();
                            Q();
                            if (!this.W) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    hl.t1(((Activity) getContext()).getCurrentFocus());
                                }
                                this.W = true;
                            }
                        }
                    }
                    if (this.R) {
                        float x = this.s.getX();
                        float xVelocity2 = this.V.getXVelocity();
                        float yVelocity2 = this.V.getYVelocity();
                        if (!B() ? x < this.s.getMeasuredWidth() / 3.0f : !(x >= hl.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z = true;
                            }
                        }
                        d(z);
                    } else {
                        this.Q = false;
                        this.R = false;
                        b bVar3 = this.s;
                        if (bVar3 != null) {
                            bVar3.setLayerType(0, null);
                        }
                    }
                    VelocityTracker velocityTracker3 = this.V;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.V = null;
                    }
                } else if (motionEvent == null) {
                    this.Q = false;
                    this.R = false;
                    b bVar4 = this.s;
                    if (bVar4 != null) {
                        bVar4.setLayerType(0, null);
                    }
                    VelocityTracker velocityTracker4 = this.V;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.V = null;
                    }
                }
            }
            return this.R;
        }
        return false;
    }

    public final void p() {
        boolean z = true;
        this.n = true;
        this.h = false;
        e eVar = (e) bp1.m(1, this.V0);
        eVar.fragmentView.setOutlineProvider(null);
        eVar.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eVar.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        eVar.fragmentView.setLayoutParams(layoutParams);
        V((e) bp1.m(2, this.V0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(eVar.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(eVar.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new k43(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new v5(this, eVar, (byte) 2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(eVar.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(eVar.drawEdgeNavigationBar());
        eVar.setInPreviewMode(false);
        eVar.setInMenuMode(false);
        try {
            Activity activity = this.R0;
            if (aob.w0(null, aob.s8, false) != -1 && (!eVar.hasForceLightStatusBar() || aob.B0().o())) {
                z = false;
            }
            hl.k3(activity, z);
        } catch (Exception unused2) {
        }
    }

    public final boolean q(Menu menu) {
        if (!this.V0.isEmpty() && ((e) bp1.m(1, this.V0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    public final e r() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                e eVar = (e) getFragmentStack().get(size);
                if (eVar != null && !eVar.isFinishing() && !eVar.isRemovingFromStack() && qh6.class.isInstance(eVar)) {
                    return eVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override
    public void setBackgroundView(View view) {
        this.I0 = view;
    }

    @Override
    public void setDelegate(sk5 sk5Var) {
        this.Q0 = sk5Var;
    }

    @Override
    public void setDrawerLayoutContainer(dr3 dr3Var) {
        this.y = dr3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i) {
        b bVar = this.s;
        if (bVar != null) {
            bVar.setFragmentPanTranslationOffset(i);
        }
    }

    @Override
    public void setFragmentStack(List<e> list) {
        this.V0 = list;
        yx0 yx0Var = this.F;
        if (yx0Var != null) {
            j6 j6Var = new j6(this, (byte) 1);
            j6 j6Var2 = new j6(this, (byte) 2);
            yx0Var.J.remove(j6Var);
            yx0Var.K.remove(j6Var2);
            hl.B2(this.F);
            this.F = null;
        }
        boolean z = this.S0;
        Activity activity = this.R0;
        if (z) {
            yx0 yx0Var2 = new yx0(activity, this);
            this.F = yx0Var2;
            this.G = new am2(yx0Var2);
            yx0 yx0Var3 = this.F;
            j6 j6Var3 = new j6(this, (byte) 1);
            j6 j6Var4 = new j6(this, (byte) 2);
            yx0Var3.J.add(j6Var3);
            yx0Var3.K.add(j6Var4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.F, layoutParams);
            gy0 gy0Var = LaunchActivity.H1.x0;
            if (gy0Var != null) {
                gy0Var.setTabsView(this.F);
            }
        }
        b bVar = this.w;
        if (bVar != null) {
            hl.B2(bVar);
        }
        b bVar2 = new b(activity, this);
        this.w = bVar2;
        addView(bVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.w.setLayoutParams(layoutParams2);
        b bVar3 = this.s;
        if (bVar3 != null) {
            hl.B2(bVar3);
        }
        b bVar4 = new b(activity, this);
        this.s = bVar4;
        addView(bVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.s.setLayoutParams(layoutParams3);
        b bVar5 = this.x;
        if (bVar5 != null) {
            hl.B2(bVar5);
        }
        b bVar6 = new b(activity, this);
        this.x = bVar6;
        this.i1.a = bVar6;
        addView(bVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.x.setLayoutParams(layoutParams4);
        l6 l6Var = this.H;
        if (l6Var != null) {
            l6Var.setParentLayout(this);
            l6 l6Var2 = this.H;
            View view = l6Var2.fragmentView;
            if (view == null) {
                view = l6Var2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                hl.B2(view);
                this.x.addView(view, tre.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        for (e eVar : this.V0) {
            eVar.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.Z0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z) {
        this.f = z;
    }

    public void setInnerTranslationX(float f) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.P = f;
        invalidate();
        if (this.V0.size() >= 2 && this.s.getMeasuredWidth() > 0) {
            if (B()) {
                measuredWidth = Utilities.l(f / (hl.L(56.0f) * 6));
            } else {
                measuredWidth = f / this.s.getMeasuredWidth();
            }
            e eVar = (e) bp1.m(2, this.V0);
            eVar.onSlideProgress(false, measuredWidth);
            e eVar2 = (e) bp1.m(1, this.V0);
            float a = ete.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (eVar2.isBeginToShow() && (navigationBarColor = eVar2.getNavigationBarColor()) != (navigationBarColor2 = eVar.getNavigationBarColor())) {
                eVar2.setNavigationBarColor(vm2.f(a, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z) {
        this.b = z;
    }

    @Override
    public void setNavigationBarColor(int i) {
        boolean z;
        if (this.s1 != i) {
            this.s1 = i;
            invalidate();
        }
        dr3 dr3Var = this.y;
        if (dr3Var != null) {
            dr3Var.setInternalNavigationBarColor(i);
        }
        yx0 yx0Var = this.F;
        if (yx0Var != null) {
            if (!this.R && !this.U) {
                z = true;
            } else {
                z = false;
            }
            yx0Var.i(i, z);
        }
    }

    public void setOverrideWidthOffset(int i) {
        this.a1 = i;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<ed0> list) {
        this.W0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z) {
        this.J0 = z;
    }

    public void setThemeAnimationValue(float f) {
        boolean z;
        int alpha;
        this.t0 = f;
        for (int i = 0; i < this.p0; i++) {
            int f2 = vm2.f(f, this.n0[i], this.o0[i]);
            xu1 xu1Var = this.q0;
            int[] iArr = this.m0;
            if (xu1Var != null) {
                xu1Var.i(iArr[i], f2);
            } else {
                int i2 = iArr[i];
                SparseIntArray sparseIntArray = aob.mm;
                if (sparseIntArray != null) {
                    sparseIntArray.put(i2, f2);
                }
            }
        }
        ArrayList arrayList = this.i0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i3);
            int[] iArr2 = (int[]) this.c0.get(i3);
            int[] iArr3 = (int[]) this.d0.get(i3);
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                int red = Color.red(iArr3[i4]);
                int green = Color.green(iArr3[i4]);
                int blue = Color.blue(iArr3[i4]);
                int alpha2 = Color.alpha(iArr3[i4]);
                int red2 = Color.red(iArr2[i4]);
                int green2 = Color.green(iArr2[i4]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr2[i4]);
                int i5 = size;
                int i6 = i3;
                int argb = Color.argb(Math.min(255, (int) (((alpha2 - alpha) * f) + Color.alpha(iArr2[i4]))), Math.min(255, (int) (((red - red2) * f) + red2)), Math.min(255, (int) (((green - green2) * f) + green2)), Math.min(255, (int) (((blue - blue2) * f) + blue2)));
                apb apbVar = (apb) arrayList2.get(i4);
                vnb vnbVar = apbVar.n;
                int i7 = apbVar.e;
                if (vnbVar != null) {
                    vnbVar.i(i7, argb);
                } else {
                    SparseIntArray sparseIntArray2 = aob.mm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i7, argb);
                    }
                }
                apbVar.e(argb, false, false);
                i4++;
                i3 = i6;
                arrayList = arrayList3;
                size = i5;
            }
            i3++;
        }
        ArrayList arrayList4 = this.k0;
        int size3 = arrayList4.size();
        for (int i8 = 0; i8 < size3; i8++) {
            zob zobVar = (zob) arrayList4.get(i8);
            if (zobVar != null) {
                zobVar.b();
                zobVar.a(f);
            }
        }
        ArrayList arrayList5 = this.j0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i9 = 0; i9 < size4; i9++) {
                apb apbVar2 = (apb) this.j0.get(i9);
                apbVar2.e(aob.v0(apbVar2.e, apbVar2.n), false, false);
            }
        }
        uu1 uu1Var = this.h0;
        if (uu1Var != null) {
            xu1 xu1Var2 = uu1Var.a;
            xu1Var2.G.A0.invalidate();
            xu1Var2.t.K = f;
            xu1Var2.u.K = f;
            xu1Var2.t(f);
        }
        sk5 sk5Var = this.Q0;
        if (sk5Var != null) {
            sk5Var.a(f);
        }
        xob xobVar = yob.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f < 1.0f && currentAnimationTimeMillis == yob.c && f == yob.d) {
            if (getWindowToken() == null) {
                yob.c0(this, false);
            }
        } else {
            yob.c = currentAnimationTimeMillis;
            yob.d = f;
            if (f >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            yob.b0(this, z);
        }
        C();
    }

    @Override
    public void setUseAlphaAnimations(boolean z) {
        this.H0 = z;
    }

    @Override
    public void setWindow(Window window) {
        this.c = window;
    }

    public final void t() {
        if (this.h || this.b0) {
            if (this.a0 && this.F0 != null) {
                return;
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                hl.r(runnable);
                this.e = null;
            }
            j(true, false);
        }
    }

    public final int u(boolean z) {
        yx0 yx0Var;
        if (this.S0 && (yx0Var = this.F) != null) {
            if (z) {
                return (int) yx0Var.H;
            }
            return yx0Var.I;
        }
        return 0;
    }

    public final s24 v() {
        Activity activity = this.R0;
        if (activity == null) {
            return null;
        }
        if (this.H == null) {
            l6 l6Var = new l6(this);
            this.H = l6Var;
            l6Var.setParentLayout(this);
            l6 l6Var2 = this.H;
            View view = l6Var2.fragmentView;
            if (view == null) {
                view = l6Var2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                hl.B2(view);
                this.x.addView(view, tre.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
                this.x.setDrawNavigationBar(this.H.drawEdgeNavigationBar());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        return this.H;
    }

    public final boolean w() {
        if (!this.h && !this.b0) {
            return false;
        }
        return true;
    }

    public final boolean y() {
        return this.T0;
    }

    public final boolean z() {
        if (!this.a0 && !this.U) {
            return false;
        }
        return true;
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
    public void setHighlightActionButtons(boolean z) {
    }
}
