package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class ix0 implements TextWatcher {
    public final int f25077a = 0;
    public final EditTextBoldCursor f25078b;
    public final Serializable f25079c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ix0(ux0 ux0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = ux0Var;
        this.f25079c = iArr;
        this.d = textView;
        this.f25078b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f25077a) {
            case 0:
                return;
            default:
                org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) this.e;
                String str = (String) this.f25079c;
                if (((HashMap) this.d) == in0Var.f34206t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f25078b;
                org.telegram.ui.in0.J0(in0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = in0Var.Y[intValue];
                if (intValue == 6) {
                    in0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f25077a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f25077a) {
            case 0:
                if (((int[]) this.f25079c)[0] == 2) {
                    ((ux0) this.e).m0((TextView) this.d, this.f25078b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ix0(org.telegram.ui.in0 in0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = in0Var;
        this.f25078b = editTextBoldCursor;
        this.f25079c = str;
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
