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
public final class fz extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final int f33690t1 = 0;
    public int f33691i1;
    public final bi.q1 f33692j1;
    public final org.telegram.ui.l4 f33693k1;
    public final TextView l1;
    public AnimatorSet f33694m1;
    public final View n1;
    public int f33695o1;
    public boolean f33696p1;
    public org.telegram.ui.wr f33697q1;
    public final ArrayList f33698r1;
    public final ArrayList f33699s1;

    public fz(org.telegram.ui.ww wwVar, ArrayList arrayList) {
        super(wwVar.getParentActivity(), false);
        N();
        this.f33699s1 = arrayList;
        this.f33698r1 = new ArrayList(wwVar.getMessagesController().P0);
        int i7 = 0;
        while (i7 < this.f33698r1.size()) {
            if (((org.telegram.messenger.vo) this.f33698r1.get(i7)).e()) {
                this.f33698r1.remove(i7);
                i7--;
            }
            i7++;
        }
        Activity parentActivity = wwVar.getParentActivity();
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, parentActivity);
        this.f28616b = v0Var;
        v0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28616b;
        int i10 = this.f28646t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(parentActivity);
        this.n1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f28616b.addView(view, layoutParams);
        bi.q1 q1Var = new bi.q1(20, parentActivity, this);
        this.f33692j1 = q1Var;
        q1Var.setTag(14);
        getContext();
        q1Var.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(3, this, parentActivity);
        this.f33693k1 = l4Var;
        q1Var.setAdapter(l4Var);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        q1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.r6.m(q1Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        q1Var.setOnScrollListener(new ui(this, 8));
        q1Var.setOnItemClickListener(new k(this, 7));
        this.f28616b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.l1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27957j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.H(textView, org.telegram.ui.ActionBar.k6.f27977k5, null);
        org.telegram.ui.ActionBar.r6.D(textView, org.telegram.ui.ActionBar.k6.f27995l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.hd.M0(2131750794, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f28616b.addView(textView, c8.ha.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
    }

    public static void I0(fz fzVar) {
        View view = fzVar.n1;
        TextView textView = fzVar.l1;
        bi.q1 q1Var = fzVar.f33692j1;
        if (q1Var.getChildCount() <= 0) {
            int paddingTop = q1Var.getPaddingTop();
            fzVar.f33695o1 = paddingTop;
            q1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(fzVar.f33695o1);
            view.setTranslationY(fzVar.f33695o1);
            fzVar.f28616b.invalidate();
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
        if (fzVar.f33695o1 != i7) {
            fzVar.f33695o1 = i7;
            q1Var.setTopGlowOffset(i7);
            textView.setTranslationY(fzVar.f33695o1);
            view.setTranslationY(fzVar.f33695o1);
            fzVar.f28616b.invalidate();
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
            if (voVar == null || ((!z9 || !voVar.h.contains(Long.valueOf(longValue))) && (z9 || !voVar.f26070i.contains(Long.valueOf(longValue))))) {
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
        View view = this.n1;
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
            AnimatorSet animatorSet = this.f33694m1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33694m1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f33694m1.setDuration(150L);
            this.f33694m1.addListener(new t9(8, this, z9));
            this.f33694m1.start();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25009i4) {
            org.telegram.messenger.g0.d0(this.f33692j1, new di.e(13));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
    }

    @Override
    public final void s0() {
        super.s0();
        bi.q1 q1Var = this.f33692j1;
        if (q1Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0);
                if (w02 != this.f33691i1) {
                    this.f33691i1 = w02;
                    for (int i7 = 0; i7 < q1Var.getChildCount(); i7++) {
                        View childAt = q1Var.getChildAt(i7);
                        if ((childAt instanceof org.telegram.ui.ActionBar.o2) && ((org.telegram.ui.ActionBar.o2) childAt).getTextView() != null) {
                            ((org.telegram.ui.ActionBar.o2) childAt).getTextView().setEmojiColor(w02);
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
