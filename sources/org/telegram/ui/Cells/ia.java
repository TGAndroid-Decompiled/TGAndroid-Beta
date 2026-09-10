package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class ia extends GestureDetector.SimpleOnGestureListener {
    public final ja f19322a;

    public ia(ja jaVar) {
        this.f19322a = jaVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ja jaVar = this.f19322a;
        int i10 = jaVar.I7;
        if (jaVar.Ie != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = jaVar.getMessageObject().selectReaction(yg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        jaVar.X3(jaVar.getMessageObject(), null, false, false, false, false);
        jaVar.requestLayout();
        yg.l0.b(false);
        if (selectReaction) {
            ka kaVar = jaVar.Je;
            yg.l0.d(kaVar.f19458r, null, kaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), yg.p0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), jaVar.I7, 0);
            yg.l0.f();
        }
        jaVar.getViewTreeObserver().addOnPreDrawListener(new ha(this, 0));
        return true;
    }
}
