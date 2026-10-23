package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ds extends ImageView {
    public final int f25721a = 0;
    public Object f25722b;
    public final ViewGroup f25723c;

    public ds(fs fsVar, Context context, le.b bVar) {
        super(context);
        this.f25723c = fsVar;
        this.f25722b = bVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25721a) {
            case 0:
                fs fsVar = (fs) this.f25723c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (fsVar.f26448n || fsVar.f26447f)) {
                    fsVar.f26448n = false;
                    fsVar.f26447f = false;
                    removeCallbacks(fsVar.f26449r);
                    removeCallbacks(fsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((le.b) this.f25722b).f16072b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ds(gl0 gl0Var, Context context) {
        super(context);
        this.f25723c = gl0Var;
    }
}
