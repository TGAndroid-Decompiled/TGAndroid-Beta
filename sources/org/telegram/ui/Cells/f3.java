package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.du;
public final class f3 implements TextWatcher {
    public final int f20291a;
    public final du f20292b;
    public final boolean f20293c;
    public final g3 d;

    public f3(g3 g3Var, int i10, du duVar, boolean z10) {
        this.d = g3Var;
        this.f20291a = i10;
        this.f20292b = duVar;
        this.f20293c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        g3 g3Var = this.d;
        boolean z10 = g3Var.f20327a;
        int i10 = this.f20291a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                g3Var.f20327a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                du duVar = this.f20292b;
                duVar.setText(subSequence);
                duVar.setSelection(duVar.length());
                g3Var.f20327a = false;
            }
            g3Var.b();
        }
        if (this.f20293c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.o6 o6Var = g3Var.v;
        if (o6Var != null && i10 > 0) {
            o6Var.b();
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
