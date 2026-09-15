package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f25008a;
    public final KeyEvent.Callback f25009b;

    public ih(KeyEvent.Callback callback, int i10) {
        this.f25008a = i10;
        this.f25009b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25008a) {
            case 0:
                vi.p((vi) this.f25009b);
                return;
            default:
                ((View) this.f25009b).setTag(null);
                return;
        }
    }
}
