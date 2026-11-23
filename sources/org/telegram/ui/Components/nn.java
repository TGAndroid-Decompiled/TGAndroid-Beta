package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class nn implements View.OnKeyListener {
    public final int f37903a;
    public final Object f37904b;

    public nn(Object obj, int i7) {
        this.f37903a = i7;
        this.f37904b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f37903a) {
            case 0:
                rn rnVar = (rn) this.f37904b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = rnVar.f30477f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                ku kuVar = (ku) this.f37904b;
                kuVar.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && kuVar.isShowing()) {
                    kuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
