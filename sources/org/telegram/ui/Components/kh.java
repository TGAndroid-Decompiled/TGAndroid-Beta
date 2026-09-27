package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f25730a;
    public final KeyEvent.Callback f25731b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f25730a = i10;
        this.f25731b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25730a) {
            case 0:
                wi.r((wi) this.f25731b);
                return;
            default:
                ((View) this.f25731b).setTag(null);
                return;
        }
    }
}
