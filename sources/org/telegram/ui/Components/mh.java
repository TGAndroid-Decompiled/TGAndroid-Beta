package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class mh implements DialogInterface.OnCancelListener {
    public final int f28856a;
    public final KeyEvent.Callback f28857b;

    public mh(KeyEvent.Callback callback, int i10) {
        this.f28856a = i10;
        this.f28857b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28856a) {
            case 0:
                yi.s((yi) this.f28857b);
                return;
            default:
                ((View) this.f28857b).setTag(null);
                return;
        }
    }
}
