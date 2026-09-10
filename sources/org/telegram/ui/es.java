package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class es implements TextWatcher {
    public final int f32592a;
    public int f32593b;
    public int f32594c;
    public final Object d;

    public es(Object obj, int i10) {
        this.f32592a = i10;
        this.d = obj;
        this.f32593b = -1;
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
        switch (this.f32592a) {
            case 0:
                int i18 = this.f32594c;
                int i19 = this.f32593b;
                fs fsVar = (fs) this.d;
                if (!fsVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        fsVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                hs[] hsVarArr = fsVar.f32906f;
                                if (i22 < hsVarArr.length) {
                                    hsVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        fsVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        hs[] hsVarArr2 = fsVar.f32906f;
                        if (i23 < hsVarArr2.length) {
                            hs hsVar = hsVarArr2[i23];
                            hsVar.setSelection(hsVar.length());
                            fsVar.f32906f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && fsVar.getCode().length() == i18) {
                        fsVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wg0 wg0Var = (wg0) this.d;
                tg0 tg0Var = wg0Var.f38180b;
                if (!wg0Var.J) {
                    int selectionStart = tg0Var.getSelectionStart();
                    String obj2 = tg0Var.getText().toString();
                    if (this.f32593b == 3) {
                        obj2 = obj2.substring(0, this.f32594c) + obj2.substring(this.f32594c + 1);
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
                    wg0Var.J = true;
                    String hintText = tg0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb2.length()) {
                                if (i26 < hintText.length()) {
                                    if (hintText.charAt(i26) == ' ') {
                                        sb2.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart == i26 && (i11 = this.f32593b) != 2 && i11 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb2.insert(i26, ' ');
                                    if (selectionStart == i26 + 1 && (i10 = this.f32593b) != 2 && i10 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        tg0Var.setSelection(Math.min(selectionStart, tg0Var.length()));
                    }
                    tg0Var.invalidate();
                    wg0Var.r();
                    wg0Var.J = false;
                    return;
                }
                return;
            case 2:
                ek0 ek0Var = (ek0) this.d;
                if (!ek0Var.F) {
                    int selectionStart2 = ek0Var.Q.getSelectionStart();
                    String obj3 = ek0Var.Q.getText().toString();
                    if (this.f32593b == 3) {
                        obj3 = obj3.substring(0, this.f32594c) + obj3.substring(this.f32594c + 1);
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
                    ek0Var.F = true;
                    String hintText2 = ek0Var.Q.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < sb3.length()) {
                                if (i29 < hintText2.length()) {
                                    if (hintText2.charAt(i29) == ' ') {
                                        sb3.insert(i29, ' ');
                                        i29++;
                                        if (selectionStart2 == i29 && (i13 = this.f32593b) != 2 && i13 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i29++;
                                } else {
                                    sb3.insert(i29, ' ');
                                    if (selectionStart2 == i29 + 1 && (i12 = this.f32593b) != 2 && i12 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        ck0 ck0Var = ek0Var.Q;
                        ck0Var.setSelection(Math.min(selectionStart2, ck0Var.length()));
                    }
                    ek0Var.Q.invalidate();
                    ek0Var.F = false;
                    ek0.q(ek0Var);
                    return;
                }
                return;
            case 3:
                on0 on0Var = (on0) this.d;
                if (!on0Var.f35519a1) {
                    org.telegram.ui.Components.p40 p40Var = (org.telegram.ui.Components.p40) on0Var.Y[2];
                    int selectionStart3 = p40Var.getSelectionStart();
                    String obj4 = p40Var.getText().toString();
                    if (this.f32593b == 3) {
                        obj4 = obj4.substring(0, this.f32594c) + obj4.substring(this.f32594c + 1);
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
                    on0Var.f35519a1 = true;
                    String hintText3 = p40Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (true) {
                            if (i32 < sb4.length()) {
                                if (i32 < hintText3.length()) {
                                    if (hintText3.charAt(i32) == ' ') {
                                        sb4.insert(i32, ' ');
                                        i32++;
                                        if (selectionStart3 == i32 && (i15 = this.f32593b) != 2 && i15 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i32++;
                                } else {
                                    sb4.insert(i32, ' ');
                                    if (selectionStart3 == i32 + 1 && (i14 = this.f32593b) != 2 && i14 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    p40Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        p40Var.setSelection(Math.min(selectionStart3, p40Var.length()));
                    }
                    p40Var.invalidate();
                    on0Var.f35519a1 = false;
                    return;
                }
                return;
            default:
                wo0 wo0Var = (wo0) this.d;
                if (!wo0Var.f38277n0) {
                    org.telegram.ui.Components.p40 p40Var2 = (org.telegram.ui.Components.p40) wo0Var.f38267f[9];
                    int selectionStart4 = p40Var2.getSelectionStart();
                    String obj5 = p40Var2.getText().toString();
                    if (this.f32593b == 3) {
                        obj5 = obj5.substring(0, this.f32594c) + obj5.substring(this.f32594c + 1);
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
                    wo0Var.f38277n0 = true;
                    String hintText4 = p40Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (true) {
                            if (i35 < sb5.length()) {
                                if (i35 < hintText4.length()) {
                                    if (hintText4.charAt(i35) == ' ') {
                                        sb5.insert(i35, ' ');
                                        i35++;
                                        if (selectionStart4 == i35 && (i17 = this.f32593b) != 2 && i17 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i35++;
                                } else {
                                    sb5.insert(i35, ' ');
                                    if (selectionStart4 == i35 + 1 && (i16 = this.f32593b) != 2 && i16 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    p40Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        p40Var2.setSelection(Math.min(selectionStart4, p40Var2.length()));
                    }
                    p40Var2.invalidate();
                    wo0Var.f38277n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f32592a) {
            case 0:
                return;
            case 1:
                if (i11 == 0 && i12 == 1) {
                    this.f32593b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f32593b = 3;
                        this.f32594c = i10 - 1;
                        return;
                    }
                    this.f32593b = 2;
                    return;
                } else {
                    this.f32593b = -1;
                    return;
                }
            case 2:
                if (i11 == 0 && i12 == 1) {
                    this.f32593b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f32593b = 3;
                        this.f32594c = i10 - 1;
                        return;
                    }
                    this.f32593b = 2;
                    return;
                } else {
                    this.f32593b = -1;
                    return;
                }
            case 3:
                if (i11 == 0 && i12 == 1) {
                    this.f32593b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f32593b = 3;
                        this.f32594c = i10 - 1;
                        return;
                    }
                    this.f32593b = 2;
                    return;
                } else {
                    this.f32593b = -1;
                    return;
                }
            default:
                if (i11 == 0 && i12 == 1) {
                    this.f32593b = 1;
                    return;
                } else if (i11 == 1 && i12 == 0) {
                    if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.f32593b = 3;
                        this.f32594c = i10 - 1;
                        return;
                    }
                    this.f32593b = 2;
                    return;
                } else {
                    this.f32593b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32592a;
    }

    public es(fs fsVar, int i10, int i11) {
        this.f32592a = 0;
        this.d = fsVar;
        this.f32593b = i10;
        this.f32594c = i11;
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
