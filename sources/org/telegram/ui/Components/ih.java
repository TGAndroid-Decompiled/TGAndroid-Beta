package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f25014a;
    public final KeyEvent.Callback f25015b;

    public ih(KeyEvent.Callback callback, int i10) {
        this.f25014a = i10;
        this.f25015b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25014a) {
            case 0:
                vi.p((vi) this.f25015b);
                return;
            default:
                ((View) this.f25015b).setTag(null);
                return;
        }
    }
}
