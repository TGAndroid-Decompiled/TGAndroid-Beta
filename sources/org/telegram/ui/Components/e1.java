package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f25781a;
    public final Object f25782b;

    public e1(Object obj, int i10) {
        this.f25781a = i10;
        this.f25782b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25781a) {
            case 0:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) this.f25782b;
                if (i10 == 6) {
                    iVar.run();
                    return true;
                }
                return false;
            case 1:
                al alVar = (al) this.f25782b;
                if (i10 == 6) {
                    ei.d dVar = alVar.f24636l0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    alVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f25782b).f22405b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    return true;
                }
                return false;
            case 3:
                lr lrVar = (lr) this.f25782b;
                if (i10 == 6) {
                    lrVar.run();
                    return true;
                }
                return false;
            case 4:
                le0 le0Var = (le0) this.f25782b;
                if (i10 == 6) {
                    le0Var.m(false);
                    return true;
                }
                le0Var.getClass();
                return false;
            case 5:
                r4 r4Var = (r4) this.f25782b;
                if (i10 == 6) {
                    r4Var.f30003b.f29716a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ei.e2 e2Var = ((un0) this.f25782b).e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        e2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(e2Var);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                dr0 dr0Var = (dr0) this.f25782b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(dr0Var.f25691y0.f27719r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25782b;
                if (i10 == 5) {
                    alertDialog$Builder.f20608a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f25782b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                l21 l21Var = (l21) this.f25782b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(l21Var.f28062b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                i71 i71Var = (i71) this.f25782b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(i71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
