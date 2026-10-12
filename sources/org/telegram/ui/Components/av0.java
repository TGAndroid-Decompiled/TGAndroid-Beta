package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class av0 extends FrameLayout {
    public zl0 E;
    public int F;
    public zr0 G;
    public gi0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f24482a;
    public boolean f24483b;
    public ObjectAnimator f24484c;
    public s4.j d;
    public s4.v0 f24485e;
    public s4.v0 f24486f;
    public gt0 h;
    public ah.n f24487n;
    public zu0 f24488r;
    public it0 f24489s;
    public pt0 v;
    public rt0 f24490w;
    public et0 f24491x;
    public ot0 f24492y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        zr0 zr0Var;
        super.dispatchDraw(canvas);
        zr0 zr0Var2 = this.G;
        if (zr0Var2 != null && zr0Var2.getVisibility() == 0) {
            dm0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || hw0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(zr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                hw0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f24488r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
