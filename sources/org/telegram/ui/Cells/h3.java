package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ot;
public final class h3 implements TextWatcher {
    public final int f30723a;
    public final ot f30724b;
    public final boolean f30725c;
    public final i3 d;

    public h3(i3 i3Var, int i7, ot otVar, boolean z10) {
        this.d = i3Var;
        this.f30723a = i7;
        this.f30724b = otVar;
        this.f30725c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        i3 i3Var = this.d;
        boolean z10 = i3Var.f30830a;
        int i7 = this.f30723a;
        if (!z10) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                i3Var.f30830a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                ot otVar = this.f30724b;
                otVar.setText(subSequence);
                otVar.setSelection(otVar.length());
                i3Var.f30830a = false;
            }
            i3Var.b(editable);
        }
        if (this.f30725c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.n6 n6Var = i3Var.f30840y;
        if (n6Var != null && i7 > 0) {
            n6Var.a();
            i3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
