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
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.ch;
import org.telegram.ui.d61;
import org.telegram.ui.fh;
public class q0 extends FrameLayout {
    public int E;
    public final TextView F;
    public ai.m0 G;
    public boolean H;
    public m0 I;
    public Rect J;
    public int[] K;
    public View L;
    public ch.k M;
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
    public FrameLayout f29900a;
    public hi.b2 f29901a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f29902b;
    public int f29903b0;
    public final y f29904c;
    public int f29905c0;
    public g1 d;
    public boolean f29906d0;
    public ah.i f29907e;
    public boolean f29908e0;
    public LinearLayout f29909f;
    public boolean f29910f0;
    public boolean f29911g0;
    public TextView h;
    public final ArrayList f29912h0;
    public int f29913i0;
    public final h2.f f29914j0;
    public float f29915k0;
    public float f29916l0;
    public View m0;
    public CharSequence f29917n;
    public final h6 f29918n0;
    public int f29919o0;
    public View.OnClickListener f29920p0;
    public boolean f29921q0;
    public CharSequence f29922r;
    public boolean f29923r0;
    public f0 f29924s;
    public PorterDuffColorFilter f29925s0;
    public int f29926t0;
    public dh.c f29927u0;
    public gh.e f29928v0;
    public AnimatorSet f29929w;
    public q10 f29930w0;
    public View f29931x;
    public AnimatorSet f29932x0;
    public final rh0 f29933y;
    public ArrayList f29934y0;
    public HashMap f29935z0;

    public q0(Context context, int i7, int i10) {
        this(context, null, i7, i10, true, null);
    }

