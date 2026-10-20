package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f27528a;
    public final KeyEvent.Callback f27529b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f27528a = i10;
        this.f27529b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27528a) {
            case 0:
                ti.s((ti) this.f27529b);
                return;
            default:
                ((View) this.f27529b).setTag(null);
                return;
        }
    }
}
