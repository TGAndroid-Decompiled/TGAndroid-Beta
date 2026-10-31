package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mg implements View.OnKeyListener {
    public final int f39699a;
    public final Object f39700b;

    public mg(Object obj, int i10) {
        this.f39699a = i10;
        this.f39700b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f39699a) {
            case 0:
                un unVar = (un) this.f39700b;
                unVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    unVar.Ia();
                    return true;
                }
                return false;
            case 1:
                ll0 ll0Var = (ll0) this.f39700b;
                if (i10 == 67) {
                    if (ll0Var.Y[2].length() == 0) {
                        ll0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = ll0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        ll0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    ll0Var.getClass();
                }
                return false;
            default:
                xs0 xs0Var = (xs0) this.f39700b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = xs0Var.f21861f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
