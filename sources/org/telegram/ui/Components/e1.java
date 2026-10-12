package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f24549a;
    public final Object f24550b;

    public e1(Object obj, int i10) {
        this.f24549a = i10;
        this.f24550b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f24549a) {
            case 0:
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) this.f24550b;
                if (i10 == 6) {
                    p6Var.run();
                    return true;
                }
                return false;
            case 1:
                dl dlVar = (dl) this.f24550b;
                if (i10 == 6) {
                    di.d dVar = dlVar.f24426l0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    dlVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f24550b).f21368b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 3:
                or orVar = (or) this.f24550b;
                if (i10 == 6) {
                    orVar.run();
                    return true;
                }
                return false;
            case 4:
                re0 re0Var = (re0) this.f24550b;
                if (i10 == 6) {
                    re0Var.m(false);
                    return true;
                }
                re0Var.getClass();
                return false;
            case 5:
                s4 s4Var = (s4) this.f24550b;
                if (i10 == 6) {
                    s4Var.f30089b.f29737a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                di.g2 g2Var = ((zn0) this.f24550b).e;
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
                jr0 jr0Var = (jr0) this.f24550b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(jr0Var.f26489y0.f27815r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f24550b;
                if (i10 == 5) {
                    alertDialog$Builder.f19548a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f24550b;
                if (i10 == 6) {
                    a2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                r21 r21Var = (r21) this.f24550b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(r21Var.f28722b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                p71 p71Var = (p71) this.f24550b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(p71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
