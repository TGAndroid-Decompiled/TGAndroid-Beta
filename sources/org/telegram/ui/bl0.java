package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bl0 implements TextWatcher {
    public final int f45928a;
    public final ml0 f45929b;

    public bl0(ml0 ml0Var, int i7) {
        this.f45928a = i7;
        this.f45929b = ml0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        int i7 = this.f45928a;
        ml0 ml0Var = this.f45929b;
        switch (i7) {
            case 0:
                if (ml0Var.f49903d0 != 0 && editable.length() == ml0Var.f49903d0) {
                    ml0Var.G0(false);
                    return;
                }
                return;
            default:
                HashMap hashMap = ml0Var.f49900c;
                if (!ml0Var.f49919n0) {
                    ml0Var.f49919n0 = true;
                    String d = pf.b.d(ml0Var.f49908f[8].getText().toString(), false);
                    ml0Var.f49908f[8].setText(d);
                    org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) ml0Var.f49908f[9];
                    if (d.length() == 0) {
                        j30Var.setHintText((String) null);
                        j30Var.setHint(org.telegram.messenger.gd.N0(2131747178, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        ml0Var.f49908f[8].setText(substring);
                                        str = d.substring(i10) + ml0Var.f49908f[9].getText().toString();
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i10--;
                                    }
                                } else {
                                    z10 = false;
                                    str = null;
                                }
                            }
                            if (!z10) {
                                str = d.substring(1) + ml0Var.f49908f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = ml0Var.f49908f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 != null && ml0Var.f49894a.indexOf(str3) != -1 && (str2 = (String) ml0Var.d.get(d)) != null) {
                            j30Var.setHintText(str2.replace('X', (char) 8211));
                            j30Var.setHint((CharSequence) null);
                        } else {
                            j30Var.setHintText((String) null);
                            j30Var.setHint(org.telegram.messenger.gd.N0(2131747178, null));
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = ml0Var.f49908f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            j30Var.requestFocus();
                            j30Var.setText(str);
                            j30Var.setSelection(j30Var.length());
                        }
                    }
                    ml0Var.f49919n0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f45928a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f45928a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
