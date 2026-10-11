package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class vu0 extends FrameLayout {
    public ul0 E;
    public int F;
    public ur0 G;
    public ei0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f32550a;
    public boolean f32551b;
    public ObjectAnimator f32552c;
    public s4.j d;
    public s4.v0 f32553e;
    public s4.v0 f32554f;
    public bt0 h;
    public ah.n f32555n;
    public uu0 f32556r;
    public dt0 f32557s;
    public kt0 v;
    public mt0 f32558w;
    public zs0 f32559x;
    public jt0 f32560y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ur0 ur0Var;
        super.dispatchDraw(canvas);
        ur0 ur0Var2 = this.G;
        if (ur0Var2 != null && ur0Var2.getVisibility() == 0) {
            yl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || cw0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(ur0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                cw0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f32556r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
