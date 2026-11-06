package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t0 implements TextView.OnEditorActionListener {
    public final int f38168a;
    public final Object f38169b;

    public t0(Object obj, int i7) {
        this.f38168a = i7;
        this.f38169b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f38168a) {
            case 0:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.f38169b;
                if (i7 == 6) {
                    m6Var.run();
                    return true;
                }
                return false;
            case 1:
                ik ikVar = (ik) this.f38169b;
                if (i7 == 6) {
                    fi.d dVar = ikVar.f34670o0;
                    if (dVar.f11752c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    ikVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.f38169b).d;
                if (i7 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    return true;
                }
                return false;
            case 3:
                iq iqVar = (iq) this.f38169b;
                if (i7 == 6) {
                    iqVar.run();
                    return true;
                }
                return false;
            case 4:
                ec0 ec0Var = (ec0) this.f38169b;
                if (i7 == 6) {
                    ec0Var.n(false);
                    return true;
                }
                ec0Var.getClass();
                return false;
            case 5:
                k4 k4Var = (k4) this.f38169b;
                if (i7 == 6) {
                    k4Var.f32159i1.f31841a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ah.i iVar = ((el0) this.f38169b).d;
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
                mo0 mo0Var = (mo0) this.f38169b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(mo0Var.f36014q2.f37447r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f38169b;
                if (i7 == 5) {
                    alertDialog$Builder.f27292a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f38169b;
                if (i7 == 6) {
                    u1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                uz0 uz0Var = (uz0) this.f38169b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(uz0Var.f38766b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                z41 z41Var = (z41) this.f38169b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(z41Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
