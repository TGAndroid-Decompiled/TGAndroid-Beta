package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class lh implements DialogInterface.OnCancelListener {
    public final int f28471a;
    public final KeyEvent.Callback f28472b;

    public lh(KeyEvent.Callback callback, int i10) {
        this.f28471a = i10;
        this.f28472b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28471a) {
            case 0:
                xi.r((xi) this.f28472b);
                return;
            default:
                ((View) this.f28472b).setTag(null);
                return;
        }
    }
}
