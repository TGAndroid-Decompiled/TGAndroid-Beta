package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class rt0 extends FrameLayout {
    public pk0 E;
    public int F;
    public oq0 G;
    public ar0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f27723a;
    public boolean f27724b;
    public ObjectAnimator f27725c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f27726f;
    public xr0 h;
    public ah.n f27727n;
    public qt0 f27728r;
    public zr0 f27729s;
    public gs0 v;
    public is0 f27730w;
    public vr0 f27731x;
    public fs0 f27732y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        oq0 oq0Var;
        super.dispatchDraw(canvas);
        oq0 oq0Var2 = this.G;
        if (oq0Var2 != null && oq0Var2.getVisibility() == 0) {
            tk0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || yu0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(oq0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                yu0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f27728r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
