package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class un implements View.OnKeyListener {
    public final int f31166a;
    public final Object f31167b;

    public un(Object obj, int i10) {
        this.f31166a = i10;
        this.f31167b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f31166a) {
            case 0:
                zn znVar = (zn) this.f31167b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = znVar.f22281f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                cv cvVar = (cv) this.f31167b;
                cvVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && cvVar.isShowing()) {
                    cvVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
