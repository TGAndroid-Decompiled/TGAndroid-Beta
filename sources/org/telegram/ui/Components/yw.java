package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class yw extends ImageView {
    public final mz f33679a;

    public yw(mz mzVar, Context context) {
        super(context);
        this.f33679a = mzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        my myVar;
        int action = motionEvent.getAction();
        mz mzVar = this.f33679a;
        if (action == 0) {
            mzVar.M1 = true;
            mzVar.N1 = false;
            AndroidUtilities.runOnUIThread(new im(mzVar, 350, 1), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            mzVar.M1 = false;
            if (!mzVar.N1 && (myVar = mzVar.f29317q1) != null && myVar.k()) {
                try {
                    mzVar.f29340x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
