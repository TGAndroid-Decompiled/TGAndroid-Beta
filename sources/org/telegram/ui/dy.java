package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dy implements DialogInterface.OnDismissListener {
    public final int f46501a;
    public final EditTextBoldCursor f46502b;

    public dy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f46501a = i7;
        this.f46502b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46501a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f46502b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f46502b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f46502b);
                return;
        }
    }
}
