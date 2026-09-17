package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f23442a;
    public final Object f23443b;

    public e1(Object obj, int i10) {
        this.f23442a = i10;
        this.f23443b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f23442a) {
            case 0:
                org.telegram.ui.ActionBar.o5 o5Var = (org.telegram.ui.ActionBar.o5) this.f23443b;
                if (i10 == 6) {
                    o5Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f23443b).f20239b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    return true;
                }
                return false;
            case 2:
                xq xqVar = (xq) this.f23443b;
                if (i10 == 6) {
                    xqVar.run();
                    return true;
                }
                return false;
            case 3:
                sd0 sd0Var = (sd0) this.f23443b;
                if (i10 == 6) {
                    sd0Var.k(false);
                    return true;
                }
                sd0Var.getClass();
                return false;
            case 4:
                o4 o4Var = (o4) this.f23443b;
                if (i10 == 6) {
                    o4Var.f28823b.f28405a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                ci.h2 h2Var = ((xm0) this.f23443b).e;
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
                iq0 iq0Var = (iq0) this.f23443b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(iq0Var.f25016y0.f22543r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f23443b;
                if (i10 == 5) {
                    alertDialog$Builder.f18446a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f23443b;
                if (i10 == 6) {
                    c2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                q11 q11Var = (q11) this.f23443b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(q11Var.f27191b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                o61 o61Var = (o61) this.f23443b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(o61Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
