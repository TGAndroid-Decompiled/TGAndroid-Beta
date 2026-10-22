package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f25694a;
    public final Object f25695b;

    public e1(Object obj, int i10) {
        this.f25694a = i10;
        this.f25695b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25694a) {
            case 0:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) this.f25695b;
                if (i10 == 6) {
                    iVar.run();
                    return true;
                }
                return false;
            case 1:
                al alVar = (al) this.f25695b;
                if (i10 == 6) {
                    ei.d dVar = alVar.f24650l0;
                    if (dVar.W) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    alVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f25695b).f22405b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    return true;
                }
                return false;
            case 3:
                lr lrVar = (lr) this.f25695b;
                if (i10 == 6) {
                    lrVar.run();
                    return true;
                }
                return false;
            case 4:
                me0 me0Var = (me0) this.f25695b;
                if (i10 == 6) {
                    me0Var.n(false);
                    return true;
                }
                me0Var.getClass();
                return false;
            case 5:
                r4 r4Var = (r4) this.f25695b;
                if (i10 == 6) {
                    r4Var.f30326b.f29981a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ei.e2 e2Var = ((vn0) this.f25695b).e;
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
                fr0 fr0Var = (fr0) this.f25695b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(fr0Var.f26400z0.f27729r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25695b;
                if (i10 == 5) {
                    alertDialog$Builder.f20608a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f25695b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                n21 n21Var = (n21) this.f25695b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(n21Var.f28670b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                k71 k71Var = (k71) this.f25695b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(k71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
