package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class nv0 implements TextWatcher {
    public final int f37739a = 0;
    public final EditTextBoldCursor f37740b;
    public final Serializable f37741c;
    public final Object d;
    public final org.telegram.messenger.is f37742e;

    public nv0(bw0 bw0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f37742e = bw0Var;
        this.f37741c = iArr;
        this.d = textView;
        this.f37740b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f37739a) {
            case 0:
                return;
            default:
                org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) this.f37742e;
                String str = (String) this.f37741c;
                if (((HashMap) this.d) == ek0Var.f46848u1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f37740b;
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
        int i12 = this.f37739a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f37739a) {
            case 0:
                if (((int[]) this.f37741c)[0] == 2) {
                    ((bw0) this.f37742e).K0((TextView) this.d, this.f37740b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public nv0(org.telegram.ui.ek0 ek0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f37742e = ek0Var;
        this.f37740b = editTextBoldCursor;
        this.f37741c = str;
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
