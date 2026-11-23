package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class h implements TextView.OnEditorActionListener {
    public final int f35731a;
    public final Object f35732b;

    public h(Object obj, int i7) {
        this.f35731a = i7;
        this.f35732b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f35731a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f35732b;
                if (i7 == 3) {
                    org.telegram.messenger.g0.v1(editTextBoldCursor);
                    return true;
                }
                return false;
            case 1:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) this.f35732b;
                if (i7 == 6) {
                    iVar.run();
                    return true;
                }
                return false;
            case 2:
                zk zkVar = (zk) this.f35732b;
                if (i7 == 6) {
                    hi.e eVar = zkVar.f42917p0;
                    if (eVar.f14567e0) {
                        eVar.performClick();
                        return true;
                    }
                } else {
                    zkVar.getClass();
                }
                return false;
            case 3:
                org.telegram.ui.Cells.j3 j3Var = ((org.telegram.ui.Cells.l3) this.f35732b).d;
                if (i7 == 5) {
                    j3Var.requestFocus();
                    j3Var.setSelection(j3Var.length());
                    return true;
                }
                return false;
            case 4:
                yq yqVar = (yq) this.f35732b;
                if (i7 == 6) {
                    yqVar.run();
                    return true;
                }
                return false;
            case 5:
                qc0 qc0Var = (qc0) this.f35732b;
                if (i7 == 6) {
                    qc0Var.n(false);
                    return true;
                }
                qc0Var.getClass();
                return false;
            case 6:
                r4 r4Var = (r4) this.f35732b;
                if (i7 == 6) {
                    r4Var.f38939m1.f38609a.callOnClick();
                    return true;
                }
                return false;
            case 7:
                ah.i iVar2 = ((tl0) this.f35732b).d;
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
                ap0 ap0Var = (ap0) this.f35732b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(ap0Var.f33589u2.f34642r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 9:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f35732b;
                if (i7 == 5) {
                    alertDialog$Builder.f28777a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f35732b;
                if (i7 == 6) {
                    t1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 11:
                g01 g01Var = (g01) this.f35732b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(g01Var.f35358b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                q51 q51Var = (q51) this.f35732b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(q51Var.K);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
