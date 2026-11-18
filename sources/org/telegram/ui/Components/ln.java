package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class ln implements View.OnKeyListener {
    public final int f37150a;
    public final Object f37151b;

    public ln(Object obj, int i7) {
        this.f37150a = i7;
        this.f37151b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f37150a) {
            case 0:
                pn pnVar = (pn) this.f37151b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = pnVar.f30387f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                iu iuVar = (iu) this.f37151b;
                iuVar.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && iuVar.isShowing()) {
                    iuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
