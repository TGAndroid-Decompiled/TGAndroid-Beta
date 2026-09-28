package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f25700a;
    public final KeyEvent.Callback f25701b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f25700a = i10;
        this.f25701b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25700a) {
            case 0:
                wi.p((wi) this.f25701b);
                return;
            default:
                ((View) this.f25701b).setTag(null);
                return;
        }
    }
}
