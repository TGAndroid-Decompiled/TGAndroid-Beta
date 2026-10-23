package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ds extends ImageView {
    public final int f25622a = 1;
    public Object f25623b;
    public final ViewGroup f25624c;

    public ds(fs fsVar, Context context, le.b bVar) {
        super(context);
        this.f25624c = fsVar;
        this.f25623b = bVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25622a) {
            case 0:
                fs fsVar = (fs) this.f25624c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (fsVar.f26407n || fsVar.f26406f)) {
                    fsVar.f26407n = false;
                    fsVar.f26406f = false;
                    removeCallbacks(fsVar.f26408r);
                    removeCallbacks(fsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((le.b) this.f25623b).f16009b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ds(dl0 dl0Var, Context context) {
        super(context);
        this.f25624c = dl0Var;
    }
}
