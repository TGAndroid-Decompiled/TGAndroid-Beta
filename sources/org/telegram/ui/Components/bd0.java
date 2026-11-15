package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bd0 extends org.telegram.ui.ActionBar.u2 {
    public static final int J1 = 0;
    public final int A1;
    public final int B1;
    public final int C1;
    public final int D1;
    public final boolean E1;
    public dj F1;
    public final ArrayList G1;
    public final ArrayList H1;
    public final TLRPC.TL_userContact_old2 I1;
    public final cf f33250m1;
    public final uc0 n1;
    public final LinearLayout f33251o1;
    public final vc0 f33252p1;
    public final View f33253q1;
    public final View f33254r1;
    public final TextView f33255s1;
    public final org.telegram.ui.ActionBar.e2 f33256t1;
    public boolean f33257u1;
    public final Paint f33258v1;
    public int f33259w1;
    public AnimatorSet f33260x1;
    public AnimatorSet f33261y1;
    public final int f33262z1;

    public bd0(org.telegram.ui.ActionBar.e2 r19, org.telegram.messenger.d5 r20, org.telegram.tgnet.TLRPC.User r21, android.net.Uri r22, java.io.File r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, final org.telegram.ui.ActionBar.e6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bd0.<init>(org.telegram.ui.ActionBar.e2, org.telegram.messenger.d5, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.e6):void");
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void I0() {
        TextView textView = this.f33255s1;
        if (textView != null) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ji, this.J0);
            if (!textView.isEnabled()) {
                w02 &= Integer.MAX_VALUE;
            }
            if (textView.getCurrentTextColor() != w02) {
                textView.setTextColor(w02);
            }
        }
    }

    public final void J0(boolean z10) {
        boolean z11;
        boolean z12;
        float f10;
        float f11;
        Integer num;
        float f12;
        float f13;
        float f14;
        float f15;
        Integer num2 = 1;
        uc0 uc0Var = this.n1;
        View childAt = uc0Var.getChildAt(0);
        int top = childAt.getTop() - uc0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        vc0 vc0Var = this.f33252p1;
        if ((z11 && vc0Var.getTag() == null) || (!z11 && vc0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            vc0Var.setTag(num);
            AnimatorSet animatorSet = this.f33260x1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f33260x1 = null;
            }
            View view = this.f33253q1;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f33260x1 = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f33260x1;
                Property property = View.ALPHA;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vc0Var, property, f14);
                if (z11) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f15));
                this.f33260x1.addListener(new yc0(this, 0));
                this.f33260x1.start();
            } else {
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                vc0Var.setAlpha(f12);
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                view.setAlpha(f13);
            }
        }
        if (this.f33259w1 != top) {
            this.f33259w1 = top;
            this.f29682b.invalidate();
        }
        childAt.getBottom();
        uc0Var.getMeasuredHeight();
        if (childAt.getBottom() - uc0Var.getScrollY() > uc0Var.getMeasuredHeight()) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view2 = this.f33254r1;
        if ((z12 && view2.getTag() == null) || (!z12 && view2.getTag() != null)) {
            if (!z12) {
                num2 = null;
            }
            view2.setTag(num2);
            AnimatorSet animatorSet4 = this.f33261y1;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f33261y1 = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f33261y1 = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f33261y1;
                Property property2 = View.ALPHA;
                if (z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f11));
                this.f33261y1.addListener(new yc0(this, 1));
                this.f33261y1.start();
                return;
            }
            if (z12) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            view2.setAlpha(f10);
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        xb.a((FrameLayout) this.f29682b, new bi.t(9));
    }

    @Override
    public final void onStop() {
        super.onStop();
        xb.h((FrameLayout) this.f29682b);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            I0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
