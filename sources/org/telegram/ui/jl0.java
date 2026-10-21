package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jl0 implements View.OnTouchListener {
    public final int f38277a;
    public final vm0 f38278b;

    public jl0(vm0 vm0Var, int i10) {
        this.f38277a = i10;
        this.f38278b = vm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f38277a;
        vm0 vm0Var = this.f38278b;
        switch (i10) {
            case 0:
                if (vm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ot otVar = new ot(null, false);
                    otVar.f39979r = new xu(28, vm0Var, view);
                    vm0Var.presentFragment(otVar);
                }
                return true;
            case 1:
                if (vm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                    b2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new p4(vm0Var, 3));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    vm0Var.showDialog(b2Var);
                }
                return true;
            case 2:
                if (vm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ot otVar2 = new ot(null, false);
                    otVar2.f39979r = new kl0(vm0Var, 2);
                    vm0Var.presentFragment(otVar2);
                }
                return true;
            default:
                if (vm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ot otVar3 = new ot(null, false);
                    otVar3.f39979r = new kl0(vm0Var, 3);
                    vm0Var.presentFragment(otVar3);
                }
                return true;
        }
    }
}
