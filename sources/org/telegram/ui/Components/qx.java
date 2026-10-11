package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class qx extends ImageView {
    public final b00 f30263a;

    public qx(b00 b00Var, Context context) {
        super(context);
        this.f30263a = b00Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bz bzVar;
        int action = motionEvent.getAction();
        b00 b00Var = this.f30263a;
        if (action == 0) {
            b00Var.P1 = true;
            b00Var.Q1 = false;
            AndroidUtilities.runOnUIThread(new nd(b00Var, 350, 4), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            b00Var.P1 = false;
            if (!b00Var.Q1 && (bzVar = b00Var.f24716t1) != null && bzVar.k()) {
                try {
                    b00Var.f24728x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
