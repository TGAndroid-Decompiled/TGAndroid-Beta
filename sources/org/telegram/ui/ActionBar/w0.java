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
import bi.w6;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.zh;
public class w0 extends FrameLayout {
    public final TextView E;
    public r0 F;
    public boolean G;
    public i5 H;
    public Rect I;
    public int[] J;
    public View K;
    public q L;
    public int M;
    public int N;
    public int O;
    public s0 P;
    public t0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public bi.v2 W;
    public FrameLayout f18684a;
    public int f18685a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f18686b;
    public int f18687b0;
    public final z f18688c;
    public boolean f18689c0;
    public p1 d;
    public boolean f18690d0;
    public bi.t2 e;
    public boolean f18691e0;
    public LinearLayout f18692f;
    public boolean f18693f0;
    public final ArrayList f18694g0;
    public TextView h;
    public int f18695h0;
    public final AnimationNotificationsLocker f18696i0;
    public float f18697j0;
    public float f18698k0;
    public View f18699l0;
    public final f6 m0;
    public CharSequence f18700n;
    public int f18701n0;
    public View.OnClickListener f18702o0;
    public boolean f18703p0;
    public zg.a f18704q0;
    public CharSequence f18705r;
    public ch.e f18706r0;
    public l0 f18707s;
    public AnimatorSet f18708s0;
    public ArrayList f18709t0;
    public HashMap f18710u0;
    public AnimatorSet v;
    public View f18711w;
    public final kj0 f18712x;
    public int f18713y;

    public w0(Context context, int i10, int i11, boolean z10) {
        this(context, null, i10, i11, z10, null);
    }

