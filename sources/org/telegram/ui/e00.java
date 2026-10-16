package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e00 implements TextWatcher {
    public final int f35163a;
    public boolean f35164b;
    public final EditTextBoldCursor f35165c;

    public e00(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f35163a = i10;
        this.f35165c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f35163a) {
            case 0:
                if (!this.f35164b && editable.length() > 32) {
                    this.f35164b = true;
                    editable.delete(32, editable.length());
                    EditTextBoldCursor editTextBoldCursor = this.f35165c;
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f35164b = false;
                    return;
                }
                return;
            default:
                if (!this.f35164b && editable.length() > 40) {
                    this.f35164b = true;
                    editable.delete(40, editable.length());
                    EditTextBoldCursor editTextBoldCursor2 = this.f35165c;
                    AndroidUtilities.shakeView(editTextBoldCursor2);
                    try {
                        editTextBoldCursor2.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    this.f35164b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35163a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35163a;
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
