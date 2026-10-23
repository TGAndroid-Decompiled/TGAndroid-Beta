package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ml0 implements View.OnTouchListener {
    public final int f39622a;
    public final an0 f39623b;

    public ml0(an0 an0Var, int i10) {
        this.f39622a = i10;
        this.f39623b = an0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f39622a;
        an0 an0Var = this.f39623b;
        switch (i10) {
            case 0:
                if (an0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                rt rtVar = new rt(null, false);
                rtVar.f41245r = new ql0(0, an0Var, view);
                an0Var.presentFragment(rtVar);
                return true;
            case 1:
                if (an0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var.getParentActivity());
                String string = LocaleController.getString(R.string.PassportSelectGender);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.R = string;
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new o4(an0Var, 3));
                alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                an0Var.showDialog(c2Var);
                return true;
            case 2:
                if (an0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                rt rtVar2 = new rt(null, false);
                rtVar2.f41245r = new nl0(an0Var, 2);
                an0Var.presentFragment(rtVar2);
                return true;
            default:
                if (an0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                rt rtVar3 = new rt(null, false);
                rtVar3.f41245r = new nl0(an0Var, 3);
                an0Var.presentFragment(rtVar3);
                return true;
        }
    }
}
