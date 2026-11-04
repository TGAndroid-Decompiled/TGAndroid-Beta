package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public abstract class rr0 extends FrameLayout {
    public vi0 E;
    public int F;
    public ai.d2 G;
    public j50 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public boolean M;
    public final Paint N;
    public org.telegram.ui.ActionBar.e6 O;
    public Drawable P;
    public long f37782a;
    public boolean f37783b;
    public ObjectAnimator f37784c;
    public u4.k d;
    public u4.v0 f37785e;
    public u4.v0 f37786f;
    public cq0 h;
    public qr0 f37787n;
    public dq0 f37788r;
    public lq0 f37789s;
    public nq0 f37790w;
    public aq0 f37791x;
    public kq0 f37792y;

    public rr0(Context context) {
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
        ai.d2 d2Var;
        g(canvas);
        super.dispatchDraw(canvas);
        ai.d2 d2Var2 = this.G;
        if (d2Var2 != null && d2Var2.getVisibility() == 0) {
            yi0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float L = org.telegram.messenger.g0.L(36.0f) + fastScroll.getScrollBarY();
                if (this.F == 9) {
                    L += org.telegram.messenger.g0.L(64.0f);
                }
                int i3 = this.F;
                if (i3 == 8 || ws0.I0(i3)) {
                    L += org.telegram.messenger.g0.L(42.0f);
                }
                this.G.setPivotX(d2Var.getMeasuredWidth());
                this.G.setPivotY(0.0f);
                this.G.setTranslationX((getMeasuredWidth() - this.G.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f));
                this.G.setTranslationY(L);
            }
            if (fastScroll.getProgress() > 0.85f) {
                ws0.s(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f37787n) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void g(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int L = org.telegram.messenger.g0.L(2.0f);
        if (this.P != null) {
            canvas.save();
            int i3 = -L;
            canvas.clipRect(i3, min, getWidth() + L, max);
            this.P.setBounds(i3, min, getWidth() + L, max);
            this.P.draw(canvas);
            canvas.restore();
        } else if (this.M) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27824a7, this.O);
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
