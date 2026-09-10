package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class mh implements DialogInterface.OnCancelListener {
    public final int f25235a;
    public final KeyEvent.Callback f25236b;

    public mh(KeyEvent.Callback callback, int i10) {
        this.f25235a = i10;
        this.f25236b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25235a) {
            case 0:
                yi.p((yi) this.f25236b);
                return;
            default:
                ((View) this.f25236b).setTag(null);
                return;
        }
    }
}
