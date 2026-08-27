package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.AndroidUtilities;

public final class jr implements View.OnTouchListener {

    public final int f29801a;

    public final Object f29802b;

    public jr(Object obj, int i10) {
        this.f29801a = i10;
        this.f29802b = obj;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        w60 w60Var;
        switch (this.f29801a) {
            case 0:
                org.telegram.ui.ActionBar.n1 n1Var = ((lr) this.f29802b).f30453a;
                if (motionEvent.getActionMasked() != 1 || n1Var == null || !n1Var.isShowing()) {
                    return false;
                }
                Rect rect = AndroidUtilities.rectTmp2;
                view.getHitRect(rect);
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                n1Var.d(true);
                return false;
            case 1:
                b70 b70Var = (b70) ((WeakReference) this.f29802b).get();
                if (b70Var == null || (w60Var = b70Var.f26982m) == null || !w60Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    b70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    b70Var.b0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = b70Var.f26988p0;
                    if (view2 != null) {
                        b70Var.f26988p0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    b70Var.f26986o0 = null;
                } else if (actionMasked == 3) {
                    View view3 = b70Var.f26988p0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        b70Var.f26988p0 = null;
                    }
                    view.setOnTouchListener(null);
                    b70Var.f26986o0 = null;
                }
                return true;
            case 2:
                aa0 aa0Var = (aa0) this.f29802b;
                aa0Var.getClass();
                return org.telegram.ui.kt.q().s(motionEvent, aa0Var.getListView(), aa0Var.f26707w, null, aa0Var.f26699a);
            case 3:
                ab0 ab0Var = (ab0) this.f29802b;
                ab0Var.getClass();
                if (motionEvent.getAction() == 1) {
                    ab0Var.V.a(true);
                }
                return true;
            default:
                return ex0.w((ex0) this.f29802b, motionEvent);
        }
    }
}
