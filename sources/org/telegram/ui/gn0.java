package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gn0 implements TextWatcher {
    public final un0 f36442a;

    public gn0(un0 un0Var) {
        this.f36442a = un0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        un0 un0Var = this.f36442a;
        ArrayList arrayList = un0Var.U0;
        HashMap hashMap = un0Var.W0;
        if (un0Var.Z0) {
            return;
        }
        un0Var.Z0 = true;
        String d = jf.b.d(un0Var.Y[1].getText().toString(), false);
        un0Var.Y[1].setText(d);
        org.telegram.ui.Components.s40 s40Var = (org.telegram.ui.Components.s40) un0Var.Y[2];
        if (d.length() == 0) {
            s40Var.setHintText((String) null);
            s40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            un0Var.Y[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (d.length() > 4) {
                while (true) {
                    if (i10 >= 1) {
                        String substring = d.substring(0, i10);
                        if (((String) hashMap.get(substring)) != null) {
                            un0Var.Y[1].setText(substring);
                            str = d.substring(i10) + un0Var.Y[2].getText().toString();
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
                    str = d.substring(1) + un0Var.Y[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = un0Var.Y[1];
                    d = d.substring(0, 1);
                    editTextBoldCursor.setText(d);
                }
            } else {
                z10 = false;
                str = null;
            }
            String str2 = (String) hashMap.get(d);
            if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                un0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                String str3 = (String) un0Var.X0.get(d);
                if (str3 != null) {
                    s40Var.setHintText(str3.replace('X', (char) 8211));
                    s40Var.setHint((CharSequence) null);
                }
            } else {
                s40Var.setHintText((String) null);
                s40Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                un0Var.Y[0].setText(LocaleController.getString(R.string.WrongCountry));
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = un0Var.Y[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                s40Var.requestFocus();
                s40Var.setText(str);
                s40Var.setSelection(s40Var.length());
            }
        }
        un0Var.Z0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
