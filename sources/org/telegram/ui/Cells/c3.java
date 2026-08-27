package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.lt;

public final class c3 implements TextWatcher {

    public final int f24151a;

    public final lt f24152b;

    public final boolean f24153c;
    public final d3 d;

    public c3(d3 d3Var, int i10, lt ltVar, boolean z10) {
        this.d = d3Var;
        this.f24151a = i10;
        this.f24152b = ltVar;
        this.f24153c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        d3 d3Var = this.d;
        boolean z10 = d3Var.f24195a;
        int i10 = this.f24151a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                d3Var.f24195a = true;
                CharSequence charSequenceSubSequence = editable.subSequence(0, i10);
                lt ltVar = this.f24152b;
                ltVar.setText(charSequenceSubSequence);
                ltVar.setSelection(ltVar.length());
                d3Var.f24195a = false;
            }
            d3Var.b();
        }
        if (this.f24153c) {
            while (true) {
                int iIndexOf = editable.toString().indexOf("\n");
                if (iIndexOf < 0) {
                    break;
                } else {
                    editable.delete(iIndexOf, iIndexOf + 1);
                }
            }
        }
        org.telegram.ui.Components.i6 i6Var = d3Var.v;
        if (i6Var == null || i10 <= 0) {
            return;
        }
        i6Var.b();
        d3Var.c();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
