package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class iy0 implements TextWatcher {
    public final int f25817a = 0;
    public final EditTextBoldCursor f25818b;
    public final Serializable f25819c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public iy0(uy0 uy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = uy0Var;
        this.f25819c = iArr;
        this.d = textView;
        this.f25818b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f25817a) {
            case 0:
                return;
            default:
                org.telegram.ui.sn0 sn0Var = (org.telegram.ui.sn0) this.e;
                String str = (String) this.f25819c;
                if (((HashMap) this.d) == sn0Var.f39898t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f25818b;
                org.telegram.ui.sn0.I0(sn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = sn0Var.Y[intValue];
                if (intValue == 6) {
                    sn0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f25817a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f25817a) {
            case 0:
                if (((int[]) this.f25819c)[0] == 2) {
                    ((uy0) this.e).n0((TextView) this.d, this.f25818b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public iy0(org.telegram.ui.sn0 sn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = sn0Var;
        this.f25818b = editTextBoldCursor;
        this.f25819c = str;
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
