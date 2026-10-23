package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oe1 extends org.telegram.ui.Cells.r2 {
    public boolean f39867a5;
    public int f39868b5;
    public TLRPC.TL_forumTopic f39869c5;
    public org.telegram.ui.Components.r5 f39870d5;
    public Drawable f39871e5;
    public boolean f39872f5;
    public boolean f39873g5;
    public boolean f39874h5;
    public Boolean f39875i5;
    public float f39876j5;
    public ValueAnimator f39877k5;
    public final re1 f39878l5;

    public oe1(re1 re1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f39878l5 = re1Var;
        this.f39868b5 = -1;
        this.f22925x = false;
        if (re1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.I = i10;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.f22873n1 = true;
    }

    @Override
    public final boolean E() {
        return this.f39874h5;
    }

    public final void f0() {
        Drawable drawable = this.f39871e5;
        boolean z10 = drawable instanceof og.c;
        re1 re1Var = this.f39878l5;
        if (z10) {
            ((og.c) drawable).a(i0.a.f(this.f39876j5, re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.R9), re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.L7)));
        }
        Drawable[] drawableArr = this.f22844h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof og.c) {
                ((og.c) drawable2).a(i0.a.f(this.f39876j5, re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.R9), re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z10) {
        boolean z11;
        if (this.f39875i5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f39877k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39877k5 = null;
        }
        this.f39875i5 = Boolean.valueOf(z10);
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f39876j5;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39877k5 = ofFloat;
            ofFloat.addUpdateListener(new c11(this, 16));
            this.f39877k5.setInterpolator(org.telegram.ui.Components.bs.f25026g);
            this.f39877k5.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f39876j5 = f7;
        f0();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39872f5 = true;
        org.telegram.ui.Components.r5 r5Var = this.f39870d5;
        if (r5Var != null) {
            r5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39872f5 = false;
        org.telegram.ui.Components.r5 r5Var = this.f39870d5;
        if (r5Var != null) {
            r5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.fj0 fj0Var;
        int dp;
        ei.k3 k3Var;
        re1 re1Var = this.f39878l5;
        if (re1Var.getMessagesController().isMonoForum(-re1Var.f41152a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f22859k0 && (k3Var = this.f22889q2) != null) {
            f7 = k3Var.getProgress() * AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        this.F3 = f7;
        canvas.save();
        float f10 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f22921w1, 0.0f);
        if (this.f39867a5) {
            if (this.f22906t2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.I);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f22921w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21115k0);
            } else {
                canvas.drawLine(dp - this.f22921w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21115k0);
            }
        }
        if ((!this.f39873g5 || (fj0Var = this.f22830e2) == null || fj0Var.C != 0.0f) && (this.f39870d5 != null || this.f39871e5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.r5 r5Var = this.f39870d5;
            if (r5Var != null) {
                if (LocaleController.isRTL) {
                    r5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    r5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f39870d5.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.f39871e5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.f39871e5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f39871e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.r5 r5Var) {
        org.telegram.ui.Components.r5 r5Var2 = this.f39870d5;
        if (r5Var2 != r5Var) {
            if (r5Var2 != null && this.f39872f5) {
                r5Var2.o(this);
            }
            if (r5Var != null) {
                r5Var.setColorFilter(org.telegram.ui.ActionBar.h6.f21324v3);
            }
            this.f39870d5 = r5Var;
            if (r5Var != null && this.f39872f5) {
                r5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f39871e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.f39869c5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39874h5 = z10;
        if (this.f22859k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            g0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f20332id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f39873g5 = z11;
        re1 re1Var = this.f39878l5;
        if (tL_forumTopic != null && this != re1Var.f41157b1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.h6.f20997d9;
                this.N1 = org.telegram.ui.ActionBar.h6.f20978c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.h6.f21378y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.h6.f20978c9;
                this.N1 = org.telegram.ui.ActionBar.h6.f20997d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.h6.f21359x1;
            }
            invalidate();
        }
        if (this.f22859k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f20332id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(og.d.c(getContext(), 1.0f, re1Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.r5 r5Var = this.f39870d5;
            if (r5Var == null || r5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (re1Var.f41190u0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.r5(i10, i11, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(og.d.e(tL_forumTopic));
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
