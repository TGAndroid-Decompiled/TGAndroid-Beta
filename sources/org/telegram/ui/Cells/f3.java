package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.mt;
public final class f3 implements TextWatcher {
    public final int f24330a;
    public final mt f24331b;
    public final boolean f24332c;
    public final g3 d;

    public f3(g3 g3Var, int i9, mt mtVar, boolean z10) {
        this.d = g3Var;
        this.f24330a = i9;
        this.f24331b = mtVar;
        this.f24332c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        g3 g3Var = this.d;
        boolean z10 = g3Var.f24372a;
        int i9 = this.f24330a;
        if (!z10) {
            if (i9 > 0 && editable != null && editable.length() > i9) {
                g3Var.f24372a = true;
                CharSequence subSequence = editable.subSequence(0, i9);
                mt mtVar = this.f24331b;
                mtVar.setText(subSequence);
                mtVar.setSelection(mtVar.length());
                g3Var.f24372a = false;
            }
            g3Var.b();
        }
        if (this.f24332c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.i6 i6Var = g3Var.v;
        if (i6Var != null && i9 > 0) {
            i6Var.b();
            g3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
