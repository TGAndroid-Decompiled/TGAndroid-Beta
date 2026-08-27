package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;

public final class z9 extends GestureDetector.SimpleOnGestureListener {

    public final aa f26051a;

    public z9(aa aaVar) {
        this.f26051a = aaVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        aa aaVar = this.f26051a;
        int i10 = aaVar.E7;
        if (aaVar.Ee != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean zSelectReaction = aaVar.getMessageObject().selectReaction(ig.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        aaVar.W3(aaVar.getMessageObject(), null, false, false, false, false);
        aaVar.requestLayout();
        ig.m0.b(false);
        if (zSelectReaction) {
            ba baVar = aaVar.Fe;
            ig.m0.d(baVar.f24135r, null, baVar.f24132e[1], null, motionEvent.getX(), motionEvent.getY(), ig.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), aaVar.E7, 0);
            ig.m0.f();
        }
        aaVar.getViewTreeObserver().addOnPreDrawListener(new y9(this, 0));
        return true;
    }
}
