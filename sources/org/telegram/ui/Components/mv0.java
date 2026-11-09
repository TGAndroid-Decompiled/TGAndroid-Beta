package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class mv0 implements TextWatcher {
    public final int f36150a = 0;
    public final EditTextBoldCursor f36151b;
    public final Serializable f36152c;
    public final Object d;
    public final org.telegram.messenger.ls f36153e;

    public mv0(zv0 zv0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f36153e = zv0Var;
        this.f36152c = iArr;
        this.d = textView;
        this.f36151b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        switch (this.f36150a) {
            case 0:
                return;
            default:
                org.telegram.ui.dk0 dk0Var = (org.telegram.ui.dk0) this.f36153e;
                String str = (String) this.f36152c;
                if (((HashMap) this.d) == dk0Var.f45035t1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f36151b;
                org.telegram.ui.dk0.N0(dk0Var, editTextBoldCursor, str, editable, z9);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = dk0Var.Y[intValue];
                if (intValue == 6) {
                    dk0Var.c1(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f36150a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f36150a) {
            case 0:
                if (((int[]) this.f36152c)[0] == 2) {
                    ((zv0) this.f36153e).K0((TextView) this.d, this.f36151b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public mv0(org.telegram.ui.dk0 dk0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f36153e = dk0Var;
        this.f36151b = editTextBoldCursor;
        this.f36152c = str;
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
