package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class ga extends GestureDetector.SimpleOnGestureListener {
    public final ha f20168a;

    public ga(ha haVar) {
        this.f20168a = haVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ha haVar = this.f20168a;
        int i10 = haVar.I7;
        if (haVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = haVar.getMessageObject().selectReaction(zg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        haVar.X3(haVar.getMessageObject(), null, false, false, false, false);
        haVar.requestLayout();
        zg.l0.b(false);
        if (selectReaction) {
            ja jaVar = haVar.Ke;
            zg.l0.d(jaVar.f20354r, null, jaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), zg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), haVar.I7, 0);
            zg.l0.f();
        }
        haVar.getViewTreeObserver().addOnPreDrawListener(new fa(this, 0));
        return true;
    }
}
