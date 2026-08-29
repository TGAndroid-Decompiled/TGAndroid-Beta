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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.w20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.ng0;
import org.telegram.ui.o80;
import org.telegram.ui.on;
import org.telegram.ui.rn;
import org.telegram.ui.sy;
public class ActionBarLayout extends FrameLayout implements b5, xf.b {
    public static Drawable l1;
    public static Drawable f22654m1;
    public static Paint f22655n1;
    public m3 A;
    public float A0;
    public a5.j B;
    public long B0;
    public s C;
    public String C0;
    public o2 D;
    public int D0;
    public o2 E;
    public o80 E0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout F;
    public y4 F0;
    public AnimatorSet G;
    public final Activity G0;
    public final DecelerateInterpolator H;
    public final boolean H0;
    public final OvershootInterpolator I;
    public boolean I0;
    public final AccelerateDecelerateInterpolator J;
    public boolean J0;
    public float K;
    public List K0;
    public boolean L;
    public List L0;
    public boolean M;
    public final Rect M0;
    public int N;
    public boolean N0;
    public int O;
    public Runnable O0;
    public boolean P;
    public int P0;
    public VelocityTracker Q;
    public boolean Q0;
    public boolean R;
    public final Path R0;
    public boolean S;
    public final float[] S0;
    public boolean T;
    public boolean T0;
    public final ArrayList U;
    public final int[] U0;
    public final ArrayList V;
    public boolean V0;
    public final oc.i W;
    public int W0;
    public final org.telegram.ui.Components.d6 X0;
    public boolean Y0;
    public boolean Z0;
    public boolean f22656a;
    public d5 f22657a0;
    public boolean f22658a1;
    public boolean f22659b;
    public d5 f22660b0;
    public float f22661b1;
    public Window f22662c;
    public on f22663c0;
    public boolean f22664c1;
    public Runnable d;
    public final ArrayList f22665d0;
    public AnimatorSet f22666d1;
    public Runnable f22667e;
    public ArrayList f22668e0;
    public ArrayList f22669e1;
    public boolean f22670f;
    public final ArrayList f22671f0;
    public final p f22672f1;
    public AnimatorSet f22673g0;
    public boolean f22674g1;
    public boolean h;
    public final AnimationNotificationsLocker f22675h0;
    public int f22676h1;
    public float f22677i0;
    public r0.m1 f22678i1;
    public boolean f22679j0;
    public i0.b f22680j1;
    public f6 f22681k0;
    public i0.b f22682k1;
    public boolean f22683l0;
    public boolean m0;
    public boolean f22684n;
    public int f22685n0;
    public boolean f22686o0;
    public boolean f22687p0;
    public boolean f22688q0;
    public ColorDrawable f22689r;
    public long f22690r0;
    public x f22691s;
    public boolean f22692s0;
    public int f22693t0;
    public Runnable f22694u0;
    public x v;
    public Runnable f22695v0;
    public x f22696w;
    public boolean f22697w0;
    public x3 f22698x;
    public View f22699x0;
    public l f22700y;
    public boolean f22701y0;
    public t f22702z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.H = new DecelerateInterpolator(1.5f);
        this.I = new OvershootInterpolator(1.02f);
        this.J = new AccelerateDecelerateInterpolator();
        this.U = new ArrayList();
        this.V = new ArrayList();
        oc.i iVar = new oc.i(1);
        iVar.f19483b = new SparseIntArray();
        iVar.f19484c = new int[]{g6.Aa, g6.Da, g6.Ea, g6.Fa, g6.f23014ac, g6.Ca};
        this.W = iVar;
        this.f22665d0 = new ArrayList();
        this.f22671f0 = new ArrayList();
        this.f22675h0 = new AnimationNotificationsLocker();
        this.M0 = new Rect();
        this.P0 = -1;
        this.R0 = new Path();
        this.S0 = new float[8];
        this.U0 = new int[2];
        this.X0 = new org.telegram.ui.Components.d6(this, 280L, jr.h);
        this.f22669e1 = new ArrayList();
        this.f22672f1 = new p(this, 2);
        i0.b bVar = i0.b.f8185e;
        this.f22680j1 = bVar;
        this.f22682k1 = bVar;
        this.G0 = (Activity) context;
        this.H0 = z10;
        if (f22654m1 == null) {
            f22654m1 = getResources().getDrawable(R.drawable.layer_shadow);
            l1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f22655n1 = new Paint();
        }
        o oVar = new o(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(this, oVar);
    }

