package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f27524a;
    public final KeyEvent.Callback f27525b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f27524a = i10;
        this.f27525b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27524a) {
            case 0:
                ti.r((ti) this.f27525b);
                return;
            default:
                ((View) this.f27525b).setTag(null);
                return;
        }
    }
}
