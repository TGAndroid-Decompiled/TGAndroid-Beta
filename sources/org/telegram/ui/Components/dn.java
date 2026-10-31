package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class dn implements View.OnKeyListener {
    public final int f25469a;
    public final Object f25470b;

    public dn(Object obj, int i10) {
        this.f25469a = i10;
        this.f25470b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f25469a) {
            case 0:
                hn hnVar = (hn) this.f25470b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = hnVar.f21861f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                ju juVar = (ju) this.f25470b;
                juVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && juVar.isShowing()) {
                    juVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
