package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class da extends GestureDetector.SimpleOnGestureListener {
    public final ea f22151a;

    public da(ea eaVar) {
        this.f22151a = eaVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ea eaVar = this.f22151a;
        int i10 = eaVar.I7;
        if (eaVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = eaVar.getMessageObject().selectReaction(ah.i1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        eaVar.X3(eaVar.getMessageObject(), null, false, false, false, false);
        eaVar.requestLayout();
        ah.d1.b(false);
        if (selectReaction) {
            fa faVar = eaVar.Ke;
            ah.d1.d(faVar.f22269r, null, faVar.e[1], null, motionEvent.getX(), motionEvent.getY(), ah.i1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), eaVar.I7, 0);
            ah.d1.f();
        }
        eaVar.getViewTreeObserver().addOnPreDrawListener(new ca(this, 0));
        return true;
    }
}
