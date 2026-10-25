package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class tu0 extends FrameLayout {
    public int E;
    public sr0 F;
    public t90 G;
    public boolean H;
    public int I;
    public boolean J;
    public float K;
    public boolean L;
    public final Paint M;
    public org.telegram.ui.ActionBar.u6 N;
    public Drawable O;
    public long f33153a;
    public boolean f33154b;
    public ObjectAnimator f33155c;
    public s4.l d;
    public s4.w0 e;
    public s4.w0 f33156f;
    public dt0 h;
    public su0 f33157n;
    public et0 f33158r;
    public mt0 f33159s;
    public ot0 v;
    public bt0 f33160w;
    public lt0 f33161x;
    public pl0 f33162y;

    public tu0(Context context) {
        super(context);
        this.M = new Paint();
    }

    public void setDrawPageBackground(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            invalidate();
        }
    }

    public void setWallpaper(Drawable drawable) {
        Drawable drawable2 = this.O;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.O = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        sr0 sr0Var;
        e(canvas);
        super.dispatchDraw(canvas);
        sr0 sr0Var2 = this.F;
        if (sr0Var2 != null && sr0Var2.getVisibility() == 0) {
            sl0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.E == 9) {
                    dp += AndroidUtilities.dp(64.0f);
                }
                int i10 = this.E;
                if (i10 == 8 || aw0.E0(i10)) {
                    dp += AndroidUtilities.dp(42.0f);
                }
                this.F.setPivotX(sr0Var.getMeasuredWidth());
                this.F.setPivotY(0.0f);
                this.F.setTranslationX((getMeasuredWidth() - this.F.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                this.F.setTranslationY(dp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                aw0.t(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f33157n) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int dp = AndroidUtilities.dp(2.0f);
        if (this.O != null) {
            canvas.save();
            int i10 = -dp;
            canvas.clipRect(i10, min, getWidth() + dp, max);
            this.O.setBounds(i10, min, getWidth() + dp, max);
            this.O.draw(canvas);
            canvas.restore();
        } else if (this.L) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23297a7, this.N);
            Paint paint = this.M;
            paint.setColor(w02);
            canvas.drawRect(-dp, min, getWidth() + dp, max, paint);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.O && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
