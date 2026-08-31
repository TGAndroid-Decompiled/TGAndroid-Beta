package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class zg implements DialogInterface.OnCancelListener {
    public final int f33893a;
    public final KeyEvent.Callback f33894b;

    public zg(KeyEvent.Callback callback, int i10) {
        this.f33893a = i10;
        this.f33894b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33893a) {
            case 0:
                mi.p((mi) this.f33894b);
                return;
            default:
                ((View) this.f33894b).setTag(null);
                return;
        }
    }
}
