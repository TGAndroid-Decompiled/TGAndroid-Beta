package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class ux0 implements TextWatcher {
    public final int f28872a = 0;
    public final EditTextBoldCursor f28873b;
    public final Serializable f28874c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ux0(gy0 gy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = gy0Var;
        this.f28874c = iArr;
        this.d = textView;
        this.f28873b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f28872a) {
            case 0:
                return;
            default:
                org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) this.e;
                String str = (String) this.f28874c;
                if (((HashMap) this.d) == pn0Var.f36645t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f28873b;
                org.telegram.ui.pn0.J0(pn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = pn0Var.Y[intValue];
                if (intValue == 6) {
                    pn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f28872a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f28872a) {
            case 0:
                if (((int[]) this.f28874c)[0] == 2) {
                    ((gy0) this.e).m0((TextView) this.d, this.f28873b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ux0(org.telegram.ui.pn0 pn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = pn0Var;
        this.f28873b = editTextBoldCursor;
        this.f28874c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
