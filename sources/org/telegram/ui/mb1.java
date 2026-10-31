package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
public final class mb1 extends org.telegram.ui.Cells.v2 {
    public boolean f39626a5;
    public int f39627b5;
    public TLRPC.TL_forumTopic f39628c5;
    public org.telegram.ui.Components.f5 f39629d5;
    public Drawable f39630e5;
    public boolean f39631f5;
    public boolean f39632g5;
    public boolean f39633h5;
    public Boolean f39634i5;
    public float f39635j5;
    public ValueAnimator f39636k5;
    public final pb1 f39637l5;

    public mb1(pb1 pb1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f39637l5 = pb1Var;
        this.f39627b5 = -1;
        this.f23295y = false;
        if (pb1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.I = i10;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.f23237n1 = true;
    }

    @Override
    public final boolean L() {
        return this.f39633h5;
    }

    public final void m0() {
        Drawable drawable = this.f39630e5;
        boolean z10 = drawable instanceof gg.d;
        pb1 pb1Var = this.f39637l5;
        if (z10) {
            ((gg.d) drawable).a(i0.b.f(this.f39635j5, pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.R9), pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.L7)));
        }
        Drawable[] drawableArr = this.f23208h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof gg.d) {
                ((gg.d) drawable2).a(i0.b.f(this.f39635j5, pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.R9), pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.L7)));
            }
        }
        invalidate();
    }

    public final void n0(boolean z10) {
        boolean z11;
        if (this.f39634i5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f39636k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39636k5 = null;
        }
        this.f39634i5 = Boolean.valueOf(z10);
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f39635j5;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39636k5 = ofFloat;
            ofFloat.addUpdateListener(new u01(this, 14));
            this.f39636k5.setInterpolator(org.telegram.ui.Components.gr.f26496g);
            this.f39636k5.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f39635j5 = f7;
        m0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39631f5 = true;
        org.telegram.ui.Components.f5 f5Var = this.f39629d5;
        if (f5Var != null) {
            f5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39631f5 = false;
        org.telegram.ui.Components.f5 f5Var = this.f39629d5;
        if (f5Var != null) {
            f5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.mh0 mh0Var;
        int L;
        org.telegram.ui.Cells.n2 n2Var;
        pb1 pb1Var = this.f39637l5;
        if (pb1Var.getMessagesController().x2(-pb1Var.f40566a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f23223k0 && (n2Var = this.f23253q2) != null) {
            f7 = n2Var.getProgress() * org.telegram.messenger.i0.L(30.0f);
        } else {
            f7 = 0.0f;
        }
        this.F3 = f7;
        canvas.save();
        float f10 = this.F3;
        int i10 = -org.telegram.messenger.i0.L(4.0f);
        this.E3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f23285w1, 0.0f);
        if (this.f39626a5) {
            if (this.f23270t2) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(this.I);
            }
            if (org.telegram.messenger.cd.X) {
                canvas.drawLine(0.0f - this.f23285w1, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
            } else {
                canvas.drawLine(L - this.f23285w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
            }
        }
        if ((!this.f39632g5 || (mh0Var = this.f23194e2) == null || mh0Var.C != 0.0f) && (this.f39629d5 != null || this.f39630e5 != null)) {
            int L2 = org.telegram.messenger.i0.L(10.0f);
            int L3 = org.telegram.messenger.i0.L(10.0f);
            int L4 = org.telegram.messenger.i0.L(28.0f);
            org.telegram.ui.Components.f5 f5Var = this.f39629d5;
            if (f5Var != null) {
                if (org.telegram.messenger.cd.X) {
                    f5Var.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    f5Var.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f39629d5.draw(canvas);
            } else {
                if (org.telegram.messenger.cd.X) {
                    this.f39630e5.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    this.f39630e5.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f39630e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.f5 f5Var) {
        org.telegram.ui.Components.f5 f5Var2 = this.f39629d5;
        if (f5Var2 != f5Var) {
            if (f5Var2 != null && this.f39631f5) {
                f5Var2.n(this);
            }
            if (f5Var != null) {
                f5Var.setColorFilter(org.telegram.ui.ActionBar.t6.f21256v3);
            }
            this.f39629d5 = f5Var;
            if (f5Var != null && this.f39631f5) {
                f5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f39630e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.f39628c5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39633h5 = z10;
        if (this.f23223k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            n0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f19845id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f39632g5 = z11;
        pb1 pb1Var = this.f39637l5;
        if (tL_forumTopic != null && this != pb1Var.f40574c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.t6.f20932d9;
                this.N1 = org.telegram.ui.ActionBar.t6.f20913c9;
                this.O1 = "Unhide";
                this.P1 = 2131743909;
                this.Q1 = org.telegram.ui.ActionBar.t6.f21307y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.t6.f20913c9;
                this.N1 = org.telegram.ui.ActionBar.t6.f20932d9;
                this.O1 = "Hide";
                this.P1 = 2131749334;
                this.Q1 = org.telegram.ui.ActionBar.t6.f21290x1;
            }
            invalidate();
        }
        if (this.f23223k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f19845id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(gg.e.c(getContext(), 1.0f, pb1Var.getThemedColor(org.telegram.ui.ActionBar.t6.f21141od), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.f5 f5Var = this.f39629d5;
            if (f5Var == null || f5Var.h() != tL_forumTopic.icon_emoji_id) {
                if (pb1Var.f40607u0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.f5(i10, i11, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(gg.e.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z13 = true;
        }
        n0(z13);
        z();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.f39634i5 != null) {
                m0();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void z() {
        super.z();
        m0();
    }
}
