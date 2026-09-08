package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.zt;
public final class e3 implements TextWatcher {
    public final int f21878a;
    public final zt f21879b;
    public final boolean f21880c;
    public final f3 d;

    public e3(f3 f3Var, int i10, zt ztVar, boolean z10) {
        this.d = f3Var;
        this.f21878a = i10;
        this.f21879b = ztVar;
        this.f21880c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z10 = f3Var.f21926a;
        int i10 = this.f21878a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.f21926a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                zt ztVar = this.f21879b;
                ztVar.setText(subSequence);
                ztVar.setSelection(ztVar.length());
                f3Var.f21926a = false;
            }
            f3Var.b();
        }
        if (this.f21880c) {
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
