package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class po0 implements TextWatcher {
    public final String[] f40904a = {"34", "37"};
    public final String[] f40905b = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public final String[] f40906c = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
    public int d = -1;
    public int f40907e;
    public final vo0 f40908f;

    public po0(vo0 vo0Var) {
        this.f40908f = vo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        String[] strArr;
        int i13;
        String str;
        vo0 vo0Var = this.f40908f;
        if (vo0Var.f42982o0) {
            return;
        }
        int i14 = 0;
        EditTextBoldCursor editTextBoldCursor = vo0Var.f42971f[0];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String obj = editTextBoldCursor.getText().toString();
        int i15 = 3;
        int i16 = 1;
        if (this.d == 3) {
            obj = obj.substring(0, this.f40907e) + obj.substring(this.f40907e + 1);
            selectionStart--;
        }
        StringBuilder sb2 = new StringBuilder(obj.length());
        int i17 = 0;
        while (i17 < obj.length()) {
            int i18 = i17 + 1;
            String substring = obj.substring(i17, i18);
            if ("0123456789".contains(substring)) {
                sb2.append(substring);
            }
            i17 = i18;
        }
        vo0Var.f42982o0 = true;
        String str2 = null;
        int i19 = 100;
        if (sb2.length() > 0) {
            String sb3 = sb2.toString();
            int i20 = 0;
            while (true) {
                if (i20 < i15) {
                    if (i20 != 0) {
                        if (i20 != i16) {
                            strArr = this.f40905b;
                            i13 = 14;
                            str = "xxxx xxxx xxxx xx";
                        } else {
                            strArr = this.f40904a;
                            i13 = 15;
                            str = "xxxx xxxx xxxx xxx";
                        }
                    } else {
                        strArr = this.f40906c;
                        i13 = 16;
                        str = "xxxx xxxx xxxx xxxx";
                    }
                    i10 = i16;
                    for (int i21 = i14; i21 < strArr.length; i21++) {
                        String str3 = strArr[i21];
                        if (sb3.length() <= str3.length()) {
                            if (str3.startsWith(sb3)) {
                                i19 = i13;
                                str2 = str;
                                break;
                            }
                        } else if (sb3.startsWith(str3)) {
                            i19 = i13;
                            str2 = str;
                            break;
                        }
                    }
                    if (str2 != null) {
                        break;
                    }
                    i20++;
                    i16 = i10;
                    i14 = 0;
                    i15 = 3;
                } else {
                    i10 = i16;
                    break;
                }
            }
            if (sb2.length() > i19) {
                sb2.setLength(i19);
            }
        } else {
            i10 = 1;
        }
        if (str2 != null) {
            if (sb2.length() == i19) {
                vo0Var.f42971f[i10].requestFocus();
            }
            editTextBoldCursor.setTextColor(vo0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
            int i22 = 0;
            while (true) {
                if (i22 >= sb2.length()) {
                    break;
                } else if (i22 < str2.length()) {
                    if (str2.charAt(i22) == ' ') {
                        sb2.insert(i22, ' ');
                        i22++;
                        if (selectionStart == i22 && (i12 = this.d) != 2 && i12 != 3) {
                            selectionStart++;
                        }
                    }
                    i22++;
                } else {
                    sb2.insert(i22, ' ');
                    if (selectionStart == i22 + 1 && (i11 = this.d) != 2 && i11 != 3) {
                        selectionStart++;
                    }
                }
            }
        }
        if (!sb2.toString().equals(editable.toString())) {
            z10 = false;
            editable.replace(0, editable.length(), sb2);
        } else {
            z10 = false;
        }
        if (selectionStart >= 0) {
            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
        }
        vo0Var.f42982o0 = z10;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 1) {
            this.d = 1;
        } else if (i11 == 1 && i12 == 0) {
            if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                this.d = 3;
                this.f40907e = i10 - 1;
                return;
            }
            this.d = 2;
        } else {
            this.d = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
