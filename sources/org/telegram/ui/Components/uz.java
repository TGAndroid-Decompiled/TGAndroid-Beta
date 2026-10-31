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
public final class uz extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public static final int f31089t1 = 0;
    public int f31090i1;
    public final ag.b1 f31091j1;
    public final fg.j f31092k1;
    public final TextView l1;
    public AnimatorSet f31093m1;
    public final View f31094n1;
    public int f31095o1;
    public boolean f31096p1;
    public org.telegram.ui.tt f31097q1;
    public final ArrayList f31098r1;
    public final ArrayList f31099s1;

    public uz(org.telegram.ui.ay ayVar, ArrayList arrayList) {
        super(ayVar.getParentActivity(), false);
        O();
        this.f31099s1 = arrayList;
        this.f31098r1 = new ArrayList(ayVar.getMessagesController().P0);
        int i10 = 0;
        while (i10 < this.f31098r1.size()) {
            if (((org.telegram.messenger.ap) this.f31098r1.get(i10)).e()) {
                this.f31098r1.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = ayVar.getParentActivity();
        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(this, parentActivity);
        this.f21586b = u0Var;
        u0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f21586b;
        int i11 = this.f21615t0;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.i0.L(48.0f);
        View view = new View(parentActivity);
        this.f31094n1 = view;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f21586b.addView(view, layoutParams);
        ag.b1 b1Var = new ag.b1(this, parentActivity, 15);
        this.f31091j1 = b1Var;
        b1Var.setTag(14);
        getContext();
        b1Var.setLayoutManager(new s4.a0(1, false));
        fg.j jVar = new fg.j(4, this, parentActivity);
        this.f31092k1 = jVar;
        b1Var.setAdapter(jVar);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        b1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.a7.m(b1Var, 21, org.telegram.ui.ActionBar.t6.A5, null);
        b1Var.setOnScrollListener(new ag.u(this, 23));
        b1Var.setOnItemClickListener(new k(this, 7));
        this.f21586b.addView(b1Var, w7.b6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.l1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.a7.H(textView, org.telegram.ui.ActionBar.t6.f21057k5, null);
        org.telegram.ui.ActionBar.a7.D(textView, org.telegram.ui.ActionBar.t6.f21075l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.cd.L0(2131750794, null));
        textView.setTypeface(org.telegram.messenger.i0.o());
        this.f21586b.addView(textView, w7.b6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
    }

    public static void I0(uz uzVar) {
        View view = uzVar.f31094n1;
        TextView textView = uzVar.l1;
        ag.b1 b1Var = uzVar.f31091j1;
        if (b1Var.getChildCount() <= 0) {
            int paddingTop = b1Var.getPaddingTop();
            uzVar.f31095o1 = paddingTop;
            b1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(uzVar.f31095o1);
            view.setTranslationY(uzVar.f31095o1);
            uzVar.f21586b.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && ck0Var != null && ck0Var.b() == 0) {
            uzVar.K0(false);
            i10 = top;
        } else {
            uzVar.K0(true);
        }
        if (uzVar.f31095o1 != i10) {
            uzVar.f31095o1 = i10;
            b1Var.setTopGlowOffset(i10);
            textView.setTranslationY(uzVar.f31095o1);
            view.setTranslationY(uzVar.f31095o1);
            uzVar.f21586b.invalidate();
        }
    }

    public static ArrayList J0(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.ap apVar, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (org.telegram.messenger.o5.C(longValue)) {
                TLRPC.EncryptedChat Z0 = k2Var.getMessagesController().Z0(Integer.valueOf((int) (longValue & 4294967295L)));
                if (Z0 != null) {
                    longValue = Z0.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (apVar == null || ((!z10 || !apVar.h.contains(Long.valueOf(longValue))) && (z10 || !apVar.f14650i.contains(Long.valueOf(longValue))))) {
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
        float f7;
        View view = this.f31094n1;
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
            AnimatorSet animatorSet = this.f31093m1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31093m1 = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f31093m1.setDuration(150L);
            this.f31093m1.addListener(new eg.m(24, this, z10));
            this.f31093m1.start();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19630i4) {
            org.telegram.messenger.i0.d0(this.f31091j1, new ag.z0(11));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
    }

    @Override
    public final void s0() {
        super.s0();
        ag.b1 b1Var = this.f31091j1;
        if (b1Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0);
                if (w02 != this.f31090i1) {
                    this.f31090i1 = w02;
                    for (int i10 = 0; i10 < b1Var.getChildCount(); i10++) {
                        View childAt = b1Var.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.ActionBar.s2) && ((org.telegram.ui.ActionBar.s2) childAt).getTextView() != null) {
                            ((org.telegram.ui.ActionBar.s2) childAt).getTextView().setEmojiColor(w02);
                        }
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
