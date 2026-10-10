package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class ea extends GestureDetector.SimpleOnGestureListener {
    public final fa f22058a;

    public ea(fa faVar) {
        this.f22058a = faVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        fa faVar = this.f22058a;
        int i10 = faVar.I7;
        if (faVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = faVar.getMessageObject().selectReaction(zg.n0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        faVar.X3(faVar.getMessageObject(), null, false, false, false, false);
        faVar.requestLayout();
        zg.j0.b(false);
        if (selectReaction) {
            ga gaVar = faVar.Ke;
            zg.j0.d(gaVar.f22174r, null, gaVar.f22171e[1], null, motionEvent.getX(), motionEvent.getY(), zg.n0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), faVar.I7, 0);
            zg.j0.f();
        }
        faVar.getViewTreeObserver().addOnPreDrawListener(new da(this, 0));
        return true;
    }
}
