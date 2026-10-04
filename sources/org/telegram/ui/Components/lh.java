package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class lh implements DialogInterface.OnCancelListener {
    public final int f28363a;
    public final KeyEvent.Callback f28364b;

    public lh(KeyEvent.Callback callback, int i10) {
        this.f28363a = i10;
        this.f28364b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28363a) {
            case 0:
                xi.r((xi) this.f28364b);
                return;
            default:
                ((View) this.f28364b).setTag(null);
                return;
        }
    }
}
