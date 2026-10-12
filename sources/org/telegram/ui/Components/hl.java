package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hl implements TextWatcher {
    public boolean f26793a;
    public final TextView f26794b;

    public hl(hg.b1 b1Var, TextView textView) {
        this.f26794b = textView;
        this.f26793a = TextUtils.isEmpty(b1Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f26793a) {
            this.f26793a = isEmpty;
            if (isEmpty) {
                i10 = R.string.Remove;
            } else {
                i10 = R.string.Add;
            }
            this.f26794b.setText(LocaleController.getString(i10));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
