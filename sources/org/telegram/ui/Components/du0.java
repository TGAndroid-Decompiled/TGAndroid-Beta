package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class du0 extends FrameLayout {
    public al0 E;
    public int F;
    public cr0 G;
    public xn0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f23752a;
    public boolean f23753b;
    public ObjectAnimator f23754c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f23755f;
    public js0 h;
    public ah.n f23756n;
    public cu0 f23757r;
    public ls0 f23758s;
    public ss0 v;
    public us0 f23759w;
    public hs0 f23760x;
    public rs0 f23761y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        cr0 cr0Var;
        super.dispatchDraw(canvas);
        cr0 cr0Var2 = this.G;
        if (cr0Var2 != null && cr0Var2.getVisibility() == 0) {
            el0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || kv0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(cr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                kv0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f23757r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
