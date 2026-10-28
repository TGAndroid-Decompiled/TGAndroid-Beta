package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mg implements View.OnKeyListener {
    public final int f41436a;
    public final Object f41437b;

    public mg(Object obj, int i10) {
        this.f41436a = i10;
        this.f41437b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f41436a) {
            case 0:
                wn wnVar = (wn) this.f41437b;
                wnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    wnVar.Fa();
                    return true;
                }
                return false;
            case 1:
                kn0 kn0Var = (kn0) this.f41437b;
                if (i10 == 67) {
                    if (kn0Var.Y[2].length() == 0) {
                        kn0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = kn0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        kn0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    kn0Var.getClass();
                }
                return false;
            default:
                lv0 lv0Var = (lv0) this.f41437b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = lv0Var.f24202f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
