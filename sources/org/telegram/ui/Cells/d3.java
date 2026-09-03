package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ut;
public final class d3 implements TextWatcher {
    public final int f20915a;
    public final ut f20916b;
    public final boolean f20917c;
    public final e3 d;

    public d3(e3 e3Var, int i10, ut utVar, boolean z4) {
        this.d = e3Var;
        this.f20915a = i10;
        this.f20916b = utVar;
        this.f20917c = z4;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        e3 e3Var = this.d;
        boolean z4 = e3Var.f20985a;
        int i10 = this.f20915a;
        if (!z4) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                e3Var.f20985a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                ut utVar = this.f20916b;
                utVar.setText(subSequence);
                utVar.setSelection(utVar.length());
                e3Var.f20985a = false;
            }
            e3Var.b();
        }
        if (this.f20917c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.j6 j6Var = e3Var.v;
        if (j6Var != null && i10 > 0) {
            j6Var.b();
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
