package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class zg implements DialogInterface.OnCancelListener {
    public final int f31340a;
    public final KeyEvent.Callback f31341b;

    public zg(KeyEvent.Callback callback, int i10) {
        this.f31340a = i10;
        this.f31341b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f31340a) {
            case 0:
                li.p((li) this.f31341b);
                return;
            default:
                ((View) this.f31341b).setTag(null);
                return;
        }
    }
}
