package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jo0 implements TextWatcher {
    public final ro0 f34829a;

    public jo0(ro0 ro0Var) {
        this.f34829a = ro0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        ro0 ro0Var = this.f34829a;
        HashMap hashMap = ro0Var.f37173c;
        if (ro0Var.m0) {
            return;
        }
        ro0Var.m0 = true;
        String d = gf.b.d(ro0Var.f37180f[8].getText().toString(), false);
        ro0Var.f37180f[8].setText(d);
        org.telegram.ui.Components.i40 i40Var = (org.telegram.ui.Components.i40) ro0Var.f37180f[9];
        if (d.length() == 0) {
            i40Var.setHintText((String) null);
            i40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            ro0Var.f37180f[8].setText(substring);
                            str = d.substring(i10) + ro0Var.f37180f[9].getText().toString();
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
                    str = d.substring(1) + ro0Var.f37180f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = ro0Var.f37180f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && ro0Var.f37167a.indexOf(str3) != -1 && (str2 = (String) ro0Var.d.get(d)) != null) {
                i40Var.setHintText(str2.replace('X', (char) 8211));
                i40Var.setHint((CharSequence) null);
            } else {
                i40Var.setHintText((String) null);
                i40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = ro0Var.f37180f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                i40Var.requestFocus();
                i40Var.setText(str);
                i40Var.setSelection(i40Var.length());
            }
        }
        ro0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
