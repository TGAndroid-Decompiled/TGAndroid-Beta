package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class gk implements TextWatcher {
    public boolean f34125a;
    public final TextView f34126b;

    public gk(lg.y0 y0Var, TextView textView) {
        this.f34126b = textView;
        this.f34125a = TextUtils.isEmpty(y0Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f34125a) {
            this.f34125a = isEmpty;
            if (isEmpty) {
                i3 = 2131746329;
            } else {
                i3 = 2131754486;
            }
            this.f34126b.setText(org.telegram.messenger.bd.M0(i3, null));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
