package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ft;
public final class g3 implements TextWatcher {
    public final int f30314a;
    public final ft f30315b;
    public final boolean f30316c;
    public final h3 d;

    public g3(h3 h3Var, int i7, ft ftVar, boolean z10) {
        this.d = h3Var;
        this.f30314a = i7;
        this.f30315b = ftVar;
        this.f30316c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z10 = h3Var.f30374a;
        int i7 = this.f30314a;
        if (!z10) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                h3Var.f30374a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                ft ftVar = this.f30315b;
                ftVar.setText(subSequence);
                ftVar.setSelection(ftVar.length());
                h3Var.f30374a = false;
            }
            h3Var.b(editable);
        }
        if (this.f30316c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.g6 g6Var = h3Var.f30384y;
        if (g6Var != null && i7 > 0) {
            g6Var.a();
            h3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
