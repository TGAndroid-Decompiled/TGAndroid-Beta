package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class oh implements DialogInterface.OnCancelListener {
    public final int f29215a;
    public final KeyEvent.Callback f29216b;

    public oh(KeyEvent.Callback callback, int i10) {
        this.f29215a = i10;
        this.f29216b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29215a) {
            case 0:
                aj.s((aj) this.f29216b);
                return;
            default:
                ((View) this.f29216b).setTag(null);
                return;
        }
    }
}
