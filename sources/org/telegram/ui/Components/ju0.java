package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class ju0 extends FrameLayout {
    public bl0 E;
    public int F;
    public hr0 G;
    public vo0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f27971a;
    public boolean f27972b;
    public ObjectAnimator f27973c;
    public s4.j d;
    public s4.u0 f27974e;
    public s4.u0 f27975f;
    public ps0 h;
    public ah.n f27976n;
    public iu0 f27977r;
    public rs0 f27978s;
    public ys0 v;
    public at0 f27979w;
    public ns0 f27980x;
    public xs0 f27981y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        hr0 hr0Var;
        super.dispatchDraw(canvas);
        hr0 hr0Var2 = this.G;
        if (hr0Var2 != null && hr0Var2.getVisibility() == 0) {
            fl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || qv0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(hr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                qv0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f27977r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
