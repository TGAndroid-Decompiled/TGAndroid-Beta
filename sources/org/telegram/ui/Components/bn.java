package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

public final class bn implements View.OnKeyListener {

    public final int f27183a;

    public final Object f27184b;

    public bn(Object obj, int i10) {
        this.f27183a = i10;
        this.f27184b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f27183a) {
            case 0:
                fn fnVar = (fn) this.f27184b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                ImageView imageView = fnVar.f26035f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            default:
                hu huVar = (hu) this.f27184b;
                huVar.getClass();
                if (i10 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !huVar.isShowing()) {
                    return false;
                }
                huVar.dismiss();
                return true;
        }
    }
}
