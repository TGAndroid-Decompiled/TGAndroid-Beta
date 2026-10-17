package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class pg1 extends org.telegram.ui.Components.c91 {
    public boolean T;
    public final Path U;
    public final qg1 V;

    public pg1(qg1 qg1Var, Context context) {
        super(context, null);
        this.V = qg1Var;
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
        org.telegram.ui.ActionBar.n2 X = ((pg0) this.V).X();
        if (!(X instanceof og0)) {
            return false;
        }
        return ((og0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n2 X = ((pg0) this.V).X();
        if (X instanceof og0) {
            return ((og0) X).S(motionEvent, true);
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
        ey eyVar;
        qg1 qg1Var = this.V;
        pg0 pg0Var = (pg0) qg1Var;
        if (pg0Var.F != null) {
            pg0Var.m0(pg0Var.f40427c.getCurrentPosition(), true);
            pg0Var.n0(0.0f, false);
        }
        pg0Var.d0();
        pg1 pg1Var = pg0Var.f40427c;
        if (pg1Var != null) {
            int currentPosition = pg1Var.getCurrentPosition();
            if (currentPosition != 2 && pg0Var.f40130x) {
                pg0Var.W(2);
                pg0Var.f40130x = false;
            }
            if (currentPosition != 3) {
                pg0Var.W(3);
            }
            Integer num = pg0Var.I;
            if (num != null && currentPosition == 0 && (eyVar = pg0Var.J) != null) {
                eyVar.u4(num.intValue());
                pg0Var.I = null;
            }
        }
        qg1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        qg1 qg1Var = this.V;
        pg0 pg0Var = (pg0) qg1Var;
        boolean z11 = !z10;
        if (pg0Var.F != null) {
            float positionAnimated = pg0Var.f40427c.getPositionAnimated();
            pg0Var.n0(positionAnimated, z11);
            if (!z10) {
                pg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        pg0Var.h0();
        pg0Var.d0();
        pg0Var.f40426b.invalidate();
        qg1Var.U();
        qg1Var.checkSystemBarColors();
    }
}
