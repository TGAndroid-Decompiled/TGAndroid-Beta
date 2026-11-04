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
public final class cz extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static final int f32857u1 = 0;
    public int f32858j1;
    public final ci.j1 k1;
    public final org.telegram.ui.n4 f32859l1;
    public final TextView m1;
    public AnimatorSet f32860n1;
    public final View f32861o1;
    public int f32862p1;
    public boolean f32863q1;
    public org.telegram.ui.ur f32864r1;
    public final ArrayList f32865s1;
    public final ArrayList f32866t1;

    public cz(org.telegram.ui.uw uwVar, ArrayList arrayList) {
        super(uwVar.getParentActivity(), false);
        N();
        this.f32866t1 = arrayList;
        this.f32865s1 = new ArrayList(uwVar.getMessagesController().Q0);
        int i3 = 0;
        while (i3 < this.f32865s1.size()) {
            if (((org.telegram.messenger.mo) this.f32865s1.get(i3)).e()) {
                this.f32865s1.remove(i3);
                i3--;
            }
            i3++;
        }
        Activity parentActivity = uwVar.getParentActivity();
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, parentActivity);
        this.f28586b = v0Var;
        v0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28586b;
        int i10 = this.f28618u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(parentActivity);
        this.f32861o1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f28586b.addView(view, layoutParams);
        ci.j1 j1Var = new ci.j1(20, parentActivity, this);
        this.k1 = j1Var;
        j1Var.setTag(14);
        getContext();
        j1Var.setLayoutManager(new u4.b0(1, false));
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(3, this, parentActivity);
        this.f32859l1 = n4Var;
        j1Var.setAdapter(n4Var);
        j1Var.setVerticalScrollBarEnabled(false);
        j1Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        j1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.r6.m(j1Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        j1Var.setOnScrollListener(new ji(this, 10));
        j1Var.setOnItemClickListener(new k(this, 7));
        this.f28586b.addView(j1Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.m1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.H(textView, org.telegram.ui.ActionBar.k6.f28006k5, null);
        org.telegram.ui.ActionBar.r6.D(textView, org.telegram.ui.ActionBar.k6.f28025l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.bd.M0(2131750794, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f28586b.addView(textView, b8.mf.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
    }

    public static void I0(cz czVar) {
        View view = czVar.f32861o1;
        TextView textView = czVar.m1;
        ci.j1 j1Var = czVar.k1;
        if (j1Var.getChildCount() <= 0) {
            int paddingTop = j1Var.getPaddingTop();
            czVar.f32862p1 = paddingTop;
            j1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(czVar.f32862p1);
            view.setTranslationY(czVar.f32862p1);
            czVar.f28586b.invalidate();
            return;
        }
        int i3 = 0;
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && bj0Var != null && bj0Var.b() == 0) {
            czVar.K0(false);
            i3 = top;
        } else {
            czVar.K0(true);
        }
        if (czVar.f32862p1 != i3) {
            czVar.f32862p1 = i3;
            j1Var.setTopGlowOffset(i3);
            textView.setTranslationY(czVar.f32862p1);
            view.setTranslationY(czVar.f32862p1);
            czVar.f28586b.invalidate();
        }
    }

    public static ArrayList J0(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.mo moVar, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            long longValue = ((Long) arrayList.get(i3)).longValue();
            if (org.telegram.messenger.m5.C(longValue)) {
                TLRPC.EncryptedChat a12 = d2Var.getMessagesController().a1(Integer.valueOf((int) (longValue & 4294967295L)));
                if (a12 != null) {
                    longValue = a12.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (moVar == null || ((!z10 || !moVar.h.contains(Long.valueOf(longValue))) && (z10 || !moVar.f24243i.contains(Long.valueOf(longValue))))) {
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

    public final void K0(boolean z10) {
        Integer num;
        float f10;
        View view = this.f32861o1;
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
            AnimatorSet animatorSet = this.f32860n1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32860n1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f32860n1.setDuration(150L);
            this.f32860n1.addListener(new s9(8, this, z10));
            this.f32860n1.start();
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            org.telegram.messenger.g0.d0(this.k1, new ei.e(12));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void s0() {
        super.s0();
        ci.j1 j1Var = this.k1;
        if (j1Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0);
                if (w02 != this.f32858j1) {
                    this.f32858j1 = w02;
                    for (int i3 = 0; i3 < j1Var.getChildCount(); i3++) {
                        View childAt = j1Var.getChildAt(i3);
                        if ((childAt instanceof org.telegram.ui.ActionBar.m2) && ((org.telegram.ui.ActionBar.m2) childAt).getTextView() != null) {
                            ((org.telegram.ui.ActionBar.m2) childAt).getTextView().setEmojiColor(w02);
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
