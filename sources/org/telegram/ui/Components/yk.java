package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class yk implements TextWatcher {
    public boolean f42421a;
    public final TextView f42422b;

    public yk(kg.a1 a1Var, TextView textView) {
        this.f42422b = textView;
        this.f42421a = TextUtils.isEmpty(a1Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f42421a) {
            this.f42421a = isEmpty;
            if (isEmpty) {
                i7 = 2131746125;
            } else {
                i7 = 2131754483;
            }
            this.f42422b.setText(org.telegram.messenger.hd.N0(i7, null));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
