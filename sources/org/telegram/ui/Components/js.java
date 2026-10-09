package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class js extends ImageView {
    public final int f27773a = 1;
    public Object f27774b;
    public final ViewGroup f27775c;

    public js(ls lsVar, Context context, m.f3 f3Var) {
        super(context);
        this.f27775c = lsVar;
        this.f27774b = f3Var;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27773a) {
            case 0:
                ls lsVar = (ls) this.f27775c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (lsVar.f28585n || lsVar.f28584f)) {
                    lsVar.f28585n = false;
                    lsVar.f28584f = false;
                    removeCallbacks(lsVar.f28586r);
                    removeCallbacks(lsVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((m.f3) this.f27774b).f15668b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public js(kl0 kl0Var, Context context) {
        super(context);
        this.f27775c = kl0Var;
    }
}
