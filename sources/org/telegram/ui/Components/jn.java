package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class jn implements View.OnKeyListener {
    public final int f26010a;
    public final Object f26011b;

    public jn(Object obj, int i10) {
        this.f26010a = i10;
        this.f26011b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f26010a) {
            case 0:
                nn nnVar = (nn) this.f26011b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = nnVar.f20918f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                ru ruVar = (ru) this.f26011b;
                ruVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && ruVar.isShowing()) {
                    ruVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
