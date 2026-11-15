package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class rj extends uj0 {
    public final int f38985f3;
    public final Paint f38986g3;
    public final dk f38987h3;

    public rj(dk dkVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f38985f3 = i7;
        switch (i7) {
            case 1:
                this.f38987h3 = dkVar;
                super(context, e6Var);
                this.f38986g3 = new Paint();
                return;
            default:
                this.f38987h3 = dkVar;
                this.f38986g3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f38985f3) {
            case 0:
                if (this.f38987h3.f33951n == 2 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (getChildAt(i7).getY() < f10) {
                            f10 = getChildAt(i7).getY();
                        }
                    }
                    this.f38986g3.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.f38987h3.f33951n == 1 && getChildCount() > 0) {
                    float f11 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f11) {
                            f11 = getChildAt(i10).getY();
                        }
                    }
                    this.f38986g3.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38985f3) {
            case 0:
                if (this.f38987h3.f33951n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
