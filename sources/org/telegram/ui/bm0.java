package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bm0 implements View.OnTouchListener {
    public final int f34841a;
    public final pn0 f34842b;

    public bm0(pn0 pn0Var, int i10) {
        this.f34841a = i10;
        this.f34842b = pn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f34841a;
        pn0 pn0Var = this.f34842b;
        switch (i10) {
            case 0:
                if (pn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    bu buVar = new bu(null, false);
                    buVar.f34929r = new z10(23, pn0Var, view);
                    pn0Var.presentFragment(buVar);
                }
                return true;
            case 1:
                if (pn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                    b2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new vv(pn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    pn0Var.showDialog(b2Var);
                }
                return true;
            case 2:
                if (pn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    bu buVar2 = new bu(null, false);
                    buVar2.f34929r = new cm0(pn0Var, 2);
                    pn0Var.presentFragment(buVar2);
                }
                return true;
            default:
                if (pn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    bu buVar3 = new bu(null, false);
                    buVar3.f34929r = new cm0(pn0Var, 3);
                    pn0Var.presentFragment(buVar3);
                }
                return true;
        }
    }
}
