package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l81 implements TextWatcher {
    public boolean f39167a;
    public final int f39168b;
    public final EditTextBoldCursor f39169c;
    public final org.telegram.ui.Components.vd0 d;
    public final int[] e;
    public final TextView f39170f;

    public l81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.vd0 vd0Var, int[] iArr, TextView textView) {
        this.f39168b = i10;
        this.f39169c = editTextBoldCursor;
        this.d = vd0Var;
        this.e = iArr;
        this.f39170f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l81.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
