package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ax extends ImageView {
    public final kz f24464a;

    public ax(kz kzVar, Context context) {
        super(context);
        this.f24464a = kzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ly lyVar;
        int action = motionEvent.getAction();
        kz kzVar = this.f24464a;
        if (action == 0) {
            kzVar.P1 = true;
            kzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new m8(kzVar, 350, 4), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            kzVar.P1 = false;
            if (!kzVar.Q1 && (lyVar = kzVar.f27986t1) != null && lyVar.k()) {
                try {
                    kzVar.f27998x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
