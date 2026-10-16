package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class gs implements TextWatcher {
    public final int f36298a;
    public int f36299b;
    public int f36300c;
    public final Object d;

    public gs(Object obj, int i10) {
        this.f36298a = i10;
        this.d = obj;
        this.f36299b = -1;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f36298a) {
            case 0:
                int i18 = this.f36300c;
                int i19 = this.f36299b;
                hs hsVar = (hs) this.d;
                if (!hsVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        hsVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                ks[] ksVarArr = hsVar.f36645f;
                                if (i22 < ksVarArr.length) {
                                    ksVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        hsVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        ks[] ksVarArr2 = hsVar.f36645f;
                        if (i23 < ksVarArr2.length) {
                            ks ksVar = ksVarArr2[i23];
                            ksVar.setSelection(ksVar.length());
                            hsVar.f36645f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && hsVar.getCode().length() == i18) {
                        hsVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zg0 zg0Var = (zg0) this.d;
                wg0 wg0Var = zg0Var.f42310b;
                if (!zg0Var.J) {
                    int selectionStart = wg0Var.getSelectionStart();
                    String obj2 = wg0Var.getText().toString();
                    if (this.f36299b == 3) {
                        obj2 = obj2.substring(0, this.f36300c) + obj2.substring(this.f36300c + 1);
                        selectionStart--;
                    }
                    StringBuilder sb2 = new StringBuilder(obj2.length());
                    int i24 = 0;
                    while (i24 < obj2.length()) {
                        int i25 = i24 + 1;
                        String substring = obj2.substring(i24, i25);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i24 = i25;
                    }
                    zg0Var.J = true;
                    String hintText = wg0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb2.length()) {
                                if (i26 < hintText.length()) {
                                    if (hintText.charAt(i26) == ' ') {
                                        sb2.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart == i26 && (i11 = this.f36299b) != 2 && i11 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb2.insert(i26, ' ');
                                    if (selectionStart == i26 + 1 && (i10 = this.f36299b) != 2 && i10 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        wg0Var.setSelection(Math.min(selectionStart, wg0Var.length()));
                    }
                    wg0Var.invalidate();
                    zg0Var.q();
                    zg0Var.J = false;
                    return;
                }
                return;
            case 2:
                hk0 hk0Var = (hk0) this.d;
                if (!hk0Var.F) {
                    int selectionStart2 = hk0Var.Q.getSelectionStart();
                    String obj3 = hk0Var.Q.getText().toString();
                    if (this.f36299b == 3) {
                        obj3 = obj3.substring(0, this.f36300c) + obj3.substring(this.f36300c + 1);
                        selectionStart2--;
                    }
                    StringBuilder sb3 = new StringBuilder(obj3.length());
                    int i27 = 0;
                    while (i27 < obj3.length()) {
                        int i28 = i27 + 1;
                        String substring2 = obj3.substring(i27, i28);
                        if ("0123456789".contains(substring2)) {
                            sb3.append(substring2);
                        }
                        i27 = i28;
                    }
                    hk0Var.F = true;
                    String hintText2 = hk0Var.Q.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < sb3.length()) {
                                if (i29 < hintText2.length()) {
                                    if (hintText2.charAt(i29) == ' ') {
                                        sb3.insert(i29, ' ');
                                        i29++;
                                        if (selectionStart2 == i29 && (i13 = this.f36299b) != 2 && i13 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i29++;
                                } else {
                                    sb3.insert(i29, ' ');
                                    if (selectionStart2 == i29 + 1 && (i12 = this.f36299b) != 2 && i12 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        fk0 fk0Var = hk0Var.Q;
                        fk0Var.setSelection(Math.min(selectionStart2, fk0Var.length()));
                    }
                    hk0Var.Q.invalidate();
                    hk0Var.F = false;
                    hk0.s(hk0Var);
                    return;
                }
                return;
            case 3:
                sn0 sn0Var = (sn0) this.d;
                if (!sn0Var.f39856a1) {
                    org.telegram.ui.Components.s40 s40Var = (org.telegram.ui.Components.s40) sn0Var.Y[2];
                    int selectionStart3 = s40Var.getSelectionStart();
                    String obj4 = s40Var.getText().toString();
                    if (this.f36299b == 3) {
                        obj4 = obj4.substring(0, this.f36300c) + obj4.substring(this.f36300c + 1);
                        selectionStart3--;
                    }
                    StringBuilder sb4 = new StringBuilder(obj4.length());
                    int i30 = 0;
                    while (i30 < obj4.length()) {
                        int i31 = i30 + 1;
                        String substring3 = obj4.substring(i30, i31);
                        if ("0123456789".contains(substring3)) {
                            sb4.append(substring3);
                        }
                        i30 = i31;
                    }
                    sn0Var.f39856a1 = true;
                    String hintText3 = s40Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (true) {
                            if (i32 < sb4.length()) {
                                if (i32 < hintText3.length()) {
                                    if (hintText3.charAt(i32) == ' ') {
                                        sb4.insert(i32, ' ');
                                        i32++;
                                        if (selectionStart3 == i32 && (i15 = this.f36299b) != 2 && i15 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i32++;
                                } else {
                                    sb4.insert(i32, ' ');
                                    if (selectionStart3 == i32 + 1 && (i14 = this.f36299b) != 2 && i14 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    s40Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        s40Var.setSelection(Math.min(selectionStart3, s40Var.length()));
                    }
                    s40Var.invalidate();
                    sn0Var.f39856a1 = false;
                    return;
                }
                return;
            default:
                ap0 ap0Var = (ap0) this.d;
                if (!ap0Var.f34030n0) {
                    org.telegram.ui.Components.s40 s40Var2 = (org.telegram.ui.Components.s40) ap0Var.f34020f[9];
                    int selectionStart4 = s40Var2.getSelectionStart();
                    String obj5 = s40Var2.getText().toString();
                    if (this.f36299b == 3) {
                        obj5 = obj5.substring(0, this.f36300c) + obj5.substring(this.f36300c + 1);
                        selectionStart4--;
                    }
                    StringBuilder sb5 = new StringBuilder(obj5.length());
                    int i33 = 0;
                    while (i33 < obj5.length()) {
                        int i34 = i33 + 1;
                        String substring4 = obj5.substring(i33, i34);
                        if ("0123456789".contains(substring4)) {
                            sb5.append(substring4);
                        }
                        i33 = i34;
                    }
                    ap0Var.f34030n0 = true;
                    String hintText4 = s40Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (true) {
                            if (i35 < sb5.length()) {
                                if (i35 < hintText4.length()) {
                                    if (hintText4.charAt(i35) == ' ') {
                                        sb5.insert(i35, ' ');
                                        i35++;
                                        if (selectionStart4 == i35 && (i17 = this.f36299b) != 2 && i17 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i35++;
                                } else {
                                    sb5.insert(i35, ' ');
                                    if (selectionStart4 == i35 + 1 && (i16 = this.f36299b) != 2 && i16 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    s40Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        s40Var2.setSelection(Math.min(selectionStart4, s40Var2.length()));
                    }
                    s40Var2.invalidate();
                    ap0Var.f34030n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f36298a) {
            case 0:
                return;
            case 1:
                if (i11 == 0 && i12 == 1) {
                    this.f36299b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f36299b = 3;
                        this.f36300c = i10 - 1;
                        return;
                    }
                    this.f36299b = 2;
                    return;
                } else {
                    this.f36299b = -1;
                    return;
                }
            case 2:
                if (i11 == 0 && i12 == 1) {
                    this.f36299b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f36299b = 3;
                        this.f36300c = i10 - 1;
                        return;
                    }
                    this.f36299b = 2;
                    return;
                } else {
                    this.f36299b = -1;
                    return;
                }
            case 3:
                if (i11 == 0 && i12 == 1) {
                    this.f36299b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f36299b = 3;
                        this.f36300c = i10 - 1;
                        return;
                    }
                    this.f36299b = 2;
                    return;
                } else {
                    this.f36299b = -1;
                    return;
                }
            default:
                if (i11 == 0 && i12 == 1) {
                    this.f36299b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f36299b = 3;
                        this.f36300c = i10 - 1;
                        return;
                    }
                    this.f36299b = 2;
                    return;
                } else {
                    this.f36299b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36298a;
    }

    public gs(hs hsVar, int i10, int i11) {
        this.f36298a = 0;
        this.d = hsVar;
        this.f36299b = i10;
        this.f36300c = i11;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
