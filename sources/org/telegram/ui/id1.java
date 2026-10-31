package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
public final class id1 extends org.telegram.ui.Components.w71 {
    public boolean V;
    public final Path W;
    public final jd1 f38244a0;

    public id1(jd1 jd1Var, Context context) {
        super(context, null);
        this.f38244a0 = jd1Var;
        this.W = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            Path path = this.W;
            path.rewind();
            float N = org.telegram.messenger.i0.N(24.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, org.telegram.messenger.i0.f16020m, getWidth(), getHeight());
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
        org.telegram.ui.ActionBar.k2 b02 = ((pf0) this.f38244a0).b0();
        if (!(b02 instanceof of0)) {
            return false;
        }
        return ((of0) b02).W(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k2 b02 = ((pf0) this.f38244a0).b0();
        if (b02 instanceof of0) {
            return ((of0) b02).W(motionEvent, true);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z10) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.f38244a0.Y();
    }

    @Override
    public final void u() {
        ay ayVar;
        jd1 jd1Var = this.f38244a0;
        pf0 pf0Var = (pf0) jd1Var;
        if (pf0Var.F != null) {
            pf0Var.r0(pf0Var.f38499c.getCurrentPosition(), true);
            pf0Var.s0(false, 0.0f);
        }
        pf0Var.h0();
        id1 id1Var = pf0Var.f38499c;
        if (id1Var != null) {
            int currentPosition = id1Var.getCurrentPosition();
            if (currentPosition != 2 && pf0Var.f40663y) {
                pf0Var.a0(2);
                pf0Var.f40663y = false;
            }
            if (currentPosition != 3) {
                pf0Var.a0(3);
            }
            Integer num = pf0Var.I;
            if (num != null && currentPosition == 0 && (ayVar = pf0Var.J) != null) {
                ayVar.H4(num.intValue());
                pf0Var.I = null;
            }
        }
        jd1Var.Y();
    }

    @Override
    public final void w(boolean z10) {
        jd1 jd1Var = this.f38244a0;
        pf0 pf0Var = (pf0) jd1Var;
        boolean z11 = !z10;
        if (pf0Var.F != null) {
            float positionAnimated = pf0Var.f38499c.getPositionAnimated();
            pf0Var.s0(z11, positionAnimated);
            if (!z10) {
                pf0Var.r0(Math.round(positionAnimated), true);
            }
        }
        pf0Var.m0();
        pf0Var.h0();
        pf0Var.f38498b.invalidate();
        jd1Var.Y();
        jd1Var.checkSystemBarColors();
    }
}
