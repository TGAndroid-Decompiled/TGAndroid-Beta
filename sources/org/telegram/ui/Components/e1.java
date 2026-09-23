package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f23524a;
    public final Object f23525b;

    public e1(Object obj, int i10) {
        this.f23524a = i10;
        this.f23525b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f23524a) {
            case 0:
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.f23525b;
                if (i10 == 6) {
                    m5Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f23525b).f20177b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    return true;
                }
                return false;
            case 2:
                yq yqVar = (yq) this.f23525b;
                if (i10 == 6) {
                    yqVar.run();
                    return true;
                }
                return false;
            case 3:
                sd0 sd0Var = (sd0) this.f23525b;
                if (i10 == 6) {
                    sd0Var.k(false);
                    return true;
                }
                sd0Var.getClass();
                return false;
            case 4:
                q4 q4Var = (q4) this.f23525b;
                if (i10 == 6) {
                    q4Var.f28769b.f28520a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                ci.h2 h2Var = ((xm0) this.f23525b).e;
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
                hq0 hq0Var = (hq0) this.f23525b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(hq0Var.f24805y0.f22890r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f23525b;
                if (i10 == 5) {
                    alertDialog$Builder.f18409a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f23525b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                o11 o11Var = (o11) this.f23525b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(o11Var.f26571b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                m61 m61Var = (m61) this.f23525b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(m61Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
