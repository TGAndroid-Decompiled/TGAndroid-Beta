package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class mh implements DialogInterface.OnCancelListener {
    public final int f28816a;
    public final KeyEvent.Callback f28817b;

    public mh(KeyEvent.Callback callback, int i10) {
        this.f28816a = i10;
        this.f28817b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f28816a) {
            case 0:
                yi.s((yi) this.f28817b);
                return;
            default:
                ((View) this.f28817b).setTag(null);
                return;
        }
    }
}
