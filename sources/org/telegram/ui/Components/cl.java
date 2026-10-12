package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cl implements TextWatcher {
    public boolean f24113a;
    public final TextView f24114b;

    public cl(ig.b1 b1Var, TextView textView) {
        this.f24114b = textView;
        this.f24113a = TextUtils.isEmpty(b1Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f24113a) {
            this.f24113a = isEmpty;
            if (isEmpty) {
                i10 = R.string.Remove;
            } else {
                i10 = R.string.Add;
            }
            this.f24114b.setText(LocaleController.getString(i10));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
