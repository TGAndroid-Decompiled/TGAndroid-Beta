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
import org.telegram.messenger.vl;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.xh;
public class v0 extends FrameLayout {
    public final TextView E;
    public q0 F;
    public boolean G;
    public g5 H;
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
    public di.j2 W;
    public FrameLayout f21376a;
    public int f21377a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f21378b;
    public int f21379b0;
    public final z f21380c;
    public boolean f21381c0;
    public n1 d;
    public boolean f21382d0;
    public di.h2 f21383e;
    public boolean f21384e0;
    public LinearLayout f21385f;
    public boolean f21386f0;
    public final ArrayList f21387g0;
    public TextView h;
    public int f21388h0;
    public final AnimationNotificationsLocker f21389i0;
    public float f21390j0;
    public float f21391k0;
    public View f21392l0;
    public final f6 m0;
    public CharSequence f21393n;
    public int f21394n0;
    public View.OnClickListener f21395o0;
    public boolean f21396p0;
    public bh.b f21397q0;
    public CharSequence f21398r;
    public eh.e f21399r0;
    public k0 f21400s;
    public AnimatorSet f21401s0;
    public ArrayList f21402t0;
    public HashMap f21403u0;
    public AnimatorSet v;
    public View f21404w;
    public final aj0 f21405x;
    public int f21406y;

    public v0(Context context, int i10, int i11, boolean z10) {
        this(context, null, i10, i11, z10, null);
    }

