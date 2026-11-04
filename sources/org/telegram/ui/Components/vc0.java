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
public final class vc0 extends org.telegram.ui.ActionBar.t2 {
    public static final int G1 = 0;
    public final int A1;
    public final boolean B1;
    public vi C1;
    public final ArrayList D1;
    public final ArrayList E1;
    public final TLRPC.TL_userContact_old2 F1;
    public final nh f39066j1;
    public final oc0 k1;
    public final LinearLayout f39067l1;
    public final pc0 m1;
    public final View f39068n1;
    public final View f39069o1;
    public final TextView f39070p1;
    public final org.telegram.ui.ActionBar.d2 f39071q1;
    public boolean f39072r1;
    public final Paint f39073s1;
    public int f39074t1;
    public AnimatorSet f39075u1;
    public AnimatorSet f39076v1;
    public final int f39077w1;
    public final int f39078x1;
    public final int f39079y1;
    public final int f39080z1;

    public vc0(org.telegram.ui.ActionBar.d2 r19, org.telegram.messenger.d5 r20, org.telegram.tgnet.TLRPC.User r21, android.net.Uri r22, java.io.File r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, final org.telegram.ui.ActionBar.e6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc0.<init>(org.telegram.ui.ActionBar.d2, org.telegram.messenger.d5, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.e6):void");
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void I0() {
        TextView textView = this.f39070p1;
        if (textView != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, this.J0);
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
        oc0 oc0Var = this.k1;
        View childAt = oc0Var.getChildAt(0);
        int top = childAt.getTop() - oc0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        pc0 pc0Var = this.m1;
        if ((z11 && pc0Var.getTag() == null) || (!z11 && pc0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            pc0Var.setTag(num);
            AnimatorSet animatorSet = this.f39075u1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f39075u1 = null;
            }
            View view = this.f39068n1;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f39075u1 = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f39075u1;
                Property property = View.ALPHA;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pc0Var, property, f14);
                if (z11) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f15));
                this.f39075u1.addListener(new sc0(this, 0));
                this.f39075u1.start();
            } else {
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                pc0Var.setAlpha(f12);
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                view.setAlpha(f13);
            }
        }
        if (this.f39074t1 != top) {
            this.f39074t1 = top;
            this.f28586b.invalidate();
        }
        childAt.getBottom();
        oc0Var.getMeasuredHeight();
        if (childAt.getBottom() - oc0Var.getScrollY() > oc0Var.getMeasuredHeight()) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view2 = this.f39069o1;
        if ((z12 && view2.getTag() == null) || (!z12 && view2.getTag() != null)) {
            if (!z12) {
                num2 = null;
            }
            view2.setTag(num2);
            AnimatorSet animatorSet4 = this.f39076v1;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f39076v1 = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f39076v1 = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f39076v1;
                Property property2 = View.ALPHA;
                if (z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f11));
                this.f39076v1.addListener(new sc0(this, 1));
                this.f39076v1.start();
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
        ac.a((FrameLayout) this.f28586b, new ai.y(9));
    }

    @Override
    public final void onStop() {
        super.onStop();
        ac.h((FrameLayout) this.f28586b);
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
