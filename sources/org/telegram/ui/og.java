package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class og implements View.OnKeyListener {
    public final int f39747a;
    public final Object f39748b;

    public og(Object obj, int i10) {
        this.f39747a = i10;
        this.f39748b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f39747a) {
            case 0:
                xn xnVar = (xn) this.f39748b;
                xnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    xnVar.ta();
                    return true;
                }
                return false;
            case 1:
                fn0 fn0Var = (fn0) this.f39748b;
                if (i10 == 67) {
                    if (fn0Var.V[2].length() == 0) {
                        fn0Var.V[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = fn0Var.V[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        fn0Var.V[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    fn0Var.getClass();
                }
                return false;
            default:
                ev0 ev0Var = (ev0) this.f39748b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = ev0Var.f22651f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
