package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class hn implements View.OnKeyListener {
    public final int f29205a;
    public final Object f29206b;

    public hn(Object obj, int i10) {
        this.f29205a = i10;
        this.f29206b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f29205a) {
            case 0:
                ln lnVar = (ln) this.f29206b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = lnVar.f24085f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                ou ouVar = (ou) this.f29206b;
                ouVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && ouVar.isShowing()) {
                    ouVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
