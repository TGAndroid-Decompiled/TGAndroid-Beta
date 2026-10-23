package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lg implements View.OnKeyListener {
    public final int f38919a;
    public final Object f38920b;

    public lg(Object obj, int i10) {
        this.f38919a = i10;
        this.f38920b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f38919a) {
            case 0:
                qn qnVar = (qn) this.f38920b;
                qnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    qnVar.xa();
                    return true;
                }
                return false;
            case 1:
                vm0 vm0Var = (vm0) this.f38920b;
                if (i10 == 67) {
                    if (vm0Var.Y[2].length() == 0) {
                        vm0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = vm0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        vm0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    vm0Var.getClass();
                }
                return false;
            default:
                cv0 cv0Var = (cv0) this.f38920b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = cv0Var.f22098f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
