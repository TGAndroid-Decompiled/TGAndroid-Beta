package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class zg implements DialogInterface.OnCancelListener {
    public final int f33936a;
    public final KeyEvent.Callback f33937b;

    public zg(KeyEvent.Callback callback, int i10) {
        this.f33936a = i10;
        this.f33937b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33936a) {
            case 0:
                mi.p((mi) this.f33937b);
                return;
            default:
                ((View) this.f33937b).setTag(null);
                return;
        }
    }
}
