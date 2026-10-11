package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class co implements View.OnKeyListener {
    public final int f25401a;
    public final Object f25402b;

    public co(Object obj, int i10) {
        this.f25401a = i10;
        this.f25402b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f25401a) {
            case 0:
                io ioVar = (io) this.f25402b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = ioVar.f22003f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                ov ovVar = (ov) this.f25402b;
                ovVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && ovVar.isShowing()) {
                    ovVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
