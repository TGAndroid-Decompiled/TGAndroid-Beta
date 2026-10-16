package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f26391a;
    public final KeyEvent.Callback f26392b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f26391a = i10;
        this.f26392b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f26391a) {
            case 0:
                vi.s((vi) this.f26392b);
                return;
            default:
                ((View) this.f26392b).setTag(null);
                return;
        }
    }
}
