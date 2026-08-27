package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

public final class t3 implements TextWatcher {

    public boolean f32643a;

    public final int f32644b;

    public final EditTextBoldCursor f32645c;

    public t3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f32644b = i10;
        this.f32645c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.f32643a) {
            return;
        }
        int length = editable.length();
        int i10 = this.f32644b;
        if (length > i10) {
            this.f32643a = true;
            editable.delete(i10, editable.length());
            EditTextBoldCursor editTextBoldCursor = this.f32645c;
            AndroidUtilities.shakeView(editTextBoldCursor);
            try {
                editTextBoldCursor.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f32643a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
