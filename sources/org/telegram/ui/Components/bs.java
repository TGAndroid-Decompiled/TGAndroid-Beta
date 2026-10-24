package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class bs extends ImageView {
    public final int f25081a = 0;
    public Object f25082b;
    public final ViewGroup f25083c;

    public bs(ds dsVar, Context context, le.b bVar) {
        super(context);
        this.f25083c = dsVar;
        this.f25082b = bVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f25081a) {
            case 0:
                ds dsVar = (ds) this.f25083c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (dsVar.f25825n || dsVar.f25824f)) {
                    dsVar.f25825n = false;
                    dsVar.f25824f = false;
                    removeCallbacks(dsVar.f25826r);
                    removeCallbacks(dsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((le.b) this.f25082b).f16072b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public bs(fl0 fl0Var, Context context) {
        super(context);
        this.f25083c = fl0Var;
    }
}
