package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.iu;
public final class e3 implements TextWatcher {
    public final int f22175a;
    public final iu f22176b;
    public final boolean f22177c;
    public final f3 d;

    public e3(f3 f3Var, int i10, iu iuVar, boolean z10) {
        this.d = f3Var;
        this.f22175a = i10;
        this.f22176b = iuVar;
        this.f22177c = z10;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f3 f3Var = this.d;
        boolean z10 = f3Var.f22225a;
        int i10 = this.f22175a;
        if (!z10) {
            if (i10 > 0 && editable != null && editable.length() > i10) {
                f3Var.f22225a = true;
                CharSequence subSequence = editable.subSequence(0, i10);
                iu iuVar = this.f22176b;
                iuVar.setText(subSequence);
                iuVar.setSelection(iuVar.length());
                f3Var.f22225a = false;
            }
            f3Var.b();
        }
        if (this.f22177c) {
            while (true) {
                int indexOf = editable.toString().indexOf("\n");
                if (indexOf < 0) {
                    break;
                }
                editable.delete(indexOf, indexOf + 1);
            }
        }
        org.telegram.ui.Components.p6 p6Var = f3Var.v;
        if (p6Var != null && i10 > 0) {
            p6Var.a();
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
