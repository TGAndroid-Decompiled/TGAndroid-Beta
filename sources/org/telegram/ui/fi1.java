package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class fi1 extends org.telegram.ui.Components.v81 {
    public boolean T;
    public final Path U;
    public final gi1 V;

    public fi1(gi1 gi1Var, Context context) {
        super(context, null);
        this.V = gi1Var;
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
        org.telegram.ui.ActionBar.p2 X = ((fh0) this.V).X();
        if (!(X instanceof eh0)) {
            return false;
        }
        return ((eh0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p2 X = ((fh0) this.V).X();
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
        wy wyVar;
        gi1 gi1Var = this.V;
        fh0 fh0Var = (fh0) gi1Var;
        if (fh0Var.F != null) {
            fh0Var.m0(fh0Var.f33117c.getCurrentPosition(), true);
            fh0Var.n0(0.0f, false);
        }
        fh0Var.d0();
        fi1 fi1Var = fh0Var.f33117c;
        if (fi1Var != null) {
            int currentPosition = fi1Var.getCurrentPosition();
            if (currentPosition != 2 && fh0Var.f32834x) {
                fh0Var.W(2);
                fh0Var.f32834x = false;
            }
            if (currentPosition != 3) {
                fh0Var.W(3);
            }
            Integer num = fh0Var.I;
            if (num != null && currentPosition == 0 && (wyVar = fh0Var.J) != null) {
                wyVar.w4(num.intValue());
                fh0Var.I = null;
            }
        }
        gi1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        gi1 gi1Var = this.V;
        fh0 fh0Var = (fh0) gi1Var;
        boolean z11 = !z10;
        if (fh0Var.F != null) {
            float positionAnimated = fh0Var.f33117c.getPositionAnimated();
            fh0Var.n0(positionAnimated, z11);
            if (!z10) {
                fh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        fh0Var.h0();
        fh0Var.d0();
        fh0Var.f33116b.invalidate();
        gi1Var.U();
        gi1Var.checkSystemBarColors();
    }
}
