package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class mh implements DialogInterface.OnCancelListener {
    public final int f28705a;
    public final KeyEvent.Callback f28706b;

    public mh(KeyEvent.Callback callback, int i10) {
        this.f28705a = i10;
        this.f28706b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28705a) {
            case 0:
                yi.s((yi) this.f28706b);
                return;
            default:
                ((View) this.f28706b).setTag(null);
                return;
        }
    }
}
