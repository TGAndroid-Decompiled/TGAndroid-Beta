package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
public final class j91 extends org.telegram.ui.Cells.t2 {
    public boolean f46565b5;
    public int f46566c5;
    public TLRPC.TL_forumTopic f46567d5;
    public org.telegram.ui.Components.g5 f46568e5;
    public Drawable f46569f5;
    public boolean f46570g5;
    public boolean f46571h5;
    public boolean f46572i5;
    public Boolean f46573j5;
    public float f46574k5;
    public ValueAnimator f46575l5;
    public final m91 f46576m5;

    public j91(m91 m91Var, Context context, boolean z10) {
        super(context, z10);
        int i3;
        this.f46576m5 = m91Var;
        this.f46566c5 = -1;
        this.f30586y = false;
        if (m91Var.isInPreviewMode()) {
            i3 = 11;
        } else {
            i3 = 50;
        }
        this.J = i3;
        this.V = 24.0f;
        this.K = 64;
        this.L = 76;
        this.f30533o1 = true;
    }

    @Override
    public final boolean K() {
        return this.f46572i5;
    }

    public final void n0() {
        Drawable drawable = this.f46569f5;
        boolean z10 = drawable instanceof rg.b;
        m91 m91Var = this.f46576m5;
        if (z10) {
            ((rg.b) drawable).a(i0.a.f(this.f46574k5, m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
        }
        Drawable[] drawableArr = this.f30506i0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof rg.b) {
                ((rg.b) drawable2).a(i0.a.f(this.f46574k5, m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
            }
        }
        invalidate();
    }

    public final void o0(boolean z10) {
        boolean z11;
        if (this.f46573j5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f46575l5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46575l5 = null;
        }
        this.f46573j5 = Boolean.valueOf(z10);
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f46574k5;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f46575l5 = ofFloat;
            ofFloat.addUpdateListener(new xy0(this, 14));
            this.f46575l5.setInterpolator(org.telegram.ui.Components.xq.f40453g);
            this.f46575l5.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f46574k5 = f10;
        n0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46570g5 = true;
        org.telegram.ui.Components.g5 g5Var = this.f46568e5;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46570g5 = false;
        org.telegram.ui.Components.g5 g5Var = this.f46568e5;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.ng0 ng0Var;
        int L;
        gi.y2 y2Var;
        m91 m91Var = this.f46576m5;
        if (m91Var.getMessagesController().y2(-m91Var.f47575a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f30519l0 && (y2Var = this.f30550r2) != null) {
            f10 = y2Var.getProgress() * org.telegram.messenger.g0.L(30.0f);
        } else {
            f10 = 0.0f;
        }
        this.G3 = f10;
        canvas.save();
        float f11 = this.G3;
        int i3 = -org.telegram.messenger.g0.L(4.0f);
        this.F3 = i3;
        canvas.translate(f11, i3);
        canvas.drawColor(m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f30582x1, 0.0f);
        if (this.f46565b5) {
            if (this.f30566u2) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(this.J);
            }
            if (org.telegram.messenger.bd.f21784a0) {
                canvas.drawLine(0.0f - this.f30582x1, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
            } else {
                canvas.drawLine(L - this.f30582x1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
            }
        }
        if ((!this.f46571h5 || (ng0Var = this.f30493f2) == null || ng0Var.C != 0.0f) && (this.f46568e5 != null || this.f46569f5 != null)) {
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(28.0f);
            org.telegram.ui.Components.g5 g5Var = this.f46568e5;
            if (g5Var != null) {
                if (org.telegram.messenger.bd.f21784a0) {
                    g5Var.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    g5Var.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f46568e5.draw(canvas);
            } else {
                if (org.telegram.messenger.bd.f21784a0) {
                    this.f46569f5.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    this.f46569f5.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f46569f5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.g5 g5Var) {
        org.telegram.ui.Components.g5 g5Var2 = this.f46568e5;
        if (g5Var2 != g5Var) {
            if (g5Var2 != null && this.f46570g5) {
                g5Var2.n(this);
            }
            if (g5Var != null) {
                g5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f28211v3);
            }
            this.f46568e5 = g5Var;
            if (g5Var != null && this.f46570g5) {
                g5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f46569f5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        boolean z12;
        this.f46567d5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46572i5 = z10;
        if (this.f30519l0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            o0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f27053id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46571h5 = z11;
        m91 m91Var = this.f46576m5;
        if (tL_forumTopic != null && this != m91Var.f47585d1) {
            if (tL_forumTopic.hidden) {
                this.M1 = true;
                this.N1 = org.telegram.ui.ActionBar.k6.f27881d9;
                this.O1 = org.telegram.ui.ActionBar.k6.f27864c9;
                this.P1 = "Unhide";
                this.Q1 = 2131743894;
                this.R1 = org.telegram.ui.ActionBar.k6.f28268y1;
            } else {
                this.M1 = true;
                this.N1 = org.telegram.ui.ActionBar.k6.f27864c9;
                this.O1 = org.telegram.ui.ActionBar.k6.f27881d9;
                this.P1 = "Hide";
                this.Q1 = 2131749333;
                this.R1 = org.telegram.ui.ActionBar.k6.f28249x1;
            }
            invalidate();
        }
        if (this.f30519l0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f27053id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(rg.c.c(getContext(), 1.0f, m91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28088od), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.g5 g5Var = this.f46568e5;
            if (g5Var == null || g5Var.h() != tL_forumTopic.icon_emoji_id) {
                if (m91Var.f47618v0) {
                    i3 = 13;
                } else {
                    i3 = 10;
                }
                i10 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.g5(i3, i10, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(rg.c.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z13 = true;
        }
        o0(z13);
        x();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.f46573j5 != null) {
                n0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void x() {
        super.x();
        n0();
    }
}
