package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d1 implements TextView.OnEditorActionListener {
    public final int f26132a;
    public final Object f26133b;

    public d1(Object obj, int i10) {
        this.f26132a = i10;
        this.f26133b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f26132a) {
            case 0:
                org.telegram.ui.ih ihVar = (org.telegram.ui.ih) this.f26133b;
                if (i10 == 6) {
                    ihVar.run();
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.Cells.g3 g3Var = ((org.telegram.ui.Cells.i3) this.f26133b).f22955b;
                if (i10 == 5) {
                    g3Var.requestFocus();
                    g3Var.setSelection(g3Var.length());
                    return true;
                }
                return false;
            case 2:
                xq xqVar = (xq) this.f26133b;
                if (i10 == 6) {
                    xqVar.run();
                    return true;
                }
                return false;
            case 3:
                xd0 xd0Var = (xd0) this.f26133b;
                if (i10 == 6) {
                    xd0Var.k(false);
                    return true;
                }
                xd0Var.getClass();
                return false;
            case 4:
                l4 l4Var = (l4) this.f26133b;
                if (i10 == 6) {
                    l4Var.f26296b.f26054a.callOnClick();
                    return true;
                }
                return false;
            case 5:
                lg.f fVar = ((fn0) this.f26133b).f26966e;
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
                mq0 mq0Var = (mq0) this.f26133b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(mq0Var.f29223v0.f26172r);
                        return false;
                    }
                    return false;
                }
                return false;
            case 7:
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f26133b;
                if (i10 == 5) {
                    alertDialog$Builder.f21166a.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 8:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f26133b;
                if (i10 == 6) {
                    d2Var.d(-1).callOnClick();
                    return true;
                }
                return false;
            case 9:
                t11 t11Var = (t11) this.f26133b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(t11Var.f31235b);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                r61 r61Var = (r61) this.f26133b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(r61Var.G);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
