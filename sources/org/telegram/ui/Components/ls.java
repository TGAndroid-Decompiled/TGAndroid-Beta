package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ls extends ImageView {
    public final int f28278a = 1;
    public Object f28279b;
    public final ViewGroup f28280c;

    public ls(ns nsVar, Context context, n4.l lVar) {
        super(context);
        this.f28280c = nsVar;
        this.f28279b = lVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28278a) {
            case 0:
                ns nsVar = (ns) this.f28280c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (nsVar.f28955n || nsVar.f28954f)) {
                    nsVar.f28955n = false;
                    nsVar.f28954f = false;
                    removeCallbacks(nsVar.f28956r);
                    removeCallbacks(nsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n4.l) this.f28279b).f16325a).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ls(nl0 nl0Var, Context context) {
        super(context);
        this.f28280c = nl0Var;
    }
}
