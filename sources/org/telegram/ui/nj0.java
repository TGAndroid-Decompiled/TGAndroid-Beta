package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nj0 implements TextWatcher {
    public final int f48198a;
    public final dk0 f48199b;

    public nj0(dk0 dk0Var, int i7) {
        this.f48198a = i7;
        this.f48199b = dk0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        String str;
        int indexOf;
        int i7 = this.f48198a;
        dk0 dk0Var = this.f48199b;
        switch (i7) {
            case 0:
                if (!dk0Var.Z0 && dk0Var.T0 != 0 && dk0Var.Y[0].length() == dk0Var.T0) {
                    dk0Var.L.callOnClick();
                    return;
                }
                return;
            default:
                ArrayList arrayList = dk0Var.U0;
                HashMap hashMap = dk0Var.W0;
                if (!dk0Var.Z0) {
                    dk0Var.Z0 = true;
                    String d = pf.b.d(dk0Var.Y[1].getText().toString(), false);
                    dk0Var.Y[1].setText(d);
                    org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) dk0Var.Y[2];
                    if (d.length() == 0) {
                        w20Var.setHintText((String) null);
                        w20Var.setHint(org.telegram.messenger.id.M0(2131747372, null));
                        dk0Var.Y[0].setText(org.telegram.messenger.id.M0(2131752134, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        dk0Var.Y[1].setText(substring);
                                        str = d.substring(i10) + dk0Var.Y[2].getText().toString();
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
                                str = d.substring(1) + dk0Var.Y[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = dk0Var.Y[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z9 = false;
                            str = null;
                        }
                        String str2 = (String) hashMap.get(d);
                        if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                            dk0Var.Y[0].setText((CharSequence) arrayList.get(indexOf));
                            String str3 = (String) dk0Var.X0.get(d);
                            if (str3 != null) {
                                w20Var.setHintText(str3.replace('X', (char) 8211));
                                w20Var.setHint((CharSequence) null);
                            }
                        } else {
                            w20Var.setHintText((String) null);
                            w20Var.setHint(org.telegram.messenger.id.M0(2131747372, null));
                            dk0Var.Y[0].setText(org.telegram.messenger.id.M0(2131742859, null));
                        }
                        if (!z9) {
                            EditTextBoldCursor editTextBoldCursor2 = dk0Var.Y[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            w20Var.requestFocus();
                            w20Var.setText(str);
                            w20Var.setSelection(w20Var.length());
                        }
                    }
                    dk0Var.Z0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f48198a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f48198a;
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
