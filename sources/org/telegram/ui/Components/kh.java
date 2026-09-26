package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f25724a;
    public final KeyEvent.Callback f25725b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f25724a = i10;
        this.f25725b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25724a) {
            case 0:
                wi.p((wi) this.f25725b);
                return;
            default:
                ((View) this.f25725b).setTag(null);
                return;
        }
    }
}
