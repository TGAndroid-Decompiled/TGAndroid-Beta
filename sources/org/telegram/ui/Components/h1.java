package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class h1 implements DialogInterface.OnDismissListener {
    public final int f34256a;
    public final EditText f34257b;

    public h1(EditText editText, int i3) {
        this.f34256a = i3;
        this.f34257b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34256a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f34257b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f34257b);
                return;
        }
    }
}
