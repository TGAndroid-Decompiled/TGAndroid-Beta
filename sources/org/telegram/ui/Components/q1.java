package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f38677a;
    public final EditText f38678b;

    public q1(EditText editText, int i7) {
        this.f38677a = i7;
        this.f38678b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38677a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f38678b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f38678b);
                return;
        }
    }
}
