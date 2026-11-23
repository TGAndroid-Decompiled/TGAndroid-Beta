package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class xv0 implements TextWatcher {
    public final int f42228a = 0;
    public final EditTextBoldCursor f42229b;
    public final Serializable f42230c;
    public final Object d;
    public final org.telegram.messenger.gs f42231e;

    public xv0(kw0 kw0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f42231e = kw0Var;
        this.f42230c = iArr;
        this.d = textView;
        this.f42229b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f42228a) {
            case 0:
                return;
            default:
                org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) this.f42231e;
                String str = (String) this.f42230c;
                if (((HashMap) this.d) == hk0Var.f48462u1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f42229b;
                org.telegram.ui.hk0.N0(hk0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = hk0Var.Z[intValue];
                if (intValue == 6) {
                    hk0Var.c1(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f42228a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f42228a) {
            case 0:
                if (((int[]) this.f42230c)[0] == 2) {
                    ((kw0) this.f42231e).L0((TextView) this.d, this.f42229b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public xv0(org.telegram.ui.hk0 hk0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f42231e = hk0Var;
        this.f42229b = editTextBoldCursor;
        this.f42230c = str;
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
