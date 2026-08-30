package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pl0 implements View.OnTouchListener {
    public final int f37366a;
    public final dn0 f37367b;

    public pl0(dn0 dn0Var, int i10) {
        this.f37366a = i10;
        this.f37367b = dn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f37366a;
        dn0 dn0Var = this.f37367b;
        switch (i10) {
            case 0:
                if (dn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    yt ytVar = new yt(null, false);
                    ytVar.f40576r = new tl0(1, dn0Var, view);
                    dn0Var.presentFragment(ytVar);
                }
                return true;
            case 1:
                if (dn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.O = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new qv(dn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    dn0Var.showDialog(d2Var);
                }
                return true;
            case 2:
                if (dn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    yt ytVar2 = new yt(null, false);
                    ytVar2.f40576r = new ql0(dn0Var, 2);
                    dn0Var.presentFragment(ytVar2);
                }
                return true;
            default:
                if (dn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    yt ytVar3 = new yt(null, false);
                    ytVar3.f40576r = new ql0(dn0Var, 3);
                    dn0Var.presentFragment(ytVar3);
                }
                return true;
        }
    }
}
