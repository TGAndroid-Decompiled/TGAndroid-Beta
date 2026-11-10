package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s0 implements TextView.OnEditorActionListener {
    public final int f37789a;
    public final Object f37790b;

    public s0(Object obj, int i7) {
        this.f37789a = i7;
        this.f37790b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f37789a) {
            case 0:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.f37790b;
                if (i7 == 6) {
                    m6Var.run();
                    return true;
                }
                return false;
            case 1:
                hk hkVar = (hk) this.f37790b;
                if (i7 == 6) {
                    fi.d dVar = hkVar.f34382o0;
                    if (dVar.f11756c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    hkVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.f37790b).d;
                if (i7 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    return true;
                }
                return false;
            case 3:
                hq hqVar = (hq) this.f37790b;
                if (i7 == 6) {
                    hqVar.run();
                    return true;
                }
                return false;
            case 4:
                ec0 ec0Var = (ec0) this.f37790b;
                if (i7 == 6) {
                    ec0Var.n(false);
                    return true;
                }
                ec0Var.getClass();
                return false;
            case 5:
                j4 j4Var = (j4) this.f37790b;
                if (i7 == 6) {
                    j4Var.l1.f31873a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ah.i iVar = ((el0) this.f37790b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        iVar.m();
                        org.telegram.messenger.g0.v1(iVar);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                mo0 mo0Var = (mo0) this.f37790b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(mo0Var.f36052t2.f37446r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f37790b;
                if (i7 == 5) {
                    alertDialog$Builder.f27300a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f37790b;
                if (i7 == 6) {
                    u1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                vz0 vz0Var = (vz0) this.f37790b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(vz0Var.f39847b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                b51 b51Var = (b51) this.f37790b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(b51Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
