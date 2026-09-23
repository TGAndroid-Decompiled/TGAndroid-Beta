package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class io0 implements TextWatcher {
    public final qo0 f34224a;

    public io0(qo0 qo0Var) {
        this.f34224a = qo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        qo0 qo0Var = this.f34224a;
        HashMap hashMap = qo0Var.f36489c;
        if (qo0Var.m0) {
            return;
        }
        qo0Var.m0 = true;
        String d = gf.b.d(qo0Var.f36496f[8].getText().toString(), false);
        qo0Var.f36496f[8].setText(d);
        org.telegram.ui.Components.g40 g40Var = (org.telegram.ui.Components.g40) qo0Var.f36496f[9];
        if (d.length() == 0) {
            g40Var.setHintText((String) null);
            g40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            qo0Var.f36496f[8].setText(substring);
                            str = d.substring(i10) + qo0Var.f36496f[9].getText().toString();
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
                    str = d.substring(1) + qo0Var.f36496f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = qo0Var.f36496f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && qo0Var.f36483a.indexOf(str3) != -1 && (str2 = (String) qo0Var.d.get(d)) != null) {
                g40Var.setHintText(str2.replace('X', (char) 8211));
                g40Var.setHint((CharSequence) null);
            } else {
                g40Var.setHintText((String) null);
                g40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = qo0Var.f36496f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                g40Var.requestFocus();
                g40Var.setText(str);
                g40Var.setSelection(g40Var.length());
            }
        }
        qo0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
