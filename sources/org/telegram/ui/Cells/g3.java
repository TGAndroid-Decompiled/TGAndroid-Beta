package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.zs;
public final class g3 implements TextWatcher {
    public final int f29141a;
    public final zs f29142b;
    public final boolean f29143c;
    public final h3 d;

    public g3(h3 h3Var, int i7, zs zsVar, boolean z9) {
        this.d = h3Var;
        this.f29141a = i7;
        this.f29142b = zsVar;
        this.f29143c = z9;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z9 = h3Var.f29251a;
        int i7 = this.f29141a;
        if (!z9) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                h3Var.f29251a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                zs zsVar = this.f29142b;
                zsVar.setText(subSequence);
                zsVar.setSelection(zsVar.length());
                h3Var.f29251a = false;
            }
            h3Var.b(editable);
        }
        if (this.f29143c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.i6 i6Var = h3Var.f29261y;
        if (i6Var != null && i7 > 0) {
            i6Var.a();
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
