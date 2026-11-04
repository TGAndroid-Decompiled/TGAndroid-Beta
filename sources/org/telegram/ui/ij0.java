package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ij0 implements TextWatcher {
    public final int f46274a;
    public final yj0 f46275b;

    public ij0(yj0 yj0Var, int i3) {
        this.f46274a = i3;
        this.f46275b = yj0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        int i3 = this.f46274a;
        yj0 yj0Var = this.f46275b;
        switch (i3) {
            case 0:
                if (!yj0Var.f52286a1 && yj0Var.U0 != 0 && yj0Var.Z[0].length() == yj0Var.U0) {
                    yj0Var.M.callOnClick();
                    return;
                }
                return;
            default:
                ArrayList arrayList = yj0Var.V0;
                HashMap hashMap = yj0Var.X0;
                if (!yj0Var.f52286a1) {
                    yj0Var.f52286a1 = true;
                    String d = mf.b.d(yj0Var.Z[1].getText().toString(), false);
                    yj0Var.Z[1].setText(d);
                    org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) yj0Var.Z[2];
                    if (d.length() == 0) {
                        r20Var.setHintText((String) null);
                        r20Var.setHint(org.telegram.messenger.bd.M0(2131747380, null));
                        yj0Var.Z[0].setText(org.telegram.messenger.bd.M0(2131752134, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        yj0Var.Z[1].setText(substring);
                                        str = d.substring(i10) + yj0Var.Z[2].getText().toString();
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
                                str = d.substring(1) + yj0Var.Z[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = yj0Var.Z[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str2 = (String) hashMap.get(d);
                        if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                            yj0Var.Z[0].setText((CharSequence) arrayList.get(indexOf));
                            String str3 = (String) yj0Var.Y0.get(d);
                            if (str3 != null) {
                                r20Var.setHintText(str3.replace('X', (char) 8211));
                                r20Var.setHint((CharSequence) null);
                            }
                        } else {
                            r20Var.setHintText((String) null);
                            r20Var.setHint(org.telegram.messenger.bd.M0(2131747380, null));
                            yj0Var.Z[0].setText(org.telegram.messenger.bd.M0(2131742869, null));
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = yj0Var.Z[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            r20Var.requestFocus();
                            r20Var.setText(str);
                            r20Var.setSelection(r20Var.length());
                        }
                    }
                    yj0Var.f52286a1 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f46274a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f46274a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
