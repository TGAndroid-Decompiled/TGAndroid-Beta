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
import nh.r7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.lh;
public class w0 extends FrameLayout {
    public final TextView A;
    public r0 B;
    public boolean C;
    public e5 D;
    public Rect E;
    public int[] F;
    public View G;
    public q H;
    public int I;
    public int J;
    public int K;
    public s0 L;
    public t0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public nh.b2 S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public FrameLayout f23913a;
    public boolean f23914a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f23915b;
    public boolean f23916b0;
    public final a0 f23917c;
    public final ArrayList f23918c0;
    public o1 d;
    public int f23919d0;
    public ig.f f23920e;
    public final AnimationNotificationsLocker f23921e0;
    public LinearLayout f23922f;
    public float f23923f0;
    public float f23924g0;
    public TextView h;
    public View f23925h0;
    public final c6 f23926i0;
    public int f23927j0;
    public View.OnClickListener f23928k0;
    public boolean f23929l0;
    public lg.a m0;
    public CharSequence f23930n;
    public og.d f23931n0;
    public AnimatorSet f23932o0;
    public ArrayList f23933p0;
    public HashMap f23934q0;
    public CharSequence f23935r;
    public m0 f23936s;
    public AnimatorSet v;
    public View f23937w;
    public final aj0 f23938x;
    public int f23939y;

    public w0(Context context, int i10, int i11, boolean z10) {
        this(context, null, i10, i11, z10, null);
    }

