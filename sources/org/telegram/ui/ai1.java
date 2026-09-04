package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class ai1 extends org.telegram.ui.Components.i81 {
    public boolean T;
    public final Path U;
    public final bi1 V;

    public ai1(bi1 bi1Var, Context context) {
        super(context, null);
        this.V = bi1Var;
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
        org.telegram.ui.ActionBar.n2 X = ((eh0) this.V).X();
        if (!(X instanceof dh0)) {
            return false;
        }
        return ((dh0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n2 X = ((eh0) this.V).X();
        if (X instanceof dh0) {
            return ((dh0) X).S(motionEvent, true);
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
        uy uyVar;
        bi1 bi1Var = this.V;
        eh0 eh0Var = (eh0) bi1Var;
        if (eh0Var.F != null) {
            eh0Var.m0(eh0Var.f34816c.getCurrentPosition(), true);
            eh0Var.n0(0.0f, false);
        }
        eh0Var.d0();
        ai1 ai1Var = eh0Var.f34816c;
        if (ai1Var != null) {
            int currentPosition = ai1Var.getCurrentPosition();
            if (currentPosition != 2 && eh0Var.f36081x) {
                eh0Var.W(2);
                eh0Var.f36081x = false;
            }
            if (currentPosition != 3) {
                eh0Var.W(3);
            }
            Integer num = eh0Var.I;
            if (num != null && currentPosition == 0 && (uyVar = eh0Var.J) != null) {
                uyVar.w4(num.intValue());
                eh0Var.I = null;
            }
        }
        bi1Var.U();
    }

    @Override
    public final void w(boolean z10) {
        bi1 bi1Var = this.V;
        eh0 eh0Var = (eh0) bi1Var;
        boolean z11 = !z10;
        if (eh0Var.F != null) {
            float positionAnimated = eh0Var.f34816c.getPositionAnimated();
            eh0Var.n0(positionAnimated, z11);
            if (!z10) {
                eh0Var.m0(Math.round(positionAnimated), true);
            }
        }
        eh0Var.h0();
        eh0Var.d0();
        eh0Var.f34815b.invalidate();
        bi1Var.U();
        bi1Var.checkSystemBarColors();
    }
}
