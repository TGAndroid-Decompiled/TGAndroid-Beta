package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class qh1 extends org.telegram.ui.Components.y81 {
    public boolean U;
    public final Path V;
    public final rh1 W;

    public qh1(rh1 rh1Var, Context context) {
        super(context, null);
        this.W = rh1Var;
        this.V = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.U) {
            Path path = this.V;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.U) {
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
        org.telegram.ui.ActionBar.o2 X = ((bh0) this.W).X();
        if (!(X instanceof ah0)) {
            return false;
        }
        return ((ah0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o2 X = ((bh0) this.W).X();
        if (X instanceof ah0) {
            return ((ah0) X).S(motionEvent, true);
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
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.W.U();
    }

    @Override
    public final void u() {
        ty tyVar;
        rh1 rh1Var = this.W;
        bh0 bh0Var = (bh0) rh1Var;
        if (bh0Var.F != null) {
            bh0Var.m0(bh0Var.f37134c.getCurrentPosition(), true);
            bh0Var.n0(0.0f, false);
        }
        bh0Var.d0();
        qh1 qh1Var = bh0Var.f37134c;
        if (qh1Var != null) {
            int currentPosition = qh1Var.getCurrentPosition();
            if (currentPosition != 2 && bh0Var.f32360x) {
                bh0Var.W(2);
                bh0Var.f32360x = false;
            }
            if (currentPosition != 3) {
                bh0Var.W(3);
            }
            Integer num = bh0Var.I;
            if (num != null && currentPosition == 0 && (tyVar = bh0Var.J) != null) {
                tyVar.F4(num.intValue());
                bh0Var.I = null;
            }
        }
        rh1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        rh1 rh1Var = this.W;
        bh0 bh0Var = (bh0) rh1Var;
        boolean z11 = !z10;
        if (bh0Var.F != null) {
            float positionAnimated = bh0Var.f37134c.getPositionAnimated();
            bh0Var.n0(positionAnimated, z11);
            if (!z10) {
                bh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        bh0Var.h0();
        bh0Var.d0();
        bh0Var.f37133b.invalidate();
        rh1Var.U();
        rh1Var.checkSystemBarColors();
    }
}
