package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class ga extends GestureDetector.SimpleOnGestureListener {
    public final ha f21998a;

    public ga(ha haVar) {
        this.f21998a = haVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ha haVar = this.f21998a;
        int i10 = haVar.I7;
        if (haVar.Ie != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = haVar.getMessageObject().selectReaction(ah.j1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        haVar.X3(haVar.getMessageObject(), null, false, false, false, false);
        haVar.requestLayout();
        ah.e1.b(false);
        if (selectReaction) {
            ia iaVar = haVar.Je;
            ah.e1.d(iaVar.f22134r, null, iaVar.f22131e[1], null, motionEvent.getX(), motionEvent.getY(), ah.j1.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), haVar.I7, 0);
            ah.e1.f();
        }
        haVar.getViewTreeObserver().addOnPreDrawListener(new fa(this, 0));
        return true;
    }
}
