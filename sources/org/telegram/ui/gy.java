package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gy implements TextWatcher {
    public final int f46175a;
    public boolean f46176b;
    public final EditTextBoldCursor f46177c;

    public gy(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.f46175a = i7;
        this.f46177c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f46175a) {
            case 0:
                if (!this.f46176b && editable.length() > 32) {
                    this.f46176b = true;
                    editable.delete(32, editable.length());
                    EditTextBoldCursor editTextBoldCursor = this.f46177c;
                    org.telegram.messenger.g0.F3(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f46176b = false;
                    return;
                }
                return;
            default:
                if (!this.f46176b && editable.length() > 40) {
                    this.f46176b = true;
                    editable.delete(40, editable.length());
                    EditTextBoldCursor editTextBoldCursor2 = this.f46177c;
                    org.telegram.messenger.g0.F3(editTextBoldCursor2);
                    try {
                        editTextBoldCursor2.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    this.f46176b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f46175a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f46175a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
