package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
public final class mb1 extends org.telegram.ui.Components.u61 {
    public boolean V;
    public final Path W;
    public final nb1 f47781a0;

    public mb1(nb1 nb1Var, Context context) {
        super(context, null);
        this.f47781a0 = nb1Var;
        this.W = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.V) {
            Path path = this.W;
            path.rewind();
            float N = org.telegram.messenger.g0.N(24.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, org.telegram.messenger.g0.f22531m, getWidth(), getHeight());
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
        org.telegram.ui.ActionBar.f2 c02 = ((je0) this.f47781a0).c0();
        if (!(c02 instanceof ie0)) {
            return false;
        }
        return ((ie0) c02).W(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f2 c02 = ((je0) this.f47781a0).c0();
        if (c02 instanceof ie0) {
            return ((ie0) c02).W(motionEvent, true);
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
        this.f47781a0.Z();
    }

    @Override
    public final void u() {
        ww wwVar;
        nb1 nb1Var = this.f47781a0;
        je0 je0Var = (je0) nb1Var;
        if (je0Var.F != null) {
            je0Var.s0(je0Var.f48015c.getCurrentPosition(), true);
            je0Var.t0(false, 0.0f);
        }
        je0Var.i0();
        mb1 mb1Var = je0Var.f48015c;
        if (mb1Var != null) {
            int currentPosition = mb1Var.getCurrentPosition();
            if (currentPosition != 2 && je0Var.f46946y) {
                je0Var.b0(2);
                je0Var.f46946y = false;
            }
            if (currentPosition != 3) {
                je0Var.b0(3);
            }
            Integer num = je0Var.I;
            if (num != null && currentPosition == 0 && (wwVar = je0Var.J) != null) {
                wwVar.I4(num.intValue());
                je0Var.I = null;
            }
        }
        nb1Var.Z();
    }

    @Override
    public final void w(boolean z9) {
        nb1 nb1Var = this.f47781a0;
        je0 je0Var = (je0) nb1Var;
        boolean z10 = !z9;
        if (je0Var.F != null) {
            float positionAnimated = je0Var.f48015c.getPositionAnimated();
            je0Var.t0(z10, positionAnimated);
            if (!z9) {
                je0Var.s0(Math.round(positionAnimated), true);
            }
        }
        je0Var.n0();
        je0Var.i0();
        je0Var.f48014b.invalidate();
        nb1Var.Z();
        nb1Var.checkSystemBarColors();
    }
}
