package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kz implements TextWatcher {
    public final int f40042a;
    public boolean f40043b;
    public final EditTextBoldCursor f40044c;

    public kz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f40042a = i10;
        this.f40044c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f40042a) {
            case 0:
                if (!this.f40043b && editable.length() > 32) {
                    this.f40043b = true;
                    editable.delete(32, editable.length());
                    EditTextBoldCursor editTextBoldCursor = this.f40044c;
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f40043b = false;
                    return;
                }
                return;
            default:
                if (!this.f40043b && editable.length() > 40) {
                    this.f40043b = true;
                    editable.delete(40, editable.length());
                    EditTextBoldCursor editTextBoldCursor2 = this.f40044c;
                    AndroidUtilities.shakeView(editTextBoldCursor2);
                    try {
                        editTextBoldCursor2.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    this.f40043b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40042a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40042a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
