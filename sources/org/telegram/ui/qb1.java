package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
public final class qb1 extends org.telegram.ui.Components.v61 {
    public boolean V;
    public final Path W;
    public final rb1 f49010a0;

    public qb1(rb1 rb1Var, Context context) {
        super(context, null);
        this.f49010a0 = rb1Var;
        this.W = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            Path path = this.W;
            path.rewind();
            float N = org.telegram.messenger.g0.N(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, org.telegram.messenger.g0.f22561m, getWidth(), getHeight());
            path.addRoundRect(rectF, N, N, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.V) {
            canvas.restore();
        }
    }

    @Override
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override
    public final boolean j(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f2 c02 = ((me0) this.f49010a0).c0();
        if (!(c02 instanceof le0)) {
            return false;
        }
        return ((le0) c02).W(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f2 c02 = ((me0) this.f49010a0).c0();
        if (c02 instanceof le0) {
            return ((le0) c02).W(motionEvent, true);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z9) {
        if (this.V == z9) {
            return;
        }
        this.V = z9;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i7, int i10) {
        this.f49010a0.Z();
    }

    @Override
    public final void u() {
        zw zwVar;
        rb1 rb1Var = this.f49010a0;
        me0 me0Var = (me0) rb1Var;
        if (me0Var.F != null) {
            me0Var.s0(me0Var.f49345c.getCurrentPosition(), true);
            me0Var.t0(false, 0.0f);
        }
        me0Var.i0();
        qb1 qb1Var = me0Var.f49345c;
        if (qb1Var != null) {
            int currentPosition = qb1Var.getCurrentPosition();
            if (currentPosition != 2 && me0Var.f47937y) {
                me0Var.b0(2);
                me0Var.f47937y = false;
            }
            if (currentPosition != 3) {
                me0Var.b0(3);
            }
            Integer num = me0Var.I;
            if (num != null && currentPosition == 0 && (zwVar = me0Var.J) != null) {
                zwVar.I4(num.intValue());
                me0Var.I = null;
            }
        }
        rb1Var.Z();
    }

    @Override
    public final void w(boolean z9) {
        rb1 rb1Var = this.f49010a0;
        me0 me0Var = (me0) rb1Var;
        boolean z10 = !z9;
        if (me0Var.F != null) {
            float positionAnimated = me0Var.f49345c.getPositionAnimated();
            me0Var.t0(z10, positionAnimated);
            if (!z9) {
                me0Var.s0(Math.round(positionAnimated), true);
            }
        }
        me0Var.n0();
        me0Var.i0();
        me0Var.f49344b.invalidate();
        rb1Var.Z();
        rb1Var.checkSystemBarColors();
    }
}
