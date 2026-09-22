package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class w3 implements TextWatcher {
    public boolean f29553a;
    public final int f29554b;
    public final EditTextBoldCursor f29555c;

    public w3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f29554b = i10;
        this.f29555c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f29553a) {
            int length = editable.length();
            int i10 = this.f29554b;
            if (length > i10) {
                this.f29553a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f29555c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f29553a = false;
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
