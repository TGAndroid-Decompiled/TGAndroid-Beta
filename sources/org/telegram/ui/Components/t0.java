package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t0 implements TextView.OnEditorActionListener {
    public final int f30390a;
    public final Object f30391b;

    public t0(Object obj, int i10) {
        this.f30390a = i10;
        this.f30391b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f30390a) {
            case 0:
                org.telegram.ui.fp fpVar = (org.telegram.ui.fp) this.f30391b;
                if (i10 == 6) {
                    fpVar.run();
                    return true;
                }
                return false;
            case 1:
                kk kkVar = (kk) this.f30391b;
                if (i10 == 6) {
                    vh.d dVar = kkVar.f27795o0;
                    if (dVar.f51052c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    kkVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.k3 k3Var = ((org.telegram.ui.Cells.m3) this.f30391b).d;
                if (i10 == 5) {
                    k3Var.requestFocus();
                    k3Var.setSelection(k3Var.length());
                    return true;
                }
                return false;
            case 3:
                sq sqVar = (sq) this.f30391b;
                if (i10 == 6) {
                    sqVar.run();
                    return true;
                }
                return false;
            case 4:
                zc0 zc0Var = (zc0) this.f30391b;
                if (i10 == 6) {
                    zc0Var.n(false);
                    return true;
                }
                zc0Var.getClass();
                return false;
            case 5:
                h4 h4Var = (h4) this.f30391b;
                if (i10 == 6) {
                    h4Var.f26101i1.f25827a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                org.telegram.ui.ActionBar.n0 n0Var = ((hm0) this.f30391b).d;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        n0Var.m();
                        org.telegram.messenger.i0.v1(n0Var);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                op0 op0Var = (op0) this.f30391b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(op0Var.f29136q2.f26588r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f30391b;
                if (i10 == 5) {
                    alertDialog$Builder.f20134a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.f30391b;
                if (i10 == 6) {
                    x1Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                z01 z01Var = (z01) this.f30391b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(z01Var.f32863b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                d61 d61Var = (d61) this.f30391b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(d61Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
