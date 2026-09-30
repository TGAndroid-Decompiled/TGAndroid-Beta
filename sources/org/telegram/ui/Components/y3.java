package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class y3 implements TextWatcher {
    public boolean f30554a;
    public final int f30555b;
    public final EditTextBoldCursor f30556c;

    public y3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30555b = i10;
        this.f30556c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f30554a) {
            int length = editable.length();
            int i10 = this.f30555b;
            if (length > i10) {
                this.f30554a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f30556c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f30554a = false;
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
