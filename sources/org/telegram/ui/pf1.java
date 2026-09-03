package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pf1 extends org.telegram.ui.Cells.r2 {
    public boolean T4;
    public int U4;
    public TLRPC.TL_forumTopic V4;
    public org.telegram.ui.Components.l5 W4;
    public Drawable X4;
    public boolean Y4;
    public boolean Z4;
    public boolean f40003a5;
    public Boolean f40004b5;
    public float f40005c5;
    public ValueAnimator f40006d5;
    public final sf1 f40007e5;

    public pf1(sf1 sf1Var, Context context, boolean z4) {
        super(context, z4);
        int i10;
        this.f40007e5 = sf1Var;
        this.U4 = -1;
        this.f23529x = false;
        if (sf1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.F = i10;
        this.R = 24.0f;
        this.G = 64;
        this.H = 76;
        this.f23463k1 = true;
    }

    @Override
    public final boolean E() {
        return this.f40003a5;
    }

    public final void f0() {
        Drawable drawable = this.X4;
        boolean z4 = drawable instanceof bg.d;
        sf1 sf1Var = this.f40007e5;
        if (z4) {
            ((bg.d) drawable).a(i0.a.d(this.f40005c5, sf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), sf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
        }
        Drawable[] drawableArr = this.f23431e0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof bg.d) {
                ((bg.d) drawable2).a(i0.a.d(this.f40005c5, sf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), sf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z4) {
        boolean z10;
        if (this.f40004b5 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ValueAnimator valueAnimator = this.f40006d5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f40006d5 = null;
        }
        this.f40004b5 = Boolean.valueOf(z4);
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f40005c5;
            if (z4) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f40006d5 = ofFloat;
            ofFloat.addUpdateListener(new n11(this, 18));
            this.f40006d5.setInterpolator(org.telegram.ui.Components.pr.f30169g);
            this.f40006d5.start();
            return;
        }
        if (z4) {
            f10 = 1.0f;
        }
        this.f40005c5 = f10;
        f0();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y4 = true;
        org.telegram.ui.Components.l5 l5Var = this.W4;
        if (l5Var != null) {
            l5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Y4 = false;
        org.telegram.ui.Components.l5 l5Var = this.W4;
        if (l5Var != null) {
            l5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.ri0 ri0Var;
        int dp;
        org.telegram.ui.Cells.k2 k2Var;
        sf1 sf1Var = this.f40007e5;
        if (sf1Var.getMessagesController().isMonoForum(-sf1Var.f41188a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f23447h0 && (k2Var = this.f23478n2) != null) {
            f10 = k2Var.getProgress() * AndroidUtilities.dp(30.0f);
        } else {
            f10 = 0.0f;
        }
        this.C3 = f10;
        canvas.save();
        float f11 = this.C3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.B3 = i10;
        canvas.translate(f11, i10);
        canvas.drawColor(sf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f23509t1, 0.0f);
        if (this.T4) {
            if (this.f23493q2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.F);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f23509t1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
            } else {
                canvas.drawLine(dp - this.f23509t1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
            }
        }
        if ((!this.Z4 || (ri0Var = this.f23419b2) == null || ri0Var.C != 0.0f) && (this.W4 != null || this.X4 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.l5 l5Var = this.W4;
            if (l5Var != null) {
                if (LocaleController.isRTL) {
                    l5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    l5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.W4.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.X4.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.X4.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.X4.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.l5 l5Var) {
        org.telegram.ui.Components.l5 l5Var2 = this.W4;
        if (l5Var2 != l5Var) {
            if (l5Var2 != null && this.Y4) {
                l5Var2.o(this);
            }
            if (l5Var != null) {
                l5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f21978v3);
            }
            this.W4 = l5Var;
            if (l5Var != null && this.Y4) {
                l5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.X4 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z4;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        this.V4 = tL_forumTopic;
        boolean z12 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f40003a5 = z4;
        if (this.f23447h0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z11 = true;
            } else {
                z11 = false;
            }
            g0(z11);
        }
        if (tL_forumTopic != null && tL_forumTopic.f20897id == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z4 = z10;
        sf1 sf1Var = this.f40007e5;
        if (tL_forumTopic != null && this != sf1Var.Y0) {
            if (tL_forumTopic.hidden) {
                this.I1 = true;
                this.J1 = org.telegram.ui.ActionBar.k6.f21664d9;
                this.K1 = org.telegram.ui.ActionBar.k6.f21646c9;
                this.L1 = "Unhide";
                this.M1 = R.string.Unhide;
                this.N1 = org.telegram.ui.ActionBar.k6.f22033y1;
            } else {
                this.I1 = true;
                this.J1 = org.telegram.ui.ActionBar.k6.f21646c9;
                this.K1 = org.telegram.ui.ActionBar.k6.f21664d9;
                this.L1 = "Hide";
                this.M1 = R.string.Hide;
                this.N1 = org.telegram.ui.ActionBar.k6.f22014x1;
            }
            invalidate();
        }
        if (this.f23447h0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f20897id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(bg.e.c(getContext(), 1.0f, sf1Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.l5 l5Var = this.W4;
            if (l5Var == null || l5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (sf1Var.f41221r0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.l5(i10, i11, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(bg.e.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z12 = true;
        }
        g0(z12);
        t();
    }

    @Override
    public final void t() {
        super.t();
        f0();
    }
}
