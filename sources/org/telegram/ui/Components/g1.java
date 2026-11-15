package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class g1 implements DialogInterface.OnDismissListener {
    public final int f34775a;
    public final EditText f34776b;

    public g1(EditText editText, int i7) {
        this.f34775a = i7;
        this.f34776b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34775a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f34776b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f34776b);
                return;
        }
    }
}
