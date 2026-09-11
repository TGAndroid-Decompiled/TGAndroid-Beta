package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class ur implements View.OnTouchListener {
    public final int f30961a;
    public final Object f30962b;

    public ur(Object obj, int i10) {
        this.f30961a = i10;
        this.f30962b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        i70 i70Var;
        switch (this.f30961a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((wr) this.f30962b).f32322a;
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
                n70 n70Var = (n70) ((WeakReference) this.f30962b).get();
                if (n70Var != null && (i70Var = n70Var.f28650m) != null && i70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        n70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        n70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = n70Var.f28656p0;
                        if (view2 != null) {
                            n70Var.f28656p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        n70Var.f28654o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = n70Var.f28656p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            n70Var.f28656p0 = null;
                        }
                        view.setOnTouchListener(null);
                        n70Var.f28654o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                oa0 oa0Var = (oa0) this.f30962b;
                oa0Var.getClass();
                return org.telegram.ui.st.q().s(motionEvent, oa0Var.getListView(), oa0Var.f29025w, null, oa0Var.f29017a);
            case 3:
                qb0 qb0Var = (qb0) this.f30962b;
                qb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    qb0Var.f29662c0.a(true);
                }
                return true;
            default:
                return ux0.v((ux0) this.f30962b, motionEvent);
        }
    }
}
