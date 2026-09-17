package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cg1 extends org.telegram.ui.Cells.r2 {
    public boolean W4;
    public int X4;
    public TLRPC.TL_forumTopic Y4;
    public org.telegram.ui.Components.o5 Z4;
    public Drawable f32794a5;
    public boolean f32795b5;
    public boolean f32796c5;
    public boolean f32797d5;
    public Boolean f32798e5;
    public float f32799f5;
    public ValueAnimator f32800g5;
    public final fg1 f32801h5;

    public cg1(fg1 fg1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f32801h5 = fg1Var;
        this.X4 = -1;
        this.f20784x = false;
        if (fg1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.I = i10;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.f20732n1 = true;
    }

    @Override
    public final boolean F() {
        return this.f32797d5;
    }

    public final void f0() {
        Drawable drawable = this.f32794a5;
        boolean z10 = drawable instanceof ng.c;
        fg1 fg1Var = this.f32801h5;
        if (z10) {
            ((ng.c) drawable).a(i0.a.d(this.f32799f5, fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
        }
        Drawable[] drawableArr = this.f20704h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof ng.c) {
                ((ng.c) drawable2).a(i0.a.d(this.f32799f5, fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z10) {
        boolean z11;
        if (this.f32798e5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f32800g5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f32800g5 = null;
        }
        this.f32798e5 = Boolean.valueOf(z10);
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f32799f5;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f32800g5 = ofFloat;
            ofFloat.addUpdateListener(new k21(this, 17));
            this.f32800g5.setInterpolator(org.telegram.ui.Components.qr.f27381g);
            this.f32800g5.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f32799f5 = f7;
        f0();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32795b5 = true;
        org.telegram.ui.Components.o5 o5Var = this.Z4;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32795b5 = false;
        org.telegram.ui.Components.o5 o5Var = this.Z4;
        if (o5Var != null) {
            o5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.ji0 ji0Var;
        int dp;
        ci.q3 q3Var;
        fg1 fg1Var = this.f32801h5;
        if (fg1Var.getMessagesController().isMonoForum(-fg1Var.f33636a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f20718k0 && (q3Var = this.f20748q2) != null) {
            f7 = q3Var.getProgress() * AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        this.F3 = f7;
        canvas.save();
        float f10 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f20780w1, 0.0f);
        if (this.W4) {
            if (this.f20765t2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.I);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f20780w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18984k0);
            } else {
                canvas.drawLine(dp - this.f20780w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18984k0);
            }
        }
        if ((!this.f32796c5 || (ji0Var = this.f20690e2) == null || ji0Var.C != 0.0f) && (this.Z4 != null || this.f32794a5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.o5 o5Var = this.Z4;
            if (o5Var != null) {
                if (LocaleController.isRTL) {
                    o5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    o5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.Z4.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.f32794a5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.f32794a5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f32794a5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.o5 o5Var) {
        org.telegram.ui.Components.o5 o5Var2 = this.Z4;
        if (o5Var2 != o5Var) {
            if (o5Var2 != null && this.f32795b5) {
                o5Var2.o(this);
            }
            if (o5Var != null) {
                o5Var.setColorFilter(org.telegram.ui.ActionBar.j6.f19189v3);
            }
            this.Z4 = o5Var;
            if (o5Var != null && this.f32795b5) {
                o5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f32794a5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.Y4 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32797d5 = z10;
        if (this.f20718k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            g0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f18173id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32796c5 = z11;
        fg1 fg1Var = this.f32801h5;
        if (tL_forumTopic != null && this != fg1Var.f33641b1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.j6.f18865d9;
                this.N1 = org.telegram.ui.ActionBar.j6.f18847c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.j6.f19240y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.j6.f18847c9;
                this.N1 = org.telegram.ui.ActionBar.j6.f18865d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.j6.f19222x1;
            }
            invalidate();
        }
        if (this.f20718k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f18173id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ng.d.c(getContext(), 1.0f, fg1Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.o5 o5Var = this.Z4;
            if (o5Var == null || o5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (fg1Var.f33674u0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) fg1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.o5(i10, i11, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ng.d.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z13 = true;
        }
        g0(z13);
        t();
    }

    @Override
    public final void t() {
        super.t();
        f0();
    }
}
