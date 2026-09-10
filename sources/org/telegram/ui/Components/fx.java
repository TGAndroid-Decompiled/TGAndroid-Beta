package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class fx extends ImageView {
    public final rz f23096a;

    public fx(rz rzVar, Context context) {
        super(context);
        this.f23096a = rzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sy syVar;
        int action = motionEvent.getAction();
        rz rzVar = this.f23096a;
        if (action == 0) {
            rzVar.P1 = true;
            rzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new zd(rzVar, 350, 2), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            rzVar.P1 = false;
            if (!rzVar.Q1 && (syVar = rzVar.f26858t1) != null && syVar.k()) {
                try {
                    rzVar.f26870x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
