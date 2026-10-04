package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class pn implements View.OnKeyListener {
    public final int f29672a;
    public final Object f29673b;

    public pn(Object obj, int i10) {
        this.f29672a = i10;
        this.f29673b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f29672a) {
            case 0:
                un unVar = (un) this.f29673b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = unVar.f21927f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                bv bvVar = (bv) this.f29673b;
                bvVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && bvVar.isShowing()) {
                    bvVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
