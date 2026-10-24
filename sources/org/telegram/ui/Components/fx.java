package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class fx extends ImageView {
    public final rz f26443a;

    public fx(rz rzVar, Context context) {
        super(context);
        this.f26443a = rzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sy syVar;
        int action = motionEvent.getAction();
        rz rzVar = this.f26443a;
        if (action == 0) {
            rzVar.P1 = true;
            rzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new c2(rzVar, 350, 7), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            rzVar.P1 = false;
            if (!rzVar.Q1 && (syVar = rzVar.f30363t1) != null && syVar.k()) {
                try {
                    rzVar.f30375x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
