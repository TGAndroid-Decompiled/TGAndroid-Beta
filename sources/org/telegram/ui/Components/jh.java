package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f27688a;
    public final KeyEvent.Callback f27689b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f27688a = i10;
        this.f27689b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27688a) {
            case 0:
                ti.r((ti) this.f27689b);
                return;
            default:
                ((View) this.f27689b).setTag(null);
                return;
        }
    }
}
