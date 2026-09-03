package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class xj extends sl0 {
    public final int U2;
    public final Paint V2;
    public final jk W2;

    public xj(jk jkVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.U2 = i10;
        switch (i10) {
            case 1:
                this.W2 = jkVar;
                super(context, g6Var);
                this.V2 = new Paint();
                return;
            default:
                this.W2 = jkVar;
                this.V2 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.U2) {
            case 0:
                if (this.W2.f28131n == 2 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f10) {
                            f10 = getChildAt(i10).getY();
                        }
                    }
                    this.V2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.W2.f28131n == 1 && getChildCount() > 0) {
                    float f11 = 2.1474836E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < f11) {
                            f11 = getChildAt(i11).getY();
                        }
                    }
                    this.V2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 0:
                if (this.W2.f28131n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
