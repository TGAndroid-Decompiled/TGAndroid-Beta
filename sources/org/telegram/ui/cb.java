package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class cb extends org.telegram.ui.Components.ko {
    public final int f36430s;
    public final org.telegram.ui.ActionBar.k2 f36431w;

    public cb(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context);
        this.f36430s = i10;
        this.f36431w = k2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        db dbVar;
        switch (this.f36430s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (dbVar = ((sb) this.f36431w).F0) != null) {
                    dbVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((un) this.f36431w).I7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        db dbVar;
        switch (this.f36430s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (dbVar = ((sb) this.f36431w).F0) != null) {
                    dbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((un) this.f36431w).I7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
