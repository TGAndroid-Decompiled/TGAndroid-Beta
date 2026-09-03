package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class ba extends GestureDetector.SimpleOnGestureListener {
    public final ca f20862a;

    public ba(ca caVar) {
        this.f20862a = caVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ca caVar = this.f20862a;
        int i10 = caVar.F7;
        if (caVar.Fe != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = caVar.getMessageObject().selectReaction(mg.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        caVar.X3(caVar.getMessageObject(), null, false, false, false, false);
        caVar.requestLayout();
        mg.m0.b(false);
        if (selectReaction) {
            da daVar = caVar.Ge;
            mg.m0.d(daVar.f20955r, null, daVar.e[1], null, motionEvent.getX(), motionEvent.getY(), mg.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), caVar.F7, 0);
            mg.m0.f();
        }
        caVar.getViewTreeObserver().addOnPreDrawListener(new aa(this, 0));
        return true;
    }
}
