package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.su;
public final class f3 implements TextWatcher {
    public final int f22079a;
    public final su f22080b;
    public final boolean f22081c;
    public final g3 d;

    public f3(g3 g3Var, int i10, su suVar, boolean z10) {
        this.d = g3Var;
        this.f22079a = i10;
        this.f22080b = suVar;
        this.f22081c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        g3 g3Var = this.d;
        boolean z10 = g3Var.f22117a;
        int i10 = this.f22079a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                g3Var.f22117a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                su suVar = this.f22080b;
                suVar.setText(subSequence);
                suVar.setSelection(suVar.length());
                g3Var.f22117a = false;
            }
            g3Var.b();
        }
        if (this.f22081c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.q6 q6Var = g3Var.v;
        if (q6Var != null && i10 > 0) {
            q6Var.a();
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
