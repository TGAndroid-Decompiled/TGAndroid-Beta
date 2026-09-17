package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f24937a;
    public final KeyEvent.Callback f24938b;

    public ih(KeyEvent.Callback callback, int i10) {
        this.f24937a = i10;
        this.f24938b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f24937a) {
            case 0:
                vi.p((vi) this.f24938b);
                return;
            default:
                ((View) this.f24938b).setTag(null);
                return;
        }
    }
}
