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
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.c61;
import org.telegram.ui.ch;
import org.telegram.ui.eh;
public class r0 extends FrameLayout {
    public int D;
    public final TextView E;
    public l0 F;
    public boolean G;
    public n0 H;
    public Rect I;
    public int[] J;
    public View K;
    public bi.k1 L;
    public int M;
    public int N;
    public int O;
    public m0 P;
    public o0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public fi.c2 W;
    public FrameLayout f28419a;
    public int f28420a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f28421b;
    public int f28422b0;
    public final y f28423c;
    public boolean f28424c0;
    public g1 d;
    public boolean f28425d0;
    public ah.i f28426e;
    public boolean f28427e0;
    public LinearLayout f28428f;
    public boolean f28429f0;
    public final ArrayList f28430g0;
    public TextView h;
    public int f28431h0;
    public final h2.f f28432i0;
    public float f28433j0;
    public float f28434k0;
    public View f28435l0;
    public final f6 m0;
    public CharSequence f28436n;
    public int f28437n0;
    public View.OnClickListener f28438o0;
    public boolean f28439p0;
    public boolean f28440q0;
    public CharSequence f28441r;
    public PorterDuffColorFilter f28442r0;
    public f0 f28443s;
    public int f28444s0;
    public dh.c f28445t0;
    public gh.e f28446u0;
    public u10 f28447v0;
    public AnimatorSet f28448w;
    public AnimatorSet f28449w0;
    public View f28450x;
    public ArrayList f28451x0;
    public final ch0 f28452y;
    public HashMap f28453y0;

    public r0(Context context, int i7, int i10) {
        this(context, null, i7, i10, true, null);
    }

    public static z0 c(boolean z9, boolean z10, ViewGroup viewGroup, int i7, CharSequence charSequence, boolean z11, f6 f6Var) {
        z0 z0Var = new z0(z11 ? 1 : 0, viewGroup.getContext(), f6Var, z9, z10);
        z0Var.j(charSequence, i7, null);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        viewGroup.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (hd.f22878a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        return z0Var;
    }

    private i5 getShownSubMenuOverlay() {
        i5 i5Var;
        s4 subMenuOverlayHost = getSubMenuOverlayHost();
        if (subMenuOverlayHost != null) {
            i5Var = subMenuOverlayHost.getOpenMenuOverlay();
        } else {
            i5Var = null;
        }
        if (i5Var == null || i5Var.f27594e != this || (!i5Var.f27601y && !i5Var.M)) {
            return null;
        }
        return i5Var;
    }

    public final void A(zg0 zg0Var, String str) {
        p0 p0Var = new p0(0);
        p0Var.f28351b = 29;
        p0Var.f28352c = 0;
        p0Var.d = zg0Var;
        p0Var.f28353e = str;
        p0Var.f28354f = true;
        G(p0Var);
    }

    public final p0 B(eh ehVar) {
        p0 p0Var = new p0(2);
        p0Var.f28352c = 2131232256;
        p0Var.d = null;
        p0Var.f28353e = null;
        p0Var.f28355g = null;
        p0Var.h = ehVar;
        G(p0Var);
        return p0Var;
    }

    public final p0 C() {
        p0 p0Var = new p0(3);
        p0Var.f28353e = "";
        p0Var.f28356i = 13;
        G(p0Var);
        return p0Var;
    }

    public final void D() {
        Integer num;
        boolean z9;
        ArrayList arrayList = this.f28430g0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        l0 l0Var = this.F;
        if (l0Var != null && l0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new i0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) xq.f40346g);
            transitionSet.addListener((Transition.TransitionListener) new j0(0, this));
            TransitionManager.beginDelayedTransition(this.f28428f, transitionSet);
        }
        if (this.f28428f != null) {
            int i7 = 0;
            while (i7 < this.f28428f.getChildCount()) {
                if (!arrayList2.remove(((q0) this.f28428f.getChildAt(i7)).getFilter())) {
                    this.f28428f.removeViewAt(i7);
                    i7--;
                }
                i7++;
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i10);
            o0Var.getClass();
            q0 q0Var = new q0(getContext(), this.m0);
            q0Var.setData(o0Var);
            q0Var.setOnClickListener(new bi.r(25, this, q0Var));
            this.f28428f.addView(q0Var, ha.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f28428f != null) {
            for (int i11 = 0; i11 < this.f28428f.getChildCount(); i11++) {
                q0 q0Var2 = (q0) this.f28428f.getChildAt(i11);
                if (i11 == this.f28431h0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q0Var2.setExpanded(z9);
            }
        }
        LinearLayout linearLayout = this.f28428f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x10 = this.f28426e.getX();
        if (this.F.getTag() != null) {
            this.f28426e.getViewTreeObserver().addOnPreDrawListener(new k0(this, x10));
        }
        j();
    }

    public void E() {
        n0 n0Var = this.H;
        if (n0Var != null) {
            n0Var.k(this.f28426e);
        }
    }

    public void F(boolean z9) {
        y yVar;
        k();
        l0 l0Var = this.F;
        if (l0Var != null && l0Var.getVisibility() != 0 && (yVar = this.f28423c) != null) {
            yVar.f28756b.y(T(z9));
        }
    }

    public final p0 G(p0 p0Var) {
        if (this.f28451x0 == null) {
            this.f28451x0 = new ArrayList();
        }
        this.f28451x0.add(p0Var);
        if (this.f28453y0 == null) {
            this.f28453y0 = new HashMap();
        }
        this.f28453y0.put(Integer.valueOf(p0Var.f28351b), p0Var);
        return p0Var;
    }

    public final void H(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28421b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i7) {
            this.f28421b.setBackgroundColor(i7);
            g1 g1Var = this.d;
            if (g1Var != null && g1Var.isShowing()) {
                this.f28421b.invalidate();
            }
        }
    }

