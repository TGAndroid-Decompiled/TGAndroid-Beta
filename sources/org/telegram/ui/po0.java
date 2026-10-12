package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class po0 implements TextWatcher {
    public final xo0 f41064a;

    public po0(xo0 xo0Var) {
        this.f41064a = xo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        xo0 xo0Var = this.f41064a;
        HashMap hashMap = xo0Var.f44096c;
        if (xo0Var.m0) {
            return;
        }
        xo0Var.m0 = true;
        String d = hf.b.d(xo0Var.f44104f[8].getText().toString(), false);
        xo0Var.f44104f[8].setText(d);
        org.telegram.ui.Components.z40 z40Var = (org.telegram.ui.Components.z40) xo0Var.f44104f[9];
        if (d.length() == 0) {
            z40Var.setHintText((String) null);
            z40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            xo0Var.f44104f[8].setText(substring);
                            str = d.substring(i10) + xo0Var.f44104f[9].getText().toString();
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
                    str = d.substring(1) + xo0Var.f44104f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = xo0Var.f44104f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && xo0Var.f44090a.indexOf(str3) != -1 && (str2 = (String) xo0Var.d.get(d)) != null) {
                z40Var.setHintText(str2.replace('X', (char) 8211));
                z40Var.setHint((CharSequence) null);
            } else {
                z40Var.setHintText((String) null);
                z40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = xo0Var.f44104f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                z40Var.requestFocus();
                z40Var.setText(str);
                z40Var.setSelection(z40Var.length());
            }
        }
        xo0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
