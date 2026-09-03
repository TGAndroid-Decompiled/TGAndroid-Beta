package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class in implements View.OnKeyListener {
    public final int f25744a;
    public final Object f25745b;

    public in(Object obj, int i10) {
        this.f25744a = i10;
        this.f25745b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f25744a) {
            case 0:
                mn mnVar = (mn) this.f25745b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = mnVar.f20847f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                qu quVar = (qu) this.f25745b;
                quVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && quVar.isShowing()) {
                    quVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
