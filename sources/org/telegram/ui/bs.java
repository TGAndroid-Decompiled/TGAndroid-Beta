package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class bs implements TextWatcher {
    public final int f36421a;
    public int f36422b;
    public int f36423c;
    public final Object d;

    public bs(Object obj, int i10) {
        this.f36421a = i10;
        this.d = obj;
        this.f36422b = -1;
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
        switch (this.f36421a) {
            case 0:
                int i18 = this.f36423c;
                int i19 = this.f36422b;
                cs csVar = (cs) this.d;
                if (!csVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        csVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                es[] esVarArr = csVar.f36732f;
                                if (i22 < esVarArr.length) {
                                    esVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        csVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        es[] esVarArr2 = csVar.f36732f;
                        if (i23 < esVarArr2.length) {
                            es esVar = esVarArr2[i23];
                            esVar.setSelection(esVar.length());
                            csVar.f36732f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && csVar.getCode().length() == i18) {
                        csVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                vg0 vg0Var = (vg0) this.d;
                sg0 sg0Var = vg0Var.f42850b;
                if (!vg0Var.J) {
                    int selectionStart = sg0Var.getSelectionStart();
                    String obj2 = sg0Var.getText().toString();
                    if (this.f36422b == 3) {
                        obj2 = obj2.substring(0, this.f36423c) + obj2.substring(this.f36423c + 1);
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
                    vg0Var.J = true;
                    String hintText = sg0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb2.length()) {
                                if (i26 < hintText.length()) {
                                    if (hintText.charAt(i26) == ' ') {
                                        sb2.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart == i26 && (i11 = this.f36422b) != 2 && i11 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb2.insert(i26, ' ');
                                    if (selectionStart == i26 + 1 && (i10 = this.f36422b) != 2 && i10 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        sg0Var.setSelection(Math.min(selectionStart, sg0Var.length()));
                    }
                    sg0Var.invalidate();
                    vg0Var.q();
                    vg0Var.J = false;
                    return;
                }
                return;
            case 2:
                dk0 dk0Var = (dk0) this.d;
                if (!dk0Var.F) {
                    int selectionStart2 = dk0Var.Q.getSelectionStart();
                    String obj3 = dk0Var.Q.getText().toString();
                    if (this.f36422b == 3) {
                        obj3 = obj3.substring(0, this.f36423c) + obj3.substring(this.f36423c + 1);
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
                    dk0Var.F = true;
                    String hintText2 = dk0Var.Q.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < sb3.length()) {
                                if (i29 < hintText2.length()) {
                                    if (hintText2.charAt(i29) == ' ') {
                                        sb3.insert(i29, ' ');
                                        i29++;
                                        if (selectionStart2 == i29 && (i13 = this.f36422b) != 2 && i13 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i29++;
                                } else {
                                    sb3.insert(i29, ' ');
                                    if (selectionStart2 == i29 + 1 && (i12 = this.f36422b) != 2 && i12 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        bk0 bk0Var = dk0Var.Q;
                        bk0Var.setSelection(Math.min(selectionStart2, bk0Var.length()));
                    }
                    dk0Var.Q.invalidate();
                    dk0Var.F = false;
                    dk0.s(dk0Var);
                    return;
                }
                return;
            case 3:
                nn0 nn0Var = (nn0) this.d;
                if (!nn0Var.f40240a1) {
                    org.telegram.ui.Components.w40 w40Var = (org.telegram.ui.Components.w40) nn0Var.Y[2];
                    int selectionStart3 = w40Var.getSelectionStart();
                    String obj4 = w40Var.getText().toString();
                    if (this.f36422b == 3) {
                        obj4 = obj4.substring(0, this.f36423c) + obj4.substring(this.f36423c + 1);
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
                    nn0Var.f40240a1 = true;
                    String hintText3 = w40Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (true) {
                            if (i32 < sb4.length()) {
                                if (i32 < hintText3.length()) {
                                    if (hintText3.charAt(i32) == ' ') {
                                        sb4.insert(i32, ' ');
                                        i32++;
                                        if (selectionStart3 == i32 && (i15 = this.f36422b) != 2 && i15 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i32++;
                                } else {
                                    sb4.insert(i32, ' ');
                                    if (selectionStart3 == i32 + 1 && (i14 = this.f36422b) != 2 && i14 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    w40Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        w40Var.setSelection(Math.min(selectionStart3, w40Var.length()));
                    }
                    w40Var.invalidate();
                    nn0Var.f40240a1 = false;
                    return;
                }
                return;
            default:
                vo0 vo0Var = (vo0) this.d;
                if (!vo0Var.f42935n0) {
                    org.telegram.ui.Components.w40 w40Var2 = (org.telegram.ui.Components.w40) vo0Var.f42925f[9];
                    int selectionStart4 = w40Var2.getSelectionStart();
                    String obj5 = w40Var2.getText().toString();
                    if (this.f36422b == 3) {
                        obj5 = obj5.substring(0, this.f36423c) + obj5.substring(this.f36423c + 1);
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
                    vo0Var.f42935n0 = true;
                    String hintText4 = w40Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (true) {
                            if (i35 < sb5.length()) {
                                if (i35 < hintText4.length()) {
                                    if (hintText4.charAt(i35) == ' ') {
                                        sb5.insert(i35, ' ');
                                        i35++;
                                        if (selectionStart4 == i35 && (i17 = this.f36422b) != 2 && i17 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i35++;
                                } else {
                                    sb5.insert(i35, ' ');
                                    if (selectionStart4 == i35 + 1 && (i16 = this.f36422b) != 2 && i16 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    w40Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        w40Var2.setSelection(Math.min(selectionStart4, w40Var2.length()));
                    }
                    w40Var2.invalidate();
                    vo0Var.f42935n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f36421a) {
            case 0:
                return;
            case 1:
                if (i11 == 0 && i12 == 1) {
                    this.f36422b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f36422b = 3;
                        this.f36423c = i10 - 1;
                        return;
                    }
                    this.f36422b = 2;
                    return;
                } else {
                    this.f36422b = -1;
                    return;
                }
            case 2:
                if (i11 == 0 && i12 == 1) {
                    this.f36422b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f36422b = 3;
                        this.f36423c = i10 - 1;
                        return;
                    }
                    this.f36422b = 2;
                    return;
                } else {
                    this.f36422b = -1;
                    return;
                }
            case 3:
                if (i11 == 0 && i12 == 1) {
                    this.f36422b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f36422b = 3;
                        this.f36423c = i10 - 1;
                        return;
                    }
                    this.f36422b = 2;
                    return;
                } else {
                    this.f36422b = -1;
                    return;
                }
            default:
                if (i11 == 0 && i12 == 1) {
                    this.f36422b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f36422b = 3;
                        this.f36423c = i10 - 1;
                        return;
                    }
                    this.f36422b = 2;
                    return;
                } else {
                    this.f36422b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36421a;
    }

    public bs(cs csVar, int i10, int i11) {
        this.f36421a = 0;
        this.d = csVar;
        this.f36422b = i10;
        this.f36423c = i11;
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
