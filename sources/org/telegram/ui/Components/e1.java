package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f25925a;
    public final Object f25926b;

    public e1(Object obj, int i10) {
        this.f25925a = i10;
        this.f25926b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25925a) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f25926b;
                if (i10 == 6) {
                    l5Var.run();
                    return true;
                }
                return false;
            case 1:
                gl glVar = (gl) this.f25926b;
                if (i10 == 6) {
                    ci.d dVar = glVar.f26797l0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    glVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f25926b).f22325b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 3:
                rr rrVar = (rr) this.f25926b;
                if (i10 == 6) {
                    rrVar.run();
                    return true;
                }
                return false;
            case 4:
                te0 te0Var = (te0) this.f25926b;
                if (i10 == 6) {
                    te0Var.m(false);
                    return true;
                }
                te0Var.getClass();
                return false;
            case 5:
                s4 s4Var = (s4) this.f25926b;
                if (i10 == 6) {
                    s4Var.f24634b.f33655a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ci.g2 g2Var = ((do0) this.f25926b).f25855e;
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
                nr0 nr0Var = (nr0) this.f25926b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(nr0Var.f29265y0.f31038r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25926b;
                if (i10 == 5) {
                    alertDialog$Builder.f20404a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f25926b;
                if (i10 == 6) {
                    a2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                w21 w21Var = (w21) this.f25926b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(w21Var.f32614b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                t71 t71Var = (t71) this.f25926b;
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
