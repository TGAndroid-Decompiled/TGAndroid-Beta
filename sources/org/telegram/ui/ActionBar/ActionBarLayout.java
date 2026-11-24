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
public class ActionBarLayout extends FrameLayout implements ui5, aj4 {
    public static Drawable w1;
    public static Drawable x1;
    public static Paint y1;
    public boolean A0;
    public boolean B0;
    public long C0;
    public boolean D0;
    public a E;
    public int E0;
    public qx0 F;
    public Runnable F0;
    public gl2 G;
    public Runnable G0;
    public k6 H;
    public boolean H0;
    public d I;
    public View I0;
    public d J;
    public boolean J0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public l6 K0;
    public AnimatorSet L;
    public float L0;
    public final DecelerateInterpolator M;
    public long M0;
    public final OvershootInterpolator N;
    public String N0;
    public final AccelerateDecelerateInterpolator O;
    public int O0;
    public float P;
    public rx5 P0;
    public boolean Q;
    public qi5 Q0;
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
    public final si5 e0;
    public boolean e1;
    public boolean f;
    public m17 f0;
    public final int[] f1;
    public m17 g0;
    public boolean g1;
    public boolean h;
    public hu1 h0;
    public int h1;
    public final ArrayList i0;
    public final lm i1;
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
    public ku1 q0;
    public final i6 q1;
    public ColorDrawable r;
    public AnimatorSet r0;
    public boolean r1;
    public b s;
    public final on s0;
    public int s1;
    public float t0;
    public vxc t1;
    public boolean u0;
    public io5 u1;
    public akb v0;
    public io5 v1;
    public b w;
    public boolean w0;
    public b x;
    public boolean x0;
    public mq3 y;
    public int y0;
    public boolean z0;

    public ActionBarLayout(Context context, boolean z) {
        super(context);
        this.M = new DecelerateInterpolator(1.5f);
        this.N = new OvershootInterpolator(1.02f);
        this.O = new AccelerateDecelerateInterpolator();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        si5 si5Var = new si5();
        si5Var.b = new SparseIntArray();
        si5Var.c = new int[]{bkb.qb, bkb.tb, bkb.ub, bkb.vb, bkb.Qc, bkb.sb};
        this.e0 = si5Var;
        this.i0 = new ArrayList();
        this.k0 = new ArrayList();
        this.s0 = new on(null);
        this.X0 = new Rect();
        this.a1 = -1;
        this.c1 = new Path();
        this.d1 = new float[8];
        this.f1 = new int[2];
        this.i1 = new lm(280L, this, s33.h);
        this.p1 = new ArrayList();
        this.q1 = new i6(this, (byte) 3);
        io5 io5Var = io5.e;
        this.u1 = io5Var;
        this.v1 = io5Var;
        this.R0 = (Activity) context;
        this.S0 = z;
        if (x1 == null) {
            x1 = getResources().getDrawable(2131231623);
            w1 = getResources().getDrawable(2131231240).mutate();
            y1 = new Paint();
        }
        l0 l0Var = new l0(this, (byte) 1);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(this, l0Var);
    }

