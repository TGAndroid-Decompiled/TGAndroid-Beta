package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class oh implements DialogInterface.OnCancelListener {
    public final int f29211a;
    public final KeyEvent.Callback f29212b;

    public oh(KeyEvent.Callback callback, int i10) {
        this.f29211a = i10;
        this.f29212b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29211a) {
            case 0:
                aj.s((aj) this.f29212b);
                return;
            default:
                ((View) this.f29212b).setTag(null);
                return;
        }
    }
}
