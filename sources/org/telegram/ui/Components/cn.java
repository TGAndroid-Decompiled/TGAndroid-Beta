package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class cn implements View.OnKeyListener {
    public final int f27514a;
    public final Object f27515b;

    public cn(Object obj, int i9) {
        this.f27514a = i9;
        this.f27515b = obj;
    }

    @Override
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        switch (this.f27514a) {
            case 0:
                gn gnVar = (gn) this.f27515b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i9 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = gnVar.f24199f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                iu iuVar = (iu) this.f27515b;
                iuVar.getClass();
                if (i9 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && iuVar.isShowing()) {
                    iuVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
