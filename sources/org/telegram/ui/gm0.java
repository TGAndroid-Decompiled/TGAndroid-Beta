package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gm0 implements View.OnTouchListener {
    public final int f36440a;
    public final un0 f36441b;

    public gm0(un0 un0Var, int i10) {
        this.f36440a = i10;
        this.f36441b = un0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f36440a;
        un0 un0Var = this.f36441b;
        switch (i10) {
            case 0:
                if (un0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    fu fuVar = new fu(null, false);
                    fuVar.f36232r = new gw(27, un0Var, view);
                    un0Var.presentFragment(fuVar);
                }
                return true;
            case 1:
                if (un0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(un0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                    a2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new o4(un0Var, 3));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    un0Var.showDialog(a2Var);
                }
                return true;
            case 2:
                if (un0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    fu fuVar2 = new fu(null, false);
                    fuVar2.f36232r = new hm0(un0Var, 2);
                    un0Var.presentFragment(fuVar2);
                }
                return true;
            default:
                if (un0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    fu fuVar3 = new fu(null, false);
                    fuVar3.f36232r = new hm0(un0Var, 3);
                    un0Var.presentFragment(fuVar3);
                }
                return true;
        }
    }
}
