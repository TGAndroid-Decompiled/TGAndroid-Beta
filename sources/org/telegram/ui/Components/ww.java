package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ww extends ImageView {
    public final kz f30363a;

    public ww(kz kzVar, Context context) {
        super(context);
        this.f30363a = kzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ky kyVar;
        int action = motionEvent.getAction();
        kz kzVar = this.f30363a;
        if (action == 0) {
            kzVar.M1 = true;
            kzVar.N1 = false;
            AndroidUtilities.runOnUIThread(new dw(kzVar, 350, 0), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            kzVar.M1 = false;
            if (!kzVar.N1 && (kyVar = kzVar.f26472q1) != null && kyVar.k()) {
                try {
                    kzVar.f26495x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
