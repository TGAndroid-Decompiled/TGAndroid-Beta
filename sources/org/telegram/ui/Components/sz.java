package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sz extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs {
    public static final int f39734x1 = 0;
    public int f39735m1;
    public final di.b1 n1;
    public final org.telegram.ui.l4 f39736o1;
    public final TextView f39737p1;
    public AnimatorSet f39738q1;
    public final View f39739r1;
    public int f39740s1;
    public boolean f39741t1;
    public org.telegram.ui.zr f39742u1;
    public final ArrayList f39743v1;
    public final ArrayList f39744w1;

    public sz(org.telegram.ui.cx cxVar, ArrayList arrayList) {
        super(cxVar.getParentActivity(), false);
        O();
        this.f39744w1 = arrayList;
        this.f39743v1 = new ArrayList(cxVar.getMessagesController().Q0);
        int i7 = 0;
        while (i7 < this.f39743v1.size()) {
            if (((org.telegram.messenger.ro) this.f39743v1.get(i7)).d()) {
                this.f39743v1.remove(i7);
                i7--;
            }
            i7++;
        }
        Activity parentActivity = cxVar.getParentActivity();
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(this, parentActivity);
        this.f30173b = x0Var;
        x0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f30173b;
        int i10 = this.f30208u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(parentActivity);
        this.f39739r1 = view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f30173b.addView(view, layoutParams);
        di.b1 b1Var = new di.b1(20, parentActivity, this);
        this.n1 = b1Var;
        b1Var.setTag(14);
        getContext();
        b1Var.setLayoutManager(new v4.c0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(3, this, parentActivity);
        this.f39736o1 = l4Var;
        b1Var.setAdapter(l4Var);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        b1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.t6.l(b1Var, 21, org.telegram.ui.ActionBar.m6.A5, null);
        b1Var.setOnScrollListener(new oa(this, 11));
        b1Var.setOnItemClickListener(new o(this, 7));
        this.f30173b.addView(b1Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.f39737p1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29486j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.t6.G(textView, org.telegram.ui.ActionBar.m6.f29506k5, null);
        org.telegram.ui.ActionBar.t6.C(textView, org.telegram.ui.ActionBar.m6.f29524l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.gd.N0(2131750781, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f30173b.addView(textView, c8.ma.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25176l4);
    }

    public static void J0(sz szVar) {
        View view = szVar.f39739r1;
        TextView textView = szVar.f39737p1;
        di.b1 b1Var = szVar.n1;
        if (b1Var.getChildCount() <= 0) {
            int paddingTop = b1Var.getPaddingTop();
            szVar.f39740s1 = paddingTop;
            b1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(szVar.f39740s1);
            view.setTranslationY(szVar.f39740s1);
            szVar.f30173b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && mj0Var != null && mj0Var.b() == 0) {
            szVar.L0(false);
            i7 = top;
        } else {
            szVar.L0(true);
        }
        if (szVar.f39740s1 != i7) {
            szVar.f39740s1 = i7;
            b1Var.setTopGlowOffset(i7);
            textView.setTranslationY(szVar.f39740s1);
            view.setTranslationY(szVar.f39740s1);
            szVar.f30173b.invalidate();
        }
    }

    public static ArrayList K0(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.ro roVar, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            long longValue = ((Long) arrayList.get(i7)).longValue();
            if (org.telegram.messenger.n5.C(longValue)) {
                TLRPC.EncryptedChat c12 = g2Var.getMessagesController().c1(Integer.valueOf((int) (longValue & 4294967295L)));
                if (c12 != null) {
                    longValue = c12.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (roVar == null || ((!z10 || !roVar.h.contains(Long.valueOf(longValue))) && (z10 || !roVar.f26706i.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z11) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void L0(boolean z10) {
        Integer num;
        float f10;
        View view = this.f39739r1;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z10) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.f39738q1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f39738q1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f39738q1.setDuration(150L);
            this.f39738q1.addListener(new org.telegram.ui.on(9, this, z10));
            this.f39738q1.start();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25176l4) {
            org.telegram.messenger.g0.d0(this.n1, new fi.e(13));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25176l4);
    }

    @Override
    public final void s0() {
        super.s0();
        di.b1 b1Var = this.n1;
        if (b1Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0);
                if (w02 != this.f39735m1) {
                    this.f39735m1 = w02;
                    for (int i7 = 0; i7 < b1Var.getChildCount(); i7++) {
                        View childAt = b1Var.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.ActionBar.p2) && ((org.telegram.ui.ActionBar.p2) childAt).getTextView() != null) {
                            ((org.telegram.ui.ActionBar.p2) childAt).getTextView().setEmojiColor(w02);
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
