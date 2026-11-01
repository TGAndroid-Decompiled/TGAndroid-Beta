package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.mt;
public final class i3 implements TextWatcher {
    public final int f22029a;
    public final mt f22030b;
    public final boolean f22031c;
    public final j3 d;

    public i3(j3 j3Var, int i10, mt mtVar, boolean z10) {
        this.d = j3Var;
        this.f22029a = i10;
        this.f22030b = mtVar;
        this.f22031c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        j3 j3Var = this.d;
        boolean z10 = j3Var.f22065a;
        int i10 = this.f22029a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                j3Var.f22065a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                mt mtVar = this.f22030b;
                mtVar.setText(subSequence);
                mtVar.setSelection(mtVar.length());
                j3Var.f22065a = false;
            }
            j3Var.b(editable);
        }
        if (this.f22031c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.e6 e6Var = j3Var.f22074y;
        if (e6Var != null && i10 > 0) {
            e6Var.a();
            j3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
