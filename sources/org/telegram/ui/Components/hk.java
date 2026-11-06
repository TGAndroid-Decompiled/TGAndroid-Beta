package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class hk implements TextWatcher {
    public boolean f34346a;
    public final TextView f34347b;

    public hk(kg.x0 x0Var, TextView textView) {
        this.f34347b = textView;
        this.f34346a = TextUtils.isEmpty(x0Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f34346a) {
            this.f34346a = isEmpty;
            if (isEmpty) {
                i7 = 2131746320;
            } else {
                i7 = 2131754486;
            }
            this.f34347b.setText(org.telegram.messenger.hd.M0(i7, null));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
