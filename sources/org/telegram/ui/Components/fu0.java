package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class fu0 extends FrameLayout {
    public cl0 E;
    public int F;
    public er0 G;
    public zn0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f24351a;
    public boolean f24352b;
    public ObjectAnimator f24353c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f24354f;
    public ls0 h;
    public ah.n f24355n;
    public eu0 f24356r;
    public ns0 f24357s;
    public us0 v;
    public ws0 f24358w;
    public js0 f24359x;
    public ts0 f24360y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        er0 er0Var;
        super.dispatchDraw(canvas);
        er0 er0Var2 = this.G;
        if (er0Var2 != null && er0Var2.getVisibility() == 0) {
            gl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || mv0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(er0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                mv0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f24356r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
