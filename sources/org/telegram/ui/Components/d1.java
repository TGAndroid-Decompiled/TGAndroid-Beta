package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d1 implements TextView.OnEditorActionListener {
    public final int f27327a;
    public final Object f27328b;

    public d1(Object obj, int i10) {
        this.f27327a = i10;
        this.f27328b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f27327a) {
            case 0:
                m4.v0 v0Var = (m4.v0) this.f27328b;
                if (i10 == 6) {
                    v0Var.run();
                    return true;
                }
                return false;
            case 1:
                al alVar = (al) this.f27328b;
                if (i10 == 6) {
                    fi.d dVar = alVar.f26535o0;
                    if (dVar.f10687c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    alVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.e3 e3Var = ((org.telegram.ui.Cells.g3) this.f27328b).d;
                if (i10 == 5) {
                    e3Var.requestFocus();
                    e3Var.setSelection(e3Var.length());
                    return true;
                }
                return false;
            case 3:
                mr mrVar = (mr) this.f27328b;
                if (i10 == 6) {
                    mrVar.run();
                    return true;
                }
                return false;
            case 4:
                le0 le0Var = (le0) this.f27328b;
                if (i10 == 6) {
                    le0Var.n(false);
                    return true;
                }
                le0Var.getClass();
                return false;
            case 5:
                s4 s4Var = (s4) this.f27328b;
                if (i10 == 6) {
                    s4Var.f35082b.f34779a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                fi.c2 c2Var = ((do0) this.f27328b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        c2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(c2Var);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                mr0 mr0Var = (mr0) this.f27328b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(mr0Var.f30732z0.f30367r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f27328b;
                if (i10 == 5) {
                    alertDialog$Builder.f22368a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f27328b;
                if (i10 == 6) {
                    e2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                y21 y21Var = (y21) this.f27328b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(y21Var.f34915b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                a81 a81Var = (a81) this.f27328b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(a81Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
