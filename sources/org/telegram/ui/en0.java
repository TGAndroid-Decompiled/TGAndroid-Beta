package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class en0 implements TextWatcher {
    public boolean f37872a;
    public String f37873b;
    public boolean f37874c;
    public int d;
    public int f37875e;
    public boolean f37876f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final bo0 f37877n;

    public en0(bo0 bo0Var) {
        this.f37877n = bo0Var;
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
        bo0 bo0Var = this.f37877n;
        if (bo0Var.f36853i0) {
            return;
        }
        Long l10 = bo0Var.D0;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        String str3 = this.f37873b;
        if (str3 == null) {
            str3 = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str3);
        if (a2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(bo0Var.f36874y0.invoice.currency);
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
        long longValue = Utilities.parseLong(qe.b.d(str, false)).longValue() * currencyExpDivider;
        long longValue2 = Utilities.parseLong(qe.b.d(str2, false)).longValue();
        String m10 = a4.w.m(longValue2, "");
        String str5 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && m10.length() > str5.length()) {
            if (this.f37875e - a2 < m10.length()) {
                substring = m10.substring(0, str5.length());
            } else {
                substring = m10.substring(m10.length() - str5.length());
            }
            longValue2 = Utilities.parseLong(substring).longValue();
        }
        Long valueOf = Long.valueOf(longValue + longValue2);
        bo0Var.D0 = valueOf;
        if (bo0Var.f36874y0.invoice.max_tip_amount != 0) {
            long longValue3 = valueOf.longValue();
            long j11 = bo0Var.f36874y0.invoice.max_tip_amount;
            if (longValue3 > j11) {
                bo0Var.D0 = Long.valueOf(j11);
            }
        }
        int selectionStart = bo0Var.f36849f[0].getSelectionStart();
        bo0Var.f36853i0 = true;
        if (bo0Var.D0.longValue() == 0) {
            bo0Var.f36849f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = bo0Var.f36849f[0];
            str4 = LocaleController.getInstance().formatCurrencyString(bo0Var.D0.longValue(), false, z10, true, bo0Var.f36874y0.invoice.currency);
            editTextBoldCursor.setText(str4);
        }
        if (j10 < bo0Var.D0.longValue() && j10 != 0 && this.f37872a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = bo0Var.f36849f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.f37874c && this.d != bo0Var.f36849f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = bo0Var.f36849f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (!this.f37876f && z10 && a2 >= 0) {
            int a10 = a(str4);
            if (a10 > 0) {
                bo0Var.f36849f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor4 = bo0Var.f36849f[0];
                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            }
        } else {
            EditTextBoldCursor editTextBoldCursor5 = bo0Var.f36849f[0];
            editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
        }
        this.f37876f = z10;
        bo0Var.L0();
        this.f37873b = null;
        bo0Var.f36853i0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int length;
        boolean z10;
        String str;
        if (!this.f37877n.f36853i0) {
            this.f37872a = !TextUtils.isEmpty(charSequence);
            this.f37873b = null;
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            this.d = length;
            this.f37875e = i10;
            if (i11 == 1 && i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f37874c = z10;
            if (z10) {
                String fixNumbers = LocaleController.fixNumbers(charSequence);
                char charAt = fixNumbers.charAt(i10);
                int a2 = a(fixNumbers);
                if (a2 >= 0) {
                    str = fixNumbers.substring(a2 + 1);
                } else {
                    str = "";
                }
                long longValue = Utilities.parseLong(qe.b.d(str, false)).longValue();
                if ((charAt >= '0' && charAt <= '9') || (str.length() != 0 && longValue == 0)) {
                    if (a2 > 0 && i10 > a2 && longValue == 0) {
                        this.f37873b = fixNumbers.substring(0, a2 - 1);
                        return;
                    }
                    return;
                }
                while (true) {
                    int i13 = i10 - 1;
                    if (i13 >= 0) {
                        char charAt2 = fixNumbers.charAt(i13);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            this.f37873b = fixNumbers.substring(0, i13) + fixNumbers.substring(i10);
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
