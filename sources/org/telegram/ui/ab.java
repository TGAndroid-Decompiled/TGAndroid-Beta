package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class ab extends org.telegram.ui.Components.qo {
    public final int f35109s;
    public final org.telegram.ui.ActionBar.p2 v;

    public ab(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.f35109s = i10;
        this.v = p2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        bb bbVar;
        switch (this.f35109s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (bbVar = ((sb) this.v).G0) != null) {
                    bbVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((xn) this.v).A7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bb bbVar;
        switch (this.f35109s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (bbVar = ((sb) this.v).G0) != null) {
                    bbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((xn) this.v).A7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
