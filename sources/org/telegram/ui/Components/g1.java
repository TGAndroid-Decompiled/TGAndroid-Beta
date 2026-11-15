package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class g1 implements DialogInterface.OnDismissListener {
    public final int f34771a;
    public final EditText f34772b;

    public g1(EditText editText, int i7) {
        this.f34771a = i7;
        this.f34772b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34771a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f34772b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f34772b);
                return;
        }
    }
}
