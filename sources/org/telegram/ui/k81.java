package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k81 implements TextWatcher {
    public boolean f38843a;
    public final int f38844b;
    public final EditTextBoldCursor f38845c;
    public final org.telegram.ui.Components.td0 d;
    public final int[] e;
    public final TextView f38846f;

    public k81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.td0 td0Var, int[] iArr, TextView textView) {
        this.f38844b = i10;
        this.f38845c = editTextBoldCursor;
        this.d = td0Var;
        this.e = iArr;
        this.f38846f = textView;
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
