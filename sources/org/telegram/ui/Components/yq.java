package org.telegram.ui.Components;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
public final class yq extends ImageView {
    public final int f40633a = 0;
    public Object f40634b;
    public final ViewGroup f40635c;

    public yq(ar arVar, Context context, uy uyVar) {
        super(context);
        this.f40635c = arVar;
        this.f40634b = uyVar;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f40633a) {
            case 0:
                ar arVar = (ar) this.f40635c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (arVar.f31974n || arVar.f31973f)) {
                    arVar.f31974n = false;
                    arVar.f31973f = false;
                    removeCallbacks(arVar.f31975r);
                    removeCallbacks(arVar.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((uy) this.f40634b).f38776b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public yq(ii0 ii0Var, Context context) {
        super(context);
        this.f40635c = ii0Var;
    }
}
