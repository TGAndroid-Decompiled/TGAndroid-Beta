package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
public final class ib extends org.telegram.ui.Components.fp {
    public final int f37081s;
    public final org.telegram.ui.ActionBar.m2 v;

    public ib(int i10, Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        this.f37081s = i10;
        this.v = m2Var;
        setOrientation(1);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        jb jbVar;
        switch (this.f37081s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (jbVar = ((ac) this.v).F0) != null) {
                    jbVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((fo) this.v).D7(true);
                }
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        jb jbVar;
        switch (this.f37081s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (jbVar = ((ac) this.v).F0) != null) {
                    jbVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((fo) this.v).D7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
