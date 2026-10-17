package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class hx extends ImageView {
    public final tz f26962a;

    public hx(tz tzVar, Context context) {
        super(context);
        this.f26962a = tzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        uy uyVar;
        int action = motionEvent.getAction();
        tz tzVar = this.f26962a;
        if (action == 0) {
            tzVar.P1 = true;
            tzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new e2(tzVar, 350, 7), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            tzVar.P1 = false;
            if (!tzVar.Q1 && (uyVar = tzVar.f30800t1) != null && uyVar.k()) {
                try {
                    tzVar.f30812x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
