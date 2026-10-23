package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d1 implements TextView.OnEditorActionListener {
    public final int f25478a;
    public final Object f25479b;

    public d1(Object obj, int i10) {
        this.f25478a = i10;
        this.f25479b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25478a) {
            case 0:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) this.f25479b;
                if (i10 == 6) {
                    iVar.run();
                    return true;
                }
                return false;
            case 1:
                al alVar = (al) this.f25479b;
                if (i10 == 6) {
                    ei.d dVar = alVar.f24753o0;
                    if (dVar.f8862c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    alVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.f3 f3Var = ((org.telegram.ui.Cells.h3) this.f25479b).d;
                if (i10 == 5) {
                    f3Var.requestFocus();
                    f3Var.setSelection(f3Var.length());
                    return true;
                }
                return false;
            case 3:
                kr krVar = (kr) this.f25479b;
                if (i10 == 6) {
                    krVar.run();
                    return true;
                }
                return false;
            case 4:
                pe0 pe0Var = (pe0) this.f25479b;
                if (i10 == 6) {
                    pe0Var.n(false);
                    return true;
                }
                pe0Var.getClass();
                return false;
            case 5:
                q4 q4Var = (q4) this.f25479b;
                if (i10 == 6) {
                    q4Var.f31502b.f31187a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ei.e2 e2Var = ((yn0) this.f25479b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        e2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(e2Var);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                ir0 ir0Var = (ir0) this.f25479b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(ir0Var.f27442z0.f27836r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25479b;
                if (i10 == 5) {
                    alertDialog$Builder.f20678a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f25479b;
                if (i10 == 6) {
                    c2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                q21 q21Var = (q21) this.f25479b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(q21Var.f29762b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                r71 r71Var = (r71) this.f25479b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(r71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