    public static g1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i10, CharSequence charSequence, boolean z12, f6 f6Var) {
        g1 g1Var = new g1(z12 ? 1 : 0, viewGroup.getContext(), f6Var, z10, z11);
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
        if (this.f18709t0 == null) {
            this.f18709t0 = new ArrayList();
        }
        this.f18709t0.add(u0Var);
        if (this.f18710u0 == null) {
            this.f18710u0 = new HashMap();
        }
        this.f18710u0.put(Integer.valueOf(u0Var.f18638b), u0Var);
        return u0Var;
    }

    public final void B(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f18686b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i10) {
            this.f18686b.setBackgroundColor(i10);
            p1 p1Var = this.d;
            if (p1Var != null && p1Var.isShowing()) {
                this.f18686b.invalidate();
            }
        }
    }

    public final void C(fg.q0 q0Var) {
        if (!q0Var.h) {
            return;
        }
        ArrayList arrayList = this.f18694g0;
        arrayList.remove(q0Var);
        int i10 = this.f18695h0;
        if (i10 < 0 || i10 > arrayList.size() - 1) {
            this.f18695h0 = arrayList.size() - 1;
        }
        y();
        this.e.hideActionMode();
    }

    public final void D() {
        this.R = false;
    }

    public final void E(zg.a aVar, ch.e eVar) {
        this.f18704q0 = aVar;
        this.f18706r0 = eVar;
        View view = this.f18686b;
        if (view != null && aVar != null) {
            bh.d c10 = aVar.c(view, null, true);
            c10.n(eVar);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            view.setBackground(c10);
        }
    }

    public final void F() {
        if (this.f18688c == null) {
            return;
        }
        this.G = true;
    }

    public final void G(int i10, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f18686b;
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

    public final void H(CharSequence charSequence, boolean z10) {
        this.f18705r = charSequence;
        if (this.h != null) {
            this.f18690d0 = z10;
            this.e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.e.setSelection(charSequence.length());
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
        HashMap hashMap = this.f18710u0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i10));
        }
        if (u0Var != null) {
            u0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f18686b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            em.q(findViewWithTag.animate().alpha(1.0f), wr.f28819f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public final boolean L(boolean z10) {
        z zVar;
        kj0 iconView;
        Animator h;
        k();
        i5 i5Var = this.H;
        if (this.F == null || (i5Var != null && !i5Var.c())) {
            return false;
        }
        i5 i5Var2 = this.H;
        if (i5Var2 != null && (h = i5Var2.h()) != null) {
            h.start();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            zVar = this.f18688c;
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
            AnimatorSet animatorSet = this.f18708s0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f18708s0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f18708s0 = animatorSet2;
            r0 r0Var = this.F;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(r0Var, property, r0Var.getAlpha(), 0.0f));
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((View) arrayList.get(i11)).setAlpha(0.0f);
                this.f18708s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i11), property, ((View) arrayList.get(i11)).getAlpha(), 1.0f));
            }
            this.f18708s0.setDuration(150L);
            this.f18708s0.addListener(new n0(this, arrayList, 0));
            this.f18708s0.start();
            this.e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f18694g0;
            if (!arrayList2.isEmpty() && this.H != null) {
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (((fg.q0) arrayList2.get(i12)).h) {
                        this.H.o((fg.q0) arrayList2.get(i12));
                    }
                }
            }
            i5 i5Var3 = this.H;
            if (i5Var3 != null) {
                i5Var3.m();
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
        AnimatorSet animatorSet3 = this.f18708s0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f18708s0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f18708s0 = animatorSet4;
        r0 r0Var2 = this.F;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(r0Var2, property, r0Var2.getAlpha(), 1.0f));
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f18708s0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i13), property, ((View) arrayList.get(i13)).getAlpha(), 0.0f));
        }
        this.f18708s0.setDuration(150L);
        this.f18708s0.addListener(new n0(this, arrayList, 1));
        this.f18708s0.start();
        setVisibility(8);
        m();
        this.e.setText("");
        this.e.requestFocus();
        if (z10) {
            AndroidUtilities.showKeyboard(this.e);
        }
        this.F.setTag(1);
        i5 i5Var4 = this.H;
        if (i5Var4 != null) {
            i5Var4.n();
        }
        return true;
    }

    public final void M(View view, w0 w0Var) {
        float f7;
        FrameLayout frameLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z10;
        boolean z11;
        boolean z12;
        View childAt;
        long j3;
        l lVar;
        p1 p1Var = this.d;
        f6 f6Var = this.m0;
        View view2 = null;
        if ((p1Var != null && p1Var.isShowing()) || this.f18709t0 == null) {
            f7 = 8.0f;
        } else {
            for (int i10 = 0; i10 < this.f18709t0.size(); i10++) {
                u0 u0Var = (u0) this.f18709t0.get(i10);
                u0Var.getClass();
                o();
                View view3 = u0Var.f18642i;
                if (view3 != null) {
                    this.f18686b.addView(view3);
                } else {
                    int i11 = u0Var.f18637a;
                    if (i11 == 0) {
                        g1 g1Var = new g1(0, getContext(), this.m0, false, false);
                        g1Var.g(u0Var.e, u0Var.f18639c, u0Var.d);
                        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var.setTag(Integer.valueOf(u0Var.f18638b));
                        this.f18686b.addView(g1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        g1Var.setLayoutParams(layoutParams);
                        g1Var.setOnClickListener(new bi.n3(14, u0Var, this));
                        Integer num = u0Var.f18646m;
                        if (num != null && u0Var.f18647n != null) {
                            g1Var.c(num.intValue(), u0Var.f18647n.intValue());
                        }
                        u0Var.f18642i = g1Var;
                    } else if (i11 == 1) {
                        m1 m1Var = new m1(getContext(), j6.H8, f6Var);
                        m1Var.setTag(R.id.fit_width_tag, 1);
                        this.f18686b.a(m1Var, w7.a6.n(-1, 8));
                        u0Var.f18642i = m1Var;
                    } else if (i11 == 2) {
                        g1 g1Var2 = new g1(0, getContext(), this.m0, false, false);
                        g1Var2.g(u0Var.e, u0Var.f18639c, u0Var.d);
                        g1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var2.setRightIcon(R.drawable.msg_arrowright);
                        g1Var2.getRightIcon().setVisibility(u0Var.f18645l);
                        this.f18686b.addView(g1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) g1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        g1Var2.setLayoutParams(layoutParams2);
                        g1Var2.G = new h0(this, this.f18686b.b(u0Var.f18641g), 1);
                        g1Var2.setOnClickListener(new i0(g1Var2, 1));
                        this.f18686b.f17520c = true;
                        Integer num2 = u0Var.f18646m;
                        if (num2 != null && u0Var.f18647n != null) {
                            g1Var2.c(num2.intValue(), u0Var.f18647n.intValue());
                        }
                        u0Var.f18642i = g1Var2;
                    } else if (i11 == 3) {
                        m90 m90Var = new m90(getContext(), null);
                        m90Var.setTag(R.id.fit_width_tag, 1);
                        m90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        m90Var.setTextSize(1, u0Var.h);
                        m90Var.setTextColor(j6.w0(null, j6.E8, false));
                        m90Var.setMovementMethod(LinkMovementMethod.getInstance());
                        m90Var.setLinkTextColor(j6.w0(null, j6.J6, false));
                        m90Var.setText(u0Var.e);
                        m90Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.f18686b.a(m90Var, w7.a6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        u0Var.f18642i = m90Var;
                    }
                }
                View view4 = u0Var.f18642i;
                if (view4 != null) {
                    view4.setVisibility(u0Var.f18644k);
                    zh zhVar = u0Var.f18643j;
                    if (zhVar != null) {
                        u0Var.f18642i.setOnClickListener(zhVar);
                    }
                }
            }
            f7 = 8.0f;
            this.f18709t0.clear();
        }
        if (this.f18686b != null) {
            z zVar = this.f18688c;
            if (zVar == null || !zVar.f18794c || (lVar = zVar.f18793b) == null || lVar.s()) {
                q qVar = this.L;
                if (qVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(qVar);
                    this.L = null;
                }
                p1 p1Var2 = this.d;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.f18699l0 = w0Var;
                t0 t0Var = this.Q;
                if (t0Var != null) {
                    t0Var.e();
                }
                if (this.f18686b.getParent() != null) {
                    ((ViewGroup) this.f18686b.getParent()).removeView(this.f18686b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f18686b;
                if (view != null) {
                    ?? w6Var = new w6(this, getContext(), view);
                    w6Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout.animate().alpha(1.0f).setDuration(100L);
                    if (this.f18686b.v) {
                        j3 = 165;
                    } else {
                        j3 = 0;
                    }
                    duration.setStartDelay(j3).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof g1) || (view instanceof LinearLayout)) {
                        zg.a aVar = this.f18704q0;
                        if (aVar != null) {
                            bh.d c10 = aVar.c(this.f18686b, null, true);
                            c10.n(this.f18706r0);
                            c10.p(AndroidUtilities.dp(12.0f));
                            c10.o(AndroidUtilities.dp(f7));
                            c10.h.e = true;
                            frameLayout.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f18686b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, w7.a6.c(-2.0f, -1));
                    w6Var.addView(frameLayout, w7.a6.n(-1, -2));
                    w6Var.addView(this.f18686b, w7.a6.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f18686b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = w6Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.f18704q0 != null) {
                    w70.U(this.f18686b, j6.l1(0.06f, j6.v0(j6.E8, f6Var)));
                }
                p1 p1Var3 = new p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                this.d = p1Var3;
                if (this.V) {
                    p1Var3.setAnimationStyle(0);
                } else {
                    p1Var3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z13 = this.V;
                if (!z13) {
                    this.d.f18534b = z13;
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
                        t0 t0Var2 = w0.this.Q;
                        if (t0Var2 != null) {
                            t0Var2.c();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(em.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f18686b.getSwipeBack() != null && (childAt = this.f18686b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
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
                k1 k1Var = this.f18686b.L;
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
                if (this.f18686b.getSwipeBack() != null) {
                    this.f18686b.getSwipeBack().b(false);
                }
                this.d.h();
                float f10 = this.f18697j0;
                if (f10 > 0.0f) {
                    this.d.c(f10);
                }
            }
        }
    }

    public final void N() {
        if (this.f18692f != null) {
            for (int i10 = 0; i10 < this.f18692f.getChildCount(); i10++) {
                if (this.f18692f.getChildAt(i10) instanceof v0) {
                    ((v0) this.f18692f.getChildAt(i10)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f18686b;
        f6 f6Var = this.m0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i11 = 0; i11 < this.f18686b.getItemsCount(); i11++) {
                if (this.f18686b.L.getChildAt(i11) instanceof g1) {
                    ((g1) this.f18686b.L.getChildAt(i11)).setSelectorColor(j6.v0(j6.I5, f6Var));
                }
            }
        }
        bi.t2 t2Var = this.e;
        if (t2Var != null) {
            int i12 = j6.C8;
            t2Var.setCursorColor(j6.v0(i12, f6Var));
            this.e.setHintTextColor(j6.v0(j6.D8, f6Var));
            this.e.setTextColor(j6.v0(i12, f6Var));
            this.e.setHighlightColor(j6.v0(j6.f18245uf, f6Var));
            this.e.setHandlesColor(j6.v0(j6.vf, f6Var));
        }
    }

    public final void O(boolean z10, boolean z11) {
        float f7;
        int i10;
        int i11;
        ScrollView scrollView;
        z zVar = this.f18688c;
        if (zVar != null) {
            i11 = zVar.getTop() + (-zVar.f18793b.getMeasuredHeight());
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
            i11 = this.f18685a0;
        }
        int i12 = i10 + i11 + this.N;
        if (z10 && (scrollView = this.f18686b.K) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.f18699l0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            l lVar = zVar.f18793b;
            if (this.M == 0) {
                if (z10) {
                    this.d.showAsDropDown(lVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12);
                }
                if (z11) {
                    this.d.update(lVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.O, i12, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.f18691e0) {
                    this.d.showAtLocation(lVar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.O, i12);
                } else {
                    this.d.showAsDropDown(lVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.O, i12);
                }
            }
            if (z11) {
                this.d.update(lVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.O, i12, -1, -1);
                return;
            }
            return;
        }
        int i13 = this.M;
        if (i13 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z10) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f18687b0 + this.O, i12);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.f18687b0 + this.O, i12, -1, -1);
                }
            }
        } else if (i13 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.f18687b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.f18687b0 + this.O, i12, -1, -1);
            }
        } else {
            if (z10) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f18687b0 + this.O, i12);
            }
            if (z11) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.f18687b0 + this.O, i12, -1, -1);
            }
        }
    }

    public final m1 a(int i10) {
        o();
        m1 m1Var = new m1(getContext(), j6.H8, this.m0);
        if (i10 != -1) {
            m1Var.setTag(Integer.valueOf(i10));
        }
        m1Var.setTag(R.id.fit_width_tag, 1);
        this.f18686b.a(m1Var, w7.a6.n(-1, 8));
        return m1Var;
    }

    public final TextView b(int i10) {
        o();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i10);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.f18686b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int dp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = dp;
        layoutParams.topMargin = dp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final g1 d(int i10, int i11, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, f6 f6Var) {
        o();
        g1 g1Var = new g1(z11 ? 1 : 0, getContext(), f6Var, false, false);
        g1Var.g(charSequence, i11, drawable);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setTag(Integer.valueOf(i10));
        this.f18686b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.setOnClickListener(new e0(0, this, z10));
        return g1Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f18703p0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final g1 e(int i10, int i11, String str) {
        return d(i10, i11, null, str, true, false, this.m0);
    }

    public final g1 f(int i10, int i11, String str, f6 f6Var) {
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
        this.f18686b.addView(textView);
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
        kj0 kj0Var = this.f18712x;
        if (kj0Var != null) {
            return kj0Var;
        }
        return this.E;
    }

    public kj0 getIconView() {
        return this.f18712x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f18702o0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f18686b == null) {
            o();
        }
        return this.f18686b;
    }

    public ImageView getSearchClearButton() {
        return this.f18707s;
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
        for (int i11 = 0; i11 < this.f18686b.getItemsCount(); i11++) {
            View childAt = this.f18686b.L.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i10) {
        o();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i10));
        this.f18686b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new b0(this, 1));
        kVar.setBackgroundDrawable(j6.K0(false));
    }

    public final g1 i(int i10, j21 j21Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        g1 g1Var = new g1(0, getContext(), this.m0, false, false);
        g1Var.g(str, i10, j21Var);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setRightIcon(R.drawable.msg_arrowright);
        this.f18686b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.G = new h0(this, this.f18686b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        g1Var.setOnClickListener(new i0(g1Var, 0));
        this.f18686b.f17520c = true;
        return g1Var;
    }

    public final void j() {
        i5 i5Var;
        TextView textView;
        i5 i5Var2;
        if (this.f18707s != null) {
            boolean p5 = p();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!p5 && TextUtils.isEmpty(this.e.getText()) && (((i5Var = this.H) == null || !i5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((i5Var2 = this.H) != null && !i5Var2.r())))) {
                if (this.f18707s.getTag() != null) {
                    this.f18707s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.f18690d0) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final w0 f17593b;

                            {
                                this.f17593b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        w0 w0Var = this.f17593b;
                                        w0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = w0Var.f18711w;
                                        if (view != null) {
                                            view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        w0 w0Var2 = this.f17593b;
                                        w0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = w0Var2.f18711w;
                                        if (view2 != null) {
                                            view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f18707s, property4, 0.0f), ObjectAnimator.ofFloat(this.f18707s, property3, 0.0f), ObjectAnimator.ofFloat(this.f18707s, property2, 0.0f), ObjectAnimator.ofFloat(this.f18707s, property, 45.0f), ofFloat);
                        duration.addListener(new m0(this, 0));
                        duration.start();
                        this.v = duration;
                        return;
                    }
                    this.f18707s.setAlpha(0.0f);
                    this.f18707s.setRotation(45.0f);
                    this.f18707s.setScaleX(0.0f);
                    this.f18707s.setScaleY(0.0f);
                    this.f18707s.setVisibility(4);
                    this.f18690d0 = true;
                }
            } else if (this.f18707s.getTag() == null) {
                this.f18707s.setTag(1);
                AnimatorSet animatorSet2 = this.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f18707s.setVisibility(0);
                if (this.f18690d0) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final w0 f17593b;

                        {
                            this.f17593b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    w0 w0Var = this.f17593b;
                                    w0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = w0Var.f18711w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    w0 w0Var2 = this.f17593b;
                                    w0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = w0Var2.f18711w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f18707s, property4, 1.0f), ObjectAnimator.ofFloat(this.f18707s, property3, 1.0f), ObjectAnimator.ofFloat(this.f18707s, property2, 1.0f), ObjectAnimator.ofFloat(this.f18707s, property, 0.0f), ofFloat2);
                    duration2.addListener(new m0(this, 1));
                    duration2.start();
                    this.v = duration2;
                    return;
                }
                this.f18707s.setAlpha(1.0f);
                this.f18707s.setRotation(0.0f);
                this.f18707s.setScaleX(1.0f);
                this.f18707s.setScaleY(1.0f);
                View view = this.f18711w;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.f18690d0 = true;
            }
        }
    }

    public final void k() {
        boolean z10;
        int i10;
        if (this.F == null && this.G) {
            r0 r0Var = new r0(this, getContext(), 0);
            this.F = r0Var;
            if (this.f18701n0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r0Var.setClipChildren(z10);
            this.f18684a = null;
            r0 r0Var2 = this.F;
            LinearLayout.LayoutParams m10 = w7.a6.m(1.0f, 0, -1, this.f18701n0 + 6, 0, 0);
            z zVar = this.f18688c;
            zVar.addView(r0Var2, 0, m10);
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
            bi.t2 t2Var = new bi.t2(this, getContext(), 2);
            this.e = t2Var;
            t2Var.setScrollContainer(false);
            this.e.setCursorWidth(1.5f);
            this.e.setCursorColor(j6.v0(i11, f6Var));
            this.e.setTextSize(1, 18.0f);
            this.e.setHintTextColor(j6.v0(j6.D8, f6Var));
            this.e.setTextColor(j6.v0(i11, f6Var));
            this.e.setSingleLine(true);
            this.e.setBackgroundResource(0);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setInputType(this.e.getInputType() | 524288);
            if (Build.VERSION.SDK_INT < 23) {
                this.e.setCustomSelectionActionModeCallback(new hi.f1(1));
            }
            this.e.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView4, int i12, KeyEvent keyEvent) {
                    if (keyEvent != null) {
                        if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                            w0 w0Var = w0.this;
                            AndroidUtilities.hideKeyboard(w0Var.e);
                            i5 i5Var = w0Var.H;
                            if (i5Var != null) {
                                i5Var.p(w0Var.e);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            });
            this.e.addTextChangedListener(new k0(this));
            this.e.setImeOptions(234881027);
            this.e.setTextIsSelectable(false);
            this.e.setHighlightColor(j6.v0(j6.f18245uf, f6Var));
            this.e.setHandlesColor(j6.v0(j6.vf, f6Var));
            CharSequence charSequence = this.f18700n;
            if (charSequence != null) {
                this.e.setHint(charSequence);
                setContentDescription(this.f18700n);
            }
            CharSequence charSequence2 = this.f18705r;
            if (charSequence2 != null) {
                this.e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f18692f = linearLayout;
            linearLayout.setOrientation(0);
            this.f18692f.setVisibility(0);
            if (!LocaleController.isRTL) {
                this.F.addView(this.h, w7.a6.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.F.addView(this.e, w7.a6.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.f18692f, w7.a6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.F.addView(this.f18692f, w7.a6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.e, w7.a6.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.F.addView(this.h, w7.a6.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f18692f.setClipChildren(false);
            l0 l0Var = new l0(this, getContext(), 0);
            this.f18707s = l0Var;
            bi.v2 v2Var = new bi.v2(1, this);
            this.W = v2Var;
            l0Var.setImageDrawable(v2Var);
            this.f18707s.setBackground(j6.f0(zVar.f18793b.f18395q0, 1, -1));
            this.f18707s.setScaleType(ImageView.ScaleType.CENTER);
            this.f18707s.setAlpha(0.0f);
            this.f18707s.setRotation(45.0f);
            this.f18707s.setScaleX(0.0f);
            this.f18707s.setScaleY(0.0f);
            this.f18707s.setOnClickListener(new b0(this, 0));
            this.f18707s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.F.addView(this.f18707s, w7.a6.e(48, -1, 21));
        }
    }

    public final void l() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < this.f18686b.getItemsCount()) {
                if (this.f18686b.L.getChildAt(i11).getVisibility() == 0) {
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
            ArrayList arrayList = this.f18694g0;
            if (i10 < arrayList.size()) {
                if (((fg.q0) arrayList.get(i10)).h) {
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
        if (this.f18686b != null) {
            return;
        }
        this.I = new Rect();
        this.J = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.m0);
        this.f18686b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        zg.a aVar = this.f18704q0;
        if (aVar != null) {
            bh.d c10 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.n(this.f18706r0);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.f18686b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                p1 p1Var;
                w0 w0Var = w0.this;
                w0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var = w0Var.d) != null && p1Var.isShowing()) {
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
        this.f18686b.setDispatchKeyEventListener(new o(this, 2));
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f18712x != null) {
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
        p1 p1Var = this.d;
        if (p1Var != null && p1Var.isShowing()) {
            O(false, true);
        }
        i5 i5Var = this.H;
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
            if (this.f18689c0 && q() && ((p1Var3 = this.d) == null || !p1Var3.isShowing())) {
                q qVar = new q(this, 1);
                this.L = qVar;
                AndroidUtilities.runOnUIThread(qVar, 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.f18693f0 && q() && ((p1Var2 = this.d) == null || !p1Var2.isShowing())) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    M(null, null);
                    return true;
                }
            } else if (this.f18693f0 && (p1Var = this.d) != null && p1Var.isShowing()) {
                getLocationOnScreen(this.J);
                float x10 = motionEvent.getX() + this.J[0];
                float y3 = motionEvent.getY();
                int[] iArr = this.J;
                float f7 = y3 + iArr[1];
                this.f18686b.getLocationOnScreen(iArr);
                int[] iArr2 = this.J;
                float f10 = x10 - iArr2[0];
                float f11 = f7 - iArr2[1];
                this.K = null;
                for (int i10 = 0; i10 < this.f18686b.getItemsCount(); i10++) {
                    View childAt = this.f18686b.L.getChildAt(i10);
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
            p1 p1Var4 = this.d;
            if (p1Var4 != null && p1Var4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.K;
                if (view != null) {
                    view.setSelected(false);
                    z zVar = this.f18688c;
                    if (zVar != null) {
                        zVar.o(((Integer) this.K.getTag()).intValue());
                    } else {
                        s0 s0Var = this.P;
                        if (s0Var != null) {
                            s0Var.m(((Integer) this.K.getTag()).intValue());
                        }
                    }
                    this.d.d(this.R);
                } else if (this.f18693f0) {
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
        ArrayList arrayList = this.f18694g0;
        if (!arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((fg.q0) arrayList.get(i10)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        if (this.f18686b == null) {
            ArrayList arrayList = this.f18709t0;
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
        HashMap hashMap = this.f18710u0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i10));
        }
        if (u0Var != null) {
            u0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f18686b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i10))) != null && findViewWithTag.getVisibility() != 8) {
            findViewWithTag.setVisibility(8);
        }
    }

    public final boolean s() {
        r0 r0Var = this.F;
        if (r0Var != null && r0Var.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void setAdditionalXOffset(int i10) {
        this.f18687b0 = i10;
    }

    public void setAdditionalYOffset(int i10) {
        this.f18685a0 = i10;
    }

    public void setDelegate(s0 s0Var) {
        this.P = s0Var;
    }

    public void setDimMenu(float f7) {
        this.f18697j0 = f7;
    }

    public void setFitSubItems(boolean z10) {
        this.f18686b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f18703p0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f18691e0 = z10;
    }

    public void setIcon(Drawable drawable) {
        kj0 kj0Var = this.f18712x;
        if (kj0Var == null) {
            return;
        }
        if (drawable instanceof hj0) {
            kj0Var.setAnimation((hj0) drawable);
        } else {
            kj0Var.setImageDrawable(drawable);
        }
        this.f18713y = 0;
    }

    public void setIconColor(int i10) {
        kj0 kj0Var = this.f18712x;
        if (kj0Var != null) {
            kj0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.E;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        l0 l0Var = this.f18707s;
        if (l0Var != null) {
            l0Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.U = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.f18689c0 = z10;
    }

    public void setMenuXOffset(int i10) {
        this.O = i10;
    }

    public void setMenuYOffset(int i10) {
        this.N = i10;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18702o0 = onClickListener;
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
                        callback2.run(Boolean.valueOf(w0.this.T));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z10) {
        p1 p1Var = this.d;
        if (p1Var != null) {
            p1Var.f18534b = z10;
        }
        this.V = z10;
    }

    public void setPopupItemsSelectorColor(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f18686b;
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
        this.f18711w = view;
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
        this.f18700n = charSequence;
        if (this.h == null) {
            return;
        }
        this.e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i10) {
        boolean z10;
        this.f18701n0 = i10;
        r0 r0Var = this.F;
        if (r0Var != null) {
            ((ViewGroup.MarginLayoutParams) r0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i10);
            r0 r0Var2 = this.F;
            if (this.f18701n0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r0Var2.setClipChildren(z10);
            r0 r0Var3 = this.F;
            r0Var3.setLayoutParams(r0Var3.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z10) {
        bi.v2 v2Var = this.W;
        if (v2Var == null) {
            return;
        }
        if (z10) {
            v2Var.e = true;
            v2Var.f25072b = System.currentTimeMillis();
            v2Var.invalidateSelf();
            return;
        }
        v2Var.e = false;
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f18693f0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f18686b;
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
        this.f18698k0 = f7;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7 + this.f18698k0);
    }

    public void setupPopupRadialSelectors(int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f18686b;
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
        u0Var.f18638b = i10;
        u0Var.f18639c = i11;
        u0Var.d = null;
        u0Var.e = str;
        u0Var.f18640f = true;
        A(u0Var);
        return u0Var;
    }

    public final void v(hj0 hj0Var, String str) {
        u0 u0Var = new u0(0);
        u0Var.f18638b = 29;
        u0Var.f18639c = 0;
        u0Var.d = hj0Var;
        u0Var.e = str;
        u0Var.f18640f = true;
        A(u0Var);
    }

    public final u0 w(int i10, so soVar) {
        u0 u0Var = new u0(2);
        u0Var.f18639c = i10;
        u0Var.d = null;
        u0Var.e = null;
        u0Var.f18641g = soVar;
        A(u0Var);
        return u0Var;
    }

    public final u0 x() {
        u0 u0Var = new u0(3);
        u0Var.e = "";
        u0Var.h = 13;
        A(u0Var);
        return u0Var;
    }

    public final void y() {
        Integer num;
        boolean z10;
        ArrayList arrayList = this.f18694g0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        r0 r0Var = this.F;
        if (r0Var != null && r0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new o0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) wr.f28820g);
            transitionSet.addListener((Transition.TransitionListener) new p0(this));
            TransitionManager.beginDelayedTransition(this.f18692f, transitionSet);
        }
        if (this.f18692f != null) {
            int i10 = 0;
            while (i10 < this.f18692f.getChildCount()) {
                if (!arrayList2.remove(((v0) this.f18692f.getChildAt(i10)).getFilter())) {
                    this.f18692f.removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            fg.q0 q0Var = (fg.q0) arrayList2.get(i11);
            q0Var.getClass();
            v0 v0Var = new v0(getContext(), this.m0);
            v0Var.setData(q0Var);
            v0Var.setOnClickListener(new bi.n3(13, this, v0Var));
            this.f18692f.addView(v0Var, w7.a6.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f18692f != null) {
            for (int i12 = 0; i12 < this.f18692f.getChildCount(); i12++) {
                v0 v0Var2 = (v0) this.f18692f.getChildAt(i12);
                if (i12 == this.f18695h0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v0Var2.setExpanded(z10);
            }
        }
        LinearLayout linearLayout = this.f18692f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x10 = this.e.getX();
        if (this.F.getTag() != null) {
            this.e.getViewTreeObserver().addOnPreDrawListener(new q0(this, x10));
        }
        j();
    }

    public final void z(boolean z10) {
        z zVar;
        k();
        r0 r0Var = this.F;
        if (r0Var != null && r0Var.getVisibility() != 0 && (zVar = this.f18688c) != null) {
            zVar.f18793b.v(L(z10));
        }
    }

    public w0(Context context, z zVar, int i10, int i11) {
        this(context, zVar, i10, i11, false, null);
    }

    public w0(Context context, z zVar, int i10, int i11, boolean z10, f6 f6Var) {
        super(context);
        new ArrayList();
        this.R = true;
        this.V = true;
        this.f18690d0 = true;
        this.f18693f0 = true;
        this.f18694g0 = new ArrayList();
        this.f18695h0 = -1;
        this.f18696i0 = new AnimationNotificationsLocker();
        this.m0 = f6Var;
        if (i10 != 0) {
            setBackgroundDrawable(j6.f0(i10, z10 ? 5 : 1, -1));
        }
        this.f18688c = zVar;
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
            addView(textView, w7.a6.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f18712x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, w7.a6.c(-1.0f, -1));
        if (i11 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i10) {
        kj0 kj0Var = this.f18712x;
        if (kj0Var == null) {
            return;
        }
        this.f18713y = i10;
        kj0Var.setImageResource(i10);
    }
}
