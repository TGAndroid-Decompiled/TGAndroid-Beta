package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.uu;
public final class f3 implements TextWatcher {
    public final int f21839a;
    public final uu f21840b;
    public final boolean f21841c;
    public final g3 d;

    public f3(g3 g3Var, int i10, uu uuVar, boolean z10) {
        this.d = g3Var;
        this.f21839a = i10;
        this.f21840b = uuVar;
        this.f21841c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        g3 g3Var = this.d;
        boolean z10 = g3Var.f21885a;
        int i10 = this.f21839a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                g3Var.f21885a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                uu uuVar = this.f21840b;
                uuVar.setText(subSequence);
                uuVar.setSelection(uuVar.length());
                g3Var.f21885a = false;
            }
            g3Var.b();
        }
        if (this.f21841c) {
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
