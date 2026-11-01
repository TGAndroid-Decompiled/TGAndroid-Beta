package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class lj extends uk0 {
    public final int f28179e3;
    public final Paint f28180f3;
    public final xj f28181g3;

    public lj(xj xjVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.f28179e3 = i10;
        switch (i10) {
            case 1:
                this.f28181g3 = xjVar;
                super(context, p6Var);
                this.f28180f3 = new Paint();
                return;
            default:
                this.f28181g3 = xjVar;
                this.f28180f3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f28179e3) {
            case 0:
                if (this.f28181g3.f32586n == 2 && getChildCount() > 0) {
                    float f7 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f7) {
                            f7 = getChildAt(i10).getY();
                        }
                    }
                    this.f28180f3.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.f28181g3.f32586n == 1 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < f10) {
                            f10 = getChildAt(i11).getY();
                        }
                    }
                    this.f28180f3.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28179e3) {
            case 0:
                if (this.f28181g3.f32586n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
