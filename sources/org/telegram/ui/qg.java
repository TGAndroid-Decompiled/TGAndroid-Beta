package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qg implements View.OnKeyListener {
    public final int f37408a;
    public final Object f37409b;

    public qg(Object obj, int i10) {
        this.f37408a = i10;
        this.f37409b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f37408a) {
            case 0:
                zn znVar = (zn) this.f37409b;
                znVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    znVar.ta();
                    return true;
                }
                return false;
            case 1:
                fn0 fn0Var = (fn0) this.f37409b;
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
                jv0 jv0Var = (jv0) this.f37409b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = jv0Var.f20847f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
