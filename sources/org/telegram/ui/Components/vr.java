package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class vr implements View.OnTouchListener {
    public final int f29393a;
    public final Object f29394b;

    public vr(Object obj, int i10) {
        this.f29393a = i10;
        this.f29394b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i70 i70Var;
        switch (this.f29393a) {
            case 0:
                org.telegram.ui.ActionBar.o1 o1Var = ((xr) this.f29394b).f29976a;
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
                n70 n70Var = (n70) ((WeakReference) this.f29394b).get();
                if (n70Var != null && (i70Var = n70Var.f26374m) != null && i70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        n70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        n70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = n70Var.f26380p0;
                        if (view2 != null) {
                            n70Var.f26380p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        n70Var.f26378o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = n70Var.f26380p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            n70Var.f26380p0 = null;
                        }
                        view.setOnTouchListener(null);
                        n70Var.f26378o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                na0 na0Var = (na0) this.f29394b;
                na0Var.getClass();
                return org.telegram.ui.ut.q().s(motionEvent, na0Var.getListView(), na0Var.f26431w, null, na0Var.f26424a);
            case 3:
                pb0 pb0Var = (pb0) this.f29394b;
                pb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    pb0Var.f26988c0.a(true);
                }
                return true;
            default:
                return wx0.v((wx0) this.f29394b, motionEvent);
        }
    }
}
