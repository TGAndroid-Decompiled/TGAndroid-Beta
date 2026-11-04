package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class kv0 implements TextWatcher {
    public final int f35493a = 0;
    public final EditTextBoldCursor f35494b;
    public final Serializable f35495c;
    public final Object d;
    public final org.telegram.messenger.cs f35496e;

    public kv0(xv0 xv0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f35496e = xv0Var;
        this.f35495c = iArr;
        this.d = textView;
        this.f35494b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f35493a) {
            case 0:
                return;
            default:
                org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) this.f35496e;
                String str = (String) this.f35495c;
                if (((HashMap) this.d) == yj0Var.f52330u1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f35494b;
                org.telegram.ui.yj0.N0(yj0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = yj0Var.Z[intValue];
                if (intValue == 6) {
                    yj0Var.c1(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f35493a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.f35493a) {
            case 0:
                if (((int[]) this.f35495c)[0] == 2) {
                    ((xv0) this.f35496e).K0((TextView) this.d, this.f35494b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public kv0(org.telegram.ui.yj0 yj0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f35496e = yj0Var;
        this.f35494b = editTextBoldCursor;
        this.f35495c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
