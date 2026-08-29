package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
public final class r1 implements DialogInterface.OnDismissListener {
    public final int f32156a;
    public final EditText f32157b;

    public r1(EditText editText, int i10) {
        this.f32156a = i10;
        this.f32157b = editText;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32156a) {
            case 0:
                AndroidUtilities.hideKeyboard(this.f32157b);
                return;
            default:
                AndroidUtilities.hideKeyboard(this.f32157b);
                return;
        }
    }
}
