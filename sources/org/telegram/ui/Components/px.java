package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class px extends ImageView {
    public final a00 f29958a;

    public px(a00 a00Var, Context context) {
        super(context);
        this.f29958a = a00Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        az azVar;
        int action = motionEvent.getAction();
        a00 a00Var = this.f29958a;
        if (action == 0) {
            a00Var.P1 = true;
            a00Var.Q1 = false;
            AndroidUtilities.runOnUIThread(new nd(a00Var, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            a00Var.P1 = false;
            if (!a00Var.Q1 && (azVar = a00Var.f24455t1) != null && azVar.k()) {
                try {
                    a00Var.f24467x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
