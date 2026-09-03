package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class cb extends org.telegram.ui.Components.no {
    public final int f33062s;
    public final org.telegram.ui.ActionBar.p2 v;

    public cb(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.f33062s = i10;
        this.v = p2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        db dbVar;
        switch (this.f33062s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (dbVar = ((ub) this.v).G0) != null) {
                    dbVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((zn) this.v).A7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        db dbVar;
        switch (this.f33062s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (dbVar = ((ub) this.v).G0) != null) {
                    dbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((zn) this.v).A7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
