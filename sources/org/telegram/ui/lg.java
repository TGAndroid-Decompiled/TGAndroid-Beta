package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lg implements View.OnKeyListener {
    public final int f39238a;
    public final Object f39239b;

    public lg(Object obj, int i10) {
        this.f39238a = i10;
        this.f39239b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f39238a) {
            case 0:
                sn snVar = (sn) this.f39239b;
                snVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    snVar.xa();
                    return true;
                }
                return false;
            case 1:
                an0 an0Var = (an0) this.f39239b;
                if (i10 == 67) {
                    if (an0Var.Y[2].length() == 0) {
                        an0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = an0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        an0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    an0Var.getClass();
                }
                return false;
            default:
                fv0 fv0Var = (fv0) this.f39239b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = fv0Var.f22280f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
