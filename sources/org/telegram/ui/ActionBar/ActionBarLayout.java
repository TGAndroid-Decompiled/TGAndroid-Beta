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
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.l80;
import org.telegram.ui.ln;
import org.telegram.ui.ng0;
import org.telegram.ui.on;
import org.telegram.ui.qy;
public class ActionBarLayout extends FrameLayout implements b5, uf.b {
    public static Drawable l1;
    public static Drawable f22642m1;
    public static Paint f22643n1;
    public m3 A;
    public float A0;
    public b3.b B;
    public long B0;
    public r C;
    public String C0;
    public o2 D;
    public int D0;
    public o2 E;
    public l80 E0;
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
    public final g5.b W;
    public int W0;
    public final org.telegram.ui.Components.y5 X0;
    public boolean Y0;
    public boolean Z0;
    public boolean f22644a;
    public d5 f22645a0;
    public boolean f22646a1;
    public boolean f22647b;
    public d5 f22648b0;
    public float f22649b1;
    public Window f22650c;
    public ln f22651c0;
    public boolean f22652c1;
    public Runnable d;
    public final ArrayList f22653d0;
    public AnimatorSet f22654d1;
    public Runnable f22655e;
    public ArrayList f22656e0;
    public ArrayList f22657e1;
    public boolean f22658f;
    public final ArrayList f22659f0;
    public final o f22660f1;
    public AnimatorSet f22661g0;
    public boolean f22662g1;
    public boolean h;
    public final AnimationNotificationsLocker f22663h0;
    public int f22664h1;
    public float f22665i0;
    public r0.m1 f22666i1;
    public boolean f22667j0;
    public i0.b f22668j1;
    public e6 f22669k0;
    public i0.b f22670k1;
    public boolean f22671l0;
    public boolean m0;
    public boolean f22672n;
    public int f22673n0;
    public boolean f22674o0;
    public boolean f22675p0;
    public boolean f22676q0;
    public ColorDrawable f22677r;
    public long f22678r0;
    public w f22679s;
    public boolean f22680s0;
    public int f22681t0;
    public Runnable f22682u0;
    public w v;
    public Runnable f22683v0;
    public w f22684w;
    public boolean f22685w0;
    public x3 f22686x;
    public View f22687x0;
    public k f22688y;
    public boolean f22689y0;
    public s f22690z0;

    public ActionBarLayout(Context context, boolean z10) {
        super(context);
        this.H = new DecelerateInterpolator(1.5f);
        this.I = new OvershootInterpolator(1.02f);
        this.J = new AccelerateDecelerateInterpolator();
        this.U = new ArrayList();
        this.V = new ArrayList();
        g5.b bVar = new g5.b(28);
        bVar.f7111b = new SparseIntArray();
        bVar.f7112c = new int[]{f6.Aa, f6.Da, f6.Ea, f6.Fa, f6.f22952ac, f6.Ca};
        this.W = bVar;
        this.f22653d0 = new ArrayList();
        this.f22659f0 = new ArrayList();
        this.f22663h0 = new AnimationNotificationsLocker();
        this.M0 = new Rect();
        this.P0 = -1;
        this.R0 = new Path();
        this.S0 = new float[8];
        this.U0 = new int[2];
        this.X0 = new org.telegram.ui.Components.y5(this, 280L, gr.h);
        this.f22657e1 = new ArrayList();
        this.f22660f1 = new o(this, 2);
        i0.b bVar2 = i0.b.f10847e;
        this.f22668j1 = bVar2;
        this.f22670k1 = bVar2;
        this.G0 = (Activity) context;
        this.H0 = z10;
        if (f22642m1 == null) {
            f22642m1 = getResources().getDrawable(R.drawable.layer_shadow);
            l1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f22643n1 = new Paint();
        }
        n nVar = new n(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(this, nVar);
    }

    public static void E(ArrayList arrayList, View view) {
        if (view instanceof uf.b) {
            arrayList.addAll(((uf.b) view).A());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                E(arrayList, viewGroup.getChildAt(i9));
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
            o2 o2Var = (o2) j3.r0.k(1, actionBarLayout.K0);
            o2Var.prepareFragmentToSlide(true, false);
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            List list = actionBarLayout.K0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            w wVar = actionBarLayout.f22679s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.v;
            actionBarLayout.f22679s = wVar2;
            actionBarLayout.v = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view = actionBarLayout.f22684w;
            if (view != null) {
                actionBarLayout.bringChildToFront(view);
            }
            if (actionBarLayout.K0.size() > 0) {
                o2 o2Var2 = (o2) j3.r0.k(1, actionBarLayout.K0);
                actionBarLayout.f22688y = o2Var2.actionBar;
                o2Var2.onResume();
                o2Var2.onBecomeFullyVisible();
                o2Var2.prepareFragmentToSlide(false, false);
            }
        } else if (actionBarLayout.K0.size() >= 2) {
            ((o2) j3.r0.k(1, actionBarLayout.K0)).prepareFragmentToSlide(true, false);
            o2 o2Var3 = (o2) j3.r0.k(2, actionBarLayout.K0);
            o2Var3.prepareFragmentToSlide(false, false);
            o2Var3.onPause();
            View view2 = o2Var3.fragmentView;
            if (view2 != null && (viewGroup2 = (ViewGroup) view2.getParent()) != null) {
                o2Var3.onRemoveFromParent();
                viewGroup2.removeViewInLayout(o2Var3.fragmentView);
            }
            k kVar = o2Var3.actionBar;
            if (kVar != null && kVar.G && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(o2Var3.actionBar);
            }
            o2Var3.detachSheets();
        }
        actionBarLayout.v.setVisibility(4);
        actionBarLayout.M = false;
        actionBarLayout.P = false;
        actionBarLayout.f22679s.setTranslationX(0.0f);
        actionBarLayout.v.setTranslationX(0.0f);
        actionBarLayout.f22679s.setLayerType(0, null);
        actionBarLayout.setInnerTranslationX(0.0f);
    }

    public static View u(ViewGroup viewGroup, float f10, float f11) {
        View u10;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt.getVisibility() == 0) {
                Rect rect = AndroidUtilities.rectTmp2;
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

    public static void x(ViewGroup viewGroup) {
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof w5) {
                ((w5) childAt).d();
            }
            if (childAt instanceof ViewGroup) {
                x((ViewGroup) childAt);
            }
        }
    }

