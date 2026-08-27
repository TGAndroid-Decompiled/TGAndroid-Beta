package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class mg implements View.OnKeyListener {

    public final int f40503a;

    public final Object f40504b;

    public mg(Object obj, int i10) {
        this.f40503a = i10;
        this.f40504b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f40503a) {
            case 0:
                rn rnVar = (rn) this.f40504b;
                rnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                rnVar.ta();
                return true;
            case 1:
                xm0 xm0Var = (xm0) this.f40504b;
                if (i10 != 67) {
                    xm0Var.getClass();
                } else if (xm0Var.U[2].length() == 0) {
                    xm0Var.U[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = xm0Var.U[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    xm0Var.U[1].dispatchKeyEvent(keyEvent);
                    return true;
                }
                return false;
            default:
                vu0 vu0Var = (vu0) this.f40504b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor3.length() != 0) {
                    return false;
                }
                ImageView imageView = vu0Var.f26035f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
        }
    }
}
