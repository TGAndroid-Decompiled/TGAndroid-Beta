package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class bx0 implements TextWatcher {
    public final int f27243a = 0;
    public final EditTextBoldCursor f27244b;
    public final Serializable f27245c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f27246e;

    public bx0(nx0 nx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f27246e = nx0Var;
        this.f27245c = iArr;
        this.d = textView;
        this.f27244b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f27243a) {
            case 0:
                return;
            default:
                org.telegram.ui.vm0 vm0Var = (org.telegram.ui.vm0) this.f27246e;
                String str = (String) this.f27245c;
                if (((HashMap) this.d) == vm0Var.f43657p1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f27244b;
                org.telegram.ui.vm0.J0(vm0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = vm0Var.U[intValue];
                if (intValue == 6) {
                    vm0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f27243a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f27243a) {
            case 0:
                if (((int[]) this.f27245c)[0] == 2) {
                    ((nx0) this.f27246e).m0((TextView) this.d, this.f27244b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public bx0(org.telegram.ui.vm0 vm0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f27246e = vm0Var;
        this.f27244b = editTextBoldCursor;
        this.f27245c = str;
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
