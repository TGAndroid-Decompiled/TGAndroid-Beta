package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class uj extends wk0 {
    public final int T2;
    public final Paint U2;
    public final fk V2;

    public uj(fk fkVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.T2 = i9;
        switch (i9) {
            case 1:
                this.V2 = fkVar;
                super(context, b6Var);
                this.U2 = new Paint();
                return;
            default:
                this.V2 = fkVar;
                this.U2 = new Paint();
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                if (this.V2.f28458n == 2 && getChildCount() > 0) {
                    float f10 = 2.1474836E9f;
                    for (int i9 = 0; i9 < getChildCount(); i9++) {
                        if (getChildAt(i9).getY() < f10) {
                            f10 = getChildAt(i9).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
                }
                super.dispatchDraw(canvas);
                return;
            default:
                if (this.V2.f28458n == 1 && getChildCount() > 0) {
                    float f11 = 2.1474836E9f;
                    for (int i10 = 0; i10 < getChildCount(); i10++) {
                        if (getChildAt(i10).getY() < f11) {
                            f11 = getChildAt(i10).getY();
                        }
                    }
                    this.U2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T2) {
            case 0:
                if (this.V2.f28458n != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
