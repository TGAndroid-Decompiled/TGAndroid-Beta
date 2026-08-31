package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class ln implements View.OnKeyListener {
    public final int f28774a;
    public final Object f28775b;

    public ln(Object obj, int i10) {
        this.f28774a = i10;
        this.f28775b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f28774a) {
            case 0:
                pn pnVar = (pn) this.f28775b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = pnVar.f22651f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                tu tuVar = (tu) this.f28775b;
                tuVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && tuVar.isShowing()) {
                    tuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
