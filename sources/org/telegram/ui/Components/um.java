package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class um implements View.OnKeyListener {
    public final int f38820a;
    public final Object f38821b;

    public um(Object obj, int i3) {
        this.f38820a = i3;
        this.f38821b = obj;
    }

    @Override
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        switch (this.f38820a) {
            case 0:
                ym ymVar = (ym) this.f38821b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i3 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = ymVar.f31049f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                wt wtVar = (wt) this.f38821b;
                wtVar.getClass();
                if (i3 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && wtVar.isShowing()) {
                    wtVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
