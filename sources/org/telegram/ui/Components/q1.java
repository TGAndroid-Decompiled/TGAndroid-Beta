package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class q1 implements DialogInterface.OnDismissListener {
    public final int f38657a;
    public final EditText f38658b;

    public q1(EditText editText, int i7) {
        this.f38657a = i7;
        this.f38658b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38657a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f38658b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f38658b);
                return;
        }
    }
}
