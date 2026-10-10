package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class no0 implements TextWatcher {
    public final vo0 f40349a;

    public no0(vo0 vo0Var) {
        this.f40349a = vo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        vo0 vo0Var = this.f40349a;
        HashMap hashMap = vo0Var.f42963c;
        if (vo0Var.m0) {
            return;
        }
        vo0Var.m0 = true;
        String d = hf.b.d(vo0Var.f42971f[8].getText().toString(), false);
        vo0Var.f42971f[8].setText(d);
        org.telegram.ui.Components.x40 x40Var = (org.telegram.ui.Components.x40) vo0Var.f42971f[9];
        if (d.length() == 0) {
            x40Var.setHintText((String) null);
            x40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            vo0Var.f42971f[8].setText(substring);
                            str = d.substring(i10) + vo0Var.f42971f[9].getText().toString();
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
                    str = d.substring(1) + vo0Var.f42971f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = vo0Var.f42971f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && vo0Var.f42957a.indexOf(str3) != -1 && (str2 = (String) vo0Var.d.get(d)) != null) {
                x40Var.setHintText(str2.replace('X', (char) 8211));
                x40Var.setHint((CharSequence) null);
            } else {
                x40Var.setHintText((String) null);
                x40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = vo0Var.f42971f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                x40Var.requestFocus();
                x40Var.setText(str);
                x40Var.setSelection(x40Var.length());
            }
        }
        vo0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
