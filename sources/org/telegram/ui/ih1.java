package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ih1 extends org.telegram.ui.Components.m81 {
    public boolean Q;
    public final Path R;
    public final jh1 S;

    public ih1(jh1 jh1Var, Context context) {
        super(context, null);
        this.S = jh1Var;
        this.R = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.Q) {
            Path path = this.R;
            path.rewind();
            float dpf2 = AndroidUtilities.dpf2(24.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.statusBarHeight, getWidth(), getHeight());
            path.addRoundRect(rectF, dpf2, dpf2, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.Q) {
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
        org.telegram.ui.ActionBar.p2 X = ((wg0) this.S).X();
        if (!(X instanceof vg0)) {
            return false;
        }
        return ((vg0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p2 X = ((wg0) this.S).X();
        if (X instanceof vg0) {
            return ((vg0) X).S(motionEvent, true);
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z4) {
        if (this.Q == z4) {
            return;
        }
        this.Q = z4;
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.S.U();
    }

    @Override
    public final void u() {
        py pyVar;
        jh1 jh1Var = this.S;
        wg0 wg0Var = (wg0) jh1Var;
        if (wg0Var.C != null) {
            wg0Var.m0(wg0Var.f38158c.getCurrentPosition(), true);
            wg0Var.n0(0.0f, false);
        }
        wg0Var.d0();
        ih1 ih1Var = wg0Var.f38158c;
        if (ih1Var != null) {
            int currentPosition = ih1Var.getCurrentPosition();
            if (currentPosition != 2 && wg0Var.f42807x) {
                wg0Var.W(2);
                wg0Var.f42807x = false;
            }
            if (currentPosition != 3) {
                wg0Var.W(3);
            }
            Integer num = wg0Var.F;
            if (num != null && currentPosition == 0 && (pyVar = wg0Var.G) != null) {
                pyVar.w4(num.intValue());
                wg0Var.F = null;
            }
        }
        jh1Var.U();
    }

    @Override
    public final void w(boolean z4) {
        jh1 jh1Var = this.S;
        wg0 wg0Var = (wg0) jh1Var;
        boolean z10 = !z4;
        if (wg0Var.C != null) {
            float positionAnimated = wg0Var.f38158c.getPositionAnimated();
            wg0Var.n0(positionAnimated, z10);
            if (!z4) {
                wg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        wg0Var.h0();
        wg0Var.d0();
        wg0Var.f38157b.invalidate();
        jh1Var.U();
        jh1Var.checkSystemBarColors();
    }
}
