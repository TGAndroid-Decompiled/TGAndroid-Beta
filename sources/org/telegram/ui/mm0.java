package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mm0 implements TextWatcher {
    public final zm0 f39624a;

    public mm0(zm0 zm0Var) {
        this.f39624a = zm0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        zm0 zm0Var = this.f39624a;
        ArrayList arrayList = zm0Var.U0;
        HashMap hashMap = zm0Var.W0;
        if (zm0Var.Z0) {
            return;
        }
        zm0Var.Z0 = true;
        String d = jf.b.d(zm0Var.Y[1].getText().toString(), false);
        zm0Var.Y[1].setText(d);
        org.telegram.ui.Components.m40 m40Var = (org.telegram.ui.Components.m40) zm0Var.Y[2];
        if (d.length() == 0) {
            m40Var.setHintText((String) null);
            m40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            zm0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            zm0Var.Y[1].setText(substring);
                            str = d.substring(i10) + zm0Var.Y[2].getText().toString();
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
                    str = d.substring(1) + zm0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = zm0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                zm0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) zm0Var.X0.get(d);
                if (str3 != null) {
                    m40Var.setHintText(str3.replace('X', (char) 8211));
                    m40Var.setHint((CharSequence) null);
                }
            } else {
                m40Var.setHintText((String) null);
                m40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                zm0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = zm0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                m40Var.requestFocus();
                m40Var.setText(str);
                m40Var.setSelection(m40Var.length());
            }
        }
        zm0Var.Z0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
