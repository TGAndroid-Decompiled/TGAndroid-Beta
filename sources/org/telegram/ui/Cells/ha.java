package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class ha extends GestureDetector.SimpleOnGestureListener {
    public final ia f20430a;

    public ha(ia iaVar) {
        this.f20430a = iaVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ia iaVar = this.f20430a;
        int i10 = iaVar.I7;
        if (iaVar.Je != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = iaVar.getMessageObject().selectReaction(zg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        iaVar.X3(iaVar.getMessageObject(), null, false, false, false, false);
        iaVar.requestLayout();
        zg.l0.b(false);
        if (selectReaction) {
            ja jaVar = iaVar.Ke;
            zg.l0.d(jaVar.f20527r, null, jaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), zg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), iaVar.I7, 0);
            zg.l0.f();
        }
        iaVar.getViewTreeObserver().addOnPreDrawListener(new ga(this, 0));
        return true;
    }
}
