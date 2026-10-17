package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class cy0 implements TextWatcher {
    public final int f25401a = 0;
    public final EditTextBoldCursor f25402b;
    public final Serializable f25403c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public cy0(oy0 oy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = oy0Var;
        this.f25403c = iArr;
        this.d = textView;
        this.f25402b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f25401a) {
            case 0:
                return;
            default:
                org.telegram.ui.xm0 xm0Var = (org.telegram.ui.xm0) this.e;
                String str = (String) this.f25403c;
                if (((HashMap) this.d) == xm0Var.f43207t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f25402b;
                org.telegram.ui.xm0.I0(xm0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = xm0Var.Y[intValue];
                if (intValue == 6) {
                    xm0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f25401a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f25401a) {
            case 0:
                if (((int[]) this.f25403c)[0] == 2) {
                    ((oy0) this.e).n0((TextView) this.d, this.f25402b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public cy0(org.telegram.ui.xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = xm0Var;
        this.f25402b = editTextBoldCursor;
        this.f25403c = str;
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
