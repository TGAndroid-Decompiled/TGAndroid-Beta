package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class kn implements View.OnKeyListener {
    public final int f28445a;
    public final Object f28446b;

    public kn(Object obj, int i10) {
        this.f28445a = i10;
        this.f28446b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f28445a) {
            case 0:
                on onVar = (on) this.f28446b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = onVar.f22653f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                tu tuVar = (tu) this.f28446b;
                tuVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && tuVar.isShowing()) {
                    tuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
