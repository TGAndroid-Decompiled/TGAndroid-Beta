package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class pr implements View.OnTouchListener {
    public final int f31757a;
    public final Object f31758b;

    public pr(Object obj, int i10) {
        this.f31757a = i10;
        this.f31758b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        e70 e70Var;
        switch (this.f31757a) {
            case 0:
                org.telegram.ui.ActionBar.o1 o1Var = ((rr) this.f31758b).f32370a;
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
                j70 j70Var = (j70) ((WeakReference) this.f31758b).get();
                if (j70Var != null && (e70Var = j70Var.f29590m) != null && e70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        j70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        j70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = j70Var.f29596p0;
                        if (view2 != null) {
                            j70Var.f29596p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        j70Var.f29594o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = j70Var.f29596p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            j70Var.f29596p0 = null;
                        }
                        view.setOnTouchListener(null);
                        j70Var.f29594o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                ka0 ka0Var = (ka0) this.f31758b;
                ka0Var.getClass();
                return org.telegram.ui.ht.q().s(motionEvent, ka0Var.getListView(), ka0Var.f30003w, null, ka0Var.f29995a);
            case 3:
                lb0 lb0Var = (lb0) this.f31758b;
                lb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    lb0Var.V.a(true);
                }
                return true;
            default:
                return nx0.v((nx0) this.f31758b, motionEvent);
        }
    }
}
