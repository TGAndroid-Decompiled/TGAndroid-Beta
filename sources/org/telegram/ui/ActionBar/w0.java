package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e31;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.z90;
import org.telegram.ui.oh;
import org.telegram.ui.qh;
public class w0 extends FrameLayout {
    public final TextView E;
    public q0 F;
    public boolean G;
    public s0 H;
    public Rect I;
    public int[] J;
    public View K;
    public q L;
    public int M;
    public int N;
    public int O;
    public r0 P;
    public t0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public fi.d2 W;
    public FrameLayout f23172a;
    public int f23173a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f23174b;
    public int f23175b0;
    public final z f23176c;
    public boolean f23177c0;
    public o1 d;
    public boolean f23178d0;
    public fi.c2 e;
    public boolean f23179e0;
    public LinearLayout f23180f;
    public boolean f23181f0;
    public final ArrayList f23182g0;
    public TextView h;
    public int f23183h0;
    public final AnimationNotificationsLocker f23184i0;
    public float f23185j0;
    public float f23186k0;
    public View f23187l0;
    public final u6 m0;
    public CharSequence f23188n;
    public int f23189n0;
    public View.OnClickListener f23190o0;
    public boolean f23191p0;
    public PorterDuffColorFilter f23192q0;
    public CharSequence f23193r;
    public int f23194r0;
    public k0 f23195s;
    public ch.b f23196s0;
    public fh.e f23197t0;
    public AnimatorSet f23198u0;
    public AnimatorSet v;
    public ArrayList f23199v0;
    public View f23200w;
    public HashMap f23201w0;
    public final ak0 f23202x;
    public int f23203y;

    public w0(Context context, int i10, int i11) {
        this(context, null, i10, i11, true, null);
    }