    public static g1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, c6 c6Var) {
        g1 g1Var = new g1(z12 ? 1 : 0, viewGroup.getContext(), c6Var, z10, z11);
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
        if (this.f23933p0 == null) {
            this.f23933p0 = new ArrayList();
        }
        this.f23933p0.add(u0Var);
        if (this.f23934q0 == null) {
            this.f23934q0 = new HashMap();
        }
        this.f23934q0.put(Integer.valueOf(u0Var.f23821b), u0Var);
        return u0Var;
    }

    public final void B(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23915b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i10) {
            this.f23915b.setBackgroundColor(i10);
            o1 o1Var = this.d;
            if (o1Var != null && o1Var.isShowing()) {
                this.f23915b.invalidate();
            }
        }
    }

    public final void C(rf.f0 f0Var) {
        if (!f0Var.h) {
            return;
        }
        ArrayList arrayList = this.f23918c0;
        arrayList.remove(f0Var);
        int i10 = this.f23919d0;
        if (i10 < 0 || i10 > arrayList.size() - 1) {
            this.f23919d0 = arrayList.size() - 1;
        }
        y();
        this.f23920e.hideActionMode();
    }

    public final void D() {
        this.N = false;
    }

    public final void E(lg.a aVar, og.d dVar) {
        this.m0 = aVar;
        this.f23931n0 = dVar;
        View view = this.f23915b;
        if (view != null && aVar != null) {
            ng.d c3 = aVar.c(view, null, true);
            c3.n(dVar);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            view.setBackground(c3);
        }
    }

    public final void F() {
        if (this.f23917c == null) {
            return;
        }
        this.C = true;
    }

    public final void G(int i10, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23915b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
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

    public final void H(CharSequence charSequence, boolean z10) {
        this.f23935r = charSequence;
        if (this.h != null) {
            this.W = z10;
            this.f23920e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f23920e.setSelection(charSequence.length());
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
        u0 u0Var;
        View findViewWithTag;
        HashMap hashMap = this.f23934q0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i10));
        }
        if (u0Var != null) {
            u0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23915b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            org.telegram.ui.b.q(findViewWithTag.animate().alpha(1.0f), jr.f29800f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public final boolean L(boolean z10) {
        a0 a0Var;
        aj0 iconView;
        Animator h;
        k();
        e5 e5Var = this.D;
        if (this.B == null || (e5Var != null && !e5Var.c())) {
            return false;
        }
        e5 e5Var2 = this.D;
        if (e5Var2 != null && (h = e5Var2.h()) != null) {
            h.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            a0Var = this.f23917c;
            if (i10 >= a0Var.getChildCount()) {
                break;
            }
            View childAt = a0Var.getChildAt(i10);
            if ((childAt instanceof w0) && (iconView = ((w0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i10++;
        }
        Object tag = this.B.getTag();
        Property property = View.ALPHA;
        if (tag != null) {
            this.B.setTag(null);
            AnimatorSet animatorSet = this.f23932o0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f23932o0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23932o0 = animatorSet2;
            r0 r0Var = this.B;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(r0Var, property, r0Var.getAlpha(), 0.0f));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((View) arrayList.get(i11)).setAlpha(0.0f);
                this.f23932o0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), property, ((View) arrayList.get(i11)).getAlpha(), 1.0f));
            }
            this.f23932o0.setDuration(150L);
            this.f23932o0.addListener(new o0(this, arrayList, 0));
            this.f23932o0.start();
            this.f23920e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f23918c0;
            if (!arrayList2.isEmpty() && this.D != null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((rf.f0) arrayList2.get(i12)).h) {
                        this.D.o((rf.f0) arrayList2.get(i12));
                    }
                }
            }
            e5 e5Var3 = this.D;
            if (e5Var3 != null) {
                e5Var3.m();
            }
            if (z10) {
                AndroidUtilities.hideKeyboard(this.f23920e);
            }
            a0Var.requestLayout();
            requestLayout();
            return false;
        }
        this.B.setVisibility(0);
        this.B.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f23932o0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f23932o0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f23932o0 = animatorSet4;
        r0 r0Var2 = this.B;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(r0Var2, property, r0Var2.getAlpha(), 1.0f));
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f23932o0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
        }
        this.f23932o0.setDuration(150L);
        this.f23932o0.addListener(new o0(this, arrayList, 1));
        this.f23932o0.start();
        setVisibility(8);
        m();
        this.f23920e.setText("");
        this.f23920e.requestFocus();
        if (z10) {
            AndroidUtilities.showKeyboard(this.f23920e);
        }
        this.B.setTag(1);
        e5 e5Var4 = this.D;
        if (e5Var4 != null) {
            e5Var4.n();
        }
        return true;
    }

    public final void M(View view, w0 w0Var) {
        float f9;
        FrameLayout frameLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z10;
        boolean z11;
        boolean z12;
        View childAt;
        long j10;
        l lVar;
        o1 o1Var = this.d;
        c6 c6Var = this.f23926i0;
        View view2 = null;
        if ((o1Var != null && o1Var.isShowing()) || this.f23933p0 == null) {
            f9 = 8.0f;
        } else {
            for (int i10 = 0; i10 < this.f23933p0.size(); i10++) {
                u0 u0Var = (u0) this.f23933p0.get(i10);
                u0Var.getClass();
                o();
                View view3 = u0Var.f23826i;
                if (view3 != null) {
                    this.f23915b.addView(view3);
                } else {
                    int i11 = u0Var.f23820a;
                    if (i11 == 0) {
                        g1 g1Var = new g1(0, getContext(), this.f23926i0, false, false);
                        g1Var.g(u0Var.f23823e, u0Var.f23822c, u0Var.d);
                        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var.setTag(Integer.valueOf(u0Var.f23821b));
                        this.f23915b.addView(g1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        g1Var.setLayoutParams(layoutParams);
                        g1Var.setOnClickListener(new r7(5, u0Var, this));
                        Integer num = u0Var.f23830m;
                        if (num != null && u0Var.f23831n != null) {
                            g1Var.c(num.intValue(), u0Var.f23831n.intValue());
                        }
                        u0Var.f23826i = g1Var;
                    } else if (i11 == 1) {
                        l1 l1Var = new l1(getContext(), g6.H8, c6Var);
                        l1Var.setTag(R.id.fit_width_tag, 1);
                        this.f23915b.a(l1Var, i7.f6.n(-1, 8));
                        u0Var.f23826i = l1Var;
                    } else if (i11 == 2) {
                        g1 g1Var2 = new g1(0, getContext(), this.f23926i0, false, false);
                        g1Var2.g(u0Var.f23823e, u0Var.f23822c, u0Var.d);
                        g1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var2.setRightIcon(R.drawable.msg_arrowright);
                        g1Var2.getRightIcon().setVisibility(u0Var.f23829l);
                        this.f23915b.addView(g1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) g1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        g1Var2.setLayoutParams(layoutParams2);
                        g1Var2.C = new h0(this, this.f23915b.b(u0Var.f23825g), 1);
                        g1Var2.setOnClickListener(new i0(g1Var2, 1));
                        this.f23915b.f22705c = true;
                        Integer num2 = u0Var.f23830m;
                        if (num2 != null && u0Var.f23831n != null) {
                            g1Var2.c(num2.intValue(), u0Var.f23831n.intValue());
                        }
                        u0Var.f23826i = g1Var2;
                    } else if (i11 == 3) {
                        y80 y80Var = new y80(getContext(), null);
                        y80Var.setTag(R.id.fit_width_tag, 1);
                        y80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        y80Var.setTextSize(1, u0Var.h);
                        y80Var.setTextColor(g6.w0(null, g6.E8, false));
                        y80Var.setMovementMethod(LinkMovementMethod.getInstance());
                        y80Var.setLinkTextColor(g6.w0(null, g6.J6, false));
                        y80Var.setText(u0Var.f23823e);
                        y80Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.f23915b.a(y80Var, i7.f6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        u0Var.f23826i = y80Var;
                    }
                }
                View view4 = u0Var.f23826i;
                if (view4 != null) {
                    view4.setVisibility(u0Var.f23828k);
                    lh lhVar = u0Var.f23827j;
                    if (lhVar != null) {
                        u0Var.f23826i.setOnClickListener(lhVar);
                    }
                }
            }
            f9 = 8.0f;
            this.f23933p0.clear();
        }
        if (this.f23915b != null) {
            a0 a0Var = this.f23917c;
            if (a0Var == null || !a0Var.f22720c || (lVar = a0Var.f22719b) == null || lVar.s()) {
                q qVar = this.H;
                if (qVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qVar);
                    this.H = null;
                }
                o1 o1Var2 = this.d;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.f23925h0 = w0Var;
                t0 t0Var = this.M;
                if (t0Var != null) {
                    t0Var.e();
                }
                if (this.f23915b.getParent() != null) {
                    ((ViewGroup) this.f23915b.getParent()).removeView(this.f23915b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f23915b;
                if (view != null) {
                    ?? l0Var = new bg.l0(this, getContext(), view);
                    l0Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout.animate().alpha(1.0f).setDuration(100L);
                    if (this.f23915b.v) {
                        j10 = 165;
                    } else {
                        j10 = 0;
                    }
                    duration.setStartDelay(j10).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof g1) || (view instanceof LinearLayout)) {
                        lg.a aVar = this.m0;
                        if (aVar != null) {
                            ng.d c3 = aVar.c(this.f23915b, null, true);
                            c3.n(this.f23931n0);
                            c3.p(AndroidUtilities.dp(12.0f));
                            c3.o(AndroidUtilities.dp(f9));
                            c3.h.f17329e = true;
                            frameLayout.setBackground(c3);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f23915b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, i7.f6.c(-2.0f, -1));
                    l0Var.addView(frameLayout, i7.f6.n(-1, -2));
                    l0Var.addView(this.f23915b, i7.f6.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f23915b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = l0Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.m0 != null) {
                    j70.U(this.f23915b, g6.l1(0.06f, g6.v0(g6.E8, c6Var)));
                }
                o1 o1Var3 = new o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = o1Var3;
                if (this.R) {
                    o1Var3.setAnimationStyle(0);
                } else {
                    o1Var3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z13 = this.R;
                if (!z13) {
                    this.d.f23710b = z13;
                }
                this.d.setOutsideTouchable(true);
                this.d.setClippingEnabled(true);
                if (this.Q) {
                    this.d.g();
                }
                this.d.setInputMethodMode(2);
                this.d.setSoftInputMode(0);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setFocusableInTouchMode(true);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view5, int i12, KeyEvent keyEvent) {
                        o1 o1Var4;
                        w0 w0Var2 = w0.this;
                        w0Var2.getClass();
                        if (i12 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (o1Var4 = w0Var2.d) != null && o1Var4.isShowing()) {
                            w0Var2.d.d(true);
                            return true;
                        }
                        return false;
                    }
                });
                this.d.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        t0 t0Var2 = w0.this.M;
                        if (t0Var2 != null) {
                            t0Var2.b();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(org.telegram.ui.b.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f23915b.getSwipeBack() != null && (childAt = this.f23915b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.P = false;
                this.d.setFocusable(true);
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                O(true, z10);
                k1 k1Var = this.f23915b.H;
                int childCount = k1Var.getChildCount();
                View view5 = null;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = k1Var.getChildAt(i12);
                    if (childAt2.getVisibility() == 0) {
                        if (view2 == null) {
                            view2 = childAt2;
                        }
                        view5 = childAt2;
                    }
                }
                boolean z14 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt3 = k1Var.getChildAt(i13);
                    if (childAt3.getVisibility() == 0) {
                        Object tag = childAt3.getTag(R.id.object_tag);
                        if (childAt3 instanceof g1) {
                            g1 g1Var3 = (g1) childAt3;
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
                            g1Var3.j(z11, z12);
                        }
                        if (tag != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                }
                if (this.f23915b.getSwipeBack() != null) {
                    this.f23915b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.f23923f0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void N() {
        if (this.f23922f != null) {
            for (int i10 = 0; i10 < this.f23922f.getChildCount(); i10++) {
                if (this.f23922f.getChildAt(i10) instanceof v0) {
                    ((v0) this.f23922f.getChildAt(i10)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23915b;
        c6 c6Var = this.f23926i0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.f23915b.getItemsCount(); i11++) {
                if (this.f23915b.H.getChildAt(i11) instanceof g1) {
                    ((g1) this.f23915b.H.getChildAt(i11)).setSelectorColor(g6.v0(g6.I5, c6Var));
                }
            }
        }
        ig.f fVar = this.f23920e;
        if (fVar != null) {
            int i12 = g6.C8;
            fVar.setCursorColor(g6.v0(i12, c6Var));
            this.f23920e.setHintTextColor(g6.v0(g6.D8, c6Var));
            this.f23920e.setTextColor(g6.v0(i12, c6Var));
            this.f23920e.setHighlightColor(g6.v0(g6.f23374uf, c6Var));
            this.f23920e.setHandlesColor(g6.v0(g6.f23392vf, c6Var));
        }
    }

    public final void O(boolean z10, boolean z11) {
        float f9;
        int i10;
        int i11;
        ScrollView scrollView;
        a0 a0Var = this.f23917c;
        if (a0Var != null) {
            i11 = a0Var.getTop() + (-a0Var.f22719b.getMeasuredHeight());
            i10 = a0Var.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            float measuredHeight = getMeasuredHeight() * scaleY;
            if (this.I != 2) {
                f9 = getTranslationY();
            } else {
                f9 = 0.0f;
            }
            i10 = -((int) (measuredHeight - (f9 / scaleY)));
            i11 = this.T;
        }
        int i12 = i10 + i11 + this.J;
        if (z10 && (scrollView = this.f23915b.G) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.f23925h0;
        if (view == null) {
            view = this;
        }
        if (a0Var != null) {
            l lVar = a0Var.f22719b;
            if (this.I == 0) {
                if (z10) {
                    this.d.showAsDropDown(lVar, ((view.getMeasuredWidth() + (a0Var.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.K, i12);
                }
                if (z11) {
                    this.d.update(lVar, ((view.getMeasuredWidth() + (a0Var.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.K, i12, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.f23914a0) {
                    this.d.showAtLocation(lVar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i12);
                } else {
                    this.d.showAsDropDown(lVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i12);
                }
            }
            if (z11) {
                this.d.update(lVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i12, -1, -1);
                return;
            }
            return;
        }
        int i13 = this.I;
        if (i13 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z10) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i12);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i12, -1, -1);
                }
            }
        } else if (i13 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.U + this.K, i12);
            }
            if (z11) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.U + this.K, i12, -1, -1);
            }
        } else {
            if (z10) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i12);
            }
            if (z11) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i12, -1, -1);
            }
        }
    }

    public final l1 a(int i10) {
        o();
        l1 l1Var = new l1(getContext(), g6.H8, this.f23926i0);
        if (i10 != -1) {
            l1Var.setTag(Integer.valueOf(i10));
        }
        l1Var.setTag(R.id.fit_width_tag, 1);
        this.f23915b.a(l1Var, i7.f6.n(-1, 8));
        return l1Var;
    }

    public final TextView b(int i10) {
        o();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i10);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.f23915b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int dp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = dp;
        layoutParams.topMargin = dp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final g1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, c6 c6Var) {
        o();
        g1 g1Var = new g1(z11 ? 1 : 0, getContext(), c6Var, false, false);
        g1Var.g(charSequence, i11, drawable);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setTag(Integer.valueOf(i10));
        this.f23915b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.setOnClickListener(new lh.z1(2, this, z10));
        return g1Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f23929l0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final g1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.f23926i0);
    }

    public final g1 f(int i10, int i11, String str, c6 c6Var) {
        return d(i10, i11, null, str, true, false, c6Var);
    }

    public final void g(int i10, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(g6.v0(g6.E8, this.f23926i0));
        textView.setBackgroundDrawable(g6.K0(false));
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
        this.f23915b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new c0(this, 3));
    }

    public View getContentView() {
        aj0 aj0Var = this.f23938x;
        if (aj0Var != null) {
            return aj0Var;
        }
        return this.A;
    }

    public aj0 getIconView() {
        return this.f23938x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f23928k0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f23915b == null) {
            o();
        }
        return this.f23915b;
    }

    public ImageView getSearchClearButton() {
        return this.f23936s;
    }

    public FrameLayout getSearchContainer() {
        return this.B;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.f23920e;
    }

    public TextView getTextView() {
        return this.A;
    }

    public int getVisibleSubItemsCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f23915b.getItemsCount(); i11++) {
            View childAt = this.f23915b.H.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i10) {
        o();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i10));
        this.f23915b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new c0(this, 1));
        kVar.setBackgroundDrawable(g6.K0(false));
    }

    public final g1 i(int i10, m11 m11Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        g1 g1Var = new g1(0, getContext(), this.f23926i0, false, false);
        g1Var.g(str, i10, m11Var);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setRightIcon(R.drawable.msg_arrowright);
        this.f23915b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.C = new h0(this, this.f23915b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        g1Var.setOnClickListener(new i0(g1Var, 0));
        this.f23915b.f22705c = true;
        return g1Var;
    }

    public final void j() {
        e5 e5Var;
        TextView textView;
        e5 e5Var2;
        if (this.f23936s != null) {
            boolean p10 = p();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!p10 && TextUtils.isEmpty(this.f23920e.getText()) && (((e5Var = this.D) == null || !e5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((e5Var2 = this.D) != null && !e5Var2.r())))) {
                if (this.f23936s.getTag() != null) {
                    this.f23936s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.W) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final w0 f22887b;

                            {
                                this.f22887b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        w0 w0Var = this.f22887b;
                                        w0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = w0Var.f23937w;
                                        if (view != null) {
                                            view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        w0 w0Var2 = this.f22887b;
                                        w0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = w0Var2.f23937w;
                                        if (view2 != null) {
                                            view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f23936s, property4, 0.0f), ObjectAnimator.ofFloat(this.f23936s, property3, 0.0f), ObjectAnimator.ofFloat(this.f23936s, property2, 0.0f), ObjectAnimator.ofFloat(this.f23936s, property, 45.0f), ofFloat);
                        duration.addListener(new n0(this, 0));
                        duration.start();
                        this.v = duration;
                        return;
                    }
                    this.f23936s.setAlpha(0.0f);
                    this.f23936s.setRotation(45.0f);
                    this.f23936s.setScaleX(0.0f);
                    this.f23936s.setScaleY(0.0f);
                    this.f23936s.setVisibility(4);
                    this.W = true;
                }
            } else if (this.f23936s.getTag() == null) {
                this.f23936s.setTag(1);
                AnimatorSet animatorSet2 = this.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f23936s.setVisibility(0);
                if (this.W) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final w0 f22887b;

                        {
                            this.f22887b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    w0 w0Var = this.f22887b;
                                    w0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = w0Var.f23937w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    w0 w0Var2 = this.f22887b;
                                    w0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = w0Var2.f23937w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f23936s, property4, 1.0f), ObjectAnimator.ofFloat(this.f23936s, property3, 1.0f), ObjectAnimator.ofFloat(this.f23936s, property2, 1.0f), ObjectAnimator.ofFloat(this.f23936s, property, 0.0f), ofFloat2);
                    duration2.addListener(new n0(this, 1));
                    duration2.start();
                    this.v = duration2;
                    return;
                }
                this.f23936s.setAlpha(1.0f);
                this.f23936s.setRotation(0.0f);
                this.f23936s.setScaleX(1.0f);
                this.f23936s.setScaleY(1.0f);
                View view = this.f23937w;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.W = true;
            }
        }
    }

    public final void k() {
        boolean z10;
        int i10;
        if (this.B == null && this.C) {
            r0 r0Var = new r0(this, getContext(), 0);
            this.B = r0Var;
            if (this.f23927j0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r0Var.setClipChildren(z10);
            this.f23913a = null;
            r0 r0Var2 = this.B;
            LinearLayout.LayoutParams m10 = i7.f6.m(1.0f, 0, -1, this.f23927j0 + 6, 0, 0);
            a0 a0Var = this.f23917c;
            a0Var.addView(r0Var2, 0, m10);
            this.B.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i11 = g6.C8;
            c6 c6Var = this.f23926i0;
            textView2.setTextColor(g6.v0(i11, c6Var));
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
            ig.f fVar = new ig.f(this, getContext(), 3);
            this.f23920e = fVar;
            fVar.setScrollContainer(false);
            this.f23920e.setCursorWidth(1.5f);
            this.f23920e.setCursorColor(g6.v0(i11, c6Var));
            this.f23920e.setTextSize(1, 18.0f);
            this.f23920e.setHintTextColor(g6.v0(g6.D8, c6Var));
            this.f23920e.setTextColor(g6.v0(i11, c6Var));
            this.f23920e.setSingleLine(true);
            this.f23920e.setBackgroundResource(0);
            this.f23920e.setPadding(0, 0, 0, 0);
            this.f23920e.setInputType(this.f23920e.getInputType() | 524288);
            if (Build.VERSION.SDK_INT < 23) {
                this.f23920e.setCustomSelectionActionModeCallback(new k0(0));
            }
            this.f23920e.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView4, int i12, KeyEvent keyEvent) {
                    if (keyEvent != null) {
                        if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                            w0 w0Var = w0.this;
                            AndroidUtilities.hideKeyboard(w0Var.f23920e);
                            e5 e5Var = w0Var.D;
                            if (e5Var != null) {
                                e5Var.p(w0Var.f23920e);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            });
            this.f23920e.addTextChangedListener(new l0(this));
            this.f23920e.setImeOptions(234881027);
            this.f23920e.setTextIsSelectable(false);
            this.f23920e.setHighlightColor(g6.v0(g6.f23374uf, c6Var));
            this.f23920e.setHandlesColor(g6.v0(g6.f23392vf, c6Var));
            CharSequence charSequence = this.f23930n;
            if (charSequence != null) {
                this.f23920e.setHint(charSequence);
                setContentDescription(this.f23930n);
            }
            CharSequence charSequence2 = this.f23935r;
            if (charSequence2 != null) {
                this.f23920e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f23922f = linearLayout;
            linearLayout.setOrientation(0);
            this.f23922f.setVisibility(0);
            if (!LocaleController.isRTL) {
                this.B.addView(this.h, i7.f6.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.B.addView(this.f23920e, i7.f6.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.f23922f, i7.f6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.B.addView(this.f23922f, i7.f6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.f23920e, i7.f6.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.h, i7.f6.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f23922f.setClipChildren(false);
            m0 m0Var = new m0(this, getContext(), 0);
            this.f23936s = m0Var;
            nh.b2 b2Var = new nh.b2(1, this);
            this.S = b2Var;
            m0Var.setImageDrawable(b2Var);
            this.f23936s.setBackground(g6.f0(a0Var.f22719b.m0, 1, -1));
            this.f23936s.setScaleType(ImageView.ScaleType.CENTER);
            this.f23936s.setAlpha(0.0f);
            this.f23936s.setRotation(45.0f);
            this.f23936s.setScaleX(0.0f);
            this.f23936s.setScaleY(0.0f);
            this.f23936s.setOnClickListener(new c0(this, 0));
            this.f23936s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.B.addView(this.f23936s, i7.f6.e(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < this.f23915b.getItemsCount()) {
                if (this.f23915b.H.getChildAt(i11).getVisibility() == 0) {
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
            ArrayList arrayList = this.f23918c0;
            if (i10 < arrayList.size()) {
                if (((rf.f0) arrayList.get(i10)).h) {
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
        o1 o1Var = this.d;
        if (o1Var != null && o1Var.isShowing()) {
            this.d.dismiss();
        }
    }

    public final void o() {
        if (this.f23915b != null) {
            return;
        }
        this.E = new Rect();
        this.F = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.f23926i0);
        this.f23915b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        lg.a aVar = this.m0;
        if (aVar != null) {
            ng.d c3 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c3.n(this.f23931n0);
            c3.p(AndroidUtilities.dp(12.0f));
            c3.o(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c3);
        }
        this.f23915b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o1 o1Var;
                w0 w0Var = w0.this;
                w0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = w0Var.d) != null && o1Var.isShowing()) {
                    view.getHitRect(w0Var.E);
                    if (!w0Var.E.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        w0Var.d.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            }
        });
        this.f23915b.setDispatchKeyEventListener(new o(this, 2));
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f23938x != null) {
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
        o1 o1Var = this.d;
        if (o1Var != null && o1Var.isShowing()) {
            O(false, true);
        }
        e5 e5Var = this.D;
        if (e5Var != null) {
            e5Var.l();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o1 o1Var;
        o1 o1Var2;
        o1 o1Var3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.V && q() && ((o1Var3 = this.d) == null || !o1Var3.isShowing())) {
                q qVar = new q(this, 1);
                this.H = qVar;
                AndroidUtilities.runOnUIThread(qVar, 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.f23916b0 && q() && ((o1Var2 = this.d) == null || !o1Var2.isShowing())) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    M(null, null);
                    return true;
                }
            } else if (this.f23916b0 && (o1Var = this.d) != null && o1Var.isShowing()) {
                getLocationOnScreen(this.F);
                float x4 = motionEvent.getX() + this.F[0];
                float y8 = motionEvent.getY();
                int[] iArr = this.F;
                float f9 = y8 + iArr[1];
                this.f23915b.getLocationOnScreen(iArr);
                int[] iArr2 = this.F;
                float f10 = x4 - iArr2[0];
                float f11 = f9 - iArr2[1];
                this.G = null;
                for (int i10 = 0; i10 < this.f23915b.getItemsCount(); i10++) {
                    View childAt = this.f23915b.H.getChildAt(i10);
                    childAt.getHitRect(this.E);
                    Object tag = childAt.getTag();
                    if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                        if (!this.E.contains((int) f10, (int) f11)) {
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
                            this.G = childAt;
                        }
                    }
                }
            }
        } else {
            o1 o1Var4 = this.d;
            if (o1Var4 != null && o1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.G;
                if (view != null) {
                    view.setSelected(false);
                    a0 a0Var = this.f23917c;
                    if (a0Var != null) {
                        a0Var.o(((Integer) this.G.getTag()).intValue());
                    } else {
                        s0 s0Var = this.L;
                        if (s0Var != null) {
                            s0Var.i(((Integer) this.G.getTag()).intValue());
                        }
                    }
                    this.d.d(this.N);
                } else if (this.f23916b0) {
                    this.d.d(true);
                }
            } else {
                View view2 = this.G;
                if (view2 != null) {
                    view2.setSelected(false);
                    this.G = null;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean p() {
        ArrayList arrayList = this.f23918c0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((rf.f0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        if (this.f23915b == null) {
            ArrayList arrayList = this.f23933p0;
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
        HashMap hashMap = this.f23934q0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i10));
        }
        if (u0Var != null) {
            u0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23915b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public final boolean s() {
        r0 r0Var = this.B;
        if (r0Var != null && r0Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void setAdditionalXOffset(int i10) {
        this.U = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.T = i10;
    }

    public void setDelegate(s0 s0Var) {
        this.L = s0Var;
    }

    public void setDimMenu(float f9) {
        this.f23923f0 = f9;
    }

    public void setFitSubItems(boolean z10) {
        this.f23915b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f23929l0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f23914a0 = z10;
    }

    public void setIcon(Drawable drawable) {
        aj0 aj0Var = this.f23938x;
        if (aj0Var == null) {
            return;
        }
        if (drawable instanceof xi0) {
            aj0Var.setAnimation((xi0) drawable);
        } else {
            aj0Var.setImageDrawable(drawable);
        }
        this.f23939y = 0;
    }

    public void setIconColor(int i10) {
        aj0 aj0Var = this.f23938x;
        if (aj0Var != null) {
            aj0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.A;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        m0 m0Var = this.f23936s;
        if (m0Var != null) {
            m0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        this.f23928k0 = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final Utilities.Callback<Boolean> callback) {
        o1 o1Var = this.d;
        if (o1Var != null) {
            o1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.valueOf(w0.this.P));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        o1 o1Var = this.d;
        if (o1Var != null) {
            o1Var.f23710b = z10;
        }
        this.R = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23915b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
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
        this.f23937w = view;
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
        this.f23930n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f23920e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i10) {
        boolean z10;
        this.f23927j0 = i10;
        r0 r0Var = this.B;
        if (r0Var != null) {
            ((ViewGroup.MarginLayoutParams) r0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            r0 r0Var2 = this.B;
            if (this.f23927j0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r0Var2.setClipChildren(z10);
            r0 r0Var3 = this.B;
            r0Var3.setLayoutParams(r0Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        nh.b2 b2Var = this.S;
        if (b2Var == null) {
            return;
        }
        if (z10) {
            b2Var.f35386e = true;
            b2Var.f35384b = System.currentTimeMillis();
            b2Var.invalidateSelf();
            return;
        }
        b2Var.f35386e = false;
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f23916b0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23915b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(t0 t0Var) {
        this.M = t0Var;
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

    public void setTransitionOffset(float f9) {
        this.f23924g0 = f9;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f9) {
        super.setTranslationX(f9 + this.f23924g0);
    }

    public void setupPopupRadialSelectors(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23915b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i10);
        }
    }

    public final boolean t() {
        o1 o1Var = this.d;
        if (o1Var != null && o1Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final u0 u(int i10, int i11, String str) {
        u0 u0Var = new u0(0);
        u0Var.f23821b = i10;
        u0Var.f23822c = i11;
        u0Var.d = null;
        u0Var.f23823e = str;
        u0Var.f23824f = true;
        A(u0Var);
        return u0Var;
    }

    public final void v(xi0 xi0Var, String str) {
        u0 u0Var = new u0(0);
        u0Var.f23821b = 29;
        u0Var.f23822c = 0;
        u0Var.d = xi0Var;
        u0Var.f23823e = str;
        u0Var.f23824f = true;
        A(u0Var);
    }

    public final u0 w(int i10, ho hoVar) {
        u0 u0Var = new u0(2);
        u0Var.f23822c = i10;
        u0Var.d = null;
        u0Var.f23823e = null;
        u0Var.f23825g = hoVar;
        A(u0Var);
        return u0Var;
    }

    public final u0 x() {
        u0 u0Var = new u0(3);
        u0Var.f23823e = "";
        u0Var.h = 13;
        A(u0Var);
        return u0Var;
    }

    public final void y() {
        Integer num;
        boolean z10;
        ArrayList arrayList = this.f23918c0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        r0 r0Var = this.B;
        if (r0Var != null && r0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new cg.j0(1).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) jr.f29801g);
            transitionSet.addListener((Transition.TransitionListener) new p0(this));
            TransitionManager.beginDelayedTransition(this.f23922f, transitionSet);
        }
        if (this.f23922f != null) {
            int i10 = 0;
            while (i10 < this.f23922f.getChildCount()) {
                if (!arrayList2.remove(((v0) this.f23922f.getChildAt(i10)).getFilter())) {
                    this.f23922f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            rf.f0 f0Var = (rf.f0) arrayList2.get(i11);
            f0Var.getClass();
            v0 v0Var = new v0(getContext(), this.f23926i0);
            v0Var.setData(f0Var);
            v0Var.setOnClickListener(new r7(4, this, v0Var));
            this.f23922f.addView(v0Var, i7.f6.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f23922f != null) {
            for (int i12 = 0; i12 < this.f23922f.getChildCount(); i12++) {
                v0 v0Var2 = (v0) this.f23922f.getChildAt(i12);
                if (i12 == this.f23919d0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v0Var2.setExpanded(z10);
            }
        }
        LinearLayout linearLayout = this.f23922f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x4 = this.f23920e.getX();
        if (this.B.getTag() != null) {
            this.f23920e.getViewTreeObserver().addOnPreDrawListener(new q0(this, x4));
        }
        j();
    }

    public final void z(boolean z10) {
        a0 a0Var;
        k();
        r0 r0Var = this.B;
        if (r0Var != null && r0Var.getVisibility() != 0 && (a0Var = this.f23917c) != null) {
            a0Var.f22719b.v(L(z10));
        }
    }

    public w0(Context context, a0 a0Var, int i10, int i11) {
        this(context, a0Var, i10, i11, false, null);
    }

    public w0(Context context, a0 a0Var, int i10, int i11, boolean z10, c6 c6Var) {
        super(context);
        new ArrayList();
        this.N = true;
        this.R = true;
        this.W = true;
        this.f23916b0 = true;
        this.f23918c0 = new ArrayList();
        this.f23919d0 = -1;
        this.f23921e0 = new AnimationNotificationsLocker();
        this.f23926i0 = c6Var;
        if (i10 != 0) {
            setBackgroundDrawable(g6.f0(i10, z10 ? 5 : 1, -1));
        }
        this.f23917c = a0Var;
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
            addView(textView, i7.f6.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f23938x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, i7.f6.c(-1.0f, -1));
        if (i11 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        aj0 aj0Var = this.f23938x;
        if (aj0Var == null) {
            return;
        }
        this.f23939y = i10;
        aj0Var.setImageResource(i10);
    }
}
