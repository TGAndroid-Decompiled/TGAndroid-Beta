package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class on implements View.OnKeyListener {
    public final int f27123a;
    public final Object f27124b;

    public on(Object obj, int i10) {
        this.f27123a = i10;
        this.f27124b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f27123a) {
            case 0:
                tn tnVar = (tn) this.f27124b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = tnVar.f20138f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                zu zuVar = (zu) this.f27124b;
                zuVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && zuVar.isShowing()) {
                    zuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
