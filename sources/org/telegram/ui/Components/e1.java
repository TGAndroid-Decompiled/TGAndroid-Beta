package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f23784a;
    public final Object f23785b;

    public e1(Object obj, int i10) {
        this.f23784a = i10;
        this.f23785b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f23784a) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f23785b;
                if (i10 == 6) {
                    l5Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f23785b).f20493b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 2:
                zq zqVar = (zq) this.f23785b;
                if (i10 == 6) {
                    zqVar.run();
                    return true;
                }
                return false;
            case 3:
                ee0 ee0Var = (ee0) this.f23785b;
                if (i10 == 6) {
                    ee0Var.k(false);
                    return true;
                }
                ee0Var.getClass();
                return false;
            case 4:
                q4 q4Var = (q4) this.f23785b;
                if (i10 == 6) {
                    q4Var.f24836b.f24574a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                ci.h2 h2Var = ((ln0) this.f23785b).e;
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
                wq0 wq0Var = (wq0) this.f23785b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(wq0Var.f30150y0.f23822r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f23785b;
                if (i10 == 5) {
                    alertDialog$Builder.f18663a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f23785b;
                if (i10 == 6) {
                    a2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                e21 e21Var = (e21) this.f23785b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(e21Var.f23828b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                c71 c71Var = (c71) this.f23785b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(c71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
