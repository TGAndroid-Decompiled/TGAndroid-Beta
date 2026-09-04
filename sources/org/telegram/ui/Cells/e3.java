package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.zt;
public final class e3 implements TextWatcher {
    public final int f21851a;
    public final zt f21852b;
    public final boolean f21853c;
    public final f3 d;

    public e3(f3 f3Var, int i10, zt ztVar, boolean z10) {
        this.d = f3Var;
        this.f21851a = i10;
        this.f21852b = ztVar;
        this.f21853c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z10 = f3Var.f21899a;
        int i10 = this.f21851a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.f21899a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                zt ztVar = this.f21852b;
                ztVar.setText(subSequence);
                ztVar.setSelection(ztVar.length());
                f3Var.f21899a = false;
            }
            f3Var.b();
        }
        if (this.f21853c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.p6 p6Var = f3Var.v;
        if (p6Var != null && i10 > 0) {
            p6Var.b();
            f3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
