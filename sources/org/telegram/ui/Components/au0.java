package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class au0 extends FrameLayout {
    public yk0 E;
    public int F;
    public zq0 G;
    public yo0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f21590a;
    public boolean f21591b;
    public ObjectAnimator f21592c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f21593f;
    public gs0 h;
    public zg.k f21594n;
    public zt0 f21595r;
    public is0 f21596s;
    public ps0 v;
    public rs0 f21597w;
    public es0 f21598x;
    public os0 f21599y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        zq0 zq0Var;
        super.dispatchDraw(canvas);
        zq0 zq0Var2 = this.G;
        if (zq0Var2 != null && zq0Var2.getVisibility() == 0) {
            cl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || iv0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(zq0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                iv0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f21595r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
