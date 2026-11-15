package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class dn implements View.OnKeyListener {
    public final int f33997a;
    public final Object f33998b;

    public dn(Object obj, int i7) {
        this.f33997a = i7;
        this.f33998b = obj;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        switch (this.f33997a) {
            case 0:
                hn hnVar = (hn) this.f33998b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i7 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = hnVar.f32119f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                du duVar = (du) this.f33998b;
                duVar.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && duVar.isShowing()) {
                    duVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
