package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bm0 implements View.OnTouchListener {
    public final int f36207a;
    public final pn0 f36208b;

    public bm0(pn0 pn0Var, int i10) {
        this.f36207a = i10;
        this.f36208b = pn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f36207a;
        pn0 pn0Var = this.f36208b;
        switch (i10) {
            case 0:
                if (pn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    cu cuVar = new cu(null, false);
                    cuVar.f36517r = new tw(24, pn0Var, view);
                    pn0Var.presentFragment(cuVar);
                }
                return true;
            case 1:
                if (pn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                    a2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new m4(pn0Var, 3));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    pn0Var.showDialog(a2Var);
                }
                return true;
            case 2:
                if (pn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    cu cuVar2 = new cu(null, false);
                    cuVar2.f36517r = new cm0(pn0Var, 2);
                    pn0Var.presentFragment(cuVar2);
                }
                return true;
            default:
                if (pn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    cu cuVar3 = new cu(null, false);
                    cuVar3.f36517r = new cm0(pn0Var, 3);
                    pn0Var.presentFragment(cuVar3);
                }
                return true;
        }
    }
}
