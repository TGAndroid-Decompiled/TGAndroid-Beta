package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class qu0 extends FrameLayout {
    public pl0 E;
    public int F;
    public qr0 G;
    public f60 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f28675a;
    public boolean f28676b;
    public ObjectAnimator f28677c;
    public s4.k d;
    public s4.t0 e;
    public s4.t0 f28678f;
    public ws0 h;
    public bh.l f28679n;
    public pu0 f28680r;
    public ys0 f28681s;
    public ft0 v;
    public ht0 f28682w;
    public us0 f28683x;
    public et0 f28684y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        qr0 qr0Var;
        super.dispatchDraw(canvas);
        qr0 qr0Var2 = this.G;
        if (qr0Var2 != null && qr0Var2.getVisibility() == 0) {
            tl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || xv0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(qr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                xv0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f28680r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
