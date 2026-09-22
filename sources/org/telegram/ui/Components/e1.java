package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e1 implements TextView.OnEditorActionListener {
    public final int f23822a;
    public final Object f23823b;

    public e1(Object obj, int i10) {
        this.f23822a = i10;
        this.f23823b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f23822a) {
            case 0:
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) this.f23823b;
                if (i10 == 6) {
                    n5Var.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.i3 i3Var = ((org.telegram.ui.Cells.k3) this.f23823b).f20542b;
                if (i10 == 5) {
                    i3Var.requestFocus();
                    i3Var.setSelection(i3Var.length());
                    return true;
                }
                return false;
            case 2:
                xq xqVar = (xq) this.f23823b;
                if (i10 == 6) {
                    xqVar.run();
                    return true;
                }
                return false;
            case 3:
                de0 de0Var = (de0) this.f23823b;
                if (i10 == 6) {
                    de0Var.k(false);
                    return true;
                }
                de0Var.getClass();
                return false;
            case 4:
                p4 p4Var = (p4) this.f23823b;
                if (i10 == 6) {
                    p4Var.f24856b.f24594a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                ci.h2 h2Var = ((ln0) this.f23823b).e;
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
                wq0 wq0Var = (wq0) this.f23823b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(wq0Var.f30129y0.f22811r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f23823b;
                if (i10 == 5) {
                    alertDialog$Builder.f18669a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f23823b;
                if (i10 == 6) {
                    b2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                f21 f21Var = (f21) this.f23823b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(f21Var.f24087b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                d71 d71Var = (d71) this.f23823b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(d71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
