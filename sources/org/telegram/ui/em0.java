package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class em0 implements TextWatcher {
    public final int f36874a;
    public final qm0 f36875b;

    public em0(qm0 qm0Var, int i10) {
        this.f36874a = i10;
        this.f36875b = qm0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        int i10 = this.f36874a;
        qm0 qm0Var = this.f36875b;
        switch (i10) {
            case 0:
                if (qm0Var.f40819c0 != 0 && editable.length() == qm0Var.f40819c0) {
                    qm0Var.G0(false);
                    return;
                }
                return;
            default:
                HashMap hashMap = qm0Var.f40818c;
                if (!qm0Var.m0) {
                    qm0Var.m0 = true;
                    String d = af.b.d(qm0Var.f40825f[8].getText().toString(), false);
                    qm0Var.f40825f[8].setText(d);
                    org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) qm0Var.f40825f[9];
                    if (d.length() == 0) {
                        n30Var.setHintText((String) null);
                        n30Var.setHint(org.telegram.messenger.dd.L0(2131747388, null));
                    } else {
                        int i11 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i11 >= 1) {
                                    String substring = d.substring(0, i11);
                                    if (((String) hashMap.get(substring)) != null) {
                                        qm0Var.f40825f[8].setText(substring);
                                        str = d.substring(i11) + qm0Var.f40825f[9].getText().toString();
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i11--;
                                    }
                                } else {
                                    z10 = false;
                                    str = null;
                                }
                            }
                            if (!z10) {
                                str = d.substring(1) + qm0Var.f40825f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = qm0Var.f40825f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 != null && qm0Var.f40812a.indexOf(str3) != -1 && (str2 = (String) qm0Var.d.get(d)) != null) {
                            n30Var.setHintText(str2.replace('X', (char) 8211));
                            n30Var.setHint((CharSequence) null);
                        } else {
                            n30Var.setHintText((String) null);
                            n30Var.setHint(org.telegram.messenger.dd.L0(2131747388, null));
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = qm0Var.f40825f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            n30Var.requestFocus();
                            n30Var.setText(str);
                            n30Var.setSelection(n30Var.length());
                        }
                    }
                    qm0Var.m0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36874a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36874a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
