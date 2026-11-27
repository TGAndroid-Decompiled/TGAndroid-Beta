package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
public final class k extends fic {
    public final qv x0;

    public k(qv qvVar, Activity activity) {
        super(activity);
        this.x0 = qvVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o oVar = this.x0.E;
        if (motionEvent.getActionMasked() == 0) {
            oVar.g0.requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            oVar.g0.requestDisallowInterceptTouchEvent(false);
        }
        oVar.h();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o oVar = this.x0.E;
        if (motionEvent.getActionMasked() == 0) {
            oVar.g0.requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        oVar.g0.requestDisallowInterceptTouchEvent(false);
        return onTouchEvent;
    }
}
