package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class lh implements DialogInterface.OnCancelListener {
    public final int f28368a;
    public final KeyEvent.Callback f28369b;

    public lh(KeyEvent.Callback callback, int i10) {
        this.f28368a = i10;
        this.f28369b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28368a) {
            case 0:
                xi.r((xi) this.f28369b);
                return;
            default:
                ((View) this.f28369b).setTag(null);
                return;
        }
    }
}
