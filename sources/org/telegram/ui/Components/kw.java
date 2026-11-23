package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class kw extends ImageView {
    public final ty f36959a;

    public kw(ty tyVar, Context context) {
        super(context);
        this.f36959a = tyVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tx txVar;
        int action = motionEvent.getAction();
        ty tyVar = this.f36959a;
        if (action == 0) {
            tyVar.Q1 = true;
            tyVar.R1 = false;
            org.telegram.messenger.g0.h3(new org.telegram.ui.ii(tyVar, 350, 14), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            tyVar.Q1 = false;
            if (!tyVar.R1 && (txVar = tyVar.f40126u1) != null && txVar.k()) {
                try {
                    tyVar.f40139y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
