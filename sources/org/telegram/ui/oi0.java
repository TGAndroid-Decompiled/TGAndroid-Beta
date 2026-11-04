package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oi0 implements View.OnTouchListener {
    public final int f48299a;
    public final yj0 f48300b;

    public oi0(yj0 yj0Var, int i3) {
        this.f48299a = i3;
        this.f48300b = yj0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i3 = this.f48299a;
        yj0 yj0Var = this.f48300b;
        switch (i3) {
            case 0:
                if (yj0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    os osVar = new os(null, false);
                    osVar.f48344r = new rb0(6, yj0Var, view);
                    yj0Var.presentFragment(osVar);
                }
                return true;
            case 1:
                if (yj0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131747474, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.bd.M0(2131747516, null), org.telegram.messenger.bd.M0(2131747577, null)}, new m4(yj0Var, 3));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752589, null), null);
                    yj0Var.showDialog(s1Var);
                }
                return true;
            case 2:
                if (yj0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    os osVar2 = new os(null, false);
                    osVar2.f48344r = new pi0(yj0Var, 2);
                    yj0Var.presentFragment(osVar2);
                }
                return true;
            default:
                if (yj0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    os osVar3 = new os(null, false);
                    osVar3.f48344r = new pi0(yj0Var, 3);
                    yj0Var.presentFragment(osVar3);
                }
                return true;
        }
    }
}
