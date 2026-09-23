package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f25304a;
    public final KeyEvent.Callback f25305b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f25304a = i10;
        this.f25305b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25304a) {
            case 0:
                wi.p((wi) this.f25305b);
                return;
            default:
                ((View) this.f25305b).setTag(null);
                return;
        }
    }
}
