package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class mu0 extends FrameLayout {
    public ll0 E;
    public int F;
    public lr0 G;
    public go0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f28606a;
    public boolean f28607b;
    public ObjectAnimator f28608c;
    public s4.k d;
    public s4.t0 e;
    public s4.t0 f28609f;
    public ss0 h;
    public bh.l f28610n;
    public lu0 f28611r;
    public us0 f28612s;
    public bt0 v;
    public dt0 f28613w;
    public qs0 f28614x;
    public at0 f28615y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        lr0 lr0Var;
        super.dispatchDraw(canvas);
        lr0 lr0Var2 = this.G;
        if (lr0Var2 != null && lr0Var2.getVisibility() == 0) {
            pl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || tv0.y0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(lr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                tv0.r(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f28611r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
