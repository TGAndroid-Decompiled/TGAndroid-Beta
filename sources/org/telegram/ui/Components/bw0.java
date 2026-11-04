package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class bw0 implements TextWatcher {
    public final NumberTextView f32413a;
    public final aw0 f32414b;

    public bw0(NumberTextView numberTextView, aw0 aw0Var) {
        this.f32413a = numberTextView;
        this.f32414b = aw0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32413a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.f32414b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
