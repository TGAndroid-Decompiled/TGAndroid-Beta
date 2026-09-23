package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class ax extends ImageView {
    public final lz f22524a;

    public ax(lz lzVar, Context context) {
        super(context);
        this.f22524a = lzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ly lyVar;
        int action = motionEvent.getAction();
        lz lzVar = this.f22524a;
        if (action == 0) {
            lzVar.P1 = true;
            lzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new kd(lzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            lzVar.P1 = false;
            if (!lzVar.Q1 && (lyVar = lzVar.f26021t1) != null && lyVar.k()) {
                try {
                    lzVar.f26033x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
