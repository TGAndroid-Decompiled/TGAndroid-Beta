package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.m10;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.ah;
import org.telegram.ui.s51;
import org.telegram.ui.yg;
public class q0 extends FrameLayout {
    public int E;
    public final TextView F;
    public k0 G;
    public boolean H;
    public m0 I;
    public Rect J;
    public int[] K;
    public View L;
    public ci.e1 M;
    public int N;
    public int O;
    public int P;
    public l0 Q;
    public n0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public FrameLayout f28438a;
    public gi.b2 f28439a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f28440b;
    public int f28441b0;
    public final x f28442c;
    public int f28443c0;
    public f1 d;
    public boolean f28444d0;
    public bh.g f28445e;
    public boolean f28446e0;
    public LinearLayout f28447f;
    public boolean f28448f0;
    public boolean f28449g0;
    public TextView h;
    public final ArrayList f28450h0;
    public int f28451i0;
    public final g2.g f28452j0;
    public float f28453k0;
    public float f28454l0;
    public View m0;
    public CharSequence f28455n;
    public final e6 f28456n0;
    public int f28457o0;
    public View.OnClickListener f28458p0;
    public boolean f28459q0;
    public CharSequence f28460r;
    public boolean f28461r0;
    public e0 f28462s;
    public PorterDuffColorFilter f28463s0;
    public int f28464t0;
    public eh.c f28465u0;
    public hh.e f28466v0;
    public AnimatorSet f28467w;
    public m10 f28468w0;
    public View f28469x;
    public AnimatorSet f28470x0;
    public final fh0 f28471y;
    public ArrayList f28472y0;
    public HashMap f28473z0;

    public q0(Context context, int i3, int i10) {
        this(context, null, i3, i10, true, null);
    }

