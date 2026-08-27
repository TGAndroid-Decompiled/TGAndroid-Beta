package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class c1 implements TextView.OnEditorActionListener {

    public final int f27273a;

    public final Object f27274b;

    public c1(Object obj, int i10) {
        this.f27273a = i10;
        this.f27274b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f27273a) {
            case 0:
                org.telegram.ui.yf yfVar = (org.telegram.ui.yf) this.f27274b;
                if (i10 != 6) {
                    return false;
                }
                yfVar.run();
                return true;
            case 1:
                org.telegram.ui.Cells.e3 e3Var = ((org.telegram.ui.Cells.g3) this.f27274b).f24370b;
                if (i10 != 5) {
                    return false;
                }
                e3Var.requestFocus();
                e3Var.setSelection(e3Var.length());
                return true;
            case 2:
                lq lqVar = (lq) this.f27274b;
                if (i10 != 6) {
                    return false;
                }
                lqVar.run();
                return true;
            case 3:
                dd0 dd0Var = (dd0) this.f27274b;
                if (i10 == 6) {
                    dd0Var.k(false);
                    return true;
                }
                dd0Var.getClass();
                return false;
            case 4:
                k4 k4Var = (k4) this.f27274b;
                if (i10 != 6) {
                    return false;
                }
                k4Var.f29404b.f29056a.callOnClick();
                return true;
            case 5:
                gg.g gVar = ((km0) this.f27274b).f30149e;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                gVar.hideActionMode();
                AndroidUtilities.hideKeyboard(gVar);
                return false;
            case 6:
                sp0 sp0Var = (sp0) this.f27274b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(sp0Var.f32545u0.f31468r);
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f27274b;
                if (i10 != 5) {
                    return false;
                }
                alertDialog$Builder.f22702a.d(-1).callOnClick();
                return true;
            case 8:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f27274b;
                if (i10 != 6) {
                    return false;
                }
                b2Var.d(-1).callOnClick();
                return true;
            case 9:
                x01 x01Var = (x01) this.f27274b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(x01Var.f34413b);
                return false;
            default:
                t51 t51Var = (t51) this.f27274b;
                if (keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                AndroidUtilities.hideKeyboard(t51Var.F);
                return false;
        }
    }
}
