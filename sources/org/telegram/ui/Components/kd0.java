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
public final class kd0 extends org.telegram.ui.ActionBar.w2 {
    public static final int J1 = 0;
    public final int A1;
    public final int B1;
    public final int C1;
    public final int D1;
    public final boolean E1;
    public lj F1;
    public final ArrayList G1;
    public final ArrayList H1;
    public final TLRPC.TL_userContact_old2 I1;
    public final org.telegram.ui.ActionBar.i5 f36705m1;
    public final dd0 n1;
    public final LinearLayout f36706o1;
    public final ed0 f36707p1;
    public final View f36708q1;
    public final View f36709r1;
    public final TextView f36710s1;
    public final org.telegram.ui.ActionBar.g2 f36711t1;
    public boolean f36712u1;
    public final Paint f36713v1;
    public int f36714w1;
    public AnimatorSet f36715x1;
    public AnimatorSet f36716y1;
    public final int f36717z1;

    public kd0(org.telegram.ui.ActionBar.g2 r19, org.telegram.messenger.f5 r20, org.telegram.tgnet.TLRPC.User r21, android.net.Uri r22, java.io.File r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, final org.telegram.ui.ActionBar.i6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kd0.<init>(org.telegram.ui.ActionBar.g2, org.telegram.messenger.f5, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, org.telegram.ui.ActionBar.i6):void");
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void J0() {
        TextView textView = this.f36710s1;
        if (textView != null) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ji, this.J0);
            if (!textView.isEnabled()) {
                w02 &= Integer.MAX_VALUE;
            }
            if (textView.getCurrentTextColor() != w02) {
                textView.setTextColor(w02);
            }
        }
    }

    public final void K0(boolean z10) {
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
        dd0 dd0Var = this.n1;
        View childAt = dd0Var.getChildAt(0);
        int top = childAt.getTop() - dd0Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        if (top <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        ed0 ed0Var = this.f36707p1;
        if ((z11 && ed0Var.getTag() == null) || (!z11 && ed0Var.getTag() != null)) {
            if (z11) {
                num = num2;
            } else {
                num = null;
            }
            ed0Var.setTag(num);
            AnimatorSet animatorSet = this.f36715x1;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f36715x1 = null;
            }
            View view = this.f36708q1;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f36715x1 = animatorSet2;
                animatorSet2.setDuration(180L);
                AnimatorSet animatorSet3 = this.f36715x1;
                Property property = View.ALPHA;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ed0Var, property, f14);
                if (z11) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property, f15));
                this.f36715x1.addListener(new hd0(this, 0));
                this.f36715x1.start();
            } else {
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ed0Var.setAlpha(f12);
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                view.setAlpha(f13);
            }
        }
        if (this.f36714w1 != top) {
            this.f36714w1 = top;
            this.f30226b.invalidate();
        }
        childAt.getBottom();
        dd0Var.getMeasuredHeight();
        if (childAt.getBottom() - dd0Var.getScrollY() > dd0Var.getMeasuredHeight()) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view2 = this.f36709r1;
        if ((z12 && view2.getTag() == null) || (!z12 && view2.getTag() != null)) {
            if (!z12) {
                num2 = null;
            }
            view2.setTag(num2);
            AnimatorSet animatorSet4 = this.f36716y1;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
                this.f36716y1 = null;
            }
            if (z10) {
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f36716y1 = animatorSet5;
                animatorSet5.setDuration(180L);
                AnimatorSet animatorSet6 = this.f36716y1;
                Property property2 = View.ALPHA;
                if (z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                animatorSet6.playTogether(ObjectAnimator.ofFloat(view2, property2, f11));
                this.f36716y1.addListener(new hd0(this, 1));
                this.f36716y1.start();
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
        fc.a((FrameLayout) this.f30226b, new bi.t(9));
    }

    @Override
    public final void onStop() {
        super.onStop();
        fc.h((FrameLayout) this.f30226b);
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            J0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