    public static y0 c(boolean z10, boolean z11, ViewGroup viewGroup, int i3, CharSequence charSequence, boolean z12, e6 e6Var) {
        y0 y0Var = new y0(z12 ? 1 : 0, viewGroup.getContext(), e6Var, z10, z11);
        y0Var.j(charSequence, i3, null);
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        viewGroup.addView(y0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
        if (bd.f21784a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        y0Var.setLayoutParams(layoutParams);
        return y0Var;
    }

    private i5 getShownSubMenuOverlay() {
        i5 i5Var;
        s4 subMenuOverlayHost = getSubMenuOverlayHost();
        if (subMenuOverlayHost != null) {
            i5Var = subMenuOverlayHost.getOpenMenuOverlay();
        } else {
            i5Var = null;
        }
        if (i5Var == null || i5Var.f27638e != this || (!i5Var.f27646y && !i5Var.N)) {
            return null;
        }
        return i5Var;
    }

    public final void A(ch0 ch0Var, String str) {
        o0 o0Var = new o0(0);
        o0Var.f28365b = 29;
        o0Var.f28366c = 0;
        o0Var.d = ch0Var;
        o0Var.f28367e = str;
        o0Var.f28368f = true;
        G(o0Var);
    }

    public final o0 B(ah ahVar) {
        o0 o0Var = new o0(2);
        o0Var.f28366c = 2131232256;
        o0Var.d = null;
        o0Var.f28367e = null;
        o0Var.f28369g = null;
        o0Var.h = ahVar;
        G(o0Var);
        return o0Var;
    }

    public final o0 C() {
        o0 o0Var = new o0(3);
        o0Var.f28367e = "";
        o0Var.f28370i = 13;
        G(o0Var);
        return o0Var;
    }

    public final void D() {
        Integer num;
        boolean z10;
        ArrayList arrayList = this.f28450h0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        k0 k0Var = this.G;
        if (k0Var != null && k0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new h0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.f40453g);
            transitionSet.addListener((Transition.TransitionListener) new i0(0, this));
            TransitionManager.beginDelayedTransition(this.f28447f, transitionSet);
        }
        if (this.f28447f != null) {
            int i3 = 0;
            while (i3 < this.f28447f.getChildCount()) {
                if (!arrayList2.remove(((p0) this.f28447f.getChildAt(i3)).getFilter())) {
                    this.f28447f.removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            kg.l0 l0Var = (kg.l0) arrayList2.get(i10);
            l0Var.getClass();
            p0 p0Var = new p0(getContext(), this.f28456n0);
            p0Var.setData(l0Var);
            p0Var.setOnClickListener(new org.telegram.messenger.video.g(1, this, p0Var));
            this.f28447f.addView(p0Var, mf.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f28447f != null) {
            for (int i11 = 0; i11 < this.f28447f.getChildCount(); i11++) {
                p0 p0Var2 = (p0) this.f28447f.getChildAt(i11);
                if (i11 == this.f28451i0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p0Var2.setExpanded(z10);
            }
        }
        LinearLayout linearLayout = this.f28447f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x10 = this.f28445e.getX();
        if (this.G.getTag() != null) {
            this.f28445e.getViewTreeObserver().addOnPreDrawListener(new j0(this, x10));
        }
        j();
    }

    public void E() {
        m0 m0Var = this.I;
        if (m0Var != null) {
            m0Var.k(this.f28445e);
        }
    }

    public void F(boolean z10) {
        x xVar;
        k();
        k0 k0Var = this.G;
        if (k0Var != null && k0Var.getVisibility() != 0 && (xVar = this.f28442c) != null) {
            xVar.f28786b.y(T(z10));
        }
    }

    public final o0 G(o0 o0Var) {
        if (this.f28472y0 == null) {
            this.f28472y0 = new ArrayList();
        }
        this.f28472y0.add(o0Var);
        if (this.f28473z0 == null) {
            this.f28473z0 = new HashMap();
        }
        this.f28473z0.put(Integer.valueOf(o0Var.f28365b), o0Var);
        return o0Var;
    }

    public final void H(int i3) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i3) {
            this.f28440b.setBackgroundColor(i3);
            f1 f1Var = this.d;
            if (f1Var != null && f1Var.isShowing()) {
                this.f28440b.invalidate();
            }
        }
    }

    public final void I(kg.l0 l0Var) {
        if (!l0Var.h) {
            return;
        }
        ArrayList arrayList = this.f28450h0;
        arrayList.remove(l0Var);
        int i3 = this.f28451i0;
        if (i3 < 0 || i3 > arrayList.size() - 1) {
            this.f28451i0 = arrayList.size() - 1;
        }
        D();
        this.f28445e.m();
    }

    public q0 J(m0 m0Var) {
        this.I = m0Var;
        return this;
    }

    public final void K() {
        this.S = false;
    }

    public final void L(eh.c cVar, hh.e eVar) {
        this.f28465u0 = cVar;
        this.f28466v0 = eVar;
        View view = this.f28440b;
        if (view != null && cVar != null) {
            gh.g c2 = cVar.c(view, null, true);
            c2.p(eVar);
            c2.r(org.telegram.messenger.g0.L(12.0f));
            c2.q(org.telegram.messenger.g0.L(8.0f));
            view.setBackground(c2);
        }
    }

    public q0 M() {
        return N();
    }

    public q0 N() {
        if (this.f28442c == null) {
            return this;
        }
        this.H = true;
        return this;
    }

    public final void O(int i3, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            s51 s51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = s51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = s51Var.getChildAt(i10);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i3);
                } else if (childAt instanceof y0) {
                    if (z10) {
                        ((y0) childAt).setIconColor(i3);
                    } else {
                        ((y0) childAt).setTextColor(i3);
                    }
                }
            }
        }
    }

    public void P(CharSequence charSequence, boolean z10) {
        this.f28460r = charSequence;
        if (this.h != null) {
            this.f28446e0 = z10;
            this.f28445e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f28445e.setSelection(charSequence.length());
            }
        }
    }

    public final void Q(int i3, boolean z10) {
        if (z10) {
            S(i3);
        } else {
            t(i3);
        }
    }

    public final void R(int i3) {
        S(i3);
    }

    public final void S(int i3) {
        o0 o0Var;
        View findViewWithTag;
        HashMap hashMap = this.f28473z0;
        if (hashMap == null) {
            o0Var = null;
        } else {
            o0Var = (o0) hashMap.get(Integer.valueOf(i3));
        }
        if (o0Var != null) {
            o0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i3))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            org.telegram.messenger.camera.q.l(findViewWithTag.animate().alpha(1.0f), xq.f40452f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public boolean T(boolean z10) {
        x xVar;
        fh0 iconView;
        Animator e10;
        k();
        m0 m0Var = this.I;
        if (this.G == null || (m0Var != null && !m0Var.c())) {
            return false;
        }
        m0 m0Var2 = this.I;
        if (m0Var2 != null && (e10 = m0Var2.e()) != null) {
            e10.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            xVar = this.f28442c;
            if (i3 >= xVar.getChildCount()) {
                break;
            }
            View childAt = xVar.getChildAt(i3);
            if ((childAt instanceof q0) && (iconView = ((q0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i3++;
        }
        Object tag = this.G.getTag();
        Property property = View.ALPHA;
        if (tag != null) {
            this.G.setTag(null);
            AnimatorSet animatorSet = this.f28470x0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f28470x0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28470x0 = animatorSet2;
            k0 k0Var = this.G;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(k0Var, property, k0Var.getAlpha(), 0.0f));
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setAlpha(0.0f);
                this.f28470x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i10), property, ((View) arrayList.get(i10)).getAlpha(), 1.0f));
            }
            this.f28470x0.setDuration(150L);
            this.f28470x0.addListener(new g0(this, arrayList, 0));
            this.f28470x0.start();
            this.f28445e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f28450h0;
            if (!arrayList2.isEmpty() && this.I != null) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((kg.l0) arrayList2.get(i11)).h) {
                        this.I.j((kg.l0) arrayList2.get(i11));
                    }
                }
            }
            m0 m0Var3 = this.I;
            if (m0Var3 != null) {
                m0Var3.h();
            }
            if (z10) {
                org.telegram.messenger.g0.v1(this.f28445e);
            }
            xVar.requestLayout();
            requestLayout();
            return false;
        }
        this.G.setVisibility(0);
        this.G.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f28470x0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f28470x0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f28470x0 = animatorSet4;
        k0 k0Var2 = this.G;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(k0Var2, property, k0Var2.getAlpha(), 1.0f));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f28470x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i12), property, ((View) arrayList.get(i12)).getAlpha(), 0.0f));
        }
        this.f28470x0.setDuration(150L);
        this.f28470x0.addListener(new g0(this, arrayList, 1));
        this.f28470x0.start();
        setVisibility(8);
        m();
        this.f28445e.setText("");
        this.f28445e.requestFocus();
        if (z10) {
            org.telegram.messenger.g0.K3(this.f28445e);
        }
        this.G.setTag(1);
        m0 m0Var4 = this.I;
        if (m0Var4 != null) {
            m0Var4.i();
        }
        return true;
    }

    public final void U(View view, q0 q0Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z10;
        View childAt;
        long j10;
        k kVar;
        final i5 i5Var;
        f1 f1Var;
        boolean z11;
        View view2 = null;
        if (view == null) {
            s4 subMenuOverlayHost = getSubMenuOverlayHost();
            if (subMenuOverlayHost != null) {
                i5Var = getSubMenuOverlay();
            } else {
                i5Var = null;
            }
            if (i5Var != null && ((f1Var = this.d) == null || !f1Var.isShowing())) {
                y();
                if (s() && i()) {
                    if (i5Var.f27638e == this && (((z11 = i5Var.f27646y) || i5Var.N) && z11)) {
                        i5Var.a(true);
                        return;
                    }
                    this.U = false;
                    n0 n0Var = this.R;
                    if (n0Var != null) {
                        n0Var.g();
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = getPopupLayout();
                    WeakHashMap weakHashMap = i5Var.f27642r;
                    if (!i5Var.f27646y || i5Var.d != subMenuOverlayHost || i5Var.f27638e != this) {
                        s4 s4Var = i5Var.d;
                        if (s4Var != null && (s4Var != subMenuOverlayHost || i5Var.f27638e != this)) {
                            i5Var.c();
                        }
                        i5Var.d = subMenuOverlayHost;
                        i5Var.f27638e = this;
                        subMenuOverlayHost.getClass();
                        i5Var.f27643s = false;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = i5Var.f27640f;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != popupLayout) {
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            }
                            i5Var.f27640f = popupLayout;
                        }
                        i5Var.h(popupLayout, org.telegram.messenger.g0.L(5.0f));
                        popupLayout.setTranslationX(0.0f);
                        popupLayout.setTranslationY(0.0f);
                        popupLayout.setAlpha(1.0f);
                        r6.d0(popupLayout, false);
                        f60.U(popupLayout, k6.r1(0.06f, k6.w0(k6.E8, i5Var.d.getMenuResourcesProvider())));
                        popupLayout.f();
                        xe0 swipeBack = popupLayout.getSwipeBack();
                        if (swipeBack != null) {
                            swipeBack.b(false);
                            swipeBack.setForegroundOnGlass(true);
                            if (i5Var.f27633b != swipeBack) {
                                i5Var.f27633b = swipeBack;
                                swipeBack.f40338y.add(new we0() {
                                    @Override
                                    public final void a(float f10, float f11) {
                                        i5.this.invalidate();
                                    }
                                });
                            }
                            for (int i3 = 1; i3 < swipeBack.getChildCount(); i3++) {
                                if (swipeBack.getChildAt(i3) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i3);
                                    i5Var.h(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                                    r6.d0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                                    f60.U(actionBarPopupWindow$ActionBarPopupWindowLayout3, k6.r1(0.06f, k6.w0(k6.E8, i5Var.d.getMenuResourcesProvider())));
                                }
                            }
                        }
                        ScrollView scrollView = popupLayout.L;
                        if (scrollView != null) {
                            scrollView.scrollTo(0, 0);
                        }
                        if (popupLayout.getParent() != i5Var) {
                            org.telegram.messenger.g0.E2(popupLayout);
                            i5Var.addView(popupLayout, new FrameLayout.LayoutParams(-2, -2));
                        }
                        gh.g gVar = i5Var.h;
                        if (gVar == null || i5Var.f27641n != subMenuOverlayHost) {
                            if (gVar != null) {
                                gVar.f53577a.setEmpty();
                                i5Var.h.setBounds(0, 0, 0, 0);
                            }
                            gh.g gVar2 = (gh.g) weakHashMap.get(subMenuOverlayHost);
                            i5Var.h = gVar2;
                            if (gVar2 == null) {
                                gh.g c2 = subMenuOverlayHost.c(i5Var);
                                i5Var.h = c2;
                                if (c2 != null) {
                                    c2.p(i5Var.f27635c);
                                    weakHashMap.put(subMenuOverlayHost, i5Var.h);
                                }
                            }
                            i5Var.f27641n = subMenuOverlayHost;
                        }
                        ViewParent parent = i5Var.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).bringChildToFront(i5Var);
                        }
                        i5Var.setVisibility(0);
                        i5Var.f27646y = true;
                        i5Var.G = SystemClock.uptimeMillis();
                        i5Var.f();
                        subMenuOverlayHost.d(i5Var, this);
                        i5Var.b();
                        if (!i5Var.E) {
                            getIconView().setAlpha(0.0f);
                        }
                        if (i5Var.getRootView() != null) {
                            view2 = i5Var.getRootView().findFocus();
                        }
                        if (!(view2 instanceof EditText) || !view2.isShown()) {
                            i5Var.setFocusableInTouchMode(true);
                            i5Var.requestFocus();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        f1 f1Var2 = this.d;
        if (f1Var2 == null || !f1Var2.isShowing()) {
            y();
        }
        if (this.f28440b != null) {
            x xVar = this.f28442c;
            if (xVar == null || !xVar.f28787c || (kVar = xVar.f28786b) == null || kVar.v()) {
                ci.e1 e1Var = this.M;
                if (e1Var != null) {
                    org.telegram.messenger.g0.r(e1Var);
                    this.M = null;
                }
                f1 f1Var3 = this.d;
                if (f1Var3 != null && f1Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.m0 = q0Var;
                n0 n0Var2 = this.R;
                if (n0Var2 != null) {
                    n0Var2.g();
                }
                if (this.f28440b.getParent() != null) {
                    ((ViewGroup) this.f28440b.getParent()).removeView(this.f28440b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = this.f28440b;
                if (view != null) {
                    ?? y4Var = new gi.y4(this, getContext(), view);
                    y4Var.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout.animate().alpha(1.0f).setDuration(100L);
                    if (this.f28440b.f27340w) {
                        j10 = 165;
                    } else {
                        j10 = 0;
                    }
                    duration.setStartDelay(j10).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof y0) || (view instanceof LinearLayout)) {
                        eh.c cVar = this.f28465u0;
                        if (cVar != null) {
                            gh.g c10 = cVar.c(this.f28440b, null, true);
                            c10.p(this.f28466v0);
                            org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
                            c10.R.f12302e = true;
                            frameLayout.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(2131232563).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f28440b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, mf.c(-2.0f, -1));
                    y4Var.addView(frameLayout, mf.o(-1, -2));
                    y4Var.addView(this.f28440b, mf.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f28440b.setTopView(frameLayout);
                    view2 = frameLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = y4Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                }
                if (this.f28465u0 != null) {
                    f60.U(this.f28440b, k6.r1(0.06f, k6.w0(k6.E8, this.f28456n0)));
                }
                f1 f1Var4 = new f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = f1Var4;
                if (this.W) {
                    f1Var4.setAnimationStyle(0);
                } else {
                    f1Var4.setAnimationStyle(2131755191);
                }
                boolean z12 = this.W;
                if (!z12) {
                    this.d.f27493b = z12;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.V) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view3, int i10, KeyEvent keyEvent) {
                        f1 f1Var5;
                        q0 q0Var2 = q0.this;
                        q0Var2.getClass();
                        if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (f1Var5 = q0Var2.d) != null && f1Var5.isShowing()) {
                            q0Var2.d.d(true);
                            return true;
                        }
                        return false;
                    }
                });
                this.d.setOnDismissListener(new gi.m4(1, this));
                Point point = org.telegram.messenger.g0.f22608q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.camera.q.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                if (view2 != null && view2.getLayoutParams() != null && this.f28440b.getSwipeBack() != null && (childAt = this.f28440b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    view2.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                }
                this.U = false;
                this.d.setFocusable(true);
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                W(true, z10);
                this.f28440b.f();
                if (this.f28440b.getSwipeBack() != null) {
                    this.f28440b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.f28453k0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void V() {
        if (this.f28447f != null) {
            for (int i3 = 0; i3 < this.f28447f.getChildCount(); i3++) {
                if (this.f28447f.getChildAt(i3) instanceof p0) {
                    ((p0) this.f28447f.getChildAt(i3)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28440b;
        e6 e6Var = this.f28456n0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i10 = 0; i10 < this.f28440b.getItemsCount(); i10++) {
                if (this.f28440b.M.getChildAt(i10) instanceof y0) {
                    ((y0) this.f28440b.M.getChildAt(i10)).setSelectorColor(k6.w0(k6.I5, e6Var));
                }
            }
        }
        bh.g gVar = this.f28445e;
        if (gVar != null) {
            int i11 = k6.C8;
            r6.m(gVar, 30, i11, e6Var);
            r6.E(this.f28445e, k6.D8, e6Var);
            r6.V(this.f28445e, i11, e6Var);
            r6.D(this.f28445e, k6.ig, e6Var);
            r6.z(this.f28445e, k6.f27998jg, e6Var);
        }
    }

    public final void W(boolean z10, boolean z11) {
        float f10;
        int i3;
        int i10;
        ScrollView scrollView;
        x xVar = this.f28442c;
        if (xVar != null) {
            i10 = xVar.getTop() + (-xVar.f28786b.getMeasuredHeight());
            i3 = xVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            float measuredHeight = getMeasuredHeight() * scaleY;
            if (this.N != 2) {
                f10 = getTranslationY();
            } else {
                f10 = 0.0f;
            }
            i3 = -((int) (measuredHeight - (f10 / scaleY)));
            i10 = this.f28441b0;
        }
        int i11 = i3 + i10 + this.O;
        if (z10 && (scrollView = this.f28440b.L) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.m0;
        if (view == null) {
            view = this;
        }
        if (xVar != null) {
            k kVar = xVar.f28786b;
            if (this.N == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (xVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (xVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.f28448f0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.P, i11);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.P, i11);
                }
            }
            if (z11) {
                this.d.update(kVar, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.P, i11, -1, -1);
                return;
            }
            return;
        }
        int i12 = this.N;
        if (i12 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z10) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f28443c0 + this.P, i11);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f28443c0 + this.P, i11, -1, -1);
                }
            }
        } else if (i12 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-org.telegram.messenger.g0.L(8.0f)) + this.f28443c0 + this.P, i11);
            }
            if (z11) {
                this.d.update(this, (-org.telegram.messenger.g0.L(8.0f)) + this.f28443c0 + this.P, i11, -1, -1);
            }
        } else {
            if (z10) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f28443c0 + this.P, i11);
            }
            if (z11) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f28443c0 + this.P, i11, -1, -1);
            }
        }
    }

    public final c1 a(int i3) {
        p();
        c1 c1Var = new c1(k6.H8, getContext(), this.f28456n0);
        if (i3 != -1) {
            c1Var.setTag(Integer.valueOf(i3));
        }
        c1Var.setTag(2131296437, 1);
        this.f28440b.a(c1Var, mf.o(-1, 8));
        return c1Var;
    }

    public final TextView b(int i3) {
        p();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i3);
        textView.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        this.f28440b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int L = org.telegram.messenger.g0.L(3.0f);
        layoutParams.bottomMargin = L;
        layoutParams.topMargin = L;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final y0 d(int i3, int i10, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, e6 e6Var) {
        p();
        y0 y0Var = new y0(z11 ? 1 : 0, getContext(), e6Var, false, false);
        y0Var.j(charSequence, i10, drawable);
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        y0Var.setTag(Integer.valueOf(i3));
        this.f28440b.addView(y0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
        if (bd.f21784a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        y0Var.setLayoutParams(layoutParams);
        y0Var.setOnClickListener(new ei.e2(2, this, z10));
        return y0Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f28459q0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final y0 e(int i3, int i10, CharSequence charSequence) {
        return d(i3, i10, null, charSequence, true, false, this.f28456n0);
    }

    public final void f(int i3, String str) {
        p();
        TextView textView = new TextView(getContext());
        r6.V(textView, k6.E8, this.f28456n0);
        textView.setBackgroundDrawable(k6.N0(false));
        if (!bd.f21784a0) {
            textView.setGravity(16);
        } else {
            textView.setGravity(21);
        }
        textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(org.telegram.messenger.g0.L(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i3));
        textView.setText(str);
        this.f28440b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (bd.f21784a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new y(this, 3));
    }

    public final void g(org.telegram.ui.Cells.k kVar, int i3) {
        p();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i3));
        this.f28440b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new y(this, 1));
        kVar.setBackgroundDrawable(k6.N0(false));
    }

    public View getContentView() {
        fh0 fh0Var = this.f28471y;
        if (fh0Var != null) {
            return fh0Var;
        }
        return this.F;
    }

    public fh0 getIconView() {
        return this.f28471y;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f28458p0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f28440b == null) {
            p();
        }
        return this.f28440b;
    }

    public ImageView getSearchClearButton() {
        return this.f28462s;
    }

    public FrameLayout getSearchContainer() {
        return this.G;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.f28445e;
    }

    public i5 getSubMenuOverlay() {
        m10 m10Var = this.f28468w0;
        if (m10Var != null) {
            return (i5) m10Var.run();
        }
        return null;
    }

    public s4 getSubMenuOverlayHost() {
        x xVar;
        if (this.f28468w0 != null && (xVar = this.f28442c) != null) {
            return xVar.f28786b;
        }
        return null;
    }

    public TextView getTextView() {
        return this.F;
    }

    public int getVisibleSubItemsCount() {
        int i3 = 0;
        for (int i10 = 0; i10 < this.f28440b.getItemsCount(); i10++) {
            View childAt = this.f28440b.M.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                i3++;
            }
        }
        return i3;
    }

    public final y0 h(int i3, zz0 zz0Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        p();
        y0 y0Var = new y0(0, getContext(), this.f28456n0, false, false);
        y0Var.j(str, i3, zz0Var);
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        y0Var.setRightIcon(2131232059);
        this.f28440b.addView(y0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
        if (bd.f21784a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        y0Var.setLayoutParams(layoutParams);
        y0Var.Q = new c0(this, this.f28440b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        y0Var.setOnClickListener(new d0(y0Var, 0));
        this.f28440b.f27334c = true;
        return y0Var;
    }

    public boolean i() {
        k kVar;
        x xVar = this.f28442c;
        if (xVar != null && xVar.f28787c && (kVar = xVar.f28786b) != null && !kVar.v()) {
            return false;
        }
        return true;
    }

    public final void j() {
        m0 m0Var;
        TextView textView;
        m0 m0Var2;
        if (this.f28462s != null) {
            boolean r5 = r();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!r5 && TextUtils.isEmpty(this.f28445e.getText()) && (((m0Var = this.I) == null || !m0Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((m0Var2 = this.I) != null && !m0Var2.m())))) {
                if (this.f28462s.getTag() != null) {
                    this.f28462s.setTag(null);
                    AnimatorSet animatorSet = this.f28467w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.f28446e0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q0 f27348b;

                            {
                                this.f27348b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q0 q0Var = this.f27348b;
                                        q0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = q0Var.f28469x;
                                        if (view != null) {
                                            view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        q0 q0Var2 = this.f27348b;
                                        q0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = q0Var2.f28469x;
                                        if (view2 != null) {
                                            view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f28462s, property4, 0.0f), ObjectAnimator.ofFloat(this.f28462s, property3, 0.0f), ObjectAnimator.ofFloat(this.f28462s, property2, 0.0f), ObjectAnimator.ofFloat(this.f28462s, property, 45.0f), ofFloat);
                        duration.addListener(new f0(this, 0));
                        duration.start();
                        this.f28467w = duration;
                        return;
                    }
                    this.f28462s.setAlpha(0.0f);
                    this.f28462s.setRotation(45.0f);
                    this.f28462s.setScaleX(0.0f);
                    this.f28462s.setScaleY(0.0f);
                    this.f28462s.setVisibility(4);
                    this.f28446e0 = true;
                }
            } else if (this.f28462s.getTag() == null) {
                this.f28462s.setTag(1);
                AnimatorSet animatorSet2 = this.f28467w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f28462s.setVisibility(0);
                if (this.f28446e0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q0 f27348b;

                        {
                            this.f27348b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q0 q0Var = this.f27348b;
                                    q0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = q0Var.f28469x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    q0 q0Var2 = this.f27348b;
                                    q0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = q0Var2.f28469x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f28462s, property4, 1.0f), ObjectAnimator.ofFloat(this.f28462s, property3, 1.0f), ObjectAnimator.ofFloat(this.f28462s, property2, 1.0f), ObjectAnimator.ofFloat(this.f28462s, property, 0.0f), ofFloat2);
                    duration2.addListener(new f0(this, 1));
                    duration2.start();
                    this.f28467w = duration2;
                    return;
                }
                this.f28462s.setAlpha(1.0f);
                this.f28462s.setRotation(0.0f);
                this.f28462s.setScaleX(1.0f);
                this.f28462s.setScaleY(1.0f);
                View view = this.f28469x;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.f28446e0 = true;
            }
        }
    }

    public final void k() {
        boolean z10;
        int i3;
        if (this.G == null && this.H) {
            k0 k0Var = new k0(0, getContext(), this);
            this.G = k0Var;
            if (this.f28457o0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k0Var.setClipChildren(z10);
            this.f28438a = null;
            k0 k0Var2 = this.G;
            LinearLayout.LayoutParams m10 = mf.m(1.0f, 0, -1, this.f28457o0 + 6, 0, 0);
            x xVar = this.f28442c;
            xVar.addView(k0Var2, 0, m10);
            this.G.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = k6.C8;
            e6 e6Var = this.f28456n0;
            r6.V(textView2, i10, e6Var);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            TextView textView3 = this.h;
            if (bd.f21784a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView3.setGravity(i3);
            bh.g gVar = new bh.g(3, getContext(), this);
            this.f28445e = gVar;
            gVar.setScrollContainer(false);
            this.f28445e.setCursorWidth(1.5f);
            r6.w(this.f28445e, i10, e6Var);
            this.f28445e.setTextSize(1, 18.0f);
            r6.E(this.f28445e, k6.D8, e6Var);
            r6.V(this.f28445e, i10, e6Var);
            this.f28445e.setSingleLine(true);
            this.f28445e.setBackgroundResource(0);
            this.f28445e.setPadding(0, 0, 0, 0);
            this.f28445e.setInputType(this.f28445e.getInputType() | 524288);
            this.f28445e.setOnEditorActionListener(new ci.o(this, 3));
            this.f28445e.addTextChangedListener(new bh.h(this, 12));
            this.f28445e.setImeOptions(234881027);
            this.f28445e.setTextIsSelectable(false);
            r6.D(this.f28445e, k6.ig, e6Var);
            r6.z(this.f28445e, k6.f27998jg, e6Var);
            CharSequence charSequence = this.f28455n;
            if (charSequence != null) {
                this.f28445e.setHint(charSequence);
                setContentDescription(this.f28455n);
            }
            CharSequence charSequence2 = this.f28460r;
            if (charSequence2 != null) {
                this.f28445e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f28447f = linearLayout;
            linearLayout.setOrientation(0);
            this.f28447f.setVisibility(0);
            if (!bd.f21784a0) {
                this.G.addView(this.h, mf.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.G.addView(this.f28445e, mf.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f28447f, mf.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.G.addView(this.f28447f, mf.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f28445e, mf.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.h, mf.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f28447f.setClipChildren(false);
            e0 e0Var = new e0(0, getContext(), this);
            this.f28462s = e0Var;
            gi.b2 b2Var = new gi.b2(1, this);
            this.f28439a0 = b2Var;
            e0Var.setImageDrawable(b2Var);
            this.f28462s.setBackground(k6.h0(xVar.f28786b.f27735r0, 1, -1));
            this.f28462s.setScaleType(ImageView.ScaleType.CENTER);
            this.f28462s.setAlpha(0.0f);
            this.f28462s.setRotation(45.0f);
            this.f28462s.setScaleX(0.0f);
            this.f28462s.setScaleY(0.0f);
            this.f28462s.setOnClickListener(new y(this, 0));
            this.f28462s.setContentDescription(bd.M0(2131752099, null));
            this.G.addView(this.f28462s, mf.e(48, -1, 21));
        }
    }

    public final void l() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < this.f28440b.getItemsCount()) {
                if (this.f28440b.M.getChildAt(i10).getVisibility() == 0) {
                    break;
                }
                i10++;
            } else {
                i3 = 8;
                break;
            }
        }
        if (i3 != getVisibility()) {
            setVisibility(i3);
        }
    }

    public final void m() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f28450h0;
            if (i3 < arrayList.size()) {
                if (((kg.l0) arrayList.get(i3)).h) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            } else {
                D();
                return;
            }
        }
    }

    public void n() {
        this.f28460r = null;
        bh.g gVar = this.f28445e;
        if (gVar == null) {
            return;
        }
        gVar.setText("");
    }

    public final void o() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        f1 f1Var = this.d;
        if (f1Var != null && f1Var.isShowing()) {
            this.d.dismiss();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f28471y != null) {
            accessibilityNodeInfo.setClassName("android.widget.ImageButton");
            return;
        }
        TextView textView = this.F;
        if (textView != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
            if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
                accessibilityNodeInfo.setText(textView.getText());
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        f1 f1Var = this.d;
        if (f1Var != null && f1Var.isShowing()) {
            W(false, true);
        }
        m0 m0Var = this.I;
        if (m0Var != null) {
            m0Var.g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        ci.e1 e1Var;
        ci.e1 e1Var2;
        long j10;
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null && shownSubMenuOverlay.f27646y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getSubMenuOverlayHost() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        f1 f1Var = this.d;
        if (f1Var != null && f1Var.isShowing()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f28461r0 = false;
            if ((this.f28444d0 || z11) && s() && !z12 && !z10) {
                ci.e1 e1Var3 = this.M;
                if (e1Var3 != null) {
                    org.telegram.messenger.g0.r(e1Var3);
                    this.M = null;
                }
                ci.e1 e1Var4 = new ci.e1(18, this, z11);
                this.M = e1Var4;
                if (z11) {
                    j10 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j10 = 200;
                }
                org.telegram.messenger.g0.i3(e1Var4, j10);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.M != null) {
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                float f10 = -scaledTouchSlop;
                if ((motionEvent.getX() < f10 || motionEvent.getY() < f10 || motionEvent.getX() >= getWidth() + scaledTouchSlop || motionEvent.getY() >= getHeight() + scaledTouchSlop) && (e1Var2 = this.M) != null) {
                    org.telegram.messenger.g0.r(e1Var2);
                    this.M = null;
                }
            }
            if (this.f28449g0 && !z11 && s() && !z12) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    U(null, null);
                    this.f28461r0 = true;
                    return true;
                }
            } else if ((this.f28449g0 || this.f28461r0) && (z12 || z10)) {
                getLocationOnScreen(this.K);
                float x10 = motionEvent.getX() + this.K[0];
                float y9 = motionEvent.getY() + this.K[1];
                this.L = null;
                for (int i3 = 0; i3 < this.f28440b.getItemsCount(); i3++) {
                    View childAt = this.f28440b.M.getChildAt(i3);
                    Object tag = childAt.getTag();
                    if (tag instanceof Integer) {
                        if (((Integer) tag).intValue() >= 100) {
                        }
                        ((View) childAt.getParent()).getLocationOnScreen(this.K);
                        int[] iArr = this.K;
                        float f11 = x10 - iArr[0];
                        float f12 = y9 - iArr[1];
                        childAt.getHitRect(this.J);
                        if (childAt.getVisibility() != 0 && this.J.contains((int) f11, (int) f12)) {
                            childAt.setPressed(true);
                            childAt.setSelected(true);
                            childAt.drawableHotspotChanged(f11 - childAt.getLeft(), f12 - childAt.getTop());
                            this.L = childAt;
                        } else {
                            childAt.setPressed(false);
                            childAt.setSelected(false);
                        }
                    } else {
                        if (!childAt.hasOnClickListeners()) {
                        }
                        ((View) childAt.getParent()).getLocationOnScreen(this.K);
                        int[] iArr2 = this.K;
                        float f112 = x10 - iArr2[0];
                        float f122 = y9 - iArr2[1];
                        childAt.getHitRect(this.J);
                        if (childAt.getVisibility() != 0) {
                        }
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    }
                }
            }
        } else if (motionEvent.getActionMasked() == 1 && (z12 || z10)) {
            ci.e1 e1Var5 = this.M;
            if (e1Var5 != null) {
                org.telegram.messenger.g0.r(e1Var5);
                this.M = null;
            }
            View view = this.L;
            if (view != null) {
                view.setSelected(false);
                this.L.setPressed(false);
                View view2 = this.L;
                Object tag2 = view2.getTag();
                this.L = null;
                if (!(tag2 instanceof Integer)) {
                    view2.performClick();
                } else {
                    x xVar = this.f28442c;
                    if (xVar != null) {
                        xVar.o(((Integer) tag2).intValue());
                    } else {
                        l0 l0Var = this.Q;
                        if (l0Var != null) {
                            l0Var.i(((Integer) tag2).intValue());
                        }
                    }
                    if (z10) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        f1 f1Var2 = this.d;
                        if (f1Var2 != null) {
                            f1Var2.d(this.S);
                        }
                    }
                }
            } else if (this.f28449g0 && !z10) {
                this.d.d(true);
            }
            if (this.f28461r0) {
                this.f28461r0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        } else {
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (e1Var = this.M) != null) {
                org.telegram.messenger.g0.r(e1Var);
                this.M = null;
            }
            View view3 = this.L;
            if (view3 != null) {
                view3.setSelected(false);
                this.L.setPressed(false);
                this.L = null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (this.f28440b != null) {
            return;
        }
        this.J = new Rect();
        this.K = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232565, 1, getContext(), this.f28456n0);
        this.f28440b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        eh.c cVar = this.f28465u0;
        if (cVar != null) {
            gh.g c2 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c2.p(this.f28466v0);
            c2.r(org.telegram.messenger.g0.L(12.0f));
            c2.q(org.telegram.messenger.g0.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c2);
        }
        this.f28440b.setOnTouchListener(new gi.k4(1, this));
        this.f28440b.setDispatchKeyEventListener(new l5.b(this, 27));
    }

    public final void q() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        f1 f1Var = this.d;
        if (f1Var != null) {
            f1Var.d(this.S);
        }
    }

    public final boolean r() {
        ArrayList arrayList = this.f28450h0;
        if (!arrayList.isEmpty()) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((kg.l0) arrayList.get(i3)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        if (this.f28440b == null) {
            ArrayList arrayList = this.f28472y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setAdditionalXOffset(int i3) {
        this.f28443c0 = i3;
    }

    public void setAdditionalYOffset(int i3) {
        this.f28441b0 = i3;
    }

    public void setDelegate(l0 l0Var) {
        this.Q = l0Var;
    }

    public void setDimMenu(float f10) {
        this.f28453k0 = f10;
    }

    public void setFitSubItems(boolean z10) {
        this.f28440b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f28459q0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f28448f0 = z10;
    }

    public void setIcon(Drawable drawable) {
        fh0 fh0Var = this.f28471y;
        if (fh0Var == null) {
            return;
        }
        if (drawable instanceof ch0) {
            fh0Var.setAnimation((ch0) drawable);
        } else {
            fh0Var.setImageDrawable(drawable);
        }
        this.E = 0;
    }

    public void setIconColor(int i3) {
        if (this.f28463s0 == null || this.f28464t0 != i3) {
            this.f28463s0 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
            this.f28464t0 = i3;
        }
        fh0 fh0Var = this.f28471y;
        if (fh0Var != null) {
            ColorFilter colorFilter = fh0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.f28463s0;
            if (colorFilter != porterDuffColorFilter) {
                fh0Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setTextColor(i3);
        }
        e0 e0Var = this.f28462s;
        if (e0Var != null) {
            ColorFilter colorFilter2 = e0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.f28463s0;
            if (colorFilter2 != porterDuffColorFilter2) {
                this.f28462s.setColorFilter(porterDuffColorFilter2);
            }
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.V = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.f28444d0 = z10;
    }

    public void setMenuXOffset(int i3) {
        this.P = i3;
    }

    public void setMenuYOffset(int i3) {
        this.O = i3;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f28458p0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final u10 u10Var) {
        f1 f1Var = this.d;
        if (f1Var != null) {
            f1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    u10 u10Var2 = u10Var;
                    if (u10Var2 != null) {
                        u10Var2.a(Boolean.valueOf(q0.this.U));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        f1 f1Var = this.d;
        if (f1Var != null) {
            f1Var.f27493b = z10;
        }
        this.W = z10;
    }

    public void setPopupItemsSelectorColor(int i3) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            s51 s51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = s51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = s51Var.getChildAt(i10);
                if (childAt instanceof y0) {
                    ((y0) childAt).setSelectorColor(i3);
                }
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.f28469x = view;
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        if (this.h == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.h.setVisibility(8);
            return;
        }
        this.h.setVisibility(0);
        this.h.setText(charSequence);
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.f28455n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f28445e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i3) {
        boolean z10;
        this.f28457o0 = i3;
        k0 k0Var = this.G;
        if (k0Var != null) {
            ((ViewGroup.MarginLayoutParams) k0Var.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i3);
            k0 k0Var2 = this.G;
            if (this.f28457o0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            k0Var2.setClipChildren(z10);
            k0 k0Var3 = this.G;
            k0Var3.setLayoutParams(k0Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        gi.b2 b2Var = this.f28439a0;
        if (b2Var == null) {
            return;
        }
        if (z10) {
            b2Var.f36918e = true;
            b2Var.f36916b = System.currentTimeMillis();
            b2Var.invalidateSelf();
            return;
        }
        b2Var.f36918e = false;
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f28449g0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(n0 n0Var) {
        this.R = n0Var;
    }

    public void setSubMenuOpenSide(int i3) {
        this.N = i3;
    }

    public void setSubMenuOverlayProvider(m10 m10Var) {
        this.f28468w0 = m10Var;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.F;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.f28454l0 = f10;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.f28454l0);
    }

    public void setupPopupRadialSelectors(int i3) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i3);
        }
    }

    public final void t(int i3) {
        o0 o0Var;
        View findViewWithTag;
        HashMap hashMap = this.f28473z0;
        if (hashMap == null) {
            o0Var = null;
        } else {
            o0Var = (o0) hashMap.get(Integer.valueOf(i3));
        }
        if (o0Var != null) {
            o0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i3))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public boolean u() {
        return this.H;
    }

    public boolean v() {
        k0 k0Var = this.G;
        if (k0Var != null && k0Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean w() {
        k0 k0Var = this.G;
        if (k0Var != null && k0Var.getTag() != null) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.f27646y;
        }
        f1 f1Var = this.d;
        if (f1Var != null && f1Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void y() {
        if (this.f28472y0 == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f28472y0.size(); i3++) {
            o0 o0Var = (o0) this.f28472y0.get(i3);
            o0Var.getClass();
            p();
            View view = o0Var.f28371j;
            if (view != null) {
                this.f28440b.addView(view);
            } else {
                int i10 = o0Var.f28364a;
                if (i10 == 0) {
                    y0 y0Var = new y0(0, getContext(), this.f28456n0, false, false);
                    y0Var.j(o0Var.f28367e, o0Var.f28366c, o0Var.d);
                    y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    y0Var.setTag(Integer.valueOf(o0Var.f28365b));
                    this.f28440b.addView(y0Var);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
                    if (bd.f21784a0) {
                        layoutParams.gravity = 5;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = org.telegram.messenger.g0.L(48.0f);
                    y0Var.setLayoutParams(layoutParams);
                    y0Var.setOnClickListener(new org.telegram.messenger.video.g(2, o0Var, this));
                    Integer num = o0Var.f28375n;
                    if (num != null && o0Var.f28376o != null) {
                        y0Var.d(num.intValue(), o0Var.f28376o.intValue());
                    }
                    o0Var.f28371j = y0Var;
                } else if (i10 == 1) {
                    c1 c1Var = new c1(k6.H8, getContext(), this.f28456n0);
                    c1Var.setTag(2131296437, 1);
                    this.f28440b.a(c1Var, mf.o(-1, 8));
                    o0Var.f28371j = c1Var;
                } else if (i10 == 2) {
                    y0 y0Var2 = new y0(0, getContext(), this.f28456n0, false, false);
                    y0Var2.j(o0Var.f28367e, o0Var.f28366c, o0Var.d);
                    y0Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    y0Var2.setRightIcon(2131232059);
                    y0Var2.getRightIcon().setVisibility(o0Var.f28374m);
                    this.f28440b.addView(y0Var2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) y0Var2.getLayoutParams();
                    if (bd.f21784a0) {
                        layoutParams2.gravity = 5;
                    }
                    layoutParams2.width = -1;
                    layoutParams2.height = org.telegram.messenger.g0.L(48.0f);
                    y0Var2.setLayoutParams(layoutParams2);
                    ah ahVar = o0Var.h;
                    if (ahVar != null) {
                        o0Var.f28369g = (View) ahVar.run();
                        o0Var.h = null;
                    }
                    y0Var2.Q = new c0(this, this.f28440b.b(o0Var.f28369g), 1);
                    y0Var2.setOnClickListener(new d0(y0Var2, 1));
                    this.f28440b.f27334c = true;
                    Integer num2 = o0Var.f28375n;
                    if (num2 != null && o0Var.f28376o != null) {
                        y0Var2.d(num2.intValue(), o0Var.f28376o.intValue());
                    }
                    o0Var.f28371j = y0Var2;
                } else if (i10 == 3) {
                    s70 s70Var = new s70(getContext(), null);
                    s70Var.setTag(2131296437, 1);
                    s70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                    s70Var.setTextSize(1, o0Var.f28370i);
                    r6.V(s70Var, k6.E8, null);
                    s70Var.setMovementMethod(LinkMovementMethod.getInstance());
                    r6.H(s70Var, k6.J6, null);
                    s70Var.setText(o0Var.f28367e);
                    s70Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
                    this.f28440b.a(s70Var, mf.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    o0Var.f28371j = s70Var;
                }
            }
            View view2 = o0Var.f28371j;
            if (view2 != null) {
                view2.setVisibility(o0Var.f28373l);
                yg ygVar = o0Var.f28372k;
                if (ygVar != null) {
                    o0Var.f28371j.setOnClickListener(ygVar);
                }
            }
        }
        this.f28472y0.clear();
    }

    public final o0 z(int i3, int i10, String str) {
        o0 o0Var = new o0(0);
        o0Var.f28365b = i3;
        o0Var.f28366c = i10;
        o0Var.d = null;
        o0Var.f28367e = str;
        o0Var.f28368f = true;
        G(o0Var);
        return o0Var;
    }

    public q0(Context context, x xVar, int i3) {
        this(context, xVar, 0, i3, false, null);
    }

    public q0(Context context, x xVar, int i3, int i10, boolean z10, e6 e6Var) {
        super(context);
        new ArrayList();
        this.S = true;
        this.W = true;
        this.f28446e0 = true;
        this.f28449g0 = true;
        this.f28450h0 = new ArrayList();
        this.f28451i0 = -1;
        this.f28452j0 = new g2.g((int[]) null);
        this.f28456n0 = e6Var;
        if (i3 != 0) {
            setBackgroundDrawable(k6.h0(i3, z10 ? 5 : 1, -1));
        }
        this.f28442c = xVar;
        if (z10) {
            TextView textView = new TextView(context);
            this.F = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i10 != 0) {
                textView.setTextColor(i10);
            }
            addView(textView, mf.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f28471y = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, mf.c(-1.0f, -1));
        if (i10 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i3) {
        fh0 fh0Var = this.f28471y;
        if (fh0Var == null) {
            return;
        }
        this.E = i3;
        fh0Var.setImageResource(i3);
    }
}
