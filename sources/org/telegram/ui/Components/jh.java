package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f29644a;
    public final KeyEvent.Callback f29645b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f29644a = i10;
        this.f29645b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f29644a) {
            case 0:
                ti.v((ti) this.f29645b);
                return;
            default:
                ((View) this.f29645b).setTag(null);
                return;
        }
    }
}
