package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class ga extends GestureDetector.SimpleOnGestureListener {
    public final ha f20373a;

    public ga(ha haVar) {
        this.f20373a = haVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ha haVar = this.f20373a;
        int i10 = haVar.I7;
        if (haVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = haVar.getMessageObject().selectReaction(zg.o0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        haVar.X3(haVar.getMessageObject(), null, false, false, false, false);
        haVar.requestLayout();
        zg.k0.b(false);
        if (selectReaction) {
            ia iaVar = haVar.Ke;
            zg.k0.d(iaVar.f20471r, null, iaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), zg.o0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), haVar.I7, 0);
            zg.k0.f();
        }
        haVar.getViewTreeObserver().addOnPreDrawListener(new fa(this, 0));
        return true;
    }
}
