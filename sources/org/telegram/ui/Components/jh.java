package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f25330a;
    public final KeyEvent.Callback f25331b;

    public jh(KeyEvent.Callback callback, int i10) {
        this.f25330a = i10;
        this.f25331b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f25330a) {
            case 0:
                vi.p((vi) this.f25331b);
                return;
            default:
                ((View) this.f25331b).setTag(null);
                return;
        }
    }
}
