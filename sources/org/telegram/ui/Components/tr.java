package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class tr implements View.OnTouchListener {
    public final int f29028a;
    public final Object f29029b;

    public tr(Object obj, int i10) {
        this.f29028a = i10;
        this.f29029b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j70 j70Var;
        switch (this.f29028a) {
            case 0:
                org.telegram.ui.ActionBar.p1 p1Var = ((vr) this.f29029b).f30077a;
                if (motionEvent.getActionMasked() == 1 && p1Var != null && p1Var.isShowing()) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        p1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                o70 o70Var = (o70) ((WeakReference) this.f29029b).get();
                if (o70Var != null && (j70Var = o70Var.f27479m) != null && j70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        o70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        o70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = o70Var.f27485p0;
                        if (view2 != null) {
                            o70Var.f27485p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        o70Var.f27483o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = o70Var.f27485p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            o70Var.f27485p0 = null;
                        }
                        view.setOnTouchListener(null);
                        o70Var.f27483o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                pa0 pa0Var = (pa0) this.f29029b;
                pa0Var.getClass();
                return org.telegram.ui.pt.q().s(motionEvent, pa0Var.getListView(), pa0Var.f27807w, null, pa0Var.f27800a);
            case 3:
                qb0 qb0Var = (qb0) this.f29029b;
                qb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    qb0Var.W.a(true);
                }
                return true;
            default:
                return xx0.v((xx0) this.f29029b, motionEvent);
        }
    }
}
