package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class qt0 extends FrameLayout {
    public ok0 E;
    public int F;
    public oq0 G;
    public jn0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f29815a;
    public boolean f29816b;
    public ObjectAnimator f29817c;
    public s4.j d;
    public s4.u0 f29818e;
    public s4.u0 f29819f;
    public wr0 h;
    public bh.l f29820n;
    public pt0 f29821r;
    public yr0 f29822s;
    public fs0 v;
    public hs0 f29823w;
    public ur0 f29824x;
    public es0 f29825y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        oq0 oq0Var;
        super.dispatchDraw(canvas);
        oq0 oq0Var2 = this.G;
        if (oq0Var2 != null && oq0Var2.getVisibility() == 0) {
            sk0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || xu0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(oq0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                xu0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f29821r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
