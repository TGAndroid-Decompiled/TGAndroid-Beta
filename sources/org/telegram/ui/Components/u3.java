package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class u3 implements TextWatcher {
    public boolean f31486a;
    public final int f31487b;
    public final EditTextBoldCursor f31488c;

    public u3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f31487b = i10;
        this.f31488c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f31486a) {
            int length = editable.length();
            int i10 = this.f31487b;
            if (length > i10) {
                this.f31486a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f31488c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f31486a = false;
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
