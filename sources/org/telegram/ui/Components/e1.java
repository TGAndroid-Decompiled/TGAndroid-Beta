package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f23804a;
    public final Object f23805b;

    public e1(Object obj, int i10) {
        this.f23804a = i10;
        this.f23805b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f23804a) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f23805b;
                if (i10 == 6) {
                    l5Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.h3 h3Var = ((org.telegram.ui.Cells.j3) this.f23805b).f20491b;
                if (i10 == 5) {
                    h3Var.requestFocus();
                    h3Var.setSelection(h3Var.length());
                    return true;
                }
                return false;
            case 2:
                zq zqVar = (zq) this.f23805b;
                if (i10 == 6) {
                    zqVar.run();
                    return true;
                }
                return false;
            case 3:
                de0 de0Var = (de0) this.f23805b;
                if (i10 == 6) {
                    de0Var.k(false);
                    return true;
                }
                de0Var.getClass();
                return false;
            case 4:
                q4 q4Var = (q4) this.f23805b;
                if (i10 == 6) {
                    q4Var.f24528b.f24295a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                ci.h2 h2Var = ((kn0) this.f23805b).e;
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
                vq0 vq0Var = (vq0) this.f23805b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(vq0Var.f29747y0.f23475r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f23805b;
                if (i10 == 5) {
                    alertDialog$Builder.f18661a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f23805b;
                if (i10 == 6) {
                    a2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                d21 d21Var = (d21) this.f23805b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(d21Var.f23481b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                b71 b71Var = (b71) this.f23805b;
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
