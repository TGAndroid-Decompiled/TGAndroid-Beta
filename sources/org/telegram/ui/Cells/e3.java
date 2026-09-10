package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.fu;
public final class e3 implements TextWatcher {
    public final int f19065a;
    public final fu f19066b;
    public final boolean f19067c;
    public final f3 d;

    public e3(f3 f3Var, int i10, fu fuVar, boolean z10) {
        this.d = f3Var;
        this.f19065a = i10;
        this.f19066b = fuVar;
        this.f19067c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z10 = f3Var.f19108a;
        int i10 = this.f19065a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.f19108a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                fu fuVar = this.f19066b;
                fuVar.setText(subSequence);
                fuVar.setSelection(fuVar.length());
                f3Var.f19108a = false;
            }
            f3Var.b();
        }
        if (this.f19067c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.n6 n6Var = f3Var.v;
        if (n6Var != null && i10 > 0) {
            n6Var.b();
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
