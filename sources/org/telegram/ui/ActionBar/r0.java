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
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.ch;
import org.telegram.ui.d61;
import org.telegram.ui.eh;
public class r0 extends FrameLayout {
    public int E;
    public final TextView F;
    public ai.l0 G;
    public boolean H;
    public n0 I;
    public Rect J;
    public int[] K;
    public View L;
    public ch.k M;
    public int N;
    public int O;
    public int P;
    public m0 Q;
    public o0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public FrameLayout f29914a;
    public hi.c2 f29915a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f29916b;
    public int f29917b0;
    public final z f29918c;
    public int f29919c0;
    public h1 d;
    public boolean f29920d0;
    public ah.i f29921e;
    public boolean f29922e0;
    public LinearLayout f29923f;
    public boolean f29924f0;
    public boolean f29925g0;
    public TextView h;
    public final ArrayList f29926h0;
    public int f29927i0;
    public final h2.f f29928j0;
    public float f29929k0;
    public float f29930l0;
    public View m0;
    public CharSequence f29931n;
    public final i6 f29932n0;
    public int f29933o0;
    public View.OnClickListener f29934p0;
    public boolean f29935q0;
    public CharSequence f29936r;
    public boolean f29937r0;
    public g0 f29938s;
    public PorterDuffColorFilter f29939s0;
    public int f29940t0;
    public dh.c f29941u0;
    public gh.e f29942v0;
    public AnimatorSet f29943w;
    public p10 f29944w0;
    public View f29945x;
    public AnimatorSet f29946x0;
    public final ph0 f29947y;
    public ArrayList f29948y0;
    public HashMap f29949z0;

    public r0(Context context, int i7, int i10) {
        this(context, null, i7, i10, true, null);
    }

