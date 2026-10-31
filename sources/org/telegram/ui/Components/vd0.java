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
public final class vd0 extends org.telegram.ui.ActionBar.z2 {
    public static final int F1 = 0;
    public final boolean A1;
    public vi B1;
    public final ArrayList C1;
    public final ArrayList D1;
    public final TLRPC.TL_userContact_old2 E1;
    public final m2.t f31216i1;
    public final od0 f31217j1;
    public final LinearLayout f31218k1;
    public final pd0 l1;
    public final View f31219m1;
    public final View f31220n1;
    public final TextView f31221o1;
    public final org.telegram.ui.ActionBar.k2 f31222p1;
    public boolean f31223q1;
    public final Paint f31224r1;
    public int f31225s1;
    public AnimatorSet f31226t1;
    public AnimatorSet f31227u1;
    public final int f31228v1;
    public final int f31229w1;
    public final int f31230x1;
    public final int f31231y1;
    public final int f31232z1;

    public vd0(org.telegram.ui.ActionBar.k2 r20, org.telegram.messenger.f5 r21, org.telegram.tgnet.TLRPC.User r22, android.net.Uri r23, java.io.File r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, final org.telegram.ui.ActionBar.p6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vd0.<init>(org.telegram.ui.ActionBar.k2, org.telegram.messenger.f5, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.p6):void");
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final void I0() {
        TextView textView = this.f31221o1;
        if (textView != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, this.I0);
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
        float f7;
        float f10;
        Integer num;
        float f11;
        float f12;
        float f13;
        float f14;
        Integer num2 = 1;
        od0 od0Var = this.f31217j1;
        View childAt = od0Var.getChildAt(0);
        int top = childAt.getTop() - od0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        pd0 pd0Var = this.l1;
        if ((z11 && pd0Var.getTag() == null) || (!z11 && pd0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            pd0Var.setTag(num);
            AnimatorSet animatorSet = this.f31226t1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f31226t1 = null;
            }
            View view = this.f31219m1;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31226t1 = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f31226t1;
                Property property = View.ALPHA;
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pd0Var, property, f13);
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f14));
                this.f31226t1.addListener(new sd0(this, 0));
                this.f31226t1.start();
            } else {
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                pd0Var.setAlpha(f11);
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                view.setAlpha(f12);
            }
        }
        if (this.f31225s1 != top) {
            this.f31225s1 = top;
            this.f21586b.invalidate();
        }
        childAt.getBottom();
        od0Var.getMeasuredHeight();
        if (childAt.getBottom() - od0Var.getScrollY() > od0Var.getMeasuredHeight()) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view2 = this.f31220n1;
        if ((z12 && view2.getTag() == null) || (!z12 && view2.getTag() != null)) {
            if (!z12) {
                num2 = null;
            }
            view2.setTag(num2);
            AnimatorSet animatorSet4 = this.f31227u1;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f31227u1 = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f31227u1 = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f31227u1;
                Property property2 = View.ALPHA;
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f10));
                this.f31227u1.addListener(new sd0(this, 1));
                this.f31227u1.start();
                return;
            }
            if (z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            view2.setAlpha(f7);
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        wb.a((FrameLayout) this.f21586b, new mg.u(5));
    }

    @Override
    public final void onStop() {
        super.onStop();
        wb.h((FrameLayout) this.f21586b);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            I0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
