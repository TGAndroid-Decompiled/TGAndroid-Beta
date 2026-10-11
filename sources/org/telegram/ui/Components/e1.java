package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f25789a;
    public final Object f25790b;

    public e1(Object obj, int i10) {
        this.f25789a = i10;
        this.f25790b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25789a) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f25790b;
                if (i10 == 6) {
                    l5Var.run();
                    return true;
                }
                return false;
            case 1:
                gl glVar = (gl) this.f25790b;
                if (i10 == 6) {
                    ci.d dVar = glVar.f26745l0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    glVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f25790b).f22289b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 3:
                rr rrVar = (rr) this.f25790b;
                if (i10 == 6) {
                    rrVar.run();
                    return true;
                }
                return false;
            case 4:
                ue0 ue0Var = (ue0) this.f25790b;
                if (i10 == 6) {
                    ue0Var.m(false);
                    return true;
                }
                ue0Var.getClass();
                return false;
            case 5:
                s4 s4Var = (s4) this.f25790b;
                if (i10 == 6) {
                    s4Var.f24994b.f24545a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ci.g2 g2Var = ((eo0) this.f25790b).f26111e;
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
                or0 or0Var = (or0) this.f25790b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(or0Var.f29508y0.f30964r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25790b;
                if (i10 == 5) {
                    alertDialog$Builder.f20368a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f25790b;
                if (i10 == 6) {
                    a2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                x21 x21Var = (x21) this.f25790b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(x21Var.f32810b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                u71 u71Var = (u71) this.f25790b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(u71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
