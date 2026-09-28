package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class y3 implements TextWatcher {
    public boolean f30555a;
    public final int f30556b;
    public final EditTextBoldCursor f30557c;

    public y3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30556b = i10;
        this.f30557c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f30555a) {
            int length = editable.length();
            int i10 = this.f30556b;
            if (length > i10) {
                this.f30555a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f30557c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f30555a = false;
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
