package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f25788a;
    public final KeyEvent.Callback f25789b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f25788a = i10;
        this.f25789b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25788a) {
            case 0:
                wi.p((wi) this.f25789b);
                return;
            default:
                ((View) this.f25789b).setTag(null);
                return;
        }
    }
}
