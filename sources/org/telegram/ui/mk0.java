package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mk0 implements TextWatcher {
    public boolean f47821a;
    public String f47822b;
    public boolean f47823c;
    public int d;
    public int f47824e;
    public boolean f47825f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final hl0 f47826n;

    public mk0(hl0 hl0Var) {
        this.f47826n = hl0Var;
    }

    public final int a(String str) {
        int i7 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i7 < cArr.length) {
                int indexOf = str.indexOf(cArr[i7]);
                if (indexOf >= 0) {
                    return indexOf;
                }
                i7++;
            } else {
                return -1;
            }
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long j3;
        boolean z9;
        String str;
        String str2;
        String substring;
        hl0 hl0Var = this.f47826n;
        if (hl0Var.m0) {
            return;
        }
        Long l10 = hl0Var.H0;
        if (l10 != null) {
            j3 = l10.longValue();
        } else {
            j3 = 0;
        }
        String str3 = this.f47822b;
        if (str3 == null) {
            str3 = org.telegram.messenger.hd.n(editable.toString());
        }
        int a10 = a(str3);
        if (a10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        String str4 = hl0Var.C0.invoice.currency;
        str4.getClass();
        int i7 = 10;
        char c10 = 65535;
        switch (str4.hashCode()) {
            case 65726:
                if (str4.equals("BHD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 65759:
                if (str4.equals("BIF")) {
                    c10 = 1;
                    break;
                }
                break;
            case 66267:
                if (str4.equals("BYR")) {
                    c10 = 2;
                    break;
                }
                break;
            case 66813:
                if (str4.equals("CLF")) {
                    c10 = 3;
                    break;
                }
                break;
            case 66823:
                if (str4.equals("CLP")) {
                    c10 = 4;
                    break;
                }
                break;
            case 67122:
                if (str4.equals("CVE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 67712:
                if (str4.equals("DJF")) {
                    c10 = 6;
                    break;
                }
                break;
            case 70719:
                if (str4.equals("GNF")) {
                    c10 = 7;
                    break;
                }
                break;
            case 72732:
                if (str4.equals("IQD")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 72801:
                if (str4.equals("ISK")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 73631:
                if (str4.equals("JOD")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 73683:
                if (str4.equals("JPY")) {
                    c10 = 11;
                    break;
                }
                break;
            case 74532:
                if (str4.equals("KMF")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 74704:
                if (str4.equals("KRW")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 74840:
                if (str4.equals("KWD")) {
                    c10 = 14;
                    break;
                }
                break;
            case 75863:
                if (str4.equals("LYD")) {
                    c10 = 15;
                    break;
                }
                break;
            case 76263:
                if (str4.equals("MGA")) {
                    c10 = 16;
                    break;
                }
                break;
            case 76618:
                if (str4.equals("MRO")) {
                    c10 = 17;
                    break;
                }
                break;
            case 78388:
                if (str4.equals("OMR")) {
                    c10 = 18;
                    break;
                }
                break;
            case 79710:
                if (str4.equals("PYG")) {
                    c10 = 19;
                    break;
                }
                break;
            case 81569:
                if (str4.equals("RWF")) {
                    c10 = 20;
                    break;
                }
                break;
            case 83210:
                if (str4.equals("TND")) {
                    c10 = 21;
                    break;
                }
                break;
            case 83974:
                if (str4.equals("UGX")) {
                    c10 = 22;
                    break;
                }
                break;
            case 84517:
                if (str4.equals("UYI")) {
                    c10 = 23;
                    break;
                }
                break;
            case 85132:
                if (str4.equals("VND")) {
                    c10 = 24;
                    break;
                }
                break;
            case 85367:
                if (str4.equals("VUV")) {
                    c10 = 25;
                    break;
                }
                break;
            case 86653:
                if (str4.equals("XAF")) {
                    c10 = 26;
                    break;
                }
                break;
            case 87087:
                if (str4.equals("XOF")) {
                    c10 = 27;
                    break;
                }
                break;
            case 87118:
                if (str4.equals("XPF")) {
                    c10 = 28;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case '\b':
            case '\n':
            case 14:
            case 15:
            case 18:
            case 21:
                i7 = 1000;
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\t':
            case 11:
            case '\f':
            case '\r':
            case 16:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                i7 = 1;
                break;
            case 3:
                i7 = 10000;
                break;
            case 17:
                break;
            default:
                i7 = 100;
                break;
        }
        if (a10 >= 0) {
            str = str3.substring(0, a10);
        } else {
            str = str3;
        }
        String str5 = "";
        if (a10 < 0) {
            str2 = "";
        } else {
            str2 = str3.substring(a10 + 1);
        }
        long longValue = Utilities.A(pf.b.d(str, false)).longValue() * i7;
        long longValue2 = Utilities.A(pf.b.d(str2, false)).longValue();
        String o4 = a8.p0.o(longValue2, "");
        String str6 = "" + (i7 - 1);
        if (a10 > 0 && o4.length() > str6.length()) {
            if (this.f47824e - a10 < o4.length()) {
                substring = o4.substring(0, str6.length());
            } else {
                substring = o4.substring(o4.length() - str6.length());
            }
            longValue2 = Utilities.A(substring).longValue();
        }
        Long valueOf = Long.valueOf(longValue + longValue2);
        hl0Var.H0 = valueOf;
        if (hl0Var.C0.invoice.max_tip_amount != 0) {
            long longValue3 = valueOf.longValue();
            long j10 = hl0Var.C0.invoice.max_tip_amount;
            if (longValue3 > j10) {
                hl0Var.H0 = Long.valueOf(j10);
            }
        }
        int selectionStart = hl0Var.f46421f[0].getSelectionStart();
        hl0Var.m0 = true;
        if (hl0Var.H0.longValue() == 0) {
            hl0Var.f46421f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = hl0Var.f46421f[0];
            str5 = org.telegram.messenger.hd.E0().q(hl0Var.H0.longValue(), false, z9, true, hl0Var.C0.invoice.currency);
            editTextBoldCursor.setText(str5);
        }
        if (j3 < hl0Var.H0.longValue() && j3 != 0 && this.f47821a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = hl0Var.f46421f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.f47823c && this.d != hl0Var.f46421f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = hl0Var.f46421f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (!this.f47825f && z9 && a10 >= 0) {
            int a11 = a(str5);
            if (a11 > 0) {
                hl0Var.f46421f[0].setSelection(a11 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor4 = hl0Var.f46421f[0];
                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            }
        } else {
            EditTextBoldCursor editTextBoldCursor5 = hl0Var.f46421f[0];
            editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
        }
        this.f47825f = z9;
        hl0Var.R0();
        this.f47822b = null;
        hl0Var.m0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int length;
        boolean z9;
        String str;
        if (!this.f47826n.m0) {
            this.f47821a = !TextUtils.isEmpty(charSequence);
            this.f47822b = null;
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            this.d = length;
            this.f47824e = i7;
            if (i10 == 1 && i11 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f47823c = z9;
            if (z9) {
                String n10 = org.telegram.messenger.hd.n(charSequence);
                char charAt = n10.charAt(i7);
                int a10 = a(n10);
                if (a10 >= 0) {
                    str = n10.substring(a10 + 1);
                } else {
                    str = "";
                }
                long longValue = Utilities.A(pf.b.d(str, false)).longValue();
                if ((charAt >= '0' && charAt <= '9') || (str.length() != 0 && longValue == 0)) {
                    if (a10 > 0 && i7 > a10 && longValue == 0) {
                        this.f47822b = n10.substring(0, a10 - 1);
                        return;
                    }
                    return;
                }
                while (true) {
                    int i12 = i7 - 1;
                    if (i12 >= 0) {
                        char charAt2 = n10.charAt(i12);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            this.f47822b = n10.substring(0, i12) + n10.substring(i7);
                            return;
                        }
                        i7 = i12;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