    public static void E(ArrayList arrayList, View view) {
        if (view instanceof aj4) {
            arrayList.addAll(((aj4) view).D());
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
                Rect rect = gl.Q;
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
        if (i != bkb.f5 && i != bkb.Qc && i != bkb.He) {
            if (i != bkb.tb && i != bkb.ub && i != bkb.vb && i != bkb.De && i != bkb.Ee && i != bkb.Fe && i != bkb.Ge) {
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
            i = gl.m;
        } else {
            i = 0;
        }
        return Math.max(0, ((height - i) - gl.o1(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean B() {
        if (this.k1 && this.l1) {
            return true;
        }
        return false;
    }

    public final void C() {
        for (int i = 0; i < this.V0.size(); i++) {
            if (((d) this.V0.get(i)).getFragmentView() != null) {
                try {
                    ((d) this.V0.get(i)).onThemeColorsChanged();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    @Override
    public final List D() {
        d lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof aj4) {
                arrayList.addAll(((aj4) lastFragment).D());
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
            gl.r(runnable);
            this.d = null;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            if (z) {
                animatorSet.cancel();
            }
            this.L = null;
        }
        l6 l6Var = this.K0;
        if (l6Var != null) {
            gl.r(l6Var);
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
        pha phaVar;
        a aVar;
        if (!this.b0 && !this.R && !h() && !this.V0.isEmpty()) {
            o85 o85Var = o85.f0;
            if (o85Var != null && o85Var.y) {
                o85Var.f(false);
                return;
            }
            if (!h0() && (aVar = this.E) != null && !aVar.y()) {
                a aVar2 = this.E;
                if (aVar2.o0) {
                    aVar2.n(true);
                    return;
                }
            }
            d dVar = (d) oo1.m(1, this.V0);
            if (h0() || (phaVar = dVar.simpleActionBar) == null || !phaVar.B()) {
                k6 k6Var = this.H;
                if ((k6Var == null || k6Var.onBackPressed(true)) && ((d) oo1.m(1, this.V0)).onBackPressed(true) && !this.V0.isEmpty()) {
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
        ArrayList arrayList = fl5.z().f;
        for (int i = 0; i < arrayList.size(); i++) {
            ((km) arrayList.get(i)).z0 = 0;
        }
        f(str);
    }

    public final void K() {
        for (d dVar : this.V0) {
            dVar.onLowMemory();
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
            ((d) oo1.m(1, this.V0)).onPause();
        }
        k6 k6Var = this.H;
        if (k6Var != null) {
            k6Var.onPause();
        }
    }

    public final void N() {
        if (!this.V0.isEmpty()) {
            ((d) oo1.m(1, this.V0)).onResume();
        }
        k6 k6Var = this.H;
        if (k6Var != null) {
            k6Var.onResume();
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
            d dVar = (d) oo1.m(1, this.V0);
            dVar.prepareFragmentToSlide(true, false);
            dVar.onPause();
            dVar.onFragmentDestroy();
            dVar.setParentLayout(null);
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
                d dVar2 = (d) oo1.m(1, this.V0);
                this.E = dVar2.actionBar;
                dVar2.onResume();
                dVar2.onBecomeFullyVisible();
                dVar2.prepareFragmentToSlide(false, false);
            }
        } else if (list.size() >= 2) {
            ((d) oo1.m(1, this.V0)).prepareFragmentToSlide(true, false);
            d dVar3 = (d) oo1.m(2, this.V0);
            dVar3.prepareFragmentToSlide(false, false);
            dVar3.onPause();
            View view2 = dVar3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                dVar3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(dVar3.fragmentView);
            }
            a aVar = dVar3.actionBar;
            if (aVar != null && aVar.L && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
                viewGroup.removeViewInLayout(dVar3.actionBar);
            }
            dVar3.detachSheets();
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
        d dVar = (d) oo1.m(2, this.V0);
        View view = dVar.fragmentView;
        if (view == null && (view = dVar.performCreateView(this.R0)) != null && dVar.isSupportEdgeToEdge() && dVar.drawEdgeNavigationBar()) {
            h6 h6Var = new h6(dVar, (byte) 0);
            WeakHashMap weakHashMap = jdc.a;
            bdc.i(view, h6Var);
            this.w.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            dVar.onRemoveFromParent();
            viewGroup.removeView(view);
        }
        this.w.addView(view);
        this.w.setShouldHandleBottomInsets(dVar.getEdgeToEdgeSupportMode());
        this.w.setDrawNavigationBar(dVar.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        a aVar = dVar.actionBar;
        if (aVar != null && aVar.L) {
            gl.B2(aVar);
            if (this.J0) {
                dVar.actionBar.setOccupyStatusBar(false);
            }
            this.w.addView(dVar.actionBar);
        }
        dVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
        dVar.attachSheets(this.w);
        if (!dVar.hasOwnBackground && view.getBackground() == null) {
            zkb.h(bkb.c6, null, view);
        }
        dVar.onResume();
        if (this.r0 != null) {
            this.j0 = dVar.getThemeDescriptions();
        }
        this.s.setLayerType(2, null);
        ((d) oo1.m(1, this.V0)).prepareFragmentToSlide(true, true);
        dVar.prepareFragmentToSlide(false, true);
    }

    public final boolean R(defpackage.ri5 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.R(ri5):boolean");
    }

    public final boolean S(d dVar) {
        return R(new ri5(dVar));
    }

    public final boolean T(d dVar, boolean z) {
        ri5 ri5Var = new ri5(dVar);
        ri5Var.b = z;
        return R(ri5Var);
    }

    public final boolean U(d dVar, boolean z, boolean z2) {
        ri5 ri5Var = new ri5(dVar);
        ri5Var.b = z;
        ri5Var.c = z2;
        ri5Var.d = true;
        ri5Var.e = false;
        return R(ri5Var);
    }

    public final void V(d dVar, boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (dVar == null) {
            return;
        }
        dVar.onBecomeFullyHidden();
        dVar.onPause();
        if (z) {
            dVar.onFragmentDestroy();
            dVar.setParentLayout(null);
            this.V0.remove(dVar);
            J("presentFragmentInternalRemoveOld");
        } else {
            View view = dVar.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                dVar.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(dVar.fragmentView);
                } catch (Exception e) {
                    fa4.g(e, true);
                    try {
                        viewGroup2.removeView(dVar.fragmentView);
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
            }
            a aVar = dVar.actionBar;
            if (aVar != null && aVar.L && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
                viewGroup.removeViewInLayout(dVar.actionBar);
            }
            dVar.detachSheets();
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
                ((d) this.V0.get(i)).clearViews();
                ((d) this.V0.get(i)).setParentLayout(this);
            }
            qi5 qi5Var = this.Q0;
            if (qi5Var != null) {
                qi5Var.b(this, z);
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
            d0((d) this.V0.get(0), false);
        }
        View view = this.I0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new i6(this, (byte) 0)).start();
        }
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.d0.add(iArr);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                iArr[i] = ((blb) arrayList.get(i)).c();
            }
        }
    }

    public final void a0(int i) {
        if (i >= 0 && i < getFragmentStack().size()) {
            c0((d) getFragmentStack().get(i), false);
        }
    }

    @Override
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        vxc vxcVar = this.t1;
        if (vxcVar != null) {
            m(view, vxcVar);
        }
    }

    public final boolean b(int i, d dVar) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        qi5 qi5Var = this.Q0;
        if ((qi5Var != null && !qi5Var.h(dVar, this)) || !dVar.onFragmentCreate() || this.V0.contains(dVar)) {
            return false;
        }
        dVar.setParentLayout(this);
        Activity activity = this.R0;
        if (i != -1 && i != -2) {
            if (i == -3) {
                View view = dVar.fragmentView;
                if (view == null) {
                    view = dVar.performCreateView(activity);
                    if (view != null && dVar.isSupportEdgeToEdge() && dVar.drawEdgeNavigationBar()) {
                        h6 h6Var = new h6(dVar, (byte) 1);
                        WeakHashMap weakHashMap = jdc.a;
                        bdc.i(view, h6Var);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        dVar.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!dVar.hasOwnBackground && view.getBackground() == null) {
                    zkb.h(bkb.c6, null, view);
                }
                b bVar = this.s;
                bVar.addView(view, Utilities.j(0, bVar.getChildCount(), 0), nme.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(dVar.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(dVar.drawEdgeNavigationBar());
                a aVar = dVar.actionBar;
                if (aVar != null && aVar.L) {
                    if (this.J0) {
                        aVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) dVar.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(dVar.actionBar);
                    }
                    this.s.addView(dVar.actionBar);
                }
                dVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                dVar.attachSheets(this.s);
                i = 0;
            }
            this.V0.add(i, dVar);
            J("addFragmentToStack");
        } else {
            if (!this.V0.isEmpty()) {
                d dVar2 = (d) oo1.m(1, this.V0);
                dVar2.onPause();
                a aVar2 = dVar2.actionBar;
                if (aVar2 != null && aVar2.L && (viewGroup2 = (ViewGroup) aVar2.getParent()) != null) {
                    viewGroup2.removeView(dVar2.actionBar);
                }
                View view2 = dVar2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    dVar2.onRemoveFromParent();
                    viewGroup.removeView(dVar2.fragmentView);
                }
                dVar2.detachSheets();
            }
            this.V0.add(dVar);
            if (i != -2) {
                View view3 = dVar.fragmentView;
                if (view3 == null) {
                    view3 = dVar.performCreateView(activity);
                    if (view3 != null && dVar.isSupportEdgeToEdge() && dVar.drawEdgeNavigationBar()) {
                        h6 h6Var2 = new h6(dVar, (byte) 1);
                        WeakHashMap weakHashMap2 = jdc.a;
                        bdc.i(view3, h6Var2);
                        this.s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        dVar.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!dVar.hasOwnBackground && view3.getBackground() == null) {
                    zkb.h(bkb.c6, null, view3);
                }
                this.s.addView(view3, nme.c(-1.0f, -1));
                this.s.setShouldHandleBottomInsets(dVar.getEdgeToEdgeSupportMode());
                this.s.setDrawNavigationBar(dVar.drawEdgeNavigationBar());
                a aVar3 = dVar.actionBar;
                if (aVar3 != null && aVar3.L) {
                    if (this.J0) {
                        aVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) dVar.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(dVar.actionBar);
                    }
                    this.s.addView(dVar.actionBar);
                }
                dVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                dVar.attachSheets(this.s);
                dVar.onResume();
                dVar.onTransitionAnimationEnd(false, true);
                dVar.onTransitionAnimationEnd(true, true);
                dVar.onBecomeFullyVisible();
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

    public final void b0(d dVar) {
        c0(dVar, false);
    }

    public final void c(ArrayList arrayList) {
        if (arrayList != null) {
            this.i0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.c0.add(iArr);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                blb blbVar = (blb) arrayList.get(i);
                iArr[i] = blbVar.c();
                alb albVar = blbVar.g;
                blbVar.g = null;
                if (albVar != null) {
                    ArrayList arrayList2 = this.k0;
                    if (!arrayList2.contains(albVar)) {
                        arrayList2.add(albVar);
                    }
                }
            }
        }
    }

    public final void c0(d dVar, boolean z) {
        boolean z2 = true;
        if ((this.V0.size() > 0 && oo1.m(1, this.V0) == dVar) || (this.V0.size() > 1 && oo1.m(2, this.V0) == dVar)) {
            L();
            I();
        }
        f("removeFragmentFromStack " + z);
        if (this.H0 && this.V0.size() == 1 && gl.O1()) {
            j(true, false);
            return;
        }
        if (this.Q0 != null && this.V0.size() == 1 && gl.O1()) {
            this.Q0.k(this);
        }
        if (!dVar.allowFinishFragmentInsteadOfRemoveFromStack() || z) {
            z2 = false;
        }
        d0(dVar, z2);
    }

    public final void d(boolean z) {
        d dVar;
        int i;
        Animator customSlideTransition;
        int i2;
        int i3;
        if (!this.V0.isEmpty()) {
            dVar = (d) oo1.m(1, this.V0);
        } else {
            dVar = null;
        }
        if (dVar == null) {
            return;
        }
        float x = this.s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = dVar.shouldOverrideSlideTransition(false, z);
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
                    i3 = gl.L(56.0f);
                } else {
                    i3 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar2, property, measuredWidth2 + i3);
                long j = max;
                animatorSet.playTogether(ofFloat.setDuration(j), ObjectAnimator.ofFloat(this, "innerTranslationX", this.s.getMeasuredWidth()).setDuration(j));
                if (B()) {
                    animatorSet.setInterpolator(s33.h);
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
                    animatorSet.setInterpolator(s33.h);
                }
            }
        }
        Animator customSlideTransition2 = dVar.getCustomSlideTransition(false, z, x);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        d dVar2 = (d) oo1.m(2, this.V0);
        if (dVar2 != null && (customSlideTransition = dVar2.getCustomSlideTransition(false, z, x)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new x5(this, z));
        this.o1 = animatorSet;
        animatorSet.start();
        this.U = true;
    }

    public final void d0(d dVar, boolean z) {
        if (!this.V0.contains(dVar)) {
            return;
        }
        if (z && oo1.m(1, this.V0) == dVar) {
            dVar.finishFragment();
        } else if (oo1.m(1, this.V0) == dVar && this.V0.size() > 1) {
            dVar.finishFragment(false);
        } else {
            dVar.onPause();
            dVar.onFragmentDestroy();
            dVar.setParentLayout(null);
            this.V0.remove(dVar);
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
            float L = gl.L(24.0f);
            RectF rectF = gl.P;
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
            qi5 qi5Var = this.Q0;
            if ((qi5Var != null && qi5Var.j()) || super.dispatchKeyEventPreIme(keyEvent)) {
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

    public final void e(ti5 ti5Var, Runnable runnable) {
        int size;
        boolean z;
        akb akbVar;
        if (!this.a0 && !this.R) {
            AnimatorSet animatorSet = this.r0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.r0 = null;
            }
            if (ti5Var.e) {
                size = 1;
            } else {
                size = this.V0.size();
            }
            tn6 tn6Var = new tn6(this, size, ti5Var, runnable, (byte) 2);
            if (size >= 1 && ti5Var.f && ti5Var.g) {
                if (ti5Var.m == null) {
                    f0(null);
                }
                int i = ti5Var.b;
                if (i != -1 && (akbVar = ti5Var.a) != null) {
                    akbVar.u(i);
                    bkb.x1(ti5Var.a, true, false, true, false, false);
                }
                akb akbVar2 = ti5Var.a;
                boolean z2 = ti5Var.c;
                if (runnable == null) {
                    bkb.t(akbVar2, true, z2);
                    tn6Var.run();
                    return;
                }
                b1 b1Var = new b1(tn6Var, (byte) 3);
                int i2 = bkb.a;
                if (akbVar2 == null) {
                    b1Var.run();
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
                if (akbVar2.b == null && akbVar2.d == null) {
                    if (!z2) {
                        SharedPreferences.Editor edit = na7.c1().edit();
                        edit.remove("theme");
                        edit.apply();
                    }
                    bkb.jm.clear();
                    bkb.f0 = 0;
                    bkb.g0 = null;
                    bkb.d0 = null;
                    bkb.e0 = null;
                    if (!z2 && bkb.M == null) {
                        bkb.K = akbVar2;
                        if (bkb.I == bkb.J) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            bkb.T = 2000;
                            bkb.U = SystemClock.elapsedRealtime();
                            gl.d3(new am6((byte) 2), 2100L);
                        }
                    }
                    bkb.I = akbVar2;
                    bkb.r1(false, false);
                    if (bkb.M == null && !bkb.Q) {
                        na7.q1(akbVar2.F).A4(akbVar2, akbVar2.i(false), z2, false);
                    }
                    b1Var.run();
                    return;
                }
                if (!z2) {
                    SharedPreferences.Editor edit2 = na7.c1().edit();
                    edit2.putString("theme", akbVar2.k());
                    edit2.apply();
                }
                String[] strArr = new String[1];
                try {
                    d97 d97Var = new d97(strArr, akbVar2, z2, b1Var, (byte) 17);
                    int i3 = bkb.vm + 1;
                    bkb.vm = i3;
                    a61 a61Var = new a61(i3, b1Var, d97Var);
                    String str = akbVar2.d;
                    if (str != null) {
                        Utilities.i.c(new exa(a61Var, (Object) null, str, (Object) null, (byte) 11));
                        return;
                    } else {
                        Utilities.i.c(new exa(a61Var, new File(akbVar2.b), (Object) null, strArr, (byte) 11));
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                    akbVar2 = akbVar2;
                    z2 = z2;
                    b1Var = b1Var;
                    fa4.g(e, true);
                    if (bkb.M == null) {
                        na7.q1(akbVar2.F).A4(akbVar2, akbVar2.i(false), z2, false);
                    }
                    b1Var.run();
                    return;
                }
            }
            tn6Var.run();
            return;
        }
        this.u0 = true;
        this.v0 = ti5Var.a;
        this.x0 = ti5Var.c;
        this.y0 = ti5Var.b;
        this.w0 = ti5Var.g;
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
                if (this.V0.isEmpty() || this.V0.size() - 1 != size || ((d) this.V0.get(size)).fragmentView == null) {
                    int i = 0;
                    while (true) {
                        list = this.V0;
                        if (i >= size) {
                            break;
                        }
                        d dVar = (d) list.get(i);
                        a aVar = dVar.actionBar;
                        if (aVar != null && aVar.L && (viewGroup2 = (ViewGroup) aVar.getParent()) != null) {
                            viewGroup2.removeView(dVar.actionBar);
                        }
                        View view = dVar.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            dVar.onPause();
                            dVar.onRemoveFromParent();
                            viewGroup.removeView(dVar.fragmentView);
                        }
                        i++;
                    }
                    d dVar2 = (d) list.get(size);
                    dVar2.setParentLayout(this);
                    View view2 = dVar2.fragmentView;
                    if (view2 == null) {
                        view2 = dVar2.performCreateView(this.R0);
                        if (view2 != null && dVar2.isSupportEdgeToEdge() && dVar2.drawEdgeNavigationBar()) {
                            h6 h6Var = new h6(dVar2, (byte) 0);
                            WeakHashMap weakHashMap = jdc.a;
                            bdc.i(view2, h6Var);
                            this.s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            dVar2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.s.addView(view2, nme.c(-1.0f, -1));
                    this.s.setShouldHandleBottomInsets(dVar2.getEdgeToEdgeSupportMode());
                    this.s.setDrawNavigationBar(dVar2.drawEdgeNavigationBar());
                    a aVar2 = dVar2.actionBar;
                    if (aVar2 != null && aVar2.L) {
                        if (this.J0) {
                            aVar2.setOccupyStatusBar(false);
                        }
                        gl.B2(dVar2.actionBar);
                        this.s.addView(dVar2.actionBar);
                    }
                    dVar2.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                    dVar2.attachSheets(this.s);
                    dVar2.onResume();
                    dVar2.onBecomeFullyVisible();
                    this.E = dVar2.actionBar;
                    if (!dVar2.hasOwnBackground && view2.getBackground() == null) {
                        zkb.h(bkb.c6, null, view2);
                    }
                }
            }
        }
    }

    public final void f(String str) {
        boolean z = w01.a;
        ArrayList arrayList = this.p1;
        StringBuilder k = b00.k(str, " ");
        k.append(this.V0.size());
        arrayList.add(0, k.toString());
        if (this.p1.size() > 20) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < 10; i++) {
                arrayList2.add((String) this.p1.get(i));
            }
            this.p1 = arrayList2;
        }
        i6 i6Var = this.q1;
        gl.r(i6Var);
        gl.d3(i6Var, 500L);
    }

    public final void f0(ku1 ku1Var) {
        int w0;
        try {
            int i = bkb.e5;
            this.l0 = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int[] iArr = this.l0;
                if (ku1Var != null) {
                    w0 = ku1Var.h(i2);
                } else {
                    w0 = bkb.w0(null, i2, false);
                }
                iArr[i2] = w0;
            }
        } catch (Exception e) {
            fa4.g(e, true);
            this.l0 = null;
        }
    }

    public final void g() {
        if (this.z0) {
            W(this.A0, this.B0);
            this.z0 = false;
        } else if (this.u0) {
            ti5 ti5Var = new ti5(this.v0, this.y0, this.x0, true);
            boolean z = this.w0;
            if (!z) {
                ti5Var.g = z;
                ti5Var.f = z;
            }
            e(ti5Var, null);
            this.v0 = null;
            this.u0 = false;
        }
    }

    public final void g0(boolean z, boolean z2, boolean z3) {
        if (z2) {
            this.L0 = 0.0f;
            this.M0 = System.nanoTime() / 1000000;
        }
        l6 l6Var = new l6(this, z2, z3, z);
        this.K0 = l6Var;
        gl.c3(l6Var);
    }

    @Override
    public d getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (d) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    public fx0 getBottomSheet() {
        return null;
    }

    public qx0 getBottomSheetTabs() {
        return this.F;
    }

    public float getCurrentPreviewFragmentAlpha() {
        b bVar;
        if (!this.h && !this.b0 && !this.n) {
            return 0.0f;
        }
        d dVar = this.J;
        if (dVar != null && dVar.inPreviewMode) {
            bVar = this.w;
        } else {
            bVar = this.s;
        }
        return bVar.getAlpha();
    }

    public mq3 getDrawerLayoutContainer() {
        return this.y;
    }

    @Override
    public List<d> getFragmentStack() {
        return this.V0;
    }

    public float getInnerTranslationX() {
        return this.P;
    }

    @Override
    public d getLastFragment() {
        if (this.V0.isEmpty()) {
            return null;
        }
        return (d) oo1.m(1, this.V0);
    }

    public d getLastFragmentIncludeMainTabs() {
        d lastFragment = getLastFragment();
        if (lastFragment instanceof ah6) {
            return ((ah6) lastFragment).b0();
        }
        return lastFragment;
    }

    @Override
    public m17 getMessageDrawableOutMediaStart() {
        return this.g0;
    }

    @Override
    public m17 getMessageDrawableOutStart() {
        return this.f0;
    }

    @Override
    public Activity getParentActivity() {
        Context context = getView().getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        w26.j("NavigationLayout added in non-activity context!");
        return null;
    }

    @Override
    public List<cd0> getPulledDialogs() {
        return this.W0;
    }

    @Override
    public d getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                d dVar = (d) getFragmentStack().get(size);
                if (dVar != null && dVar.getContext() != null && !dVar.isFinishing() && !dVar.isRemovingFromStack()) {
                    return dVar;
                }
            }
            return null;
        }
        return null;
    }

    public x14 getSheetFragment() {
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
        d dVar;
        if (!this.V0.isEmpty()) {
            dVar = (d) oo1.m(1, this.V0);
        } else {
            dVar = null;
        }
        if (dVar != null && dVar.getLastStoryViewer() != null && dVar.getLastStoryViewer().z()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        j(false, false);
    }

    public final void j(boolean z, boolean z2) {
        boolean z3;
        d dVar;
        boolean z4;
        boolean z5;
        d lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            qi5 qi5Var = this.Q0;
            if ((qi5Var == null || qi5Var.k(this)) && !h() && !this.V0.isEmpty()) {
                Activity activity = this.R0;
                if (activity.getCurrentFocus() != null) {
                    gl.t1(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z2 && (this.h || this.b0 || (z && na7.c1().getBoolean("view_animations", true)))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                d dVar2 = (d) oo1.m(1, this.V0);
                AnimatorSet animatorSet = null;
                if (this.V0.size() > 1) {
                    dVar = (d) oo1.m(2, this.V0);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    if (bkb.w0(null, bkb.r8, false) != -1 && (!dVar.hasForceLightStatusBar() || bkb.B0().o())) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    gl.k3(activity, z4);
                    b bVar = this.s;
                    this.s = this.w;
                    this.w = bVar;
                    dVar.setParentLayout(this);
                    View view = dVar.fragmentView;
                    if (view == null && (view = dVar.performCreateView(activity)) != null && dVar.isSupportEdgeToEdge() && dVar.drawEdgeNavigationBar()) {
                        h6 h6Var = new h6(dVar, (byte) 0);
                        WeakHashMap weakHashMap = jdc.a;
                        bdc.i(view, h6Var);
                        this.s.invalidate();
                    }
                    if (!this.h) {
                        this.s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            dVar.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                        }
                        this.s.addView(view);
                        this.s.setShouldHandleBottomInsets(dVar.getEdgeToEdgeSupportMode());
                        this.s.setDrawNavigationBar(dVar.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        a aVar = dVar.actionBar;
                        if (aVar != null && aVar.L) {
                            if (this.J0) {
                                aVar.setOccupyStatusBar(false);
                            }
                            gl.B2(dVar.actionBar);
                            this.s.addView(dVar.actionBar);
                        }
                        dVar.setTitleOverlayTextIfActionBarAttached(this.N0, this.O0, this.P0);
                        dVar.attachSheets(this.s);
                    }
                    this.I = dVar;
                    this.J = dVar2;
                    dVar.onTransitionAnimationStart(true, true);
                    dVar2.onTransitionAnimationStart(false, true);
                    dVar.onResume();
                    if (this.r0 != null) {
                        this.j0 = dVar.getThemeDescriptions();
                    }
                    this.E = dVar.actionBar;
                    if (!dVar.hasOwnBackground && view.getBackground() == null) {
                        zkb.h(bkb.c6, null, view);
                    }
                    if (z3) {
                        this.C0 = System.currentTimeMillis();
                        this.a0 = true;
                        dVar2.setRemovingFromStack(true);
                        this.F0 = new nn6(this, dVar2, dVar, (byte) 7);
                        if (!this.h && !this.b0) {
                            animatorSet = dVar2.onCustomTransitionAnimation(false, new i6(this, (byte) 4));
                        }
                        if (animatorSet == null) {
                            if (!this.h) {
                                if (!this.s.b && !this.w.b) {
                                    if (!this.b0) {
                                        z5 = false;
                                        g0(false, true, z5);
                                    }
                                } else {
                                    o1 o1Var = new o1(this, (byte) 1);
                                    this.d = o1Var;
                                    gl.d3(o1Var, 200L);
                                }
                            }
                            z5 = true;
                            g0(false, true, z5);
                        } else {
                            this.L = animatorSet;
                            m21 m21Var = m21.w;
                            if (m21Var != null && m21Var.l) {
                                m21Var.b();
                            }
                        }
                        J("closeLastFragment");
                    } else {
                        k(dVar2);
                        dVar2.onTransitionAnimationEnd(false, true);
                        dVar.onTransitionAnimationEnd(true, true);
                        dVar.onBecomeFullyVisible();
                    }
                } else if (this.H0 && !z2) {
                    this.C0 = System.currentTimeMillis();
                    this.a0 = true;
                    this.F0 = new ee2(this, dVar2, (byte) 20);
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
                    this.L.addListener(new j6(this, (byte) 0));
                    this.L.start();
                } else {
                    d0(dVar2, false);
                    setVisibility(8);
                    View view3 = this.I0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                dVar2.onFragmentClosed();
            }
        }
    }

    public final void k(d dVar) {
        dVar.finishing = true;
        dVar.onPause();
        dVar.onFragmentDestroy();
        dVar.setParentLayout(null);
        this.V0.remove(dVar);
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
            ((d) oo1.m(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void m(View view, vxc vxcVar) {
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
        lxc hxcVar;
        boolean z2 = this.T0;
        if (z2) {
            if ((view instanceof b) && ((b) view).y) {
                int i9 = vxcVar.a.f(8).d;
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
                vxc vxcVar2 = vxc.b;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    hxcVar = new kxc(vxcVar2);
                } else if (i10 >= 30) {
                    hxcVar = new jxc(vxcVar2);
                } else if (i10 >= 29) {
                    hxcVar = new ixc(vxcVar2);
                } else {
                    hxcVar = new hxc(vxcVar2);
                }
                hxcVar.c(8, io5.b(0, 0, 0, max));
                jdc.b(view, hxcVar.b());
                return;
            }
            jdc.b(view, vxc.b);
            return;
        }
        boolean z3 = this.U0;
        boolean z4 = true;
        if (!z2 && !z3 && (getParent() instanceof RelativeLayout)) {
            z = true;
        } else {
            z = false;
        }
        io5 io5Var = this.u1;
        io5 io5Var2 = this.v1;
        if (view instanceof qx0) {
            if (z3) {
                i6 = 0;
            } else {
                i6 = io5Var.a;
            }
            if (z) {
                i7 = 0;
            } else {
                i7 = io5Var.c;
            }
            gl.v3(view, i6, 0, i7, io5Var.d);
        } else if (view instanceof b) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            b bVar = (b) view;
            int u = u(false);
            if (u > 0) {
                i = io5Var.d + u;
            } else {
                i = 0;
            }
            rs3 rs3Var = bVar.x;
            if (rs3Var != rs3.c) {
                z4 = false;
            }
            if (!z4 && !z3) {
                i2 = io5Var2.a;
            } else {
                i2 = 0;
            }
            if (!z4 && !z) {
                i3 = io5Var2.c;
            } else {
                i3 = 0;
            }
            if (z4 && !z3) {
                i4 = 0;
            } else {
                i4 = io5Var2.a;
            }
            if (z4 && !z) {
                i5 = 0;
            } else {
                i5 = io5Var2.c;
            }
            if (rs3Var == rs3.a) {
                i = Math.max(i, io5Var2.d);
                jdc.b(view, vxc.b);
            } else {
                jdc.b(view, vxcVar.a.m(i4, 0, i5, i));
            }
            view.setPadding(i2, 0, i3, i);
        }
    }

    public final void n(Canvas canvas, int i, int i2) {
        if (w1 != null && gba.z1) {
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
                d dVar = (d) this.V0.get(i);
                dVar.onConfigurationChanged(configuration);
                Dialog dialog = dVar.visibleDialog;
                if (dialog instanceof fx0) {
                    ((fx0) dialog).Z(configuration);
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
        r6 r6Var;
        if (i == 82 && !h() && !this.R && (aVar = this.E) != null && !aVar.y() && (r6Var = aVar.F) != null) {
            int childCount = r6Var.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = r6Var.getChildAt(i2);
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    if (r7Var.getVisibility() != 0) {
                        continue;
                    } else if (r7Var.t()) {
                        r7Var.U(null, null);
                        break;
                    } else if (r7Var.T) {
                        r6Var.o(((Integer) r7Var.getTag()).intValue());
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
        d dVar;
        boolean z = true;
        if (!this.V0.isEmpty()) {
            dVar = (d) oo1.m(1, this.V0);
        } else {
            dVar = null;
        }
        if (dVar != null && !dVar.isSupportEdgeToEdge() && h0()) {
            int A = A();
            dVar.setKeyboardHeightFromParent(A);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + A, 1073741824));
            return;
        }
        qi5 qi5Var = this.Q0;
        if (qi5Var != null) {
            int[] iArr = this.f1;
            iArr[0] = i;
            iArr[1] = i2;
            qi5Var.e(iArr);
            i = iArr[0];
            i2 = iArr[1];
        }
        if (A() <= gl.L(20.0f)) {
            z = false;
        }
        this.e1 = z;
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k6 k6Var;
        boolean z = false;
        if (!h() && !this.D0 && !this.U && !this.k1) {
            if (this.V0.size() > 1 && ((k6Var = this.H) == null || k6Var.getLastSheet() == null || !this.H.getLastSheet().t())) {
                if (motionEvent != null) {
                    if (motionEvent.getAction() == 0) {
                        if (!((d) oo1.m(1, this.V0)).isSwipeBackEnabled(motionEvent)) {
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
                        if (!this.a0 && !this.h && this.Q && !this.R && max >= gl.Z0(true, 0.4f) && Math.abs(max) / 3 > abs) {
                            if (((d) oo1.m(1, this.V0)).canBeginSlide() && s(this, motionEvent.getX(), motionEvent.getY()) == null) {
                                this.S = (int) motionEvent.getX();
                                Q();
                            } else {
                                this.Q = false;
                            }
                        } else if (this.R) {
                            if (!this.W) {
                                Activity activity = this.R0;
                                if (activity.getCurrentFocus() != null) {
                                    gl.t1(activity.getCurrentFocus());
                                }
                                ((d) oo1.m(1, this.V0)).onBeginSlide();
                                this.W = true;
                            }
                            boolean B = B();
                            b bVar2 = this.s;
                            if (B) {
                                float f = max;
                                bVar2.setTranslationX((f / getWidth()) * gl.L(56.0f) * 5);
                                setInnerTranslationX((f / getWidth()) * gl.L(56.0f) * 5);
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
                    d dVar = (d) oo1.m(1, this.V0);
                    if (!this.h && !this.b0 && !this.R && dVar.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.V.getXVelocity();
                        float yVelocity = this.V.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && dVar.canBeginSlide()) {
                            this.S = (int) motionEvent.getX();
                            Q();
                            if (!this.W) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    gl.t1(((Activity) getContext()).getCurrentFocus());
                                }
                                this.W = true;
                            }
                        }
                    }
                    if (this.R) {
                        float x = this.s.getX();
                        float xVelocity2 = this.V.getXVelocity();
                        float yVelocity2 = this.V.getYVelocity();
                        if (!B() ? x < this.s.getMeasuredWidth() / 3.0f : !(x >= gl.L(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
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
        d dVar = (d) oo1.m(1, this.V0);
        dVar.fragmentView.setOutlineProvider(null);
        dVar.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        dVar.fragmentView.setLayoutParams(layoutParams);
        V((d) oo1.m(2, this.V0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(dVar.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(dVar.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new s33(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new u5(this, dVar, (byte) 2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.s.setShouldHandleBottomInsets(dVar.getEdgeToEdgeSupportMode());
        this.s.setDrawNavigationBar(dVar.drawEdgeNavigationBar());
        dVar.setInPreviewMode(false);
        dVar.setInMenuMode(false);
        try {
            Activity activity = this.R0;
            if (bkb.w0(null, bkb.r8, false) != -1 && (!dVar.hasForceLightStatusBar() || bkb.B0().o())) {
                z = false;
            }
            gl.k3(activity, z);
        } catch (Exception unused2) {
        }
    }

    public final boolean q(Menu menu) {
        if (!this.V0.isEmpty() && ((d) oo1.m(1, this.V0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    public final d r() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                d dVar = (d) getFragmentStack().get(size);
                if (dVar != null && !dVar.isFinishing() && !dVar.isRemovingFromStack() && mf6.class.isInstance(dVar)) {
                    return dVar;
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
    public void setDelegate(qi5 qi5Var) {
        this.Q0 = qi5Var;
    }

    @Override
    public void setDrawerLayoutContainer(mq3 mq3Var) {
        this.y = mq3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i) {
        b bVar = this.s;
        if (bVar != null) {
            bVar.setFragmentPanTranslationOffset(i);
        }
    }

    @Override
    public void setFragmentStack(List<d> list) {
        this.V0 = list;
        qx0 qx0Var = this.F;
        if (qx0Var != null) {
            i6 i6Var = new i6(this, (byte) 1);
            i6 i6Var2 = new i6(this, (byte) 2);
            qx0Var.J.remove(i6Var);
            qx0Var.K.remove(i6Var2);
            gl.B2(this.F);
            this.F = null;
        }
        boolean z = this.S0;
        Activity activity = this.R0;
        if (z) {
            qx0 qx0Var2 = new qx0(activity, this);
            this.F = qx0Var2;
            this.G = new gl2(qx0Var2);
            qx0 qx0Var3 = this.F;
            i6 i6Var3 = new i6(this, (byte) 1);
            i6 i6Var4 = new i6(this, (byte) 2);
            qx0Var3.J.add(i6Var3);
            qx0Var3.K.add(i6Var4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.L(76.0f));
            layoutParams.gravity = 87;
            addView(this.F, layoutParams);
            yx0 yx0Var = LaunchActivity.H1.x0;
            if (yx0Var != null) {
                yx0Var.setTabsView(this.F);
            }
        }
        b bVar = this.w;
        if (bVar != null) {
            gl.B2(bVar);
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
            gl.B2(bVar3);
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
            gl.B2(bVar5);
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
        k6 k6Var = this.H;
        if (k6Var != null) {
            k6Var.setParentLayout(this);
            k6 k6Var2 = this.H;
            View view = k6Var2.fragmentView;
            if (view == null) {
                view = k6Var2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                gl.B2(view);
                this.x.addView(view, nme.c(-1.0f, -1));
                this.x.setShouldHandleBottomInsets(this.H.getEdgeToEdgeSupportMode());
            }
            this.H.onResume();
            this.H.onBecomeFullyVisible();
        }
        for (d dVar : this.V0) {
            dVar.setParentLayout(this);
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
                measuredWidth = Utilities.l(f / (gl.L(56.0f) * 6));
            } else {
                measuredWidth = f / this.s.getMeasuredWidth();
            }
            d dVar = (d) oo1.m(2, this.V0);
            dVar.onSlideProgress(false, measuredWidth);
            d dVar2 = (d) oo1.m(1, this.V0);
            float a = moe.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (dVar2.isBeginToShow() && (navigationBarColor = dVar2.getNavigationBarColor()) != (navigationBarColor2 = dVar.getNavigationBarColor())) {
                dVar2.setNavigationBarColor(bm2.f(a, navigationBarColor, navigationBarColor2));
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
        mq3 mq3Var = this.y;
        if (mq3Var != null) {
            mq3Var.setInternalNavigationBarColor(i);
        }
        qx0 qx0Var = this.F;
        if (qx0Var != null) {
            if (!this.R && !this.U) {
                z = true;
            } else {
                z = false;
            }
            qx0Var.i(i, z);
        }
    }

    public void setOverrideWidthOffset(int i) {
        this.a1 = i;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<cd0> list) {
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
            int f2 = bm2.f(f, this.n0[i], this.o0[i]);
            ku1 ku1Var = this.q0;
            int[] iArr = this.m0;
            if (ku1Var != null) {
                ku1Var.i(iArr[i], f2);
            } else {
                int i2 = iArr[i];
                SparseIntArray sparseIntArray = bkb.lm;
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
                blb blbVar = (blb) arrayList2.get(i4);
                wjb wjbVar = blbVar.n;
                int i7 = blbVar.e;
                if (wjbVar != null) {
                    wjbVar.i(i7, argb);
                } else {
                    SparseIntArray sparseIntArray2 = bkb.lm;
                    if (sparseIntArray2 != null) {
                        sparseIntArray2.put(i7, argb);
                    }
                }
                blbVar.e(argb, false, false);
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
            alb albVar = (alb) arrayList4.get(i8);
            if (albVar != null) {
                albVar.b();
                albVar.a(f);
            }
        }
        ArrayList arrayList5 = this.j0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i9 = 0; i9 < size4; i9++) {
                blb blbVar2 = (blb) this.j0.get(i9);
                blbVar2.e(bkb.v0(blbVar2.e, blbVar2.n), false, false);
            }
        }
        hu1 hu1Var = this.h0;
        if (hu1Var != null) {
            ku1 ku1Var2 = hu1Var.a;
            ku1Var2.G.A0.invalidate();
            ku1Var2.t.K = f;
            ku1Var2.u.K = f;
            ku1Var2.t(f);
        }
        qi5 qi5Var = this.Q0;
        if (qi5Var != null) {
            qi5Var.a(f);
        }
        ykb ykbVar = zkb.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (f < 1.0f && currentAnimationTimeMillis == zkb.c && f == zkb.d) {
            if (getWindowToken() == null) {
                zkb.c0(this, false);
            }
        } else {
            zkb.c = currentAnimationTimeMillis;
            zkb.d = f;
            if (f >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            zkb.b0(this, z);
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
                gl.r(runnable);
                this.e = null;
            }
            j(true, false);
        }
    }

    public final int u(boolean z) {
        qx0 qx0Var;
        if (this.S0 && (qx0Var = this.F) != null) {
            if (z) {
                return (int) qx0Var.H;
            }
            return qx0Var.I;
        }
        return 0;
    }

    public final x14 v() {
        Activity activity = this.R0;
        if (activity == null) {
            return null;
        }
        if (this.H == null) {
            k6 k6Var = new k6(this);
            this.H = k6Var;
            k6Var.setParentLayout(this);
            k6 k6Var2 = this.H;
            View view = k6Var2.fragmentView;
            if (view == null) {
                view = k6Var2.performCreateView(activity);
            }
            if (view.getParent() != this.x) {
                gl.B2(view);
                this.x.addView(view, nme.c(-1.0f, -1));
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
