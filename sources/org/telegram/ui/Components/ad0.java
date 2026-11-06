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
public final class ad0 extends org.telegram.ui.ActionBar.v2 {
    public static final int F1 = 0;
    public final boolean A1;
    public wi B1;
    public final ArrayList C1;
    public final ArrayList D1;
    public final TLRPC.TL_userContact_old2 E1;
    public final n f31765i1;
    public final tc0 f31766j1;
    public final LinearLayout f31767k1;
    public final uc0 l1;
    public final View f31768m1;
    public final View n1;
    public final TextView f31769o1;
    public final org.telegram.ui.ActionBar.f2 f31770p1;
    public boolean f31771q1;
    public final Paint f31772r1;
    public int f31773s1;
    public AnimatorSet f31774t1;
    public AnimatorSet f31775u1;
    public final int f31776v1;
    public final int f31777w1;
    public final int f31778x1;
    public final int f31779y1;
    public final int f31780z1;

    public ad0(org.telegram.ui.ActionBar.f2 r19, org.telegram.messenger.d5 r20, org.telegram.tgnet.TLRPC.User r21, android.net.Uri r22, java.io.File r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, final org.telegram.ui.ActionBar.f6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ad0.<init>(org.telegram.ui.ActionBar.f2, org.telegram.messenger.d5, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.f6):void");
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void I0() {
        TextView textView = this.f31769o1;
        if (textView != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, this.I0);
            if (!textView.isEnabled()) {
                w02 &= Integer.MAX_VALUE;
            }
            if (textView.getCurrentTextColor() != w02) {
                textView.setTextColor(w02);
            }
        }
    }

    public final void J0(boolean z9) {
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        Integer num;
        float f12;
        float f13;
        float f14;
        float f15;
        Integer num2 = 1;
        tc0 tc0Var = this.f31766j1;
        View childAt = tc0Var.getChildAt(0);
        int top = childAt.getTop() - tc0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        uc0 uc0Var = this.l1;
        if ((z10 && uc0Var.getTag() == null) || (!z10 && uc0Var.getTag() != null)) {
            if (z10) {
                num = num2;
            } else {
                num = null;
            }
            uc0Var.setTag(num);
            AnimatorSet animatorSet = this.f31774t1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f31774t1 = null;
            }
            View view = this.f31768m1;
            if (z9) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31774t1 = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f31774t1;
                Property property = View.ALPHA;
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uc0Var, property, f14);
                if (z10) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f15));
                this.f31774t1.addListener(new xc0(this, 0));
                this.f31774t1.start();
            } else {
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                uc0Var.setAlpha(f12);
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                view.setAlpha(f13);
            }
        }
        if (this.f31773s1 != top) {
            this.f31773s1 = top;
            this.f28616b.invalidate();
        }
        childAt.getBottom();
        tc0Var.getMeasuredHeight();
        if (childAt.getBottom() - tc0Var.getScrollY() > tc0Var.getMeasuredHeight()) {
            z11 = true;
        } else {
            z11 = false;
        }
        View view2 = this.n1;
        if ((z11 && view2.getTag() == null) || (!z11 && view2.getTag() != null)) {
            if (!z11) {
                num2 = null;
            }
            view2.setTag(num2);
            AnimatorSet animatorSet4 = this.f31775u1;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f31775u1 = null;
            }
            if (z9) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f31775u1 = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f31775u1;
                Property property2 = View.ALPHA;
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f11));
                this.f31775u1.addListener(new xc0(this, 1));
                this.f31775u1.start();
                return;
            }
            if (z11) {
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
        cc.a((FrameLayout) this.f28616b, new fi.r7(8));
    }

    @Override
    public final void onStop() {
        super.onStop();
        cc.h((FrameLayout) this.f28616b);
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
