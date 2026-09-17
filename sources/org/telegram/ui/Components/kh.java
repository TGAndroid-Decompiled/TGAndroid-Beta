package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f27852a;
    public final KeyEvent.Callback f27853b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f27852a = i10;
        this.f27853b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27852a) {
            case 0:
                vi.p((vi) this.f27853b);
                return;
            default:
                ((View) this.f27853b).setTag(null);
                return;
        }
    }
}
