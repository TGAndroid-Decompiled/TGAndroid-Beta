package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class bx extends ImageView {
    public final lz f23115a;

    public bx(lz lzVar, Context context) {
        super(context);
        this.f23115a = lzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        my myVar;
        int action = motionEvent.getAction();
        lz lzVar = this.f23115a;
        if (action == 0) {
            lzVar.P1 = true;
            lzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new ld(lzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            lzVar.P1 = false;
            if (!lzVar.Q1 && (myVar = lzVar.f26289t1) != null && myVar.k()) {
                try {
                    lzVar.f26301x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
