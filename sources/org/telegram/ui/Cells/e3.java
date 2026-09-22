package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.bu;
public final class e3 implements TextWatcher {
    public final int f20001a;
    public final bu f20002b;
    public final boolean f20003c;
    public final f3 d;

    public e3(f3 f3Var, int i10, bu buVar, boolean z10) {
        this.d = f3Var;
        this.f20001a = i10;
        this.f20002b = buVar;
        this.f20003c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z10 = f3Var.f20057a;
        int i10 = this.f20001a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.f20057a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                bu buVar = this.f20002b;
                buVar.setText(subSequence);
                buVar.setSelection(buVar.length());
                f3Var.f20057a = false;
            }
            f3Var.b();
        }
        if (this.f20003c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.m6 m6Var = f3Var.v;
        if (m6Var != null && i10 > 0) {
            m6Var.b();
            f3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
