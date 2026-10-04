package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.eu;
public final class f3 implements TextWatcher {
    public final int f22091a;
    public final eu f22092b;
    public final boolean f22093c;
    public final g3 d;

    public f3(g3 g3Var, int i10, eu euVar, boolean z10) {
        this.d = g3Var;
        this.f22091a = i10;
        this.f22092b = euVar;
        this.f22093c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        g3 g3Var = this.d;
        boolean z10 = g3Var.f22131a;
        int i10 = this.f22091a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                g3Var.f22131a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                eu euVar = this.f22092b;
                euVar.setText(subSequence);
                euVar.setSelection(euVar.length());
                g3Var.f22131a = false;
            }
            g3Var.b();
        }
        if (this.f22093c) {
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
