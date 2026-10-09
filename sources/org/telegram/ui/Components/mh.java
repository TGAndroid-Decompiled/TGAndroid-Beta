package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class mh implements DialogInterface.OnCancelListener {
    public final int f28834a;
    public final KeyEvent.Callback f28835b;

    public mh(KeyEvent.Callback callback, int i10) {
        this.f28834a = i10;
        this.f28835b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28834a) {
            case 0:
                yi.s((yi) this.f28835b);
                return;
            default:
                ((View) this.f28835b).setTag(null);
                return;
        }
    }
}
