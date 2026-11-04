package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s0 implements TextView.OnEditorActionListener {
    public final int f37871a;
    public final Object f37872b;

    public s0(Object obj, int i3) {
        this.f37871a = i3;
        this.f37872b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.f37871a) {
            case 0:
                o4.b1 b1Var = (o4.b1) this.f37872b;
                if (i3 == 6) {
                    b1Var.run();
                    return true;
                }
                return false;
            case 1:
                hk hkVar = (hk) this.f37872b;
                if (i3 == 6) {
                    gi.d dVar = hkVar.f34419p0;
                    if (dVar.f12517d0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    hkVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.f37872b).d;
                if (i3 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    return true;
                }
                return false;
            case 3:
                iq iqVar = (iq) this.f37872b;
                if (i3 == 6) {
                    iqVar.run();
                    return true;
                }
                return false;
            case 4:
                zb0 zb0Var = (zb0) this.f37872b;
                if (i3 == 6) {
                    zb0Var.n(false);
                    return true;
                }
                zb0Var.getClass();
                return false;
            case 5:
                i4 i4Var = (i4) this.f37872b;
                if (i3 == 6) {
                    i4Var.f33813j1.f33410a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                bh.g gVar = ((il0) this.f37872b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        gVar.m();
                        org.telegram.messenger.g0.v1(gVar);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                oo0 oo0Var = (oo0) this.f37872b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(oo0Var.f36898r2.f36302r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f37872b;
                if (i3 == 5) {
                    alertDialog$Builder.f27343a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f37872b;
                if (i3 == 6) {
                    s1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                uz0 uz0Var = (uz0) this.f37872b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(uz0Var.f38914b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                u41 u41Var = (u41) this.f37872b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(u41Var.K);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
