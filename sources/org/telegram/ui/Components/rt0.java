package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class rt0 extends FrameLayout {
    public c2.y B;
    public int C;
    public tq0 D;
    public a90 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public long f30844a;
    public boolean f30845b;
    public ObjectAnimator f30846c;
    public f2.l d;
    public f2.c1 f30847e;
    public f2.c1 f30848f;
    public xr0 h;
    public og.k f30849n;
    public qt0 f30850r;
    public zr0 f30851s;
    public gs0 v;
    public is0 f30852w;
    public vr0 f30853x;
    public fs0 f30854y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        tq0 tq0Var;
        super.dispatchDraw(canvas);
        tq0 tq0Var2 = this.D;
        if (tq0Var2 != null && tq0Var2.getVisibility() == 0) {
            cl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.C == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.C;
                if (i10 == 8 || zu0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.D.setPivotX(tq0Var.getMeasuredWidth());
                this.D.setPivotY(0.0f);
                this.D.setTranslationX((getMeasuredWidth() - this.D.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.D.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                zu0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f30850r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
