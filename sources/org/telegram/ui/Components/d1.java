package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d1 implements TextView.OnEditorActionListener {
    public final int f26091a;
    public final Object f26092b;

    public d1(Object obj, int i10) {
        this.f26091a = i10;
        this.f26092b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f26091a) {
            case 0:
                org.telegram.ui.ih ihVar = (org.telegram.ui.ih) this.f26092b;
                if (i10 == 6) {
                    ihVar.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f26092b).f22957b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    return true;
                }
                return false;
            case 2:
                xq xqVar = (xq) this.f26092b;
                if (i10 == 6) {
                    xqVar.run();
                    return true;
                }
                return false;
            case 3:
                xd0 xd0Var = (xd0) this.f26092b;
                if (i10 == 6) {
                    xd0Var.k(false);
                    return true;
                }
                xd0Var.getClass();
                return false;
            case 4:
                l4 l4Var = (l4) this.f26092b;
                if (i10 == 6) {
                    l4Var.f26008b.f25662a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                lg.f fVar = ((en0) this.f26092b).f26635e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        fVar.hideActionMode();
                        AndroidUtilities.hideKeyboard(fVar);
                        return false;
                    }
                    return false;
                }
                return false;
            case 6:
                lq0 lq0Var = (lq0) this.f26092b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(lq0Var.f28852v0.f26132r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f26092b;
                if (i10 == 5) {
                    alertDialog$Builder.f21168a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f26092b;
                if (i10 == 6) {
                    d2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                s11 s11Var = (s11) this.f26092b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(s11Var.f30959b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                q61 q61Var = (q61) this.f26092b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(q61Var.G);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
