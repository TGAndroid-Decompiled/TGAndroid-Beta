package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i81 implements TextWatcher {
    public boolean f37809a;
    public final int f37810b;
    public final EditTextBoldCursor f37811c;
    public final org.telegram.ui.Components.sd0 d;
    public final int[] e;
    public final TextView f37812f;

    public i81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.sd0 sd0Var, int[] iArr, TextView textView) {
        this.f37810b = i10;
        this.f37811c = editTextBoldCursor;
        this.d = sd0Var;
        this.e = iArr;
        this.f37812f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i81.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
