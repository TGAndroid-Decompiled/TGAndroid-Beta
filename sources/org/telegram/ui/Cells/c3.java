package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ju;
public final class c3 implements TextWatcher {
    public final int f23919a;
    public final ju f23920b;
    public final boolean f23921c;
    public final d3 d;

    public c3(d3 d3Var, int i10, ju juVar, boolean z10) {
        this.d = d3Var;
        this.f23919a = i10;
        this.f23920b = juVar;
        this.f23921c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        d3 d3Var = this.d;
        boolean z10 = d3Var.f23998a;
        int i10 = this.f23919a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                d3Var.f23998a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                ju juVar = this.f23920b;
                juVar.setText(subSequence);
                juVar.setSelection(juVar.length());
                d3Var.f23998a = false;
            }
            d3Var.b(editable);
        }
        if (this.f23921c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.r6 r6Var = d3Var.f24005w;
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
