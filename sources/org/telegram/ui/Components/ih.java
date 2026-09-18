package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f24940a;
    public final KeyEvent.Callback f24941b;

    public ih(KeyEvent.Callback callback, int i10) {
        this.f24940a = i10;
        this.f24941b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f24940a) {
            case 0:
                vi.p((vi) this.f24941b);
                return;
            default:
                ((View) this.f24941b).setTag(null);
                return;
        }
    }
}
