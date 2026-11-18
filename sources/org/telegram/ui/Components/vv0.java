package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class vv0 implements TextWatcher {
    public final int f41464a = 0;
    public final EditTextBoldCursor f41465b;
    public final Serializable f41466c;
    public final Object d;
    public final org.telegram.messenger.fs f41467e;

    public vv0(iw0 iw0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f41467e = iw0Var;
        this.f41466c = iArr;
        this.d = textView;
        this.f41465b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f41464a) {
            case 0:
                return;
            default:
                org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) this.f41467e;
                String str = (String) this.f41466c;
                if (((HashMap) this.d) == hk0Var.f48415u1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f41465b;
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
        int i12 = this.f41464a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f41464a) {
            case 0:
                if (((int[]) this.f41466c)[0] == 2) {
                    ((iw0) this.f41467e).L0((TextView) this.d, this.f41465b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public vv0(org.telegram.ui.hk0 hk0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f41467e = hk0Var;
        this.f41465b = editTextBoldCursor;
        this.f41466c = str;
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
