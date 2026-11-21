package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class nn implements View.OnKeyListener {
    public final int f37898a;
    public final Object f37899b;

    public nn(Object obj, int i7) {
        this.f37898a = i7;
        this.f37899b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f37898a) {
            case 0:
                rn rnVar = (rn) this.f37899b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = rnVar.f30474f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                ku kuVar = (ku) this.f37899b;
                kuVar.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && kuVar.isShowing()) {
                    kuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
