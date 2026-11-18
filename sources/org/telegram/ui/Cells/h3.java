package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.mt;
public final class h3 implements TextWatcher {
    public final int f30692a;
    public final mt f30693b;
    public final boolean f30694c;
    public final i3 d;

    public h3(i3 i3Var, int i7, mt mtVar, boolean z10) {
        this.d = i3Var;
        this.f30692a = i7;
        this.f30693b = mtVar;
        this.f30694c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        i3 i3Var = this.d;
        boolean z10 = i3Var.f30799a;
        int i7 = this.f30692a;
        if (!z10) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                i3Var.f30799a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                mt mtVar = this.f30693b;
                mtVar.setText(subSequence);
                mtVar.setSelection(mtVar.length());
                i3Var.f30799a = false;
            }
            i3Var.b(editable);
        }
        if (this.f30694c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.m6 m6Var = i3Var.f30809y;
        if (m6Var != null && i7 > 0) {
            m6Var.a();
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
