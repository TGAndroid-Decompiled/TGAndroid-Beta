package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.bu;
public final class g3 implements TextWatcher {
    public final int f20343a;
    public final bu f20344b;
    public final boolean f20345c;
    public final h3 d;

    public g3(h3 h3Var, int i10, bu buVar, boolean z10) {
        this.d = h3Var;
        this.f20343a = i10;
        this.f20344b = buVar;
        this.f20345c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z10 = h3Var.f20385a;
        int i10 = this.f20343a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                h3Var.f20385a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                bu buVar = this.f20344b;
                buVar.setText(subSequence);
                buVar.setSelection(buVar.length());
                h3Var.f20385a = false;
            }
            h3Var.b();
        }
        if (this.f20345c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.n6 n6Var = h3Var.v;
        if (n6Var != null && i10 > 0) {
            n6Var.b();
            h3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
