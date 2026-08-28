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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.lh;
public class w0 extends FrameLayout {
    public final TextView A;
    public r0 B;
    public boolean C;
    public e5 D;
    public Rect E;
    public int[] F;
    public View G;
    public p H;
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
    public kh.e2 S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public FrameLayout f23899a;
    public boolean f23900a0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f23901b;
    public boolean f23902b0;
    public final z f23903c;
    public final ArrayList f23904c0;
    public o1 d;
    public int f23905d0;
    public fg.g f23906e;
    public final AnimationNotificationsLocker f23907e0;
    public LinearLayout f23908f;
    public float f23909f0;
    public float f23910g0;
    public TextView h;
    public View f23911h0;
    public final b6 f23912i0;
    public int f23913j0;
    public View.OnClickListener f23914k0;
    public boolean f23915l0;
    public ig.a m0;
    public CharSequence f23916n;
    public lg.d f23917n0;
    public AnimatorSet f23918o0;
    public ArrayList f23919p0;
    public HashMap f23920q0;
    public CharSequence f23921r;
    public l0 f23922s;
    public AnimatorSet v;
    public View f23923w;
    public final pi0 f23924x;
    public int f23925y;

    public w0(Context context, int i9, int i10, boolean z10) {
        this(context, null, i9, i10, z10, null);
    }

    public static g1 c(boolean z10, boolean z11, ViewGroup viewGroup, int i9, CharSequence charSequence, boolean z12, b6 b6Var) {
        g1 g1Var = new g1(z12 ? 1 : 0, viewGroup.getContext(), b6Var, z10, z11);
        g1Var.g(charSequence, i9, null);
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
        if (this.f23919p0 == null) {
            this.f23919p0 = new ArrayList();
        }
        this.f23919p0.add(u0Var);
        if (this.f23920q0 == null) {
            this.f23920q0 = new HashMap();
        }
        this.f23920q0.put(Integer.valueOf(u0Var.f23803b), u0Var);
        return u0Var;
    }

