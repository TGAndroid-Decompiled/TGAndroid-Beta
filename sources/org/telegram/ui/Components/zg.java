package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class zg implements DialogInterface.OnCancelListener {
    public final int f35303a;
    public final KeyEvent.Callback f35304b;

    public zg(KeyEvent.Callback callback, int i9) {
        this.f35303a = i9;
        this.f35304b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35303a) {
            case 0:
                ki.p((ki) this.f35304b);
                return;
            default:
                ((View) this.f35304b).setTag(null);
                return;
        }
    }
}
