package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class gn0 implements TextWatcher {

    public boolean f38450a;

    public String f38451b;

    public boolean f38452c;
    public int d;

    public int f38453e;

    public boolean f38454f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};

    public final do0 f38455n;

    public gn0(do0 do0Var) {
        this.f38455n = do0Var;
    }

    public final int a(String str) {
        int i10 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i10 >= cArr.length) {
                return -1;
            }
            int iIndexOf = str.indexOf(cArr[i10]);
            if (iIndexOf >= 0) {
                return iIndexOf;
            }
            i10++;
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        do0 do0Var = this.f38455n;
        if (do0Var.f37466i0) {
            return;
        }
        Long l10 = do0Var.D0;
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        String strFixNumbers = this.f38451b;
        if (strFixNumbers == null) {
            strFixNumbers = LocaleController.fixNumbers(editable.toString());
        }
        int iA = a(strFixNumbers);
        boolean z10 = iA >= 0;
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(do0Var.f37487y0.invoice.currency);
        String strSubstring = iA >= 0 ? strFixNumbers.substring(0, iA) : strFixNumbers;
        String currencyString = "";
        String strSubstring2 = iA >= 0 ? strFixNumbers.substring(iA + 1) : "";
        long jLongValue2 = Utilities.parseLong(oe.b.d(strSubstring, false)).longValue() * ((long) currencyExpDivider);
        long jLongValue3 = Utilities.parseLong(oe.b.d(strSubstring2, false)).longValue();
        String strL = a9.p.l(jLongValue3, "");
        String str = "" + (currencyExpDivider - 1);
        if (iA > 0 && strL.length() > str.length()) {
            jLongValue3 = Utilities.parseLong(this.f38453e - iA < strL.length() ? strL.substring(0, str.length()) : strL.substring(strL.length() - str.length())).longValue();
        }
        Long lValueOf = Long.valueOf(jLongValue2 + jLongValue3);
        do0Var.D0 = lValueOf;
        if (do0Var.f37487y0.invoice.max_tip_amount != 0) {
            long jLongValue4 = lValueOf.longValue();
            long j10 = do0Var.f37487y0.invoice.max_tip_amount;
            if (jLongValue4 > j10) {
                do0Var.D0 = Long.valueOf(j10);
            }
        }
        int selectionStart = do0Var.f37462f[0].getSelectionStart();
        do0Var.f37466i0 = true;
        if (do0Var.D0.longValue() == 0) {
            do0Var.f37462f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = do0Var.f37462f[0];
            currencyString = LocaleController.getInstance().formatCurrencyString(do0Var.D0.longValue(), false, z10, true, do0Var.f37487y0.invoice.currency);
            editTextBoldCursor.setText(currencyString);
        }
        if (jLongValue < do0Var.D0.longValue() && jLongValue != 0 && this.f38450a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = do0Var.f37462f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.f38452c && this.d != do0Var.f37462f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = do0Var.f37462f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (this.f38454f || !z10 || iA < 0) {
            EditTextBoldCursor editTextBoldCursor4 = do0Var.f37462f[0];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
        } else {
            int iA2 = a(currencyString);
            if (iA2 > 0) {
                do0Var.f37462f[0].setSelection(iA2 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor5 = do0Var.f37462f[0];
                editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
            }
        }
        this.f38454f = z10;
        do0Var.L0();
        this.f38451b = null;
        do0Var.f37466i0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f38455n.f37466i0) {
            return;
        }
        this.f38450a = !TextUtils.isEmpty(charSequence);
        this.f38451b = null;
        this.d = charSequence == null ? 0 : charSequence.length();
        this.f38453e = i10;
        boolean z10 = i11 == 1 && i12 == 0;
        this.f38452c = z10;
        if (!z10) {
            return;
        }
        String strFixNumbers = LocaleController.fixNumbers(charSequence);
        char cCharAt = strFixNumbers.charAt(i10);
        int iA = a(strFixNumbers);
        String strSubstring = iA >= 0 ? strFixNumbers.substring(iA + 1) : "";
        long jLongValue = Utilities.parseLong(oe.b.d(strSubstring, false)).longValue();
        if ((cCharAt >= '0' && cCharAt <= '9') || (strSubstring.length() != 0 && jLongValue == 0)) {
            if (iA <= 0 || i10 <= iA || jLongValue != 0) {
                return;
            }
            this.f38451b = strFixNumbers.substring(0, iA - 1);
            return;
        }
        while (true) {
            int i13 = i10 - 1;
            if (i13 < 0) {
                return;
            }
            char cCharAt2 = strFixNumbers.charAt(i13);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                this.f38451b = strFixNumbers.substring(0, i13) + strFixNumbers.substring(i10);
                return;
            }
            i10 = i13;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
