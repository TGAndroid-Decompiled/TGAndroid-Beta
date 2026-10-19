package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jm0 implements TextWatcher {
    public final vm0 f38276a;

    public jm0(vm0 vm0Var) {
        this.f38276a = vm0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        vm0 vm0Var = this.f38276a;
        ArrayList arrayList = vm0Var.U0;
        HashMap hashMap = vm0Var.W0;
        if (vm0Var.Z0) {
            return;
        }
        vm0Var.Z0 = true;
        String d = jf.b.d(vm0Var.Y[1].getText().toString(), false);
        vm0Var.Y[1].setText(d);
        org.telegram.ui.Components.o40 o40Var = (org.telegram.ui.Components.o40) vm0Var.Y[2];
        if (d.length() == 0) {
            o40Var.setHintText((String) null);
            o40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            vm0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            vm0Var.Y[1].setText(substring);
                            str = d.substring(i10) + vm0Var.Y[2].getText().toString();
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
                    str = d.substring(1) + vm0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = vm0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                vm0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) vm0Var.X0.get(d);
                if (str3 != null) {
                    o40Var.setHintText(str3.replace('X', (char) 8211));
                    o40Var.setHint((CharSequence) null);
                }
            } else {
                o40Var.setHintText((String) null);
                o40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                vm0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = vm0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                o40Var.requestFocus();
                o40Var.setText(str);
                o40Var.setSelection(o40Var.length());
            }
        }
        vm0Var.Z0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
