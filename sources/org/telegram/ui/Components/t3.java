package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class t3 implements TextWatcher {
    public boolean f32605a;
    public final int f32606b;
    public final EditTextBoldCursor f32607c;

    public t3(int i9, EditTextBoldCursor editTextBoldCursor) {
        this.f32606b = i9;
        this.f32607c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f32605a) {
            int length = editable.length();
            int i9 = this.f32606b;
            if (length > i9) {
                this.f32605a = true;
                editable.delete(i9, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f32607c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f32605a = false;
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
