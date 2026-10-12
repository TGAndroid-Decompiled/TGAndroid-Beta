package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class a4 implements TextWatcher {
    public boolean f23430a;
    public final int f23431b;
    public final EditTextBoldCursor f23432c;

    public a4(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f23431b = i10;
        this.f23432c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f23430a) {
            int length = editable.length();
            int i10 = this.f23431b;
            if (length > i10) {
                this.f23430a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f23432c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f23430a = false;
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
