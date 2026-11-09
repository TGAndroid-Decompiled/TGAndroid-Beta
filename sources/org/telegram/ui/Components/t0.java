package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t0 implements TextView.OnEditorActionListener {
    public final int f38205a;
    public final Object f38206b;

    public t0(Object obj, int i7) {
        this.f38205a = i7;
        this.f38206b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f38205a) {
            case 0:
                org.telegram.ui.m6 m6Var = (org.telegram.ui.m6) this.f38206b;
                if (i7 == 6) {
                    m6Var.run();
                    return true;
                }
                return false;
            case 1:
                ik ikVar = (ik) this.f38206b;
                if (i7 == 6) {
                    fi.d dVar = ikVar.f34782o0;
                    if (dVar.f11752c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    ikVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.f38206b).d;
                if (i7 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    return true;
                }
                return false;
            case 3:
                iq iqVar = (iq) this.f38206b;
                if (i7 == 6) {
                    iqVar.run();
                    return true;
                }
                return false;
            case 4:
                fc0 fc0Var = (fc0) this.f38206b;
                if (i7 == 6) {
                    fc0Var.n(false);
                    return true;
                }
                fc0Var.getClass();
                return false;
            case 5:
                k4 k4Var = (k4) this.f38206b;
                if (i7 == 6) {
                    k4Var.f32704i1.f32270a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ah.i iVar = ((fl0) this.f38206b).d;
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
                no0 no0Var = (no0) this.f38206b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(no0Var.f36452q2.f37857r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f38206b;
                if (i7 == 5) {
                    alertDialog$Builder.f27296a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f38206b;
                if (i7 == 6) {
                    u1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                wz0 wz0Var = (wz0) this.f38206b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(wz0Var.f40263b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                b51 b51Var = (b51) this.f38206b;
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
