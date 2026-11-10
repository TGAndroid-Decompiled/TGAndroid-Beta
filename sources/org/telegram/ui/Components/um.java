package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class um implements View.OnKeyListener {
    public final int f38713a;
    public final Object f38714b;

    public um(Object obj, int i7) {
        this.f38713a = i7;
        this.f38714b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f38713a) {
            case 0:
                ym ymVar = (ym) this.f38714b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = ymVar.f28907f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                xt xtVar = (xt) this.f38714b;
                xtVar.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && xtVar.isShowing()) {
                    xtVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
