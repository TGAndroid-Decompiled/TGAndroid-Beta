package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class i1 implements DialogInterface.OnDismissListener {
    public final int f26979a;
    public final EditText f26980b;

    public i1(EditText editText, int i10) {
        this.f26979a = i10;
        this.f26980b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26979a) {
            case 0:
                org.telegram.messenger.i0.v1(this.f26980b);
                return;
            default:
                org.telegram.messenger.i0.v1(this.f26980b);
                return;
        }
    }
}
