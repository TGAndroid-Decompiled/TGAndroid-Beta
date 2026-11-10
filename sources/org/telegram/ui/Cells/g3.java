package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ys;
public final class g3 implements TextWatcher {
    public final int f29156a;
    public final ys f29157b;
    public final boolean f29158c;
    public final h3 d;

    public g3(h3 h3Var, int i7, ys ysVar, boolean z9) {
        this.d = h3Var;
        this.f29156a = i7;
        this.f29157b = ysVar;
        this.f29158c = z9;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z9 = h3Var.f29266a;
        int i7 = this.f29156a;
        if (!z9) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                h3Var.f29266a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                ys ysVar = this.f29157b;
                ysVar.setText(subSequence);
                ysVar.setSelection(ysVar.length());
                h3Var.f29266a = false;
            }
            h3Var.b(editable);
        }
        if (this.f29158c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.h6 h6Var = h3Var.f29276y;
        if (h6Var != null && i7 > 0) {
            h6Var.a();
            h3Var.c();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
