package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jn0 implements TextWatcher {
    public boolean f38592a;
    public String f38593b;
    public boolean f38594c;
    public int d;
    public int e;
    public boolean f38595f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final ho0 f38596n;

    public jn0(ho0 ho0Var) {
        this.f38596n = ho0Var;
    }

    public final int a(String str) {
        int i10 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i10 < cArr.length) {
                int indexOf = str.indexOf(cArr[i10]);
                if (indexOf >= 0) {
                    return indexOf;
                }
                i10++;
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
        ho0 ho0Var = this.f38596n;
        if (ho0Var.m0) {
            return;
        }
        Long l4 = ho0Var.H0;
        if (l4 != null) {
            j10 = l4.longValue();
        } else {
            j10 = 0;
        }
        String str3 = this.f38593b;
        if (str3 == null) {
            str3 = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str3);
        if (a2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(ho0Var.C0.invoice.currency);
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
        long longValue = Utilities.parseLong(jf.b.d(str, false)).longValue() * currencyExpDivider;
        long longValue2 = Utilities.parseLong(jf.b.d(str2, false)).longValue();
        String o10 = a1.g.o(longValue2, "");
        String str5 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && o10.length() > str5.length()) {
            if (this.e - a2 < o10.length()) {
                substring = o10.substring(0, str5.length());
            } else {
                substring = o10.substring(o10.length() - str5.length());
            }
            longValue2 = Utilities.parseLong(substring).longValue();
        }
        Long valueOf = Long.valueOf(longValue + longValue2);
        ho0Var.H0 = valueOf;
        if (ho0Var.C0.invoice.max_tip_amount != 0) {
            long longValue3 = valueOf.longValue();
            long j11 = ho0Var.C0.invoice.max_tip_amount;
            if (longValue3 > j11) {
                ho0Var.H0 = Long.valueOf(j11);
            }
        }
        int selectionStart = ho0Var.f37927f[0].getSelectionStart();
        ho0Var.m0 = true;
        if (ho0Var.H0.longValue() == 0) {
            ho0Var.f37927f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = ho0Var.f37927f[0];
            str4 = LocaleController.getInstance().formatCurrencyString(ho0Var.H0.longValue(), false, z10, true, ho0Var.C0.invoice.currency);
            editTextBoldCursor.setText(str4);
        }
        if (j10 < ho0Var.H0.longValue() && j10 != 0 && this.f38592a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = ho0Var.f37927f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.f38594c && this.d != ho0Var.f37927f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = ho0Var.f37927f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (!this.f38595f && z10 && a2 >= 0) {
            int a10 = a(str4);
            if (a10 > 0) {
                ho0Var.f37927f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor4 = ho0Var.f37927f[0];
                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            }
        } else {
            EditTextBoldCursor editTextBoldCursor5 = ho0Var.f37927f[0];
            editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
        }
        this.f38595f = z10;
        ho0Var.L0();
        this.f38593b = null;
        ho0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int length;
        boolean z10;
        String str;
        if (!this.f38596n.m0) {
            this.f38592a = !TextUtils.isEmpty(charSequence);
            this.f38593b = null;
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            this.d = length;
            this.e = i10;
            if (i11 == 1 && i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f38594c = z10;
            if (z10) {
                String fixNumbers = LocaleController.fixNumbers(charSequence);
                char charAt = fixNumbers.charAt(i10);
                int a2 = a(fixNumbers);
                if (a2 >= 0) {
                    str = fixNumbers.substring(a2 + 1);
                } else {
                    str = "";
                }
                long longValue = Utilities.parseLong(jf.b.d(str, false)).longValue();
                if ((charAt >= '0' && charAt <= '9') || (str.length() != 0 && longValue == 0)) {
                    if (a2 > 0 && i10 > a2 && longValue == 0) {
                        this.f38593b = fixNumbers.substring(0, a2 - 1);
                        return;
                    }
                    return;
                }
                while (true) {
                    int i13 = i10 - 1;
                    if (i13 >= 0) {
                        char charAt2 = fixNumbers.charAt(i13);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            this.f38593b = fixNumbers.substring(0, i13) + fixNumbers.substring(i10);
                            return;
                        }
                        i10 = i13;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