    public static void E(ArrayList arrayList, View view) {
        if (view instanceof xf.b) {
            arrayList.addAll(((xf.b) view).B());
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
            if (actionBarLayout.K0.size() < 2) {
                actionBarLayout.h("onSlideAnimationEnd exit");
                return;
            }
            o2 o2Var = (o2) j7.l1.j(1, actionBarLayout.K0);
            o2Var.prepareFragmentToSlide(true, false);
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            List list = actionBarLayout.K0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            x xVar = actionBarLayout.f22691s;
            xVar.setAlpha(1.0f);
            x xVar2 = actionBarLayout.v;
            actionBarLayout.f22691s = xVar2;
            actionBarLayout.v = xVar;
            actionBarLayout.bringChildToFront(xVar2);
            View view = actionBarLayout.f22696w;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.K0.size() > 0) {
                o2 o2Var2 = (o2) j7.l1.j(1, actionBarLayout.K0);
                actionBarLayout.f22700y = o2Var2.actionBar;
                o2Var2.onResume();
                o2Var2.onBecomeFullyVisible();
                o2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.K0.size() >= 2) {
            ((o2) j7.l1.j(1, actionBarLayout.K0)).prepareFragmentToSlide(true, false);
            o2 o2Var3 = (o2) j7.l1.j(2, actionBarLayout.K0);
            o2Var3.prepareFragmentToSlide(false, false);
            o2Var3.onPause();
            View view2 = o2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                o2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(o2Var3.fragmentView);
            }
            l lVar = o2Var3.actionBar;
            if (lVar != null && lVar.G && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                viewGroup.removeViewInLayout(o2Var3.actionBar);
            }
            o2Var3.detachSheets();
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.M = false;
        actionBarLayout.P = false;
        actionBarLayout.f22691s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.f22691s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f9, float f10) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = AndroidUtilities.rectTmp2;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f9, (int) f10)) {
                    continue;
                } else if (childAt.canScrollHorizontally(-1)) {
                    return childAt;
                } else {
                    if ((childAt instanceof ViewGroup) && (u10 = u((ViewGroup) childAt, f9 - rect.left, f10 - rect.top)) != null) {
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
        if (!this.S && !this.P) {
            return false;
        }
        return true;
    }

    @Override
    public final List B() {
        o2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof xf.b) {
                arrayList.addAll(((xf.b) lastFragment).B());
            }
            E(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public final int C() {
        int i10;
        View rootView = getRootView();
        Rect rect = this.M0;
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
        if (this.Z0 && this.f22658a1) {
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
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            if (z10) {
                animatorSet.cancel();
            }
            this.G = null;
        }
        t tVar = this.f22702z0;
        if (tVar != null) {
            AndroidUtilities.cancelRunOnUIThread(tVar);
            this.f22702z0 = null;
        }
        setAlpha(1.0f);
        this.f22691s.setAlpha(1.0f);
        this.f22691s.setScaleX(1.0f);
        this.f22691s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void G() {
        l lVar;
        if (!this.T && !this.M && !j() && !this.K0.isEmpty()) {
            w20 w20Var = w20.Z;
            if (w20Var != null && w20Var.f34283w) {
                w20Var.e(false);
                return;
            }
            if (!e0() && (lVar = this.f22700y) != null && !lVar.s()) {
                l lVar2 = this.f22700y;
                if (lVar2.f23612j0) {
                    lVar2.h(true);
                    return;
                }
            }
            s sVar = this.C;
            if ((sVar == null || sVar.onBackPressed(true)) && ((o2) j7.l1.j(1, this.K0)).onBackPressed(true) && !this.K0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final void H() {
        if (this.S && this.f22694u0 != null) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                this.G = null;
                animatorSet.cancel();
            }
            this.S = false;
            this.T = false;
            this.f22690r0 = 0L;
            this.D = null;
            this.E = null;
            Runnable runnable = this.f22694u0;
            this.f22694u0 = null;
            if (runnable != null) {
                runnable.run();
            }
            i();
            i();
        }
    }

    public final void I(String str) {
        Runnable runnable = this.O0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        h(str);
    }

    public final void J() {
        for (o2 o2Var : this.K0) {
            o2Var.onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (this.S && (runnable = this.f22695v0) != null) {
            this.S = false;
            this.T = false;
            this.f22690r0 = 0L;
            this.D = null;
            this.E = null;
            this.f22695v0 = null;
            runnable.run();
            i();
        }
    }

    public final void L() {
        if (!this.K0.isEmpty()) {
            ((o2) j7.l1.j(1, this.K0)).onPause();
        }
        s sVar = this.C;
        if (sVar != null) {
            sVar.onPause();
        }
    }

    public final void M() {
        if (!this.K0.isEmpty()) {
            ((o2) j7.l1.j(1, this.K0)).onResume();
        }
        s sVar = this.C;
        if (sVar != null) {
            sVar.onResume();
        }
    }

    public final void N(Canvas canvas, ViewGroup viewGroup) {
        if (this.A != null && getHeight() < viewGroup.getHeight()) {
            canvas.save();
            canvas.translate(this.A.getX() + getX(), this.A.getY() + getY());
            this.A.draw(canvas);
            canvas.restore();
        }
    }

    public final void O() {
        this.L = false;
        this.M = true;
        this.v.setVisibility(0);
        this.R = false;
        o2 o2Var = (o2) j7.l1.j(2, this.K0);
        View view = o2Var.fragmentView;
        if (view == null && (view = o2Var.performCreateView(this.G0)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
            o oVar = new o(o2Var, 0);
            WeakHashMap weakHashMap = r0.j0.f46829a;
            r0.b0.j(view, oVar);
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
        l lVar = o2Var.actionBar;
        if (lVar != null && lVar.G) {
            AndroidUtilities.removeFromParent(lVar);
            if (this.f22701y0) {
                o2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(o2Var.actionBar);
        }
        o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
        o2Var.attachSheets(this.v);
        if (!o2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
        }
        o2Var.onResume();
        if (this.f22673g0 != null) {
            this.f22668e0 = o2Var.getThemeDescriptions();
        }
        this.f22691s.setLayerType(2, null);
        ((o2) j7.l1.j(1, this.K0)).prepareFragmentToSlide(true, true);
        o2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(o2 o2Var) {
        return R(new z4(o2Var));
    }

    public final boolean Q(o2 o2Var, boolean z10) {
        z4 z4Var = new z4(o2Var);
        z4Var.f24013b = z10;
        return R(z4Var);
    }

    public final boolean R(org.telegram.ui.ActionBar.z4 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.R(org.telegram.ui.ActionBar.z4):boolean");
    }

    public final boolean S(o2 o2Var, boolean z10, boolean z11) {
        z4 z4Var = new z4(o2Var);
        z4Var.f24013b = z10;
        z4Var.f24014c = z11;
        z4Var.d = true;
        z4Var.f24015e = false;
        return R(z4Var);
    }

    public final void T(o2 o2Var, boolean z10) {
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
            this.K0.remove(o2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = o2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                o2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(o2Var.fragmentView);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    try {
                        viewGroup2.removeView(o2Var.fragmentView);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
            }
            l lVar = o2Var.actionBar;
            if (lVar != null && lVar.G && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                viewGroup.removeViewInLayout(o2Var.actionBar);
            }
            o2Var.detachSheets();
        }
        this.v.setVisibility(4);
    }

    public final void U(boolean z10, boolean z11) {
        if (!this.S && !this.M) {
            int size = this.K0.size();
            if (!z10) {
                size--;
            }
            if (this.h) {
                size--;
            }
            for (int i10 = 0; i10 < size; i10++) {
                ((o2) this.K0.get(i10)).clearViews();
                ((o2) this.K0.get(i10)).setParentLayout(this);
            }
            y4 y4Var = this.F0;
            if (y4Var != null) {
                y4Var.b(this, z10);
            }
            if (z11) {
                c0();
                return;
            }
            return;
        }
        this.f22686o0 = true;
        this.f22687p0 = z10;
        this.f22688q0 = z11;
    }

    public final void V() {
        U(true, true);
    }

    public final void W() {
        this.f22691s.removeAllViews();
        this.v.removeAllViews();
        this.f22700y = null;
        this.D = null;
        this.E = null;
    }

    public final void X() {
        while (this.K0.size() > 0) {
            b0((o2) this.K0.get(0), false);
        }
        View view = this.f22699x0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new p(this, 5)).start();
        }
    }

    public final void Y(int i10) {
        if (i10 >= 0 && i10 < getFragmentStack().size()) {
            Z((o2) getFragmentStack().get(i10));
        }
    }

    public final void Z(o2 o2Var) {
        a0(o2Var, false);
    }

    public final void a0(o2 o2Var, boolean z10) {
        boolean z11 = true;
        if ((this.K0.size() > 0 && j7.l1.j(1, this.K0) == o2Var) || (this.K0.size() > 1 && j7.l1.j(2, this.K0) == o2Var)) {
            K();
            H();
        }
        h("removeFragmentFromStack " + z10);
        if (this.f22697w0 && this.K0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.F0 != null && this.K0.size() == 1 && AndroidUtilities.isTablet()) {
            this.F0.k(this);
        }
        b0(o2Var, (!o2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) ? false : false);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.m1 m1Var = this.f22678i1;
        if (m1Var != null) {
            o(view, m1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.V.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = ((i6) arrayList.get(i10)).b();
            }
        }
    }

    public final void b0(o2 o2Var, boolean z10) {
        if (!this.K0.contains(o2Var)) {
            return;
        }
        if (z10 && j7.l1.j(1, this.K0) == o2Var) {
            o2Var.finishFragment();
        } else if (j7.l1.j(1, this.K0) == o2Var && this.K0.size() > 1) {
            o2Var.finishFragment(false);
        } else {
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            this.K0.remove(o2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i10, o2 o2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        y4 y4Var = this.F0;
        if ((y4Var != null && !y4Var.h(o2Var, this)) || !o2Var.onFragmentCreate() || this.K0.contains(o2Var)) {
            return false;
        }
        o2Var.setParentLayout(this);
        Activity activity = this.G0;
        if (i10 != -1 && i10 != -2) {
            if (i10 == -3) {
                View view = o2Var.fragmentView;
                if (view == null) {
                    view = o2Var.performCreateView(activity);
                    if (view != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        o oVar = new o(o2Var, 0);
                        WeakHashMap weakHashMap = r0.j0.f46829a;
                        r0.b0.j(view, oVar);
                        this.f22691s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!o2Var.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
                }
                x xVar = this.f22691s;
                xVar.addView(view, Utilities.clamp(0, xVar.getChildCount(), 0), i7.f6.c(-1.0f, -1));
                this.f22691s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.f22691s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                l lVar = o2Var.actionBar;
                if (lVar != null && lVar.G) {
                    if (this.f22701y0) {
                        lVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(o2Var.actionBar);
                    }
                    this.f22691s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                o2Var.attachSheets(this.f22691s);
                i10 = 0;
            }
            this.K0.add(i10, o2Var);
            I("addFragmentToStack");
        } else {
            if (!this.K0.isEmpty()) {
                o2 o2Var2 = (o2) j7.l1.j(1, this.K0);
                o2Var2.onPause();
                l lVar2 = o2Var2.actionBar;
                if (lVar2 != null && lVar2.G && (viewGroup2 = (ViewGroup) lVar2.getParent()) != null) {
                    viewGroup2.removeView(o2Var2.actionBar);
                }
                View view2 = o2Var2.fragmentView;
                if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                    o2Var2.onRemoveFromParent();
                    viewGroup.removeView(o2Var2.fragmentView);
                }
                o2Var2.detachSheets();
            }
            this.K0.add(o2Var);
            if (i10 != -2) {
                View view3 = o2Var.fragmentView;
                if (view3 == null) {
                    view3 = o2Var.performCreateView(activity);
                    if (view3 != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        o oVar2 = new o(o2Var, 0);
                        WeakHashMap weakHashMap2 = r0.j0.f46829a;
                        r0.b0.j(view3, oVar2);
                        this.f22691s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!o2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
                }
                this.f22691s.addView(view3, i7.f6.c(-1.0f, -1));
                this.f22691s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.f22691s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                l lVar3 = o2Var.actionBar;
                if (lVar3 != null && lVar3.G) {
                    if (this.f22701y0) {
                        lVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(o2Var.actionBar);
                    }
                    this.f22691s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                o2Var.attachSheets(this.f22691s);
                o2Var.onResume();
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var.onTransitionAnimationEnd(true, true);
                o2Var.onBecomeFullyVisible();
            }
            I("addFragmentToStack " + i10);
        }
        if (!this.f22697w0) {
            setVisibility(0);
            View view4 = this.f22699x0;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.K0.isEmpty()) {
            int size = this.K0.size() - 1;
            if (!this.K0.isEmpty()) {
                if (this.K0.isEmpty() || this.K0.size() - 1 != size || ((o2) this.K0.get(size)).fragmentView == null) {
                    for (int i10 = 0; i10 < size; i10++) {
                        o2 o2Var = (o2) this.K0.get(i10);
                        l lVar = o2Var.actionBar;
                        if (lVar != null && lVar.G && (viewGroup2 = (ViewGroup) lVar.getParent()) != null) {
                            viewGroup2.removeView(o2Var.actionBar);
                        }
                        View view = o2Var.fragmentView;
                        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                            o2Var.onPause();
                            o2Var.onRemoveFromParent();
                            viewGroup.removeView(o2Var.fragmentView);
                        }
                    }
                    o2 o2Var2 = (o2) this.K0.get(size);
                    o2Var2.setParentLayout(this);
                    View view2 = o2Var2.fragmentView;
                    if (view2 == null) {
                        view2 = o2Var2.performCreateView(this.G0);
                        if (view2 != null && o2Var2.isSupportEdgeToEdge() && o2Var2.drawEdgeNavigationBar()) {
                            o oVar = new o(o2Var2, 0);
                            WeakHashMap weakHashMap = r0.j0.f46829a;
                            r0.b0.j(view2, oVar);
                            this.f22691s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            o2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f22691s.addView(view2, i7.f6.c(-1.0f, -1));
                    this.f22691s.setShouldHandleBottomInsets(o2Var2.getEdgeToEdgeSupportMode());
                    this.f22691s.setDrawNavigationBar(o2Var2.drawEdgeNavigationBar());
                    l lVar2 = o2Var2.actionBar;
                    if (lVar2 != null && lVar2.G) {
                        if (this.f22701y0) {
                            lVar2.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(o2Var2.actionBar);
                        this.f22691s.addView(o2Var2.actionBar);
                    }
                    o2Var2.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                    o2Var2.attachSheets(this.f22691s);
                    o2Var2.onResume();
                    o2Var2.onBecomeFullyVisible();
                    this.f22700y = o2Var2.actionBar;
                    if (!o2Var2.hasOwnBackground && view2.getBackground() == null) {
                        view2.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
                    }
                }
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f22665d0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.U.add(iArr);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                i6 i6Var = (i6) arrayList.get(i10);
                iArr[i10] = i6Var.b();
                h6 h6Var = i6Var.h;
                i6Var.h = null;
                if (h6Var != null) {
                    ArrayList arrayList2 = this.f22671f0;
                    if (!arrayList2.contains(h6Var)) {
                        arrayList2.add(h6Var);
                    }
                }
            }
        }
    }

    public final void d0(boolean z10, boolean z11, boolean z12) {
        if (z11) {
            this.A0 = 0.0f;
            this.B0 = System.nanoTime() / 1000000;
        }
        t tVar = new t(this, z11, z12, z10);
        this.f22702z0 = tVar;
        AndroidUtilities.runOnUIThread(tVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.A != null && v(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.A.getMeasuredHeight() + this.f22680j1.d), getWidth(), getHeight(), this.A.getBackgroundPaint());
        } else {
            canvas2 = canvas;
        }
        this.Q0 = true;
        if (this.I0) {
            canvas2.save();
            float dp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.R0;
            path.rewind();
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.I0) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            y4 y4Var = this.F0;
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
        o2 o2Var;
        int i10;
        Animator customSlideTransition;
        int i11;
        int i12;
        if (!this.K0.isEmpty()) {
            o2Var = (o2) j7.l1.j(1, this.K0);
        } else {
            o2Var = null;
        }
        if (o2Var == null) {
            return;
        }
        float x4 = this.f22691s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = o2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x4 = Math.abs(this.f22691s.getMeasuredWidth() - x4);
            int measuredWidth = (int) ((200.0f / this.f22691s.getMeasuredWidth()) * x4);
            if (D()) {
                i11 = 380;
            } else {
                i11 = 50;
            }
            int max = Math.max(measuredWidth, i11);
            if (!shouldOverrideSlideTransition) {
                x xVar = this.f22691s;
                int measuredWidth2 = xVar.getMeasuredWidth();
                if (this.Z0) {
                    i12 = AndroidUtilities.dp(56.0f);
                } else {
                    i12 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xVar, property, measuredWidth2 + i12);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f22691s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(jr.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f22691s.getMeasuredWidth()) * x4);
            if (D()) {
                i10 = 320;
            } else {
                i10 = 120;
            }
            int max2 = Math.max(measuredWidth3, i10);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f22691s, property, 0.0f);
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(jr.h);
                }
            }
        }
        Animator customSlideTransition2 = o2Var.getCustomSlideTransition(false, z10, x4);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        o2 o2Var2 = (o2) j7.l1.j(2, this.K0);
        if (o2Var2 != null && (customSlideTransition = o2Var2.getCustomSlideTransition(false, z10, x4)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new h(this, z10));
        this.f22666d1 = animatorSet;
        animatorSet.start();
        this.P = true;
    }

    public final boolean e0() {
        o2 o2Var;
        if (!this.K0.isEmpty()) {
            o2Var = (o2) j7.l1.j(1, this.K0);
        } else {
            o2Var = null;
        }
        if (o2Var != null && o2Var.getLastStoryViewer() != null && o2Var.getLastStoryViewer().attachedToParent()) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.ui.ActionBar.a5 r17, java.lang.Runnable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.f(org.telegram.ui.ActionBar.a5, java.lang.Runnable):void");
    }

    public final void g(f6 f6Var, int i10, boolean z10, boolean z11, Runnable runnable) {
        f(new a5(f6Var, i10, z10, z11), runnable);
    }

    @Override
    public o2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (o2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public f3 getBottomSheet() {
        return null;
    }

    public m3 getBottomSheetTabs() {
        return this.A;
    }

    public float getCurrentPreviewFragmentAlpha() {
        x xVar;
        if (!this.h && !this.T && !this.f22684n) {
            return 0.0f;
        }
        o2 o2Var = this.E;
        if (o2Var != null && o2Var.inPreviewMode) {
            xVar = this.v;
        } else {
            xVar = this.f22691s;
        }
        return xVar.getAlpha();
    }

    public x3 getDrawerLayoutContainer() {
        return this.f22698x;
    }

    @Override
    public List<o2> getFragmentStack() {
        return this.K0;
    }

    public float getInnerTranslationX() {
        return this.K;
    }

    @Override
    public o2 getLastFragment() {
        if (this.K0.isEmpty()) {
            return null;
        }
        return (o2) j7.l1.j(1, this.K0);
    }

    public o2 getLastFragmentIncludeMainTabs() {
        o2 lastFragment = getLastFragment();
        if (lastFragment instanceof ng0) {
            return ((ng0) lastFragment).X();
        }
        return lastFragment;
    }

    @Override
    public d5 getMessageDrawableOutMediaStart() {
        return this.f22660b0;
    }

    @Override
    public d5 getMessageDrawableOutStart() {
        return this.f22657a0;
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
    public List<k9> getPulledDialogs() {
        return this.L0;
    }

    @Override
    public o2 getSafeLastFragment() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                o2 o2Var = (o2) getFragmentStack().get(size);
                if (o2Var != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack()) {
                    return o2Var;
                }
            }
            return null;
        }
        return null;
    }

    public sy getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.f22677i0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f22662c;
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
            ArrayList arrayList = this.f22669e1;
            StringBuilder f9 = u3.c.f(str, " ");
            f9.append(this.K0.size());
            arrayList.add(0, f9.toString());
            if (this.f22669e1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.f22669e1.get(i10));
                }
                this.f22669e1 = arrayList2;
            }
        }
        p pVar = this.f22672f1;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        AndroidUtilities.runOnUIThread(pVar, 500L);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.f22686o0) {
            U(this.f22687p0, this.f22688q0);
            this.f22686o0 = false;
        } else if (this.f22679j0) {
            a5 a5Var = new a5(this.f22681k0, this.f22685n0, this.m0, false);
            boolean z10 = this.f22683l0;
            if (!z10) {
                a5Var.f22748g = z10;
                a5Var.f22747f = z10;
            }
            f(a5Var, null);
            this.f22681k0 = null;
            this.f22679j0 = false;
        }
    }

    public final boolean j() {
        if (this.T) {
            return false;
        }
        if (this.S && (this.f22690r0 < System.currentTimeMillis() - 1500 || this.h)) {
            F(true);
        }
        return this.S;
    }

    public final void k(boolean z10) {
        l(z10, false);
    }

    public final void l(boolean z10, boolean z11) {
        boolean z12;
        o2 o2Var;
        boolean z13;
        boolean z14;
        o2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            y4 y4Var = this.F0;
            if ((y4Var == null || y4Var.k(this)) && !j() && !this.K0.isEmpty()) {
                Activity activity = this.G0;
                if (activity.getCurrentFocus() != null) {
                    AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                }
                setInnerTranslationX(0.0f);
                if (!z11 && (this.h || this.T || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o2 o2Var2 = (o2) j7.l1.j(1, this.K0);
                AnimatorSet animatorSet = null;
                if (this.K0.size() > 1) {
                    o2Var = (o2) j7.l1.j(2, this.K0);
                } else {
                    o2Var = null;
                }
                if (o2Var != null) {
                    if (g6.w0(null, g6.f23329s8, false) != -1 && (!o2Var.hasForceLightStatusBar() || g6.A0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    AndroidUtilities.setLightStatusBar(activity, z13);
                    x xVar = this.f22691s;
                    this.f22691s = this.v;
                    this.v = xVar;
                    o2Var.setParentLayout(this);
                    View view = o2Var.fragmentView;
                    if (view == null && (view = o2Var.performCreateView(activity)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        o oVar = new o(o2Var, 0);
                        WeakHashMap weakHashMap = r0.j0.f46829a;
                        r0.b0.j(view, oVar);
                        this.f22691s.invalidate();
                    }
                    if (!this.h) {
                        this.f22691s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            o2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                        this.f22691s.addView(view);
                        this.f22691s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                        this.f22691s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        l lVar = o2Var.actionBar;
                        if (lVar != null && lVar.G) {
                            if (this.f22701y0) {
                                lVar.setOccupyStatusBar(false);
                            }
                            AndroidUtilities.removeFromParent(o2Var.actionBar);
                            this.f22691s.addView(o2Var.actionBar);
                        }
                        o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                        o2Var.attachSheets(this.f22691s);
                    }
                    this.D = o2Var;
                    this.E = o2Var2;
                    o2Var.onTransitionAnimationStart(true, true);
                    o2Var2.onTransitionAnimationStart(false, true);
                    o2Var.onResume();
                    if (this.f22673g0 != null) {
                        this.f22668e0 = o2Var.getThemeDescriptions();
                    }
                    this.f22700y = o2Var.actionBar;
                    if (!o2Var.hasOwnBackground && view.getBackground() == null) {
                        view.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
                    }
                    if (z12) {
                        this.f22690r0 = System.currentTimeMillis();
                        this.S = true;
                        o2Var2.setRemovingFromStack(true);
                        this.f22694u0 = new l3.m(this, o2Var2, o2Var, 24);
                        if (!this.h && !this.T) {
                            animatorSet = o2Var2.onCustomTransitionAnimation(false, new p(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f22691s.f23948b || this.v.f23948b)) {
                                v2 v2Var = new v2(this, 1);
                                this.d = v2Var;
                                AndroidUtilities.runOnUIThread(v2Var, 200L);
                            } else {
                                if (!z15 && !this.T) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                d0(false, true, z14);
                            }
                        } else {
                            this.G = animatorSet;
                            mc mcVar = mc.f30644w;
                            if (mcVar != null && mcVar.f30654l) {
                                mcVar.b();
                            }
                        }
                        I("closeLastFragment");
                    } else {
                        m(o2Var2);
                        o2Var2.onTransitionAnimationEnd(false, true);
                        o2Var.onTransitionAnimationEnd(true, true);
                        o2Var.onBecomeFullyVisible();
                    }
                } else if (this.f22697w0 && !z11) {
                    this.f22690r0 = System.currentTimeMillis();
                    this.S = true;
                    this.f22694u0 = new c(1, this, o2Var2);
                    ArrayList arrayList = new ArrayList();
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.9f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.9f));
                    View view2 = this.f22699x0;
                    if (view2 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view2, property, 1.0f, 0.0f));
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.G = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.G.setInterpolator(this.J);
                    this.G.setDuration(200L);
                    this.G.addListener(new r(this, 0));
                    this.G.start();
                } else {
                    b0(o2Var2, false);
                    setVisibility(8);
                    View view3 = this.f22699x0;
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
        this.K0.remove(o2Var);
        this.v.setVisibility(4);
        this.v.setTranslationY(0.0f);
        bringChildToFront(this.f22691s);
        x xVar = this.f22696w;
        if (xVar != null) {
            bringChildToFront(xVar);
        }
        I("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((o2) j7.l1.j(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void o(View view, r0.m1 m1Var) {
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
        r0.c1 y0Var;
        boolean z11 = this.I0;
        if (z11) {
            if ((view instanceof x) && ((x) view).f23956x) {
                int i18 = m1Var.f46843a.f(8).d;
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
                r0.m1 m1Var2 = r0.m1.f46842b;
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
            r0.j0.b(view, r0.m1.f46842b);
            return;
        }
        boolean z12 = this.J0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.b bVar = this.f22680j1;
        i0.b bVar2 = this.f22682k1;
        if (view instanceof m3) {
            if (z12) {
                i15 = 0;
            } else {
                i15 = bVar.f8186a;
            }
            if (z10) {
                i16 = 0;
            } else {
                i16 = bVar.f8188c;
            }
            AndroidUtilities.setViewLayoutMargins(view, i15, 0, i16, bVar.d);
        } else if (view instanceof x) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            x xVar = (x) view;
            int v = v(false);
            if (v > 0) {
                i10 = bVar.d + v;
            } else {
                i10 = 0;
            }
            y3 y3Var = xVar.f23955w;
            if (y3Var != y3.f23984c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i11 = bVar2.f8186a;
            } else {
                i11 = 0;
            }
            if (!z13 && !z10) {
                i12 = bVar2.f8188c;
            } else {
                i12 = 0;
            }
            if (z13 && !z12) {
                i13 = 0;
            } else {
                i13 = bVar2.f8186a;
            }
            if (z13 && !z10) {
                i14 = 0;
            } else {
                i14 = bVar2.f8188c;
            }
            if (y3Var == y3.f23982a) {
                i10 = Math.max(i10, bVar2.d);
                r0.j0.b(view, r0.m1.f46842b);
            } else {
                r0.j0.b(view, m1Var.f46843a.m(i13, 0, i14, i10));
            }
            view.setPadding(i11, 0, i12, i10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22656a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.K0.isEmpty()) {
            int size = this.K0.size();
            for (int i10 = 0; i10 < size; i10++) {
                o2 o2Var = (o2) this.K0.get(i10);
                o2Var.onConfigurationChanged(configuration);
                Dialog dialog = o2Var.visibleDialog;
                if (dialog instanceof f3) {
                    ((f3) dialog).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22656a = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.P && !j() && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        l lVar;
        a0 a0Var;
        if (i10 == 82 && !j() && !this.M && (lVar = this.f22700y) != null && !lVar.s() && (a0Var = lVar.A) != null) {
            int childCount = a0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = a0Var.getChildAt(i11);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.getVisibility() != 0) {
                        continue;
                    } else if (w0Var.q()) {
                        w0Var.M(null, null);
                        break;
                    } else if (w0Var.O) {
                        a0Var.o(((Integer) w0Var.getTag()).intValue());
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
        if (!this.K0.isEmpty()) {
            o2Var = (o2) j7.l1.j(1, this.K0);
        } else {
            o2Var = null;
        }
        if (o2Var != null && !o2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            o2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + C, 1073741824));
            return;
        }
        y4 y4Var = this.F0;
        if (y4Var != null) {
            int[] iArr = this.U0;
            iArr[0] = i10;
            iArr[1] = i11;
            y4Var.e(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        }
        if (C() <= AndroidUtilities.dp(20.0f)) {
            z10 = false;
        }
        this.T0 = z10;
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean z10 = false;
        if (!j() && !this.f22692s0 && !this.P && !this.Z0) {
            if (this.K0.size() > 1 && ((sVar = this.C) == null || sVar.getLastSheet() == null || !this.C.getLastSheet().isShown())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((o2) j7.l1.j(1, this.K0)).isSwipeBackEnabled(motionEvent)) {
                        this.L = false;
                        this.M = false;
                        x xVar = this.f22691s;
                        if (xVar != null) {
                            xVar.setLayerType(0, null);
                            return false;
                        }
                    } else {
                        this.f22693t0 = motionEvent.getPointerId(0);
                        this.L = true;
                        this.N = (int) motionEvent.getX();
                        this.O = (int) motionEvent.getY();
                        VelocityTracker velocityTracker = this.Q;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f22693t0) {
                    if (this.Q == null) {
                        this.Q = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.N));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.O);
                    this.Q.addMovement(motionEvent);
                    if (!this.S && !this.h && this.L && !this.M && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                        if (((o2) j7.l1.j(1, this.K0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.N = (int) motionEvent.getX();
                            O();
                        } else {
                            this.L = false;
                        }
                    } else if (this.M) {
                        if (!this.R) {
                            Activity activity = this.G0;
                            if (activity.getCurrentFocus() != null) {
                                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                            }
                            ((o2) j7.l1.j(1, this.K0)).onBeginSlide();
                            this.R = true;
                        }
                        if (D()) {
                            float f9 = max;
                            this.f22691s.setTranslationX((f9 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                            setInnerTranslationX((f9 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        } else {
                            float f10 = max;
                            this.f22691s.setTranslationX(f10);
                            setInnerTranslationX(f10);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f22693t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.Q == null) {
                        this.Q = VelocityTracker.obtain();
                    }
                    this.Q.addMovement(motionEvent);
                    this.Q.computeCurrentVelocity(1000);
                    o2 o2Var = (o2) j7.l1.j(1, this.K0);
                    if (!this.h && !this.T && !this.M && o2Var.isSwipeBackEnabled(motionEvent)) {
                        float xVelocity = this.Q.getXVelocity();
                        float yVelocity = this.Q.getYVelocity();
                        if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && o2Var.canBeginSlide()) {
                            this.N = (int) motionEvent.getX();
                            O();
                            if (!this.R) {
                                if (((Activity) getContext()).getCurrentFocus() != null) {
                                    AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
                                }
                                this.R = true;
                            }
                        }
                    }
                    if (this.M) {
                        float x4 = this.f22691s.getX();
                        float xVelocity2 = this.Q.getXVelocity();
                        float yVelocity2 = this.Q.getYVelocity();
                        if (!D() ? x4 < this.f22691s.getMeasuredWidth() / 3.0f : !(x4 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.L = false;
                        this.M = false;
                        x xVar2 = this.f22691s;
                        if (xVar2 != null) {
                            xVar2.setLayerType(0, null);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.Q;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.Q = null;
                    }
                } else if (motionEvent == null) {
                    this.L = false;
                    this.M = false;
                    x xVar3 = this.f22691s;
                    if (xVar3 != null) {
                        xVar3.setLayerType(0, null);
                    }
                    VelocityTracker velocityTracker3 = this.Q;
                    if (velocityTracker3 != null) {
                        velocityTracker3.recycle();
                        this.Q = null;
                    }
                }
            }
            return this.M;
        }
        return false;
    }

    public final void p(Canvas canvas, int i10, int i11) {
        if (l1 != null && SharedConfig.drawActionBarShadow) {
            int i12 = i10 / 2;
            if (l1.getAlpha() != i12) {
                l1.setAlpha(i12);
            }
            l1.setBounds(0, i11, getMeasuredWidth(), l1.getIntrinsicHeight() + i11);
            l1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.f22684n = true;
        this.h = false;
        o2 o2Var = (o2) j7.l1.j(1, this.K0);
        o2Var.fragmentView.setOutlineProvider(null);
        o2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        o2Var.fragmentView.setLayoutParams(layoutParams);
        T((o2) j7.l1.j(2, this.K0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(o2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(o2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new jr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new bg.c3(13, this, o2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f22691s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
        this.f22691s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
        o2Var.setInPreviewMode(false);
        o2Var.setInMenuMode(false);
        try {
            Activity activity = this.G0;
            if (g6.w0(null, g6.f23329s8, false) != -1 && (!o2Var.hasForceLightStatusBar() || g6.A0().q())) {
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
        if (!this.K0.isEmpty() && ((o2) j7.l1.j(1, this.K0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.f22699x0 = view;
    }

    @Override
    public void setDelegate(y4 y4Var) {
        this.F0 = y4Var;
    }

    @Override
    public void setDrawerLayoutContainer(x3 x3Var) {
        this.f22698x = x3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i10) {
        x xVar = this.f22691s;
        if (xVar != null) {
            xVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<o2> list) {
        this.K0 = list;
        m3 m3Var = this.A;
        if (m3Var != null) {
            p pVar = new p(this, 0);
            p pVar2 = new p(this, 1);
            m3Var.E.remove(pVar);
            m3Var.F.remove(pVar2);
            AndroidUtilities.removeFromParent(this.A);
            this.A = null;
        }
        boolean z10 = this.H0;
        Activity activity = this.G0;
        if (z10) {
            m3 m3Var2 = new m3(activity, this);
            this.A = m3Var2;
            this.B = new a5.j(m3Var2);
            m3 m3Var3 = this.A;
            p pVar3 = new p(this, 0);
            p pVar4 = new p(this, 1);
            m3Var3.E.add(pVar3);
            m3Var3.F.add(pVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.A, layoutParams);
            v3 v3Var = LaunchActivity.C1.f35601u0;
            if (v3Var != null) {
                v3Var.setTabsView(this.A);
            }
        }
        x xVar = this.v;
        if (xVar != null) {
            AndroidUtilities.removeFromParent(xVar);
        }
        x xVar2 = new x(activity, this);
        this.v = xVar2;
        addView(xVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.v.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        layoutParams2.gravity = 51;
        this.v.setLayoutParams(layoutParams2);
        x xVar3 = this.f22691s;
        if (xVar3 != null) {
            AndroidUtilities.removeFromParent(xVar3);
        }
        x xVar4 = new x(activity, this);
        this.f22691s = xVar4;
        addView(xVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f22691s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f22691s.setLayoutParams(layoutParams3);
        x xVar5 = this.f22696w;
        if (xVar5 != null) {
            AndroidUtilities.removeFromParent(xVar5);
        }
        x xVar6 = new x(activity, this);
        this.f22696w = xVar6;
        this.X0.f27664a = xVar6;
        addView(xVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f22696w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f22696w.setLayoutParams(layoutParams4);
        s sVar = this.C;
        if (sVar != null) {
            sVar.setParentLayout(this);
            s sVar2 = this.C;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f22696w) {
                AndroidUtilities.removeFromParent(view);
                this.f22696w.addView(view, i7.f6.c(-1.0f, -1));
                this.f22696w.setShouldHandleBottomInsets(this.C.getEdgeToEdgeSupportMode());
            }
            this.C.onResume();
            this.C.onBecomeFullyVisible();
        }
        for (o2 o2Var : this.K0) {
            o2Var.setParentLayout(this);
        }
    }

    public void setFragmentStackChangedListener(Runnable runnable) {
        this.O0 = runnable;
    }

    @Override
    public void setInBubbleMode(boolean z10) {
        this.f22670f = z10;
    }

    public void setInnerTranslationX(float f9) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.K = f9;
        invalidate();
        if (this.K0.size() >= 2 && this.f22691s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.clamp01(f9 / (AndroidUtilities.dp(56.0f) * 6));
            } else {
                measuredWidth = f9 / this.f22691s.getMeasuredWidth();
            }
            o2 o2Var = (o2) j7.l1.j(2, this.K0);
            o2Var.onSlideProgress(false, measuredWidth);
            o2 o2Var2 = (o2) j7.l1.j(1, this.K0);
            float a2 = i7.w.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (o2Var2.isBeginToShow() && (navigationBarColor = o2Var2.getNavigationBarColor()) != (navigationBarColor2 = o2Var.getNavigationBarColor())) {
                o2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f22659b = z10;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (this.f22676h1 != i10) {
            this.f22676h1 = i10;
            invalidate();
        }
        x3 x3Var = this.f22698x;
        if (x3Var != null) {
            x3Var.setInternalNavigationBarColor(i10);
        }
        m3 m3Var = this.A;
        if (m3Var != null) {
            if (!this.M && !this.P) {
                z10 = true;
            } else {
                z10 = false;
            }
            m3Var.i(i10, z10);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.P0 = i10;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<k9> list) {
        this.L0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.f22701y0 = z10;
    }

    public void setThemeAnimationValue(float f9) {
        this.f22677i0 = f9;
        ArrayList arrayList = this.f22665d0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i10);
            int[] iArr = (int[]) this.U.get(i10);
            int[] iArr2 = (int[]) this.V.get(i10);
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
                int argb = Color.argb(Math.min(255, (int) (((alpha - alpha2) * f9) + alpha2)), Math.min(255, (int) (((red - red2) * f9) + red2)), Math.min(255, (int) (((green - green2) * f9) + green2)), Math.min(255, (int) (((blue - blue2) * f9) + blue2)));
                i6 i6Var = (i6) arrayList2.get(i11);
                int i14 = i6Var.f23536f;
                c6 c6Var = i6Var.f23544o;
                if (c6Var != null) {
                    c6Var.L0(i14, argb);
                } else {
                    SparseIntArray sparseIntArray = g6.sl;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i14, argb);
                    }
                }
                i6Var.d(argb, false, false);
                i11++;
                i10 = i13;
                arrayList = arrayList3;
                size = i12;
            }
            i10++;
        }
        ArrayList arrayList4 = this.f22671f0;
        int size3 = arrayList4.size();
        for (int i15 = 0; i15 < size3; i15++) {
            h6 h6Var = (h6) arrayList4.get(i15);
            if (h6Var != null) {
                h6Var.b();
                h6Var.a(f9);
            }
        }
        ArrayList arrayList5 = this.f22668e0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                i6 i6Var2 = (i6) this.f22668e0.get(i16);
                i6Var2.d(g6.v0(i6Var2.f23536f, i6Var2.f23544o), false, false);
            }
        }
        on onVar = this.f22663c0;
        if (onVar != null) {
            rn rnVar = onVar.f41198a;
            rnVar.R.f42973t0.invalidate();
            rnVar.E.I = f9;
            rnVar.F.I = f9;
            rnVar.k(f9);
        }
        y4 y4Var = this.F0;
        if (y4Var != null) {
            y4Var.a(f9);
        }
        x(this);
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.f22697w0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f22662c = window;
    }

    public final o2 t() {
        if (!getFragmentStack().isEmpty()) {
            for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
                o2 o2Var = (o2) getFragmentStack().get(size);
                if (o2Var != null && !o2Var.isFinishing() && !o2Var.isRemovingFromStack() && fg0.class.isInstance(o2Var)) {
                    return o2Var;
                }
            }
            return null;
        }
        return null;
    }

    public final int v(boolean z10) {
        m3 m3Var;
        if (this.H0 && (m3Var = this.A) != null) {
            if (z10) {
                return (int) m3Var.C;
            }
            return m3Var.D;
        }
        return 0;
    }

    public final sy w() {
        Activity activity = this.G0;
        if (activity == null) {
            return null;
        }
        if (this.C == null) {
            s sVar = new s(this);
            this.C = sVar;
            sVar.setParentLayout(this);
            s sVar2 = this.C;
            View view = sVar2.fragmentView;
            if (view == null) {
                view = sVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f22696w) {
                AndroidUtilities.removeFromParent(view);
                this.f22696w.addView(view, i7.f6.c(-1.0f, -1));
                this.f22696w.setShouldHandleBottomInsets(this.C.getEdgeToEdgeSupportMode());
                this.f22696w.setDrawNavigationBar(this.C.drawEdgeNavigationBar());
            }
            this.C.onResume();
            this.C.onBecomeFullyVisible();
        }
        return this.C;
    }

    public final boolean y() {
        if (!this.h && !this.T) {
            return false;
        }
        return true;
    }

    public final boolean z() {
        return this.I0;
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
