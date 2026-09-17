package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bm0 implements View.OnTouchListener {
    public final int f32205a;
    public final qn0 f32206b;

    public bm0(qn0 qn0Var, int i10) {
        this.f32205a = i10;
        this.f32206b = qn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f32205a;
        qn0 qn0Var = this.f32206b;
        switch (i10) {
            case 0:
                if (qn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    cu cuVar = new cu(null, false);
                    cuVar.f32918r = new f20(22, qn0Var, view);
                    qn0Var.presentFragment(cuVar);
                }
                return true;
            case 1:
                if (qn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                    c2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new wv(qn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    qn0Var.showDialog(c2Var);
                }
                return true;
            case 2:
                if (qn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    cu cuVar2 = new cu(null, false);
                    cuVar2.f32918r = new cm0(qn0Var, 2);
                    qn0Var.presentFragment(cuVar2);
                }
                return true;
            default:
                if (qn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    cu cuVar3 = new cu(null, false);
                    cuVar3.f32918r = new cm0(qn0Var, 3);
                    qn0Var.presentFragment(cuVar3);
                }
                return true;
        }
    }
}
