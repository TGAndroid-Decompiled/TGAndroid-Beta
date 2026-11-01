package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class qw0 implements TextWatcher {
    public final int f29817a = 0;
    public final EditTextBoldCursor f29818b;
    public final Serializable f29819c;
    public final Object d;
    public final org.telegram.messenger.vs e;

    public qw0(dx0 dx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = dx0Var;
        this.f29819c = iArr;
        this.d = textView;
        this.f29818b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f29817a) {
            case 0:
                return;
            default:
                org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) this.e;
                String str = (String) this.f29819c;
                if (((HashMap) this.d) == jl0Var.f38453t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f29818b;
                org.telegram.ui.jl0.N0(jl0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = jl0Var.Y[intValue];
                if (intValue == 6) {
                    jl0Var.c1(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f29817a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f29817a) {
            case 0:
                if (((int[]) this.f29819c)[0] == 2) {
                    ((dx0) this.e).K0((TextView) this.d, this.f29818b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public qw0(org.telegram.ui.jl0 jl0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = jl0Var;
        this.f29818b = editTextBoldCursor;
        this.f29819c = str;
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
