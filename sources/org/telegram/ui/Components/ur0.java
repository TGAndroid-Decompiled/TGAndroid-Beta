package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public abstract class ur0 extends FrameLayout {
    public si0 D;
    public int E;
    public di.b4 F;
    public w80 G;
    public boolean H;
    public int I;
    public boolean J;
    public float K;
    public boolean L;
    public final Paint M;
    public org.telegram.ui.ActionBar.g6 N;
    public Drawable O;
    public long f38787a;
    public boolean f38788b;
    public ObjectAnimator f38789c;
    public v4.k d;
    public v4.u0 f38790e;
    public v4.u0 f38791f;
    public dq0 h;
    public tr0 f38792n;
    public eq0 f38793r;
    public nq0 f38794s;
    public pq0 f38795w;
    public bq0 f38796x;
    public mq0 f38797y;

    public ur0(Context context) {
        super(context);
        this.M = new Paint();
    }

    public void setDrawPageBackground(boolean z9) {
        if (this.L != z9) {
            this.L = z9;
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
        di.b4 b4Var;
        h(canvas);
        super.dispatchDraw(canvas);
        di.b4 b4Var2 = this.F;
        if (b4Var2 != null && b4Var2.getVisibility() == 0) {
            vi0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float L = org.telegram.messenger.g0.L(36.0f) + fastScroll.getScrollBarY();
                if (this.E == 9) {
                    L += org.telegram.messenger.g0.L(64.0f);
                }
                int i7 = this.E;
                if (i7 == 8 || zs0.J0(i7)) {
                    L += org.telegram.messenger.g0.L(42.0f);
                }
                this.F.setPivotX(b4Var.getMeasuredWidth());
                this.F.setPivotY(0.0f);
                this.F.setTranslationX((getMeasuredWidth() - this.F.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f));
                this.F.setTranslationY(L);
            }
            if (fastScroll.getProgress() > 0.85f) {
                zs0.s(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f38792n) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void h(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int L = org.telegram.messenger.g0.L(2.0f);
        if (this.O != null) {
            canvas.save();
            int i7 = -L;
            canvas.clipRect(i7, min, getWidth() + L, max);
            this.O.setBounds(i7, min, getWidth() + L, max);
            this.O.draw(canvas);
            canvas.restore();
        } else if (this.L) {
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27809a7, this.N);
            Paint paint = this.M;
            paint.setColor(w02);
            canvas.drawRect(-L, min, getWidth() + L, max, paint);
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
