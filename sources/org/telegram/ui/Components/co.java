package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class co implements View.OnKeyListener {
    public final int f25446a;
    public final Object f25447b;

    public co(Object obj, int i10) {
        this.f25446a = i10;
        this.f25447b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f25446a) {
            case 0:
                io ioVar = (io) this.f25447b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = ioVar.f21975f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                nv nvVar = (nv) this.f25447b;
                nvVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && nvVar.isShowing()) {
                    nvVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
