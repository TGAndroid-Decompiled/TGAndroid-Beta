package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class qt0 extends FrameLayout {
    public c2.y B;
    public int C;
    public sq0 D;
    public i80 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public long f28237a;
    public boolean f28238b;
    public ObjectAnimator f28239c;
    public f2.l d;
    public f2.b1 e;
    public f2.b1 f28240f;
    public wr0 h;
    public ng.k f28241n;
    public pt0 f28242r;
    public yr0 f28243s;
    public fs0 v;
    public hs0 f28244w;
    public ur0 f28245x;
    public es0 f28246y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sq0 sq0Var;
        super.dispatchDraw(canvas);
        sq0 sq0Var2 = this.D;
        if (sq0Var2 != null && sq0Var2.getVisibility() == 0) {
            bl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.C == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.C;
                if (i10 == 8 || yu0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.D.setPivotX(sq0Var.getMeasuredWidth());
                this.D.setPivotY(0.0f);
                this.D.setTranslationX((getMeasuredWidth() - this.D.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.D.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                yu0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f28242r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
