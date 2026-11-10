package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class lv0 implements TextWatcher {
    public final int f35743a = 0;
    public final EditTextBoldCursor f35744b;
    public final Serializable f35745c;
    public final Object d;
    public final org.telegram.messenger.ls f35746e;

    public lv0(yv0 yv0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f35746e = yv0Var;
        this.f35745c = iArr;
        this.d = textView;
        this.f35744b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        switch (this.f35743a) {
            case 0:
                return;
            default:
                org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) this.f35746e;
                String str = (String) this.f35745c;
                if (((HashMap) this.d) == ek0Var.f45359t1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f35744b;
                org.telegram.ui.ek0.N0(ek0Var, editTextBoldCursor, str, editable, z9);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = ek0Var.Y[intValue];
                if (intValue == 6) {
                    ek0Var.c1(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f35743a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f35743a) {
            case 0:
                if (((int[]) this.f35745c)[0] == 2) {
                    ((yv0) this.f35746e).K0((TextView) this.d, this.f35744b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public lv0(org.telegram.ui.ek0 ek0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f35746e = ek0Var;
        this.f35744b = editTextBoldCursor;
        this.f35745c = str;
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
