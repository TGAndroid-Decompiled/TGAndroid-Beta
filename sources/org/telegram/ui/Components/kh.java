package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f27825a;
    public final KeyEvent.Callback f27826b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f27825a = i10;
        this.f27826b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27825a) {
            case 0:
                vi.p((vi) this.f27826b);
                return;
            default:
                ((View) this.f27826b).setTag(null);
                return;
        }
    }
}
