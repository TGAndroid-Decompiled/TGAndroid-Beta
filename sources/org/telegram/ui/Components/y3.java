package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class y3 implements TextWatcher {
    public boolean f32836a;
    public final int f32837b;
    public final EditTextBoldCursor f32838c;

    public y3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f32837b = i10;
        this.f32838c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f32836a) {
            int length = editable.length();
            int i10 = this.f32837b;
            if (length > i10) {
                this.f32836a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f32838c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f32836a = false;
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
