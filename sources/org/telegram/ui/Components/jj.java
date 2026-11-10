package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class jj extends pj0 {
    public final int f34947e3;
    public final Paint f34948f3;
    public final uj f34949g3;

    public jj(uj ujVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f34947e3 = i7;
        switch (i7) {
            case 1:
                this.f34949g3 = ujVar;
                super(context, h6Var);
                this.f34948f3 = new Paint();
                return;
            default:
                this.f34949g3 = ujVar;
                this.f34948f3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f34947e3) {
            case 0:
                if (this.f34949g3.f38697n == 2 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (getChildAt(i7).getY() < f10) {
                            f10 = getChildAt(i7).getY();
                        }
                    }
                    this.f34948f3.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.f34949g3.f38697n == 1 && getChildCount() > 0) {
                    float f11 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f11) {
                            f11 = getChildAt(i10).getY();
                        }
                    }
                    this.f34948f3.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34947e3) {
            case 0:
                if (this.f34949g3.f38697n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
