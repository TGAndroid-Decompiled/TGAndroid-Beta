package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ll0 implements View.OnTouchListener {
    public final int f38896a;
    public final xm0 f38897b;

    public ll0(xm0 xm0Var, int i10) {
        this.f38896a = i10;
        this.f38897b = xm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f38896a;
        xm0 xm0Var = this.f38897b;
        switch (i10) {
            case 0:
                if (xm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar = new qt(null, false);
                    qtVar.f40499r = new ov(27, xm0Var, view);
                    xm0Var.presentFragment(qtVar);
                }
                return true;
            case 1:
                if (xm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new p4(xm0Var, 3));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    xm0Var.showDialog(b2Var);
                }
                return true;
            case 2:
                if (xm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar2 = new qt(null, false);
                    qtVar2.f40499r = new ml0(xm0Var, 2);
                    xm0Var.presentFragment(qtVar2);
                }
                return true;
            default:
                if (xm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar3 = new qt(null, false);
                    qtVar3.f40499r = new ml0(xm0Var, 3);
                    xm0Var.presentFragment(qtVar3);
                }
                return true;
        }
    }
}
