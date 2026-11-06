package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class i1 implements DialogInterface.OnDismissListener {
    public final int f34465a;
    public final EditText f34466b;

    public i1(EditText editText, int i7) {
        this.f34465a = i7;
        this.f34466b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34465a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f34466b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f34466b);
                return;
        }
    }
}
