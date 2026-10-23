package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.iu;
public final class d3 implements TextWatcher {
    public final int f22255a;
    public final iu f22256b;
    public final boolean f22257c;
    public final e3 d;

    public d3(e3 e3Var, int i10, iu iuVar, boolean z10) {
        this.d = e3Var;
        this.f22255a = i10;
        this.f22256b = iuVar;
        this.f22257c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        e3 e3Var = this.d;
        boolean z10 = e3Var.f22314a;
        int i10 = this.f22255a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                e3Var.f22314a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                iu iuVar = this.f22256b;
                iuVar.setText(subSequence);
                iuVar.setSelection(iuVar.length());
                e3Var.f22314a = false;
            }
            e3Var.b(editable);
        }
        if (this.f22257c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.p6 p6Var = e3Var.f22321w;
        if (p6Var != null && i10 > 0) {
            p6Var.a();
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
