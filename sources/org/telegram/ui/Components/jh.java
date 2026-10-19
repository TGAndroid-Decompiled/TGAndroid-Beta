package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f27525a;
    public final KeyEvent.Callback f27526b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f27525a = i10;
        this.f27526b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27525a) {
            case 0:
                ti.s((ti) this.f27526b);
                return;
            default:
                ((View) this.f27526b).setTag(null);
                return;
        }
    }
}
