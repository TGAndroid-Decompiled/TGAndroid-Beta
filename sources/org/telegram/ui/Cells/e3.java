package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.xt;
public final class e3 implements TextWatcher {
    public final int f22737a;
    public final xt f22738b;
    public final boolean f22739c;
    public final f3 d;

    public e3(f3 f3Var, int i10, xt xtVar, boolean z4) {
        this.d = f3Var;
        this.f22737a = i10;
        this.f22738b = xtVar;
        this.f22739c = z4;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z4 = f3Var.f22792a;
        int i10 = this.f22737a;
        if (!z4) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.f22792a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                xt xtVar = this.f22738b;
                xtVar.setText(subSequence);
                xtVar.setSelection(xtVar.length());
                f3Var.f22792a = false;
            }
            f3Var.b();
        }
        if (this.f22739c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.j6 j6Var = f3Var.v;
        if (j6Var != null && i10 > 0) {
            j6Var.b();
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
