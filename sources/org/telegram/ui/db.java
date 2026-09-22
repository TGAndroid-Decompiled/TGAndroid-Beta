package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class db extends org.telegram.ui.Components.so {
    public final int f32992s;
    public final org.telegram.ui.ActionBar.n2 v;

    public db(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.f32992s = i10;
        this.v = n2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        eb ebVar;
        switch (this.f32992s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (ebVar = ((ub) this.v).F0) != null) {
                    ebVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((bo) this.v).A7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eb ebVar;
        switch (this.f32992s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (ebVar = ((ub) this.v).F0) != null) {
                    ebVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((bo) this.v).A7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
