package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class lx0 implements TextWatcher {
    public final int f28838a = 0;
    public final EditTextBoldCursor f28839b;
    public final Serializable f28840c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f28841e;

    public lx0(yx0 yx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f28841e = yx0Var;
        this.f28840c = iArr;
        this.d = textView;
        this.f28839b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        switch (this.f28838a) {
            case 0:
                return;
            default:
                org.telegram.ui.fn0 fn0Var = (org.telegram.ui.fn0) this.f28841e;
                String str = (String) this.f28840c;
                if (((HashMap) this.d) == fn0Var.f36954q1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f28839b;
                org.telegram.ui.fn0.J0(fn0Var, editTextBoldCursor, str, editable, z4);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = fn0Var.V[intValue];
                if (intValue == 6) {
                    fn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f28838a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f28838a) {
            case 0:
                if (((int[]) this.f28840c)[0] == 2) {
                    ((yx0) this.f28841e).m0((TextView) this.d, this.f28839b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public lx0(org.telegram.ui.fn0 fn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f28841e = fn0Var;
        this.f28839b = editTextBoldCursor;
        this.f28840c = str;
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
