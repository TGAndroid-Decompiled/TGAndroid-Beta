package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ds extends ImageView {
    public final int f25618a = 1;
    public Object f25619b;
    public final ViewGroup f25620c;

    public ds(fs fsVar, Context context, le.b bVar) {
        super(context);
        this.f25620c = fsVar;
        this.f25619b = bVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25618a) {
            case 0:
                fs fsVar = (fs) this.f25620c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (fsVar.f26403n || fsVar.f26402f)) {
                    fsVar.f26403n = false;
                    fsVar.f26402f = false;
                    removeCallbacks(fsVar.f26404r);
                    removeCallbacks(fsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((le.b) this.f25619b).f16009b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ds(dl0 dl0Var, Context context) {
        super(context);
        this.f25620c = dl0Var;
    }
}
