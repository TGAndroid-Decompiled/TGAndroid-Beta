package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

public final class qj extends zk0 {
    public final int T2;
    public final Paint U2;
    public final bk V2;

    public qj(bk bkVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        switch (i10) {
            case 1:
                this.V2 = bkVar;
                super(context, c6Var);
                this.U2 = new Paint();
                break;
            default:
                this.V2 = bkVar;
                this.U2 = new Paint();
                break;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                if (this.V2.f27114n == 2 && getChildCount() > 0) {
                    float y10 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < y10) {
                            y10 = getChildAt(i10).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (this.V2.f27114n == 1 && getChildCount() > 0) {
                    float y11 = 2.1474836E9f;
                    for (int i11 = 0; i11 < getChildCount(); i11++) {
                        if (getChildAt(i11).getY() < y11) {
                            y11 = getChildAt(i11).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (this.V2.f27114n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
