package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c1 implements TextView.OnEditorActionListener {
    public final int f25150a;
    public final Object f25151b;

    public c1(Object obj, int i10) {
        this.f25150a = i10;
        this.f25151b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25150a) {
            case 0:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) this.f25151b;
                if (i10 == 6) {
                    iVar.run();
                    return true;
                }
                return false;
            case 1:
                yk ykVar = (yk) this.f25151b;
                if (i10 == 6) {
                    ei.d dVar = ykVar.f32956o0;
                    if (dVar.f8862c0) {
                        dVar.performClick();
                        return true;
                    }
                } else {
                    ykVar.getClass();
                }
                return false;
            case 2:
                org.telegram.ui.Cells.f3 f3Var = ((org.telegram.ui.Cells.h3) this.f25151b).d;
                if (i10 == 5) {
                    f3Var.requestFocus();
                    f3Var.setSelection(f3Var.length());
                    return true;
                }
                return false;
            case 3:
                ir irVar = (ir) this.f25151b;
                if (i10 == 6) {
                    irVar.run();
                    return true;
                }
                return false;
            case 4:
                ne0 ne0Var = (ne0) this.f25151b;
                if (i10 == 6) {
                    ne0Var.n(false);
                    return true;
                }
                ne0Var.getClass();
                return false;
            case 5:
                p4 p4Var = (p4) this.f25151b;
                if (i10 == 6) {
                    p4Var.f31164b.f30862a.callOnClick();
                    return true;
                }
                return false;
            case 6:
                ei.e2 e2Var = ((xn0) this.f25151b).d;
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
                hr0 hr0Var = (hr0) this.f25151b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(hr0Var.f27154z0.f27258r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 8:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f25151b;
                if (i10 == 5) {
                    alertDialog$Builder.f20679a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f25151b;
                if (i10 == 6) {
                    c2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 10:
                p21 p21Var = (p21) this.f25151b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(p21Var.f29456b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                q71 q71Var = (q71) this.f25151b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(q71Var.J);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
