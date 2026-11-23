package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public abstract class ds0 extends FrameLayout {
    public org.telegram.ui.ActionBar.l5 E;
    public int F;
    public bi.v2 G;
    public sh0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public boolean M;
    public final Paint N;
    public org.telegram.ui.ActionBar.i6 O;
    public Drawable P;
    public long f34441a;
    public boolean f34442b;
    public ObjectAnimator f34443c;
    public v4.l d;
    public v4.w0 f34444e;
    public v4.w0 f34445f;
    public mq0 h;
    public cs0 f34446n;
    public nq0 f34447r;
    public wq0 f34448s;
    public yq0 f34449w;
    public kq0 f34450x;
    public vq0 f34451y;

    public ds0(Context context) {
        super(context);
        this.N = new Paint();
    }

    public void setDrawPageBackground(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            invalidate();
        }
    }

    public void setWallpaper(Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.P = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        bi.v2 v2Var;
        h(canvas);
        super.dispatchDraw(canvas);
        bi.v2 v2Var2 = this.G;
        if (v2Var2 != null && v2Var2.getVisibility() == 0) {
            jj0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float L = org.telegram.messenger.g0.L(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    L += org.telegram.messenger.g0.L(64.0f);
                }
                int i7 = this.F;
                if (i7 == 8 || it0.J0(i7)) {
                    L += org.telegram.messenger.g0.L(42.0f);
                }
                this.G.setPivotX(v2Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f));
                this.G.setTranslationY(L);
            }
            if (fastScroll.getProgress() > 0.85f) {
                it0.s(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f34446n) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void h(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int L = org.telegram.messenger.g0.L(2.0f);
        if (this.P != null) {
            canvas.save();
            int i7 = -L;
            canvas.clipRect(i7, min, getWidth() + L, max);
            this.P.setBounds(i7, min, getWidth() + L, max);
            this.P.draw(canvas);
            canvas.restore();
        } else if (this.M) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394a7, this.O);
            Paint paint = this.N;
            paint.setColor(w02);
            canvas.drawRect(-L, min, getWidth() + L, max, paint);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.P && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
