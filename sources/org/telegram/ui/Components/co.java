package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class co implements View.OnKeyListener {
    public final int f25339a;
    public final Object f25340b;

    public co(Object obj, int i10) {
        this.f25339a = i10;
        this.f25340b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f25339a) {
            case 0:
                io ioVar = (io) this.f25340b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = ioVar.f21979f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                ov ovVar = (ov) this.f25340b;
                ovVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && ovVar.isShowing()) {
                    ovVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
