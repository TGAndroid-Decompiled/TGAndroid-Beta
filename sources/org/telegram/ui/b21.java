package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b21 implements TextWatcher {
    public final int f35330a;
    public final d21 f35331b;

    public b21(d21 d21Var, int i10) {
        this.f35330a = i10;
        this.f35331b = d21Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f35330a) {
            case 0:
                this.f35331b.U(true);
                return;
            case 1:
                d21 d21Var = this.f35331b;
                if (!d21Var.H) {
                    EditTextBoldCursor editTextBoldCursor = d21Var.f35946a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb = new StringBuilder(obj.length());
                    int i10 = 0;
                    while (i10 < obj.length()) {
                        int i11 = i10 + 1;
                        String substring = obj.substring(i10, i11);
                        if ("0123456789".contains(substring)) {
                            sb.append(substring);
                        }
                        i10 = i11;
                    }
                    d21Var.H = true;
                    int intValue = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                    if (intValue >= 0 && intValue <= 65535 && obj.equals(sb.toString())) {
                        if (selectionStart >= 0) {
                            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                        }
                    } else if (intValue < 0) {
                        editTextBoldCursor.setText("0");
                    } else if (intValue > 65535) {
                        editTextBoldCursor.setText("65535");
                    } else {
                        editTextBoldCursor.setText(sb.toString());
                    }
                    d21Var.H = false;
                    d21Var.U(true);
                    return;
                }
                return;
            default:
                this.f35331b.U(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35330a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35330a;
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
