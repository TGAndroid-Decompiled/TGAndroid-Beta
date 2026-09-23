package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.cu;
public final class e3 implements TextWatcher {
    public final int f19940a;
    public final cu f19941b;
    public final boolean f19942c;
    public final f3 d;

    public e3(f3 f3Var, int i10, cu cuVar, boolean z10) {
        this.d = f3Var;
        this.f19940a = i10;
        this.f19941b = cuVar;
        this.f19942c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z10 = f3Var.f20026a;
        int i10 = this.f19940a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.f20026a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                cu cuVar = this.f19941b;
                cuVar.setText(subSequence);
                cuVar.setSelection(cuVar.length());
                f3Var.f20026a = false;
            }
            f3Var.b();
        }
        if (this.f19942c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.o6 o6Var = f3Var.v;
        if (o6Var != null && i10 > 0) {
            o6Var.b();
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
