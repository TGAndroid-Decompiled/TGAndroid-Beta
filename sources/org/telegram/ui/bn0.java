package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bn0 implements TextWatcher {
    public final on0 f31298a;

    public bn0(on0 on0Var) {
        this.f31298a = on0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        int indexOf;
        on0 on0Var = this.f31298a;
        ArrayList arrayList = on0Var.U0;
        HashMap hashMap = on0Var.W0;
        if (on0Var.Z0) {
            return;
        }
        on0Var.Z0 = true;
        String d = gf.b.d(on0Var.Y[1].getText().toString(), false);
        on0Var.Y[1].setText(d);
        org.telegram.ui.Components.p40 p40Var = (org.telegram.ui.Components.p40) on0Var.Y[2];
        if (d.length() == 0) {
            p40Var.setHintText((String) null);
            p40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            on0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            on0Var.Y[1].setText(substring);
                            str = d.substring(i10) + on0Var.Y[2].getText().toString();
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
                    str = d.substring(1) + on0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = on0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                on0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) on0Var.X0.get(d);
                if (str3 != null) {
                    p40Var.setHintText(str3.replace('X', (char) 8211));
                    p40Var.setHint((CharSequence) null);
                }
            } else {
                p40Var.setHintText((String) null);
                p40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                on0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = on0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                p40Var.requestFocus();
                p40Var.setText(str);
                p40Var.setSelection(p40Var.length());
            }
        }
        on0Var.Z0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
