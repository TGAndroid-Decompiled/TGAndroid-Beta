package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class fy0 implements TextWatcher {
    public final int f26636a = 0;
    public final EditTextBoldCursor f26637b;
    public final Serializable f26638c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f26639e;

    public fy0(ry0 ry0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f26639e = ry0Var;
        this.f26638c = iArr;
        this.d = textView;
        this.f26637b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f26636a) {
            case 0:
                return;
            default:
                org.telegram.ui.kn0 kn0Var = (org.telegram.ui.kn0) this.f26639e;
                String str = (String) this.f26638c;
                if (((HashMap) this.d) == kn0Var.f38122t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f26637b;
                org.telegram.ui.kn0.J0(kn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = kn0Var.Y[intValue];
                if (intValue == 6) {
                    kn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f26636a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f26636a) {
            case 0:
                if (((int[]) this.f26638c)[0] == 2) {
                    ((ry0) this.f26639e).m0((TextView) this.d, this.f26637b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public fy0(org.telegram.ui.kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f26639e = kn0Var;
        this.f26637b = editTextBoldCursor;
        this.f26638c = str;
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
