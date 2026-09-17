package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class st0 extends FrameLayout {
    public pk0 E;
    public int F;
    public pq0 G;
    public br0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f27917a;
    public boolean f27918b;
    public ObjectAnimator f27919c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f27920f;
    public yr0 h;
    public ah.o f27921n;
    public rt0 f27922r;
    public as0 f27923s;
    public hs0 v;
    public js0 f27924w;
    public wr0 f27925x;
    public gs0 f27926y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        pq0 pq0Var;
        super.dispatchDraw(canvas);
        pq0 pq0Var2 = this.G;
        if (pq0Var2 != null && pq0Var2.getVisibility() == 0) {
            tk0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || zu0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(pq0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                zu0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f27922r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
