package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ds extends ImageView {
    public final int f25629a = 1;
    public Object f25630b;
    public final ViewGroup f25631c;

    public ds(fs fsVar, Context context, le.b bVar) {
        super(context);
        this.f25631c = fsVar;
        this.f25630b = bVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25629a) {
            case 0:
                fs fsVar = (fs) this.f25631c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (fsVar.f26374n || fsVar.f26373f)) {
                    fsVar.f26374n = false;
                    fsVar.f26373f = false;
                    removeCallbacks(fsVar.f26375r);
                    removeCallbacks(fsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((le.b) this.f25630b).f16011b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ds(cl0 cl0Var, Context context) {
        super(context);
        this.f25631c = cl0Var;
    }
}
