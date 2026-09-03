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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.x11;
import org.telegram.ui.qh;
public class w0 extends FrameLayout {
    public final TextView B;
    public r0 C;
    public boolean D;
    public i5 E;
    public Rect F;
    public int[] G;
    public View H;
    public p I;
    public int J;
    public int K;
    public int L;
    public s0 M;
    public t0 N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public m0 T;
    public int U;
    public int V;
    public boolean W;
    public FrameLayout f22344a;
    public boolean f22345a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f22346b;
    public boolean f22347b0;
    public final z f22348c;
    public boolean f22349c0;
    public p1 d;
    public final ArrayList f22350d0;
    public lg.f f22351e;
    public int f22352e0;
    public LinearLayout f22353f;
    public final AnimationNotificationsLocker f22354f0;
    public float f22355g0;
    public TextView h;
    public float f22356h0;
    public View f22357i0;
    public final g6 f22358j0;
    public int f22359k0;
    public View.OnClickListener f22360l0;
    public boolean m0;
    public CharSequence f22361n;
    public og.a f22362n0;
    public rg.d f22363o0;
    public AnimatorSet f22364p0;
    public ArrayList f22365q0;
    public CharSequence f22366r;
    public HashMap f22367r0;
    public l0 f22368s;
    public AnimatorSet v;
    public View f22369w;
    public final kj0 f22370x;
    public int f22371y;

    public w0(Context context, int i10, int i11, boolean z4) {
        this(context, null, i10, i11, z4, null);
    }

    public static g1 c(boolean z4, boolean z10, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z11, g6 g6Var) {
        g1 g1Var = new g1(z11 ? 1 : 0, viewGroup.getContext(), g6Var, z4, z10);
        g1Var.g(charSequence, i10, null);
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

    public final u0 A(u0 u0Var) {
        if (this.f22365q0 == null) {
            this.f22365q0 = new ArrayList();
        }
        this.f22365q0.add(u0Var);
        if (this.f22367r0 == null) {
            this.f22367r0 = new HashMap();
        }
        this.f22367r0.put(Integer.valueOf(u0Var.f22299b), u0Var);
        return u0Var;
    }

    public final void B(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22346b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i10) {
            this.f22346b.setBackgroundColor(i10);
            p1 p1Var = this.d;
            if (p1Var != null && p1Var.isShowing()) {
                this.f22346b.invalidate();
            }
        }
    }

    public final void C(uf.e0 e0Var) {
        if (!e0Var.h) {
            return;
        }
        ArrayList arrayList = this.f22350d0;
        arrayList.remove(e0Var);
        int i10 = this.f22352e0;
        if (i10 < 0 || i10 > arrayList.size() - 1) {
            this.f22352e0 = arrayList.size() - 1;
        }
        y();
        this.f22351e.hideActionMode();
    }

    public final void D() {
        this.O = false;
    }

    public final void E(og.a aVar, rg.d dVar) {
        this.f22362n0 = aVar;
        this.f22363o0 = dVar;
        View view = this.f22346b;
        if (view != null && aVar != null) {
            qg.b c3 = aVar.c(view, null, true);
            c3.n(dVar);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            view.setBackground(c3);
        }
    }

    public final void F() {
        if (this.f22348c == null) {
            return;
        }
        this.D = true;
    }

