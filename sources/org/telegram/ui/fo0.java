package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fo0 implements TextWatcher {
    public final no0 f33850a;

    public fo0(no0 no0Var) {
        this.f33850a = no0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        String str2;
        no0 no0Var = this.f33850a;
        HashMap hashMap = no0Var.f36055c;
        if (no0Var.m0) {
            return;
        }
        no0Var.m0 = true;
        String d = gf.b.d(no0Var.f36062f[8].getText().toString(), false);
        no0Var.f36062f[8].setText(d);
        org.telegram.ui.Components.j40 j40Var = (org.telegram.ui.Components.j40) no0Var.f36062f[9];
        if (d.length() == 0) {
            j40Var.setHintText((String) null);
            j40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            no0Var.f36062f[8].setText(substring);
                            str = d.substring(i10) + no0Var.f36062f[9].getText().toString();
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
                    str = d.substring(1) + no0Var.f36062f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = no0Var.f36062f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && no0Var.f36049a.indexOf(str3) != -1 && (str2 = (String) no0Var.d.get(d)) != null) {
                j40Var.setHintText(str2.replace('X', (char) 8211));
                j40Var.setHint((CharSequence) null);
            } else {
                j40Var.setHintText((String) null);
                j40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = no0Var.f36062f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                j40Var.requestFocus();
                j40Var.setText(str);
                j40Var.setSelection(j40Var.length());
            }
        }
        no0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
