package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class dx extends ImageView {
    public final nz f25835a;

    public dx(nz nzVar, Context context) {
        super(context);
        this.f25835a = nzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        oy oyVar;
        int action = motionEvent.getAction();
        nz nzVar = this.f25835a;
        if (action == 0) {
            nzVar.P1 = true;
            nzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new ld(nzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            nzVar.P1 = false;
            if (!nzVar.Q1 && (oyVar = nzVar.f29145t1) != null && oyVar.k()) {
                try {
                    nzVar.f29157x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
