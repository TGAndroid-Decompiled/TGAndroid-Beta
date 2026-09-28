package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f25699a;
    public final KeyEvent.Callback f25700b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f25699a = i10;
        this.f25700b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25699a) {
            case 0:
                wi.p((wi) this.f25700b);
                return;
            default:
                ((View) this.f25700b).setTag(null);
                return;
        }
    }
}
