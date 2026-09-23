package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class wr implements View.OnTouchListener {
    public final int f29797a;
    public final Object f29798b;

    public wr(Object obj, int i10) {
        this.f29797a = i10;
        this.f29798b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j70 j70Var;
        switch (this.f29797a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((yr) this.f29798b).f30379a;
                if (motionEvent.getActionMasked() == 1 && n1Var != null && n1Var.isShowing()) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        n1Var.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                o70 o70Var = (o70) ((WeakReference) this.f29798b).get();
                if (o70Var != null && (j70Var = o70Var.f26659m) != null && j70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        o70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        o70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = o70Var.f26665p0;
                        if (view2 != null) {
                            o70Var.f26665p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        o70Var.f26663o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = o70Var.f26665p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            o70Var.f26665p0 = null;
                        }
                        view.setOnTouchListener(null);
                        o70Var.f26663o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                oa0 oa0Var = (oa0) this.f29798b;
                oa0Var.getClass();
                return org.telegram.ui.pt.q().s(motionEvent, oa0Var.getListView(), oa0Var.f26700w, null, oa0Var.f26693a);
            case 3:
                ob0 ob0Var = (ob0) this.f29798b;
                ob0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ob0Var.f26708c0.a(true);
                }
                return true;
            default:
                return ux0.v((ux0) this.f29798b, motionEvent);
        }
    }
}
