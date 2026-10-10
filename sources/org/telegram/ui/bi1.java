package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class bi1 extends org.telegram.ui.Components.p91 {
    public boolean T;
    public final Path U;
    public final ci1 V;

    public bi1(ci1 ci1Var, Context context) {
        super(context, null);
        this.V = ci1Var;
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
        org.telegram.ui.ActionBar.n2 X = ((fh0) this.V).X();
        if (!(X instanceof eh0)) {
            return false;
        }
        return ((eh0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n2 X = ((fh0) this.V).X();
        if (X instanceof eh0) {
            return ((eh0) X).S(motionEvent, true);
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
        ty tyVar;
        ci1 ci1Var = this.V;
        fh0 fh0Var = (fh0) ci1Var;
        if (fh0Var.F != null) {
            fh0Var.m0(fh0Var.f36731c.getCurrentPosition(), true);
            fh0Var.n0(0.0f, false);
        }
        fh0Var.d0();
        bi1 bi1Var = fh0Var.f36731c;
        if (bi1Var != null) {
            int currentPosition = bi1Var.getCurrentPosition();
            if (currentPosition != 2 && fh0Var.f37653x) {
                fh0Var.W(2);
                fh0Var.f37653x = false;
            }
            if (currentPosition != 3) {
                fh0Var.W(3);
            }
            Integer num = fh0Var.I;
            if (num != null && currentPosition == 0 && (tyVar = fh0Var.J) != null) {
                tyVar.t4(num.intValue());
                fh0Var.I = null;
            }
        }
        ci1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        ci1 ci1Var = this.V;
        fh0 fh0Var = (fh0) ci1Var;
        boolean z11 = !z10;
        if (fh0Var.F != null) {
            float positionAnimated = fh0Var.f36731c.getPositionAnimated();
            fh0Var.n0(positionAnimated, z11);
            if (!z10) {
                fh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        fh0Var.h0();
        fh0Var.d0();
        fh0Var.f36730b.invalidate();
        ci1Var.U();
        ci1Var.checkSystemBarColors();
    }
}
