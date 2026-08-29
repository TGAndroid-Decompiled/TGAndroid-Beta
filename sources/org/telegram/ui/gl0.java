package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gl0 implements View.OnTouchListener {
    public final int f38618a;
    public final vm0 f38619b;

    public gl0(vm0 vm0Var, int i10) {
        this.f38618a = i10;
        this.f38619b = vm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f38618a;
        vm0 vm0Var = this.f38619b;
        switch (i10) {
            case 0:
                if (vm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    rt rtVar = new rt(null, false);
                    rtVar.f42203r = new kl0(2, vm0Var, view);
                    vm0Var.presentFragment(rtVar);
                }
                return true;
            case 1:
                if (vm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new iv(vm0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    vm0Var.showDialog(c2Var);
                }
                return true;
            case 2:
                if (vm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    rt rtVar2 = new rt(null, false);
                    rtVar2.f42203r = new hl0(vm0Var, 2);
                    vm0Var.presentFragment(rtVar2);
                }
                return true;
            default:
                if (vm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    rt rtVar3 = new rt(null, false);
                    rtVar3.f42203r = new hl0(vm0Var, 3);
                    vm0Var.presentFragment(rtVar3);
                }
                return true;
        }
    }
}
