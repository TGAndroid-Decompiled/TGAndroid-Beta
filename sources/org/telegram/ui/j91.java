package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j91 implements TextWatcher {
    public boolean f34792a;
    public final int f34793b;
    public final EditTextBoldCursor f34794c;
    public final org.telegram.ui.Components.md0 d;
    public final int[] e;
    public final TextView f34795f;

    public j91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.md0 md0Var, int[] iArr, TextView textView) {
        this.f34793b = i10;
        this.f34794c = editTextBoldCursor;
        this.d = md0Var;
        this.e = iArr;
        this.f34795f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
