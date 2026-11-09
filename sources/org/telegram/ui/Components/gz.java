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
public final class gz extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final int f34097t1 = 0;
    public int f34098i1;
    public final bi.q1 f34099j1;
    public final org.telegram.ui.l4 f34100k1;
    public final TextView l1;
    public AnimatorSet f34101m1;
    public final View n1;
    public int f34102o1;
    public boolean f34103p1;
    public org.telegram.ui.yr f34104q1;
    public final ArrayList f34105r1;
    public final ArrayList f34106s1;

    public gz(org.telegram.ui.yw ywVar, ArrayList arrayList) {
        super(ywVar.getParentActivity(), false);
        N();
        this.f34106s1 = arrayList;
        this.f34105r1 = new ArrayList(ywVar.getMessagesController().P0);
        int i7 = 0;
        while (i7 < this.f34105r1.size()) {
            if (((org.telegram.messenger.vo) this.f34105r1.get(i7)).e()) {
                this.f34105r1.remove(i7);
                i7--;
            }
            i7++;
        }
        Activity parentActivity = ywVar.getParentActivity();
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, parentActivity);
        this.f28624b = v0Var;
        v0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28624b;
        int i10 = this.f28654t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(parentActivity);
        this.n1 = view;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.f28624b.addView(view, layoutParams);
        bi.q1 q1Var = new bi.q1(20, parentActivity, this);
        this.f34099j1 = q1Var;
        q1Var.setTag(14);
        getContext();
        q1Var.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(3, this, parentActivity);
        this.f34100k1 = l4Var;
        q1Var.setAdapter(l4Var);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        q1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.s6.l(q1Var, 21, org.telegram.ui.ActionBar.l6.A5, null);
        q1Var.setOnScrollListener(new ui(this, 8));
        q1Var.setOnItemClickListener(new k(this, 7));
        this.f28624b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.l1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.s6.G(textView, org.telegram.ui.ActionBar.l6.f27993k5, null);
        org.telegram.ui.ActionBar.s6.C(textView, org.telegram.ui.ActionBar.l6.f28011l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.id.M0(2131750793, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.f28624b.addView(textView, c8.ha.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25018i4);
    }

    public static void I0(gz gzVar) {
        View view = gzVar.n1;
        TextView textView = gzVar.l1;
        bi.q1 q1Var = gzVar.f34099j1;
        if (q1Var.getChildCount() <= 0) {
            int paddingTop = q1Var.getPaddingTop();
            gzVar.f34102o1 = paddingTop;
            q1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(gzVar.f34102o1);
            view.setTranslationY(gzVar.f34102o1);
            gzVar.f28624b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = q1Var.getChildAt(0);
        yi0 yi0Var = (yi0) q1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && yi0Var != null && yi0Var.b() == 0) {
            gzVar.K0(false);
            i7 = top;
        } else {
            gzVar.K0(true);
        }
        if (gzVar.f34102o1 != i7) {
            gzVar.f34102o1 = i7;
            q1Var.setTopGlowOffset(i7);
            textView.setTranslationY(gzVar.f34102o1);
            view.setTranslationY(gzVar.f34102o1);
            gzVar.f28624b.invalidate();
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
            if (voVar == null || ((!z9 || !voVar.h.contains(Long.valueOf(longValue))) && (z9 || !voVar.f26076i.contains(Long.valueOf(longValue))))) {
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
            AnimatorSet animatorSet = this.f34101m1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f34101m1 = animatorSet2;
            Property property = View.ALPHA;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f34101m1.setDuration(150L);
            this.f34101m1.addListener(new t9(8, this, z9));
            this.f34101m1.start();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25018i4) {
            org.telegram.messenger.g0.d0(this.f34099j1, new di.e(13));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25018i4);
    }

    @Override
    public final void s0() {
        super.s0();
        bi.q1 q1Var = this.f34099j1;
        if (q1Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, this.I0);
                if (w02 != this.f34098i1) {
                    this.f34098i1 = w02;
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
