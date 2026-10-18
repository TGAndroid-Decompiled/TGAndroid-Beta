package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f27531a;
    public final KeyEvent.Callback f27532b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f27531a = i10;
        this.f27532b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27531a) {
            case 0:
                ti.r((ti) this.f27532b);
                return;
            default:
                ((View) this.f27532b).setTag(null);
                return;
        }
    }
}
