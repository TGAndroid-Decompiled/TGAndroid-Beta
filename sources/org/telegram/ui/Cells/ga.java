package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class ga extends GestureDetector.SimpleOnGestureListener {
    public final ha f22186a;

    public ga(ha haVar) {
        this.f22186a = haVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ha haVar = this.f22186a;
        int i10 = haVar.I7;
        if (haVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = haVar.getMessageObject().selectReaction(zg.m0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        haVar.X3(haVar.getMessageObject(), null, false, false, false, false);
        haVar.requestLayout();
        zg.i0.b(false);
        if (selectReaction) {
            ia iaVar = haVar.Ke;
            zg.i0.d(iaVar.f22293r, null, iaVar.f22290e[1], null, motionEvent.getX(), motionEvent.getY(), zg.m0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), haVar.I7, 0);
            zg.i0.f();
        }
        haVar.getViewTreeObserver().addOnPreDrawListener(new fa(this, 0));
        return true;
    }
}
