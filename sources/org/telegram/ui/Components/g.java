package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g implements TextView.OnEditorActionListener {
    public final int f35246a;
    public final Object f35247b;

    public g(Object obj, int i7) {
        this.f35246a = i7;
        this.f35247b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f35246a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f35247b;
                if (i7 == 3) {
                    org.telegram.messenger.g0.v1(editTextBoldCursor);
                    return true;
                }
                return false;
            case 1:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) this.f35247b;
                if (i7 == 6) {
                    iVar.run();
                    return true;
                }
                return false;
            case 2:
                xk xkVar = (xk) this.f35247b;
                if (i7 == 6) {
                    hi.d dVar = xkVar.f42121p0;
                    if (dVar.f14342e0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    xkVar.getClass();
                }
                return false;
            case 3:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.f35247b).d;
                if (i7 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    return true;
                }
                return false;
            case 4:
                wq wqVar = (wq) this.f35247b;
                if (i7 == 6) {
                    wqVar.run();
                    return true;
                }
                return false;
            case 5:
                pc0 pc0Var = (pc0) this.f35247b;
                if (i7 == 6) {
                    pc0Var.n(false);
                    return true;
                }
                pc0Var.getClass();
                return false;
            case 6:
                q4 q4Var = (q4) this.f35247b;
                if (i7 == 6) {
                    q4Var.f38120m1.f37801a.callOnClick();
                    return true;
                }
                return false;
            case 7:
                ah.i iVar2 = ((rl0) this.f35247b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        iVar2.m();
                        org.telegram.messenger.g0.v1(iVar2);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                yo0 yo0Var = (yo0) this.f35247b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(yo0Var.f42580u2.f33845r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 9:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f35247b;
                if (i7 == 5) {
                    alertDialog$Builder.f28746a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f35247b;
                if (i7 == 6) {
                    u1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 11:
                e01 e01Var = (e01) this.f35247b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(e01Var.f34556b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                n51 n51Var = (n51) this.f35247b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(n51Var.K);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