    public static y0 c(boolean z10, boolean z11, ViewGroup viewGroup, int i7, CharSequence charSequence, boolean z12, h6 h6Var) {
        y0 y0Var = new y0(z12 ? 1 : 0, viewGroup.getContext(), h6Var, z10, z11);
        y0Var.j(charSequence, i7, null);
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        viewGroup.addView(y0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
        if (hd.f24444a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        y0Var.setLayoutParams(layoutParams);
        return y0Var;
    }

    private j5 getShownSubMenuOverlay() {
        j5 j5Var;
        t4 subMenuOverlayHost = getSubMenuOverlayHost();
        if (subMenuOverlayHost != null) {
            j5Var = subMenuOverlayHost.getOpenMenuOverlay();
        } else {
            j5Var = null;
        }
        if (j5Var == null || j5Var.f29080e != this || (!j5Var.I && !j5Var.S)) {
            return null;
        }
        return j5Var;
    }

    public final o0 A(int i7, int i10, String str) {
        o0 o0Var = new o0(0);
        o0Var.f29832b = i7;
        o0Var.f29833c = i10;
        o0Var.d = null;
        o0Var.f29834e = str;
        o0Var.f29835f = true;
        H(o0Var);
        return o0Var;
    }

    public final void B(oh0 oh0Var, String str) {
        o0 o0Var = new o0(0);
        o0Var.f29832b = 29;
        o0Var.f29833c = 0;
        o0Var.d = oh0Var;
        o0Var.f29834e = str;
        o0Var.f29835f = true;
        H(o0Var);
    }

    public final o0 C(fh fhVar) {
        o0 o0Var = new o0(2);
        o0Var.f29833c = 2131232258;
        o0Var.d = null;
        o0Var.f29834e = null;
        o0Var.f29836g = null;
        o0Var.h = fhVar;
        H(o0Var);
        return o0Var;
    }

    public final o0 D() {
        o0 o0Var = new o0(3);
        o0Var.f29834e = "";
        o0Var.f29837i = 13;
        H(o0Var);
        return o0Var;
    }

    public final void E() {
        Integer num;
        boolean z10;
        ArrayList arrayList = this.f29912h0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        ai.m0 m0Var = this.G;
        if (m0Var != null && m0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new i0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) nr.f37962g);
            transitionSet.addListener((Transition.TransitionListener) new j0(0, this));
            TransitionManager.beginDelayedTransition(this.f29909f, transitionSet);
        }
        if (this.f29909f != null) {
            int i7 = 0;
            while (i7 < this.f29909f.getChildCount()) {
                if (!arrayList2.remove(((p0) this.f29909f.getChildAt(i7)).getFilter())) {
                    this.f29909f.removeViewAt(i7);
                    i7--;
                }
                i7++;
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i10);
            o0Var.getClass();
            p0 p0Var = new p0(getContext(), this.f29918n0);
            p0Var.setData(o0Var);
            p0Var.setOnClickListener(new c0(this, p0Var, 0));
            this.f29909f.addView(p0Var, ma.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f29909f != null) {
            for (int i11 = 0; i11 < this.f29909f.getChildCount(); i11++) {
                p0 p0Var2 = (p0) this.f29909f.getChildAt(i11);
                if (i11 == this.f29913i0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p0Var2.setExpanded(z10);
            }
        }
        LinearLayout linearLayout = this.f29909f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x10 = this.f29907e.getX();
        if (this.G.getTag() != null) {
            this.f29907e.getViewTreeObserver().addOnPreDrawListener(new k0(this, x10));
        }
        k();
    }

    public void F() {
        m0 m0Var = this.I;
        if (m0Var != null) {
            m0Var.k(this.f29907e);
        }
    }

    public void G(boolean z10) {
        y yVar;
        l();
        ai.m0 m0Var = this.G;
        if (m0Var != null && m0Var.getVisibility() != 0 && (yVar = this.f29904c) != null) {
            yVar.f30283b.A(U(z10));
        }
    }

    public final o0 H(o0 o0Var) {
        if (this.f29934y0 == null) {
            this.f29934y0 = new ArrayList();
        }
        this.f29934y0.add(o0Var);
        if (this.f29935z0 == null) {
            this.f29935z0 = new HashMap();
        }
        this.f29935z0.put(Integer.valueOf(o0Var.f29832b), o0Var);
        return o0Var;
    }

    public final void I(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29902b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i7) {
            this.f29902b.setBackgroundColor(i7);
            g1 g1Var = this.d;
            if (g1Var != null && g1Var.isShowing()) {
                this.f29902b.invalidate();
            }
        }
    }

    public final void J(jg.o0 o0Var) {
        if (!o0Var.h) {
            return;
        }
        ArrayList arrayList = this.f29912h0;
        arrayList.remove(o0Var);
        int i7 = this.f29913i0;
        if (i7 < 0 || i7 > arrayList.size() - 1) {
            this.f29913i0 = arrayList.size() - 1;
        }
        E();
        this.f29907e.m();
    }

    public q0 K(m0 m0Var) {
        this.I = m0Var;
        return this;
    }

    public final void L() {
        this.S = false;
    }

    public final void M(dh.c cVar, gh.e eVar) {
        this.f29927u0 = cVar;
        this.f29928v0 = eVar;
        View view = this.f29902b;
        if (view != null && cVar != null) {
            fh.g c10 = cVar.c(view, null, true);
            c10.p(eVar);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            c10.q(org.telegram.messenger.g0.L(8.0f));
            view.setBackground(c10);
        }
    }

    public q0 N() {
        return O();
    }

    public q0 O() {
        if (this.f29904c == null) {
            return this;
        }
        this.H = true;
        return this;
    }

    public final void P(int i7, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29902b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = d61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = d61Var.getChildAt(i10);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i7);
                } else if (childAt instanceof y0) {
                    if (z10) {
                        ((y0) childAt).setIconColor(i7);
                    } else {
                        ((y0) childAt).setTextColor(i7);
                    }
                }
            }
        }
    }

    public void Q(CharSequence charSequence, boolean z10) {
        this.f29922r = charSequence;
        if (this.h != null) {
            this.f29908e0 = z10;
            this.f29907e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f29907e.setSelection(charSequence.length());
            }
        }
    }

    public final void R(int i7, boolean z10) {
        if (z10) {
            T(i7);
        } else {
            u(i7);
        }
    }

    public final void S(int i7) {
        T(i7);
    }

    public final void T(int i7) {
        o0 o0Var;
        View findViewWithTag;
        HashMap hashMap = this.f29935z0;
        if (hashMap == null) {
            o0Var = null;
        } else {
            o0Var = (o0) hashMap.get(Integer.valueOf(i7));
        }
        if (o0Var != null) {
            o0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29902b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            o10.o(findViewWithTag.animate().alpha(1.0f), nr.f37961f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public boolean U(boolean z10) {
        y yVar;
        rh0 iconView;
        Animator e10;
        l();
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
        int i7 = 0;
        while (true) {
            yVar = this.f29904c;
            if (i7 >= yVar.getChildCount()) {
                break;
            }
            View childAt = yVar.getChildAt(i7);
            if ((childAt instanceof q0) && (iconView = ((q0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i7++;
        }
        Object tag = this.G.getTag();
        Property property = View.ALPHA;
        if (tag != null) {
            this.G.setTag(null);
            AnimatorSet animatorSet = this.f29932x0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f29932x0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f29932x0 = animatorSet2;
            ai.m0 m0Var3 = this.G;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(m0Var3, property, m0Var3.getAlpha(), 0.0f));
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setAlpha(0.0f);
                this.f29932x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i10), property, ((View) arrayList.get(i10)).getAlpha(), 1.0f));
            }
            this.f29932x0.setDuration(150L);
            this.f29932x0.addListener(new h0(this, arrayList, 0));
            this.f29932x0.start();
            this.f29907e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f29912h0;
            if (!arrayList2.isEmpty() && this.I != null) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((jg.o0) arrayList2.get(i11)).h) {
                        this.I.j((jg.o0) arrayList2.get(i11));
                    }
                }
            }
            m0 m0Var4 = this.I;
            if (m0Var4 != null) {
                m0Var4.h();
            }
            if (z10) {
                org.telegram.messenger.g0.v1(this.f29907e);
            }
            yVar.requestLayout();
            requestLayout();
            return false;
        }
        this.G.setVisibility(0);
        this.G.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f29932x0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f29932x0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f29932x0 = animatorSet4;
        ai.m0 m0Var5 = this.G;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(m0Var5, property, m0Var5.getAlpha(), 1.0f));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f29932x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i12), property, ((View) arrayList.get(i12)).getAlpha(), 0.0f));
        }
        this.f29932x0.setDuration(150L);
        this.f29932x0.addListener(new h0(this, arrayList, 1));
        this.f29932x0.start();
        setVisibility(8);
        n();
        this.f29907e.setText("");
        this.f29907e.requestFocus();
        if (z10) {
            org.telegram.messenger.g0.I3(this.f29907e);
        }
        this.G.setTag(1);
        m0 m0Var6 = this.I;
        if (m0Var6 != null) {
            m0Var6.i();
        }
        return true;
    }

    public final void V(View view, q0 q0Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z10;
        View childAt;
        long j3;
        k kVar;
        j5 j5Var;
        g1 g1Var;
        boolean z11;
        FrameLayout frameLayout = null;
        if (view == null) {
            t4 subMenuOverlayHost = getSubMenuOverlayHost();
            if (subMenuOverlayHost != null) {
                j5Var = getSubMenuOverlay();
            } else {
                j5Var = null;
            }
            if (j5Var != null && ((g1Var = this.d) == null || !g1Var.isShowing())) {
                z();
                if (t() && j()) {
                    if (j5Var.f29080e == this && (((z11 = j5Var.I) || j5Var.S) && z11)) {
                        j5Var.a(true);
                        return;
                    }
                    this.U = false;
                    n0 n0Var = this.R;
                    if (n0Var != null) {
                        n0Var.k();
                    }
                    j5Var.d(subMenuOverlayHost, this, getPopupLayout());
                    return;
                }
                return;
            }
        }
        g1 g1Var2 = this.d;
        if (g1Var2 == null || !g1Var2.isShowing()) {
            z();
        }
        if (this.f29902b != null) {
            y yVar = this.f29904c;
            if (yVar == null || !yVar.f30284c || (kVar = yVar.f30283b) == null || kVar.x()) {
                ch.k kVar2 = this.M;
                if (kVar2 != null) {
                    org.telegram.messenger.g0.r(kVar2);
                    this.M = null;
                }
                g1 g1Var3 = this.d;
                if (g1Var3 != null && g1Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.m0 = q0Var;
                n0 n0Var2 = this.R;
                if (n0Var2 != null) {
                    n0Var2.k();
                }
                if (this.f29902b.getParent() != null) {
                    ((ViewGroup) this.f29902b.getParent()).removeView(this.f29902b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f29902b;
                if (view != null) {
                    ?? x4Var = new hi.x4(this, getContext(), view);
                    x4Var.setOrientation(1);
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout2.animate().alpha(1.0f).setDuration(100L);
                    if (this.f29902b.f28774w) {
                        j3 = 165;
                    } else {
                        j3 = 0;
                    }
                    duration.setStartDelay(j3).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof y0) || (view instanceof LinearLayout)) {
                        dh.c cVar = this.f29927u0;
                        if (cVar != null) {
                            fh.g c10 = cVar.c(this.f29902b, null, true);
                            c10.p(this.f29928v0);
                            o10.s(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
                            c10.R.f11671e = true;
                            frameLayout2.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(2131232567).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f29902b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout2.setBackground(mutate);
                        }
                    }
                    frameLayout2.addView(view, ma.c(-2.0f, -1));
                    x4Var.addView(frameLayout2, ma.o(-1, -2));
                    x4Var.addView(this.f29902b, ma.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f29902b.setTopView(frameLayout2);
                    frameLayout = frameLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = x4Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.f29927u0 != null) {
                    a70.V(this.f29902b, m6.r1(0.06f, m6.w0(m6.E8, this.f29918n0)));
                }
                g1 g1Var4 = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = g1Var4;
                if (this.W) {
                    g1Var4.setAnimationStyle(0);
                } else {
                    g1Var4.setAnimationStyle(2131755191);
                }
                boolean z12 = this.W;
                if (!z12) {
                    this.d.f28975b = z12;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.V) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new ai.f0(4, this));
                this.d.setOnDismissListener(new hi.k4(1, this));
                Point point = org.telegram.messenger.g0.f24046q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(o10.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f29902b.getSwipeBack() != null && (childAt = this.f29902b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = org.telegram.messenger.g0.L(16.0f) + childAt.getMeasuredWidth();
                }
                this.U = false;
                this.d.setFocusable(true);
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                X(true, z10);
                this.f29902b.f();
                if (this.f29902b.getSwipeBack() != null) {
                    this.f29902b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.f29915k0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void W() {
        if (this.f29909f != null) {
            for (int i7 = 0; i7 < this.f29909f.getChildCount(); i7++) {
                if (this.f29909f.getChildAt(i7) instanceof p0) {
                    ((p0) this.f29909f.getChildAt(i7)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29902b;
        h6 h6Var = this.f29918n0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i10 = 0; i10 < this.f29902b.getItemsCount(); i10++) {
                if (this.f29902b.M.getChildAt(i10) instanceof y0) {
                    ((y0) this.f29902b.M.getChildAt(i10)).setSelectorColor(m6.w0(m6.I5, h6Var));
                }
            }
        }
        ah.i iVar = this.f29907e;
        if (iVar != null) {
            int i11 = m6.C8;
            t6.l(iVar, 30, i11, h6Var);
            t6.D(this.f29907e, m6.D8, h6Var);
            t6.U(this.f29907e, i11, h6Var);
            t6.C(this.f29907e, m6.f29537lg, h6Var);
            t6.y(this.f29907e, m6.f29554mg, h6Var);
        }
    }

    public final void X(boolean z10, boolean z11) {
        float f10;
        int i7;
        int i10;
        ScrollView scrollView;
        y yVar = this.f29904c;
        if (yVar != null) {
            i10 = yVar.getTop() + (-yVar.f30283b.getMeasuredHeight());
            i7 = yVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            float measuredHeight = getMeasuredHeight() * scaleY;
            if (this.N != 2) {
                f10 = getTranslationY();
            } else {
                f10 = 0.0f;
            }
            i7 = -((int) (measuredHeight - (f10 / scaleY)));
            i10 = this.f29903b0;
        }
        int i11 = i7 + i10 + this.O;
        if (z10 && (scrollView = this.f29902b.L) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.m0;
        if (view == null) {
            view = this;
        }
        if (yVar != null) {
            k kVar = yVar.f30283b;
            if (this.N == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (yVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.f29910f0) {
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
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f29905c0 + this.P, i11);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f29905c0 + this.P, i11, -1, -1);
                }
            }
        } else if (i12 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-org.telegram.messenger.g0.L(8.0f)) + this.f29905c0 + this.P, i11);
            }
            if (z11) {
                this.d.update(this, (-org.telegram.messenger.g0.L(8.0f)) + this.f29905c0 + this.P, i11, -1, -1);
            }
        } else {
            if (z10) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f29905c0 + this.P, i11);
            }
            if (z11) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f29905c0 + this.P, i11, -1, -1);
            }
        }
    }

    public final d1 a(int i7) {
        q();
        d1 d1Var = new d1(m6.H8, getContext(), this.f29918n0);
        if (i7 != -1) {
            d1Var.setTag(Integer.valueOf(i7));
        }
        d1Var.setTag(2131296439, 1);
        this.f29902b.a(d1Var, ma.o(-1, 8));
        return d1Var;
    }

    public final TextView b(int i7) {
        q();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i7);
        textView.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        this.f29902b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int L = org.telegram.messenger.g0.L(3.0f);
        layoutParams.bottomMargin = L;
        layoutParams.topMargin = L;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final y0 d(int i7, int i10, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, h6 h6Var) {
        q();
        y0 y0Var = new y0(z11 ? 1 : 0, getContext(), h6Var, false, false);
        y0Var.j(charSequence, i10, drawable);
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        y0Var.setTag(Integer.valueOf(i7));
        this.f29902b.addView(y0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
        if (hd.f24444a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        y0Var.setLayoutParams(layoutParams);
        y0Var.setOnClickListener(new fi.v1(2, this, z10));
        return y0Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f29921q0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final y0 e(int i7, int i10, CharSequence charSequence) {
        return d(i7, i10, null, charSequence, true, false, this.f29918n0);
    }

    public final y0 f(Drawable drawable, String str, int i7, boolean z10, int i10) {
        return d(i7, i10, drawable, str, z10, false, this.f29918n0);
    }

    public final void g(int i7, String str) {
        q();
        TextView textView = new TextView(getContext());
        t6.U(textView, m6.E8, this.f29918n0);
        textView.setBackgroundDrawable(m6.N0(false));
        if (!hd.f24444a0) {
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
        this.f29902b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (hd.f24444a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new z(this, 3));
    }

    public View getContentView() {
        rh0 rh0Var = this.f29933y;
        if (rh0Var != null) {
            return rh0Var;
        }
        return this.F;
    }

    public rh0 getIconView() {
        return this.f29933y;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f29920p0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f29902b == null) {
            q();
        }
        return this.f29902b;
    }

    public ImageView getSearchClearButton() {
        return this.f29924s;
    }

    public FrameLayout getSearchContainer() {
        return this.G;
    }

    public EditTextBoldCursor getSearchField() {
        l();
        return this.f29907e;
    }

    public j5 getSubMenuOverlay() {
        q10 q10Var = this.f29930w0;
        if (q10Var != null) {
            return (j5) q10Var.run();
        }
        return null;
    }

    public t4 getSubMenuOverlayHost() {
        y yVar;
        if (this.f29930w0 != null && (yVar = this.f29904c) != null) {
            return yVar.f30283b;
        }
        return null;
    }

    public TextView getTextView() {
        return this.F;
    }

    public int getVisibleSubItemsCount() {
        int i7 = 0;
        for (int i10 = 0; i10 < this.f29902b.getItemsCount(); i10++) {
            View childAt = this.f29902b.M.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                i7++;
            }
        }
        return i7;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i7) {
        q();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i7));
        this.f29902b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new z(this, 1));
        kVar.setBackgroundDrawable(m6.N0(false));
    }

    public final y0 i(int i7, l01 l01Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        q();
        y0 y0Var = new y0(0, getContext(), this.f29918n0, false, false);
        y0Var.j(str, i7, l01Var);
        y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        y0Var.setRightIcon(2131232061);
        this.f29902b.addView(y0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
        if (hd.f24444a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        y0Var.setLayoutParams(layoutParams);
        y0Var.Q = new d0(this, this.f29902b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        y0Var.setOnClickListener(new e0(y0Var, 0));
        this.f29902b.f28768c = true;
        return y0Var;
    }

    public boolean j() {
        k kVar;
        y yVar = this.f29904c;
        if (yVar != null && yVar.f30284c && (kVar = yVar.f30283b) != null && !kVar.x()) {
            return false;
        }
        return true;
    }

    public final void k() {
        m0 m0Var;
        TextView textView;
        m0 m0Var2;
        if (this.f29924s != null) {
            boolean s5 = s();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!s5 && TextUtils.isEmpty(this.f29907e.getText()) && (((m0Var = this.I) == null || !m0Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((m0Var2 = this.I) != null && !m0Var2.m())))) {
                if (this.f29924s.getTag() != null) {
                    this.f29924s.setTag(null);
                    AnimatorSet animatorSet = this.f29929w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.f29908e0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final q0 f28801b;

                            {
                                this.f28801b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        q0 q0Var = this.f28801b;
                                        q0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = q0Var.f29931x;
                                        if (view != null) {
                                            view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        q0 q0Var2 = this.f28801b;
                                        q0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = q0Var2.f29931x;
                                        if (view2 != null) {
                                            view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f29924s, property4, 0.0f), ObjectAnimator.ofFloat(this.f29924s, property3, 0.0f), ObjectAnimator.ofFloat(this.f29924s, property2, 0.0f), ObjectAnimator.ofFloat(this.f29924s, property, 45.0f), ofFloat);
                        duration.addListener(new g0(this, 0));
                        duration.start();
                        this.f29929w = duration;
                        return;
                    }
                    this.f29924s.setAlpha(0.0f);
                    this.f29924s.setRotation(45.0f);
                    this.f29924s.setScaleX(0.0f);
                    this.f29924s.setScaleY(0.0f);
                    this.f29924s.setVisibility(4);
                    this.f29908e0 = true;
                }
            } else if (this.f29924s.getTag() == null) {
                this.f29924s.setTag(1);
                AnimatorSet animatorSet2 = this.f29929w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f29924s.setVisibility(0);
                if (this.f29908e0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final q0 f28801b;

                        {
                            this.f28801b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    q0 q0Var = this.f28801b;
                                    q0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = q0Var.f29931x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    q0 q0Var2 = this.f28801b;
                                    q0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = q0Var2.f29931x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f29924s, property4, 1.0f), ObjectAnimator.ofFloat(this.f29924s, property3, 1.0f), ObjectAnimator.ofFloat(this.f29924s, property2, 1.0f), ObjectAnimator.ofFloat(this.f29924s, property, 0.0f), ofFloat2);
                    duration2.addListener(new g0(this, 1));
                    duration2.start();
                    this.f29929w = duration2;
                    return;
                }
                this.f29924s.setAlpha(1.0f);
                this.f29924s.setRotation(0.0f);
                this.f29924s.setScaleX(1.0f);
                this.f29924s.setScaleY(1.0f);
                View view = this.f29931x;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.f29908e0 = true;
            }
        }
    }

    public final void l() {
        boolean z10;
        int i7;
        if (this.G == null && this.H) {
            ai.m0 m0Var = new ai.m0(1, getContext(), this);
            this.G = m0Var;
            if (this.f29919o0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            m0Var.setClipChildren(z10);
            this.f29900a = null;
            ai.m0 m0Var2 = this.G;
            LinearLayout.LayoutParams m10 = ma.m(1.0f, 0, -1, this.f29919o0 + 6, 0, 0);
            y yVar = this.f29904c;
            yVar.addView(m0Var2, 0, m10);
            this.G.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = m6.C8;
            h6 h6Var = this.f29918n0;
            t6.U(textView2, i10, h6Var);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            TextView textView3 = this.h;
            if (hd.f24444a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView3.setGravity(i7);
            ah.i iVar = new ah.i(3, getContext(), this);
            this.f29907e = iVar;
            iVar.setScrollContainer(false);
            this.f29907e.setCursorWidth(1.5f);
            t6.v(this.f29907e, i10, h6Var);
            this.f29907e.setTextSize(1, 18.0f);
            t6.D(this.f29907e, m6.D8, h6Var);
            t6.U(this.f29907e, i10, h6Var);
            this.f29907e.setSingleLine(true);
            this.f29907e.setBackgroundResource(0);
            this.f29907e.setPadding(0, 0, 0, 0);
            this.f29907e.setInputType(this.f29907e.getInputType() | 524288);
            this.f29907e.setOnEditorActionListener(new di.n(this, 3));
            this.f29907e.addTextChangedListener(new ah.j(this, 15));
            this.f29907e.setImeOptions(234881027);
            this.f29907e.setTextIsSelectable(false);
            t6.C(this.f29907e, m6.f29537lg, h6Var);
            t6.y(this.f29907e, m6.f29554mg, h6Var);
            CharSequence charSequence = this.f29917n;
            if (charSequence != null) {
                this.f29907e.setHint(charSequence);
                setContentDescription(this.f29917n);
            }
            CharSequence charSequence2 = this.f29922r;
            if (charSequence2 != null) {
                this.f29907e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f29909f = linearLayout;
            linearLayout.setOrientation(0);
            this.f29909f.setVisibility(0);
            if (!hd.f24444a0) {
                this.G.addView(this.h, ma.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.G.addView(this.f29907e, ma.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f29909f, ma.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.G.addView(this.f29909f, ma.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f29907e, ma.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.h, ma.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f29909f.setClipChildren(false);
            f0 f0Var = new f0(0, getContext(), this);
            this.f29924s = f0Var;
            hi.b2 b2Var = new hi.b2(1, this);
            this.f29901a0 = b2Var;
            f0Var.setImageDrawable(b2Var);
            this.f29924s.setBackground(m6.h0(yVar.f30283b.f29157r0, 1, -1));
            this.f29924s.setScaleType(ImageView.ScaleType.CENTER);
            this.f29924s.setAlpha(0.0f);
            this.f29924s.setRotation(45.0f);
            this.f29924s.setScaleX(0.0f);
            this.f29924s.setScaleY(0.0f);
            this.f29924s.setOnClickListener(new z(this, 0));
            this.f29924s.setContentDescription(hd.N0(2131752087, null));
            this.G.addView(this.f29924s, ma.e(48, -1, 21));
        }
    }

    public final void m() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < this.f29902b.getItemsCount()) {
                if (this.f29902b.M.getChildAt(i10).getVisibility() == 0) {
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

    public final void n() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f29912h0;
            if (i7 < arrayList.size()) {
                if (((jg.o0) arrayList.get(i7)).h) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            } else {
                E();
                return;
            }
        }
    }

    public void o() {
        this.f29922r = null;
        ah.i iVar = this.f29907e;
        if (iVar == null) {
            return;
        }
        iVar.setText("");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f29933y != null) {
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            X(false, true);
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
        ch.k kVar;
        ch.k kVar2;
        long j3;
        j5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null && shownSubMenuOverlay.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getSubMenuOverlayHost() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f29923r0 = false;
            if ((this.f29906d0 || z11) && t() && !z12 && !z10) {
                ch.k kVar3 = this.M;
                if (kVar3 != null) {
                    org.telegram.messenger.g0.r(kVar3);
                    this.M = null;
                }
                ch.k kVar4 = new ch.k(18, this, z11);
                this.M = kVar4;
                if (z11) {
                    j3 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j3 = 200;
                }
                org.telegram.messenger.g0.h3(kVar4, j3);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.M != null) {
                float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                float f10 = -scaledTouchSlop;
                if ((motionEvent.getX() < f10 || motionEvent.getY() < f10 || motionEvent.getX() >= getWidth() + scaledTouchSlop || motionEvent.getY() >= getHeight() + scaledTouchSlop) && (kVar2 = this.M) != null) {
                    org.telegram.messenger.g0.r(kVar2);
                    this.M = null;
                }
            }
            if (this.f29911g0 && !z11 && t() && !z12) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    V(null, null);
                    this.f29923r0 = true;
                    return true;
                }
            } else if ((this.f29911g0 || this.f29923r0) && (z12 || z10)) {
                getLocationOnScreen(this.K);
                float x10 = motionEvent.getX() + this.K[0];
                float y10 = motionEvent.getY() + this.K[1];
                this.L = null;
                for (int i7 = 0; i7 < this.f29902b.getItemsCount(); i7++) {
                    View childAt = this.f29902b.M.getChildAt(i7);
                    Object tag = childAt.getTag();
                    if (tag instanceof Integer) {
                        if (((Integer) tag).intValue() >= 100) {
                        }
                        ((View) childAt.getParent()).getLocationOnScreen(this.K);
                        int[] iArr = this.K;
                        float f11 = x10 - iArr[0];
                        float f12 = y10 - iArr[1];
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
                        float f122 = y10 - iArr2[1];
                        childAt.getHitRect(this.J);
                        if (childAt.getVisibility() != 0) {
                        }
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    }
                }
            }
        } else if (motionEvent.getActionMasked() == 1 && (z12 || z10)) {
            ch.k kVar5 = this.M;
            if (kVar5 != null) {
                org.telegram.messenger.g0.r(kVar5);
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
                    y yVar = this.f29904c;
                    if (yVar != null) {
                        yVar.o(((Integer) tag2).intValue());
                    } else {
                        l0 l0Var = this.Q;
                        if (l0Var != null) {
                            l0Var.g(((Integer) tag2).intValue());
                        }
                    }
                    if (z10) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        g1 g1Var2 = this.d;
                        if (g1Var2 != null) {
                            g1Var2.d(this.S);
                        }
                    }
                }
            } else if (this.f29911g0 && !z10) {
                this.d.d(true);
            }
            if (this.f29923r0) {
                this.f29923r0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        } else {
            if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (kVar = this.M) != null) {
                org.telegram.messenger.g0.r(kVar);
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
        j5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            this.d.dismiss();
        }
    }

    public final void q() {
        if (this.f29902b != null) {
            return;
        }
        this.J = new Rect();
        this.K = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 1, getContext(), this.f29918n0);
        this.f29902b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        dh.c cVar = this.f29927u0;
        if (cVar != null) {
            fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.p(this.f29928v0);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            c10.q(org.telegram.messenger.g0.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.f29902b.setOnTouchListener(new hi.i4(1, this));
        this.f29902b.setDispatchKeyEventListener(new org.telegram.tgnet.u(this, 2));
    }

    public final void r() {
        j5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.d(this.S);
        }
    }

    public final boolean s() {
        ArrayList arrayList = this.f29912h0;
        if (!arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((jg.o0) arrayList.get(i7)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setAdditionalXOffset(int i7) {
        this.f29905c0 = i7;
    }

    public void setAdditionalYOffset(int i7) {
        this.f29903b0 = i7;
    }

    public void setDelegate(l0 l0Var) {
        this.Q = l0Var;
    }

    public void setDimMenu(float f10) {
        this.f29915k0 = f10;
    }

    public void setFitSubItems(boolean z10) {
        this.f29902b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f29921q0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f29910f0 = z10;
    }

    public void setIcon(Drawable drawable) {
        rh0 rh0Var = this.f29933y;
        if (rh0Var == null) {
            return;
        }
        if (drawable instanceof oh0) {
            rh0Var.setAnimation((oh0) drawable);
        } else {
            rh0Var.setImageDrawable(drawable);
        }
        this.E = 0;
    }

    public void setIconColor(int i7) {
        if (this.f29925s0 == null || this.f29926t0 != i7) {
            this.f29925s0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            this.f29926t0 = i7;
        }
        rh0 rh0Var = this.f29933y;
        if (rh0Var != null) {
            ColorFilter colorFilter = rh0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.f29925s0;
            if (colorFilter != porterDuffColorFilter) {
                rh0Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setTextColor(i7);
        }
        f0 f0Var = this.f29924s;
        if (f0Var != null) {
            ColorFilter colorFilter2 = f0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.f29925s0;
            if (colorFilter2 != porterDuffColorFilter2) {
                this.f29924s.setColorFilter(porterDuffColorFilter2);
            }
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.V = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.f29906d0 = z10;
    }

    public void setMenuXOffset(int i7) {
        this.P = i7;
    }

    public void setMenuYOffset(int i7) {
        this.O = i7;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f29920p0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final y10 y10Var) {
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    y10 y10Var2 = y10Var;
                    if (y10Var2 != null) {
                        y10Var2.a(Boolean.valueOf(q0.this.U));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        g1 g1Var = this.d;
        if (g1Var != null) {
            g1Var.f28975b = z10;
        }
        this.W = z10;
    }

    public void setPopupItemsSelectorColor(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29902b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = d61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = d61Var.getChildAt(i10);
                if (childAt instanceof y0) {
                    ((y0) childAt).setSelectorColor(i7);
                }
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.f29931x = view;
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
        this.f29917n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f29907e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i7) {
        boolean z10;
        this.f29919o0 = i7;
        ai.m0 m0Var = this.G;
        if (m0Var != null) {
            ((ViewGroup.MarginLayoutParams) m0Var.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i7);
            ai.m0 m0Var2 = this.G;
            if (this.f29919o0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            m0Var2.setClipChildren(z10);
            ai.m0 m0Var3 = this.G;
            m0Var3.setLayoutParams(m0Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        hi.b2 b2Var = this.f29901a0;
        if (b2Var == null) {
            return;
        }
        if (z10) {
            b2Var.f35304e = true;
            b2Var.f35302b = System.currentTimeMillis();
            b2Var.invalidateSelf();
            return;
        }
        b2Var.f35304e = false;
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f29911g0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29902b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(n0 n0Var) {
        this.R = n0Var;
    }

    public void setSubMenuOpenSide(int i7) {
        this.N = i7;
    }

    public void setSubMenuOverlayProvider(q10 q10Var) {
        this.f29930w0 = q10Var;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.F;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.f29916l0 = f10;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.f29916l0);
    }

    public void setupPopupRadialSelectors(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29902b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i7);
        }
    }

    public final boolean t() {
        if (this.f29902b == null) {
            ArrayList arrayList = this.f29934y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void u(int i7) {
        o0 o0Var;
        View findViewWithTag;
        HashMap hashMap = this.f29935z0;
        if (hashMap == null) {
            o0Var = null;
        } else {
            o0Var = (o0) hashMap.get(Integer.valueOf(i7));
        }
        if (o0Var != null) {
            o0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29902b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public boolean v() {
        return this.H;
    }

    public boolean w() {
        ai.m0 m0Var = this.G;
        if (m0Var != null && m0Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean x() {
        ai.m0 m0Var = this.G;
        if (m0Var != null && m0Var.getTag() != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        j5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.I;
        }
        g1 g1Var = this.d;
        if (g1Var != null && g1Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void z() {
        if (this.f29934y0 == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f29934y0.size(); i7++) {
            o0 o0Var = (o0) this.f29934y0.get(i7);
            o0Var.getClass();
            q();
            View view = o0Var.f29838j;
            if (view != null) {
                this.f29902b.addView(view);
            } else {
                int i10 = o0Var.f29831a;
                if (i10 == 0) {
                    y0 y0Var = new y0(0, getContext(), this.f29918n0, false, false);
                    y0Var.j(o0Var.f29834e, o0Var.f29833c, o0Var.d);
                    y0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    y0Var.setTag(Integer.valueOf(o0Var.f29832b));
                    this.f29902b.addView(y0Var);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y0Var.getLayoutParams();
                    if (hd.f24444a0) {
                        layoutParams.gravity = 5;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = org.telegram.messenger.g0.L(48.0f);
                    y0Var.setLayoutParams(layoutParams);
                    y0Var.setOnClickListener(new c0(o0Var, this));
                    Integer num = o0Var.f29842n;
                    if (num != null && o0Var.f29843o != null) {
                        y0Var.d(num.intValue(), o0Var.f29843o.intValue());
                    }
                    o0Var.f29838j = y0Var;
                } else if (i10 == 1) {
                    d1 d1Var = new d1(m6.H8, getContext(), this.f29918n0);
                    d1Var.setTag(2131296439, 1);
                    this.f29902b.a(d1Var, ma.o(-1, 8));
                    o0Var.f29838j = d1Var;
                } else if (i10 == 2) {
                    y0 y0Var2 = new y0(0, getContext(), this.f29918n0, false, false);
                    y0Var2.j(o0Var.f29834e, o0Var.f29833c, o0Var.d);
                    y0Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    y0Var2.setRightIcon(2131232061);
                    y0Var2.getRightIcon().setVisibility(o0Var.f29841m);
                    this.f29902b.addView(y0Var2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) y0Var2.getLayoutParams();
                    if (hd.f24444a0) {
                        layoutParams2.gravity = 5;
                    }
                    layoutParams2.width = -1;
                    layoutParams2.height = org.telegram.messenger.g0.L(48.0f);
                    y0Var2.setLayoutParams(layoutParams2);
                    fh fhVar = o0Var.h;
                    if (fhVar != null) {
                        o0Var.f29836g = (View) fhVar.run();
                        o0Var.h = null;
                    }
                    y0Var2.Q = new d0(this, this.f29902b.b(o0Var.f29836g), 1);
                    y0Var2.setOnClickListener(new e0(y0Var2, 1));
                    this.f29902b.f28768c = true;
                    Integer num2 = o0Var.f29842n;
                    if (num2 != null && o0Var.f29843o != null) {
                        y0Var2.d(num2.intValue(), o0Var.f29843o.intValue());
                    }
                    o0Var.f29838j = y0Var2;
                } else if (i10 == 3) {
                    m80 m80Var = new m80(getContext(), null);
                    m80Var.setTag(2131296439, 1);
                    m80Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                    m80Var.setTextSize(1, o0Var.f29837i);
                    t6.U(m80Var, m6.E8, null);
                    m80Var.setMovementMethod(LinkMovementMethod.getInstance());
                    t6.G(m80Var, m6.J6, null);
                    m80Var.setText(o0Var.f29834e);
                    m80Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
                    this.f29902b.a(m80Var, ma.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    o0Var.f29838j = m80Var;
                }
            }
            View view2 = o0Var.f29838j;
            if (view2 != null) {
                view2.setVisibility(o0Var.f29840l);
                ch chVar = o0Var.f29839k;
                if (chVar != null) {
                    o0Var.f29838j.setOnClickListener(chVar);
                }
            }
        }
        this.f29934y0.clear();
    }

    public q0(Context context, y yVar, int i7) {
        this(context, yVar, 0, i7, false, null);
    }

    public q0(Context context, y yVar, int i7, int i10, boolean z10, h6 h6Var) {
        super(context);
        new ArrayList();
        this.S = true;
        this.W = true;
        this.f29908e0 = true;
        this.f29911g0 = true;
        this.f29912h0 = new ArrayList();
        this.f29913i0 = -1;
        this.f29914j0 = new h2.f((int[]) null);
        this.f29918n0 = h6Var;
        if (i7 != 0) {
            setBackgroundDrawable(m6.h0(i7, z10 ? 5 : 1, -1));
        }
        this.f29904c = yVar;
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
            addView(textView, ma.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f29933y = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, ma.c(-1.0f, -1));
        if (i10 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i7) {
        rh0 rh0Var = this.f29933y;
        if (rh0Var == null) {
            return;
        }
        this.E = i7;
        rh0Var.setImageResource(i7);
    }
}
