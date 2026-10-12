package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f26705a;
    public final KeyEvent.Callback f26706b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f26705a = i10;
        this.f26706b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f26705a) {
            case 0:
                vi.s((vi) this.f26706b);
                return;
            default:
                ((View) this.f26706b).setTag(null);
                return;
        }
    }
}
