package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class am0 implements View.OnTouchListener {
    public final int f36009a;
    public final nn0 f36010b;

    public am0(nn0 nn0Var, int i10) {
        this.f36009a = i10;
        this.f36010b = nn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f36009a;
        nn0 nn0Var = this.f36010b;
        switch (i10) {
            case 0:
                if (nn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    zt ztVar = new zt(null, false);
                    ztVar.f45111r = new rw(24, nn0Var, view);
                    nn0Var.presentFragment(ztVar);
                }
                return true;
            case 1:
                if (nn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                    b2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new tv(nn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    nn0Var.showDialog(b2Var);
                }
                return true;
            case 2:
                if (nn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    zt ztVar2 = new zt(null, false);
                    ztVar2.f45111r = new bm0(nn0Var, 2);
                    nn0Var.presentFragment(ztVar2);
                }
                return true;
            default:
                if (nn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    zt ztVar3 = new zt(null, false);
                    ztVar3.f45111r = new bm0(nn0Var, 3);
                    nn0Var.presentFragment(ztVar3);
                }
                return true;
        }
    }
}
