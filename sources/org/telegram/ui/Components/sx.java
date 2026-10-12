package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class sx extends ImageView {
    public final d00 f30702a;

    public sx(d00 d00Var, Context context) {
        super(context);
        this.f30702a = d00Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dz dzVar;
        int action = motionEvent.getAction();
        d00 d00Var = this.f30702a;
        if (action == 0) {
            d00Var.P1 = true;
            d00Var.Q1 = false;
            AndroidUtilities.runOnUIThread(new nd(d00Var, 350, 4), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            d00Var.P1 = false;
            if (!d00Var.Q1 && (dzVar = d00Var.f25126t1) != null && dzVar.k()) {
                try {
                    d00Var.f25138x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
