package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class og implements View.OnKeyListener {
    public final int f40154a;
    public final Object f40155b;

    public og(Object obj, int i10) {
        this.f40154a = i10;
        this.f40155b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f40154a) {
            case 0:
                un unVar = (un) this.f40155b;
                unVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    unVar.Na();
                    return true;
                }
                return false;
            case 1:
                jl0 jl0Var = (jl0) this.f40155b;
                if (i10 == 67) {
                    if (jl0Var.Y[2].length() == 0) {
                        jl0Var.Y[1].requestFocus();
                        EditTextBoldCursor editTextBoldCursor2 = jl0Var.Y[1];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        jl0Var.Y[1].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                } else {
                    jl0Var.getClass();
                }
                return false;
            default:
                ws0 ws0Var = (ws0) this.f40155b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = ws0Var.f21862f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
        }
    }
}
