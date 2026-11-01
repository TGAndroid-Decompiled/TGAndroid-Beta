package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class jk implements TextWatcher {
    public boolean f27439a;
    public final TextView f27440b;

    public jk(ag.a2 a2Var, TextView textView) {
        this.f27440b = textView;
        this.f27439a = TextUtils.isEmpty(a2Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f27439a) {
            this.f27439a = isEmpty;
            if (isEmpty) {
                i10 = 2131746336;
            } else {
                i10 = 2131754486;
            }
            this.f27440b.setText(org.telegram.messenger.dd.L0(i10, null));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
