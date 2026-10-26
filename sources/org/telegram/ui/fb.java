package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class fb extends org.telegram.ui.Components.ep {
    public final int f39330s;
    public final org.telegram.ui.ActionBar.r2 v;

    public fb(int i10, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context);
        this.f39330s = i10;
        this.v = r2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        gb gbVar;
        switch (this.f39330s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (gbVar = ((wb) this.v).F0) != null) {
                    gbVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((un) this.v).H7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gb gbVar;
        switch (this.f39330s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (gbVar = ((wb) this.v).F0) != null) {
                    gbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((un) this.v).H7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
