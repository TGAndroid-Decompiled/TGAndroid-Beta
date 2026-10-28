package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f29674a;
    public final KeyEvent.Callback f29675b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f29674a = i10;
        this.f29675b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29674a) {
            case 0:
                ti.u((ti) this.f29675b);
                return;
            default:
                ((View) this.f29675b).setTag(null);
                return;
        }
    }
}
