package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class cx extends ImageView {
    public final mz f23441a;

    public cx(mz mzVar, Context context) {
        super(context);
        this.f23441a = mzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ny nyVar;
        int action = motionEvent.getAction();
        mz mzVar = this.f23441a;
        if (action == 0) {
            mzVar.P1 = true;
            mzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new ld(mzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            mzVar.P1 = false;
            if (!mzVar.Q1 && (nyVar = mzVar.f26586t1) != null && nyVar.k()) {
                try {
                    mzVar.f26598x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
