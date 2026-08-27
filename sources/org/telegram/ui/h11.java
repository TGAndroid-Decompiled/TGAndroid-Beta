package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class h11 implements TextWatcher {

    public final int f38658a;

    public final j11 f38659b;

    public h11(j11 j11Var, int i10) {
        this.f38658a = i10;
        this.f38659b = j11Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f38658a) {
            case 0:
                this.f38659b.U(true);
                break;
            default:
                j11 j11Var = this.f38659b;
                if (!j11Var.H) {
                    EditTextBoldCursor editTextBoldCursor = j11Var.f39223a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String string = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(string.length());
                    int i10 = 0;
                    while (i10 < string.length()) {
                        int i11 = i10 + 1;
                        String strSubstring = string.substring(i10, i11);
                        if ("0123456789".contains(strSubstring)) {
                            sb2.append(strSubstring);
                        }
                        i10 = i11;
                    }
                    j11Var.H = true;
                    int iIntValue = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                    if (iIntValue < 0 || iIntValue > 65535 || !string.equals(sb2.toString())) {
                        if (iIntValue < 0) {
                            editTextBoldCursor.setText("0");
                        } else if (iIntValue > 65535) {
                            editTextBoldCursor.setText("65535");
                        } else {
                            editTextBoldCursor.setText(sb2.toString());
                        }
                    } else if (selectionStart >= 0) {
                        editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                    }
                    j11Var.H = false;
                    j11Var.U(true);
                    break;
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38658a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38658a;
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
