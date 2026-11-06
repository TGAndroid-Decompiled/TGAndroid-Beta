package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class kj extends pj0 {
    public final int f35322e3;
    public final Paint f35323f3;
    public final vj f35324g3;

    public kj(vj vjVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.f35322e3 = i7;
        switch (i7) {
            case 1:
                this.f35324g3 = vjVar;
                super(context, f6Var);
                this.f35323f3 = new Paint();
                return;
            default:
                this.f35324g3 = vjVar;
                this.f35323f3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f35322e3) {
            case 0:
                if (this.f35324g3.f38966n == 2 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (getChildAt(i7).getY() < f10) {
                            f10 = getChildAt(i7).getY();
                        }
                    }
                    this.f35323f3.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.f35324g3.f38966n == 1 && getChildCount() > 0) {
                    float f11 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f11) {
                            f11 = getChildAt(i10).getY();
                        }
                    }
                    this.f35323f3.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35322e3) {
            case 0:
                if (this.f35324g3.f38966n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
