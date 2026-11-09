package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class vm implements View.OnKeyListener {
    public final int f39128a;
    public final Object f39129b;

    public vm(Object obj, int i7) {
        this.f39128a = i7;
        this.f39129b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f39128a) {
            case 0:
                zm zmVar = (zm) this.f39129b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = zmVar.f28896f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                yt ytVar = (yt) this.f39129b;
                ytVar.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && ytVar.isShowing()) {
                    ytVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
