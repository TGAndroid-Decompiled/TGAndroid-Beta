package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class hk implements TextWatcher {
    public boolean f34283a;
    public final TextView f34284b;

    public hk(kg.x0 x0Var, TextView textView) {
        this.f34284b = textView;
        this.f34283a = TextUtils.isEmpty(x0Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f34283a) {
            this.f34283a = isEmpty;
            if (isEmpty) {
                i7 = 2131746322;
            } else {
                i7 = 2131754486;
            }
            this.f34284b.setText(org.telegram.messenger.id.M0(i7, null));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
