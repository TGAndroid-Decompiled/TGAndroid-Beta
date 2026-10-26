package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f29646a;
    public final KeyEvent.Callback f29647b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f29646a = i10;
        this.f29647b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29646a) {
            case 0:
                ti.v((ti) this.f29647b);
                return;
            default:
                ((View) this.f29647b).setTag(null);
                return;
        }
    }
}
