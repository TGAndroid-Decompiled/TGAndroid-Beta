package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class q0 implements TextView.OnEditorActionListener {
    public final int f38456a;
    public final Object f38457b;

    public q0(Object obj, int i7) {
        this.f38456a = i7;
        this.f38457b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f38456a) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.f38457b;
                if (i7 == 6) {
                    l5Var.run();
                    return true;
                }
                return false;
            case 1:
                qk qkVar = (qk) this.f38457b;
                if (i7 == 6) {
                    hi.d dVar = qkVar.f38679p0;
                    if (dVar.f14056d0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    qkVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.f38457b).d;
                if (i7 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    return true;
                }
                return false;
            case 3:
                pq pqVar = (pq) this.f38457b;
                if (i7 == 6) {
                    pqVar.run();
                    return true;
                }
                return false;
            case 4:
                fc0 fc0Var = (fc0) this.f38457b;
                if (i7 == 6) {
                    fc0Var.n(false);
                    return true;
                }
                fc0Var.getClass();
                return false;
            case 5:
                i4 i4Var = (i4) this.f38457b;
                if (i7 == 6) {
                    i4Var.f35000m1.f34623a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ah.i iVar = ((jl0) this.f38457b).d;
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
                po0 po0Var = (po0) this.f38457b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(po0Var.f38367u2.f40202r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f38457b;
                if (i7 == 5) {
                    alertDialog$Builder.f28392a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f38457b;
                if (i7 == 6) {
                    t1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                xz0 xz0Var = (xz0) this.f38457b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(xz0Var.f41808b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                d51 d51Var = (d51) this.f38457b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(d51Var.K);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
