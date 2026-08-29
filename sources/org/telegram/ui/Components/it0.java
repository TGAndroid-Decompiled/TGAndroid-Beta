package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class it0 extends FrameLayout {
    public c2.z A;
    public int B;
    public kq0 C;
    public ii0 D;
    public boolean E;
    public int F;
    public boolean G;
    public float H;
    public long f29463a;
    public boolean f29464b;
    public ObjectAnimator f29465c;
    public f2.l d;
    public f2.c1 f29466e;
    public f2.c1 f29467f;
    public or0 h;
    public lg.k f29468n;
    public ht0 f29469r;
    public qr0 f29470s;
    public xr0 v;
    public zr0 f29471w;
    public mr0 f29472x;
    public wr0 f29473y;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kq0 kq0Var;
        super.dispatchDraw(canvas);
        kq0 kq0Var2 = this.C;
        if (kq0Var2 != null && kq0Var2.getVisibility() == 0) {
            sk0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.B == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.B;
                if (i10 == 8 || qu0.w0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.C.setPivotX(kq0Var.getMeasuredWidth());
                this.C.setPivotY(0.0f);
                this.C.setTranslationX((getMeasuredWidth() - this.C.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.C.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                qu0.q(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f29469r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }
}
