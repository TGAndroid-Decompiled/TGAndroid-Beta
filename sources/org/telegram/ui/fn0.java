package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fn0 implements TextWatcher {
    public boolean f38319a;
    public String f38320b;
    public boolean f38321c;
    public int d;
    public int f38322e;
    public boolean f38323f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final co0 f38324n;

    public fn0(co0 co0Var) {
        this.f38324n = co0Var;
    }

    public final int a(String str) {
        int i9 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i9 < cArr.length) {
                int indexOf = str.indexOf(cArr[i9]);
                if (indexOf >= 0) {
                    return indexOf;
                }
                i9++;
            } else {
                return -1;
            }
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long j10;
        boolean z10;
        String str;
        String str2;
        String substring;
        co0 co0Var = this.f38324n;
        if (co0Var.f37260i0) {
            return;
        }
        Long l10 = co0Var.D0;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        String str3 = this.f38320b;
        if (str3 == null) {
            str3 = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str3);
        if (a2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(co0Var.f37281y0.invoice.currency);
        if (a2 >= 0) {
            str = str3.substring(0, a2);
        } else {
            str = str3;
        }
        String str4 = "";
        if (a2 < 0) {
            str2 = "";
        } else {
            str2 = str3.substring(a2 + 1);
        }
        long longValue = Utilities.parseLong(ne.b.d(str, false)).longValue() * currencyExpDivider;
        long longValue2 = Utilities.parseLong(ne.b.d(str2, false)).longValue();
        String m10 = aa.d.m(longValue2, "");
        String str5 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && m10.length() > str5.length()) {
            if (this.f38322e - a2 < m10.length()) {
                substring = m10.substring(0, str5.length());
            } else {
                substring = m10.substring(m10.length() - str5.length());
            }
            longValue2 = Utilities.parseLong(substring).longValue();
        }
        Long valueOf = Long.valueOf(longValue + longValue2);
        co0Var.D0 = valueOf;
        if (co0Var.f37281y0.invoice.max_tip_amount != 0) {
            long longValue3 = valueOf.longValue();
            long j11 = co0Var.f37281y0.invoice.max_tip_amount;
            if (longValue3 > j11) {
                co0Var.D0 = Long.valueOf(j11);
            }
        }
        int selectionStart = co0Var.f37256f[0].getSelectionStart();
        co0Var.f37260i0 = true;
        if (co0Var.D0.longValue() == 0) {
            co0Var.f37256f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = co0Var.f37256f[0];
            str4 = LocaleController.getInstance().formatCurrencyString(co0Var.D0.longValue(), false, z10, true, co0Var.f37281y0.invoice.currency);
            editTextBoldCursor.setText(str4);
        }
        if (j10 < co0Var.D0.longValue() && j10 != 0 && this.f38319a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = co0Var.f37256f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.f38321c && this.d != co0Var.f37256f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = co0Var.f37256f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (!this.f38323f && z10 && a2 >= 0) {
            int a3 = a(str4);
            if (a3 > 0) {
                co0Var.f37256f[0].setSelection(a3 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor4 = co0Var.f37256f[0];
                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            }
        } else {
            EditTextBoldCursor editTextBoldCursor5 = co0Var.f37256f[0];
            editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
        }
        this.f38323f = z10;
        co0Var.L0();
        this.f38320b = null;
        co0Var.f37260i0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int length;
        boolean z10;
        String str;
        if (!this.f38324n.f37260i0) {
            this.f38319a = !TextUtils.isEmpty(charSequence);
            this.f38320b = null;
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            this.d = length;
            this.f38322e = i9;
            if (i10 == 1 && i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f38321c = z10;
            if (z10) {
                String fixNumbers = LocaleController.fixNumbers(charSequence);
                char charAt = fixNumbers.charAt(i9);
                int a2 = a(fixNumbers);
                if (a2 >= 0) {
                    str = fixNumbers.substring(a2 + 1);
                } else {
                    str = "";
                }
                long longValue = Utilities.parseLong(ne.b.d(str, false)).longValue();
                if ((charAt >= '0' && charAt <= '9') || (str.length() != 0 && longValue == 0)) {
                    if (a2 > 0 && i9 > a2 && longValue == 0) {
                        this.f38320b = fixNumbers.substring(0, a2 - 1);
                        return;
                    }
                    return;
                }
                while (true) {
                    int i12 = i9 - 1;
                    if (i12 >= 0) {
                        char charAt2 = fixNumbers.charAt(i12);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            this.f38320b = fixNumbers.substring(0, i12) + fixNumbers.substring(i9);
                            return;
                        }
                        i9 = i12;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
