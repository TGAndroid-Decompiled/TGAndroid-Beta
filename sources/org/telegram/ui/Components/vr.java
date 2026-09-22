package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class vr implements View.OnTouchListener {
    public final int f29417a;
    public final Object f29418b;

    public vr(Object obj, int i10) {
        this.f29417a = i10;
        this.f29418b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i70 i70Var;
        switch (this.f29417a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((xr) this.f29418b).f30042a;
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
                n70 n70Var = (n70) ((WeakReference) this.f29418b).get();
                if (n70Var != null && (i70Var = n70Var.f26357m) != null && i70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        n70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        n70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = n70Var.f26363p0;
                        if (view2 != null) {
                            n70Var.f26363p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        n70Var.f26361o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = n70Var.f26363p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            n70Var.f26363p0 = null;
                        }
                        view.setOnTouchListener(null);
                        n70Var.f26361o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                na0 na0Var = (na0) this.f29418b;
                na0Var.getClass();
                return org.telegram.ui.st.q().s(motionEvent, na0Var.getListView(), na0Var.f26428w, null, na0Var.f26421a);
            case 3:
                pb0 pb0Var = (pb0) this.f29418b;
                pb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    pb0Var.f26998c0.a(true);
                }
                return true;
            default:
                return vx0.v((vx0) this.f29418b, motionEvent);
        }
    }
}
