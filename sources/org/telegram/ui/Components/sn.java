package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
public final class sn implements View.OnKeyListener {
    public final int f27128a;
    public final Object f27129b;

    public sn(Object obj, int i10) {
        this.f27128a = i10;
        this.f27129b = obj;
    }

    @Override
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.f27128a) {
            case 0:
                wn wnVar = (wn) this.f27129b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    ImageView imageView = wnVar.f19076f;
                    if (imageView != null) {
                        imageView.callOnClick();
                    }
                    return true;
                }
                return false;
            default:
                bv bvVar = (bv) this.f27129b;
                bvVar.getClass();
                if (i10 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && bvVar.isShowing()) {
                    bvVar.dismiss();
                    return true;
                }
                return false;
        }
    }
}
