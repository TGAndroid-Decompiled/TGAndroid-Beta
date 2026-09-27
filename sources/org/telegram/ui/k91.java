package org.telegram.ui;

import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k91 implements TextWatcher {
    public boolean f34979a;
    public final int f34980b;
    public final EditTextBoldCursor f34981c;
    public final org.telegram.ui.Components.jd0 d;
    public final int[] e;
    public final TextView f34982f;

    public k91(int i10, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.Components.jd0 jd0Var, int[] iArr, TextView textView) {
        this.f34980b = i10;
        this.f34981c = editTextBoldCursor;
        this.d = jd0Var;
        this.e = iArr;
        this.f34982f = textView;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k91.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
