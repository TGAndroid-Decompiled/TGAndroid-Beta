package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f25847a;
    public final Object f25848b;

    public e1(Object obj, int i10) {
        this.f25847a = i10;
        this.f25848b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25847a) {
            case 0:
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.f25848b;
                if (i10 == 6) {
                    n5Var.run();
                    return true;
                }
                return false;
            case 1:
                gl glVar = (gl) this.f25848b;
                if (i10 == 6) {
                    ci.d dVar = glVar.f26768l0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    glVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f25848b).f22301b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 3:
                rr rrVar = (rr) this.f25848b;
                if (i10 == 6) {
                    rrVar.run();
                    return true;
                }
                return false;
            case 4:
                ue0 ue0Var = (ue0) this.f25848b;
                if (i10 == 6) {
                    ue0Var.m(false);
                    return true;
                }
                ue0Var.getClass();
                return false;
            case 5:
                s4 s4Var = (s4) this.f25848b;
                if (i10 == 6) {
                    s4Var.f24593b.f33631a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ci.g2 g2Var = ((do0) this.f25848b).f25777e;
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
                nr0 nr0Var = (nr0) this.f25848b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(nr0Var.f29223y0.f30958r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25848b;
                if (i10 == 5) {
                    alertDialog$Builder.f20378a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f25848b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                w21 w21Var = (w21) this.f25848b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(w21Var.f32577b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                t71 t71Var = (t71) this.f25848b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(t71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
