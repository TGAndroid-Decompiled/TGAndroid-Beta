package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f23812a;
    public final Object f23813b;

    public e1(Object obj, int i10) {
        this.f23812a = i10;
        this.f23813b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f23812a) {
            case 0:
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.f23813b;
                if (i10 == 6) {
                    n5Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f23813b).f20493b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 2:
                zq zqVar = (zq) this.f23813b;
                if (i10 == 6) {
                    zqVar.run();
                    return true;
                }
                return false;
            case 3:
                ce0 ce0Var = (ce0) this.f23813b;
                if (i10 == 6) {
                    ce0Var.k(false);
                    return true;
                }
                ce0Var.getClass();
                return false;
            case 4:
                q4 q4Var = (q4) this.f23813b;
                if (i10 == 6) {
                    q4Var.f24866b.f24599a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                ci.h2 h2Var = ((ln0) this.f23813b).e;
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
                vq0 vq0Var = (vq0) this.f23813b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(vq0Var.f29772y0.f23850r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f23813b;
                if (i10 == 5) {
                    alertDialog$Builder.f18655a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f23813b;
                if (i10 == 6) {
                    c2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                e21 e21Var = (e21) this.f23813b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(e21Var.f23856b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                d71 d71Var = (d71) this.f23813b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(d71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
