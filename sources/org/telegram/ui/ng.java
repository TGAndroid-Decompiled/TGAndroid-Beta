package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ng implements View.OnKeyListener {
    public final int f41888a;
    public final Object f41889b;

    public ng(Object obj, int i10) {
        this.f41888a = i10;
        this.f41889b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f41888a) {
            case 0:
                un unVar = (un) this.f41889b;
                unVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    unVar.Ca();
                    return true;
                }
                return false;
            case 1:
                in0 in0Var = (in0) this.f41889b;
                if (i10 == 67) {
                    if (in0Var.Y[2].length() == 0) {
                        in0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = in0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        in0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    in0Var.getClass();
                }
                return false;
            default:
                jv0 jv0Var = (jv0) this.f41889b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = jv0Var.f24200f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
