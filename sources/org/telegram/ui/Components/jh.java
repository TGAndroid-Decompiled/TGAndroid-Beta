package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f27527a;
    public final KeyEvent.Callback f27528b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f27527a = i10;
        this.f27528b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27527a) {
            case 0:
                ti.s((ti) this.f27528b);
                return;
            default:
                ((View) this.f27528b).setTag(null);
                return;
        }
    }
}
