package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class sw extends ImageView {
    public final fz f32736a;

    public sw(fz fzVar, Context context) {
        super(context);
        this.f32736a = fzVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fy fyVar;
        int action = motionEvent.getAction();
        fz fzVar = this.f32736a;
        if (action == 0) {
            fzVar.L1 = true;
            fzVar.M1 = false;
            AndroidUtilities.runOnUIThread(new i8(fzVar, 350, 4), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fzVar.L1 = false;
            if (!fzVar.M1 && (fyVar = fzVar.f28623p1) != null && fyVar.k()) {
                try {
                    fzVar.f28649x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
