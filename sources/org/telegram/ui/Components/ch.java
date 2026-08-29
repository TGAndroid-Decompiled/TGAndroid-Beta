package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class ch implements DialogInterface.OnCancelListener {
    public final int f27484a;
    public final KeyEvent.Callback f27485b;

    public ch(KeyEvent.Callback callback, int i10) {
        this.f27484a = i10;
        this.f27485b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27484a) {
            case 0:
                ni.p((ni) this.f27485b);
                return;
            default:
                ((View) this.f27485b).setTag(null);
                return;
        }
    }
}
