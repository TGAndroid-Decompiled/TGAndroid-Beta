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
import org.telegram.messenger.ok;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.t21;
import org.telegram.ui.Components.tr;
import org.telegram.ui.vh;
public class v0 extends FrameLayout {
    public final TextView E;
    public q0 F;
    public boolean G;
    public f5 H;
    public Rect I;
    public int[] J;
    public View K;
    public q L;
    public int M;
    public int N;
    public int O;
    public r0 P;
    public s0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public ci.j2 W;
    public FrameLayout f21568a;
    public int f21569a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f21570b;
    public int f21571b0;
    public final z f21572c;
    public boolean f21573c0;
    public n1 d;
    public boolean f21574d0;
    public ci.h2 f21575e;
    public boolean f21576e0;
    public LinearLayout f21577f;
    public boolean f21578f0;
    public final ArrayList f21579g0;
    public TextView h;
    public int f21580h0;
    public final AnimationNotificationsLocker f21581i0;
    public float f21582j0;
    public float f21583k0;
    public View f21584l0;
    public final d6 m0;
    public CharSequence f21585n;
    public int f21586n0;
    public View.OnClickListener f21587o0;
    public boolean f21588p0;
    public ah.c f21589q0;
    public CharSequence f21590r;
    public dh.e f21591r0;
    public k0 f21592s;
    public AnimatorSet f21593s0;
    public ArrayList f21594t0;
    public HashMap f21595u0;
    public AnimatorSet v;
    public View f21596w;
    public final nj0 f21597x;
    public int f21598y;

    public v0(Context context, int i10, int i11, boolean z10) {
        this(context, null, i10, i11, z10, null);
    }

