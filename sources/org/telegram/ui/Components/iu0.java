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
    public long f27496a;
    public boolean f27497b;
    public ObjectAnimator f27498c;
    public s4.j d;
    public s4.u0 f27499e;
    public s4.u0 f27500f;
    public os0 h;
    public ah.n f27501n;
    public hu0 f27502r;
    public qs0 f27503s;
    public xs0 v;
    public zs0 f27504w;
    public ms0 f27505x;
    public ws0 f27506y;

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
        if (view == this.f27502r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
