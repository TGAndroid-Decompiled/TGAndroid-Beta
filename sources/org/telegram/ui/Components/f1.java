package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f1 implements TextView.OnEditorActionListener {
    public final int f25863a;
    public final Object f25864b;

    public f1(Object obj, int i10) {
        this.f25863a = i10;
        this.f25864b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25863a) {
            case 0:
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.f25864b;
                if (i10 == 6) {
                    n5Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f25864b).f22074b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    return true;
                }
                return false;
            case 2:
                wq wqVar = (wq) this.f25864b;
                if (i10 == 6) {
                    wqVar.run();
                    return true;
                }
                return false;
            case 3:
                sd0 sd0Var = (sd0) this.f25864b;
                if (i10 == 6) {
                    sd0Var.k(false);
                    return true;
                }
                sd0Var.getClass();
                return false;
            case 4:
                q4 q4Var = (q4) this.f25864b;
                if (i10 == 6) {
                    q4Var.f30920b.f30619a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                di.h2 h2Var = ((wm0) this.f25864b).f32295e;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        h2Var.hideActionMode();
                        AndroidUtilities.hideKeyboard(h2Var);
                        return false;
                    }
                    return false;
                }
                return false;
            case 6:
                hq0 hq0Var = (hq0) this.f25864b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(hq0Var.f26820y0.f24522r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25864b;
                if (i10 == 5) {
                    alertDialog$Builder.f20198a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f25864b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                o11 o11Var = (o11) this.f25864b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(o11Var.f28923b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                n61 n61Var = (n61) this.f25864b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(n61Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
