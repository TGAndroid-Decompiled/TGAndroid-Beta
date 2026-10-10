package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class vu0 extends FrameLayout {
    public ul0 E;
    public int F;
    public ur0 G;
    public di0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f32513a;
    public boolean f32514b;
    public ObjectAnimator f32515c;
    public s4.j d;
    public s4.v0 f32516e;
    public s4.v0 f32517f;
    public bt0 h;
    public ah.n f32518n;
    public uu0 f32519r;
    public dt0 f32520s;
    public kt0 v;
    public mt0 f32521w;
    public zs0 f32522x;
    public jt0 f32523y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ur0 ur0Var;
        super.dispatchDraw(canvas);
        ur0 ur0Var2 = this.G;
        if (ur0Var2 != null && ur0Var2.getVisibility() == 0) {
            yl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || cw0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(ur0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                cw0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f32519r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
