package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c1 implements TextView.OnEditorActionListener {
    public final int f27333a;
    public final Object f27334b;

    public c1(Object obj, int i9) {
        this.f27333a = i9;
        this.f27334b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.f27333a) {
            case 0:
                org.telegram.ui.k6 k6Var = (org.telegram.ui.k6) this.f27334b;
                if (i9 == 6) {
                    k6Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f27334b).f24544b;
                if (i9 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 2:
                nq nqVar = (nq) this.f27334b;
                if (i9 == 6) {
                    nqVar.run();
                    return true;
                }
                return false;
            case 3:
                yc0 yc0Var = (yc0) this.f27334b;
                if (i9 == 6) {
                    yc0Var.k(false);
                    return true;
                }
                yc0Var.getClass();
                return false;
            case 4:
                k4 k4Var = (k4) this.f27334b;
                if (i9 == 6) {
                    k4Var.f28488b.f28060a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                fg.g gVar = ((hm0) this.f27334b).f29132e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        gVar.hideActionMode();
                        AndroidUtilities.hideKeyboard(gVar);
                        return false;
                    }
                    return false;
                }
                return false;
            case 6:
                rp0 rp0Var = (rp0) this.f27334b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(rp0Var.f32267u0.f30664r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f27334b;
                if (i9 == 5) {
                    alertDialog$Builder.f22702a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f27334b;
                if (i9 == 6) {
                    c2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                v01 v01Var = (v01) this.f27334b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(v01Var.f33196b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                r51 r51Var = (r51) this.f27334b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(r51Var.F);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
