package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f25769a;
    public final KeyEvent.Callback f25770b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f25769a = i10;
        this.f25770b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25769a) {
            case 0:
                wi.p((wi) this.f25770b);
                return;
            default:
                ((View) this.f25770b).setTag(null);
                return;
        }
    }
}
