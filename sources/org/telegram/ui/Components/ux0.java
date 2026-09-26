package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class ux0 implements TextWatcher {
    public final int f28930a = 0;
    public final EditTextBoldCursor f28931b;
    public final Serializable f28932c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ux0(gy0 gy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = gy0Var;
        this.f28932c = iArr;
        this.d = textView;
        this.f28931b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f28930a) {
            case 0:
                return;
            default:
                org.telegram.ui.gn0 gn0Var = (org.telegram.ui.gn0) this.e;
                String str = (String) this.f28932c;
                if (((HashMap) this.d) == gn0Var.f34012t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f28931b;
                org.telegram.ui.gn0.J0(gn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = gn0Var.Y[intValue];
                if (intValue == 6) {
                    gn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f28930a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f28930a) {
            case 0:
                if (((int[]) this.f28932c)[0] == 2) {
                    ((gy0) this.e).m0((TextView) this.d, this.f28931b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ux0(org.telegram.ui.gn0 gn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = gn0Var;
        this.f28931b = editTextBoldCursor;
        this.f28932c = str;
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
