package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class gk extends zl0 {
    public final int f24586e3;
    public final Paint f24587f3;
    public final rk f24588g3;

    public gk(rk rkVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f24586e3 = i10;
        switch (i10) {
            case 1:
                this.f24588g3 = rkVar;
                super(context, d6Var);
                this.f24587f3 = new Paint();
                return;
            default:
                this.f24588g3 = rkVar;
                this.f24587f3 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f24586e3) {
            case 0:
                if (this.f24588g3.f28044n == 2 && getChildCount() > 0) {
                    float f7 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f7) {
                            f7 = getChildAt(i10).getY();
                        }
                    }
                    this.f24587f3.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19146h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.f24588g3.f28044n == 1 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < f10) {
                            f10 = getChildAt(i11).getY();
                        }
                    }
                    this.f24587f3.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19146h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f24586e3) {
            case 0:
                if (this.f24588g3.f28044n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
