package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.bu;
public final class g3 implements TextWatcher {
    public final int f20328a;
    public final bu f20329b;
    public final boolean f20330c;
    public final h3 d;

    public g3(h3 h3Var, int i10, bu buVar, boolean z10) {
        this.d = h3Var;
        this.f20328a = i10;
        this.f20329b = buVar;
        this.f20330c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z10 = h3Var.f20370a;
        int i10 = this.f20328a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                h3Var.f20370a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                bu buVar = this.f20329b;
                buVar.setText(subSequence);
                buVar.setSelection(buVar.length());
                h3Var.f20370a = false;
            }
            h3Var.b();
        }
        if (this.f20330c) {
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
