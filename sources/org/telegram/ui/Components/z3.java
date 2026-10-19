package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class z3 implements TextWatcher {
    public boolean f32825a;
    public final int f32826b;
    public final EditTextBoldCursor f32827c;

    public z3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f32826b = i10;
        this.f32827c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f32825a) {
            int length = editable.length();
            int i10 = this.f32826b;
            if (length > i10) {
                this.f32825a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f32827c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f32825a = false;
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
