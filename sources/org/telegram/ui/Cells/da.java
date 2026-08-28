package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class da extends GestureDetector.SimpleOnGestureListener {
    public final ea f24247a;

    public da(ea eaVar) {
        this.f24247a = eaVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ea eaVar = this.f24247a;
        int i9 = eaVar.E7;
        if (eaVar.Ee != 2 || MediaDataController.getInstance(i9).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = eaVar.getMessageObject().selectReaction(hg.r0.b(MediaDataController.getInstance(i9).getDoubleTapReaction()), false, false);
        eaVar.X3(eaVar.getMessageObject(), null, false, false, false, false);
        eaVar.requestLayout();
        hg.n0.b(false);
        if (selectReaction) {
            fa faVar = eaVar.Fe;
            hg.n0.d(faVar.f24356r, null, faVar.f24353e[1], null, motionEvent.getX(), motionEvent.getY(), hg.r0.b(MediaDataController.getInstance(i9).getDoubleTapReaction()), eaVar.E7, 0);
            hg.n0.f();
        }
        eaVar.getViewTreeObserver().addOnPreDrawListener(new ca(this, 0));
        return true;
    }
}
