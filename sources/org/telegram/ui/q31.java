package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q31 implements TextWatcher {
    public boolean f50445a;
    public final int f50446b;
    public final EditTextBoldCursor f50447c;
    public final org.telegram.ui.Components.mb0 d;
    public final int[] f50448e;
    public final TextView f50449f;

    public q31(int i7, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.mb0 mb0Var, int[] iArr, TextView textView) {
        this.f50446b = i7;
        this.f50447c = editTextBoldCursor;
        this.d = mb0Var;
        this.f50448e = iArr;
        this.f50449f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q31.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
