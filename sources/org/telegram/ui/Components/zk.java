package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zk implements TextWatcher {
    public boolean f32946a;
    public final TextView f32947b;

    public zk(ig.a1 a1Var, TextView textView) {
        this.f32947b = textView;
        this.f32946a = TextUtils.isEmpty(a1Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean isEmpty = TextUtils.isEmpty(editable);
        if (isEmpty != this.f32946a) {
            this.f32946a = isEmpty;
            if (isEmpty) {
                i10 = R.string.Remove;
            } else {
                i10 = R.string.Add;
            }
            this.f32947b.setText(LocaleController.getString(i10));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
