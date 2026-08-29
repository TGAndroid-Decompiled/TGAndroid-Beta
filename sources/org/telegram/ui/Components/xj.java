package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class xj extends jl0 {
    public final int T2;
    public final Paint U2;
    public final jk V2;

    public xj(jk jkVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        switch (i10) {
            case 1:
                this.V2 = jkVar;
                super(context, c6Var);
                this.U2 = new Paint();
                return;
            default:
                this.V2 = jkVar;
                this.U2 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                if (this.V2.f29677n == 2 && getChildCount() > 0) {
                    float f9 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f9) {
                            f9 = getChildAt(i10).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.V2.f29677n == 1 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < f10) {
                            f10 = getChildAt(i11).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (this.V2.f29677n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
