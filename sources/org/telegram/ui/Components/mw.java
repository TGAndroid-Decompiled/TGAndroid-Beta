package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class mw extends ImageView {
    public final wy f30928a;

    public mw(wy wyVar, Context context) {
        super(context);
        this.f30928a = wyVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wx wxVar;
        int action = motionEvent.getAction();
        wy wyVar = this.f30928a;
        if (action == 0) {
            wyVar.L1 = true;
            wyVar.M1 = false;
            AndroidUtilities.runOnUIThread(new qd(wyVar, 350, 2), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            wyVar.L1 = false;
            if (!wyVar.M1 && (wxVar = wyVar.f34432p1) != null && wxVar.k()) {
                try {
                    wyVar.f34458x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
