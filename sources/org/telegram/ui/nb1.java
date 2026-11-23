package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
public final class nb1 extends org.telegram.ui.Components.k71 {
    public boolean W;
    public final Path f50287a0;
    public final ob1 f50288b0;

    public nb1(ob1 ob1Var, Context context) {
        super(context, null);
        this.f50288b0 = ob1Var;
        this.f50287a0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            Path path = this.f50287a0;
            path.rewind();
            float N = org.telegram.messenger.g0.N(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, org.telegram.messenger.g0.f24220m, getWidth(), getHeight());
            path.addRoundRect(rectF, N, N, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.W) {
            canvas.restore();
        }
    }

    @Override
    public final boolean e(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g2 c02 = ((le0) this.f50288b0).c0();
        if (!(c02 instanceof ke0)) {
            return false;
        }
        return ((ke0) c02).X(motionEvent, false);
    }

    @Override
    public final boolean f(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g2 c02 = ((le0) this.f50288b0).c0();
        if (c02 instanceof ke0) {
            return ((ke0) c02).X(motionEvent, true);
        }
        return false;
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void q(View view, View view2, int i7, int i10) {
        this.f50288b0.Z();
    }

    @Override
    public final void r() {
        bx bxVar;
        ob1 ob1Var = this.f50288b0;
        le0 le0Var = (le0) ob1Var;
        if (le0Var.G != null) {
            le0Var.s0(le0Var.f50634c.getCurrentPosition(), true);
            le0Var.t0(false, 0.0f);
        }
        le0Var.i0();
        nb1 nb1Var = le0Var.f50634c;
        if (nb1Var != null) {
            int currentPosition = nb1Var.getCurrentPosition();
            if (currentPosition != 2 && le0Var.f49740y) {
                le0Var.b0(2);
                le0Var.f49740y = false;
            }
            if (currentPosition != 3) {
                le0Var.b0(3);
            }
            Integer num = le0Var.J;
            if (num != null && currentPosition == 0 && (bxVar = le0Var.K) != null) {
                bxVar.Q4(num.intValue());
                le0Var.J = null;
            }
        }
        ob1Var.Z();
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        invalidate();
    }

    @Override
    public final void t(boolean z10) {
        ob1 ob1Var = this.f50288b0;
        le0 le0Var = (le0) ob1Var;
        boolean z11 = !z10;
        if (le0Var.G != null) {
            float positionAnimated = le0Var.f50634c.getPositionAnimated();
            le0Var.t0(z11, positionAnimated);
            if (!z10) {
                le0Var.s0(Math.round(positionAnimated), true);
            }
        }
        le0Var.n0();
        le0Var.i0();
        le0Var.f50633b.invalidate();
        ob1Var.Z();
        ob1Var.checkSystemBarColors();
    }
}
