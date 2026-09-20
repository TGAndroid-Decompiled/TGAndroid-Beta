package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f25365a;
    public final KeyEvent.Callback f25366b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f25365a = i10;
        this.f25366b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25365a) {
            case 0:
                vi.p((vi) this.f25366b);
                return;
            default:
                ((View) this.f25366b).setTag(null);
                return;
        }
    }
}
