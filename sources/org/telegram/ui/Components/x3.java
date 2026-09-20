package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class x3 implements TextWatcher {
    public boolean f30155a;
    public final int f30156b;
    public final EditTextBoldCursor f30157c;

    public x3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30156b = i10;
        this.f30157c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f30155a) {
            int length = editable.length();
            int i10 = this.f30156b;
            if (length > i10) {
                this.f30155a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f30157c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f30155a = false;
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
