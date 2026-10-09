package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f25904a;
    public final Object f25905b;

    public e1(Object obj, int i10) {
        this.f25904a = i10;
        this.f25905b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25904a) {
            case 0:
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.f25905b;
                if (i10 == 6) {
                    n5Var.run();
                    return true;
                }
                return false;
            case 1:
                gl glVar = (gl) this.f25905b;
                if (i10 == 6) {
                    ci.d dVar = glVar.f26779l0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    glVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f25905b).f22297b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 3:
                nr nrVar = (nr) this.f25905b;
                if (i10 == 6) {
                    nrVar.run();
                    return true;
                }
                return false;
            case 4:
                te0 te0Var = (te0) this.f25905b;
                if (i10 == 6) {
                    te0Var.m(false);
                    return true;
                }
                te0Var.getClass();
                return false;
            case 5:
                s4 s4Var = (s4) this.f25905b;
                if (i10 == 6) {
                    s4Var.f33602b.f33319a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ci.g2 g2Var = ((co0) this.f25905b).f25451e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        g2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(g2Var);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                mr0 mr0Var = (mr0) this.f25905b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(mr0Var.f28926y0.f30614r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25905b;
                if (i10 == 5) {
                    alertDialog$Builder.f20374a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f25905b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                u21 u21Var = (u21) this.f25905b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(u21Var.f31348b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                s71 s71Var = (s71) this.f25905b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(s71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
