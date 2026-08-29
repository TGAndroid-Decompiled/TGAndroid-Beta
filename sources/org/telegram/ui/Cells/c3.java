package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.st;
public final class c3 implements TextWatcher {
    public final int f24149a;
    public final st f24150b;
    public final boolean f24151c;
    public final d3 d;

    public c3(d3 d3Var, int i10, st stVar, boolean z10) {
        this.d = d3Var;
        this.f24149a = i10;
        this.f24150b = stVar;
        this.f24151c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        d3 d3Var = this.d;
        boolean z10 = d3Var.f24217a;
        int i10 = this.f24149a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                d3Var.f24217a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                st stVar = this.f24150b;
                stVar.setText(subSequence);
                stVar.setSelection(stVar.length());
                d3Var.f24217a = false;
            }
            d3Var.b();
        }
        if (this.f24151c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.n6 n6Var = d3Var.v;
        if (n6Var != null && i10 > 0) {
            n6Var.b();
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
