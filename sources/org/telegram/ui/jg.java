package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jg implements View.OnKeyListener {
    public final int f39542a;
    public final Object f39543b;

    public jg(Object obj, int i10) {
        this.f39542a = i10;
        this.f39543b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f39542a) {
            case 0:
                tn tnVar = (tn) this.f39543b;
                tnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    tnVar.ta();
                    return true;
                }
                return false;
            case 1:
                vm0 vm0Var = (vm0) this.f39543b;
                if (i10 == 67) {
                    if (vm0Var.U[2].length() == 0) {
                        vm0Var.U[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = vm0Var.U[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        vm0Var.U[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    vm0Var.getClass();
                }
                return false;
            default:
                su0 su0Var = (su0) this.f39543b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = su0Var.f24085f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
