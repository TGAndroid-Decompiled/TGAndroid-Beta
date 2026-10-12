package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b8 implements TextWatcher {
    public boolean f32990a;
    public final TextView f32991b;

    public b8(ig.b1 b1Var, TextView textView) {
        this.f32991b = textView;
        this.f32990a = TextUtils.isEmpty(b1Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f32990a) {
            this.f32990a = isEmpty;
            if (isEmpty) {
                i10 = R.string.Remove;
            } else {
                i10 = R.string.Add;
            }
            this.f32991b.setText(LocaleController.getString(i10));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
