package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class hh implements DialogInterface.OnCancelListener {
    public final int f27033a;
    public final KeyEvent.Callback f27034b;

    public hh(KeyEvent.Callback callback, int i10) {
        this.f27033a = i10;
        this.f27034b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27033a) {
            case 0:
                ri.r((ri) this.f27034b);
                return;
            default:
                ((View) this.f27034b).setTag(null);
                return;
        }
    }
}
