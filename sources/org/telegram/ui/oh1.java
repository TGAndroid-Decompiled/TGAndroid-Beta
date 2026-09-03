package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class oh1 extends org.telegram.ui.Components.l81 {
    public boolean Q;
    public final Path R;
    public final ph1 S;

    public oh1(ph1 ph1Var, Context context) {
        super(context, null);
        this.S = ph1Var;
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
        org.telegram.ui.ActionBar.p2 X = ((xg0) this.S).X();
        if (!(X instanceof wg0)) {
            return false;
        }
        return ((wg0) X).S(motionEvent, false);
    }

    @Override
    public final boolean k(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p2 X = ((xg0) this.S).X();
        if (X instanceof wg0) {
            return ((wg0) X).S(motionEvent, true);
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
        qy qyVar;
        ph1 ph1Var = this.S;
        xg0 xg0Var = (xg0) ph1Var;
        if (xg0Var.C != null) {
            xg0Var.m0(xg0Var.f37165c.getCurrentPosition(), true);
            xg0Var.n0(0.0f, false);
        }
        xg0Var.d0();
        oh1 oh1Var = xg0Var.f37165c;
        if (oh1Var != null) {
            int currentPosition = oh1Var.getCurrentPosition();
            if (currentPosition != 2 && xg0Var.f39980x) {
                xg0Var.W(2);
                xg0Var.f39980x = false;
            }
            if (currentPosition != 3) {
                xg0Var.W(3);
            }
            Integer num = xg0Var.F;
            if (num != null && currentPosition == 0 && (qyVar = xg0Var.G) != null) {
                qyVar.w4(num.intValue());
                xg0Var.F = null;
            }
        }
        ph1Var.U();
    }

    @Override
    public final void w(boolean z4) {
        ph1 ph1Var = this.S;
        xg0 xg0Var = (xg0) ph1Var;
        boolean z10 = !z4;
        if (xg0Var.C != null) {
            float positionAnimated = xg0Var.f37165c.getPositionAnimated();
            xg0Var.n0(positionAnimated, z10);
            if (!z4) {
                xg0Var.m0(Math.round(positionAnimated), true);
            }
        }
        xg0Var.h0();
        xg0Var.d0();
        xg0Var.f37164b.invalidate();
        ph1Var.U();
        ph1Var.checkSystemBarColors();
    }
}
