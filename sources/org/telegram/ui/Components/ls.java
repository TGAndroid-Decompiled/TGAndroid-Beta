package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class ls extends ImageView {
    public final int f28267a = 1;
    public Object f28268b;
    public final ViewGroup f28269c;

    public ls(ns nsVar, Context context, n4.l lVar) {
        super(context);
        this.f28269c = nsVar;
        this.f28268b = lVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28267a) {
            case 0:
                ns nsVar = (ns) this.f28269c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (nsVar.f28959n || nsVar.f28958f)) {
                    nsVar.f28959n = false;
                    nsVar.f28958f = false;
                    removeCallbacks(nsVar.f28960r);
                    removeCallbacks(nsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((n4.l) this.f28268b).f16326a).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public ls(nl0 nl0Var, Context context) {
        super(context);
        this.f28269c = nl0Var;
    }
}
