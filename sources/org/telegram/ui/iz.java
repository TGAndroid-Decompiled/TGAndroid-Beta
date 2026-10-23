package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class iz implements TextWatcher {
    public final int f38136a;
    public boolean f38137b;
    public final EditTextBoldCursor f38138c;

    public iz(int i10, EditTextBoldCursor editTextBoldCursor) {
        this.f38136a = i10;
        this.f38138c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f38136a) {
            case 0:
                if (!this.f38137b && editable.length() > 32) {
                    this.f38137b = true;
                    editable.delete(32, editable.length());
                    EditTextBoldCursor editTextBoldCursor = this.f38138c;
                    AndroidUtilities.shakeView(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f38137b = false;
                    return;
                }
                return;
            default:
                if (!this.f38137b && editable.length() > 40) {
                    this.f38137b = true;
                    editable.delete(40, editable.length());
                    EditTextBoldCursor editTextBoldCursor2 = this.f38138c;
                    AndroidUtilities.shakeView(editTextBoldCursor2);
                    try {
                        editTextBoldCursor2.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    this.f38137b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38136a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38136a;
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
