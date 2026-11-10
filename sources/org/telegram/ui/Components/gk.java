package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class gk implements TextWatcher {
    public boolean f33921a;
    public final TextView f33922b;

    public gk(kg.x0 x0Var, TextView textView) {
        this.f33922b = textView;
        this.f33921a = TextUtils.isEmpty(x0Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f33921a) {
            this.f33921a = isEmpty;
            if (isEmpty) {
                i7 = 2131746321;
            } else {
                i7 = 2131754486;
            }
            this.f33922b.setText(org.telegram.messenger.id.M0(i7, null));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
