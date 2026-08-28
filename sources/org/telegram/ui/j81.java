package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j81 implements TextWatcher {
    public boolean f39399a;
    public final int f39400b;
    public final EditTextBoldCursor f39401c;
    public final org.telegram.ui.Components.fc0 d;
    public final int[] f39402e;
    public final TextView f39403f;

    public j81(int i9, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.fc0 fc0Var, int[] iArr, TextView textView) {
        this.f39400b = i9;
        this.f39401c = editTextBoldCursor;
        this.d = fc0Var;
        this.f39402e = iArr;
        this.f39403f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j81.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
