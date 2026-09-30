package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class pn implements View.OnKeyListener {
    public final int f27408a;
    public final Object f27409b;

    public pn(Object obj, int i10) {
        this.f27408a = i10;
        this.f27409b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f27408a) {
            case 0:
                un unVar = (un) this.f27409b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = unVar.f20154f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                av avVar = (av) this.f27409b;
                avVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && avVar.isShowing()) {
                    avVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
