package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ds extends ImageView {
    public final int f25693a = 1;
    public Object f25694b;
    public final ViewGroup f25695c;

    public ds(fs fsVar, Context context, k0.b bVar) {
        super(context);
        this.f25695c = fsVar;
        this.f25694b = bVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25693a) {
            case 0:
                fs fsVar = (fs) this.f25695c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (fsVar.f26390n || fsVar.f26389f)) {
                    fsVar.f26390n = false;
                    fsVar.f26389f = false;
                    removeCallbacks(fsVar.f26391r);
                    removeCallbacks(fsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k0.b) this.f25694b).f14566b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ds(cl0 cl0Var, Context context) {
        super(context);
        this.f25695c = cl0Var;
    }
}
