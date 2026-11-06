package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class vm implements View.OnKeyListener {
    public final int f39002a;
    public final Object f39003b;

    public vm(Object obj, int i7) {
        this.f39002a = i7;
        this.f39003b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f39002a) {
            case 0:
                zm zmVar = (zm) this.f39003b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = zmVar.f28889f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                xt xtVar = (xt) this.f39003b;
                xtVar.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && xtVar.isShowing()) {
                    xtVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
