package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class on implements View.OnKeyListener {
    public final int f27150a;
    public final Object f27151b;

    public on(Object obj, int i10) {
        this.f27150a = i10;
        this.f27151b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f27150a) {
            case 0:
                tn tnVar = (tn) this.f27151b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = tnVar.f20139f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                zu zuVar = (zu) this.f27151b;
                zuVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && zuVar.isShowing()) {
                    zuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
