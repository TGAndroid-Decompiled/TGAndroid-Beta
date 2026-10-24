package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ll0 implements View.OnTouchListener {
    public final int f39313a;
    public final zm0 f39314b;

    public ll0(zm0 zm0Var, int i10) {
        this.f39313a = i10;
        this.f39314b = zm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f39313a;
        zm0 zm0Var = this.f39314b;
        switch (i10) {
            case 0:
                if (zm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                rt rtVar = new rt(null, false);
                rtVar.f41228r = new pl0(0, zm0Var, view);
                zm0Var.presentFragment(rtVar);
                return true;
            case 1:
                if (zm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zm0Var.getParentActivity());
                String string = LocaleController.getString(R.string.PassportSelectGender);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string;
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new o4(zm0Var, 3));
                alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                zm0Var.showDialog(c2Var);
                return true;
            case 2:
                if (zm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                rt rtVar2 = new rt(null, false);
                rtVar2.f41228r = new ml0(zm0Var, 2);
                zm0Var.presentFragment(rtVar2);
                return true;
            default:
                if (zm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                rt rtVar3 = new rt(null, false);
                rtVar3.f41228r = new ml0(zm0Var, 3);
                zm0Var.presentFragment(rtVar3);
                return true;
        }
    }
}
