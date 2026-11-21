package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f39039a;
    public final EditText f39040b;

    public r1(EditText editText, int i7) {
        this.f39039a = i7;
        this.f39040b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39039a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f39040b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f39040b);
                return;
        }
    }
}
