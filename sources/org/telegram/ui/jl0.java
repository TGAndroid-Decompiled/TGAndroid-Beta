package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jl0 implements View.OnTouchListener {
    public final int f39526a;
    public final wm0 f39527b;

    public jl0(wm0 wm0Var, int i9) {
        this.f39526a = i9;
        this.f39527b = wm0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i9 = this.f39526a;
        wm0 wm0Var = this.f39527b;
        switch (i9) {
            case 0:
                if (wm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar = new qt(null, false);
                    qtVar.f42193r = new nl0(2, wm0Var, view);
                    wm0Var.presentFragment(qtVar);
                }
                return true;
            case 1:
                if (wm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new hv(wm0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    wm0Var.showDialog(c2Var);
                }
                return true;
            case 2:
                if (wm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar2 = new qt(null, false);
                    qtVar2.f42193r = new kl0(wm0Var, 2);
                    wm0Var.presentFragment(qtVar2);
                }
                return true;
            default:
                if (wm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    qt qtVar3 = new qt(null, false);
                    qtVar3.f42193r = new kl0(wm0Var, 3);
                    wm0Var.presentFragment(qtVar3);
                }
                return true;
        }
    }
}