    public final void B(int i9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundColor() != i9) {
            this.f23901b.setBackgroundColor(i9);
            o1 o1Var = this.d;
            if (o1Var != null && o1Var.isShowing()) {
                this.f23901b.invalidate();
            }
        }
    }

    public final void C(of.m0 m0Var) {
        if (!m0Var.h) {
            return;
        }
        ArrayList arrayList = this.f23904c0;
        arrayList.remove(m0Var);
        int i9 = this.f23905d0;
        if (i9 < 0 || i9 > arrayList.size() - 1) {
            this.f23905d0 = arrayList.size() - 1;
        }
        y();
        this.f23906e.hideActionMode();
    }

    public final void D() {
        this.N = false;
    }

    public final void E(ig.a aVar, lg.d dVar) {
        this.m0 = aVar;
        this.f23917n0 = dVar;
        View view = this.f23901b;
        if (view != null && aVar != null) {
            kg.d c10 = aVar.c(view, null, true);
            c10.n(dVar);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            view.setBackground(c10);
        }
    }

    public final void F() {
        if (this.f23903c == null) {
            return;
        }
        this.C = true;
    }

    public final void G(int i9, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
            int childCount = k1Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = k1Var.getChildAt(i10);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i9);
                } else if (childAt instanceof g1) {
                    if (z10) {
                        ((g1) childAt).setIconColor(i9);
                    } else {
                        ((g1) childAt).setTextColor(i9);
                    }
                }
            }
        }
    }

    public final void H(CharSequence charSequence, boolean z10) {
        this.f23921r = charSequence;
        if (this.h != null) {
            this.W = z10;
            this.f23906e.setText(charSequence);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f23906e.setSelection(charSequence.length());
            }
        }
    }

    public final void I(int i9, boolean z10) {
        if (z10) {
            K(i9);
        } else {
            r(i9);
        }
    }

    public final void J(int i9) {
        K(i9);
    }

    public final void K(int i9) {
        u0 u0Var;
        View findViewWithTag;
        HashMap hashMap = this.f23920q0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i9));
        }
        if (u0Var != null) {
            u0Var.e(0);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i9))) != null && findViewWithTag.getVisibility() != 0) {
            findViewWithTag.setAlpha(0.0f);
            ll.r(findViewWithTag.animate().alpha(1.0f), gr.f28844f, 150L);
            findViewWithTag.setVisibility(0);
        }
    }

    public final boolean L(boolean z10) {
        z zVar;
        pi0 iconView;
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
        int i9 = 0;
        while (true) {
            zVar = this.f23903c;
            if (i9 >= zVar.getChildCount()) {
                break;
            }
            View childAt = zVar.getChildAt(i9);
            if ((childAt instanceof w0) && (iconView = ((w0) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i9++;
        }
        Object tag = this.B.getTag();
        Property property = View.ALPHA;
        if (tag != null) {
            this.B.setTag(null);
            AnimatorSet animatorSet = this.f23918o0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.f23918o0.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23918o0 = animatorSet2;
            r0 r0Var = this.B;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(r0Var, property, r0Var.getAlpha(), 0.0f));
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((View) arrayList.get(i10)).setAlpha(0.0f);
                this.f23918o0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i10), property, ((View) arrayList.get(i10)).getAlpha(), 1.0f));
            }
            this.f23918o0.setDuration(150L);
            this.f23918o0.addListener(new n0(this, arrayList, 0));
            this.f23918o0.start();
            this.f23906e.clearFocus();
            setVisibility(0);
            ArrayList arrayList2 = this.f23904c0;
            if (!arrayList2.isEmpty() && this.D != null) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (((of.m0) arrayList2.get(i11)).h) {
                        this.D.o((of.m0) arrayList2.get(i11));
                    }
                }
            }
            e5 e5Var3 = this.D;
            if (e5Var3 != null) {
                e5Var3.m();
            }
            if (z10) {
                AndroidUtilities.hideKeyboard(this.f23906e);
            }
            zVar.requestLayout();
            requestLayout();
            return false;
        }
        this.B.setVisibility(0);
        this.B.setAlpha(0.0f);
        AnimatorSet animatorSet3 = this.f23918o0;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.f23918o0.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f23918o0 = animatorSet4;
        r0 r0Var2 = this.B;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(r0Var2, property, r0Var2.getAlpha(), 1.0f));
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f23918o0.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i12), property, ((View) arrayList.get(i12)).getAlpha(), 0.0f));
        }
        this.f23918o0.setDuration(150L);
        this.f23918o0.addListener(new n0(this, arrayList, 1));
        this.f23918o0.start();
        setVisibility(8);
        m();
        this.f23906e.setText("");
        this.f23906e.requestFocus();
        if (z10) {
            AndroidUtilities.showKeyboard(this.f23906e);
        }
        this.B.setTag(1);
        e5 e5Var4 = this.D;
        if (e5Var4 != null) {
            e5Var4.n();
        }
        return true;
    }

    public final void M(View view, w0 w0Var) {
        float f10;
        FrameLayout frameLayout;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        boolean z10;
        boolean z11;
        boolean z12;
        View childAt;
        long j10;
        k kVar;
        o1 o1Var = this.d;
        b6 b6Var = this.f23912i0;
        View view2 = null;
        if ((o1Var != null && o1Var.isShowing()) || this.f23919p0 == null) {
            f10 = 8.0f;
        } else {
            for (int i9 = 0; i9 < this.f23919p0.size(); i9++) {
                u0 u0Var = (u0) this.f23919p0.get(i9);
                u0Var.getClass();
                o();
                View view3 = u0Var.f23808i;
                if (view3 != null) {
                    this.f23901b.addView(view3);
                } else {
                    int i10 = u0Var.f23802a;
                    if (i10 == 0) {
                        g1 g1Var = new g1(0, getContext(), this.f23912i0, false, false);
                        g1Var.g(u0Var.f23805e, u0Var.f23804c, u0Var.d);
                        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var.setTag(Integer.valueOf(u0Var.f23803b));
                        this.f23901b.addView(g1Var);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        g1Var.setLayoutParams(layoutParams);
                        g1Var.setOnClickListener(new mh.k3(4, u0Var, this));
                        Integer num = u0Var.f23812m;
                        if (num != null && u0Var.f23813n != null) {
                            g1Var.c(num.intValue(), u0Var.f23813n.intValue());
                        }
                        u0Var.f23808i = g1Var;
                    } else if (i10 == 1) {
                        l1 l1Var = new l1(getContext(), f6.H8, b6Var);
                        l1Var.setTag(R.id.fit_width_tag, 1);
                        this.f23901b.a(l1Var, g7.e6.n(-1, 8));
                        u0Var.f23808i = l1Var;
                    } else if (i10 == 2) {
                        g1 g1Var2 = new g1(0, getContext(), this.f23912i0, false, false);
                        g1Var2.g(u0Var.f23805e, u0Var.f23804c, u0Var.d);
                        g1Var2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        g1Var2.setRightIcon(R.drawable.msg_arrowright);
                        g1Var2.getRightIcon().setVisibility(u0Var.f23811l);
                        this.f23901b.addView(g1Var2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) g1Var2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        g1Var2.setLayoutParams(layoutParams2);
                        g1Var2.C = new g0(this, this.f23901b.b(u0Var.f23807g), 1);
                        g1Var2.setOnClickListener(new h0(g1Var2, 1));
                        this.f23901b.f22693c = true;
                        Integer num2 = u0Var.f23812m;
                        if (num2 != null && u0Var.f23813n != null) {
                            g1Var2.c(num2.intValue(), u0Var.f23813n.intValue());
                        }
                        u0Var.f23808i = g1Var2;
                    } else if (i10 == 3) {
                        l80 l80Var = new l80(getContext(), null);
                        l80Var.setTag(R.id.fit_width_tag, 1);
                        l80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        l80Var.setTextSize(1, u0Var.h);
                        l80Var.setTextColor(f6.w0(null, f6.E8, false));
                        l80Var.setMovementMethod(LinkMovementMethod.getInstance());
                        l80Var.setLinkTextColor(f6.w0(null, f6.J6, false));
                        l80Var.setText(u0Var.f23805e);
                        l80Var.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.f23901b.a(l80Var, g7.e6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        u0Var.f23808i = l80Var;
                    }
                }
                View view4 = u0Var.f23808i;
                if (view4 != null) {
                    view4.setVisibility(u0Var.f23810k);
                    lh lhVar = u0Var.f23809j;
                    if (lhVar != null) {
                        u0Var.f23808i.setOnClickListener(lhVar);
                    }
                }
            }
            f10 = 8.0f;
            this.f23919p0.clear();
        }
        if (this.f23901b != null) {
            z zVar = this.f23903c;
            if (zVar == null || !zVar.f24000c || (kVar = zVar.f23999b) == null || kVar.s()) {
                p pVar = this.H;
                if (pVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(pVar);
                    this.H = null;
                }
                o1 o1Var2 = this.d;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    this.d.d(true);
                    return;
                }
                this.f23911h0 = w0Var;
                t0 t0Var = this.M;
                if (t0Var != null) {
                    t0Var.d();
                }
                if (this.f23901b.getParent() != null) {
                    ((ViewGroup) this.f23901b.getParent()).removeView(this.f23901b);
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f23901b;
                if (view != null) {
                    ?? n5Var = new kh.n5(this, getContext(), view);
                    n5Var.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    ViewPropertyAnimator duration = frameLayout.animate().alpha(1.0f).setDuration(100L);
                    if (this.f23901b.v) {
                        j10 = 165;
                    } else {
                        j10 = 0;
                    }
                    duration.setStartDelay(j10).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof g1) || (view instanceof LinearLayout)) {
                        ig.a aVar = this.m0;
                        if (aVar != null) {
                            kg.d c10 = aVar.c(this.f23901b, null, true);
                            c10.n(this.f23917n0);
                            c10.p(AndroidUtilities.dp(12.0f));
                            c10.o(AndroidUtilities.dp(f10));
                            c10.h.f14805e = true;
                            frameLayout.setBackground(c10);
                        } else {
                            Drawable mutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            mutate.setColorFilter(new PorterDuffColorFilter(this.f23901b.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(mutate);
                        }
                    }
                    frameLayout.addView(view, g7.e6.c(-2.0f, -1));
                    n5Var.addView(frameLayout, g7.e6.n(-1, -2));
                    n5Var.addView(this.f23901b, g7.e6.t(-2, -2, 0, 0, -10, 0, 0));
                    this.f23901b.setTopView(frameLayout);
                    actionBarPopupWindow$ActionBarPopupWindowLayout = n5Var;
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setTopView(null);
                    frameLayout = null;
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                if (this.m0 != null) {
                    x60.U(this.f23901b, f6.l1(0.06f, f6.v0(f6.E8, b6Var)));
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
                    this.d.f23688b = z13;
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
                    public final boolean onKey(View view5, int i11, KeyEvent keyEvent) {
                        o1 o1Var4;
                        w0 w0Var2 = w0.this;
                        w0Var2.getClass();
                        if (i11 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (o1Var4 = w0Var2.d) != null && o1Var4.isShowing()) {
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
                            t0Var2.c();
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(ll.d(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.f23901b.getSwipeBack() != null && (childAt = this.f23901b.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
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
                k1 k1Var = this.f23901b.H;
                int childCount = k1Var.getChildCount();
                View view5 = null;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt2 = k1Var.getChildAt(i11);
                    if (childAt2.getVisibility() == 0) {
                        if (view2 == null) {
                            view2 = childAt2;
                        }
                        view5 = childAt2;
                    }
                }
                boolean z14 = false;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt3 = k1Var.getChildAt(i12);
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
                if (this.f23901b.getSwipeBack() != null) {
                    this.f23901b.getSwipeBack().b(false);
                }
                this.d.h();
                float f11 = this.f23909f0;
                if (f11 > 0.0f) {
                    this.d.c(f11);
                }
            }
        }
    }

    public final void N() {
        if (this.f23908f != null) {
            for (int i9 = 0; i9 < this.f23908f.getChildCount(); i9++) {
                if (this.f23908f.getChildAt(i9) instanceof v0) {
                    ((v0) this.f23908f.getChildAt(i9)).a();
                }
            }
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23901b;
        b6 b6Var = this.f23912i0;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            for (int i10 = 0; i10 < this.f23901b.getItemsCount(); i10++) {
                if (this.f23901b.H.getChildAt(i10) instanceof g1) {
                    ((g1) this.f23901b.H.getChildAt(i10)).setSelectorColor(f6.v0(f6.I5, b6Var));
                }
            }
        }
        fg.g gVar = this.f23906e;
        if (gVar != null) {
            int i11 = f6.C8;
            gVar.setCursorColor(f6.v0(i11, b6Var));
            this.f23906e.setHintTextColor(f6.v0(f6.D8, b6Var));
            this.f23906e.setTextColor(f6.v0(i11, b6Var));
            this.f23906e.setHighlightColor(f6.v0(f6.f23312uf, b6Var));
            this.f23906e.setHandlesColor(f6.v0(f6.f23325vf, b6Var));
        }
    }

    public final void O(boolean z10, boolean z11) {
        float f10;
        int i9;
        int i10;
        ScrollView scrollView;
        z zVar = this.f23903c;
        if (zVar != null) {
            i10 = zVar.getTop() + (-zVar.f23999b.getMeasuredHeight());
            i9 = zVar.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            float measuredHeight = getMeasuredHeight() * scaleY;
            if (this.I != 2) {
                f10 = getTranslationY();
            } else {
                f10 = 0.0f;
            }
            i9 = -((int) (measuredHeight - (f10 / scaleY)));
            i10 = this.T;
        }
        int i11 = i9 + i10 + this.J;
        if (z10 && (scrollView = this.f23901b.G) != null) {
            scrollView.scrollTo(0, 0);
        }
        View view = this.f23911h0;
        if (view == null) {
            view = this;
        }
        if (zVar != null) {
            k kVar = zVar.f23999b;
            if (this.I == 0) {
                if (z10) {
                    this.d.showAsDropDown(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.K, i11);
                }
                if (z11) {
                    this.d.update(kVar, ((view.getMeasuredWidth() + (zVar.getLeft() + view.getLeft())) - this.d.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.K, i11, -1, -1);
                    return;
                }
                return;
            }
            if (z10) {
                if (this.f23900a0) {
                    this.d.showAtLocation(kVar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i11);
                } else {
                    this.d.showAsDropDown(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i11);
                }
            }
            if (z11) {
                this.d.update(kVar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.K, i11, -1, -1);
                return;
            }
            return;
        }
        int i12 = this.I;
        if (i12 == 0) {
            if (getParent() != null) {
                View view2 = (View) getParent();
                if (z10) {
                    this.d.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i11);
                }
                if (z11) {
                    this.d.update(view2, ((getMeasuredWidth() + getLeft()) - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i11, -1, -1);
                }
            }
        } else if (i12 == 1) {
            if (z10) {
                this.d.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.U + this.K, i11);
            }
            if (z11) {
                this.d.update(this, (-AndroidUtilities.dp(8.0f)) + this.U + this.K, i11, -1, -1);
            }
        } else {
            if (z10) {
                this.d.showAsDropDown(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i11);
            }
            if (z11) {
                this.d.update(this, (getMeasuredWidth() - this.d.getContentView().getMeasuredWidth()) + this.U + this.K, i11, -1, -1);
            }
        }
    }

    public final l1 a(int i9) {
        o();
        l1 l1Var = new l1(getContext(), f6.H8, this.f23912i0);
        if (i9 != -1) {
            l1Var.setTag(Integer.valueOf(i9));
        }
        l1Var.setTag(R.id.fit_width_tag, 1);
        this.f23901b.a(l1Var, g7.e6.n(-1, 8));
        return l1Var;
    }

    public final TextView b(int i9) {
        o();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i9);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.f23901b.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int dp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = dp;
        layoutParams.topMargin = dp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final g1 d(int i9, int i10, Drawable drawable, CharSequence charSequence, boolean z10, boolean z11, b6 b6Var) {
        o();
        g1 g1Var = new g1(z11 ? 1 : 0, getContext(), b6Var, false, false);
        g1Var.g(charSequence, i10, drawable);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setTag(Integer.valueOf(i9));
        this.f23901b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.setOnClickListener(new ih.b2(2, this, z10));
        return g1Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f23915l0) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public final g1 e(int i9, int i10, String str) {
        return d(i9, i10, null, str, true, false, this.f23912i0);
    }

    public final g1 f(int i9, int i10, String str, b6 b6Var) {
        return d(i9, i10, null, str, true, false, b6Var);
    }

    public final void g(int i9, CharSequence charSequence) {
        o();
        TextView textView = new TextView(getContext());
        textView.setTextColor(f6.v0(f6.E8, this.f23912i0));
        textView.setBackgroundDrawable(f6.K0(false));
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
        textView.setTag(Integer.valueOf(i9));
        textView.setText(charSequence);
        this.f23901b.addView(textView);
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
        pi0 pi0Var = this.f23924x;
        if (pi0Var != null) {
            return pi0Var;
        }
        return this.A;
    }

    public pi0 getIconView() {
        return this.f23924x;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f23914k0;
    }

    public ActionBarPopupWindow$ActionBarPopupWindowLayout getPopupLayout() {
        if (this.f23901b == null) {
            o();
        }
        return this.f23901b;
    }

    public ImageView getSearchClearButton() {
        return this.f23922s;
    }

    public FrameLayout getSearchContainer() {
        return this.B;
    }

    public EditTextBoldCursor getSearchField() {
        k();
        return this.f23906e;
    }

    public TextView getTextView() {
        return this.A;
    }

    public int getVisibleSubItemsCount() {
        int i9 = 0;
        for (int i10 = 0; i10 < this.f23901b.getItemsCount(); i10++) {
            View childAt = this.f23901b.H.getChildAt(i10);
            if (childAt != null && childAt.getVisibility() == 0) {
                i9++;
            }
        }
        return i9;
    }

    public final void h(org.telegram.ui.Cells.k kVar, int i9) {
        o();
        kVar.setLayoutParams(new LinearLayout.LayoutParams(-2, i9));
        this.f23901b.addView(kVar);
        kVar.setTag(8);
        kVar.setOnClickListener(new b0(this, 1));
        kVar.setBackgroundDrawable(f6.K0(false));
    }

    public final g1 i(int i9, b11 b11Var, String str, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o();
        g1 g1Var = new g1(0, getContext(), this.f23912i0, false, false);
        g1Var.g(str, i9, b11Var);
        g1Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        g1Var.setRightIcon(R.drawable.msg_arrowright);
        this.f23901b.addView(g1Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) g1Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        g1Var.setLayoutParams(layoutParams);
        g1Var.C = new g0(this, this.f23901b.b(actionBarPopupWindow$ActionBarPopupWindowLayout), 0);
        g1Var.setOnClickListener(new h0(g1Var, 0));
        this.f23901b.f22693c = true;
        return g1Var;
    }

    public final void j() {
        e5 e5Var;
        TextView textView;
        e5 e5Var2;
        if (this.f23922s != null) {
            boolean p6 = p();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!p6 && TextUtils.isEmpty(this.f23906e.getText()) && (((e5Var = this.D) == null || !e5Var.f()) && ((textView = this.h) == null || textView.getVisibility() != 0 || ((e5Var2 = this.D) != null && !e5Var2.r())))) {
                if (this.f23922s.getTag() != null) {
                    this.f23922s.setTag(null);
                    AnimatorSet animatorSet = this.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (this.W) {
                        AnimatorSet duration = new AnimatorSet().setDuration(180L);
                        duration.setInterpolator(new DecelerateInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final w0 f22817b;

                            {
                                this.f22817b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (r2) {
                                    case 0:
                                        w0 w0Var = this.f22817b;
                                        w0Var.getClass();
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view = w0Var.f23923w;
                                        if (view != null) {
                                            view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                            return;
                                        }
                                        return;
                                    default:
                                        w0 w0Var2 = this.f22817b;
                                        w0Var2.getClass();
                                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        View view2 = w0Var2.f23923w;
                                        if (view2 != null) {
                                            view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        duration.playTogether(ObjectAnimator.ofFloat(this.f23922s, property4, 0.0f), ObjectAnimator.ofFloat(this.f23922s, property3, 0.0f), ObjectAnimator.ofFloat(this.f23922s, property2, 0.0f), ObjectAnimator.ofFloat(this.f23922s, property, 45.0f), ofFloat);
                        duration.addListener(new m0(this, 0));
                        duration.start();
                        this.v = duration;
                        return;
                    }
                    this.f23922s.setAlpha(0.0f);
                    this.f23922s.setRotation(45.0f);
                    this.f23922s.setScaleX(0.0f);
                    this.f23922s.setScaleY(0.0f);
                    this.f23922s.setVisibility(4);
                    this.W = true;
                }
            } else if (this.f23922s.getTag() == null) {
                this.f23922s.setTag(1);
                AnimatorSet animatorSet2 = this.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.f23922s.setVisibility(0);
                if (this.W) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final w0 f22817b;

                        {
                            this.f22817b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (r2) {
                                case 0:
                                    w0 w0Var = this.f22817b;
                                    w0Var.getClass();
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = w0Var.f23923w;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue);
                                        return;
                                    }
                                    return;
                                default:
                                    w0 w0Var2 = this.f22817b;
                                    w0Var2.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = w0Var2.f23923w;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * floatValue2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.f23922s, property4, 1.0f), ObjectAnimator.ofFloat(this.f23922s, property3, 1.0f), ObjectAnimator.ofFloat(this.f23922s, property2, 1.0f), ObjectAnimator.ofFloat(this.f23922s, property, 0.0f), ofFloat2);
                    duration2.addListener(new m0(this, 1));
                    duration2.start();
                    this.v = duration2;
                    return;
                }
                this.f23922s.setAlpha(1.0f);
                this.f23922s.setRotation(0.0f);
                this.f23922s.setScaleX(1.0f);
                this.f23922s.setScaleY(1.0f);
                View view = this.f23923w;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.W = true;
            }
        }
    }

    public final void k() {
        boolean z10;
        int i9;
        if (this.B == null && this.C) {
            r0 r0Var = new r0(this, getContext(), 0);
            this.B = r0Var;
            if (this.f23913j0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r0Var.setClipChildren(z10);
            this.f23899a = null;
            r0 r0Var2 = this.B;
            LinearLayout.LayoutParams m10 = g7.e6.m(1.0f, 0, -1, this.f23913j0 + 6, 0, 0);
            z zVar = this.f23903c;
            zVar.addView(r0Var2, 0, m10);
            this.B.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.h;
            int i10 = f6.C8;
            b6 b6Var = this.f23912i0;
            textView2.setTextColor(f6.v0(i10, b6Var));
            this.h.setSingleLine(true);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
            this.h.setVisibility(8);
            TextView textView3 = this.h;
            if (LocaleController.isRTL) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            textView3.setGravity(i9);
            fg.g gVar = new fg.g(this, getContext(), 3);
            this.f23906e = gVar;
            gVar.setScrollContainer(false);
            this.f23906e.setCursorWidth(1.5f);
            this.f23906e.setCursorColor(f6.v0(i10, b6Var));
            this.f23906e.setTextSize(1, 18.0f);
            this.f23906e.setHintTextColor(f6.v0(f6.D8, b6Var));
            this.f23906e.setTextColor(f6.v0(i10, b6Var));
            this.f23906e.setSingleLine(true);
            this.f23906e.setBackgroundResource(0);
            this.f23906e.setPadding(0, 0, 0, 0);
            this.f23906e.setInputType(this.f23906e.getInputType() | 524288);
            if (Build.VERSION.SDK_INT < 23) {
                this.f23906e.setCustomSelectionActionModeCallback(new j0(0));
            }
            this.f23906e.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView4, int i11, KeyEvent keyEvent) {
                    if (keyEvent != null) {
                        if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                            w0 w0Var = w0.this;
                            AndroidUtilities.hideKeyboard(w0Var.f23906e);
                            e5 e5Var = w0Var.D;
                            if (e5Var != null) {
                                e5Var.p(w0Var.f23906e);
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            });
            this.f23906e.addTextChangedListener(new k0(this));
            this.f23906e.setImeOptions(234881027);
            this.f23906e.setTextIsSelectable(false);
            this.f23906e.setHighlightColor(f6.v0(f6.f23312uf, b6Var));
            this.f23906e.setHandlesColor(f6.v0(f6.f23325vf, b6Var));
            CharSequence charSequence = this.f23916n;
            if (charSequence != null) {
                this.f23906e.setHint(charSequence);
                setContentDescription(this.f23916n);
            }
            CharSequence charSequence2 = this.f23921r;
            if (charSequence2 != null) {
                this.f23906e.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f23908f = linearLayout;
            linearLayout.setOrientation(0);
            this.f23908f.setVisibility(0);
            if (!LocaleController.isRTL) {
                this.B.addView(this.h, g7.e6.d(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.B.addView(this.f23906e, g7.e6.d(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.f23908f, g7.e6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            } else {
                this.B.addView(this.f23908f, g7.e6.d(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.f23906e, g7.e6.d(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.B.addView(this.h, g7.e6.d(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            }
            this.f23908f.setClipChildren(false);
            l0 l0Var = new l0(this, getContext(), 0);
            this.f23922s = l0Var;
            kh.e2 e2Var = new kh.e2(1, this);
            this.S = e2Var;
            l0Var.setImageDrawable(e2Var);
            this.f23922s.setBackground(f6.f0(zVar.f23999b.m0, 1, -1));
            this.f23922s.setScaleType(ImageView.ScaleType.CENTER);
            this.f23922s.setAlpha(0.0f);
            this.f23922s.setRotation(45.0f);
            this.f23922s.setScaleX(0.0f);
            this.f23922s.setScaleY(0.0f);
            this.f23922s.setOnClickListener(new b0(this, 0));
            this.f23922s.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.B.addView(this.f23922s, g7.e6.e(48, -1, 21));
        }
    }

    public final void l() {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < this.f23901b.getItemsCount()) {
                if (this.f23901b.H.getChildAt(i10).getVisibility() == 0) {
                    break;
                }
                i10++;
            } else {
                i9 = 8;
                break;
            }
        }
        if (i9 != getVisibility()) {
            setVisibility(i9);
        }
    }

    public final void m() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f23904c0;
            if (i9 < arrayList.size()) {
                if (((of.m0) arrayList.get(i9)).h) {
                    arrayList.remove(i9);
                    i9--;
                }
                i9++;
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
        if (this.f23901b != null) {
            return;
        }
        this.E = new Rect();
        this.F = new int[2];
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.f23912i0);
        this.f23901b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        ig.a aVar = this.m0;
        if (aVar != null) {
            kg.d c10 = aVar.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, true);
            c10.n(this.f23917n0);
            c10.p(AndroidUtilities.dp(12.0f));
            c10.o(AndroidUtilities.dp(8.0f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c10);
        }
        this.f23901b.setOnTouchListener(new View.OnTouchListener() {
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
        this.f23901b.setDispatchKeyEventListener(new n(this, 2));
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f23924x != null) {
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
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
                p pVar = new p(this, 1);
                this.H = pVar;
                AndroidUtilities.runOnUIThread(pVar, 200L);
            }
        } else if (motionEvent.getActionMasked() == 2) {
            if (this.f23902b0 && q() && ((o1Var2 = this.d) == null || !o1Var2.isShowing())) {
                if (motionEvent.getY() > getHeight()) {
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    M(null, null);
                    return true;
                }
            } else if (this.f23902b0 && (o1Var = this.d) != null && o1Var.isShowing()) {
                getLocationOnScreen(this.F);
                float x10 = motionEvent.getX() + this.F[0];
                float y10 = motionEvent.getY();
                int[] iArr = this.F;
                float f10 = y10 + iArr[1];
                this.f23901b.getLocationOnScreen(iArr);
                int[] iArr2 = this.F;
                float f11 = x10 - iArr2[0];
                float f12 = f10 - iArr2[1];
                this.G = null;
                for (int i9 = 0; i9 < this.f23901b.getItemsCount(); i9++) {
                    View childAt = this.f23901b.H.getChildAt(i9);
                    childAt.getHitRect(this.E);
                    Object tag = childAt.getTag();
                    if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                        if (!this.E.contains((int) f11, (int) f12)) {
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
                    z zVar = this.f23903c;
                    if (zVar != null) {
                        zVar.o(((Integer) this.G.getTag()).intValue());
                    } else {
                        s0 s0Var = this.L;
                        if (s0Var != null) {
                            s0Var.i(((Integer) this.G.getTag()).intValue());
                        }
                    }
                    this.d.d(this.N);
                } else if (this.f23902b0) {
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
        ArrayList arrayList = this.f23904c0;
        if (!arrayList.isEmpty()) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (((of.m0) arrayList.get(i9)).h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean q() {
        if (this.f23901b == null) {
            ArrayList arrayList = this.f23919p0;
            if (arrayList == null || arrayList.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void r(int i9) {
        u0 u0Var;
        View findViewWithTag;
        HashMap hashMap = this.f23920q0;
        if (hashMap == null) {
            u0Var = null;
        } else {
            u0Var = (u0) hashMap.get(Integer.valueOf(i9));
        }
        if (u0Var != null) {
            u0Var.e(8);
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i9))) != null && findViewWithTag.getVisibility() != 8) {
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

    public void setAdditionalXOffset(int i9) {
        this.U = i9;
    }

    public void setAdditionalYOffset(int i9) {
        this.T = i9;
    }

    public void setDelegate(s0 s0Var) {
        this.L = s0Var;
    }

    public void setDimMenu(float f10) {
        this.f23909f0 = f10;
    }

    public void setFitSubItems(boolean z10) {
        this.f23901b.setFitItems(z10);
    }

    public void setFixBackground(boolean z10) {
        this.f23915l0 = z10;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z10) {
        this.f23900a0 = z10;
    }

    public void setIcon(Drawable drawable) {
        pi0 pi0Var = this.f23924x;
        if (pi0Var == null) {
            return;
        }
        if (drawable instanceof mi0) {
            pi0Var.setAnimation((mi0) drawable);
        } else {
            pi0Var.setImageDrawable(drawable);
        }
        this.f23925y = 0;
    }

    public void setIconColor(int i9) {
        pi0 pi0Var = this.f23924x;
        if (pi0Var != null) {
            pi0Var.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.A;
        if (textView != null) {
            textView.setTextColor(i9);
        }
        l0 l0Var = this.f23922s;
        if (l0Var != null) {
            l0Var.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setLayoutInScreen(boolean z10) {
        this.Q = z10;
    }

    public void setLongClickEnabled(boolean z10) {
        this.V = z10;
    }

    public void setMenuXOffset(int i9) {
        this.K = i9;
    }

    public void setMenuYOffset(int i9) {
        this.J = i9;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f23914k0 = onClickListener;
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
            o1Var.f23688b = z10;
        }
        this.R = z10;
    }

    public void setPopupItemsSelectorColor(int i9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
            int childCount = k1Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = k1Var.getChildAt(i10);
                if (childAt instanceof g1) {
                    ((g1) childAt).setSelectorColor(i9);
                }
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.f23923w = view;
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
        this.f23916n = charSequence;
        if (this.h == null) {
            return;
        }
        this.f23906e.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public void setSearchPaddingStart(int i9) {
        boolean z10;
        this.f23913j0 = i9;
        r0 r0Var = this.B;
        if (r0Var != null) {
            ((ViewGroup.MarginLayoutParams) r0Var.getLayoutParams()).leftMargin = AndroidUtilities.dp(i9);
            r0 r0Var2 = this.B;
            if (this.f23913j0 != 0) {
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
        kh.e2 e2Var = this.S;
        if (e2Var == null) {
            return;
        }
        if (z10) {
            e2Var.f33974e = true;
            e2Var.f33972b = System.currentTimeMillis();
            e2Var.invalidateSelf();
            return;
        }
        e2Var.f33974e = false;
    }

    public void setShowSubmenuByMove(boolean z10) {
        this.f23902b0 = z10;
    }

    public void setShowedFromBottom(boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(z10);
    }

    public void setSubMenuDelegate(t0 t0Var) {
        this.M = t0Var;
    }

    public void setSubMenuOpenSide(int i9) {
        this.I = i9;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.A;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f10) {
        this.f23910g0 = f10;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10 + this.f23910g0);
    }

    public void setupPopupRadialSelectors(int i9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23901b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.setupRadialSelectors(i9);
        }
    }

    public final boolean t() {
        o1 o1Var = this.d;
        if (o1Var != null && o1Var.isShowing()) {
            return true;
        }
        return false;
    }

    public final u0 u(int i9, int i10, String str) {
        u0 u0Var = new u0(0);
        u0Var.f23803b = i9;
        u0Var.f23804c = i10;
        u0Var.d = null;
        u0Var.f23805e = str;
        u0Var.f23806f = true;
        A(u0Var);
        return u0Var;
    }

    public final void v(mi0 mi0Var, String str) {
        u0 u0Var = new u0(0);
        u0Var.f23803b = 29;
        u0Var.f23804c = 0;
        u0Var.d = mi0Var;
        u0Var.f23805e = str;
        u0Var.f23806f = true;
        A(u0Var);
    }

    public final u0 w(int i9, co coVar) {
        u0 u0Var = new u0(2);
        u0Var.f23804c = i9;
        u0Var.d = null;
        u0Var.f23805e = null;
        u0Var.f23807g = coVar;
        A(u0Var);
        return u0Var;
    }

    public final u0 x() {
        u0 u0Var = new u0(3);
        u0Var.f23805e = "";
        u0Var.h = 13;
        A(u0Var);
        return u0Var;
    }

    public final void y() {
        Integer num;
        boolean z10;
        ArrayList arrayList = this.f23904c0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        r0 r0Var = this.B;
        if (r0Var != null && r0Var.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new o0(0).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) gr.f28845g);
            transitionSet.addListener((Transition.TransitionListener) new p0(this));
            TransitionManager.beginDelayedTransition(this.f23908f, transitionSet);
        }
        if (this.f23908f != null) {
            int i9 = 0;
            while (i9 < this.f23908f.getChildCount()) {
                if (!arrayList2.remove(((v0) this.f23908f.getChildAt(i9)).getFilter())) {
                    this.f23908f.removeViewAt(i9);
                    i9--;
                }
                i9++;
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            of.m0 m0Var = (of.m0) arrayList2.get(i10);
            m0Var.getClass();
            v0 v0Var = new v0(getContext(), this.f23912i0);
            v0Var.setData(m0Var);
            v0Var.setOnClickListener(new mh.k3(3, this, v0Var));
            this.f23908f.addView(v0Var, g7.e6.t(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.f23908f != null) {
            for (int i11 = 0; i11 < this.f23908f.getChildCount(); i11++) {
                v0 v0Var2 = (v0) this.f23908f.getChildAt(i11);
                if (i11 == this.f23905d0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v0Var2.setExpanded(z10);
            }
        }
        LinearLayout linearLayout = this.f23908f;
        if (linearLayout != null) {
            if (!isEmpty) {
                num = 1;
            } else {
                num = null;
            }
            linearLayout.setTag(num);
        }
        float x10 = this.f23906e.getX();
        if (this.B.getTag() != null) {
            this.f23906e.getViewTreeObserver().addOnPreDrawListener(new q0(this, x10));
        }
        j();
    }

    public final void z(boolean z10) {
        z zVar;
        k();
        r0 r0Var = this.B;
        if (r0Var != null && r0Var.getVisibility() != 0 && (zVar = this.f23903c) != null) {
            zVar.f23999b.v(L(z10));
        }
    }

    public w0(Context context, z zVar, int i9, int i10) {
        this(context, zVar, i9, i10, false, null);
    }

    public w0(Context context, z zVar, int i9, int i10, boolean z10, b6 b6Var) {
        super(context);
        new ArrayList();
        this.N = true;
        this.R = true;
        this.W = true;
        this.f23902b0 = true;
        this.f23904c0 = new ArrayList();
        this.f23905d0 = -1;
        this.f23907e0 = new AnimationNotificationsLocker();
        this.f23912i0 = b6Var;
        if (i9 != 0) {
            setBackgroundDrawable(f6.f0(i9, z10 ? 5 : 1, -1));
        }
        this.f23903c = zVar;
        if (z10) {
            TextView textView = new TextView(context);
            this.A = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i10 != 0) {
                textView.setTextColor(i10);
            }
            addView(textView, g7.e6.c(-1.0f, -2));
            return;
        }
        ?? imageView = new ImageView(context);
        this.f23924x = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, g7.e6.c(-1.0f, -1));
        if (i10 != 0) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i9) {
        pi0 pi0Var = this.f23924x;
        if (pi0Var == null) {
            return;
        }
        this.f23925y = i9;
        pi0Var.setImageResource(i9);
    }
}
