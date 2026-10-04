package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f25870a;
    public final Object f25871b;

    public e1(Object obj, int i10) {
        this.f25870a = i10;
        this.f25871b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25870a) {
            case 0:
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.f25871b;
                if (i10 == 6) {
                    m5Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f25871b).f22306b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 2:
                ar arVar = (ar) this.f25871b;
                if (i10 == 6) {
                    arVar.run();
                    return true;
                }
                return false;
            case 3:
                ee0 ee0Var = (ee0) this.f25871b;
                if (i10 == 6) {
                    ee0Var.k(false);
                    return true;
                }
                ee0Var.getClass();
                return false;
            case 4:
                q4 q4Var = (q4) this.f25871b;
                if (i10 == 6) {
                    q4Var.f28395b.f28169a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                ci.h2 h2Var = ((pn0) this.f25871b).f29671e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        h2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(h2Var);
                        return false;
                    }
                    return false;
                }
                return false;
            case 6:
                zq0 zq0Var = (zq0) this.f25871b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(zq0Var.f33628y0.f26246r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25871b;
                if (i10 == 5) {
                    alertDialog$Builder.f20367a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f25871b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                n21 n21Var = (n21) this.f25871b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(n21Var.f28844b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                m71 m71Var = (m71) this.f25871b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(m71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
