package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i31 implements TextWatcher {
    public boolean f46051a;
    public final int f46052b;
    public final EditTextBoldCursor f46053c;
    public final org.telegram.ui.Components.gb0 d;
    public final int[] f46054e;
    public final TextView f46055f;

    public i31(int i3, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.gb0 gb0Var, int[] iArr, TextView textView) {
        this.f46052b = i3;
        this.f46053c = editTextBoldCursor;
        this.d = gb0Var;
        this.f46054e = iArr;
        this.f46055f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i31.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
