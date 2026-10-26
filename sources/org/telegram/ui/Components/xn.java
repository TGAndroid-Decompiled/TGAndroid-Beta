package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class xn implements View.OnKeyListener {
    public final int f34781a;
    public final Object f34782b;

    public xn(Object obj, int i10) {
        this.f34781a = i10;
        this.f34782b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f34781a) {
            case 0:
                co coVar = (co) this.f34782b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = coVar.f24200f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                fv fvVar = (fv) this.f34782b;
                fvVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && fvVar.isShowing()) {
                    fvVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
