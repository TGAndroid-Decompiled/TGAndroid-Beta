package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class og implements View.OnKeyListener {
    public final int f36890a;
    public final Object f36891b;

    public og(Object obj, int i10) {
        this.f36890a = i10;
        this.f36891b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f36890a) {
            case 0:
                xn xnVar = (xn) this.f36891b;
                xnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    xnVar.ta();
                    return true;
                }
                return false;
            case 1:
                dn0 dn0Var = (dn0) this.f36891b;
                if (i10 == 67) {
                    if (dn0Var.V[2].length() == 0) {
                        dn0Var.V[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = dn0Var.V[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        dn0Var.V[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    dn0Var.getClass();
                }
                return false;
            default:
                cv0 cv0Var = (cv0) this.f36891b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = cv0Var.f20918f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
