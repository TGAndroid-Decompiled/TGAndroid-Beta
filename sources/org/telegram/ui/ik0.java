package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ik0 implements TextWatcher {
    public boolean f46278a;
    public String f46279b;
    public boolean f46280c;
    public int d;
    public int f46281e;
    public boolean f46282f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final dl0 f46283n;

    public ik0(dl0 dl0Var) {
        this.f46283n = dl0Var;
    }

    public final int a(String str) {
        int i3 = 0;
        while (true) {
            char[] cArr = this.h;
            if (i3 < cArr.length) {
                int indexOf = str.indexOf(cArr[i3]);
                if (indexOf >= 0) {
                    return indexOf;
                }
                i3++;
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
        dl0 dl0Var = this.f46283n;
        if (dl0Var.f44761n0) {
            return;
        }
        Long l10 = dl0Var.I0;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = 0;
        }
        String str3 = this.f46279b;
        if (str3 == null) {
            str3 = org.telegram.messenger.bd.n(editable.toString());
        }
        int a10 = a(str3);
        if (a10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str4 = dl0Var.D0.invoice.currency;
        str4.getClass();
        int i3 = 10;
        char c2 = 65535;
        switch (str4.hashCode()) {
            case 65726:
                if (str4.equals("BHD")) {
                    c2 = 0;
                    break;
                }
                break;
            case 65759:
                if (str4.equals("BIF")) {
                    c2 = 1;
                    break;
                }
                break;
            case 66267:
                if (str4.equals("BYR")) {
                    c2 = 2;
                    break;
                }
                break;
            case 66813:
                if (str4.equals("CLF")) {
                    c2 = 3;
                    break;
                }
                break;
            case 66823:
                if (str4.equals("CLP")) {
                    c2 = 4;
                    break;
                }
                break;
            case 67122:
                if (str4.equals("CVE")) {
                    c2 = 5;
                    break;
                }
                break;
            case 67712:
                if (str4.equals("DJF")) {
                    c2 = 6;
                    break;
                }
                break;
            case 70719:
                if (str4.equals("GNF")) {
                    c2 = 7;
                    break;
                }
                break;
            case 72732:
                if (str4.equals("IQD")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 72801:
                if (str4.equals("ISK")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 73631:
                if (str4.equals("JOD")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 73683:
                if (str4.equals("JPY")) {
                    c2 = 11;
                    break;
                }
                break;
            case 74532:
                if (str4.equals("KMF")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 74704:
                if (str4.equals("KRW")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 74840:
                if (str4.equals("KWD")) {
                    c2 = 14;
                    break;
                }
                break;
            case 75863:
                if (str4.equals("LYD")) {
                    c2 = 15;
                    break;
                }
                break;
            case 76263:
                if (str4.equals("MGA")) {
                    c2 = 16;
                    break;
                }
                break;
            case 76618:
                if (str4.equals("MRO")) {
                    c2 = 17;
                    break;
                }
                break;
            case 78388:
                if (str4.equals("OMR")) {
                    c2 = 18;
                    break;
                }
                break;
            case 79710:
                if (str4.equals("PYG")) {
                    c2 = 19;
                    break;
                }
                break;
            case 81569:
                if (str4.equals("RWF")) {
                    c2 = 20;
                    break;
                }
                break;
            case 83210:
                if (str4.equals("TND")) {
                    c2 = 21;
                    break;
                }
                break;
            case 83974:
                if (str4.equals("UGX")) {
                    c2 = 22;
                    break;
                }
                break;
            case 84517:
                if (str4.equals("UYI")) {
                    c2 = 23;
                    break;
                }
                break;
            case 85132:
                if (str4.equals("VND")) {
                    c2 = 24;
                    break;
                }
                break;
            case 85367:
                if (str4.equals("VUV")) {
                    c2 = 25;
                    break;
                }
                break;
            case 86653:
                if (str4.equals("XAF")) {
                    c2 = 26;
                    break;
                }
                break;
            case 87087:
                if (str4.equals("XOF")) {
                    c2 = 27;
                    break;
                }
                break;
            case 87118:
                if (str4.equals("XPF")) {
                    c2 = 28;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case '\b':
            case '\n':
            case 14:
            case 15:
            case 18:
            case 21:
                i3 = 1000;
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
                i3 = 1;
                break;
            case 3:
                i3 = 10000;
                break;
            case 17:
                break;
            default:
                i3 = 100;
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
        long longValue = Utilities.A(mf.b.d(str, false)).longValue() * i3;
        long longValue2 = Utilities.A(mf.b.d(str2, false)).longValue();
        String p10 = a1.g.p(longValue2, "");
        String str6 = "" + (i3 - 1);
        if (a10 > 0 && p10.length() > str6.length()) {
            if (this.f46281e - a10 < p10.length()) {
                substring = p10.substring(0, str6.length());
            } else {
                substring = p10.substring(p10.length() - str6.length());
            }
            longValue2 = Utilities.A(substring).longValue();
        }
        Long valueOf = Long.valueOf(longValue + longValue2);
        dl0Var.I0 = valueOf;
        if (dl0Var.D0.invoice.max_tip_amount != 0) {
            long longValue3 = valueOf.longValue();
            long j11 = dl0Var.D0.invoice.max_tip_amount;
            if (longValue3 > j11) {
                dl0Var.I0 = Long.valueOf(j11);
            }
        }
        int selectionStart = dl0Var.f44750f[0].getSelectionStart();
        dl0Var.f44761n0 = true;
        if (dl0Var.I0.longValue() == 0) {
            dl0Var.f44750f[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = dl0Var.f44750f[0];
            str5 = org.telegram.messenger.bd.E0().q(dl0Var.I0.longValue(), false, z10, true, dl0Var.D0.invoice.currency);
            editTextBoldCursor.setText(str5);
        }
        if (j10 < dl0Var.I0.longValue() && j10 != 0 && this.f46278a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = dl0Var.f44750f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.f46280c && this.d != dl0Var.f44750f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = dl0Var.f44750f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (!this.f46282f && z10 && a10 >= 0) {
            int a11 = a(str5);
            if (a11 > 0) {
                dl0Var.f44750f[0].setSelection(a11 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor4 = dl0Var.f44750f[0];
                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            }
        } else {
            EditTextBoldCursor editTextBoldCursor5 = dl0Var.f44750f[0];
            editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
        }
        this.f46282f = z10;
        dl0Var.R0();
        this.f46279b = null;
        dl0Var.f44761n0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int length;
        boolean z10;
        String str;
        if (!this.f46283n.f44761n0) {
            this.f46278a = !TextUtils.isEmpty(charSequence);
            this.f46279b = null;
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            this.d = length;
            this.f46281e = i3;
            if (i10 == 1 && i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f46280c = z10;
            if (z10) {
                String n4 = org.telegram.messenger.bd.n(charSequence);
                char charAt = n4.charAt(i3);
                int a10 = a(n4);
                if (a10 >= 0) {
                    str = n4.substring(a10 + 1);
                } else {
                    str = "";
                }
                long longValue = Utilities.A(mf.b.d(str, false)).longValue();
                if ((charAt >= '0' && charAt <= '9') || (str.length() != 0 && longValue == 0)) {
                    if (a10 > 0 && i3 > a10 && longValue == 0) {
                        this.f46279b = n4.substring(0, a10 - 1);
                        return;
                    }
                    return;
                }
                while (true) {
                    int i12 = i3 - 1;
                    if (i12 >= 0) {
                        char charAt2 = n4.charAt(i12);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            this.f46279b = n4.substring(0, i12) + n4.substring(i3);
                            return;
                        }
                        i3 = i12;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
