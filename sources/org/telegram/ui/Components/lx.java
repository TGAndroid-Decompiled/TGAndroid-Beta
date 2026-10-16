package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class lx extends ImageView {
    public final wz f26841a;

    public lx(wz wzVar, Context context) {
        super(context);
        this.f26841a = wzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wy wyVar;
        int action = motionEvent.getAction();
        wz wzVar = this.f26841a;
        if (action == 0) {
            wzVar.P1 = true;
            wzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new o8(wzVar, 350, 5), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            wzVar.P1 = false;
            if (!wzVar.Q1 && (wyVar = wzVar.f30760t1) != null && wyVar.k()) {
                try {
                    wzVar.f30772x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
