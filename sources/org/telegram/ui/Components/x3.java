package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class x3 implements TextWatcher {
    public boolean f34561a;
    public final int f34562b;
    public final EditTextBoldCursor f34563c;

    public x3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f34562b = i10;
        this.f34563c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f34561a) {
            int length = editable.length();
            int i10 = this.f34562b;
            if (length > i10) {
                this.f34561a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f34563c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f34561a = false;
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
