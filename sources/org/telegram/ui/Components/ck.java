package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class ck extends mm0 {
    public final int f27187f3;
    public final Paint f27188g3;
    public final nk f27189h3;

    public ck(nk nkVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f27187f3 = i10;
        switch (i10) {
            case 1:
                this.f27189h3 = nkVar;
                super(context, u6Var);
                this.f27188g3 = new Paint();
                return;
            default:
                this.f27189h3 = nkVar;
                this.f27188g3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f27187f3) {
            case 0:
                if (this.f27189h3.f31031n == 2 && getChildCount() > 0) {
                    float f7 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f7) {
                            f7 = getChildAt(i10).getY();
                        }
                    }
                    this.f27188g3.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.f27189h3.f31031n == 1 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < f10) {
                            f10 = getChildAt(i11).getY();
                        }
                    }
                    this.f27188g3.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27187f3) {
            case 0:
                if (this.f27189h3.f31031n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
