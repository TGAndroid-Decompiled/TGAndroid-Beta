package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m81 implements TextWatcher {
    public boolean f41492a;
    public final int f41493b;
    public final EditTextBoldCursor f41494c;
    public final org.telegram.ui.Components.rd0 d;
    public final int[] e;
    public final TextView f41495f;

    public m81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.rd0 rd0Var, int[] iArr, TextView textView) {
        this.f41493b = i10;
        this.f41494c = editTextBoldCursor;
        this.d = rd0Var;
        this.e = iArr;
        this.f41495f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m81.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
