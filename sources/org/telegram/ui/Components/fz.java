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
public final class fz extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls {
    public static final int f33691w1 = 0;
    public int l1;
    public final bi.q1 f33692m1;
    public final org.telegram.ui.l4 n1;
    public final TextView f33693o1;
    public AnimatorSet f33694p1;
    public final View f33695q1;
    public int f33696r1;
    public boolean f33697s1;
    public org.telegram.ui.zr f33698t1;
    public final ArrayList f33699u1;
    public final ArrayList f33700v1;

    public fz(org.telegram.ui.zw zwVar, ArrayList arrayList) {
        super(zwVar.getParentActivity(), false);
        N();
        this.f33700v1 = arrayList;
        this.f33699u1 = new ArrayList(zwVar.getMessagesController().P0);
        int i7 = 0;
        while (i7 < this.f33699u1.size()) {
            if (((org.telegram.messenger.vo) this.f33699u1.get(i7)).e()) {
                this.f33699u1.remove(i7);
                i7--;
            }
            i7++;
        }
        Activity parentActivity = zwVar.getParentActivity();
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, parentActivity);
        this.f28672b = v0Var;
        v0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28672b;
        int i10 = this.f28705t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(parentActivity);
        this.f33695q1 = view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f28672b.addView(view, layoutParams);
        bi.q1 q1Var = new bi.q1(20, parentActivity, this);
        this.f33692m1 = q1Var;
        q1Var.setTag(14);
        getContext();
        q1Var.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(3, this, parentActivity);
        this.n1 = l4Var;
        q1Var.setAdapter(l4Var);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        q1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.t6.l(q1Var, 21, org.telegram.ui.ActionBar.m6.A5, null);
        q1Var.setOnScrollListener(new ti(this, 8));
        q1Var.setOnItemClickListener(new j(this, 7));
        this.f28672b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.f33693o1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.t6.G(textView, org.telegram.ui.ActionBar.m6.f28018k5, null);
        org.telegram.ui.ActionBar.t6.C(textView, org.telegram.ui.ActionBar.m6.f28036l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.id.M0(2131750793, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f28672b.addView(textView, c8.ha.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25022i4);
    }

    public static void I0(fz fzVar) {
        View view = fzVar.f33695q1;
        TextView textView = fzVar.f33693o1;
        bi.q1 q1Var = fzVar.f33692m1;
        if (q1Var.getChildCount() <= 0) {
            int paddingTop = q1Var.getPaddingTop();
            fzVar.f33696r1 = paddingTop;
            q1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(fzVar.f33696r1);
            view.setTranslationY(fzVar.f33696r1);
            fzVar.f28672b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && xi0Var != null && xi0Var.b() == 0) {
            fzVar.K0(false);
            i7 = top;
        } else {
            fzVar.K0(true);
        }
        if (fzVar.f33696r1 != i7) {
            fzVar.f33696r1 = i7;
            q1Var.setTopGlowOffset(i7);
            textView.setTranslationY(fzVar.f33696r1);
            view.setTranslationY(fzVar.f33696r1);
            fzVar.f28672b.invalidate();
        }
    }

    public static ArrayList J0(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, ArrayList arrayList, boolean z9, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            long longValue = ((Long) arrayList.get(i7)).longValue();
            if (org.telegram.messenger.m5.C(longValue)) {
                TLRPC.EncryptedChat a12 = f2Var.getMessagesController().a1(Integer.valueOf((int) (longValue & 4294967295L)));
                if (a12 != null) {
                    longValue = a12.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (voVar == null || ((!z9 || !voVar.h.contains(Long.valueOf(longValue))) && (z9 || !voVar.f26080i.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z10) {
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

    public final void K0(boolean z9) {
        Integer num;
        float f10;
        View view = this.f33695q1;
        if ((z9 && view.getTag() != null) || (!z9 && view.getTag() == null)) {
            if (z9) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z9) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.f33694p1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33694p1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f33694p1.setDuration(150L);
            this.f33694p1.addListener(new s9(8, this, z9));
            this.f33694p1.start();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25022i4) {
            org.telegram.messenger.g0.d0(this.f33692m1, new di.e(13));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25022i4);
    }

    @Override
    public final void s0() {
        super.s0();
        bi.q1 q1Var = this.f33692m1;
        if (q1Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0);
                if (w02 != this.l1) {
                    this.l1 = w02;
                    for (int i7 = 0; i7 < q1Var.getChildCount(); i7++) {
                        View childAt = q1Var.getChildAt(i7);
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
