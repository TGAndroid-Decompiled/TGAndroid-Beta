package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class ln implements View.OnKeyListener {
    public final int f28247a;
    public final Object f28248b;

    public ln(Object obj, int i10) {
        this.f28247a = i10;
        this.f28248b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f28247a) {
            case 0:
                qn qnVar = (qn) this.f28248b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = qnVar.f21686f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                vu vuVar = (vu) this.f28248b;
                vuVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && vuVar.isShowing()) {
                    vuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
