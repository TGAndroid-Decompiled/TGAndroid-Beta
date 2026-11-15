package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class pk implements TextWatcher {
    public boolean f38321a;
    public final TextView f38322b;

    public pk(kg.x0 x0Var, TextView textView) {
        this.f38322b = textView;
        this.f38321a = TextUtils.isEmpty(x0Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f38321a) {
            this.f38321a = isEmpty;
            if (isEmpty) {
                i7 = 2131746321;
            } else {
                i7 = 2131754486;
            }
            this.f38322b.setText(org.telegram.messenger.hd.M0(i7, null));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
