package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d1 implements TextView.OnEditorActionListener {
    public final int f24095a;
    public final Object f24096b;

    public d1(Object obj, int i10) {
        this.f24095a = i10;
        this.f24096b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f24095a) {
            case 0:
                org.telegram.ui.ih ihVar = (org.telegram.ui.ih) this.f24096b;
                if (i10 == 6) {
                    ihVar.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f24096b).f21199b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    return true;
                }
                return false;
            case 2:
                vq vqVar = (vq) this.f24096b;
                if (i10 == 6) {
                    vqVar.run();
                    return true;
                }
                return false;
            case 3:
                vd0 vd0Var = (vd0) this.f24096b;
                if (i10 == 6) {
                    vd0Var.k(false);
                    return true;
                }
                vd0Var.getClass();
                return false;
            case 4:
                l4 l4Var = (l4) this.f24096b;
                if (i10 == 6) {
                    l4Var.f24023b.f23722a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                kg.f fVar = ((en0) this.f24096b).e;
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
                lq0 lq0Var = (lq0) this.f24096b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(lq0Var.f26868v0.f23815r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f24096b;
                if (i10 == 5) {
                    alertDialog$Builder.f19503a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f24096b;
                if (i10 == 6) {
                    d2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                s11 s11Var = (s11) this.f24096b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(s11Var.f28592b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                p61 p61Var = (p61) this.f24096b;
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
