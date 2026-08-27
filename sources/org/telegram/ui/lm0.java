package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class lm0 implements TextWatcher {

    public final xm0 f40159a;

    public lm0(xm0 xm0Var) {
        this.f40159a = xm0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z10;
        int iIndexOf;
        xm0 xm0Var = this.f40159a;
        ArrayList arrayList = xm0Var.Q0;
        HashMap map = xm0Var.S0;
        if (xm0Var.V0) {
            return;
        }
        xm0Var.V0 = true;
        String strD = oe.b.d(xm0Var.U[1].getText().toString(), false);
        xm0Var.U[1].setText(strD);
        org.telegram.ui.Components.u30 u30Var = (org.telegram.ui.Components.u30) xm0Var.U[2];
        if (strD.length() == 0) {
            u30Var.setHintText((String) null);
            u30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
            xm0Var.U[0].setText(LocaleController.getString(R.string.ChooseCountry));
        } else {
            int i10 = 4;
            if (strD.length() > 4) {
                while (true) {
                    if (i10 < 1) {
                        str = null;
                        z10 = false;
                        break;
                    }
                    String strSubstring = strD.substring(0, i10);
                    if (((String) map.get(strSubstring)) != null) {
                        String str2 = strD.substring(i10) + xm0Var.U[2].getText().toString();
                        xm0Var.U[1].setText(strSubstring);
                        str = str2;
                        strD = strSubstring;
                        z10 = true;
                        break;
                    }
                    i10--;
                }
                if (!z10) {
                    str = strD.substring(1) + xm0Var.U[2].getText().toString();
                    EditTextBoldCursor editTextBoldCursor = xm0Var.U[1];
                    strD = strD.substring(0, 1);
                    editTextBoldCursor.setText(strD);
                }
            } else {
                str = null;
                z10 = false;
            }
            String str3 = (String) map.get(strD);
            if (str3 == null || (iIndexOf = arrayList.indexOf(str3)) == -1) {
                u30Var.setHintText((String) null);
                u30Var.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                xm0Var.U[0].setText(LocaleController.getString(R.string.WrongCountry));
            } else {
                xm0Var.U[0].setText((CharSequence) arrayList.get(iIndexOf));
                String str4 = (String) xm0Var.T0.get(strD);
                if (str4 != null) {
                    u30Var.setHintText(str4.replace('X', (char) 8211));
                    u30Var.setHint((CharSequence) null);
                }
            }
            if (!z10) {
                EditTextBoldCursor editTextBoldCursor2 = xm0Var.U[1];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
            }
            if (str != null) {
                u30Var.requestFocus();
                u30Var.setText(str);
                u30Var.setSelection(u30Var.length());
            }
        }
        xm0Var.V0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
