package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j51 implements TextWatcher {
    public boolean f38278a;
    public final int f38279b;
    public final EditTextBoldCursor f38280c;
    public final org.telegram.ui.Components.ec0 d;
    public final int[] e;
    public final TextView f38281f;

    public j51(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.ec0 ec0Var, int[] iArr, TextView textView) {
        this.f38279b = i10;
        this.f38280c = editTextBoldCursor;
        this.d = ec0Var;
        this.e = iArr;
        this.f38281f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j51.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
