package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i11 implements TextWatcher {
    public final int f38986a;
    public final k11 f38987b;

    public i11(k11 k11Var, int i9) {
        this.f38986a = i9;
        this.f38987b = k11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f38986a) {
            case 0:
                this.f38987b.T(true);
                return;
            default:
                k11 k11Var = this.f38987b;
                if (!k11Var.H) {
                    EditTextBoldCursor editTextBoldCursor = k11Var.f39665a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(obj.length());
                    int i9 = 0;
                    while (i9 < obj.length()) {
                        int i10 = i9 + 1;
                        String substring = obj.substring(i9, i10);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i9 = i10;
                    }
                    k11Var.H = true;
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
                    k11Var.H = false;
                    k11Var.T(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f38986a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f38986a;
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
