package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bl0 implements TextWatcher {
    public final String[] f44420a = {"34", "37"};
    public final String[] f44421b = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public final String[] f44422c = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
    public int d = -1;
    public int f44423e;
    public final hl0 f44424f;

    public bl0(hl0 hl0Var) {
        this.f44424f = hl0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        boolean z9;
        int i10;
        int i11;
        String[] strArr;
        int i12;
        String str;
        hl0 hl0Var = this.f44424f;
        if (hl0Var.f46431o0) {
            return;
        }
        int i13 = 0;
        EditTextBoldCursor editTextBoldCursor = hl0Var.f46420f[0];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String obj = editTextBoldCursor.getText().toString();
        int i14 = 3;
        int i15 = 1;
        if (this.d == 3) {
            obj = obj.substring(0, this.f44423e) + obj.substring(this.f44423e + 1);
            selectionStart--;
        }
        StringBuilder sb2 = new StringBuilder(obj.length());
        int i16 = 0;
        while (i16 < obj.length()) {
            int i17 = i16 + 1;
            String substring = obj.substring(i16, i17);
            if ("0123456789".contains(substring)) {
                sb2.append(substring);
            }
            i16 = i17;
        }
        hl0Var.f46431o0 = true;
        String str2 = null;
        int i18 = 100;
        if (sb2.length() > 0) {
            String sb3 = sb2.toString();
            int i19 = 0;
            while (true) {
                if (i19 < i14) {
                    if (i19 != 0) {
                        if (i19 != i15) {
                            strArr = this.f44421b;
                            i12 = 14;
                            str = "xxxx xxxx xxxx xx";
                        } else {
                            strArr = this.f44420a;
                            i12 = 15;
                            str = "xxxx xxxx xxxx xxx";
                        }
                    } else {
                        strArr = this.f44422c;
                        i12 = 16;
                        str = "xxxx xxxx xxxx xxxx";
                    }
                    i7 = i15;
                    for (int i20 = i13; i20 < strArr.length; i20++) {
                        String str3 = strArr[i20];
                        if (sb3.length() <= str3.length()) {
                            if (str3.startsWith(sb3)) {
                                i18 = i12;
                                str2 = str;
                                break;
                            }
                        } else if (sb3.startsWith(str3)) {
                            i18 = i12;
                            str2 = str;
                            break;
                        }
                    }
                    if (str2 != null) {
                        break;
                    }
                    i19++;
                    i15 = i7;
                    i13 = 0;
                    i14 = 3;
                } else {
                    i7 = i15;
                    break;
                }
            }
            if (sb2.length() > i18) {
                sb2.setLength(i18);
            }
        } else {
            i7 = 1;
        }
        if (str2 != null) {
            if (sb2.length() == i18) {
                hl0Var.f46420f[i7].requestFocus();
            }
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.G6, hl0Var.Y0);
            int i21 = 0;
            while (true) {
                if (i21 >= sb2.length()) {
                    break;
                } else if (i21 < str2.length()) {
                    if (str2.charAt(i21) == ' ') {
                        sb2.insert(i21, ' ');
                        i21++;
                        if (selectionStart == i21 && (i11 = this.d) != 2 && i11 != 3) {
                            selectionStart++;
                        }
                    }
                    i21++;
                } else {
                    sb2.insert(i21, ' ');
                    if (selectionStart == i21 + 1 && (i10 = this.d) != 2 && i10 != 3) {
                        selectionStart++;
                    }
                }
            }
        }
        if (!sb2.toString().equals(editable.toString())) {
            z9 = false;
            editable.replace(0, editable.length(), sb2);
        } else {
            z9 = false;
        }
        if (selectionStart >= 0) {
            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
        }
        hl0Var.f46431o0 = z9;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            this.d = 1;
        } else if (i10 == 1 && i11 == 0) {
            if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                this.d = 3;
                this.f44423e = i7 - 1;
                return;
            }
            this.d = 2;
        } else {
            this.d = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
