package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class on0 implements TextWatcher {
    public boolean f39809a;
    public String f39810b;
    public boolean f39811c;
    public int d;
    public int f39812e;
    public boolean f39813f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final lo0 f39814n;

    public on0(lo0 lo0Var) {
        this.f39814n = lo0Var;
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
        boolean z4;
        String str;
        String str2;
        String substring;
        lo0 lo0Var = this.f39814n;
        if (lo0Var.f38812j0) {
            return;
        }
        Long l10 = lo0Var.E0;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        String str3 = this.f39810b;
        if (str3 == null) {
            str3 = LocaleController.fixNumbers(editable.toString());
        }
        int a2 = a(str3);
        if (a2 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        int currencyExpDivider = LocaleController.getCurrencyExpDivider(lo0Var.f38833z0.invoice.currency);
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
        long longValue = Utilities.parseLong(se.b.d(str, false)).longValue() * currencyExpDivider;
        long longValue2 = Utilities.parseLong(se.b.d(str2, false)).longValue();
        String n10 = android.support.v4.media.a.n(longValue2, "");
        String str5 = "" + (currencyExpDivider - 1);
        if (a2 > 0 && n10.length() > str5.length()) {
            if (this.f39812e - a2 < n10.length()) {
                substring = n10.substring(0, str5.length());
            } else {
                substring = n10.substring(n10.length() - str5.length());
            }
            longValue2 = Utilities.parseLong(substring).longValue();
        }
        Long valueOf = Long.valueOf(longValue + longValue2);
        lo0Var.E0 = valueOf;
        if (lo0Var.f38833z0.invoice.max_tip_amount != 0) {
            long longValue3 = valueOf.longValue();
            long j11 = lo0Var.f38833z0.invoice.max_tip_amount;
            if (longValue3 > j11) {
                lo0Var.E0 = Long.valueOf(j11);
            }
        }
        int selectionStart = lo0Var.f38807f[0].getSelectionStart();
        lo0Var.f38812j0 = true;
        if (lo0Var.E0.longValue() == 0) {
            lo0Var.f38807f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = lo0Var.f38807f[0];
            str4 = LocaleController.getInstance().formatCurrencyString(lo0Var.E0.longValue(), false, z4, true, lo0Var.f38833z0.invoice.currency);
            editTextBoldCursor.setText(str4);
        }
        if (j10 < lo0Var.E0.longValue() && j10 != 0 && this.f39809a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = lo0Var.f38807f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.f39811c && this.d != lo0Var.f38807f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = lo0Var.f38807f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (!this.f39813f && z4 && a2 >= 0) {
            int a10 = a(str4);
            if (a10 > 0) {
                lo0Var.f38807f[0].setSelection(a10 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor4 = lo0Var.f38807f[0];
                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            }
        } else {
            EditTextBoldCursor editTextBoldCursor5 = lo0Var.f38807f[0];
            editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
        }
        this.f39813f = z4;
        lo0Var.L0();
        this.f39810b = null;
        lo0Var.f38812j0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int length;
        boolean z4;
        String str;
        if (!this.f39814n.f38812j0) {
            this.f39809a = !TextUtils.isEmpty(charSequence);
            this.f39810b = null;
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            this.d = length;
            this.f39812e = i10;
            if (i11 == 1 && i12 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f39811c = z4;
            if (z4) {
                String fixNumbers = LocaleController.fixNumbers(charSequence);
                char charAt = fixNumbers.charAt(i10);
                int a2 = a(fixNumbers);
                if (a2 >= 0) {
                    str = fixNumbers.substring(a2 + 1);
                } else {
                    str = "";
                }
                long longValue = Utilities.parseLong(se.b.d(str, false)).longValue();
                if ((charAt >= '0' && charAt <= '9') || (str.length() != 0 && longValue == 0)) {
                    if (a2 > 0 && i10 > a2 && longValue == 0) {
                        this.f39810b = fixNumbers.substring(0, a2 - 1);
                        return;
                    }
                    return;
                }
                while (true) {
                    int i13 = i10 - 1;
                    if (i13 >= 0) {
                        char charAt2 = fixNumbers.charAt(i13);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            this.f39810b = fixNumbers.substring(0, i13) + fixNumbers.substring(i10);
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
