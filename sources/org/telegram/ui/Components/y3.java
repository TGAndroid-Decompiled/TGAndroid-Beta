package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class y3 implements TextWatcher {
    public boolean f30560a;
    public final int f30561b;
    public final EditTextBoldCursor f30562c;

    public y3(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f30561b = i10;
        this.f30562c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f30560a) {
            int length = editable.length();
            int i10 = this.f30561b;
            if (length > i10) {
                this.f30560a = true;
                editable.delete(i10, editable.length());
                EditTextBoldCursor editTextBoldCursor = this.f30562c;
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f30560a = false;
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
