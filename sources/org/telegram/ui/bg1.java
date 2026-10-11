package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bg1 extends org.telegram.ui.Cells.s2 {
    public boolean f36408a5;
    public int f36409b5;
    public TLRPC.TL_forumTopic f36410c5;
    public org.telegram.ui.Components.s5 f36411d5;
    public Drawable f36412e5;
    public boolean f36413f5;
    public boolean f36414g5;
    public boolean f36415h5;
    public Boolean f36416i5;
    public float f36417j5;
    public ValueAnimator f36418k5;
    public final eg1 f36419l5;

    public bg1(eg1 eg1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f36419l5 = eg1Var;
        this.f36409b5 = -1;
        this.f22909x = false;
        if (eg1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.I = i10;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.f22857n1 = true;
    }

    @Override
    public final boolean F() {
        return this.f36415h5;
    }

    public final void f0() {
        Drawable drawable = this.f36412e5;
        boolean z10 = drawable instanceof ng.c;
        eg1 eg1Var = this.f36419l5;
        if (z10) {
            ((ng.c) drawable).a(i0.a.d(this.f36417j5, eg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.R9), eg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.L7)));
        }
        Drawable[] drawableArr = this.f22829h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof ng.c) {
                ((ng.c) drawable2).a(i0.a.d(this.f36417j5, eg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.R9), eg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z10) {
        boolean z11;
        if (this.f36416i5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f36418k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36418k5 = null;
        }
        this.f36416i5 = Boolean.valueOf(z10);
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f36417j5;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f36418k5 = ofFloat;
            ofFloat.addUpdateListener(new x11(this, 18));
            this.f36418k5.setInterpolator(org.telegram.ui.Components.is.f27501g);
            this.f36418k5.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f36417j5 = f7;
        f0();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36413f5 = true;
        org.telegram.ui.Components.s5 s5Var = this.f36411d5;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36413f5 = false;
        org.telegram.ui.Components.s5 s5Var = this.f36411d5;
        if (s5Var != null) {
            s5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.oj0 oj0Var;
        int dp;
        ci.o3 o3Var;
        eg1 eg1Var = this.f36419l5;
        if (eg1Var.getMessagesController().isMonoForum(-eg1Var.f37345a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f22843k0 && (o3Var = this.f22873q2) != null) {
            f7 = o3Var.getProgress() * AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        this.F3 = f7;
        canvas.save();
        float f10 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(eg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f22905w1, 0.0f);
        if (this.f36408a5) {
            if (this.f22890t2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.I);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f22905w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f20944k0);
            } else {
                canvas.drawLine(dp - this.f22905w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f20944k0);
            }
        }
        if ((!this.f36414g5 || (oj0Var = this.f22815e2) == null || oj0Var.C != 0.0f) && (this.f36411d5 != null || this.f36412e5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.s5 s5Var = this.f36411d5;
            if (s5Var != null) {
                if (LocaleController.isRTL) {
                    s5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    s5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f36411d5.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.f36412e5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.f36412e5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f36412e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.s5 s5Var) {
        org.telegram.ui.Components.s5 s5Var2 = this.f36411d5;
        if (s5Var2 != s5Var) {
            if (s5Var2 != null && this.f36413f5) {
                s5Var2.o(this);
            }
            if (s5Var != null) {
                s5Var.setColorFilter(org.telegram.ui.ActionBar.h6.f21151v3);
            }
            this.f36411d5 = s5Var;
            if (s5Var != null && this.f36413f5) {
                s5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f36412e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.f36410c5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36415h5 = z10;
        if (this.f22843k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            g0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f20120id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f36414g5 = z11;
        eg1 eg1Var = this.f36419l5;
        if (tL_forumTopic != null && this != eg1Var.f37350b1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.h6.f20825d9;
                this.N1 = org.telegram.ui.ActionBar.h6.f20808c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.h6.f21203y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.h6.f20808c9;
                this.N1 = org.telegram.ui.ActionBar.h6.f20825d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.h6.f21186x1;
            }
            invalidate();
        }
        if (this.f22843k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f20120id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ng.d.c(getContext(), 1.0f, eg1Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.s5 s5Var = this.f36411d5;
            if (s5Var == null || s5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (eg1Var.f37384u0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) eg1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.s5(i10, i11, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ng.d.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z13 = true;
        }
        g0(z13);
        u();
    }

    @Override
    public final void u() {
        super.u();
        f0();
    }
}
