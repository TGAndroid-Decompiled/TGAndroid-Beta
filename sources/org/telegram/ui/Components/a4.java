package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class a4 implements TextWatcher {
    public boolean f23119a;
    public final int f23120b;
    public final EditTextBoldCursor f23121c;

    public a4(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f23120b = i10;
        this.f23121c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f23119a) {
            int length = editable.length();
            int i10 = this.f23120b;
            if (length > i10) {
                this.f23119a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f23121c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f23119a = false;
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
