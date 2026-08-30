package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.vt;
public final class e3 implements TextWatcher {
    public final int f20998a;
    public final vt f20999b;
    public final boolean f21000c;
    public final f3 d;

    public e3(f3 f3Var, int i10, vt vtVar, boolean z4) {
        this.d = f3Var;
        this.f20998a = i10;
        this.f20999b = vtVar;
        this.f21000c = z4;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z4 = f3Var.f21049a;
        int i10 = this.f20998a;
        if (!z4) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.f21049a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                vt vtVar = this.f20999b;
                vtVar.setText(subSequence);
                vtVar.setSelection(vtVar.length());
                f3Var.f21049a = false;
            }
            f3Var.b();
        }
        if (this.f21000c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.j6 j6Var = f3Var.v;
        if (j6Var != null && i10 > 0) {
            j6Var.b();
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
