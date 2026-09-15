package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class zw extends ImageView {
    public final kz f30668a;

    public zw(kz kzVar, Context context) {
        super(context);
        this.f30668a = kzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ky kyVar;
        int action = motionEvent.getAction();
        kz kzVar = this.f30668a;
        if (action == 0) {
            kzVar.P1 = true;
            kzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new id(kzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            kzVar.P1 = false;
            if (!kzVar.Q1 && (kyVar = kzVar.f25756t1) != null && kyVar.k()) {
                try {
                    kzVar.f25768x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
