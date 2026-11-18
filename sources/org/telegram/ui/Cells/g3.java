package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.mt;
public final class g3 implements TextWatcher {
    public final int f30643a;
    public final mt f30644b;
    public final boolean f30645c;
    public final h3 d;

    public g3(h3 h3Var, int i7, mt mtVar, boolean z10) {
        this.d = h3Var;
        this.f30643a = i7;
        this.f30644b = mtVar;
        this.f30645c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z10 = h3Var.f30751a;
        int i7 = this.f30643a;
        if (!z10) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                h3Var.f30751a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                mt mtVar = this.f30644b;
                mtVar.setText(subSequence);
                mtVar.setSelection(mtVar.length());
                h3Var.f30751a = false;
            }
            h3Var.b(editable);
        }
        if (this.f30645c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.m6 m6Var = h3Var.f30761y;
        if (m6Var != null && i7 > 0) {
            m6Var.a();
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
