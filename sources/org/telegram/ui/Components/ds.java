package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ds extends ImageView {
    public final int f25627a = 1;
    public Object f25628b;
    public final ViewGroup f25629c;

    public ds(fs fsVar, Context context, le.b bVar) {
        super(context);
        this.f25629c = fsVar;
        this.f25628b = bVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25627a) {
            case 0:
                fs fsVar = (fs) this.f25629c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (fsVar.f26372n || fsVar.f26371f)) {
                    fsVar.f26372n = false;
                    fsVar.f26371f = false;
                    removeCallbacks(fsVar.f26373r);
                    removeCallbacks(fsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((le.b) this.f25628b).f16009b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ds(cl0 cl0Var, Context context) {
        super(context);
        this.f25629c = cl0Var;
    }
}
