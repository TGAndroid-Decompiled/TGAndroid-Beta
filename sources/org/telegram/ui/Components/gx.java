package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class gx extends ImageView {
    public final sz f28773a;

    public gx(sz szVar, Context context) {
        super(context);
        this.f28773a = szVar;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ty tyVar;
        int action = motionEvent.getAction();
        sz szVar = this.f28773a;
        if (action == 0) {
            szVar.P1 = true;
            szVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new h2(szVar, 350, 7), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            szVar.P1 = false;
            if (!szVar.Q1 && (tyVar = szVar.f32766t1) != null && tyVar.k()) {
                try {
                    szVar.f32778x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
