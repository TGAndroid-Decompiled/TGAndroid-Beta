package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
public final class gd1 extends org.telegram.ui.Components.x71 {
    public boolean V;
    public final Path W;
    public final hd1 f37459a0;

    public gd1(hd1 hd1Var, Context context) {
        super(context, null);
        this.f37459a0 = hd1Var;
        this.W = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            Path path = this.W;
            path.rewind();
            float N = org.telegram.messenger.i0.N(24.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, org.telegram.messenger.i0.f16166m, getWidth(), getHeight());
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
        org.telegram.ui.ActionBar.k2 c02 = ((of0) this.f37459a0).c0();
        if (!(c02 instanceof nf0)) {
            return false;
        }
        return ((nf0) c02).X(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k2 c02 = ((of0) this.f37459a0).c0();
        if (c02 instanceof nf0) {
            return ((nf0) c02).X(motionEvent, true);
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
        this.f37459a0.Z();
    }

    @Override
    public final void u() {
        zx zxVar;
        hd1 hd1Var = this.f37459a0;
        of0 of0Var = (of0) hd1Var;
        if (of0Var.F != null) {
            of0Var.s0(of0Var.f37789c.getCurrentPosition(), true);
            of0Var.t0(false, 0.0f);
        }
        of0Var.i0();
        gd1 gd1Var = of0Var.f37789c;
        if (gd1Var != null) {
            int currentPosition = gd1Var.getCurrentPosition();
            if (currentPosition != 2 && of0Var.f40153y) {
                of0Var.b0(2);
                of0Var.f40153y = false;
            }
            if (currentPosition != 3) {
                of0Var.b0(3);
            }
            Integer num = of0Var.I;
            if (num != null && currentPosition == 0 && (zxVar = of0Var.J) != null) {
                zxVar.I4(num.intValue());
                of0Var.I = null;
            }
        }
        hd1Var.Z();
    }

    @Override
    public final void w(boolean z10) {
        hd1 hd1Var = this.f37459a0;
        of0 of0Var = (of0) hd1Var;
        boolean z11 = !z10;
        if (of0Var.F != null) {
            float positionAnimated = of0Var.f37789c.getPositionAnimated();
            of0Var.t0(z11, positionAnimated);
            if (!z10) {
                of0Var.s0(Math.round(positionAnimated), true);
            }
        }
        of0Var.n0();
        of0Var.i0();
        of0Var.f37788b.invalidate();
        hd1Var.Z();
        hd1Var.checkSystemBarColors();
    }
}
