package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class pr extends ImageView {
    public final int f27968a = 1;
    public Object f27969b;
    public final ViewGroup f27970c;

    public pr(sr srVar, Context context, org.telegram.ui.Cells.f1 f1Var) {
        super(context);
        this.f27970c = srVar;
        this.f27969b = f1Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27968a) {
            case 0:
                sr srVar = (sr) this.f27970c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (srVar.f28806n || srVar.f28805f)) {
                    srVar.f28806n = false;
                    srVar.f28805f = false;
                    removeCallbacks(srVar.f28807r);
                    removeCallbacks(srVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((org.telegram.ui.Cells.f1) this.f27969b).f21045b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public pr(pk0 pk0Var, Context context) {
        super(context);
        this.f27970c = pk0Var;
    }
}
