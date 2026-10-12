package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class fo implements View.OnKeyListener {
    public final int f26149a;
    public final Object f26150b;

    public fo(Object obj, int i10) {
        this.f26149a = i10;
        this.f26150b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f26149a) {
            case 0:
                ko koVar = (ko) this.f26150b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = koVar.f21738f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                qv qvVar = (qv) this.f26150b;
                qvVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && qvVar.isShowing()) {
                    qvVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
