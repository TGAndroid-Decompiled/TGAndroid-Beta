package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class kx0 implements TextWatcher {
    public final int f26396a = 0;
    public final EditTextBoldCursor f26397b;
    public final Serializable f26398c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public kx0(xx0 xx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = xx0Var;
        this.f26398c = iArr;
        this.d = textView;
        this.f26397b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        switch (this.f26396a) {
            case 0:
                return;
            default:
                org.telegram.ui.dn0 dn0Var = (org.telegram.ui.dn0) this.e;
                String str = (String) this.f26398c;
                if (((HashMap) this.d) == dn0Var.f33718q1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f26397b;
                org.telegram.ui.dn0.J0(dn0Var, editTextBoldCursor, str, editable, z4);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = dn0Var.V[intValue];
                if (intValue == 6) {
                    dn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f26396a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f26396a) {
            case 0:
                if (((int[]) this.f26398c)[0] == 2) {
                    ((xx0) this.e).m0((TextView) this.d, this.f26397b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public kx0(org.telegram.ui.dn0 dn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = dn0Var;
        this.f26397b = editTextBoldCursor;
        this.f26398c = str;
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
