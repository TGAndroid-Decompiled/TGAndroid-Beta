package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.ys;
public final class g3 implements TextWatcher {
    public final int f29138a;
    public final ys f29139b;
    public final boolean f29140c;
    public final h3 d;

    public g3(h3 h3Var, int i7, ys ysVar, boolean z9) {
        this.d = h3Var;
        this.f29138a = i7;
        this.f29139b = ysVar;
        this.f29140c = z9;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        h3 h3Var = this.d;
        boolean z9 = h3Var.f29248a;
        int i7 = this.f29138a;
        if (!z9) {
            if (i7 > 0 && editable != null && editable.length() > i7) {
                h3Var.f29248a = true;
                CharSequence subSequence = editable.subSequence(0, i7);
                ys ysVar = this.f29139b;
                ysVar.setText(subSequence);
                ysVar.setSelection(ysVar.length());
                h3Var.f29248a = false;
            }
            h3Var.b(editable);
        }
        if (this.f29140c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.i6 i6Var = h3Var.f29258y;
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
