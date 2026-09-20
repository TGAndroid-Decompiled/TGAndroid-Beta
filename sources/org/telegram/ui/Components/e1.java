package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f23702a;
    public final Object f23703b;

    public e1(Object obj, int i10) {
        this.f23702a = i10;
        this.f23703b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f23702a) {
            case 0:
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.f23703b;
                if (i10 == 6) {
                    n5Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.f23703b).f20527b;
                if (i10 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    return true;
                }
                return false;
            case 2:
                xq xqVar = (xq) this.f23703b;
                if (i10 == 6) {
                    xqVar.run();
                    return true;
                }
                return false;
            case 3:
                ae0 ae0Var = (ae0) this.f23703b;
                if (i10 == 6) {
                    ae0Var.k(false);
                    return true;
                }
                ae0Var.getClass();
                return false;
            case 4:
                p4 p4Var = (p4) this.f23703b;
                if (i10 == 6) {
                    p4Var.f23879b.f23610a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                ci.h2 h2Var = ((jn0) this.f23703b).e;
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
                uq0 uq0Var = (uq0) this.f23703b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(uq0Var.f28836y0.f22856r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f23703b;
                if (i10 == 5) {
                    alertDialog$Builder.f18654a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f23703b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                d21 d21Var = (d21) this.f23703b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(d21Var.f23471b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                b71 b71Var = (b71) this.f23703b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(b71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
