package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class em0 implements View.OnTouchListener {
    public final int f35333a;
    public final sn0 f35334b;

    public em0(sn0 sn0Var, int i10) {
        this.f35333a = i10;
        this.f35334b = sn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f35333a;
        sn0 sn0Var = this.f35334b;
        switch (i10) {
            case 0:
                if (sn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    fu fuVar = new fu(null, false);
                    fuVar.f35958r = new qw(26, sn0Var, view);
                    sn0Var.presentFragment(fuVar);
                }
                return true;
            case 1:
                if (sn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    a2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new o4(sn0Var, 3));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    sn0Var.showDialog(a2Var);
                }
                return true;
            case 2:
                if (sn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    fu fuVar2 = new fu(null, false);
                    fuVar2.f35958r = new fm0(sn0Var, 2);
                    sn0Var.presentFragment(fuVar2);
                }
                return true;
            default:
                if (sn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    fu fuVar3 = new fu(null, false);
                    fuVar3.f35958r = new fm0(sn0Var, 3);
                    sn0Var.presentFragment(fuVar3);
                }
                return true;
        }
    }
}