    public final void G(int i10, boolean z4) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22346b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
            int childCount = l1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = l1Var.getChildAt(i11);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i10);
                } else if (childAt instanceof g1) {
                    if (z4) {
                        ((g1) childAt).setIconColor(i10);
                    } else {
                        ((g1) childAt).setTextColor(i10);
                    }
                }
            }
        }
    }

    public final void H(CharSequence charSequence, boolean z4) {
        this.f22366r = charSequence;
        if (this.h != null) {
            this.f22345a0 = z4;
            this.f22351e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f22351e.setSelection(charSequence.length());
            }
        }
    }

    public final void I(int i10, boolean z4) {
        if (z4) {
            K(i10);
        } else {
            r(i10);
        }
    }

    public final void J(int i10) {
        K(i10);
    }

    public final void K(int i10) {
        u0 u0Var;
        View findViewWithTag;
        HashMap hashMap = this.f22367r0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i10));
        }
        if (u0Var != null) {
            u0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22346b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            org.telegram.ui.b.p(findViewWithTag.animate().alpha(1.0f), pr.f30168f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public final boolean L(boolean z4) {
        z zVar;
        kj0 iconView;
        Animator h;
        k();
        i5 i5Var = this.E;
        if (this.C == null || (i5Var != null && !i5Var.c())) {
            return false;
        }
        i5 i5Var2 = this.E;
        if (i5Var2 != null && (h = i5Var2.h()) != null) {
            h.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            zVar = this.f22348c;
            if (i10 >= zVar.getChildCount()) {
                break;
            }
            View childAt = zVar.getChildAt(i10);
            if ((childAt instanceof w0) && (iconView = ((w0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i10++;
        }
        Object tag = this.C.getTag();
        Property property = View.ALPHA;
        if (tag != null) {
            this.C.setTag(null);
            AnimatorSet animatorSet = this.f22364p0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f22364p0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f22364p0 = animatorSet2;
            r0 r0Var = this.C;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(r0Var, property, r0Var.getAlpha(), 0.0f));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((View) arrayList.get(i11)).setAlpha(0.0f);
                this.f22364p0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), property, ((View) arrayList.get(i11)).getAlpha(), 1.0f));
            }
            this.f22364p0.setDuration(150L);
            this.f22364p0.addListener(new o0(this, arrayList, 0));
            this.f22364p0.start();
            this.f22351e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f22350d0;
            if (!arrayList2.isEmpty() && this.E != null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((uf.e0) arrayList2.get(i12)).h) {
                        this.E.o((uf.e0) arrayList2.get(i12));
                    }
                }
            }
            i5 i5Var3 = this.E;
            if (i5Var3 != null) {
                i5Var3.m();
            }
            if (z4) {
                AndroidUtilities.hideKeyboard(this.f22351e);
            }
            zVar.requestLayout();
            requestLayout();
            return false;
        }
        this.C.setVisibility(0);
        this.C.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f22364p0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f22364p0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f22364p0 = animatorSet4;
        r0 r0Var2 = this.C;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(r0Var2, property, r0Var2.getAlpha(), 1.0f));
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f22364p0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
        }
        this.f22364p0.setDuration(150L);
        this.f22364p0.addListener(new o0(this, arrayList, 1));
        this.f22364p0.start();
        setVisibility(8);
        m();
        this.f22351e.setText("");
        this.f22351e.requestFocus();
        if (z4) {
            AndroidUtilities.showKeyboard(this.f22351e);
        }
        this.C.setTag(1);
        i5 i5Var4 = this.E;
        if (i5Var4 != null) {
            i5Var4.n();
        }
        return true;
    }

    public final void M(View view, w0 w0Var) {
        float f10;
        FrameLayout frameLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z4;
        boolean z10;
        boolean z11;
        View childAt;
        long j10;
        k kVar;
        p1 p1Var = this.d;
        g6 g6Var = this.f22358j0;
        View view2 = null;
        if ((p1Var != null && p1Var.isShowing()) || this.f22365q0 == null) {
            f10 = 8.0f;
        } else {
            for (int i10 = 0; i10 < this.f22365q0.size(); i10++) {
                u0 u0Var = (u0) this.f22365q0.get(i10);
                u0Var.getClass();
                o();
                View view3 = u0Var.f22304i;
                if (view3 != null) {
                    this.f22346b.addView(view3);
                } else {
                    int i11 = u0Var.f22298a;
                    if (i11 == 0) {
                        g1 g1Var = new g1(0, getContext(), this.f22358j0, false, false);
                        g1Var.g(u0Var.f22301e, u0Var.f22300c, u0Var.d);
                        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var.setTag(Integer.valueOf(u0Var.f22299b));
                        this.f22346b.addView(g1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        g1Var.setLayoutParams(layoutParams);
                        g1Var.setOnClickListener(new org.telegram.messenger.video.g(2, u0Var, this));
                        Integer num = u0Var.f22308m;
                        if (num != null && u0Var.f22309n != null) {
                            g1Var.c(num.intValue(), u0Var.f22309n.intValue());
                        }
                        u0Var.f22304i = g1Var;
                    } else if (i11 == 1) {
                        m1 m1Var = new m1(getContext(), k6.H8, g6Var);
                        m1Var.setTag(R.id.fit_width_tag, 1);
                        this.f22346b.a(m1Var, k7.c6.n(-1, 8));
                        u0Var.f22304i = m1Var;
                    } else if (i11 == 2) {
                        g1 g1Var2 = new g1(0, getContext(), this.f22358j0, false, false);
                        g1Var2.g(u0Var.f22301e, u0Var.f22300c, u0Var.d);
                        g1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var2.setRightIcon(R.drawable.msg_arrowright);
                        g1Var2.getRightIcon().setVisibility(u0Var.f22307l);
                        this.f22346b.addView(g1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) g1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        g1Var2.setLayoutParams(layoutParams2);
                        g1Var2.D = new g0(this, this.f22346b.b(u0Var.f22303g), 1);
                        g1Var2.setOnClickListener(new h0(g1Var2, 1));
                        this.f22346b.f21159c = true;
                        Integer num2 = u0Var.f22308m;
                        if (num2 != null && u0Var.f22309n != null) {
                            g1Var2.c(num2.intValue(), u0Var.f22309n.intValue());
                        }
                        u0Var.f22304i = g1Var2;
                    } else if (i11 == 3) {
                        g90 g90Var = new g90(getContext(), null);
                        g90Var.setTag(R.id.fit_width_tag, 1);
                        g90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        g90Var.setTextSize(1, u0Var.h);
                        g90Var.setTextColor(k6.w0(null, k6.E8, false));
                        g90Var.setMovementMethod(LinkMovementMethod.getInstance());
                        g90Var.setLinkTextColor(k6.w0(null, k6.J6, false));
                        g90Var.setText(u0Var.f22301e);
                        g90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.f22346b.a(g90Var, k7.c6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        u0Var.f22304i = g90Var;
                    }
                }
                View view4 = u0Var.f22304i;
                if (view4 != null) {
                    view4.setVisibility(u0Var.f22306k);
                    qh qhVar = u0Var.f22305j;
                    if (qhVar != null) {
                        u0Var.f22304i.setOnClickListener(qhVar);
                    }
                }
            }
            f10 = 8.0f;
            this.f22365q0.clear();
        }
        if (this.f22346b != null) {
            z zVar = this.f22348c;
            if (zVar == null || !zVar.f22476c || (kVar = zVar.f22475b) == null || kVar.s()) {
                p pVar = this.I;
                if (pVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(pVar);
                    this.I = null;
                }
                p1 p1Var2 = this.d;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.f22357i0 = w0Var;
                t0 t0Var = this.N;
                if (t0Var != null) {
                    t0Var.e();
                }
                if (this.f22346b.getParent() != null) {
                    ((ViewGroup) this.f22346b.getParent()).removeView(this.f22346b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f22346b;
                if (view != null) {
                    ?? i0Var = new eg.i0(this, getContext(), view);
                    i0Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout.animate().alpha(1.0f).setDuration(100L);
                    if (this.f22346b.v) {
                        j10 = 165;
                    } else {
                        j10 = 0;
                    }
                    duration.setStartDelay(j10).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof g1) || (view instanceof LinearLayout)) {
                        og.a aVar = this.f22362n0;
                        if (aVar != null) {
                            qg.b c3 = aVar.c(this.f22346b, null, true);
                            c3.n(this.f22363o0);
                            c3.p(AndroidUtilities.dp(12.0f));
                            c3.o(AndroidUtilities.dp(f10));
                            c3.h.f44870e = true;
                            frameLayout.setBackground(c3);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f22346b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, k7.c6.c(-2.0f, -1));
                    i0Var.addView(frameLayout, k7.c6.n(-1, -2));
                    i0Var.addView(this.f22346b, k7.c6.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f22346b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = i0Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.f22362n0 != null) {
                    q70.U(this.f22346b, k6.l1(0.06f, k6.v0(k6.E8, g6Var)));
                }
                p1 p1Var3 = new p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = p1Var3;
                if (this.S) {
                    p1Var3.setAnimationStyle(0);
                } else {
                    p1Var3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z12 = this.S;
                if (!z12) {
                    this.d.f22218b = z12;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.R) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view5, int i12, KeyEvent keyEvent) {
                        p1 p1Var4;
                        w0 w0Var2 = w0.this;
                        w0Var2.getClass();
                        if (i12 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (p1Var4 = w0Var2.d) != null && p1Var4.isShowing()) {
                            w0Var2.d.d(true);
                            return true;
                        }
                        return false;
                    }
                });
                this.d.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        t0 t0Var2 = w0.this.N;
                        if (t0Var2 != null) {
                            t0Var2.c();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.ui.b.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f22346b.getSwipeBack() != null && (childAt = this.f22346b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.Q = false;
                this.d.setFocusable(true);
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                O(true, z4);
                l1 l1Var = this.f22346b.I;
                int childCount = l1Var.getChildCount();
                View view5 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = l1Var.getChildAt(i12);
                    if (childAt2.getVisibility() == 0) {
                        if (view2 == null) {
                            view2 = childAt2;
                        }
                        view5 = childAt2;
                    }
                }
                boolean z13 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = l1Var.getChildAt(i13);
                    if (childAt3.getVisibility() == 0) {
                        Object tag = childAt3.getTag(R.id.object_tag);
                        if (childAt3 instanceof g1) {
                            g1 g1Var3 = (g1) childAt3;
                            if (childAt3 != view2 && !z13) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (childAt3 == view5) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            g1Var3.j(z10, z11);
                        }
                        if (tag != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                }
                if (this.f22346b.getSwipeBack() != null) {
                    this.f22346b.getSwipeBack().b(false);
                }
                this.d.h();
                float f11 = this.f22355g0;
                if (f11 > 0.0f) {
                    this.d.c(f11);
                }
            }
        }
    }

    public final void N() {
        if (this.f22353f != null) {
            for (int i10 = 0; i10 < this.f22353f.getChildCount(); i10++) {
                if (this.f22353f.getChildAt(i10) instanceof v0) {
                    ((v0) this.f22353f.getChildAt(i10)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22346b;
        g6 g6Var = this.f22358j0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.f22346b.getItemsCount(); i11++) {
                if (this.f22346b.I.getChildAt(i11) instanceof g1) {
                    ((g1) this.f22346b.I.getChildAt(i11)).setSelectorColor(k6.v0(k6.I5, g6Var));
                }
            }
        }
        lg.f fVar = this.f22351e;
        if (fVar != null) {
            int i12 = k6.C8;
            fVar.setCursorColor(k6.v0(i12, g6Var));
            this.f22351e.setHintTextColor(k6.v0(k6.D8, g6Var));
            this.f22351e.setTextColor(k6.v0(i12, g6Var));
            this.f22351e.setHighlightColor(k6.v0(k6.f21972uf, g6Var));
            this.f22351e.setHandlesColor(k6.v0(k6.f21990vf, g6Var));
        }
    }

    public final void O(boolean z4, boolean z10) {
        float f10;
        int i10;
        int i11;
        ScrollView scrollView;
        z zVar = this.f22348c;
        if (zVar != null) {
            i11 = zVar.getTop() + (-zVar.f22475b.getMeasuredHeight());
            i10 = zVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            float measuredHeight = getMeasuredHeight() * scaleY;
            if (this.J != 2) {
                f10 = getTranslationY();
            } else {
                f10 = 0.0f;
            }
            i10 = -((int) (measuredHeight - (f10 / scaleY)));
            i11 = this.U;
        }
        int i12 = i10 + i11 + this.K;
        if (z4 && (scrollView = this.f22346b.H) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.f22357i0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            k kVar = zVar.f22475b;
            if (this.J == 0) {
                if (z4) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.L, i12);
                }
                if (z10) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.L, i12, -1, -1);
                    return;
                }
                return;
            }
            if (z4) {
                if (this.f22347b0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.L, i12);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.L, i12);
                }
            }
            if (z10) {
                this.d.update(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.L, i12, -1, -1);
                return;
            }
            return;
        }
        int i13 = this.J;
        if (i13 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z4) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.V + this.L, i12);
                }
                if (z10) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.V + this.L, i12, -1, -1);
                }
            }
        } else if (i13 == 1) {
            if (z4) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.V + this.L, i12);
            }
            if (z10) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.V + this.L, i12, -1, -1);
            }
        } else {
            if (z4) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.V + this.L, i12);
            }
            if (z10) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.V + this.L, i12, -1, -1);
            }
        }
    }

    public final m1 a(int i10) {
        o();
        m1 m1Var = new m1(getContext(), k6.H8, this.f22358j0);
        if (i10 != -1) {
            m1Var.setTag(Integer.valueOf(i10));
        }
        m1Var.setTag(R.id.fit_width_tag, 1);
        this.f22346b.a(m1Var, k7.c6.n(-1, 8));
        return m1Var;
    }

    public final TextView b(int i10) {
        o();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i10);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.f22346b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int dp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = dp;
        layoutParams.topMargin = dp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final g1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z4, boolean z10, g6 g6Var) {
        o();
        g1 g1Var = new g1(z10 ? 1 : 0, getContext(), g6Var, false, false);
        g1Var.g(charSequence, i11, drawable);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setTag(Integer.valueOf(i10));
        this.f22346b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.setOnClickListener(new oh.b2(2, this, z4));
        return g1Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.m0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final g1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.f22358j0);
    }

    public final g1 f(int i10, int i11, String str, g6 g6Var) {
        return d(i10, i11, null, str, true, false, g6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(k6.v0(k6.E8, this.f22358j0));
        textView.setBackgroundDrawable(k6.K0(false));
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
        this.f22346b.addView(textView);
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
        kj0 kj0Var = this.f22370x;
        if (kj0Var != null) {
            return kj0Var;
        }
        return this.B;
    }

    public kj0 getIconView() {
        return this.f22370x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f22360l0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f22346b == null) {
            o();
        }
        return this.f22346b;
    }

    public ImageView getSearchClearButton() {
        return this.f22368s;
    }

    public FrameLayout getSearchContainer() {
        return this.C;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.f22351e;
    }

    public TextView getTextView() {
        return this.B;
    }

    public int getVisibleSubItemsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f22346b.getItemsCount(); i11++) {
            View childAt = this.f22346b.I.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i10) {
        o();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i10));
        this.f22346b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new b0(this, 1));
        kVar.setBackgroundDrawable(k6.K0(false));
    }

    public final g1 i(int i10, x11 x11Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        g1 g1Var = new g1(0, getContext(), this.f22358j0, false, false);
        g1Var.g(str, i10, x11Var);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setRightIcon(R.drawable.msg_arrowright);
        this.f22346b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.D = new g0(this, this.f22346b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        g1Var.setOnClickListener(new h0(g1Var, 0));
        this.f22346b.f21159c = true;
        return g1Var;
    }

    public final void j() {
        i5 i5Var;
        TextView textView;
        i5 i5Var2;
        if (this.f22368s != null) {
            boolean p10 = p();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!p10 && TextUtils.isEmpty(this.f22351e.getText()) && (((i5Var = this.E) == null || !i5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((i5Var2 = this.E) != null && !i5Var2.r())))) {
                if (this.f22368s.getTag() != null) {
                    this.f22368s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.f22345a0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final w0 f21224b;

                            {
                                this.f21224b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        w0 w0Var = this.f21224b;
                                        w0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = w0Var.f22369w;
                                        if (view != null) {
                                            view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        w0 w0Var2 = this.f21224b;
                                        w0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = w0Var2.f22369w;
                                        if (view2 != null) {
                                            view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f22368s, property4, 0.0f), ObjectAnimator.ofFloat(this.f22368s, property3, 0.0f), ObjectAnimator.ofFloat(this.f22368s, property2, 0.0f), ObjectAnimator.ofFloat(this.f22368s, property, 45.0f), ofFloat);
                        duration.addListener(new n0(this, 0));
                        duration.start();
                        this.v = duration;
                        return;
                    }
                    this.f22368s.setAlpha(0.0f);
                    this.f22368s.setRotation(45.0f);
                    this.f22368s.setScaleX(0.0f);
                    this.f22368s.setScaleY(0.0f);
                    this.f22368s.setVisibility(4);
                    this.f22345a0 = true;
                }
            } else if (this.f22368s.getTag() == null) {
                this.f22368s.setTag(1);
                AnimatorSet animatorSet2 = this.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f22368s.setVisibility(0);
                if (this.f22345a0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final w0 f21224b;

                        {
                            this.f21224b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    w0 w0Var = this.f21224b;
                                    w0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = w0Var.f22369w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    w0 w0Var2 = this.f21224b;
                                    w0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = w0Var2.f22369w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f22368s, property4, 1.0f), ObjectAnimator.ofFloat(this.f22368s, property3, 1.0f), ObjectAnimator.ofFloat(this.f22368s, property2, 1.0f), ObjectAnimator.ofFloat(this.f22368s, property, 0.0f), ofFloat2);
                    duration2.addListener(new n0(this, 1));
                    duration2.start();
                    this.v = duration2;
                    return;
                }
                this.f22368s.setAlpha(1.0f);
                this.f22368s.setRotation(0.0f);
                this.f22368s.setScaleX(1.0f);
                this.f22368s.setScaleY(1.0f);
                View view = this.f22369w;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.f22345a0 = true;
            }
        }
    }

    public final void k() {
        boolean z4;
        int i10;
        if (this.C == null && this.D) {
            r0 r0Var = new r0(this, getContext(), 0);
            this.C = r0Var;
            if (this.f22359k0 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            r0Var.setClipChildren(z4);
            this.f22344a = null;
            r0 r0Var2 = this.C;
            LinearLayout.LayoutParams m9 = k7.c6.m(1.0f, 0, -1, this.f22359k0 + 6, 0, 0);
            z zVar = this.f22348c;
            zVar.addView(r0Var2, 0, m9);
            this.C.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i11 = k6.C8;
            g6 g6Var = this.f22358j0;
            textView2.setTextColor(k6.v0(i11, g6Var));
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
            lg.f fVar = new lg.f(this, getContext(), 1);
            this.f22351e = fVar;
            fVar.setScrollContainer(false);
            this.f22351e.setCursorWidth(1.5f);
            this.f22351e.setCursorColor(k6.v0(i11, g6Var));
            this.f22351e.setTextSize(1, 18.0f);
            this.f22351e.setHintTextColor(k6.v0(k6.D8, g6Var));
            this.f22351e.setTextColor(k6.v0(i11, g6Var));
            this.f22351e.setSingleLine(true);
            this.f22351e.setBackgroundResource(0);
            this.f22351e.setPadding(0, 0, 0, 0);
            this.f22351e.setInputType(this.f22351e.getInputType() | 524288);
            if (Build.VERSION.SDK_INT < 23) {
                this.f22351e.setCustomSelectionActionModeCallback(new j0(0));
            }
            this.f22351e.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView4, int i12, KeyEvent keyEvent) {
                    if (keyEvent != null) {
                        if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                            w0 w0Var = w0.this;
                            AndroidUtilities.hideKeyboard(w0Var.f22351e);
                            i5 i5Var = w0Var.E;
                            if (i5Var != null) {
                                i5Var.p(w0Var.f22351e);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            });
            this.f22351e.addTextChangedListener(new k0(this));
            this.f22351e.setImeOptions(234881027);
            this.f22351e.setTextIsSelectable(false);
            this.f22351e.setHighlightColor(k6.v0(k6.f21972uf, g6Var));
            this.f22351e.setHandlesColor(k6.v0(k6.f21990vf, g6Var));
            CharSequence charSequence = this.f22361n;
            if (charSequence != null) {
                this.f22351e.setHint(charSequence);
                setContentDescription(this.f22361n);
            }
            CharSequence charSequence2 = this.f22366r;
            if (charSequence2 != null) {
                this.f22351e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f22353f = linearLayout;
            linearLayout.setOrientation(0);
            this.f22353f.setVisibility(0);
            if (!LocaleController.isRTL) {
                this.C.addView(this.h, k7.c6.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.C.addView(this.f22351e, k7.c6.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.C.addView(this.f22353f, k7.c6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.C.addView(this.f22353f, k7.c6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.C.addView(this.f22351e, k7.c6.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.C.addView(this.h, k7.c6.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f22353f.setClipChildren(false);
            l0 l0Var = new l0(this, getContext(), 0);
            this.f22368s = l0Var;
            m0 m0Var = new m0(0, this);
            this.T = m0Var;
            l0Var.setImageDrawable(m0Var);
            this.f22368s.setBackground(k6.f0(zVar.f22475b.f21553n0, 1, -1));
            this.f22368s.setScaleType(ImageView.ScaleType.CENTER);
            this.f22368s.setAlpha(0.0f);
            this.f22368s.setRotation(45.0f);
            this.f22368s.setScaleX(0.0f);
            this.f22368s.setScaleY(0.0f);
            this.f22368s.setOnClickListener(new b0(this, 0));
            this.f22368s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.C.addView(this.f22368s, k7.c6.e(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < this.f22346b.getItemsCount()) {
                if (this.f22346b.I.getChildAt(i11).getVisibility() == 0) {
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
            ArrayList arrayList = this.f22350d0;
            if (i10 < arrayList.size()) {
                if (((uf.e0) arrayList.get(i10)).h) {
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
        p1 p1Var = this.d;
        if (p1Var != null && p1Var.isShowing()) {
            this.d.dismiss();
        }
    }

    public final void o() {
        if (this.f22346b != null) {
            return;
        }
        this.F = new Rect();
        this.G = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.f22358j0);
        this.f22346b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        og.a aVar = this.f22362n0;
        if (aVar != null) {
            qg.b c3 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c3.n(this.f22363o0);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c3);
        }
        this.f22346b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                p1 p1Var;
                w0 w0Var = w0.this;
                w0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var = w0Var.d) != null && p1Var.isShowing()) {
                    view.getHitRect(w0Var.F);
                    if (!w0Var.F.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        w0Var.d.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            }
        });
        this.f22346b.setDispatchKeyEventListener(new n(this, 2));
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f22370x != null) {
            accessibilityNodeInfo.setClassName("android.widget.ImageButton");
            return;
        }
        TextView textView = this.B;
        if (textView != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
            if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
                accessibilityNodeInfo.setText(textView.getText());
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        p1 p1Var = this.d;
        if (p1Var != null && p1Var.isShowing()) {
            O(false, true);
        }
        i5 i5Var = this.E;
        if (i5Var != null) {
            i5Var.l();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p1 p1Var;
        p1 p1Var2;
        p1 p1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.W && q() && ((p1Var3 = this.d) == null || !p1Var3.isShowing())) {
                p pVar = new p(this, 1);
                this.I = pVar;
                AndroidUtilities.runOnUIThread(pVar, 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.f22349c0 && q() && ((p1Var2 = this.d) == null || !p1Var2.isShowing())) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    M(null, null);
                    return true;
                }
            } else if (this.f22349c0 && (p1Var = this.d) != null && p1Var.isShowing()) {
                getLocationOnScreen(this.G);
                float x10 = motionEvent.getX() + this.G[0];
                float y10 = motionEvent.getY();
                int[] iArr = this.G;
                float f10 = y10 + iArr[1];
                this.f22346b.getLocationOnScreen(iArr);
                int[] iArr2 = this.G;
                float f11 = x10 - iArr2[0];
                float f12 = f10 - iArr2[1];
                this.H = null;
                for (int i10 = 0; i10 < this.f22346b.getItemsCount(); i10++) {
                    View childAt = this.f22346b.I.getChildAt(i10);
                    childAt.getHitRect(this.F);
                    Object tag = childAt.getTag();
                    if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                        if (!this.F.contains((int) f11, (int) f12)) {
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
                            childAt.drawableHotspotChanged(f11, f12 - childAt.getTop());
                            this.H = childAt;
                        }
                    }
                }
            }
        } else {
            p1 p1Var4 = this.d;
            if (p1Var4 != null && p1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.H;
                if (view != null) {
                    view.setSelected(false);
                    z zVar = this.f22348c;
                    if (zVar != null) {
                        zVar.o(((Integer) this.H.getTag()).intValue());
                    } else {
                        s0 s0Var = this.M;
                        if (s0Var != null) {
                            s0Var.h(((Integer) this.H.getTag()).intValue());
                        }
                    }
                    this.d.d(this.O);
                } else if (this.f22349c0) {
                    this.d.d(true);
                }
            } else {
                View view2 = this.H;
                if (view2 != null) {
                    view2.setSelected(false);
                    this.H = null;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean p() {
        ArrayList arrayList = this.f22350d0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((uf.e0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        if (this.f22346b == null) {
            ArrayList arrayList = this.f22365q0;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void r(int i10) {
        u0 u0Var;
        View findViewWithTag;
        HashMap hashMap = this.f22367r0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i10));
        }
        if (u0Var != null) {
            u0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22346b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public final boolean s() {
        r0 r0Var = this.C;
        if (r0Var != null && r0Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void setAdditionalXOffset(int i10) {
        this.V = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.U = i10;
    }

    public void setDelegate(s0 s0Var) {
        this.M = s0Var;
    }

    public void setDimMenu(float f10) {
        this.f22355g0 = f10;
    }

    public void setFitSubItems(boolean z4) {
        this.f22346b.setFitItems(z4);
    }

    public void setFixBackground(boolean z4) {
        this.m0 = z4;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z4) {
        this.f22347b0 = z4;
    }

    public void setIcon(Drawable drawable) {
        kj0 kj0Var = this.f22370x;
        if (kj0Var == null) {
            return;
        }
        if (drawable instanceof hj0) {
            kj0Var.setAnimation((hj0) drawable);
        } else {
            kj0Var.setImageDrawable(drawable);
        }
        this.f22371y = 0;
    }

    public void setIconColor(int i10) {
        kj0 kj0Var = this.f22370x;
        if (kj0Var != null) {
            kj0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        l0 l0Var = this.f22368s;
        if (l0Var != null) {
            l0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setLayoutInScreen(boolean z4) {
        this.R = z4;
    }

    public void setLongClickEnabled(boolean z4) {
        this.W = z4;
    }

    public void setMenuXOffset(int i10) {
        this.L = i10;
    }

    public void setMenuYOffset(int i10) {
        this.K = i10;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f22360l0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final Utilities.Callback<Boolean> callback) {
        p1 p1Var = this.d;
        if (p1Var != null) {
            p1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.valueOf(w0.this.Q));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z4) {
        p1 p1Var = this.d;
        if (p1Var != null) {
            p1Var.f22218b = z4;
        }
        this.S = z4;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22346b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            l1 l1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.I;
            int childCount = l1Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = l1Var.getChildAt(i11);
                if (childAt instanceof g1) {
                    ((g1) childAt).setSelectorColor(i10);
                }
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.f22369w = view;
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
        this.f22361n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f22351e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i10) {
        boolean z4;
        this.f22359k0 = i10;
        r0 r0Var = this.C;
        if (r0Var != null) {
            ((ViewGroup.MarginLayoutParams) r0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            r0 r0Var2 = this.C;
            if (this.f22359k0 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            r0Var2.setClipChildren(z4);
            r0 r0Var3 = this.C;
            r0Var3.setLayoutParams(r0Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z4) {
        m0 m0Var = this.T;
        if (m0Var == null) {
            return;
        }
        if (z4) {
            m0Var.f26977e = true;
            m0Var.f26975b = System.currentTimeMillis();
            m0Var.invalidateSelf();
            return;
        }
        m0Var.f26977e = false;
    }

    public void setShowSubmenuByMove(boolean z4) {
        this.f22349c0 = z4;
    }

    public void setShowedFromBottom(boolean z4) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22346b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z4);
    }

    public void setSubMenuDelegate(t0 t0Var) {
        this.N = t0Var;
    }

    public void setSubMenuOpenSide(int i10) {
        this.J = i10;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.B;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.f22356h0 = f10;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.f22356h0);
    }

    public void setupPopupRadialSelectors(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f22346b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i10);
        }
    }

    public final boolean t() {
        p1 p1Var = this.d;
        if (p1Var != null && p1Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final u0 u(int i10, int i11, String str) {
        u0 u0Var = new u0(0);
        u0Var.f22299b = i10;
        u0Var.f22300c = i11;
        u0Var.d = null;
        u0Var.f22301e = str;
        u0Var.f22302f = true;
        A(u0Var);
        return u0Var;
    }

    public final void v(hj0 hj0Var, String str) {
        u0 u0Var = new u0(0);
        u0Var.f22299b = 29;
        u0Var.f22300c = 0;
        u0Var.d = hj0Var;
        u0Var.f22301e = str;
        u0Var.f22302f = true;
        A(u0Var);
    }

    public final u0 w(int i10, lo loVar) {
        u0 u0Var = new u0(2);
        u0Var.f22300c = i10;
        u0Var.d = null;
        u0Var.f22301e = null;
        u0Var.f22303g = loVar;
        A(u0Var);
        return u0Var;
    }

    public final u0 x() {
        u0 u0Var = new u0(3);
        u0Var.f22301e = "";
        u0Var.h = 13;
        A(u0Var);
        return u0Var;
    }

    public final void y() {
        Integer num;
        boolean z4;
        ArrayList arrayList = this.f22350d0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        r0 r0Var = this.C;
        if (r0Var != null && r0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new fg.j0(1).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) pr.f30169g);
            transitionSet.addListener((Transition.TransitionListener) new p0(this));
            TransitionManager.beginDelayedTransition(this.f22353f, transitionSet);
        }
        if (this.f22353f != null) {
            int i10 = 0;
            while (i10 < this.f22353f.getChildCount()) {
                if (!arrayList2.remove(((v0) this.f22353f.getChildAt(i10)).getFilter())) {
                    this.f22353f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            uf.e0 e0Var = (uf.e0) arrayList2.get(i11);
            e0Var.getClass();
            v0 v0Var = new v0(getContext(), this.f22358j0);
            v0Var.setData(e0Var);
            v0Var.setOnClickListener(new org.telegram.messenger.video.g(1, this, v0Var));
            this.f22353f.addView(v0Var, k7.c6.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f22353f != null) {
            for (int i12 = 0; i12 < this.f22353f.getChildCount(); i12++) {
                v0 v0Var2 = (v0) this.f22353f.getChildAt(i12);
                if (i12 == this.f22352e0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                v0Var2.setExpanded(z4);
            }
        }
        LinearLayout linearLayout = this.f22353f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x10 = this.f22351e.getX();
        if (this.C.getTag() != null) {
            this.f22351e.getViewTreeObserver().addOnPreDrawListener(new q0(this, x10));
        }
        j();
    }

    public final void z(boolean z4) {
        z zVar;
        k();
        r0 r0Var = this.C;
        if (r0Var != null && r0Var.getVisibility() != 0 && (zVar = this.f22348c) != null) {
            zVar.f22475b.v(L(z4));
        }
    }

    public w0(Context context, z zVar, int i10, int i11) {
        this(context, zVar, i10, i11, false, null);
    }

    public w0(Context context, z zVar, int i10, int i11, boolean z4, g6 g6Var) {
        super(context);
        new ArrayList();
        this.O = true;
        this.S = true;
        this.f22345a0 = true;
        this.f22349c0 = true;
        this.f22350d0 = new ArrayList();
        this.f22352e0 = -1;
        this.f22354f0 = new AnimationNotificationsLocker();
        this.f22358j0 = g6Var;
        if (i10 != 0) {
            setBackgroundDrawable(k6.f0(i10, z4 ? 5 : 1, -1));
        }
        this.f22348c = zVar;
        if (z4) {
            TextView textView = new TextView(context);
            this.B = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i11 != 0) {
                textView.setTextColor(i11);
            }
            addView(textView, k7.c6.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f22370x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, k7.c6.c(-1.0f, -1));
        if (i11 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        kj0 kj0Var = this.f22370x;
        if (kj0Var == null) {
            return;
        }
        this.f22371y = i10;
        kj0Var.setImageResource(i10);
    }
}
