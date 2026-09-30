package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class wx0 implements TextWatcher {
    public final int f30083a = 0;
    public final EditTextBoldCursor f30084b;
    public final Serializable f30085c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public wx0(iy0 iy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = iy0Var;
        this.f30085c = iArr;
        this.d = textView;
        this.f30084b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f30083a) {
            case 0:
                return;
            default:
                org.telegram.ui.fn0 fn0Var = (org.telegram.ui.fn0) this.e;
                String str = (String) this.f30085c;
                if (((HashMap) this.d) == fn0Var.f33831t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f30084b;
                org.telegram.ui.fn0.J0(fn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = fn0Var.Y[intValue];
                if (intValue == 6) {
                    fn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f30083a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f30083a) {
            case 0:
                if (((int[]) this.f30085c)[0] == 2) {
                    ((iy0) this.e).m0((TextView) this.d, this.f30084b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public wx0(org.telegram.ui.fn0 fn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = fn0Var;
        this.f30084b = editTextBoldCursor;
        this.f30085c = str;
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
