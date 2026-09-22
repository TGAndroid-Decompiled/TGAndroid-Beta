package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class eu0 extends FrameLayout {
    public bl0 E;
    public int F;
    public dr0 G;
    public yn0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public long f24038a;
    public boolean f24039b;
    public ObjectAnimator f24040c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f24041f;
    public ks0 h;
    public ah.o f24042n;
    public du0 f24043r;
    public ms0 f24044s;
    public ts0 v;
    public vs0 f24045w;
    public is0 f24046x;
    public ss0 f24047y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dr0 dr0Var;
        super.dispatchDraw(canvas);
        dr0 dr0Var2 = this.G;
        if (dr0Var2 != null && dr0Var2.getVisibility() == 0) {
            fl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.F;
                if (i10 == 8 || lv0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.G.setPivotX(dr0Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.G.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                lv0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f24043r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }
}
