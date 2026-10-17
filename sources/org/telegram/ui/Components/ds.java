package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ds extends ImageView {
    public final int f25686a = 1;
    public Object f25687b;
    public final ViewGroup f25688c;

    public ds(fs fsVar, Context context, k0.b bVar) {
        super(context);
        this.f25688c = fsVar;
        this.f25687b = bVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25686a) {
            case 0:
                fs fsVar = (fs) this.f25688c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (fsVar.f26383n || fsVar.f26382f)) {
                    fsVar.f26383n = false;
                    fsVar.f26382f = false;
                    removeCallbacks(fsVar.f26384r);
                    removeCallbacks(fsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((k0.b) this.f25687b).f14559b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ds(cl0 cl0Var, Context context) {
        super(context);
        this.f25688c = cl0Var;
    }
}
