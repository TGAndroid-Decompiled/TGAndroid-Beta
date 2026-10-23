package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ao0 implements TextWatcher {
    public final io0 f35763a;

    public ao0(io0 io0Var) {
        this.f35763a = io0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        io0 io0Var = this.f35763a;
        HashMap hashMap = io0Var.f38293c;
        if (io0Var.m0) {
            return;
        }
        io0Var.m0 = true;
        String d = jf.b.d(io0Var.f38300f[8].getText().toString(), false);
        io0Var.f38300f[8].setText(d);
        org.telegram.ui.Components.o40 o40Var = (org.telegram.ui.Components.o40) io0Var.f38300f[9];
        if (d.length() == 0) {
            o40Var.setHintText((String) null);
            o40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            io0Var.f38300f[8].setText(substring);
                            str = d.substring(i10) + io0Var.f38300f[9].getText().toString();
                            d = substring;
                            z10 = true;
                            break;
                        }
                        i10--;
                    } else {
                        z10 = false;
                        str = null;
                        break;
                    }
                }
                if (!z10) {
                    str = d.substring(1) + io0Var.f38300f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = io0Var.f38300f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && io0Var.f38287a.indexOf(str3) != -1 && (str2 = (String) io0Var.d.get(d)) != null) {
                o40Var.setHintText(str2.replace('X', (char) 8211));
                o40Var.setHint((CharSequence) null);
            } else {
                o40Var.setHintText((String) null);
                o40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = io0Var.f38300f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                o40Var.requestFocus();
                o40Var.setText(str);
                o40Var.setSelection(o40Var.length());
            }
        }
        io0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
