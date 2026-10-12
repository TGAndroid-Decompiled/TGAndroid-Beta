package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f25539a;
    public final Object f25540b;

    public e1(Object obj, int i10) {
        this.f25539a = i10;
        this.f25540b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25539a) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f25540b;
                if (i10 == 6) {
                    l5Var.run();
                    return true;
                }
                return false;
            case 1:
                il ilVar = (il) this.f25540b;
                if (i10 == 6) {
                    ci.d dVar = ilVar.f27197l0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    ilVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f25540b).f22081b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 3:
                tr trVar = (tr) this.f25540b;
                if (i10 == 6) {
                    trVar.run();
                    return true;
                }
                return false;
            case 4:
                xe0 xe0Var = (xe0) this.f25540b;
                if (i10 == 6) {
                    xe0Var.m(false);
                    return true;
                }
                xe0Var.getClass();
                return false;
            case 5:
                s4 s4Var = (s4) this.f25540b;
                if (i10 == 6) {
                    s4Var.f26147b.f25732a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ci.g2 g2Var = ((io0) this.f25540b).f27244e;
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
                sr0 sr0Var = (sr0) this.f25540b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(sr0Var.f30665y0.f31362r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25540b;
                if (i10 == 5) {
                    alertDialog$Builder.f20142a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f25540b;
                if (i10 == 6) {
                    a2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                b31 b31Var = (b31) this.f25540b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(b31Var.f24551b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                x71 x71Var = (x71) this.f25540b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(x71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
