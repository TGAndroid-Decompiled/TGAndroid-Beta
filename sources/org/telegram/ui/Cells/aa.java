package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class aa extends GestureDetector.SimpleOnGestureListener {
    public final ba f24101a;

    public aa(ba baVar) {
        this.f24101a = baVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ba baVar = this.f24101a;
        int i10 = baVar.E7;
        if (baVar.Ee != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = baVar.getMessageObject().selectReaction(kg.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        baVar.X3(baVar.getMessageObject(), null, false, false, false, false);
        baVar.requestLayout();
        kg.m0.b(false);
        if (selectReaction) {
            ca caVar = baVar.Fe;
            kg.m0.d(caVar.f24192r, null, caVar.f24189e[1], null, motionEvent.getX(), motionEvent.getY(), kg.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), baVar.E7, 0);
            kg.m0.f();
        }
        baVar.getViewTreeObserver().addOnPreDrawListener(new z9(this, 0));
        return true;
    }
}
