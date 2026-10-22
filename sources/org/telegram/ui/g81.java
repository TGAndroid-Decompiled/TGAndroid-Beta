package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g81 implements TextWatcher {
    public boolean f37233a;
    public final int f37234b;
    public final EditTextBoldCursor f37235c;
    public final org.telegram.ui.Components.sd0 d;
    public final int[] e;
    public final TextView f37236f;

    public g81(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.sd0 sd0Var, int[] iArr, TextView textView) {
        this.f37234b = i10;
        this.f37235c = editTextBoldCursor;
        this.d = sd0Var;
        this.e = iArr;
        this.f37236f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g81.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
