package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ey implements DialogInterface.OnDismissListener {
    public final int f45533a;
    public final EditTextBoldCursor f45534b;

    public ey(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f45533a = i7;
        this.f45534b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45533a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f45534b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f45534b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f45534b);
                return;
        }
    }
}
