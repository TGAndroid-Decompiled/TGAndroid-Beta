package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.nu;
public final class f3 implements TextWatcher {
    public final int f21167a;
    public final nu f21168b;
    public final boolean f21169c;
    public final g3 d;

    public f3(g3 g3Var, int i10, nu nuVar, boolean z10) {
        this.d = g3Var;
        this.f21167a = i10;
        this.f21168b = nuVar;
        this.f21169c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        g3 g3Var = this.d;
        boolean z10 = g3Var.f21197a;
        int i10 = this.f21167a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                g3Var.f21197a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                nu nuVar = this.f21168b;
                nuVar.setText(subSequence);
                nuVar.setSelection(nuVar.length());
                g3Var.f21197a = false;
            }
            g3Var.b();
        }
        if (this.f21169c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.r6 r6Var = g3Var.v;
        if (r6Var != null && i10 > 0) {
            r6Var.a();
            g3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
