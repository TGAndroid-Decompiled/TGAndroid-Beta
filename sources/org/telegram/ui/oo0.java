package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class oo0 implements TextWatcher {
    public final wo0 f35579a;

    public oo0(wo0 wo0Var) {
        this.f35579a = wo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        wo0 wo0Var = this.f35579a;
        HashMap hashMap = wo0Var.f38260c;
        if (wo0Var.m0) {
            return;
        }
        wo0Var.m0 = true;
        String d = gf.b.d(wo0Var.f38267f[8].getText().toString(), false);
        wo0Var.f38267f[8].setText(d);
        org.telegram.ui.Components.p40 p40Var = (org.telegram.ui.Components.p40) wo0Var.f38267f[9];
        if (d.length() == 0) {
            p40Var.setHintText((String) null);
            p40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            wo0Var.f38267f[8].setText(substring);
                            str = d.substring(i10) + wo0Var.f38267f[9].getText().toString();
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
                    str = d.substring(1) + wo0Var.f38267f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = wo0Var.f38267f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && wo0Var.f38254a.indexOf(str3) != -1 && (str2 = (String) wo0Var.d.get(d)) != null) {
                p40Var.setHintText(str2.replace('X', (char) 8211));
                p40Var.setHint((CharSequence) null);
            } else {
                p40Var.setHintText((String) null);
                p40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = wo0Var.f38267f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                p40Var.requestFocus();
                p40Var.setText(str);
                p40Var.setSelection(p40Var.length());
            }
        }
        wo0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