    @Override
    public final List A() {
        o2 lastFragment = getLastFragment();
        if (lastFragment != null) {
            ArrayList arrayList = new ArrayList();
            if (lastFragment instanceof uf.b) {
                arrayList.addAll(((uf.b) lastFragment).A());
            }
            E(arrayList, lastFragment.getFragmentView());
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public final boolean B() {
        if (!this.S && !this.P) {
            return false;
        }
        return true;
    }

    public final int C() {
        int i9;
        View rootView = getRootView();
        Rect rect = this.M0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int height = rootView.getHeight();
        if (rect.top != 0) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        return Math.max(0, ((height - i9) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
    }

    public final boolean D() {
        if (this.Z0 && this.f22646a1) {
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
        s sVar = this.f22690z0;
        if (sVar != null) {
            AndroidUtilities.cancelRunOnUIThread(sVar);
            this.f22690z0 = null;
        }
        setAlpha(1.0f);
        this.f22679s.setAlpha(1.0f);
        this.f22679s.setScaleX(1.0f);
        this.f22679s.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
    }

    public final void G() {
        k kVar;
        if (!this.T && !this.M && !j() && !this.K0.isEmpty()) {
            j20 j20Var = j20.Z;
            if (j20Var != null && j20Var.f29606w) {
                j20Var.e(false);
                return;
            }
            if (!e0() && (kVar = this.f22688y) != null && !kVar.s()) {
                k kVar2 = this.f22688y;
                if (kVar2.f23577j0) {
                    kVar2.h(true);
                    return;
                }
            }
            r rVar = this.C;
            if ((rVar == null || rVar.onBackPressed(true)) && ((o2) j3.r0.k(1, this.K0)).onBackPressed(true) && !this.K0.isEmpty()) {
                l(true, false);
            }
        }
    }

    public final void H() {
        if (this.S && this.f22682u0 != null) {
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                this.G = null;
                animatorSet.cancel();
            }
            this.S = false;
            this.T = false;
            this.f22678r0 = 0L;
            this.D = null;
            this.E = null;
            Runnable runnable = this.f22682u0;
            this.f22682u0 = null;
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
        if (this.S && (runnable = this.f22683v0) != null) {
            this.S = false;
            this.T = false;
            this.f22678r0 = 0L;
            this.D = null;
            this.E = null;
            this.f22683v0 = null;
            runnable.run();
            i();
        }
    }

    public final void L() {
        if (!this.K0.isEmpty()) {
            ((o2) j3.r0.k(1, this.K0)).onPause();
        }
        r rVar = this.C;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void M() {
        if (!this.K0.isEmpty()) {
            ((o2) j3.r0.k(1, this.K0)).onResume();
        }
        r rVar = this.C;
        if (rVar != null) {
            rVar.onResume();
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
        o2 o2Var = (o2) j3.r0.k(2, this.K0);
        View view = o2Var.fragmentView;
        if (view == null && (view = o2Var.performCreateView(this.G0)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
            n nVar = new n(o2Var, 0);
            WeakHashMap weakHashMap = r0.j0.f46915a;
            r0.b0.j(view, nVar);
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
        if (kVar != null && kVar.G) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.f22689y0) {
                o2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(o2Var.actionBar);
        }
        o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
        o2Var.attachSheets(this.v);
        if (!o2Var.hasOwnBackground && view.getBackground() == null) {
            view.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
        }
        o2Var.onResume();
        if (this.f22661g0 != null) {
            this.f22656e0 = o2Var.getThemeDescriptions();
        }
        this.f22679s.setLayerType(2, null);
        ((o2) j3.r0.k(1, this.K0)).prepareFragmentToSlide(true, true);
        o2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(o2 o2Var) {
        return R(new z4(o2Var));
    }

    public final boolean Q(o2 o2Var, boolean z10) {
        z4 z4Var = new z4(o2Var);
        z4Var.f24009b = z10;
        return R(z4Var);
    }

    public final boolean R(org.telegram.ui.ActionBar.z4 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.R(org.telegram.ui.ActionBar.z4):boolean");
    }

    public final boolean S(o2 o2Var, boolean z10, boolean z11) {
        z4 z4Var = new z4(o2Var);
        z4Var.f24009b = z10;
        z4Var.f24010c = z11;
        z4Var.d = true;
        z4Var.f24011e = false;
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
            k kVar = o2Var.actionBar;
            if (kVar != null && kVar.G && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
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
            for (int i9 = 0; i9 < size; i9++) {
                ((o2) this.K0.get(i9)).clearViews();
                ((o2) this.K0.get(i9)).setParentLayout(this);
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
        this.f22674o0 = true;
        this.f22675p0 = z10;
        this.f22676q0 = z11;
    }

    public final void V() {
        U(true, true);
    }

    public final void W() {
        this.f22679s.removeAllViews();
        this.v.removeAllViews();
        this.f22688y = null;
        this.D = null;
        this.E = null;
    }

    public final void X() {
        while (this.K0.size() > 0) {
            b0((o2) this.K0.get(0), false);
        }
        View view = this.f22687x0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Y(int i9) {
        if (i9 >= 0 && i9 < getFragmentStack().size()) {
            Z((o2) getFragmentStack().get(i9));
        }
    }

    public final void Z(o2 o2Var) {
        a0(o2Var, false);
    }

    public final void a0(o2 o2Var, boolean z10) {
        boolean z11 = true;
        if ((this.K0.size() > 0 && j3.r0.k(1, this.K0) == o2Var) || (this.K0.size() > 1 && j3.r0.k(2, this.K0) == o2Var)) {
            K();
            H();
        }
        h("removeFragmentFromStack " + z10);
        if (this.f22685w0 && this.K0.size() == 1 && AndroidUtilities.isTablet()) {
            l(true, false);
            return;
        }
        if (this.F0 != null && this.K0.size() == 1 && AndroidUtilities.isTablet()) {
            this.F0.k(this);
        }
        b0(o2Var, (!o2Var.allowFinishFragmentInsteadOfRemoveFromStack() || z10) ? false : false);
    }

    @Override
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        r0.m1 m1Var = this.f22666i1;
        if (m1Var != null) {
            o(view, m1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            this.V.add(iArr);
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                iArr[i9] = ((h6) arrayList.get(i9)).b();
            }
        }
    }

    public final void b0(o2 o2Var, boolean z10) {
        if (!this.K0.contains(o2Var)) {
            return;
        }
        if (z10 && j3.r0.k(1, this.K0) == o2Var) {
            o2Var.finishFragment();
        } else if (j3.r0.k(1, this.K0) == o2Var && this.K0.size() > 1) {
            o2Var.finishFragment(false);
        } else {
            o2Var.onPause();
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
            this.K0.remove(o2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i9, o2 o2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        y4 y4Var = this.F0;
        if ((y4Var != null && !y4Var.h(o2Var, this)) || !o2Var.onFragmentCreate() || this.K0.contains(o2Var)) {
            return false;
        }
        o2Var.setParentLayout(this);
        Activity activity = this.G0;
        if (i9 != -1 && i9 != -2) {
            if (i9 == -3) {
                View view = o2Var.fragmentView;
                if (view == null) {
                    view = o2Var.performCreateView(activity);
                    if (view != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(o2Var, 0);
                        WeakHashMap weakHashMap = r0.j0.f46915a;
                        r0.b0.j(view, nVar);
                        this.f22679s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                    if (viewGroup3 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup3.removeView(view);
                    }
                }
                if (!o2Var.hasOwnBackground && view.getBackground() == null) {
                    view.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
                }
                w wVar = this.f22679s;
                wVar.addView(view, Utilities.clamp(0, wVar.getChildCount(), 0), g7.e6.c(-1.0f, -1));
                this.f22679s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.f22679s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar = o2Var.actionBar;
                if (kVar != null && kVar.G) {
                    if (this.f22689y0) {
                        kVar.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(o2Var.actionBar);
                    }
                    this.f22679s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                o2Var.attachSheets(this.f22679s);
                i9 = 0;
            }
            this.K0.add(i9, o2Var);
            I("addFragmentToStack");
        } else {
            if (!this.K0.isEmpty()) {
                o2 o2Var2 = (o2) j3.r0.k(1, this.K0);
                o2Var2.onPause();
                k kVar2 = o2Var2.actionBar;
                if (kVar2 != null && kVar2.G && (viewGroup2 = (ViewGroup) kVar2.getParent()) != null) {
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
            if (i9 != -2) {
                View view3 = o2Var.fragmentView;
                if (view3 == null) {
                    view3 = o2Var.performCreateView(activity);
                    if (view3 != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(o2Var, 0);
                        WeakHashMap weakHashMap2 = r0.j0.f46915a;
                        r0.b0.j(view3, nVar2);
                        this.f22679s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) view3.getParent();
                    if (viewGroup5 != null) {
                        o2Var.onRemoveFromParent();
                        viewGroup5.removeView(view3);
                    }
                }
                if (!o2Var.hasOwnBackground && view3.getBackground() == null) {
                    view3.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
                }
                this.f22679s.addView(view3, g7.e6.c(-1.0f, -1));
                this.f22679s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                this.f22679s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                k kVar3 = o2Var.actionBar;
                if (kVar3 != null && kVar3.G) {
                    if (this.f22689y0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) o2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(o2Var.actionBar);
                    }
                    this.f22679s.addView(o2Var.actionBar);
                }
                o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                o2Var.attachSheets(this.f22679s);
                o2Var.onResume();
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var.onTransitionAnimationEnd(true, true);
                o2Var.onBecomeFullyVisible();
            }
            I("addFragmentToStack " + i9);
        }
        if (!this.f22685w0) {
            setVisibility(0);
            View view4 = this.f22687x0;
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
                    for (int i9 = 0; i9 < size; i9++) {
                        o2 o2Var = (o2) this.K0.get(i9);
                        k kVar = o2Var.actionBar;
                        if (kVar != null && kVar.G && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
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
                            n nVar = new n(o2Var2, 0);
                            WeakHashMap weakHashMap = r0.j0.f46915a;
                            r0.b0.j(view2, nVar);
                            this.f22679s.invalidate();
                        }
                    } else {
                        ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                        if (viewGroup3 != null) {
                            o2Var2.onRemoveFromParent();
                            viewGroup3.removeView(view2);
                        }
                    }
                    this.f22679s.addView(view2, g7.e6.c(-1.0f, -1));
                    this.f22679s.setShouldHandleBottomInsets(o2Var2.getEdgeToEdgeSupportMode());
                    this.f22679s.setDrawNavigationBar(o2Var2.drawEdgeNavigationBar());
                    k kVar2 = o2Var2.actionBar;
                    if (kVar2 != null && kVar2.G) {
                        if (this.f22689y0) {
                            kVar2.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(o2Var2.actionBar);
                        this.f22679s.addView(o2Var2.actionBar);
                    }
                    o2Var2.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                    o2Var2.attachSheets(this.f22679s);
                    o2Var2.onResume();
                    o2Var2.onBecomeFullyVisible();
                    this.f22688y = o2Var2.actionBar;
                    if (!o2Var2.hasOwnBackground && view2.getBackground() == null) {
                        view2.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
                    }
                }
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList != null) {
            this.f22653d0.add(arrayList);
            int[] iArr = new int[arrayList.size()];
            this.U.add(iArr);
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                h6 h6Var = (h6) arrayList.get(i9);
                iArr[i9] = h6Var.b();
                g6 g6Var = h6Var.h;
                h6Var.h = null;
                if (g6Var != null) {
                    ArrayList arrayList2 = this.f22659f0;
                    if (!arrayList2.contains(g6Var)) {
                        arrayList2.add(g6Var);
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
        s sVar = new s(this, z11, z12, z10);
        this.f22690z0 = sVar;
        AndroidUtilities.runOnUIThread(sVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.A != null && v(true) > 0) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.A.getMeasuredHeight() + this.f22668j1.d), getWidth(), getHeight(), this.A.getBackgroundPaint());
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
        int i9;
        Animator customSlideTransition;
        int i10;
        int i11;
        if (!this.K0.isEmpty()) {
            o2Var = (o2) j3.r0.k(1, this.K0);
        } else {
            o2Var = null;
        }
        if (o2Var == null) {
            return;
        }
        float x10 = this.f22679s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean shouldOverrideSlideTransition = o2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (!z10) {
            x10 = Math.abs(this.f22679s.getMeasuredWidth() - x10);
            int measuredWidth = (int) ((200.0f / this.f22679s.getMeasuredWidth()) * x10);
            if (D()) {
                i10 = 380;
            } else {
                i10 = 50;
            }
            int max = Math.max(measuredWidth, i10);
            if (!shouldOverrideSlideTransition) {
                w wVar = this.f22679s;
                int measuredWidth2 = wVar.getMeasuredWidth();
                if (this.Z0) {
                    i11 = AndroidUtilities.dp(56.0f);
                } else {
                    i11 = 0;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wVar, property, measuredWidth2 + i11);
                long j10 = max;
                animatorSet.playTogether(ofFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f22679s.getMeasuredWidth()).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(gr.h);
                }
            }
        } else {
            int measuredWidth3 = (int) ((320.0f / this.f22679s.getMeasuredWidth()) * x10);
            if (D()) {
                i9 = 320;
            } else {
                i9 = 120;
            }
            int max2 = Math.max(measuredWidth3, i9);
            if (!shouldOverrideSlideTransition) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f22679s, property, 0.0f);
                long j11 = max2;
                animatorSet.playTogether(ofFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(gr.h);
                }
            }
        }
        Animator customSlideTransition2 = o2Var.getCustomSlideTransition(false, z10, x10);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        o2 o2Var2 = (o2) j3.r0.k(2, this.K0);
        if (o2Var2 != null && (customSlideTransition = o2Var2.getCustomSlideTransition(false, z10, x10)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f22654d1 = animatorSet;
        animatorSet.start();
        this.P = true;
    }

    public final boolean e0() {
        o2 o2Var;
        if (!this.K0.isEmpty()) {
            o2Var = (o2) j3.r0.k(1, this.K0);
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

    public final void g(e6 e6Var, int i9, boolean z10, boolean z11, Runnable runnable) {
        f(new a5(e6Var, i9, z10, z11), runnable);
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
        w wVar;
        if (!this.h && !this.T && !this.f22672n) {
            return 0.0f;
        }
        o2 o2Var = this.E;
        if (o2Var != null && o2Var.inPreviewMode) {
            wVar = this.v;
        } else {
            wVar = this.f22679s;
        }
        return wVar.getAlpha();
    }

    public x3 getDrawerLayoutContainer() {
        return this.f22686x;
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
        return (o2) j3.r0.k(1, this.K0);
    }

    public o2 getLastFragmentIncludeMainTabs() {
        o2 lastFragment = getLastFragment();
        if (lastFragment instanceof ng0) {
            return ((ng0) lastFragment).W();
        }
        return lastFragment;
    }

    @Override
    public d5 getMessageDrawableOutMediaStart() {
        return this.f22648b0;
    }

    @Override
    public d5 getMessageDrawableOutStart() {
        return this.f22645a0;
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
    public List<f9> getPulledDialogs() {
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

    public qy getSheetFragment() {
        return w();
    }

    @Override
    public float getThemeAnimationValue() {
        return this.f22665i0;
    }

    @Override
    public Window getWindow() {
        Window window = this.f22650c;
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
            ArrayList arrayList = this.f22657e1;
            StringBuilder e10 = ta.b.e(str, " ");
            e10.append(this.K0.size());
            arrayList.add(0, e10.toString());
            if (this.f22657e1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < 10; i9++) {
                    arrayList2.add((String) this.f22657e1.get(i9));
                }
                this.f22657e1 = arrayList2;
            }
        }
        o oVar = this.f22660f1;
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 500L);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i() {
        if (this.f22674o0) {
            U(this.f22675p0, this.f22676q0);
            this.f22674o0 = false;
        } else if (this.f22667j0) {
            a5 a5Var = new a5(this.f22669k0, this.f22673n0, this.m0, false);
            boolean z10 = this.f22671l0;
            if (!z10) {
                a5Var.f22732g = z10;
                a5Var.f22731f = z10;
            }
            f(a5Var, null);
            this.f22669k0 = null;
            this.f22667j0 = false;
        }
    }

    public final boolean j() {
        if (this.T) {
            return false;
        }
        if (this.S && (this.f22678r0 < System.currentTimeMillis() - 1500 || this.h)) {
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
                o2 o2Var2 = (o2) j3.r0.k(1, this.K0);
                AnimatorSet animatorSet = null;
                if (this.K0.size() > 1) {
                    o2Var = (o2) j3.r0.k(2, this.K0);
                } else {
                    o2Var = null;
                }
                if (o2Var != null) {
                    if (f6.w0(null, f6.f23269s8, false) != -1 && (!o2Var.hasForceLightStatusBar() || f6.A0().q())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    AndroidUtilities.setLightStatusBar(activity, z13);
                    w wVar = this.f22679s;
                    this.f22679s = this.v;
                    this.v = wVar;
                    o2Var.setParentLayout(this);
                    View view = o2Var.fragmentView;
                    if (view == null && (view = o2Var.performCreateView(activity)) != null && o2Var.isSupportEdgeToEdge() && o2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(o2Var, 0);
                        WeakHashMap weakHashMap = r0.j0.f46915a;
                        r0.b0.j(view, nVar);
                        this.f22679s.invalidate();
                    }
                    if (!this.h) {
                        this.f22679s.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            o2Var.onRemoveFromParent();
                            try {
                                viewGroup.removeView(view);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                        this.f22679s.addView(view);
                        this.f22679s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
                        this.f22679s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.leftMargin = 0;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        layoutParams.topMargin = 0;
                        view.setLayoutParams(layoutParams);
                        k kVar = o2Var.actionBar;
                        if (kVar != null && kVar.G) {
                            if (this.f22689y0) {
                                kVar.setOccupyStatusBar(false);
                            }
                            AndroidUtilities.removeFromParent(o2Var.actionBar);
                            this.f22679s.addView(o2Var.actionBar);
                        }
                        o2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                        o2Var.attachSheets(this.f22679s);
                    }
                    this.D = o2Var;
                    this.E = o2Var2;
                    o2Var.onTransitionAnimationStart(true, true);
                    o2Var2.onTransitionAnimationStart(false, true);
                    o2Var.onResume();
                    if (this.f22661g0 != null) {
                        this.f22656e0 = o2Var.getThemeDescriptions();
                    }
                    this.f22688y = o2Var.actionBar;
                    if (!o2Var.hasOwnBackground && view.getBackground() == null) {
                        view.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
                    }
                    if (z12) {
                        this.f22678r0 = System.currentTimeMillis();
                        this.S = true;
                        o2Var2.setRemovingFromStack(true);
                        this.f22682u0 = new org.telegram.messenger.video.e(this, o2Var2, o2Var, 5);
                        if (!this.h && !this.T) {
                            animatorSet = o2Var2.onCustomTransitionAnimation(false, new o(this, 3));
                        }
                        if (animatorSet == null) {
                            boolean z15 = this.h;
                            if (!z15 && (this.f22679s.f23889b || this.v.f23889b)) {
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
                            gc gcVar = gc.f28729w;
                            if (gcVar != null && gcVar.f28739l) {
                                gcVar.b();
                            }
                        }
                        I("closeLastFragment");
                    } else {
                        m(o2Var2);
                        o2Var2.onTransitionAnimationEnd(false, true);
                        o2Var.onTransitionAnimationEnd(true, true);
                        o2Var.onBecomeFullyVisible();
                    }
                } else if (this.f22685w0 && !z11) {
                    this.f22678r0 = System.currentTimeMillis();
                    this.S = true;
                    this.f22682u0 = new org.telegram.messenger.voip.l0(4, this, o2Var2);
                    ArrayList arrayList = new ArrayList();
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.9f));
                    arrayList.add(ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.9f));
                    View view2 = this.f22687x0;
                    if (view2 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view2, property, 1.0f, 0.0f));
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.G = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.G.setInterpolator(this.J);
                    this.G.setDuration(200L);
                    this.G.addListener(new q(this, 0));
                    this.G.start();
                } else {
                    b0(o2Var2, false);
                    setVisibility(8);
                    View view3 = this.f22687x0;
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
        bringChildToFront(this.f22679s);
        w wVar = this.f22684w;
        if (wVar != null) {
            bringChildToFront(wVar);
        }
        I("closeLastFragmentInternalRemoveOld");
    }

    public final void n() {
        List fragmentStack = getFragmentStack();
        if (!fragmentStack.isEmpty()) {
            ((o2) j3.r0.k(1, fragmentStack)).dismissCurrentDialog();
        }
    }

    public final void o(View view, r0.m1 m1Var) {
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view2;
        int i16;
        r0.c1 y0Var;
        boolean z11 = this.I0;
        if (z11) {
            if ((view instanceof w) && ((w) view).f23897x) {
                int i17 = m1Var.f46929a.f(8).d;
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
                r0.m1 m1Var2 = r0.m1.f46928b;
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 34) {
                    y0Var = new r0.b1(m1Var2);
                } else if (i18 >= 30) {
                    y0Var = new r0.a1(m1Var2);
                } else if (i18 >= 29) {
                    y0Var = new r0.z0(m1Var2);
                } else {
                    y0Var = new r0.y0(m1Var2);
                }
                y0Var.c(8, i0.b.b(0, 0, 0, max));
                r0.j0.b(view, y0Var.b());
                return;
            }
            r0.j0.b(view, r0.m1.f46928b);
            return;
        }
        boolean z12 = this.J0;
        boolean z13 = true;
        if (!z11 && !z12 && (getParent() instanceof RelativeLayout)) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0.b bVar = this.f22668j1;
        i0.b bVar2 = this.f22670k1;
        if (view instanceof m3) {
            if (z12) {
                i14 = 0;
            } else {
                i14 = bVar.f10848a;
            }
            if (z10) {
                i15 = 0;
            } else {
                i15 = bVar.f10850c;
            }
            AndroidUtilities.setViewLayoutMargins(view, i14, 0, i15, bVar.d);
        } else if (view instanceof w) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            w wVar = (w) view;
            int v = v(false);
            if (v > 0) {
                i9 = bVar.d + v;
            } else {
                i9 = 0;
            }
            y3 y3Var = wVar.f23896w;
            if (y3Var != y3.f23979c) {
                z13 = false;
            }
            if (!z13 && !z12) {
                i10 = bVar2.f10848a;
            } else {
                i10 = 0;
            }
            if (!z13 && !z10) {
                i11 = bVar2.f10850c;
            } else {
                i11 = 0;
            }
            if (z13 && !z12) {
                i12 = 0;
            } else {
                i12 = bVar2.f10848a;
            }
            if (z13 && !z10) {
                i13 = 0;
            } else {
                i13 = bVar2.f10850c;
            }
            if (y3Var == y3.f23977a) {
                i9 = Math.max(i9, bVar2.d);
                r0.j0.b(view, r0.m1.f46928b);
            } else {
                r0.j0.b(view, m1Var.f46929a.m(i12, 0, i13, i9));
            }
            view.setPadding(i10, 0, i11, i9);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22644a = true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.K0.isEmpty()) {
            int size = this.K0.size();
            for (int i9 = 0; i9 < size; i9++) {
                o2 o2Var = (o2) this.K0.get(i9);
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
        this.f22644a = false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.P && !j() && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onKeyUp(int i9, KeyEvent keyEvent) {
        k kVar;
        z zVar;
        if (i9 == 82 && !j() && !this.M && (kVar = this.f22688y) != null && !kVar.s() && (zVar = kVar.A) != null) {
            int childCount = zVar.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof w0) {
                    w0 w0Var = (w0) childAt;
                    if (w0Var.getVisibility() != 0) {
                        continue;
                    } else if (w0Var.q()) {
                        w0Var.M(null, null);
                        break;
                    } else if (w0Var.O) {
                        zVar.o(((Integer) w0Var.getTag()).intValue());
                        break;
                    }
                }
                i10++;
            }
        }
        return super.onKeyUp(i9, keyEvent);
    }

    @Override
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        o2 o2Var;
        boolean z10 = true;
        if (!this.K0.isEmpty()) {
            o2Var = (o2) j3.r0.k(1, this.K0);
        } else {
            o2Var = null;
        }
        if (o2Var != null && !o2Var.isSupportEdgeToEdge() && e0()) {
            int C = C();
            o2Var.setKeyboardHeightFromParent(C);
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) + C, 1073741824));
            return;
        }
        y4 y4Var = this.F0;
        if (y4Var != null) {
            int[] iArr = this.U0;
            iArr[0] = i9;
            iArr[1] = i10;
            y4Var.e(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        }
        if (C() <= AndroidUtilities.dp(20.0f)) {
            z10 = false;
        }
        this.T0 = z10;
        super.onMeasure(i9, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z10 = false;
        if (!j() && !this.f22680s0 && !this.P && !this.Z0) {
            if (this.K0.size() > 1 && ((rVar = this.C) == null || rVar.getLastSheet() == null || !this.C.getLastSheet().isShown())) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    if (!((o2) j3.r0.k(1, this.K0)).isSwipeBackEnabled(motionEvent)) {
                        this.L = false;
                        this.M = false;
                        w wVar = this.f22679s;
                        if (wVar != null) {
                            wVar.setLayerType(0, null);
                            return false;
                        }
                    } else {
                        this.f22681t0 = motionEvent.getPointerId(0);
                        this.L = true;
                        this.N = (int) motionEvent.getX();
                        this.O = (int) motionEvent.getY();
                        VelocityTracker velocityTracker = this.Q;
                        if (velocityTracker != null) {
                            velocityTracker.clear();
                        }
                    }
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f22681t0) {
                    if (this.Q == null) {
                        this.Q = VelocityTracker.obtain();
                    }
                    int max = Math.max(0, (int) (motionEvent.getX() - this.N));
                    int abs = Math.abs(((int) motionEvent.getY()) - this.O);
                    this.Q.addMovement(motionEvent);
                    if (!this.S && !this.h && this.L && !this.M && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                        if (((o2) j3.r0.k(1, this.K0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
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
                            ((o2) j3.r0.k(1, this.K0)).onBeginSlide();
                            this.R = true;
                        }
                        if (D()) {
                            float f10 = max;
                            this.f22679s.setTranslationX((f10 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                            setInnerTranslationX((f10 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                        } else {
                            float f11 = max;
                            this.f22679s.setTranslationX(f11);
                            setInnerTranslationX(f11);
                        }
                    }
                } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f22681t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                    if (this.Q == null) {
                        this.Q = VelocityTracker.obtain();
                    }
                    this.Q.addMovement(motionEvent);
                    this.Q.computeCurrentVelocity(1000);
                    o2 o2Var = (o2) j3.r0.k(1, this.K0);
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
                        float x10 = this.f22679s.getX();
                        float xVelocity2 = this.Q.getXVelocity();
                        float yVelocity2 = this.Q.getYVelocity();
                        if (!D() ? x10 < this.f22679s.getMeasuredWidth() / 3.0f : !(x10 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                            if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                z10 = true;
                            }
                        }
                        e(z10);
                    } else {
                        this.L = false;
                        this.M = false;
                        w wVar2 = this.f22679s;
                        if (wVar2 != null) {
                            wVar2.setLayerType(0, null);
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
                    w wVar3 = this.f22679s;
                    if (wVar3 != null) {
                        wVar3.setLayerType(0, null);
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

    public final void p(Canvas canvas, int i9, int i10) {
        if (l1 != null && SharedConfig.drawActionBarShadow) {
            int i11 = i9 / 2;
            if (l1.getAlpha() != i11) {
                l1.setAlpha(i11);
            }
            l1.setBounds(0, i10, getMeasuredWidth(), l1.getIntrinsicHeight() + i10);
            l1.draw(canvas);
        }
    }

    public final void q(Canvas canvas, int i9) {
        p(canvas, 255, i9);
    }

    public final void r() {
        boolean z10 = true;
        this.f22672n = true;
        this.h = false;
        o2 o2Var = (o2) j3.r0.k(1, this.K0);
        o2Var.fragmentView.setOutlineProvider(null);
        o2Var.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        o2Var.fragmentView.setLayoutParams(layoutParams);
        T((o2) j3.r0.k(2, this.K0), false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(o2Var.fragmentView, View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(o2Var.fragmentView, View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new gr(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new fg.j(10, this, o2Var));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f22679s.setShouldHandleBottomInsets(o2Var.getEdgeToEdgeSupportMode());
        this.f22679s.setDrawNavigationBar(o2Var.drawEdgeNavigationBar());
        o2Var.setInPreviewMode(false);
        o2Var.setInMenuMode(false);
        try {
            Activity activity = this.G0;
            if (f6.w0(null, f6.f23269s8, false) != -1 && (!o2Var.hasForceLightStatusBar() || f6.A0().q())) {
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
        if (!this.K0.isEmpty() && ((o2) j3.r0.k(1, this.K0)).extendActionMode(menu)) {
            return true;
        }
        return false;
    }

    @Override
    public void setBackgroundView(View view) {
        this.f22687x0 = view;
    }

    @Override
    public void setDelegate(y4 y4Var) {
        this.F0 = y4Var;
    }

    @Override
    public void setDrawerLayoutContainer(x3 x3Var) {
        this.f22686x = x3Var;
    }

    @Override
    public void setFragmentPanTranslationOffset(int i9) {
        w wVar = this.f22679s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i9);
        }
    }

    @Override
    public void setFragmentStack(List<o2> list) {
        this.K0 = list;
        m3 m3Var = this.A;
        if (m3Var != null) {
            o oVar = new o(this, 0);
            o oVar2 = new o(this, 1);
            m3Var.E.remove(oVar);
            m3Var.F.remove(oVar2);
            AndroidUtilities.removeFromParent(this.A);
            this.A = null;
        }
        boolean z10 = this.H0;
        Activity activity = this.G0;
        if (z10) {
            m3 m3Var2 = new m3(activity, this);
            this.A = m3Var2;
            this.B = new b3.b(m3Var2);
            m3 m3Var3 = this.A;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            m3Var3.E.add(oVar3);
            m3Var3.F.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.A, layoutParams);
            v3 v3Var = LaunchActivity.C1.f35534u0;
            if (v3Var != null) {
                v3Var.setTabsView(this.A);
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
        w wVar3 = this.f22679s;
        if (wVar3 != null) {
            AndroidUtilities.removeFromParent(wVar3);
        }
        w wVar4 = new w(activity, this);
        this.f22679s = wVar4;
        addView(wVar4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f22679s.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.gravity = 51;
        this.f22679s.setLayoutParams(layoutParams3);
        w wVar5 = this.f22684w;
        if (wVar5 != null) {
            AndroidUtilities.removeFromParent(wVar5);
        }
        w wVar6 = new w(activity, this);
        this.f22684w = wVar6;
        this.X0.f34852a = wVar6;
        addView(wVar6);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f22684w.getLayoutParams();
        layoutParams4.width = -1;
        layoutParams4.height = -1;
        layoutParams4.gravity = 51;
        this.f22684w.setLayoutParams(layoutParams4);
        r rVar = this.C;
        if (rVar != null) {
            rVar.setParentLayout(this);
            r rVar2 = this.C;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f22684w) {
                AndroidUtilities.removeFromParent(view);
                this.f22684w.addView(view, g7.e6.c(-1.0f, -1));
                this.f22684w.setShouldHandleBottomInsets(this.C.getEdgeToEdgeSupportMode());
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
        this.f22658f = z10;
    }

    public void setInnerTranslationX(float f10) {
        float measuredWidth;
        int navigationBarColor;
        int navigationBarColor2;
        this.K = f10;
        invalidate();
        if (this.K0.size() >= 2 && this.f22679s.getMeasuredWidth() > 0) {
            if (D()) {
                measuredWidth = Utilities.clamp01(f10 / (AndroidUtilities.dp(56.0f) * 6));
            } else {
                measuredWidth = f10 / this.f22679s.getMeasuredWidth();
            }
            o2 o2Var = (o2) j3.r0.k(2, this.K0);
            o2Var.onSlideProgress(false, measuredWidth);
            o2 o2Var2 = (o2) j3.r0.k(1, this.K0);
            float a2 = g7.n.a(measuredWidth * 2.0f, 0.0f, 1.0f);
            if (o2Var2.isBeginToShow() && (navigationBarColor = o2Var2.getNavigationBarColor()) != (navigationBarColor2 = o2Var.getNavigationBarColor())) {
                o2Var2.setNavigationBarColor(i0.a.d(a2, navigationBarColor, navigationBarColor2));
            }
        }
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f22647b = z10;
    }

    @Override
    public void setNavigationBarColor(int i9) {
        boolean z10;
        if (this.f22664h1 != i9) {
            this.f22664h1 = i9;
            invalidate();
        }
        x3 x3Var = this.f22686x;
        if (x3Var != null) {
            x3Var.setInternalNavigationBarColor(i9);
        }
        m3 m3Var = this.A;
        if (m3Var != null) {
            if (!this.M && !this.P) {
                z10 = true;
            } else {
                z10 = false;
            }
            m3Var.i(i9, z10);
        }
    }

    public void setOverrideWidthOffset(int i9) {
        this.P0 = i9;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<f9> list) {
        this.L0 = list;
    }

    @Override
    public void setRemoveActionBarExtraHeight(boolean z10) {
        this.f22689y0 = z10;
    }

    public void setThemeAnimationValue(float f10) {
        this.f22665i0 = f10;
        ArrayList arrayList = this.f22653d0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i9);
            int[] iArr = (int[]) this.U.get(i9);
            int[] iArr2 = (int[]) this.V.get(i9);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                int red = Color.red(iArr2[i10]);
                int green = Color.green(iArr2[i10]);
                int blue = Color.blue(iArr2[i10]);
                int alpha = Color.alpha(iArr2[i10]);
                int red2 = Color.red(iArr[i10]);
                int green2 = Color.green(iArr[i10]);
                ArrayList arrayList3 = arrayList;
                int blue2 = Color.blue(iArr[i10]);
                int i11 = size;
                int alpha2 = Color.alpha(iArr[i10]);
                int i12 = i9;
                int argb = Color.argb(Math.min(255, (int) (((alpha - alpha2) * f10) + alpha2)), Math.min(255, (int) (((red - red2) * f10) + red2)), Math.min(255, (int) (((green - green2) * f10) + green2)), Math.min(255, (int) (((blue - blue2) * f10) + blue2)));
                h6 h6Var = (h6) arrayList2.get(i10);
                int i13 = h6Var.f23498f;
                b6 b6Var = h6Var.f23506o;
                if (b6Var != null) {
                    b6Var.c1(i13, argb);
                } else {
                    SparseIntArray sparseIntArray = f6.sl;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i13, argb);
                    }
                }
                h6Var.d(argb, false, false);
                i10++;
                i9 = i12;
                arrayList = arrayList3;
                size = i11;
            }
            i9++;
        }
        ArrayList arrayList4 = this.f22659f0;
        int size3 = arrayList4.size();
        for (int i14 = 0; i14 < size3; i14++) {
            g6 g6Var = (g6) arrayList4.get(i14);
            if (g6Var != null) {
                g6Var.b();
                g6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.f22656e0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i15 = 0; i15 < size4; i15++) {
                h6 h6Var2 = (h6) this.f22656e0.get(i15);
                h6Var2.d(f6.v0(h6Var2.f23498f, h6Var2.f23506o), false, false);
            }
        }
        ln lnVar = this.f22651c0;
        if (lnVar != null) {
            on onVar = lnVar.f40194a;
            onVar.R.f42077t0.invalidate();
            onVar.E.I = f10;
            onVar.F.I = f10;
            onVar.k(f10);
        }
        y4 y4Var = this.F0;
        if (y4Var != null) {
            y4Var.a(f10);
        }
        x(this);
    }

    @Override
    public void setUseAlphaAnimations(boolean z10) {
        this.f22685w0 = z10;
    }

    @Override
    public void setWindow(Window window) {
        this.f22650c = window;
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

    public final qy w() {
        Activity activity = this.G0;
        if (activity == null) {
            return null;
        }
        if (this.C == null) {
            r rVar = new r(this);
            this.C = rVar;
            rVar.setParentLayout(this);
            r rVar2 = this.C;
            View view = rVar2.fragmentView;
            if (view == null) {
                view = rVar2.performCreateView(activity);
            }
            if (view.getParent() != this.f22684w) {
                AndroidUtilities.removeFromParent(view);
                this.f22684w.addView(view, g7.e6.c(-1.0f, -1));
                this.f22684w.setShouldHandleBottomInsets(this.C.getEdgeToEdgeSupportMode());
                this.f22684w.setDrawNavigationBar(this.C.drawEdgeNavigationBar());
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
