package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
public final class lb1 extends org.telegram.ui.Components.w61 {
    public boolean W;
    public final Path f48962a0;
    public final mb1 f48963b0;

    public lb1(mb1 mb1Var, Context context) {
        super(context, null);
        this.f48963b0 = mb1Var;
        this.f48962a0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            Path path = this.f48962a0;
            path.rewind();
            float N = org.telegram.messenger.g0.N(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, org.telegram.messenger.g0.f23605m, getWidth(), getHeight());
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
        org.telegram.ui.ActionBar.e2 c02 = ((je0) this.f48963b0).c0();
        if (!(c02 instanceof ie0)) {
            return false;
        }
        return ((ie0) c02).X(motionEvent, false);
    }

    @Override
    public final boolean f(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e2 c02 = ((je0) this.f48963b0).c0();
        if (c02 instanceof ie0) {
            return ((ie0) c02).X(motionEvent, true);
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
        this.f48963b0.Z();
    }

    @Override
    public final void r() {
        yw ywVar;
        mb1 mb1Var = this.f48963b0;
        je0 je0Var = (je0) mb1Var;
        if (je0Var.G != null) {
            je0Var.s0(je0Var.f49201c.getCurrentPosition(), true);
            je0Var.t0(false, 0.0f);
        }
        je0Var.i0();
        lb1 lb1Var = je0Var.f49201c;
        if (lb1Var != null) {
            int currentPosition = lb1Var.getCurrentPosition();
            if (currentPosition != 2 && je0Var.f48301y) {
                je0Var.b0(2);
                je0Var.f48301y = false;
            }
            if (currentPosition != 3) {
                je0Var.b0(3);
            }
            Integer num = je0Var.J;
            if (num != null && currentPosition == 0 && (ywVar = je0Var.K) != null) {
                ywVar.I4(num.intValue());
                je0Var.J = null;
            }
        }
        mb1Var.Z();
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
        mb1 mb1Var = this.f48963b0;
        je0 je0Var = (je0) mb1Var;
        boolean z11 = !z10;
        if (je0Var.G != null) {
            float positionAnimated = je0Var.f49201c.getPositionAnimated();
            je0Var.t0(z11, positionAnimated);
            if (!z10) {
                je0Var.s0(Math.round(positionAnimated), true);
            }
        }
        je0Var.n0();
        je0Var.i0();
        je0Var.f49200b.invalidate();
        mb1Var.Z();
        mb1Var.checkSystemBarColors();
    }
}
