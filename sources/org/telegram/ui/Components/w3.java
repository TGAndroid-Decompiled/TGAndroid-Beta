package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class w3 implements TextWatcher {
    public boolean f29506a;
    public final int f29507b;
    public final EditTextBoldCursor f29508c;

    public w3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f29507b = i10;
        this.f29508c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f29506a) {
            int length = editable.length();
            int i10 = this.f29507b;
            if (length > i10) {
                this.f29506a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f29508c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f29506a = false;
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
