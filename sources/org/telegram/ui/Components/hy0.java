package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class hy0 implements TextWatcher {
    public final int f27073a = 0;
    public final EditTextBoldCursor f27074b;
    public final Serializable f27075c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public hy0(ty0 ty0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = ty0Var;
        this.f27075c = iArr;
        this.d = textView;
        this.f27074b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f27073a) {
            case 0:
                return;
            default:
                org.telegram.ui.an0 an0Var = (org.telegram.ui.an0) this.e;
                String str = (String) this.f27075c;
                if (((HashMap) this.d) == an0Var.f35745t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f27074b;
                org.telegram.ui.an0.I0(an0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = an0Var.Y[intValue];
                if (intValue == 6) {
                    an0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f27073a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f27073a) {
            case 0:
                if (((int[]) this.f27075c)[0] == 2) {
                    ((ty0) this.e).o0((TextView) this.d, this.f27074b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public hy0(org.telegram.ui.an0 an0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = an0Var;
        this.f27074b = editTextBoldCursor;
        this.f27075c = str;
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
