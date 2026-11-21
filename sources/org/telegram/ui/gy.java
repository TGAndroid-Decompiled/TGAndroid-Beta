package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gy implements DialogInterface.OnDismissListener {
    public final int f48178a;
    public final EditTextBoldCursor f48179b;

    public gy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f48178a = i7;
        this.f48179b = editTextBoldCursor;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48178a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f48179b);
                return;
            case 1:
                org.telegram.messenger.g0.v1(this.f48179b);
                return;
            default:
                org.telegram.messenger.g0.v1(this.f48179b);
                return;
        }
    }
}
