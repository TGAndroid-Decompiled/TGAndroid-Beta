package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ar implements TextWatcher {
    public final int f45668a;
    public int f45669b;
    public int f45670c;
    public final Object d;

    public ar(Object obj, int i7) {
        this.f45668a = i7;
        this.d = obj;
        this.f45669b = -1;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f45668a) {
            case 0:
                int i17 = this.f45670c;
                int i18 = this.f45669b;
                br brVar = (br) this.d;
                if (!brVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        brVar.d = true;
                        int i19 = i18;
                        for (int i20 = 0; i20 < Math.min(i17 - i18, length); i20++) {
                            if (i20 == 0) {
                                editable.replace(0, length, obj.substring(i20, i20 + 1));
                            } else {
                                i19++;
                                int i21 = i18 + i20;
                                er[] erVarArr = brVar.f46297f;
                                if (i21 < erVarArr.length) {
                                    erVarArr[i21].setText(obj.substring(i20, i20 + 1));
                                }
                            }
                        }
                        brVar.d = false;
                        i18 = i19;
                    }
                    int i22 = i18 + 1;
                    if (i22 >= 0) {
                        er[] erVarArr2 = brVar.f46297f;
                        if (i22 < erVarArr2.length) {
                            er erVar = erVarArr2[i22];
                            erVar.setSelection(erVar.length());
                            brVar.f46297f[i22].requestFocus();
                        }
                    }
                    if ((i18 == i17 - 1 || (i18 == i17 - 2 && length >= 2)) && brVar.getCode().length() == i17) {
                        brVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ce0 ce0Var = (ce0) this.d;
                ae0 ae0Var = ce0Var.f46529b;
                if (!ce0Var.M) {
                    int selectionStart = ae0Var.getSelectionStart();
                    String obj2 = ae0Var.getText().toString();
                    if (this.f45669b == 3) {
                        obj2 = obj2.substring(0, this.f45670c) + obj2.substring(this.f45670c + 1);
                        selectionStart--;
                    }
                    StringBuilder sb2 = new StringBuilder(obj2.length());
                    int i23 = 0;
                    while (i23 < obj2.length()) {
                        int i24 = i23 + 1;
                        String substring = obj2.substring(i23, i24);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i23 = i24;
                    }
                    ce0Var.M = true;
                    String hintText = ae0Var.getHintText();
                    if (hintText != null) {
                        int i25 = 0;
                        while (true) {
                            if (i25 < sb2.length()) {
                                if (i25 < hintText.length()) {
                                    if (hintText.charAt(i25) == ' ') {
                                        sb2.insert(i25, ' ');
                                        i25++;
                                        if (selectionStart == i25 && (i10 = this.f45669b) != 2 && i10 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i25++;
                                } else {
                                    sb2.insert(i25, ' ');
                                    if (selectionStart == i25 + 1 && (i7 = this.f45669b) != 2 && i7 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        ae0Var.setSelection(Math.min(selectionStart, ae0Var.length()));
                    }
                    ae0Var.invalidate();
                    ce0Var.q();
                    ce0Var.M = false;
                    return;
                }
                return;
            case 2:
                fh0 fh0Var = (fh0) this.d;
                if (!fh0Var.f47737z1) {
                    int selectionStart2 = fh0Var.K1.getSelectionStart();
                    String obj3 = fh0Var.K1.getText().toString();
                    if (this.f45669b == 3) {
                        obj3 = obj3.substring(0, this.f45670c) + obj3.substring(this.f45670c + 1);
                        selectionStart2--;
                    }
                    StringBuilder sb3 = new StringBuilder(obj3.length());
                    int i26 = 0;
                    while (i26 < obj3.length()) {
                        int i27 = i26 + 1;
                        String substring2 = obj3.substring(i26, i27);
                        if ("0123456789".contains(substring2)) {
                            sb3.append(substring2);
                        }
                        i26 = i27;
                    }
                    fh0Var.f47737z1 = true;
                    String hintText2 = fh0Var.K1.getHintText();
                    if (hintText2 != null) {
                        int i28 = 0;
                        while (true) {
                            if (i28 < sb3.length()) {
                                if (i28 < hintText2.length()) {
                                    if (hintText2.charAt(i28) == ' ') {
                                        sb3.insert(i28, ' ');
                                        i28++;
                                        if (selectionStart2 == i28 && (i12 = this.f45669b) != 2 && i12 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i28++;
                                } else {
                                    sb3.insert(i28, ' ');
                                    if (selectionStart2 == i28 + 1 && (i11 = this.f45669b) != 2 && i11 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        eh0 eh0Var = fh0Var.K1;
                        eh0Var.setSelection(Math.min(selectionStart2, eh0Var.length()));
                    }
                    fh0Var.K1.invalidate();
                    fh0Var.f47737z1 = false;
                    fh0.J0(fh0Var);
                    return;
                }
                return;
            case 3:
                hk0 hk0Var = (hk0) this.d;
                if (!hk0Var.f48417b1) {
                    org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) hk0Var.Z[2];
                    int selectionStart3 = j30Var.getSelectionStart();
                    String obj4 = j30Var.getText().toString();
                    if (this.f45669b == 3) {
                        obj4 = obj4.substring(0, this.f45670c) + obj4.substring(this.f45670c + 1);
                        selectionStart3--;
                    }
                    StringBuilder sb4 = new StringBuilder(obj4.length());
                    int i29 = 0;
                    while (i29 < obj4.length()) {
                        int i30 = i29 + 1;
                        String substring3 = obj4.substring(i29, i30);
                        if ("0123456789".contains(substring3)) {
                            sb4.append(substring3);
                        }
                        i29 = i30;
                    }
                    hk0Var.f48417b1 = true;
                    String hintText3 = j30Var.getHintText();
                    if (hintText3 != null) {
                        int i31 = 0;
                        while (true) {
                            if (i31 < sb4.length()) {
                                if (i31 < hintText3.length()) {
                                    if (hintText3.charAt(i31) == ' ') {
                                        sb4.insert(i31, ' ');
                                        i31++;
                                        if (selectionStart3 == i31 && (i14 = this.f45669b) != 2 && i14 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i31++;
                                } else {
                                    sb4.insert(i31, ' ');
                                    if (selectionStart3 == i31 + 1 && (i13 = this.f45669b) != 2 && i13 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    j30Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        j30Var.setSelection(Math.min(selectionStart3, j30Var.length()));
                    }
                    j30Var.invalidate();
                    hk0Var.f48417b1 = false;
                    return;
                }
                return;
            default:
                ml0 ml0Var = (ml0) this.d;
                if (!ml0Var.f49920o0) {
                    org.telegram.ui.Components.j30 j30Var2 = (org.telegram.ui.Components.j30) ml0Var.f49908f[9];
                    int selectionStart4 = j30Var2.getSelectionStart();
                    String obj5 = j30Var2.getText().toString();
                    if (this.f45669b == 3) {
                        obj5 = obj5.substring(0, this.f45670c) + obj5.substring(this.f45670c + 1);
                        selectionStart4--;
                    }
                    StringBuilder sb5 = new StringBuilder(obj5.length());
                    int i32 = 0;
                    while (i32 < obj5.length()) {
                        int i33 = i32 + 1;
                        String substring4 = obj5.substring(i32, i33);
                        if ("0123456789".contains(substring4)) {
                            sb5.append(substring4);
                        }
                        i32 = i33;
                    }
                    ml0Var.f49920o0 = true;
                    String hintText4 = j30Var2.getHintText();
                    if (hintText4 != null) {
                        int i34 = 0;
                        while (true) {
                            if (i34 < sb5.length()) {
                                if (i34 < hintText4.length()) {
                                    if (hintText4.charAt(i34) == ' ') {
                                        sb5.insert(i34, ' ');
                                        i34++;
                                        if (selectionStart4 == i34 && (i16 = this.f45669b) != 2 && i16 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i34++;
                                } else {
                                    sb5.insert(i34, ' ');
                                    if (selectionStart4 == i34 + 1 && (i15 = this.f45669b) != 2 && i15 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    j30Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        j30Var2.setSelection(Math.min(selectionStart4, j30Var2.length()));
                    }
                    j30Var2.invalidate();
                    ml0Var.f49920o0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f45668a) {
            case 0:
                return;
            case 1:
                if (i10 == 0 && i11 == 1) {
                    this.f45669b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f45669b = 3;
                        this.f45670c = i7 - 1;
                        return;
                    }
                    this.f45669b = 2;
                    return;
                } else {
                    this.f45669b = -1;
                    return;
                }
            case 2:
                if (i10 == 0 && i11 == 1) {
                    this.f45669b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f45669b = 3;
                        this.f45670c = i7 - 1;
                        return;
                    }
                    this.f45669b = 2;
                    return;
                } else {
                    this.f45669b = -1;
                    return;
                }
            case 3:
                if (i10 == 0 && i11 == 1) {
                    this.f45669b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f45669b = 3;
                        this.f45670c = i7 - 1;
                        return;
                    }
                    this.f45669b = 2;
                    return;
                } else {
                    this.f45669b = -1;
                    return;
                }
            default:
                if (i10 == 0 && i11 == 1) {
                    this.f45669b = 1;
                    return;
                } else if (i10 == 1 && i11 == 0) {
                    if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.f45669b = 3;
                        this.f45670c = i7 - 1;
                        return;
                    }
                    this.f45669b = 2;
                    return;
                } else {
                    this.f45669b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f45668a;
    }

    public ar(br brVar, int i7, int i10) {
        this.f45668a = 0;
        this.d = brVar;
        this.f45669b = i7;
        this.f45670c = i10;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
