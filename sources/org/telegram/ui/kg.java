package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kg implements View.OnKeyListener {
    public final int f39828a;
    public final Object f39829b;

    public kg(Object obj, int i9) {
        this.f39828a = i9;
        this.f39829b = obj;
    }

    @Override
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        switch (this.f39828a) {
            case 0:
                qn qnVar = (qn) this.f39829b;
                qnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i9 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    qnVar.ta();
                    return true;
                }
                return false;
            case 1:
                wm0 wm0Var = (wm0) this.f39829b;
                if (i9 == 67) {
                    if (wm0Var.U[2].length() == 0) {
                        wm0Var.U[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = wm0Var.U[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        wm0Var.U[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    wm0Var.getClass();
                }
                return false;
            default:
                uu0 uu0Var = (uu0) this.f39829b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i9 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = uu0Var.f24199f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
