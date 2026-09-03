package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d1 implements TextView.OnEditorActionListener {
    public final int f24078a;
    public final Object f24079b;

    public d1(Object obj, int i10) {
        this.f24078a = i10;
        this.f24079b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f24078a) {
            case 0:
                org.telegram.ui.kh khVar = (org.telegram.ui.kh) this.f24079b;
                if (i10 == 6) {
                    khVar.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.f3 f3Var = ((org.telegram.ui.Cells.h3) this.f24079b).f21132b;
                if (i10 == 5) {
                    f3Var.requestFocus();
                    f3Var.setSelection(f3Var.length());
                    return true;
                }
                return false;
            case 2:
                uq uqVar = (uq) this.f24079b;
                if (i10 == 6) {
                    uqVar.run();
                    return true;
                }
                return false;
            case 3:
                wd0 wd0Var = (wd0) this.f24079b;
                if (i10 == 6) {
                    wd0Var.k(false);
                    return true;
                }
                wd0Var.getClass();
                return false;
            case 4:
                l4 l4Var = (l4) this.f24079b;
                if (i10 == 6) {
                    l4Var.f23720b.f23455a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                kg.f fVar = ((dn0) this.f24079b).e;
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
                lq0 lq0Var = (lq0) this.f24079b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(lq0Var.f26858v0.f24117r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f24079b;
                if (i10 == 5) {
                    alertDialog$Builder.f19478a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f24079b;
                if (i10 == 6) {
                    d2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                s11 s11Var = (s11) this.f24079b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(s11Var.f28640b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                p61 p61Var = (p61) this.f24079b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(p61Var.G);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
