package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class wk implements TextWatcher {
    public boolean f41674a;
    public final TextView f41675b;

    public wk(kg.z0 z0Var, TextView textView) {
        this.f41675b = textView;
        this.f41674a = TextUtils.isEmpty(z0Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f41674a) {
            this.f41674a = isEmpty;
            if (isEmpty) {
                i7 = 2131746125;
            } else {
                i7 = 2131754483;
            }
            this.f41675b.setText(org.telegram.messenger.gd.N0(i7, null));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