    public static g1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, u6 u6Var) {
        g1 g1Var = new g1(z12 ? 1 : 0, viewGroup.getContext(), u6Var, z10, z11);
        g1Var.j(charSequence, i10, null);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        viewGroup.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        return g1Var;
    }

    public final void A(xj0 xj0Var, String str) {
        u0 u0Var = new u0(0);
        u0Var.f23108b = 29;
        u0Var.f23109c = 0;
        u0Var.d = xj0Var;
        u0Var.e = str;
        u0Var.f23110f = true;
        G(u0Var);
    }

    public final u0 B(int i10, qh qhVar) {
        u0 u0Var = new u0(2);
        u0Var.f23109c = i10;
        u0Var.d = null;
        u0Var.e = null;
        u0Var.f23111g = null;
        u0Var.h = qhVar;
        G(u0Var);
        return u0Var;
    }

    public final u0 C() {
        u0 u0Var = new u0(3);
        u0Var.e = "";
        u0Var.f23112i = 13;
        G(u0Var);
        return u0Var;
    }

    public final void D() {
        Integer num;
        boolean z10;
        ArrayList arrayList = this.f23182g0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new n0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) ds.f27585g);
            transitionSet.addListener((Transition.TransitionListener) new o0(this));
            TransitionManager.beginDelayedTransition(this.f23180f, transitionSet);
        }
        if (this.f23180f != null) {
            int i10 = 0;
            while (i10 < this.f23180f.getChildCount()) {
                if (!arrayList2.remove(((v0) this.f23180f.getChildAt(i10)).getFilter())) {
                    this.f23180f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ig.p0 p0Var = (ig.p0) arrayList2.get(i11);
            p0Var.getClass();
            v0 v0Var = new v0(getContext(), this.m0);
            v0Var.setData(p0Var);
            v0Var.setOnClickListener(new bi.q(26, this, v0Var));
            this.f23180f.addView(v0Var, gb1.x(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f23180f != null) {
            for (int i12 = 0; i12 < this.f23180f.getChildCount(); i12++) {
                v0 v0Var2 = (v0) this.f23180f.getChildAt(i12);
                if (i12 == this.f23183h0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v0Var2.setExpanded(z10);
            }
        }
        LinearLayout linearLayout = this.f23180f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x9 = this.e.getX();
        if (this.F.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new p0(this, x9));
        }
        j();
    }

    public void E() {
        s0 s0Var = this.H;
        if (s0Var != null) {
            s0Var.k(this.e);
        }
    }

    public void F(boolean z10) {
        z zVar;
        k();
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getVisibility() != 0 && (zVar = this.f23176c) != null) {
            zVar.f23776b.t(T(z10));
        }
    }

    public final u0 G(u0 u0Var) {
        if (this.f23199v0 == null) {
            this.f23199v0 = new ArrayList();
        }
        this.f23199v0.add(u0Var);
        if (this.f23201w0 == null) {
            this.f23201w0 = new HashMap();
        }
        this.f23201w0.put(Integer.valueOf(u0Var.f23108b), u0Var);
        return u0Var;
    }

    public final void H(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23174b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i10) {
            this.f23174b.setBackgroundColor(i10);
            o1 o1Var = this.d;
            if (o1Var != null && o1Var.isShowing()) {
                this.f23174b.invalidate();
            }
        }
    }

    public final void I(ig.p0 p0Var) {
        if (!p0Var.h) {
            return;
        }
        ArrayList arrayList = this.f23182g0;
        arrayList.remove(p0Var);
        int i10 = this.f23183h0;
        if (i10 < 0 || i10 > arrayList.size() - 1) {
            this.f23183h0 = arrayList.size() - 1;
        }
        D();
        this.e.hideActionMode();
    }

    public w0 J(s0 s0Var) {
        this.H = s0Var;
        return this;
    }

    public final void K() {
        this.R = false;
    }

    public final void L(ch.b bVar, fh.e eVar) {
        this.f23196s0 = bVar;
        this.f23197t0 = eVar;
        View view = this.f23174b;
        if (view != null && bVar != null) {
            eh.d c10 = bVar.c(view, null, true);
            c10.v(eVar);
            c10.x(AndroidUtilities.dp(12.0f));
            c10.w(AndroidUtilities.dp(8.0f));
            view.setBackground(c10);
        }
    }

    public w0 M() {
        return N();
    }

    public w0 N() {
        if (this.f23176c == null) {
            return this;
        }
        this.G = true;
        return this;
    }

    public final void O(int i10, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23174b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
            int childCount = k1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = k1Var.getChildAt(i11);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i10);
                } else if (childAt instanceof g1) {
                    if (z10) {
                        ((g1) childAt).setIconColor(i10);
                    } else {
                        ((g1) childAt).setTextColor(i10);
                    }
                }
            }
        }
    }

    public void P(CharSequence charSequence, boolean z10) {
        this.f23193r = charSequence;
        if (this.h != null) {
            this.f23178d0 = z10;
            this.e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.e.setSelection(charSequence.length());
            }
        }
    }

    public final void Q(int i10, boolean z10) {
        if (z10) {
            S(i10);
        } else {
            t(i10);
        }
    }

    public final void R(int i10) {
        S(i10);
    }

    public final void S(int i10) {
        u0 u0Var;
        View findViewWithTag;
        HashMap hashMap = this.f23201w0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i10));
        }
        if (u0Var != null) {
            u0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23174b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            vh.q(findViewWithTag.animate().alpha(1.0f), ds.f27584f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public boolean T(boolean z10) {
        z zVar;
        ak0 iconView;
        Animator e;
        k();
        s0 s0Var = this.H;
        if (this.F == null || (s0Var != null && !s0Var.c())) {
            return false;
        }
        s0 s0Var2 = this.H;
        if (s0Var2 != null && (e = s0Var2.e()) != null) {
            e.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            zVar = this.f23176c;
            if (i10 >= zVar.getChildCount()) {
                break;
            }
            View childAt = zVar.getChildAt(i10);
            if ((childAt instanceof w0) && (iconView = ((w0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i10++;
        }
        Object tag = this.F.getTag();
        Property property = View.ALPHA;
        if (tag != null) {
            this.F.setTag(null);
            AnimatorSet animatorSet = this.f23198u0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f23198u0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23198u0 = animatorSet2;
            q0 q0Var = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(q0Var, property, q0Var.getAlpha(), 0.0f));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((View) arrayList.get(i11)).setAlpha(0.0f);
                this.f23198u0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), property, ((View) arrayList.get(i11)).getAlpha(), 1.0f));
            }
            this.f23198u0.setDuration(150L);
            this.f23198u0.addListener(new m0(this, arrayList, 0));
            this.f23198u0.start();
            this.e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f23182g0;
            if (!arrayList2.isEmpty() && this.H != null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((ig.p0) arrayList2.get(i12)).h) {
                        this.H.j((ig.p0) arrayList2.get(i12));
                    }
                }
            }
            s0 s0Var3 = this.H;
            if (s0Var3 != null) {
                s0Var3.h();
            }
            if (z10) {
                AndroidUtilities.hideKeyboard(this.e);
            }
            zVar.requestLayout();
            requestLayout();
            return false;
        }
        this.F.setVisibility(0);
        this.F.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f23198u0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f23198u0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f23198u0 = animatorSet4;
        q0 q0Var2 = this.F;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(q0Var2, property, q0Var2.getAlpha(), 1.0f));
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f23198u0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
        }
        this.f23198u0.setDuration(150L);
        this.f23198u0.addListener(new m0(this, arrayList, 1));
        this.f23198u0.start();
        setVisibility(8);
        m();
        this.e.setText("");
        this.e.requestFocus();
        if (z10) {
            AndroidUtilities.showKeyboard(this.e);
        }
        this.F.setTag(1);
        s0 s0Var4 = this.H;
        if (s0Var4 != null) {
            s0Var4.i();
        }
        return true;
    }

    public void U(View view, View view2) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z10;
        View childAt;
        long j10;
        k kVar;
        o1 o1Var = this.d;
        if (o1Var == null || !o1Var.isShowing()) {
            y();
        }
        if (this.f23174b != null) {
            z zVar = this.f23176c;
            if (zVar == null || !zVar.f23777c || (kVar = zVar.f23776b) == null || kVar.q()) {
                q qVar = this.L;
                FrameLayout frameLayout = null;
                if (qVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qVar);
                    this.L = null;
                }
                o1 o1Var2 = this.d;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.f23187l0 = view2;
                t0 t0Var = this.Q;
                if (t0Var != null) {
                    t0Var.b();
                }
                if (this.f23174b.getParent() != null) {
                    ((ViewGroup) this.f23174b.getParent()).removeView(this.f23174b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f23174b;
                if (view != null) {
                    ?? l5Var = new fi.l5(this, getContext(), view);
                    l5Var.setOrientation(1);
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout2.animate().alpha(1.0f).setDuration(100L);
                    if (this.f23174b.v) {
                        j10 = 165;
                    } else {
                        j10 = 0;
                    }
                    duration.setStartDelay(j10).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof g1) || (view instanceof LinearLayout)) {
                        ch.b bVar = this.f23196s0;
                        if (bVar != null) {
                            eh.d c10 = bVar.c(this.f23174b, null, true);
                            c10.v(this.f23197t0);
                            vh.s(c10, AndroidUtilities.dp(12.0f), 8.0f);
                            c10.f9966x.e = true;
                            frameLayout2.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f23174b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout2.setBackground(mutate);
                        }
                    }
                    frameLayout2.addView(view, gb1.g(-2.0f, -1));
                    l5Var.addView(frameLayout2, gb1.r(-1, -2));
                    l5Var.addView(this.f23174b, gb1.x(-2, -2, 0, 0, -10, 0, 0));
                    this.f23174b.setTopView(frameLayout2);
                    frameLayout = frameLayout2;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = l5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.f23196s0 != null) {
                    k80.U(this.f23174b, y6.o1(0.06f, y6.w0(y6.E8, this.m0)));
                }
                o1 o1Var3 = new o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = o1Var3;
                if (this.V) {
                    o1Var3.setAnimationStyle(0);
                } else {
                    o1Var3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z11 = this.V;
                if (!z11) {
                    this.d.f22906b = z11;
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
                        o1 o1Var4;
                        w0 w0Var = w0.this;
                        w0Var.getClass();
                        if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (o1Var4 = w0Var.d) != null && o1Var4.isShowing()) {
                            w0Var.d.d(true);
                            return true;
                        }
                        return false;
                    }
                });
                this.d.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        t0 t0Var2 = w0.this.Q;
                        if (t0Var2 != null) {
                            t0Var2.a();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(vh.x(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f23174b.getSwipeBack() != null && (childAt = this.f23174b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.T = false;
                this.d.setFocusable(true);
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                W(true, z10);
                this.f23174b.f();
                if (this.f23174b.getSwipeBack() != null) {
                    this.f23174b.getSwipeBack().b(false);
                }
                this.d.h();
                float f7 = this.f23185j0;
                if (f7 > 0.0f) {
                    this.d.c(f7);
                }
            }
        }
    }

    public final void V() {
        if (this.f23180f != null) {
            for (int i10 = 0; i10 < this.f23180f.getChildCount(); i10++) {
                if (this.f23180f.getChildAt(i10) instanceof v0) {
                    ((v0) this.f23180f.getChildAt(i10)).updateColors();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23174b;
        u6 u6Var = this.m0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.f23174b.getItemsCount(); i11++) {
                if (this.f23174b.L.getChildAt(i11) instanceof g1) {
                    ((g1) this.f23174b.L.getChildAt(i11)).setSelectorColor(y6.w0(y6.I5, u6Var));
                }
            }
        }
        fi.c2 c2Var = this.e;
        if (c2Var != null) {
            int i12 = y6.C8;
            f7.m(c2Var, 30, i12, u6Var);
            f7.E(this.e, y6.D8, u6Var);
            f7.V(this.e, i12, u6Var);
            f7.D(this.e, y6.f23680uf, u6Var);
            f7.z(this.e, y6.f23698vf, u6Var);
        }
    }

    public final void W(boolean z10, boolean z11) {
        float f7;
        int i10;
        int i11;
        ScrollView scrollView;
        z zVar = this.f23176c;
        if (zVar != null) {
            i11 = zVar.getTop() + (-zVar.f23776b.getMeasuredHeight());
            i10 = zVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            float measuredHeight = getMeasuredHeight() * scaleY;
            if (this.M != 2) {
                f7 = getTranslationY();
            } else {
                f7 = 0.0f;
            }
            i10 = -((int) (measuredHeight - (f7 / scaleY)));
            i11 = this.f23173a0;
        }
        int i12 = i10 + i11 + this.N;
        if (z10 && (scrollView = this.f23174b.K) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.f23187l0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            k kVar = zVar.f23776b;
            if (this.M == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.f23179e0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.O, i12);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.O, i12);
                }
            }
            if (z11) {
                this.d.update(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.O, i12, -1, -1);
                return;
            }
            return;
        }
        int i13 = this.M;
        if (i13 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z10) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f23175b0 + this.O, i12);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f23175b0 + this.O, i12, -1, -1);
                }
            }
        } else if (i13 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.f23175b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.f23175b0 + this.O, i12, -1, -1);
            }
        } else {
            if (z10) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f23175b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f23175b0 + this.O, i12, -1, -1);
            }
        }
    }

    public final l1 a(int i10) {
        p();
        l1 l1Var = new l1(getContext(), y6.H8, this.m0);
        if (i10 != -1) {
            l1Var.setTag(Integer.valueOf(i10));
        }
        l1Var.setTag(R.id.fit_width_tag, 1);
        this.f23174b.a(l1Var, gb1.r(-1, 8));
        return l1Var;
    }

    public final TextView b(int i10) {
        p();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i10);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.f23174b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int dp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = dp;
        layoutParams.topMargin = dp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final g1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, u6 u6Var) {
        p();
        g1 g1Var = new g1(z11 ? 1 : 0, getContext(), u6Var, false, false);
        g1Var.j(charSequence, i11, drawable);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setTag(Integer.valueOf(i10));
        this.f23174b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.setOnClickListener(new di.g2(2, this, z10));
        return g1Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f23191p0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final g1 e(int i10, int i11, CharSequence charSequence) {
        return d(i10, i11, null, charSequence, true, false, this.m0);
    }

    public final g1 f(int i10, int i11, String str, u6 u6Var) {
        return d(i10, i11, null, str, true, false, u6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        p();
        TextView textView = new TextView(getContext());
        f7.V(textView, y6.E8, this.m0);
        textView.setBackgroundDrawable(y6.M0(false));
        if (!LocaleController.isRTL) {
            textView.setGravity(16);
        } else {
            textView.setGravity(21);
        }
        textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(AndroidUtilities.dp(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(charSequence);
        this.f23174b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new b0(this, 3));
    }

    public View getContentView() {
        ak0 ak0Var = this.f23202x;
        if (ak0Var != null) {
            return ak0Var;
        }
        return this.E;
    }

    public ak0 getIconView() {
        return this.f23202x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f23190o0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f23174b == null) {
            p();
        }
        return this.f23174b;
    }

    public ImageView getSearchClearButton() {
        return this.f23195s;
    }

    public FrameLayout getSearchContainer() {
        return this.F;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.e;
    }

    public TextView getTextView() {
        return this.E;
    }

    public int getVisibleSubItemsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f23174b.getItemsCount(); i11++) {
            View childAt = this.f23174b.L.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i10) {
        p();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i10));
        this.f23174b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new b0(this, 1));
        kVar.setBackgroundDrawable(y6.M0(false));
    }

    public final g1 i(int i10, e31 e31Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        p();
        g1 g1Var = new g1(0, getContext(), this.m0, false, false);
        g1Var.j(str, i10, e31Var);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setRightIcon(R.drawable.msg_arrowright);
        this.f23174b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.P = new g0(this, this.f23174b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        g1Var.setOnClickListener(new h0(g1Var, 0));
        this.f23174b.f22358c = true;
        return g1Var;
    }

    public final void j() {
        s0 s0Var;
        TextView textView;
        s0 s0Var2;
        if (this.f23195s != null) {
            boolean r6 = r();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!r6 && TextUtils.isEmpty(this.e.getText()) && (((s0Var = this.H) == null || !s0Var.d()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((s0Var2 = this.H) != null && !s0Var2.m())))) {
                if (this.f23195s.getTag() != null) {
                    this.f23195s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.f23178d0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final w0 f22519b;

                            {
                                this.f22519b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        w0 w0Var = this.f22519b;
                                        w0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = w0Var.f23200w;
                                        if (view != null) {
                                            view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        w0 w0Var2 = this.f22519b;
                                        w0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = w0Var2.f23200w;
                                        if (view2 != null) {
                                            view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f23195s, property4, 0.0f), ObjectAnimator.ofFloat(this.f23195s, property3, 0.0f), ObjectAnimator.ofFloat(this.f23195s, property2, 0.0f), ObjectAnimator.ofFloat(this.f23195s, property, 45.0f), ofFloat);
                        duration.addListener(new l0(this, 0));
                        duration.start();
                        this.v = duration;
                        return;
                    }
                    this.f23195s.setAlpha(0.0f);
                    this.f23195s.setRotation(45.0f);
                    this.f23195s.setScaleX(0.0f);
                    this.f23195s.setScaleY(0.0f);
                    this.f23195s.setVisibility(4);
                    this.f23178d0 = true;
                }
            } else if (this.f23195s.getTag() == null) {
                this.f23195s.setTag(1);
                AnimatorSet animatorSet2 = this.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f23195s.setVisibility(0);
                if (this.f23178d0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final w0 f22519b;

                        {
                            this.f22519b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    w0 w0Var = this.f22519b;
                                    w0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = w0Var.f23200w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    w0 w0Var2 = this.f22519b;
                                    w0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = w0Var2.f23200w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f23195s, property4, 1.0f), ObjectAnimator.ofFloat(this.f23195s, property3, 1.0f), ObjectAnimator.ofFloat(this.f23195s, property2, 1.0f), ObjectAnimator.ofFloat(this.f23195s, property, 0.0f), ofFloat2);
                    duration2.addListener(new l0(this, 1));
                    duration2.start();
                    this.v = duration2;
                    return;
                }
                this.f23195s.setAlpha(1.0f);
                this.f23195s.setRotation(0.0f);
                this.f23195s.setScaleX(1.0f);
                this.f23195s.setScaleY(1.0f);
                View view = this.f23200w;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.f23178d0 = true;
            }
        }
    }

    public final void k() {
        boolean z10;
        int i10;
        if (this.F == null && this.G) {
            q0 q0Var = new q0(this, getContext(), 0);
            this.F = q0Var;
            if (this.f23189n0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q0Var.setClipChildren(z10);
            this.f23172a = null;
            q0 q0Var2 = this.F;
            LinearLayout.LayoutParams q5 = gb1.q(1.0f, 0, -1, this.f23189n0 + 6, 0, 0);
            z zVar = this.f23176c;
            zVar.addView(q0Var2, 0, q5);
            this.F.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i11 = y6.C8;
            u6 u6Var = this.m0;
            f7.V(textView2, i11, u6Var);
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            TextView textView3 = this.h;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView3.setGravity(i10);
            fi.c2 c2Var = new fi.c2(this, getContext(), 2);
            this.e = c2Var;
            c2Var.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            f7.w(this.e, i11, u6Var);
            this.e.setTextSize(1, 18.0f);
            f7.E(this.e, y6.D8, u6Var);
            f7.V(this.e, i11, u6Var);
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | 524288);
            this.e.setOnEditorActionListener(new a0(0, this));
            this.e.addTextChangedListener(new j0(0, this));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            f7.D(this.e, y6.f23680uf, u6Var);
            f7.z(this.e, y6.f23698vf, u6Var);
            CharSequence charSequence = this.f23188n;
            if (charSequence != null) {
                this.e.setHint(charSequence);
                setContentDescription(this.f23188n);
            }
            CharSequence charSequence2 = this.f23193r;
            if (charSequence2 != null) {
                this.e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f23180f = linearLayout;
            linearLayout.setOrientation(0);
            this.f23180f.setVisibility(0);
            if (!LocaleController.isRTL) {
                this.F.addView(this.h, gb1.h(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.F.addView(this.e, gb1.h(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f23180f, gb1.h(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.F.addView(this.f23180f, gb1.h(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.e, gb1.h(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.h, gb1.h(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f23180f.setClipChildren(false);
            k0 k0Var = new k0(this, getContext(), 0);
            this.f23195s = k0Var;
            fi.d2 d2Var = new fi.d2(1, this);
            this.W = d2Var;
            k0Var.setImageDrawable(d2Var);
            this.f23195s.setBackground(y6.g0(zVar.f23776b.f22778q0, 1, -1));
            this.f23195s.setScaleType(ImageView.ScaleType.CENTER);
            this.f23195s.setAlpha(0.0f);
            this.f23195s.setRotation(45.0f);
            this.f23195s.setScaleX(0.0f);
            this.f23195s.setScaleY(0.0f);
            this.f23195s.setOnClickListener(new b0(this, 0));
            this.f23195s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.F.addView(this.f23195s, gb1.i(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < this.f23174b.getItemsCount()) {
                if (this.f23174b.L.getChildAt(i11).getVisibility() == 0) {
                    break;
                }
                i11++;
            } else {
                i10 = 8;
                break;
            }
        }
        if (i10 != getVisibility()) {
            setVisibility(i10);
        }
    }

    public final void m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23182g0;
            if (i10 < arrayList.size()) {
                if (((ig.p0) arrayList.get(i10)).h) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            } else {
                D();
                return;
            }
        }
    }

    public void n() {
        this.f23193r = null;
        fi.c2 c2Var = this.e;
        if (c2Var == null) {
            return;
        }
        c2Var.setText("");
    }

    public void o() {
        o1 o1Var = this.d;
        if (o1Var != null && o1Var.isShowing()) {
            this.d.dismiss();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f23202x != null) {
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        o1 o1Var = this.d;
        if (o1Var != null && o1Var.isShowing()) {
            W(false, true);
        }
        s0 s0Var = this.H;
        if (s0Var != null) {
            s0Var.g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o1 o1Var;
        int[] iArr;
        o1 o1Var2;
        o1 o1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f23177c0 && s() && ((o1Var3 = this.d) == null || !o1Var3.isShowing())) {
                q qVar = new q(this, 1);
                this.L = qVar;
                AndroidUtilities.runOnUIThread(qVar, 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.f23181f0 && s() && ((o1Var2 = this.d) == null || !o1Var2.isShowing())) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    U(null, null);
                    return true;
                }
            } else if (this.f23181f0 && (o1Var = this.d) != null && o1Var.isShowing()) {
                getLocationOnScreen(this.J);
                float x9 = motionEvent.getX() + this.J[0];
                float y3 = motionEvent.getY();
                float f7 = y3 + iArr[1];
                this.f23174b.getLocationOnScreen(this.J);
                int[] iArr2 = this.J;
                float f10 = x9 - iArr2[0];
                float f11 = f7 - iArr2[1];
                this.K = null;
                for (int i10 = 0; i10 < this.f23174b.getItemsCount(); i10++) {
                    View childAt = this.f23174b.L.getChildAt(i10);
                    childAt.getHitRect(this.I);
                    Object tag = childAt.getTag();
                    if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                        if (!this.I.contains((int) f10, (int) f11)) {
                            childAt.setPressed(false);
                            childAt.setSelected(false);
                        } else {
                            childAt.setPressed(true);
                            childAt.setSelected(true);
                            childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                            this.K = childAt;
                        }
                    }
                }
            }
        } else {
            o1 o1Var4 = this.d;
            if (o1Var4 != null && o1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.K;
                if (view != null) {
                    view.setSelected(false);
                    z zVar = this.f23176c;
                    if (zVar != null) {
                        zVar.n(((Integer) this.K.getTag()).intValue());
                    } else {
                        r0 r0Var = this.P;
                        if (r0Var != null) {
                            r0Var.g(((Integer) this.K.getTag()).intValue());
                        }
                    }
                    this.d.d(this.R);
                } else if (this.f23181f0) {
                    this.d.d(true);
                }
            } else {
                View view2 = this.K;
                if (view2 != null) {
                    view2.setSelected(false);
                    this.K = null;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (this.f23174b != null) {
            return;
        }
        this.I = new Rect();
        this.J = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.m0);
        this.f23174b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ch.b bVar = this.f23196s0;
        if (bVar != null) {
            eh.d c10 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.v(this.f23197t0);
            c10.x(AndroidUtilities.dp(12.0f));
            c10.w(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.f23174b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o1 o1Var;
                w0 w0Var = w0.this;
                w0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = w0Var.d) != null && o1Var.isShowing()) {
                    view.getHitRect(w0Var.I);
                    if (!w0Var.I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        w0Var.d.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            }
        });
        this.f23174b.setDispatchKeyEventListener(new p(this, 1));
    }

    public void q() {
        o1 o1Var = this.d;
        if (o1Var != null) {
            o1Var.d(this.R);
        }
    }

    public final boolean r() {
        ArrayList arrayList = this.f23182g0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((ig.p0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        if (this.f23174b == null) {
            ArrayList arrayList = this.f23199v0;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setAdditionalXOffset(int i10) {
        this.f23175b0 = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.f23173a0 = i10;
    }

    public void setDelegate(r0 r0Var) {
        this.P = r0Var;
    }

    public void setDimMenu(float f7) {
        this.f23185j0 = f7;
    }

    public void setFitSubItems(boolean z10) {
        this.f23174b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f23191p0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f23179e0 = z10;
    }

    public void setIcon(Drawable drawable) {
        ak0 ak0Var = this.f23202x;
        if (ak0Var == null) {
            return;
        }
        if (drawable instanceof xj0) {
            ak0Var.setAnimation((xj0) drawable);
        } else {
            ak0Var.setImageDrawable(drawable);
        }
        this.f23203y = 0;
    }

    public void setIconColor(int i10) {
        if (this.f23192q0 == null || this.f23194r0 != i10) {
            this.f23192q0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.f23194r0 = i10;
        }
        ak0 ak0Var = this.f23202x;
        if (ak0Var != null) {
            ColorFilter colorFilter = ak0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.f23192q0;
            if (colorFilter != porterDuffColorFilter) {
                ak0Var.setColorFilter(porterDuffColorFilter);
            }
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        k0 k0Var = this.f23195s;
        if (k0Var != null) {
            ColorFilter colorFilter2 = k0Var.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.f23192q0;
            if (colorFilter2 != porterDuffColorFilter2) {
                this.f23195s.setColorFilter(porterDuffColorFilter2);
            }
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.U = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.f23177c0 = z10;
    }

    public void setMenuXOffset(int i10) {
        this.O = i10;
    }

    public void setMenuYOffset(int i10) {
        this.N = i10;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f23190o0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(Utilities.Callback<Boolean> callback) {
        o1 o1Var = this.d;
        if (o1Var != null) {
            o1Var.setOnDismissListener(new c0(0, this, callback));
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        o1 o1Var = this.d;
        if (o1Var != null) {
            o1Var.f22906b = z10;
        }
        this.V = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23174b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
            int childCount = k1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = k1Var.getChildAt(i11);
                if (childAt instanceof g1) {
                    ((g1) childAt).setSelectorColor(i10);
                }
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.f23200w = view;
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
        this.f23188n = charSequence;
        if (this.h == null) {
            return;
        }
        this.e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i10) {
        boolean z10;
        this.f23189n0 = i10;
        q0 q0Var = this.F;
        if (q0Var != null) {
            ((ViewGroup.MarginLayoutParams) q0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            q0 q0Var2 = this.F;
            if (this.f23189n0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q0Var2.setClipChildren(z10);
            q0 q0Var3 = this.F;
            q0Var3.setLayoutParams(q0Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        fi.d2 d2Var = this.W;
        if (d2Var == null) {
            return;
        }
        if (z10) {
            d2Var.e = true;
            d2Var.f32281b = System.currentTimeMillis();
            d2Var.invalidateSelf();
            return;
        }
        d2Var.e = false;
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f23181f0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23174b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(t0 t0Var) {
        this.Q = t0Var;
    }

    public void setSubMenuOpenSide(int i10) {
        this.M = i10;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.E;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f7) {
        this.f23186k0 = f7;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7 + this.f23186k0);
    }

    public void setupPopupRadialSelectors(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23174b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i10);
        }
    }

    public final void t(int i10) {
        u0 u0Var;
        View findViewWithTag;
        HashMap hashMap = this.f23201w0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i10));
        }
        if (u0Var != null) {
            u0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23174b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public boolean u() {
        return this.G;
    }

    public boolean v() {
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean w() {
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getTag() != null) {
            return true;
        }
        return false;
    }

    public boolean x() {
        o1 o1Var = this.d;
        if (o1Var != null && o1Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final void y() {
        if (this.f23199v0 == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f23199v0.size(); i10++) {
            u0 u0Var = (u0) this.f23199v0.get(i10);
            u0Var.getClass();
            p();
            View view = u0Var.f23113j;
            if (view != null) {
                this.f23174b.addView(view);
            } else {
                int i11 = u0Var.f23107a;
                if (i11 == 0) {
                    g1 g1Var = new g1(0, getContext(), this.m0, false, false);
                    g1Var.j(u0Var.e, u0Var.f23109c, u0Var.d);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                    g1Var.setTag(Integer.valueOf(u0Var.f23108b));
                    this.f23174b.addView(g1Var);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
                    if (LocaleController.isRTL) {
                        layoutParams.gravity = 5;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = AndroidUtilities.dp(48.0f);
                    g1Var.setLayoutParams(layoutParams);
                    g1Var.setOnClickListener(new bi.q(27, u0Var, this));
                    Integer num = u0Var.f23117n;
                    if (num != null && u0Var.f23118o != null) {
                        g1Var.d(num.intValue(), u0Var.f23118o.intValue());
                    }
                    u0Var.f23113j = g1Var;
                } else if (i11 == 1) {
                    l1 l1Var = new l1(getContext(), y6.H8, this.m0);
                    l1Var.setTag(R.id.fit_width_tag, 1);
                    this.f23174b.a(l1Var, gb1.r(-1, 8));
                    u0Var.f23113j = l1Var;
                } else if (i11 == 2) {
                    g1 g1Var2 = new g1(0, getContext(), this.m0, false, false);
                    g1Var2.j(u0Var.e, u0Var.f23109c, u0Var.d);
                    g1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                    g1Var2.setRightIcon(R.drawable.msg_arrowright);
                    g1Var2.getRightIcon().setVisibility(u0Var.f23116m);
                    this.f23174b.addView(g1Var2);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) g1Var2.getLayoutParams();
                    if (LocaleController.isRTL) {
                        layoutParams2.gravity = 5;
                    }
                    layoutParams2.width = -1;
                    layoutParams2.height = AndroidUtilities.dp(48.0f);
                    g1Var2.setLayoutParams(layoutParams2);
                    qh qhVar = u0Var.h;
                    if (qhVar != null) {
                        u0Var.f23111g = (View) qhVar.run();
                        u0Var.h = null;
                    }
                    g1Var2.P = new g0(this, this.f23174b.b(u0Var.f23111g), 1);
                    g1Var2.setOnClickListener(new h0(g1Var2, 1));
                    this.f23174b.f22358c = true;
                    Integer num2 = u0Var.f23117n;
                    if (num2 != null && u0Var.f23118o != null) {
                        g1Var2.d(num2.intValue(), u0Var.f23118o.intValue());
                    }
                    u0Var.f23113j = g1Var2;
                } else if (i11 == 3) {
                    z90 z90Var = new z90(getContext(), null);
                    z90Var.setTag(R.id.fit_width_tag, 1);
                    z90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                    z90Var.setTextSize(1, u0Var.f23112i);
                    f7.V(z90Var, y6.E8, null);
                    z90Var.setMovementMethod(LinkMovementMethod.getInstance());
                    f7.H(z90Var, y6.J6, null);
                    z90Var.setText(u0Var.e);
                    z90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                    this.f23174b.a(z90Var, gb1.t(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    u0Var.f23113j = z90Var;
                }
            }
            View view2 = u0Var.f23113j;
            if (view2 != null) {
                view2.setVisibility(u0Var.f23115l);
                oh ohVar = u0Var.f23114k;
                if (ohVar != null) {
                    u0Var.f23113j.setOnClickListener(ohVar);
                }
            }
        }
        this.f23199v0.clear();
    }

    public final u0 z(int i10, int i11, String str) {
        u0 u0Var = new u0(0);
        u0Var.f23108b = i10;
        u0Var.f23109c = i11;
        u0Var.d = null;
        u0Var.e = str;
        u0Var.f23110f = true;
        G(u0Var);
        return u0Var;
    }

    public w0(Context context, z zVar, int i10) {
        this(context, zVar, 0, i10, false, null);
    }

    public w0(Context context, z zVar, int i10, int i11, boolean z10, u6 u6Var) {
        super(context);
        new ArrayList();
        this.R = true;
        this.V = true;
        this.f23178d0 = true;
        this.f23181f0 = true;
        this.f23182g0 = new ArrayList();
        this.f23183h0 = -1;
        this.f23184i0 = new AnimationNotificationsLocker();
        this.m0 = u6Var;
        if (i10 != 0) {
            setBackgroundDrawable(y6.g0(i10, z10 ? 5 : 1, -1));
        }
        this.f23176c = zVar;
        if (z10) {
            TextView textView = new TextView(context);
            this.E = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i11 != 0) {
                textView.setTextColor(i11);
            }
            addView(textView, gb1.g(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f23202x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, gb1.g(-1.0f, -1));
        if (i11 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        ak0 ak0Var = this.f23202x;
        if (ak0Var == null) {
            return;
        }
        this.f23203y = i10;
        ak0Var.setImageResource(i10);
    }
}
