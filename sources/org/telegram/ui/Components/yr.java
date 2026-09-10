package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class yr extends ImageView {
    public final int f29483a = 0;
    public Object f29484b;
    public final ViewGroup f29485c;

    public yr(as asVar, Context context, l2.h hVar) {
        super(context);
        this.f29485c = asVar;
        this.f29484b = hVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29483a) {
            case 0:
                as asVar = (as) this.f29485c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (asVar.f21577n || asVar.f21576f)) {
                    asVar.f21577n = false;
                    asVar.f21576f = false;
                    removeCallbacks(asVar.f21578r);
                    removeCallbacks(asVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((l2.h) this.f29484b).f12721b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public yr(pk0 pk0Var, Context context) {
        super(context);
        this.f29485c = pk0Var;
    }
}
