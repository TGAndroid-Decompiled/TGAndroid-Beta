package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f27532a;
    public final KeyEvent.Callback f27533b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f27532a = i10;
        this.f27533b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27532a) {
            case 0:
                ti.s((ti) this.f27533b);
                return;
            default:
                ((View) this.f27533b).setTag(null);
                return;
        }
    }
}
