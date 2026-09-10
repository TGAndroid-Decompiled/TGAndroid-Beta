package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class x3 implements TextWatcher {
    public boolean f28925a;
    public final int f28926b;
    public final EditTextBoldCursor f28927c;

    public x3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f28926b = i10;
        this.f28927c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f28925a) {
            int length = editable.length();
            int i10 = this.f28926b;
            if (length > i10) {
                this.f28925a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f28927c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f28925a = false;
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