    public static z0 c(boolean z10, boolean z11, ViewGroup viewGroup, int i7, CharSequence charSequence, boolean z12, i6 i6Var) {
        z0 z0Var = new z0(z12 ? 1 : 0, viewGroup.getContext(), i6Var, z10, z11);
        z0Var.j(charSequence, i7, null);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        viewGroup.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (gd.f24213a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        return z0Var;
    }

    private k5 getShownSubMenuOverlay() {
        k5 k5Var;
        u4 subMenuOverlayHost = getSubMenuOverlayHost();
        if (subMenuOverlayHost != null) {
            k5Var = subMenuOverlayHost.getOpenMenuOverlay();
        } else {
            k5Var = null;
        }
        if (k5Var == null || k5Var.f29152e != this || (!k5Var.I && !k5Var.S)) {
            return null;
        }
        return k5Var;
    }

    public final p0 A(int i7, int i10, String str) {
        p0 p0Var = new p0(0);
        p0Var.f29846b = i7;
        p0Var.f29847c = i10;
        p0Var.d = null;
        p0Var.f29848e = str;
        p0Var.f29849f = true;
        H(p0Var);
        return p0Var;
    }

    public final void B(mh0 mh0Var, String str) {
        p0 p0Var = new p0(0);
        p0Var.f29846b = 29;
        p0Var.f29847c = 0;
        p0Var.d = mh0Var;
        p0Var.f29848e = str;
        p0Var.f29849f = true;
        H(p0Var);
    }

    public final p0 C(eh ehVar) {
        p0 p0Var = new p0(2);
        p0Var.f29847c = 2131232258;
        p0Var.d = null;
        p0Var.f29848e = null;
        p0Var.f29850g = null;
        p0Var.h = ehVar;
        H(p0Var);
        return p0Var;
    }

    public final p0 D() {
        p0 p0Var = new p0(3);
        p0Var.f29848e = "";
        p0Var.f29851i = 13;
        H(p0Var);
        return p0Var;
    }

    public final void E() {
        Integer num;
        boolean z10;
        ArrayList arrayList = this.f29926h0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        ai.l0 l0Var = this.G;
        if (l0Var != null && l0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new j0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) lr.f37209g);
            transitionSet.addListener((Transition.TransitionListener) new k0(0, this));
            TransitionManager.beginDelayedTransition(this.f29923f, transitionSet);
        }
        if (this.f29923f != null) {
            int i7 = 0;
            while (i7 < this.f29923f.getChildCount()) {
                if (!arrayList2.remove(((q0) this.f29923f.getChildAt(i7)).getFilter())) {
                    this.f29923f.removeViewAt(i7);
                    i7--;
                }
                i7++;
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            jg.o0 o0Var = (jg.o0) arrayList2.get(i10);
            o0Var.getClass();
            q0 q0Var = new q0(getContext(), this.f29932n0);
            q0Var.setData(o0Var);
            q0Var.setOnClickListener(new d0(this, q0Var, 0));
            this.f29923f.addView(q0Var, ma.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f29923f != null) {
            for (int i11 = 0; i11 < this.f29923f.getChildCount(); i11++) {
                q0 q0Var2 = (q0) this.f29923f.getChildAt(i11);
                if (i11 == this.f29927i0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q0Var2.setExpanded(z10);
            }
        }
        LinearLayout linearLayout = this.f29923f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x10 = this.f29921e.getX();
        if (this.G.getTag() != null) {
            this.f29921e.getViewTreeObserver().addOnPreDrawListener(new l0(this, x10));
        }
        k();
    }

    public void F() {
        n0 n0Var = this.I;
        if (n0Var != null) {
            n0Var.k(this.f29921e);
        }
    }

    public void G(boolean z10) {
        z zVar;
        l();
        ai.l0 l0Var = this.G;
        if (l0Var != null && l0Var.getVisibility() != 0 && (zVar = this.f29918c) != null) {
            zVar.f30297b.B(U(z10));
        }
    }

    public final p0 H(p0 p0Var) {
        if (this.f29948y0 == null) {
            this.f29948y0 = new ArrayList();
        }
        this.f29948y0.add(p0Var);
        if (this.f29949z0 == null) {
            this.f29949z0 = new HashMap();
        }
        this.f29949z0.put(Integer.valueOf(p0Var.f29846b), p0Var);
        return p0Var;
    }

    public final void I(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29916b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i7) {
            this.f29916b.setBackgroundColor(i7);
            h1 h1Var = this.d;
            if (h1Var != null && h1Var.isShowing()) {
                this.f29916b.invalidate();
            }
        }
    }

    public final void J(jg.o0 o0Var) {
        if (!o0Var.h) {
            return;
        }
        ArrayList arrayList = this.f29926h0;
        arrayList.remove(o0Var);
        int i7 = this.f29927i0;
        if (i7 < 0 || i7 > arrayList.size() - 1) {
            this.f29927i0 = arrayList.size() - 1;
        }
        E();
        this.f29921e.m();
    }

    public r0 K(n0 n0Var) {
        this.I = n0Var;
        return this;
    }

    public final void L() {
        this.S = false;
    }

    public final void M(dh.c cVar, gh.e eVar) {
        this.f29941u0 = cVar;
        this.f29942v0 = eVar;
        View view = this.f29916b;
        if (view != null && cVar != null) {
            fh.g c10 = cVar.c(view, null, true);
            c10.p(eVar);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            c10.q(org.telegram.messenger.g0.L(8.0f));
            view.setBackground(c10);
        }
    }

    public r0 N() {
        return O();
    }

    public r0 O() {
        if (this.f29918c == null) {
            return this;
        }
        this.H = true;
        return this;
    }

    public final void P(int i7, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29916b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = d61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = d61Var.getChildAt(i10);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i7);
                } else if (childAt instanceof z0) {
                    if (z10) {
                        ((z0) childAt).setIconColor(i7);
                    } else {
                        ((z0) childAt).setTextColor(i7);
                    }
                }
            }
        }
    }

    public void Q(CharSequence charSequence, boolean z10) {
        this.f29936r = charSequence;
        if (this.h != null) {
            this.f29922e0 = z10;
            this.f29921e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f29921e.setSelection(charSequence.length());
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
        p0 p0Var;
        View findViewWithTag;
        HashMap hashMap = this.f29949z0;
        if (hashMap == null) {
            p0Var = null;
        } else {
            p0Var = (p0) hashMap.get(Integer.valueOf(i7));
        }
        if (p0Var != null) {
            p0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29916b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            n10.o(findViewWithTag.animate().alpha(1.0f), lr.f37208f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public boolean U(boolean z10) {
        z zVar;
        ph0 iconView;
        Animator e10;
        l();
        n0 n0Var = this.I;
        if (this.G == null || (n0Var != null && !n0Var.c())) {
            return false;
        }
        n0 n0Var2 = this.I;
        if (n0Var2 != null && (e10 = n0Var2.e()) != null) {
            e10.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            zVar = this.f29918c;
            if (i7 >= zVar.getChildCount()) {
                break;
            }
            View childAt = zVar.getChildAt(i7);
            if ((childAt instanceof r0) && (iconView = ((r0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i7++;
        }
        Object tag = this.G.getTag();
        Property property = View.ALPHA;
        if (tag != null) {
            this.G.setTag(null);
            AnimatorSet animatorSet = this.f29946x0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f29946x0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f29946x0 = animatorSet2;
            ai.l0 l0Var = this.G;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(l0Var, property, l0Var.getAlpha(), 0.0f));
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setAlpha(0.0f);
                this.f29946x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i10), property, ((View) arrayList.get(i10)).getAlpha(), 1.0f));
            }
            this.f29946x0.setDuration(150L);
            this.f29946x0.addListener(new i0(this, arrayList, 0));
            this.f29946x0.start();
            this.f29921e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f29926h0;
            if (!arrayList2.isEmpty() && this.I != null) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((jg.o0) arrayList2.get(i11)).h) {
                        this.I.j((jg.o0) arrayList2.get(i11));
                    }
                }
            }
            n0 n0Var3 = this.I;
            if (n0Var3 != null) {
                n0Var3.h();
            }
            if (z10) {
                org.telegram.messenger.g0.v1(this.f29921e);
            }
            zVar.requestLayout();
            requestLayout();
            return false;
        }
        this.G.setVisibility(0);
        this.G.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f29946x0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f29946x0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f29946x0 = animatorSet4;
        ai.l0 l0Var2 = this.G;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(l0Var2, property, l0Var2.getAlpha(), 1.0f));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f29946x0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i12), property, ((View) arrayList.get(i12)).getAlpha(), 0.0f));
        }
        this.f29946x0.setDuration(150L);
        this.f29946x0.addListener(new i0(this, arrayList, 1));
        this.f29946x0.start();
        setVisibility(8);
        n();
        this.f29921e.setText("");
        this.f29921e.requestFocus();
        if (z10) {
            org.telegram.messenger.g0.I3(this.f29921e);
        }
        this.G.setTag(1);
        n0 n0Var4 = this.I;
        if (n0Var4 != null) {
            n0Var4.i();
        }
        return true;
    }

    public final void V(View view, r0 r0Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z10;
        View childAt;
        long j3;
        k kVar;
        k5 k5Var;
        h1 h1Var;
        boolean z11;
        FrameLayout frameLayout = null;
        if (view == null) {
            u4 subMenuOverlayHost = getSubMenuOverlayHost();
            if (subMenuOverlayHost != null) {
                k5Var = getSubMenuOverlay();
            } else {
                k5Var = null;
            }
            if (k5Var != null && ((h1Var = this.d) == null || !h1Var.isShowing())) {
                z();
                if (t() && j()) {
                    if (k5Var.f29152e == this && (((z11 = k5Var.I) || k5Var.S) && z11)) {
                        k5Var.a(true);
                        return;
                    }
                    this.U = false;
                    o0 o0Var = this.R;
                    if (o0Var != null) {
                        o0Var.k();
                    }
                    k5Var.d(subMenuOverlayHost, this, getPopupLayout());
                    return;
                }
                return;
            }
        }
        h1 h1Var2 = this.d;
        if (h1Var2 == null || !h1Var2.isShowing()) {
            z();
        }
        if (this.f29916b != null) {
            z zVar = this.f29918c;
            if (zVar == null || !zVar.f30298c || (kVar = zVar.f30297b) == null || kVar.y()) {
                ch.k kVar2 = this.M;
                if (kVar2 != null) {
                    org.telegram.messenger.g0.r(kVar2);
                    this.M = null;
                }
                h1 h1Var3 = this.d;
                if (h1Var3 != null && h1Var3.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.m0 = r0Var;
                o0 o0Var2 = this.R;
                if (o0Var2 != null) {
                    o0Var2.k();
                }
                if (this.f29916b.getParent() != null) {
                    ((ViewGroup) this.f29916b.getParent()).removeView(this.f29916b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f29916b;
                if (view != null) {
                    ?? x4Var = new hi.x4(this, getContext(), view);
                    x4Var.setOrientation(1);
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout2.animate().alpha(1.0f).setDuration(100L);
                    if (this.f29916b.f28741w) {
                        j3 = 165;
                    } else {
                        j3 = 0;
                    }
                    duration.setStartDelay(j3).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof z0) || (view instanceof LinearLayout)) {
                        dh.c cVar = this.f29941u0;
                        if (cVar != null) {
                            fh.g c10 = cVar.c(this.f29916b, null, true);
                            c10.p(this.f29942v0);
                            n10.s(c10, org.telegram.messenger.g0.L(12.0f), 8.0f);
                            c10.R.f11639e = true;
                            frameLayout2.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(2131232567).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f29916b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout2.setBackground(mutate);
                        }
                    }
                    frameLayout2.addView(view, ma.c(-2.0f, -1));
                    x4Var.addView(frameLayout2, ma.o(-1, -2));
                    x4Var.addView(this.f29916b, ma.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f29916b.setTopView(frameLayout2);
                    frameLayout = frameLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = x4Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.f29941u0 != null) {
                    y60.V(this.f29916b, n6.r1(0.06f, n6.w0(n6.E8, this.f29932n0)));
                }
                h1 h1Var4 = new h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = h1Var4;
                if (this.W) {
                    h1Var4.setAnimationStyle(0);
                } else {
                    h1Var4.setAnimationStyle(2131755191);
                }
                boolean z12 = this.W;
                if (!z12) {
                    this.d.f28989b = z12;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.V) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new ai.e0(3, this));
                this.d.setOnDismissListener(new hi.l4(1, this));
                Point point = org.telegram.messenger.g0.f24118q;
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(n10.c(40.0f, point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f29916b.getSwipeBack() != null && (childAt = this.f29916b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
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
                this.f29916b.f();
                if (this.f29916b.getSwipeBack() != null) {
                    this.f29916b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.f29929k0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void W() {
        if (this.f29923f != null) {
            for (int i7 = 0; i7 < this.f29923f.getChildCount(); i7++) {
                if (this.f29923f.getChildAt(i7) instanceof q0) {
                    ((q0) this.f29923f.getChildAt(i7)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29916b;
        i6 i6Var = this.f29932n0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i10 = 0; i10 < this.f29916b.getItemsCount(); i10++) {
                if (this.f29916b.M.getChildAt(i10) instanceof z0) {
                    ((z0) this.f29916b.M.getChildAt(i10)).setSelectorColor(n6.w0(n6.I5, i6Var));
                }
            }
        }
        ah.i iVar = this.f29921e;
        if (iVar != null) {
            int i11 = n6.C8;
            u6.l(iVar, 30, i11, i6Var);
            u6.D(this.f29921e, n6.D8, i6Var);
            u6.U(this.f29921e, i11, i6Var);
            u6.C(this.f29921e, n6.f29550lg, i6Var);
            u6.y(this.f29921e, n6.f29567mg, i6Var);
        }
    }

    public final void X(boolean z10, boolean z11) {
        float f10;
        int i7;
        int i10;
        ScrollView scrollView;
        z zVar = this.f29918c;
        if (zVar != null) {
            i10 = zVar.getTop() + (-zVar.f30297b.getMeasuredHeight());
            i7 = zVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            float measuredHeight = getMeasuredHeight() * scaleY;
            if (this.N != 2) {
                f10 = getTranslationY();
            } else {
                f10 = 0.0f;
            }
            i7 = -((int) (measuredHeight - (f10 / scaleY)));
            i10 = this.f29917b0;
        }
        int i11 = i7 + i10 + this.O;
        if (z10 && (scrollView = this.f29916b.L) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.m0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            k kVar = zVar.f30297b;
            if (this.N == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.P, i11, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.f29924f0) {
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
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f29919c0 + this.P, i11);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f29919c0 + this.P, i11, -1, -1);
                }
            }
        } else if (i12 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-org.telegram.messenger.g0.L(8.0f)) + this.f29919c0 + this.P, i11);
            }
            if (z11) {
                this.d.update(this, (-org.telegram.messenger.g0.L(8.0f)) + this.f29919c0 + this.P, i11, -1, -1);
            }
        } else {
            if (z10) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f29919c0 + this.P, i11);
            }
            if (z11) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f29919c0 + this.P, i11, -1, -1);
            }
        }
    }

    public final e1 a(int i7) {
        q();
        e1 e1Var = new e1(n6.H8, getContext(), this.f29932n0);
        if (i7 != -1) {
            e1Var.setTag(Integer.valueOf(i7));
        }
        e1Var.setTag(2131296437, 1);
        this.f29916b.a(e1Var, ma.o(-1, 8));
        return e1Var;
    }

    public final TextView b(int i7) {
        q();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i7);
        textView.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        this.f29916b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int L = org.telegram.messenger.g0.L(3.0f);
        layoutParams.bottomMargin = L;
        layoutParams.topMargin = L;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final z0 d(int i7, int i10, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, i6 i6Var) {
        q();
        z0 z0Var = new z0(z11 ? 1 : 0, getContext(), i6Var, false, false);
        z0Var.j(charSequence, i10, drawable);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z0Var.setTag(Integer.valueOf(i7));
        this.f29916b.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (gd.f24213a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        z0Var.setOnClickListener(new fi.v1(2, this, z10));
        return z0Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f29935q0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final z0 e(int i7, int i10, CharSequence charSequence) {
        return d(i7, i10, null, charSequence, true, false, this.f29932n0);
    }

    public final z0 f(Drawable drawable, String str, int i7, boolean z10, int i10) {
        return d(i7, i10, drawable, str, z10, false, this.f29932n0);
    }

    public final void g(int i7, String str) {
        q();
        TextView textView = new TextView(getContext());
        u6.U(textView, n6.E8, this.f29932n0);
        textView.setBackgroundDrawable(n6.N0(false));
        if (!gd.f24213a0) {
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
        this.f29916b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (gd.f24213a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new a0(this, 3));
    }

    public View getContentView() {
        ph0 ph0Var = this.f29947y;
        if (ph0Var != null) {
            return ph0Var;
        }
        return this.F;
    }

    public ph0 getIconView() {
        return this.f29947y;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f29934p0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f29916b == null) {
            q();
        }
        return this.f29916b;
    }

    public ImageView getSearchClearButton() {
        return this.f29938s;
    }

    public FrameLayout getSearchContainer() {
        return this.G;
    }

    public EditTextBoldCursor getSearchField() {
        l();
        return this.f29921e;
    }

    public k5 getSubMenuOverlay() {
        p10 p10Var = this.f29944w0;
        if (p10Var != null) {
            return (k5) p10Var.run();
        }
        return null;
    }

    public u4 getSubMenuOverlayHost() {
        z zVar;
        if (this.f29944w0 != null && (zVar = this.f29918c) != null) {
            return zVar.f30297b;
        }
        return null;
    }

    public TextView getTextView() {
        return this.F;
    }

    public int getVisibleSubItemsCount() {
        int i7 = 0;
        for (int i10 = 0; i10 < this.f29916b.getItemsCount(); i10++) {
            View childAt = this.f29916b.M.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                i7++;
            }
        }
        return i7;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i7) {
        q();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i7));
        this.f29916b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new a0(this, 1));
        kVar.setBackgroundDrawable(n6.N0(false));
    }

    public final z0 i(int i7, k01 k01Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        q();
        z0 z0Var = new z0(0, getContext(), this.f29932n0, false, false);
        z0Var.j(str, i7, k01Var);
        z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        z0Var.setRightIcon(2131232061);
        this.f29916b.addView(z0Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
        if (gd.f24213a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = org.telegram.messenger.g0.L(48.0f);
        z0Var.setLayoutParams(layoutParams);
        z0Var.Q = new e0(this, this.f29916b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        z0Var.setOnClickListener(new f0(z0Var, 0));
        this.f29916b.f28735c = true;
        return z0Var;
    }

    public boolean j() {
        k kVar;
        z zVar = this.f29918c;
        if (zVar != null && zVar.f30298c && (kVar = zVar.f30297b) != null && !kVar.y()) {
            return false;
        }
        return true;
    }

    public final void k() {
        n0 n0Var;
        TextView textView;
        n0 n0Var2;
        if (this.f29938s != null) {
            boolean s5 = s();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!s5 && TextUtils.isEmpty(this.f29921e.getText()) && (((n0Var = this.I) == null || !n0Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((n0Var2 = this.I) != null && !n0Var2.m())))) {
                if (this.f29938s.getTag() != null) {
                    this.f29938s.setTag(null);
                    AnimatorSet animatorSet = this.f29943w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.f29922e0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final r0 f28816b;

                            {
                                this.f28816b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        r0 r0Var = this.f28816b;
                                        r0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = r0Var.f29945x;
                                        if (view != null) {
                                            view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        r0 r0Var2 = this.f28816b;
                                        r0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = r0Var2.f29945x;
                                        if (view2 != null) {
                                            view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f29938s, property4, 0.0f), ObjectAnimator.ofFloat(this.f29938s, property3, 0.0f), ObjectAnimator.ofFloat(this.f29938s, property2, 0.0f), ObjectAnimator.ofFloat(this.f29938s, property, 45.0f), ofFloat);
                        duration.addListener(new h0(this, 0));
                        duration.start();
                        this.f29943w = duration;
                        return;
                    }
                    this.f29938s.setAlpha(0.0f);
                    this.f29938s.setRotation(45.0f);
                    this.f29938s.setScaleX(0.0f);
                    this.f29938s.setScaleY(0.0f);
                    this.f29938s.setVisibility(4);
                    this.f29922e0 = true;
                }
            } else if (this.f29938s.getTag() == null) {
                this.f29938s.setTag(1);
                AnimatorSet animatorSet2 = this.f29943w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f29938s.setVisibility(0);
                if (this.f29922e0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final r0 f28816b;

                        {
                            this.f28816b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    r0 r0Var = this.f28816b;
                                    r0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = r0Var.f29945x;
                                    if (view != null) {
                                        view.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    r0 r0Var2 = this.f28816b;
                                    r0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = r0Var2.f29945x;
                                    if (view2 != null) {
                                        view2.setTranslationX(org.telegram.messenger.g0.L(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f29938s, property4, 1.0f), ObjectAnimator.ofFloat(this.f29938s, property3, 1.0f), ObjectAnimator.ofFloat(this.f29938s, property2, 1.0f), ObjectAnimator.ofFloat(this.f29938s, property, 0.0f), ofFloat2);
                    duration2.addListener(new h0(this, 1));
                    duration2.start();
                    this.f29943w = duration2;
                    return;
                }
                this.f29938s.setAlpha(1.0f);
                this.f29938s.setRotation(0.0f);
                this.f29938s.setScaleX(1.0f);
                this.f29938s.setScaleY(1.0f);
                View view = this.f29945x;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.f29922e0 = true;
            }
        }
    }

    public final void l() {
        boolean z10;
        int i7;
        if (this.G == null && this.H) {
            ai.l0 l0Var = new ai.l0(1, getContext(), this);
            this.G = l0Var;
            if (this.f29933o0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l0Var.setClipChildren(z10);
            this.f29914a = null;
            ai.l0 l0Var2 = this.G;
            LinearLayout.LayoutParams m10 = ma.m(1.0f, 0, -1, this.f29933o0 + 6, 0, 0);
            z zVar = this.f29918c;
            zVar.addView(l0Var2, 0, m10);
            this.G.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = n6.C8;
            i6 i6Var = this.f29932n0;
            u6.U(textView2, i10, i6Var);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            TextView textView3 = this.h;
            if (gd.f24213a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView3.setGravity(i7);
            ah.i iVar = new ah.i(3, getContext(), this);
            this.f29921e = iVar;
            iVar.setScrollContainer(false);
            this.f29921e.setCursorWidth(1.5f);
            u6.v(this.f29921e, i10, i6Var);
            this.f29921e.setTextSize(1, 18.0f);
            u6.D(this.f29921e, n6.D8, i6Var);
            u6.U(this.f29921e, i10, i6Var);
            this.f29921e.setSingleLine(true);
            this.f29921e.setBackgroundResource(0);
            this.f29921e.setPadding(0, 0, 0, 0);
            this.f29921e.setInputType(this.f29921e.getInputType() | 524288);
            this.f29921e.setOnEditorActionListener(new di.n(this, 3));
            this.f29921e.addTextChangedListener(new ah.j(this, 15));
            this.f29921e.setImeOptions(234881027);
            this.f29921e.setTextIsSelectable(false);
            u6.C(this.f29921e, n6.f29550lg, i6Var);
            u6.y(this.f29921e, n6.f29567mg, i6Var);
            CharSequence charSequence = this.f29931n;
            if (charSequence != null) {
                this.f29921e.setHint(charSequence);
                setContentDescription(this.f29931n);
            }
            CharSequence charSequence2 = this.f29936r;
            if (charSequence2 != null) {
                this.f29921e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f29923f = linearLayout;
            linearLayout.setOrientation(0);
            this.f29923f.setVisibility(0);
            if (!gd.f24213a0) {
                this.G.addView(this.h, ma.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.G.addView(this.f29921e, ma.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f29923f, ma.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.G.addView(this.f29923f, ma.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.f29921e, ma.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.G.addView(this.h, ma.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f29923f.setClipChildren(false);
            g0 g0Var = new g0(0, getContext(), this);
            this.f29938s = g0Var;
            hi.c2 c2Var = new hi.c2(1, this);
            this.f29915a0 = c2Var;
            g0Var.setImageDrawable(c2Var);
            this.f29938s.setBackground(n6.h0(zVar.f30297b.f29093r0, 1, -1));
            this.f29938s.setScaleType(ImageView.ScaleType.CENTER);
            this.f29938s.setAlpha(0.0f);
            this.f29938s.setRotation(45.0f);
            this.f29938s.setScaleX(0.0f);
            this.f29938s.setScaleY(0.0f);
            this.f29938s.setOnClickListener(new a0(this, 0));
            this.f29938s.setContentDescription(gd.M0(2131752088, null));
            this.G.addView(this.f29938s, ma.e(48, -1, 21));
        }
    }

    public final void m() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < this.f29916b.getItemsCount()) {
                if (this.f29916b.M.getChildAt(i10).getVisibility() == 0) {
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
            ArrayList arrayList = this.f29926h0;
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
        this.f29936r = null;
        ah.i iVar = this.f29921e;
        if (iVar == null) {
            return;
        }
        iVar.setText("");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f29947y != null) {
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
        h1 h1Var = this.d;
        if (h1Var != null && h1Var.isShowing()) {
            X(false, true);
        }
        n0 n0Var = this.I;
        if (n0Var != null) {
            n0Var.g();
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
        k5 shownSubMenuOverlay = getShownSubMenuOverlay();
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
        h1 h1Var = this.d;
        if (h1Var != null && h1Var.isShowing()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f29937r0 = false;
            if ((this.f29920d0 || z11) && t() && !z12 && !z10) {
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
            if (this.f29925g0 && !z11 && t() && !z12) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    V(null, null);
                    this.f29937r0 = true;
                    return true;
                }
            } else if ((this.f29925g0 || this.f29937r0) && (z12 || z10)) {
                getLocationOnScreen(this.K);
                float x10 = motionEvent.getX() + this.K[0];
                float y10 = motionEvent.getY() + this.K[1];
                this.L = null;
                for (int i7 = 0; i7 < this.f29916b.getItemsCount(); i7++) {
                    View childAt = this.f29916b.M.getChildAt(i7);
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
                    z zVar = this.f29918c;
                    if (zVar != null) {
                        zVar.o(((Integer) tag2).intValue());
                    } else {
                        m0 m0Var = this.Q;
                        if (m0Var != null) {
                            m0Var.g(((Integer) tag2).intValue());
                        }
                    }
                    if (z10) {
                        shownSubMenuOverlay.a(true);
                    } else {
                        h1 h1Var2 = this.d;
                        if (h1Var2 != null) {
                            h1Var2.d(this.S);
                        }
                    }
                }
            } else if (this.f29925g0 && !z10) {
                this.d.d(true);
            }
            if (this.f29937r0) {
                this.f29937r0 = false;
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
        k5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        h1 h1Var = this.d;
        if (h1Var != null && h1Var.isShowing()) {
            this.d.dismiss();
        }
    }

    public final void q() {
        if (this.f29916b != null) {
            return;
        }
        this.J = new Rect();
        this.K = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 1, getContext(), this.f29932n0);
        this.f29916b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        dh.c cVar = this.f29941u0;
        if (cVar != null) {
            fh.g c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.p(this.f29942v0);
            c10.r(org.telegram.messenger.g0.L(12.0f));
            c10.q(org.telegram.messenger.g0.L(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.f29916b.setOnTouchListener(new hi.j4(1, this));
        this.f29916b.setDispatchKeyEventListener(new p(this, 1));
    }

    public final void r() {
        k5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            shownSubMenuOverlay.a(true);
            return;
        }
        h1 h1Var = this.d;
        if (h1Var != null) {
            h1Var.d(this.S);
        }
    }

    public final boolean s() {
        ArrayList arrayList = this.f29926h0;
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
        this.f29919c0 = i7;
    }

    public void setAdditionalYOffset(int i7) {
        this.f29917b0 = i7;
    }

    public void setDelegate(m0 m0Var) {
        this.Q = m0Var;
    }

    public void setDimMenu(float f10) {
        this.f29929k0 = f10;
    }

    public void setFitSubItems(boolean z10) {
        this.f29916b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f29935q0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f29924f0 = z10;
    }

    public void setIcon(Drawable drawable) {
        ph0 ph0Var = this.f29947y;
        if (ph0Var == null) {
            return;
        }
        if (drawable instanceof mh0) {
            ph0Var.setAnimation((mh0) drawable);
        } else {
            ph0Var.setImageDrawable(drawable);
        }
        this.E = 0;
    }

    public void setIconColor(int i7) {
        if (this.f29939s0 == null || this.f29940t0 != i7) {
            this.f29939s0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            this.f29940t0 = i7;
        }
        ph0 ph0Var = this.f29947y;
        if (ph0Var != null) {
            ColorFilter colorFilter = ph0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.f29939s0;
            if (colorFilter != porterDuffColorFilter) {
                ph0Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.F;
        if (textView != null) {
            textView.setTextColor(i7);
        }
        g0 g0Var = this.f29938s;
        if (g0Var != null) {
            ColorFilter colorFilter2 = g0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.f29939s0;
            if (colorFilter2 != porterDuffColorFilter2) {
                this.f29938s.setColorFilter(porterDuffColorFilter2);
            }
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.V = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.f29920d0 = z10;
    }

    public void setMenuXOffset(int i7) {
        this.P = i7;
    }

    public void setMenuYOffset(int i7) {
        this.O = i7;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f29934p0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final x10 x10Var) {
        h1 h1Var = this.d;
        if (h1Var != null) {
            h1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    x10 x10Var2 = x10Var;
                    if (x10Var2 != null) {
                        x10Var2.a(Boolean.valueOf(r0.this.U));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        h1 h1Var = this.d;
        if (h1Var != null) {
            h1Var.f28989b = z10;
        }
        this.W = z10;
    }

    public void setPopupItemsSelectorColor(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29916b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            d61 d61Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
            int childCount = d61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = d61Var.getChildAt(i10);
                if (childAt instanceof z0) {
                    ((z0) childAt).setSelectorColor(i7);
                }
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.f29945x = view;
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
        this.f29931n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f29921e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i7) {
        boolean z10;
        this.f29933o0 = i7;
        ai.l0 l0Var = this.G;
        if (l0Var != null) {
            ((ViewGroup.MarginLayoutParams) l0Var.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(i7);
            ai.l0 l0Var2 = this.G;
            if (this.f29933o0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l0Var2.setClipChildren(z10);
            ai.l0 l0Var3 = this.G;
            l0Var3.setLayoutParams(l0Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        hi.c2 c2Var = this.f29915a0;
        if (c2Var == null) {
            return;
        }
        if (z10) {
            c2Var.f34484e = true;
            c2Var.f34482b = System.currentTimeMillis();
            c2Var.invalidateSelf();
            return;
        }
        c2Var.f34484e = false;
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f29925g0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29916b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(o0 o0Var) {
        this.R = o0Var;
    }

    public void setSubMenuOpenSide(int i7) {
        this.N = i7;
    }

    public void setSubMenuOverlayProvider(p10 p10Var) {
        this.f29944w0 = p10Var;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.F;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.f29930l0 = f10;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.f29930l0);
    }

    public void setupPopupRadialSelectors(int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29916b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i7);
        }
    }

    public final boolean t() {
        if (this.f29916b == null) {
            ArrayList arrayList = this.f29948y0;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void u(int i7) {
        p0 p0Var;
        View findViewWithTag;
        HashMap hashMap = this.f29949z0;
        if (hashMap == null) {
            p0Var = null;
        } else {
            p0Var = (p0) hashMap.get(Integer.valueOf(i7));
        }
        if (p0Var != null) {
            p0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f29916b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i7))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public boolean v() {
        return this.H;
    }

    public boolean w() {
        ai.l0 l0Var = this.G;
        if (l0Var != null && l0Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean x() {
        ai.l0 l0Var = this.G;
        if (l0Var != null && l0Var.getTag() != null) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        k5 shownSubMenuOverlay = getShownSubMenuOverlay();
        if (shownSubMenuOverlay != null) {
            return shownSubMenuOverlay.I;
        }
        h1 h1Var = this.d;
        if (h1Var != null && h1Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void z() {
        if (this.f29948y0 == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f29948y0.size(); i7++) {
            p0 p0Var = (p0) this.f29948y0.get(i7);
            p0Var.getClass();
            q();
            View view = p0Var.f29852j;
            if (view != null) {
                this.f29916b.addView(view);
            } else {
                int i10 = p0Var.f29845a;
                if (i10 == 0) {
                    z0 z0Var = new z0(0, getContext(), this.f29932n0, false, false);
                    z0Var.j(p0Var.f29848e, p0Var.f29847c, p0Var.d);
                    z0Var.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var.setTag(Integer.valueOf(p0Var.f29846b));
                    this.f29916b.addView(z0Var);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z0Var.getLayoutParams();
                    if (gd.f24213a0) {
                        layoutParams.gravity = 5;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = org.telegram.messenger.g0.L(48.0f);
                    z0Var.setLayoutParams(layoutParams);
                    z0Var.setOnClickListener(new d0(p0Var, this));
                    Integer num = p0Var.f29856n;
                    if (num != null && p0Var.f29857o != null) {
                        z0Var.d(num.intValue(), p0Var.f29857o.intValue());
                    }
                    p0Var.f29852j = z0Var;
                } else if (i10 == 1) {
                    e1 e1Var = new e1(n6.H8, getContext(), this.f29932n0);
                    e1Var.setTag(2131296437, 1);
                    this.f29916b.a(e1Var, ma.o(-1, 8));
                    p0Var.f29852j = e1Var;
                } else if (i10 == 2) {
                    z0 z0Var2 = new z0(0, getContext(), this.f29932n0, false, false);
                    z0Var2.j(p0Var.f29848e, p0Var.f29847c, p0Var.d);
                    z0Var2.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
                    z0Var2.setRightIcon(2131232061);
                    z0Var2.getRightIcon().setVisibility(p0Var.f29855m);
                    this.f29916b.addView(z0Var2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) z0Var2.getLayoutParams();
                    if (gd.f24213a0) {
                        layoutParams2.gravity = 5;
                    }
                    layoutParams2.width = -1;
                    layoutParams2.height = org.telegram.messenger.g0.L(48.0f);
                    z0Var2.setLayoutParams(layoutParams2);
                    eh ehVar = p0Var.h;
                    if (ehVar != null) {
                        p0Var.f29850g = (View) ehVar.run();
                        p0Var.h = null;
                    }
                    z0Var2.Q = new e0(this, this.f29916b.b(p0Var.f29850g), 1);
                    z0Var2.setOnClickListener(new f0(z0Var2, 1));
                    this.f29916b.f28735c = true;
                    Integer num2 = p0Var.f29856n;
                    if (num2 != null && p0Var.f29857o != null) {
                        z0Var2.d(num2.intValue(), p0Var.f29857o.intValue());
                    }
                    p0Var.f29852j = z0Var2;
                } else if (i10 == 3) {
                    k80 k80Var = new k80(getContext(), null);
                    k80Var.setTag(2131296437, 1);
                    k80Var.setPadding(org.telegram.messenger.g0.L(13.0f), 0, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                    k80Var.setTextSize(1, p0Var.f29851i);
                    u6.U(k80Var, n6.E8, null);
                    k80Var.setMovementMethod(LinkMovementMethod.getInstance());
                    u6.G(k80Var, n6.J6, null);
                    k80Var.setText(p0Var.f29848e);
                    k80Var.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
                    this.f29916b.a(k80Var, ma.q(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    p0Var.f29852j = k80Var;
                }
            }
            View view2 = p0Var.f29852j;
            if (view2 != null) {
                view2.setVisibility(p0Var.f29854l);
                ch chVar = p0Var.f29853k;
                if (chVar != null) {
                    p0Var.f29852j.setOnClickListener(chVar);
                }
            }
        }
        this.f29948y0.clear();
    }

    public r0(Context context, z zVar, int i7) {
        this(context, zVar, 0, i7, false, null);
    }

    public r0(Context context, z zVar, int i7, int i10, boolean z10, i6 i6Var) {
        super(context);
        new ArrayList();
        this.S = true;
        this.W = true;
        this.f29922e0 = true;
        this.f29925g0 = true;
        this.f29926h0 = new ArrayList();
        this.f29927i0 = -1;
        this.f29928j0 = new h2.f((int[]) null);
        this.f29932n0 = i6Var;
        if (i7 != 0) {
            setBackgroundDrawable(n6.h0(i7, z10 ? 5 : 1, -1));
        }
        this.f29918c = zVar;
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
        this.f29947y = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, ma.c(-1.0f, -1));
        if (i10 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i7) {
        ph0 ph0Var = this.f29947y;
        if (ph0Var == null) {
            return;
        }
        this.E = i7;
        ph0Var.setImageResource(i7);
    }
}
