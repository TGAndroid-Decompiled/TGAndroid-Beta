package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class nv0 implements TextWatcher {
    public final int f37728a = 0;
    public final EditTextBoldCursor f37729b;
    public final Serializable f37730c;
    public final Object d;
    public final org.telegram.messenger.is f37731e;

    public nv0(bw0 bw0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f37731e = bw0Var;
        this.f37730c = iArr;
        this.d = textView;
        this.f37729b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f37728a) {
            case 0:
                return;
            default:
                org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) this.f37731e;
                String str = (String) this.f37730c;
                if (((HashMap) this.d) == ek0Var.f46838u1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f37729b;
                org.telegram.ui.ek0.N0(ek0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = ek0Var.Z[intValue];
                if (intValue == 6) {
                    ek0Var.c1(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f37728a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f37728a) {
            case 0:
                if (((int[]) this.f37730c)[0] == 2) {
                    ((bw0) this.f37731e).K0((TextView) this.d, this.f37729b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public nv0(org.telegram.ui.ek0 ek0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f37731e = ek0Var;
        this.f37729b = editTextBoldCursor;
        this.f37730c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
