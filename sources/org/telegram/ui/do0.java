package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class do0 implements TextWatcher {
    public final lo0 f36270a;

    public do0(lo0 lo0Var) {
        this.f36270a = lo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z4;
        String str2;
        lo0 lo0Var = this.f36270a;
        HashMap hashMap = lo0Var.f38801c;
        if (lo0Var.f38812j0) {
            return;
        }
        lo0Var.f38812j0 = true;
        String d = se.b.d(lo0Var.f38807f[8].getText().toString(), false);
        lo0Var.f38807f[8].setText(d);
        org.telegram.ui.Components.j40 j40Var = (org.telegram.ui.Components.j40) lo0Var.f38807f[9];
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
                            lo0Var.f38807f[8].setText(substring);
                            str = d.substring(i10) + lo0Var.f38807f[9].getText().toString();
                            d = substring;
                            z4 = true;
                            break;
                        }
                        i10--;
                    } else {
                        str = null;
                        z4 = false;
                        break;
                    }
                }
                if (!z4) {
                    str = d.substring(1) + lo0Var.f38807f[9].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = lo0Var.f38807f[8];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z4 = false;
            }
            String str3 = (String) hashMap.get(d);
            if (str3 != null && lo0Var.f38795a.indexOf(str3) != -1 && (str2 = (String) lo0Var.d.get(d)) != null) {
                j40Var.setHintText(str2.replace('X', (char) 8211));
                j40Var.setHint((CharSequence) null);
            } else {
                j40Var.setHintText((String) null);
                j40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            }
            if (!z4) {
                EditTextBoldCursor editTextBoldCursor2 = lo0Var.f38807f[8];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                j40Var.requestFocus();
                j40Var.setText(str);
                j40Var.setSelection(j40Var.length());
            }
        }
        lo0Var.f38812j0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
