package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.nh;

public class v0 extends FrameLayout {
    public final TextView A;
    public q0 B;
    public boolean C;
    public e5 D;
    public Rect E;
    public int[] F;
    public View G;
    public p H;
    public int I;
    public int J;
    public int K;
    public r0 L;
    public s0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public lh.c2 S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;

    public FrameLayout f23852a;

    public boolean f23853a0;

    public ActionBarPopupWindow$ActionBarPopupWindowLayout f23854b;

    public boolean f23855b0;

    public final z f23856c;

    public final ArrayList f23857c0;
    public n1 d;

    public int f23858d0;

    public gg.g f23859e;

    public final AnimationNotificationsLocker f23860e0;

    public LinearLayout f23861f;

    public float f23862f0;

    public float f23863g0;
    public TextView h;

    public View f23864h0;

    public final c6 f23865i0;

    public int f23866j0;

    public View.OnClickListener f23867k0;

    public boolean f23868l0;
    public jg.a m0;

    public CharSequence f23869n;

    public mg.d f23870n0;

    public AnimatorSet f23871o0;

    public ArrayList f23872p0;

    public HashMap f23873q0;

    public CharSequence f23874r;

    public l0 f23875s;
    public AnimatorSet v;

    public View f23876w;

    public final ri0 f23877x;

    public int f23878y;

    public v0(Context context, int i10, int i11, boolean z10) {
        this(context, null, i10, i11, z10, null);
    }

