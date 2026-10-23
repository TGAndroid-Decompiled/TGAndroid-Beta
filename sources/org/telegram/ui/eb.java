package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class eb extends org.telegram.ui.Components.cp {
    public final int f36912s;
    public final org.telegram.ui.ActionBar.o2 v;

    public eb(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.f36912s = i10;
        this.v = o2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        fb fbVar;
        switch (this.f36912s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (fbVar = ((vb) this.v).F0) != null) {
                    fbVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((sn) this.v).D7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        fb fbVar;
        switch (this.f36912s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (fbVar = ((vb) this.v).F0) != null) {
                    fbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((sn) this.v).D7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
