package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f1 implements TextView.OnEditorActionListener {
    public final int f28260a;
    public final Object f28261b;

    public f1(Object obj, int i10) {
        this.f28260a = i10;
        this.f28261b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f28260a) {
            case 0:
                org.telegram.ui.gg ggVar = (org.telegram.ui.gg) this.f28261b;
                if (i10 == 6) {
                    ggVar.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.e3 e3Var = ((org.telegram.ui.Cells.g3) this.f28261b).f24387b;
                if (i10 == 5) {
                    e3Var.requestFocus();
                    e3Var.setSelection(e3Var.length());
                    return true;
                }
                return false;
            case 2:
                rq rqVar = (rq) this.f28261b;
                if (i10 == 6) {
                    rqVar.run();
                    return true;
                }
                return false;
            case 3:
                nd0 nd0Var = (nd0) this.f28261b;
                if (i10 == 6) {
                    nd0Var.k(false);
                    return true;
                }
                nd0Var.getClass();
                return false;
            case 4:
                o4 o4Var = (o4) this.f28261b;
                if (i10 == 6) {
                    o4Var.f32687b.f32336a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                ig.f fVar = ((um0) this.f28261b).f33273e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        fVar.hideActionMode();
                        AndroidUtilities.hideKeyboard(fVar);
                        return false;
                    }
                    return false;
                }
                return false;
            case 6:
                dq0 dq0Var = (dq0) this.f28261b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(dq0Var.f27853u0.f34546r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f28261b;
                if (i10 == 5) {
                    alertDialog$Builder.f22714a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f28261b;
                if (i10 == 6) {
                    c2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                h11 h11Var = (h11) this.f28261b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(h11Var.f29033b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                e61 e61Var = (e61) this.f28261b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(e61Var.F);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
