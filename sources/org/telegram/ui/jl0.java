package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class jl0 implements View.OnTouchListener {

    public final int f39388a;

    public final xm0 f39389b;

    public jl0(xm0 xm0Var, int i10) {
        this.f39388a = i10;
        this.f39389b = xm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f39388a;
        int i11 = 2;
        xm0 xm0Var = this.f39389b;
        switch (i10) {
            case 0:
                if (xm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    tt ttVar = new tt(null, false);
                    ttVar.f43010r = new nl0(i11, xm0Var, view);
                    xm0Var.presentFragment(ttVar);
                }
                return true;
            case 1:
                if (xm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.N = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new kv(xm0Var, i11));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    xm0Var.showDialog(b2Var);
                }
                return true;
            case 2:
                if (xm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    tt ttVar2 = new tt(null, false);
                    ttVar2.f43010r = new kl0(xm0Var, i11);
                    xm0Var.presentFragment(ttVar2);
                }
                return true;
            default:
                if (xm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    tt ttVar3 = new tt(null, false);
                    ttVar3.f43010r = new kl0(xm0Var, 3);
                    xm0Var.presentFragment(ttVar3);
                }
                return true;
        }
    }
}
