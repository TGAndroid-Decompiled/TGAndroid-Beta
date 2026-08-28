package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class km0 implements TextWatcher {
    public final wm0 f39873a;

    public km0(wm0 wm0Var) {
        this.f39873a = wm0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        int indexOf;
        wm0 wm0Var = this.f39873a;
        ArrayList arrayList = wm0Var.Q0;
        HashMap hashMap = wm0Var.S0;
        if (wm0Var.V0) {
            return;
        }
        wm0Var.V0 = true;
        String d = ne.b.d(wm0Var.U[1].getText().toString(), false);
        wm0Var.U[1].setText(d);
        org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) wm0Var.U[2];
        if (d.length() == 0) {
            p30Var.setHintText((String) null);
            p30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            wm0Var.U[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i9 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i9 >= 1) {
                        String substring = d.substring(0, i9);
                        if (((String) hashMap.get(substring)) != null) {
                            wm0Var.U[1].setText(substring);
                            str = d.substring(i9) + wm0Var.U[2].getText().toString();
                            d = substring;
                            z10 = true;
                            break;
                        }
                        i9--;
                    } else {
                        str = null;
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    str = d.substring(1) + wm0Var.U[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = wm0Var.U[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                wm0Var.U[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) wm0Var.T0.get(d);
                if (str3 != null) {
                    p30Var.setHintText(str3.replace('X', (char) 8211));
                    p30Var.setHint((CharSequence) null);
                }
            } else {
                p30Var.setHintText((String) null);
                p30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                wm0Var.U[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = wm0Var.U[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                p30Var.requestFocus();
                p30Var.setText(str);
                p30Var.setSelection(p30Var.length());
            }
        }
        wm0Var.V0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
