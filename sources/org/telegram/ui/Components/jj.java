package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class jj extends tj0 {
    public final int f35088f3;
    public final Paint f35089g3;
    public final uj f35090h3;

    public jj(uj ujVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f35088f3 = i3;
        switch (i3) {
            case 1:
                this.f35090h3 = ujVar;
                super(context, e6Var);
                this.f35089g3 = new Paint();
                return;
            default:
                this.f35090h3 = ujVar;
                this.f35089g3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f35088f3) {
            case 0:
                if (this.f35090h3.f38769n == 2 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        if (getChildAt(i3).getY() < f10) {
                            f10 = getChildAt(i3).getY();
                        }
                    }
                    this.f35089g3.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.f35090h3.f38769n == 1 && getChildCount() > 0) {
                    float f11 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f11) {
                            f11 = getChildAt(i10).getY();
                        }
                    }
                    this.f35089g3.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35088f3) {
            case 0:
                if (this.f35090h3.f38769n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
