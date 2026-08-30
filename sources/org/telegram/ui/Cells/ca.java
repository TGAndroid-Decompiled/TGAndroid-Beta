package org.telegram.ui.Cells;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.MediaDataController;
public final class ca extends GestureDetector.SimpleOnGestureListener {
    public final da f20933a;

    public ca(da daVar) {
        this.f20933a = daVar;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        da daVar = this.f20933a;
        int i10 = daVar.F7;
        if (daVar.Fe != 2 || MediaDataController.getInstance(i10).getDoubleTapReaction() == null) {
            return false;
        }
        boolean selectReaction = daVar.getMessageObject().selectReaction(mg.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), false, false);
        daVar.X3(daVar.getMessageObject(), null, false, false, false, false);
        daVar.requestLayout();
        mg.m0.b(false);
        if (selectReaction) {
            ea eaVar = daVar.Ge;
            mg.m0.d(eaVar.f21038r, null, eaVar.e[1], null, motionEvent.getX(), motionEvent.getY(), mg.q0.b(MediaDataController.getInstance(i10).getDoubleTapReaction()), daVar.F7, 0);
            mg.m0.f();
        }
        daVar.getViewTreeObserver().addOnPreDrawListener(new ba(this, 0));
        return true;
    }
}
