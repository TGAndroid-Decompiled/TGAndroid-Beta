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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sd;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.n20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ig0;
import org.telegram.ui.mn;
import org.telegram.ui.p80;
import org.telegram.ui.pn;
import org.telegram.ui.qg0;
import org.telegram.ui.rn;
import org.telegram.ui.ty;

public class ActionBarLayout extends FrameLayout implements b5, vf.b {
    public static Drawable l1;

    public static Drawable f22642m1;

    public static Paint f22643n1;
    public m3 A;
    public float A0;
    public af.h B;
    public long B0;
    public r C;
    public String C0;
    public n2 D;
    public int D0;
    public n2 E;
    public p80 E0;
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

    public mn f22651c0;

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

    public i0.c f22668j1;

    public f6 f22669k0;

    public i0.c f22670k1;

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
        g5.b bVar = new g5.b(29);
        bVar.f6389b = new SparseIntArray();
        bVar.f6390c = new int[]{g6.Aa, g6.Da, g6.Ea, g6.Fa, g6.f23004ac, g6.Ca};
        this.W = bVar;
        this.f22653d0 = new ArrayList();
        this.f22659f0 = new ArrayList();
        this.f22663h0 = new AnimationNotificationsLocker();
        this.M0 = new Rect();
        this.P0 = -1;
        this.R0 = new Path();
        this.S0 = new float[8];
        this.U0 = new int[2];
        this.X0 = new org.telegram.ui.Components.y5(this, 280L, er.h);
        this.f22657e1 = new ArrayList();
        this.f22660f1 = new o(this, 2);
        i0.c cVar = i0.c.f10488e;
        this.f22668j1 = cVar;
        this.f22670k1 = cVar;
        this.G0 = (Activity) context;
        this.H0 = z10;
        if (f22642m1 == null) {
            f22642m1 = getResources().getDrawable(R.drawable.layer_shadow);
            l1 = getResources().getDrawable(R.drawable.header_shadow).mutate();
            f22643n1 = new Paint();
        }
        n nVar = new n(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(this, nVar);
    }