    public static f1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, c6 c6Var) {
        f1 f1Var = new f1(z12 ? 1 : 0, viewGroup.getContext(), c6Var, z10, z11);
        f1Var.g(charSequence, i10, null);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        viewGroup.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        return f1Var;
    }

    public final t0 A(t0 t0Var) {
        if (this.f23872p0 == null) {
            this.f23872p0 = new ArrayList();
        }
        this.f23872p0.add(t0Var);
        if (this.f23873q0 == null) {
            this.f23873q0 = new HashMap();
        }
        this.f23873q0.put(Integer.valueOf(t0Var.f23769b), t0Var);
        return t0Var;
    }

    public final void B(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() == i10) {
            return;
        }
        this.f23854b.setBackgroundColor(i10);
        n1 n1Var = this.d;
        if (n1Var == null || !n1Var.isShowing()) {
            return;
        }
        this.f23854b.invalidate();
    }

    public final void C(pf.e0 e0Var) {
        if (e0Var.h) {
            ArrayList arrayList = this.f23857c0;
            arrayList.remove(e0Var);
            int i10 = this.f23858d0;
            if (i10 < 0 || i10 > arrayList.size() - 1) {
                this.f23858d0 = arrayList.size() - 1;
            }
            y();
            this.f23859e.hideActionMode();
        }
    }

    public final void D() {
        this.N = false;
    }

    public final void E(jg.a aVar, mg.d dVar) {
        this.m0 = aVar;
        this.f23870n0 = dVar;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || aVar == null) {
            return;
        }
        lg.d dVarC = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
        dVarC.n(dVar);
        dVarC.p(AndroidUtilities.dp(12.0f));
        dVarC.o(AndroidUtilities.dp(8.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(dVarC);
    }

    public final void F() {
        if (this.f23856c == null) {
            return;
        }
        this.C = true;
    }

    public final void G(int i10, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
        int childCount = j1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = j1Var.getChildAt(i11);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i10);
            } else if (childAt instanceof f1) {
                if (z10) {
                    ((f1) childAt).setIconColor(i10);
                } else {
                    ((f1) childAt).setTextColor(i10);
                }
            }
        }
    }

    public final void H(CharSequence charSequence, boolean z10) {
        this.f23874r = charSequence;
        if (this.h == null) {
            return;
        }
        this.W = z10;
        this.f23859e.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f23859e.setSelection(charSequence.length());
    }

    public final void I(int i10, boolean z10) {
        if (z10) {
            K(i10);
        } else {
            r(i10);
        }
    }

    public final void J(int i10) {
        K(i10);
    }

    public final void K(int i10) {
        View viewFindViewWithTag;
        HashMap map = this.f23873q0;
        t0 t0Var = map == null ? null : (t0) map.get(Integer.valueOf(i10));
        if (t0Var != null) {
            t0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (viewFindViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || viewFindViewWithTag.getVisibility() == 0) {
            return;
        }
        viewFindViewWithTag.setAlpha(0.0f);
        rl.o(viewFindViewWithTag.animate().alpha(1.0f), er.f28122f, 150L);
        viewFindViewWithTag.setVisibility(0);
    }

    public final boolean L(boolean z10) {
        z zVar;
        ri0 iconView;
        Animator animatorH;
        k();
        e5 e5Var = this.D;
        int i10 = 0;
        if (this.B == null || !(e5Var == null || e5Var.c())) {
            return false;
        }
        e5 e5Var2 = this.D;
        int i11 = 1;
        if (e5Var2 != null && (animatorH = e5Var2.h()) != null) {
            animatorH.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            zVar = this.f23856c;
            if (i12 >= zVar.getChildCount()) {
                break;
            }
            View childAt = zVar.getChildAt(i12);
            if ((childAt instanceof v0) && (iconView = ((v0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i12++;
        }
        Object tag = this.B.getTag();
        Property property = View.ALPHA;
        if (tag == null) {
            this.B.setVisibility(0);
            this.B.setAlpha(0.0f);
            AnimatorSet animatorSet = this.f23871o0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f23871o0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23871o0 = animatorSet2;
            q0 q0Var = this.B;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(q0Var, (Property<q0, Float>) property, q0Var.getAlpha(), 1.0f));
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                this.f23871o0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), (Property<View, Float>) property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
            }
            this.f23871o0.setDuration(150L);
            this.f23871o0.addListener(new n0(this, arrayList, i11));
            this.f23871o0.start();
            setVisibility(8);
            m();
            this.f23859e.setText("");
            this.f23859e.requestFocus();
            if (z10) {
                AndroidUtilities.showKeyboard(this.f23859e);
            }
            this.B.setTag(1);
            e5 e5Var3 = this.D;
            if (e5Var3 != null) {
                e5Var3.n();
            }
            return true;
        }
        this.B.setTag(null);
        AnimatorSet animatorSet3 = this.f23871o0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f23871o0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f23871o0 = animatorSet4;
        q0 q0Var2 = this.B;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(q0Var2, (Property<q0, Float>) property, q0Var2.getAlpha(), 0.0f));
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((View) arrayList.get(i14)).setAlpha(0.0f);
            this.f23871o0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i14), (Property<View, Float>) property, ((View) arrayList.get(i14)).getAlpha(), 1.0f));
        }
        this.f23871o0.setDuration(150L);
        this.f23871o0.addListener(new n0(this, arrayList, i10));
        this.f23871o0.start();
        this.f23859e.clearFocus();
        setVisibility(0);
        ArrayList arrayList2 = this.f23857c0;
        if (!arrayList2.isEmpty() && this.D != null) {
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                if (((pf.e0) arrayList2.get(i15)).h) {
                    this.D.o((pf.e0) arrayList2.get(i15));
                }
            }
        }
        e5 e5Var4 = this.D;
        if (e5Var4 != null) {
            e5Var4.m();
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.f23859e);
        }
        zVar.requestLayout();
        requestLayout();
        return false;
    }

    public final void M(View view, v0 v0Var) {
        float f10;
        FrameLayout frameLayout;
        View view2;
        View childAt;
        k kVar;
        n1 n1Var = this.d;
        c6 c6Var = this.f23865i0;
        View view3 = null;
        if ((n1Var == null || !n1Var.isShowing()) && this.f23872p0 != null) {
            for (int i10 = 0; i10 < this.f23872p0.size(); i10++) {
                t0 t0Var = (t0) this.f23872p0.get(i10);
                t0Var.getClass();
                o();
                View view4 = t0Var.f23774i;
                if (view4 != null) {
                    this.f23854b.addView(view4);
                } else {
                    int i11 = t0Var.f23768a;
                    if (i11 == 0) {
                        f1 f1Var = new f1(0, getContext(), this.f23865i0, false, false);
                        f1Var.g(t0Var.f23771e, t0Var.f23770c, t0Var.d);
                        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        f1Var.setTag(Integer.valueOf(t0Var.f23769b));
                        this.f23854b.addView(f1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        f1Var.setLayoutParams(layoutParams);
                        f1Var.setOnClickListener(new nh.x1(5, t0Var, this));
                        Integer num = t0Var.f23778m;
                        if (num != null && t0Var.f23779n != null) {
                            f1Var.c(num.intValue(), t0Var.f23779n.intValue());
                        }
                        t0Var.f23774i = f1Var;
                    } else if (i11 == 1) {
                        k1 k1Var = new k1(getContext(), g6.H8, c6Var);
                        k1Var.setTag(R.id.fit_width_tag, 1);
                        this.f23854b.a(k1Var, h7.z5.n(-1, 8));
                        t0Var.f23774i = k1Var;
                    } else if (i11 == 2) {
                        f1 f1Var2 = new f1(0, getContext(), this.f23865i0, false, false);
                        f1Var2.g(t0Var.f23771e, t0Var.f23770c, t0Var.d);
                        f1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        f1Var2.setRightIcon(R.drawable.msg_arrowright);
                        f1Var2.getRightIcon().setVisibility(t0Var.f23777l);
                        this.f23854b.addView(f1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) f1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        f1Var2.setLayoutParams(layoutParams2);
                        f1Var2.C = new g0(this, this.f23854b.b(t0Var.f23773g), 1);
                        f1Var2.setOnClickListener(new h0(f1Var2, 1));
                        this.f23854b.f22693c = true;
                        Integer num2 = t0Var.f23778m;
                        if (num2 != null && t0Var.f23779n != null) {
                            f1Var2.c(num2.intValue(), t0Var.f23779n.intValue());
                        }
                        t0Var.f23774i = f1Var2;
                    } else if (i11 == 3) {
                        p80 p80Var = new p80(getContext(), null);
                        p80Var.setTag(R.id.fit_width_tag, 1);
                        p80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        p80Var.setTextSize(1, t0Var.h);
                        p80Var.setTextColor(g6.w0(null, g6.E8, false));
                        p80Var.setMovementMethod(LinkMovementMethod.getInstance());
                        p80Var.setLinkTextColor(g6.w0(null, g6.J6, false));
                        p80Var.setText(t0Var.f23771e);
                        p80Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.f23854b.a(p80Var, h7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        t0Var.f23774i = p80Var;
                    }
                }
                View view5 = t0Var.f23774i;
                if (view5 != null) {
                    view5.setVisibility(t0Var.f23776k);
                    nh nhVar = t0Var.f23775j;
                    if (nhVar != null) {
                        t0Var.f23774i.setOnClickListener(nhVar);
                    }
                }
            }
            f10 = 8.0f;
            this.f23872p0.clear();
        } else {
            f10 = 8.0f;
        }
        if (this.f23854b != null) {
            z zVar = this.f23856c;
            if (zVar == null || !zVar.f23985c || (kVar = zVar.f23984b) == null || kVar.t()) {
                p pVar = this.H;
                if (pVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(pVar);
                    this.H = null;
                }
                n1 n1Var2 = this.d;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.f23864h0 = v0Var;
                s0 s0Var = this.M;
                if (s0Var != null) {
                    s0Var.d();
                }
                if (this.f23854b.getParent() != null) {
                    ((ViewGroup) this.f23854b.getParent()).removeView(this.f23854b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
                if (view != null) {
                    lh.m5 m5Var = new lh.m5(this, getContext(), view);
                    m5Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.f23854b.v ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof f1) || (view instanceof LinearLayout)) {
                        jg.a aVar = this.m0;
                        if (aVar != null) {
                            lg.d dVarC = aVar.c(this.f23854b, null, true);
                            dVarC.n(this.f23870n0);
                            dVarC.p(AndroidUtilities.dp(12.0f));
                            dVarC.o(AndroidUtilities.dp(f10));
                            dVarC.h.f15583e = true;
                            frameLayout.setBackground(dVarC);
                        } else {
                            Drawable drawableMutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            drawableMutate.setColorFilter(new PorterDuffColorFilter(this.f23854b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(drawableMutate);
                        }
                    }
                    frameLayout.addView(view, h7.z5.c(-2.0f, -1));
                    m5Var.addView(frameLayout, h7.z5.n(-1, -2));
                    m5Var.addView(this.f23854b, h7.z5.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f23854b.setTopView(frameLayout);
                    view2 = m5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setTopView(null);
                    frameLayout = null;
                    view2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                }
                if (this.m0 != null) {
                    b70.U(this.f23854b, g6.l1(0.06f, g6.v0(g6.E8, c6Var)));
                }
                n1 n1Var3 = new n1(view2, -2, -2);
                this.d = n1Var3;
                if (this.R) {
                    n1Var3.setAnimationStyle(0);
                } else {
                    n1Var3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z10 = this.R;
                if (!z10) {
                    this.d.f23682b = z10;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.Q) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                view2.setFocusableInTouchMode(true);
                view2.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view6, int i12, KeyEvent keyEvent) {
                        n1 n1Var4;
                        v0 v0Var2 = this.f22871a;
                        v0Var2.getClass();
                        if (i12 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (n1Var4 = v0Var2.d) == null || !n1Var4.isShowing()) {
                            return false;
                        }
                        v0Var2.d.d(true);
                        return true;
                    }
                });
                this.d.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        s0 s0Var2 = this.f22910a.M;
                        if (s0Var2 != null) {
                            s0Var2.c();
                        }
                    }
                });
                view2.measure(rl.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f23854b.getSwipeBack() != null && (childAt = this.f23854b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.P = false;
                this.d.setFocusable(true);
                O(true, view2.getMeasuredWidth() == 0);
                j1 j1Var = this.f23854b.H;
                int childCount = j1Var.getChildCount();
                View view6 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = j1Var.getChildAt(i12);
                    if (childAt2.getVisibility() == 0) {
                        if (view3 == null) {
                            view3 = childAt2;
                        }
                        view6 = childAt2;
                    }
                }
                boolean z11 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = j1Var.getChildAt(i13);
                    if (childAt3.getVisibility() == 0) {
                        Object tag = childAt3.getTag(R.id.object_tag);
                        if (childAt3 instanceof f1) {
                            ((f1) childAt3).j(childAt3 == view3 || z11, childAt3 == view6);
                        }
                        z11 = tag != null;
                    }
                }
                if (this.f23854b.getSwipeBack() != null) {
                    this.f23854b.getSwipeBack().b(false);
                }
                this.d.h();
                float f11 = this.f23862f0;
                if (f11 > 0.0f) {
                    this.d.c(f11);
                }
            }
        }
    }

    public final void N() {
        if (this.f23861f != null) {
            for (int i10 = 0; i10 < this.f23861f.getChildCount(); i10++) {
                if (this.f23861f.getChildAt(i10) instanceof u0) {
                    ((u0) this.f23861f.getChildAt(i10)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
        c6 c6Var = this.f23865i0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.f23854b.getItemsCount(); i11++) {
                if (this.f23854b.H.getChildAt(i11) instanceof f1) {
                    ((f1) this.f23854b.H.getChildAt(i11)).setSelectorColor(g6.v0(g6.I5, c6Var));
                }
            }
        }
        gg.g gVar = this.f23859e;
        if (gVar != null) {
            int i12 = g6.C8;
            gVar.setCursorColor(g6.v0(i12, c6Var));
            this.f23859e.setHintTextColor(g6.v0(g6.D8, c6Var));
            this.f23859e.setTextColor(g6.v0(i12, c6Var));
            this.f23859e.setHighlightColor(g6.v0(g6.f23366uf, c6Var));
            this.f23859e.setHandlesColor(g6.v0(g6.f23382vf, c6Var));
        }
    }

    public final void O(boolean z10, boolean z11) {
        int paddingTop;
        int top;
        ScrollView scrollView;
        z zVar = this.f23856c;
        if (zVar != null) {
            top = zVar.getTop() + (-zVar.f23984b.getMeasuredHeight());
            paddingTop = zVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            paddingTop = -((int) ((getMeasuredHeight() * scaleY) - ((this.I != 2 ? getTranslationY() : 0.0f) / scaleY)));
            top = this.T;
        }
        int i10 = paddingTop + top + this.J;
        if (z10 && (scrollView = this.f23854b.G) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.f23864h0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            k kVar = zVar.f23984b;
            if (this.I == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.K, i10);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.K, i10, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.f23853a0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i10);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i10);
                }
            }
            if (z11) {
                this.d.update(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i10, -1, -1);
                return;
            }
            return;
        }
        int i11 = this.I;
        if (i11 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z10) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i10);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i10, -1, -1);
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.U + this.K, i10);
            }
            if (z11) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.U + this.K, i10, -1, -1);
                return;
            }
            return;
        }
        if (z10) {
            this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i10);
        }
        if (z11) {
            this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i10, -1, -1);
        }
    }

    public final k1 a(int i10) {
        o();
        k1 k1Var = new k1(getContext(), g6.H8, this.f23865i0);
        if (i10 != -1) {
            k1Var.setTag(Integer.valueOf(i10));
        }
        k1Var.setTag(R.id.fit_width_tag, 1);
        this.f23854b.a(k1Var, h7.z5.n(-1, 8));
        return k1Var;
    }

    public final TextView b(int i10) {
        o();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i10);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.f23854b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int iDp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = iDp;
        layoutParams.topMargin = iDp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final f1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, c6 c6Var) {
        o();
        f1 f1Var = new f1(z11 ? 1 : 0, getContext(), c6Var, false, false);
        f1Var.g(charSequence, i11, drawable);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        f1Var.setTag(Integer.valueOf(i10));
        this.f23854b.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        f1Var.setOnClickListener(new jh.a2(2, this, z10));
        return f1Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f23868l0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final f1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.f23865i0);
    }

    public final f1 f(int i10, int i11, String str, c6 c6Var) {
        return d(i10, i11, null, str, true, false, c6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(g6.v0(g6.E8, this.f23865i0));
        textView.setBackgroundDrawable(g6.K0(false));
        if (LocaleController.isRTL) {
            textView.setGravity(21);
        } else {
            textView.setGravity(16);
        }
        textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(AndroidUtilities.dp(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i10));
        textView.setText(charSequence);
        this.f23854b.addView(textView);
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
        ri0 ri0Var = this.f23877x;
        return ri0Var != null ? ri0Var : this.A;
    }

    public ri0 getIconView() {
        return this.f23877x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f23867k0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f23854b == null) {
            o();
        }
        return this.f23854b;
    }

    public ImageView getSearchClearButton() {
        return this.f23875s;
    }

    public FrameLayout getSearchContainer() {
        return this.B;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.f23859e;
    }

    public TextView getTextView() {
        return this.A;
    }

    public int getVisibleSubItemsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f23854b.getItemsCount(); i11++) {
            View childAt = this.f23854b.H.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i10) {
        o();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i10));
        this.f23854b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new b0(this, 1));
        kVar.setBackgroundDrawable(g6.K0(false));
    }

    public final f1 i(int i10, c11 c11Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        f1 f1Var = new f1(0, getContext(), this.f23865i0, false, false);
        f1Var.g(str, i10, c11Var);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        f1Var.setRightIcon(R.drawable.msg_arrowright);
        this.f23854b.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        f1Var.C = new g0(this, this.f23854b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        f1Var.setOnClickListener(new h0(f1Var, 0));
        this.f23854b.f22693c = true;
        return f1Var;
    }

    public final void j() {
        e5 e5Var;
        TextView textView;
        e5 e5Var2;
        if (this.f23875s != null) {
            boolean zP = p();
            final int i10 = 0;
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            final int i11 = 1;
            if (!zP && TextUtils.isEmpty(this.f23859e.getText()) && (((e5Var = this.D) == null || !e5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((e5Var2 = this.D) != null && !e5Var2.r())))) {
                if (this.f23875s.getTag() != null) {
                    this.f23875s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (!this.W) {
                        this.f23875s.setAlpha(0.0f);
                        this.f23875s.setRotation(45.0f);
                        this.f23875s.setScaleX(0.0f);
                        this.f23875s.setScaleY(0.0f);
                        this.f23875s.setVisibility(4);
                        this.W = true;
                        return;
                    }
                    AnimatorSet duration = new AnimatorSet().setDuration(180L);
                    duration.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                        public final v0 f22833b;

                        {
                            this.f22833b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    v0 v0Var = this.f22833b;
                                    v0Var.getClass();
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = v0Var.f23876w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue);
                                    }
                                    break;
                                default:
                                    v0 v0Var2 = this.f22833b;
                                    v0Var2.getClass();
                                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = v0Var2.f23876w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue2);
                                    }
                                    break;
                            }
                        }
                    });
                    duration.playTogether(ObjectAnimator.ofFloat(this.f23875s, (Property<l0, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.f23875s, (Property<l0, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.f23875s, (Property<l0, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f23875s, (Property<l0, Float>) property, 45.0f), valueAnimatorOfFloat);
                    duration.addListener(new m0(this, 0));
                    duration.start();
                    this.v = duration;
                    return;
                }
                return;
            }
            if (this.f23875s.getTag() == null) {
                this.f23875s.setTag(1);
                AnimatorSet animatorSet2 = this.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f23875s.setVisibility(0);
                if (this.W) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                        public final v0 f22833b;

                        {
                            this.f22833b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i11) {
                                case 0:
                                    v0 v0Var = this.f22833b;
                                    v0Var.getClass();
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = v0Var.f23876w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue);
                                    }
                                    break;
                                default:
                                    v0 v0Var2 = this.f22833b;
                                    v0Var2.getClass();
                                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = v0Var2.f23876w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue2);
                                    }
                                    break;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f23875s, (Property<l0, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.f23875s, (Property<l0, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.f23875s, (Property<l0, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f23875s, (Property<l0, Float>) property, 0.0f), valueAnimatorOfFloat2);
                    duration2.addListener(new m0(this, 1));
                    duration2.start();
                    this.v = duration2;
                    return;
                }
                this.f23875s.setAlpha(1.0f);
                this.f23875s.setRotation(0.0f);
                this.f23875s.setScaleX(1.0f);
                this.f23875s.setScaleY(1.0f);
                View view = this.f23876w;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.W = true;
            }
        }
    }

    public final void k() {
        if (this.B == null && this.C) {
            q0 q0Var = new q0(this, getContext(), 0);
            this.B = q0Var;
            q0Var.setClipChildren(this.f23866j0 != 0);
            this.f23852a = null;
            q0 q0Var2 = this.B;
            LinearLayout.LayoutParams layoutParamsM = h7.z5.m(1.0f, 0, -1, this.f23866j0 + 6, 0, 0);
            z zVar = this.f23856c;
            zVar.addView(q0Var2, 0, layoutParamsM);
            this.B.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = g6.C8;
            c6 c6Var = this.f23865i0;
            textView2.setTextColor(g6.v0(i10, c6Var));
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            gg.g gVar = new gg.g(this, getContext(), 3);
            this.f23859e = gVar;
            gVar.setScrollContainer(false);
            this.f23859e.setCursorWidth(1.5f);
            this.f23859e.setCursorColor(g6.v0(i10, c6Var));
            this.f23859e.setTextSize(1, 18.0f);
            this.f23859e.setHintTextColor(g6.v0(g6.D8, c6Var));
            this.f23859e.setTextColor(g6.v0(i10, c6Var));
            this.f23859e.setSingleLine(true);
            this.f23859e.setBackgroundResource(0);
            this.f23859e.setPadding(0, 0, 0, 0);
            this.f23859e.setInputType(this.f23859e.getInputType() | 524288);
            if (Build.VERSION.SDK_INT < 23) {
                this.f23859e.setCustomSelectionActionModeCallback(new j0(0));
            }
            this.f23859e.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                    if (keyEvent == null) {
                        return false;
                    }
                    if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                        return false;
                    }
                    v0 v0Var = this.f22706a;
                    AndroidUtilities.hideKeyboard(v0Var.f23859e);
                    e5 e5Var = v0Var.D;
                    if (e5Var == null) {
                        return false;
                    }
                    e5Var.p(v0Var.f23859e);
                    return false;
                }
            });
            this.f23859e.addTextChangedListener(new k0(this));
            this.f23859e.setImeOptions(234881027);
            this.f23859e.setTextIsSelectable(false);
            this.f23859e.setHighlightColor(g6.v0(g6.f23366uf, c6Var));
            this.f23859e.setHandlesColor(g6.v0(g6.f23382vf, c6Var));
            CharSequence charSequence = this.f23869n;
            if (charSequence != null) {
                this.f23859e.setHint(charSequence);
                setContentDescription(this.f23869n);
            }
            CharSequence charSequence2 = this.f23874r;
            if (charSequence2 != null) {
                this.f23859e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f23861f = linearLayout;
            linearLayout.setOrientation(0);
            this.f23861f.setVisibility(0);
            if (LocaleController.isRTL) {
                this.B.addView(this.f23861f, h7.z5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.f23859e, h7.z5.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.h, h7.z5.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.B.addView(this.h, h7.z5.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.B.addView(this.f23859e, h7.z5.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.f23861f, h7.z5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.f23861f.setClipChildren(false);
            l0 l0Var = new l0(this, getContext(), 0);
            this.f23875s = l0Var;
            lh.c2 c2Var = new lh.c2(1, this);
            this.S = c2Var;
            l0Var.setImageDrawable(c2Var);
            this.f23875s.setBackground(g6.f0(zVar.f23984b.m0, 1, -1));
            this.f23875s.setScaleType(ImageView.ScaleType.CENTER);
            this.f23875s.setAlpha(0.0f);
            this.f23875s.setRotation(45.0f);
            this.f23875s.setScaleX(0.0f);
            this.f23875s.setScaleY(0.0f);
            this.f23875s.setOnClickListener(new b0(this, 0));
            this.f23875s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.B.addView(this.f23875s, h7.z5.e(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f23854b.getItemsCount()) {
                i10 = 8;
                break;
            } else if (this.f23854b.H.getChildAt(i11).getVisibility() == 0) {
                break;
            } else {
                i11++;
            }
        }
        if (i10 != getVisibility()) {
            setVisibility(i10);
        }
    }

    public final void m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23857c0;
            if (i10 >= arrayList.size()) {
                y();
                return;
            }
            if (((pf.e0) arrayList.get(i10)).h) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void n() {
        n1 n1Var = this.d;
        if (n1Var == null || !n1Var.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    public final void o() {
        if (this.f23854b != null) {
            return;
        }
        this.E = new Rect();
        this.F = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.f23865i0);
        this.f23854b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        jg.a aVar = this.m0;
        if (aVar != null) {
            lg.d dVarC = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            dVarC.n(this.f23870n0);
            dVarC.p(AndroidUtilities.dp(12.0f));
            dVarC.o(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(dVarC);
        }
        this.f23854b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                n1 n1Var;
                v0 v0Var = this.f23499a;
                v0Var.getClass();
                if (motionEvent.getActionMasked() != 0 || (n1Var = v0Var.d) == null || !n1Var.isShowing()) {
                    return false;
                }
                view.getHitRect(v0Var.E);
                if (v0Var.E.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                v0Var.d.d(true);
                return false;
            }
        });
        this.f23854b.setDispatchKeyEventListener(new n(this, 2));
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f23877x != null) {
            accessibilityNodeInfo.setClassName("android.widget.ImageButton");
            return;
        }
        TextView textView = this.A;
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
        n1 n1Var = this.d;
        if (n1Var != null && n1Var.isShowing()) {
            O(false, true);
        }
        e5 e5Var = this.D;
        if (e5Var != null) {
            e5Var.l();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.V && q() && ((n1Var3 = this.d) == null || !n1Var3.isShowing())) {
                p pVar = new p(this, 1);
                this.H = pVar;
                AndroidUtilities.runOnUIThread(pVar, 200L);
            }
        } else if (motionEvent.getActionMasked() != 2) {
            n1 n1Var4 = this.d;
            if (n1Var4 != null && n1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.G;
                if (view != null) {
                    view.setSelected(false);
                    z zVar = this.f23856c;
                    if (zVar != null) {
                        zVar.o(((Integer) this.G.getTag()).intValue());
                    } else {
                        r0 r0Var = this.L;
                        if (r0Var != null) {
                            r0Var.h(((Integer) this.G.getTag()).intValue());
                        }
                    }
                    this.d.d(this.N);
                } else if (this.f23855b0) {
                    this.d.d(true);
                }
            } else {
                View view2 = this.G;
                if (view2 != null) {
                    view2.setSelected(false);
                    this.G = null;
                }
            }
        } else if (this.f23855b0 && q() && ((n1Var2 = this.d) == null || !n1Var2.isShowing())) {
            if (motionEvent.getY() > getHeight()) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                M(null, null);
                return true;
            }
        } else if (this.f23855b0 && (n1Var = this.d) != null && n1Var.isShowing()) {
            getLocationOnScreen(this.F);
            float x8 = motionEvent.getX() + this.F[0];
            float y10 = motionEvent.getY();
            int[] iArr = this.F;
            float f10 = y10 + iArr[1];
            this.f23854b.getLocationOnScreen(iArr);
            int[] iArr2 = this.F;
            float f11 = x8 - iArr2[0];
            float f12 = f10 - iArr2[1];
            this.G = null;
            for (int i10 = 0; i10 < this.f23854b.getItemsCount(); i10++) {
                View childAt = this.f23854b.H.getChildAt(i10);
                childAt.getHitRect(this.E);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                    if (this.E.contains((int) f11, (int) f12)) {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(true, false);
                        }
                        childAt.drawableHotspotChanged(f11, f12 - childAt.getTop());
                        this.G = childAt;
                    } else {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(false, false);
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean p() {
        ArrayList arrayList = this.f23857c0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((pf.e0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        if (this.f23854b != null) {
            return true;
        }
        ArrayList arrayList = this.f23872p0;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void r(int i10) {
        View viewFindViewWithTag;
        HashMap map = this.f23873q0;
        t0 t0Var = map == null ? null : (t0) map.get(Integer.valueOf(i10));
        if (t0Var != null) {
            t0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (viewFindViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) == null || viewFindViewWithTag.getVisibility() == 8) {
            return;
        }
        viewFindViewWithTag.setVisibility(8);
    }

    public final boolean s() {
        q0 q0Var = this.B;
        return q0Var != null && q0Var.getVisibility() == 0;
    }

    public void setAdditionalXOffset(int i10) {
        this.U = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.T = i10;
    }

    public void setDelegate(r0 r0Var) {
        this.L = r0Var;
    }

    public void setDimMenu(float f10) {
        this.f23862f0 = f10;
    }

    public void setFitSubItems(boolean z10) {
        this.f23854b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f23868l0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f23853a0 = z10;
    }

    public void setIcon(Drawable drawable) {
        ri0 ri0Var = this.f23877x;
        if (ri0Var == null) {
            return;
        }
        if (drawable instanceof oi0) {
            ri0Var.setAnimation((oi0) drawable);
        } else {
            ri0Var.setImageDrawable(drawable);
        }
        this.f23878y = 0;
    }

    public void setIconColor(int i10) {
        ri0 ri0Var = this.f23877x;
        if (ri0Var != null) {
            ri0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.A;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        l0 l0Var = this.f23875s;
        if (l0Var != null) {
            l0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.Q = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.V = z10;
    }

    public void setMenuXOffset(int i10) {
        this.K = i10;
    }

    public void setMenuYOffset(int i10) {
        this.J = i10;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f23867k0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final Utilities.Callback<Boolean> callback) {
        n1 n1Var = this.d;
        if (n1Var != null) {
            n1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.valueOf(this.f22792a.P));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        n1 n1Var = this.d;
        if (n1Var != null) {
            n1Var.f23682b = z10;
        }
        this.R = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
        int childCount = j1Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = j1Var.getChildAt(i11);
            if (childAt instanceof f1) {
                ((f1) childAt).setSelectorColor(i10);
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.f23876w = view;
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        if (this.h == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.h.setText(charSequence);
        }
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.f23869n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f23859e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i10) {
        this.f23866j0 = i10;
        q0 q0Var = this.B;
        if (q0Var != null) {
            ((ViewGroup.MarginLayoutParams) q0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            this.B.setClipChildren(this.f23866j0 != 0);
            q0 q0Var2 = this.B;
            q0Var2.setLayoutParams(q0Var2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        lh.c2 c2Var = this.S;
        if (c2Var == null) {
            return;
        }
        if (!z10) {
            c2Var.f32851e = false;
            return;
        }
        c2Var.f32851e = true;
        c2Var.f32849b = System.currentTimeMillis();
        c2Var.invalidateSelf();
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f23855b0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(s0 s0Var) {
        this.M = s0Var;
    }

    public void setSubMenuOpenSide(int i10) {
        this.I = i10;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.A;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.f23863g0 = f10;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.f23863g0);
    }

    public void setupPopupRadialSelectors(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i10);
        }
    }

    public final boolean t() {
        n1 n1Var = this.d;
        return n1Var != null && n1Var.isShowing();
    }

    public final t0 u(int i10, int i11, String str) {
        t0 t0Var = new t0(0);
        t0Var.f23769b = i10;
        t0Var.f23770c = i11;
        t0Var.d = null;
        t0Var.f23771e = str;
        t0Var.f23772f = true;
        A(t0Var);
        return t0Var;
    }

    public final void v(oi0 oi0Var, String str) {
        t0 t0Var = new t0(0);
        t0Var.f23769b = 29;
        t0Var.f23770c = 0;
        t0Var.d = oi0Var;
        t0Var.f23771e = str;
        t0Var.f23772f = true;
        A(t0Var);
    }

    public final t0 w(int i10, ao aoVar) {
        t0 t0Var = new t0(2);
        t0Var.f23770c = i10;
        t0Var.d = null;
        t0Var.f23771e = null;
        t0Var.f23773g = aoVar;
        A(t0Var);
        return t0Var;
    }

    public final t0 x() {
        t0 t0Var = new t0(3);
        t0Var.f23771e = "";
        t0Var.h = 13;
        A(t0Var);
        return t0Var;
    }

    public final void y() {
        ArrayList arrayList = this.f23857c0;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        q0 q0Var = this.B;
        if (q0Var != null && q0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new ag.u0(1).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) er.f28123g);
            transitionSet.addListener((Transition.TransitionListener) new o0(this));
            TransitionManager.beginDelayedTransition(this.f23861f, transitionSet);
        }
        if (this.f23861f != null) {
            int i10 = 0;
            while (i10 < this.f23861f.getChildCount()) {
                if (!arrayList2.remove(((u0) this.f23861f.getChildAt(i10)).getFilter())) {
                    this.f23861f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            pf.e0 e0Var = (pf.e0) arrayList2.get(i11);
            e0Var.getClass();
            u0 u0Var = new u0(getContext(), this.f23865i0);
            u0Var.setData(e0Var);
            u0Var.setOnClickListener(new nh.x1(4, this, u0Var));
            this.f23861f.addView(u0Var, h7.z5.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f23861f != null) {
            int i12 = 0;
            while (i12 < this.f23861f.getChildCount()) {
                ((u0) this.f23861f.getChildAt(i12)).setExpanded(i12 == this.f23858d0);
                i12++;
            }
        }
        LinearLayout linearLayout = this.f23861f;
        if (linearLayout != null) {
            linearLayout.setTag(!zIsEmpty ? 1 : null);
        }
        float x8 = this.f23859e.getX();
        if (this.B.getTag() != null) {
            this.f23859e.getViewTreeObserver().addOnPreDrawListener(new p0(this, x8));
        }
        j();
    }

    public final void z(boolean z10) {
        z zVar;
        k();
        q0 q0Var = this.B;
        if (q0Var == null || q0Var.getVisibility() == 0 || (zVar = this.f23856c) == null) {
            return;
        }
        zVar.f23984b.w(L(z10));
    }

    public v0(Context context, z zVar, int i10, int i11) {
        this(context, zVar, i10, i11, false, null);
    }

    public v0(Context context, z zVar, int i10, int i11, boolean z10, c6 c6Var) {
        super(context);
        new ArrayList();
        this.N = true;
        this.R = true;
        this.W = true;
        this.f23855b0 = true;
        this.f23857c0 = new ArrayList();
        this.f23858d0 = -1;
        this.f23860e0 = new AnimationNotificationsLocker();
        this.f23865i0 = c6Var;
        if (i10 != 0) {
            setBackgroundDrawable(g6.f0(i10, z10 ? 5 : 1, -1));
        }
        this.f23856c = zVar;
        if (z10) {
            TextView textView = new TextView(context);
            this.A = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i11 != 0) {
                textView.setTextColor(i11);
            }
            addView(textView, h7.z5.c(-1.0f, -2));
            return;
        }
        ri0 ri0Var = new ri0(context);
        this.f23877x = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.setImportantForAccessibility(2);
        addView(ri0Var, h7.z5.c(-1.0f, -1));
        if (i11 != 0) {
            ri0Var.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        ri0 ri0Var = this.f23877x;
        if (ri0Var == null) {
            return;
        }
        this.f23878y = i10;
        ri0Var.setImageResource(i10);
    }
}
