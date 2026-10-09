package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class an0 implements TextWatcher {
    public final nn0 f35970a;

    public an0(nn0 nn0Var) {
        this.f35970a = nn0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        nn0 nn0Var = this.f35970a;
        ArrayList arrayList = nn0Var.U0;
        HashMap hashMap = nn0Var.W0;
        if (nn0Var.Z0) {
            return;
        }
        nn0Var.Z0 = true;
        String d = hf.b.d(nn0Var.Y[1].getText().toString(), false);
        nn0Var.Y[1].setText(d);
        org.telegram.ui.Components.w40 w40Var = (org.telegram.ui.Components.w40) nn0Var.Y[2];
        if (d.length() == 0) {
            w40Var.setHintText((String) null);
            w40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            nn0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            nn0Var.Y[1].setText(substring);
                            str = d.substring(i10) + nn0Var.Y[2].getText().toString();
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
                    str = d.substring(1) + nn0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = nn0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                nn0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) nn0Var.X0.get(d);
                if (str3 != null) {
                    w40Var.setHintText(str3.replace('X', (char) 8211));
                    w40Var.setHint((CharSequence) null);
                }
            } else {
                w40Var.setHintText((String) null);
                w40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                nn0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = nn0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                w40Var.requestFocus();
                w40Var.setText(str);
                w40Var.setSelection(w40Var.length());
            }
        }
        nn0Var.Z0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
