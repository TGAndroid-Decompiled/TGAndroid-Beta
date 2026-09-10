package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;
public final class bs implements View.OnTouchListener {
    public final int f21893a;
    public final Object f21894b;

    public bs(Object obj, int i10) {
        this.f21893a = i10;
        this.f21894b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r70 r70Var;
        switch (this.f21893a) {
            case 0:
                org.telegram.ui.ActionBar.p1 p1Var = ((ds) this.f21894b).f22472a;
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
                w70 w70Var = (w70) ((WeakReference) this.f21894b).get();
                if (w70Var != null && (r70Var = w70Var.f28691m) != null && r70Var.isShowing()) {
                    if (view.getParent() != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 2) {
                        w70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    } else if (actionMasked == 1) {
                        w70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        View view2 = w70Var.f28697p0;
                        if (view2 != null) {
                            w70Var.f28697p0 = null;
                            view2.setPressed(false);
                            view2.performClick();
                        }
                        view.setOnTouchListener(null);
                        w70Var.f28695o0 = null;
                    } else if (actionMasked == 3) {
                        View view3 = w70Var.f28697p0;
                        if (view3 != null) {
                            view3.setPressed(false);
                            w70Var.f28697p0 = null;
                        }
                        view.setOnTouchListener(null);
                        w70Var.f28695o0 = null;
                    }
                    return true;
                }
                view.setOnTouchListener(null);
                return false;
            case 2:
                xa0 xa0Var = (xa0) this.f21894b;
                xa0Var.getClass();
                return org.telegram.ui.tt.q().s(motionEvent, xa0Var.getListView(), xa0Var.f28996w, null, xa0Var.f28989a);
            case 3:
                yb0 yb0Var = (yb0) this.f21894b;
                yb0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    yb0Var.f29295c0.a(true);
                }
                return true;
            default:
                return hy0.v((hy0) this.f21894b, motionEvent);
        }
    }
}