    public static f1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, f6 f6Var) {
        f1 f1Var = new f1(z12 ? 1 : 0, viewGroup.getContext(), f6Var, z10, z11);
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
        if (this.f21402t0 == null) {
            this.f21402t0 = new ArrayList();
        }
        this.f21402t0.add(t0Var);
        if (this.f21403u0 == null) {
            this.f21403u0 = new HashMap();
        }
        this.f21403u0.put(Integer.valueOf(t0Var.f21335b), t0Var);
        return t0Var;
    }

    public final void B(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21378b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i10) {
            this.f21378b.setBackgroundColor(i10);
            n1 n1Var = this.d;
            if (n1Var != null && n1Var.isShowing()) {
                this.f21378b.invalidate();
            }
        }
    }

    public final void C(hg.q0 q0Var) {
        if (!q0Var.h) {
            return;
        }
        ArrayList arrayList = this.f21387g0;
        arrayList.remove(q0Var);
        int i10 = this.f21388h0;
        if (i10 < 0 || i10 > arrayList.size() - 1) {
            this.f21388h0 = arrayList.size() - 1;
        }
        y();
        this.f21383e.hideActionMode();
    }

    public final void D() {
        this.R = false;
    }

    public final void E(bh.b bVar, eh.e eVar) {
        this.f21397q0 = bVar;
        this.f21399r0 = eVar;
        View view = this.f21378b;
        if (view != null && bVar != null) {
            dh.d c10 = bVar.c(view, null, true);
            c10.n(eVar);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            view.setBackground(c10);
        }
    }

    public final void F() {
        if (this.f21380c == null) {
            return;
        }
        this.G = true;
    }

    public final void G(int i10, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21378b;
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
        this.f21398r = charSequence;
        if (this.h != null) {
            this.f21382d0 = z10;
            this.f21383e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f21383e.setSelection(charSequence.length());
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
        HashMap hashMap = this.f21403u0;
        if (hashMap == null) {
            t0Var = null;
        } else {
            t0Var = (t0) hashMap.get(Integer.valueOf(i10));
        }
        if (t0Var != null) {
            t0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21378b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            vl.q(findViewWithTag.animate().alpha(1.0f), pr.f29466f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public final boolean L(boolean z10) {
        z zVar;
        aj0 iconView;
        Animator h;
        k();
        g5 g5Var = this.H;
        if (this.F == null || (g5Var != null && !g5Var.c())) {
            return false;
        }
        g5 g5Var2 = this.H;
        if (g5Var2 != null && (h = g5Var2.h()) != null) {
            h.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            zVar = this.f21380c;
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
            AnimatorSet animatorSet = this.f21401s0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f21401s0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f21401s0 = animatorSet2;
            q0 q0Var = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(q0Var, property, q0Var.getAlpha(), 0.0f));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((View) arrayList.get(i11)).setAlpha(0.0f);
                this.f21401s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), property, ((View) arrayList.get(i11)).getAlpha(), 1.0f));
            }
            this.f21401s0.setDuration(150L);
            this.f21401s0.addListener(new m0(this, arrayList, 0));
            this.f21401s0.start();
            this.f21383e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f21387g0;
            if (!arrayList2.isEmpty() && this.H != null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((hg.q0) arrayList2.get(i12)).h) {
                        this.H.o((hg.q0) arrayList2.get(i12));
                    }
                }
            }
            g5 g5Var3 = this.H;
            if (g5Var3 != null) {
                g5Var3.m();
            }
            if (z10) {
                AndroidUtilities.hideKeyboard(this.f21383e);
            }
            zVar.requestLayout();
            requestLayout();
            return false;
        }
        this.F.setVisibility(0);
        this.F.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f21401s0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f21401s0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f21401s0 = animatorSet4;
        q0 q0Var2 = this.F;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(q0Var2, property, q0Var2.getAlpha(), 1.0f));
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f21401s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
        }
        this.f21401s0.setDuration(150L);
        this.f21401s0.addListener(new m0(this, arrayList, 1));
        this.f21401s0.start();
        setVisibility(8);
        m();
        this.f21383e.setText("");
        this.f21383e.requestFocus();
        if (z10) {
            AndroidUtilities.showKeyboard(this.f21383e);
        }
        this.F.setTag(1);
        g5 g5Var4 = this.H;
        if (g5Var4 != null) {
            g5Var4.n();
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
        f6 f6Var = this.m0;
        View view2 = null;
        if ((n1Var != null && n1Var.isShowing()) || this.f21402t0 == null) {
            f7 = 8.0f;
        } else {
            for (int i10 = 0; i10 < this.f21402t0.size(); i10++) {
                t0 t0Var = (t0) this.f21402t0.get(i10);
                t0Var.getClass();
                o();
                View view3 = t0Var.f21340i;
                if (view3 != null) {
                    this.f21378b.addView(view3);
                } else {
                    int i11 = t0Var.f21334a;
                    if (i11 == 0) {
                        f1 f1Var = new f1(0, getContext(), this.m0, false, false);
                        f1Var.g(t0Var.f21337e, t0Var.f21336c, t0Var.d);
                        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        f1Var.setTag(Integer.valueOf(t0Var.f21335b));
                        this.f21378b.addView(f1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        f1Var.setLayoutParams(layoutParams);
                        f1Var.setOnClickListener(new bi.u1(17, t0Var, this));
                        Integer num = t0Var.f21344m;
                        if (num != null && t0Var.f21345n != null) {
                            f1Var.c(num.intValue(), t0Var.f21345n.intValue());
                        }
                        t0Var.f21340i = f1Var;
                    } else if (i11 == 1) {
                        k1 k1Var = new k1(getContext(), j6.H8, f6Var);
                        k1Var.setTag(R.id.fit_width_tag, 1);
                        this.f21378b.a(k1Var, w7.x5.n(-1, 8));
                        t0Var.f21340i = k1Var;
                    } else if (i11 == 2) {
                        f1 f1Var2 = new f1(0, getContext(), this.m0, false, false);
                        f1Var2.g(t0Var.f21337e, t0Var.f21336c, t0Var.d);
                        f1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        f1Var2.setRightIcon(R.drawable.msg_arrowright);
                        f1Var2.getRightIcon().setVisibility(t0Var.f21343l);
                        this.f21378b.addView(f1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) f1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        f1Var2.setLayoutParams(layoutParams2);
                        f1Var2.G = new g0(this, this.f21378b.b(t0Var.f21339g), 1);
                        f1Var2.setOnClickListener(new h0(f1Var2, 1));
                        this.f21378b.f20189c = true;
                        Integer num2 = t0Var.f21344m;
                        if (num2 != null && t0Var.f21345n != null) {
                            f1Var2.c(num2.intValue(), t0Var.f21345n.intValue());
                        }
                        t0Var.f21340i = f1Var2;
                    } else if (i11 == 3) {
                        d90 d90Var = new d90(getContext(), null);
                        d90Var.setTag(R.id.fit_width_tag, 1);
                        d90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        d90Var.setTextSize(1, t0Var.h);
                        d90Var.setTextColor(j6.w0(null, j6.E8, false));
                        d90Var.setMovementMethod(LinkMovementMethod.getInstance());
                        d90Var.setLinkTextColor(j6.w0(null, j6.J6, false));
                        d90Var.setText(t0Var.f21337e);
                        d90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.f21378b.a(d90Var, w7.x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        t0Var.f21340i = d90Var;
                    }
                }
                View view4 = t0Var.f21340i;
                if (view4 != null) {
                    view4.setVisibility(t0Var.f21342k);
                    xh xhVar = t0Var.f21341j;
                    if (xhVar != null) {
                        t0Var.f21340i.setOnClickListener(xhVar);
                    }
                }
            }
            f7 = 8.0f;
            this.f21402t0.clear();
        }
        if (this.f21378b != null) {
            z zVar = this.f21380c;
            if (zVar == null || !zVar.f21547c || (kVar = zVar.f21546b) == null || kVar.s()) {
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
                this.f21392l0 = v0Var;
                s0 s0Var = this.Q;
                if (s0Var != null) {
                    s0Var.e();
                }
                if (this.f21378b.getParent() != null) {
                    ((ViewGroup) this.f21378b.getParent()).removeView(this.f21378b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f21378b;
                if (view != null) {
                    ?? x5Var = new di.x5(this, getContext(), view);
                    x5Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout.animate().alpha(1.0f).setDuration(100L);
                    if (this.f21378b.v) {
                        j3 = 165;
                    } else {
                        j3 = 0;
                    }
                    duration.setStartDelay(j3).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof f1) || (view instanceof LinearLayout)) {
                        bh.b bVar = this.f21397q0;
                        if (bVar != null) {
                            dh.d c10 = bVar.c(this.f21378b, null, true);
                            c10.n(this.f21399r0);
                            c10.p(AndroidUtilities.dp(12.0f));
                            c10.o(AndroidUtilities.dp(f7));
                            c10.h.f6821e = true;
                            frameLayout.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f21378b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, w7.x5.c(-2.0f, -1));
                    x5Var.addView(frameLayout, w7.x5.n(-1, -2));
                    x5Var.addView(this.f21378b, w7.x5.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f21378b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = x5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.f21397q0 != null) {
                    n70.U(this.f21378b, j6.l1(0.06f, j6.v0(j6.E8, f6Var)));
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
                    this.d.f21209b = z13;
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
                            s0Var2.d();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(vl.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f21378b.getSwipeBack() != null && (childAt = this.f21378b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
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
                j1 j1Var = this.f21378b.L;
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
                if (this.f21378b.getSwipeBack() != null) {
                    this.f21378b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.f21390j0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void N() {
        if (this.f21385f != null) {
            for (int i10 = 0; i10 < this.f21385f.getChildCount(); i10++) {
                if (this.f21385f.getChildAt(i10) instanceof u0) {
                    ((u0) this.f21385f.getChildAt(i10)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21378b;
        f6 f6Var = this.m0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.f21378b.getItemsCount(); i11++) {
                if (this.f21378b.L.getChildAt(i11) instanceof f1) {
                    ((f1) this.f21378b.L.getChildAt(i11)).setSelectorColor(j6.v0(j6.I5, f6Var));
                }
            }
        }
        di.h2 h2Var = this.f21383e;
        if (h2Var != null) {
            int i12 = j6.C8;
            h2Var.setCursorColor(j6.v0(i12, f6Var));
            this.f21383e.setHintTextColor(j6.v0(j6.D8, f6Var));
            this.f21383e.setTextColor(j6.v0(i12, f6Var));
            this.f21383e.setHighlightColor(j6.v0(j6.f20981uf, f6Var));
            this.f21383e.setHandlesColor(j6.v0(j6.f20998vf, f6Var));
        }
    }

    public final void O(boolean z10, boolean z11) {
        float f7;
        int i10;
        int i11;
        ScrollView scrollView;
        z zVar = this.f21380c;
        if (zVar != null) {
            i11 = zVar.getTop() + (-zVar.f21546b.getMeasuredHeight());
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
            i11 = this.f21377a0;
        }
        int i12 = i10 + i11 + this.N;
        if (z10 && (scrollView = this.f21378b.K) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.f21392l0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            k kVar = zVar.f21546b;
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
                if (this.f21384e0) {
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
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f21379b0 + this.O, i12);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f21379b0 + this.O, i12, -1, -1);
                }
            }
        } else if (i13 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.f21379b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.f21379b0 + this.O, i12, -1, -1);
            }
        } else {
            if (z10) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f21379b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f21379b0 + this.O, i12, -1, -1);
            }
        }
    }

    public final k1 a(int i10) {
        o();
        k1 k1Var = new k1(getContext(), j6.H8, this.m0);
        if (i10 != -1) {
            k1Var.setTag(Integer.valueOf(i10));
        }
        k1Var.setTag(R.id.fit_width_tag, 1);
        this.f21378b.a(k1Var, w7.x5.n(-1, 8));
        return k1Var;
    }

    public final TextView b(int i10) {
        o();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i10);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.f21378b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int dp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = dp;
        layoutParams.topMargin = dp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final f1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, f6 f6Var) {
        o();
        f1 f1Var = new f1(z11 ? 1 : 0, getContext(), f6Var, false, false);
        f1Var.g(charSequence, i11, drawable);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        f1Var.setTag(Integer.valueOf(i10));
        this.f21378b.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        f1Var.setOnClickListener(new bi.w2(2, this, z10));
        return f1Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f21396p0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final f1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.m0);
    }

    public final f1 f(int i10, int i11, String str, f6 f6Var) {
        return d(i10, i11, null, str, true, false, f6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(j6.v0(j6.E8, this.m0));
        textView.setBackgroundDrawable(j6.K0(false));
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
        this.f21378b.addView(textView);
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
        aj0 aj0Var = this.f21405x;
        if (aj0Var != null) {
            return aj0Var;
        }
        return this.E;
    }

    public aj0 getIconView() {
        return this.f21405x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f21395o0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f21378b == null) {
            o();
        }
        return this.f21378b;
    }

    public ImageView getSearchClearButton() {
        return this.f21400s;
    }

    public FrameLayout getSearchContainer() {
        return this.F;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.f21383e;
    }

    public TextView getTextView() {
        return this.E;
    }

    public int getVisibleSubItemsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f21378b.getItemsCount(); i11++) {
            View childAt = this.f21378b.L.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i10) {
        o();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i10));
        this.f21378b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new b0(this, 1));
        kVar.setBackgroundDrawable(j6.K0(false));
    }

    public final f1 i(int i10, u11 u11Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        f1 f1Var = new f1(0, getContext(), this.m0, false, false);
        f1Var.g(str, i10, u11Var);
        f1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        f1Var.setRightIcon(R.drawable.msg_arrowright);
        this.f21378b.addView(f1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        f1Var.setLayoutParams(layoutParams);
        f1Var.G = new g0(this, this.f21378b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        f1Var.setOnClickListener(new h0(f1Var, 0));
        this.f21378b.f20189c = true;
        return f1Var;
    }

    public final void j() {
        g5 g5Var;
        TextView textView;
        g5 g5Var2;
        if (this.f21400s != null) {
            boolean p5 = p();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!p5 && TextUtils.isEmpty(this.f21383e.getText()) && (((g5Var = this.H) == null || !g5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((g5Var2 = this.H) != null && !g5Var2.r())))) {
                if (this.f21400s.getTag() != null) {
                    this.f21400s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.f21382d0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final v0 f20344b;

                            {
                                this.f20344b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        v0 v0Var = this.f20344b;
                                        v0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = v0Var.f21404w;
                                        if (view != null) {
                                            view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        v0 v0Var2 = this.f20344b;
                                        v0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = v0Var2.f21404w;
                                        if (view2 != null) {
                                            view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f21400s, property4, 0.0f), ObjectAnimator.ofFloat(this.f21400s, property3, 0.0f), ObjectAnimator.ofFloat(this.f21400s, property2, 0.0f), ObjectAnimator.ofFloat(this.f21400s, property, 45.0f), ofFloat);
                        duration.addListener(new l0(this, 0));
                        duration.start();
                        this.v = duration;
                        return;
                    }
                    this.f21400s.setAlpha(0.0f);
                    this.f21400s.setRotation(45.0f);
                    this.f21400s.setScaleX(0.0f);
                    this.f21400s.setScaleY(0.0f);
                    this.f21400s.setVisibility(4);
                    this.f21382d0 = true;
                }
            } else if (this.f21400s.getTag() == null) {
                this.f21400s.setTag(1);
                AnimatorSet animatorSet2 = this.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f21400s.setVisibility(0);
                if (this.f21382d0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final v0 f20344b;

                        {
                            this.f20344b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    v0 v0Var = this.f20344b;
                                    v0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = v0Var.f21404w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    v0 v0Var2 = this.f20344b;
                                    v0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = v0Var2.f21404w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f21400s, property4, 1.0f), ObjectAnimator.ofFloat(this.f21400s, property3, 1.0f), ObjectAnimator.ofFloat(this.f21400s, property2, 1.0f), ObjectAnimator.ofFloat(this.f21400s, property, 0.0f), ofFloat2);
                    duration2.addListener(new l0(this, 1));
                    duration2.start();
                    this.v = duration2;
                    return;
                }
                this.f21400s.setAlpha(1.0f);
                this.f21400s.setRotation(0.0f);
                this.f21400s.setScaleX(1.0f);
                this.f21400s.setScaleY(1.0f);
                View view = this.f21404w;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.f21382d0 = true;
            }
        }
    }

    public final void k() {
        boolean z10;
        int i10;
        if (this.F == null && this.G) {
            q0 q0Var = new q0(this, getContext(), 0);
            this.F = q0Var;
            if (this.f21394n0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            q0Var.setClipChildren(z10);
            this.f21376a = null;
            q0 q0Var2 = this.F;
            LinearLayout.LayoutParams m10 = w7.x5.m(1.0f, 0, -1, this.f21394n0 + 6, 0, 0);
            z zVar = this.f21380c;
            zVar.addView(q0Var2, 0, m10);
            this.F.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i11 = j6.C8;
            f6 f6Var = this.m0;
            textView2.setTextColor(j6.v0(i11, f6Var));
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
            di.h2 h2Var = new di.h2(this, getContext(), 2);
            this.f21383e = h2Var;
            h2Var.setScrollContainer(false);
            this.f21383e.setCursorWidth(1.5f);
            this.f21383e.setCursorColor(j6.v0(i11, f6Var));
            this.f21383e.setTextSize(1, 18.0f);
            this.f21383e.setHintTextColor(j6.v0(j6.D8, f6Var));
            this.f21383e.setTextColor(j6.v0(i11, f6Var));
            this.f21383e.setSingleLine(true);
            this.f21383e.setBackgroundResource(0);
            this.f21383e.setPadding(0, 0, 0, 0);
            this.f21383e.setInputType(this.f21383e.getInputType() | 524288);
            if (Build.VERSION.SDK_INT < 23) {
                this.f21383e.setCustomSelectionActionModeCallback(new ji.c1(1));
            }
            this.f21383e.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView4, int i12, KeyEvent keyEvent) {
                    if (keyEvent != null) {
                        if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                            v0 v0Var = v0.this;
                            AndroidUtilities.hideKeyboard(v0Var.f21383e);
                            g5 g5Var = v0Var.H;
                            if (g5Var != null) {
                                g5Var.p(v0Var.f21383e);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            });
            this.f21383e.addTextChangedListener(new j0(this));
            this.f21383e.setImeOptions(234881027);
            this.f21383e.setTextIsSelectable(false);
            this.f21383e.setHighlightColor(j6.v0(j6.f20981uf, f6Var));
            this.f21383e.setHandlesColor(j6.v0(j6.f20998vf, f6Var));
            CharSequence charSequence = this.f21393n;
            if (charSequence != null) {
                this.f21383e.setHint(charSequence);
                setContentDescription(this.f21393n);
            }
            CharSequence charSequence2 = this.f21398r;
            if (charSequence2 != null) {
                this.f21383e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f21385f = linearLayout;
            linearLayout.setOrientation(0);
            this.f21385f.setVisibility(0);
            if (!LocaleController.isRTL) {
                this.F.addView(this.h, w7.x5.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.F.addView(this.f21383e, w7.x5.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f21385f, w7.x5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.F.addView(this.f21385f, w7.x5.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f21383e, w7.x5.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.h, w7.x5.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f21385f.setClipChildren(false);
            k0 k0Var = new k0(this, getContext(), 0);
            this.f21400s = k0Var;
            di.j2 j2Var = new di.j2(1, this);
            this.W = j2Var;
            k0Var.setImageDrawable(j2Var);
            this.f21400s.setBackground(j6.f0(zVar.f21546b.f21109q0, 1, -1));
            this.f21400s.setScaleType(ImageView.ScaleType.CENTER);
            this.f21400s.setAlpha(0.0f);
            this.f21400s.setRotation(45.0f);
            this.f21400s.setScaleX(0.0f);
            this.f21400s.setScaleY(0.0f);
            this.f21400s.setOnClickListener(new b0(this, 0));
            this.f21400s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.F.addView(this.f21400s, w7.x5.e(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < this.f21378b.getItemsCount()) {
                if (this.f21378b.L.getChildAt(i11).getVisibility() == 0) {
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
            ArrayList arrayList = this.f21387g0;
            if (i10 < arrayList.size()) {
                if (((hg.q0) arrayList.get(i10)).h) {
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
        if (this.f21378b != null) {
            return;
        }
        this.I = new Rect();
        this.J = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.m0);
        this.f21378b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        bh.b bVar = this.f21397q0;
        if (bVar != null) {
            dh.d c10 = bVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.n(this.f21399r0);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.f21378b.setOnTouchListener(new View.OnTouchListener() {
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
        this.f21378b.setDispatchKeyEventListener(new n(this, 2));
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f21405x != null) {
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
        g5 g5Var = this.H;
        if (g5Var != null) {
            g5Var.l();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.f21381c0 && q() && ((n1Var3 = this.d) == null || !n1Var3.isShowing())) {
                q qVar = new q(this, 1);
                this.L = qVar;
                AndroidUtilities.runOnUIThread(qVar, 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.f21386f0 && q() && ((n1Var2 = this.d) == null || !n1Var2.isShowing())) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    M(null, null);
                    return true;
                }
            } else if (this.f21386f0 && (n1Var = this.d) != null && n1Var.isShowing()) {
                getLocationOnScreen(this.J);
                float x10 = motionEvent.getX() + this.J[0];
                float y3 = motionEvent.getY();
                int[] iArr = this.J;
                float f7 = y3 + iArr[1];
                this.f21378b.getLocationOnScreen(iArr);
                int[] iArr2 = this.J;
                float f10 = x10 - iArr2[0];
                float f11 = f7 - iArr2[1];
                this.K = null;
                for (int i10 = 0; i10 < this.f21378b.getItemsCount(); i10++) {
                    View childAt = this.f21378b.L.getChildAt(i10);
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
                    z zVar = this.f21380c;
                    if (zVar != null) {
                        zVar.o(((Integer) this.K.getTag()).intValue());
                    } else {
                        r0 r0Var = this.P;
                        if (r0Var != null) {
                            r0Var.m(((Integer) this.K.getTag()).intValue());
                        }
                    }
                    this.d.d(this.R);
                } else if (this.f21386f0) {
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
        ArrayList arrayList = this.f21387g0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((hg.q0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        if (this.f21378b == null) {
            ArrayList arrayList = this.f21402t0;
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
        HashMap hashMap = this.f21403u0;
        if (hashMap == null) {
            t0Var = null;
        } else {
            t0Var = (t0) hashMap.get(Integer.valueOf(i10));
        }
        if (t0Var != null) {
            t0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21378b;
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
        this.f21379b0 = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.f21377a0 = i10;
    }

    public void setDelegate(r0 r0Var) {
        this.P = r0Var;
    }

    public void setDimMenu(float f7) {
        this.f21390j0 = f7;
    }

    public void setFitSubItems(boolean z10) {
        this.f21378b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f21396p0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f21384e0 = z10;
    }

    public void setIcon(Drawable drawable) {
        aj0 aj0Var = this.f21405x;
        if (aj0Var == null) {
            return;
        }
        if (drawable instanceof xi0) {
            aj0Var.setAnimation((xi0) drawable);
        } else {
            aj0Var.setImageDrawable(drawable);
        }
        this.f21406y = 0;
    }

    public void setIconColor(int i10) {
        aj0 aj0Var = this.f21405x;
        if (aj0Var != null) {
            aj0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        k0 k0Var = this.f21400s;
        if (k0Var != null) {
            k0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.U = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.f21381c0 = z10;
    }

    public void setMenuXOffset(int i10) {
        this.O = i10;
    }

    public void setMenuYOffset(int i10) {
        this.N = i10;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21395o0 = onClickListener;
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
            n1Var.f21209b = z10;
        }
        this.V = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21378b;
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
        this.f21404w = view;
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
        this.f21393n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f21383e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i10) {
        boolean z10;
        this.f21394n0 = i10;
        q0 q0Var = this.F;
        if (q0Var != null) {
            ((ViewGroup.MarginLayoutParams) q0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            q0 q0Var2 = this.F;
            if (this.f21394n0 != 0) {
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
        di.j2 j2Var = this.W;
        if (j2Var == null) {
            return;
        }
        if (z10) {
            j2Var.f25749e = true;
            j2Var.f25747b = System.currentTimeMillis();
            j2Var.invalidateSelf();
            return;
        }
        j2Var.f25749e = false;
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f21386f0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21378b;
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
        this.f21391k0 = f7;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7 + this.f21391k0);
    }

    public void setupPopupRadialSelectors(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f21378b;
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
        t0Var.f21335b = i10;
        t0Var.f21336c = i11;
        t0Var.d = null;
        t0Var.f21337e = str;
        t0Var.f21338f = true;
        A(t0Var);
        return t0Var;
    }

    public final void v(xi0 xi0Var, String str) {
        t0 t0Var = new t0(0);
        t0Var.f21335b = 29;
        t0Var.f21336c = 0;
        t0Var.d = xi0Var;
        t0Var.f21337e = str;
        t0Var.f21338f = true;
        A(t0Var);
    }

    public final t0 w(int i10, mo moVar) {
        t0 t0Var = new t0(2);
        t0Var.f21336c = i10;
        t0Var.d = null;
        t0Var.f21337e = null;
        t0Var.f21339g = moVar;
        A(t0Var);
        return t0Var;
    }

    public final t0 x() {
        t0 t0Var = new t0(3);
        t0Var.f21337e = "";
        t0Var.h = 13;
        A(t0Var);
        return t0Var;
    }

    public final void y() {
        Integer num;
        boolean z10;
        ArrayList arrayList = this.f21387g0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new n0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) pr.f29467g);
            transitionSet.addListener((Transition.TransitionListener) new o0(this));
            TransitionManager.beginDelayedTransition(this.f21385f, transitionSet);
        }
        if (this.f21385f != null) {
            int i10 = 0;
            while (i10 < this.f21385f.getChildCount()) {
                if (!arrayList2.remove(((u0) this.f21385f.getChildAt(i10)).getFilter())) {
                    this.f21385f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            hg.q0 q0Var2 = (hg.q0) arrayList2.get(i11);
            q0Var2.getClass();
            u0 u0Var = new u0(getContext(), this.m0);
            u0Var.setData(q0Var2);
            u0Var.setOnClickListener(new bi.u1(16, this, u0Var));
            this.f21385f.addView(u0Var, w7.x5.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f21385f != null) {
            for (int i12 = 0; i12 < this.f21385f.getChildCount(); i12++) {
                u0 u0Var2 = (u0) this.f21385f.getChildAt(i12);
                if (i12 == this.f21388h0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u0Var2.setExpanded(z10);
            }
        }
        LinearLayout linearLayout = this.f21385f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x10 = this.f21383e.getX();
        if (this.F.getTag() != null) {
            this.f21383e.getViewTreeObserver().addOnPreDrawListener(new p0(this, x10));
        }
        j();
    }

    public final void z(boolean z10) {
        z zVar;
        k();
        q0 q0Var = this.F;
        if (q0Var != null && q0Var.getVisibility() != 0 && (zVar = this.f21380c) != null) {
            zVar.f21546b.v(L(z10));
        }
    }

    public v0(Context context, z zVar, int i10, int i11) {
        this(context, zVar, i10, i11, false, null);
    }

    public v0(Context context, z zVar, int i10, int i11, boolean z10, f6 f6Var) {
        super(context);
        new ArrayList();
        this.R = true;
        this.V = true;
        this.f21382d0 = true;
        this.f21386f0 = true;
        this.f21387g0 = new ArrayList();
        this.f21388h0 = -1;
        this.f21389i0 = new AnimationNotificationsLocker();
        this.m0 = f6Var;
        if (i10 != 0) {
            setBackgroundDrawable(j6.f0(i10, z10 ? 5 : 1, -1));
        }
        this.f21380c = zVar;
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
            addView(textView, w7.x5.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f21405x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, w7.x5.c(-1.0f, -1));
        if (i11 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        aj0 aj0Var = this.f21405x;
        if (aj0Var == null) {
            return;
        }
        this.f21406y = i10;
        aj0Var.setImageResource(i10);
    }
}
