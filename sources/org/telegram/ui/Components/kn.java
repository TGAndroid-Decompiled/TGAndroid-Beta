package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class kn implements View.OnKeyListener {
    public final int f36811a;
    public final Object f36812b;

    public kn(Object obj, int i7) {
        this.f36811a = i7;
        this.f36812b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f36811a) {
            case 0:
                on onVar = (on) this.f36812b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = onVar.f30477f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                iu iuVar = (iu) this.f36812b;
                iuVar.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && iuVar.isShowing()) {
                    iuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
