package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class di1 extends org.telegram.ui.Components.u91 {
    public boolean T;
    public final Path U;
    public final ei1 V;

    public di1(ei1 ei1Var, Context context) {
        super(context, null);
        this.V = ei1Var;
        this.U = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.T) {
            Path path = this.U;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.T) {
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
        org.telegram.ui.ActionBar.m2 X = ((gh0) this.V).X();
        if (!(X instanceof fh0)) {
            return false;
        }
        return ((fh0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m2 X = ((gh0) this.V).X();
        if (X instanceof fh0) {
            return ((fh0) X).S(motionEvent, true);
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
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.V.U();
    }

    @Override
    public final void u() {
        vy vyVar;
        ei1 ei1Var = this.V;
        gh0 gh0Var = (gh0) ei1Var;
        if (gh0Var.F != null) {
            gh0Var.m0(gh0Var.f37116c.getCurrentPosition(), true);
            gh0Var.n0(0.0f, false);
        }
        gh0Var.d0();
        di1 di1Var = gh0Var.f37116c;
        if (di1Var != null) {
            int currentPosition = di1Var.getCurrentPosition();
            if (currentPosition != 2 && gh0Var.f38052x) {
                gh0Var.W(2);
                gh0Var.f38052x = false;
            }
            if (currentPosition != 3) {
                gh0Var.W(3);
            }
            Integer num = gh0Var.I;
            if (num != null && currentPosition == 0 && (vyVar = gh0Var.J) != null) {
                vyVar.t4(num.intValue());
                gh0Var.I = null;
            }
        }
        ei1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        ei1 ei1Var = this.V;
        gh0 gh0Var = (gh0) ei1Var;
        boolean z11 = !z10;
        if (gh0Var.F != null) {
            float positionAnimated = gh0Var.f37116c.getPositionAnimated();
            gh0Var.n0(positionAnimated, z11);
            if (!z10) {
                gh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        gh0Var.h0();
        gh0Var.d0();
        gh0Var.f37115b.invalidate();
        ei1Var.U();
        ei1Var.checkSystemBarColors();
    }
}