    public final void I(jg.o0 o0Var) {
        if (!o0Var.h) {
            return;
        }
        ArrayList arrayList = this.f28430g0;
        arrayList.remove(o0Var);
        int i7 = this.f28431h0;
        if (i7 < 0 || i7 > arrayList.size() - 1) {
            this.f28431h0 = arrayList.size() - 1;
        }
        D();
        this.f28426e.m();
    }

    public r0 J(n0 n0Var) {
        this.H = n0Var;
        return this;
    }

    public final void K() {
        this.R = false;
    }

    public final void L(dh.c cVar, gh.e eVar) {
        this.f28445t0 = cVar;
        this.f28446u0 = eVar;
        View view = this.f28421b;
        if (view != null && cVar != null) {
            fh.g c10 = cVar.c(view, null, true);
            c10.p(eVar);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            c10.q(org.telegram.messenger.g0.L(8.0f));
            view.setBackground(c10);
        }
    }

    public r0 M() {
        return N();
    }

    public r0 N() {
        if (this.f28423c == null) {
            return this;
        }
        this.G = true;
        return this;
    }

    public final void O(int i7, boolean z9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28421b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
            int childCount = c61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = c61Var.getChildAt(i10);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i7);
                } else if (childAt instanceof z0) {
                    if (z9) {
                        ((z0) childAt).setIconColor(i7);
                    } else {
                        ((z0) childAt).setTextColor(i7);
                    }
                }
            }
        }
    }

    public void P(CharSequence charSequence, boolean z9) {
        this.f28441r = charSequence;
        if (this.h != null) {
            this.f28425d0 = z9;
            this.f28426e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f28426e.setSelection(charSequence.length());
            }
        }
    }

    public final void Q(int i7, boolean z9) {
        if (z9) {
            S(i7);
        } else {
            t(i7);
        }
    }

    public final void R(int i7) {
        S(i7);
    }

    public final void S(int i7) {
        p0 p0Var;
        View findViewWithTag;
        HashMap hashMap = this.f28453y0;
        if (hashMap == null) {
            p0Var = null;
        } else {
            p0Var = (p0) hashMap.get(Integer.valueOf(i7));
        }
        if (p0Var != null) {
            p0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28421b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            org.telegram.messenger.camera.q.l(findViewWithTag.animate().alpha(1.0f), xq.f40345f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public boolean T(boolean z9) {
        y yVar;
        ch0 iconView;
        Animator e10;
        k();
        n0 n0Var = this.H;
        if (this.F == null || (n0Var != null && !n0Var.c())) {
            return false;
        }
        n0 n0Var2 = this.H;
        if (n0Var2 != null && (e10 = n0Var2.e()) != null) {
            e10.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            yVar = this.f28423c;
            if (i7 >= yVar.getChildCount()) {
                break;
            }
            View childAt = yVar.getChildAt(i7);
            if ((childAt instanceof r0) && (iconView = ((r0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i7++;
        }
        Object tag = this.F.getTag();
        Property property = View.ALPHA;
        if (tag != null) {
            this.F.setTag(null);
            AnimatorSet animatorSet = this.f28449w0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f28449w0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28449w0 = animatorSet2;
            l0 l0Var = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(l0Var, property, l0Var.getAlpha(), 0.0f));
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setAlpha(0.0f);
                this.f28449w0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i10), property, ((View) arrayList.get(i10)).getAlpha(), 1.0f));
            }
            this.f28449w0.setDuration(150L);
            this.f28449w0.addListener(new h0(this, arrayList, 0));
            this.f28449w0.start();
            this.f28426e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f28430g0;
            if (!arrayList2.isEmpty() && this.H != null) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((jg.o0) arrayList2.get(i11)).h) {
                        this.H.j((jg.o0) arrayList2.get(i11));
                    }
                }
            }
            n0 n0Var3 = this.H;
            if (n0Var3 != null) {
                n0Var3.h();
            }
            if (z9) {
                org.telegram.messenger.g0.v1(this.f28426e);
            }
            yVar.requestLayout();
            requestLayout();
            return false;
        }
        this.F.setVisibility(0);
        this.F.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f28449w0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f28449w0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f28449w0 = animatorSet4;
        l0 l0Var2 = this.F;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(l0Var2, property, l0Var2.getAlpha(), 1.0f));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f28449w0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i12), property, ((View) arrayList.get(i12)).getAlpha(), 0.0f));
        }
        this.f28449w0.setDuration(150L);
        this.f28449w0.addListener(new h0(this, arrayList, 1));
        this.f28449w0.start();
        setVisibility(8);
        m();
        this.f28426e.setText("");
        this.f28426e.requestFocus();
        if (z9) {
            org.telegram.messenger.g0.K3(this.f28426e);
        }
        this.F.setTag(1);
        n0 n0Var4 = this.H;
        if (n0Var4 != null) {
            n0Var4.i();
        }
        return true;
    }

    public final void U(View view, r0 r0Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z9;
        View childAt;
        long j3;
        k kVar;
        final i5 i5Var;
        g1 g1Var;
        boolean z10;
        View view2 = null;
        if (view == null) {
            s4 subMenuOverlayHost = getSubMenuOverlayHost();
            if (subMenuOverlayHost != null) {
                i5Var = getSubMenuOverlay();
            } else {
                i5Var = null;
            }
            if (i5Var != null && ((g1Var = this.d) == null || !g1Var.isShowing())) {
                y();
                if (s() && i()) {
                    if (i5Var.f27594e == this && (((z10 = i5Var.f27601y) || i5Var.M) && z10)) {
                        i5Var.a(true);
                        return;
                    }
                    this.T = false;
                    o0 o0Var = this.Q;
                    if (o0Var != null) {
                        o0Var.n();
                    }
                    ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = getPopupLayout();
                    WeakHashMap weakHashMap = i5Var.f27597r;
                    if (!i5Var.f27601y || i5Var.d != subMenuOverlayHost || i5Var.f27594e != this) {
                        s4 s4Var = i5Var.d;
                        if (s4Var != null && (s4Var != subMenuOverlayHost || i5Var.f27594e != this)) {
                            i5Var.c();
                        }
                        i5Var.d = subMenuOverlayHost;
                        i5Var.f27594e = this;
                        subMenuOverlayHost.getClass();
                        i5Var.f27598s = false;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = i5Var.f27595f;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != popupLayout) {
                            if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                org.telegram.messenger.g0.E2(actionBarPopupWindow$ActionBarPopupWindowLayout2);
                            }
                            i5Var.f27595f = popupLayout;
                        }
                        i5Var.h(popupLayout, org.telegram.messenger.g0.L(5.0f));
                        popupLayout.setTranslationX(0.0f);
                        popupLayout.setTranslationY(0.0f);
                        popupLayout.setAlpha(1.0f);
                        r6.d0(popupLayout, false);
                        k60.U(popupLayout, k6.r1(0.06f, k6.w0(k6.E8, i5Var.d.getMenuResourcesProvider())));
                        popupLayout.f();
                        ve0 swipeBack = popupLayout.getSwipeBack();
                        if (swipeBack != null) {
                            swipeBack.b(false);
                            swipeBack.setForegroundOnGlass(true);
                            if (i5Var.f27589b != swipeBack) {
                                i5Var.f27589b = swipeBack;
                                swipeBack.f38962y.add(new ue0() {
                                    @Override
                                    public final void a(float f10, float f11) {
                                        i5.this.invalidate();
                                    }
                                });
                            }
                            for (int i7 = 1; i7 < swipeBack.getChildCount(); i7++) {
                                if (swipeBack.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout3 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) swipeBack.getChildAt(i7);
                                    i5Var.h(actionBarPopupWindow$ActionBarPopupWindowLayout3, 0);
                                    r6.d0(actionBarPopupWindow$ActionBarPopupWindowLayout3, false);
                                    k60.U(actionBarPopupWindow$ActionBarPopupWindowLayout3, k6.r1(0.06f, k6.w0(k6.E8, i5Var.d.getMenuResourcesProvider())));
                                }
                            }
                        }
                        ScrollView scrollView = popupLayout.K;
                        if (scrollView != null) {
                            scrollView.scrollTo(0, 0);
                        }
                        if (popupLayout.getParent() != i5Var) {
                            org.telegram.messenger.g0.E2(popupLayout);
                            i5Var.addView(popupLayout, new FrameLayout.LayoutParams(-2, -2));
                        }
                        fh.g gVar = i5Var.h;
                        if (gVar == null || i5Var.f27596n != subMenuOverlayHost) {
                            if (gVar != null) {
                                gVar.f21071a.setEmpty();
                                i5Var.h.setBounds(0, 0, 0, 0);
                            }
                            fh.g gVar2 = (fh.g) weakHashMap.get(subMenuOverlayHost);
                            i5Var.h = gVar2;
                            if (gVar2 == null) {
                                fh.g c10 = subMenuOverlayHost.c(i5Var);
                                i5Var.h = c10;
                                if (c10 != null) {
                                    c10.p(i5Var.f27591c);
                                    weakHashMap.put(subMenuOverlayHost, i5Var.h);
                                }
                            }
                            i5Var.f27596n = subMenuOverlayHost;
                        }
                        ViewParent parent = i5Var.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).bringChildToFront(i5Var);
                        }
                        i5Var.setVisibility(0);
                        i5Var.f27601y = true;
                        i5Var.F = SystemClock.uptimeMillis();
                        i5Var.f();
                        subMenuOverlayHost.d(i5Var, this);
                        i5Var.b();
                        if (!i5Var.D) {
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
        g1 g1Var2 = this.d;
        if (g1Var2 == null || !g1Var2.isShowing()) {
            y();
        }
        if (this.f28421b != null) {
            y yVar = this.f28423c;
            if (yVar == null || !yVar.f28757c || (kVar = yVar.f28756b) == null || kVar.v()) {
                bi.k1 k1Var = this.L;
                if (k1Var != null) {
                    org.telegram.messenger.g0.r(k1Var);
                    this.L = null;
                }
                g1 g1Var3 = this.d;
                if (g1Var3 != null && g1Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.f28435l0 = r0Var;
                o0 o0Var2 = this.Q;
                if (o0Var2 != null) {
                    o0Var2.n();
                }
                if (this.f28421b.getParent() != null) {
                    ((ViewGroup) this.f28421b.getParent()).removeView(this.f28421b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout4 = this.f28421b;
                if (view != null) {
                    ?? a5Var = new fi.a5(this, getContext(), view);
                    a5Var.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout.animate().alpha(1.0f).setDuration(100L);
                    if (this.f28421b.f27290w) {
                        j3 = 165;
                    } else {
                        j3 = 0;
                    }
                    duration.setStartDelay(j3).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof z0) || (view instanceof LinearLayout)) {
                        dh.c cVar = this.f28445t0;
                        if (cVar != null) {
                            fh.g c11 = cVar.c(this.f28421b, null, true);
                            c11.p(this.f28446u0);
                            org.telegram.messenger.camera.q.p(c11, org.telegram.messenger.g0.L(12.0f), 8.0f);
                            c11.Q.f11508e = true;
                            frameLayout.setBackground(c11);
                        } else {
                            Drawable mutate = getContext().getDrawable(2131232565).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f28421b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, ha.c(-2.0f, -1));
                    a5Var.addView(frameLayout, ha.o(-1, -2));
                    a5Var.addView(this.f28421b, ha.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f28421b.setTopView(frameLayout);
                    view2 = frameLayout;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = a5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout4.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout4;
                }
                if (this.f28445t0 != null) {
                    k60.U(this.f28421b, k6.r1(0.06f, k6.w0(k6.E8, this.m0)));
                }
                g1 g1Var4 = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = g1Var4;
                if (this.V) {
                    g1Var4.setAnimationStyle(0);
                } else {
                    g1Var4.setAnimationStyle(2131755191);
                }
                boolean z11 = this.V;
                if (!z11) {
                    this.d.f27480b = z11;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.U) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view3, int i10, KeyEvent keyEvent) {
                        g1 g1Var5;
                        r0 r0Var2 = r0.this;
                        r0Var2.getClass();
                        if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (g1Var5 = r0Var2.d) != null && g1Var5.isShowing()) {
                            r0Var2.d.d(true);
                            return true;
                        }
                        return false;
                    }
                });
                this.d.setOnDismissListener(new fi.p4(1, this));
                Point point = org.telegram.messenger.g0.f22544q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.messenger.camera.q.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                if (view2 != null && view2.getLayoutParams() != null && this.f28421b.getSwipeBack() != null && (childAt = this.f28421b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    view2.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                }
                this.T = false;
                this.d.setFocusable(true);
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                W(true, z9);
                this.f28421b.f();
                if (this.f28421b.getSwipeBack() != null) {
                    this.f28421b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.f28433j0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void V() {
        if (this.f28428f != null) {
            for (int i7 = 0; i7 < this.f28428f.getChildCount(); i7++) {
                if (this.f28428f.getChildAt(i7) instanceof q0) {
                    ((q0) this.f28428f.getChildAt(i7)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28421b;
        f6 f6Var = this.m0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i10 = 0; i10 < this.f28421b.getItemsCount(); i10++) {
                if (this.f28421b.L.getChildAt(i10) instanceof z0) {
                    ((z0) this.f28421b.L.getChildAt(i10)).setSelectorColor(k6.w0(k6.I5, f6Var));
                }
            }
        }
        ah.i iVar = this.f28426e;
        if (iVar != null) {
            int i11 = k6.C8;
            r6.m(iVar, 30, i11, f6Var);
            r6.E(this.f28426e, k6.D8, f6Var);
            r6.V(this.f28426e, i11, f6Var);
            r6.D(this.f28426e, k6.f27949ig, f6Var);
            r6.z(this.f28426e, k6.f27968jg, f6Var);
        }
    }

    public final void W(boolean z9, boolean z10) {
        float f10;
        int i7;
        int i10;
        ScrollView scrollView;
        y yVar = this.f28423c;
        if (yVar != null) {
            i10 = yVar.getTop() + (-yVar.f28756b.getMeasuredHeight());
            i7 = yVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            float measuredHeight = getMeasuredHeight() * scaleY;
            if (this.M != 2) {
                f10 = getTranslationY();
            } else {
                f10 = 0.0f;
            }
            i7 = -((int) (measuredHeight - (f10 / scaleY)));
            i10 = this.f28420a0;
        }
        int i11 = i7 + i10 + this.N;
        if (z9 && (scrollView = this.f28421b.K) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.f28435l0;
        if (view == null) {
            view = this;
        }
        if (yVar != null) {
            k kVar = yVar.f28756b;
            if (this.M == 0) {
                if (z9) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i11);
                }
                if (z10) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i11, -1, -1);
                    return;
                }
                return;
            }
            if (z9) {
                if (this.f28427e0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.O, i11);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.O, i11);
                }
            }
            if (z10) {
                this.d.update(kVar, (getLeft() - org.telegram.messenger.g0.L(8.0f)) + ((int) getTranslationX()) + this.O, i11, -1, -1);
                return;
            }
            return;
        }
        int i12 = this.M;
        if (i12 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z9) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f28422b0 + this.O, i11);
                }
                if (z10) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f28422b0 + this.O, i11, -1, -1);
                }
            }
        } else if (i12 == 1) {
            if (z9) {
                this.d.showAsDropDown(this, (-org.telegram.messenger.g0.L(8.0f)) + this.f28422b0 + this.O, i11);
            }
            if (z10) {
                this.d.update(this, (-org.telegram.messenger.g0.L(8.0f)) + this.f28422b0 + this.O, i11, -1, -1);
            }
        } else {
            if (z9) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f28422b0 + this.O, i11);
            }
            if (z10) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f28422b0 + this.O, i11, -1, -1);
            }
        }
    }

    public final d1 a(int i7) {
        p();
        d1 d1Var = new d1(k6.H8, getContext(), this.m0);
        if (i7 != -1) {
            d1Var.setTag(Integer.valueOf(i7));
        }
        d1Var.setTag(2131296437, 1);
        this.f28421b.a(d1Var, ha.o(-1, 8));
        return d1Var;
    }

    public final TextView b(int i7) {
        p();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i7);
        textView.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        this.f28421b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int L = org.telegram.messenger.g0.L(3.0f);
        layoutParams.bottomMargin = L;
        layoutParams.topMargin = L;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final z0 d(int i7, int i10, Drawable drawable, CharSequence charSequence, boolean z9, boolean z10, f6 f6Var) {
        p();
        z0 z0Var = new z0(z10 ? 1 : 0, getContext(), f6Var, false, false);
        z0Var.j(charSequence, i10, drawable);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z0Var.setTag(Integer.valueOf(i7));
        this.f28421b.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (hd.f22878a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        z0Var.setOnClickListener(new di.a2(2, this, z9));
        return z0Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f28439p0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final z0 e(int i7, int i10, CharSequence charSequence) {
        return d(i7, i10, null, charSequence, true, false, this.m0);
    }

    public final void f(int i7, String str) {
        p();
        TextView textView = new TextView(getContext());
        r6.V(textView, k6.E8, this.m0);
        textView.setBackgroundDrawable(k6.N0(false));
        if (!hd.f22878a0) {
            textView.setGravity(16);
        } else {
            textView.setGravity(21);
        }
        textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(org.telegram.messenger.g0.L(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i7));
        textView.setText(str);
        this.f28421b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (hd.f22878a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new z(this, 3));
    }

    public final void g(org.telegram.ui.Cells.k kVar, int i7) {
        p();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i7));
        this.f28421b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new z(this, 1));
        kVar.setBackgroundDrawable(k6.N0(false));
    }

    public View getContentView() {
        ch0 ch0Var = this.f28452y;
        if (ch0Var != null) {
            return ch0Var;
        }
        return this.E;
    }

    public ch0 getIconView() {
        return this.f28452y;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f28438o0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f28421b == null) {
            p();
        }
        return this.f28421b;
    }

    public ImageView getSearchClearButton() {
        return this.f28443s;
    }

    public FrameLayout getSearchContainer() {
        return this.F;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.f28426e;
    }

    public i5 getSubMenuOverlay() {
        u10 u10Var = this.f28447v0;
        if (u10Var != null) {
            return (i5) u10Var.run();
        }
        return null;
    }

    public s4 getSubMenuOverlayHost() {
        y yVar;
        if (this.f28447v0 != null && (yVar = this.f28423c) != null) {
            return yVar.f28756b;
        }
        return null;
    }

    public TextView getTextView() {
        return this.E;
    }

    public int getVisibleSubItemsCount() {
        int i7 = 0;
        for (int i10 = 0; i10 < this.f28421b.getItemsCount(); i10++) {
            View childAt = this.f28421b.L.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                i7++;
            }
        }
        return i7;
    }

    public final z0 h(int i7, a01 a01Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        p();
        z0 z0Var = new z0(0, getContext(), this.m0, false, false);
        z0Var.j(str, i7, a01Var);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z0Var.setRightIcon(2131232059);
        this.f28421b.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (hd.f22878a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        z0Var.P = new d0(this, this.f28421b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        z0Var.setOnClickListener(new e0(z0Var, 0));
        this.f28421b.f27284c = true;
        return z0Var;
    }

    public boolean i() {
        k kVar;
        y yVar = this.f28423c;
        if (yVar != null && yVar.f28757c && (kVar = yVar.f28756b) != null && !kVar.v()) {
            return false;
        }
        return true;
    }

    public final void j() {
        n0 n0Var;
        TextView textView;
        n0 n0Var2;
        if (this.f28443s != null) {
            boolean r10 = r();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!r10 && TextUtils.isEmpty(this.f28426e.getText()) && (((n0Var = this.H) == null || !n0Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((n0Var2 = this.H) != null && !n0Var2.m())))) {
                if (this.f28443s.getTag() != null) {
                    this.f28443s.setTag(null);
                    AnimatorSet animatorSet = this.f28448w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.f28425d0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final r0 f27334b;

                            {
                                this.f27334b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        r0 r0Var = this.f27334b;
                                        r0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = r0Var.f28450x;
                                        if (view != null) {
                                            view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        r0 r0Var2 = this.f27334b;
                                        r0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = r0Var2.f28450x;
                                        if (view2 != null) {
                                            view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f28443s, property4, 0.0f), ObjectAnimator.ofFloat(this.f28443s, property3, 0.0f), ObjectAnimator.ofFloat(this.f28443s, property2, 0.0f), ObjectAnimator.ofFloat(this.f28443s, property, 45.0f), ofFloat);
                        duration.addListener(new g0(this, 0));
                        duration.start();
                        this.f28448w = duration;
                        return;
                    }
                    this.f28443s.setAlpha(0.0f);
                    this.f28443s.setRotation(45.0f);
                    this.f28443s.setScaleX(0.0f);
                    this.f28443s.setScaleY(0.0f);
                    this.f28443s.setVisibility(4);
                    this.f28425d0 = true;
                }
            } else if (this.f28443s.getTag() == null) {
                this.f28443s.setTag(1);
                AnimatorSet animatorSet2 = this.f28448w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f28443s.setVisibility(0);
                if (this.f28425d0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final r0 f27334b;

                        {
                            this.f27334b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    r0 r0Var = this.f27334b;
                                    r0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = r0Var.f28450x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    r0 r0Var2 = this.f27334b;
                                    r0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = r0Var2.f28450x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f28443s, property4, 1.0f), ObjectAnimator.ofFloat(this.f28443s, property3, 1.0f), ObjectAnimator.ofFloat(this.f28443s, property2, 1.0f), ObjectAnimator.ofFloat(this.f28443s, property, 0.0f), ofFloat2);
                    duration2.addListener(new g0(this, 1));
                    duration2.start();
                    this.f28448w = duration2;
                    return;
                }
                this.f28443s.setAlpha(1.0f);
                this.f28443s.setRotation(0.0f);
                this.f28443s.setScaleX(1.0f);
                this.f28443s.setScaleY(1.0f);
                View view = this.f28450x;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.f28425d0 = true;
            }
        }
    }

    public final void k() {
        boolean z9;
        int i7;
        if (this.F == null && this.G) {
            l0 l0Var = new l0(0, getContext(), this);
            this.F = l0Var;
            if (this.f28437n0 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            l0Var.setClipChildren(z9);
            this.f28419a = null;
            l0 l0Var2 = this.F;
            LinearLayout.LayoutParams m10 = ha.m(1.0f, 0, -1, this.f28437n0 + 6, 0, 0);
            y yVar = this.f28423c;
            yVar.addView(l0Var2, 0, m10);
            this.F.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = k6.C8;
            f6 f6Var = this.m0;
            r6.V(textView2, i10, f6Var);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            TextView textView3 = this.h;
            if (hd.f22878a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView3.setGravity(i7);
            ah.i iVar = new ah.i(3, getContext(), this);
            this.f28426e = iVar;
            iVar.setScrollContainer(false);
            this.f28426e.setCursorWidth(1.5f);
            r6.w(this.f28426e, i10, f6Var);
            this.f28426e.setTextSize(1, 18.0f);
            r6.E(this.f28426e, k6.D8, f6Var);
            r6.V(this.f28426e, i10, f6Var);
            this.f28426e.setSingleLine(true);
            this.f28426e.setBackgroundResource(0);
            this.f28426e.setPadding(0, 0, 0, 0);
            this.f28426e.setInputType(this.f28426e.getInputType() | 524288);
            this.f28426e.setOnEditorActionListener(new bi.p(this, 3));
            this.f28426e.addTextChangedListener(new ah.j(this, 12));
            this.f28426e.setImeOptions(234881027);
            this.f28426e.setTextIsSelectable(false);
            r6.D(this.f28426e, k6.f27949ig, f6Var);
            r6.z(this.f28426e, k6.f27968jg, f6Var);
            CharSequence charSequence = this.f28436n;
            if (charSequence != null) {
                this.f28426e.setHint(charSequence);
                setContentDescription(this.f28436n);
            }
            CharSequence charSequence2 = this.f28441r;
            if (charSequence2 != null) {
                this.f28426e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f28428f = linearLayout;
            linearLayout.setOrientation(0);
            this.f28428f.setVisibility(0);
            if (!hd.f22878a0) {
                this.F.addView(this.h, ha.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.F.addView(this.f28426e, ha.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f28428f, ha.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.F.addView(this.f28428f, ha.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f28426e, ha.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.h, ha.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f28428f.setClipChildren(false);
            f0 f0Var = new f0(0, getContext(), this);
            this.f28443s = f0Var;
            fi.c2 c2Var = new fi.c2(1, this);
            this.W = c2Var;
            f0Var.setImageDrawable(c2Var);
            this.f28443s.setBackground(k6.h0(yVar.f28756b.f27682q0, 1, -1));
            this.f28443s.setScaleType(ImageView.ScaleType.CENTER);
            this.f28443s.setAlpha(0.0f);
            this.f28443s.setRotation(45.0f);
            this.f28443s.setScaleX(0.0f);
            this.f28443s.setScaleY(0.0f);
            this.f28443s.setOnClickListener(new z(this, 0));
            this.f28443s.setContentDescription(hd.M0(2131752099, null));
            this.F.addView(this.f28443s, ha.e(48, -1, 21));
        }
    }

    public final void l() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < this.f28421b.getItemsCount()) {
                if (this.f28421b.L.getChildAt(i10).getVisibility() == 0) {
                    break;
                }
                i10++;
            } else {
                i7 = 8;
                break;
            }
        }
        if (i7 != getVisibility()) {
            setVisibility(i7);
        }
    }

    public final void m() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f28430g0;
            if (i7 < arrayList.size()) {
                if (((jg.o0) arrayList.get(i7)).h) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                D();
                return;
            }
        }
    }

    public void n() {
        this.f28441r = null;
        ah.i iVar = this.f28426e;
        if (iVar == null) {
            return;
        }
        iVar.setText("");
    }

    public final void o() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            this.d.dismiss();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f28452y != null) {
            accessibilityNodeInfo.setClassName("android.widget.ImageButton");
            return;
        }
        TextView textView = this.E;
        if (textView != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
            if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
                accessibilityNodeInfo.setText(textView.getText());
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            W(false, true);
        }
        n0 n0Var = this.H;
        if (n0Var != null) {
            n0Var.g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        bi.k1 k1Var;
        bi.k1 k1Var2;
        long j3;
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null && shownSubMenuOverlay.f27601y) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getSubMenuOverlayHost() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f28440q0 = false;
            if ((this.f28424c0 || z10) && s() && !z11 && !z9) {
                bi.k1 k1Var3 = this.L;
                if (k1Var3 != null) {
                    org.telegram.messenger.g0.r(k1Var3);
                    this.L = null;
                }
                bi.k1 k1Var4 = new bi.k1(18, this, z10);
                this.L = k1Var4;
                if (z10) {
                    j3 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j3 = 200;
                }
                org.telegram.messenger.g0.i3(k1Var4, j3);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.L != null) {
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                float f10 = -scaledTouchSlop;
                if ((motionEvent.getX() < f10 || motionEvent.getY() < f10 || motionEvent.getX() >= getWidth() + scaledTouchSlop || motionEvent.getY() >= getHeight() + scaledTouchSlop) && (k1Var2 = this.L) != null) {
                    org.telegram.messenger.g0.r(k1Var2);
                    this.L = null;
                }
            }
            if (this.f28429f0 && !z10 && s() && !z11) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    U(null, null);
                    this.f28440q0 = true;
                    return true;
                }
            } else if ((this.f28429f0 || this.f28440q0) && (z11 || z9)) {
                getLocationOnScreen(this.J);
                float x10 = motionEvent.getX() + this.J[0];
                float y10 = motionEvent.getY() + this.J[1];
                this.K = null;
                for (int i7 = 0; i7 < this.f28421b.getItemsCount(); i7++) {
                    View childAt = this.f28421b.L.getChildAt(i7);
                    Object tag = childAt.getTag();
                    if (tag instanceof Integer) {
                        if (((Integer) tag).intValue() >= 100) {
                        }
                        ((View) childAt.getParent()).getLocationOnScreen(this.J);
                        int[] iArr = this.J;
                        float f11 = x10 - iArr[0];
                        float f12 = y10 - iArr[1];
                        childAt.getHitRect(this.I);
                        if (childAt.getVisibility() != 0 && this.I.contains((int) f11, (int) f12)) {
                            childAt.setPressed(true);
                            childAt.setSelected(true);
                            childAt.drawableHotspotChanged(f11 - childAt.getLeft(), f12 - childAt.getTop());
                            this.K = childAt;
                        } else {
                            childAt.setPressed(false);
                            childAt.setSelected(false);
                        }
                    } else {
                        if (!childAt.hasOnClickListeners()) {
                        }
                        ((View) childAt.getParent()).getLocationOnScreen(this.J);
                        int[] iArr2 = this.J;
                        float f112 = x10 - iArr2[0];
                        float f122 = y10 - iArr2[1];
                        childAt.getHitRect(this.I);
                        if (childAt.getVisibility() != 0) {
                        }
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    }
                }
            }
        } else if (motionEvent.getActionMasked() == 1 && (z11 || z9)) {
            bi.k1 k1Var5 = this.L;
            if (k1Var5 != null) {
                org.telegram.messenger.g0.r(k1Var5);
                this.L = null;
            }
            View view = this.K;
            if (view != null) {
                view.setSelected(false);
                this.K.setPressed(false);
                View view2 = this.K;
                Object tag2 = view2.getTag();
                this.K = null;
                if (!(tag2 instanceof Integer)) {
                    view2.performClick();
                } else {
                    y yVar = this.f28423c;
                    if (yVar != null) {
                        yVar.o(((Integer) tag2).intValue());
                    } else {
                        m0 m0Var = this.P;
                        if (m0Var != null) {
                            m0Var.i(((Integer) tag2).intValue());
                        }
                    }
                    if (z9) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        g1 g1Var2 = this.d;
                        if (g1Var2 != null) {
                            g1Var2.d(this.R);
                        }
                    }
                }
            } else if (this.f28429f0 && !z9) {
                this.d.d(true);
            }
            if (this.f28440q0) {
                this.f28440q0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        } else {
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (k1Var = this.L) != null) {
                org.telegram.messenger.g0.r(k1Var);
                this.L = null;
            }
            View view3 = this.K;
            if (view3 != null) {
                view3.setSelected(false);
                this.K.setPressed(false);
                this.K = null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (this.f28421b != null) {
            return;
        }
        this.I = new Rect();
        this.J = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, 1, getContext(), this.m0);
        this.f28421b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        dh.c cVar = this.f28445t0;
        if (cVar != null) {
            fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.p(this.f28446u0);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            c10.q(org.telegram.messenger.g0.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.f28421b.setOnTouchListener(new fi.n4(1, this));
        this.f28421b.setDispatchKeyEventListener(new l2.y(this, 26));
    }

    public final void q() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.d(this.R);
        }
    }

    public final boolean r() {
        ArrayList arrayList = this.f28430g0;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((jg.o0) arrayList.get(i7)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        if (this.f28421b == null) {
            ArrayList arrayList = this.f28451x0;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setAdditionalXOffset(int i7) {
        this.f28422b0 = i7;
    }

    public void setAdditionalYOffset(int i7) {
        this.f28420a0 = i7;
    }

    public void setDelegate(m0 m0Var) {
        this.P = m0Var;
    }

    public void setDimMenu(float f10) {
        this.f28433j0 = f10;
    }

    public void setFitSubItems(boolean z9) {
        this.f28421b.setFitItems(z9);
    }

    public void setFixBackground(boolean z9) {
        this.f28439p0 = z9;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z9) {
        this.f28427e0 = z9;
    }

    public void setIcon(Drawable drawable) {
        ch0 ch0Var = this.f28452y;
        if (ch0Var == null) {
            return;
        }
        if (drawable instanceof zg0) {
            ch0Var.setAnimation((zg0) drawable);
        } else {
            ch0Var.setImageDrawable(drawable);
        }
        this.D = 0;
    }

    public void setIconColor(int i7) {
        if (this.f28442r0 == null || this.f28444s0 != i7) {
            this.f28442r0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            this.f28444s0 = i7;
        }
        ch0 ch0Var = this.f28452y;
        if (ch0Var != null) {
            ColorFilter colorFilter = ch0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.f28442r0;
            if (colorFilter != porterDuffColorFilter) {
                ch0Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i7);
        }
        f0 f0Var = this.f28443s;
        if (f0Var != null) {
            ColorFilter colorFilter2 = f0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.f28442r0;
            if (colorFilter2 != porterDuffColorFilter2) {
                this.f28443s.setColorFilter(porterDuffColorFilter2);
            }
        }
    }

    public void setLayoutInScreen(boolean z9) {
        this.U = z9;
    }

    public void setLongClickEnabled(boolean z9) {
        this.f28424c0 = z9;
    }

    public void setMenuXOffset(int i7) {
        this.O = i7;
    }

    public void setMenuYOffset(int i7) {
        this.N = i7;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f28438o0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final c20 c20Var) {
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    c20 c20Var2 = c20Var;
                    if (c20Var2 != null) {
                        c20Var2.a(Boolean.valueOf(r0.this.T));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z9) {
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.f27480b = z9;
        }
        this.V = z9;
    }

    public void setPopupItemsSelectorColor(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28421b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            c61 c61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
            int childCount = c61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = c61Var.getChildAt(i10);
                if (childAt instanceof z0) {
                    ((z0) childAt).setSelectorColor(i7);
                }
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.f28450x = view;
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
        this.f28436n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f28426e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i7) {
        boolean z9;
        this.f28437n0 = i7;
        l0 l0Var = this.F;
        if (l0Var != null) {
            ((ViewGroup.MarginLayoutParams) l0Var.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i7);
            l0 l0Var2 = this.F;
            if (this.f28437n0 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            l0Var2.setClipChildren(z9);
            l0 l0Var3 = this.F;
            l0Var3.setLayoutParams(l0Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z9) {
        fi.c2 c2Var = this.W;
        if (c2Var == null) {
            return;
        }
        if (z9) {
            c2Var.f36657e = true;
            c2Var.f36655b = System.currentTimeMillis();
            c2Var.invalidateSelf();
            return;
        }
        c2Var.f36657e = false;
    }

    public void setShowSubmenuByMove(boolean z9) {
        this.f28429f0 = z9;
    }

    public void setShowedFromBottom(boolean z9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28421b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z9);
    }

    public void setSubMenuDelegate(o0 o0Var) {
        this.Q = o0Var;
    }

    public void setSubMenuOpenSide(int i7) {
        this.M = i7;
    }

    public void setSubMenuOverlayProvider(u10 u10Var) {
        this.f28447v0 = u10Var;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.E;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.f28434k0 = f10;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.f28434k0);
    }

    public void setupPopupRadialSelectors(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28421b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i7);
        }
    }

    public final void t(int i7) {
        p0 p0Var;
        View findViewWithTag;
        HashMap hashMap = this.f28453y0;
        if (hashMap == null) {
            p0Var = null;
        } else {
            p0Var = (p0) hashMap.get(Integer.valueOf(i7));
        }
        if (p0Var != null) {
            p0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f28421b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public boolean u() {
        return this.G;
    }

    public boolean v() {
        l0 l0Var = this.F;
        if (l0Var != null && l0Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean w() {
        l0 l0Var = this.F;
        if (l0Var != null && l0Var.getTag() != null) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        i5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.f27601y;
        }
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void y() {
        if (this.f28451x0 == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f28451x0.size(); i7++) {
            p0 p0Var = (p0) this.f28451x0.get(i7);
            p0Var.getClass();
            p();
            View view = p0Var.f28357j;
            if (view != null) {
                this.f28421b.addView(view);
            } else {
                int i10 = p0Var.f28350a;
                if (i10 == 0) {
                    z0 z0Var = new z0(0, getContext(), this.m0, false, false);
                    z0Var.j(p0Var.f28353e, p0Var.f28352c, p0Var.d);
                    z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var.setTag(Integer.valueOf(p0Var.f28351b));
                    this.f28421b.addView(z0Var);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
                    if (hd.f22878a0) {
                        layoutParams.gravity = 5;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = org.telegram.messenger.g0.L(48.0f);
                    z0Var.setLayoutParams(layoutParams);
                    z0Var.setOnClickListener(new bi.r(26, p0Var, this));
                    Integer num = p0Var.f28361n;
                    if (num != null && p0Var.f28362o != null) {
                        z0Var.d(num.intValue(), p0Var.f28362o.intValue());
                    }
                    p0Var.f28357j = z0Var;
                } else if (i10 == 1) {
                    d1 d1Var = new d1(k6.H8, getContext(), this.m0);
                    d1Var.setTag(2131296437, 1);
                    this.f28421b.a(d1Var, ha.o(-1, 8));
                    p0Var.f28357j = d1Var;
                } else if (i10 == 2) {
                    z0 z0Var2 = new z0(0, getContext(), this.m0, false, false);
                    z0Var2.j(p0Var.f28353e, p0Var.f28352c, p0Var.d);
                    z0Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var2.setRightIcon(2131232059);
                    z0Var2.getRightIcon().setVisibility(p0Var.f28360m);
                    this.f28421b.addView(z0Var2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) z0Var2.getLayoutParams();
                    if (hd.f22878a0) {
                        layoutParams2.gravity = 5;
                    }
                    layoutParams2.width = -1;
                    layoutParams2.height = org.telegram.messenger.g0.L(48.0f);
                    z0Var2.setLayoutParams(layoutParams2);
                    eh ehVar = p0Var.h;
                    if (ehVar != null) {
                        p0Var.f28355g = (View) ehVar.run();
                        p0Var.h = null;
                    }
                    z0Var2.P = new d0(this, this.f28421b.b(p0Var.f28355g), 1);
                    z0Var2.setOnClickListener(new e0(z0Var2, 1));
                    this.f28421b.f27284c = true;
                    Integer num2 = p0Var.f28361n;
                    if (num2 != null && p0Var.f28362o != null) {
                        z0Var2.d(num2.intValue(), p0Var.f28362o.intValue());
                    }
                    p0Var.f28357j = z0Var2;
                } else if (i10 == 3) {
                    w70 w70Var = new w70(getContext(), null);
                    w70Var.setTag(2131296437, 1);
                    w70Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                    w70Var.setTextSize(1, p0Var.f28356i);
                    r6.V(w70Var, k6.E8, null);
                    w70Var.setMovementMethod(LinkMovementMethod.getInstance());
                    r6.H(w70Var, k6.J6, null);
                    w70Var.setText(p0Var.f28353e);
                    w70Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
                    this.f28421b.a(w70Var, ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    p0Var.f28357j = w70Var;
                }
            }
            View view2 = p0Var.f28357j;
            if (view2 != null) {
                view2.setVisibility(p0Var.f28359l);
                ch chVar = p0Var.f28358k;
                if (chVar != null) {
                    p0Var.f28357j.setOnClickListener(chVar);
                }
            }
        }
        this.f28451x0.clear();
    }

    public final p0 z(int i7, int i10, String str) {
        p0 p0Var = new p0(0);
        p0Var.f28351b = i7;
        p0Var.f28352c = i10;
        p0Var.d = null;
        p0Var.f28353e = str;
        p0Var.f28354f = true;
        G(p0Var);
        return p0Var;
    }

    public r0(Context context, y yVar, int i7) {
        this(context, yVar, 0, i7, false, null);
    }

    public r0(Context context, y yVar, int i7, int i10, boolean z9, f6 f6Var) {
        super(context);
        new ArrayList();
        this.R = true;
        this.V = true;
        this.f28425d0 = true;
        this.f28429f0 = true;
        this.f28430g0 = new ArrayList();
        this.f28431h0 = -1;
        this.f28432i0 = new h2.f((int[]) null);
        this.m0 = f6Var;
        if (i7 != 0) {
            setBackgroundDrawable(k6.h0(i7, z9 ? 5 : 1, -1));
        }
        this.f28423c = yVar;
        if (z9) {
            TextView textView = new TextView(context);
            this.E = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i10 != 0) {
                textView.setTextColor(i10);
            }
            addView(textView, ha.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f28452y = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, ha.c(-1.0f, -1));
        if (i10 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i7) {
        ch0 ch0Var = this.f28452y;
        if (ch0Var == null) {
            return;
        }
        this.D = i7;
        ch0Var.setImageResource(i7);
    }
}
