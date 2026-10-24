package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.gu;
public final class d3 implements TextWatcher {
    public final int f22256a;
    public final gu f22257b;
    public final boolean f22258c;
    public final e3 d;

    public d3(e3 e3Var, int i10, gu guVar, boolean z10) {
        this.d = e3Var;
        this.f22256a = i10;
        this.f22257b = guVar;
        this.f22258c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        e3 e3Var = this.d;
        boolean z10 = e3Var.f22315a;
        int i10 = this.f22256a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                e3Var.f22315a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                gu guVar = this.f22257b;
                guVar.setText(subSequence);
                guVar.setSelection(guVar.length());
                e3Var.f22315a = false;
            }
            e3Var.b(editable);
        }
        if (this.f22258c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.n6 n6Var = e3Var.f22322w;
        if (n6Var != null && i10 > 0) {
            n6Var.a();
            e3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
