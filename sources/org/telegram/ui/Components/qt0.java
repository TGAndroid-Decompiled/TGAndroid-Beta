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
    public b90 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public long f30516a;
    public boolean f30517b;
    public ObjectAnimator f30518c;
    public f2.l d;
    public f2.c1 f30519e;
    public f2.c1 f30520f;
    public wr0 h;
    public og.k f30521n;
    public pt0 f30522r;
    public yr0 f30523s;
    public fs0 v;
    public hs0 f30524w;
    public ur0 f30525x;
    public es0 f30526y;

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
        if (view == this.f30522r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
