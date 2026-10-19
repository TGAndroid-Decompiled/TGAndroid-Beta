package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ng1 extends org.telegram.ui.Components.d91 {
    public boolean T;
    public final Path U;
    public final og1 V;

    public ng1(og1 og1Var, Context context) {
        super(context, null);
        this.V = og1Var;
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
        org.telegram.ui.ActionBar.n2 X = ((mg0) this.V).X();
        if (!(X instanceof lg0)) {
            return false;
        }
        return ((lg0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n2 X = ((mg0) this.V).X();
        if (X instanceof lg0) {
            return ((lg0) X).S(motionEvent, true);
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
        cy cyVar;
        og1 og1Var = this.V;
        mg0 mg0Var = (mg0) og1Var;
        if (mg0Var.F != null) {
            mg0Var.m0(mg0Var.f39888c.getCurrentPosition(), true);
            mg0Var.n0(0.0f, false);
        }
        mg0Var.d0();
        ng1 ng1Var = mg0Var.f39888c;
        if (ng1Var != null) {
            int currentPosition = ng1Var.getCurrentPosition();
            if (currentPosition != 2 && mg0Var.f39267x) {
                mg0Var.W(2);
                mg0Var.f39267x = false;
            }
            if (currentPosition != 3) {
                mg0Var.W(3);
            }
            Integer num = mg0Var.I;
            if (num != null && currentPosition == 0 && (cyVar = mg0Var.J) != null) {
                cyVar.u4(num.intValue());
                mg0Var.I = null;
            }
        }
        og1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        og1 og1Var = this.V;
        mg0 mg0Var = (mg0) og1Var;
        boolean z11 = !z10;
        if (mg0Var.F != null) {
            float positionAnimated = mg0Var.f39888c.getPositionAnimated();
            mg0Var.n0(positionAnimated, z11);
            if (!z10) {
                mg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        mg0Var.h0();
        mg0Var.d0();
        mg0Var.f39887b.invalidate();
        og1Var.U();
        og1Var.checkSystemBarColors();
    }
}
