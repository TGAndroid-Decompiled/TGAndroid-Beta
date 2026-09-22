package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f25378a;
    public final KeyEvent.Callback f25379b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f25378a = i10;
        this.f25379b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25378a) {
            case 0:
                vi.p((vi) this.f25379b);
                return;
            default:
                ((View) this.f25379b).setTag(null);
                return;
        }
    }
}
