package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class nn implements View.OnKeyListener {
    public final int f26746a;
    public final Object f26747b;

    public nn(Object obj, int i10) {
        this.f26746a = i10;
        this.f26747b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f26746a) {
            case 0:
                sn snVar = (sn) this.f26747b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = snVar.f20138f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                yu yuVar = (yu) this.f26747b;
                yuVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && yuVar.isShowing()) {
                    yuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