    public static f1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, d6 d6Var) {
        f1 f1Var = new f1(z12 ? 1 : 0, viewGroup.getContext(), d6Var, z10, z11);
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
        if (this.f21594t0 == null) {
            this.f21594t0 = new ArrayList();
        }
        this.f21594t0.add(t0Var);
        if (this.f21595u0 == null) {
            this.f21595u0 = new HashMap();
        }
        this.f21595u0.put(Integer.valueOf(t0Var.f21505b), t0Var);
        return t0Var;
    }

    public final void B(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21570b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i10) {
            this.f21570b.setBackgroundColor(i10);
            n1 n1Var = this.d;
            if (n1Var != null && n1Var.isShowing()) {
                this.f21570b.invalidate();
            }
        }
    }

    public final void C(gg.q0 q0Var) {
        if (!q0Var.h) {
            return;
        }
        ArrayList arrayList = this.f21579g0;
        arrayList.remove(q0Var);
        int i10 = this.f21580h0;
        if (i10 < 0 || i10 > arrayList.size() - 1) {
            this.f21580h0 = arrayList.size() - 1;
        }
        y();
        this.f21575e.hideActionMode();
    }

    public final void D() {
        this.R = false;
    }

    public final void E(ah.c cVar, dh.e eVar) {
        this.f21589q0 = cVar;
        this.f21591r0 = eVar;
        View view = this.f21570b;
        if (view != null && cVar != null) {
            ch.d c10 = cVar.c(view, null, true);
            c10.x(eVar);
            c10.z(AndroidUtilities.dp(12.0f));
            c10.y(AndroidUtilities.dp(8.0f));
            view.setBackground(c10);
        }
    }

    public final void F() {
        if (this.f21572c == null) {
            return;
        }
        this.G = true;
    }

    public final void G(int i10, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21570b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
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
    }

    public final void H(CharSequence charSequence, boolean z10) {
        this.f21590r = charSequence;
        if (this.h != null) {
            this.f21574d0 = z10;
            this.f21575e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f21575e.setSelection(charSequence.length());
            }
        }
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
        t0 t0Var;
        View findViewWithTag;
        HashMap hashMap = this.f21595u0;
        if (hashMap == null) {
            t0Var = null;
        } else {
            t0Var = (t0) hashMap.get(Integer.valueOf(i10));
        }
        if (t0Var != null) {
            t0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21570b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            ok.s(findViewWithTag.animate().alpha(1.0f), tr.f31140f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public final boolean L(boolean z10) {
        z zVar;
        nj0 iconView;
        Animator h;
        k();
        f5 f5Var = this.H;
        if (this.F == null || (f5Var != null && !f5Var.c())) {
            return false;
        }
        f5 f5Var2 = this.H;
        if (f5Var2 != null && (h = f5Var2.h()) != null) {
            h.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            zVar = this.f21572c;
            if (i10 >= zVar.getChildCount()) {
                break;
            }
            View childAt = zVar.getChildAt(i10);
            if ((childAt instanceof v0) && (iconView = ((v0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i10++;
        }
        Object tag = this.F.getTag();
        Property property = View.ALPHA;
        if (tag != null) {
            this.F.setTag(null);
            AnimatorSet animatorSet = this.f21593s0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f21593s0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f21593s0 = animatorSet2;
            q0 q0Var = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(q0Var, property, q0Var.getAlpha(), 0.0f));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((View) arrayList.get(i11)).setAlpha(0.0f);
                this.f21593s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), property, ((View) arrayList.get(i11)).getAlpha(), 1.0f));
            }
            this.f21593s0.setDuration(150L);
            this.f21593s0.addListener(new m0(this, arrayList, 0));
            this.f21593s0.start();
            this.f21575e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f21579g0;
            if (!arrayList2.isEmpty() && this.H != null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((gg.q0) arrayList2.get(i12)).h) {
                        this.H.o((gg.q0) arrayList2.get(i12));
                    }
                }
            }
            f5 f5Var3 = this.H;
            if (f5Var3 != null) {
                f5Var3.m();
            }
            if (z10) {
                AndroidUtilities.hideKeyboard(this.f21575e);
            }
            zVar.requestLayout();
            requestLayout();
            return false;
        }
        this.F.setVisibility(0);
        this.F.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f21593s0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f21593s0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f21593s0 = animatorSet4;
        q0 q0Var2 = this.F;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(q0Var2, property, q0Var2.getAlpha(), 1.0f));
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f21593s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
        }
        this.f21593s0.setDuration(150L);
        this.f21593s0.addListener(new m0(this, arrayList, 1));
        this.f21593s0.start();
        setVisibility(8);
        m();
        this.f21575e.setText("");
        this.f21575e.requestFocus();
        if (z10) {
            AndroidUtilities.showKeyboard(this.f21575e);
        }
        this.F.setTag(1);
        f5 f5Var4 = this.H;
        if (f5Var4 != null) {
            f5Var4.n();
        }
        return true;
    }

    public final void M(View view, v0 v0Var) {
        float f7;
        FrameLayout frameLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z10;
        boolean z11;
        boolean z12;
        View childAt;
        long j3;
        k kVar;
        n1 n1Var = this.d;
        d6 d6Var = this.m0;
        View view2 = null;
        if ((n1Var != null && n1Var.isShowing()) || this.f21594t0 == null) {
            f7 = 8.0f;
        } else {
            for (int i10 = 0; i10 < this.f21594t0.size(); i10++) {
                t0 t0Var = (t0) this.f21594t0.get(i10);
                t0Var.getClass();
                o();
                View view3 = t0Var.f21510i;
                if (view3 != null) {
                    this.f21570b.addView(view3);
                } else {
                    int i11 = t0Var.f21504a;
                    if (i11 == 0) {
                        f1 f1Var = new f1(0, getContext(), this.m0, false, false);
                        f1Var.g(t0Var.f21507e, t0Var.f21506c, t0Var.d);
                        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        f1Var.setTag(Integer.valueOf(t0Var.f21505b));
                        this.f21570b.addView(f1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        f1Var.setLayoutParams(layoutParams);
                        f1Var.setOnClickListener(new ai.f2(17, t0Var, this));
                        Integer num = t0Var.f21514m;
                        if (num != null && t0Var.f21515n != null) {
                            f1Var.c(num.intValue(), t0Var.f21515n.intValue());
                        }
                        t0Var.f21510i = f1Var;
                    } else if (i11 == 1) {
                        k1 k1Var = new k1(getContext(), i6.H8, d6Var);
                        k1Var.setTag(R.id.fit_width_tag, 1);
                        this.f21570b.a(k1Var, w7.z5.n(-1, 8));
                        t0Var.f21510i = k1Var;
                    } else if (i11 == 2) {
                        f1 f1Var2 = new f1(0, getContext(), this.m0, false, false);
                        f1Var2.g(t0Var.f21507e, t0Var.f21506c, t0Var.d);
                        f1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        f1Var2.setRightIcon(R.drawable.msg_arrowright);
                        f1Var2.getRightIcon().setVisibility(t0Var.f21513l);
                        this.f21570b.addView(f1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) f1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        f1Var2.setLayoutParams(layoutParams2);
                        f1Var2.G = new g0(this, this.f21570b.b(t0Var.f21509g), 1);
                        f1Var2.setOnClickListener(new h0(f1Var2, 1));
                        this.f21570b.f20358c = true;
                        Integer num2 = t0Var.f21514m;
                        if (num2 != null && t0Var.f21515n != null) {
                            f1Var2.c(num2.intValue(), t0Var.f21515n.intValue());
                        }
                        t0Var.f21510i = f1Var2;
                    } else if (i11 == 3) {
                        q90 q90Var = new q90(getContext(), null);
                        q90Var.setTag(R.id.fit_width_tag, 1);
                        q90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        q90Var.setTextSize(1, t0Var.h);
                        q90Var.setTextColor(i6.w0(null, i6.E8, false));
                        q90Var.setMovementMethod(LinkMovementMethod.getInstance());
                        q90Var.setLinkTextColor(i6.w0(null, i6.J6, false));
                        q90Var.setText(t0Var.f21507e);
                        q90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.f21570b.a(q90Var, w7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        t0Var.f21510i = q90Var;
                    }
                }
                View view4 = t0Var.f21510i;
                if (view4 != null) {
                    view4.setVisibility(t0Var.f21512k);
                    vh vhVar = t0Var.f21511j;
                    if (vhVar != null) {
                        t0Var.f21510i.setOnClickListener(vhVar);
                    }
                }
            }
            f7 = 8.0f;
            this.f21594t0.clear();
        }
        if (this.f21570b != null) {
            z zVar = this.f21572c;
            if (zVar == null || !zVar.f21720c || (kVar = zVar.f21719b) == null || kVar.s()) {
                q qVar = this.L;
                if (qVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qVar);
                    this.L = null;
                }
                n1 n1Var2 = this.d;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.f21584l0 = v0Var;
                s0 s0Var = this.Q;
                if (s0Var != null) {
                    s0Var.e();
                }
                if (this.f21570b.getParent() != null) {
                    ((ViewGroup) this.f21570b.getParent()).removeView(this.f21570b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f21570b;
                if (view != null) {
                    ?? w5Var = new ci.w5(this, getContext(), view);
                    w5Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout.animate().alpha(1.0f).setDuration(100L);
                    if (this.f21570b.v) {
                        j3 = 165;
                    } else {
                        j3 = 0;
                    }
                    duration.setStartDelay(j3).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof f1) || (view instanceof LinearLayout)) {
                        ah.c cVar = this.f21589q0;
                        if (cVar != null) {
                            ch.d c10 = cVar.c(this.f21570b, null, true);
                            c10.x(this.f21591r0);
                            c10.z(AndroidUtilities.dp(12.0f));
                            c10.y(AndroidUtilities.dp(f7));
                            c10.f4632l.f4616e = true;
                            frameLayout.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f21570b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, w7.z5.c(-2.0f, -1));
                    w5Var.addView(frameLayout, w7.z5.n(-1, -2));
                    w5Var.addView(this.f21570b, w7.z5.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f21570b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = w5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.f21589q0 != null) {
                    b80.U(this.f21570b, i6.l1(0.06f, i6.v0(i6.E8, d6Var)));
                }
                n1 n1Var3 = new n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = n1Var3;
                if (this.V) {
                    n1Var3.setAnimationStyle(0);
                } else {
                    n1Var3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z13 = this.V;
                if (!z13) {
                    this.d.f21406b = z13;
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
                    public final boolean onKey(View view5, int i12, KeyEvent keyEvent) {
                        n1 n1Var4;
                        v0 v0Var2 = v0.this;
                        v0Var2.getClass();
                        if (i12 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (n1Var4 = v0Var2.d) != null && n1Var4.isShowing()) {
                            v0Var2.d.d(true);
                            return true;
                        }
                        return false;
                    }
                });
                this.d.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        s0 s0Var2 = v0.this.Q;
                        if (s0Var2 != null) {
                            s0Var2.c();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(ok.c(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f21570b.getSwipeBack() != null && (childAt = this.f21570b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.T = false;
                this.d.setFocusable(true);
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                O(true, z10);
                j1 j1Var = this.f21570b.L;
                int childCount = j1Var.getChildCount();
                View view5 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = j1Var.getChildAt(i12);
                    if (childAt2.getVisibility() == 0) {
                        if (view2 == null) {
                            view2 = childAt2;
                        }
                        view5 = childAt2;
                    }
                }
                boolean z14 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = j1Var.getChildAt(i13);
                    if (childAt3.getVisibility() == 0) {
                        Object tag = childAt3.getTag(R.id.object_tag);
                        if (childAt3 instanceof f1) {
                            f1 f1Var3 = (f1) childAt3;
                            if (childAt3 != view2 && !z14) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (childAt3 == view5) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            f1Var3.j(z11, z12);
                        }
                        if (tag != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                }
                if (this.f21570b.getSwipeBack() != null) {
                    this.f21570b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.f21582j0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void N() {
        if (this.f21577f != null) {
            for (int i10 = 0; i10 < this.f21577f.getChildCount(); i10++) {
                if (this.f21577f.getChildAt(i10) instanceof u0) {
                    ((u0) this.f21577f.getChildAt(i10)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21570b;
        d6 d6Var = this.m0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.f21570b.getItemsCount(); i11++) {
                if (this.f21570b.L.getChildAt(i11) instanceof f1) {
                    ((f1) this.f21570b.L.getChildAt(i11)).setSelectorColor(i6.v0(i6.I5, d6Var));
                }
            }
        }
        ci.h2 h2Var = this.f21575e;
        if (h2Var != null) {
            int i12 = i6.C8;
            h2Var.setCursorColor(i6.v0(i12, d6Var));
            this.f21575e.setHintTextColor(i6.v0(i6.D8, d6Var));
            this.f21575e.setTextColor(i6.v0(i12, d6Var));
            this.f21575e.setHighlightColor(i6.v0(i6.f21143uf, d6Var));
            this.f21575e.setHandlesColor(i6.v0(i6.f21160vf, d6Var));
        }
    }

    public final void O(boolean z10, boolean z11) {
        float f7;
        int i10;
        int i11;
        ScrollView scrollView;
        z zVar = this.f21572c;
        if (zVar != null) {
            i11 = zVar.getTop() + (-zVar.f21719b.getMeasuredHeight());
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
            i11 = this.f21569a0;
        }
        int i12 = i10 + i11 + this.N;
        if (z10 && (scrollView = this.f21570b.K) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.f21584l0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            k kVar = zVar.f21719b;
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
                if (this.f21576e0) {
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
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f21571b0 + this.O, i12);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f21571b0 + this.O, i12, -1, -1);
                }
            }
        } else if (i13 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.f21571b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.f21571b0 + this.O, i12, -1, -1);
            }
        } else {
            if (z10) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f21571b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f21571b0 + this.O, i12, -1, -1);
            }
        }
    }

    public final k1 a(int i10) {
        o();
        k1 k1Var = new k1(getContext(), i6.H8, this.m0);
        if (i10 != -1) {
            k1Var.setTag(Integer.valueOf(i10));
        }
        k1Var.setTag(R.id.fit_width_tag, 1);
        this.f21570b.a(k1Var, w7.z5.n(-1, 8));
        return k1Var;
    }

    public final TextView b(int i10) {
        o();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i10);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.f21570b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int dp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = dp;
        layoutParams.topMargin = dp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final f1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, d6 d6Var) {
        o();
        f1 f1Var = new f1(z11 ? 1 : 0, getContext(), d6Var, false, false);
        f1Var.g(charSequence, i11, drawable);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        f1Var.setTag(Integer.valueOf(i10));
        this.f21570b.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        f1Var.setOnClickListener(new ai.j3(2, this, z10));
        return f1Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f21588p0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final f1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.m0);
    }

    public final f1 f(int i10, int i11, String str, d6 d6Var) {
        return d(i10, i11, null, str, true, false, d6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(i6.v0(i6.E8, this.m0));
        textView.setBackgroundDrawable(i6.K0(false));
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
        this.f21570b.addView(textView);
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
        nj0 nj0Var = this.f21597x;
        if (nj0Var != null) {
            return nj0Var;
        }
        return this.E;
    }

    public nj0 getIconView() {
        return this.f21597x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f21587o0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f21570b == null) {
            o();
        }
        return this.f21570b;
    }

    public ImageView getSearchClearButton() {
        return this.f21592s;
    }

    public FrameLayout getSearchContainer() {
        return this.F;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.f21575e;
    }

    public TextView getTextView() {
        return this.E;
    }

    public int getVisibleSubItemsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f21570b.getItemsCount(); i11++) {
            View childAt = this.f21570b.L.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i10) {
        o();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i10));
        this.f21570b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new b0(this, 1));
        kVar.setBackgroundDrawable(i6.K0(false));
    }

    public final f1 i(int i10, t21 t21Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        f1 f1Var = new f1(0, getContext(), this.m0, false, false);
        f1Var.g(str, i10, t21Var);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        f1Var.setRightIcon(R.drawable.msg_arrowright);
        this.f21570b.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        f1Var.G = new g0(this, this.f21570b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        f1Var.setOnClickListener(new h0(f1Var, 0));
        this.f21570b.f20358c = true;
        return f1Var;
    }

    public final void j() {
        f5 f5Var;
        TextView textView;
        f5 f5Var2;
        if (this.f21592s != null) {
            boolean p5 = p();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!p5 && TextUtils.isEmpty(this.f21575e.getText()) && (((f5Var = this.H) == null || !f5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((f5Var2 = this.H) != null && !f5Var2.r())))) {
                if (this.f21592s.getTag() != null) {
                    this.f21592s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.f21574d0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final v0 f20509b;

                            {
                                this.f20509b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        v0 v0Var = this.f20509b;
                                        v0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = v0Var.f21596w;
                                        if (view != null) {
                                            view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        v0 v0Var2 = this.f20509b;
                                        v0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = v0Var2.f21596w;
                                        if (view2 != null) {
                                            view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f21592s, property4, 0.0f), ObjectAnimator.ofFloat(this.f21592s, property3, 0.0f), ObjectAnimator.ofFloat(this.f21592s, property2, 0.0f), ObjectAnimator.ofFloat(this.f21592s, property, 45.0f), ofFloat);
                        duration.addListener(new l0(this, 0));
                        duration.start();
                        this.v = duration;
                        return;
                    }
                    this.f21592s.setAlpha(0.0f);
                    this.f21592s.setRotation(45.0f);
                    this.f21592s.setScaleX(0.0f);
                    this.f21592s.setScaleY(0.0f);
                    this.f21592s.setVisibility(4);
                    this.f21574d0 = true;
                }
            } else if (this.f21592s.getTag() == null) {
                this.f21592s.setTag(1);
                AnimatorSet animatorSet2 = this.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f21592s.setVisibility(0);
                if (this.f21574d0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final v0 f20509b;

                        {
                            this.f20509b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    v0 v0Var = this.f20509b;
                                    v0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = v0Var.f21596w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    v0 v0Var2 = this.f20509b;
                                    v0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = v0Var2.f21596w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f21592s, property4, 1.0f), ObjectAnimator.ofFloat(this.f21592s, property3, 1.0f), ObjectAnimator.ofFloat(this.f21592s, property2, 1.0f), ObjectAnimator.ofFloat(this.f21592s, property, 0.0f), ofFloat2);
                    duration2.addListener(new l0(this, 1));
                    duration2.start();
                    this.v = duration2;
                    return;
                }
                this.f21592s.setAlpha(1.0f);
                this.f21592s.setRotation(0.0f);
                this.f21592s.setScaleX(1.0f);
                this.f21592s.setScaleY(1.0f);
                View view = this.f21596w;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.f21574d0 = true;
            }
        }
    }

    public final void k() {
        boolean z10;
        int i10;
        if (this.F == null && this.G) {
            q0 q0Var = new q0(this, getContext(), 0);
            this.F = q0Var;
            if (this.f21586n0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q0Var.setClipChildren(z10);
            this.f21568a = null;
            q0 q0Var2 = this.F;
            LinearLayout.LayoutParams m10 = w7.z5.m(1.0f, 0, -1, this.f21586n0 + 6, 0, 0);
            z zVar = this.f21572c;
            zVar.addView(q0Var2, 0, m10);
            this.F.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i11 = i6.C8;
            d6 d6Var = this.m0;
            textView2.setTextColor(i6.v0(i11, d6Var));
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
            ci.h2 h2Var = new ci.h2(this, getContext(), 2);
            this.f21575e = h2Var;
            h2Var.setScrollContainer(false);
            this.f21575e.setCursorWidth(1.5f);
            this.f21575e.setCursorColor(i6.v0(i11, d6Var));
            this.f21575e.setTextSize(1, 18.0f);
            this.f21575e.setHintTextColor(i6.v0(i6.D8, d6Var));
            this.f21575e.setTextColor(i6.v0(i11, d6Var));
            this.f21575e.setSingleLine(true);
            this.f21575e.setBackgroundResource(0);
            this.f21575e.setPadding(0, 0, 0, 0);
            this.f21575e.setInputType(this.f21575e.getInputType() | 524288);
            if (Build.VERSION.SDK_INT < 23) {
                this.f21575e.setCustomSelectionActionModeCallback(new ii.d1(1));
            }
            this.f21575e.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView4, int i12, KeyEvent keyEvent) {
                    if (keyEvent != null) {
                        if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                            v0 v0Var = v0.this;
                            AndroidUtilities.hideKeyboard(v0Var.f21575e);
                            f5 f5Var = v0Var.H;
                            if (f5Var != null) {
                                f5Var.p(v0Var.f21575e);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            });
            this.f21575e.addTextChangedListener(new j0(this));
            this.f21575e.setImeOptions(234881027);
            this.f21575e.setTextIsSelectable(false);
            this.f21575e.setHighlightColor(i6.v0(i6.f21143uf, d6Var));
            this.f21575e.setHandlesColor(i6.v0(i6.f21160vf, d6Var));
            CharSequence charSequence = this.f21585n;
            if (charSequence != null) {
                this.f21575e.setHint(charSequence);
                setContentDescription(this.f21585n);
            }
            CharSequence charSequence2 = this.f21590r;
            if (charSequence2 != null) {
                this.f21575e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f21577f = linearLayout;
            linearLayout.setOrientation(0);
            this.f21577f.setVisibility(0);
            if (!LocaleController.isRTL) {
                this.F.addView(this.h, w7.z5.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.F.addView(this.f21575e, w7.z5.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f21577f, w7.z5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.F.addView(this.f21577f, w7.z5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f21575e, w7.z5.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.h, w7.z5.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f21577f.setClipChildren(false);
            k0 k0Var = new k0(this, getContext(), 0);
            this.f21592s = k0Var;
            ci.j2 j2Var = new ci.j2(1, this);
            this.W = j2Var;
            k0Var.setImageDrawable(j2Var);
            this.f21592s.setBackground(i6.f0(zVar.f21719b.f21282q0, 1, -1));
            this.f21592s.setScaleType(ImageView.ScaleType.CENTER);
            this.f21592s.setAlpha(0.0f);
            this.f21592s.setRotation(45.0f);
            this.f21592s.setScaleX(0.0f);
            this.f21592s.setScaleY(0.0f);
            this.f21592s.setOnClickListener(new b0(this, 0));
            this.f21592s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.F.addView(this.f21592s, w7.z5.e(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < this.f21570b.getItemsCount()) {
                if (this.f21570b.L.getChildAt(i11).getVisibility() == 0) {
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
            ArrayList arrayList = this.f21579g0;
            if (i10 < arrayList.size()) {
                if (((gg.q0) arrayList.get(i10)).h) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            } else {
                y();
                return;
            }
        }
    }

    public final void n() {
        n1 n1Var = this.d;
        if (n1Var != null && n1Var.isShowing()) {
            this.d.dismiss();
        }
    }

    public final void o() {
        if (this.f21570b != null) {
            return;
        }
        this.I = new Rect();
        this.J = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.m0);
        this.f21570b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ah.c cVar = this.f21589q0;
        if (cVar != null) {
            ch.d c10 = cVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.x(this.f21591r0);
            c10.z(AndroidUtilities.dp(12.0f));
            c10.y(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.f21570b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                n1 n1Var;
                v0 v0Var = v0.this;
                v0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var = v0Var.d) != null && n1Var.isShowing()) {
                    view.getHitRect(v0Var.I);
                    if (!v0Var.I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        v0Var.d.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            }
        });
        this.f21570b.setDispatchKeyEventListener(new p(this, 1));
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f21597x != null) {
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
        n1 n1Var = this.d;
        if (n1Var != null && n1Var.isShowing()) {
            O(false, true);
        }
        f5 f5Var = this.H;
        if (f5Var != null) {
            f5Var.l();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f21573c0 && q() && ((n1Var3 = this.d) == null || !n1Var3.isShowing())) {
                q qVar = new q(this, 1);
                this.L = qVar;
                AndroidUtilities.runOnUIThread(qVar, 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.f21578f0 && q() && ((n1Var2 = this.d) == null || !n1Var2.isShowing())) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    M(null, null);
                    return true;
                }
            } else if (this.f21578f0 && (n1Var = this.d) != null && n1Var.isShowing()) {
                getLocationOnScreen(this.J);
                float x10 = motionEvent.getX() + this.J[0];
                float y3 = motionEvent.getY();
                int[] iArr = this.J;
                float f7 = y3 + iArr[1];
                this.f21570b.getLocationOnScreen(iArr);
                int[] iArr2 = this.J;
                float f10 = x10 - iArr2[0];
                float f11 = f7 - iArr2[1];
                this.K = null;
                for (int i10 = 0; i10 < this.f21570b.getItemsCount(); i10++) {
                    View childAt = this.f21570b.L.getChildAt(i10);
                    childAt.getHitRect(this.I);
                    Object tag = childAt.getTag();
                    if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                        if (!this.I.contains((int) f10, (int) f11)) {
                            childAt.setPressed(false);
                            childAt.setSelected(false);
                            if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                                childAt.getBackground().setVisible(false, false);
                            }
                        } else {
                            childAt.setPressed(true);
                            childAt.setSelected(true);
                            if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                                childAt.getBackground().setVisible(true, false);
                            }
                            childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                            this.K = childAt;
                        }
                    }
                }
            }
        } else {
            n1 n1Var4 = this.d;
            if (n1Var4 != null && n1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.K;
                if (view != null) {
                    view.setSelected(false);
                    z zVar = this.f21572c;
                    if (zVar != null) {
                        zVar.o(((Integer) this.K.getTag()).intValue());
                    } else {
                        r0 r0Var = this.P;
                        if (r0Var != null) {
                            r0Var.m(((Integer) this.K.getTag()).intValue());
                        }
                    }
                    this.d.d(this.R);
                } else if (this.f21578f0) {
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

    public final boolean p() {
        ArrayList arrayList = this.f21579g0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((gg.q0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        if (this.f21570b == null) {
            ArrayList arrayList = this.f21594t0;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void r(int i10) {
        t0 t0Var;
        View findViewWithTag;
        HashMap hashMap = this.f21595u0;
        if (hashMap == null) {
            t0Var = null;
        } else {
            t0Var = (t0) hashMap.get(Integer.valueOf(i10));
        }
        if (t0Var != null) {
            t0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21570b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public final boolean s() {
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void setAdditionalXOffset(int i10) {
        this.f21571b0 = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.f21569a0 = i10;
    }

    public void setDelegate(r0 r0Var) {
        this.P = r0Var;
    }

    public void setDimMenu(float f7) {
        this.f21582j0 = f7;
    }

    public void setFitSubItems(boolean z10) {
        this.f21570b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f21588p0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f21576e0 = z10;
    }

    public void setIcon(Drawable drawable) {
        nj0 nj0Var = this.f21597x;
        if (nj0Var == null) {
            return;
        }
        if (drawable instanceof kj0) {
            nj0Var.setAnimation((kj0) drawable);
        } else {
            nj0Var.setImageDrawable(drawable);
        }
        this.f21598y = 0;
    }

    public void setIconColor(int i10) {
        nj0 nj0Var = this.f21597x;
        if (nj0Var != null) {
            nj0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        k0 k0Var = this.f21592s;
        if (k0Var != null) {
            k0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.U = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.f21573c0 = z10;
    }

    public void setMenuXOffset(int i10) {
        this.O = i10;
    }

    public void setMenuYOffset(int i10) {
        this.N = i10;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21587o0 = onClickListener;
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
                        callback2.run(Boolean.valueOf(v0.this.T));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        n1 n1Var = this.d;
        if (n1Var != null) {
            n1Var.f21406b = z10;
        }
        this.V = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21570b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
            int childCount = j1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = j1Var.getChildAt(i11);
                if (childAt instanceof f1) {
                    ((f1) childAt).setSelectorColor(i10);
                }
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.f21596w = view;
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
        this.f21585n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f21575e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i10) {
        boolean z10;
        this.f21586n0 = i10;
        q0 q0Var = this.F;
        if (q0Var != null) {
            ((ViewGroup.MarginLayoutParams) q0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            q0 q0Var2 = this.F;
            if (this.f21586n0 != 0) {
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
        ci.j2 j2Var = this.W;
        if (j2Var == null) {
            return;
        }
        if (z10) {
            j2Var.f27457e = true;
            j2Var.f27455b = System.currentTimeMillis();
            j2Var.invalidateSelf();
            return;
        }
        j2Var.f27457e = false;
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f21578f0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21570b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(s0 s0Var) {
        this.Q = s0Var;
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
        this.f21583k0 = f7;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7 + this.f21583k0);
    }

    public void setupPopupRadialSelectors(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21570b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i10);
        }
    }

    public final boolean t() {
        n1 n1Var = this.d;
        if (n1Var != null && n1Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final t0 u(int i10, int i11, String str) {
        t0 t0Var = new t0(0);
        t0Var.f21505b = i10;
        t0Var.f21506c = i11;
        t0Var.d = null;
        t0Var.f21507e = str;
        t0Var.f21508f = true;
        A(t0Var);
        return t0Var;
    }

    public final void v(kj0 kj0Var, String str) {
        t0 t0Var = new t0(0);
        t0Var.f21505b = 29;
        t0Var.f21506c = 0;
        t0Var.d = kj0Var;
        t0Var.f21507e = str;
        t0Var.f21508f = true;
        A(t0Var);
    }

    public final t0 w(int i10, qo qoVar) {
        t0 t0Var = new t0(2);
        t0Var.f21506c = i10;
        t0Var.d = null;
        t0Var.f21507e = null;
        t0Var.f21509g = qoVar;
        A(t0Var);
        return t0Var;
    }

    public final t0 x() {
        t0 t0Var = new t0(3);
        t0Var.f21507e = "";
        t0Var.h = 13;
        A(t0Var);
        return t0Var;
    }

    public final void y() {
        Integer num;
        boolean z10;
        ArrayList arrayList = this.f21579g0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new n0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) tr.f31141g);
            transitionSet.addListener((Transition.TransitionListener) new o0(this));
            TransitionManager.beginDelayedTransition(this.f21577f, transitionSet);
        }
        if (this.f21577f != null) {
            int i10 = 0;
            while (i10 < this.f21577f.getChildCount()) {
                if (!arrayList2.remove(((u0) this.f21577f.getChildAt(i10)).getFilter())) {
                    this.f21577f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            gg.q0 q0Var2 = (gg.q0) arrayList2.get(i11);
            q0Var2.getClass();
            u0 u0Var = new u0(getContext(), this.m0);
            u0Var.setData(q0Var2);
            u0Var.setOnClickListener(new ai.f2(16, this, u0Var));
            this.f21577f.addView(u0Var, w7.z5.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f21577f != null) {
            for (int i12 = 0; i12 < this.f21577f.getChildCount(); i12++) {
                u0 u0Var2 = (u0) this.f21577f.getChildAt(i12);
                if (i12 == this.f21580h0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u0Var2.setExpanded(z10);
            }
        }
        LinearLayout linearLayout = this.f21577f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x10 = this.f21575e.getX();
        if (this.F.getTag() != null) {
            this.f21575e.getViewTreeObserver().addOnPreDrawListener(new p0(this, x10));
        }
        j();
    }

    public final void z(boolean z10) {
        z zVar;
        k();
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getVisibility() != 0 && (zVar = this.f21572c) != null) {
            zVar.f21719b.v(L(z10));
        }
    }

    public v0(Context context, z zVar, int i10, int i11) {
        this(context, zVar, i10, i11, false, null);
    }

    public v0(Context context, z zVar, int i10, int i11, boolean z10, d6 d6Var) {
        super(context);
        new ArrayList();
        this.R = true;
        this.V = true;
        this.f21574d0 = true;
        this.f21578f0 = true;
        this.f21579g0 = new ArrayList();
        this.f21580h0 = -1;
        this.f21581i0 = new AnimationNotificationsLocker();
        this.m0 = d6Var;
        if (i10 != 0) {
            setBackgroundDrawable(i6.f0(i10, z10 ? 5 : 1, -1));
        }
        this.f21572c = zVar;
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
            addView(textView, w7.z5.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f21597x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, w7.z5.c(-1.0f, -1));
        if (i11 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        nj0 nj0Var = this.f21597x;
        if (nj0Var == null) {
            return;
        }
        this.f21598y = i10;
        nj0Var.setImageResource(i10);
    }
}
