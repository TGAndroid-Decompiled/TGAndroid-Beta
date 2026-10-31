package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class i1 implements DialogInterface.OnDismissListener {
    public final int f26861a;
    public final EditText f26862b;

    public i1(EditText editText, int i10) {
        this.f26861a = i10;
        this.f26862b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26861a) {
            case 0:
                org.telegram.messenger.i0.v1(this.f26862b);
                return;
            default:
                org.telegram.messenger.i0.v1(this.f26862b);
                return;
        }
    }
}
