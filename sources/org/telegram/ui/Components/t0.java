package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t0 implements TextView.OnEditorActionListener {
    public final int f38159a;
    public final Object f38160b;

    public t0(Object obj, int i7) {
        this.f38159a = i7;
        this.f38160b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f38159a) {
            case 0:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.f38160b;
                if (i7 == 6) {
                    m6Var.run();
                    return true;
                }
                return false;
            case 1:
                ik ikVar = (ik) this.f38160b;
                if (i7 == 6) {
                    fi.d dVar = ikVar.f34700o0;
                    if (dVar.f11752c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    ikVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.f38160b).d;
                if (i7 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    return true;
                }
                return false;
            case 3:
                iq iqVar = (iq) this.f38160b;
                if (i7 == 6) {
                    iqVar.run();
                    return true;
                }
                return false;
            case 4:
                ec0 ec0Var = (ec0) this.f38160b;
                if (i7 == 6) {
                    ec0Var.n(false);
                    return true;
                }
                ec0Var.getClass();
                return false;
            case 5:
                k4 k4Var = (k4) this.f38160b;
                if (i7 == 6) {
                    k4Var.f32193i1.f31837a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ah.i iVar = ((el0) this.f38160b).d;
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
                mo0 mo0Var = (mo0) this.f38160b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(mo0Var.f36030q2.f37441r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f38160b;
                if (i7 == 5) {
                    alertDialog$Builder.f27293a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f38160b;
                if (i7 == 6) {
                    u1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                vz0 vz0Var = (vz0) this.f38160b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(vz0Var.f39809b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                a51 a51Var = (a51) this.f38160b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(a51Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
