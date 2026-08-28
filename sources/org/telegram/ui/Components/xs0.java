package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class xs0 extends FrameLayout {
    public c2.y A;
    public int B;
    public yp0 C;
    public jg0 D;
    public boolean E;
    public int F;
    public boolean G;
    public float H;
    public long f34755a;
    public boolean f34756b;
    public ObjectAnimator f34757c;
    public f2.n d;
    public f2.f1 f34758e;
    public f2.f1 f34759f;
    public dr0 h;
    public ig.k f34760n;
    public ws0 f34761r;
    public fr0 f34762s;
    public mr0 v;
    public or0 f34763w;
    public br0 f34764x;
    public lr0 f34765y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yp0 yp0Var;
        super.dispatchDraw(canvas);
        yp0 yp0Var2 = this.C;
        if (yp0Var2 != null && yp0Var2.getVisibility() == 0) {
            fk0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.B == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i9 = this.B;
                if (i9 == 8 || eu0.w0(i9)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.C.setPivotX(yp0Var.getMeasuredWidth());
                this.C.setPivotY(0.0f);
                this.C.setTranslationX((getMeasuredWidth() - this.C.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.C.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                eu0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f34761r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
