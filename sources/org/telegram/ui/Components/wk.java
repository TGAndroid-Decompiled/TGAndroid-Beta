package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class wk implements TextWatcher {
    public boolean f41722a;
    public final TextView f41723b;

    public wk(kg.a1 a1Var, TextView textView) {
        this.f41723b = textView;
        this.f41722a = TextUtils.isEmpty(a1Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f41722a) {
            this.f41722a = isEmpty;
            if (isEmpty) {
                i7 = 2131746126;
            } else {
                i7 = 2131754484;
            }
            this.f41723b.setText(org.telegram.messenger.gd.M0(i7, null));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
