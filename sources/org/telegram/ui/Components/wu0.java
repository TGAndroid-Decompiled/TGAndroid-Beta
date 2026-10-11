package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class wu0 extends FrameLayout {
    public vl0 E;
    public int F;
    public vr0 G;
    public fi0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f32738a;
    public boolean f32739b;
    public ObjectAnimator f32740c;
    public s4.j d;
    public s4.v0 f32741e;
    public s4.v0 f32742f;
    public ct0 h;
    public ah.n f32743n;
    public vu0 f32744r;
    public et0 f32745s;
    public lt0 v;
    public nt0 f32746w;
    public at0 f32747x;
    public kt0 f32748y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        vr0 vr0Var;
        super.dispatchDraw(canvas);
        vr0 vr0Var2 = this.G;
        if (vr0Var2 != null && vr0Var2.getVisibility() == 0) {
            zl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || dw0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(vr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                dw0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f32744r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
