package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class h1 implements DialogInterface.OnDismissListener {
    public final int f34116a;
    public final EditText f34117b;

    public h1(EditText editText, int i7) {
        this.f34116a = i7;
        this.f34117b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34116a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f34117b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f34117b);
                return;
        }
    }
}
