package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class ey0 implements TextWatcher {
    public final int f25994a = 0;
    public final EditTextBoldCursor f25995b;
    public final Serializable f25996c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ey0(qy0 qy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = qy0Var;
        this.f25996c = iArr;
        this.d = textView;
        this.f25995b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f25994a) {
            case 0:
                return;
            default:
                org.telegram.ui.vm0 vm0Var = (org.telegram.ui.vm0) this.e;
                String str = (String) this.f25996c;
                if (((HashMap) this.d) == vm0Var.f42325t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f25995b;
                org.telegram.ui.vm0.I0(vm0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = vm0Var.Y[intValue];
                if (intValue == 6) {
                    vm0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f25994a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f25994a) {
            case 0:
                if (((int[]) this.f25996c)[0] == 2) {
                    ((qy0) this.e).n0((TextView) this.d, this.f25995b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ey0(org.telegram.ui.vm0 vm0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = vm0Var;
        this.f25995b = editTextBoldCursor;
        this.f25996c = str;
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
