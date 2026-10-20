package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class nu0 extends FrameLayout {
    public ml0 E;
    public int F;
    public mr0 G;
    public ho0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f28875a;
    public boolean f28876b;
    public ObjectAnimator f28877c;
    public s4.k d;
    public s4.t0 e;
    public s4.t0 f28878f;
    public ts0 h;
    public bh.l f28879n;
    public mu0 f28880r;
    public vs0 f28881s;
    public ct0 v;
    public et0 f28882w;
    public rs0 f28883x;
    public bt0 f28884y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        mr0 mr0Var;
        super.dispatchDraw(canvas);
        mr0 mr0Var2 = this.G;
        if (mr0Var2 != null && mr0Var2.getVisibility() == 0) {
            ql0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || uv0.y0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(mr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                uv0.r(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f28880r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
