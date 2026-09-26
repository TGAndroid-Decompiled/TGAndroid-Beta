package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class go0 implements TextWatcher {
    public final oo0 f34030a;

    public go0(oo0 oo0Var) {
        this.f34030a = oo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        oo0 oo0Var = this.f34030a;
        HashMap hashMap = oo0Var.f36282c;
        if (oo0Var.m0) {
            return;
        }
        oo0Var.m0 = true;
        String d = gf.b.d(oo0Var.f36289f[8].getText().toString(), false);
        oo0Var.f36289f[8].setText(d);
        org.telegram.ui.Components.h40 h40Var = (org.telegram.ui.Components.h40) oo0Var.f36289f[9];
        if (d.length() == 0) {
            h40Var.setHintText((String) null);
            h40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            oo0Var.f36289f[8].setText(substring);
                            str = d.substring(i10) + oo0Var.f36289f[9].getText().toString();
                            d = substring;
                            z10 = true;
                            break;
                        }
                        i10--;
                    } else {
                        str = null;
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    str = d.substring(1) + oo0Var.f36289f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = oo0Var.f36289f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && oo0Var.f36276a.indexOf(str3) != -1 && (str2 = (String) oo0Var.d.get(d)) != null) {
                h40Var.setHintText(str2.replace('X', (char) 8211));
                h40Var.setHint((CharSequence) null);
            } else {
                h40Var.setHintText((String) null);
                h40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = oo0Var.f36289f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                h40Var.requestFocus();
                h40Var.setText(str);
                h40Var.setSelection(h40Var.length());
            }
        }
        oo0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
