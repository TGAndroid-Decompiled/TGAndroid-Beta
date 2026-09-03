package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class u3 implements TextWatcher {
    public boolean f29090a;
    public final int f29091b;
    public final EditTextBoldCursor f29092c;

    public u3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f29091b = i10;
        this.f29092c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f29090a) {
            int length = editable.length();
            int i10 = this.f29091b;
            if (length > i10) {
                this.f29090a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f29092c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f29090a = false;
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
