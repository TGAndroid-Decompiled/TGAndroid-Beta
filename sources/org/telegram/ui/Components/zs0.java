package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public abstract class zs0 extends FrameLayout {
    public c2.x A;
    public int B;
    public zp0 C;
    public lg0 D;
    public boolean E;
    public int F;
    public boolean G;
    public float H;

    public long f35334a;

    public boolean f35335b;

    public ObjectAnimator f35336c;
    public f2.l d;

    public f2.d1 f35337e;

    public f2.d1 f35338f;
    public er0 h;

    public jg.k f35339n;

    public ys0 f35340r;

    public gr0 f35341s;
    public nr0 v;

    public pr0 f35342w;

    public cr0 f35343x;

    public mr0 f35344y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        zp0 zp0Var = this.C;
        if (zp0Var == null || zp0Var.getVisibility() != 0) {
            return;
        }
        ik0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float fDp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.B == 9) {
                fDp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.B;
            if (i10 == 8 || hu0.w0(i10)) {
                fDp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.C.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            zp0 zp0Var2 = this.C;
            zp0Var2.setPivotX(zp0Var2.getMeasuredWidth());
            this.C.setPivotY(0.0f);
            this.C.setTranslationX(measuredWidth);
            this.C.setTranslationY(fDp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            hu0.q(this, null, false);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f35340r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
