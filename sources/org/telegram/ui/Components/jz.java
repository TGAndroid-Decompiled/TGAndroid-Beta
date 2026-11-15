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
public final class jz extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public static final int f36204x1 = 0;
    public int f36205m1;
    public final di.c1 n1;
    public final org.telegram.ui.l4 f36206o1;
    public final TextView f36207p1;
    public AnimatorSet f36208q1;
    public final View f36209r1;
    public int f36210s1;
    public boolean f36211t1;
    public org.telegram.ui.zr f36212u1;
    public final ArrayList f36213v1;
    public final ArrayList f36214w1;

    public jz(org.telegram.ui.yw ywVar, ArrayList arrayList) {
        super(ywVar.getParentActivity(), false);
        O();
        this.f36214w1 = arrayList;
        this.f36213v1 = new ArrayList(ywVar.getMessagesController().Q0);
        int i7 = 0;
        while (i7 < this.f36213v1.size()) {
            if (((org.telegram.messenger.so) this.f36213v1.get(i7)).e()) {
                this.f36213v1.remove(i7);
                i7--;
            }
            i7++;
        }
        Activity parentActivity = ywVar.getParentActivity();
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, parentActivity);
        this.f29682b = v0Var;
        v0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f29682b;
        int i10 = this.f29717u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(parentActivity);
        this.f36209r1 = view;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f29682b.addView(view, layoutParams);
        di.c1 c1Var = new di.c1(20, parentActivity, this);
        this.n1 = c1Var;
        c1Var.setTag(14);
        getContext();
        c1Var.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(3, this, parentActivity);
        this.f36206o1 = l4Var;
        c1Var.setAdapter(l4Var);
        c1Var.setVerticalScrollBarEnabled(false);
        c1Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        c1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.q6.l(c1Var, 21, org.telegram.ui.ActionBar.j6.A5, null);
        c1Var.setOnScrollListener(new ri(this, 10));
        c1Var.setOnItemClickListener(new j(this, 7));
        this.f29682b.addView(c1Var, c8.ja.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.f36207p1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.q6.G(textView, org.telegram.ui.ActionBar.j6.f28977k5, null);
        org.telegram.ui.ActionBar.q6.C(textView, org.telegram.ui.ActionBar.j6.f28995l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.hd.M0(2131750793, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f29682b.addView(textView, c8.ja.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
    }

    public static void I0(jz jzVar) {
        View view = jzVar.f36209r1;
        TextView textView = jzVar.f36207p1;
        di.c1 c1Var = jzVar.n1;
        if (c1Var.getChildCount() <= 0) {
            int paddingTop = c1Var.getPaddingTop();
            jzVar.f36210s1 = paddingTop;
            c1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(jzVar.f36210s1);
            view.setTranslationY(jzVar.f36210s1);
            jzVar.f29682b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && cj0Var != null && cj0Var.b() == 0) {
            jzVar.K0(false);
            i7 = top;
        } else {
            jzVar.K0(true);
        }
        if (jzVar.f36210s1 != i7) {
            jzVar.f36210s1 = i7;
            c1Var.setTopGlowOffset(i7);
            textView.setTranslationY(jzVar.f36210s1);
            view.setTranslationY(jzVar.f36210s1);
            jzVar.f29682b.invalidate();
        }
    }

    public static ArrayList J0(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.so soVar, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            long longValue = ((Long) arrayList.get(i7)).longValue();
            if (org.telegram.messenger.m5.C(longValue)) {
                TLRPC.EncryptedChat a12 = e2Var.getMessagesController().a1(Integer.valueOf((int) (longValue & 4294967295L)));
                if (a12 != null) {
                    longValue = a12.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (soVar == null || ((!z10 || !soVar.h.contains(Long.valueOf(longValue))) && (z10 || !soVar.f26548i.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z11) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void K0(boolean z10) {
        Integer num;
        float f10;
        View view = this.f36209r1;
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
            AnimatorSet animatorSet = this.f36208q1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f36208q1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f36208q1.setDuration(150L);
            this.f36208q1.addListener(new org.telegram.ui.nn(9, this, z10));
            this.f36208q1.start();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25514i4) {
            org.telegram.messenger.g0.d0(this.n1, new fi.e(13));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
    }

    @Override
    public final void s0() {
        super.s0();
        di.c1 c1Var = this.n1;
        if (c1Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0);
                if (w02 != this.f36205m1) {
                    this.f36205m1 = w02;
                    for (int i7 = 0; i7 < c1Var.getChildCount(); i7++) {
                        View childAt = c1Var.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.ActionBar.n2) && ((org.telegram.ui.ActionBar.n2) childAt).getTextView() != null) {
                            ((org.telegram.ui.ActionBar.n2) childAt).getTextView().setEmojiColor(w02);
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
