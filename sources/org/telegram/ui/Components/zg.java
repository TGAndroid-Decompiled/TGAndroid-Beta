package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class zg implements DialogInterface.OnCancelListener {
    public final int f31384a;
    public final KeyEvent.Callback f31385b;

    public zg(KeyEvent.Callback callback, int i10) {
        this.f31384a = i10;
        this.f31385b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f31384a) {
            case 0:
                li.p((li) this.f31385b);
                return;
            default:
                ((View) this.f31385b).setTag(null);
                return;
        }
    }
}
