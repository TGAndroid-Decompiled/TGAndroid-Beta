package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class i1 implements DialogInterface.OnDismissListener {
    public final int f34414a;
    public final EditText f34415b;

    public i1(EditText editText, int i7) {
        this.f34414a = i7;
        this.f34415b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34414a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f34415b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f34415b);
                return;
        }
    }
}
