package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class u3 implements TextWatcher {
    public boolean f31533a;
    public final int f31534b;
    public final EditTextBoldCursor f31535c;

    public u3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f31534b = i10;
        this.f31535c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f31533a) {
            int length = editable.length();
            int i10 = this.f31534b;
            if (length > i10) {
                this.f31533a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f31535c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f31533a = false;
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