    public static void E(ArrayList arrayList, View view) {
        if (view instanceof vf.b) {
            arrayList.addAll(((vf.b) view).C());
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
        if (z10) {
            if (actionBarLayout.K0.size() >= 2) {
                ((n2) i0.a.j(1, actionBarLayout.K0)).prepareFragmentToSlide(true, false);
                n2 n2Var = (n2) i0.a.j(2, actionBarLayout.K0);
                n2Var.prepareFragmentToSlide(false, false);
                n2Var.onPause();
                View view = n2Var.fragmentView;
                if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                    n2Var.onRemoveFromParent();
                    viewGroup2.removeViewInLayout(n2Var.fragmentView);
                }
                k kVar = n2Var.actionBar;
                if (kVar != null && kVar.G && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup.removeViewInLayout(n2Var.actionBar);
                }
                n2Var.detachSheets();
            }
        } else {
            if (actionBarLayout.K0.size() < 2) {
                actionBarLayout.h("onSlideAnimationEnd exit");
                return;
            }
            n2 n2Var2 = (n2) i0.a.j(1, actionBarLayout.K0);
            n2Var2.prepareFragmentToSlide(true, false);
            n2Var2.onPause();
            n2Var2.onFragmentDestroy();
            n2Var2.setParentLayout(null);
            List list = actionBarLayout.K0;
            list.remove(list.size() - 1);
            actionBarLayout.I("onSlideAnimationEnd");
            w wVar = actionBarLayout.f22679s;
            wVar.setAlpha(1.0f);
            w wVar2 = actionBarLayout.v;
            actionBarLayout.f22679s = wVar2;
            actionBarLayout.v = wVar;
            actionBarLayout.bringChildToFront(wVar2);
            View view2 = actionBarLayout.f22684w;
            if (view2 != null) {
                actionBarLayout.bringChildToFront(view2);
            }
            if (actionBarLayout.K0.size() > 0) {
                n2 n2Var3 = (n2) i0.a.j(1, actionBarLayout.K0);
                actionBarLayout.f22688y = n2Var3.actionBar;
                n2Var3.onResume();
                n2Var3.onBecomeFullyVisible();
                n2Var3.prepareFragmentToSlide(false, false);
            }
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
        View viewU;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                Rect rect = AndroidUtilities.rectTmp2;
                childAt.getHitRect(rect);
                if (!rect.contains((int) f10, (int) f11)) {
                    continue;
                } else {
                    if (childAt.canScrollHorizontally(-1)) {
                        return childAt;
                    }
                    if ((childAt instanceof ViewGroup) && (viewU = u((ViewGroup) childAt, f10 - rect.left, f11 - rect.top)) != null) {
                        return viewU;
                    }
                }
            }
        }
        return null;
    }

    public static void x(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof x5) {
                ((x5) childAt).d();
            }
            if (childAt instanceof ViewGroup) {
                x((ViewGroup) childAt);
            }
        }
    }

    public final boolean A() {
        return this.S || this.P;
    }

    public final int B() {
        View rootView = getRootView();
        Rect rect = this.M0;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
    }

    @Override
    public final List C() {
        n2 lastFragment = getLastFragment();
        if (lastFragment == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        if (lastFragment instanceof vf.b) {
            arrayList.addAll(((vf.b) lastFragment).C());
        }
        E(arrayList, lastFragment.getFragmentView());
        return arrayList;
    }

    public final boolean D() {
        return this.Z0 && this.f22646a1;
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
        if (this.T || this.M || j() || this.K0.isEmpty()) {
            return;
        }
        n20 n20Var = n20.Z;
        if (n20Var != null && n20Var.f30827w) {
            n20Var.e(false);
            return;
        }
        if (!e0() && (kVar = this.f22688y) != null && !kVar.t()) {
            k kVar2 = this.f22688y;
            if (kVar2.f23578j0) {
                kVar2.h(true);
                return;
            }
        }
        r rVar = this.C;
        if ((rVar == null || rVar.onBackPressed(true)) && ((n2) i0.a.j(1, this.K0)).onBackPressed(true) && !this.K0.isEmpty()) {
            l(true, false);
        }
    }

    public final void H() {
        if (!this.S || this.f22682u0 == null) {
            return;
        }
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

    public final void I(String str) {
        Runnable runnable = this.O0;
        if (runnable != null) {
            runnable.run();
        }
        ImageLoader.getInstance().onFragmentStackChanged();
        h(str);
    }

    public final void J() {
        Iterator it = this.K0.iterator();
        while (it.hasNext()) {
            ((n2) it.next()).onLowMemory();
        }
    }

    public final void K() {
        Runnable runnable;
        if (!this.S || (runnable = this.f22683v0) == null) {
            return;
        }
        this.S = false;
        this.T = false;
        this.f22678r0 = 0L;
        this.D = null;
        this.E = null;
        this.f22683v0 = null;
        runnable.run();
        i();
    }

    public final void L() {
        if (!this.K0.isEmpty()) {
            ((n2) i0.a.j(1, this.K0)).onPause();
        }
        r rVar = this.C;
        if (rVar != null) {
            rVar.onPause();
        }
    }

    public final void M() {
        if (!this.K0.isEmpty()) {
            ((n2) i0.a.j(1, this.K0)).onResume();
        }
        r rVar = this.C;
        if (rVar != null) {
            rVar.onResume();
        }
    }

    public final void N(Canvas canvas, ViewGroup viewGroup) {
        if (this.A == null || getHeight() >= viewGroup.getHeight()) {
            return;
        }
        canvas.save();
        canvas.translate(this.A.getX() + getX(), this.A.getY() + getY());
        this.A.draw(canvas);
        canvas.restore();
    }

    public final void O() {
        int i10 = 0;
        this.L = false;
        this.M = true;
        this.v.setVisibility(0);
        this.R = false;
        n2 n2Var = (n2) i0.a.j(2, this.K0);
        View viewPerformCreateView = n2Var.fragmentView;
        if (viewPerformCreateView == null && (viewPerformCreateView = n2Var.performCreateView(this.G0)) != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
            n nVar = new n(n2Var, i10);
            WeakHashMap weakHashMap = r0.j0.f46605a;
            r0.b0.j(viewPerformCreateView, nVar);
            this.v.invalidate();
        }
        ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
        if (viewGroup != null) {
            n2Var.onRemoveFromParent();
            viewGroup.removeView(viewPerformCreateView);
        }
        this.v.addView(viewPerformCreateView);
        this.v.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
        this.v.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewPerformCreateView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        viewPerformCreateView.setLayoutParams(layoutParams);
        k kVar = n2Var.actionBar;
        if (kVar != null && kVar.G) {
            AndroidUtilities.removeFromParent(kVar);
            if (this.f22689y0) {
                n2Var.actionBar.setOccupyStatusBar(false);
            }
            this.v.addView(n2Var.actionBar);
        }
        n2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
        n2Var.attachSheets(this.v);
        if (!n2Var.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
            viewPerformCreateView.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
        }
        n2Var.onResume();
        if (this.f22661g0 != null) {
            this.f22656e0 = n2Var.getThemeDescriptions();
        }
        this.f22679s.setLayerType(2, null);
        ((n2) i0.a.j(1, this.K0)).prepareFragmentToSlide(true, true);
        n2Var.prepareFragmentToSlide(false, true);
    }

    public final boolean P(n2 n2Var) {
        return R(new z4(n2Var));
    }

    public final boolean Q(n2 n2Var, boolean z10) {
        z4 z4Var = new z4(n2Var);
        z4Var.f24000b = z10;
        return R(z4Var);
    }

    public final boolean R(z4 z4Var) {
        y4 y4Var;
        ArrayList arrayList;
        int iDp;
        LaunchActivity launchActivity;
        Dialog dialog;
        n2 n2Var = z4Var.f23999a;
        boolean z10 = z4Var.f24000b;
        boolean z11 = z4Var.f24001c;
        boolean z12 = z4Var.d;
        boolean z13 = z4Var.f24002e;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z4Var.f24003f;
        int i10 = 0;
        if (n2Var == null || j() || !(((y4Var = this.F0) == null || !z12 || y4Var.l(this, z4Var)) && n2Var.onFragmentCreate())) {
            return false;
        }
        y3 edgeToEdgeSupportMode = n2Var.getEdgeToEdgeSupportMode();
        y3 y3Var = y3.f23971a;
        int i11 = 1;
        boolean z14 = edgeToEdgeSupportMode != y3Var;
        boolean zDrawEdgeNavigationBar = n2Var.drawEdgeNavigationBar();
        n2 lastFragment = getLastFragment();
        Dialog visibleDialog = lastFragment != null ? lastFragment.getVisibleDialog() : null;
        if (visibleDialog == null && (launchActivity = LaunchActivity.C1) != null) {
            ArrayList arrayList2 = launchActivity.A0;
            int size = arrayList2.size() - 1;
            while (true) {
                if (size < 0) {
                    dialog = null;
                    break;
                }
                dialog = (Dialog) arrayList2.get(size);
                if (dialog.isShowing()) {
                    break;
                }
                size--;
            }
            if (dialog != null) {
                ArrayList arrayList3 = LaunchActivity.C1.A0;
                int size2 = arrayList3.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        visibleDialog = null;
                        break;
                    }
                    Dialog dialog2 = (Dialog) arrayList3.get(size2);
                    if (dialog2.isShowing()) {
                        visibleDialog = dialog2;
                        break;
                    }
                    size2--;
                }
            }
        }
        if (lastFragment != null && visibleDialog != null && visibleDialog.isShowing() && ((visibleDialog instanceof gi) || (visibleDialog instanceof nh.b3))) {
            l2 l2Var = new l2();
            l2Var.f23619a = true;
            lastFragment.showAsSheet(n2Var, l2Var);
            return true;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("present fragment " + n2Var.getClass().getSimpleName() + " args=" + n2Var.getArguments());
        }
        int i12 = 0;
        while (true) {
            arrayList = i9.f13458u1;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((i9) arrayList.get(i12)).q(false);
            i12++;
        }
        arrayList.clear();
        m3 m3Var = this.A;
        if (m3Var != null && !m3Var.f23659c) {
            LaunchActivity.L();
        }
        if (this.h && this.T) {
            Runnable runnable = this.f22655e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.f22655e = null;
            }
            l(false, true);
        }
        n2Var.setInPreviewMode(z13);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.F;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
            if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getParent() != null) {
                ((ViewGroup) this.F.getParent()).removeView(this.F);
            }
            this.F = null;
        }
        this.F = actionBarPopupWindow$ActionBarPopupWindowLayout;
        n2Var.setInMenuMode(actionBarPopupWindow$ActionBarPopupWindowLayout != null);
        Activity activity = this.G0;
        if (activity.getCurrentFocus() != null && n2Var.hideKeyboardOnShow() && !z13) {
            AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
        }
        boolean z15 = z13 || (!z11 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        n2 n2Var2 = !this.K0.isEmpty() ? (n2) i0.a.j(1, this.K0) : null;
        n2Var.setParentLayout(this);
        View viewPerformCreateView = n2Var.fragmentView;
        if (viewPerformCreateView == null) {
            viewPerformCreateView = n2Var.performCreateView(activity);
            if (viewPerformCreateView != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
                n nVar = new n(n2Var, i10);
                WeakHashMap weakHashMap = r0.j0.f46605a;
                r0.b0.j(viewPerformCreateView, nVar);
                this.v.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
            if (viewGroup != null) {
                n2Var.onRemoveFromParent();
                viewGroup.removeView(viewPerformCreateView);
            }
        }
        this.v.addView(viewPerformCreateView);
        w wVar = this.v;
        if (z13) {
            edgeToEdgeSupportMode = y3Var;
        }
        wVar.setShouldHandleBottomInsets(edgeToEdgeSupportMode);
        this.v.setDrawNavigationBar(!z13 && zDrawEdgeNavigationBar);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            this.v.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            iDp = AndroidUtilities.dp(24.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.topMargin = ((getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - iDp) - AndroidUtilities.dp(6.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setLayoutParams(layoutParams);
        } else {
            iDp = 0;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewPerformCreateView.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (z13) {
            int previewHeight = n2Var.getPreviewHeight();
            int i13 = AndroidUtilities.statusBarHeight;
            if (previewHeight <= 0 || previewHeight >= getMeasuredHeight() - i13) {
                int iDp2 = AndroidUtilities.dp(actionBarPopupWindow$ActionBarPopupWindowLayout != null ? 0.0f : 24.0f);
                layoutParams2.bottomMargin = iDp2;
                layoutParams2.topMargin = iDp2;
                int i14 = AndroidUtilities.statusBarHeight;
                int i15 = iDp2 + i14;
                layoutParams2.topMargin = i15;
                if (z14) {
                    layoutParams2.topMargin = i15 + i14;
                }
            } else {
                layoutParams2.height = previewHeight;
                layoutParams2.topMargin = (((getMeasuredHeight() - i13) - previewHeight) / 2) + i13;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                layoutParams2.bottomMargin = org.telegram.messenger.y1.C(8.0f, iDp, layoutParams2.bottomMargin);
            }
            int iDp3 = AndroidUtilities.dp(8.0f);
            layoutParams2.leftMargin = iDp3;
            layoutParams2.rightMargin = iDp3;
        } else {
            layoutParams2.leftMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.topMargin = 0;
        }
        viewPerformCreateView.setLayoutParams(layoutParams2);
        k kVar = n2Var.actionBar;
        if (kVar != null && kVar.G) {
            if (this.f22689y0) {
                kVar.setOccupyStatusBar(false);
            }
            AndroidUtilities.removeFromParent(n2Var.actionBar);
            this.v.addView(n2Var.actionBar);
        }
        n2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
        n2Var.attachSheets(this.v);
        this.K0.add(n2Var);
        I("presentFragment");
        n2Var.onResume();
        this.f22688y = n2Var.actionBar;
        if (!n2Var.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
            viewPerformCreateView.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
        }
        w wVar2 = this.f22679s;
        w wVar3 = this.v;
        this.f22679s = wVar3;
        this.v = wVar2;
        wVar3.setVisibility(0);
        setInnerTranslationX(0.0f);
        this.f22679s.setTranslationY(0.0f);
        if (z13) {
            if (!(n2Var instanceof rn)) {
                float fDp = AndroidUtilities.dp(actionBarPopupWindow$ActionBarPopupWindowLayout == null ? 24.0f : 12.0f);
                cg.l1 l1Var = gf.r0.f7054a;
                viewPerformCreateView.setOutlineProvider(new gf.q0(0, fDp));
            } else if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                viewPerformCreateView.setOutlineProvider(new t());
            } else {
                float fDp2 = AndroidUtilities.dp(29.0f);
                cg.l1 l1Var2 = gf.r0.f7054a;
                viewPerformCreateView.setOutlineProvider(new gf.q0(0, fDp2));
            }
            viewPerformCreateView.setClipToOutline(true);
            viewPerformCreateView.setElevation(AndroidUtilities.dp(4.0f));
            if (Build.VERSION.SDK_INT >= 28) {
                viewPerformCreateView.setOutlineSpotShadowColor(-1342177280);
                viewPerformCreateView.setOutlineAmbientShadowColor(-1342177280);
            }
            if (this.f22677r == null) {
                this.f22677r = new ColorDrawable(771751936);
            }
            this.f22677r.setAlpha(0);
            g6.f23314s0.setAlpha(0);
        }
        bringChildToFront(this.f22679s);
        w wVar4 = this.f22684w;
        if (wVar4 != null) {
            bringChildToFront(wVar4);
        }
        if (!z15) {
            T(n2Var2, z10);
            View view = this.f22687x0;
            if (view != null) {
                view.setVisibility(0);
            }
        }
        if (this.f22661g0 != null) {
            this.f22656e0 = n2Var.getThemeDescriptions();
        }
        if (!z15 && !z13) {
            View view2 = this.f22687x0;
            if (view2 != null) {
                view2.setAlpha(1.0f);
                this.f22687x0.setVisibility(0);
            }
            if (n2Var2 != null) {
                n2Var2.onTransitionAnimationStart(false, false);
                n2Var2.onTransitionAnimationEnd(false, false);
            }
            n2Var.onTransitionAnimationStart(true, false);
            n2Var.onTransitionAnimationEnd(true, false);
            n2Var.onBecomeFullyVisible();
            return true;
        }
        if (this.f22685w0 && this.K0.size() == 1) {
            T(n2Var2, z10);
            this.f22678r0 = System.currentTimeMillis();
            this.S = true;
            this.f22683v0 = new org.telegram.messenger.voip.l0(5, n2Var2, n2Var);
            ArrayList arrayList4 = new ArrayList();
            Property property = View.ALPHA;
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 0.0f, 1.0f));
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 0.9f, 1.0f));
            arrayList4.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 0.9f, 1.0f));
            View view3 = this.f22687x0;
            if (view3 != null) {
                view3.setVisibility(0);
                arrayList4.add(ObjectAnimator.ofFloat(this.f22687x0, (Property<View, Float>) property, 0.0f, 1.0f));
            }
            if (n2Var2 != null) {
                n2Var2.onTransitionAnimationStart(false, false);
            }
            n2Var.onTransitionAnimationStart(true, false);
            AnimatorSet animatorSet = new AnimatorSet();
            this.G = animatorSet;
            animatorSet.playTogether(arrayList4);
            this.G.setInterpolator(er.h);
            this.G.setDuration(200L);
            this.G.addListener(new q(this, 1));
            this.G.start();
            return true;
        }
        this.T = z13;
        this.f22678r0 = System.currentTimeMillis();
        this.S = true;
        sd sdVar = new sd(this, z13, actionBarPopupWindow$ActionBarPopupWindowLayout, z10, n2Var2, n2Var);
        n2 n2Var3 = n2Var2;
        this.f22683v0 = sdVar;
        boolean zNeedDelayOpenAnimation = n2Var.needDelayOpenAnimation();
        boolean z16 = !zNeedDelayOpenAnimation;
        if (!zNeedDelayOpenAnimation) {
            if (n2Var3 != null) {
                n2Var3.onTransitionAnimationStart(false, false);
            }
            n2Var.onTransitionAnimationStart(true, false);
        }
        this.N0 = false;
        this.E = n2Var3;
        this.D = n2Var;
        AnimatorSet animatorSetOnCustomTransitionAnimation = !z13 ? n2Var.onCustomTransitionAnimation(true, new o(this, 4)) : null;
        if (animatorSetOnCustomTransitionAnimation != null) {
            if (!z13 && ((this.f22679s.f23920b || this.v.f23920b) && n2Var3 != null)) {
                n2Var3.saveKeyboardPositionBeforeTransition();
            }
            this.G = animatorSetOnCustomTransitionAnimation;
            return true;
        }
        this.f22679s.setAlpha(0.0f);
        if (z13) {
            this.f22679s.setTranslationX(0.0f);
            this.f22679s.setScaleX(0.9f);
            this.f22679s.setScaleY(0.9f);
        } else {
            this.f22679s.setTranslationX(48.0f);
            this.f22679s.setScaleX(1.0f);
            this.f22679s.setScaleY(1.0f);
        }
        if (!this.f22679s.f23920b && !this.v.f23920b) {
            if (!n2Var.needDelayOpenAnimation()) {
                d0(true, true, z13);
                return true;
            }
            hc.k kVar2 = new hc.k(this, n2Var, z13, i11);
            this.f22655e = kVar2;
            AndroidUtilities.runOnUIThread(kVar2, 200L);
            return true;
        }
        if (n2Var3 != null && !z13) {
            n2Var3.saveKeyboardPositionBeforeTransition();
        }
        this.d = new u(this, z16, n2Var3, n2Var, z13);
        if (n2Var.needDelayOpenAnimation()) {
            this.f22655e = new v(this, n2Var3, n2Var, z13);
        }
        AndroidUtilities.runOnUIThread(this.d, 250L);
        return true;
    }

    public final boolean S(n2 n2Var, boolean z10, boolean z11) {
        z4 z4Var = new z4(n2Var);
        z4Var.f24000b = z10;
        z4Var.f24001c = z11;
        z4Var.d = true;
        z4Var.f24002e = false;
        return R(z4Var);
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
            this.K0.remove(n2Var);
            I("presentFragmentInternalRemoveOld");
        } else {
            View view = n2Var.fragmentView;
            if (view != null && (viewGroup2 = (ViewGroup) view.getParent()) != null) {
                n2Var.onRemoveFromParent();
                try {
                    viewGroup2.removeViewInLayout(n2Var.fragmentView);
                } catch (Exception e9) {
                    FileLog.e(e9);
                    try {
                        viewGroup2.removeView(n2Var.fragmentView);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
            k kVar = n2Var.actionBar;
            if (kVar != null && kVar.G && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                viewGroup.removeViewInLayout(n2Var.actionBar);
            }
            n2Var.detachSheets();
        }
        this.v.setVisibility(4);
    }

    public final void U(boolean z10, boolean z11) {
        if (this.S || this.M) {
            this.f22674o0 = true;
            this.f22675p0 = z10;
            this.f22676q0 = z11;
            return;
        }
        int size = this.K0.size();
        if (!z10) {
            size--;
        }
        if (this.h) {
            size--;
        }
        for (int i10 = 0; i10 < size; i10++) {
            ((n2) this.K0.get(i10)).clearViews();
            ((n2) this.K0.get(i10)).setParentLayout(this);
        }
        y4 y4Var = this.F0;
        if (y4Var != null) {
            y4Var.b(this, z10);
        }
        if (z11) {
            c0();
        }
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
            b0((n2) this.K0.get(0), false);
        }
        View view = this.f22687x0;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(180L).withEndAction(new o(this, 5)).start();
        }
    }

    public final void Y(int i10) {
        if (i10 < 0 || i10 >= getFragmentStack().size()) {
            return;
        }
        a0((n2) getFragmentStack().get(i10), false);
    }

    public final void Z(n2 n2Var) {
        a0(n2Var, false);
    }

    public final void a0(n2 n2Var, boolean z10) {
        if ((this.K0.size() > 0 && i0.a.j(1, this.K0) == n2Var) || (this.K0.size() > 1 && i0.a.j(2, this.K0) == n2Var)) {
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
        b0(n2Var, n2Var.allowFinishFragmentInsteadOfRemoveFromStack() && !z10);
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        r0.m1 m1Var = this.f22666i1;
        if (m1Var != null) {
            o(view, m1Var);
        }
    }

    public final void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int[] iArr = new int[arrayList.size()];
        this.V.add(iArr);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((i6) arrayList.get(i10)).b();
        }
    }

    public final void b0(n2 n2Var, boolean z10) {
        if (this.K0.contains(n2Var)) {
            if (z10 && i0.a.j(1, this.K0) == n2Var) {
                n2Var.finishFragment();
                return;
            }
            if (i0.a.j(1, this.K0) == n2Var && this.K0.size() > 1) {
                n2Var.finishFragment(false);
                return;
            }
            n2Var.onPause();
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
            this.K0.remove(n2Var);
            I("removeFragmentFromStackInternal " + z10);
        }
    }

    public final boolean c(int i10, n2 n2Var) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        y4 y4Var = this.F0;
        int i11 = 0;
        if ((y4Var != null && !y4Var.h(n2Var, this)) || !n2Var.onFragmentCreate() || this.K0.contains(n2Var)) {
            return false;
        }
        n2Var.setParentLayout(this);
        Activity activity = this.G0;
        if (i10 == -1 || i10 == -2) {
            if (!this.K0.isEmpty()) {
                n2 n2Var2 = (n2) i0.a.j(1, this.K0);
                n2Var2.onPause();
                k kVar = n2Var2.actionBar;
                if (kVar != null && kVar.G && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(n2Var2.actionBar);
                }
                View view = n2Var2.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    n2Var2.onRemoveFromParent();
                    viewGroup.removeView(n2Var2.fragmentView);
                }
                n2Var2.detachSheets();
            }
            this.K0.add(n2Var);
            if (i10 != -2) {
                View viewPerformCreateView = n2Var.fragmentView;
                if (viewPerformCreateView == null) {
                    viewPerformCreateView = n2Var.performCreateView(activity);
                    if (viewPerformCreateView != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
                        n nVar = new n(n2Var, i11);
                        WeakHashMap weakHashMap = r0.j0.f46605a;
                        r0.b0.j(viewPerformCreateView, nVar);
                        this.f22679s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup3 = (ViewGroup) viewPerformCreateView.getParent();
                    if (viewGroup3 != null) {
                        n2Var.onRemoveFromParent();
                        viewGroup3.removeView(viewPerformCreateView);
                    }
                }
                if (!n2Var.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
                    viewPerformCreateView.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
                }
                this.f22679s.addView(viewPerformCreateView, h7.z5.c(-1.0f, -1));
                this.f22679s.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
                this.f22679s.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
                k kVar2 = n2Var.actionBar;
                if (kVar2 != null && kVar2.G) {
                    if (this.f22689y0) {
                        kVar2.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) n2Var.actionBar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(n2Var.actionBar);
                    }
                    this.f22679s.addView(n2Var.actionBar);
                }
                n2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                n2Var.attachSheets(this.f22679s);
                n2Var.onResume();
                n2Var.onTransitionAnimationEnd(false, true);
                n2Var.onTransitionAnimationEnd(true, true);
                n2Var.onBecomeFullyVisible();
            }
            I("addFragmentToStack " + i10);
        } else {
            if (i10 == -3) {
                View viewPerformCreateView2 = n2Var.fragmentView;
                if (viewPerformCreateView2 == null) {
                    viewPerformCreateView2 = n2Var.performCreateView(activity);
                    if (viewPerformCreateView2 != null && n2Var.isSupportEdgeToEdge() && n2Var.drawEdgeNavigationBar()) {
                        n nVar2 = new n(n2Var, i11);
                        WeakHashMap weakHashMap2 = r0.j0.f46605a;
                        r0.b0.j(viewPerformCreateView2, nVar2);
                        this.f22679s.invalidate();
                    }
                } else {
                    ViewGroup viewGroup5 = (ViewGroup) viewPerformCreateView2.getParent();
                    if (viewGroup5 != null) {
                        n2Var.onRemoveFromParent();
                        viewGroup5.removeView(viewPerformCreateView2);
                    }
                }
                if (!n2Var.hasOwnBackground && viewPerformCreateView2.getBackground() == null) {
                    viewPerformCreateView2.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
                }
                w wVar = this.f22679s;
                wVar.addView(viewPerformCreateView2, Utilities.clamp(0, wVar.getChildCount(), 0), h7.z5.c(-1.0f, -1));
                this.f22679s.setShouldHandleBottomInsets(n2Var.getEdgeToEdgeSupportMode());
                this.f22679s.setDrawNavigationBar(n2Var.drawEdgeNavigationBar());
                k kVar3 = n2Var.actionBar;
                if (kVar3 != null && kVar3.G) {
                    if (this.f22689y0) {
                        kVar3.setOccupyStatusBar(false);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) n2Var.actionBar.getParent();
                    if (viewGroup6 != null) {
                        viewGroup6.removeView(n2Var.actionBar);
                    }
                    this.f22679s.addView(n2Var.actionBar);
                }
                n2Var.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                n2Var.attachSheets(this.f22679s);
                i10 = 0;
            }
            this.K0.add(i10, n2Var);
            I("addFragmentToStack");
        }
        if (!this.f22685w0) {
            setVisibility(0);
            View view2 = this.f22687x0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        return true;
    }

    public final void c0() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.K0.isEmpty()) {
            return;
        }
        int size = this.K0.size() - 1;
        if (this.K0.isEmpty()) {
            return;
        }
        if (this.K0.isEmpty() || this.K0.size() - 1 != size || ((n2) this.K0.get(size)).fragmentView == null) {
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                n2 n2Var = (n2) this.K0.get(i11);
                k kVar = n2Var.actionBar;
                if (kVar != null && kVar.G && (viewGroup2 = (ViewGroup) kVar.getParent()) != null) {
                    viewGroup2.removeView(n2Var.actionBar);
                }
                View view = n2Var.fragmentView;
                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                    n2Var.onPause();
                    n2Var.onRemoveFromParent();
                    viewGroup.removeView(n2Var.fragmentView);
                }
            }
            n2 n2Var2 = (n2) this.K0.get(size);
            n2Var2.setParentLayout(this);
            View viewPerformCreateView = n2Var2.fragmentView;
            if (viewPerformCreateView == null) {
                viewPerformCreateView = n2Var2.performCreateView(this.G0);
                if (viewPerformCreateView != null && n2Var2.isSupportEdgeToEdge() && n2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(n2Var2, i10);
                    WeakHashMap weakHashMap = r0.j0.f46605a;
                    r0.b0.j(viewPerformCreateView, nVar);
                    this.f22679s.invalidate();
                }
            } else {
                ViewGroup viewGroup3 = (ViewGroup) viewPerformCreateView.getParent();
                if (viewGroup3 != null) {
                    n2Var2.onRemoveFromParent();
                    viewGroup3.removeView(viewPerformCreateView);
                }
            }
            this.f22679s.addView(viewPerformCreateView, h7.z5.c(-1.0f, -1));
            this.f22679s.setShouldHandleBottomInsets(n2Var2.getEdgeToEdgeSupportMode());
            this.f22679s.setDrawNavigationBar(n2Var2.drawEdgeNavigationBar());
            k kVar2 = n2Var2.actionBar;
            if (kVar2 != null && kVar2.G) {
                if (this.f22689y0) {
                    kVar2.setOccupyStatusBar(false);
                }
                AndroidUtilities.removeFromParent(n2Var2.actionBar);
                this.f22679s.addView(n2Var2.actionBar);
            }
            n2Var2.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
            n2Var2.attachSheets(this.f22679s);
            n2Var2.onResume();
            n2Var2.onBecomeFullyVisible();
            this.f22688y = n2Var2.actionBar;
            if (n2Var2.hasOwnBackground || viewPerformCreateView.getBackground() != null) {
                return;
            }
            viewPerformCreateView.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        this.f22653d0.add(arrayList);
        int[] iArr = new int[arrayList.size()];
        this.U.add(iArr);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i6 i6Var = (i6) arrayList.get(i10);
            iArr[i10] = i6Var.b();
            h6 h6Var = i6Var.h;
            i6Var.h = null;
            if (h6Var != null) {
                ArrayList arrayList2 = this.f22659f0;
                if (!arrayList2.contains(h6Var)) {
                    arrayList2.add(h6Var);
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
        if (this.A == null || v(true) <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, getHeight() - (this.A.getMeasuredHeight() + this.f22668j1.d), getWidth(), getHeight(), this.A.getBackgroundPaint());
        }
        this.Q0 = true;
        if (this.I0) {
            canvas2.save();
            float fDp = AndroidUtilities.dp(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.R0;
            path.rewind();
            path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        super.dispatchDraw(canvas2);
        if (this.I0) {
            canvas2.restore();
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        y4 y4Var = this.F0;
        return (y4Var != null && y4Var.j()) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        j2 lastSheet;
        boolean z10 = motionEvent.getY() > ((float) ((getHeight() - v(true)) - this.f22668j1.d));
        r rVar = this.C;
        j2 j2Var = null;
        if (rVar == null || rVar.getLastSheet() == null) {
            lastSheet = null;
        } else {
            lastSheet = this.C.getLastSheet();
            if (!lastSheet.attachedToParent() || lastSheet.getWindowView() == null) {
                lastSheet = null;
            }
        }
        if (lastSheet != null || getLastFragment() == null || getLastFragment().getLastSheet() == null) {
            j2Var = lastSheet;
        } else {
            lastSheet = getLastFragment().getLastSheet();
            if (lastSheet.attachedToParent() && lastSheet.getWindowView() != null) {
                j2Var = lastSheet;
            }
        }
        if (j2Var != null) {
            if (motionEvent.getAction() == 0) {
                this.f22662g1 = z10;
            }
            if (!this.f22662g1) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f22662g1 = false;
                }
                return j2Var.getWindowView().dispatchTouchEvent(motionEvent);
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f22662g1 = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int iMax;
        int i10;
        Canvas canvas2;
        int i11;
        w wVar;
        View childAt;
        int i12;
        int i13;
        int iB;
        int i14;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        WindowInsets rootWindowInsets2;
        RectF rectF;
        float f10;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        RoundedCorner roundedCorner5;
        RoundedCorner roundedCorner6;
        float radius3;
        float[] fArr;
        float radius4;
        float radius5;
        float radius6;
        float f11;
        float fMin;
        float fClamp;
        float fDp;
        float fCenterY;
        af.h hVar;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingRight = getPaddingRight() + ((int) this.K);
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = getPaddingLeft() + width;
        if (view != this.v) {
            if (view == this.f22679s) {
                iMax = paddingLeft2;
                i10 = paddingRight;
            }
            int iSave = canvas.save();
            if (view != this.A || (hVar = this.B) == null) {
                canvas2 = canvas;
            } else {
                boolean z10 = this.Q0;
                boolean z11 = this.T0;
                int width2 = getWidth();
                getY();
                getHeight();
                hVar.q(canvas, z10, z11, width2, 1.0f);
                canvas2 = canvas;
                this.Q0 = false;
            }
            i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31 && !this.f22647b && (paddingRight != 0 || this.P0 != -1)) {
                if (view == this.f22679s) {
                    rootWindowInsets2 = getRootWindowInsets();
                    if (rootWindowInsets2 != null) {
                        rectF = AndroidUtilities.rectTmp;
                        f10 = paddingRight;
                        rectF.set(f10, 0.0f, getWidth() + paddingRight, getHeight());
                        if (D()) {
                            if (this.Z0) {
                                f11 = 56.0f;
                                fMin = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(0.9f, 0.85f, 1.0f - this.f22679s.getAlpha()), Utilities.clamp01(f10 / AndroidUtilities.dpf2(56.0f)));
                            } else {
                                f11 = 56.0f;
                                fMin = 1.0f - Math.min(0.25f, (0.05f * f10) / AndroidUtilities.dpf2(56.0f));
                            }
                            if (paddingRight > AndroidUtilities.dp(f11) || this.P || !this.Z0) {
                                fClamp = Utilities.clamp(paddingRight, AndroidUtilities.dp(f11), 0);
                            } else {
                                fClamp = f10;
                            }
                            if (this.Z0 || this.f22652c1) {
                                canvas2.translate(-fClamp, 0.0f);
                                iMax = (int) (iMax + fClamp);
                            } else {
                                canvas2.translate(-fClamp, 0.0f);
                                rectF.set(f10, 0.0f, getWidth() + paddingRight, getHeight());
                                iMax = (int) (iMax + fClamp);
                            }
                            if (this.f22652c1) {
                                fDp = rectF.right - AndroidUtilities.dp(82.0f);
                            } else {
                                fDp = rectF.left + AndroidUtilities.dp(82.0f);
                            }
                            if (this.Z0) {
                                fCenterY = this.f22649b1;
                            } else {
                                fCenterY = rectF.centerY();
                            }
                            canvas2.scale(fMin, fMin, fDp, fCenterY);
                        }
                        roundedCorner3 = rootWindowInsets2.getRoundedCorner(0);
                        roundedCorner4 = rootWindowInsets2.getRoundedCorner(1);
                        roundedCorner5 = rootWindowInsets2.getRoundedCorner(2);
                        roundedCorner6 = rootWindowInsets2.getRoundedCorner(3);
                        if (roundedCorner3 == null) {
                            radius3 = 0.0f;
                        } else {
                            radius3 = roundedCorner3.getRadius();
                        }
                        fArr = this.S0;
                        fArr[1] = radius3;
                        fArr[0] = radius3;
                        if (roundedCorner4 == null) {
                            radius4 = 0.0f;
                        } else {
                            radius4 = roundedCorner4.getRadius();
                        }
                        fArr[3] = radius4;
                        fArr[2] = radius4;
                        if (roundedCorner5 == null) {
                            radius5 = 0.0f;
                        } else {
                            radius5 = roundedCorner5.getRadius();
                        }
                        fArr[5] = radius5;
                        fArr[4] = radius5;
                        if (roundedCorner6 == null) {
                            radius6 = 0.0f;
                        } else {
                            radius6 = roundedCorner6.getRadius();
                        }
                        fArr[7] = radius6;
                        fArr[6] = radius6;
                        if (this.J0) {
                            float fClamp01 = Utilities.clamp01(Math.abs(paddingRight) / AndroidUtilities.dpf2(12.0f));
                            fArr[0] = fArr[0] * fClamp01;
                            fArr[1] = fArr[1] * fClamp01;
                            fArr[6] = fArr[6] * fClamp01;
                            fArr[7] = fArr[7] * fClamp01;
                        }
                        Path path = this.R0;
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.clipPath(path);
                    }
                } else if (view == this.v && (rootWindowInsets = getRootWindowInsets()) != null) {
                    roundedCorner = rootWindowInsets.getRoundedCorner(0);
                    roundedCorner2 = rootWindowInsets.getRoundedCorner(3);
                    if (roundedCorner == null) {
                        radius = 0;
                    } else {
                        radius = roundedCorner.getRadius();
                    }
                    if (roundedCorner2 == null) {
                        radius2 = 0;
                    } else {
                        radius2 = roundedCorner2.getRadius();
                    }
                    iMax += Math.max(radius, radius2);
                    if (D()) {
                        iMax = getPaddingLeft() + width;
                    }
                }
            }
            int iSave2 = canvas2.save();
            if (!A() && !this.h) {
                canvas2.clipRect(i10, 0, iMax, getHeight());
            }
            if ((this.h || this.T) && view == (wVar = this.f22679s) && (childAt = wVar.getChildAt(0)) != null) {
                this.f22677r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.f22677r.draw(canvas2);
                if (this.F == null) {
                    int iDp = AndroidUtilities.dp(32.0f);
                    int measuredWidth = (getMeasuredWidth() - iDp) / 2;
                    int translationY = (int) ((wVar.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(12.0f));
                    g6.f23314s0.setBounds(measuredWidth, translationY, iDp + measuredWidth, (iDp / 2) + translationY);
                    g6.f23314s0.draw(canvas2);
                }
            }
            boolean zDrawChild = super.drawChild(canvas, view, j10);
            canvas2.restoreToCount(iSave2);
            if (paddingRight == 0) {
                i12 = -1;
                if (this.P0 != -1) {
                }
                canvas2.restoreToCount(iSave);
                return zDrawChild;
            }
            i12 = -1;
            i13 = this.P0;
            if (i13 == i12) {
                i13 = width - paddingRight;
            }
            if (view == this.f22679s) {
                iB = h7.n.b((i13 * 255) / AndroidUtilities.dp(20.0f), 0, 255);
                if (iB > 0) {
                    if (v(false) == 0) {
                        i14 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
                    } else {
                        i14 = 0;
                    }
                    if (i11 >= 31 || this.f22647b) {
                        Drawable drawable = f22642m1;
                        drawable.setBounds(paddingRight - drawable.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i14);
                        f22642m1.setAlpha(iB);
                        f22642m1.draw(canvas2);
                    }
                }
            } else if (view == this.v) {
                f22643n1.setColor(Color.argb((int) (h7.n.a(i13 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
                if (this.P0 != -1) {
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, f22643n1);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.drawRect(i10, 0.0f, iMax, getHeight() * 1.5f, f22643n1);
                }
            }
            canvas2.restoreToCount(iSave);
            return zDrawChild;
        }
        paddingLeft2 = AndroidUtilities.dp(1.0f) + paddingRight;
        i10 = paddingLeft;
        iMax = paddingLeft2;
        int iSave3 = canvas.save();
        if (view != this.A) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            if (view == this.f22679s) {
                rootWindowInsets2 = getRootWindowInsets();
                if (rootWindowInsets2 != null) {
                    rectF = AndroidUtilities.rectTmp;
                    f10 = paddingRight;
                    rectF.set(f10, 0.0f, getWidth() + paddingRight, getHeight());
                    if (D()) {
                        if (this.Z0) {
                            f11 = 56.0f;
                            fMin = AndroidUtilities.lerp(1.0f, AndroidUtilities.lerp(0.9f, 0.85f, 1.0f - this.f22679s.getAlpha()), Utilities.clamp01(f10 / AndroidUtilities.dpf2(56.0f)));
                        } else {
                            f11 = 56.0f;
                            fMin = 1.0f - Math.min(0.25f, (0.05f * f10) / AndroidUtilities.dpf2(56.0f));
                        }
                        if (paddingRight > AndroidUtilities.dp(f11)) {
                            fClamp = Utilities.clamp(paddingRight, AndroidUtilities.dp(f11), 0);
                        } else {
                            fClamp = Utilities.clamp(paddingRight, AndroidUtilities.dp(f11), 0);
                        }
                        if (this.Z0) {
                            canvas2.translate(-fClamp, 0.0f);
                            iMax = (int) (iMax + fClamp);
                        } else {
                            canvas2.translate(-fClamp, 0.0f);
                            iMax = (int) (iMax + fClamp);
                        }
                        if (this.f22652c1) {
                            fDp = rectF.right - AndroidUtilities.dp(82.0f);
                        } else {
                            fDp = rectF.left + AndroidUtilities.dp(82.0f);
                        }
                        if (this.Z0) {
                            fCenterY = this.f22649b1;
                        } else {
                            fCenterY = rectF.centerY();
                        }
                        canvas2.scale(fMin, fMin, fDp, fCenterY);
                    }
                    roundedCorner3 = rootWindowInsets2.getRoundedCorner(0);
                    roundedCorner4 = rootWindowInsets2.getRoundedCorner(1);
                    roundedCorner5 = rootWindowInsets2.getRoundedCorner(2);
                    roundedCorner6 = rootWindowInsets2.getRoundedCorner(3);
                    if (roundedCorner3 == null) {
                        radius3 = 0.0f;
                    } else {
                        radius3 = roundedCorner3.getRadius();
                    }
                    fArr = this.S0;
                    fArr[1] = radius3;
                    fArr[0] = radius3;
                    if (roundedCorner4 == null) {
                        radius4 = 0.0f;
                    } else {
                        radius4 = roundedCorner4.getRadius();
                    }
                    fArr[3] = radius4;
                    fArr[2] = radius4;
                    if (roundedCorner5 == null) {
                        radius5 = 0.0f;
                    } else {
                        radius5 = roundedCorner5.getRadius();
                    }
                    fArr[5] = radius5;
                    fArr[4] = radius5;
                    if (roundedCorner6 == null) {
                        radius6 = 0.0f;
                    } else {
                        radius6 = roundedCorner6.getRadius();
                    }
                    fArr[7] = radius6;
                    fArr[6] = radius6;
                    if (this.J0) {
                        float fClamp02 = Utilities.clamp01(Math.abs(paddingRight) / AndroidUtilities.dpf2(12.0f));
                        fArr[0] = fArr[0] * fClamp02;
                        fArr[1] = fArr[1] * fClamp02;
                        fArr[6] = fArr[6] * fClamp02;
                        fArr[7] = fArr[7] * fClamp02;
                    }
                    Path path2 = this.R0;
                    path2.rewind();
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas2.clipPath(path2);
                }
            } else if (view == this.v) {
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                roundedCorner2 = rootWindowInsets.getRoundedCorner(3);
                if (roundedCorner == null) {
                    radius = 0;
                } else {
                    radius = roundedCorner.getRadius();
                }
                if (roundedCorner2 == null) {
                    radius2 = 0;
                } else {
                    radius2 = roundedCorner2.getRadius();
                }
                iMax += Math.max(radius, radius2);
                if (D()) {
                    iMax = getPaddingLeft() + width;
                }
            }
        }
        int iSave4 = canvas2.save();
        if (!A()) {
            canvas2.clipRect(i10, 0, iMax, getHeight());
        }
        if (this.h) {
            this.f22677r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.f22677r.draw(canvas2);
            if (this.F == null) {
                int iDp2 = AndroidUtilities.dp(32.0f);
                int measuredWidth2 = (getMeasuredWidth() - iDp2) / 2;
                int translationY2 = (int) ((wVar.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(12.0f));
                g6.f23314s0.setBounds(measuredWidth2, translationY2, iDp2 + measuredWidth2, (iDp2 / 2) + translationY2);
                g6.f23314s0.draw(canvas2);
            }
        } else {
            this.f22677r.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.f22677r.draw(canvas2);
            if (this.F == null) {
                int iDp3 = AndroidUtilities.dp(32.0f);
                int measuredWidth3 = (getMeasuredWidth() - iDp3) / 2;
                int translationY3 = (int) ((wVar.getTranslationY() + childAt.getTop()) - AndroidUtilities.dp(12.0f));
                g6.f23314s0.setBounds(measuredWidth3, translationY3, iDp3 + measuredWidth3, (iDp3 / 2) + translationY3);
                g6.f23314s0.draw(canvas2);
            }
        }
        boolean zDrawChild2 = super.drawChild(canvas, view, j10);
        canvas2.restoreToCount(iSave4);
        if (paddingRight == 0) {
            i12 = -1;
            if (this.P0 != -1) {
            }
            canvas2.restoreToCount(iSave3);
            return zDrawChild2;
        }
        i12 = -1;
        i13 = this.P0;
        if (i13 == i12) {
            i13 = width - paddingRight;
        }
        if (view == this.f22679s) {
            iB = h7.n.b((i13 * 255) / AndroidUtilities.dp(20.0f), 0, 255);
            if (iB > 0) {
                if (v(false) == 0) {
                    i14 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
                } else {
                    i14 = 0;
                }
                if (i11 >= 31) {
                    Drawable drawable2 = f22642m1;
                    drawable2.setBounds(paddingRight - drawable2.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i14);
                    f22642m1.setAlpha(iB);
                    f22642m1.draw(canvas2);
                } else {
                    Drawable drawable3 = f22642m1;
                    drawable3.setBounds(paddingRight - drawable3.getIntrinsicWidth(), view.getTop(), paddingRight, view.getBottom() + i14);
                    f22642m1.setAlpha(iB);
                    f22642m1.draw(canvas2);
                }
            }
        } else if (view == this.v) {
            f22643n1.setColor(Color.argb((int) (h7.n.a(i13 / width, 0.0f, 0.8f) * 120.0f), 0, 0, 0));
            if (this.P0 != -1) {
                canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight() * 1.5f, f22643n1);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i10, 0.0f, iMax, getHeight() * 1.5f, f22643n1);
            }
        }
        canvas2.restoreToCount(iSave3);
        return zDrawChild2;
    }

    public final void e(boolean z10) {
        Animator customSlideTransition;
        n2 n2Var = !this.K0.isEmpty() ? (n2) i0.a.j(1, this.K0) : null;
        if (n2Var == null) {
            return;
        }
        float x8 = this.f22679s.getX();
        AnimatorSet animatorSet = new AnimatorSet();
        boolean zShouldOverrideSlideTransition = n2Var.shouldOverrideSlideTransition(false, z10);
        Property property = View.TRANSLATION_X;
        if (z10) {
            int iMax = Math.max((int) ((320.0f / this.f22679s.getMeasuredWidth()) * x8), D() ? 320 : 120);
            if (!zShouldOverrideSlideTransition) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f22679s, (Property<w, Float>) property, 0.0f);
                long j10 = iMax;
                animatorSet.playTogether(objectAnimatorOfFloat.setDuration(j10), ObjectAnimator.ofFloat(this, "innerTranslationX", 0.0f).setDuration(j10));
                if (D()) {
                    animatorSet.setInterpolator(er.h);
                }
            }
        } else {
            x8 = Math.abs(this.f22679s.getMeasuredWidth() - x8);
            int iMax2 = Math.max((int) ((200.0f / this.f22679s.getMeasuredWidth()) * x8), D() ? 380 : 50);
            if (!zShouldOverrideSlideTransition) {
                w wVar = this.f22679s;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(wVar, (Property<w, Float>) property, wVar.getMeasuredWidth() + (this.Z0 ? AndroidUtilities.dp(56.0f) : 0));
                long j11 = iMax2;
                animatorSet.playTogether(objectAnimatorOfFloat2.setDuration(j11), ObjectAnimator.ofFloat(this, "innerTranslationX", this.f22679s.getMeasuredWidth()).setDuration(j11));
                if (D()) {
                    animatorSet.setInterpolator(er.h);
                }
            }
        }
        Animator customSlideTransition2 = n2Var.getCustomSlideTransition(false, z10, x8);
        if (customSlideTransition2 != null) {
            animatorSet.playTogether(customSlideTransition2);
        }
        n2 n2Var2 = (n2) i0.a.j(2, this.K0);
        if (n2Var2 != null && (customSlideTransition = n2Var2.getCustomSlideTransition(false, z10, x8)) != null) {
            animatorSet.playTogether(customSlideTransition);
        }
        animatorSet.addListener(new g(this, z10));
        this.f22654d1 = animatorSet;
        animatorSet.start();
        this.P = true;
    }

    public final boolean e0() {
        n2 n2Var = !this.K0.isEmpty() ? (n2) i0.a.j(1, this.K0) : null;
        return (n2Var == null || n2Var.getLastStoryViewer() == null || !n2Var.getLastStoryViewer().attachedToParent()) ? false : true;
    }

    public final void f(a5 a5Var, Runnable runnable) {
        f6 f6Var;
        f6 f6Var2;
        final int i10 = 1;
        if (this.S || this.M) {
            this.f22667j0 = true;
            this.f22669k0 = a5Var.f22723a;
            this.m0 = a5Var.f22725c;
            this.f22673n0 = a5Var.f22724b;
            this.f22671l0 = a5Var.f22728g;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f22661g0;
        Object obj = null;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f22661g0 = null;
        }
        int size = a5Var.f22726e ? 1 : this.K0.size();
        ag.k0 k0Var = new ag.k0(this, size, a5Var, runnable, 7);
        if (size < 1 || !a5Var.f22727f || !a5Var.f22728g) {
            k0Var.run();
            return;
        }
        int i11 = a5Var.f22724b;
        if (i11 != -1 && (f6Var2 = a5Var.f22723a) != null) {
            f6Var2.u(i11);
            g6.t1(a5Var.f22723a, true, false, true, false, false);
        }
        if (runnable == null) {
            g6.t(a5Var.f22723a, true, a5Var.f22725c);
            k0Var.run();
            return;
        }
        f6 f6Var3 = a5Var.f22723a;
        boolean z10 = a5Var.f22725c;
        final int i12 = 0;
        p pVar = new p(k0Var, i12);
        int i13 = g6.f22993a;
        if (f6Var3 == null) {
            pVar.run();
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.f26549n;
        if (themeEditorView != null) {
            themeEditorView.a();
        }
        try {
            if (f6Var3.f22943b == null && f6Var3.d == null) {
                if (!z10) {
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.remove("theme");
                    editorEdit.apply();
                }
                g6.ql.clear();
                g6.f23102g0 = 0;
                g6.f23119h0 = null;
                g6.f23066e0 = null;
                g6.f23084f0 = null;
                if (!z10 && g6.M == null) {
                    g6.K = f6Var3;
                    if (g6.I != g6.J) {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        g6.T = 2000;
                        g6.U = SystemClock.elapsedRealtime();
                        AndroidUtilities.runOnUIThread(new ag.l3(20), 2100L);
                    }
                }
                g6.I = f6Var3;
                g6.n1(false, false);
                f6Var = f6Var3;
                if (g6.M == null && !g6.Q) {
                    MessagesController.getInstance(f6Var.A).saveTheme(f6Var, f6Var.k(false), z10, false);
                }
                pVar.run();
            }
            if (!z10) {
                SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
                editorEdit2.putString("theme", f6Var3.m());
                editorEdit2.apply();
            }
            String[] strArr = new String[1];
            final cg.c cVar = new cg.c(strArr, f6Var3, z10, pVar, 6);
            f6Var = f6Var3;
            try {
                String str = f6Var.d;
                if (str != null) {
                    Utilities.themeQueue.postRunnable(new androidx.car.app.utils.b(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj2) {
                            SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                            switch (i12) {
                                case 0:
                                    g6.ql = sparseIntArray;
                                    cVar.run();
                                    break;
                                default:
                                    g6.ql = sparseIntArray;
                                    cVar.run();
                                    break;
                            }
                        }
                    }, obj, str, obj, 24));
                } else {
                    Utilities.themeQueue.postRunnable(new androidx.car.app.utils.b(new Utilities.Callback() {
                        @Override
                        public final void run(Object obj2) {
                            SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                            switch (i10) {
                                case 0:
                                    g6.ql = sparseIntArray;
                                    cVar.run();
                                    break;
                                default:
                                    g6.ql = sparseIntArray;
                                    cVar.run();
                                    break;
                            }
                        }
                    }, new File(f6Var.f22943b), obj, strArr, 24));
                }
            } catch (Exception e9) {
                e = e9;
                FileLog.e(e);
                if (g6.M == null) {
                    MessagesController.getInstance(f6Var.A).saveTheme(f6Var, f6Var.k(false), z10, false);
                }
                pVar.run();
            }
        } catch (Exception e10) {
            e = e10;
            f6Var = f6Var3;
        }
    }

    public final void g(f6 f6Var, int i10, boolean z10, boolean z11, Runnable runnable) {
        f(new a5(f6Var, i10, z10, z11), runnable);
    }

    @Override
    public n2 getBackgroundFragment() {
        if (getFragmentStack().size() <= 1) {
            return null;
        }
        return (n2) getFragmentStack().get(getFragmentStack().size() - 2);
    }

    @Override
    public e3 getBottomSheet() {
        return null;
    }

    public m3 getBottomSheetTabs() {
        return this.A;
    }

    public float getCurrentPreviewFragmentAlpha() {
        if (!this.h && !this.T && !this.f22672n) {
            return 0.0f;
        }
        n2 n2Var = this.E;
        return ((n2Var == null || !n2Var.inPreviewMode) ? this.f22679s : this.v).getAlpha();
    }

    public x3 getDrawerLayoutContainer() {
        return this.f22686x;
    }

    @Override
    public List<n2> getFragmentStack() {
        return this.K0;
    }

    public float getInnerTranslationX() {
        return this.K;
    }

    @Override
    public n2 getLastFragment() {
        if (this.K0.isEmpty()) {
            return null;
        }
        return (n2) i0.a.j(1, this.K0);
    }

    public n2 getLastFragmentIncludeMainTabs() {
        n2 lastFragment = getLastFragment();
        return lastFragment instanceof qg0 ? ((qg0) lastFragment).X() : lastFragment;
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
    public List<e9> getPulledDialogs() {
        return this.L0;
    }

    @Override
    public n2 getSafeLastFragment() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            n2 n2Var = (n2) getFragmentStack().get(size);
            if (n2Var != null && !n2Var.isFinishing() && !n2Var.isRemovingFromStack()) {
                return n2Var;
            }
        }
        return null;
    }

    public ty getSheetFragment() {
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
            StringBuilder sbF = s3.c.f(str, " ");
            sbF.append(this.K0.size());
            arrayList.add(0, sbF.toString());
            if (this.f22657e1.size() > 20) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < 10; i10++) {
                    arrayList2.add((String) this.f22657e1.get(i10));
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
                a5Var.f22728g = z10;
                a5Var.f22727f = z10;
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

    public final void k() {
        l(false, false);
    }

    public final void l(boolean z10, boolean z11) {
        n2 lastFragment = getLastFragment();
        if (lastFragment == null || !lastFragment.closeLastFragment()) {
            y4 y4Var = this.F0;
            if ((y4Var != null && !y4Var.k(this)) || j() || this.K0.isEmpty()) {
                return;
            }
            Activity activity = this.G0;
            if (activity.getCurrentFocus() != null) {
                AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
            }
            setInnerTranslationX(0.0f);
            int i10 = 0;
            boolean z12 = !z11 && (this.h || this.T || (z10 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)));
            n2 n2Var = (n2) i0.a.j(1, this.K0);
            AnimatorSet animatorSetOnCustomTransitionAnimation = null;
            n2 n2Var2 = this.K0.size() > 1 ? (n2) i0.a.j(2, this.K0) : null;
            if (n2Var2 != null) {
                AndroidUtilities.setLightStatusBar(activity, g6.w0(null, g6.f23322s8, false) == -1 || (n2Var2.hasForceLightStatusBar() && !g6.A0().q()));
                w wVar = this.f22679s;
                this.f22679s = this.v;
                this.v = wVar;
                n2Var2.setParentLayout(this);
                View viewPerformCreateView = n2Var2.fragmentView;
                if (viewPerformCreateView == null && (viewPerformCreateView = n2Var2.performCreateView(activity)) != null && n2Var2.isSupportEdgeToEdge() && n2Var2.drawEdgeNavigationBar()) {
                    n nVar = new n(n2Var2, i10);
                    WeakHashMap weakHashMap = r0.j0.f46605a;
                    r0.b0.j(viewPerformCreateView, nVar);
                    this.f22679s.invalidate();
                }
                if (!this.h) {
                    this.f22679s.setVisibility(0);
                    ViewGroup viewGroup = (ViewGroup) viewPerformCreateView.getParent();
                    if (viewGroup != null) {
                        n2Var2.onRemoveFromParent();
                        try {
                            viewGroup.removeView(viewPerformCreateView);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    this.f22679s.addView(viewPerformCreateView);
                    this.f22679s.setShouldHandleBottomInsets(n2Var2.getEdgeToEdgeSupportMode());
                    this.f22679s.setDrawNavigationBar(n2Var2.drawEdgeNavigationBar());
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewPerformCreateView.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = 0;
                    viewPerformCreateView.setLayoutParams(layoutParams);
                    k kVar = n2Var2.actionBar;
                    if (kVar != null && kVar.G) {
                        if (this.f22689y0) {
                            kVar.setOccupyStatusBar(false);
                        }
                        AndroidUtilities.removeFromParent(n2Var2.actionBar);
                        this.f22679s.addView(n2Var2.actionBar);
                    }
                    n2Var2.setTitleOverlayTextIfActionBarAttached(this.C0, this.D0, this.E0);
                    n2Var2.attachSheets(this.f22679s);
                }
                this.D = n2Var2;
                this.E = n2Var;
                n2Var2.onTransitionAnimationStart(true, true);
                n2Var.onTransitionAnimationStart(false, true);
                n2Var2.onResume();
                if (this.f22661g0 != null) {
                    this.f22656e0 = n2Var2.getThemeDescriptions();
                }
                this.f22688y = n2Var2.actionBar;
                if (!n2Var2.hasOwnBackground && viewPerformCreateView.getBackground() == null) {
                    viewPerformCreateView.setBackgroundColor(g6.w0(null, g6.f23053d6, false));
                }
                if (z12) {
                    this.f22678r0 = System.currentTimeMillis();
                    this.S = true;
                    n2Var.setRemovingFromStack(true);
                    this.f22682u0 = new j3.m(this, n2Var, n2Var2, 29);
                    if (!this.h && !this.T) {
                        animatorSetOnCustomTransitionAnimation = n2Var.onCustomTransitionAnimation(false, new o(this, 3));
                    }
                    if (animatorSetOnCustomTransitionAnimation == null) {
                        boolean z13 = this.h;
                        if (z13 || !(this.f22679s.f23920b || this.v.f23920b)) {
                            d0(false, true, z13 || this.T);
                        } else {
                            u2 u2Var = new u2(this, 1);
                            this.d = u2Var;
                            AndroidUtilities.runOnUIThread(u2Var, 200L);
                        }
                    } else {
                        this.G = animatorSetOnCustomTransitionAnimation;
                        ec ecVar = ec.f28012w;
                        if (ecVar != null && ecVar.f28022l) {
                            ecVar.b();
                        }
                    }
                    I("closeLastFragment");
                } else {
                    m(n2Var);
                    n2Var.onTransitionAnimationEnd(false, true);
                    n2Var2.onTransitionAnimationEnd(true, true);
                    n2Var2.onBecomeFullyVisible();
                }
            } else if (!this.f22685w0 || z11) {
                b0(n2Var, false);
                setVisibility(8);
                View view = this.f22687x0;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                this.f22678r0 = System.currentTimeMillis();
                this.S = true;
                this.f22682u0 = new org.telegram.messenger.voip.l0(4, this, n2Var);
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) property, 1.0f, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_X, 1.0f, 0.9f));
                arrayList.add(ObjectAnimator.ofFloat(this, (Property<ActionBarLayout, Float>) View.SCALE_Y, 1.0f, 0.9f));
                View view2 = this.f22687x0;
                if (view2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 1.0f, 0.0f));
                }
                AnimatorSet animatorSet = new AnimatorSet();
                this.G = animatorSet;
                animatorSet.playTogether(arrayList);
                this.G.setInterpolator(this.J);
                this.G.setDuration(200L);
                this.G.addListener(new q(this, 0));
                this.G.start();
            }
            n2Var.onFragmentClosed();
        }
    }

    public final void m(n2 n2Var) {
        n2Var.finishing = true;
        n2Var.onPause();
        n2Var.onFragmentDestroy();
        n2Var.setParentLayout(null);
        this.K0.remove(n2Var);
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
        if (fragmentStack.isEmpty()) {
            return;
        }
        ((n2) i0.a.j(1, fragmentStack)).dismissCurrentDialog();
    }

    public final void o(View view, r0.m1 m1Var) {
        r0.c1 z0Var;
        boolean z10 = this.I0;
        if (z10) {
            if (!(view instanceof w) || !((w) view).f23928x) {
                r0.j0.b(view, r0.m1.f46618b);
                return;
            }
            int i10 = m1Var.f46619a.f(8).d;
            View view2 = getParent() instanceof View ? (View) getParent() : null;
            int iMax = Math.max(0, i10 - (view2 != null ? Math.max(0, view2.getHeight() - getBottom()) : 0));
            r0.m1 m1Var2 = r0.m1.f46618b;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 34) {
                z0Var = new r0.b1(m1Var2);
            } else if (i11 >= 30) {
                z0Var = new r0.a1(m1Var2);
            } else {
                z0Var = i11 >= 29 ? new r0.z0(m1Var2) : new r0.y0(m1Var2);
            }
            z0Var.c(8, i0.c.b(0, 0, 0, iMax));
            r0.j0.b(view, z0Var.b());
            return;
        }
        boolean z11 = this.J0;
        boolean z12 = (z10 || z11 || !(getParent() instanceof RelativeLayout)) ? false : true;
        i0.c cVar = this.f22668j1;
        i0.c cVar2 = this.f22670k1;
        if (view instanceof m3) {
            AndroidUtilities.setViewLayoutMargins(view, z11 ? 0 : cVar.f10489a, 0, z12 ? 0 : cVar.f10491c, cVar.d);
            return;
        }
        if (view instanceof w) {
            w wVar = (w) view;
            int iV = v(false);
            int iMax2 = iV > 0 ? cVar.d + iV : 0;
            y3 y3Var = wVar.f23927w;
            boolean z13 = y3Var == y3.f23973c;
            int i12 = (z13 || z11) ? 0 : cVar2.f10489a;
            int i13 = (z13 || z12) ? 0 : cVar2.f10491c;
            int i14 = (!z13 || z11) ? cVar2.f10489a : 0;
            int i15 = (!z13 || z12) ? cVar2.f10491c : 0;
            if (y3Var == y3.f23971a) {
                iMax2 = Math.max(iMax2, cVar2.d);
                r0.j0.b(view, r0.m1.f46618b);
            } else {
                r0.j0.b(view, m1Var.f46619a.m(i14, 0, i15, iMax2));
            }
            view.setPadding(i12, 0, i13, iMax2);
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
        if (this.K0.isEmpty()) {
            return;
        }
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            n2 n2Var = (n2) this.K0.get(i10);
            n2Var.onConfigurationChanged(configuration);
            Dialog dialog = n2Var.visibleDialog;
            if (dialog instanceof e3) {
                ((e3) dialog).onConfigurationChanged(configuration);
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
        return this.P || j() || onTouchEvent(motionEvent);
    }

    @Override
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        k kVar;
        z zVar;
        if (i10 == 82 && !j() && !this.M && (kVar = this.f22688y) != null && !kVar.t() && (zVar = kVar.A) != null) {
            int childCount = zVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zVar.getChildAt(i11);
                if (childAt instanceof v0) {
                    v0 v0Var = (v0) childAt;
                    if (v0Var.getVisibility() == 0) {
                        if (v0Var.q()) {
                            v0Var.M(null, null);
                            break;
                        }
                        if (v0Var.O) {
                            zVar.o(((Integer) v0Var.getTag()).intValue());
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11 = getHeight() > getWidth();
        if (this.V0 != z11) {
            this.V0 = z11;
            this.W0 = 0;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                m3 m3Var = this.A;
                if (childAt == m3Var) {
                    m3Var.setCurrentAccount(UserConfig.selectedAccount);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection());
                int i22 = i21 & 112;
                int i23 = absoluteGravity & 7;
                if (i23 != 1) {
                    if (i23 != 5) {
                        i16 = layoutParams.leftMargin + paddingLeft;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = layoutParams.rightMargin;
                    }
                    if (i22 == 16) {
                        i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    } else if (i22 == 48 && i22 == 80) {
                        i17 = paddingBottom - measuredHeight;
                        i18 = layoutParams.bottomMargin;
                    } else {
                        i19 = i + paddingTop;
                        if (childAt != this.A && this.W0 != 0 && (this.T0 || ((getParent() instanceof View) && ((View) getParent()).getHeight() > getHeight()))) {
                            i19 = this.W0;
                        } else if (childAt == this.A) {
                            this.W0 = i19;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    }
                    i19 = i17 - i18;
                    if (childAt != this.A) {
                        if (childAt == this.A) {
                            this.W0 = i19;
                        }
                    } else if (childAt == this.A) {
                        this.W0 = i19;
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                } else {
                    i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                    int i24 = i22 == 48 ? layoutParams.topMargin : layoutParams.topMargin;
                    i19 = i24 + paddingTop;
                    if (childAt != this.A) {
                        if (childAt == this.A) {
                            this.W0 = i19;
                        }
                    } else if (childAt == this.A) {
                        this.W0 = i19;
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                } else {
                    i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                    i18 = layoutParams.bottomMargin;
                }
                i19 = i17 - i18;
                if (childAt != this.A) {
                    if (childAt == this.A) {
                        this.W0 = i19;
                    }
                } else if (childAt == this.A) {
                    this.W0 = i19;
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        n2 n2Var = !this.K0.isEmpty() ? (n2) i0.a.j(1, this.K0) : null;
        if (n2Var != null && !n2Var.isSupportEdgeToEdge() && e0()) {
            int iB = B();
            n2Var.setKeyboardHeightFromParent(iB);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) + iB, 1073741824));
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
        this.T0 = B() > AndroidUtilities.dp(20.0f);
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar;
        boolean z10 = false;
        if (!j() && !this.f22680s0 && !this.P && !this.Z0) {
            if (this.K0.size() > 1 && ((rVar = this.C) == null || rVar.getLastSheet() == null || !this.C.getLastSheet().isShown())) {
                if (motionEvent == null || motionEvent.getAction() != 0) {
                    if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f22681t0) {
                        if (this.Q == null) {
                            this.Q = VelocityTracker.obtain();
                        }
                        int iMax = Math.max(0, (int) (motionEvent.getX() - this.N));
                        int iAbs = Math.abs(((int) motionEvent.getY()) - this.O);
                        this.Q.addMovement(motionEvent);
                        if (this.S || this.h || !this.L || this.M || iMax < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(iMax) / 3 <= iAbs) {
                            if (this.M) {
                                if (!this.R) {
                                    Activity activity = this.G0;
                                    if (activity.getCurrentFocus() != null) {
                                        AndroidUtilities.hideKeyboard(activity.getCurrentFocus());
                                    }
                                    ((n2) i0.a.j(1, this.K0)).onBeginSlide();
                                    this.R = true;
                                }
                                if (D()) {
                                    float f10 = iMax;
                                    this.f22679s.setTranslationX((f10 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                                    setInnerTranslationX((f10 / getWidth()) * AndroidUtilities.dp(56.0f) * 5);
                                } else {
                                    float f11 = iMax;
                                    this.f22679s.setTranslationX(f11);
                                    setInnerTranslationX(f11);
                                }
                            }
                        } else if (((n2) i0.a.j(1, this.K0)).canBeginSlide() && u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                            this.N = (int) motionEvent.getX();
                            O();
                        } else {
                            this.L = false;
                        }
                    } else if (motionEvent != null && motionEvent.getPointerId(0) == this.f22681t0 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                        if (this.Q == null) {
                            this.Q = VelocityTracker.obtain();
                        }
                        this.Q.addMovement(motionEvent);
                        this.Q.computeCurrentVelocity(1000);
                        n2 n2Var = (n2) i0.a.j(1, this.K0);
                        if (!this.h && !this.T && !this.M && n2Var.isSwipeBackEnabled(motionEvent)) {
                            float xVelocity = this.Q.getXVelocity();
                            float yVelocity = this.Q.getYVelocity();
                            if (xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity) && n2Var.canBeginSlide()) {
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
                            float x8 = this.f22679s.getX();
                            float xVelocity2 = this.Q.getXVelocity();
                            float yVelocity2 = this.Q.getYVelocity();
                            if (!D() ? x8 < this.f22679s.getMeasuredWidth() / 3.0f : !(x8 >= AndroidUtilities.dp(56.0f) / 2 && xVelocity2 >= -1000.0f)) {
                                if (xVelocity2 < 3500.0f || Math.abs(xVelocity2) < Math.abs(yVelocity2)) {
                                    z10 = true;
                                }
                            }
                            e(z10);
                        } else {
                            this.L = false;
                            this.M = false;
                            w wVar = this.f22679s;
                            if (wVar != null) {
                                wVar.setLayerType(0, null);
                            }
                        }
                        VelocityTracker velocityTracker = this.Q;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.Q = null;
                        }
                    } else if (motionEvent == null) {
                        this.L = false;
                        this.M = false;
                        w wVar2 = this.f22679s;
                        if (wVar2 != null) {
                            wVar2.setLayerType(0, null);
                        }
                        VelocityTracker velocityTracker2 = this.Q;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                            this.Q = null;
                        }
                    }
                } else if (((n2) i0.a.j(1, this.K0)).isSwipeBackEnabled(motionEvent)) {
                    this.f22681t0 = motionEvent.getPointerId(0);
                    this.L = true;
                    this.N = (int) motionEvent.getX();
                    this.O = (int) motionEvent.getY();
                    VelocityTracker velocityTracker3 = this.Q;
                    if (velocityTracker3 != null) {
                        velocityTracker3.clear();
                    }
                } else {
                    this.L = false;
                    this.M = false;
                    w wVar3 = this.f22679s;
                    if (wVar3 != null) {
                        wVar3.setLayerType(0, null);
                        return false;
                    }
                }
            }
            return this.M;
        }
        return false;
    }

    public final void p(Canvas canvas, int i10, int i11) {
        if (l1 == null || !SharedConfig.drawActionBarShadow) {
            return;
        }
        int i12 = i10 / 2;
        if (l1.getAlpha() != i12) {
            l1.setAlpha(i12);
        }
        l1.setBounds(0, i11, getMeasuredWidth(), l1.getIntrinsicHeight() + i11);
        l1.draw(canvas);
    }

    public final void q(Canvas canvas, int i10) {
        p(canvas, 255, i10);
    }

    public final void r() {
        boolean z10 = true;
        this.f22672n = true;
        this.h = false;
        n2 n2Var = (n2) i0.a.j(2, this.K0);
        n2 n2Var2 = (n2) i0.a.j(1, this.K0);
        n2Var2.fragmentView.setOutlineProvider(null);
        n2Var2.fragmentView.setClipToOutline(false);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n2Var2.fragmentView.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.height = -1;
        n2Var2.fragmentView.setLayoutParams(layoutParams);
        T(n2Var, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(n2Var2.fragmentView, (Property<View, Float>) View.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(n2Var2.fragmentView, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new er(0.42d, 0.0d, 0.58d, 1.0d));
        animatorSet.addListener(new ag.x1(12, this, n2Var2));
        animatorSet.start();
        try {
            performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f22679s.setShouldHandleBottomInsets(n2Var2.getEdgeToEdgeSupportMode());
        this.f22679s.setDrawNavigationBar(n2Var2.drawEdgeNavigationBar());
        n2Var2.setInPreviewMode(false);
        n2Var2.setInMenuMode(false);
        try {
            Activity activity = this.G0;
            if (g6.w0(null, g6.f23322s8, false) != -1 && (!n2Var2.hasForceLightStatusBar() || g6.A0().q())) {
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
        return !this.K0.isEmpty() && ((n2) i0.a.j(1, this.K0)).extendActionMode(menu);
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
    public void setFragmentPanTranslationOffset(int i10) {
        w wVar = this.f22679s;
        if (wVar != null) {
            wVar.setFragmentPanTranslationOffset(i10);
        }
    }

    @Override
    public void setFragmentStack(List<n2> list) {
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
            this.B = new af.h(m3Var2);
            m3 m3Var3 = this.A;
            o oVar3 = new o(this, 0);
            o oVar4 = new o(this, 1);
            m3Var3.E.add(oVar3);
            m3Var3.F.add(oVar4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(76.0f));
            layoutParams.gravity = 87;
            addView(this.A, layoutParams);
            v3 v3Var = LaunchActivity.C1.f35537u0;
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
        this.X0.f34810a = wVar6;
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
            View viewPerformCreateView = rVar2.fragmentView;
            if (viewPerformCreateView == null) {
                viewPerformCreateView = rVar2.performCreateView(activity);
            }
            if (viewPerformCreateView.getParent() != this.f22684w) {
                AndroidUtilities.removeFromParent(viewPerformCreateView);
                this.f22684w.addView(viewPerformCreateView, h7.z5.c(-1.0f, -1));
                this.f22684w.setShouldHandleBottomInsets(this.C.getEdgeToEdgeSupportMode());
            }
            this.C.onResume();
            this.C.onBecomeFullyVisible();
        }
        Iterator it = this.K0.iterator();
        while (it.hasNext()) {
            ((n2) it.next()).setParentLayout(this);
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
        int navigationBarColor;
        int navigationBarColor2;
        this.K = f10;
        invalidate();
        if (this.K0.size() < 2 || this.f22679s.getMeasuredWidth() <= 0) {
            return;
        }
        float fClamp01 = D() ? Utilities.clamp01(f10 / (AndroidUtilities.dp(56.0f) * 6)) : f10 / this.f22679s.getMeasuredWidth();
        n2 n2Var = (n2) i0.a.j(2, this.K0);
        n2Var.onSlideProgress(false, fClamp01);
        n2 n2Var2 = (n2) i0.a.j(1, this.K0);
        float fA = h7.n.a(fClamp01 * 2.0f, 0.0f, 1.0f);
        if (!n2Var2.isBeginToShow() || (navigationBarColor = n2Var2.getNavigationBarColor()) == (navigationBarColor2 = n2Var.getNavigationBarColor())) {
            return;
        }
        n2Var2.setNavigationBarColor(i0.b.d(fA, navigationBarColor, navigationBarColor2));
    }

    @Override
    public void setIsSheet(boolean z10) {
        this.f22647b = z10;
    }

    @Override
    public void setNavigationBarColor(int i10) {
        if (this.f22664h1 != i10) {
            this.f22664h1 = i10;
            invalidate();
        }
        x3 x3Var = this.f22686x;
        if (x3Var != null) {
            x3Var.setInternalNavigationBarColor(i10);
        }
        m3 m3Var = this.A;
        if (m3Var != null) {
            m3Var.i(i10, (this.M || this.P) ? false : true);
        }
    }

    public void setOverrideWidthOffset(int i10) {
        this.P0 = i10;
        invalidate();
    }

    @Override
    public void setPulledDialogs(List<e9> list) {
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
        int i10 = 0;
        while (i10 < size) {
            ArrayList arrayList2 = (ArrayList) arrayList.get(i10);
            int[] iArr = (int[]) this.U.get(i10);
            int[] iArr2 = (int[]) this.V.get(i10);
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                int iRed = Color.red(iArr2[i11]);
                int iGreen = Color.green(iArr2[i11]);
                int iBlue = Color.blue(iArr2[i11]);
                int iAlpha = Color.alpha(iArr2[i11]);
                int iRed2 = Color.red(iArr[i11]);
                int iGreen2 = Color.green(iArr[i11]);
                ArrayList arrayList3 = arrayList;
                int iBlue2 = Color.blue(iArr[i11]);
                int i12 = size;
                int iAlpha2 = Color.alpha(iArr[i11]);
                int i13 = i10;
                int iArgb = Color.argb(Math.min(255, (int) (((iAlpha - iAlpha2) * f10) + iAlpha2)), Math.min(255, (int) (((iRed - iRed2) * f10) + iRed2)), Math.min(255, (int) (((iGreen - iGreen2) * f10) + iGreen2)), Math.min(255, (int) (((iBlue - iBlue2) * f10) + iBlue2)));
                i6 i6Var = (i6) arrayList2.get(i11);
                int i14 = i6Var.f23517f;
                c6 c6Var = i6Var.f23525o;
                if (c6Var != null) {
                    c6Var.c1(i14, iArgb);
                } else {
                    SparseIntArray sparseIntArray = g6.sl;
                    if (sparseIntArray != null) {
                        sparseIntArray.put(i14, iArgb);
                    }
                }
                i6Var.d(iArgb, false, false);
                i11++;
                i10 = i13;
                arrayList = arrayList3;
                size = i12;
            }
            i10++;
        }
        ArrayList arrayList4 = this.f22659f0;
        int size3 = arrayList4.size();
        for (int i15 = 0; i15 < size3; i15++) {
            h6 h6Var = (h6) arrayList4.get(i15);
            if (h6Var != null) {
                h6Var.b();
                h6Var.a(f10);
            }
        }
        ArrayList arrayList5 = this.f22656e0;
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            for (int i16 = 0; i16 < size4; i16++) {
                i6 i6Var2 = (i6) this.f22656e0.get(i16);
                i6Var2.d(g6.v0(i6Var2.f23517f, i6Var2.f23525o), false, false);
            }
        }
        mn mnVar = this.f22651c0;
        if (mnVar != null) {
            pn pnVar = mnVar.f40550a;
            pnVar.R.f42213t0.invalidate();
            pnVar.E.I = f10;
            pnVar.F.I = f10;
            pnVar.k(f10);
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

    public final n2 t() {
        if (getFragmentStack().isEmpty()) {
            return null;
        }
        for (int size = getFragmentStack().size() - 1; size >= 0; size--) {
            n2 n2Var = (n2) getFragmentStack().get(size);
            if (n2Var != null && !n2Var.isFinishing() && !n2Var.isRemovingFromStack() && ig0.class.isInstance(n2Var)) {
                return n2Var;
            }
        }
        return null;
    }

    public final int v(boolean z10) {
        m3 m3Var;
        if (!this.H0 || (m3Var = this.A) == null) {
            return 0;
        }
        return z10 ? (int) m3Var.C : m3Var.D;
    }

    public final ty w() {
        Activity activity = this.G0;
        if (activity == null) {
            return null;
        }
        if (this.C == null) {
            r rVar = new r(this);
            this.C = rVar;
            rVar.setParentLayout(this);
            r rVar2 = this.C;
            View viewPerformCreateView = rVar2.fragmentView;
            if (viewPerformCreateView == null) {
                viewPerformCreateView = rVar2.performCreateView(activity);
            }
            if (viewPerformCreateView.getParent() != this.f22684w) {
                AndroidUtilities.removeFromParent(viewPerformCreateView);
                this.f22684w.addView(viewPerformCreateView, h7.z5.c(-1.0f, -1));
                this.f22684w.setShouldHandleBottomInsets(this.C.getEdgeToEdgeSupportMode());
                this.f22684w.setDrawNavigationBar(this.C.drawEdgeNavigationBar());
            }
            this.C.onResume();
            this.C.onBecomeFullyVisible();
        }
        return this.C;
    }

    public final boolean y() {
        return this.h || this.T;
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
