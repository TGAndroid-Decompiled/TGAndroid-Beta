package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j91 implements TextWatcher {
    public boolean f37617a;
    public final int f37618b;
    public final EditTextBoldCursor f37619c;
    public final org.telegram.ui.Components.ld0 d;
    public final int[] f37620e;
    public final TextView f37621f;

    public j91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.ld0 ld0Var, int[] iArr, TextView textView) {
        this.f37618b = i10;
        this.f37619c = editTextBoldCursor;
        this.d = ld0Var;
        this.f37620e = iArr;
        this.f37621f = textView;
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
