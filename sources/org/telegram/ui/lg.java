package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lg implements View.OnKeyListener {
    public final int f39260a;
    public final Object f39261b;

    public lg(Object obj, int i10) {
        this.f39260a = i10;
        this.f39261b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f39260a) {
            case 0:
                sn snVar = (sn) this.f39261b;
                snVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    snVar.xa();
                    return true;
                }
                return false;
            case 1:
                zm0 zm0Var = (zm0) this.f39261b;
                if (i10 == 67) {
                    if (zm0Var.Y[2].length() == 0) {
                        zm0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = zm0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        zm0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    zm0Var.getClass();
                }
                return false;
            default:
                ev0 ev0Var = (ev0) this.f39261b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = ev0Var.f22281f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
