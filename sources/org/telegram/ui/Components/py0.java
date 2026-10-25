package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class py0 implements TextWatcher {
    public final int f31734a = 0;
    public final EditTextBoldCursor f31735b;
    public final Serializable f31736c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public py0(cz0 cz0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = cz0Var;
        this.f31736c = iArr;
        this.d = textView;
        this.f31735b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f31734a) {
            case 0:
                return;
            default:
                org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) this.e;
                String str = (String) this.f31736c;
                if (((HashMap) this.d) == in0Var.f40313t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f31735b;
                org.telegram.ui.in0.J0(in0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = in0Var.Y[intValue];
                if (intValue == 6) {
                    in0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f31734a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f31734a) {
            case 0:
                if (((int[]) this.f31736c)[0] == 2) {
                    ((cz0) this.e).o0((TextView) this.d, this.f31735b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public py0(org.telegram.ui.in0 in0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = in0Var;
        this.f31735b = editTextBoldCursor;
        this.f31736c = str;
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
