package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class uu0 extends FrameLayout {
    public tl0 E;
    public int F;
    public tr0 G;
    public ci0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f31619a;
    public boolean f31620b;
    public ObjectAnimator f31621c;
    public s4.j d;
    public s4.v0 f31622e;
    public s4.v0 f31623f;
    public at0 h;
    public ah.n f31624n;
    public tu0 f31625r;
    public ct0 f31626s;
    public jt0 v;
    public lt0 f31627w;
    public ys0 f31628x;
    public it0 f31629y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        tr0 tr0Var;
        super.dispatchDraw(canvas);
        tr0 tr0Var2 = this.G;
        if (tr0Var2 != null && tr0Var2.getVisibility() == 0) {
            xl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || bw0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(tr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                bw0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f31625r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
