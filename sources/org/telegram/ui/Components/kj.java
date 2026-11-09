package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class kj extends qj0 {
    public final int f35356e3;
    public final Paint f35357f3;
    public final vj f35358g3;

    public kj(vj vjVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.f35356e3 = i7;
        switch (i7) {
            case 1:
                this.f35358g3 = vjVar;
                super(context, g6Var);
                this.f35357f3 = new Paint();
                return;
            default:
                this.f35358g3 = vjVar;
                this.f35357f3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f35356e3) {
            case 0:
                if (this.f35358g3.f39112n == 2 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (getChildAt(i7).getY() < f10) {
                            f10 = getChildAt(i7).getY();
                        }
                    }
                    this.f35357f3.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.f35358g3.f39112n == 1 && getChildCount() > 0) {
                    float f11 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f11) {
                            f11 = getChildAt(i10).getY();
                        }
                    }
                    this.f35357f3.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35356e3) {
            case 0:
                if (this.f35358g3.f39112n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
