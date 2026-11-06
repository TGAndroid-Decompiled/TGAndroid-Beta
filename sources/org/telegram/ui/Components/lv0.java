package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class lv0 implements TextWatcher {
    public final int f35746a = 0;
    public final EditTextBoldCursor f35747b;
    public final Serializable f35748c;
    public final Object d;
    public final org.telegram.messenger.ls f35749e;

    public lv0(yv0 yv0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f35749e = yv0Var;
        this.f35748c = iArr;
        this.d = textView;
        this.f35747b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        switch (this.f35746a) {
            case 0:
                return;
            default:
                org.telegram.ui.bk0 bk0Var = (org.telegram.ui.bk0) this.f35749e;
                String str = (String) this.f35748c;
                if (((HashMap) this.d) == bk0Var.f44388t1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f35747b;
                org.telegram.ui.bk0.N0(bk0Var, editTextBoldCursor, str, editable, z9);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = bk0Var.Y[intValue];
                if (intValue == 6) {
                    bk0Var.c1(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f35746a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f35746a) {
            case 0:
                if (((int[]) this.f35748c)[0] == 2) {
                    ((yv0) this.f35749e).K0((TextView) this.d, this.f35747b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public lv0(org.telegram.ui.bk0 bk0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f35749e = bk0Var;
        this.f35747b = editTextBoldCursor;
        this.f35748c = str;
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
