package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ju;
public final class c3 implements TextWatcher {
    public final int f23922a;
    public final ju f23923b;
    public final boolean f23924c;
    public final d3 d;

    public c3(d3 d3Var, int i10, ju juVar, boolean z10) {
        this.d = d3Var;
        this.f23922a = i10;
        this.f23923b = juVar;
        this.f23924c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        d3 d3Var = this.d;
        boolean z10 = d3Var.f24002a;
        int i10 = this.f23922a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                d3Var.f24002a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                ju juVar = this.f23923b;
                juVar.setText(subSequence);
                juVar.setSelection(juVar.length());
                d3Var.f24002a = false;
            }
            d3Var.b(editable);
        }
        if (this.f23924c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.r6 r6Var = d3Var.f24009w;
        if (r6Var != null && i10 > 0) {
            r6Var.a();
            d3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
