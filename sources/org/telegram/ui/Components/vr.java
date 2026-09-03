package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class vr implements View.OnTouchListener {
    public final int f32531a;
    public final Object f32532b;

    public vr(Object obj, int i10) {
        this.f32531a = i10;
        this.f32532b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        l70 l70Var;
        switch (this.f32531a) {
            case 0:
                org.telegram.ui.ActionBar.p1 p1Var = ((xr) this.f32532b).f33163a;
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
                q70 q70Var = (q70) ((WeakReference) this.f32532b).get();
                if (q70Var != null && (l70Var = q70Var.f30323m) != null && l70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        q70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        q70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = q70Var.f30329p0;
                        if (view2 != null) {
                            q70Var.f30329p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        q70Var.f30327o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = q70Var.f30329p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            q70Var.f30329p0 = null;
                        }
                        view.setOnTouchListener(null);
                        q70Var.f30327o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                ra0 ra0Var = (ra0) this.f32532b;
                ra0Var.getClass();
                return org.telegram.ui.qt.q().s(motionEvent, ra0Var.getListView(), ra0Var.f30714w, null, ra0Var.f30706a);
            case 3:
                sb0 sb0Var = (sb0) this.f32532b;
                sb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    sb0Var.W.a(true);
                }
                return true;
            default:
                return xx0.v((xx0) this.f32532b, motionEvent);
        }
    }
}
