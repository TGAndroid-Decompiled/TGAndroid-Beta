package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
public abstract class ts0 extends FrameLayout {
    public wj0 D;
    public int E;
    public org.telegram.ui.Cells.a5 F;
    public hi0 G;
    public boolean H;
    public int I;
    public boolean J;
    public float K;
    public boolean L;
    public final Paint M;
    public org.telegram.ui.ActionBar.p6 N;
    public Drawable O;
    public long f30715a;
    public boolean f30716b;
    public ObjectAnimator f30717c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f30718f;
    public er0 h;
    public ss0 f30719n;
    public fr0 f30720r;
    public nr0 f30721s;
    public pr0 f30722w;
    public cr0 f30723x;
    public mr0 f30724y;

    public ts0(Context context) {
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
        org.telegram.ui.Cells.a5 a5Var;
        g(canvas);
        super.dispatchDraw(canvas);
        org.telegram.ui.Cells.a5 a5Var2 = this.F;
        if (a5Var2 != null && a5Var2.getVisibility() == 0) {
            ak0 fastScroll = this.h.getFastScroll();
            if (fastScroll != null) {
                float L = org.telegram.messenger.i0.L(36.0f) + fastScroll.getScrollBarY();
                if (this.E == 9) {
                    L += org.telegram.messenger.i0.L(64.0f);
                }
                int i10 = this.E;
                if (i10 == 8 || au0.G0(i10)) {
                    L += org.telegram.messenger.i0.L(42.0f);
                }
                this.F.setPivotX(a5Var.getMeasuredWidth());
                this.F.setPivotY(0.0f);
                this.F.setTranslationX((getMeasuredWidth() - this.F.getMeasuredWidth()) - org.telegram.messenger.i0.L(16.0f));
                this.F.setTranslationY(L);
            }
            if (fastScroll.getProgress() > 0.85f) {
                au0.p(this, null, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f30719n) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void g(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int L = org.telegram.messenger.i0.L(2.0f);
        if (this.O != null) {
            canvas.save();
            int i10 = -L;
            canvas.clipRect(i10, min, getWidth() + L, max);
            this.O.setBounds(i10, min, getWidth() + L, max);
            this.O.draw(canvas);
            canvas.restore();
        } else if (this.L) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, this.N);
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
