package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class mn implements View.OnKeyListener {
    public final int f26182a;
    public final Object f26183b;

    public mn(Object obj, int i10) {
        this.f26182a = i10;
        this.f26183b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f26182a) {
            case 0:
                rn rnVar = (rn) this.f26183b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = rnVar.f19901f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                xu xuVar = (xu) this.f26183b;
                xuVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && xuVar.isShowing()) {
                    xuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
