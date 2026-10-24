package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class pu0 extends FrameLayout {
    public ol0 E;
    public int F;
    public or0 G;
    public jo0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f29672a;
    public boolean f29673b;
    public ObjectAnimator f29674c;
    public s4.k d;
    public s4.t0 e;
    public s4.t0 f29675f;
    public vs0 h;
    public bh.l f29676n;
    public ou0 f29677r;
    public xs0 f29678s;
    public et0 v;
    public gt0 f29679w;
    public ts0 f29680x;
    public dt0 f29681y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        or0 or0Var;
        super.dispatchDraw(canvas);
        or0 or0Var2 = this.G;
        if (or0Var2 != null && or0Var2.getVisibility() == 0) {
            sl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || wv0.z0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(or0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                wv0.r(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f29677r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
