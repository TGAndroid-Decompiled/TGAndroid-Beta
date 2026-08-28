package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class lr implements View.OnTouchListener {
    public final int f30540a;
    public final Object f30541b;

    public lr(Object obj, int i9) {
        this.f30540a = i9;
        this.f30541b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s60 s60Var;
        switch (this.f30540a) {
            case 0:
                org.telegram.ui.ActionBar.o1 o1Var = ((nr) this.f30541b).f31170a;
                if (motionEvent.getActionMasked() == 1 && o1Var != null && o1Var.isShowing()) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        o1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                x60 x60Var = (x60) ((WeakReference) this.f30541b).get();
                if (x60Var != null && (s60Var = x60Var.f34570m) != null && s60Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        x60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        x60Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = x60Var.f34576p0;
                        if (view2 != null) {
                            x60Var.f34576p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        x60Var.f34574o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = x60Var.f34576p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            x60Var.f34576p0 = null;
                        }
                        view.setOnTouchListener(null);
                        x60Var.f34574o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                w90 w90Var = (w90) this.f30541b;
                w90Var.getClass();
                return org.telegram.ui.ht.q().s(motionEvent, w90Var.getListView(), w90Var.f34163w, null, w90Var.f34155a);
            case 3:
                wa0 wa0Var = (wa0) this.f30541b;
                wa0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    wa0Var.V.a(true);
                }
                return true;
            default:
                return cx0.v((cx0) this.f30541b, motionEvent);
        }
    }
}
