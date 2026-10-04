package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class iu0 extends FrameLayout {
    public bl0 E;
    public int F;
    public gr0 G;
    public uo0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f27501a;
    public boolean f27502b;
    public ObjectAnimator f27503c;
    public s4.j d;
    public s4.u0 f27504e;
    public s4.u0 f27505f;
    public os0 h;
    public ah.n f27506n;
    public hu0 f27507r;
    public qs0 f27508s;
    public xs0 v;
    public zs0 f27509w;
    public ms0 f27510x;
    public ws0 f27511y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gr0 gr0Var;
        super.dispatchDraw(canvas);
        gr0 gr0Var2 = this.G;
        if (gr0Var2 != null && gr0Var2.getVisibility() == 0) {
            fl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || pv0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(gr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                pv0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f27507r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
