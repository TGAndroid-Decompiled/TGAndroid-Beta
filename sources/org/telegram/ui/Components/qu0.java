package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class qu0 extends FrameLayout {
    public pl0 E;
    public int F;
    public pr0 G;
    public ko0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f29999a;
    public boolean f30000b;
    public ObjectAnimator f30001c;
    public s4.k d;
    public s4.t0 e;
    public s4.t0 f30002f;
    public ws0 h;
    public bh.l f30003n;
    public pu0 f30004r;
    public ys0 f30005s;
    public ft0 v;
    public ht0 f30006w;
    public us0 f30007x;
    public et0 f30008y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        pr0 pr0Var;
        super.dispatchDraw(canvas);
        pr0 pr0Var2 = this.G;
        if (pr0Var2 != null && pr0Var2.getVisibility() == 0) {
            tl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || xv0.z0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(pr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                xv0.r(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f30004r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
