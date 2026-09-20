package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class cu0 extends FrameLayout {
    public yk0 E;
    public int F;
    public br0 G;
    public wn0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f23402a;
    public boolean f23403b;
    public ObjectAnimator f23404c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f23405f;
    public is0 h;
    public ah.o f23406n;
    public bu0 f23407r;
    public ks0 f23408s;
    public rs0 v;
    public ts0 f23409w;
    public gs0 f23410x;
    public qs0 f23411y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        br0 br0Var;
        super.dispatchDraw(canvas);
        br0 br0Var2 = this.G;
        if (br0Var2 != null && br0Var2.getVisibility() == 0) {
            cl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || jv0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(br0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                jv0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f23407r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
