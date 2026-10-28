package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class xn implements View.OnKeyListener {
    public final int f34820a;
    public final Object f34821b;

    public xn(Object obj, int i10) {
        this.f34820a = i10;
        this.f34821b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f34820a) {
            case 0:
                co coVar = (co) this.f34821b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = coVar.f24202f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                fv fvVar = (fv) this.f34821b;
                fvVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && fvVar.isShowing()) {
                    fvVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
