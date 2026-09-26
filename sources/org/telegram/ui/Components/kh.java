package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f25787a;
    public final KeyEvent.Callback f25788b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f25787a = i10;
        this.f25788b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25787a) {
            case 0:
                wi.p((wi) this.f25788b);
                return;
            default:
                ((View) this.f25788b).setTag(null);
                return;
        }
    }
}
