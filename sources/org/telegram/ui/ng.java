package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ng implements View.OnKeyListener {
    public final int f39469a;
    public final Object f39470b;

    public ng(Object obj, int i10) {
        this.f39469a = i10;
        this.f39470b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f39469a) {
            case 0:
                sn snVar = (sn) this.f39470b;
                snVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    snVar.xa();
                    return true;
                }
                return false;
            case 1:
                xm0 xm0Var = (xm0) this.f39470b;
                if (i10 == 67) {
                    if (xm0Var.Y[2].length() == 0) {
                        xm0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = xm0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        xm0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    xm0Var.getClass();
                }
                return false;
            default:
                ev0 ev0Var = (ev0) this.f39470b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = ev0Var.f22097f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
