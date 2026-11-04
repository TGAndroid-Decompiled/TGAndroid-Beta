package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.xs;
public final class g3 implements TextWatcher {
    public final int f29255a;
    public final xs f29256b;
    public final boolean f29257c;
    public final h3 d;

    public g3(h3 h3Var, int i3, xs xsVar, boolean z10) {
        this.d = h3Var;
        this.f29255a = i3;
        this.f29256b = xsVar;
        this.f29257c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z10 = h3Var.f29315a;
        int i3 = this.f29255a;
        if (!z10) {
            if (i3 > 0 && editable != null && editable.length() > i3) {
                h3Var.f29315a = true;
                CharSequence subSequence = editable.subSequence(0, i3);
                xs xsVar = this.f29256b;
                xsVar.setText(subSequence);
                xsVar.setSelection(xsVar.length());
                h3Var.f29315a = false;
            }
            h3Var.b(editable);
        }
        if (this.f29257c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.g6 g6Var = h3Var.f29325y;
        if (g6Var != null && i3 > 0) {
            g6Var.a();
            h3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
