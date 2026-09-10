package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g1 implements TextView.OnEditorActionListener {
    public final int f23193a;
    public final Object f23194b;

    public g1(Object obj, int i10) {
        this.f23193a = i10;
        this.f23194b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f23193a) {
            case 0:
                org.telegram.ui.da daVar = (org.telegram.ui.da) this.f23194b;
                if (i10 == 6) {
                    daVar.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f23194b).f19293b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    return true;
                }
                return false;
            case 2:
                dr drVar = (dr) this.f23194b;
                if (i10 == 6) {
                    drVar.run();
                    return true;
                }
                return false;
            case 3:
                be0 be0Var = (be0) this.f23194b;
                if (i10 == 6) {
                    be0Var.k(false);
                    return true;
                }
                be0Var.getClass();
                return false;
            case 4:
                p4 p4Var = (p4) this.f23194b;
                if (i10 == 6) {
                    p4Var.f22728b.f22446a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                bi.t2 t2Var = ((gn0) this.f23194b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        t2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(t2Var);
                        return false;
                    }
                    return false;
                }
                return false;
            case 6:
                sq0 sq0Var = (sq0) this.f23194b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(sq0Var.f27198y0.f24572r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f23194b;
                if (i10 == 5) {
                    alertDialog$Builder.f17528a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f23194b;
                if (i10 == 6) {
                    d2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                c21 c21Var = (c21) this.f23194b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(c21Var.f21978b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                a71 a71Var = (a71) this.f23194b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(a71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
