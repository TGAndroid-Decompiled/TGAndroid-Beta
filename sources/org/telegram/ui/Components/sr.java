package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class sr implements View.OnTouchListener {
    public final int f28797a;
    public final Object f28798b;

    public sr(Object obj, int i10) {
        this.f28797a = i10;
        this.f28798b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k70 k70Var;
        switch (this.f28797a) {
            case 0:
                org.telegram.ui.ActionBar.p1 p1Var = ((ur) this.f28798b).f29289a;
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
                p70 p70Var = (p70) ((WeakReference) this.f28798b).get();
                if (p70Var != null && (k70Var = p70Var.f27767m) != null && k70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        p70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        p70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = p70Var.f27773p0;
                        if (view2 != null) {
                            p70Var.f27773p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        p70Var.f27771o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = p70Var.f27773p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            p70Var.f27773p0 = null;
                        }
                        view.setOnTouchListener(null);
                        p70Var.f27771o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                qa0 qa0Var = (qa0) this.f28798b;
                qa0Var.getClass();
                return org.telegram.ui.rt.q().s(motionEvent, qa0Var.getListView(), qa0Var.f28133w, null, qa0Var.f28126a);
            case 3:
                rb0 rb0Var = (rb0) this.f28798b;
                rb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    rb0Var.W.a(true);
                }
                return true;
            default:
                return xx0.v((xx0) this.f28798b, motionEvent);
        }
    }
}
