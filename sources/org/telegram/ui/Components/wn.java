package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class wn implements View.OnKeyListener {
    public final int f32163a;
    public final Object f32164b;

    public wn(Object obj, int i10) {
        this.f32163a = i10;
        this.f32164b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f32163a) {
            case 0:
                bo boVar = (bo) this.f32164b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = boVar.f22097f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                ev evVar = (ev) this.f32164b;
                evVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && evVar.isShowing()) {
                    evVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
