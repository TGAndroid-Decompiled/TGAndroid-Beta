package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;

public final class vg implements DialogInterface.OnCancelListener {

    public final int f33416a;

    public final KeyEvent.Callback f33417b;

    public vg(KeyEvent.Callback callback, int i10) {
        this.f33416a = i10;
        this.f33417b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f33416a) {
            case 0:
                gi.q((gi) this.f33417b);
                break;
            default:
                ((View) this.f33417b).setTag(null);
                break;
        }
    }
}
