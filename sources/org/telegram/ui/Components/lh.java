package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class lh implements DialogInterface.OnCancelListener {
    public final int f28362a;
    public final KeyEvent.Callback f28363b;

    public lh(KeyEvent.Callback callback, int i10) {
        this.f28362a = i10;
        this.f28363b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28362a) {
            case 0:
                xi.r((xi) this.f28363b);
                return;
            default:
                ((View) this.f28363b).setTag(null);
                return;
        }
    }
}
