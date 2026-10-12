package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class hb extends org.telegram.ui.Components.kp {
    public final int f38315s;
    public final org.telegram.ui.ActionBar.m2 v;

    public hb(int i10, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        this.f38315s = i10;
        this.v = m2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ib ibVar;
        switch (this.f38315s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (ibVar = ((yb) this.v).F0) != null) {
                    ibVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((eo) this.v).D7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ib ibVar;
        switch (this.f38315s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (ibVar = ((yb) this.v).F0) != null) {
                    ibVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((eo) this.v).D7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
