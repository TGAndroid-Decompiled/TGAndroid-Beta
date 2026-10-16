package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class zn implements View.OnKeyListener {
    public final int f31596a;
    public final Object f31597b;

    public zn(Object obj, int i10) {
        this.f31596a = i10;
        this.f31597b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f31596a) {
            case 0:
                fo foVar = (fo) this.f31597b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = foVar.f20767f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                jv jvVar = (jv) this.f31597b;
                jvVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && jvVar.isShowing()) {
                    jvVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
