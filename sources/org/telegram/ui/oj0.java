package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class oj0 implements TextWatcher {
    public final int f48535a;
    public final ek0 f48536b;

    public oj0(ek0 ek0Var, int i7) {
        this.f48535a = i7;
        this.f48536b = ek0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        String str;
        int indexOf;
        int i7 = this.f48535a;
        ek0 ek0Var = this.f48536b;
        switch (i7) {
            case 0:
                if (!ek0Var.Z0 && ek0Var.T0 != 0 && ek0Var.Y[0].length() == ek0Var.T0) {
                    ek0Var.L.callOnClick();
                    return;
                }
                return;
            default:
                ArrayList arrayList = ek0Var.U0;
                HashMap hashMap = ek0Var.W0;
                if (!ek0Var.Z0) {
                    ek0Var.Z0 = true;
                    String d = pf.b.d(ek0Var.Y[1].getText().toString(), false);
                    ek0Var.Y[1].setText(d);
                    org.telegram.ui.Components.v20 v20Var = (org.telegram.ui.Components.v20) ek0Var.Y[2];
                    if (d.length() == 0) {
                        v20Var.setHintText((String) null);
                        v20Var.setHint(org.telegram.messenger.id.M0(2131747372, null));
                        ek0Var.Y[0].setText(org.telegram.messenger.id.M0(2131752134, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        ek0Var.Y[1].setText(substring);
                                        str = d.substring(i10) + ek0Var.Y[2].getText().toString();
                                        d = substring;
                                        z9 = true;
                                    } else {
                                        i10--;
                                    }
                                } else {
                                    z9 = false;
                                    str = null;
                                }
                            }
                            if (!z9) {
                                str = d.substring(1) + ek0Var.Y[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = ek0Var.Y[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z9 = false;
                            str = null;
                        }
                        String str2 = (String) hashMap.get(d);
                        if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                            ek0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                            String str3 = (String) ek0Var.X0.get(d);
                            if (str3 != null) {
                                v20Var.setHintText(str3.replace('X', (char) 8211));
                                v20Var.setHint((CharSequence) null);
                            }
                        } else {
                            v20Var.setHintText((String) null);
                            v20Var.setHint(org.telegram.messenger.id.M0(2131747372, null));
                            ek0Var.Y[0].setText(org.telegram.messenger.id.M0(2131742859, null));
                        }
                        if (!z9) {
                            EditTextBoldCursor editTextBoldCursor2 = ek0Var.Y[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            v20Var.requestFocus();
                            v20Var.setText(str);
                            v20Var.setSelection(v20Var.length());
                        }
                    }
                    ek0Var.Z0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f48535a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f48535a;
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
