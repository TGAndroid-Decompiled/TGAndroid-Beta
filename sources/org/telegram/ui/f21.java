package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f21 implements TextWatcher {
    public final int f36166a;
    public final h21 f36167b;

    public f21(h21 h21Var, int i10) {
        this.f36166a = i10;
        this.f36167b = h21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f36166a) {
            case 0:
                this.f36167b.S(true);
                return;
            case 1:
                h21 h21Var = this.f36167b;
                if (!h21Var.K) {
                    EditTextBoldCursor editTextBoldCursor = h21Var.f36841a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(obj.length());
                    int i10 = 0;
                    while (i10 < obj.length()) {
                        int i11 = i10 + 1;
                        String substring = obj.substring(i10, i11);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i10 = i11;
                    }
                    h21Var.K = true;
                    int intValue = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                    if (intValue >= 0 && intValue <= 65535 && obj.equals(sb2.toString())) {
                        if (selectionStart >= 0) {
                            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                        }
                    } else if (intValue < 0) {
                        editTextBoldCursor.setText("0");
                    } else if (intValue > 65535) {
                        editTextBoldCursor.setText("65535");
                    } else {
                        editTextBoldCursor.setText(sb2.toString());
                    }
                    h21Var.K = false;
                    h21Var.S(true);
                    return;
                }
                return;
            default:
                this.f36167b.S(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36166a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36166a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
