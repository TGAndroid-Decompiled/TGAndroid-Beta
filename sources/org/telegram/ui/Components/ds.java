package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ds extends ImageView {
    public final int f25621a = 1;
    public Object f25622b;
    public final ViewGroup f25623c;

    public ds(fs fsVar, Context context, le.b bVar) {
        super(context);
        this.f25623c = fsVar;
        this.f25622b = bVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25621a) {
            case 0:
                fs fsVar = (fs) this.f25623c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (fsVar.f26406n || fsVar.f26405f)) {
                    fsVar.f26406n = false;
                    fsVar.f26405f = false;
                    removeCallbacks(fsVar.f26407r);
                    removeCallbacks(fsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((le.b) this.f25622b).f16009b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ds(dl0 dl0Var, Context context) {
        super(context);
        this.f25623c = dl0Var;
    }
}
