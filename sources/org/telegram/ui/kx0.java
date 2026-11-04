package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kx0 implements TextWatcher {
    public final int f47048a;
    public final mx0 f47049b;

    public kx0(mx0 mx0Var, int i3) {
        this.f47048a = i3;
        this.f47049b = mx0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f47048a) {
            case 0:
                this.f47049b.Z(true);
                return;
            case 1:
                mx0 mx0Var = this.f47049b;
                if (!mx0Var.L) {
                    EditTextBoldCursor editTextBoldCursor = mx0Var.f47810a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb2 = new StringBuilder(obj.length());
                    int i3 = 0;
                    while (i3 < obj.length()) {
                        int i10 = i3 + 1;
                        String substring = obj.substring(i3, i10);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i3 = i10;
                    }
                    mx0Var.L = true;
                    int intValue = Utilities.z(sb2.toString()).intValue();
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
                    mx0Var.L = false;
                    mx0Var.Z(true);
                    return;
                }
                return;
            default:
                this.f47049b.Z(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f47048a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f47048a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
