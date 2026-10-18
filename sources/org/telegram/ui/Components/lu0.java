package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class lu0 extends FrameLayout {
    public ll0 E;
    public int F;
    public kr0 G;
    public go0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f28327a;
    public boolean f28328b;
    public ObjectAnimator f28329c;
    public s4.k d;
    public s4.t0 e;
    public s4.t0 f28330f;
    public rs0 h;
    public bh.l f28331n;
    public ku0 f28332r;
    public ts0 f28333s;
    public at0 v;
    public ct0 f28334w;
    public ps0 f28335x;
    public zs0 f28336y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kr0 kr0Var;
        super.dispatchDraw(canvas);
        kr0 kr0Var2 = this.G;
        if (kr0Var2 != null && kr0Var2.getVisibility() == 0) {
            pl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || sv0.y0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(kr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                sv0.r(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f28332r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
