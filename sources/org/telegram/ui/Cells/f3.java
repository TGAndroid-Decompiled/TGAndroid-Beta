package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.nu;
public final class f3 implements TextWatcher {
    public final int f20863a;
    public final nu f20864b;
    public final boolean f20865c;
    public final g3 d;

    public f3(g3 g3Var, int i10, nu nuVar, boolean z10) {
        this.d = g3Var;
        this.f20863a = i10;
        this.f20864b = nuVar;
        this.f20865c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        g3 g3Var = this.d;
        boolean z10 = g3Var.f20904a;
        int i10 = this.f20863a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                g3Var.f20904a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                nu nuVar = this.f20864b;
                nuVar.setText(subSequence);
                nuVar.setSelection(nuVar.length());
                g3Var.f20904a = false;
            }
            g3Var.b();
        }
        if (this.f20865c) {
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
