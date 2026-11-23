package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g implements TextView.OnEditorActionListener {
    public final int f35241a;
    public final Object f35242b;

    public g(Object obj, int i7) {
        this.f35241a = i7;
        this.f35242b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f35241a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f35242b;
                if (i7 == 3) {
                    org.telegram.messenger.g0.v1(editTextBoldCursor);
                    return true;
                }
                return false;
            case 1:
                oi.h hVar = (oi.h) this.f35242b;
                if (i7 == 6) {
                    hVar.run();
                    return true;
                }
                return false;
            case 2:
                xk xkVar = (xk) this.f35242b;
                if (i7 == 6) {
                    hi.e eVar = xkVar.f42074p0;
                    if (eVar.f14340e0) {
                        eVar.performClick();
                        return true;
                    }
                } else {
                    xkVar.getClass();
                }
                return false;
            case 3:
                org.telegram.ui.Cells.j3 j3Var = ((org.telegram.ui.Cells.l3) this.f35242b).d;
                if (i7 == 5) {
                    j3Var.requestFocus();
                    j3Var.setSelection(j3Var.length());
                    return true;
                }
                return false;
            case 4:
                vq vqVar = (vq) this.f35242b;
                if (i7 == 6) {
                    vqVar.run();
                    return true;
                }
                return false;
            case 5:
                oc0 oc0Var = (oc0) this.f35242b;
                if (i7 == 6) {
                    oc0Var.n(false);
                    return true;
                }
                oc0Var.getClass();
                return false;
            case 6:
                q4 q4Var = (q4) this.f35242b;
                if (i7 == 6) {
                    q4Var.f38901m1.f38503a.callOnClick();
                    return true;
                }
                return false;
            case 7:
                ah.i iVar = ((tl0) this.f35242b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        iVar.m();
                        org.telegram.messenger.g0.v1(iVar);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                zo0 zo0Var = (zo0) this.f35242b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(zo0Var.f42997u2.f33883r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 9:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f35242b;
                if (i7 == 5) {
                    alertDialog$Builder.f28835a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f35242b;
                if (i7 == 6) {
                    t1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 11:
                f01 f01Var = (f01) this.f35242b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(f01Var.f34938b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                p51 p51Var = (p51) this.f35242b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(p51Var.K);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
