package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class wv0 implements TextWatcher {
    public final int f41740a = 0;
    public final EditTextBoldCursor f41741b;
    public final Serializable f41742c;
    public final Object d;
    public final org.telegram.messenger.fs f41743e;

    public wv0(jw0 jw0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f41743e = jw0Var;
        this.f41742c = iArr;
        this.d = textView;
        this.f41741b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f41740a) {
            case 0:
                return;
            default:
                org.telegram.ui.fk0 fk0Var = (org.telegram.ui.fk0) this.f41743e;
                String str = (String) this.f41742c;
                if (((HashMap) this.d) == fk0Var.f47897u1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f41741b;
                org.telegram.ui.fk0.N0(fk0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = fk0Var.Z[intValue];
                if (intValue == 6) {
                    fk0Var.c1(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f41740a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f41740a) {
            case 0:
                if (((int[]) this.f41742c)[0] == 2) {
                    ((jw0) this.f41743e).L0((TextView) this.d, this.f41741b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public wv0(org.telegram.ui.fk0 fk0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f41743e = fk0Var;
        this.f41741b = editTextBoldCursor;
        this.f41742c = str;
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
