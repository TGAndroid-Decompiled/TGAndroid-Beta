package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class im0 implements TextWatcher {
    public final vm0 f39294a;

    public im0(vm0 vm0Var) {
        this.f39294a = vm0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        int indexOf;
        vm0 vm0Var = this.f39294a;
        ArrayList arrayList = vm0Var.Q0;
        HashMap hashMap = vm0Var.S0;
        if (vm0Var.V0) {
            return;
        }
        vm0Var.V0 = true;
        String d = qe.b.d(vm0Var.U[1].getText().toString(), false);
        vm0Var.U[1].setText(d);
        org.telegram.ui.Components.d40 d40Var = (org.telegram.ui.Components.d40) vm0Var.U[2];
        if (d.length() == 0) {
            d40Var.setHintText((String) null);
            d40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            vm0Var.U[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            vm0Var.U[1].setText(substring);
                            str = d.substring(i10) + vm0Var.U[2].getText().toString();
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
                    str = d.substring(1) + vm0Var.U[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = vm0Var.U[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                vm0Var.U[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) vm0Var.T0.get(d);
                if (str3 != null) {
                    d40Var.setHintText(str3.replace('X', (char) 8211));
                    d40Var.setHint((CharSequence) null);
                }
            } else {
                d40Var.setHintText((String) null);
                d40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                vm0Var.U[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = vm0Var.U[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                d40Var.requestFocus();
                d40Var.setText(str);
                d40Var.setSelection(d40Var.length());
            }
        }
        vm0Var.V0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
