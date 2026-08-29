package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k81 implements TextWatcher {
    public boolean f39798a;
    public final int f39799b;
    public final EditTextBoldCursor f39800c;
    public final org.telegram.ui.Components.uc0 d;
    public final int[] f39801e;
    public final TextView f39802f;

    public k81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.uc0 uc0Var, int[] iArr, TextView textView) {
        this.f39799b = i10;
        this.f39800c = editTextBoldCursor;
        this.d = uc0Var;
        this.f39801e = iArr;
        this.f39802f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k81.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
