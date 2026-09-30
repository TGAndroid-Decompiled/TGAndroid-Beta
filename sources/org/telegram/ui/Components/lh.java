package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class lh implements DialogInterface.OnCancelListener {
    public final int f25991a;
    public final KeyEvent.Callback f25992b;

    public lh(KeyEvent.Callback callback, int i10) {
        this.f25991a = i10;
        this.f25992b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25991a) {
            case 0:
                xi.p((xi) this.f25992b);
                return;
            default:
                ((View) this.f25992b).setTag(null);
                return;
        }
    }
}
